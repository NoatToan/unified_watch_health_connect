package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.dataprocess.DaySportData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class EventPostDataToGoogleFit {
    private ArrayList<DaySportData> a;

    public EventPostDataToGoogleFit(ArrayList<DaySportData> list) {
        this.a = list;
    }

    public ArrayList<DaySportData> getDaySportDatas() {
        return this.a;
    }
}
