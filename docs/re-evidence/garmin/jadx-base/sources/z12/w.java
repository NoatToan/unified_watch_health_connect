package z12;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/w;", "", "Lg12/e;", "adapter", "<init>", "(Lg12/e;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.i f201496a;

    public w(g12.e eVar) {
        eVar.getClass();
        this.f201496a = eVar.f74887b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j12.j a() {
        j12.m mVar;
        g3 g3Var = (g3) this.f201496a.f46759k.d();
        if (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) {
            return null;
        }
        return mVar.getSectionPublicity();
    }

    public final boolean b() {
        if (a() == null) {
            return true;
        }
        j12.j jVarA = a();
        jVarA.getClass();
        return !jVarA.getIsShowLifetimeTotals();
    }
}
