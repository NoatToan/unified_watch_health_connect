package pw0;

import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import b31.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lteconnect.VerizonLteWebViewActivity;
import f03.g;
import f03.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/d;", "Lf03/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerizonLteWebViewActivity f141705a;

    public d(VerizonLteWebViewActivity verizonLteWebViewActivity) {
        this.f141705a = verizonLteWebViewActivity;
    }

    @Override // f03.a
    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* StartActivationProcess: onSuccess without MDN");
        f fVar = (f) KoinJavaComponent.get$default(f.class, null, null, 6, null);
        VerizonLteWebViewActivity verizonLteWebViewActivity = this.f141705a;
        fVar.a(verizonLteWebViewActivity.f38711c, e31.a.ENTERED_LTE_SETUP);
        verizonLteWebViewActivity.ea();
        Toast.makeText(verizonLteWebViewActivity, R.string.lte_web_view_on_success, 0).show();
        verizonLteWebViewActivity.f38712d = true;
        verizonLteWebViewActivity.finish();
    }

    @Override // f03.a
    public final void b(f03.e eVar) {
        eVar.getClass();
        String strN = fb1.c.n("*LTE* StartActivationProcess: onError: ", eVar.f67766b);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", strN);
        VerizonLteWebViewActivity verizonLteWebViewActivity = this.f141705a;
        verizonLteWebViewActivity.f38712d = false;
        Toast.makeText(verizonLteWebViewActivity, R.string.lte_web_view_on_error, 0).show();
        verizonLteWebViewActivity.finish();
    }

    @Override // f03.a
    public final void c(h hVar) {
        hVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* StartActivationProcess: onSessionStateChanged: " + hVar);
        h hVar2 = h.CREATED;
        if (hVar2 == hVar) {
            int i14 = VerizonLteWebViewActivity.f38708h;
            VerizonLteWebViewActivity verizonLteWebViewActivity = this.f141705a;
            if (!verizonLteWebViewActivity.hasInternetConnection()) {
                i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* StartActivationProcess: onSessionStateChanged: Internet Connection false");
                Toast.makeText(verizonLteWebViewActivity, R.string.txt_no_internet_connection, 0).show();
                verizonLteWebViewActivity.f38712d = false;
                verizonLteWebViewActivity.finish();
                return;
            }
            i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* StartActivationProcess: onSessionStateChanged: Internet Connection true");
            f03.f fVar = verizonLteWebViewActivity.f38710b;
            fVar.getClass();
            g gVar = verizonLteWebViewActivity.f38713e;
            if (gVar == null) {
                s.m("mParameters");
                throw null;
            }
            h hVar3 = fVar.f67767a.f67760d;
            if (!hVar2.equals(hVar3)) {
                if (h.STARTED.equals(hVar3)) {
                    return;
                }
                throw new IllegalStateException("Session state should be in " + String.valueOf(hVar2) + " state, but was in " + String.valueOf(hVar3));
            }
            f03.d dVar = fVar.f67767a;
            dVar.getClass();
            if (!hVar2.equals(dVar.f67760d)) {
                vb.h.z("Session should be created before.");
                return;
            }
            String str = gVar.f67769b;
            if (TextUtils.isEmpty(str)) {
                vb.h.s("Device IMEI has not been set.");
                return;
            }
            String str2 = gVar.f67768a;
            String str3 = gVar.f67772e;
            String str4 = gVar.f67773f;
            String str5 = gVar.f67770c;
            String str6 = gVar.f67771d;
            StringBuilder sbI = p6.b.i("view=connectedDevice&techType=DEVICE4GSELF&requestType=POST&encrypt=false&_skipUserAgent=on&imei=", str, "&iccid=", str2, "&firstname=");
            sn.a.t(sbI, str3, "&lastname=", str4, "&phonenumber=");
            sbI.append(str5);
            sbI.append("&email=");
            sbI.append(str6);
            sbI.append("&skipUserAgent=true");
            byte[] bytes = sbI.toString().getBytes();
            WebView webView = dVar.f67757a;
            String str7 = gVar.f67774g;
            String str8 = "https://quickaccess.verizonwireless.com/ngbbp/tablet/nsoStart.do";
            if (str7 != null && !str7.isEmpty()) {
                switch (str7) {
                    case "QA1":
                        dVar.f67762f = "https://vzwqa1.verizonwireless.com/ngbbp/tablet/nsoStart.do";
                        break;
                    case "QA2":
                        dVar.f67762f = "https://vzwqa2.verizonwireless.com/ngbbp/tablet/nsoStart.do";
                        break;
                    case "QA3":
                        dVar.f67762f = "https://vzwqa3.verizonwireless.com/ngbbp/tablet/nsoStart.do";
                        break;
                    case "PROD":
                        dVar.f67762f = "https://quickaccess.verizonwireless.com/ngbbp/tablet/nsoStart.do";
                        break;
                    default:
                        dVar.f67762f = "https://quickaccess.verizonwireless.com/ngbbp/tablet/nsoStart.do";
                        break;
                }
                str8 = dVar.f67762f;
            }
            webView.postUrl(str8, bytes);
        }
    }

    @Override // f03.a
    public final void onSuccess() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* StartActivationProcess: onSuccess with MDN");
        f fVar = (f) KoinJavaComponent.get$default(f.class, null, null, 6, null);
        VerizonLteWebViewActivity verizonLteWebViewActivity = this.f141705a;
        fVar.a(verizonLteWebViewActivity.f38711c, e31.a.ENTERED_LTE_SETUP);
        verizonLteWebViewActivity.ea();
        Toast.makeText(verizonLteWebViewActivity, R.string.lte_web_view_on_success, 0).show();
        verizonLteWebViewActivity.f38712d = true;
        verizonLteWebViewActivity.finish();
    }
}
