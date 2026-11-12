package pm0;

import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends q implements l<g3<? extends Object>, Unit> {
    public j(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.group.details.challenges.e.class, "updateLoadingStatus", "updateLoadingStatus(Lcom/garmin/android/apps/connectmobile/UIResource;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(g3<? extends Object> g3Var) {
        g3<? extends Object> g3Var2 = g3Var;
        g3Var2.getClass();
        com.garmin.android.apps.connectmobile.group.details.challenges.e eVar = (com.garmin.android.apps.connectmobile.group.details.challenges.e) this.receiver;
        eVar.getClass();
        int i14 = com.garmin.android.apps.connectmobile.group.details.challenges.e.a.f36346a[g3Var2.f35300a.ordinal()];
        if (i14 == 1) {
            eVar.G6();
        } else if (i14 == 2) {
            eVar.w6();
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            eVar.w6();
            g22.e.a(eVar, null);
        }
        return Unit.INSTANCE;
    }
}
