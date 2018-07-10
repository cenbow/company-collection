package com.silita.utils.kafka;

import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;


public class MyObjectEncoder implements Serializer<Object> {

    @Override
    public void configure(Map<String, ?> map, boolean b) {
    }

    @Override
    public byte[] serialize(String s, Object o) {
        return BeanUtils.ObjectToBytes(o);
    }

    @Override
    public void close() {

    }
}
