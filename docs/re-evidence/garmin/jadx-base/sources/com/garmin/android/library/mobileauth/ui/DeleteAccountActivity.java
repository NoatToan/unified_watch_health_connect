package com.garmin.android.library.mobileauth.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import d53.w;
import d53.y;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.t;
import o53.a0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sc2.h;
import u53.o;
import v.b0;
import v13.i;
import xa1.j;
import xe2.c0;
import xe2.d0;
import xe2.e0;
import xe2.g0;
import xe2.h0;
import xe2.i0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/DeleteAccountActivity;", "Lcom/garmin/android/library/mobileauth/ui/a;", "Lcom/garmin/android/library/mobileauth/ui/b;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DeleteAccountActivity extends com.garmin.android.library.mobileauth.ui.a implements b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f50391q = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f50392m = m.b(new j(25));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f50393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f50394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AlertDialog f50395p;

    static {
        new a(null);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void B0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void D3() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void F1() {
        W9(0);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object K6(i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(o.f168762a, new g0(this, null), iVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object L7(v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new c0(null), cVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void N8() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void R4() {
    }

    public final void W9(int i14) {
        setResult(i14);
        finish();
    }

    public final Logger X9() {
        return (Logger) this.f50392m.getValue();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void Y3(WebView webView, String str, String str2) {
        String str3;
        str2.getClass();
        if (!w.z(str, "clientId=ACCOUNT_MANAGEMENT_CENTER", true)) {
            if (w.z(str, "deletethankyou", true)) {
                webView.stopLoading();
                ge1.b.T(o53.c0.a(s0.f129406a.plus(new a0("DeleteAccountActivity"))), null, null, new d0(this, null), 3);
                ge1.b.T(f0.w(this), null, null, new e0(webView, null), 3);
                return;
            }
            return;
        }
        if (w.z(str, "sign-in", true)) {
            String str4 = this.f50394o;
            if (str4 == null) {
                s.m("customerEmailTrimmed");
                throw null;
            }
            if (str4.length() > 0) {
                String str5 = this.f50394o;
                if (str5 == null) {
                    s.m("customerEmailTrimmed");
                    throw null;
                }
                String strM = fb1.c.m(1, 0, str5);
                String str6 = this.f50394o;
                if (str6 == null) {
                    s.m("customerEmailTrimmed");
                    throw null;
                }
                str3 = "\n                    var mobileInput1 = document.getElementById('email');\n                    mobileInput1.focus();\n                    mobileInput1.value='" + strM + "';\n                    mobileInput1.value = mobileInput1.value + '" + y.r0(str6) + "';\n                    mobileInput1.dispatchEvent(new Event('input'));\n                    \n                    var mobileInput2 = document.getElementById('password');\n                    mobileInput2.scrollIntoView();\n                    mobileInput2.focus();\n                ";
            } else {
                str3 = "";
            }
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(System.currentTimeMillis(), "\n            javascript:(function mobCoreAndroid_", "() {\n                ", str3);
            sbK.append("\n                document.querySelector(\"#portal > div.portal__container > div > div.portal__wrapper > div > div > form > section.validation-form-fields > div > fieldset.signin__form__input--remember\").style.display='none';\n                document.querySelector(\"#portal > div.portal__container > div > div.portal__wrapper > div > div > div.portal-footer > p\").style.display='none';\n            })()\n        ");
            String string = sbK.toString();
            webView.loadUrl(string);
            if (R9().f177764e) {
                X9().debug("injected script ->\n".concat(string));
            }
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void b4() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Set<Integer> c1() {
        return this.f50421j;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final boolean d7() {
        return R9().f177764e;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void j3(bf2.b bVar) {
        bVar.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void k3(e.a.EnumC1005a enumC1005a, String str) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n6(int i14) {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n7(WebView webView, String str, String str2) {
        str2.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o0(e.a.EnumC1005a enumC1005a) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o1(boolean z14) {
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        W9(0);
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("environment") || !intent.hasExtra("customer.email") || !intent.hasExtra("customer.guid")) {
            X9().error("onCreate: app must call 'AuthenticationHelper.getDeleteAccountFlowIntent()'");
            W9(0);
            return;
        }
        String stringExtra = intent.getStringExtra("environment");
        stringExtra.getClass();
        ve2.e.valueOf(stringExtra);
        String stringExtra2 = intent.getStringExtra("customer.guid");
        stringExtra2.getClass();
        this.f50393n = stringExtra2;
        String stringExtra3 = intent.getStringExtra("customer.email");
        stringExtra3.getClass();
        this.f50394o = w.i0(stringExtra3).toString();
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.f50395p;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f50395p = null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!re2.g0.a(this)) {
            Q9().post(new b0(this, 23));
        } else {
            U9(new h0(), "DeleteAcctFrag", i0.DELETE_ACCOUNT_WEB);
            T9();
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p9(WebView webView, String str, String str2) {
        str2.getClass();
        if (w.z(str, "ticket=", true)) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            Fragment fragmentG = supportFragmentManager.G("DeleteAcctFrag");
            fragmentG.getClass();
            MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag = (MobileAuthAbstractWebFrag) fragmentG;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.v(mobileAuthAbstractWebFrag);
            aVar.e();
            V9();
            Map<String, String> cookieEntries = mobileAuthAbstractWebFrag.getCookieEntries("DeleteAccountActivity.doCustomerGUIDsMatch", str, R9().f177764e);
            if (cookieEntries == null) {
                X9().error("doCustomerGUIDsMatch: not expecting 'null' cookies");
            } else if (cookieEntries.containsKey("GARMIN-SSO-CUST-GUID")) {
                String str3 = cookieEntries.get("GARMIN-SSO-CUST-GUID");
                String str4 = this.f50393n;
                if (str4 == null) {
                    s.m("customerGUID");
                    throw null;
                }
                if (s.g(str3, str4)) {
                    ge1.b.T(f0.w(this), null, null, new xe2.f0(supportFragmentManager, mobileAuthAbstractWebFrag, this, null), 3);
                    return;
                }
                Logger loggerX9 = X9();
                String str5 = this.f50393n;
                if (str5 == null) {
                    s.m("customerGUID");
                    throw null;
                }
                loggerX9.warn(v.e0.g("doCustomerGUIDsMatch: FALSE -> app[", str5, "], amc[", str3, "]"));
            } else {
                X9().error("doCustomerGUIDsMatch: cookie entry 'GARMIN-SSO-CUST-GUID' not found");
            }
            W9(1);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: r9 */
    public final ve2.s getF50349r() {
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void s1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t2() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t5() {
        W9(0);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: u7 */
    public final int getF50494n() {
        return 0;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w2() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w6(h hVar) {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y1() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/DeleteAccountActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FRAG_TAG", "COOKIE_KEY_CUSTOMER_GUID", "ARG_ENVIRONMENT", "ARG_CUSTOMER_EMAIL", "ARG_CUSTOMER_GUID", "", "RESULT_GUID_MISMATCH", "I", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
