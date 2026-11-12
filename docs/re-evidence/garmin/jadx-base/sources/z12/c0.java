package z12;

import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/c0;", "", "Lg12/e;", "adapter", "<init>", "(Lg12/e;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.i f201377a;

    public c0(g12.e eVar) {
        eVar.getClass();
        this.f201377a = eVar.f74887b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j12.f a(q91.d dVar) {
        j12.m mVar;
        dVar.getClass();
        g3 g3Var = (g3) this.f201377a.f46759k.d();
        List<j12.f> listG = (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) ? null : mVar.g();
        if (listG != null) {
            for (j12.f fVar : listG) {
                if (dVar.f143579a == fVar.getTypeId()) {
                    return fVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j12.j b() {
        j12.m mVar;
        g3 g3Var = (g3) this.f201377a.f46759k.d();
        if (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) {
            return null;
        }
        return mVar.getSectionPublicity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(q91.g gVar) {
        j12.m mVar;
        g3 g3Var = (g3) this.f201377a.f46759k.d();
        List<j12.f> listG = (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) ? null : mVar.g();
        if (listG == null) {
            return false;
        }
        for (j12.f fVar : listG) {
            boolean zE = ((m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null)).e();
            q91.d.a aVar = q91.d.f143558e;
            long typeId = fVar.getTypeId();
            aVar.getClass();
            q91.d dVarA = q91.d.a.a(Long.valueOf(typeId));
            if (dVarA == null || (dVarA == q91.d.H0 && !zE)) {
                dVarA = null;
            }
            if (dVarA != null && dVarA.f143580b == gVar && fVar.getValue() > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (b() == null) {
            return true;
        }
        j12.j jVarB = b();
        jVarB.getClass();
        return !jVarB.getIsShowPersonalRecords();
    }
}
