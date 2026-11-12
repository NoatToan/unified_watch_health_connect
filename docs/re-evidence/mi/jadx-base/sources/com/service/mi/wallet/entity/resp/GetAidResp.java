package com.service.mi.wallet.entity.resp;

/* JADX INFO: loaded from: classes6.dex */
public class GetAidResp extends BaseWalletResponse {
    private String appletInstanceAid;
    private String mcPK;
    private String sdAid;
    private String taskId;

    public GetAidResp(String str, String str2) {
        super(str, str2);
    }

    public String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    public String getMcPK() {
        return this.mcPK;
    }

    public String getSdAid() {
        return this.sdAid;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setAppletInstanceAid(String str) {
        this.appletInstanceAid = str;
    }

    public void setMcPK(String str) {
        this.mcPK = str;
    }

    public void setSdAid(String str) {
        this.sdAid = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }
}
