package tj;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f164761a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj.b.q f164762b = new tj.b.q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f164763c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164764a;

        static {
            int[] iArr = new int[d1.values().length];
            f164764a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164764a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164764a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f164764a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164764a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f164764a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f164764a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f164764a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f164764a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // tj.g.z, tj.g.n0
        public final String n() {
            return "polygon";
        }
    }

    public static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ArrayList f164765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ArrayList f164766o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ArrayList f164767p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList f164768q;
    }

    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164777s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f164778t;

        @Override // tj.g.n0
        public final String n() {
            return "rect";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f164779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f164780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f164781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f164782d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f164779a = pVar;
            this.f164780b = pVar2;
            this.f164781c = pVar3;
            this.f164782d = pVar4;
        }
    }

    public static class c0 extends l0 implements j0 {
        @Override // tj.g.j0
        public final List<n0> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // tj.g.j0
        public final void h(n0 n0Var) {
        }

        @Override // tj.g.n0
        public final String n() {
            return "solidColor";
        }
    }

    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f164783c;

        public c1(String str) {
            this.f164783c = str;
        }

        @Override // tj.g.x0
        public final b1 b() {
            return null;
        }

        public final String toString() {
            return am.j.o(this.f164783c, "'", new StringBuilder("TextChild: '"));
        }
    }

    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164784o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164785p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164786q;

        @Override // tj.g.n0
        public final String n() {
            return TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE;
        }
    }

    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f164787h;

        @Override // tj.g.j0
        public final List<n0> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // tj.g.j0
        public final void h(n0 n0Var) {
        }

        @Override // tj.g.n0
        public final String n() {
            return "stop";
        }
    }

    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class e extends m implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f164798o;

        @Override // tj.g.m, tj.g.n0
        public final String n() {
            return "clipPath";
        }
    }

    public static class e0 implements Cloneable {
        public String A;
        public String B;
        public Boolean C;
        public Boolean D;
        public o0 E;
        public Float F;
        public i H0;
        public String I;
        public e I0;
        public a P;
        public String T;
        public o0 X;
        public Float Y;
        public o0 Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f164799a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o0 f164800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f164801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f164802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o0 f164803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f164804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f164805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f164806h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f164807i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Float f164808j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public p[] f164809k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public Float f164810k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p f164811l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Float f164812m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f164813n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ArrayList f164814o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164815p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f164816q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b f164817r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public EnumC3093g f164818t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public h f164819v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public f f164820w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Boolean f164821x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public c f164822y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f164823z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: tj.g$e0$g, reason: collision with other inner class name */
        public enum EnumC3093g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        public static e0 a() {
            e0 e0Var = new e0();
            e0Var.f164799a = -1L;
            f fVar = f.f164864b;
            e0Var.f164800b = fVar;
            a aVar = a.NonZero;
            e0Var.f164801c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f164802d = fValueOf;
            e0Var.f164803e = null;
            e0Var.f164804f = fValueOf;
            e0Var.f164805g = new p(1.0f);
            e0Var.f164806h = c.Butt;
            e0Var.f164807i = d.Miter;
            e0Var.f164808j = Float.valueOf(4.0f);
            e0Var.f164809k = null;
            e0Var.f164811l = new p(0.0f);
            e0Var.f164812m = fValueOf;
            e0Var.f164813n = fVar;
            e0Var.f164814o = null;
            e0Var.f164815p = new p(12.0f, d1.pt);
            e0Var.f164816q = 400;
            e0Var.f164817r = b.Normal;
            e0Var.f164818t = EnumC3093g.None;
            e0Var.f164819v = h.LTR;
            e0Var.f164820w = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f164821x = bool;
            e0Var.f164822y = null;
            e0Var.f164823z = null;
            e0Var.A = null;
            e0Var.B = null;
            e0Var.C = bool;
            e0Var.D = bool;
            e0Var.E = fVar;
            e0Var.F = fValueOf;
            e0Var.I = null;
            e0Var.P = aVar;
            e0Var.T = null;
            e0Var.X = null;
            e0Var.Y = fValueOf;
            e0Var.Z = null;
            e0Var.f164810k0 = fValueOf;
            e0Var.H0 = i.None;
            e0Var.I0 = e.auto;
            return e0Var;
        }

        public final Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f164809k;
            if (pVarArr != null) {
                e0Var.f164809k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    public static class e1 extends m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f164859o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164860p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164861q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164862r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164863s;

        @Override // tj.g.m, tj.g.n0
        public final String n() {
            return JWKParameterNames.PUBLIC_KEY_USE;
        }
    }

    public static class f extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f164864b = new f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f164865c = new f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f164866a;

        public f(int i14) {
            this.f164866a = i14;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.f164866a));
        }
    }

    public static class f0 extends r0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164867p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164868q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164869r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164870s;

        @Override // tj.g.n0
        public final String n() {
            return "svg";
        }
    }

    public static class f1 extends r0 implements t {
        @Override // tj.g.n0
        public final String n() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: tj.g$g, reason: collision with other inner class name */
    public static class C3094g extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3094g f164871a = new C3094g();

        private C3094g() {
        }
    }

    public interface g0 {
        void c(HashSet hashSet);

        void d(HashSet hashSet);

        void e(String str);

        String f();

        Set<String> g();

        Set<String> getRequiredFeatures();

        Set<String> i();

        void j(HashSet hashSet);

        void k(HashSet hashSet);

        Set<String> m();
    }

    public static class h extends m implements t {
        @Override // tj.g.m, tj.g.n0
        public final String n() {
            return "defs";
        }
    }

    public static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<n0> f164872i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HashSet f164873j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f164874k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public HashSet f164875l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashSet f164876m = null;

        @Override // tj.g.j0
        public final List<n0> a() {
            return this.f164872i;
        }

        @Override // tj.g.g0
        public final void c(HashSet hashSet) {
            this.f164875l = hashSet;
        }

        @Override // tj.g.g0
        public final void d(HashSet hashSet) {
            this.f164873j = hashSet;
        }

        @Override // tj.g.g0
        public final void e(String str) {
            this.f164874k = str;
        }

        @Override // tj.g.g0
        public final String f() {
            return this.f164874k;
        }

        @Override // tj.g.g0
        public final Set<String> g() {
            return this.f164875l;
        }

        @Override // tj.g.g0
        public final Set<String> getRequiredFeatures() {
            return this.f164873j;
        }

        @Override // tj.g.j0
        public void h(n0 n0Var) {
            this.f164872i.add(n0Var);
        }

        @Override // tj.g.g0
        public final Set<String> i() {
            return null;
        }

        @Override // tj.g.g0
        public final void j(HashSet hashSet) {
        }

        @Override // tj.g.g0
        public final void k(HashSet hashSet) {
            this.f164876m = hashSet;
        }

        @Override // tj.g.g0
        public final Set<String> m() {
            return this.f164876m;
        }
    }

    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164877o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164878p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164879q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164880r;

        @Override // tj.g.n0
        public final String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public HashSet f164881i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f164882j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public HashSet f164883k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public HashSet f164884l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashSet f164885m = null;

        @Override // tj.g.g0
        public final void c(HashSet hashSet) {
            this.f164884l = hashSet;
        }

        @Override // tj.g.g0
        public final void d(HashSet hashSet) {
            this.f164881i = hashSet;
        }

        @Override // tj.g.g0
        public final void e(String str) {
            this.f164882j = str;
        }

        @Override // tj.g.g0
        public final String f() {
            return this.f164882j;
        }

        @Override // tj.g.g0
        public final Set<String> g() {
            return this.f164884l;
        }

        @Override // tj.g.g0
        public final Set<String> getRequiredFeatures() {
            return this.f164881i;
        }

        @Override // tj.g.g0
        public final Set<String> i() {
            return this.f164883k;
        }

        @Override // tj.g.g0
        public final void j(HashSet hashSet) {
            this.f164883k = hashSet;
        }

        @Override // tj.g.g0
        public final void k(HashSet hashSet) {
            this.f164885m = hashSet;
        }

        @Override // tj.g.g0
        public final Set<String> m() {
            return this.f164885m;
        }
    }

    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<n0> f164886h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f164887i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f164888j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public k f164889k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f164890l;

        @Override // tj.g.j0
        public final List<n0> a() {
            return this.f164886h;
        }

        @Override // tj.g.j0
        public final void h(n0 n0Var) throws SVGParseException {
            if (n0Var instanceof d0) {
                this.f164886h.add(n0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + n0Var + " elements.");
        }
    }

    public interface j0 {
        List<n0> a();

        void h(n0 n0Var);
    }

    public enum k {
        /* JADX INFO: Fake field, exist only in values array */
        pad,
        reflect,
        repeat
    }

    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f164894h = null;
    }

    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f164895n;

        @Override // tj.g.n
        public final void l(Matrix matrix) {
            this.f164895n = matrix;
        }
    }

    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f164896c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f164897d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f164898e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f164899f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f164900g = null;

        public final String toString() {
            return n();
        }
    }

    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f164901n;

        @Override // tj.g.n
        public final void l(Matrix matrix) {
            this.f164901n = matrix;
        }

        @Override // tj.g.n0
        public String n() {
            return "group";
        }
    }

    public static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f164902m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f164903n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164904o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164905p;

        @Override // tj.g.n0
        public final String n() {
            return "linearGradient";
        }
    }

    public interface n {
        void l(Matrix matrix);
    }

    public static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f164906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j0 f164907b;

        public String n() {
            return "";
        }
    }

    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f164908o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164909p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164910q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164911r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164912s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Matrix f164913t;

        @Override // tj.g.n
        public final void l(Matrix matrix) {
            this.f164913t = matrix;
        }

        @Override // tj.g.n0
        public final String n() {
            return "image";
        }
    }

    public static abstract class o0 implements Cloneable {
    }

    public static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public tj.e f164916n = null;
    }

    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164917o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164918p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164919q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164920r;

        @Override // tj.g.n0
        public final String n() {
            return "line";
        }
    }

    public static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f164921m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f164922n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164923o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164924p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164925q;

        @Override // tj.g.n0
        public final String n() {
            return "radialGradient";
        }
    }

    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f164926p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164927q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f164928r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164929s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f164930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Float f164931u;

        @Override // tj.g.n0
        public final String n() {
            return "marker";
        }
    }

    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public b f164932o;
    }

    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Boolean f164933n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f164934o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f164935p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f164936q;

        @Override // tj.g.n0
        public final String n() {
            return "mask";
        }
    }

    public static class s0 extends m {
        @Override // tj.g.m, tj.g.n0
        public final String n() {
            return "switch";
        }
    }

    public interface t {
    }

    public static class t0 extends r0 implements t {
        @Override // tj.g.n0
        public final String n() {
            return "symbol";
        }
    }

    public static class u extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f164938b;

        public u(String str, o0 o0Var) {
            this.f164937a = str;
            this.f164938b = o0Var;
        }

        public final String toString() {
            return this.f164937a + StringUtils.SPACE + this.f164938b;
        }
    }

    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f164939n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public b1 f164940o;

        @Override // tj.g.x0
        public final b1 b() {
            return this.f164940o;
        }

        @Override // tj.g.n0
        public final String n() {
            return "tref";
        }
    }

    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f164941o;

        @Override // tj.g.n0
        public final String n() {
            return "path";
        }
    }

    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b1 f164942r;

        @Override // tj.g.x0
        public final b1 b() {
            return this.f164942r;
        }

        @Override // tj.g.n0
        public final String n() {
            return "tspan";
        }
    }

    public static class w implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f164944b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f164946d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f164943a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f164945c = new float[16];

        @Override // tj.g.x
        public final void a(float f14, float f15) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f164945c;
            int i14 = this.f164946d;
            int i15 = i14 + 1;
            this.f164946d = i15;
            fArr[i14] = f14;
            this.f164946d = i14 + 2;
            fArr[i15] = f15;
        }

        @Override // tj.g.x
        public final void b(float f14, float f15, float f16, float f17, float f18, float f19) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f164945c;
            int i14 = this.f164946d;
            int i15 = i14 + 1;
            this.f164946d = i15;
            fArr[i14] = f14;
            int i16 = i14 + 2;
            this.f164946d = i16;
            fArr[i15] = f15;
            int i17 = i14 + 3;
            this.f164946d = i17;
            fArr[i16] = f16;
            int i18 = i14 + 4;
            this.f164946d = i18;
            fArr[i17] = f17;
            int i19 = i14 + 5;
            this.f164946d = i19;
            fArr[i18] = f18;
            this.f164946d = i14 + 6;
            fArr[i19] = f19;
        }

        @Override // tj.g.x
        public final void c(float f14, float f15) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f164945c;
            int i14 = this.f164946d;
            int i15 = i14 + 1;
            this.f164946d = i15;
            fArr[i14] = f14;
            this.f164946d = i14 + 2;
            fArr[i15] = f15;
        }

        @Override // tj.g.x
        public final void close() {
            f((byte) 8);
        }

        @Override // tj.g.x
        public final void d(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18) {
            f((byte) ((z14 ? 2 : 0) | 4 | (z15 ? 1 : 0)));
            g(5);
            float[] fArr = this.f164945c;
            int i14 = this.f164946d;
            int i15 = i14 + 1;
            this.f164946d = i15;
            fArr[i14] = f14;
            int i16 = i14 + 2;
            this.f164946d = i16;
            fArr[i15] = f15;
            int i17 = i14 + 3;
            this.f164946d = i17;
            fArr[i16] = f16;
            int i18 = i14 + 4;
            this.f164946d = i18;
            fArr[i17] = f17;
            this.f164946d = i14 + 5;
            fArr[i18] = f18;
        }

        @Override // tj.g.x
        public final void e(float f14, float f15, float f16, float f17) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f164945c;
            int i14 = this.f164946d;
            int i15 = i14 + 1;
            this.f164946d = i15;
            fArr[i14] = f14;
            int i16 = i14 + 2;
            this.f164946d = i16;
            fArr[i15] = f15;
            int i17 = i14 + 3;
            this.f164946d = i17;
            fArr[i16] = f16;
            this.f164946d = i14 + 4;
            fArr[i17] = f17;
        }

        public final void f(byte b14) {
            int i14 = this.f164944b;
            byte[] bArr = this.f164943a;
            if (i14 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f164943a = bArr2;
            }
            byte[] bArr3 = this.f164943a;
            int i15 = this.f164944b;
            this.f164944b = i15 + 1;
            bArr3[i15] = b14;
        }

        public final void g(int i14) {
            float[] fArr = this.f164945c;
            if (fArr.length < this.f164946d + i14) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f164945c = fArr2;
            }
        }

        public final void h(x xVar) {
            int i14 = 0;
            for (int i15 = 0; i15 < this.f164944b; i15++) {
                byte b14 = this.f164943a[i15];
                if (b14 == 0) {
                    float[] fArr = this.f164945c;
                    int i16 = i14 + 1;
                    float f14 = fArr[i14];
                    i14 += 2;
                    xVar.a(f14, fArr[i16]);
                } else if (b14 == 1) {
                    float[] fArr2 = this.f164945c;
                    int i17 = i14 + 1;
                    float f15 = fArr2[i14];
                    i14 += 2;
                    xVar.c(f15, fArr2[i17]);
                } else if (b14 == 2) {
                    float[] fArr3 = this.f164945c;
                    xVar.b(fArr3[i14], fArr3[i14 + 1], fArr3[i14 + 2], fArr3[i14 + 3], fArr3[i14 + 4], fArr3[i14 + 5]);
                    i14 += 6;
                } else if (b14 == 3) {
                    float[] fArr4 = this.f164945c;
                    float f16 = fArr4[i14];
                    float f17 = fArr4[i14 + 1];
                    int i18 = i14 + 3;
                    float f18 = fArr4[i14 + 2];
                    i14 += 4;
                    xVar.e(f16, f17, f18, fArr4[i18]);
                } else if (b14 != 8) {
                    boolean z14 = (b14 & 2) != 0;
                    boolean z15 = (b14 & 1) != 0;
                    float[] fArr5 = this.f164945c;
                    xVar.d(fArr5[i14], fArr5[i14 + 1], fArr5[i14 + 2], z14, z15, fArr5[i14 + 3], fArr5[i14 + 4]);
                    i14 += 5;
                } else {
                    xVar.close();
                }
            }
        }
    }

    public static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Matrix f164947r;

        @Override // tj.g.n
        public final void l(Matrix matrix) {
            this.f164947r = matrix;
        }

        @Override // tj.g.n0
        public final String n() {
            return "text";
        }
    }

    public interface x {
        void a(float f14, float f15);

        void b(float f14, float f15, float f16, float f17, float f18, float f19);

        void c(float f14, float f15);

        void close();

        void d(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18);

        void e(float f14, float f15, float f16, float f17);
    }

    public interface x0 {
        b1 b();
    }

    public static class y extends r0 implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f164948p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f164949q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Matrix f164950r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f164951s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f164952t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f164953u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f164954v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f164955w;

        @Override // tj.g.n0
        public final String n() {
            return "pattern";
        }
    }

    public static abstract class y0 extends h0 {
        @Override // tj.g.h0, tj.g.j0
        public final void h(n0 n0Var) throws SVGParseException {
            if (n0Var instanceof x0) {
                this.f164872i.add(n0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f164956o;

        @Override // tj.g.n0
        public String n() {
            return "polyline";
        }
    }

    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f164957n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f164958o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b1 f164959p;

        @Override // tj.g.x0
        public final b1 b() {
            return this.f164959p;
        }

        @Override // tj.g.n0
        public final String n() {
            return "textPath";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l0 b(j0 j0Var, String str) {
        l0 l0VarB;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f164896c)) {
            return l0Var;
        }
        for (Object obj : j0Var.a()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f164896c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarB = b((j0) obj, str)) != null) {
                    return l0VarB;
                }
            }
        }
        return null;
    }

    public final b a() {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fA;
        d1 d1Var5;
        f0 f0Var = this.f164761a;
        p pVar = f0Var.f164869r;
        p pVar2 = f0Var.f164870s;
        if (pVar == null || pVar.g() || (d1Var = pVar.f164915b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = pVar.a(96.0f);
        if (pVar2 == null) {
            b bVar = this.f164761a.f164932o;
            fA = bVar != null ? (bVar.f164772d * fA2) / bVar.f164771c : fA2;
        } else {
            if (pVar2.g() || (d1Var5 = pVar2.f164915b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = pVar2.a(96.0f);
        }
        return new b(0.0f, 0.0f, fA2, fA);
    }

    public final l0 c(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#") || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f164761a.f164896c)) {
            return this.f164761a;
        }
        HashMap map = this.f164763c;
        if (map.containsKey(strSubstring)) {
            return (l0) map.get(strSubstring);
        }
        l0 l0VarB = b(this.f164761a, strSubstring);
        map.put(strSubstring, l0VarB);
        return l0VarB;
    }

    public static class p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f164914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d1 f164915b;

        public p(float f14) {
            this.f164914a = f14;
            this.f164915b = d1.px;
        }

        public final float a(float f14) {
            float f15;
            float f16;
            int i14 = a.f164764a[this.f164915b.ordinal()];
            float f17 = this.f164914a;
            if (i14 == 1) {
                return f17;
            }
            switch (i14) {
                case 4:
                    return f17 * f14;
                case 5:
                    f15 = f17 * f14;
                    f16 = 2.54f;
                    break;
                case 6:
                    f15 = f17 * f14;
                    f16 = 25.4f;
                    break;
                case 7:
                    f15 = f17 * f14;
                    f16 = 72.0f;
                    break;
                case 8:
                    f15 = f17 * f14;
                    f16 = 6.0f;
                    break;
                default:
                    return f17;
            }
            return f15 / f16;
        }

        public final float b(tj.h hVar) {
            float fSqrt;
            if (this.f164915b != d1.percent) {
                return d(hVar);
            }
            tj.h.C3095h c3095h = hVar.f164964d;
            b bVar = c3095h.f165003g;
            if (bVar == null) {
                bVar = c3095h.f165002f;
            }
            float f14 = this.f164914a;
            if (bVar == null) {
                return f14;
            }
            float f15 = bVar.f164771c;
            float f16 = bVar.f164772d;
            if (f15 == f16) {
                fSqrt = f14 * f15;
            } else {
                fSqrt = f14 * ((float) (Math.sqrt((f16 * f16) + (f15 * f15)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float c(tj.h hVar, float f14) {
            return this.f164915b == d1.percent ? (this.f164914a * f14) / 100.0f : d(hVar);
        }

        public final float d(tj.h hVar) {
            float textSize;
            int i14 = a.f164764a[this.f164915b.ordinal()];
            float f14 = this.f164914a;
            switch (i14) {
                case 2:
                    textSize = hVar.f164964d.f165000d.getTextSize();
                    break;
                case 3:
                    textSize = hVar.f164964d.f165000d.getTextSize() / 2.0f;
                    break;
                case 4:
                    return f14 * hVar.f164962b;
                case 5:
                    return (f14 * hVar.f164962b) / 2.54f;
                case 6:
                    return (f14 * hVar.f164962b) / 25.4f;
                case 7:
                    return (f14 * hVar.f164962b) / 72.0f;
                case 8:
                    return (f14 * hVar.f164962b) / 6.0f;
                case 9:
                    tj.h.C3095h c3095h = hVar.f164964d;
                    b bVar = c3095h.f165003g;
                    if (bVar == null) {
                        bVar = c3095h.f165002f;
                    }
                    if (bVar != null) {
                        return (f14 * bVar.f164771c) / 100.0f;
                    }
                default:
                    return f14;
            }
            return textSize * f14;
        }

        public final float e(tj.h hVar) {
            if (this.f164915b != d1.percent) {
                return d(hVar);
            }
            tj.h.C3095h c3095h = hVar.f164964d;
            b bVar = c3095h.f165003g;
            if (bVar == null) {
                bVar = c3095h.f165002f;
            }
            float f14 = this.f164914a;
            return bVar == null ? f14 : (f14 * bVar.f164772d) / 100.0f;
        }

        public final boolean f() {
            return this.f164914a < 0.0f;
        }

        public final boolean g() {
            return this.f164914a == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.f164914a) + this.f164915b;
        }

        public p(float f14, d1 d1Var) {
            this.f164914a = f14;
            this.f164915b = d1Var;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f164769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f164770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f164771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f164772d;

        public b(b bVar) {
            this.f164769a = bVar.f164769a;
            this.f164770b = bVar.f164770b;
            this.f164771c = bVar.f164771c;
            this.f164772d = bVar.f164772d;
        }

        public final float a() {
            return this.f164769a + this.f164771c;
        }

        public final float b() {
            return this.f164770b + this.f164772d;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(this.f164769a);
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f164770b);
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f164771c);
            sb3.append(StringUtils.SPACE);
            return v.e0.e(this.f164772d, "]", sb3);
        }

        public b(float f14, float f15, float f16, float f17) {
            this.f164769a = f14;
            this.f164770b = f15;
            this.f164771c = f16;
            this.f164772d = f17;
        }
    }
}
