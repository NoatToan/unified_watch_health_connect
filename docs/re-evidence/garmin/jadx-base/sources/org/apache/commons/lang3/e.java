package org.apache.commons.lang3;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ConcurrentModificationException;
import java.util.List;
import org.conscrypt.OpenSSLProvider;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.jvm.internal.s;
import p4.i;
import p4.q;
import p4.r;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements p3.e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133460a;

    public static int b(int i14, int i15, double d14) {
        return (Double.hashCode(d14) + i14) * i15;
    }

    public static int c(int i14, int i15, List list) {
        return (list.size() * i14) + i15;
    }

    public static String d(int i14, String str, String str2) {
        return i14 + str + str2;
    }

    public static String e(long j8, String str) {
        return str + j8;
    }

    public static String f(String str, String str2, Object obj) {
        return str + obj + str2;
    }

    public static StringBuilder g(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    public static /* synthetic */ void h() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void i(int i14, String str) {
        throw new IllegalStateException(str + i14);
    }

    public static void j(j92.b bVar) {
        bVar.getClass();
    }

    public static /* synthetic */ void k(String str) {
        throw new StringIndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void o(StringBuilder sb3, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb3.append(str);
        sb3.append(str2);
        openSSLProvider.put(str3, sb3.toString());
    }

    public static void p(Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        s.l();
        throw null;
    }

    public static /* synthetic */ void q(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void s(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void t(String str) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* synthetic */ void u(String str) {
        throw new ArithmeticException(str);
    }

    public static /* synthetic */ void v(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // p4.i
    public double a(double d14) {
        switch (this.f133460a) {
            case 21:
                p4.e eVar = p4.e.f135544a;
                double d15 = d14 < 0.0d ? -d14 : d14;
                return Math.copySign(d15 >= 0.0031308049535603718d ? (Math.pow(d15, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d15 / 0.07739938080495357d, d14);
            case 22:
                p4.e eVar2 = p4.e.f135544a;
                double d16 = d14 < 0.0d ? -d14 : d14;
                return Math.copySign(d16 >= 0.04045d ? Math.pow((0.9478672985781991d * d16) + 0.05213270142180095d, 2.4d) : d16 * 0.07739938080495357d, d14);
            case 23:
                p4.e eVar3 = p4.e.f135544a;
                r rVar = p4.e.f135547d;
                eVar3.getClass();
                return p4.e.b(rVar, d14);
            case 24:
                p4.e eVar4 = p4.e.f135544a;
                r rVar2 = p4.e.f135547d;
                eVar4.getClass();
                return p4.e.a(rVar2, d14);
            case 25:
                p4.e eVar5 = p4.e.f135544a;
                r rVar3 = p4.e.f135548e;
                eVar5.getClass();
                return p4.e.d(rVar3, d14);
            case 26:
                p4.e eVar6 = p4.e.f135544a;
                r rVar4 = p4.e.f135548e;
                eVar6.getClass();
                return p4.e.c(rVar4, d14);
            default:
                q.a aVar = q.f135600r;
                return d14;
        }
    }

    @Override // p3.e
    public void cancel() {
        p3.e.a aVar = p3.e.a.f135067a;
    }
}
