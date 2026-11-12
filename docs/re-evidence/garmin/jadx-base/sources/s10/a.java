package s10;

import c22.k;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sc2.j;
import ve2.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls10/a;", "Lsj2/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements sj2.c {
    @Override // sj2.c
    public final zi2.a a() {
        return f.c(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h());
    }

    @Override // sj2.c
    public final dd2.c b() {
        if (((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("gcm_oauth2_enabled")) {
            return null;
        }
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        j jVarD = bVar.d();
        dd2.b bVarB = bVar.b();
        return new dd2.c(jVarD.f158514a, jVarD.f158515b, bVarB.f59210a, bVarB.f59211b);
    }

    @Override // sj2.c
    public final String c() {
        if (((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("gcm_oauth2_enabled")) {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
        }
        return null;
    }

    @Override // sj2.c
    public final String d(long j8) {
        String applicationKey;
        Object obj = null;
        if (((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("gcm_oauth2_enabled")) {
            return "";
        }
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE == null) {
            return "";
        }
        for (Object obj2 : arrayListE) {
            if (((sd2.f) obj2).getUnitID() == j8) {
                obj = obj2;
                break;
            }
        }
        sd2.f fVar = (sd2.f) obj;
        return (fVar == null || (applicationKey = fVar.getApplicationKey()) == null) ? "" : applicationKey;
    }
}
