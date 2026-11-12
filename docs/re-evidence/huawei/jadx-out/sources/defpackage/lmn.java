package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.TagConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageProperties")
    private List<Map<String, Object>> f40455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TagConstants.SCENE_TYPE)
    private Map<String, Object> f40456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("from")
    private Map<String, Object> f40457c;

    @SerializedName("CONTENT")
    private Map<String, Object> d;

    public Map<String, Object> c() {
        return this.d;
    }

    public void e(Map<String, Object> map) {
        this.d = map;
    }

    public List<Map<String, Object>> e() {
        return this.f40455a;
    }

    public void d(List<Map<String, Object>> list) {
        this.f40455a = list;
    }

    public Map<String, Object> b() {
        return this.f40456b;
    }

    public void d(Map<String, Object> map) {
        this.f40456b = map;
    }

    public Map<String, Object> a() {
        return this.f40457c;
    }

    public void c(Map<String, Object> map) {
        this.f40457c = map;
    }

    public void b(Map<String, Object> map, String str) {
        map.put("sessionId", str);
    }

    public String toString() {
        return "HealthRootBiInfo{content=" + this.d + ", pageProperties=" + this.f40455a + ", scene=" + this.f40456b + ", from=" + this.f40457c + '}';
    }
}
