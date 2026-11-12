package n23;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.jcraft.jzlib.GZIPException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements androidx.core.view.z {
    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void B(String str, Object obj, Object obj2, Object obj3) {
        throw new w3(str + obj + obj2 + obj3);
    }

    public static int a(LocalDate localDate, int i14, int i15) {
        return (localDate.hashCode() + i14) * i15;
    }

    public static View b(ViewGroup viewGroup, int i14, ViewGroup viewGroup2, boolean z14) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i14, viewGroup2, z14);
        viewInflate.getClass();
        return viewInflate;
    }

    public static androidx.fragment.app.a c(androidx.fragment.app.v vVar, androidx.fragment.app.v vVar2, int i14, Fragment fragment, String str) {
        vVar.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar2);
        aVar.l(i14, fragment, str);
        return aVar;
    }

    public static String d(long j8, String str, String str2, String str3) {
        return str + str2 + str3 + j8;
    }

    public static String e(String str, com.garmin.android.apps.connectmobile.courses.model.g gVar, String str2) {
        return str + gVar + str2;
    }

    public static String f(String str, Integer num, String str2, String str3, String str4) {
        return str + num + str2 + str3 + str4;
    }

    public static String g(String str, String str2, String str3, boolean z14, String str4) {
        return str + str2 + str3 + z14 + str4;
    }

    public static String h(String str, Type type) {
        return str + type;
    }

    public static String i(StringBuilder sb3, e23.a aVar, String str) {
        sb3.append(aVar);
        sb3.append(str);
        return sb3.toString();
    }

    public static String j(StringBuilder sb3, List list, String str, List list2, String str2) {
        sb3.append(list);
        sb3.append(str);
        sb3.append(list2);
        sb3.append(str2);
        return sb3.toString();
    }

    public static ArrayList k(w13.c cVar) {
        ArrayList arrayList = new ArrayList();
        cVar.getClass();
        return arrayList;
    }

    public static k23.n l(Class cls, String str, String str2, int i14, p005kotlin.jvm.internal.t0 t0Var) {
        return t0Var.h(new p005kotlin.jvm.internal.i0(cls, str, str2, i14));
    }

    public static NoWhenBranchMatchedException m(p3.m mVar, int i14) {
        mVar.C(i14);
        mVar.f();
        return new NoWhenBranchMatchedException();
    }

    public static p3.p1 n(lc.v vVar, String str, Object obj, p3.m mVar) {
        return s9.c.c(vVar.a().d(obj, str), mVar);
    }

    public static p3.z1 o(float f14, p3.o0 o0Var) {
        p3.z1 z1Var = new p3.z1(f14);
        o0Var.K(z1Var);
        return z1Var;
    }

    public static /* synthetic */ void p(int i14, Object obj) throws GZIPException {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i14);
        sb3.append((Object) ": ");
        sb3.append(obj);
        throw new GZIPException(sb3.toString());
    }

    public static void q(Long l14, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(l14);
        sb3.append(str3);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new w3(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new w3(str + obj + obj2 + obj3 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Throwable th3) {
        throw new IllegalArgumentException(str + obj + obj2, th3);
    }

    public static /* synthetic */ void w(String str, Throwable th3) {
        throw new IllegalArgumentException(str, th3);
    }

    public static void x(String str, List list, List list2, List list3, List list4) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
    }

    public static void y(StringBuilder sb3, Intent intent, com.garmin.android.apps.connectmobile.a2 a2Var, String str) {
        sb3.append(intent);
        com.garmin.android.apps.connectmobile.i2.k(a2Var, str, sb3.toString());
    }

    public static void z(StringBuilder sb3, List list, String str, List list2, String str2) {
        sb3.append(list);
        sb3.append(str);
        sb3.append(list2);
        sb3.append(str2);
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        com.garmin.android.apps.connectmobile.activities.manual.eventType.a.C0449a c0449a = com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
        return androidx.core.view.m1.f6507b;
    }
}
