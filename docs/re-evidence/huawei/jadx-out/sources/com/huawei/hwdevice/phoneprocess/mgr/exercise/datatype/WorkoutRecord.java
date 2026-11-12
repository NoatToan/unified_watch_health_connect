package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class WorkoutRecord {

    @SerializedName("workout_record_count")
    private int workoutRecordCount;
    private List<WorkoutRecordStruct> workoutRecordStructList;

    public int getWorkoutRecordCount() {
        return ((Integer) lst.d(Integer.valueOf(this.workoutRecordCount))).intValue();
    }

    public void setWorkoutRecordCount(int i) {
        this.workoutRecordCount = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<WorkoutRecordStruct> getWorkoutRecordStructList() {
        return (List) lst.d(this.workoutRecordStructList);
    }

    public void setWorkoutRecordStructList(List<WorkoutRecordStruct> list) {
        this.workoutRecordStructList = (List) lst.d(list);
    }
}
