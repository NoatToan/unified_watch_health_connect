package tp2;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import fo2.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltp2/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f165959j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f165961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f165962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FitPayCardDetailsActivity.c f165963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yo2.b f165964e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<vp2.c> f165966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f165967h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<Boolean> f165960a = new y0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<qs2.f> f165965f = new y0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f165968i = Boolean.FALSE;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f165959j = gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayCardDetailsViewModel");
    }

    public static final ArrayList x4(final g gVar, final yo2.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(bVar.getIssuerContactPhone())) {
            gVar.f165968i = Boolean.TRUE;
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.issuer_call, bVar.getIssuerName());
            string.getClass();
            final int i14 = 0;
            arrayList.add(new vp2.b(string, R.drawable.phone, new e23.l() { // from class: tp2.f
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i15 = i14;
                    g gVar2 = gVar;
                    yo2.b bVar2 = bVar;
                    View view2 = (View) obj;
                    switch (i15) {
                        case 0:
                            Logger logger = g.f165959j;
                            view2.getClass();
                            String issuerContactPhone = bVar2.getIssuerContactPhone();
                            if (issuerContactPhone != null) {
                                FitPayCardDetailsActivity.c cVar = gVar2.f165963d;
                                if (cVar == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity.ea().debug("askUserForCallPermission");
                                if (a7.b.checkSelfPermission(fitPayCardDetailsActivity, "android.permission.CALL_PHONE") != 0) {
                                    z6.a.a(fitPayCardDetailsActivity, new String[]{"android.permission.CALL_PHONE"}, 100);
                                } else {
                                    fitPayCardDetailsActivity.ha(issuerContactPhone);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Logger logger2 = g.f165959j;
                            view2.getClass();
                            String issuerContactEmail = bVar2.getIssuerContactEmail();
                            if (issuerContactEmail != null) {
                                FitPayCardDetailsActivity.c cVar2 = gVar2.f165963d;
                                if (cVar2 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity2.getClass();
                                try {
                                    fitPayCardDetailsActivity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", issuerContactEmail, null)), null));
                                } catch (Exception e4) {
                                    fitPayCardDetailsActivity2.ea().error("handleEmailIssuerBank: ", (Throwable) e4);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            Logger logger3 = g.f165959j;
                            view2.getClass();
                            String issuerContactUrl = bVar2.getIssuerContactUrl();
                            if (issuerContactUrl != null) {
                                FitPayCardDetailsActivity.c cVar3 = gVar2.f165963d;
                                if (cVar3 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity3.ga(issuerContactUrl);
                            }
                            return Unit.INSTANCE;
                        case 3:
                            Logger logger4 = g.f165959j;
                            view2.getClass();
                            String issuerTermsAndConditionsUrl = bVar2.getIssuerTermsAndConditionsUrl();
                            if (issuerTermsAndConditionsUrl != null) {
                                FitPayCardDetailsActivity.c cVar4 = gVar2.f165963d;
                                if (cVar4 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity4 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity4.ga(issuerTermsAndConditionsUrl);
                            }
                            return Unit.INSTANCE;
                        default:
                            Logger logger5 = g.f165959j;
                            view2.getClass();
                            String issuerPrivacyPolicyUrl = bVar2.getIssuerPrivacyPolicyUrl();
                            if (issuerPrivacyPolicyUrl != null) {
                                FitPayCardDetailsActivity.c cVar5 = gVar2.f165963d;
                                if (cVar5 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity5 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity5.ga(issuerPrivacyPolicyUrl);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        if (!TextUtils.isEmpty(bVar.getIssuerContactEmail())) {
            gVar.f165968i = Boolean.TRUE;
            String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.issuer_email, bVar.getIssuerName());
            string2.getClass();
            final int i15 = 1;
            arrayList.add(new vp2.b(string2, 2131232681, new e23.l() { // from class: tp2.f
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    g gVar2 = gVar;
                    yo2.b bVar2 = bVar;
                    View view2 = (View) obj;
                    switch (i16) {
                        case 0:
                            Logger logger = g.f165959j;
                            view2.getClass();
                            String issuerContactPhone = bVar2.getIssuerContactPhone();
                            if (issuerContactPhone != null) {
                                FitPayCardDetailsActivity.c cVar = gVar2.f165963d;
                                if (cVar == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity.ea().debug("askUserForCallPermission");
                                if (a7.b.checkSelfPermission(fitPayCardDetailsActivity, "android.permission.CALL_PHONE") != 0) {
                                    z6.a.a(fitPayCardDetailsActivity, new String[]{"android.permission.CALL_PHONE"}, 100);
                                } else {
                                    fitPayCardDetailsActivity.ha(issuerContactPhone);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Logger logger2 = g.f165959j;
                            view2.getClass();
                            String issuerContactEmail = bVar2.getIssuerContactEmail();
                            if (issuerContactEmail != null) {
                                FitPayCardDetailsActivity.c cVar2 = gVar2.f165963d;
                                if (cVar2 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity2.getClass();
                                try {
                                    fitPayCardDetailsActivity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", issuerContactEmail, null)), null));
                                } catch (Exception e4) {
                                    fitPayCardDetailsActivity2.ea().error("handleEmailIssuerBank: ", (Throwable) e4);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            Logger logger3 = g.f165959j;
                            view2.getClass();
                            String issuerContactUrl = bVar2.getIssuerContactUrl();
                            if (issuerContactUrl != null) {
                                FitPayCardDetailsActivity.c cVar3 = gVar2.f165963d;
                                if (cVar3 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity3.ga(issuerContactUrl);
                            }
                            return Unit.INSTANCE;
                        case 3:
                            Logger logger4 = g.f165959j;
                            view2.getClass();
                            String issuerTermsAndConditionsUrl = bVar2.getIssuerTermsAndConditionsUrl();
                            if (issuerTermsAndConditionsUrl != null) {
                                FitPayCardDetailsActivity.c cVar4 = gVar2.f165963d;
                                if (cVar4 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity4 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity4.ga(issuerTermsAndConditionsUrl);
                            }
                            return Unit.INSTANCE;
                        default:
                            Logger logger5 = g.f165959j;
                            view2.getClass();
                            String issuerPrivacyPolicyUrl = bVar2.getIssuerPrivacyPolicyUrl();
                            if (issuerPrivacyPolicyUrl != null) {
                                FitPayCardDetailsActivity.c cVar5 = gVar2.f165963d;
                                if (cVar5 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity5 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity5.ga(issuerPrivacyPolicyUrl);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        if (!TextUtils.isEmpty(bVar.getIssuerContactUrl())) {
            gVar.f165968i = Boolean.TRUE;
            String string3 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.visit_issuer_website, bVar.getIssuerName());
            string3.getClass();
            final int i16 = 2;
            arrayList.add(new vp2.b(string3, 2131232683, new e23.l() { // from class: tp2.f
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i17 = i16;
                    g gVar2 = gVar;
                    yo2.b bVar2 = bVar;
                    View view2 = (View) obj;
                    switch (i17) {
                        case 0:
                            Logger logger = g.f165959j;
                            view2.getClass();
                            String issuerContactPhone = bVar2.getIssuerContactPhone();
                            if (issuerContactPhone != null) {
                                FitPayCardDetailsActivity.c cVar = gVar2.f165963d;
                                if (cVar == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity.ea().debug("askUserForCallPermission");
                                if (a7.b.checkSelfPermission(fitPayCardDetailsActivity, "android.permission.CALL_PHONE") != 0) {
                                    z6.a.a(fitPayCardDetailsActivity, new String[]{"android.permission.CALL_PHONE"}, 100);
                                } else {
                                    fitPayCardDetailsActivity.ha(issuerContactPhone);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Logger logger2 = g.f165959j;
                            view2.getClass();
                            String issuerContactEmail = bVar2.getIssuerContactEmail();
                            if (issuerContactEmail != null) {
                                FitPayCardDetailsActivity.c cVar2 = gVar2.f165963d;
                                if (cVar2 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity2.getClass();
                                try {
                                    fitPayCardDetailsActivity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", issuerContactEmail, null)), null));
                                } catch (Exception e4) {
                                    fitPayCardDetailsActivity2.ea().error("handleEmailIssuerBank: ", (Throwable) e4);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            Logger logger3 = g.f165959j;
                            view2.getClass();
                            String issuerContactUrl = bVar2.getIssuerContactUrl();
                            if (issuerContactUrl != null) {
                                FitPayCardDetailsActivity.c cVar3 = gVar2.f165963d;
                                if (cVar3 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity3.ga(issuerContactUrl);
                            }
                            return Unit.INSTANCE;
                        case 3:
                            Logger logger4 = g.f165959j;
                            view2.getClass();
                            String issuerTermsAndConditionsUrl = bVar2.getIssuerTermsAndConditionsUrl();
                            if (issuerTermsAndConditionsUrl != null) {
                                FitPayCardDetailsActivity.c cVar4 = gVar2.f165963d;
                                if (cVar4 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity4 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity4.ga(issuerTermsAndConditionsUrl);
                            }
                            return Unit.INSTANCE;
                        default:
                            Logger logger5 = g.f165959j;
                            view2.getClass();
                            String issuerPrivacyPolicyUrl = bVar2.getIssuerPrivacyPolicyUrl();
                            if (issuerPrivacyPolicyUrl != null) {
                                FitPayCardDetailsActivity.c cVar5 = gVar2.f165963d;
                                if (cVar5 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity5 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity5.ga(issuerPrivacyPolicyUrl);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        if (!TextUtils.isEmpty(bVar.getIssuerTermsAndConditionsUrl())) {
            String string4 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.issuer_terms_and_conditions, bVar.getIssuerName());
            string4.getClass();
            final int i17 = 3;
            arrayList.add(new vp2.b(string4, 2131232682, new e23.l() { // from class: tp2.f
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i18 = i17;
                    g gVar2 = gVar;
                    yo2.b bVar2 = bVar;
                    View view2 = (View) obj;
                    switch (i18) {
                        case 0:
                            Logger logger = g.f165959j;
                            view2.getClass();
                            String issuerContactPhone = bVar2.getIssuerContactPhone();
                            if (issuerContactPhone != null) {
                                FitPayCardDetailsActivity.c cVar = gVar2.f165963d;
                                if (cVar == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity.ea().debug("askUserForCallPermission");
                                if (a7.b.checkSelfPermission(fitPayCardDetailsActivity, "android.permission.CALL_PHONE") != 0) {
                                    z6.a.a(fitPayCardDetailsActivity, new String[]{"android.permission.CALL_PHONE"}, 100);
                                } else {
                                    fitPayCardDetailsActivity.ha(issuerContactPhone);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Logger logger2 = g.f165959j;
                            view2.getClass();
                            String issuerContactEmail = bVar2.getIssuerContactEmail();
                            if (issuerContactEmail != null) {
                                FitPayCardDetailsActivity.c cVar2 = gVar2.f165963d;
                                if (cVar2 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity2.getClass();
                                try {
                                    fitPayCardDetailsActivity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", issuerContactEmail, null)), null));
                                } catch (Exception e4) {
                                    fitPayCardDetailsActivity2.ea().error("handleEmailIssuerBank: ", (Throwable) e4);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            Logger logger3 = g.f165959j;
                            view2.getClass();
                            String issuerContactUrl = bVar2.getIssuerContactUrl();
                            if (issuerContactUrl != null) {
                                FitPayCardDetailsActivity.c cVar3 = gVar2.f165963d;
                                if (cVar3 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity3.ga(issuerContactUrl);
                            }
                            return Unit.INSTANCE;
                        case 3:
                            Logger logger4 = g.f165959j;
                            view2.getClass();
                            String issuerTermsAndConditionsUrl = bVar2.getIssuerTermsAndConditionsUrl();
                            if (issuerTermsAndConditionsUrl != null) {
                                FitPayCardDetailsActivity.c cVar4 = gVar2.f165963d;
                                if (cVar4 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity4 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity4.ga(issuerTermsAndConditionsUrl);
                            }
                            return Unit.INSTANCE;
                        default:
                            Logger logger5 = g.f165959j;
                            view2.getClass();
                            String issuerPrivacyPolicyUrl = bVar2.getIssuerPrivacyPolicyUrl();
                            if (issuerPrivacyPolicyUrl != null) {
                                FitPayCardDetailsActivity.c cVar5 = gVar2.f165963d;
                                if (cVar5 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity5 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity5.ga(issuerPrivacyPolicyUrl);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        if (!TextUtils.isEmpty(bVar.getIssuerPrivacyPolicyUrl())) {
            String string5 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.issuer_privacy_policy, bVar.getIssuerName());
            string5.getClass();
            final int i18 = 4;
            arrayList.add(new vp2.b(string5, R.drawable.lock, new e23.l() { // from class: tp2.f
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i19 = i18;
                    g gVar2 = gVar;
                    yo2.b bVar2 = bVar;
                    View view2 = (View) obj;
                    switch (i19) {
                        case 0:
                            Logger logger = g.f165959j;
                            view2.getClass();
                            String issuerContactPhone = bVar2.getIssuerContactPhone();
                            if (issuerContactPhone != null) {
                                FitPayCardDetailsActivity.c cVar = gVar2.f165963d;
                                if (cVar == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity.ea().debug("askUserForCallPermission");
                                if (a7.b.checkSelfPermission(fitPayCardDetailsActivity, "android.permission.CALL_PHONE") != 0) {
                                    z6.a.a(fitPayCardDetailsActivity, new String[]{"android.permission.CALL_PHONE"}, 100);
                                } else {
                                    fitPayCardDetailsActivity.ha(issuerContactPhone);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Logger logger2 = g.f165959j;
                            view2.getClass();
                            String issuerContactEmail = bVar2.getIssuerContactEmail();
                            if (issuerContactEmail != null) {
                                FitPayCardDetailsActivity.c cVar2 = gVar2.f165963d;
                                if (cVar2 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity2 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity2.getClass();
                                try {
                                    fitPayCardDetailsActivity2.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", issuerContactEmail, null)), null));
                                } catch (Exception e4) {
                                    fitPayCardDetailsActivity2.ea().error("handleEmailIssuerBank: ", (Throwable) e4);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            Logger logger3 = g.f165959j;
                            view2.getClass();
                            String issuerContactUrl = bVar2.getIssuerContactUrl();
                            if (issuerContactUrl != null) {
                                FitPayCardDetailsActivity.c cVar3 = gVar2.f165963d;
                                if (cVar3 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity3 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity3.ga(issuerContactUrl);
                            }
                            return Unit.INSTANCE;
                        case 3:
                            Logger logger4 = g.f165959j;
                            view2.getClass();
                            String issuerTermsAndConditionsUrl = bVar2.getIssuerTermsAndConditionsUrl();
                            if (issuerTermsAndConditionsUrl != null) {
                                FitPayCardDetailsActivity.c cVar4 = gVar2.f165963d;
                                if (cVar4 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity4 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity4.ga(issuerTermsAndConditionsUrl);
                            }
                            return Unit.INSTANCE;
                        default:
                            Logger logger5 = g.f165959j;
                            view2.getClass();
                            String issuerPrivacyPolicyUrl = bVar2.getIssuerPrivacyPolicyUrl();
                            if (issuerPrivacyPolicyUrl != null) {
                                FitPayCardDetailsActivity.c cVar5 = gVar2.f165963d;
                                if (cVar5 == null) {
                                    s.m("bankSupportListener");
                                    throw null;
                                }
                                FitPayCardDetailsActivity fitPayCardDetailsActivity5 = FitPayCardDetailsActivity.this;
                                FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                                fitPayCardDetailsActivity5.ga(issuerPrivacyPolicyUrl);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A4(v13.c cVar) {
        i iVar;
        Enum enumValueOf;
        g gVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f165981d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f165981d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE0 = iVar.f165979b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f165981d;
        boolean z14 = false;
        y0<qs2.f> y0Var = this.f165965f;
        Logger logger = f165959j;
        Enum enumValueOf2 = null;
        try {
            if (i15 == 0) {
                r.b(objE0);
                String cardState = y4().getCardState();
                if (cardState == null || cardState.length() == 0) {
                    enumValueOf = null;
                } else {
                    try {
                        enumValueOf = Enum.valueOf(qs2.f.class, cardState);
                    } catch (IllegalArgumentException unused) {
                        enumValueOf = null;
                    }
                }
                qs2.f fVar = (qs2.f) enumValueOf;
                if (fVar == null) {
                    logger.error("reactivateCard: card state is unknown, can not reactivate card");
                    return Boolean.FALSE;
                }
                if (fVar == qs2.f.ACTIVE) {
                    logger.warn("reactivateCard: creditcard is already active, notifying listeners");
                    y0Var.j(fVar);
                    return Boolean.TRUE;
                }
                g1 g1Var = z4().f205979a;
                p reactivateLink = y4().getReactivateLink();
                iVar.f165978a = this;
                iVar.f165981d = 1;
                objE0 = g1Var.e0(reactivateLink, iVar);
                if (objE0 == aVar) {
                    return aVar;
                }
                gVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = iVar.f165978a;
                r.b(objE0);
            }
            yo2.b bVar = (yo2.b) objE0;
            if (bVar == null) {
                throw new NewFitPayException("can not get credit card for reactivate card request", null, null, 6, null);
            }
            gVar.getClass();
            gVar.f165964e = bVar;
            String cardState2 = y4().getCardState();
            if (cardState2 != null && cardState2.length() != 0) {
                try {
                    enumValueOf2 = Enum.valueOf(qs2.f.class, cardState2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            qs2.f fVar2 = (qs2.f) enumValueOf2;
            if (fVar2 != null) {
                y0Var.j(fVar2);
                z14 = true;
            }
            return Boolean.valueOf(z14);
        } catch (Exception e4) {
            logger.error("reactivateCard: ", (Throwable) e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f165984c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f165984c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f165982a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f165984c;
        Logger logger = f165959j;
        try {
            if (i15 == 0) {
                r.b(obj);
                logger.debug("refreshCreditCardsSuspendable");
                g1 g1Var = z4().f205979a;
                jVar.f165984c = 1;
                if (g1.g0(g1Var, null, jVar, 7) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            logger.error("refreshCreditCardsSuspendable: error while refreshing cached cards ", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C4(v13.c cVar) {
        k kVar;
        boolean zBooleanValue;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f165987c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f165987c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objP = kVar.f165985a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f165987c;
        try {
            if (i15 == 0) {
                r.b(objP);
                g1 g1Var = z4().f205979a;
                String link = y4().getCreditCardLink().getLink();
                kVar.f165987c = 1;
                objP = g1Var.p(link, kVar);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objP);
            }
            zBooleanValue = ((Boolean) objP).booleanValue();
        } catch (Exception e4) {
            f165959j.error("removeCard: ", (Throwable) e4);
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D4(v13.c cVar) {
        l lVar;
        Enum enumValueOf;
        g gVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f165991d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f165991d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objN = lVar.f165989b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f165991d;
        boolean z14 = false;
        y0<qs2.f> y0Var = this.f165965f;
        Logger logger = f165959j;
        Enum enumValueOf2 = null;
        try {
            if (i15 == 0) {
                r.b(objN);
                String cardState = y4().getCardState();
                if (cardState == null || cardState.length() == 0) {
                    enumValueOf = null;
                } else {
                    try {
                        enumValueOf = Enum.valueOf(qs2.f.class, cardState);
                    } catch (IllegalArgumentException unused) {
                        enumValueOf = null;
                    }
                }
                qs2.f fVar = (qs2.f) enumValueOf;
                if (fVar == null) {
                    logger.error("suspendCard: card state is unknown, can not suspend card");
                    return Boolean.FALSE;
                }
                if (fVar == qs2.f.DEACTIVATED) {
                    logger.error("suspendCard: card state is DEACTIVATED, notifying UI listener");
                    y0Var.j(fVar);
                    return Boolean.TRUE;
                }
                g1 g1Var = z4().f205979a;
                p deactivateLink = y4().getDeactivateLink();
                lVar.f165988a = this;
                lVar.f165991d = 1;
                objN = g1Var.n(deactivateLink, lVar);
                if (objN == aVar) {
                    return aVar;
                }
                gVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = lVar.f165988a;
                r.b(objN);
            }
            yo2.b bVar = (yo2.b) objN;
            if (bVar == null) {
                throw new NewFitPayException("can not get credit card for suspend card request", null, null, 6, null);
            }
            gVar.getClass();
            gVar.f165964e = bVar;
            String cardState2 = y4().getCardState();
            if (cardState2 != null && cardState2.length() != 0) {
                try {
                    enumValueOf2 = Enum.valueOf(qs2.f.class, cardState2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            qs2.f fVar2 = (qs2.f) enumValueOf2;
            if (fVar2 != null) {
                y0Var.j(fVar2);
                z14 = true;
            }
            return Boolean.valueOf(z14);
        } catch (Exception e4) {
            logger.error("suspendCard: ", (Throwable) e4);
        }
    }

    public final yo2.b y4() {
        yo2.b bVar = this.f165964e;
        if (bVar != null) {
            return bVar;
        }
        s.m("creditCard");
        throw null;
    }

    public final z0 z4() {
        z0 z0Var = this.f165961b;
        if (z0Var != null) {
            return z0Var;
        }
        s.m("serviceProvider");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltp2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EMPTY_SPACE", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
