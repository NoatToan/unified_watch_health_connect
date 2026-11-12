package com.airbnb.lottie.animation.keyframe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import c7.e;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.z1;
import d92.b;
import gl1.y;
import java.util.List;
import org.slf4j.Logger;
import p13.c;
import p3.m;
import p3.o0;
import ue.i0;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28196a;

    public /* synthetic */ a(int i14) {
        this.f28196a = i14;
    }

    public static void A(String str, String str2, Logger logger) {
        logger.warn(str + str2);
    }

    public static long a(b bVar, m mVar) {
        bVar.getClass();
        return b.a(mVar).f().d();
    }

    public static View b(LayoutInflater layoutInflater, int i14, ViewGroup viewGroup, boolean z14) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(i14, viewGroup, z14);
        viewInflate.getClass();
        return viewInflate;
    }

    public static Object c(int i14, List list) {
        return list.get(list.size() - i14);
    }

    public static String d(Exception exc, String str) {
        return str + exc;
    }

    public static String e(String str, String str2, String str3, boolean z14, boolean z15) {
        return str + z14 + str2 + z15 + str3;
    }

    public static String f(String str, String str2, StringBuilder sb3, boolean z14, boolean z15) {
        sb3.append(z14);
        sb3.append(str);
        sb3.append(z15);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String g(String str, String str2, boolean z14) {
        return str + z14 + str2;
    }

    public static String h(String str, boolean z14) {
        return str + z14;
    }

    public static String i(StringBuilder sb3, String str, boolean z14, String str2) {
        sb3.append(str);
        sb3.append(z14);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String j(o0 o0Var, int i14, int i15, o0 o0Var2, boolean z14) {
        o0Var.C(i14);
        String strQ = y.Q(o0Var2, i15);
        o0Var.g0(z14);
        return strQ;
    }

    public static StringBuilder k(long j8, String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(j8);
        sb3.append(str2);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder l(Integer num, String str, String str2, String str3, Integer num2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(num);
        sb3.append(str2);
        sb3.append(num2);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder m(String str, String str2, String str3, boolean z14, boolean z15) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(z14);
        sb3.append(str2);
        sb3.append(z15);
        sb3.append(str3);
        return sb3;
    }

    public static c.b n(w13.c cVar, w13.c cVar2) {
        cVar.getClass();
        return new c.b();
    }

    public static t0 o(i0.a aVar, Context context) {
        aVar.getClass();
        t0 t0VarG = t0.g(context);
        t0VarG.getClass();
        return t0VarG;
    }

    public static void p(Context context, int i14, SharedPreferences.Editor editor, int i15) {
        editor.putInt(context.getString(i14), i15).apply();
    }

    public static void q(l2.a aVar, Intent intent, Bundle bundle) {
        aVar.getClass();
        l2.a.b().a(intent, bundle);
    }

    public static void r(String str, int i14, String str2, Logger logger) {
        logger.debug(str + i14 + str2);
    }

    public static void s(String str, String str2, String str3) {
        ih2.b.b(str + str2 + str3);
    }

    public static void t(String str, String str2, String str3, StringBuilder sb3, boolean z14) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(z14);
    }

    public static void u(String str, String str2, String str3, Logger logger) {
        logger.debug(str + str2 + str3);
    }

    public static void v(String str, String str2, StringBuilder sb3, boolean z14, boolean z15) {
        sb3.append(str);
        sb3.append(z14);
        sb3.append(str2);
        sb3.append(z15);
    }

    public static void w(String str, String str2, Logger logger) {
        logger.debug(str + str2);
    }

    public static /* synthetic */ void x(String str, Throwable th3) {
        throw new IllegalStateException(str, th3);
    }

    public static void y(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void z(String str, String str2, String str3, Logger logger) {
        logger.error(str + str2 + str3);
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f28196a) {
            case 11:
                int i14 = r0.f41071d;
                view2.getClass();
                e eVarI = m1Var.f6508a.i(527);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), eVarI.f25193d);
                return m1Var;
            case 12:
                int i15 = r0.f41071d;
                view2.getClass();
                e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                int i16 = eVarI2.f25190a;
                int i17 = eVarI2.f25193d;
                view2.setPadding(i16, view2.getPaddingTop(), eVarI2.f25192c, i17);
                return m1Var;
            default:
                return z1.lambda$applyTopInsets$2(view2, m1Var);
        }
    }
}
