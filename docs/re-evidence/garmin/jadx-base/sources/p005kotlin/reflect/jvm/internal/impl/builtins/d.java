package p005kotlin.reflect.jvm.internal.impl.builtins;

import b43.i;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e23.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o43.h;
import o43.j;
import o43.n;
import og2.k;
import p13.j0;
import p13.l0;
import p13.u;
import p43.d2;
import p43.f2;
import p43.g2;
import p43.m1;
import p43.q0;
import p43.v0;
import p43.v1;
import q23.m;
import t23.c0;
import t23.e;
import t23.h0;
import t23.n0;
import t23.r0;
import t23.t0;
import t23.v;
import w23.f0;
import w23.i0;
import w23.o0;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f105832e = f.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f105833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<C2038d> f105834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<f, e> f105835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f105836d;

    public class a implements e23.a<Collection<n0>> {
        public a() {
        }

        @Override // e23.a
        public final Collection<n0> invoke() {
            d dVar = d.this;
            return Arrays.asList(dVar.l().d0(f.f105860l), dVar.l().d0(f.f105862n), dVar.l().d0(f.f105863o), dVar.l().d0(f.f105861m));
        }
    }

    public class b implements e23.a<C2038d> {
        public b() {
        }

        @Override // e23.a
        public final C2038d invoke() {
            EnumMap enumMap = new EnumMap(q23.h.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            q23.h[] hVarArrValues = q23.h.values();
            int length = hVarArrValues.length;
            int i14 = 0;
            while (true) {
                a aVar = null;
                if (i14 >= length) {
                    return new C2038d(enumMap, map, map2, aVar);
                }
                q23.h hVar = hVarArrValues[i14];
                String strB = hVar.f142332a.b();
                f fVar = d.f105832e;
                d dVar = d.this;
                if (strB == null) {
                    dVar.getClass();
                    d.a(47);
                    throw null;
                }
                v0 v0VarP = dVar.k(strB).p();
                if (v0VarP == null) {
                    d.a(48);
                    throw null;
                }
                String strB2 = hVar.f142333b.b();
                if (strB2 == null) {
                    d.a(47);
                    throw null;
                }
                v0 v0VarP2 = dVar.k(strB2).p();
                if (v0VarP2 == null) {
                    d.a(48);
                    throw null;
                }
                enumMap.put(hVar, v0VarP2);
                map.put(v0VarP, v0VarP2);
                map2.put(v0VarP2, v0VarP);
                i14++;
            }
        }
    }

    public class c implements l<f, e> {
        public c() {
        }

        @Override // e23.l
        public final e invoke(f fVar) {
            f fVar2 = fVar;
            i0 i0VarL = d.this.l();
            x33.c cVar = f.f105860l;
            i43.l lVarI = i0VarL.d0(cVar).i();
            if (lVarI == null) {
                d.a(11);
                throw null;
            }
            t23.h hVarF = ((i43.a) lVarI).f(fVar2, b33.b.FROM_BUILTINS);
            if (hVarF == null) {
                p6.b.o("Built-in class ", cVar.a(fVar2), " is not found");
                return null;
            }
            if (hVarF instanceof e) {
                return (e) hVarF;
            }
            throw new AssertionError("Must be a class descriptor " + fVar2 + ", but was " + hVarF);
        }
    }

    public d(n nVar) {
        if (nVar == null) {
            a(0);
            throw null;
        }
        this.f105836d = nVar;
        nVar.g(new a());
        this.f105834b = nVar.g(new b());
        this.f105835c = nVar.e(new c());
    }

    public static boolean A(t23.l lVar) {
        if (lVar != null) {
            return i.h(lVar, q23.b.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(p43.n0 n0Var, x33.d dVar) {
        if (n0Var == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return J(n0Var.F0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean C(p43.n0 n0Var, x33.d dVar) {
        if (dVar != null) {
            return B(n0Var, dVar) && !n0Var.G0();
        }
        a(TsExtractor.TS_STREAM_TYPE_E_AC3);
        throw null;
    }

    public static boolean D(v vVar) {
        if (vVar.a().getAnnotations().I3(f.a.f105888n)) {
            return true;
        }
        if (!(vVar instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) vVar;
        boolean zY = r0Var.Y();
        o0 getter = r0Var.getGetter();
        t0 setter = r0Var.getSetter();
        if (getter == null || !D(getter)) {
            return false;
        }
        if (zY) {
            return setter != null && D(setter);
        }
        return true;
    }

    public static boolean E(p43.n0 n0Var, x33.d dVar) {
        if (dVar != null) {
            return !n0Var.G0() && B(n0Var, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(p43.n0 n0Var) {
        if (n0Var != null) {
            return B(n0Var, f.a.f105871c) && !d2.g(n0Var);
        }
        a(SyslogConstants.LOG_LOCAL1);
        throw null;
    }

    public static boolean G(p43.n0 n0Var) {
        if (n0Var != null) {
            t23.h hVarT = n0Var.F0().t();
            return (hVarT == null || s(hVarT) == null) ? false : true;
        }
        a(91);
        throw null;
    }

    public static boolean H(p43.n0 n0Var) {
        if (n0Var.G0()) {
            return false;
        }
        t23.h hVarT = n0Var.F0().t();
        return (hVarT instanceof e) && u((e) hVarT) != null;
    }

    public static boolean I(p43.n0 n0Var) {
        return E(n0Var, f.a.f105879g);
    }

    public static boolean J(m1 m1Var, x33.d dVar) {
        if (m1Var == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            t23.h hVarT = m1Var.t();
            return (hVarT instanceof e) && b((e) hVarT, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean K(t23.h hVar) {
        if (hVar == null) {
            a(10);
            throw null;
        }
        for (t23.l lVarD = hVar; lVarD != null; lVarD = lVarD.d()) {
            if (lVarD instanceof h0) {
                x33.c cVarC = ((h0) lVarD).c();
                f fVar = f.f105859k;
                cVarC.getClass();
                fVar.getClass();
                return cVarC.f188596a.h(fVar);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 11 && i14 != 13 && i14 != 15 && i14 != 69 && i14 != 74 && i14 != 81 && i14 != 84 && i14 != 86 && i14 != 87) {
            switch (i14) {
                default:
                    switch (i14) {
                        default:
                            switch (i14) {
                                default:
                                    switch (i14) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 11 && i14 != 13 && i14 != 15 && i14 != 69 && i14 != 74 && i14 != 81 && i14 != 84 && i14 != 86 && i14 != 87) {
            switch (i14) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i15 = 2;
                    break;
                default:
                    switch (i14) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i15 = 2;
                            break;
                        default:
                            switch (i14) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i15 = 2;
                                    break;
                                default:
                                    switch (i14) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case 139:
            case 140:
            case 141:
            case 142:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 145:
            case 148:
            case 150:
            case 151:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 161:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i14 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i14 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i14 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i14 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i14 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i14 == 81 || i14 == 84) {
            objArr[1] = "getArrayType";
        } else if (i14 == 86) {
            objArr[1] = "getEnumType";
        } else if (i14 != 87) {
            switch (i14) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i14) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i14) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i14) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i14) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 11 && i14 != 13 && i14 != 15 && i14 != 69 && i14 != 74 && i14 != 81 && i14 != 84 && i14 != 86 && i14 != 87) {
            switch (i14) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i14) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i14) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i14) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    public static boolean b(e eVar, x33.d dVar) {
        if (eVar == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return eVar.getName().equals(dVar.g()) && dVar.equals(i.f(eVar));
        }
        a(104);
        throw null;
    }

    public static q23.h s(t23.h hVar) {
        if (hVar == null) {
            a(77);
            throw null;
        }
        if (f.a.f105878f0.contains(hVar.getName())) {
            return (q23.h) f.a.f105882h0.get(i.f(hVar));
        }
        return null;
    }

    public static q23.h u(e eVar) {
        if (f.a.f105876e0.contains(eVar.getName())) {
            return (q23.h) f.a.f105880g0.get(i.f(eVar));
        }
        return null;
    }

    public static boolean y(p43.n0 n0Var) {
        if (n0Var != null) {
            return B(n0Var, f.a.f105869b);
        }
        a(139);
        throw null;
    }

    public static boolean z(p43.n0 n0Var) {
        if (n0Var != null) {
            return B(n0Var, f.a.f105881h);
        }
        a(88);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o13.l] */
    public final void c(boolean z14) {
        i0 i0Var = new i0(f105832e, this.f105836d, this, null);
        this.f105833a = i0Var;
        BuiltInsLoader.f105825a.getClass();
        t23.i0 i0VarCreatePackageFragmentProvider = ((BuiltInsLoader) BuiltInsLoader.a.f105827b.getValue()).createPackageFragmentProvider(this.f105836d, this.f105833a, m(), q(), d(), z14);
        i0VarCreatePackageFragmentProvider.getClass();
        i0Var.f181626h = i0VarCreatePackageFragmentProvider;
        i0 i0Var2 = this.f105833a;
        i0Var2.getClass();
        List listI0 = u.i0(new i0[]{i0Var2});
        listI0.getClass();
        l0 l0Var = l0.f134950a;
        l0Var.getClass();
        i0Var2.f181625g = new f0(listI0, l0Var, j0.f134944a, l0Var);
    }

    public v23.a d() {
        v23.a.C3264a c3264a = v23.a.C3264a.f175350a;
        if (c3264a != null) {
            return c3264a;
        }
        a(3);
        throw null;
    }

    public final v0 e() {
        v0 v0VarP = k("Any").p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(51);
        throw null;
    }

    public final p43.n0 f(p43.n0 n0Var) {
        if (n0Var == null) {
            a(68);
            throw null;
        }
        p43.n0 n0VarG = g(n0Var);
        if (n0VarG != null) {
            return n0VarG;
        }
        com.google.firebase.messaging.l.n(n0Var, "not array: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final p43.n0 g(p43.n0 n0Var) {
        x33.b bVarF;
        x33.b bVar;
        e eVarA;
        v0 v0VarP;
        if (n0Var == null) {
            a(70);
            throw null;
        }
        if (!z(n0Var)) {
            f2 f2VarI = d2.i(n0Var, false);
            v0 v0Var = this.f105834b.invoke().f105842c.get(f2VarI);
            if (v0Var != null) {
                return v0Var;
            }
            int i14 = i.f15728a;
            t23.h hVarT = f2VarI.F0().t();
            c0 c0VarD = hVarT == null ? null : i.d(hVarT);
            if (c0VarD != null) {
                t23.h hVarT2 = f2VarI.F0().t();
                if (hVarT2 == null) {
                    v0VarP = null;
                } else {
                    m mVar = m.f142348a;
                    f name = hVarT2.getName();
                    mVar.getClass();
                    name.getClass();
                    if (!m.f142353f.contains(name) || (bVarF = f43.e.f(hVarT2)) == null || (bVar = m.f142351d.get(bVarF)) == null || (eVarA = t23.u.a(c0VarD, bVar)) == null) {
                        v0VarP = null;
                    } else {
                        v0VarP = eVarA.p();
                    }
                }
                if (v0VarP != null) {
                    return v0VarP;
                }
            }
        } else if (n0Var.D0().size() == 1) {
            return n0Var.D0().get(0).getType();
        }
        return null;
    }

    public final v0 h(g2 g2Var, p43.n0 n0Var) {
        if (g2Var == null) {
            a(82);
            throw null;
        }
        if (n0Var != null) {
            u23.h.f168226x0.getClass();
            return i(g2Var, n0Var, u23.h.a.f168228b);
        }
        a(83);
        throw null;
    }

    public final v0 i(g2 g2Var, p43.n0 n0Var, u23.h hVar) {
        if (g2Var == null) {
            a(78);
            throw null;
        }
        if (n0Var == null) {
            a(79);
            throw null;
        }
        if (hVar != null) {
            return q0.d(p43.v.f135927a.a(hVar), k("Array"), Collections.singletonList(new v1(g2Var, n0Var)));
        }
        a(80);
        throw null;
    }

    public final e j(x33.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        e eVarD = k.D(l(), cVar, b33.b.FROM_BUILTINS);
        if (eVarD != null) {
            return eVarD;
        }
        a(13);
        throw null;
    }

    public final e k(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        e eVar = (e) ((o43.e.k) this.f105835c).invoke(f.e(str));
        if (eVar != null) {
            return eVar;
        }
        a(15);
        throw null;
    }

    public final i0 l() {
        this.f105833a.getClass();
        i0 i0Var = this.f105833a;
        if (i0Var != null) {
            return i0Var;
        }
        a(7);
        throw null;
    }

    public Iterable<v23.b> m() {
        List listSingletonList = Collections.singletonList(new r23.a(this.f105836d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final v0 n() {
        v0 v0VarP = p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(53);
        throw null;
    }

    public final v0 o() {
        v0 v0VarP = k("Nothing").p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(49);
        throw null;
    }

    public final v0 p() {
        v0 v0VarM0 = e().J0(true);
        if (v0VarM0 != null) {
            return v0VarM0;
        }
        a(52);
        throw null;
    }

    public v23.c q() {
        v23.c.b bVar = v23.c.b.f175352a;
        if (bVar != null) {
            return bVar;
        }
        a(4);
        throw null;
    }

    public final v0 r(q23.h hVar) {
        if (hVar == null) {
            a(73);
            throw null;
        }
        v0 v0Var = this.f105834b.invoke().f105840a.get(hVar);
        if (v0Var != null) {
            return v0Var;
        }
        a(74);
        throw null;
    }

    public final v0 t(q23.h hVar) {
        if (hVar == null) {
            a(54);
            throw null;
        }
        if (hVar == null) {
            a(16);
            throw null;
        }
        v0 v0VarP = k(hVar.f142332a.b()).p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(55);
        throw null;
    }

    public final v0 v() {
        v0 v0VarP = k("String").p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(66);
        throw null;
    }

    public final e w(int i14) {
        e eVarJ = j(f.f105854f.a(f.e(r23.f.d.f149962c.f149958b + i14)));
        if (eVarJ != null) {
            return eVarJ;
        }
        a(18);
        throw null;
    }

    public final v0 x() {
        v0 v0VarP = k("Unit").p();
        if (v0VarP != null) {
            return v0VarP;
        }
        a(65);
        throw null;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.d$d, reason: collision with other inner class name */
    public static class C2038d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<q23.h, v0> f105840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<p43.n0, v0> f105841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<v0, v0> f105842c;

        private C2038d(Map<q23.h, v0> map, Map<p43.n0, v0> map2, Map<v0, v0> map3) {
            if (map == null) {
                a(0);
                throw null;
            }
            if (map2 == null) {
                a(1);
                throw null;
            }
            if (map3 == null) {
                a(2);
                throw null;
            }
            this.f105840a = map;
            this.f105841b = map2;
            this.f105842c = map3;
        }

        public static /* synthetic */ void a(int i14) {
            Object[] objArr = new Object[3];
            if (i14 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i14 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public /* synthetic */ C2038d(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }
    }
}
