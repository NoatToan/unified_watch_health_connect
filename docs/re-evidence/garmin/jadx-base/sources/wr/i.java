package wr;

import android.content.Intent;
import fw.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f186747b;

    public /* synthetic */ i(k kVar, int i14) {
        this.f186746a = i14;
        this.f186747b = kVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f186746a;
        k kVar = this.f186747b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                k.a aVar = k.f186755l;
                int i15 = k.b.f186768b[mVar.f73769b.ordinal()];
                if (i15 == 1) {
                    g22.e.l(kVar);
                } else if (i15 == 2) {
                    g22.e.f(kVar);
                    androidx.fragment.app.m activity = kVar.getActivity();
                    if (activity != null) {
                        Intent intent = new Intent();
                        Collection collection = (List) mVar.f73770c;
                        if (collection == null) {
                            collection = j0.f134944a;
                        }
                        intent.putParcelableArrayListExtra("GCM_extra_activity_splits", new ArrayList<>(collection));
                        Unit unit = Unit.INSTANCE;
                        activity.setResult(-1, intent);
                    }
                    kVar.y6();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(kVar);
                    g22.e.a(kVar, mVar.f73771d);
                }
                return Unit.INSTANCE;
            default:
                x xVar = (x) obj;
                tq.a aVar2 = kVar.f186757b;
                if (aVar2 == null) {
                    s.m("splitsViewModel");
                    throw null;
                }
                aVar2.f166000h = xVar;
                List<x> listC = xVar != null ? w.c(xVar) : null;
                if (listC == null) {
                    listC = tq.k.h(aVar2.f165994b);
                }
                aVar2.f165998f = listC;
                aVar2.x4(aVar2.f165997e, listC);
                return Unit.INSTANCE;
        }
    }
}
