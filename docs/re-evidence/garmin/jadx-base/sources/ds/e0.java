package ds;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import c2.x2;
import com.alipay.android.phone.mrpc.core.HttpException;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraDebugActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity;
import com.garmin.subscriptions.ui.InAppPurchaseActivity;
import java.util.HashMap;
import o4.h1;
import o4.u1;
import o4.v1;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p3.e3;
import p3.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e0 implements androidx.core.view.z, u03.a, e3, j9.a.b, j9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60929a;

    public /* synthetic */ e0(int i14) {
        this.f60929a = i14;
    }

    public static int a(int i14, DateTime dateTime, int i15) {
        return (dateTime.hashCode() + i14) * i15;
    }

    public static long b(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).f().b();
    }

    public static long d(d92.b bVar, o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).k().b();
    }

    public static long e(p3.m mVar) {
        return d92.b.a(mVar).k().a();
    }

    public static long f(o0 o0Var) {
        return d92.b.a(o0Var).c().c();
    }

    public static h4.r g(o0 o0Var, int i14, h4.r.a aVar, float f14, j92.b bVar) {
        o0Var.C(i14);
        h4.r rVarF = x2.f(aVar, f14);
        bVar.getClass();
        return rVarF;
    }

    public static i53.c h(int i14, int i15) {
        return i53.a.e(new j23.l(i14, i15));
    }

    public static String i(String str, int i14, char c14) {
        return str + i14 + c14;
    }

    public static String j(StringBuilder sb3, int i14, char c14) {
        sb3.append(i14);
        sb3.append(c14);
        return sb3.toString();
    }

    public static StringBuilder k(long j8, String str, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(j8);
        sb3.append(str2);
        return sb3;
    }

    public static u4.e l(float f14, float f15) {
        u1.a aVar = u1.f129010b;
        v1.a aVar2 = v1.f129019b;
        h1.a aVar3 = h1.f128863b;
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        return eVar;
    }

    public static void m(int i14, int i15, String str, String str2, StringBuilder sb3) {
        sb3.append(i14);
        sb3.append(str);
        sb3.append(i15);
        sb3.append(str2);
    }

    public static void n(int i14, Integer num, String str, String str2, HashMap map) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i14));
    }

    public static void o(int i14, HashMap map, String str) {
        map.put(str, new Integer(i14));
    }

    public static void p(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
    }

    public static void q(f12.m mVar, String str, boolean z14) {
        mVar.i().edit().putBoolean(str, z14).apply();
    }

    public static void r(Boolean bool, Boolean bool2, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(bool);
        sb3.append(str2);
        sb3.append(bool2);
    }

    public static /* synthetic */ void s(Integer num, Object obj) throws HttpException {
        obj.toString();
        throw new HttpException(num, String.valueOf(obj));
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static void u(String str, String str2, String str3, Logger logger) {
        logger.warn(str + str2 + str3);
    }

    public static void v(String str, String str2, Logger logger) {
        logger.error(str + str2);
    }

    public static long w(o0 o0Var) {
        return d92.b.a(o0Var).c().f();
    }

    @Override // p3.e3
    public boolean c() {
        return false;
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f60929a) {
            case 1:
                int i14 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = eVarI.f25191b;
                marginLayoutParams.leftMargin = eVarI.f25190a;
                marginLayoutParams.rightMargin = eVarI.f25192c;
                view2.setLayoutParams(marginLayoutParams);
                return m1.f6507b;
            case 2:
                dz1.k.a aVar = dz1.k.f61743y;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI2.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
            case 6:
                SegmentLeaderboardActivity.a aVar2 = SegmentLeaderboardActivity.f41454p;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(129);
                eVarI3.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = eVarI3.f25191b;
                marginLayoutParams2.leftMargin = eVarI3.f25190a;
                marginLayoutParams2.rightMargin = eVarI3.f25192c;
                view2.setLayoutParams(marginLayoutParams2);
                return m1.f6507b;
            default:
                InAppPurchaseActivity.a aVar3 = InAppPurchaseActivity.f52722l;
                view2.getClass();
                c7.e eVarI4 = m1Var.f6508a.i(519);
                eVarI4.getClass();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = eVarI4.f25191b;
                marginLayoutParams3.bottomMargin = eVarI4.f25193d;
                view2.setLayoutParams(marginLayoutParams3);
                return m1.f6507b;
        }
    }

    @Override // u03.a
    public void run() {
        Logger logger = HandAlignmentCameraDebugActivity.f36551n;
    }
}
