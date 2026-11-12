package v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.t2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements p.a, a0.f.a, q0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173775a;

    public static void A(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.c();
        eVar.k(f15, f16);
        eVar.g(f17);
    }

    public static int b(int i14, int i15, s5.x0 x0Var) {
        return (x0Var.hashCode() + i14) * i15;
    }

    public static androidx.camera.core.impl.s2 c(t2.d dVar, t2.b bVar, androidx.camera.core.impl.s2 s2Var, ArrayList arrayList, androidx.camera.core.impl.s2 s2Var2) {
        s2Var.a(t2.a(dVar, bVar));
        arrayList.add(s2Var2);
        return new androidx.camera.core.impl.s2();
    }

    public static androidx.camera.core.impl.s2 d(ArrayList arrayList, androidx.camera.core.impl.s2 s2Var) {
        arrayList.add(s2Var);
        return new androidx.camera.core.impl.s2();
    }

    public static String e(float f14, String str, StringBuilder sb3) {
        sb3.append(f14);
        sb3.append(str);
        return sb3.toString();
    }

    public static String f(int i14, String str, String str2) {
        return str + i14 + str2;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String h(StringBuilder sb3, String str, String str2, String str3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        return sb3.toString();
    }

    public static StringBuilder i(String str, float f14, String str2, float f15, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(f14);
        sb3.append(str2);
        sb3.append(f15);
        sb3.append(str3);
        return sb3;
    }

    public static u4.e j(float f14, float f15, float f16, float f17) {
        u4.e eVar = new u4.e();
        eVar.l(f14, f15);
        eVar.j(f16, f17);
        return eVar;
    }

    public static u4.e k(o4.h1.a aVar, float f14, float f15, float f16, float f17) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.l(f14, f15);
        eVar.j(f16, f17);
        return eVar;
    }

    public static /* synthetic */ void l() {
        throw new AssertionError();
    }

    public static void m(t2.d dVar, t2.b bVar, androidx.camera.core.impl.s2 s2Var, t2.d dVar2, t2.b bVar2) {
        s2Var.a(t2.a(dVar, bVar));
        s2Var.a(t2.a(dVar2, bVar2));
    }

    public static /* synthetic */ void n(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static void o(String str, String str2, String str3, StringBuilder sb3, List list) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(list);
        sb3.append(str3);
    }

    public static void p(u4.e eVar, float f14, float f15) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.c();
    }

    public static void q(u4.e eVar, float f14, float f15, float f16) {
        eVar.c();
        eVar.k(f14, f15);
        eVar.h(f16);
    }

    public static void r(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.h(f16);
        eVar.p(f17);
    }

    public static u4.e s(float f14, float f15, float f16, float f17) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
        return eVar;
    }

    public static void t(u4.e eVar, float f14, float f15, float f16) {
        eVar.p(f14);
        eVar.c();
        eVar.k(f15, f16);
    }

    public static void u(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.j(f14, f15);
        eVar.c();
        eVar.k(f16, f17);
    }

    public static void v(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.p(f16);
        eVar.h(f17);
    }

    public static void w(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.c();
        eVar.k(f15, f16);
        eVar.g(f17);
    }

    public static void x(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.g(f16);
        eVar.o(f17);
        eVar.c();
    }

    public static void y(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.o(f16);
        eVar.g(f17);
        eVar.c();
    }

    public static void z(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.p(f14);
        eVar.j(f15, f16);
        eVar.h(f17);
    }

    @Override // v.a0.f.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.f173775a) {
            case 1:
                return a0.b(totalCaptureResult, false);
            default:
                return a0.b(totalCaptureResult, true);
        }
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        return Boolean.FALSE;
    }
}
