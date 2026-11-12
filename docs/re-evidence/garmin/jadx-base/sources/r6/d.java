package r6;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d extends q6.d {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f150967n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @Deprecated
    public final HashMap<String, Float> f150968o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Deprecated
    public final HashMap<String, Float> f150969p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Deprecated
    public final HashMap<String, Float> f150970q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public HashMap<String, Float> f150971r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HashMap<String, Float> f150972s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public q6.g.a f150973t0;

    public d(q6.g gVar, q6.g.d dVar) {
        super(gVar, dVar);
        this.f150967n0 = 0.5f;
        this.f150968o0 = new HashMap<>();
        this.f150969p0 = new HashMap<>();
        this.f150970q0 = new HashMap<>();
        this.f150973t0 = q6.g.a.SPREAD;
    }

    public final float t(String str) {
        HashMap<String, Float> map = this.f150972s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f150972s0.get(str).floatValue();
    }

    public final float u(String str) {
        HashMap<String, Float> map = this.f150970q0;
        if (map.containsKey(str)) {
            return map.get(str).floatValue();
        }
        return 0.0f;
    }

    public final float v(String str) {
        HashMap<String, Float> map = this.f150971r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f150971r0.get(str).floatValue();
    }

    public final float w(String str) {
        HashMap<String, Float> map = this.f150969p0;
        if (map.containsKey(str)) {
            return map.get(str).floatValue();
        }
        return 0.0f;
    }
}
