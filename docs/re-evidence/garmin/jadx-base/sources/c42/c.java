package c42;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;
import c80.d1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.f9;
import i3.h8;
import java.util.UUID;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.p1;
import zd0.u1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24355a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24360f;

    public /* synthetic */ c(long j8, String str, String str2, String str3, d90.h hVar) {
        this.f24356b = j8;
        this.f24357c = str;
        this.f24358d = str2;
        this.f24359e = str3;
        this.f24360f = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
    @Override // e23.a
    public final Object invoke() {
        boolean zIsLocationEnabled;
        int i14 = this.f24355a;
        long j8 = this.f24356b;
        Object obj = this.f24357c;
        Object obj2 = this.f24360f;
        Object obj3 = this.f24359e;
        Object obj4 = this.f24358d;
        switch (i14) {
            case 0:
                Context context = (Context) obj;
                gl1.b bVar = (gl1.b) obj4;
                p1 p1Var = (p1) obj3;
                p1 p1Var2 = (p1) obj2;
                Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
                if (locationManager == null) {
                    zIsLocationEnabled = false;
                } else {
                    int i15 = f7.b.f69398a;
                    zIsLocationEnabled = locationManager.isLocationEnabled();
                }
                if (zIsLocationEnabled) {
                    j22.b.f96736a.getClass();
                    if (j22.b.j(context) == j22.f.ALLOWED_ALL_TIME) {
                        bVar.invoke(Long.valueOf(j8));
                    } else {
                        p1Var2.setValue(Boolean.TRUE);
                    }
                } else {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 1:
                ((h8) obj).e((e23.a) obj4, (f9) obj3, this.f24356b, (g6.o) obj2);
                return Unit.INSTANCE;
            case 2:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), (String) obj, (String) obj4, (String) obj3, (d90.h) obj2);
            default:
                r0 r0Var = (r0) obj4;
                c.q qVar = (c.q) obj3;
                u1 u1Var = (u1) obj2;
                Context context2 = (Context) obj;
                try {
                    r0Var.f105810a = UUID.randomUUID().toString();
                    ht.a aVar = ht.a.f85464a;
                    Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachDeviceSetup"), new o13.p("Type", "CWS"), new o13.p("Action", "GetStarted"));
                    aVar.getClass();
                    ht.a.a(bundleA, "UserAction");
                    context2.getClass();
                    String strValueOf = String.valueOf(j8);
                    String str = (String) r0Var.f105810a;
                    d1 d1Var = d1.CWC;
                    String string = context2.getString(R.string.lbl_close);
                    string.getClass();
                    String string2 = context2.getString(R.string.inreach_uac_title);
                    int color = context2.getColor(R.color.icon_1);
                    String string3 = context2.getString(R.string.inreach_set_up_dialog_title);
                    string3.getClass();
                    String string4 = context2.getString(R.string.inreach_set_up_dialog_descr);
                    string4.getClass();
                    String string5 = context2.getString(R.string.lbl_cancel);
                    string5.getClass();
                    String string6 = context2.getString(R.string.lbl_exit);
                    string6.getClass();
                    qVar.a(u1.c(u1Var, (Activity) context2, strValueOf, str, d1Var, new cy2.f(R.drawable.close_x_thick, string, Integer.valueOf(color), string2, new cy2.b(string3, string4, string5, string6))), null);
                    break;
                } catch (IllegalStateException e4) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.DEVICE_SETUP;
                    aVar2.getClass();
                    i2.a.f(a2Var, "InReachSubscriptionScreen", "IllegalStateException while launching purchase flow: " + e4);
                } catch (Exception e14) {
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "Error while launching purchase flow: ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.DEVICE_SETUP;
                    aVar3.getClass();
                    i2.a.f(a2Var2, "InReachSubscriptionScreen", strD);
                    Toast.makeText(context2, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(Context context, gl1.b bVar, long j8, p1 p1Var, p1 p1Var2) {
        this.f24357c = context;
        this.f24358d = bVar;
        this.f24356b = j8;
        this.f24359e = p1Var;
        this.f24360f = p1Var2;
    }

    public /* synthetic */ c(h8 h8Var, e23.a aVar, f9 f9Var, long j8, g6.o oVar) {
        this.f24357c = h8Var;
        this.f24358d = aVar;
        this.f24359e = f9Var;
        this.f24356b = j8;
        this.f24360f = oVar;
    }

    public /* synthetic */ c(r0 r0Var, c.q qVar, u1 u1Var, Context context, long j8) {
        this.f24358d = r0Var;
        this.f24359e = qVar;
        this.f24360f = u1Var;
        this.f24357c = context;
        this.f24356b = j8;
    }
}
