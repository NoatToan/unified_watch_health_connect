package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CommonSectionList {
    private static final int DEFAULT_VALUE = -1;
    private List<CommonSectionInfo> sectionStructs;
    private int workoutRecordId = -1;
    private int sectionIndex = -1;

    public int getWorkoutRecordId() {
        return ((Integer) lst.d(Integer.valueOf(this.workoutRecordId))).intValue();
    }

    public void setWorkoutRecordId(int i) {
        this.workoutRecordId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSectionIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.sectionIndex))).intValue();
    }

    public void setSectionIndex(int i) {
        this.sectionIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<CommonSectionInfo> getSectionInfos() {
        return (List) lst.d(this.sectionStructs);
    }

    public void setSectionInfos(List<CommonSectionInfo> list) {
        this.sectionStructs = (List) lst.d(list);
    }

    public String toString() {
        return "CommonSectionList{workoutRecordId=" + this.workoutRecordId + ", sectionIndex=" + this.sectionIndex + ", sectionStructs=" + this.sectionStructs + '}';
    }
}
