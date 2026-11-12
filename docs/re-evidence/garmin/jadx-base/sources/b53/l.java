package b53;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import lc.u0;
import n23.c4;
import n23.p4;
import n23.r3;
import n23.s4;
import n23.t3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p43.d2;
import p43.f0;
import p43.f2;
import p43.g2;
import p43.n0;
import p43.t1;
import p43.v0;
import p43.w;
import t23.d1;
import t23.g0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lb53/l;", "Lb53/a;", "Lp43/n0;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "", "isAbbreviation", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Le23/a;Z)V", "(Lorg/jetbrains/kotlin/types/KotlinType;Le23/a;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends b53.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f16126f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f16127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.a f16129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4.a f16130e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16131a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16131a = iArr;
        }
    }

    static {
        i0 i0Var = new i0(l.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        t0 t0Var = s0.f105811a;
        f16126f = new k23.l[]{t0Var.h(i0Var), n23.j.l(l.class, "arguments", "getArguments()Ljava/util/List;", 0, t0Var)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n0 n0Var, e23.a<? extends Type> aVar, boolean z14) {
        super(aVar);
        n0Var.getClass();
        this.f16127b = n0Var;
        this.f16128c = z14;
        this.f16129d = new c4.a(null, new g(this));
        this.f16130e = new c4.a(null, new h(this, aVar));
    }

    @Override // b53.a
    /* JADX INFO: renamed from: C */
    public final boolean getF16160i() {
        return p005kotlin.reflect.jvm.internal.impl.builtins.c.i(this.f16127b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b53.a
    /* JADX INFO: renamed from: E */
    public final b53.a getF16133b() {
        f2 f2VarI0 = this.f16127b.I0();
        e23.a aVar = null;
        Object[] objArr = 0;
        if (f2VarI0 instanceof f0) {
            return new l(((f0) f2VarI0).f135829b, aVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011 A[PHI: r4
      0x0011: PHI (r4v8 p43.n0) = (r4v4 p43.n0), (r4v10 p43.n0) binds: [B:13:0x0020, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b53.a
    public final b53.a F(boolean z14) {
        n0 n0VarA;
        n0 n0Var = this.f16127b;
        if (z14) {
            n0VarA = w.a.a(w.f135930d, n0Var.I0(), true);
            if (n0VarA != null) {
                n0Var = n0VarA;
            }
        } else {
            w wVar = n0Var instanceof w ? (w) n0Var : null;
            if (wVar != null && (n0VarA = wVar.f135931b) != null) {
                n0Var = n0VarA;
            }
        }
        return new l(n0Var, this.f16111a);
    }

    @Override // b53.a
    public final b53.a G(boolean z14) {
        n0 n0Var = this.f16127b;
        n0Var.getClass();
        if (!(n0Var.I0() instanceof f0) && n0Var.G0() == z14) {
            return this;
        }
        f2 f2VarI = d2.i(n0Var, z14);
        f2VarI.getClass();
        return new l(f2VarI, this.f16111a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b53.a
    /* JADX INFO: renamed from: H */
    public final b53.a getF16134c() {
        f2 f2VarI0 = this.f16127b.I0();
        e23.a aVar = null;
        Object[] objArr = 0;
        if (f2VarI0 instanceof f0) {
            return new l(((f0) f2VarI0).f135830c, aVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    public final k23.e I(n0 n0Var) {
        n0 type;
        if (this.f16128c) {
            t23.h hVarT = n0Var.F0().t();
            g0.b bVar = hVarT instanceof g0.b ? (g0.b) hVarT : null;
            if (bVar != null) {
                return new r3(f43.e.g(bVar));
            }
        }
        t23.h hVarT2 = n0Var.F0().t();
        if (hVarT2 instanceof t23.e) {
            Class<?> clsI = s4.i((t23.e) hVarT2);
            if (clsI != null) {
                if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.z(n0Var)) {
                    if (d2.g(n0Var)) {
                        return new n23.f2(clsI);
                    }
                    Class<? extends Object> cls = z23.f.f202042b.get(clsI);
                    if (cls != null) {
                        clsI = cls;
                    }
                    return new n23.f2(clsI);
                }
                t1 t1Var = (t1) h0.K0(n0Var.D0());
                if (t1Var == null || (type = t1Var.getType()) == null) {
                    return new n23.f2(clsI);
                }
                k23.e eVarI = I(o72.t.S(type));
                if (eVarI != null) {
                    return new n23.f2(s4.c(dh.b.u(g8.i.H(eVarI))));
                }
                u0.t(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (hVarT2 instanceof d1) {
            return new t3(null, (d1) hVarT2);
        }
        return null;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: c */
    public final k23.p getF16157f() {
        n0 n0Var = this.f16127b;
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        p43.a aVar = f2VarI0 instanceof p43.a ? (p43.a) f2VarI0 : null;
        v0 v0Var = aVar != null ? aVar.f135789c : null;
        if (v0Var != null) {
            return new l(v0Var, this.f16111a, true);
        }
        return null;
    }

    @Override // b53.a
    public final k23.d<?> e() {
        t23.h hVarT = this.f16127b.F0().t();
        t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
        if (eVar != null) {
            s23.d.f156251a.getClass();
            if (s23.d.b(eVar)) {
                if (p4.f122570a) {
                    k23.e eVarG = getF105782a();
                    eVarG.getClass();
                    return new p((k23.d) eVarG, f43.e.g(eVar).f188596a.f188600a, new i(eVar), new j(eVar));
                }
                x33.c cVarG = f43.e.g(eVar);
                k23.e eVarG2 = getF105782a();
                eVarG2.getClass();
                return s.a(cVarG, (k23.d) eVarG2);
            }
        }
        return null;
    }

    @Override // b53.a
    public final boolean equals(Object obj) {
        if (!p4.f122570a) {
            return super.equals(obj);
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f16127b, lVar.f16127b) && p005kotlin.jvm.internal.s.g(getF105782a(), lVar.getF105782a()) && h().equals(lVar.h());
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g */
    public final k23.e getF105782a() {
        k23.l<Object> lVar = f16126f[0];
        return (k23.e) this.f16129d.invoke();
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return s4.b(this.f16127b);
    }

    @Override // k23.p
    public final List<k23.r> h() {
        k23.l<Object> lVar = f16126f[1];
        Object objInvoke = this.f16130e.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // b53.a
    public final int hashCode() {
        if (!p4.f122570a) {
            return super.hashCode();
        }
        int iHashCode = this.f16127b.hashCode() * 31;
        k23.e eVarG = getF105782a();
        return h().hashCode() + ((iHashCode + (eVarG != null ? eVarG.hashCode() : 0)) * 31);
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i */
    public final boolean getF16155d() {
        return this.f16127b.G0();
    }

    @Override // b53.a
    /* JADX INFO: renamed from: j */
    public final boolean getF16158g() {
        n0 n0Var = this.f16127b;
        n0Var.getClass();
        return n0Var.I0() instanceof w;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: m */
    public final boolean getF16159h() {
        n0 n0Var = this.f16127b;
        if (n0Var != null) {
            x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
            return p005kotlin.reflect.jvm.internal.impl.builtins.d.B(n0Var, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c);
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d.a(TsExtractor.TS_STREAM_TYPE_DTS);
        throw null;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: t */
    public final boolean getF16135d() {
        return this.f16127b instanceof m33.j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(n0 n0Var, e23.a<? extends Type> aVar) {
        this(n0Var, aVar, false);
        n0Var.getClass();
    }

    public /* synthetic */ l(n0 n0Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(n0Var, (i14 & 2) != 0 ? null : aVar);
    }
}
