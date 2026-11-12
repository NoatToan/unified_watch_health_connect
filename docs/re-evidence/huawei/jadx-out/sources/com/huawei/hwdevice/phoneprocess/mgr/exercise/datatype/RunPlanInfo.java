package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RunPlanInfo {

    @SerializedName("run_plan_sign")
    private String runPlanSign;

    @SerializedName("run_plan_start_date")
    private long runPlanStartDate;
    private List<RunPlanStruct> runPlanStructList;

    @SerializedName("run_plan_total_sign")
    private String runPlanTotalSign;

    public String getRunPlanTotalSign() {
        return (String) lst.d(this.runPlanTotalSign);
    }

    public void setRunPlanTotalSign(String str) {
        this.runPlanTotalSign = (String) lst.d(str);
    }

    public String getRunPlanSign() {
        return (String) lst.d(this.runPlanSign);
    }

    public void setRunPlanSign(String str) {
        this.runPlanSign = (String) lst.d(str);
    }

    public long getRunPlanStartDate() {
        return ((Long) lst.d(Long.valueOf(this.runPlanStartDate))).longValue();
    }

    public void setRunPlanStartDate(long j) {
        this.runPlanStartDate = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public List<RunPlanStruct> getRunPlanStructList() {
        return (List) lst.d(this.runPlanStructList);
    }

    public void setRunPlanStructList(List<RunPlanStruct> list) {
        this.runPlanStructList = (List) lst.d(list);
    }
}
