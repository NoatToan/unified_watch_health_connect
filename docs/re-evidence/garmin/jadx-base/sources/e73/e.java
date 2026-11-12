package e73;

import h73.w;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f63335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f63338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f63339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f63340f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f63341g = false;

    private e(w wVar, int i14, e eVar, f fVar, boolean z14) {
        this.f63335a = wVar;
        this.f63336b = i14;
        this.f63337c = z14;
        this.f63338d = eVar;
        this.f63339e = fVar;
    }

    public static e a(w wVar, int i14, e eVar, f fVar) {
        return new e(wVar, i14, eVar, fVar, true);
    }

    public static e b(w wVar, int i14, e eVar, f fVar) {
        return new e(wVar, i14, eVar, fVar, false);
    }
}
