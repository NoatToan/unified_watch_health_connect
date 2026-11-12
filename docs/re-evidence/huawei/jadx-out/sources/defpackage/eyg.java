package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class eyg implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("realTimeHeartRate")
    private List<eyf> f33681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("screenStatus")
    private int f33682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("language")
    private String f33683c;

    @SerializedName("location")
    private String d;

    @SerializedName("audioId")
    private String e;

    @SerializedName("sleepEvent")
    private int f;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)
    private eym g;

    @SerializedName("step")
    private int h;

    public void d(String str) {
        this.d = str;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.f33682b = i;
    }

    public void e(int i) {
        this.h = i;
    }

    public void c(List<eyf> list) {
        this.f33681a = list;
    }

    public void b(String str) {
        this.f33683c = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void d(eym eymVar) {
        this.g = eymVar;
    }

    public String toString() {
        return "RefreshInfoAiAudioReq{sleepEvent=" + this.f + ", screenStatus=" + this.f33682b + ", step=" + this.h + ", realtimeHeartRate=" + this.f33681a + ", language='" + this.f33683c + "', audioId='" + this.e + "', weather=" + this.g + ", location='" + this.d + "'}";
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/aiaudio/refreshAiAudio";
    }
}
