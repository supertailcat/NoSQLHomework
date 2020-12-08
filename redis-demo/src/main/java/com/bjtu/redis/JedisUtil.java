package com.bjtu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;
import java.util.Set;

public class JedisUtil {
    private static JedisPool jedisPool = JedisInstance.getInstance();
    private static Jedis jedis = jedisPool.getResource();

    public JedisUtil() {
    }

    /**
     * 一次增加1
     * @param key
     * @throws Exception
     */
    public void incr(String key) throws Exception {
        jedis.incr(key);
    }

    /**
     * 一次增加num
     * @param key
     * @param num
     * @throws Exception
     */
    public void incr(String key, int num) throws Exception {
        jedis.incrBy(key, num);
    }

    /**
     * 对多个key进行增加
     * @param keys
     * @throws Exception
     */
    public void incrKeys(Set<String> keys) throws Exception {
        for(String key : keys)
            jedis.incr(key);
    }

    /**
     * 一次减少1
     * @param key
     * @throws Exception
     */
    public void decr(String key) throws  Exception {
        jedis.decr(key);
    }

    /**
     * 一次减少num
     * @param key
     * @param num
     * @throws Exception
     */
    public void decr(String key, int num) throws Exception {
        jedis.decrBy(key, num);
    }

    /**
     * 对多个key进行减少
     * @param keys
     * @throws Exception
     */
    public void decrKeys(Set<String> keys) throws Exception {
        for(String key : keys)
            jedis.decr(key);
    }

    public String get(String key) throws Exception {
        return jedis.get(key);
    }

    public void set(String key, String value) throws Exception {
        jedis.set(key, value);
    }

    public void append(String key, String value) throws Exception {
        jedis.append(key, value);
    }

    public Map<String, String> hgetAll(String key) throws Exception {
        return jedis.hgetAll(key);
    }
}
