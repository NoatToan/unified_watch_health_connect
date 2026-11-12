package defpackage;

import com.amap.api.col.p0003sl.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class eht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Boolean> f16661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f16662b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static eht f16663a = new eht(0);
    }

    public /* synthetic */ eht(byte b2) {
        this();
    }

    public static eht a() {
        return a.f16663a;
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("mvt_able");
        x0.x(strOptString, true);
        this.f16661a.put("feature_mvt", Boolean.valueOf(x0.x(strOptString, true)));
        this.f16661a.put("feature_gltf", Boolean.valueOf(x0.x(jSONObject.optString("gltf_able"), false)));
        this.f16661a.put("feature_terrain", Boolean.valueOf(x0.x(jSONObject.optString("terrain_able"), false)));
        this.f16662b.set(true);
    }

    public final boolean c(String str) {
        if (this.f16661a.containsKey(str)) {
            return this.f16661a.get(str).booleanValue();
        }
        return false;
    }

    public final boolean d() {
        return this.f16662b.get();
    }

    public final void e() {
        this.f16661a.put("feature_mvt", Boolean.TRUE);
        Map<String, Boolean> map = this.f16661a;
        Boolean bool = Boolean.FALSE;
        map.put("feature_gltf", bool);
        this.f16661a.put("feature_terrain", bool);
    }

    public eht() {
        this.f16661a = new ConcurrentHashMap();
        this.f16662b = new AtomicBoolean(false);
        e();
    }
}
