package tn;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.core.view.m1;
import androidx.core.view.z;
import c2.x2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.a0;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.y;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.common.base.Optional;
import java.util.HashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.u0;
import p13.x;
import p3.o0;
import tn2.e1;
import tn2.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements u03.b, u03.a, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165475a;

    public /* synthetic */ k(int i14) {
        this.f165475a = i14;
    }

    public static long a(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).c().b();
    }

    public static long b(d92.b bVar, o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).c().c();
    }

    public static a2.k c(p3.m mVar) {
        a2.k kVar = new a2.k();
        mVar.K(kVar);
        return kVar;
    }

    public static Bundle d(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static String e(int i14, int i15, String str, String str2) {
        return str + i14 + str2 + i15;
    }

    public static String f(String str, char c14) {
        return str + c14;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, List list) {
        return str + list + str2;
    }

    public static StringBuilder i(String str, Double d14, Double d15, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(d14);
        sb3.append(str2);
        sb3.append(d15);
        sb3.append(str3);
        return sb3;
    }

    public static u4.e j(float f14, float f15, float f16) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        return eVar;
    }

    public static u4.e k(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.i(f16, f17);
        eVar.o(f18);
        return eVar;
    }

    public static void l(float f14, String str, StringBuilder sb3) {
        sb3.append((Object) g6.f.d(f14));
        sb3.append(str);
    }

    public static void m(Parcel parcel, int i14, Boolean bool) {
        parcel.writeInt(i14);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void n(j92.b bVar, h4.r.a aVar, float f14, o0 o0Var) {
        bVar.getClass();
        c2.l.f(x2.h(aVar, f14), o0Var);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void p(q4.a.b bVar, long j8) {
        bVar.a().i();
        bVar.c(j8);
    }

    public static void q(u4.e eVar, float f14, float f15, float f16) {
        eVar.g(f14);
        eVar.i(f15, f16);
        eVar.c();
    }

    public static void r(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.o(f16);
        eVar.g(f17);
    }

    public static void s(u4.e eVar, float f14, float f15, float f16) {
        eVar.i(f14, f15);
        eVar.g(f16);
        eVar.c();
    }

    public static void t(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.i(f16, f17);
    }

    public static void u(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.i(f15, f16);
        eVar.g(f17);
    }

    @Override // u03.b
    public Object apply(Object obj, Object obj2) {
        switch (this.f165475a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                Logger logger = w.f165679d;
                bArr.getClass();
                bArr2.getClass();
                tn2.a aVar = new tn2.a();
                boolean z14 = true;
                byte[] bArr3 = (byte[]) u0.c(new e1.a(-97, 112), aVar.b((byte[]) u0.c(new e1.a(-91), aVar.b((byte[]) u0.c(new e1.a(111), aVar.b(bArr))))));
                byte[] bArr4 = (byte[]) u0.c(new e1.a(-97, 112), aVar.b((byte[]) u0.c(new e1.a(-91), aVar.b((byte[]) u0.c(new e1.a(111), aVar.b(bArr2))))));
                if (p13.u.D(bArr3) != 7 && p13.u.D(bArr4) != 7) {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 3:
                w.a aVar2 = (w.a) obj;
                w.a aVar3 = (w.a) obj2;
                Logger logger2 = w.f165679d;
                aVar2.getClass();
                aVar3.getClass();
                return x.k(aVar2, aVar3);
            default:
                Optional optional = (Optional) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                Logger logger3 = w.f165679d;
                optional.getClass();
                return new o13.p(optional.orNull(), bool);
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f165475a) {
            case 11:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
            case 12:
                y.a aVar2 = y.f46341v;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI2.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1.f6507b;
            case 13:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(519);
                eVarI3.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI3.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1.f6507b;
            default:
                a0.a aVar4 = a0.I1;
                view2.getClass();
                c7.e eVarI4 = m1Var.f6508a.i(519);
                eVarI4.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI4.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
        }
    }

    @Override // u03.a
    public void run() {
        switch (this.f165475a) {
            case 5:
                tn2.c cVar = tn2.c.f165530a;
                t0 t0Var = s0.f105811a;
                k23.d dVarB = t0Var.b(es2.a.class);
                cVar.getClass();
                HashMap<k23.d<?>, Object> map = tn2.c.f165531b;
                map.remove(dVarB);
                map.remove(t0Var.b(rd2.f.class));
                break;
            default:
                tn2.c cVar2 = tn2.c.f165530a;
                t0 t0Var2 = s0.f105811a;
                k23.d dVarB2 = t0Var2.b(rd2.f.class);
                rd2.f fVarA = rd2.f.a();
                fVarA.getClass();
                cVar2.getClass();
                tn2.c.a(dVarB2, fVarA);
                k23.d dVarB3 = t0Var2.b(es2.a.class);
                GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
                Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                bVar.getClass();
                tn2.c.a(dVarB3, GarminPayCoreDatabase.b.a(contextC).e());
                break;
        }
    }
}
