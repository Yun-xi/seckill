package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by 谢亚奇 on 2017/11/8.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeckillException(String message) {
        super(message);
    }
}
