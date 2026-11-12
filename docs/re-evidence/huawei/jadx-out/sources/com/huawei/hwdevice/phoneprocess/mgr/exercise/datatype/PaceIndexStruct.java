package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class PaceIndexStruct {
    private int paceIndex;
    private int recordId;

    public int getRecordId() {
        return ((Integer) lst.d(Integer.valueOf(this.recordId))).intValue();
    }

    public void setRecordId(int i) {
        this.recordId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getPaceIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.paceIndex))).intValue();
    }

    public void setPaceIndex(int i) {
        this.paceIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
