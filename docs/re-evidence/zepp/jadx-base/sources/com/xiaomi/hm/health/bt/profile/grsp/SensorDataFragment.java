package com.xiaomi.hm.health.bt.profile.grsp;

import com.xiaomi.hm.health.bt.profile.grsp.SensorData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class SensorDataFragment<T extends SensorData> {
    public static final int HW_FLAG_LOD = 1;
    public static final int HW_FLAG_TOUCH = 0;
    private SensorType a;
    private ArrayList<T> b;
    private int c;
    private boolean d;

    public SensorDataFragment(T data) {
        this.a = SensorType.GSENSOR;
        this.b = new ArrayList<>();
        this.c = 0;
        this.a = data.getType();
        this.b.add(data);
    }

    public int getChannelCount() {
        ArrayList<T> arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || !(this.b.get(0) instanceof CommonSensorData)) {
            return 0;
        }
        return ((CommonSensorData) this.b.get(0)).getData().size();
    }

    public ArrayList<T> getData() {
        return this.b;
    }

    public boolean getLod() {
        return this.d;
    }

    public int getLosePackages() {
        return this.c;
    }

    public SensorType getType() {
        return this.a;
    }

    public void setData(ArrayList<T> data) {
        this.b = data;
    }

    public void setLod(boolean lod) {
        this.d = lod;
    }

    public void setLosePackages(int losePackages) {
        this.c = losePackages;
    }

    public void setType(SensorType type) {
        this.a = type;
    }

    public SensorDataFragment(ArrayList<T> dataList) {
        this.a = SensorType.GSENSOR;
        this.b = new ArrayList<>();
        this.c = 0;
        this.a = dataList.get(0).getType();
        this.b = dataList;
    }
}
