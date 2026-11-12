package lm0;

import android.app.Activity;
import android.os.Bundle;
import c80.d1;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import java.util.UUID;
import kotlin.m3;
import nr.w0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import qr.t;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113526a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f113527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f113528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f113529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f113530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f113531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f113532g;

    public /* synthetic */ d(m4.q qVar, m3 m3Var, boolean z14, e23.l lVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar, e23.l lVar2) {
        this.f113528c = qVar;
        this.f113529d = m3Var;
        this.f113527b = z14;
        this.f113530e = lVar;
        this.f113532g = eVar;
        this.f113531f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f113526a;
        Object obj = this.f113529d;
        boolean z14 = this.f113527b;
        Object obj2 = this.f113532g;
        Object obj3 = this.f113531f;
        Object obj4 = this.f113530e;
        Object obj5 = this.f113528c;
        switch (i14) {
            case 0:
                m3 m3Var = (m3) obj;
                e23.l lVar = (e23.l) obj4;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) obj2;
                e23.l lVar2 = (e23.l) obj3;
                ((m4.q) obj5).y(false);
                if (m3Var != null) {
                    m3Var.hide();
                }
                if (z14) {
                    lVar.invoke(eVar);
                } else {
                    lVar2.invoke(eVar);
                }
                break;
            case 1:
                t tVar = (t) obj5;
                nr.a aVar = (nr.a) obj4;
                yo1.f fVar = (yo1.f) obj3;
                String str = (String) obj2;
                int i15 = t.A2;
                tVar.E4(new w0.n(this.f113529d, aVar != null ? aVar.f126976c : null, fVar, str, this.f113527b));
                break;
            default:
                ti1.a aVar2 = (ti1.a) obj5;
                Activity activity = (Activity) obj;
                r0 r0Var = (r0) obj4;
                c.q qVar = (c.q) obj3;
                u1 u1Var = (u1) obj2;
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachSubscriptionSetup"), new o13.p("Type", "CWS"), new o13.p("Action", "GetStarted"), new o13.p("IsFreeTrial", Boolean.valueOf(aVar2.f164579e)));
                aVar3.getClass();
                ht.a.a(bundleA, "UserAction");
                ht.a.a(h7.c.a(new o13.p("Screen", z14 ? "InReachOnboarding" : "InReachDeviceSettings"), new o13.p("Type", "CWS"), new o13.p("Action", "GetStarted"), new o13.p("IsFreeTrial", Boolean.valueOf(aVar2.f164579e))), "UserAction");
                if (activity != null) {
                    r0Var.f105810a = UUID.randomUUID().toString();
                    String strValueOf = String.valueOf(aVar2.f164577c);
                    String str2 = (String) r0Var.f105810a;
                    d1 d1Var = d1.CWC;
                    String string = activity.getString(R.string.lbl_close);
                    string.getClass();
                    String string2 = activity.getString(R.string.inreach_plan_setup_title);
                    int color = activity.getColor(R.color.icon_1);
                    String string3 = activity.getString(R.string.inreach_set_up_dialog_title);
                    string3.getClass();
                    String string4 = activity.getString(R.string.inreach_set_up_dialog_descr);
                    string4.getClass();
                    String string5 = activity.getString(R.string.lbl_cancel);
                    string5.getClass();
                    String string6 = activity.getString(R.string.lbl_exit);
                    string6.getClass();
                    qVar.a(u1.c(u1Var, activity, strValueOf, str2, d1Var, new cy2.f(R.drawable.close_x_thick, string, Integer.valueOf(color), string2, new cy2.b(string3, string4, string5, string6))), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(t tVar, List list, nr.a aVar, yo1.f fVar, String str, boolean z14) {
        this.f113528c = tVar;
        this.f113529d = list;
        this.f113530e = aVar;
        this.f113531f = fVar;
        this.f113532g = str;
        this.f113527b = z14;
    }

    public /* synthetic */ d(ti1.a aVar, boolean z14, Activity activity, r0 r0Var, c.q qVar, u1 u1Var) {
        this.f113528c = aVar;
        this.f113527b = z14;
        this.f113529d = activity;
        this.f113530e = r0Var;
        this.f113531f = qVar;
        this.f113532g = u1Var;
    }
}
