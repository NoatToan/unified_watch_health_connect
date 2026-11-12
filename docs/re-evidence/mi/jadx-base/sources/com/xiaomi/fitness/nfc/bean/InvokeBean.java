package com.xiaomi.fitness.nfc.bean;

/* JADX INFO: loaded from: classes9.dex */
public class InvokeBean {
    public String applyChannel = "tsmclient";
    public InvokeCardBean mifareCardParam;
    public String productId;

    public InvokeBean(String str, String str2, String str3, String str4, String str5, int i) {
        InvokeCardBean invokeCardBean = new InvokeCardBean();
        this.mifareCardParam = invokeCardBean;
        invokeCardBean.uid = str2;
        invokeCardBean.atqa = str3;
        invokeCardBean.sak = str4;
        invokeCardBean.size = i;
        invokeCardBean.content = str5;
        this.productId = str;
    }
}
