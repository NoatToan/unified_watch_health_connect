package defpackage;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;

/* JADX INFO: loaded from: classes6.dex */
public class lbh extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pvg[] f24865b;
    public final g0 c;
    public static final g0 d = new k();
    public static final g0 e = new v();
    public static final g0 f = new y();
    public static final g0 g = new z();
    public static final g0 h = new a0();
    public static final g0 i = new b0();
    public static final g0 j = new c0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g0 f24862k = new d0();
    public static final g0 l = new e0();
    public static final g0 m = new a();
    public static final g0 n = new b();
    public static final g0 o = new c();
    public static final g0 p = new d();
    public static final g0 q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g0 f24863r = new f();
    public static final g0 s = new g();
    public static final g0 t = new h();
    public static final g0 u = new i();
    public static final g0 v = new j();
    public static final g0 w = new l();
    public static final g0 x = new m();
    public static final g0 y = new n();
    public static final g0 z = new o();
    public static final g0 A = new p();
    public static final g0 B = new q();
    public static final g0 C = new r();
    public static final g0 D = new s();
    public static final g0 E = new t();
    public static final g0 F = new u();
    public static final g0 G = new w();
    public static final g0 H = new x();

    public class a extends i0 {
        public a() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.cos(d.doubleValue());
        }
    }

    public class a0 extends h0 {
        public a0() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return Math.pow(d.doubleValue(), d2.doubleValue());
        }
    }

    public class b extends i0 {
        public b() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.tan(d.doubleValue());
        }
    }

    public class b0 extends h0 {
        public b0() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return ((d.doubleValue() % d2.doubleValue()) + d2.doubleValue()) % d2.doubleValue();
        }
    }

    public class c extends i0 {
        public c() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.acos(d.doubleValue());
        }
    }

    public class c0 extends i0 {
        public c0() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.sqrt(d.doubleValue());
        }
    }

    public class d extends i0 {
        public d() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.asin(d.doubleValue());
        }
    }

    public class d0 extends i0 {
        public d0() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.log(d.doubleValue());
        }
    }

    public class e extends i0 {
        public e() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.atan(d.doubleValue());
        }
    }

    public class e0 extends i0 {
        public e0() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.sin(d.doubleValue());
        }
    }

    public class f extends i0 {
        public f() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.exp(d.doubleValue());
        }
    }

    public static abstract class f0 implements g0 {
        public f0() {
        }

        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            return b((Double) pvgVarArr[0].value(), (Double) pvgVarArr[1].value()) ? 1.0d : 0.0d;
        }

        public abstract boolean b(Double d, Double d2);
    }

    public class g extends i0 {
        public g() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.round(d.doubleValue());
        }
    }

    public interface g0 {
        double a(pvg[] pvgVarArr);
    }

    public class h extends i0 {
        public h() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.abs(d.doubleValue());
        }
    }

    public static abstract class h0 implements g0 {
        public h0() {
        }

        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            double dDoubleValue = pvgVarArr[0].doubleValue().doubleValue();
            for (int i = 1; i < pvgVarArr.length; i++) {
                dDoubleValue = b(Double.valueOf(dDoubleValue), pvgVarArr[i].doubleValue());
            }
            return dDoubleValue;
        }

        public abstract double b(Double d, Double d2);
    }

    public class i extends i0 {
        public i() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.floor(d.doubleValue());
        }
    }

    public static abstract class i0 implements g0 {
        public i0() {
        }

        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            return b((Double) pvgVarArr[0].value());
        }

        public abstract double b(Double d);
    }

    public class j extends i0 {
        public j() {
            super();
        }

        @Override // lbh.i0
        public double b(Double d) {
            return Math.ceil(d.doubleValue());
        }
    }

    public class k extends h0 {
        public k() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() + d2.doubleValue();
        }
    }

    public class l extends h0 {
        public l() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return Math.min(d.doubleValue(), d2.doubleValue());
        }
    }

    public class m extends h0 {
        public m() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return Math.max(d.doubleValue(), d2.doubleValue());
        }
    }

    public class n implements g0 {
        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            boolean zC = lbh.c(pvgVarArr[0].value());
            for (int i = 1; i < pvgVarArr.length && zC; i++) {
                zC = zC && lbh.c(pvgVarArr[i].value());
            }
            return zC ? 1.0d : 0.0d;
        }
    }

    public class o implements g0 {
        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            boolean zC = lbh.c(pvgVarArr[0].value());
            for (int i = 1; i < pvgVarArr.length && !zC; i++) {
                zC = zC || lbh.c(pvgVarArr[i].value());
            }
            return zC ? 1.0d : 0.0d;
        }
    }

    public class p implements g0 {
        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            return lbh.c(pvgVarArr[0].value()) ? 0.0d : 1.0d;
        }
    }

    public class q implements g0 {
        @Override // lbh.g0
        public double a(pvg[] pvgVarArr) {
            Object objValue = pvgVarArr[0].value();
            return (objValue == null || ((objValue instanceof Double) && ((Double) objValue).isNaN())) ? 0.0d : 1.0d;
        }
    }

    public class r extends f0 {
        public r() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() >= d2.doubleValue()) ? false : true;
        }
    }

    public class s extends f0 {
        public s() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            if (d == null || d2 == null) {
                return d == d2;
            }
            return d.doubleValue() == d2.doubleValue();
        }
    }

    public class t extends f0 {
        public t() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() <= d2.doubleValue()) ? false : true;
        }
    }

    public class u extends f0 {
        public u() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            return d.doubleValue() <= d2.doubleValue();
        }
    }

    public class v extends h0 {
        public v() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() - d2.doubleValue();
        }
    }

    public class w extends f0 {
        public w() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            return d.doubleValue() >= d2.doubleValue();
        }
    }

    public class x extends f0 {
        public x() {
            super();
        }

        @Override // lbh.f0
        public boolean b(Double d, Double d2) {
            if (d == null || d2 == null) {
                return d == d2;
            }
            return d.doubleValue() != d2.doubleValue();
        }
    }

    public class y extends h0 {
        public y() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() * d2.doubleValue();
        }
    }

    public class z extends h0 {
        public z() {
            super();
        }

        @Override // lbh.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() / d2.doubleValue();
        }
    }

    public lbh(int i2, ReadableMap readableMap, svg svgVar) {
        super(i2, readableMap, svgVar);
        int[] iArrA = hmq.a(readableMap.getArray("input"));
        this.f24864a = iArrA;
        this.f24865b = new pvg[iArrA.length];
        String string = readableMap.getString("op");
        if ("add".equals(string)) {
            this.c = d;
            return;
        }
        if ("sub".equals(string)) {
            this.c = e;
            return;
        }
        if ("multiply".equals(string)) {
            this.c = f;
            return;
        }
        if ("divide".equals(string)) {
            this.c = g;
            return;
        }
        if ("pow".equals(string)) {
            this.c = h;
            return;
        }
        if ("modulo".equals(string)) {
            this.c = i;
            return;
        }
        if ("sqrt".equals(string)) {
            this.c = j;
            return;
        }
        if ("log".equals(string)) {
            this.c = f24862k;
            return;
        }
        if ("sin".equals(string)) {
            this.c = l;
            return;
        }
        if ("cos".equals(string)) {
            this.c = m;
            return;
        }
        if ("tan".equals(string)) {
            this.c = n;
            return;
        }
        if ("acos".equals(string)) {
            this.c = o;
            return;
        }
        if ("asin".equals(string)) {
            this.c = p;
            return;
        }
        if ("atan".equals(string)) {
            this.c = q;
            return;
        }
        if ("exp".equals(string)) {
            this.c = f24863r;
            return;
        }
        if ("round".equals(string)) {
            this.c = s;
            return;
        }
        if ("and".equals(string)) {
            this.c = y;
            return;
        }
        if ("or".equals(string)) {
            this.c = z;
            return;
        }
        if ("not".equals(string)) {
            this.c = A;
            return;
        }
        if ("defined".equals(string)) {
            this.c = B;
            return;
        }
        if ("lessThan".equals(string)) {
            this.c = C;
            return;
        }
        if ("eq".equals(string)) {
            this.c = D;
            return;
        }
        if ("greaterThan".equals(string)) {
            this.c = E;
            return;
        }
        if ("lessOrEq".equals(string)) {
            this.c = F;
            return;
        }
        if ("greaterOrEq".equals(string)) {
            this.c = G;
            return;
        }
        if ("neq".equals(string)) {
            this.c = H;
            return;
        }
        if ("abs".equals(string)) {
            this.c = t;
            return;
        }
        if ("floor".equals(string)) {
            this.c = u;
            return;
        }
        if ("ceil".equals(string)) {
            this.c = v;
            return;
        }
        if (VibrateModeSetFragment.MAX.equals(string)) {
            this.c = x;
        } else {
            if ("min".equals(string)) {
                this.c = w;
                return;
            }
            throw new JSApplicationIllegalArgumentException("Unrecognized operator " + string);
        }
    }

    public static boolean c(Object obj) {
        return (obj == null || obj.equals(Double.valueOf(0.0d))) ? false : true;
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f24864a;
            if (i2 >= iArr.length) {
                return Double.valueOf(this.c.a(this.f24865b));
            }
            this.f24865b[i2] = this.mNodesManager.o(iArr[i2], pvg.class);
            i2++;
        }
    }
}
