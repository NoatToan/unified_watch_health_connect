package com.huawei.ui.commonui.muscleview.data;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMuscleInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("muscleName")
    private String f23773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("muscleFunction")
    private String f23774b;

    @SerializedName("id")
    private int d;

    public static class MuscleType extends TypeToken<ArrayList<HealthMuscleInfo>> {
    }

    public String c() {
        return this.f23773a;
    }

    public String d() {
        return this.f23774b;
    }

    public String toString() {
        return "HealthMuscleInfo{id=" + this.d + ", muscleName=" + this.f23773a + ", muscleFunction=" + this.f23774b;
    }
}
