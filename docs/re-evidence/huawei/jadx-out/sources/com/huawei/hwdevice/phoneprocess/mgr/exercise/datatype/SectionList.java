package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SectionList {

    @SerializedName("section_index")
    private int sectionIndex;

    @SerializedName(HwExerciseConstants.JSON_NAME_SECTION_STRUCT)
    private List<SectionInfo> sectionStructs;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)
    private int workoutRecordId;

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

    public List<SectionInfo> getSectionInfos() {
        return (List) lst.d(this.sectionStructs);
    }

    public void setSectionInfos(List<SectionInfo> list) {
        this.sectionStructs = (List) lst.d(list);
    }
}
