package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class MilePaceInfo extends PaceInfo implements Serializable {
    private static final long serialVersionUID = 1;

    public MilePaceInfo(int index, int pace, GpsPoint point, int gpsIndex) {
        super(index, pace, 1, point, gpsIndex);
    }
}
