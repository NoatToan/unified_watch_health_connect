package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class lqv implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("somatosensoryTemperature")
    private int f40694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("humidity")
    private String f40695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("wind")
    private int f40696c;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE)
    private int d;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)
    private int e;

    @SerializedName("windDirection")
    private int i;

    @SerializedName("windSpeed")
    private int j;

    public int a() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int b() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int c() {
        return this.f40694a;
    }

    public void a(int i) {
        this.f40694a = i;
    }

    public String d() {
        return this.f40695b;
    }

    public void a(String str) {
        this.f40695b = str;
    }

    public int f() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public int e() {
        return this.f40696c;
    }

    public void b(int i) {
        this.f40696c = i;
    }

    public int h() {
        return this.j;
    }

    public void f(int i) {
        this.j = i;
    }
}
