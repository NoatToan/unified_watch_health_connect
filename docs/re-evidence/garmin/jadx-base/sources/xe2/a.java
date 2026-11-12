package xe2;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.a f190446b;

    public /* synthetic */ a(com.garmin.android.library.mobileauth.ui.a aVar, int i14) {
        this.f190445a = i14;
        this.f190446b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f190445a;
        int i15 = 0;
        com.garmin.android.library.mobileauth.ui.a aVar = this.f190446b;
        switch (i14) {
            case 0:
                int i16 = com.garmin.android.library.mobileauth.ui.a.f50411l;
                re2.l0.f152316a.getClass();
                boolean zE = re2.l0.e(aVar);
                View view2 = aVar.f50418g;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("noInternetConnBanner");
                    throw null;
                }
                view2.setVisibility(zE ? 8 : 0);
                androidx.fragment.app.v supportFragmentManager = aVar.getSupportFragmentManager();
                Fragment fragmentG = supportFragmentManager.G("WELCOME");
                if (fragmentG != null) {
                    if (fragmentG.isRemoving()) {
                        fragmentG = null;
                    }
                    if (fragmentG != null) {
                        com.garmin.android.library.mobileauth.ui.g gVar = fragmentG instanceof com.garmin.android.library.mobileauth.ui.g ? (com.garmin.android.library.mobileauth.ui.g) fragmentG : null;
                        if (gVar != null) {
                            re2.g0.c(new b50.o(gVar, zE, 19), gVar);
                        }
                    }
                }
                Fragment fragmentG2 = supportFragmentManager.G("CONTINUE_AS");
                if (fragmentG2 != null) {
                    if (fragmentG2.isRemoving()) {
                        fragmentG2 = null;
                    }
                    if (fragmentG2 != null) {
                        y yVar = fragmentG2 instanceof y ? (y) fragmentG2 : null;
                        if (yVar != null) {
                            re2.g0.c(new t(yVar, zE, i15), yVar);
                        }
                    }
                }
                Fragment fragmentG3 = supportFragmentManager.G("TERMS_OF_USE");
                if (fragmentG3 != null) {
                    if (fragmentG3.isRemoving()) {
                        fragmentG3 = null;
                    }
                    if (fragmentG3 != null) {
                        com.garmin.android.library.mobileauth.ui.e eVar = fragmentG3 instanceof com.garmin.android.library.mobileauth.ui.e ? (com.garmin.android.library.mobileauth.ui.e) fragmentG3 : null;
                        if (eVar != null) {
                            Boolean boolValueOf = Boolean.valueOf(zE);
                            androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                            viewLifecycleOwner.getClass();
                            androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
                            x53.c cVar = o53.s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new q0(eVar, boolValueOf, null), 2);
                        }
                    }
                }
                Fragment fragmentG4 = supportFragmentManager.G("CREATE_ACCOUNT_WARNING");
                if (fragmentG4 != null) {
                    if (fragmentG4.isRemoving()) {
                        fragmentG4 = null;
                    }
                    if (fragmentG4 != null) {
                        z zVar = fragmentG4 instanceof z ? (z) fragmentG4 : null;
                        if (zVar != null) {
                            re2.g0.c(new b50.o(zVar, zE, 18), zVar);
                        }
                    }
                }
                if (aVar.f50415d) {
                    com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = aVar instanceof com.garmin.android.library.mobileauth.ui.mfa.a ? (com.garmin.android.library.mobileauth.ui.mfa.a) aVar : null;
                    if (aVar2 == null || zE) {
                        return;
                    }
                    androidx.lifecycle.i0 i0VarW2 = o53.f0.w(aVar2);
                    x53.c cVar2 = o53.s0.f129406a;
                    ge1.b.T(i0VarW2, u53.o.f168762a, null, new ze2.b(aVar2, null), 2);
                    return;
                }
                return;
            case 1:
                ProgressBar progressBar = aVar.f50414c;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("progressSpinner");
                    throw null;
                }
            default:
                ProgressBar progressBar2 = aVar.f50414c;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("progressSpinner");
                    throw null;
                }
        }
    }
}
