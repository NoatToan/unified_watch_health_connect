package wu0;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import java.util.List;
import lc.u0;
import o13.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p92.o;
import q92.v;
import q92.x;
import r22.q0;
import vv0.n;
import z10.a1;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a f187261b;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar, int i14) {
        this.f187260a = i14;
        this.f187261b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Parcelable parcelable;
        View view2;
        View view3;
        int i14 = this.f187260a;
        com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar = this.f187261b;
        int i15 = 1;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a aVar2 = this.f187261b;
                t tVar = aVar2.f38677c;
                a1 a1Var = (a1) obj;
                int i16 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                if (a1Var instanceof a1.b) {
                    aVar2.showProgressOverlay();
                } else if (a1Var instanceof a1.g) {
                    aVar2.initActionBar(true, aVar2.da());
                    aVar2.hideProgressOverlay();
                    a1.g gVar = (a1.g) a1Var;
                    parcelable = null;
                    x xVar = gVar.f200881a;
                    g gVar2 = aVar2.f38678d;
                    g gVar3 = aVar2.f38679e;
                    v vVar = gVar.f200882b;
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.CONSENT;
                    aVar3.getClass();
                    i2.a.b(a2Var, "LivetrackConsentEnforcementActivity", "showConsentFragment()");
                    hl.a aVar4 = (hl.a) tVar.getValue();
                    if (s.g(aVar4, hl.a.c.f84256b)) {
                        o.x(o.f136619a, aVar2, aVar2, new e(aVar2, i15), gVar2, gVar3, xVar, vVar, null, null, s3.b(), false, 2880);
                    } else {
                        if (!(aVar4 instanceof hl.a.b)) {
                            u0.r();
                            return parcelable;
                        }
                        o oVar = o.f136619a;
                        Intent intent = aVar2.getIntent();
                        if (Build.VERSION.SDK_INT < 33) {
                            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_consent_text") : null;
                            if (parcelableExtra instanceof s92.g) {
                                parcelable = parcelableExtra;
                            }
                            parcelable = (s92.g) parcelable;
                        } else if (intent != null) {
                            parcelable = (Parcelable) intent.getParcelableExtra("extra_consent_text", s92.g.class);
                        }
                        hl.a aVar5 = (hl.a) tVar.getValue();
                        aVar5.getClass();
                        o.z(oVar, aVar2, aVar2, new e(aVar2, 2), gVar2, gVar3, xVar, new s92.l(String.valueOf(((hl.a.b) aVar5).f84252b)), vVar, (s92.g) parcelable, false, 1152);
                    }
                } else {
                    parcelable = null;
                    if (a1Var instanceof a1.a) {
                        aVar2.hideProgressOverlay();
                        aVar2.ea(((a1.a) a1Var).f200881a, false);
                    } else if (a1Var instanceof a1.d) {
                        aVar2.hideProgressOverlay();
                        q0.b bVar = q0.f149800b;
                        View viewFindViewById = aVar2.findViewById(R.id.content_frame);
                        viewFindViewById.getClass();
                        String string = aVar2.getString(R.string.msg_request_sent);
                        string.getClass();
                        q0.b.c(bVar, viewFindViewById, string, null, 4).show();
                    } else if (a1Var instanceof a1.c) {
                        aVar2.hideProgressOverlay();
                        aVar2.displayFailedMessage();
                    } else if (a1Var instanceof a1.e) {
                        aVar2.hideProgressOverlay();
                        d1.m(d1.f200951a, aVar2);
                    } else {
                        if (!(a1Var instanceof a1.f)) {
                            u0.r();
                            return parcelable;
                        }
                        aVar2.hideProgressOverlay();
                        d1 d1Var = d1.f200951a;
                        n nVar = new n(28, aVar2, a1Var);
                        d1Var.getClass();
                        d1.v(nVar, aVar2);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                Fragment fragment = (Fragment) obj;
                int i17 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                fragment.getClass();
                Fragment fragmentF = aVar.getSupportFragmentManager().F(R.id.livetrack_content_frame);
                if (fragmentF != null && (view2 = fragmentF.getView()) != null) {
                    view2.setImportantForAccessibility(4);
                }
                androidx.fragment.app.v supportFragmentManager = aVar.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                aVarB.j(R.id.livetrack_content_frame, fragment, "CONSENT_FRAGMENT", 1);
                List<Fragment> listF = aVar.getSupportFragmentManager().f7372c.f();
                listF.getClass();
                if (!listF.isEmpty()) {
                    aVarB.d(null);
                }
                aVarB.e();
                return Unit.INSTANCE;
            default:
                Fragment fragment2 = (Fragment) obj;
                int i18 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                fragment2.getClass();
                Fragment fragmentF2 = aVar.getSupportFragmentManager().F(R.id.livetrack_content_frame);
                if (fragmentF2 != null && (view3 = fragmentF2.getView()) != null) {
                    view3.setImportantForAccessibility(4);
                }
                androidx.fragment.app.v supportFragmentManager2 = aVar.getSupportFragmentManager();
                androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
                aVarB2.j(R.id.livetrack_content_frame, fragment2, "CONSENT_FRAGMENT", 1);
                List<Fragment> listF2 = aVar.getSupportFragmentManager().f7372c.f();
                listF2.getClass();
                if (!listF2.isEmpty()) {
                    aVarB2.d(null);
                }
                aVarB2.e();
                return Unit.INSTANCE;
        }
    }
}
