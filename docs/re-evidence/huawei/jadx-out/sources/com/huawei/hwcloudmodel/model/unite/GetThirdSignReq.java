package com.huawei.hwcloudmodel.model.unite;

/* JADX INFO: loaded from: classes10.dex */
public class GetThirdSignReq {
    private String signContent;
    private String thirdAccountType;

    public GetThirdSignReq(String str) {
        this.thirdAccountType = str;
    }

    public String getThirdAccountType() {
        return this.thirdAccountType;
    }

    public void setThirdAccountType(String str) {
        this.thirdAccountType = str;
    }

    public String getSignContent() {
        return this.signContent;
    }

    public void setSignContent(String str) {
        this.signContent = str;
    }
}
