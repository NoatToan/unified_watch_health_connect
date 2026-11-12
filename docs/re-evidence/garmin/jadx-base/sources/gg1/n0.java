package gg1;

import android.content.Context;
import c22.l3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements j42.b.InterfaceC1852b, com.garmin.android.apps.connectmobile.settings.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77283a;

    public /* synthetic */ n0(com.garmin.android.apps.connectmobile.settings.e eVar) {
        this.f77283a = eVar;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        com.garmin.android.apps.connectmobile.settings.e eVar = this.f77283a;
        eVar.f43405d = true;
        k32.l lVar = eVar.f43409h;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("userHeightItem");
            throw null;
        }
        l3.a aVar = l3.f23124b;
        Context contextRequireContext = eVar.requireContext();
        f12.l.f68084a.getClass();
        lVar.h(l3.a.n0(aVar, contextRequireContext, f14, f12.l.a.a().y()));
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        com.garmin.android.apps.connectmobile.settings.e eVar = this.f77283a;
        eVar.f43405d = true;
        k32.l lVar = eVar.f43410i;
        if (lVar != null) {
            lVar.h(l3.a.C1(l3.f23124b, eVar.requireContext(), d14, am.j.z(f12.l.f68084a), false, null, 56));
        } else {
            p005kotlin.jvm.internal.s.m("userWeightItem");
            throw null;
        }
    }
}
