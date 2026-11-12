package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.MultipleValueSelectorView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/i;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/MultipleValueSelectorView$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements MultipleValueSelectorView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f40666a;

    public i(h hVar) {
        this.f40666a = hVar;
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.MultipleValueSelectorView.a
    public final void a(String str) {
        db1.d dVar;
        str.getClass();
        h.a aVar = h.B;
        h hVar = this.f40666a;
        hVar.v6();
        tb1.e.a aVar2 = tb1.e.f163745a;
        Context contextRequireContext = hVar.requireContext();
        contextRequireContext.getClass();
        aVar2.getClass();
        db1.d[] dVarArrValues = db1.d.values();
        int length = dVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i14];
            if (p005kotlin.jvm.internal.s.g(contextRequireContext.getString(dVar.f59000a), str)) {
                break;
            } else {
                i14++;
            }
        }
        if (dVar == null) {
            h.B.getClass();
            dVar = h.C;
        }
        if (hVar.f40648p) {
            db1.t tVar = hVar.f40645m;
            if (tVar == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                throw null;
            }
            tVar.i(dVar);
        } else {
            db1.r rVar = hVar.f40643k;
            if (rVar == null) {
                p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                throw null;
            }
            rVar.o(dVar);
        }
        hVar.requireActivity().invalidateOptionsMenu();
    }
}
