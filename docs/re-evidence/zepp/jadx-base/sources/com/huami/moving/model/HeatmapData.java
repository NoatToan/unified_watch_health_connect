package com.huami.moving.model;

import com.huami.mifit.sportlib.model.GPSPoint;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HeatmapData implements Serializable {
    private int a;
    private List<GPSPoint> b;

    public HeatmapData(int i, List<GPSPoint> list) {
        this.a = i;
        this.b = list;
    }

    public List<GPSPoint> getPointList() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    public void setPointList(List<GPSPoint> list) {
        this.b = list;
    }

    public void setType(int i) {
        this.a = i;
    }
}
