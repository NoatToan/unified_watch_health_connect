package defpackage;

import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.GRSManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gfm implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private String f35029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extendInfo")
    private Map<String, Object> f35030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("countryCode")
    private String f35031c;

    @SerializedName("exeTools")
    private List<Integer> d;

    @SerializedName("clickData")
    private gfg e;

    @SerializedName("sourceAction")
    private int f;

    @SerializedName(GeocodeSearch.GPS)
    private gfp g;

    @SerializedName("sessionId")
    private String h;

    @SerializedName("language")
    private String i;

    @SerializedName("iVersion")
    private String j;

    @SerializedName("supportTools")
    private List<Integer> m;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("marketingGateWayUrl") + "/healthCoachRoute/v1/coachSuggests:interpret";
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.j = str;
    }

    public void e(gfg gfgVar) {
        this.e = gfgVar;
    }

    public void c(String str) {
        this.f35029a = str;
    }

    public void a(String str) {
        this.f35031c = str;
    }

    public void c(gfp gfpVar) {
        this.g = gfpVar;
    }

    public void e(List<Integer> list) {
        this.m = list;
    }

    public void d(List<Integer> list) {
        this.d = list;
    }

    public void c(Map<String, Object> map) {
        this.f35030b = map;
    }
}
