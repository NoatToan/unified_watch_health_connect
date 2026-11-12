package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RunPlanRecord {

    @SerializedName("run_plan_record_count")
    private int runPlanRecordCount;
    private List<RunPlanRecordStruct> runPlanRecordStructList;

    public int getRunPlanRecordCount() {
        return ((Integer) lst.d(Integer.valueOf(this.runPlanRecordCount))).intValue();
    }

    public void setRunPlanRecordCount(int i) {
        this.runPlanRecordCount = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<RunPlanRecordStruct> getRunPlanRecordStructList() {
        return (List) lst.d(this.runPlanRecordStructList);
    }

    public void setRunPlanRecordStructList(List<RunPlanRecordStruct> list) {
        this.runPlanRecordStructList = (List) lst.d(list);
    }
}
