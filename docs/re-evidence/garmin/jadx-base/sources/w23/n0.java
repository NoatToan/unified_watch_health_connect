package w23;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import p43.g2;
import p43.w1;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class n0 extends a1 implements t23.r0 {
    public t23.t0 A;
    public u B;
    public u C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t23.a0 f181664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t23.r f181665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Collection<? extends t23.r0> f181666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t23.r0 f181667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t23.b.a f181668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f181669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f181670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f181671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f181672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f181673r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f181674t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<t23.u0> f181675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t23.u0 f181676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t23.u0 f181677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f181678y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o0 f181679z;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t23.l f181680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t23.a0 f181681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t23.r f181682c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t23.b.a f181684e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final t23.u0 f181687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final x33.f f181688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p43.n0 f181689j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public t23.r0 f181683d = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public w1 f181685f = w1.f135938a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f181686g = true;

        public a() {
            this.f181680a = n0.this.d();
            this.f181681b = n0.this.g();
            this.f181682c = n0.this.getVisibility();
            this.f181684e = n0.this.getKind();
            this.f181687h = n0.this.f181676w;
            this.f181688i = n0.this.getName();
            this.f181689j = n0.this.getType();
        }

        public static /* synthetic */ void a(int i14) {
            String str = (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 5 || i14 == 7 || i14 == 9 || i14 == 11 || i14 == 19 || i14 == 13 || i14 == 14 || i14 == 16 || i14 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 1 || i14 == 2 || i14 == 3 || i14 == 5 || i14 == 7 || i14 == 9 || i14 == 11 || i14 == 19 || i14 == 13 || i14 == 14 || i14 == 16 || i14 == 17) ? 2 : 3];
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i14 == 1) {
                objArr[1] = "setOwner";
            } else if (i14 == 2) {
                objArr[1] = "setOriginal";
            } else if (i14 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i14 == 5) {
                objArr[1] = "setReturnType";
            } else if (i14 == 7) {
                objArr[1] = "setModality";
            } else if (i14 == 9) {
                objArr[1] = "setVisibility";
            } else if (i14 == 11) {
                objArr[1] = "setKind";
            } else if (i14 == 19) {
                objArr[1] = "setName";
            } else if (i14 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i14 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i14 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i14 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 5 && i14 != 7 && i14 != 9 && i14 != 11 && i14 != 19 && i14 != 13 && i14 != 14 && i14 != 16 && i14 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [t23.a, t23.l, t23.r0, w23.a1, w23.n0] */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v5, types: [t23.v, w23.m0, w23.p0] */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1, types: [t23.s0] */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r19v4, types: [t23.t0] */
        /* JADX WARN: Type inference failed for: r19v5 */
        /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15, types: [w23.m0, w23.o0] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r4v21, types: [w23.u] */
        /* JADX WARN: Type inference failed for: r4v26 */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Type inference failed for: r4v31, types: [t23.v] */
        /* JADX WARN: Type inference failed for: r4v32 */
        /* JADX WARN: Type inference failed for: r4v33, types: [p43.n0] */
        /* JADX WARN: Type inference failed for: r4v40 */
        /* JADX WARN: Type inference failed for: r4v41 */
        /* JADX WARN: Type inference failed for: r4v42 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13, types: [t23.v] */
        /* JADX WARN: Type inference failed for: r5v26 */
        /* JADX WARN: Type inference failed for: r9v3, types: [w23.u] */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public final n0 b() {
            d dVar;
            q0 q0Var;
            ?? o0Var;
            ?? p0Var;
            a2 a2Var;
            e23.a<o43.k<d43.g<?>>> aVar;
            q0 q0Var2;
            q0 q0Var3;
            n0 n0Var = n0.this;
            n0Var.getClass();
            t23.l lVar = this.f181680a;
            t23.a0 a0Var = this.f181681b;
            t23.r rVar = this.f181682c;
            t23.r0 r0Var = this.f181683d;
            t23.b.a aVar2 = this.f181684e;
            t23.y0.a aVar3 = t23.y0.f162076a;
            q0 q0Var4 = null;
            if (aVar3 == null) {
                n0.y(28);
                throw null;
            }
            ?? H0 = n0Var.H0(lVar, a0Var, rVar, r0Var, aVar2, this.f181688i, aVar3);
            List<d1> typeParameters = n0Var.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            a2 a2VarH = og2.k.H(typeParameters, this.f181685f, H0, arrayList);
            g2 g2Var = g2.OUT_VARIANCE;
            p43.n0 n0Var2 = this.f181689j;
            p43.n0 n0VarJ = a2VarH.j(g2Var, n0Var2);
            if (n0VarJ != null) {
                g2 g2Var2 = g2.IN_VARIANCE;
                p43.n0 n0VarJ2 = a2VarH.j(g2Var2, n0Var2);
                if (n0VarJ2 != null) {
                    H0.J0(n0VarJ2);
                }
                t23.u0 u0Var = this.f181687h;
                if (u0Var != null) {
                    d dVarB = u0Var.b(a2VarH);
                    dVar = dVarB != null ? dVarB : null;
                }
                t23.u0 u0Var2 = n0Var.f181677x;
                if (u0Var2 != null) {
                    p43.n0 n0VarJ3 = a2VarH.j(g2Var2, u0Var2.getType());
                    q0Var = n0VarJ3 == null ? null : new q0(H0, new j43.d(H0, n0VarJ3, u0Var2.getValue()), u0Var2.getAnnotations());
                } else {
                    q0Var = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (t23.u0 u0Var3 : n0Var.f181675v) {
                    p43.n0 n0VarJ4 = a2VarH.j(g2.IN_VARIANCE, u0Var3.getType());
                    if (n0VarJ4 == null) {
                        q0Var2 = q0Var4;
                        q0Var3 = q0Var2;
                    } else {
                        q0Var3 = q0Var4;
                        q0Var2 = new q0(H0, new j43.c(H0, n0VarJ4, ((j43.f) u0Var3.getValue()).a(), u0Var3.getValue()), u0Var3.getAnnotations());
                    }
                    if (q0Var2 != null) {
                        arrayList2.add(q0Var2);
                    }
                    q0Var4 = q0Var3;
                }
                ?? r24 = q0Var4;
                H0.K0(n0VarJ, arrayList, dVar, q0Var, arrayList2);
                o0 o0Var2 = n0Var.f181679z;
                if (o0Var2 == null) {
                    o0Var = r24;
                } else {
                    u23.h annotations = o0Var2.getAnnotations();
                    t23.a0 a0Var2 = this.f181681b;
                    t23.r visibility = n0Var.f181679z.getVisibility();
                    if (this.f181684e == t23.b.a.FAKE_OVERRIDE && t23.q.e(visibility.d())) {
                        visibility = t23.q.f162053h;
                    }
                    t23.r rVar2 = visibility;
                    o0 o0Var3 = n0Var.f181679z;
                    boolean z14 = o0Var3.f181654e;
                    boolean z15 = o0Var3.f181655f;
                    boolean z16 = o0Var3.f181658i;
                    t23.b.a aVar4 = this.f181684e;
                    t23.r0 r0Var2 = this.f181683d;
                    o0Var = new o0(H0, annotations, a0Var2, rVar2, z14, z15, z16, aVar4, r0Var2 == null ? r24 : r0Var2.getGetter(), t23.y0.f162076a);
                }
                if (o0Var != 0) {
                    o0 o0Var4 = n0Var.f181679z;
                    p43.n0 n0Var3 = o0Var4.f181692m;
                    o0Var.f181661l = o0Var4.y0() != null ? o0Var4.y0().b(a2VarH) : r24;
                    o0Var.G0(n0Var3 != null ? a2VarH.j(g2.OUT_VARIANCE, n0Var3) : r24);
                }
                t23.t0 t0Var = n0Var.A;
                if (t0Var == null) {
                    p0Var = r24;
                } else {
                    u23.h annotations2 = t0Var.getAnnotations();
                    t23.a0 a0Var3 = this.f181681b;
                    t23.r visibility2 = n0Var.A.getVisibility();
                    if (this.f181684e == t23.b.a.FAKE_OVERRIDE && t23.q.e(visibility2.d())) {
                        visibility2 = t23.q.f162053h;
                    }
                    t23.r rVar3 = visibility2;
                    boolean zN0 = n0Var.A.n0();
                    boolean zIsExternal = n0Var.A.isExternal();
                    boolean zIsInline = n0Var.A.isInline();
                    t23.b.a aVar5 = this.f181684e;
                    t23.r0 r0Var3 = this.f181683d;
                    p0Var = new p0(H0, annotations2, a0Var3, rVar3, zN0, zIsExternal, zIsInline, aVar5, r0Var3 == null ? r24 : r0Var3.getSetter(), t23.y0.f162076a);
                }
                if (p0Var != 0) {
                    a2Var = a2VarH;
                    List listG0 = x.G0(p0Var, n0Var.A.f(), a2Var, false, false, null);
                    if (listG0 == null) {
                        listG0 = Collections.singletonList(p0.F0(p0Var, f43.e.e(this.f181680a).o(), n0Var.A.f().get(0).getAnnotations()));
                    }
                    if (listG0.size() != 1) {
                        j20.x.h();
                        return null;
                    }
                    t23.t0 t0Var2 = n0Var.A;
                    if (t0Var2 == null) {
                        n0.y(31);
                        throw r24;
                    }
                    p0Var.f181661l = t0Var2.y0() != null ? t0Var2.y0().b(a2Var) : r24;
                    j1 j1Var = (j1) listG0.get(0);
                    if (j1Var == null) {
                        p0.y(6);
                        throw r24;
                    }
                    p0Var.f181696m = j1Var;
                } else {
                    a2Var = a2VarH;
                }
                u uVar = n0Var.B;
                ?? uVar2 = uVar == null ? r24 : new u(uVar.getAnnotations(), H0);
                u uVar3 = n0Var.C;
                H0.I0(o0Var, p0Var, uVar2, uVar3 == null ? r24 : new u(uVar3.getAnnotations(), H0));
                if (this.f181686g) {
                    z43.j.f202430c.getClass();
                    z43.j jVarA = z43.j.b.a();
                    Iterator<? extends t23.r0> it = n0Var.o().iterator();
                    while (it.hasNext()) {
                        jVarA.add(it.next().b(a2Var));
                    }
                    H0.f181666k = jVarA;
                }
                if (n0Var.isConst() && (aVar = n0Var.f181569h) != null) {
                    H0.E0(n0Var.f181568g, aVar);
                }
                return H0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t23.l lVar, t23.r0 r0Var, u23.h hVar, t23.a0 a0Var, t23.r rVar, boolean z14, x33.f fVar, t23.b.a aVar, t23.y0 y0Var, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        super(lVar, hVar, fVar, null, z14, y0Var);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (a0Var == null) {
            y(2);
            throw null;
        }
        if (rVar == null) {
            y(3);
            throw null;
        }
        if (fVar == null) {
            y(4);
            throw null;
        }
        if (aVar == null) {
            y(5);
            throw null;
        }
        if (y0Var == null) {
            y(6);
            throw null;
        }
        this.f181666k = null;
        this.f181675v = Collections.EMPTY_LIST;
        this.f181664i = a0Var;
        this.f181665j = rVar;
        this.f181667l = r0Var == null ? this : r0Var;
        this.f181668m = aVar;
        this.f181669n = z15;
        this.f181670o = z16;
        this.f181671p = z17;
        this.f181672q = z18;
        this.f181673r = z19;
        this.f181674t = z24;
    }

    public static n0 G0(t23.l lVar, u23.h hVar, t23.a0 a0Var, t23.r rVar, boolean z14, x33.f fVar, t23.b.a aVar, t23.y0 y0Var) {
        if (lVar == null) {
            y(7);
            throw null;
        }
        if (hVar == null) {
            y(8);
            throw null;
        }
        if (a0Var == null) {
            y(9);
            throw null;
        }
        if (rVar == null) {
            y(10);
            throw null;
        }
        if (fVar == null) {
            y(11);
            throw null;
        }
        if (aVar == null) {
            y(12);
            throw null;
        }
        if (y0Var != null) {
            return new n0(lVar, null, hVar, a0Var, rVar, z14, fVar, aVar, y0Var, false, false, false, false, false, false);
        }
        y(13);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        if (i14 != 28 && i14 != 38 && i14 != 39 && i14 != 41 && i14 != 42) {
            switch (i14) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 28 && i14 != 38 && i14 != 39 && i14 != 41 && i14 != 42) {
            switch (i14) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i15 = 2;
                    break;
                default:
                    i15 = 3;
                    break;
            }
        } else {
            i15 = 2;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i14 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i14 == 38) {
            objArr[1] = "getOriginal";
        } else if (i14 == 39) {
            objArr[1] = "getKind";
        } else if (i14 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i14 != 42) {
            switch (i14) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 28 && i14 != 38 && i14 != 39 && i14 != 41 && i14 != 42) {
            switch (i14) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // t23.k1
    public final boolean A0() {
        return this.f181669n;
    }

    @Override // t23.b
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final n0 f0(t23.l lVar, t23.a0 a0Var, t23.r rVar, t23.b.a aVar) {
        a aVar2 = new a();
        if (lVar == null) {
            a.a(0);
            throw null;
        }
        aVar2.f181680a = lVar;
        aVar2.f181683d = null;
        aVar2.f181681b = a0Var;
        if (rVar == null) {
            a.a(8);
            throw null;
        }
        aVar2.f181682c = rVar;
        if (aVar == null) {
            a.a(10);
            throw null;
        }
        aVar2.f181684e = aVar;
        aVar2.f181686g = false;
        n0 n0VarB = aVar2.b();
        if (n0VarB != null) {
            return n0VarB;
        }
        y(42);
        throw null;
    }

    @Override // w23.z0, t23.a
    public final t23.u0 H() {
        return this.f181676w;
    }

    public n0 H0(t23.l lVar, t23.a0 a0Var, t23.r rVar, t23.r0 r0Var, t23.b.a aVar, x33.f fVar, t23.y0 y0Var) {
        if (lVar == null) {
            y(32);
            throw null;
        }
        if (a0Var == null) {
            y(33);
            throw null;
        }
        if (rVar == null) {
            y(34);
            throw null;
        }
        if (aVar == null) {
            y(35);
            throw null;
        }
        if (fVar == null) {
            y(36);
            throw null;
        }
        if (y0Var == null) {
            y(37);
            throw null;
        }
        return new n0(lVar, r0Var, getAnnotations(), a0Var, rVar, this.f181567f, fVar, aVar, y0Var, this.f181669n, isConst(), this.f181671p, this.f181672q, isExternal(), this.f181674t);
    }

    @Override // w23.z0, t23.a
    public final t23.u0 I() {
        return this.f181677x;
    }

    public final void I0(o0 o0Var, p0 p0Var, u uVar, u uVar2) {
        this.f181679z = o0Var;
        this.A = p0Var;
        this.B = uVar;
        this.C = uVar2;
    }

    public void J0(p43.n0 n0Var) {
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.c(this, d14);
    }

    public final void K0(p43.n0 n0Var, List list, t23.u0 u0Var, q0 q0Var, List list2) {
        if (n0Var == null) {
            y(17);
            throw null;
        }
        if (list == null) {
            y(18);
            throw null;
        }
        if (list2 == null) {
            y(19);
            throw null;
        }
        this.f181780e = n0Var;
        this.f181678y = new ArrayList(list);
        this.f181677x = q0Var;
        this.f181676w = u0Var;
        this.f181675v = list2;
    }

    @Override // t23.z
    public final boolean O() {
        return this.f181671p;
    }

    @Override // t23.a
    public final List<t23.u0> S() {
        List<t23.u0> list = this.f181675v;
        if (list != null) {
            return list;
        }
        y(22);
        throw null;
    }

    @Override // t23.r0
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList(2);
        o0 o0Var = this.f181679z;
        if (o0Var != null) {
            arrayList.add(o0Var);
        }
        t23.t0 t0Var = this.A;
        if (t0Var != null) {
            arrayList.add(t0Var);
        }
        return arrayList;
    }

    @Override // t23.r0
    public final u Z() {
        return this.C;
    }

    @Override // w23.z0, w23.p, w23.o, t23.l
    public final t23.r0 a() {
        t23.r0 r0Var = this.f181667l;
        t23.r0 r0VarD0 = r0Var == this ? this : r0Var.a();
        if (r0VarD0 != null) {
            return r0VarD0;
        }
        y(38);
        throw null;
    }

    @Override // w23.z0, t23.k1, t23.a1
    public final t23.r0 b(a2 a2Var) {
        if (a2Var == null) {
            y(27);
            throw null;
        }
        if (a2Var.f135795a.e()) {
            return this;
        }
        a aVar = new a();
        w1 w1VarG = a2Var.g();
        if (w1VarG == null) {
            a.a(15);
            throw null;
        }
        aVar.f181685f = w1VarG;
        aVar.f181683d = a();
        return aVar.b();
    }

    @Override // t23.z
    public final t23.a0 g() {
        t23.a0 a0Var = this.f181664i;
        if (a0Var != null) {
            return a0Var;
        }
        y(24);
        throw null;
    }

    @Override // t23.r0
    public final u g0() {
        return this.B;
    }

    @Override // t23.r0
    public final o0 getGetter() {
        return this.f181679z;
    }

    @Override // t23.b
    public final t23.b.a getKind() {
        t23.b.a aVar = this.f181668m;
        if (aVar != null) {
            return aVar;
        }
        y(39);
        throw null;
    }

    @Override // w23.z0, t23.a
    public final p43.n0 getReturnType() {
        p43.n0 type = getType();
        if (type != null) {
            return type;
        }
        y(23);
        throw null;
    }

    @Override // t23.r0
    public final t23.t0 getSetter() {
        return this.A;
    }

    @Override // w23.z0, t23.a
    public final List<d1> getTypeParameters() {
        ArrayList arrayList = this.f181678y;
        if (arrayList != null) {
            return arrayList;
        }
        com.google.firebase.messaging.l.n(this, "typeParameters == null for ");
        return null;
    }

    @Override // t23.o
    public final t23.r getVisibility() {
        t23.r rVar = this.f181665j;
        if (rVar != null) {
            return rVar;
        }
        y(25);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t23.b
    public final void i0(Collection<? extends t23.b> collection) {
        if (collection != 0) {
            this.f181666k = collection;
        } else {
            y(40);
            throw null;
        }
    }

    public boolean isConst() {
        return this.f181670o;
    }

    public boolean isExternal() {
        return this.f181673r;
    }

    @Override // t23.r0
    public final boolean m0() {
        return this.f181674t;
    }

    @Override // w23.z0, t23.a
    public final Collection<? extends t23.r0> o() {
        Collection<? extends t23.r0> collection = this.f181666k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        y(41);
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return this.f181672q;
    }

    public <V> V v(t23.a.InterfaceC3056a<V> interfaceC3056a) {
        return null;
    }
}
