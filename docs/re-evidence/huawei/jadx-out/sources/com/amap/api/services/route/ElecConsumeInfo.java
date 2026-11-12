package com.amap.api.services.route;

import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ElecConsumeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3730c;
    private List<Integer> d = new ArrayList();

    public int getConsumeEnergy() {
        return this.f3728a;
    }

    public void setConsumeEnergy(int i) {
        this.f3728a = i;
    }

    public int getRunOutStepIndex() {
        return this.f3729b;
    }

    public void setRunOutStepIndex(int i) {
        this.f3729b = i;
    }

    public LatLonPoint getRunOutPoint() {
        return this.f3730c;
    }

    public void setRunOutPoint(LatLonPoint latLonPoint) {
        this.f3730c = latLonPoint;
    }

    public List<Integer> getLeftEnergy() {
        return this.d;
    }

    public void setLeftEnergy(List<Integer> list) {
        this.d = list;
    }
}
