package com.heima.kafka.sample;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * 生产者
 */
public class ProducerQuickStart {

    public static void main(String[] args) {
        //1. kafka连接配置信息
        Properties prop = new Properties();
        prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "101.43.190.82:9092");
        prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        //2. 创建kafka生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);

        //3. 发送消息
        ProducerRecord<String, String> kvProducerRecord = new ProducerRecord<String, String>("topic-first", "key-001", "hello kafka");
        producer.send(kvProducerRecord);

        //4. 关闭消息通道
        producer.close();
    }
}
