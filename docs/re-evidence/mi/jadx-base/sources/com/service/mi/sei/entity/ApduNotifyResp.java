package com.service.mi.sei.entity;

import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.service.mi.common.apdu.Capdu;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApduNotifyResp extends BaseResponseSeiTsm {
    private List<Capdu> apduCommands;
    private Extra extra;
    private String messageId;
    private String taskId;

    public ApduNotifyResp(String str, String str2) {
        super(str, str2);
    }

    public List<Capdu> getApduCommands() {
        return this.apduCommands;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public boolean isApduCommandsNull() {
        List<Capdu> list = this.apduCommands;
        return list == null || list.isEmpty();
    }

    public boolean isNeedRetry() {
        return AMap3DTileBuildType.HOUSING.equalsIgnoreCase(getResultCode());
    }

    public void setApduCommands(List<Capdu> list) {
        this.apduCommands = list;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public ApduNotifyResp() {
    }
}
