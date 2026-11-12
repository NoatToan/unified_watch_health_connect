package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;

/* JADX INFO: loaded from: classes41.dex */
public class pdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("seriesId")
    private String f45191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)
    private int f45192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sleepAudioUploadInfo")
    private pdk f45193c;

    @SerializedName("operType")
    private int d;

    @SerializedName("id")
    private String e;

    public void e(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.f45191a = str;
    }

    public void c(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.f45192b = i;
    }
}
