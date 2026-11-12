package y10;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import gg1.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly10/f0;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/connectiq/l;", "appType", "", "deviceUnitID", "Lgg1/v0;", "serverEnvironment", "Lr10/d;", "connectIQDownloadRepo", "Lcom/garmin/android/apps/connectmobile/connectiq/b0;", "connectIQRequestManager", "Lrd2/j;", "deviceDAORetriever", "Lc22/a0;", "dispatcherProvider", "Ll80/a;", "deviceDelegate", "<init>", "(Lcom/garmin/android/apps/connectmobile/connectiq/l;JLgg1/v0;Lr10/d;Lcom/garmin/android/apps/connectmobile/connectiq/b0;Lrd2/j;Lc22/a0;Ll80/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.connectiq.l f193843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f193844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f193845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r10.d f193846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.connectiq.b0 f193847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rd2.j f193848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c22.a0 f193849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.a f193850h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(com.garmin.android.apps.connectmobile.connectiq.l lVar, long j8, v0 v0Var, r10.d dVar, com.garmin.android.apps.connectmobile.connectiq.b0 b0Var, rd2.j jVar, c22.a0 a0Var, l80.a aVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        v0 v0VarB;
        com.garmin.android.apps.connectmobile.connectiq.b0 b0Var2;
        rd2.j jVar3;
        if ((i14 & 4) != 0) {
            v0.T.getClass();
            v0VarB = v0.a.b();
        } else {
            v0VarB = v0Var;
        }
        r10.d dVar2 = (i14 & 8) != 0 ? new r10.d(null, null, 3, null) : dVar;
        if ((i14 & 16) != 0) {
            com.garmin.android.apps.connectmobile.connectiq.b0 b0VarE = com.garmin.android.apps.connectmobile.connectiq.b0.e();
            b0VarE.getClass();
            b0Var2 = b0VarE;
        } else {
            b0Var2 = b0Var;
        }
        if ((i14 & 32) != 0) {
            rd2.j jVar4 = rd2.f.a().f152045a;
            jVar4.getClass();
            jVar3 = jVar4;
        } else {
            jVar3 = jVar;
        }
        this(lVar, j8, v0VarB, dVar2, b0Var2, jVar3, (i14 & 64) != 0 ? new c22.a0(null, null, null, 7, null) : a0Var, (i14 & 128) != 0 ? (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null) : aVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(k.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new k(this.f193843a, this.f193844b, this.f193845c, this.f193846d, this.f193847e, this.f193848f, this.f193849g, this.f193850h);
    }

    public f0(com.garmin.android.apps.connectmobile.connectiq.l lVar, long j8, v0 v0Var, r10.d dVar, com.garmin.android.apps.connectmobile.connectiq.b0 b0Var, rd2.j jVar, c22.a0 a0Var, l80.a aVar) {
        lVar.getClass();
        v0Var.getClass();
        dVar.getClass();
        b0Var.getClass();
        jVar.getClass();
        a0Var.getClass();
        aVar.getClass();
        this.f193843a = lVar;
        this.f193844b = j8;
        this.f193845c = v0Var;
        this.f193846d = dVar;
        this.f193847e = b0Var;
        this.f193848f = jVar;
        this.f193849g = a0Var;
        this.f193850h = aVar;
    }
}
