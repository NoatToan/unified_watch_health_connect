package z10;

import android.view.View;
import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f201180b;

    public /* synthetic */ n3(p3 p3Var, int i14) {
        this.f201179a = i14;
        this.f201180b = p3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 1;
        switch (this.f201179a) {
            case 0:
                m0 m0Var = (m0) obj;
                int i15 = p3.f201204b;
                if (m0Var != null) {
                    int i16 = p3.b.f201206a[m0Var.ordinal()];
                    p3 p3Var = this.f201180b;
                    switch (i16) {
                        case 1:
                            p3Var.showProgressOverlay();
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CONSENT;
                            aVar.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "UploadConsentEnforcementActivity", "showConsentFragment()");
                            p3Var.setTitle(p3Var.getString(R.string.golf_lbl_storage_processing_consent_title));
                            p92.o.x(p92.o.f136619a, p3Var, p3Var, new n3(p3Var, i14), new hc0.f(6, p3Var, p3Var.fa()), new hc0.f(5, p3Var, p3Var.fa()), q92.x.DI_CONNECT_UPLOAD, null, null, p3Var.ia() ? v92.e0.NO_ACTION : v92.e0.ASK_FOR_DEVICE_UPLOAD, s3.b(), false, 2496);
                            break;
                        case 3:
                            p3Var.hideProgressOverlay();
                            p3Var.ha();
                            break;
                        case 4:
                            p3Var.hideProgressOverlay();
                            if (!p3Var.ja()) {
                                p3Var.getSupportFragmentManager().Z();
                                p3Var.setTitle(p3Var.da());
                            } else {
                                p3Var.finish();
                            }
                            break;
                        case 5:
                            p3Var.hideProgressOverlay();
                            p3Var.displayFailedMessage();
                            break;
                        case 6:
                            p3Var.hideProgressOverlay();
                            d1.s(p3Var);
                            break;
                        case 7:
                            p3Var.ha();
                            break;
                        case 8:
                            p3Var.hideProgressOverlay();
                            d1.q(p3Var, new o3(p3Var, i14), new o3(p3Var, 2));
                            break;
                        case 9:
                            p3Var.hideProgressOverlay();
                            p3Var.ha();
                            break;
                        case 10:
                            p3Var.hideProgressOverlay();
                            if (!p3Var.ja()) {
                                p3Var.ha();
                            } else {
                                p3Var.finish();
                            }
                            break;
                        case 11:
                            p3Var.hideProgressOverlay();
                            if (!p3Var.ja()) {
                                p3Var.ha();
                            } else {
                                p3Var.finish();
                            }
                            break;
                        case 12:
                            p3Var.hideProgressOverlay();
                            if (p3Var.ja()) {
                                p3Var.ha();
                            }
                            break;
                        case 13:
                            p3Var.hideProgressOverlay();
                            p3Var.displayFailedMessage();
                            if (p3Var.ja()) {
                                p3Var.finish();
                            }
                            break;
                        case 14:
                            p3Var.hideProgressOverlay();
                            p3Var.displayFailedMessage();
                            break;
                        case 15:
                            p3Var.hideProgressOverlay();
                            d1 d1Var = d1.f200951a;
                            yr.o0 o0Var = new yr.o0(p3Var, 9);
                            d1Var.getClass();
                            d1.v(o0Var, p3Var);
                            break;
                        case 16:
                            p3Var.hideProgressOverlay();
                            d1.m(d1.f200951a, p3Var);
                            break;
                        case 17:
                            p3Var.hideProgressOverlay();
                            r22.q0.b bVar = r22.q0.f149800b;
                            View viewFindViewById = p3Var.findViewById(R.id.content_frame);
                            viewFindViewById.getClass();
                            String string = p3Var.getString(R.string.msg_request_sent);
                            string.getClass();
                            r22.q0.b.c(bVar, viewFindViewById, string, null, 4).show();
                            break;
                        default:
                            lc.u0.r();
                            return null;
                    }
                }
                return Unit.INSTANCE;
            default:
                Fragment fragment = (Fragment) obj;
                int i17 = p3.f201204b;
                fragment.getClass();
                p3 p3Var2 = this.f201180b;
                androidx.fragment.app.v supportFragmentManager = p3Var2.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.j(R.id.content_frame, fragment, "CONSENT_FRAGMENT", 1);
                List<Fragment> listF = p3Var2.getSupportFragmentManager().f7372c.f();
                listF.getClass();
                if (!listF.isEmpty()) {
                    aVar2.d(null);
                }
                aVar2.e();
                return Unit.INSTANCE;
        }
    }
}
