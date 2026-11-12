package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes7.dex */
public class RpcException extends RuntimeException {
    public static final long serialVersionUID = -2875437994101380406L;
    public int mCode;
    public String mMsg;
    public String mOperationType;

    public RpcException(Integer num, String str) {
        super(a(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public static String a(Integer num, String str) {
        StringBuilder sb3 = new StringBuilder("RPCException: ");
        if (num != null) {
            sb3.append("[");
            sb3.append(num);
            sb3.append("]");
        }
        sb3.append(" : ");
        if (str != null) {
            sb3.append(str);
        }
        return sb3.toString();
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public String getOperationType() {
        return this.mOperationType;
    }

    public void setOperationType(String str) {
        this.mOperationType = str;
    }

    public RpcException(Integer num, String str, Throwable th3) {
        super(a(num, str), th3);
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public RpcException(Integer num, Throwable th3) {
        super(th3);
        this.mCode = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }
}
