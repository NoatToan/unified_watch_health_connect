package com.service.mi.wallet.entity.resp;

import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.service.mi.common.apdu.Capdu;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApduCommandBaseResp extends BaseWalletResponse {
    private List<Capdu> apduCommands;
    private String messageId;

    public List<Capdu> getApduCommands() {
        return this.apduCommands;
    }

    public String getMessageId() {
        return this.messageId;
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

    public void setMessageId(String str) {
        this.messageId = str;
    }
}
