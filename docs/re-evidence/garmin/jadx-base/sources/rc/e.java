package rc;

import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.c1;
import lc.q0;
import lc.r0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.s;
import p13.u;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrc/e;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f151801a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f151802b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f151803c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2856e f151804d = new C2856e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f151805e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f151806f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f151807g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f151808h = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f151809i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f151810j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f151811k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f151812l = new c();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$a", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends q0<Boolean> {
        public a() {
            super(true);
        }

        @Override // lc.q0
        public final Boolean a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            return Boolean.valueOf(nd.b.a(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "boolean_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Boolean h(String str) {
            str.getClass();
            if (str.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            return (Boolean) q0.f111848m.h(str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Boolean bool) {
            Boolean bool2 = bool;
            str.getClass();
            if (bool2 == null) {
                bundle.putString(str, null);
            } else {
                q0.f111848m.e(bundle, str, bool2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$b", "Llc/g;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends lc.g<double[]> {
        public b() {
            super(true);
        }

        public static double[] j(String str) {
            str.getClass();
            e.f151801a.getClass();
            e.f151804d.getClass();
            return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            double[] doubleArray = bundle.getDoubleArray(str);
            if (doubleArray != null) {
                return doubleArray;
            }
            gg.b.J(str);
            throw null;
        }

        @Override // lc.q0
        public final String b() {
            return "double[]";
        }

        @Override // lc.q0
        public final Object c(Object obj, String str) {
            double[] dArr = (double[]) obj;
            if (dArr == null) {
                return j(str);
            }
            double[] dArrJ = j(str);
            int length = dArr.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
            System.arraycopy(dArrJ, 0, dArrCopyOf, length, 1);
            return dArrCopyOf;
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ Object h(String str) {
            return j(str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            double[] dArr = (double[]) obj;
            str.getClass();
            if (dArr == null) {
                bundle.putString(str, null);
            } else {
                bundle.putDoubleArray(str, dArr);
            }
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            return p13.m.b(dArr != null ? s.u(dArr) : null, dArr2 != null ? s.u(dArr2) : null);
        }

        @Override // lc.g
        public final double[] h() {
            return new double[0];
        }

        @Override // lc.g
        public final List i(double[] dArr) {
            List<Double> listE0;
            double[] dArr2 = dArr;
            if (dArr2 == null || (listE0 = u.e0(dArr2)) == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(y.r(listE0, 10));
            Iterator<T> it = listE0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"rc/e$c", "Llc/g;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends lc.g<List<? extends Double>> {
        public c() {
            super(true);
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            double[] doubleArray = bundle.getDoubleArray(str);
            if (doubleArray != null) {
                return u.e0(doubleArray);
            }
            gg.b.J(str);
            throw null;
        }

        @Override // lc.q0
        public final String b() {
            return "List<Double>";
        }

        @Override // lc.q0
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            return list != null ? h0.C0(list, h(str)) : h(str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            if (list == null) {
                bundle.putString(str, null);
            } else {
                bundle.putDoubleArray(str, h0.X0(list));
            }
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return p13.m.b(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }

        @Override // lc.g
        public final List<? extends Double> h() {
            return j0.f134944a;
        }

        @Override // lc.g
        public final List i(List<? extends Double> list) {
            List<? extends Double> list2 = list;
            if (list2 == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final List<Double> h(String str) {
            str.getClass();
            e.f151801a.getClass();
            e.f151804d.getClass();
            return w.c(Double.valueOf(Double.parseDouble(str)));
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$d", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends q0<Double> {
        public d() {
            super(true);
        }

        @Override // lc.q0
        public final Double a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            return Double.valueOf(nd.b.b(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "double_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            if (str.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            e.f151801a.getClass();
            e.f151804d.getClass();
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Double d14) {
            Double d15 = d14;
            str.getClass();
            if (d15 == null) {
                bundle.putString(str, null);
            } else {
                e.f151801a.getClass();
                e.f151804d.e(bundle, str, d15);
            }
        }
    }

    /* JADX INFO: renamed from: rc.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$e", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2856e extends q0<Double> {
        public C2856e() {
            super(false);
        }

        @Override // lc.q0
        public final Double a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return Double.valueOf(nd.b.b(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "double";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Double d14) {
            double dDoubleValue = d14.doubleValue();
            str.getClass();
            bundle.putDouble(str, dDoubleValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$f", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends q0<Float> {
        public f() {
            super(true);
        }

        @Override // lc.q0
        public final Float a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            return Float.valueOf(nd.b.c(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "float_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Float h(String str) {
            str.getClass();
            if (str.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            q0.f111845j.getClass();
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Float f14) {
            Float f15 = f14;
            str.getClass();
            if (f15 == null) {
                bundle.putString(str, null);
            } else {
                q0.f111845j.e(bundle, str, f15);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$g", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends q0<Integer> {
        public g() {
            super(true);
        }

        @Override // lc.q0
        public final Integer a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            return Integer.valueOf(nd.b.d(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "integer_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            str.getClass();
            if (str.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            return (Integer) q0.f111838c.h(str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Integer num) {
            Integer num2 = num;
            str.getClass();
            if (num2 == null) {
                bundle.putString(str, null);
            } else {
                q0.f111838c.e(bundle, str, num2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$h", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends q0<Long> {
        public h() {
            super(true);
        }

        @Override // lc.q0
        public final Long a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            return Long.valueOf(nd.b.f(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "long_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Long h(String str) {
            str.getClass();
            if (str.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            return (Long) q0.f111842g.h(str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Long l14) {
            Long l15 = l14;
            str.getClass();
            if (l15 == null) {
                bundle.putString(str, null);
            } else {
                q0.f111842g.e(bundle, str, l15);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"rc/e$i", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends q0<String> {
        public i() {
            super(false);
        }

        @Override // lc.q0
        public final String a(Bundle bundle, String str) {
            return (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) ? BuildConfig.TRAVIS : nd.b.h(bundle, str);
        }

        @Override // lc.q0
        public final String b() {
            return "string_non_nullable";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final String h(String str) {
            str.getClass();
            return str;
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, String str2) {
            String str3 = str2;
            str.getClass();
            str3.getClass();
            bundle.putString(str, str3);
        }

        @Override // lc.q0
        public final String f(String str) {
            String str2 = str;
            str2.getClass();
            return r0.a(r0.f111862a, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"rc/e$j", "Llc/g;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends lc.g<String[]> {
        public j() {
            super(true);
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            String[] strArrI = nd.b.i(bundle, str);
            ArrayList arrayList = new ArrayList(strArrI.length);
            for (String str2 : strArrI) {
                arrayList.add((String) q0.f111851p.h(str2));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // lc.q0
        public final String b() {
            return "string_nullable[]";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lc.q0
        public final Object c(Object obj, String str) {
            String[] strArr = (String[]) obj;
            c1 c1Var = q0.f111851p;
            return strArr != null ? (String[]) s.t(strArr, new String[]{c1Var.h(str)}) : new String[]{c1Var.h(str)};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return new String[]{q0.f111851p.h(str)};
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            String[] strArr = (String[]) obj;
            str.getClass();
            if (strArr == null) {
                bundle.putString(str, null);
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                if (str2 == null) {
                    str2 = BuildConfig.TRAVIS;
                }
                arrayList.add(str2);
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            strArr2.getClass();
            bundle.putStringArray(str, strArr2);
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            return p13.m.b((String[]) obj, (String[]) obj2);
        }

        @Override // lc.g
        public final String[] h() {
            return new String[0];
        }

        @Override // lc.g
        public final List i(String[] strArr) {
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(strArr2.length);
            int length = strArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                String str = strArr2[i14];
                arrayList.add(str != null ? r0.a(r0.f111862a, str) : BuildConfig.TRAVIS);
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"rc/e$k", "Llc/g;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends lc.g<List<? extends String>> {
        public k() {
            super(true);
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
                return null;
            }
            List listI0 = u.i0(nd.b.i(bundle, str));
            ArrayList arrayList = new ArrayList(y.r(listI0, 10));
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                arrayList.add((String) q0.f111851p.h((String) it.next()));
            }
            return arrayList;
        }

        @Override // lc.q0
        public final String b() {
            return "List<String?>";
        }

        @Override // lc.q0
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            c1 c1Var = q0.f111851p;
            return list != null ? h0.C0(list, w.c(c1Var.h(str))) : w.c(c1Var.h(str));
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return w.c(q0.f111851p.h(str));
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            List<String> list = (List) obj;
            str.getClass();
            if (list == null) {
                bundle.putString(str, null);
                return;
            }
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (String str2 : list) {
                if (str2 == null) {
                    str2 = BuildConfig.TRAVIS;
                }
                arrayList.add(str2);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            bundle.putStringArray(str, strArr);
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return p13.m.b(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // lc.g
        public final List<? extends String> h() {
            return j0.f134944a;
        }

        @Override // lc.g
        public final List i(List<? extends String> list) {
            List<? extends String> list2 = list;
            if (list2 == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            for (String str : list2) {
                arrayList.add(str != null ? r0.a(r0.f111862a, str) : BuildConfig.TRAVIS);
            }
            return arrayList;
        }
    }

    private e() {
    }
}
