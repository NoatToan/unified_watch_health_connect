package x01;

import b63.n;
import c22.s3;
import c80.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import fw.p;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx01/i;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f188278a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p2 f188279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f188280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z53.b f188281d;

    static {
        p2 p2VarA = q2.a(new e(null, null, null, null, false, false, false, 127, null));
        f188279b = p2VarA;
        f188280c = s.d(p2VarA);
        f188281d = z53.c.a();
    }

    private i() {
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01dd A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0209 A[Catch: all -> 0x0130, TRY_ENTER, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0225  */
    /* JADX WARN: Code duplicated, block: B:72:0x0226  */
    /* JADX WARN: Code duplicated, block: B:76:0x024f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0290 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x0293 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x029a A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x029d A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ad A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02b3 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02b6 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:77:0x0253, B:79:0x0290, B:84:0x029f, B:87:0x02aa, B:92:0x02b8, B:88:0x02ad, B:90:0x02b3, B:91:0x02b6, B:80:0x0293, B:82:0x029a, B:83:0x029d, B:73:0x022c, B:61:0x01d9, B:63:0x01dd, B:66:0x01e3, B:69:0x0209, B:39:0x00c2, B:41:0x0101, B:43:0x0114, B:45:0x011a, B:49:0x0137, B:51:0x0142, B:54:0x0160, B:57:0x016c), top: B:97:0x00c2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, java.lang.Object, x01.e] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Object, x01.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(boolean z14, v13.c cVar) {
        h hVar;
        boolean z15;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        String str;
        int i15;
        int i16;
        e01.a aVar3;
        boolean z16;
        r0 r0Var;
        j1 j1Var;
        ?? K;
        v2.b bVar;
        Object objL;
        v2.b bVar2;
        int i17;
        e01.a aVar4;
        boolean zBooleanValue;
        Object objF;
        boolean z17;
        T t7;
        f fVar;
        f fVar2;
        String str2 = "refresh: retrieved nutrition status successfully: ";
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i18 = hVar.f188277l;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                hVar.f188277l = i18 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f188275j;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i19 = hVar.f188277l;
        p2 p2Var = f188279b;
        Object obj2 = null;
        try {
            if (i19 == 0) {
                r.b(obj);
                z53.b bVar3 = f188281d;
                hVar.f188268c = bVar3;
                z15 = z14;
                hVar.f188266a = z15;
                hVar.f188273h = 0;
                hVar.f188277l = 1;
                if (bVar3.c(hVar) != aVar5) {
                    aVar = bVar3;
                    i14 = 0;
                }
                return aVar5;
            }
            if (i19 != 1) {
                if (i19 == 2) {
                    i15 = hVar.f188274i;
                    i16 = hVar.f188273h;
                    z16 = hVar.f188266a;
                    j1 j1Var2 = hVar.f188271f;
                    aVar3 = hVar.f188270e;
                    r0 r0Var2 = hVar.f188269d;
                    z53.a aVar6 = hVar.f188268c;
                    try {
                        r.b(obj);
                        str = "refresh: updating nutrition feature state to ";
                        r0Var = r0Var2;
                        aVar = aVar6;
                        j1Var = j1Var2;
                        if (obj instanceof v2.b) {
                            bVar = (v2.b) obj;
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            a2 a2Var = a2.NUTRITION;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var, "NutritionStateProvider", "refresh: error retrieving nutrition status");
                            e eVarA = e.a((e) r0Var.f105810a, p.ERROR, b63.a.C0229a.f16171a.a(), 124);
                            p2Var.k(null, eVarA);
                            aVar.e(null);
                            return eVarA;
                        }
                        q qVar = q.NUTRITION;
                        hVar.f188268c = aVar;
                        hVar.f188269d = null;
                        hVar.f188270e = aVar3;
                        hVar.f188271f = j1Var;
                        hVar.f188272g = bVar;
                        hVar.f188266a = z16;
                        hVar.f188273h = i16;
                        hVar.f188274i = i15;
                        hVar.f188277l = 3;
                        objL = j1Var.l(qVar, hVar);
                        if (objL == aVar5) {
                            int i24 = i16;
                            bVar2 = bVar;
                            obj = objL;
                            i17 = i24;
                            boolean z18 = z16;
                            aVar4 = aVar3;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            hVar.f188268c = aVar;
                            hVar.f188269d = null;
                            hVar.f188270e = aVar4;
                            hVar.f188271f = null;
                            hVar.f188272g = bVar2;
                            hVar.f188266a = z18;
                            hVar.f188273h = i17;
                            hVar.f188274i = i15;
                            hVar.f188267b = zBooleanValue;
                            hVar.f188277l = 4;
                            objF = j1Var.f(hVar);
                            if (objF != aVar5) {
                                z17 = zBooleanValue;
                                obj = objF;
                                e01.a aVar7 = aVar4;
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                a2 a2Var2 = a2.NUTRITION;
                                String str3 = str2 + bVar2.f47386a + ", hasPremiumFeature=" + z17;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var2, "NutritionStateProvider", str3);
                                p pVar = p.SUCCESS;
                                b63.l lVarA = b63.a.C0229a.f16171a.a();
                                t7 = bVar2.f47386a;
                                if (((f01.i) t7).f67708a == f01.g.MFP_ENABLED) {
                                    fVar = f.ACTIVE;
                                } else if (((f01.i) t7).f67710c) {
                                    fVar = f.PREVIOUSLY_SET_UP;
                                } else {
                                    fVar = f.NEVER;
                                }
                                if (((f01.i) t7).f67708a != f01.g.NUTRITION_ENABLED) {
                                    if (((f01.i) t7).f67709b) {
                                        fVar2 = f.PREVIOUSLY_SET_UP;
                                    } else {
                                        fVar2 = f.NEVER;
                                    }
                                } else if (((f01.i) t7).f67709b) {
                                    fVar2 = f.PREVIOUSLY_SET_UP;
                                } else {
                                    fVar2 = f.NEVER;
                                }
                                e eVar = new e(pVar, lVarA, fVar, fVar2, z17, zBooleanValue2, s3.b());
                                i2.a.b(a2Var2, "NutritionStateProvider", str + eVar);
                                p2Var.k(null, eVar);
                                aVar7.j(eVar);
                                aVar.e(null);
                                return eVar;
                            }
                        }
                        return aVar5;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar6;
                    }
                } else if (i19 == 3) {
                    i15 = hVar.f188274i;
                    int i25 = hVar.f188273h;
                    z16 = hVar.f188266a;
                    v2.b bVar4 = hVar.f188272g;
                    j1Var = hVar.f188271f;
                    aVar3 = hVar.f188270e;
                    aVar = hVar.f188268c;
                    try {
                        r.b(obj);
                        str = "refresh: updating nutrition feature state to ";
                        str2 = "refresh: retrieved nutrition status successfully: ";
                        i17 = i25;
                        bVar2 = bVar4;
                        boolean z19 = z16;
                        aVar4 = aVar3;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        hVar.f188268c = aVar;
                        hVar.f188269d = null;
                        hVar.f188270e = aVar4;
                        hVar.f188271f = null;
                        hVar.f188272g = bVar2;
                        hVar.f188266a = z19;
                        hVar.f188273h = i17;
                        hVar.f188274i = i15;
                        hVar.f188267b = zBooleanValue;
                        hVar.f188277l = 4;
                        objF = j1Var.f(hVar);
                        if (objF != aVar5) {
                            z17 = zBooleanValue;
                            obj = objF;
                            e01.a aVar8 = aVar4;
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            a2 a2Var3 = a2.NUTRITION;
                            String str4 = str2 + bVar2.f47386a + ", hasPremiumFeature=" + z17;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "NutritionStateProvider", str4);
                            p pVar2 = p.SUCCESS;
                            b63.l lVarA2 = b63.a.C0229a.f16171a.a();
                            t7 = bVar2.f47386a;
                            if (((f01.i) t7).f67708a == f01.g.MFP_ENABLED) {
                                fVar = f.ACTIVE;
                            } else if (((f01.i) t7).f67710c) {
                                fVar = f.PREVIOUSLY_SET_UP;
                            } else {
                                fVar = f.NEVER;
                            }
                            if (((f01.i) t7).f67708a != f01.g.NUTRITION_ENABLED) {
                                if (((f01.i) t7).f67709b) {
                                    fVar2 = f.PREVIOUSLY_SET_UP;
                                } else {
                                    fVar2 = f.NEVER;
                                }
                            } else if (((f01.i) t7).f67709b) {
                                fVar2 = f.PREVIOUSLY_SET_UP;
                            } else {
                                fVar2 = f.NEVER;
                            }
                            e eVar2 = new e(pVar2, lVarA2, fVar, fVar2, z17, zBooleanValue3, s3.b());
                            i2.a.b(a2Var3, "NutritionStateProvider", str + eVar2);
                            p2Var.k(null, eVar2);
                            aVar8.j(eVar2);
                            aVar.e(null);
                            return eVar2;
                        }
                        return aVar5;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                    }
                } else {
                    if (i19 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z24 = hVar.f188267b;
                    bVar2 = hVar.f188272g;
                    aVar4 = hVar.f188270e;
                    aVar2 = hVar.f188268c;
                    try {
                        r.b(obj);
                        str = "refresh: updating nutrition feature state to ";
                        str2 = "refresh: retrieved nutrition status successfully: ";
                        aVar = aVar2;
                        z17 = z24;
                        e01.a aVar9 = aVar4;
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        a2 a2Var4 = a2.NUTRITION;
                        String str5 = str2 + bVar2.f47386a + ", hasPremiumFeature=" + z17;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "NutritionStateProvider", str5);
                        p pVar3 = p.SUCCESS;
                        b63.l lVarA3 = b63.a.C0229a.f16171a.a();
                        t7 = bVar2.f47386a;
                        if (((f01.i) t7).f67708a == f01.g.MFP_ENABLED) {
                            fVar = f.ACTIVE;
                        } else if (((f01.i) t7).f67710c) {
                            fVar = f.PREVIOUSLY_SET_UP;
                        } else {
                            fVar = f.NEVER;
                        }
                        if (((f01.i) t7).f67708a != f01.g.NUTRITION_ENABLED && z17) {
                            fVar2 = f.ACTIVE;
                        } else if (((f01.i) t7).f67709b) {
                            fVar2 = f.PREVIOUSLY_SET_UP;
                        } else {
                            fVar2 = f.NEVER;
                        }
                        e eVar3 = new e(pVar3, lVarA3, fVar, fVar2, z17, zBooleanValue4, s3.b());
                        i2.a.b(a2Var4, "NutritionStateProvider", str + eVar3);
                        p2Var.k(null, eVar3);
                        aVar9.j(eVar3);
                        aVar.e(null);
                        return eVar3;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                aVar2.e(obj2);
                throw th;
            }
            int i26 = hVar.f188273h;
            boolean z25 = hVar.f188266a;
            aVar = hVar.f188268c;
            r.b(obj);
            i14 = i26;
            z15 = z25;
            r0 r0Var3 = new r0();
            ?? A = e.a((e) p2Var.getValue(), null, null, 127);
            r0Var3.f105810a = A;
            a2 a2Var5 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "NutritionStateProvider", "refresh: preferCache=" + z15 + ", previousValue=" + ((Object) A));
            e01.a aVar10 = (e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null);
            if (z15) {
                b63.l lVar = ((e) r0Var3.f105810a).f188253b;
                b63.l.INSTANCE.getClass();
                if (p005kotlin.jvm.internal.s.g(lVar, b63.l.f16201b) && (K = aVar10.k()) != 0) {
                    i2.a.b(a2Var5, "NutritionStateProvider", "refresh: restored nutrition feature state from disk cache: " + ((Object) K));
                    p2Var.k(null, K);
                    r0Var3.f105810a = K;
                }
            }
            if (z15) {
                T t14 = r0Var3.f105810a;
                if (((e) t14).f188252a != p.ERROR) {
                    b63.l lVar2 = ((e) t14).f188253b;
                    b63.l lVarA4 = b63.a.C0229a.f16171a.a();
                    b63.i.INSTANCE.getClass();
                    if (n.c(lVar2, lVarA4, b63.i.f16189c) < aVar10.u()) {
                        i2.a.b(a2Var5, "NutritionStateProvider", "refresh: using cached nutrition feature state");
                        T t15 = r0Var3.f105810a;
                        aVar.e(null);
                        return t15;
                    }
                }
            }
            T t16 = r0Var3.f105810a;
            str = "refresh: updating nutrition feature state to ";
            i2.a.b(a2Var5, "NutritionStateProvider", "refresh: refreshing nutrition feature state from network because preferCache=" + z15 + ", status=" + ((e) t16).f188252a + ", lastUpdated=" + ((e) t16).f188253b + ", NutritionDiskCacheHours=" + aVar10.u());
            m01.g gVar = (m01.g) KoinJavaComponent.get$default(m01.g.class, null, null, 6, null);
            j1 j1Var3 = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            hVar.f188268c = aVar;
            hVar.f188269d = r0Var3;
            hVar.f188270e = aVar10;
            hVar.f188271f = j1Var3;
            hVar.f188266a = z15;
            hVar.f188273h = i14;
            i15 = 0;
            hVar.f188274i = 0;
            hVar.f188277l = 2;
            Object objU0 = gVar.u0(hVar);
            if (objU0 != aVar5) {
                i16 = i14;
                obj = objU0;
                aVar3 = aVar10;
                z16 = z15;
                r0Var = r0Var3;
                j1Var = j1Var3;
                if (obj instanceof v2.b) {
                    bVar = (v2.b) obj;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    a2 a2Var6 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var6, "NutritionStateProvider", "refresh: error retrieving nutrition status");
                    e eVarA2 = e.a((e) r0Var.f105810a, p.ERROR, b63.a.C0229a.f16171a.a(), 124);
                    p2Var.k(null, eVarA2);
                    aVar.e(null);
                    return eVarA2;
                }
                q qVar2 = q.NUTRITION;
                hVar.f188268c = aVar;
                hVar.f188269d = null;
                hVar.f188270e = aVar3;
                hVar.f188271f = j1Var;
                hVar.f188272g = bVar;
                hVar.f188266a = z16;
                hVar.f188273h = i16;
                hVar.f188274i = i15;
                hVar.f188277l = 3;
                objL = j1Var.l(qVar2, hVar);
                if (objL == aVar5) {
                    int i27 = i16;
                    bVar2 = bVar;
                    obj = objL;
                    i17 = i27;
                    boolean z110 = z16;
                    aVar4 = aVar3;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    hVar.f188268c = aVar;
                    hVar.f188269d = null;
                    hVar.f188270e = aVar4;
                    hVar.f188271f = null;
                    hVar.f188272g = bVar2;
                    hVar.f188266a = z110;
                    hVar.f188273h = i17;
                    hVar.f188274i = i15;
                    hVar.f188267b = zBooleanValue;
                    hVar.f188277l = 4;
                    objF = j1Var.f(hVar);
                    if (objF != aVar5) {
                        z17 = zBooleanValue;
                        obj = objF;
                        e01.a aVar11 = aVar4;
                        boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                        a2 a2Var7 = a2.NUTRITION;
                        String str6 = str2 + bVar2.f47386a + ", hasPremiumFeature=" + z17;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var7, "NutritionStateProvider", str6);
                        p pVar4 = p.SUCCESS;
                        b63.l lVarA5 = b63.a.C0229a.f16171a.a();
                        t7 = bVar2.f47386a;
                        if (((f01.i) t7).f67708a == f01.g.MFP_ENABLED) {
                            fVar = f.ACTIVE;
                        } else if (((f01.i) t7).f67710c) {
                            fVar = f.PREVIOUSLY_SET_UP;
                        } else {
                            fVar = f.NEVER;
                        }
                        if (((f01.i) t7).f67708a != f01.g.NUTRITION_ENABLED) {
                            if (((f01.i) t7).f67709b) {
                                fVar2 = f.PREVIOUSLY_SET_UP;
                            } else {
                                fVar2 = f.NEVER;
                            }
                        } else if (((f01.i) t7).f67709b) {
                            fVar2 = f.PREVIOUSLY_SET_UP;
                        } else {
                            fVar2 = f.NEVER;
                        }
                        e eVar4 = new e(pVar4, lVarA5, fVar, fVar2, z17, zBooleanValue5, s3.b());
                        i2.a.b(a2Var7, "NutritionStateProvider", str + eVar4);
                        p2Var.k(null, eVar4);
                        aVar11.j(eVar4);
                        aVar.e(null);
                        return eVar4;
                    }
                }
            }
            return aVar5;
        } catch (Throwable th6) {
            th = th6;
            aVar2 = aVar;
            obj2 = null;
        }
    }
}
