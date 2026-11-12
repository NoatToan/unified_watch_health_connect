package z11;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.i2;
import d20.f;
import e23.l;
import g22.e;
import hb2.i;
import lc.u0;
import p005kotlin.Unit;
import z10.z2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b f201359b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b bVar, int i14) {
        this.f201358a = i14;
        this.f201359b = bVar;
    }

    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f201358a;
        int i15 = 3;
        com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b bVar = this.f201359b;
        switch (i14) {
            case 0:
                f fVar = (f) obj;
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.a aVar = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.f39610f;
                e.f(bVar);
                if (fVar != null) {
                    bVar.f39615e = fVar;
                    f12.l.f68084a.getClass();
                    boolean zD3 = f12.l.a.a().d3();
                    com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a.f39609n.getClass();
                    com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a aVar2 = new com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("CONSENT_DATA", fVar);
                    bundle.putBoolean("ACCOUNT_CONNECTED", zD3);
                    aVar2.setArguments(bundle);
                    v childFragmentManager = bVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager);
                    aVar3.l(R.id.content_frame, aVar2, "ACCOUNT_STATUS_FRAGMENT");
                    aVar3.s(true, true);
                } else if (i.a(bVar.requireContext())) {
                    e.c(bVar);
                }
                return Unit.INSTANCE;
            case 1:
                z2 z2Var = (z2) obj;
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.a aVar4 = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.f39610f;
                if ((z2Var instanceof z2.a) || (z2Var instanceof z2.d)) {
                    bVar.u6(z2Var);
                } else if (z2Var instanceof z2.c) {
                    e1 e1Var = bVar.f39614d;
                    if (e1Var != null) {
                        e1Var.onFragmentFinished((2 & 1) != 0 ? null : -1, null);
                    }
                } else {
                    if (!(z2Var instanceof z2.b)) {
                        u0.r();
                        return null;
                    }
                    e.i(bVar, Uri.parse(((z2.b) z2Var).f201348a));
                }
                return Unit.INSTANCE;
            case 2:
                q92.v vVar = (q92.v) obj;
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.a aVar5 = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.f39610f;
                i2.a aVar6 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var, "MyFitnessPalAccountFragment", "Consent revoke complete (status = " + vVar + ")");
                e.f(bVar);
                if (vVar != null) {
                    a21.d dVar = (a21.d) bVar.f39613c.getValue();
                    dVar.getClass();
                    m.a(null, new a21.e(dVar, null), 3).f(bVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.C0711b(new d(bVar, i15)));
                } else {
                    e.c(bVar);
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.a aVar7 = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.b.f39610f;
                bVar.requireActivity().setResult(-1);
                bVar.requireActivity().finish();
                return Unit.INSTANCE;
        }
    }
}
