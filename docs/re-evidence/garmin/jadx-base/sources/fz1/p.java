package fz1;

import android.content.Context;
import android.view.MenuItem;
import c22.l3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfz1/p;", "Lag0/b$b;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements ag0.b.InterfaceC0051b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m52.c f74054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e f74055b;

    public p(m52.c cVar, com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar) {
        this.f74054a = cVar;
        this.f74055b = eVar;
    }

    @Override // ag0.b.InterfaceC0051b
    public final void a(long j8) {
        long jD;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        long j14;
        Object value5;
        l22.a aVar;
        int i14;
        m52.c cVar = m52.c.SWIMMING;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = this.f74055b;
        m52.c cVar2 = this.f74054a;
        if (cVar2 == cVar || cVar2 == m52.c.OPEN_WATER_SWIMMING || cVar2 == m52.c.LAP_SWIMMING) {
            l3.f23124b.getClass();
            jD = MathKt.d(eVar.f46027c / l3.a.n((int) j8, true));
        } else {
            l3.a aVar2 = l3.f23124b;
            boolean zA6 = eVar.A6();
            aVar2.getClass();
            jD = MathKt.d(eVar.f46027c / l3.a.m(j8, zA6));
        }
        l3.f23124b.getClass();
        int i15 = ((int) jD) / DateTimeConstants.SECONDS_PER_HOUR;
        if (jD <= 0 || i15 > 48) {
            p2 p2Var = eVar.f46035k;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, null));
            p2 p2Var2 = eVar.f46036l;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, null));
        } else {
            eVar.f46028d = jD;
            p2 p2Var3 = eVar.f46037m;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, eVar.z6(cVar2)));
            p2 p2Var4 = eVar.f46035k;
            do {
                value4 = p2Var4.getValue();
                l3.a aVar3 = l3.f23124b;
                j14 = eVar.f46028d;
                aVar3.getClass();
            } while (!p2Var4.b(value4, l3.a.e1(j14)));
            p2 p2Var5 = eVar.f46036l;
            do {
                value5 = p2Var5.getValue();
                l3.a aVar4 = l3.f23124b;
                Context contextRequireContext = eVar.requireContext();
                contextRequireContext.getClass();
                aVar = new l22.a(contextRequireContext);
                i14 = (int) eVar.f46028d;
                aVar4.getClass();
            } while (!p2Var5.b(value5, l3.a.k1(aVar, true, i14)));
        }
        if (eVar.f46032h != ng0.a.LEG_SCREEN_VIEW) {
            MenuItem menuItem = eVar.f46034j;
            if (menuItem != null) {
                menuItem.setEnabled(eVar.f46028d > 0);
            } else {
                s.m("saveMenu");
                throw null;
            }
        }
    }
}
