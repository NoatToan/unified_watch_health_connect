package com.nimbusds.jose.shaded.gson.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import c22.j0;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.tencent.mm.opensdk.utils.Log;
import d92.b;
import dj.s;
import i3.fe;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p3.m;
import p3.o0;
import qj.f;
import qj.g;
import u4.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements g {
    public static /* synthetic */ void A(Object obj, String str) throws ParseException {
        throw new ParseException(str + obj, 0);
    }

    public static void B(e eVar, float f14, float f15, float f16, float f17) {
        eVar.j(f14, f15);
        eVar.i(f16, f17);
        eVar.c();
    }

    public static void C(e eVar, float f14, float f15, float f16, float f17) {
        eVar.j(f14, f15);
        eVar.j(f16, f17);
        eVar.c();
    }

    public static long a(b bVar, m mVar) {
        bVar.getClass();
        return b.a(mVar).k().b();
    }

    public static long b(b bVar, o0 o0Var, boolean z14) {
        bVar.getClass();
        long jF = b.a(o0Var).c().f();
        o0Var.g0(z14);
        return jF;
    }

    public static long c(m mVar) {
        return b.a(mVar).c().f();
    }

    public static long d(o0 o0Var) {
        return b.a(o0Var).k().b();
    }

    public static XAxis e(LineChart lineChart, Transformer transformer) {
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        transformer.getClass();
        return xAxis;
    }

    public static fe f(o0 o0Var) {
        fe feVar = new fe();
        o0Var.K(feVar);
        return feVar;
    }

    public static String g(long j8, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(j8);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String h(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String i(String str, DateTime dateTime) {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(str);
        dateTimeFormatterForPattern.getClass();
        return j0.h(dateTime, dateTimeFormatterForPattern);
    }

    public static StringBuilder j(long j8, String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(j8);
        return sb3;
    }

    public static o0 k(String str, String str2, m mVar, int i14) {
        str.getClass();
        str2.getClass();
        return mVar.E(i14);
    }

    public static e l(float f14, float f15) {
        e eVar = new e();
        eVar.k(f14, f15);
        return eVar;
    }

    public static e m(float f14, float f15, float f16, float f17) {
        e eVar = new e();
        eVar.k(f14, f15);
        eVar.i(f16, f17);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(int i14, String str, Object obj) {
        throw new IllegalArgumentException(str + ((char) i14) + obj);
    }

    public static void o(Context context, int i14, SharedPreferences.Editor editor, boolean z14) {
        editor.putBoolean(context.getString(i14), z14).apply();
    }

    public static void p(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
    }

    public static void q(Exception exc, StringBuilder sb3, String str) {
        sb3.append(exc.getMessage());
        Log.e(str, sb3.toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append((Object) " must implement [");
        sb3.append(obj2);
        sb3.append((Object) "]");
        throw new ClassCastException(sb3.toString());
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void t(String str) throws IllegalAccessException {
        throw new IllegalAccessException(str);
    }

    public static void u(String str, String str2, ArrayList arrayList) {
        arrayList.add(new p(str, str2));
    }

    public static /* synthetic */ void v(StringBuilder sb3, Object obj) {
        sb3.append(obj);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static void w(e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.j(f16, f17);
        eVar.c();
    }

    public static long x(m mVar) {
        return b.a(mVar).k().d();
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static void z(e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.i(f16, f17);
        eVar.c();
    }

    @Override // qj.g
    public Object get() {
        f fVar = s.b.f59865a;
        boolean z14 = false;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z14 = bitmapCopy == null;
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z14);
    }
}
