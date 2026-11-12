package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataHeader {
    private int bitmap;
    private List<String> capacityBitMaps;
    private int dataLength;
    private int dataNumber;
    private int frameId;
    private int sportId;
    private long time;
    private int timeInterval;
    private List<WorkoutDataInfo> workoutDataInfoLists;

    public int getSportId() {
        return ((Integer) lst.d(Integer.valueOf(this.sportId))).intValue();
    }

    public void setSportId(int i) {
        this.sportId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getFrameId() {
        return ((Integer) lst.d(Integer.valueOf(this.frameId))).intValue();
    }

    public void setFrameId(int i) {
        this.frameId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.time))).longValue();
    }

    public void setTime(long j) {
        this.time = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getTimeInterval() {
        return ((Integer) lst.d(Integer.valueOf(this.timeInterval))).intValue();
    }

    public void setTimeInterval(int i) {
        this.timeInterval = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<WorkoutDataInfo> getWorkoutDataInfoList() {
        return (List) lst.d(this.workoutDataInfoLists);
    }

    public void setWorkoutDataInfoList(List<WorkoutDataInfo> list) {
        this.workoutDataInfoLists = (List) lst.d(list);
    }

    public List<String> getBitMap() {
        return (List) lst.d(this.capacityBitMaps);
    }

    public void setBitMap(List<String> list) {
        this.capacityBitMaps = (List) lst.d(list);
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public void setDataLength(int i) {
        this.dataLength = i;
    }

    public int getDataNumber() {
        return this.dataNumber;
    }

    public void setDataNumber(int i) {
        this.dataNumber = i;
    }

    public int getBitmap() {
        return this.bitmap;
    }

    public void setBitmap(int i) {
        this.bitmap = i;
    }
}
