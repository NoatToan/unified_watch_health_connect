package qk0;

import am.x0;
import java.util.Map;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqk0/e;", "", "", "isLoading", "loadError", "", "Lam/x0;", "Lmk0/a;", "conflictsByActivity", "<init>", "(ZZLjava/util/Map;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<x0, mk0.a> f145090c;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(boolean z14, boolean z15, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        if ((i14 & 4) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(z14, z15, map);
    }

    public static e a(e eVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            z14 = eVar.f145088a;
        }
        Map<x0, mk0.a> map = eVar.f145090c;
        eVar.getClass();
        map.getClass();
        return new e(z14, z15, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f145088a == eVar.f145088a && this.f145089b == eVar.f145089b && p005kotlin.jvm.internal.s.g(this.f145090c, eVar.f145090c);
    }

    public final int hashCode() {
        return this.f145090c.hashCode() + q6.f.g(Boolean.hashCode(this.f145088a) * 31, 31, this.f145089b);
    }

    public final String toString() {
        return am.j.s(com.airbnb.lottie.animation.keyframe.a.m("DefaultActivitySelectionUiState(isLoading=", ", loadError=", ", conflictsByActivity=", this.f145088a, this.f145089b), this.f145090c, ")");
    }

    public e(boolean z14, boolean z15, Map<x0, mk0.a> map) {
        map.getClass();
        this.f145088a = z14;
        this.f145089b = z15;
        this.f145090c = map;
    }

    public e() {
        this(false, false, null, 7, null);
    }
}
