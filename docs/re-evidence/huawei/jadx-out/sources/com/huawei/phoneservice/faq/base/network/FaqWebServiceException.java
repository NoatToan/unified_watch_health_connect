package com.huawei.phoneservice.faq.base.network;

/* JADX INFO: loaded from: classes41.dex */
public class FaqWebServiceException extends RuntimeException {
    private static final long serialVersionUID = -4346911249138159506L;
    public int errorCode;
    public String message;

    public FaqWebServiceException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
