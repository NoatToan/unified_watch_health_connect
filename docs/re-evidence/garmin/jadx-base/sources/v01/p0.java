package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv01/p0;", "", "Lm01/g;", "repository", "Ld01/c;", "store", "Ls01/f;", "nutritionSettingsConfigProvider", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lm01/g;Ld01/c;Ls01/f;Lo53/z;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d01.c f174499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.f f174500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f174501d;

    public p0(m01.g gVar, d01.c cVar, s01.f fVar, o53.z zVar) {
        gVar.getClass();
        cVar.getClass();
        fVar.getClass();
        zVar.getClass();
        this.f174498a = gVar;
        this.f174499b = cVar;
        this.f174500c = fVar;
        this.f174501d = zVar;
    }

    public static Object a(p0 p0Var, b63.o oVar, boolean z14, v13.c cVar, int i14) {
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        return ge1.b.e0(p0Var.f174501d, new o0(z14, p0Var, oVar, true, null), cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p0(m01.g gVar, d01.c cVar, s01.f fVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar2 = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(gVar, cVar, fVar, zVar);
    }
}
