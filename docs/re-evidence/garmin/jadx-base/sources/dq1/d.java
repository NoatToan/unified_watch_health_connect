package dq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import o13.t;
import o53.c0;
import o53.e2;
import o53.i0;
import o53.j0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ldq1/d;", "", "Ldq1/l;", "graduationConsentRefreshUseCase", "Lkotlin/Function0;", "", "isReconsentEnabled", "Ldq1/o;", "graduationUserRoleRefreshUseCase", "Lf12/l;", "userSettings", "<init>", "(Ldq1/l;Le23/a;Ldq1/o;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f60719j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f60720k = o13.m.b(new dh0.j(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f60721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Boolean> f60722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f60723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f60724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f60725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z53.b f60726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f60727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f60728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<v> f60729i;

    public d(l lVar, e23.a<Boolean> aVar, o oVar, f12.l lVar2) {
        lVar.getClass();
        aVar.getClass();
        oVar.getClass();
        lVar2.getClass();
        this.f60721a = lVar;
        this.f60722b = aVar;
        this.f60723c = oVar;
        this.f60724d = lVar2;
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        this.f60725e = c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        this.f60726f = z53.c.a();
        this.f60727g = z53.c.a();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(d dVar, String str, boolean z14, v13.c cVar) throws Throwable {
        k kVar;
        z53.a aVar;
        boolean z15;
        String str2;
        int i14;
        z53.a aVar2;
        boolean z16;
        String str3;
        List<v> list;
        List<v> list2;
        boolean z17;
        String str4;
        Object objA;
        List<v> list3;
        String str5;
        List<v> list4;
        z53.b bVar;
        z53.b bVar2;
        String str6;
        dVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f60768h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f60768h = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar, cVar);
            }
        } else {
            kVar = new k(dVar, cVar);
        }
        Object objE0 = kVar.f60766f;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f60768h;
        try {
            if (i16 == 0) {
                o13.r.b(objE0);
                aVar = dVar.f60727g;
                kVar.f60761a = str;
                kVar.f60762b = aVar;
                z15 = z14;
                kVar.f60764d = z15;
                kVar.f60765e = 0;
                kVar.f60768h = 1;
                if (aVar.c(kVar) != aVar3) {
                    str2 = str;
                    i14 = 0;
                }
                return aVar3;
            }
            if (i16 != 1) {
                try {
                    if (i16 == 2) {
                        z16 = kVar.f60764d;
                        aVar2 = (z53.a) kVar.f60762b;
                        str3 = kVar.f60761a;
                        try {
                            o13.r.b(objE0);
                            list = (List) objE0;
                            aVar2.e(null);
                            if (list == null) {
                                list = null;
                            }
                            if (list == null) {
                                if (z16) {
                                    l lVar = dVar.f60721a;
                                    kVar.f60761a = str3;
                                    kVar.f60762b = list;
                                    kVar.f60764d = z16;
                                    kVar.f60768h = 3;
                                    objA = lVar.a(list, kVar);
                                    if (objA != aVar3) {
                                        list3 = list;
                                        objE0 = objA;
                                        str5 = str3;
                                        if (((Boolean) objE0).booleanValue()) {
                                            o oVar = dVar.f60723c;
                                            kVar.f60761a = str5;
                                            kVar.f60762b = list3;
                                            kVar.f60764d = z16;
                                            kVar.f60768h = 4;
                                            oVar.getClass();
                                            x53.c cVar2 = s0.f129406a;
                                            objE0 = ge1.b.e0(x53.b.f189152a, new p(oVar, null), kVar);
                                            if (objE0 != aVar3) {
                                                list4 = list3;
                                                str4 = str5;
                                                if (((Boolean) objE0).booleanValue()) {
                                                    dVar.f60724d.P(System.currentTimeMillis());
                                                    a2 a2Var = a2.CHILD_ACCOUNTS;
                                                    String strM = am.j.m("User role refresh succeeded (", str4, ")");
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var, "GraduationConsentRefreshCoordinator", strM);
                                                } else {
                                                    a2 a2Var2 = a2.CHILD_ACCOUNTS;
                                                    String strM2 = am.j.m("User role refresh failed (", str4, ")");
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var2, "GraduationConsentRefreshCoordinator", strM2);
                                                }
                                                z17 = z16;
                                                list2 = list4;
                                                bVar = dVar.f60726f;
                                                kVar.f60761a = str4;
                                                kVar.f60762b = list2;
                                                kVar.f60763c = bVar;
                                                kVar.f60764d = z17;
                                                kVar.f60765e = 0;
                                                kVar.f60768h = 5;
                                                if (bVar.c(kVar) != aVar3) {
                                                    bVar2 = bVar;
                                                    str6 = str4;
                                                }
                                            }
                                        } else {
                                            z17 = z16;
                                            list2 = list3;
                                            str4 = str5;
                                            bVar = dVar.f60726f;
                                            kVar.f60761a = str4;
                                            kVar.f60762b = list2;
                                            kVar.f60763c = bVar;
                                            kVar.f60764d = z17;
                                            kVar.f60765e = 0;
                                            kVar.f60768h = 5;
                                            if (bVar.c(kVar) != aVar3) {
                                                bVar2 = bVar;
                                                str6 = str4;
                                            }
                                        }
                                    }
                                } else {
                                    boolean z18 = z16;
                                    list2 = list;
                                    z17 = z18;
                                    str4 = str3;
                                    bVar = dVar.f60726f;
                                    kVar.f60761a = str4;
                                    kVar.f60762b = list2;
                                    kVar.f60763c = bVar;
                                    kVar.f60764d = z17;
                                    kVar.f60765e = 0;
                                    kVar.f60768h = 5;
                                    if (bVar.c(kVar) != aVar3) {
                                        bVar2 = bVar;
                                        str6 = str4;
                                    }
                                }
                                return aVar3;
                            }
                            a2 a2Var3 = a2.CHILD_ACCOUNTS;
                            String strM3 = am.j.m("Consent cache force-refresh failed (", str3, ")");
                            i2.f36769a.getClass();
                            i2.a.f(a2Var3, "GraduationConsentRefreshCoordinator", strM3);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2.e(null);
                            throw th;
                        }
                    }
                    if (i16 == 3) {
                        z16 = kVar.f60764d;
                        list3 = (List) kVar.f60762b;
                        str5 = kVar.f60761a;
                        o13.r.b(objE0);
                        if (((Boolean) objE0).booleanValue()) {
                            o oVar2 = dVar.f60723c;
                            kVar.f60761a = str5;
                            kVar.f60762b = list3;
                            kVar.f60764d = z16;
                            kVar.f60768h = 4;
                            oVar2.getClass();
                            x53.c cVar3 = s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new p(oVar2, null), kVar);
                            if (objE0 != aVar3) {
                                list4 = list3;
                                str4 = str5;
                                if (((Boolean) objE0).booleanValue()) {
                                    dVar.f60724d.P(System.currentTimeMillis());
                                    a2 a2Var4 = a2.CHILD_ACCOUNTS;
                                    String strM4 = am.j.m("User role refresh succeeded (", str4, ")");
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var4, "GraduationConsentRefreshCoordinator", strM4);
                                } else {
                                    a2 a2Var5 = a2.CHILD_ACCOUNTS;
                                    String strM5 = am.j.m("User role refresh failed (", str4, ")");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var5, "GraduationConsentRefreshCoordinator", strM5);
                                }
                                z17 = z16;
                                list2 = list4;
                                bVar = dVar.f60726f;
                                kVar.f60761a = str4;
                                kVar.f60762b = list2;
                                kVar.f60763c = bVar;
                                kVar.f60764d = z17;
                                kVar.f60765e = 0;
                                kVar.f60768h = 5;
                                if (bVar.c(kVar) != aVar3) {
                                    bVar2 = bVar;
                                    str6 = str4;
                                }
                            }
                        } else {
                            z17 = z16;
                            list2 = list3;
                            str4 = str5;
                            bVar = dVar.f60726f;
                            kVar.f60761a = str4;
                            kVar.f60762b = list2;
                            kVar.f60763c = bVar;
                            kVar.f60764d = z17;
                            kVar.f60765e = 0;
                            kVar.f60768h = 5;
                            if (bVar.c(kVar) != aVar3) {
                                bVar2 = bVar;
                                str6 = str4;
                            }
                        }
                        return aVar3;
                    }
                    if (i16 == 4) {
                        z16 = kVar.f60764d;
                        list4 = (List) kVar.f60762b;
                        str4 = kVar.f60761a;
                        o13.r.b(objE0);
                        if (((Boolean) objE0).booleanValue()) {
                            dVar.f60724d.P(System.currentTimeMillis());
                            a2 a2Var6 = a2.CHILD_ACCOUNTS;
                            String strM6 = am.j.m("User role refresh succeeded (", str4, ")");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var6, "GraduationConsentRefreshCoordinator", strM6);
                        } else {
                            a2 a2Var7 = a2.CHILD_ACCOUNTS;
                            String strM7 = am.j.m("User role refresh failed (", str4, ")");
                            i2.f36769a.getClass();
                            i2.a.f(a2Var7, "GraduationConsentRefreshCoordinator", strM7);
                        }
                        z17 = z16;
                        list2 = list4;
                        bVar = dVar.f60726f;
                        kVar.f60761a = str4;
                        kVar.f60762b = list2;
                        kVar.f60763c = bVar;
                        kVar.f60764d = z17;
                        kVar.f60765e = 0;
                        kVar.f60768h = 5;
                        if (bVar.c(kVar) != aVar3) {
                            bVar2 = bVar;
                            str6 = str4;
                        }
                        return aVar3;
                    }
                    if (i16 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = kVar.f60763c;
                    list2 = (List) kVar.f60762b;
                    str6 = kVar.f60761a;
                    o13.r.b(objE0);
                    dVar.f60729i = list2;
                    Unit unit = Unit.INSTANCE;
                    bVar2.e(null);
                    a2 a2Var8 = a2.CHILD_ACCOUNTS;
                    String strM8 = am.j.m("Consent cache force-refreshed (", str6, ")");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var8, "GraduationConsentRefreshCoordinator", strM8);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    bVar2.e(null);
                    throw th4;
                }
            }
            i14 = kVar.f60765e;
            boolean z19 = kVar.f60764d;
            z53.a aVar4 = (z53.a) kVar.f60762b;
            str2 = kVar.f60761a;
            o13.r.b(objE0);
            aVar = aVar4;
            z15 = z19;
            p92.o oVar3 = p92.o.f136619a;
            kVar.f60761a = str2;
            kVar.f60762b = aVar;
            kVar.f60764d = z15;
            kVar.f60765e = i14;
            kVar.f60768h = 2;
            Object objA2 = oVar3.a(false, kVar);
            if (objA2 != aVar3) {
                aVar2 = aVar;
                objE0 = objA2;
                z16 = z15;
                str3 = str2;
                list = (List) objE0;
                aVar2.e(null);
                if (list == null) {
                    list = null;
                }
                if (list == null) {
                    a2 a2Var9 = a2.CHILD_ACCOUNTS;
                    String strM9 = am.j.m("Consent cache force-refresh failed (", str3, ")");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var9, "GraduationConsentRefreshCoordinator", strM9);
                } else if (z16) {
                    l lVar2 = dVar.f60721a;
                    kVar.f60761a = str3;
                    kVar.f60762b = list;
                    kVar.f60764d = z16;
                    kVar.f60768h = 3;
                    objA = lVar2.a(list, kVar);
                    if (objA != aVar3) {
                        list3 = list;
                        objE0 = objA;
                        str5 = str3;
                        if (((Boolean) objE0).booleanValue()) {
                            o oVar4 = dVar.f60723c;
                            kVar.f60761a = str5;
                            kVar.f60762b = list3;
                            kVar.f60764d = z16;
                            kVar.f60768h = 4;
                            oVar4.getClass();
                            x53.c cVar4 = s0.f129406a;
                            objE0 = ge1.b.e0(x53.b.f189152a, new p(oVar4, null), kVar);
                            if (objE0 != aVar3) {
                                list4 = list3;
                                str4 = str5;
                                if (((Boolean) objE0).booleanValue()) {
                                    dVar.f60724d.P(System.currentTimeMillis());
                                    a2 a2Var10 = a2.CHILD_ACCOUNTS;
                                    String strM10 = am.j.m("User role refresh succeeded (", str4, ")");
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var10, "GraduationConsentRefreshCoordinator", strM10);
                                } else {
                                    a2 a2Var11 = a2.CHILD_ACCOUNTS;
                                    String strM11 = am.j.m("User role refresh failed (", str4, ")");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var11, "GraduationConsentRefreshCoordinator", strM11);
                                }
                                z17 = z16;
                                list2 = list4;
                                bVar = dVar.f60726f;
                                kVar.f60761a = str4;
                                kVar.f60762b = list2;
                                kVar.f60763c = bVar;
                                kVar.f60764d = z17;
                                kVar.f60765e = 0;
                                kVar.f60768h = 5;
                                if (bVar.c(kVar) != aVar3) {
                                    bVar2 = bVar;
                                    str6 = str4;
                                    dVar.f60729i = list2;
                                    Unit unit2 = Unit.INSTANCE;
                                    bVar2.e(null);
                                    a2 a2Var12 = a2.CHILD_ACCOUNTS;
                                    String strM12 = am.j.m("Consent cache force-refreshed (", str6, ")");
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var12, "GraduationConsentRefreshCoordinator", strM12);
                                }
                            }
                        } else {
                            z17 = z16;
                            list2 = list3;
                            str4 = str5;
                            bVar = dVar.f60726f;
                            kVar.f60761a = str4;
                            kVar.f60762b = list2;
                            kVar.f60763c = bVar;
                            kVar.f60764d = z17;
                            kVar.f60765e = 0;
                            kVar.f60768h = 5;
                            if (bVar.c(kVar) != aVar3) {
                                bVar2 = bVar;
                                str6 = str4;
                                dVar.f60729i = list2;
                                Unit unit3 = Unit.INSTANCE;
                                bVar2.e(null);
                                a2 a2Var13 = a2.CHILD_ACCOUNTS;
                                String strM13 = am.j.m("Consent cache force-refreshed (", str6, ")");
                                i2.f36769a.getClass();
                                i2.a.b(a2Var13, "GraduationConsentRefreshCoordinator", strM13);
                            }
                        }
                    }
                } else {
                    boolean z110 = z16;
                    list2 = list;
                    z17 = z110;
                    str4 = str3;
                    bVar = dVar.f60726f;
                    kVar.f60761a = str4;
                    kVar.f60762b = list2;
                    kVar.f60763c = bVar;
                    kVar.f60764d = z17;
                    kVar.f60765e = 0;
                    kVar.f60768h = 5;
                    if (bVar.c(kVar) != aVar3) {
                        bVar2 = bVar;
                        str6 = str4;
                        dVar.f60729i = list2;
                        Unit unit4 = Unit.INSTANCE;
                        bVar2.e(null);
                        a2 a2Var14 = a2.CHILD_ACCOUNTS;
                        String strM14 = am.j.m("Consent cache force-refreshed (", str6, ")");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var14, "GraduationConsentRefreshCoordinator", strM14);
                    }
                }
                return Unit.INSTANCE;
            }
            return aVar3;
        } catch (Throwable th5) {
            th = th5;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b0, B:51:0x00b4, B:54:0x00b9), top: B:85:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:67:0x00de, B:69:0x00e2, B:72:0x00e7), top: B:79:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2 A[ORIG_RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, o53.p1] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, o53.l1] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, o53.l1] */
    public final Object b(v13.c cVar) throws Throwable {
        e eVar;
        z53.a aVar;
        ?? r14;
        ?? r15;
        Throwable th3;
        ?? r16;
        ?? r17;
        z53.a aVar2;
        z53.b bVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f60735f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f60735f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f60733d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f60735f;
        z53.b bVar2 = this.f60726f;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                eVar.f60730a = bVar2;
                eVar.f60735f = 1;
                if (bVar2.c(eVar) != aVar3) {
                    aVar = bVar2;
                }
                return aVar3;
            }
            if (i15 != 1) {
                try {
                    if (i15 == 2) {
                        i0 i0Var = (i0) eVar.f60730a;
                        try {
                            o13.r.b(obj);
                            r16 = i0Var;
                            if (!r16.isActive()) {
                                eVar.f60730a = r16;
                                eVar.f60731b = bVar2;
                                eVar.f60735f = 3;
                                if (bVar2.c(eVar) != aVar3) {
                                    r17 = r16;
                                    aVar2 = bVar2;
                                }
                                return aVar3;
                            }
                            return Boolean.TRUE;
                        } catch (Throwable th4) {
                            th = th4;
                            r14 = i0Var;
                            if (!r14.isActive()) {
                                throw th;
                            }
                            eVar.f60730a = r14;
                            eVar.f60731b = th;
                            eVar.f60732c = bVar2;
                            eVar.f60735f = 4;
                            if (bVar2.c(eVar) != aVar3) {
                                r15 = r14;
                                th3 = th;
                                bVar = bVar2;
                                if (this.f60728h == r15) {
                                    this.f60728h = null;
                                }
                                Unit unit = Unit.INSTANCE;
                                throw th3;
                            }
                        }
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z53.b bVar3 = eVar.f60732c;
                            th3 = (Throwable) eVar.f60731b;
                            i0 i0Var2 = (i0) eVar.f60730a;
                            o13.r.b(obj);
                            r15 = i0Var2;
                            bVar = bVar3;
                            try {
                                if (this.f60728h == r15) {
                                    this.f60728h = null;
                                }
                                Unit unit2 = Unit.INSTANCE;
                                throw th3;
                            } finally {
                                bVar.e(null);
                            }
                        }
                        z53.a aVar4 = (z53.a) eVar.f60731b;
                        i0 i0Var3 = (i0) eVar.f60730a;
                        o13.r.b(obj);
                        r17 = i0Var3;
                        aVar2 = aVar4;
                    }
                    if (this.f60728h == r17) {
                        this.f60728h = null;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return Boolean.TRUE;
                } finally {
                    aVar2.e(null);
                }
            }
            z53.a aVar5 = (z53.a) eVar.f60730a;
            o13.r.b(obj);
            aVar = aVar5;
            j0 j0Var = this.f60728h;
            if (j0Var == null || !j0Var.isActive()) {
                r14 = j0Var;
                r14 = 0;
            }
            r14 = j0Var;
            aVar.e(null);
            if (r14 == 0) {
                return Boolean.FALSE;
            }
            try {
                eVar.f60730a = r14;
                eVar.f60735f = 2;
                Object objC = r14.C(eVar);
                r16 = r14;
                if (objC != aVar3) {
                    if (!r16.isActive()) {
                        eVar.f60730a = r16;
                        eVar.f60731b = bVar2;
                        eVar.f60735f = 3;
                        if (bVar2.c(eVar) != aVar3) {
                            r17 = r16;
                            aVar2 = bVar2;
                            if (this.f60728h == r17) {
                                this.f60728h = null;
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                    return Boolean.TRUE;
                }
            } catch (Throwable th5) {
                th = th5;
                if (!r14.isActive()) {
                    throw th;
                }
                eVar.f60730a = r14;
                eVar.f60731b = th;
                eVar.f60732c = bVar2;
                eVar.f60735f = 4;
                if (bVar2.c(eVar) != aVar3) {
                    r15 = r14;
                    th3 = th;
                    bVar = bVar2;
                    if (this.f60728h == r15) {
                        this.f60728h = null;
                    }
                    Unit unit5 = Unit.INSTANCE;
                    throw th3;
                }
            }
            return aVar3;
        } catch (Throwable th6) {
            aVar.e(null);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        if (r7.c(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
    
        if (r7.c(r0) == r1) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, boolean z14, v13.c cVar) throws Throwable {
        f fVar;
        boolean z15;
        z53.a aVar;
        j0 j0VarJ;
        i0 i0Var;
        i0 i0Var2;
        z53.a aVar2;
        z53.b bVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f60743h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f60743h = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f60741f;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f60743h;
        z53.b bVar2 = this.f60726f;
        try {
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    fVar.f60736a = str;
                    fVar.f60737b = bVar2;
                    fVar.f60740e = z14;
                    fVar.f60743h = 1;
                    if (bVar2.c(fVar) != aVar3) {
                        z15 = z14;
                        aVar = bVar2;
                    }
                    bVar = bVar2;
                    aVar2 = bVar2;
                    return aVar3;
                }
                if (i15 != 1) {
                    try {
                        if (i15 == 2) {
                            boolean z16 = fVar.f60740e;
                            i0Var = (i0) fVar.f60737b;
                            try {
                                o13.r.b(obj);
                                z15 = z16;
                                i0Var2 = i0Var;
                                if (!i0Var2.isActive()) {
                                    fVar.f60736a = null;
                                    fVar.f60737b = i0Var2;
                                    fVar.f60738c = bVar2;
                                    fVar.f60740e = z15;
                                    fVar.f60743h = 3;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                z15 = z16;
                                th = th3;
                                if (!i0Var.isActive()) {
                                    fVar.f60736a = null;
                                    fVar.f60737b = i0Var;
                                    fVar.f60738c = th;
                                    fVar.f60739d = bVar2;
                                    fVar.f60740e = z15;
                                    fVar.f60743h = 4;
                                }
                                throw th;
                            }
                        }
                        if (i15 != 3) {
                            if (i15 != 4) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z53.b bVar3 = fVar.f60739d;
                            th = (Throwable) fVar.f60738c;
                            i0Var = (i0) fVar.f60737b;
                            o13.r.b(obj);
                            bVar = bVar3;
                            try {
                                bVar = bVar2;
                                if (this.f60728h == i0Var) {
                                    this.f60728h = null;
                                }
                                Unit unit = Unit.INSTANCE;
                                throw th;
                            } finally {
                                bVar.e(null);
                            }
                        }
                        z53.a aVar4 = (z53.a) fVar.f60738c;
                        i0Var2 = (i0) fVar.f60737b;
                        o13.r.b(obj);
                        aVar2 = aVar4;
                        aVar2 = bVar2;
                        if (this.f60728h == i0Var2) {
                            this.f60728h = null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        return Unit.INSTANCE;
                    } finally {
                        aVar2.e(null);
                    }
                }
                boolean z17 = fVar.f60740e;
                z53.a aVar5 = (z53.a) fVar.f60737b;
                String str2 = fVar.f60736a;
                o13.r.b(obj);
                z15 = z17;
                aVar = aVar5;
                str = str2;
                if (j0VarJ != null) {
                    if (!j0VarJ.isActive()) {
                        j0VarJ = null;
                    }
                    if (j0VarJ == null) {
                        j0VarJ = ge1.b.j(this.f60725e, null, null, new g(this, str, z15, null), 3);
                        this.f60729i = null;
                        this.f60728h = j0VarJ;
                    }
                    bVar = bVar2;
                    aVar2 = bVar2;
                    return aVar3;
                }
                j0VarJ = ge1.b.j(this.f60725e, null, null, new g(this, str, z15, null), 3);
                this.f60729i = null;
                this.f60728h = j0VarJ;
                fVar.f60736a = null;
                fVar.f60737b = j0VarJ;
                fVar.f60740e = z15;
                fVar.f60743h = 2;
                if (j0VarJ.C(fVar) != aVar3) {
                    i0Var2 = j0VarJ;
                    if (!i0Var2.isActive()) {
                        fVar.f60736a = null;
                        fVar.f60737b = i0Var2;
                        fVar.f60738c = bVar2;
                        fVar.f60740e = z15;
                        fVar.f60743h = 3;
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                th = th4;
                i0Var = j0VarJ;
                if (!i0Var.isActive()) {
                    fVar.f60736a = null;
                    fVar.f60737b = i0Var;
                    fVar.f60738c = th;
                    fVar.f60739d = bVar2;
                    fVar.f60740e = z15;
                    fVar.f60743h = 4;
                }
                throw th;
            }
            j0VarJ = this.f60728h;
            aVar.e(null);
            bVar = bVar2;
            aVar2 = bVar2;
            return aVar3;
        } catch (Throwable th5) {
            aVar.e(null);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) {
        h hVar;
        z53.b bVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f60751d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f60751d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f60749b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f60751d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.b bVar2 = this.f60726f;
            hVar.f60748a = bVar2;
            hVar.f60751d = 1;
            if (bVar2.c(hVar) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = hVar.f60748a;
            o13.r.b(obj);
        }
        try {
            this.f60729i = null;
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[EXC_TOP_SPLITTER, PHI: r6 r11
      0x0097: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:40:0x0094, B:21:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r11v11 z53.a) = (r11v8 z53.a), (r11v18 z53.a) binds: [B:40:0x0094, B:21:0x003f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r2.c(r0) == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(v13.c cVar) throws Throwable {
        i iVar;
        z53.a aVar;
        z53.a aVar2;
        z53.a aVar3;
        Throwable th3;
        Object objA;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f60756e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f60756e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f60754c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f60756e;
        int i16 = 0;
        if (i15 == 0) {
            o13.r.b(obj);
            if (this.f60722b.invoke().booleanValue()) {
                iVar.f60756e = 1;
                if (b(iVar) != obj2) {
                }
            } else {
                aVar2 = this.f60727g;
                iVar.f60752a = aVar2;
                iVar.f60753b = 0;
                iVar.f60756e = 3;
                if (aVar2.c(iVar) != obj2) {
                    p92.o oVar = p92.o.f136619a;
                    iVar.f60752a = aVar2;
                    iVar.f60753b = i16;
                    iVar.f60756e = 4;
                    objA = oVar.a(true, iVar);
                    if (objA != obj2) {
                        aVar3 = aVar2;
                        obj = objA;
                        List list = (List) obj;
                        aVar3.e(null);
                        return list;
                    }
                }
            }
            return obj2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                aVar = iVar.f60752a;
                o13.r.b(obj);
                try {
                    List<v> list2 = this.f60729i;
                    aVar.e(null);
                    if (list2 != null) {
                        return list2;
                    }
                    aVar2 = this.f60727g;
                    iVar.f60752a = aVar2;
                    iVar.f60753b = 0;
                    iVar.f60756e = 3;
                    if (aVar2.c(iVar) != obj2) {
                        p92.o oVar2 = p92.o.f136619a;
                        iVar.f60752a = aVar2;
                        iVar.f60753b = i16;
                        iVar.f60756e = 4;
                        objA = oVar2.a(true, iVar);
                        if (objA != obj2) {
                            aVar3 = aVar2;
                            obj = objA;
                            List list3 = (List) obj;
                            aVar3.e(null);
                            return list3;
                        }
                    }
                    return obj2;
                } catch (Throwable th4) {
                    aVar.e(null);
                    throw th4;
                }
            }
            if (i15 != 3) {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar3 = iVar.f60752a;
                try {
                    o13.r.b(obj);
                    List list4 = (List) obj;
                    aVar3.e(null);
                    return list4;
                } catch (Throwable th5) {
                    th3 = th5;
                    aVar3.e(null);
                    throw th3;
                }
            }
            i16 = iVar.f60753b;
            z53.a aVar4 = iVar.f60752a;
            o13.r.b(obj);
            aVar2 = aVar4;
            try {
                p92.o oVar3 = p92.o.f136619a;
                iVar.f60752a = aVar2;
                iVar.f60753b = i16;
                iVar.f60756e = 4;
                objA = oVar3.a(true, iVar);
                if (objA != obj2) {
                    aVar3 = aVar2;
                    obj = objA;
                    List list5 = (List) obj;
                    aVar3.e(null);
                    return list5;
                }
                return obj2;
            } catch (Throwable th6) {
                aVar3 = aVar2;
                th3 = th6;
                aVar3.e(null);
                throw th3;
            }
        }
        o13.r.b(obj);
        aVar = this.f60726f;
        iVar.f60752a = aVar;
        iVar.f60753b = 0;
        iVar.f60756e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (c("new sign-in", true, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(v13.c cVar) throws Throwable {
        j jVar;
        boolean zBooleanValue;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f60760d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f60760d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objB = jVar.f60758b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f60760d;
        if (i15 == 0) {
            o13.r.b(objB);
            jVar.f60760d = 1;
            if (d(jVar) != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objB);
        } else {
            if (i15 == 2) {
                zBooleanValue = jVar.f60757a;
                o13.r.b(objB);
                if (!((Boolean) objB).booleanValue()) {
                    jVar.f60757a = zBooleanValue;
                    jVar.f60760d = 3;
                }
                return Unit.INSTANCE;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return Unit.INSTANCE;
        zBooleanValue = this.f60722b.invoke().booleanValue();
        if (zBooleanValue) {
            jVar.f60757a = zBooleanValue;
            jVar.f60760d = 2;
            objB = b(jVar);
            if (objB != obj) {
                if (!((Boolean) objB).booleanValue()) {
                    jVar.f60757a = zBooleanValue;
                    jVar.f60760d = 3;
                }
            }
            return obj;
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldq1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "REASON_APP_FOREGROUND", "REASON_SIGN_IN", "", "DEBUG_CONSENT_UPDATE_DATE_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(l lVar, e23.a aVar, o oVar, f12.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        lVar = (i14 & 1) != 0 ? new l(null, 1, null) : lVar;
        aVar = (i14 & 2) != 0 ? new dh0.j(2) : aVar;
        oVar = (i14 & 4) != 0 ? new o(null, null, 3, null) : oVar;
        if ((i14 & 8) != 0) {
            f12.l.f68084a.getClass();
            lVar2 = f12.l.a.a();
        }
        this(lVar, aVar, oVar, lVar2);
    }
}
