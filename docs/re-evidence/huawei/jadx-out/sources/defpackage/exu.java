package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class exu implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("heartRate7Days")
    private List<eya> f33654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("emotion7Days")
    private List<eyc> f33655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("countryCode")
    private String f33656c;

    @SerializedName("hrv7Days")
    private List<eyb> d;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private int e;

    @SerializedName("language")
    private String f;

    @SerializedName("randomId")
    private String g;

    @SerializedName("sleep7Days")
    private List<eye> h;

    @SerializedName("location")
    private String i;

    @SerializedName(ParsedFieldTag.KAKA_TASK_SCENARIO)
    private String j;

    @SerializedName("timeZone")
    private String k;

    @SerializedName("ts")
    private String l;

    @SerializedName("stress7Days")
    private List<eyn> n;

    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)
    private eym o;

    public void b(int i) {
        this.e = i;
    }

    public void d(String str) {
        this.i = str;
    }

    public void a(String str) {
        this.f = str;
    }

    public void e(eym eymVar) {
        this.o = eymVar;
    }

    public void c(String str) {
        this.f33656c = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public void j(String str) {
        this.l = str;
    }

    public void e(List<eye> list) {
        this.h = list;
    }

    public void c(List<eyn> list) {
        this.n = list;
    }

    public void d(List<eyc> list) {
        this.f33655b = list;
    }

    public void a(List<eya> list) {
        this.f33654a = list;
    }

    public void b(List<eyb> list) {
        this.d = list;
    }

    public void b(String str) {
        this.g = str;
    }

    public void e(String str) {
        this.j = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/aiaudio/generateAiAudio";
    }
}
