package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes17.dex */
public class smo implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lang")
    private String f48372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pageNum")
    private int f48373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("iVersion")
    private String f48374c;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private int d;

    @SerializedName("deviceSource")
    private int e;

    @SerializedName("topicId")
    private String f;

    @SerializedName("ts")
    private long i;

    public void c(String str) {
        this.f = str;
    }

    public void e(int i) {
        this.e = i;
    }

    public void a(int i) {
        this.f48373b = i;
    }

    public void d(long j) {
        this.i = j;
    }

    public void a(String str) {
        this.f48374c = str;
    }

    public void c(int i) {
        this.d = i;
    }

    public void d(String str) {
        this.f48372a = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/getWorkoutsByTopicId";
    }
}
