package com.zitao.common.exception;

/**
 * 10：通用
 * 11：商品
 * 12：订单
 * 13：购物车
 * 14：物流
 * 15：用户
 */
public enum BizCodeEnume {
    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败"),
    TO_MANY_REQUEST(10002, "请求流量过大，请稍后再试"),
    SMS_CODE_EXCEPTION(10003, "验证码获取频率太高，请稍后再试"),
    READ_TIME_OUT_EXCEPTION(10004, "远程调用服务超时，请重新再试"),
    SECKILL_EXCEPTION(10005, "秒杀请求过多，请重新再试"),
    PRODUCT_UP_EXCEPTION(11000, "商品上架异常"),
    USER_EXIST_EXCEPTION(15001, "存在相同的用户"),
    PHONE_EXIST_EXCEPTION(15002, "存在相同的手机号"),
    NO_STOCK_EXCEPTION(21000, "商品库存不足"),
    LOGINACCT_PASSWORD_EXCEPTION(15003, "账号或密码错误");

    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
