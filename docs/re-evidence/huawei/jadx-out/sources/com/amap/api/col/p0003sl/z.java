package com.amap.api.col.p0003sl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f3321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f3322b;

    /* synthetic */ z(byte b2) {
        this();
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static z f3323a = new z(0);
    }

    private z() {
        this.f3321a = new ConcurrentHashMap();
        this.f3322b = new AtomicBoolean(false);
        c();
    }

    public static z a() {
        return a.f3323a;
    }

    private void c() {
        this.f3321a.put("feature_mvt", Boolean.TRUE);
        this.f3321a.put("feature_gltf", Boolean.FALSE);
        this.f3321a.put("feature_terrain", Boolean.FALSE);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("mvt_able");
        im.a(strOptString, true);
        this.f3321a.put("feature_mvt", Boolean.valueOf(im.a(strOptString, true)));
        this.f3321a.put("feature_gltf", Boolean.valueOf(im.a(jSONObject.optString("gltf_able"), false)));
        this.f3321a.put("feature_terrain", Boolean.valueOf(im.a(jSONObject.optString("terrain_able"), false)));
        this.f3322b.set(true);
    }

    public final boolean a(String str) {
        if (this.f3321a.containsKey(str)) {
            return this.f3321a.get(str).booleanValue();
        }
        return false;
    }

    public final boolean b() {
        return this.f3322b.get();
    }
}
