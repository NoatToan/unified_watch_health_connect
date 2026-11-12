package b43;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p43.m1;
import t23.h0;
import t23.n0;
import t23.t0;
import t23.z0;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15728a = 0;

    static {
        new x33.c("kotlin.jvm.JvmName");
    }

    private i() {
    }

    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i15 = 2;
                break;
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = FirebaseAnalytics.Param.LOCATION;
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = Action.SCOPE_ATTRIBUTE;
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i14) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i14) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(t23.a aVar, LinkedHashSet linkedHashSet) {
        if (aVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(aVar)) {
            return;
        }
        Iterator<? extends t23.a> it = aVar.a().o().iterator();
        while (it.hasNext()) {
            t23.a aVarA = it.next().a();
            b(aVarA, linkedHashSet);
            linkedHashSet.add(aVarA);
        }
    }

    public static t23.c0 c(t23.l lVar) {
        if (lVar == null) {
            a(21);
            throw null;
        }
        t23.c0 c0VarD = d(lVar);
        if (c0VarD != null) {
            return c0VarD;
        }
        a(22);
        throw null;
    }

    public static t23.c0 d(t23.l lVar) {
        if (lVar == null) {
            a(23);
            throw null;
        }
        while (lVar != null) {
            if (lVar instanceof t23.c0) {
                return (t23.c0) lVar;
            }
            if (lVar instanceof n0) {
                return ((n0) lVar).B0();
            }
            lVar = lVar.d();
        }
        return null;
    }

    public static z0 e(t23.l lVar) {
        if (lVar == null) {
            a(81);
            throw null;
        }
        if (lVar instanceof t0) {
            lVar = ((t0) lVar).p0();
        }
        if (lVar instanceof t23.m) {
            z0.a aVarA = ((t23.m) lVar).getSource().a();
            if (aVarA != null) {
                return aVarA;
            }
            a(82);
            throw null;
        }
        z0.a aVar = z0.f162077a;
        if (aVar != null) {
            return aVar;
        }
        a(83);
        throw null;
    }

    public static x33.d f(t23.l lVar) {
        if (lVar != null) {
            x33.c cVarG = g(lVar);
            return cVarG != null ? cVarG.f188596a : f(lVar.d()).a(lVar.getName());
        }
        a(2);
        throw null;
    }

    public static x33.c g(t23.l lVar) {
        if (lVar == null) {
            a(5);
            throw null;
        }
        if ((lVar instanceof t23.c0) || r43.l.f(lVar)) {
            return x33.c.f188595d;
        }
        if (lVar instanceof n0) {
            return ((n0) lVar).c();
        }
        if (lVar instanceof h0) {
            return ((h0) lVar).c();
        }
        return null;
    }

    public static <D extends t23.l> D h(t23.l lVar, Class<D> cls, boolean z14) {
        if (lVar == null) {
            return null;
        }
        if (z14) {
            lVar = (D) lVar.d();
        }
        while (lVar != null) {
            if (cls.isInstance(lVar)) {
                return (D) lVar;
            }
            lVar = (D) lVar.d();
        }
        return null;
    }

    public static t23.e i(t23.e eVar) {
        if (eVar == null) {
            a(44);
            throw null;
        }
        for (p43.n0 n0Var : eVar.h().b()) {
            if (n0Var == null) {
                a(45);
                throw null;
            }
            m1 m1VarF0 = n0Var.F0();
            if (m1VarF0 == null) {
                a(46);
                throw null;
            }
            t23.e eVar2 = (t23.e) m1VarF0.t();
            if (eVar2 == null) {
                a(47);
                throw null;
            }
            if (eVar2.getKind() != t23.f.INTERFACE) {
                return eVar2;
            }
        }
        return null;
    }

    public static boolean j(t23.l lVar) {
        if (lVar != null) {
            return l(lVar, t23.f.CLASS) && lVar.getName().equals(x33.h.f188610b);
        }
        a(34);
        throw null;
    }

    public static boolean k(t23.l lVar) {
        return l(lVar, t23.f.OBJECT) && ((t23.e) lVar).s0();
    }

    public static boolean l(t23.l lVar, t23.f fVar) {
        if (fVar != null) {
            return (lVar instanceof t23.e) && ((t23.e) lVar).getKind() == fVar;
        }
        a(37);
        throw null;
    }

    public static boolean m(t23.l lVar) {
        if (lVar == null) {
            a(1);
            throw null;
        }
        while (lVar != null) {
            if (j(lVar) || ((lVar instanceof t23.o) && ((t23.o) lVar).getVisibility() == t23.q.f162051f)) {
                return true;
            }
            lVar = lVar.d();
        }
        return false;
    }

    public static boolean n(p43.n0 n0Var, t23.l lVar) {
        if (n0Var == null) {
            a(30);
            throw null;
        }
        if (lVar == null) {
            a(31);
            throw null;
        }
        t23.h hVarT = n0Var.F0().t();
        if (hVarT == null) {
            return false;
        }
        t23.l lVarA = hVarT.a();
        return (lVarA instanceof t23.h) && (lVar instanceof t23.h) && ((t23.h) lVar).h().equals(((t23.h) lVarA).h());
    }

    public static boolean o(t23.i iVar) {
        return (l(iVar, t23.f.CLASS) || l(iVar, t23.f.INTERFACE)) && ((t23.e) iVar).g() == t23.a0.SEALED;
    }

    public static boolean p(p43.n0 n0Var, t23.l lVar) {
        if (n0Var == null) {
            a(32);
            throw null;
        }
        if (lVar == null) {
            a(33);
            throw null;
        }
        if (n(n0Var, lVar)) {
            return true;
        }
        Iterator<p43.n0> it = n0Var.F0().b().iterator();
        while (it.hasNext()) {
            if (p(it.next(), lVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(t23.l lVar) {
        return lVar != null && (lVar.d() instanceof h0);
    }

    public static <D extends t23.b> D r(D d14) {
        if (d14 == null) {
            a(58);
            throw null;
        }
        while (d14.getKind() == t23.b.a.FAKE_OVERRIDE) {
            Collection<? extends t23.b> collectionO = d14.o();
            if (collectionO.isEmpty()) {
                com.google.firebase.messaging.l.n(d14, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            d14 = (D) collectionO.iterator().next();
        }
        return d14;
    }
}
