package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class SendHeartBeatRequestBean extends BaseRequestBean {
    private int businessId;
    private int[] businessIds;
    private String connectTagSn;
    private String extData;
    private boolean isStop;
    private String srcTranId;

    public SendHeartBeatRequestBean() {
    }

    public SendHeartBeatRequestBean(String str, int i) {
        this.connectTagSn = str;
        this.businessId = i;
    }

    public void setStop(boolean z) {
        this.isStop = z;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setExtData(String str) {
        this.extData = str;
    }

    public void setConnectTagSn(String str) {
        this.connectTagSn = str;
    }

    public void setBusinessIds(int[] iArr) {
        this.businessIds = iArr == null ? null : (int[]) iArr.clone();
    }

    public void setBusinessId(int i) {
        this.businessId = i;
    }

    public boolean isStop() {
        return this.isStop;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getExtData() {
        return this.extData;
    }

    public String getConnectTagSn() {
        return this.connectTagSn;
    }

    public int[] getBusinessIds() {
        int[] iArr = this.businessIds;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public int getBusinessId() {
        return this.businessId;
    }
}
