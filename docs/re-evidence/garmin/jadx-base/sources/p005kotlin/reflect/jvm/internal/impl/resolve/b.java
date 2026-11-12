package p005kotlin.reflect.jvm.internal.impl.resolve;

import b43.i;
import b43.n;
import b43.o;
import b43.q;
import b43.s;
import b43.u;
import com.google.firebase.messaging.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import n23.j;
import o72.t;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import p43.f0;
import p43.f2;
import p43.h;
import p43.l1;
import p43.m1;
import p43.n0;
import q43.d;
import q43.e;
import q43.f;
import t23.a0;
import t23.c0;
import t23.d1;
import t23.j1;
import t23.q0;
import t23.r;
import t23.r0;
import t23.t0;
import t23.u0;
import t23.v;
import w23.m0;
import w23.x;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f105944e = h0.b1(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f105945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f105946g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f105947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f105948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.a f105949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<n0, n0, Boolean> f105950d;

    public static class a implements d.a {
        public static /* synthetic */ void b(int i14) {
            Object[] objArr = new Object[3];
            if (i14 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // q43.d.a
        public final boolean a(m1 m1Var, m1 m1Var2) {
            if (m1Var == null) {
                b(0);
                throw null;
            }
            if (m1Var2 != null) {
                return m1Var.equals(m1Var2);
            }
            b(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C2040b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f105953c;

        static {
            int[] iArr = new int[a0.values().length];
            f105953c = iArr;
            try {
                iArr[a0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105953c[a0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105953c[a0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105953c[a0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f105952b = iArr2;
            try {
                iArr2[c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105952b[c.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105952b[c.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.b.values().length];
            f105951a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f105951a[ExternalOverridabilityCondition.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f105951a[ExternalOverridabilityCondition.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f105954c = new c(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f105955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105956b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public c(a aVar, String str) {
            if (aVar == null) {
                a(3);
                throw null;
            }
            if (str == null) {
                a(4);
                throw null;
            }
            this.f105955a = aVar;
            this.f105956b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        public static /* synthetic */ void a(int i14) {
            String str = (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? 3 : 2];
            if (i14 == 1 || i14 == 2) {
                objArr[0] = "debugMessage";
            } else if (i14 == 3) {
                objArr[0] = "success";
            } else if (i14 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i14 == 1) {
                objArr[2] = "incompatible";
            } else if (i14 == 2) {
                objArr[2] = "conflict";
            } else if (i14 == 3 || i14 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static c c(String str) {
            return new c(a.INCOMPATIBLE, str);
        }

        public final a b() {
            a aVar = this.f105955a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }

        public final String toString() {
            return this.f105955a + ": " + this.f105956b;
        }
    }

    static {
        a aVar = new a();
        f105946g = aVar;
        f105945f = new b(aVar, f.a.f142788a, e.a.f142787a, null);
    }

    private b(d.a aVar, f fVar, e eVar, p<n0, n0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
            throw null;
        }
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (eVar == null) {
            a(7);
            throw null;
        }
        this.f105949c = aVar;
        this.f105947a = fVar;
        this.f105948b = eVar;
        this.f105950d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 11 && i14 != 12 && i14 != 16 && i14 != 21 && i14 != 93 && i14 != 96 && i14 != 101 && i14 != 42 && i14 != 43) {
            switch (i14) {
                default:
                    switch (i14) {
                        default:
                            switch (i14) {
                                default:
                                    switch (i14) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 11 && i14 != 12 && i14 != 16 && i14 != 21 && i14 != 93 && i14 != 96 && i14 != 101 && i14 != 42 && i14 != 43) {
            switch (i14) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i15 = 2;
                    break;
                default:
                    switch (i14) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i15 = 2;
                            break;
                        default:
                            switch (i14) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i15 = 2;
                                    break;
                                default:
                                    switch (i14) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i15 = 2;
                                            break;
                                        default:
                                            i15 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i15 = 2;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i14 == 11 || i14 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i14 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i14 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i14 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i14 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i14 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i14 != 42 && i14 != 43) {
            switch (i14) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i14) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i14) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i14) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i14) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 11 && i14 != 12 && i14 != 16 && i14 != 21 && i14 != 93 && i14 != 96 && i14 != 101 && i14 != 42 && i14 != 43) {
            switch (i14) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i14) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i14) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i14) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(n0 n0Var, n0 n0Var2, l1 l1Var) {
        if (n0Var == null) {
            a(44);
            throw null;
        }
        if (n0Var2 == null) {
            a(45);
            throw null;
        }
        if (t.R(n0Var) && t.R(n0Var2)) {
            return true;
        }
        h hVar = h.f135849a;
        f2 f2VarI0 = n0Var.I0();
        f2 f2VarI1 = n0Var2.I0();
        hVar.getClass();
        return h.f(l1Var, f2VarI0, f2VarI1);
    }

    public static void c(t23.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(17);
            throw null;
        }
        t23.b.a kind = bVar.getKind();
        kind.getClass();
        if (kind != t23.b.a.FAKE_OVERRIDE) {
            linkedHashSet.add(bVar);
        } else {
            if (bVar.o().isEmpty()) {
                l.n(bVar, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator<? extends t23.b> it = bVar.o().iterator();
            while (it.hasNext()) {
                c(it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(t23.a aVar) {
        u0 u0VarI = aVar.I();
        ArrayList arrayList = new ArrayList();
        if (u0VarI != null) {
            arrayList.add(u0VarI.getType());
        }
        Iterator<j1> it = aVar.f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static b e(f fVar, b43.f fVar2) {
        if (fVar != null) {
            return new b(fVar2, fVar, e.a.f142787a, null);
        }
        a(3);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Collection collection, t23.e eVar, b43.l lVar) {
        a0 a0VarG;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (eVar == null) {
            a(84);
            throw null;
        }
        ArrayList arrayListY = h0.Y(collection, new q(eVar));
        boolean zIsEmpty = arrayListY.isEmpty();
        if (!zIsEmpty) {
            collection = arrayListY;
        }
        Iterator it = collection.iterator();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            if (!it.hasNext()) {
                if (eVar.O() && eVar.g() != a0.ABSTRACT && eVar.g() != a0.SEALED) {
                    z14 = true;
                }
                if (z15 && !z16) {
                    a0VarG = a0.OPEN;
                    if (a0VarG != null) {
                        break;
                    }
                    a(89);
                    throw null;
                }
                if (!z15 && z16) {
                    a0VarG = z14 ? eVar.g() : a0.ABSTRACT;
                    if (a0VarG != null) {
                        break;
                    }
                    a(90);
                    throw null;
                }
                HashSet<t23.b> hashSet = new HashSet();
                for (t23.b bVar : collection) {
                    if (bVar == null) {
                        a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c(bVar, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                    t23.l lVar2 = (t23.l) hashSet.iterator().next();
                    int i14 = f43.e.f68881a;
                    lVar2.getClass();
                    c0 c0VarC = i.c(lVar2);
                    c0VarC.getClass();
                }
                n nVar = new n();
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj : hashSet) {
                        Iterator it3 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                linkedHashSet2.add(obj);
                                break;
                            }
                            o13.p<t23.a, t23.a> pVarInvoke = nVar.invoke(obj, it3.next());
                            t23.a aVar = pVarInvoke.f128594a;
                            t23.a aVar2 = pVarInvoke.f128595b;
                            if (!s(aVar, aVar2)) {
                                if (s(aVar2, aVar)) {
                                    break;
                                }
                            } else {
                                it3.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                a0 a0VarG2 = eVar.g();
                if (a0VarG2 == null) {
                    a(92);
                    throw null;
                }
                a0 a0Var = a0.ABSTRACT;
                for (t23.b bVar2 : hashSet) {
                    a0 a0VarG3 = (z14 && bVar2.g() == a0.ABSTRACT) ? a0VarG2 : bVar2.g();
                    if (a0VarG3.compareTo(a0Var) < 0) {
                        a0Var = a0VarG3;
                    }
                }
                if (a0Var != null) {
                    a0VarG = a0Var;
                    break;
                } else {
                    a(93);
                    throw null;
                }
            }
            t23.b bVar3 = (t23.b) it.next();
            int i15 = C2040b.f105953c[bVar3.g().ordinal()];
            if (i15 == 1) {
                a0VarG = a0.FINAL;
                if (a0VarG != null) {
                    break;
                }
                a(88);
                throw null;
            }
            if (i15 == 2) {
                l.n(bVar3, "Member cannot have SEALED modality: ");
                return;
            } else if (i15 == 3) {
                z15 = true;
            } else if (i15 == 4) {
                z16 = true;
            }
        }
        t23.b bVarF0 = ((t23.b) u(collection, new b43.p())).f0(eVar, a0VarG, zIsEmpty ? t23.q.f162053h : t23.q.f162052g, t23.b.a.FAKE_OVERRIDE);
        lVar.c(bVarF0, collection);
        lVar.a(bVarF0);
    }

    public static b h(f fVar) {
        return new b(f105946g, fVar, e.a.f142787a, null);
    }

    public static ArrayList i(Object obj, LinkedList linkedList, e23.l lVar, e23.l lVar2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        if (lVar == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        t23.a aVar = (t23.a) lVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            t23.a aVar2 = (t23.a) lVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                c.a aVarL = l(aVar, aVar2);
                if (aVarL == c.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarL == c.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static c k(t23.a aVar, t23.a aVar2) {
        boolean z14;
        c cVarC;
        if (aVar == null) {
            a(38);
            throw null;
        }
        if (aVar2 == null) {
            a(39);
            throw null;
        }
        boolean z15 = aVar instanceof v;
        if ((z15 && !(aVar2 instanceof v)) || (((z14 = aVar instanceof r0)) && !(aVar2 instanceof r0))) {
            return c.c("Member kind mismatch");
        }
        if (!z15 && !z14) {
            l.j(aVar, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return c.c("Name mismatch");
        }
        if ((aVar.I() == null) != (aVar2.I() == null)) {
            cVarC = c.c("Receiver presence mismatch");
        } else {
            cVarC = aVar.f().size() != aVar2.f().size() ? c.c("Value parameter number mismatch") : null;
        }
        if (cVarC != null) {
            return cVarC;
        }
        return null;
    }

    public static c.a l(t23.a aVar, t23.a aVar2) {
        b bVar = f105945f;
        c.a aVarB = bVar.n(aVar2, aVar, null).b();
        c.a aVarB2 = bVar.o(aVar, aVar2, null, false).b();
        c.a aVar3 = c.a.OVERRIDABLE;
        if (aVarB == aVar3 && aVarB2 == aVar3) {
            return aVar3;
        }
        c.a aVar4 = c.a.CONFLICT;
        return (aVarB == aVar4 || aVarB2 == aVar4) ? aVar4 : c.a.INCOMPATIBLE;
    }

    public static boolean m(t23.a aVar, t23.a aVar2) {
        if (aVar == null) {
            a(65);
            throw null;
        }
        if (aVar2 == null) {
            a(66);
            throw null;
        }
        n0 returnType = aVar.getReturnType();
        n0 returnType2 = aVar2.getReturnType();
        if (!r(aVar, aVar2)) {
            return false;
        }
        l1 l1VarG = f105945f.g(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof v) {
            return q(aVar, returnType, aVar2, returnType2, l1VarG);
        }
        if (!(aVar instanceof r0)) {
            j.A(aVar.getClass(), "Unexpected callable: ");
            return false;
        }
        r0 r0Var = (r0) aVar;
        r0 r0Var2 = (r0) aVar2;
        t0 setter = r0Var.getSetter();
        t0 setter2 = r0Var2.getSetter();
        if (!((setter == null || setter2 == null) ? true : r(setter, setter2))) {
            return false;
        }
        if (!r0Var.Y() || !r0Var2.Y()) {
            return (r0Var.Y() || !r0Var2.Y()) && q(aVar, returnType, aVar2, returnType2, l1VarG);
        }
        h hVar = h.f135849a;
        f2 f2VarI0 = returnType.I0();
        f2 f2VarI1 = returnType2.I0();
        hVar.getClass();
        return h.f(l1VarG, f2VarI0, f2VarI1);
    }

    public static boolean q(t23.a aVar, n0 n0Var, t23.a aVar2, n0 n0Var2, l1 l1Var) {
        if (aVar == null) {
            a(71);
            throw null;
        }
        if (n0Var == null) {
            a(72);
            throw null;
        }
        if (aVar2 == null) {
            a(73);
            throw null;
        }
        if (n0Var2 == null) {
            a(74);
            throw null;
        }
        h hVar = h.f135849a;
        f2 f2VarI0 = n0Var.I0();
        f2 f2VarI1 = n0Var2.I0();
        hVar.getClass();
        return h.j(hVar, l1Var, f2VarI0, f2VarI1);
    }

    public static boolean r(t23.a aVar, t23.a aVar2) {
        if (aVar == null) {
            a(67);
            throw null;
        }
        if (aVar2 != null) {
            Integer numB = t23.q.b(aVar.getVisibility(), aVar2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean s(t23.a aVar, t23.a aVar2) {
        if (aVar == null) {
            a(13);
            throw null;
        }
        if (aVar2 == null) {
            a(14);
            throw null;
        }
        if (!aVar.equals(aVar2) && p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a.a(aVar.a(), aVar2.a(), false)) {
            return true;
        }
        t23.a aVarA = aVar2.a();
        int i14 = i.f15728a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i.b(aVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a.a(aVarA, (t23.a) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void t(t23.b bVar, e23.l<t23.b, Unit> lVar) {
        r rVar;
        r rVarD;
        r rVar2;
        if (bVar == null) {
            a(105);
            throw null;
        }
        for (t23.b bVar2 : bVar.o()) {
            if (bVar2.getVisibility() == t23.q.f162052g) {
                t(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() != t23.q.f162052g) {
            return;
        }
        Collection<? extends t23.b> collectionO = bVar.o();
        if (collectionO == null) {
            a(107);
            throw null;
        }
        if (!collectionO.isEmpty()) {
            Iterator<? extends t23.b> it = collectionO.iterator();
            loop3: while (true) {
                rVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    r visibility = it.next().getVisibility();
                    if (rVar != null) {
                        Integer numB = t23.q.b(visibility, rVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    rVar = visibility;
                }
            }
            if (rVar == null) {
                rVarD = null;
                break;
            }
            Iterator<? extends t23.b> it3 = collectionO.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    rVarD = rVar;
                    break;
                }
                Integer numB2 = t23.q.b(rVar, it3.next().getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    rVarD = null;
                    break;
                }
            }
        } else {
            rVarD = t23.q.f162057l;
        }
        if (rVarD == null) {
            rVarD = null;
            break;
        }
        if (bVar.getKind() == t23.b.a.FAKE_OVERRIDE) {
            for (t23.b bVar3 : collectionO) {
                if (bVar3.g() != a0.ABSTRACT && !bVar3.getVisibility().equals(rVarD)) {
                    rVarD = null;
                    break;
                }
            }
        } else {
            rVarD = rVarD.d();
        }
        if (rVarD == null) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            rVar2 = t23.q.f162050e;
        } else {
            rVar2 = rVarD;
        }
        if (bVar instanceof w23.n0) {
            w23.n0 n0Var = (w23.n0) bVar;
            if (rVar2 == null) {
                w23.n0.y(20);
                throw null;
            }
            n0Var.f181665j = rVar2;
            Iterator it4 = ((r0) bVar).V().iterator();
            while (it4.hasNext()) {
                t((q0) it4.next(), rVarD == null ? null : lVar);
            }
            return;
        }
        if (bVar instanceof x) {
            x xVar = (x) bVar;
            if (rVar2 != null) {
                xVar.f181730l = rVar2;
                return;
            } else {
                x.y(10);
                throw null;
            }
        }
        m0 m0Var = (m0) bVar;
        m0Var.f181660k = rVar2;
        if (rVar2 != m0Var.p0().getVisibility()) {
            m0Var.f181654e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H u(Collection<H> collection, e23.l<H, t23.a> lVar) {
        H h14;
        n0 returnType;
        if (lVar == 0) {
            a(77);
            throw null;
        }
        if (collection.size() == 1) {
            H h15 = (H) h0.a0(collection);
            if (h15 != null) {
                return h15;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.invoke(it.next()));
        }
        H h16 = (H) h0.a0(collection);
        t23.a aVar = (t23.a) lVar.invoke(h16);
        for (H h17 : collection) {
            t23.a aVar2 = (t23.a) lVar.invoke(h17);
            if (aVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    arrayList.add(h17);
                    break;
                }
            } while (m(aVar2, (t23.a) it3.next()));
            if (m(aVar2, aVar) && !m(aVar, aVar2)) {
                h16 = h17;
            }
        }
        if (arrayList.isEmpty()) {
            if (h16 != null) {
                return h16;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h18 = (H) h0.a0(arrayList);
            if (h18 != null) {
                return h18;
            }
            a(80);
            throw null;
        }
        Iterator it4 = arrayList.iterator();
        do {
            if (!it4.hasNext()) {
                h14 = null;
                break;
            }
            h14 = (H) it4.next();
            returnType = ((t23.a) lVar.invoke(h14)).getReturnType();
            returnType.getClass();
        } while (returnType.I0() instanceof f0);
        if (h14 != null) {
            return h14;
        }
        H h19 = (H) h0.a0(arrayList);
        if (h19 != null) {
            return h19;
        }
        a(82);
        throw null;
    }

    public final l1 g(List<d1> list, List<d1> list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        if (list.isEmpty()) {
            return new u(null, this.f105949c, this.f105947a, this.f105948b, this.f105950d).G0();
        }
        HashMap map = new HashMap();
        for (int i14 = 0; i14 < list.size(); i14++) {
            map.put(list.get(i14).h(), list2.get(i14).h());
        }
        return new u(map, this.f105949c, this.f105947a, this.f105948b, this.f105950d).G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(x33.f fVar, Collection collection, Collection collection2, t23.e eVar, b43.l lVar) {
        Integer numB;
        if (fVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (eVar == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            t23.b bVar = (t23.b) it.next();
            if (bVar == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            z43.j.f202430c.getClass();
            z43.j jVarA = z43.j.b.a();
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                t23.b bVar2 = (t23.b) it3.next();
                c.a aVarB = n(bVar2, bVar, eVar).b();
                boolean z14 = !t23.q.e(bVar2.getVisibility()) && t23.q.c(t23.q.f162059n, bVar2, bVar) == null;
                int i14 = C2040b.f105952b[aVarB.ordinal()];
                if (i14 == 1) {
                    if (z14) {
                        jVarA.add(bVar2);
                    }
                    arrayList.add(bVar2);
                } else if (i14 == 2) {
                    if (z14) {
                        lVar.d(bVar2, bVar);
                    }
                    arrayList.add(bVar2);
                }
            }
            lVar.c(bVar, jVarA);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            o oVar = new o(((t23.b) linkedHashSet.iterator().next()).d());
            if (!linkedHashSet.isEmpty()) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    if (!((Boolean) oVar.invoke(it4.next())).booleanValue()) {
                        LinkedList<t23.b> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            t23.b bVar3 = null;
                            for (t23.b bVar4 : linkedList) {
                                if (bVar3 == null || ((numB = t23.q.b(bVar3.getVisibility(), bVar4.getVisibility())) != null && numB.intValue() < 0)) {
                                    bVar3 = bVar4;
                                }
                            }
                            bVar3.getClass();
                            f(i(bVar3, linkedList, new b43.r(), new s(lVar, bVar3)), eVar, lVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it5 = linkedHashSet.iterator();
        while (it5.hasNext()) {
            f(Collections.singleton((t23.b) it5.next()), eVar, lVar);
        }
    }

    public final c n(t23.a aVar, t23.a aVar2, t23.e eVar) {
        if (aVar == null) {
            a(19);
            throw null;
        }
        if (aVar2 != null) {
            return o(aVar, aVar2, eVar, false);
        }
        a(20);
        throw null;
    }

    public final c o(t23.a aVar, t23.a aVar2, t23.e eVar, boolean z14) {
        if (aVar == null) {
            a(22);
            throw null;
        }
        if (aVar2 == null) {
            a(23);
            throw null;
        }
        c cVarP = p(z14, aVar, aVar2);
        boolean z15 = cVarP.b() == c.a.OVERRIDABLE;
        List<ExternalOverridabilityCondition> list = f105944e;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
            if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.a.CONFLICTS_ONLY && (!z15 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.a.SUCCESS_ONLY)) {
                int i14 = C2040b.f105951a[externalOverridabilityCondition.isOverridable(aVar, aVar2, eVar).ordinal()];
                if (i14 == 1) {
                    z15 = true;
                } else if (i14 == 2) {
                    return c.c("External condition");
                }
            }
        }
        if (!z15) {
            return cVarP;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
            if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.a.CONFLICTS_ONLY) {
                int i15 = C2040b.f105951a[externalOverridabilityCondition2.isOverridable(aVar, aVar2, eVar).ordinal()];
                if (i15 == 1) {
                    g.x("Contract violation in ", externalOverridabilityCondition2.getClass().getName(), " condition. It's not supposed to end with success");
                    return null;
                }
                if (i15 == 2) {
                    return c.c("External condition");
                }
            }
        }
        c cVar = c.f105954c;
        if (cVar != null) {
            return cVar;
        }
        c.a(0);
        throw null;
    }

    public final c p(boolean z14, t23.a aVar, t23.a aVar2) {
        if (aVar == null) {
            a(28);
            throw null;
        }
        if (aVar2 == null) {
            a(29);
            throw null;
        }
        c cVarK = k(aVar, aVar2);
        if (cVarK != null) {
            return cVarK;
        }
        ArrayList arrayListD = d(aVar);
        ArrayList arrayListD2 = d(aVar2);
        List<d1> typeParameters = aVar.getTypeParameters();
        List<d1> typeParameters2 = aVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i14 = 0; i14 < arrayListD.size(); i14++) {
                if (!d.f142786a.a((n0) arrayListD.get(i14), (n0) arrayListD2.get(i14))) {
                    return c.c("Type parameter number mismatch");
                }
            }
            return new c(c.a.CONFLICT, "Type parameter number mismatch");
        }
        l1 l1VarG = g(typeParameters, typeParameters2);
        for (int i15 = 0; i15 < typeParameters.size(); i15++) {
            d1 d1Var = typeParameters.get(i15);
            d1 d1Var2 = typeParameters2.get(i15);
            if (d1Var == null) {
                a(47);
                throw null;
            }
            if (d1Var2 == null) {
                a(48);
                throw null;
            }
            List<n0> upperBounds = d1Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(d1Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (n0 n0Var : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(n0Var, (n0) listIterator.next(), l1VarG));
                    listIterator.remove();
                }
            }
            return c.c("Type parameter bounds mismatch");
        }
        for (int i16 = 0; i16 < arrayListD.size(); i16++) {
            if (!b((n0) arrayListD.get(i16), (n0) arrayListD2.get(i16), l1VarG)) {
                return c.c("Value parameter type mismatch");
            }
        }
        if ((aVar instanceof v) && (aVar2 instanceof v) && ((v) aVar).isSuspend() != ((v) aVar2).isSuspend()) {
            return new c(c.a.CONFLICT, "Incompatible suspendability");
        }
        if (z14) {
            n0 returnType = aVar.getReturnType();
            n0 returnType2 = aVar2.getReturnType();
            if (returnType != null && returnType2 != null && (!t.R(returnType2) || !t.R(returnType))) {
                h hVar = h.f135849a;
                f2 f2VarI0 = returnType2.I0();
                f2 f2VarI1 = returnType.I0();
                hVar.getClass();
                if (!h.j(hVar, l1VarG, f2VarI0, f2VarI1)) {
                    return new c(c.a.CONFLICT, "Return type mismatch");
                }
            }
        }
        c cVar = c.f105954c;
        if (cVar != null) {
            return cVar;
        }
        c.a(0);
        throw null;
    }
}
