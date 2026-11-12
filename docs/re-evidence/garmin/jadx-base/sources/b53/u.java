package b53;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n23.f2;
import n23.t3;
import n23.w3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.y;
import p43.l1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0007J\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0007J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u0013\u0010\u0019\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0013\u0010\u001a\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0007J\u0013\u0010\u001b\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\b*\u00020\u001c2\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0007J\u001d\u0010*\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,*\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u0002022\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b00H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010:\u001a\u0004\u0018\u00010\u001c*\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lb53/u;", "Lt43/p;", "<init>", "()V", "Lt43/m;", "", "isError", "(Lt43/m;)Z", "Lt43/h;", "isUninferredParameter", "(Lt43/h;)Z", "Lt43/i;", "makeDefinitelyNotNullOrNotNull", "(Lt43/i;)Lt43/i;", "isStubTypeForVariableInSubtyping", "(Lt43/i;)Z", "unwrapStubTypeVariableConstructor", "(Lt43/m;)Lt43/m;", "Lt43/l;", "newType", "replaceType", "(Lt43/l;Lt43/h;)Lt43/l;", "isInterface", "isIntegerLiteralConstantTypeConstructor", "isIntegerConstantOperatorTypeConstructor", "isLocalType", "isAnonymous", "isTypeParameterTypeConstructor", "Lt43/n;", "", "upperBoundCount", "(Lt43/n;)I", FirebaseAnalytics.Param.INDEX, "getUpperBound", "(Lt43/n;I)Lt43/h;", NotificationConstants.KEY_DATA_MIME_TYPE, "captureFromExpression", "(Lt43/h;)Lt43/h;", "isArrayConstructor", "", "Lt43/j;", "types", "intersectTypes", "(Ljava/util/Collection;)Lt43/j;", "", "Lkotlin/reflect/jvm/internal/impl/types/model/AnnotationMarker;", "getAttributes", "(Lt43/h;)Ljava/util/List;", "", "map", "Lt43/o;", "typeSubstitutorByTypeConstructor", "(Ljava/util/Map;)Lt43/o;", "createEmptySubstitutor", "()Lt43/o;", "Lt43/s;", "getTypeParameter", "(Lorg/jetbrains/kotlin/types/model/TypeVariableTypeConstructorMarker;)Lorg/jetbrains/kotlin/types/model/TypeParameterMarker;", "typeParameter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements t43.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16150a = new u();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16151a;

        static {
            int[] iArr = new int[k23.s.values().length];
            try {
                iArr[k23.s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k23.s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k23.s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16151a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b53/u$b", "Lp43/l1$c$a;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends l1.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f16152a;

        public b(o oVar) {
            this.f16152a = oVar;
        }

        @Override // p43.l1.c
        public final t43.i a(l1 l1Var, t43.h hVar) {
            l1Var.getClass();
            hVar.getClass();
            k23.p pVar = this.f16152a.a((k23.p) u.f16150a.A0(hVar)).f102464b;
            pVar.getClass();
            return (b53.a) pVar;
        }
    }

    private u() {
    }

    public static t43.t H0(k23.s sVar) {
        int i14 = a.f16151a[sVar.ordinal()];
        if (i14 == 1) {
            return t43.t.INV;
        }
        if (i14 == 2) {
            return t43.t.IN;
        }
        if (i14 == 3) {
            return t43.t.OUT;
        }
        u0.r();
        return null;
    }

    public static void I0(Object obj) {
        throw new w3(org.apache.commons.lang3.e.f("This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue", obj));
    }

    @Override // t43.p
    public final t43.i A(t43.i iVar, t43.b bVar) {
        List<k23.r> listH;
        int i14;
        bVar.getClass();
        k23.p pVar = (k23.p) iVar;
        k23.e f105782a = pVar.getF105782a();
        k23.d dVar = f105782a instanceof k23.d ? (k23.d) f105782a : null;
        if (dVar != null && ((listH = pVar.h()) == null || !listH.isEmpty())) {
            Iterator<T> it = listH.iterator();
            while (it.hasNext()) {
                if (((k23.r) it.next()).f102463a != k23.s.INVARIANT) {
                    List<k23.q> listA = f.a(dVar);
                    if (listA.size() != listH.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(y.r(listH, 10));
                    Iterator<T> it3 = listH.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        k23.r rVarA = (k23.r) it3.next();
                        k23.s sVar = rVarA.f102463a;
                        if (sVar != k23.s.INVARIANT) {
                            k23.p pVar2 = rVarA.f102464b;
                            if (sVar != k23.s.IN) {
                                pVar2 = null;
                            }
                            k23.r.a aVar = k23.r.f102461c;
                            b53.b bVar2 = new b53.b(pVar2, new c(rVarA), false);
                            aVar.getClass();
                            rVarA = k23.r.a.a(bVar2);
                        }
                        arrayList.add(rVarA);
                    }
                    o.f16137b.getClass();
                    o oVar = new o(p13.u0.l(h0.k1(f.a(dVar), arrayList)));
                    int size = listH.size();
                    for (i14 = 0; i14 < size; i14++) {
                        k23.r rVar = listH.get(i14);
                        if (rVar.f102463a != k23.s.INVARIANT) {
                            List<k23.p> upperBounds = listA.get(i14).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it4 = upperBounds.iterator();
                            while (it4.hasNext()) {
                                k23.p pVar3 = oVar.a((k23.p) it4.next()).f102464b;
                                pVar3.getClass();
                                arrayList2.add(pVar3);
                            }
                            if (rVar.f102463a == k23.s.OUT) {
                                k23.p pVar4 = rVar.f102464b;
                                pVar4.getClass();
                                arrayList2.add(pVar4);
                            }
                            k23.p pVar5 = ((k23.r) arrayList.get(i14)).f102464b;
                            pVar5.getClass();
                            c cVar = ((b53.b) pVar5).f16113c;
                            cVar.getClass();
                            cVar.f16117b = arrayList2;
                        }
                    }
                    boolean f16155d = pVar.getF16114d();
                    List<Annotation> annotations = pVar.getAnnotations();
                    boolean z14 = pVar instanceof b53.a;
                    b53.a aVar2 = z14 ? (b53.a) pVar : null;
                    k23.p f16157f = aVar2 != null ? aVar2.getF16157f() : null;
                    b53.a aVar3 = z14 ? (b53.a) pVar : null;
                    return new v(dVar, arrayList, f16155d, annotations, f16157f, false, false, false, aVar3 != null ? aVar3.e() : null, null, 512, null);
                }
            }
        }
        return null;
    }

    @Override // t43.p
    public final t43.i A0(t43.h hVar) {
        hVar.getClass();
        t43.f fVarY0 = y0(hVar);
        if (fVarY0 != null) {
            return b(fVarY0);
        }
        t43.i iVarT0 = t0(hVar);
        iVarT0.getClass();
        return iVarT0;
    }

    @Override // t43.p
    public final boolean B0(t43.i iVar) {
        iVar.getClass();
        return G0(iVar) != null;
    }

    @Override // t43.p
    public final boolean C(t43.h hVar) {
        hVar.getClass();
        return false;
    }

    @Override // t43.p
    public final boolean C0(t43.m mVar) {
        return false;
    }

    @Override // t43.p
    public final boolean D(t43.h hVar) {
        hVar.getClass();
        t43.i iVarT0 = t0(hVar);
        return (iVarT0 != null ? G0(iVarT0) : null) != null;
    }

    @Override // t43.p
    public final t43.l D0(t43.c cVar) {
        return new n(((c) cVar).f16116a);
    }

    @Override // t43.p
    public final boolean E(t43.i iVar) {
        iVar.getClass();
        t43.m mVarF0 = F0(iVar);
        mVarF0.getClass();
        return mVarF0 instanceof k23.d;
    }

    @Override // t43.p
    public final Collection<t43.h> E0(t43.m mVar) {
        mVar.getClass();
        if (mVar instanceof k23.d) {
            List<k23.p> listB = ((k23.d) mVar).b();
            ArrayList arrayList = new ArrayList(y.r(listB, 10));
            for (k23.p pVar : listB) {
                pVar.getClass();
                arrayList.add((t43.h) pVar);
            }
            return arrayList;
        }
        if (mVar instanceof k23.q) {
            List<k23.p> upperBounds = ((k23.q) mVar).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(y.r(upperBounds, 10));
            for (k23.p pVar2 : upperBounds) {
                pVar2.getClass();
                arrayList2.add((t43.h) pVar2);
            }
            return arrayList2;
        }
        if (!(mVar instanceof c)) {
            StringBuilder sbJ = p6.b.j("Unsupported type constructor: ", mVar, " (");
            sbJ.append(mVar.getClass().getName());
            sbJ.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new IllegalStateException(sbJ.toString().toString());
        }
        ArrayList<k23.p> arrayList3 = ((c) mVar).f16117b;
        if (arrayList3 == null) {
            p005kotlin.jvm.internal.s.m("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        for (k23.p pVar3 : arrayList3) {
            pVar3.getClass();
            arrayList4.add((t43.h) pVar3);
        }
        return arrayList4;
    }

    @Override // t43.p
    public final int F(t43.m mVar) {
        mVar.getClass();
        if (mVar instanceof k23.d) {
            return f.a((k23.d) mVar).size();
        }
        return 0;
    }

    @Override // t43.p
    public final t43.m F0(t43.i iVar) {
        iVar.getClass();
        if (iVar instanceof b53.b) {
            return ((b53.b) iVar).f16113c;
        }
        b53.a aVar = (b53.a) iVar;
        if (aVar.getF16159h()) {
            return t.f16148b;
        }
        k23.e f105782a = aVar.getF105782a();
        f2 f2Var = f105782a instanceof f2 ? (f2) f105782a : null;
        if (f2Var != null) {
            Class<?> clsJ = f2Var.j();
            clsJ.getClass();
            Class<?> componentType = clsJ.getComponentType();
            if (componentType != null && !componentType.isPrimitive()) {
                return (t43.m) s0.f105811a.b(Object[].class);
            }
        }
        k23.e eVarE = aVar.e();
        if (eVarE == null) {
            eVarE = aVar.getF105782a();
        }
        eVarE.getClass();
        return (t43.m) eVarE;
    }

    @Override // t43.p
    public final t43.m G(t43.h hVar) {
        hVar.getClass();
        t43.i iVarT0 = t0(hVar);
        if (iVarT0 == null) {
            iVarT0 = A0(hVar);
        }
        return F0(iVarT0);
    }

    public final t43.e G0(t43.i iVar) {
        iVar.getClass();
        if ((iVar instanceof b53.a) && ((b53.a) iVar).getF16158g()) {
            return (t43.e) iVar;
        }
        return null;
    }

    @Override // t43.p
    public final boolean H(t43.l lVar) {
        lVar.getClass();
        k23.r rVar = ((n) lVar).f16136a;
        k23.r.f102461c.getClass();
        return rVar.equals(k23.r.f102462d);
    }

    @Override // t43.p
    public final t43.n I(t43.s sVar) {
        I0(sVar);
        throw null;
    }

    @Override // t43.p
    public final Collection<t43.h> J(t43.i iVar) {
        I0(iVar);
        throw null;
    }

    @Override // t43.p
    public final boolean K(t43.d dVar) {
        return false;
    }

    @Override // t43.p
    public final t43.c L(t43.d dVar) {
        return ((b53.b) dVar).f16113c;
    }

    @Override // t43.p
    public final boolean M(t43.h hVar) {
        hVar.getClass();
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final t43.b N(t43.d dVar) {
        return t43.b.FOR_SUBTYPING;
    }

    @Override // t43.p
    public final t43.h O(ArrayList arrayList) {
        I0(this);
        throw null;
    }

    @Override // t43.p
    public final boolean P(t43.m mVar, t43.m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        return mVar.equals(mVar2);
    }

    @Override // t43.p
    public final t43.t Q(t43.n nVar) {
        nVar.getClass();
        return H0(((k23.q) nVar).getF122626d());
    }

    @Override // t43.p
    public final t43.n R(t43.m mVar) {
        I0(mVar);
        throw null;
    }

    @Override // t43.p
    public final boolean S(t43.d dVar) {
        return false;
    }

    @Override // t43.p
    public final boolean T(t43.h hVar) {
        hVar.getClass();
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final boolean U(t43.h hVar) {
        hVar.getClass();
        return false;
    }

    @Override // t43.p
    public final boolean V(t43.m mVar) {
        return false;
    }

    @Override // t43.p
    public final boolean W(t43.h hVar) {
        hVar.getClass();
        return ((k23.p) A0(hVar)).getF16114d() != ((k23.p) k(hVar)).getF16114d();
    }

    @Override // t43.p
    public final boolean X(t43.i iVar) {
        iVar.getClass();
        if (!c0(G(iVar))) {
            return false;
        }
        I0(iVar);
        throw null;
    }

    @Override // t43.p
    public final boolean Y(t43.m mVar) {
        return mVar instanceof k23.d;
    }

    @Override // t43.p
    public final t43.l Z(t43.k kVar, int i14) {
        kVar.getClass();
        if (kVar instanceof t43.j) {
            return h((t43.h) kVar, i14);
        }
        if (kVar instanceof t43.a) {
            t43.l lVar = ((t43.a) kVar).get(i14);
            lVar.getClass();
            return lVar;
        }
        StringBuilder sb3 = new StringBuilder("unknown type argument list type: ");
        sb3.append(kVar);
        o2.c.o(sb3, ", ", s0.f105811a.b(kVar.getClass()));
        return null;
    }

    @Override // t43.p
    public final t43.i a(t43.f fVar) {
        b53.a aVarH = ((b53.a) fVar).getF16134c();
        aVarH.getClass();
        return aVarH;
    }

    @Override // t43.p
    public final boolean a0(t43.i iVar) {
        t43.d dVar = null;
        if (y0(iVar) != null) {
            iVar = null;
        }
        if (iVar != null) {
            t43.j jVarF = f(iVar);
            if (jVarF instanceof t43.d) {
                dVar = (t43.d) jVarF;
            }
        }
        return dVar != null;
    }

    @Override // t43.p
    public final t43.i b(t43.f fVar) {
        b53.a aVarE = ((b53.a) fVar).getF16133b();
        aVarE.getClass();
        return aVarE;
    }

    @Override // t43.p
    public final boolean b0(t43.i iVar) {
        return false;
    }

    @Override // t43.p
    public final t43.i c(t43.i iVar) {
        return ((b53.a) iVar).G(false);
    }

    @Override // t43.p
    public final boolean c0(t43.m mVar) {
        mVar.getClass();
        return mVar.equals(s0.f105811a.b(Void.class));
    }

    @Override // t43.p
    public final boolean d0(t43.h hVar) {
        hVar.getClass();
        return !p005kotlin.jvm.internal.s.g(F0(A0(hVar)), F0(k(hVar)));
    }

    @Override // t43.p
    public final boolean e0(t43.m mVar) {
        return !(mVar instanceof c);
    }

    @Override // t43.p
    public final t43.j f(t43.i iVar) {
        t43.e eVarG0 = G0(iVar);
        if (eVarG0 == null) {
            return (t43.j) iVar;
        }
        I0(eVarG0);
        throw null;
    }

    @Override // t43.p
    public final List<t43.n> f0(t43.m mVar) {
        I0(mVar);
        throw null;
    }

    @Override // t43.p
    public final int g(t43.h hVar) {
        hVar.getClass();
        return ((k23.p) hVar).h().size();
    }

    @Override // t43.p
    public final t43.l h(t43.h hVar, int i14) {
        hVar.getClass();
        return new n(((k23.p) hVar).h().get(i14));
    }

    @Override // t43.p
    public final t43.n i(t43.m mVar, int i14) {
        k23.q qVar = f.a((k23.d) mVar).get(i14);
        qVar.getClass();
        return (t3) qVar;
    }

    @Override // t43.p
    public final t43.l i0(t43.h hVar) {
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final t43.h j(t43.h hVar) {
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final t43.d j0(t43.i iVar) {
        t43.j jVarF = f(iVar);
        if (jVarF instanceof t43.d) {
            return (t43.d) jVarF;
        }
        return null;
    }

    @Override // t43.p
    public final t43.i k(t43.h hVar) {
        hVar.getClass();
        t43.f fVarY0 = y0(hVar);
        if (fVarY0 != null) {
            return a(fVarY0);
        }
        t43.i iVarT0 = t0(hVar);
        iVarT0.getClass();
        return iVarT0;
    }

    @Override // t43.p
    public final boolean k0(t43.m mVar) {
        return mVar.equals(s0.f105811a.b(Object.class));
    }

    @Override // t43.p
    public final void l(t43.i iVar, t43.m mVar) {
    }

    @Override // t43.p
    public final List<t43.l> l0(t43.h hVar) {
        hVar.getClass();
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final t43.l m(t43.i iVar, int i14) {
        if (i14 < 0 || i14 >= g(iVar)) {
            return null;
        }
        return h(iVar, i14);
    }

    @Override // t43.p
    public final t43.t n(t43.l lVar) {
        t43.t tVarH0;
        lVar.getClass();
        k23.s sVar = ((n) lVar).f16136a.f102463a;
        return (sVar == null || (tVarH0 = H0(sVar)) == null) ? t43.t.OUT : tVarH0;
    }

    @Override // t43.p
    public final int o(t43.k kVar) {
        kVar.getClass();
        if (kVar instanceof t43.i) {
            return g((t43.h) kVar);
        }
        if (kVar instanceof t43.a) {
            return ((t43.a) kVar).size();
        }
        StringBuilder sb3 = new StringBuilder("unknown type argument list type: ");
        sb3.append(kVar);
        o2.c.o(sb3, ", ", s0.f105811a.b(kVar.getClass()));
        return 0;
    }

    @Override // t43.p
    public final boolean o0(t43.i iVar) {
        iVar.getClass();
        return false;
    }

    @Override // t43.p
    public final t43.h p(t43.l lVar) {
        lVar.getClass();
        return (t43.h) ((n) lVar).f16136a.f102464b;
    }

    @Override // t43.p
    public final boolean p0(t43.h hVar) {
        hVar.getClass();
        return false;
    }

    @Override // t43.p
    public final l1.c q0(t43.i iVar) {
        k23.p pVar = (k23.p) iVar;
        o.f16137b.getClass();
        u uVar = f16150a;
        t43.m mVarF0 = uVar.F0((b53.a) pVar);
        int iF = uVar.F(mVarF0);
        ArrayList arrayList = new ArrayList(iF);
        for (int i14 = 0; i14 < iF; i14++) {
            arrayList.add((k23.q) uVar.i(mVarF0, i14));
        }
        return new b(!arrayList.isEmpty() ? new o(p13.u0.l(h0.k1(arrayList, pVar.h()))) : o.f16138c);
    }

    @Override // t43.p
    public final boolean r(t43.h hVar) {
        hVar.getClass();
        return ((k23.p) hVar).getF16114d();
    }

    @Override // t43.p
    public final t43.h s(t43.h hVar) {
        I0(hVar);
        throw null;
    }

    @Override // t43.p
    public final boolean s0(t43.i iVar) {
        F0(iVar).getClass();
        return false;
    }

    @Override // t43.p
    public final t43.i t0(t43.h hVar) {
        hVar.getClass();
        if (y0(hVar) != null) {
            return null;
        }
        return (t43.i) hVar;
    }

    @Override // t43.p
    public final boolean u(t43.m mVar) {
        c33.h0 h0Var;
        if (!(mVar instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) mVar;
        Class<T> cls = f2Var.f122441d;
        c33.f fVarV = f2Var.V();
        if (fVarV == null || (h0Var = (c33.h0) c33.a.f24124b.a(fVarV, c33.a.f24123a[7])) == null) {
            if (cls.isAnnotation() || cls.isEnum()) {
                h0Var = c33.h0.FINAL;
            } else {
                z23.b.f202025a.getClass();
                if (p005kotlin.jvm.internal.s.g(z23.b.b(cls), Boolean.TRUE)) {
                    h0Var = c33.h0.SEALED;
                } else if (Modifier.isAbstract(cls.getModifiers())) {
                    h0Var = c33.h0.ABSTRACT;
                } else {
                    h0Var = !Modifier.isFinal(cls.getModifiers()) ? c33.h0.OPEN : c33.h0.FINAL;
                }
            }
        }
        return (h0Var != c33.h0.FINAL || f2Var.T() == c33.b.ENUM_CLASS || f2Var.T() == c33.b.ENUM_ENTRY || f2Var.T() == c33.b.ANNOTATION_CLASS) ? false : true;
    }

    @Override // t43.p
    public final boolean u0(t43.n nVar, t43.m mVar) {
        I0(nVar);
        throw null;
    }

    @Override // t43.p
    public final t43.h w(t43.d dVar) {
        return (t43.h) ((b53.b) dVar).f16112b;
    }

    @Override // t43.p
    public final t43.k w0(t43.i iVar) {
        iVar.getClass();
        return (t43.k) iVar;
    }

    @Override // t43.p
    public final boolean x(t43.h hVar) {
        return y0(hVar) != null;
    }

    @Override // t43.p
    public final t43.d y(t43.j jVar) {
        if (jVar instanceof t43.d) {
            return (t43.d) jVar;
        }
        return null;
    }

    @Override // t43.p
    public final t43.f y0(t43.h hVar) {
        hVar.getClass();
        if (!(hVar instanceof b53.a) || ((b53.a) hVar).getF16133b() == null) {
            return null;
        }
        return (t43.f) hVar;
    }

    @Override // t43.r
    public final boolean z0(t43.i iVar, t43.i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        return false;
    }
}
