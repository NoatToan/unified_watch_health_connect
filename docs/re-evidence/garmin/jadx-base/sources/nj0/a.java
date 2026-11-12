package nj0;

import ht.i;
import ht.j;
import ht.k;
import ht.l;
import ht.m;
import ht.n;
import ht.o;
import ht.r;
import ht.s;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.w;
import zk.c;
import zk.d;
import zk.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnj0/a;", "Lht/i;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: nj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nj0/a$a", "Lht/r;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2426a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f126233a;

        public C2426a(o oVar) {
            this.f126233a = oVar;
        }

        @Override // ht.r
        public final zk.a a() {
            String str;
            o oVar = this.f126233a;
            oVar.getClass();
            switch (o.a.f85502a[oVar.ordinal()]) {
                case 1:
                    str = "gcpPaywallOpen";
                    break;
                case 2:
                    str = "gcpPaywallClose";
                    break;
                case 3:
                    str = "gcpPaywallError";
                    break;
                case 4:
                    str = "gcpPurchaseStarted";
                    break;
                case 5:
                    str = "gcpPurchaseCancelled";
                    break;
                case 6:
                    str = "gcpPurchaseCompleted";
                    break;
                case 7:
                    str = "gcpPurchaseFailed";
                    break;
                default:
                    u0.r();
                    return null;
            }
            return new zk.a(str, null, 0L, 6, null);
        }
    }

    @Override // ht.i
    public final void a(o oVar) {
        oVar.getClass();
        s sVar = s.f85508a;
        C2426a c2426a = new C2426a(oVar);
        sVar.getClass();
        s.a(c2426a);
    }

    @Override // ht.i
    public final void b(k kVar, m mVar, l lVar, List<n> list) {
        kVar.getClass();
        j jVar = new j(kVar.f85483a, mVar != null ? mVar.f85491a : null, lVar != null ? lVar.f85487a : null, list);
        c cVar = c.f205034a;
        List listC = w.c("GCS");
        cVar.getClass();
        new d(cVar, null, listC).a(new zk.a("USER_ACQUISITION", w.c(new e("userAcquisitionEvent", jVar)), false, 0L, 12, null));
    }
}
