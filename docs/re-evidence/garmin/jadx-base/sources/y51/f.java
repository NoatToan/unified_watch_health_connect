package y51;

import b63.o;
import b63.u;
import com.garmin.android.apps.connectmobile.f0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v13.i;
import w51.g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly51/f;", "Ly51/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ly51/g;", "api", "Lo53/z;", "dispatcher", "<init>", "(Ly51/g;Lo53/z;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f194520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f194521b;

    public f(g gVar, z zVar) {
        gVar.getClass();
        zVar.getClass();
        this.f194520a = gVar;
        this.f194521b = zVar;
    }

    @Override // y51.a
    public final Object a(String str, fz0.c cVar, i iVar) {
        return ge1.b.e0(this.f194521b, new b(this, str, cVar, null), iVar);
    }

    @Override // y51.a
    public final Object b(o oVar, String str, i iVar) {
        return ge1.b.e0(this.f194521b, new e(this, oVar, str, z51.e.REJECTED, null, null, null, null, null), iVar);
    }

    @Override // y51.a
    public final Object c(o oVar, String str, u uVar, u uVar2, String str2, String str3, i iVar) {
        return ge1.b.e0(this.f194521b, new e(this, oVar, str, z51.e.MANUALLY_ACCEPTED, uVar, uVar2, str2, str3, null), iVar);
    }

    @Override // y51.a
    public final Object d(v13.c cVar) {
        return ge1.b.e0(this.f194521b, new d(null), cVar);
    }

    @Override // y51.a
    public final Object f(g0 g0Var) {
        return ge1.b.e0(this.f194521b, new c(this, null), g0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(g gVar, z zVar, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(gVar, zVar);
    }
}
