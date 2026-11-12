package com.service.mi.entity;

import com.service.mi.wallet.entity.resp.HostResp;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class HostRespAndCardTypeInfo {
    private List<CardType> cardType;
    private List<HostResp> hostInfo;

    public List<CardType> getCardType() {
        return this.cardType;
    }

    public List<HostResp> getHostInfo() {
        return this.hostInfo;
    }

    public void setCardType(List<CardType> list) {
        this.cardType = list;
    }

    public void setHostInfo(List<HostResp> list) {
        this.hostInfo = list;
    }
}
