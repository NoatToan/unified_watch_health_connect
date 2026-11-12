package cu1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.o1;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu1/g0;", "Lcom/garmin/android/apps/connectmobile/o1$a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.l f55674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.d f55675b;

    public g0(xw1.l lVar, com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar) {
        this.f55674a = lVar;
        this.f55675b = dVar;
    }

    @Override // com.garmin.android.apps.connectmobile.o1.a
    public final void a(boolean z14) {
        xw1.l lVar = this.f55674a;
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar = this.f55675b;
        boolean z15 = true;
        if (!z14) {
            if (z14) {
                u0.r();
                return;
            }
            if (lVar.f192418d != R.string.create_an_event_v2) {
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                dVar.y6(lVar, true, zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal());
                return;
            }
            Integer num = lVar.f192415a;
            if (num != null && num.intValue() == R.string.lbl_event_deleted) {
                z15 = false;
            }
            int iOrdinal = zf0.a.CREATE_EVENT.ordinal();
            com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
            dVar.y6(lVar, z15, iOrdinal);
            return;
        }
        if (lVar.f192417c == R.string.find_new_event) {
            if (lVar.f192421g != null) {
                boolean z16 = !lVar.f192422h;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar3 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                dVar.y6(lVar, z16, zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal());
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
        if (dVar.w6().f187048o != null) {
            b bVar = dVar.f45421i;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("presenter");
                throw null;
            }
            if (bVar.b() != null) {
                wt1.d dVarW6 = dVar.w6();
                fg0.k kVar = dVar.w6().f187048o;
                kVar.getClass();
                b bVar2 = dVar.f45421i;
                if (bVar2 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                xw1.d dVarB = bVar2.b();
                dVarB.getClass();
                dVarW6.H4(kVar, dVarB);
            }
        }
    }
}
