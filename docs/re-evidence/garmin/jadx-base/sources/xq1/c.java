package xq1;

import android.content.Context;
import b82.t0;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import l72.i3;
import m4.g0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import s5.q0;
import y40.p;
import z2.b0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f191930b;

    public /* synthetic */ c(p1 p1Var, int i14) {
        this.f191929a = i14;
        this.f191930b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f191929a;
        p1 p1Var = this.f191930b;
        switch (i14) {
            case 0:
                ((Context) obj).getClass();
                return (CustomBarChart) p1Var.getF182175a();
            case 1:
                ((Context) obj).getClass();
                return (CustomBarChart) p1Var.getF182175a();
            case 2:
                ((jf.d.c.C1894d) obj).getClass();
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                Float f14 = (Float) obj;
                f14.getClass();
                return Float.valueOf(((Number) ((e23.l) p1Var.getF182175a()).invoke(f14)).floatValue());
            case 4:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "ReorderDelete")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 5:
                jf.d.c.C1894d c1894d = (jf.d.c.C1894d) obj;
                c1894d.getClass();
                p1Var.setValue(n4.g.a(c1894d.f98640a.getF162260d()));
                return Unit.INSTANCE;
            case 6:
                p pVar = (p) obj;
                pVar.getClass();
                p1Var.setValue(pVar);
                return Unit.INSTANCE;
            case 7:
                String str = (String) obj;
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 9:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                p1Var.setValue(Boolean.valueOf(q0Var.e()));
                return Unit.INSTANCE;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                p1Var.setValue(str4);
                return Unit.INSTANCE;
            case 12:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 14:
                ((Boolean) obj).getClass();
                PrivacyPolicyConsentActivity.a aVar = PrivacyPolicyConsentActivity.f32218d;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 15:
                p1Var.setValue((b0) obj);
                return Unit.INSTANCE;
            case 16:
                n02.f fVar = (n02.f) obj;
                fVar.getClass();
                p1Var.setValue(fVar);
                return Unit.INSTANCE;
            case 17:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 18:
                t0.a aVar2 = (t0.a) obj;
                aVar2.getClass();
                p1Var.setValue(Boolean.valueOf(aVar2 == t0.a.ON_FOCUS));
                return Unit.INSTANCE;
            case 19:
                String str5 = (String) obj;
                str5.getClass();
                p1Var.setValue(str5);
                return Unit.INSTANCE;
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                p1Var.setValue(str6);
                return Unit.INSTANCE;
            case 21:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                p1Var.setValue(bool3);
                return Unit.INSTANCE;
            case 22:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                p1Var.setValue(bool4);
                return Unit.INSTANCE;
            default:
                p1Var.setValue((Integer) obj);
                return Unit.INSTANCE;
        }
    }
}
