package am;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements androidx.core.view.f.b, androidx.core.view.f.a {
    public static long A(d92.b bVar, p3.o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).c().f();
    }

    public static long B(d92.b bVar, p3.o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).c().a();
    }

    public static int a(int i14, int i15, int i16, int i17) {
        return ((i14 - i15) / i16) + i17;
    }

    public static int b(Map map, int i14, int i15) {
        return (map.hashCode() + i14) * i15;
    }

    public static long c(d92.b bVar, p3.o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).c().e();
    }

    public static long d(p3.o0 o0Var) {
        return d92.b.a(o0Var).f().b();
    }

    public static Bundle e(int i14, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i14);
        return bundle;
    }

    public static Object f(int i14, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i14);
    }

    public static String g(int i14, int i15, String str, String str2, String str3) {
        return str + i14 + str2 + i15 + str3;
    }

    public static String h(int i14, String str) {
        return str + i14;
    }

    public static String i(long j8, String str, StringBuilder sb3) {
        sb3.append(j8);
        sb3.append(str);
        return sb3.toString();
    }

    public static String j(Uri uri, String str) {
        return str + uri;
    }

    public static String k(Object obj, String str, StringBuilder sb3) {
        sb3.append(obj);
        sb3.append(str);
        return sb3.toString();
    }

    public static String l(String str, float f14, String str2, float f15, String str3) {
        return str + f14 + str2 + f15 + str3;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(String str, String str2, String str3, StringBuilder sb3, boolean z14) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(z14);
        sb3.append(str3);
        return sb3.toString();
    }

    public static String o(String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String p(String str, Throwable th3) {
        return str + th3;
    }

    public static String q(StringBuilder sb3, int i14, String str) {
        sb3.append(i14);
        sb3.append(str);
        return sb3.toString();
    }

    public static String r(StringBuilder sb3, String str, double d14, String str2) {
        sb3.append(str);
        sb3.append(d14);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String s(StringBuilder sb3, Map map, String str) {
        sb3.append(map);
        sb3.append(str);
        return sb3.toString();
    }

    public static String t(StringBuilder sb3, boolean z14, char c14) {
        sb3.append(z14);
        sb3.append(c14);
        return sb3.toString();
    }

    public static Iterator u(Map map, Parcel parcel) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static /* synthetic */ void v(float f14, String str, Object obj) {
        throw new IllegalArgumentException(str + f14 + obj);
    }

    public static /* synthetic */ void w(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static void x(StringBuilder sb3, String str, double d14, String str2) {
        sb3.append(str);
        sb3.append(d14);
        sb3.append(str2);
    }

    public static void y(StringBuilder sb3, String str, String str2, String str3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static boolean z(f12.l.a aVar) {
        aVar.getClass();
        return f12.l.a.a().y();
    }
}
