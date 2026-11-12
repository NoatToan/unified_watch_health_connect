package a43;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.lookup.StringLookupFactory;
import p005kotlin.Unit;
import p43.d2;
import p43.e1;
import p43.f2;
import p43.h2;
import p43.m1;
import p43.t1;
import p43.v0;
import t23.c1;
import t23.d1;
import t23.j1;
import t23.k1;
import t23.r0;
import t23.t0;
import t23.u0;
import w23.k0;
import w23.m0;
import w23.n0;
import w23.o0;
import w23.p0;
import w23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends n implements y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1179g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f1181f;

    public final class a implements t23.n<Unit, StringBuilder> {

        /* JADX INFO: renamed from: a43.w$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0013a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1183a;

            static {
                int[] iArr = new int[h0.values().length];
                try {
                    iArr[h0.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h0.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h0.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1183a = iArr;
            }
        }

        public a() {
        }

        @Override // t23.n
        public final Object a(o0 o0Var, Object obj) throws IOException {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            o(o0Var, sb3, "getter");
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object b(p0 p0Var, Object obj) throws IOException {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            o(p0Var, sb3, "setter");
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object c(n0 n0Var, Object obj) throws IOException {
            StringBuilder sb3 = (StringBuilder) obj;
            n0Var.getClass();
            sb3.getClass();
            w.q(w.this, n0Var, sb3);
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object d(w23.e0 e0Var, Object obj) throws IOException {
            t23.d dVarS;
            String str;
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            w wVar = w.this;
            c0 c0Var = wVar.f1180e;
            boolean z14 = e0Var.getKind() == t23.f.ENUM_ENTRY;
            if (!wVar.t()) {
                List<u0> listR0 = e0Var.r0();
                listR0.getClass();
                wVar.C(sb3, listR0);
                wVar.z(sb3, e0Var, null);
                if (!z14) {
                    t23.r visibility = e0Var.getVisibility();
                    visibility.getClass();
                    wVar.g0(visibility, sb3);
                }
                if ((e0Var.getKind() != t23.f.INTERFACE || e0Var.g() != t23.a0.ABSTRACT) && (!e0Var.getKind().a() || e0Var.g() != t23.a0.FINAL)) {
                    t23.a0 a0VarG = e0Var.g();
                    a0VarG.getClass();
                    wVar.L(a0VarG, sb3, w.x(e0Var));
                }
                wVar.K(e0Var, sb3);
                wVar.N(sb3, wVar.s().contains(x.INNER) && e0Var.l(), "inner");
                wVar.N(sb3, wVar.s().contains(x.DATA) && e0Var.U(), "data");
                wVar.N(sb3, wVar.s().contains(x.INLINE) && e0Var.isInline(), "inline");
                wVar.N(sb3, wVar.s().contains(x.VALUE) && e0Var.k(), "value");
                wVar.N(sb3, wVar.s().contains(x.FUN) && e0Var.t0(), "fun");
                n.f1163a.getClass();
                if (e0Var instanceof c1) {
                    str = "typealias";
                } else if (e0Var.s0()) {
                    str = "companion object";
                } else {
                    switch (n.a.C0012a.f1167a[e0Var.getKind().ordinal()]) {
                        case 1:
                            str = Action.CLASS_ATTRIBUTE;
                            break;
                        case 2:
                            str = "interface";
                            break;
                        case 3:
                            str = "enum class";
                            break;
                        case 4:
                            str = "object";
                            break;
                        case 5:
                            str = "annotation class";
                            break;
                        case 6:
                            str = "enum entry";
                            break;
                        default:
                            lc.u0.r();
                            return null;
                    }
                }
                sb3.append(wVar.I(str));
            }
            if (b43.i.k(e0Var)) {
                if (((Boolean) c0Var.G.getValue(c0Var, c0.Y[31])).booleanValue()) {
                    if (wVar.t()) {
                        sb3.append("companion object");
                    }
                    w.V(sb3);
                    t23.l lVarD = e0Var.d();
                    if (lVarD != null) {
                        sb3.append("of ");
                        x33.f name = lVarD.getName();
                        name.getClass();
                        sb3.append(wVar.p(name, false));
                    }
                }
                if (wVar.w() || !p005kotlin.jvm.internal.s.g(e0Var.getName(), x33.h.f188611c)) {
                    if (!wVar.t()) {
                        w.V(sb3);
                    }
                    x33.f name2 = e0Var.getName();
                    name2.getClass();
                    sb3.append(wVar.p(name2, true));
                }
            } else {
                if (!wVar.t()) {
                    w.V(sb3);
                }
                wVar.O(e0Var, sb3, true);
            }
            if (!z14) {
                List<d1> listQ = e0Var.q();
                listQ.getClass();
                wVar.b0(sb3, listQ, false);
                wVar.A(e0Var, sb3);
                if (!e0Var.getKind().a() && ((Boolean) c0Var.f1117i.getValue(c0Var, c0.Y[7])).booleanValue() && (dVarS = e0Var.s()) != null) {
                    sb3.append(StringUtils.SPACE);
                    wVar.z(sb3, dVarS, null);
                    t23.r visibility2 = dVarS.getVisibility();
                    visibility2.getClass();
                    wVar.g0(visibility2, sb3);
                    sb3.append(wVar.I("constructor"));
                    List<j1> listF = dVarS.f();
                    listF.getClass();
                    wVar.f0(sb3, listF, dVarS.M());
                }
                if (!((Boolean) c0Var.f1132x.getValue(c0Var, c0.Y[22])).booleanValue() && !p005kotlin.reflect.jvm.internal.impl.builtins.d.F(e0Var.p())) {
                    Collection<p43.n0> collectionB = e0Var.h().b();
                    collectionB.getClass();
                    if (!collectionB.isEmpty() && (collectionB.size() != 1 || !p005kotlin.reflect.jvm.internal.impl.builtins.d.y(collectionB.iterator().next()))) {
                        w.V(sb3);
                        sb3.append(": ");
                        p13.h0.j0(collectionB, sb3, ", ", null, null, new u(wVar), 60);
                    }
                }
                wVar.h0(sb3, listQ);
            }
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object e(x0 x0Var, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w.this.e0(x0Var, true, sb3, true);
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object f(w23.c0 c0Var, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w wVar = w.this;
            wVar.getClass();
            x33.c cVar = c0Var.f181580d;
            sb3.append(wVar.I("package"));
            String strO = wVar.o(cVar.f188596a);
            if (strO.length() > 0) {
                sb3.append(StringUtils.SPACE);
                sb3.append(strO);
            }
            if (wVar.f1180e.n()) {
                sb3.append(" in context of ");
                wVar.O(c0Var.f181579c, sb3, false);
            }
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object g(w23.i iVar, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w.this.Z(iVar, sb3, true);
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object h(w23.i0 i0Var, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w.this.O(i0Var, sb3, true);
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object i(w23.d dVar, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            sb3.append(dVar.getName());
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object j(k0 k0Var, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w wVar = w.this;
            wVar.getClass();
            x33.c cVar = k0Var.f181639e;
            sb3.append(wVar.I("package-fragment"));
            String strO = wVar.o(cVar.f188596a);
            if (strO.length() > 0) {
                sb3.append(StringUtils.SPACE);
                sb3.append(strO);
            }
            if (wVar.f1180e.n()) {
                sb3.append(" in ");
                wVar.O(k0Var.d(), sb3, false);
            }
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final /* bridge */ /* synthetic */ Unit k(t23.v vVar, StringBuilder sb3) throws IOException {
            n(vVar, sb3);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0045  */
        @Override // t23.n
        public final Object l(w23.k kVar, Object obj) throws IOException {
            boolean z14;
            t23.d dVarS;
            boolean z15 = kVar.I;
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w wVar = w.this;
            wVar.getClass();
            wVar.z(sb3, kVar, null);
            c0 c0Var = wVar.f1180e;
            b0 b0Var = c0Var.f1123o;
            k23.l<?>[] lVarArr = c0.Y;
            if (((Boolean) b0Var.getValue(c0Var, lVarArr[13])).booleanValue() || kVar.e0().g() != t23.a0.SEALED) {
                t23.r visibility = kVar.getVisibility();
                visibility.getClass();
                if (wVar.g0(visibility, sb3)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            wVar.J(kVar, sb3);
            boolean z16 = ((Boolean) c0Var.P.getValue(c0Var, lVarArr[40])).booleanValue() || !z15 || z14;
            if (z16) {
                sb3.append(wVar.I("constructor"));
            }
            t23.e eVarO0 = kVar.d();
            eVarO0.getClass();
            if (((Boolean) c0Var.A.getValue(c0Var, lVarArr[25])).booleanValue()) {
                if (z16) {
                    sb3.append(StringUtils.SPACE);
                }
                wVar.O(eVarO0, sb3, true);
                wVar.b0(sb3, kVar.getTypeParameters(), false);
            }
            List<j1> listF = kVar.f();
            listF.getClass();
            wVar.f0(sb3, listF, kVar.M());
            if (((Boolean) c0Var.f1125q.getValue(c0Var, lVarArr[15])).booleanValue() && !z15 && (dVarS = eVarO0.s()) != null) {
                List<j1> listF2 = dVarS.f();
                ArrayList arrayListL = androidx.core.view.j.l(listF2);
                for (Object obj2 : listF2) {
                    j1 j1Var = (j1) obj2;
                    if (!j1Var.h0() && j1Var.R() == null) {
                        arrayListL.add(obj2);
                    }
                }
                if (!arrayListL.isEmpty()) {
                    sb3.append(" : ");
                    sb3.append(wVar.I("this"));
                    sb3.append(p13.h0.k0(arrayListL, ", ", "(", ")", t.f1176a, 24));
                }
            }
            if (((Boolean) c0Var.A.getValue(c0Var, c0.Y[25])).booleanValue()) {
                wVar.h0(sb3, kVar.getTypeParameters());
            }
            return Unit.INSTANCE;
        }

        @Override // t23.n
        public final Object m(w23.h hVar, Object obj) {
            StringBuilder sb3 = (StringBuilder) obj;
            sb3.getClass();
            int i14 = w.f1179g;
            w wVar = w.this;
            wVar.getClass();
            wVar.z(sb3, hVar, null);
            t23.r rVar = hVar.f181603f;
            rVar.getClass();
            wVar.g0(rVar, sb3);
            wVar.K(hVar, sb3);
            sb3.append(wVar.I("typealias"));
            sb3.append(StringUtils.SPACE);
            wVar.O(hVar, sb3, true);
            wVar.b0(sb3, hVar.q(), false);
            wVar.A(hVar, sb3);
            sb3.append(" = ");
            sb3.append(wVar.W(((n43.i0) hVar).z0()));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:58:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:59:0x01aa  */
        public final void n(t23.v vVar, StringBuilder sb3) throws IOException {
            String strW;
            boolean z14;
            sb3.getClass();
            w wVar = w.this;
            c0 c0Var = wVar.f1180e;
            c0 c0Var2 = wVar.f1180e;
            if (!wVar.t()) {
                b0 b0Var = c0Var2.f1115g;
                k23.l<?>[] lVarArr = c0.Y;
                if (!((Boolean) b0Var.getValue(c0Var2, lVarArr[5])).booleanValue()) {
                    List<u0> listS = vVar.S();
                    listS.getClass();
                    wVar.C(sb3, listS);
                    wVar.z(sb3, vVar, null);
                    t23.r visibility = vVar.getVisibility();
                    visibility.getClass();
                    wVar.g0(visibility, sb3);
                    wVar.M(vVar, sb3);
                    if (((Boolean) c0Var2.T.getValue(c0Var2, lVarArr[44])).booleanValue()) {
                        wVar.K(vVar, sb3);
                    }
                    wVar.R(vVar, sb3);
                    if (((Boolean) c0Var2.T.getValue(c0Var2, lVarArr[44])).booleanValue()) {
                        boolean z15 = false;
                        if (vVar.isOperator()) {
                            Collection<? extends t23.b> collectionO = vVar.o();
                            collectionO.getClass();
                            Collection<? extends t23.b> collection = collectionO;
                            if (!collection.isEmpty()) {
                                Iterator<T> it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((t23.v) it.next()).isOperator()) {
                                            if (!((Boolean) c0Var2.O.getValue(c0Var2, c0.Y[39])).booleanValue()) {
                                                z14 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (vVar.isInfix()) {
                            Collection<? extends t23.b> collectionO2 = vVar.o();
                            collectionO2.getClass();
                            Collection<? extends t23.b> collection2 = collectionO2;
                            if (!collection2.isEmpty()) {
                                Iterator<T> it3 = collection2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((t23.v) it3.next()).isInfix()) {
                                            if (!((Boolean) c0Var2.O.getValue(c0Var2, c0.Y[39])).booleanValue()) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    z15 = true;
                                    break;
                                }
                            }
                            z15 = true;
                            break;
                        }
                        wVar.N(sb3, vVar.W(), "tailrec");
                        wVar.N(sb3, vVar.isSuspend(), "suspend");
                        wVar.N(sb3, vVar.isInline(), "inline");
                        wVar.N(sb3, z15, "infix");
                        wVar.N(sb3, z14, "operator");
                    } else {
                        wVar.N(sb3, vVar.isSuspend(), "suspend");
                    }
                    wVar.J(vVar, sb3);
                    if (wVar.w()) {
                        if (vVar.C0()) {
                            sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (vVar.C()) {
                            sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                sb3.append(wVar.I("fun"));
                sb3.append(StringUtils.SPACE);
                List<d1> typeParameters = vVar.getTypeParameters();
                typeParameters.getClass();
                wVar.b0(sb3, typeParameters, true);
                wVar.T(vVar, sb3);
            }
            wVar.O(vVar, sb3, true);
            List<j1> listF = vVar.f();
            listF.getClass();
            wVar.f0(sb3, listF, vVar.M());
            wVar.U(vVar, sb3);
            p43.n0 returnType = vVar.getReturnType();
            b0 b0Var2 = c0Var.f1120l;
            k23.l<?>[] lVarArr2 = c0.Y;
            if (!((Boolean) b0Var2.getValue(c0Var, lVarArr2[10])).booleanValue()) {
                if (((Boolean) c0Var.f1119k.getValue(c0Var, lVarArr2[9])).booleanValue() || returnType == null) {
                    sb3.append(": ");
                    if (returnType == null) {
                        strW = "[NULL]";
                    } else {
                        strW = wVar.W(returnType);
                    }
                    sb3.append(strW);
                } else {
                    x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                    if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.E(returnType, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105875e)) {
                        sb3.append(": ");
                        if (returnType == null) {
                            strW = "[NULL]";
                        } else {
                            strW = wVar.W(returnType);
                        }
                        sb3.append(strW);
                    }
                }
            }
            List<d1> typeParameters2 = vVar.getTypeParameters();
            typeParameters2.getClass();
            wVar.h0(sb3, typeParameters2);
        }

        public final void o(m0 m0Var, StringBuilder sb3, String str) throws IOException {
            w wVar = w.this;
            c0 c0Var = wVar.f1180e;
            int i14 = C0013a.f1183a[((h0) c0Var.H.getValue(c0Var, c0.Y[32])).ordinal()];
            if (i14 == 1) {
                wVar.K(m0Var, sb3);
                sb3.append(str.concat(" for "));
                r0 r0VarP0 = m0Var.p0();
                r0VarP0.getClass();
                w.q(wVar, r0VarP0, sb3);
                return;
            }
            if (i14 == 2) {
                n(m0Var, sb3);
            } else {
                if (i14 == 3) {
                    return;
                }
                lc.u0.r();
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1185b;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.f1155a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.f1156b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1184a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g0.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f1185b = iArr2;
        }
    }

    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<String, String> {
        public c(Object obj) {
            super(1, obj, w.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(String str) {
            String str2 = str;
            str2.getClass();
            w wVar = (w) this.receiver;
            int i14 = w.f1179g;
            return wVar.r(str2);
        }
    }

    public w(c0 c0Var) {
        c0Var.getClass();
        this.f1180e = c0Var;
        this.f1181f = o13.m.b(new o(this));
    }

    public static void V(StringBuilder sb3) {
        int length = sb3.length();
        if (length == 0 || sb3.charAt(length - 1) != ' ') {
            sb3.append(' ');
        }
    }

    public static boolean i0(p43.n0 n0Var) {
        if (!p005kotlin.reflect.jvm.internal.impl.builtins.c.h(n0Var)) {
            return false;
        }
        List<t1> listD0 = n0Var.D0();
        if (listD0 != null && listD0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listD0.iterator();
        while (it.hasNext()) {
            if (((t1) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static final void q(w wVar, r0 r0Var, StringBuilder sb3) throws IOException {
        boolean zT = wVar.t();
        c0 c0Var = wVar.f1180e;
        if (!zT) {
            b0 b0Var = c0Var.f1115g;
            k23.l<?>[] lVarArr = c0.Y;
            if (!((Boolean) b0Var.getValue(c0Var, lVarArr[5])).booleanValue()) {
                List<u0> listS = r0Var.S();
                listS.getClass();
                wVar.C(sb3, listS);
                if (wVar.s().contains(x.ANNOTATIONS)) {
                    wVar.z(sb3, r0Var, null);
                    w23.u uVarG0 = r0Var.g0();
                    if (uVarG0 != null) {
                        wVar.z(sb3, uVarG0, u23.e.FIELD);
                    }
                    w23.u uVarZ = r0Var.Z();
                    if (uVarZ != null) {
                        wVar.z(sb3, uVarZ, u23.e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((h0) c0Var.H.getValue(c0Var, lVarArr[32])) == h0.NONE) {
                        o0 getter = r0Var.getGetter();
                        if (getter != null) {
                            wVar.z(sb3, getter, u23.e.PROPERTY_GETTER);
                        }
                        t0 setter = r0Var.getSetter();
                        if (setter != null) {
                            wVar.z(sb3, setter, u23.e.PROPERTY_SETTER);
                            List<j1> listF = setter.f();
                            listF.getClass();
                            j1 j1Var = (j1) p13.h0.I0(listF);
                            j1Var.getClass();
                            wVar.z(sb3, j1Var, u23.e.SETTER_PARAMETER);
                        }
                    }
                }
                t23.r visibility = r0Var.getVisibility();
                visibility.getClass();
                wVar.g0(visibility, sb3);
                wVar.N(sb3, wVar.s().contains(x.CONST) && r0Var.isConst(), StringLookupFactory.KEY_CONST);
                wVar.K(r0Var, sb3);
                wVar.M(r0Var, sb3);
                wVar.R(r0Var, sb3);
                wVar.N(sb3, wVar.s().contains(x.LATEINIT) && r0Var.A0(), "lateinit");
                wVar.J(r0Var, sb3);
            }
            wVar.d0(r0Var, sb3, false);
            List<d1> typeParameters = r0Var.getTypeParameters();
            typeParameters.getClass();
            wVar.b0(sb3, typeParameters, true);
            wVar.T(r0Var, sb3);
        }
        wVar.O(r0Var, sb3, true);
        sb3.append(": ");
        p43.n0 type = r0Var.getType();
        type.getClass();
        sb3.append(wVar.W(type));
        wVar.U(r0Var, sb3);
        wVar.H(r0Var, sb3);
        List<d1> typeParameters2 = r0Var.getTypeParameters();
        typeParameters2.getClass();
        wVar.h0(sb3, typeParameters2);
    }

    public static t23.a0 x(t23.z zVar) {
        if (zVar instanceof t23.e) {
            return ((t23.e) zVar).getKind() == t23.f.INTERFACE ? t23.a0.ABSTRACT : t23.a0.FINAL;
        }
        t23.l lVarD = zVar.d();
        t23.e eVar = lVarD instanceof t23.e ? (t23.e) lVarD : null;
        if (eVar != null && (zVar instanceof t23.b)) {
            t23.b bVar = (t23.b) zVar;
            Collection<? extends t23.b> collectionO = bVar.o();
            collectionO.getClass();
            if (!collectionO.isEmpty() && eVar.g() != t23.a0.FINAL) {
                return t23.a0.OPEN;
            }
            if (eVar.getKind() != t23.f.INTERFACE || p005kotlin.jvm.internal.s.g(bVar.getVisibility(), t23.q.f162046a)) {
                return t23.a0.FINAL;
            }
            t23.a0 a0VarG = bVar.g();
            t23.a0 a0Var = t23.a0.ABSTRACT;
            return a0VarG == a0Var ? a0Var : t23.a0.OPEN;
        }
        return t23.a0.FINAL;
    }

    public final void A(t23.i iVar, StringBuilder sb3) {
        List<d1> listQ = iVar.q();
        listQ.getClass();
        List<d1> parameters = iVar.h().getParameters();
        parameters.getClass();
        if (w() && iVar.l() && parameters.size() > listQ.size()) {
            sb3.append(" /*captured type parameters: ");
            a0(sb3, parameters.subList(listQ.size(), parameters.size()));
            sb3.append("*/");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String B(d43.g<?> gVar) {
        c0 c0Var = this.f1180e;
        e23.l lVar = (e23.l) c0Var.f1130v.getValue(c0Var, c0.Y[20]);
        if (lVar != null) {
            return (String) lVar.invoke(gVar);
        }
        if (gVar instanceof d43.b) {
            Iterable iterable = (Iterable) ((d43.b) gVar).f57481a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strB = B((d43.g) it.next());
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            return p13.h0.k0(arrayList, ", ", "{", StringSubstitutor.DEFAULT_VAR_END, null, 56);
        }
        if (gVar instanceof d43.a) {
            return d53.w.O(n((u23.c) ((d43.a) gVar).f57481a, null), "@");
        }
        if (!(gVar instanceof d43.t)) {
            return gVar.toString();
        }
        d43.t.b bVar = (d43.t.b) ((d43.t) gVar).f57481a;
        if (bVar instanceof d43.t.b.a) {
            return ((d43.t.b.a) bVar).f57501a + "::class";
        }
        if (!(bVar instanceof d43.t.b.C1229b)) {
            lc.u0.r();
            return null;
        }
        d43.f fVar = ((d43.t.b.C1229b) bVar).f57502a;
        String strC = fVar.f57479a.a().f188596a.f188600a;
        int i14 = fVar.f57480b;
        for (int i15 = 0; i15 < i14; i15++) {
            strC = o2.c.c('>', "kotlin.Array<", strC);
        }
        return tn.k.g(strC, "::class");
    }

    public final void C(StringBuilder sb3, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb3.append("context(");
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = i14 + 1;
            p43.n0 type = ((u0) it.next()).getType();
            type.getClass();
            sb3.append(G(type, true));
            if (i14 == list.size() - 1) {
                sb3.append(") ");
            } else {
                sb3.append(", ");
            }
            i14 = i15;
        }
    }

    public final void D(StringBuilder sb3, v0 v0Var) {
        z(sb3, v0Var, null);
        boolean z14 = v0Var instanceof p43.w;
        p43.w wVar = z14 ? (p43.w) v0Var : null;
        v0 v0Var2 = wVar != null ? wVar.f135931b : null;
        if (o72.t.R(v0Var)) {
            boolean z15 = v0Var instanceof r43.i;
            c0 c0Var = this.f1180e;
            if (z15 && ((r43.i) v0Var).f150356d.f150387b && ((Boolean) c0Var.V.getValue(c0Var, c0.Y[47])).booleanValue()) {
                r43.l.f150388a.getClass();
                if (z15) {
                    boolean z16 = ((r43.i) v0Var).f150356d.f150387b;
                }
                m1 m1VarF0 = v0Var.F0();
                m1VarF0.getClass();
                sb3.append(E(((r43.j) m1VarF0).f150362b[0]));
            } else {
                if (!z15 || ((Boolean) c0Var.X.getValue(c0Var, c0.Y[49])).booleanValue()) {
                    sb3.append(v0Var.F0().toString());
                } else {
                    sb3.append(((r43.i) v0Var).f150360h);
                }
                sb3.append(X(v0Var.D0()));
            }
        } else if (v0Var instanceof e1) {
            sb3.append(((e1) v0Var).f135819b.toString());
        } else if (v0Var2 instanceof e1) {
            sb3.append(((e1) v0Var2).f135819b.toString());
        } else {
            m1 m1VarF1 = v0Var.F0();
            t23.h hVarT = v0Var.F0().t();
            t23.p0 p0VarL = o72.t.l(v0Var, hVarT instanceof t23.i ? (t23.i) hVarT : null, 0);
            if (p0VarL == null) {
                sb3.append(Y(m1VarF1));
                sb3.append(X(v0Var.D0()));
            } else {
                S(sb3, p0VarL);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (v0Var.G0()) {
            sb3.append(CallerData.NA);
        }
        if (z14) {
            sb3.append(" & Any");
        }
    }

    public final String E(String str) {
        int i14 = b.f1184a[u().ordinal()];
        if (i14 == 1) {
            return str;
        }
        if (i14 == 2) {
            return am.j.m("<font color=red><b>", str, "</b></font>");
        }
        lc.u0.r();
        return null;
    }

    public final String F(String str, String str2, p005kotlin.reflect.jvm.internal.impl.builtins.d dVar) {
        str.getClass();
        str2.getClass();
        if (xy2.b.N(str, str2)) {
            return d53.u.y(str2, "(", false) ? am.j.m("(", str, ")!") : str.concat("!");
        }
        String strG = xy2.b.G(str, str2, new p(this, dVar), new q(this, dVar), new c(this));
        if (strG != null) {
            return strG;
        }
        return "(" + str + CallerDataConverter.DEFAULT_RANGE_DELIMITER + str2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final String G(p43.n0 n0Var, boolean z14) {
        String strW = W(n0Var);
        return ((!i0(n0Var) || d2.g(n0Var)) && !(n0Var instanceof p43.w) && (!z14 || n0Var.getAnnotations().isEmpty())) ? strW : o2.c.c(CoreConstants.RIGHT_PARENTHESIS_CHAR, "(", strW);
    }

    public final void H(k1 k1Var, StringBuilder sb3) {
        d43.g<?> gVarQ;
        String strB;
        c0 c0Var = this.f1180e;
        if (!((Boolean) c0Var.f1129u.getValue(c0Var, c0.Y[19])).booleanValue() || (gVarQ = k1Var.Q()) == null || (strB = B(gVarQ)) == null) {
            return;
        }
        sb3.append(" = ");
        sb3.append(r(strB));
    }

    public final String I(String str) {
        int i14 = b.f1184a[u().ordinal()];
        if (i14 == 1) {
            return str;
        }
        if (i14 == 2) {
            c0 c0Var = this.f1180e;
            return ((Boolean) c0Var.W.getValue(c0Var, c0.Y[48])).booleanValue() ? str : am.j.m("<b>", str, "</b>");
        }
        lc.u0.r();
        return null;
    }

    public final void J(t23.b bVar, StringBuilder sb3) {
        if (s().contains(x.MEMBER_KIND) && w() && bVar.getKind() != t23.b.a.DECLARATION) {
            sb3.append("/*");
            sb3.append(w52.u0.v(bVar.getKind().name()));
            sb3.append("*/ ");
        }
    }

    public final void K(t23.z zVar, StringBuilder sb3) {
        N(sb3, zVar.isExternal(), "external");
        boolean z14 = false;
        N(sb3, s().contains(x.EXPECT) && zVar.O(), "expect");
        if (s().contains(x.ACTUAL) && zVar.q0()) {
            z14 = true;
        }
        N(sb3, z14, "actual");
    }

    public final void L(t23.a0 a0Var, StringBuilder sb3, t23.a0 a0Var2) {
        c0 c0Var = this.f1180e;
        if (((Boolean) c0Var.f1124p.getValue(c0Var, c0.Y[14])).booleanValue() || a0Var != a0Var2) {
            N(sb3, s().contains(x.MODALITY), w52.u0.v(a0Var.name()));
        }
    }

    public final void M(t23.b bVar, StringBuilder sb3) {
        if (b43.i.q(bVar) && bVar.g() == t23.a0.FINAL) {
            return;
        }
        c0 c0Var = this.f1180e;
        if (((f0) c0Var.B.getValue(c0Var, c0.Y[26])) == f0.RENDER_OVERRIDE && bVar.g() == t23.a0.OPEN && !bVar.o().isEmpty()) {
            return;
        }
        t23.a0 a0VarG = bVar.g();
        a0VarG.getClass();
        L(a0VarG, sb3, x(bVar));
    }

    public final void N(StringBuilder sb3, boolean z14, String str) {
        if (z14) {
            sb3.append(I(str));
            sb3.append(StringUtils.SPACE);
        }
    }

    public final void O(t23.l lVar, StringBuilder sb3, boolean z14) {
        x33.f name = lVar.getName();
        name.getClass();
        sb3.append(p(name, z14));
    }

    public final void P(StringBuilder sb3, p43.n0 n0Var) {
        f2 f2VarI0 = n0Var.I0();
        p43.a aVar = f2VarI0 instanceof p43.a ? (p43.a) f2VarI0 : null;
        if (aVar == null) {
            Q(sb3, n0Var);
            return;
        }
        v0 v0Var = aVar.f135789c;
        v0 v0Var2 = aVar.f135788b;
        c0 c0Var = this.f1180e;
        b0 b0Var = c0Var.R;
        k23.l<?>[] lVarArr = c0.Y;
        if (((Boolean) b0Var.getValue(c0Var, lVarArr[42])).booleanValue()) {
            Q(sb3, v0Var2);
            if (((Boolean) c0Var.S.getValue(c0Var, lVarArr[43])).booleanValue()) {
                i0 i0VarU = u();
                i0.a aVar2 = i0.f1156b;
                if (i0VarU == aVar2) {
                    sb3.append("<font color=\"808080\"><i>");
                }
                sb3.append(" /* ");
                sb3.append("from: ");
                Q(sb3, v0Var);
                sb3.append(" */");
                if (u() == aVar2) {
                    sb3.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        Q(sb3, v0Var);
        if (((Boolean) c0Var.Q.getValue(c0Var, lVarArr[41])).booleanValue()) {
            i0 i0VarU2 = u();
            i0.a aVar3 = i0.f1156b;
            if (i0VarU2 == aVar3) {
                sb3.append("<font color=\"808080\"><i>");
            }
            sb3.append(" /* ");
            sb3.append("= ");
            Q(sb3, v0Var2);
            sb3.append(" */");
            if (u() == aVar3) {
                sb3.append("</i></font>");
            }
        }
    }

    public final void Q(StringBuilder sb3, p43.n0 n0Var) {
        x33.f fVarC;
        String strR;
        boolean z14 = n0Var instanceof h2;
        c0 c0Var = this.f1180e;
        if (z14 && c0Var.n() && !((h2) n0Var).K0()) {
            sb3.append("<Not computed yet>");
            return;
        }
        f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof p43.f0) {
            sb3.append(((p43.f0) f2VarI0).N0(this, this));
            return;
        }
        if (!(f2VarI0 instanceof v0)) {
            lc.u0.r();
            return;
        }
        v0 v0Var = (v0) f2VarI0;
        if (v0Var.equals(d2.f135815b) || v0Var.F0() == d2.f135814a.f150354b) {
            sb3.append("???");
            return;
        }
        m1 m1VarF0 = v0Var.F0();
        if ((m1VarF0 instanceof r43.j) && ((r43.j) m1VarF0).f150361a == r43.k.f150371j) {
            if (!((Boolean) c0Var.f1128t.getValue(c0Var, c0.Y[18])).booleanValue()) {
                sb3.append("???");
                return;
            }
            m1 m1VarF1 = v0Var.F0();
            m1VarF1.getClass();
            sb3.append(E(((r43.j) m1VarF1).f150362b[0]));
            return;
        }
        if (o72.t.R(v0Var)) {
            D(sb3, v0Var);
            return;
        }
        if (!i0(v0Var)) {
            D(sb3, v0Var);
            return;
        }
        int length = sb3.length();
        ((w) this.f1181f.getValue()).z(sb3, v0Var, null);
        boolean z15 = sb3.length() != length;
        p43.n0 n0VarF = p005kotlin.reflect.jvm.internal.impl.builtins.c.f(v0Var);
        List<p43.n0> listD = p005kotlin.reflect.jvm.internal.impl.builtins.c.d(v0Var);
        boolean zI = p005kotlin.reflect.jvm.internal.impl.builtins.c.i(v0Var);
        boolean zG0 = v0Var.G0();
        boolean z16 = zG0 || (z15 && n0VarF != null);
        if (z16) {
            if (zI) {
                sb3.insert(length, CoreConstants.LEFT_PARENTHESIS_CHAR);
            } else {
                if (z15) {
                    d53.a.b(d53.y.r0(sb3));
                    if (sb3.charAt(sb3.length() - 2) != ')') {
                        sb3.insert(sb3.length() - 1, "()");
                    }
                }
                sb3.append("(");
            }
        }
        N(sb3, zI, "suspend");
        if (!listD.isEmpty()) {
            sb3.append("context(");
            Iterator<p43.n0> it = listD.subList(0, listD.size() - 1).iterator();
            while (it.hasNext()) {
                P(sb3, it.next());
                sb3.append(", ");
            }
            P(sb3, (p43.n0) p13.h0.m0(listD));
            sb3.append(") ");
        }
        if (n0VarF != null) {
            boolean z17 = (i0(n0VarF) && !n0VarF.G0()) || p005kotlin.reflect.jvm.internal.impl.builtins.c.i(n0VarF) || !n0VarF.getAnnotations().isEmpty() || (n0VarF instanceof p43.w);
            if (z17) {
                sb3.append("(");
            }
            P(sb3, n0VarF);
            if (z17) {
                sb3.append(")");
            }
            sb3.append(".");
        }
        sb3.append("(");
        if (!p005kotlin.reflect.jvm.internal.impl.builtins.c.h(v0Var) || v0Var.getAnnotations().z(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105891q) == null || v0Var.D0().size() > 1) {
            int i14 = 0;
            for (t1 t1Var : p005kotlin.reflect.jvm.internal.impl.builtins.c.g(v0Var)) {
                int i15 = i14 + 1;
                if (i14 > 0) {
                    sb3.append(", ");
                }
                if (((Boolean) c0Var.U.getValue(c0Var, c0.Y[45])).booleanValue()) {
                    p43.n0 type = t1Var.getType();
                    type.getClass();
                    fVarC = p005kotlin.reflect.jvm.internal.impl.builtins.c.c(type);
                } else {
                    fVarC = null;
                }
                if (fVarC != null) {
                    sb3.append(p(fVarC, false));
                    sb3.append(": ");
                }
                sb3.append(c0(t1Var));
                i14 = i15;
            }
        } else {
            sb3.append("???");
        }
        sb3.append(") ");
        int i16 = b.f1184a[u().ordinal()];
        if (i16 == 1) {
            strR = r("->");
        } else {
            if (i16 != 2) {
                lc.u0.r();
                return;
            }
            strR = "&rarr;";
        }
        sb3.append(strR);
        sb3.append(StringUtils.SPACE);
        p005kotlin.reflect.jvm.internal.impl.builtins.c.h(v0Var);
        p43.n0 type2 = ((t1) p13.h0.m0(v0Var.D0())).getType();
        type2.getClass();
        P(sb3, type2);
        if (z16) {
            sb3.append(")");
        }
        if (zG0) {
            sb3.append(CallerData.NA);
        }
    }

    public final void R(t23.b bVar, StringBuilder sb3) {
        if (s().contains(x.OVERRIDE) && !bVar.o().isEmpty()) {
            c0 c0Var = this.f1180e;
            if (((f0) c0Var.B.getValue(c0Var, c0.Y[26])) != f0.RENDER_OPEN) {
                N(sb3, true, "override");
                if (w()) {
                    sb3.append("/*");
                    sb3.append(bVar.o().size());
                    sb3.append("*/ ");
                }
            }
        }
    }

    public final void S(StringBuilder sb3, t23.p0 p0Var) {
        t23.p0 p0Var2 = p0Var.f162045c;
        t23.i iVar = p0Var.f162043a;
        if (p0Var2 != null) {
            S(sb3, p0Var2);
            sb3.append('.');
            x33.f name = iVar.getName();
            name.getClass();
            sb3.append(p(name, false));
        } else {
            m1 m1VarH = iVar.h();
            m1VarH.getClass();
            sb3.append(Y(m1VarH));
        }
        sb3.append(X(p0Var.f162044b));
    }

    public final void T(t23.b bVar, StringBuilder sb3) {
        u0 u0VarI = bVar.I();
        if (u0VarI != null) {
            z(sb3, u0VarI, u23.e.RECEIVER);
            p43.n0 type = u0VarI.getType();
            type.getClass();
            sb3.append(G(type, false));
            sb3.append(".");
        }
    }

    public final void U(t23.b bVar, StringBuilder sb3) {
        u0 u0VarI;
        c0 c0Var = this.f1180e;
        if (((Boolean) c0Var.F.getValue(c0Var, c0.Y[30])).booleanValue() && (u0VarI = bVar.I()) != null) {
            sb3.append(" on ");
            p43.n0 type = u0VarI.getType();
            type.getClass();
            sb3.append(W(type));
        }
    }

    public final String W(p43.n0 n0Var) {
        n0Var.getClass();
        StringBuilder sb3 = new StringBuilder();
        c0 c0Var = this.f1180e;
        P(sb3, (p43.n0) ((e23.l) c0Var.f1133y.getValue(c0Var, c0.Y[23])).invoke(n0Var));
        return sb3.toString();
    }

    public final String X(List<? extends t1> list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(r("<"));
        p13.h0.j0(list, sb3, ", ", null, null, new s(this), 60);
        sb3.append(r(">"));
        return sb3.toString();
    }

    public final String Y(m1 m1Var) {
        m1Var.getClass();
        t23.h hVarT = m1Var.t();
        if (!(hVarT instanceof d1) && !(hVarT instanceof t23.e) && !(hVarT instanceof c1)) {
            if (hVarT == null) {
                return m1Var instanceof p43.m0 ? ((p43.m0) m1Var).d(r.f1174a) : m1Var.toString();
            }
            androidx.core.view.j.x(hVarT.getClass(), "Unexpected classifier: ");
            return null;
        }
        hVarT.getClass();
        if (r43.l.f(hVarT)) {
            return hVarT.h().toString();
        }
        c0 c0Var = this.f1180e;
        return ((a43.b) c0Var.f1110b.getValue(c0Var, c0.Y[0])).a(hVarT, this);
    }

    public final void Z(d1 d1Var, StringBuilder sb3, boolean z14) {
        if (z14) {
            sb3.append(r("<"));
        }
        if (w()) {
            sb3.append("/*");
            sb3.append(d1Var.getIndex());
            sb3.append("*/ ");
        }
        N(sb3, d1Var.r(), "reified");
        String str = d1Var.m().f135847a;
        boolean z15 = true;
        N(sb3, str.length() > 0, str);
        z(sb3, d1Var, null);
        O(d1Var, sb3, z14);
        int size = d1Var.getUpperBounds().size();
        if ((size > 1 && !z14) || size == 1) {
            p43.n0 next = d1Var.getUpperBounds().iterator().next();
            if (next == null) {
                p005kotlin.reflect.jvm.internal.impl.builtins.d.a(141);
                throw null;
            }
            if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.y(next) || !next.G0()) {
                sb3.append(" : ");
                sb3.append(W(next));
            }
        } else if (z14) {
            for (p43.n0 n0Var : d1Var.getUpperBounds()) {
                if (n0Var == null) {
                    p005kotlin.reflect.jvm.internal.impl.builtins.d.a(141);
                    throw null;
                }
                if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.y(n0Var) || !n0Var.G0()) {
                    if (z15) {
                        sb3.append(" : ");
                    } else {
                        sb3.append(" & ");
                    }
                    sb3.append(W(n0Var));
                    z15 = false;
                }
            }
        }
        if (z14) {
            sb3.append(r(">"));
        }
    }

    @Override // a43.y
    public final void a(a43.b bVar) {
        bVar.getClass();
        this.f1180e.a(bVar);
    }

    public final void a0(StringBuilder sb3, List<? extends d1> list) {
        Iterator<? extends d1> it = list.iterator();
        while (it.hasNext()) {
            Z(it.next(), sb3, false);
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
    }

    @Override // a43.y
    public final void b(LinkedHashSet linkedHashSet) {
        this.f1180e.b(linkedHashSet);
    }

    public final void b0(StringBuilder sb3, List list, boolean z14) {
        c0 c0Var = this.f1180e;
        if (((Boolean) c0Var.f1131w.getValue(c0Var, c0.Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb3.append(r("<"));
        a0(sb3, list);
        sb3.append(r(">"));
        if (z14) {
            sb3.append(StringUtils.SPACE);
        }
    }

    @Override // a43.y
    public final void c() {
        this.f1180e.c();
    }

    public final String c0(t1 t1Var) throws IOException {
        t1Var.getClass();
        StringBuilder sb3 = new StringBuilder();
        p13.h0.j0(p13.w.c(t1Var), sb3, ", ", null, null, new s(this), 60);
        return sb3.toString();
    }

    @Override // a43.y
    public final void d() {
        this.f1180e.d();
    }

    public final void d0(k1 k1Var, StringBuilder sb3, boolean z14) {
        if (z14 || !(k1Var instanceof j1)) {
            sb3.append(I(k1Var.Y() ? "var" : "val"));
            sb3.append(StringUtils.SPACE);
        }
    }

    @Override // a43.y
    public final void e() {
        this.f1180e.e();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final void e0(j1 j1Var, boolean z14, StringBuilder sb3, boolean z15) {
        boolean z16;
        if (z15) {
            sb3.append(I("value-parameter"));
            sb3.append(StringUtils.SPACE);
        }
        if (w()) {
            sb3.append("/*");
            sb3.append(j1Var.getIndex());
            sb3.append("*/ ");
        }
        z(sb3, j1Var, null);
        N(sb3, j1Var.x0(), "crossinline");
        N(sb3, j1Var.v0(), "noinline");
        c0 c0Var = this.f1180e;
        b0 b0Var = c0Var.f1126r;
        k23.l<?>[] lVarArr = c0.Y;
        boolean z17 = false;
        if (((Boolean) b0Var.getValue(c0Var, lVarArr[16])).booleanValue()) {
            t23.a aVarD = j1Var.d();
            t23.d dVar = aVarD instanceof t23.d ? (t23.d) aVarD : null;
            if (dVar == null || !dVar.L()) {
                z16 = false;
            } else {
                z16 = true;
            }
        } else {
            z16 = false;
        }
        if (z16) {
            N(sb3, ((Boolean) c0Var.f1127s.getValue(c0Var, lVarArr[17])).booleanValue(), "actual");
        }
        p43.n0 type = j1Var.getType();
        type.getClass();
        p43.n0 n0VarR = j1Var.R();
        p43.n0 n0Var = n0VarR == null ? type : n0VarR;
        N(sb3, n0VarR != null, "vararg");
        if (z16 || (z15 && !t())) {
            d0(j1Var, sb3, z16);
        }
        if (z14) {
            O(j1Var, sb3, z15);
            sb3.append(": ");
        }
        sb3.append(W(n0Var));
        H(j1Var, sb3);
        if (w() && n0VarR != null) {
            sb3.append(" /*");
            sb3.append(W(type));
            sb3.append("*/");
        }
        if (((e23.l) c0Var.f1134z.getValue(c0Var, lVarArr[24])) != null) {
            if (c0Var.n() ? j1Var.h0() : f43.e.a(j1Var)) {
                z17 = true;
            }
        }
        if (z17) {
            StringBuilder sb4 = new StringBuilder(" = ");
            e23.l lVar = (e23.l) c0Var.f1134z.getValue(c0Var, lVarArr[24]);
            lVar.getClass();
            sb4.append((String) lVar.invoke(j1Var));
            sb3.append(sb4.toString());
        }
    }

    @Override // a43.y
    public final void f(i0 i0Var) {
        i0Var.getClass();
        this.f1180e.f(i0Var);
    }

    public final void f0(StringBuilder sb3, List list, boolean z14) {
        c0 c0Var = this.f1180e;
        int i14 = b.f1185b[((g0) c0Var.E.getValue(c0Var, c0.Y[29])).ordinal()];
        boolean z15 = true;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    lc.u0.r();
                    return;
                }
            } else if (z14) {
            }
            z15 = false;
        }
        int size = list.size();
        v().a(sb3);
        Iterator it = list.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            v().c(j1Var, sb3);
            e0(j1Var, z15, sb3, false);
            v().d(j1Var, i15, size, sb3);
            i15++;
        }
        v().b(sb3);
    }

    @Override // a43.y
    public final Set<x33.c> g() {
        return this.f1180e.g();
    }

    public final boolean g0(t23.r rVar, StringBuilder sb3) {
        if (!s().contains(x.VISIBILITY)) {
            return false;
        }
        c0 c0Var = this.f1180e;
        b0 b0Var = c0Var.f1122n;
        k23.l<?>[] lVarArr = c0.Y;
        if (((Boolean) b0Var.getValue(c0Var, lVarArr[12])).booleanValue()) {
            rVar = rVar.d();
        }
        if (!((Boolean) c0Var.f1123o.getValue(c0Var, lVarArr[13])).booleanValue() && rVar.equals(t23.q.f162057l)) {
            return false;
        }
        sb3.append(I(rVar.b()));
        sb3.append(StringUtils.SPACE);
        return true;
    }

    @Override // a43.y
    public final void h() {
        this.f1180e.h();
    }

    public final void h0(StringBuilder sb3, List list) throws IOException {
        c0 c0Var = this.f1180e;
        if (((Boolean) c0Var.f1131w.getValue(c0Var, c0.Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            List<p43.n0> upperBounds = d1Var.getUpperBounds();
            upperBounds.getClass();
            for (p43.n0 n0Var : p13.h0.U(upperBounds, 1)) {
                StringBuilder sb4 = new StringBuilder();
                x33.f name = d1Var.getName();
                name.getClass();
                sb4.append(p(name, false));
                sb4.append(" : ");
                n0Var.getClass();
                sb4.append(W(n0Var));
                arrayList.add(sb4.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb3.append(StringUtils.SPACE);
        sb3.append(I("where"));
        sb3.append(StringUtils.SPACE);
        p13.h0.j0(arrayList, sb3, ", ", null, null, null, 124);
    }

    @Override // a43.y
    public final void i(Set<? extends x> set) {
        set.getClass();
        this.f1180e.i(set);
    }

    @Override // a43.y
    public final void j() {
        this.f1180e.j();
    }

    @Override // a43.y
    public final void k() {
        this.f1180e.k();
    }

    @Override // a43.y
    public final void l(g0 g0Var) {
        g0Var.getClass();
        this.f1180e.l(g0Var);
    }

    @Override // a43.y
    public final void m() {
        this.f1180e.m();
    }

    @Override // a43.n
    public final String n(u23.c cVar, u23.e eVar) throws IOException {
        t23.d dVarS;
        List<j1> listF;
        cVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append('@');
        if (eVar != null) {
            sb3.append(eVar.f168219a + CoreConstants.COLON_CHAR);
        }
        p43.n0 type = cVar.getType();
        sb3.append(W(type));
        c0 c0Var = this.f1180e;
        b0 b0Var = c0Var.N;
        k23.l<?>[] lVarArr = c0.Y;
        if (((a43.a) b0Var.getValue(c0Var, lVarArr[38])).f1101a) {
            Map<x33.f, d43.g<?>> mapB = cVar.b();
            List list = null;
            t23.e eVarD = ((Boolean) c0Var.I.getValue(c0Var, lVarArr[33])).booleanValue() ? f43.e.d(cVar) : null;
            if (eVarD != null && (dVarS = eVarD.s()) != null && (listF = dVarS.f()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (((j1) obj).h0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((j1) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = p13.j0.f134944a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapB.containsKey((x33.f) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((x33.f) it3.next()).b() + " = ...");
            }
            Set<Map.Entry<x33.f, d43.g<?>>> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(p13.y.r(setEntrySet, 10));
            Iterator<T> it4 = setEntrySet.iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                x33.f fVar = (x33.f) entry.getKey();
                d43.g<?> gVar = (d43.g) entry.getValue();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(fVar.b());
                sb4.append(" = ");
                sb4.append(!list.contains(fVar) ? B(gVar) : "...");
                arrayList5.add(sb4.toString());
            }
            List listM0 = p13.h0.M0(p13.h0.C0(arrayList4, arrayList5));
            if (((a43.a) c0Var.N.getValue(c0Var, c0.Y[38])).f1102b || !listM0.isEmpty()) {
                p13.h0.j0(listM0, sb3, ", ", "(", ")", null, 112);
            }
        }
        if (w() && (o72.t.R(type) || (type.F0().t() instanceof t23.g0.b))) {
            sb3.append(" /* annotation class not found */");
        }
        return sb3.toString();
    }

    @Override // a43.n
    public final String o(x33.d dVar) {
        dVar.getClass();
        return r(xy2.b.H(x33.d.f(dVar)));
    }

    @Override // a43.n
    public final String p(x33.f fVar, boolean z14) {
        String strR = r(xy2.b.F(fVar));
        c0 c0Var = this.f1180e;
        return (((Boolean) c0Var.W.getValue(c0Var, c0.Y[48])).booleanValue() && u() == i0.f1156b && z14) ? am.j.m("<b>", strR, "</b>") : strR;
    }

    public final String r(String str) {
        return u().a(str);
    }

    public final Set<x> s() {
        c0 c0Var = this.f1180e;
        return (Set) c0Var.f1113e.getValue(c0Var, c0.Y[3]);
    }

    public final boolean t() {
        c0 c0Var = this.f1180e;
        return ((Boolean) c0Var.f1114f.getValue(c0Var, c0.Y[4])).booleanValue();
    }

    public final i0 u() {
        c0 c0Var = this.f1180e;
        return (i0) c0Var.D.getValue(c0Var, c0.Y[28]);
    }

    public final n.b v() {
        c0 c0Var = this.f1180e;
        return (n.b) c0Var.C.getValue(c0Var, c0.Y[27]);
    }

    public final boolean w() {
        c0 c0Var = this.f1180e;
        return ((Boolean) c0Var.f1118j.getValue(c0Var, c0.Y[8])).booleanValue();
    }

    public final String y(t23.l lVar) {
        t23.l lVarD;
        String str;
        lVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        lVar.K(new a(), sb3);
        c0 c0Var = this.f1180e;
        b0 b0Var = c0Var.f1111c;
        k23.l<?>[] lVarArr = c0.Y;
        if (((Boolean) b0Var.getValue(c0Var, lVarArr[1])).booleanValue() && !(lVar instanceof t23.h0) && !(lVar instanceof t23.n0) && (lVarD = lVar.d()) != null && !(lVarD instanceof t23.c0)) {
            sb3.append(StringUtils.SPACE);
            int i14 = b.f1184a[u().ordinal()];
            if (i14 == 1) {
                str = "defined in";
            } else {
                if (i14 != 2) {
                    lc.u0.r();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb3.append(str);
            sb3.append(StringUtils.SPACE);
            x33.d dVarF = b43.i.f(lVarD);
            dVarF.getClass();
            sb3.append(dVarF.c() ? "root package" : o(dVarF));
            if (((Boolean) c0Var.f1112d.getValue(c0Var, lVarArr[2])).booleanValue() && (lVarD instanceof t23.h0) && (lVar instanceof t23.m)) {
                ((t23.m) lVar).getSource().a().getClass();
            }
        }
        return sb3.toString();
    }

    public final void z(StringBuilder sb3, u23.a aVar, u23.e eVar) {
        if (s().contains(x.ANNOTATIONS)) {
            boolean z14 = aVar instanceof p43.n0;
            c0 c0Var = this.f1180e;
            Set<x33.c> setG = z14 ? c0Var.g() : (Set) c0Var.K.getValue(c0Var, c0.Y[35]);
            e23.l lVar = (e23.l) c0Var.M.getValue(c0Var, c0.Y[37]);
            for (u23.c cVar : aVar.getAnnotations()) {
                if (!p13.h0.R(setG, cVar.c()) && !p005kotlin.jvm.internal.s.g(cVar.c(), kotlin.reflect.jvm.internal.impl.builtins.f.a.f105893s) && (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue())) {
                    sb3.append(n(cVar, eVar));
                    if (((Boolean) c0Var.J.getValue(c0Var, c0.Y[34])).booleanValue()) {
                        sb3.append('\n');
                    } else {
                        sb3.append(StringUtils.SPACE);
                    }
                }
            }
        }
    }
}
