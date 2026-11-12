package com.xiaomi.ai.domain.mobileapp.local;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EventInfo {
    private int localAppNumber = 0;
    private int onlineAppNumber = 0;
    private List<MatchInfo> matchInfoList = new ArrayList();

    public int getLocalAppNumber() {
        return this.localAppNumber;
    }

    public List<MatchInfo> getMatchInfoList() {
        return this.matchInfoList;
    }

    public int getOnlineAppNumber() {
        return this.onlineAppNumber;
    }

    public void setLocalAppNumber(int i) {
        this.localAppNumber = i;
    }

    public void setMatchInfoList(List<MatchInfo> list) {
        this.matchInfoList = list;
    }

    public void setOnlineAppNumber(int i) {
        this.onlineAppNumber = i;
    }
}
