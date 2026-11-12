package xd2;

import fe2.k1;
import fe2.l1;
import fe2.m1;
import fe2.n1;
import fe2.s1;
import fe2.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface a1 extends yd2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f190042a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/a1$a;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f190043a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f190043a;
    }

    static /* synthetic */ Object m(a1 a1Var, long j8, Long l14, String str, ArrayList arrayList, v13.c cVar, int i14) {
        Boolean bool = Boolean.TRUE;
        if ((i14 & 2) != 0) {
            bool = null;
        }
        if ((i14 & 4) != 0) {
            l14 = null;
        }
        if ((i14 & 8) != 0) {
            str = null;
        }
        return a1Var.a(j8, bool, l14, str, (i14 & 16) != 0 ? null : arrayList, cVar);
    }

    Object A(ae2.e0 e0Var, long j8, String str, DateTime dateTime, int i14, v13.c cVar);

    Object B(String str, long j8, long j14, m1 m1Var);

    Object C(long j8, s1 s1Var, n1 n1Var);

    Object D(long j8, ge2.a aVar, v13.c cVar);

    Object E(ae2.e0 e0Var, long j8, DateTime dateTime, y1 y1Var);

    Object F(long j8, v13.c cVar, boolean z14);

    Object G(long j8, v13.c cVar, boolean z14);

    Object H(o13.p[] pVarArr, v13.c cVar);

    Object I(ae2.e0 e0Var, long j8, v13.c cVar);

    Object a(long j8, Boolean bool, Long l14, String str, List list, v13.c cVar);

    Object b(long j8, v13.c cVar);

    Object c(long j8, fe2.a0.b bVar);

    Object d(long j8, v13.c cVar);

    Object e(be2.g gVar, v13.c cVar);

    Object f(long j8, List list, l1 l1Var);

    Serializable g(long j8, v13.c cVar);

    Object h(String str, v13.c cVar);

    Object i(long j8, ge2.e eVar, v13.c cVar);

    Object j(long j8, ae2.e0 e0Var, String str, v13.c cVar);

    Object l(long j8, ae2.e0 e0Var, String str, v13.c cVar);

    Object n(boolean z14, v13.c cVar);

    Object p(long j8, String str, String str2, fe2.m0 m0Var);

    Object q(ae2.e0 e0Var, long j8, String str, int i14, ae2.l lVar, Boolean bool, Boolean bool2, boolean z14, v13.c cVar);

    Object r(long j8, v13.c cVar);

    Object s(ae2.e0 e0Var, long j8, boolean z14, wd2.b1 b1Var);

    Object t(long j8, String str, v13.c cVar);

    Object u(List list, v13.c cVar);

    Object v(long j8, ae2.e0 e0Var, String str, v13.c cVar);

    Object w(long j8, int i14, List list, Integer num, Integer num2, k1 k1Var);

    Object x(ae2.e0 e0Var, long j8, List list, v13.c cVar);

    Object y(long j8, v13.c cVar, boolean z14);

    Object z(long j8, v13.c cVar);
}
