package gv0;

import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.io.Serializable;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$removeRecipient$2", f = "LiveTrackSettingsViewModel.kt", l = {619, 624, 627, 633, 636, 640, 642}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.a f79380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f79383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f79384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f79385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z14, d dVar, pu0.b bVar, t13.d<? super t> dVar2) {
        super(2, dVar2);
        this.f79384e = z14;
        this.f79385f = dVar;
        this.f79386g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f79384e, this.f79385f, this.f79386g, dVar);
        tVar.f79383d = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0196 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[PHI: r14
      0x007d: PHI (r14v17 java.lang.Object) = (r14v16 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x0079, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[PHI: r4
      0x0100: PHI (r4v2 ??) = (r4v0 ??), (r4v5 ??), (r4v6 ??) binds: [B:29:0x0081, B:46:0x00d7, B:52:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:0x01df  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r14 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r14 == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hl.a aVar;
        boolean zG;
        pu0.b bVar;
        v2 v2Var;
        Serializable serializableF;
        v2 v2Var2;
        List list;
        p2 p2Var;
        Object value;
        v2.a aVar2;
        hl.a aVar3;
        ?? r14;
        ?? r15;
        ?? r16;
        List<pu0.b> list2;
        p2 p2Var2;
        Object value2;
        g3 g3VarA;
        Object objG;
        qu0.c cVarF;
        qu0.b bVar2;
        v2 v2Var3;
        o53.b0 b0Var = (o53.b0) this.f79383d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79382c;
        List list3 = null;
        ?? BooleanValue = 1;
        d dVar = this.f79385f;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                if (!this.f79384e || !p005kotlin.jvm.internal.s.g(dVar.f79188f, hl.a.c.f84256b)) {
                    aVar = dVar.f79188f;
                    zG = p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b);
                    bVar = this.f79386g;
                    if (!zG) {
                        if (!(aVar instanceof hl.a.b)) {
                            lc.u0.r();
                            return null;
                        }
                        kd0.m0 m0VarI = dVar.f79184b.getF104149f();
                        long j8 = ((hl.a.b) dVar.f79188f).f84252b;
                        this.f79383d = b0Var;
                        this.f79382c = 5;
                        obj = m0VarI.i(j8, bVar, this);
                        break;
                    } else if (!s3.b()) {
                        su0.t tVar = su0.t.f161004a;
                        this.f79383d = b0Var;
                        this.f79382c = 4;
                        obj = tVar.o(bVar, this);
                        break;
                    } else {
                        su0.t tVar2 = su0.t.f161004a;
                        this.f79383d = b0Var;
                        this.f79382c = 2;
                        obj = tVar2.n(bVar, this);
                        if (obj != aVar4) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                aVar3 = dVar.f79188f;
                                if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                                    su0.t tVar3 = su0.t.f161004a;
                                    this.f79383d = b0Var;
                                    this.f79381b = BooleanValue;
                                    this.f79382c = 6;
                                    obj = tVar3.f(false, this);
                                    if (obj != aVar4) {
                                        r15 = BooleanValue;
                                        list3 = (List) obj;
                                        r16 = r15;
                                        r16 = r14;
                                        list2 = list3;
                                        p2Var2 = dVar.H0;
                                        do {
                                            value2 = p2Var2.getValue();
                                            if (r16 != 0) {
                                                dVar.f79184b.getF104151h().getClass();
                                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                                if (list2 != null) {
                                                    while (r2.hasNext()) {
                                                        a2 a2Var = a2.LIVETRACK;
                                                        objG = og.a.G(bVar);
                                                        Object obj2 = "UNKNOWN";
                                                        if (objG == null) {
                                                            objG = "UNKNOWN";
                                                        }
                                                        cVarF = og.a.F(bVar);
                                                        if (cVarF == null && (bVar2 = cVarF.f147881b) != null) {
                                                            obj2 = bVar2;
                                                        }
                                                        i2.f36769a.getClass();
                                                        i2.a.k(a2Var, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj2);
                                                    }
                                                }
                                                g3.f35298f.getClass();
                                                g3VarA = g3.a.d(list2);
                                            } else {
                                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                            }
                                        } while (!p2Var2.b(value2, g3VarA));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (aVar3 instanceof hl.a.b) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    kd0.m0 m0VarI2 = dVar.f79184b.getF104149f();
                                    long j14 = ((hl.a.b) dVar.f79188f).f84252b;
                                    this.f79383d = b0Var;
                                    this.f79381b = BooleanValue;
                                    this.f79382c = 7;
                                    obj = m0VarI2.g(j14, this);
                                    if (obj != aVar4) {
                                        r14 = BooleanValue;
                                        v2Var3 = (v2) obj;
                                        if (v2Var3 instanceof v2.b) {
                                            list3 = (List) ((v2.b) v2Var3).f47386a;
                                            r16 = r14;
                                        } else if (!(v2Var3 instanceof v2.a)) {
                                            r16 = r14;
                                            lc.u0.r();
                                            return null;
                                        }
                                        r16 = r14;
                                        list2 = list3;
                                        p2Var2 = dVar.H0;
                                        do {
                                            value2 = p2Var2.getValue();
                                            if (r16 != 0) {
                                                dVar.f79184b.getF104151h().getClass();
                                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                                if (list2 != null) {
                                                    while (r2.hasNext()) {
                                                        a2 a2Var2 = a2.LIVETRACK;
                                                        objG = og.a.G(bVar);
                                                        Object obj3 = "UNKNOWN";
                                                        if (objG == null) {
                                                            objG = "UNKNOWN";
                                                        }
                                                        cVarF = og.a.F(bVar);
                                                        if (cVarF == null) {
                                                        }
                                                        i2.f36769a.getClass();
                                                        i2.a.k(a2Var2, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj3);
                                                    }
                                                }
                                                g3.f35298f.getClass();
                                                g3VarA = g3.a.d(list2);
                                            } else {
                                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                            }
                                        } while (!p2Var2.b(value2, g3VarA));
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    lc.u0.r();
                                    return null;
                                }
                                su0.t tVar4 = su0.t.f161004a;
                                this.f79383d = null;
                                this.f79380a = (v2.a) v2Var;
                                this.f79382c = 3;
                                serializableF = tVar4.f(false, this);
                                if (serializableF != aVar4) {
                                    v2Var2 = v2Var;
                                    obj = serializableF;
                                    list = (List) obj;
                                    p2Var = dVar.H0;
                                    do {
                                        value = p2Var.getValue();
                                        aVar2 = (v2.a) v2Var2;
                                    } while (!p2Var.b(value, g3.a.a(g3.f35298f, aVar2.f47385c, null, list, aVar2.f47384b, 2)));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                } else {
                    su0.t tVar5 = su0.t.f161004a;
                    this.f79383d = b0Var;
                    this.f79382c = 1;
                    if (tVar5.c(this) != aVar4) {
                        aVar = dVar.f79188f;
                        zG = p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b);
                        bVar = this.f79386g;
                        if (!zG) {
                            if (!(aVar instanceof hl.a.b)) {
                                lc.u0.r();
                                return null;
                            }
                            kd0.m0 m0VarI3 = dVar.f79184b.getF104149f();
                            long j15 = ((hl.a.b) dVar.f79188f).f84252b;
                            this.f79383d = b0Var;
                            this.f79382c = 5;
                            obj = m0VarI3.i(j15, bVar, this);
                            break;
                        } else if (!s3.b()) {
                            su0.t tVar6 = su0.t.f161004a;
                            this.f79383d = b0Var;
                            this.f79382c = 4;
                            obj = tVar6.o(bVar, this);
                            break;
                        } else {
                            su0.t tVar7 = su0.t.f161004a;
                            this.f79383d = b0Var;
                            this.f79382c = 2;
                            obj = tVar7.n(bVar, this);
                            if (obj != aVar4) {
                                v2Var = (v2) obj;
                                if (v2Var instanceof v2.b) {
                                    aVar3 = dVar.f79188f;
                                    if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                                        su0.t tVar8 = su0.t.f161004a;
                                        this.f79383d = b0Var;
                                        this.f79381b = BooleanValue;
                                        this.f79382c = 6;
                                        obj = tVar8.f(false, this);
                                        if (obj != aVar4) {
                                            r15 = BooleanValue;
                                            list3 = (List) obj;
                                            r16 = r15;
                                            r16 = r14;
                                            list2 = list3;
                                            p2Var2 = dVar.H0;
                                            do {
                                                value2 = p2Var2.getValue();
                                                if (r16 != 0) {
                                                    dVar.f79184b.getF104151h().getClass();
                                                    yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                                    if (list2 != null) {
                                                        for (pu0.b bVar3 : list2) {
                                                            a2 a2Var3 = a2.LIVETRACK;
                                                            objG = og.a.G(bVar3);
                                                            Object obj4 = "UNKNOWN";
                                                            if (objG == null) {
                                                                objG = "UNKNOWN";
                                                            }
                                                            cVarF = og.a.F(bVar3);
                                                            if (cVarF == null) {
                                                            }
                                                            i2.f36769a.getClass();
                                                            i2.a.k(a2Var3, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj4);
                                                        }
                                                    }
                                                    g3.f35298f.getClass();
                                                    g3VarA = g3.a.d(list2);
                                                } else {
                                                    g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                                }
                                            } while (!p2Var2.b(value2, g3VarA));
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (aVar3 instanceof hl.a.b) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        kd0.m0 m0VarI4 = dVar.f79184b.getF104149f();
                                        long j16 = ((hl.a.b) dVar.f79188f).f84252b;
                                        this.f79383d = b0Var;
                                        this.f79381b = BooleanValue;
                                        this.f79382c = 7;
                                        obj = m0VarI4.g(j16, this);
                                        if (obj != aVar4) {
                                            r14 = BooleanValue;
                                            v2Var3 = (v2) obj;
                                            if (v2Var3 instanceof v2.b) {
                                                list3 = (List) ((v2.b) v2Var3).f47386a;
                                                r16 = r14;
                                            } else if (!(v2Var3 instanceof v2.a)) {
                                                r16 = r14;
                                                lc.u0.r();
                                                return null;
                                            }
                                            r16 = r14;
                                            list2 = list3;
                                            p2Var2 = dVar.H0;
                                            do {
                                                value2 = p2Var2.getValue();
                                                if (r16 != 0) {
                                                    dVar.f79184b.getF104151h().getClass();
                                                    yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                                    if (list2 != null) {
                                                        while (r2.hasNext()) {
                                                            a2 a2Var4 = a2.LIVETRACK;
                                                            objG = og.a.G(bVar3);
                                                            Object obj5 = "UNKNOWN";
                                                            if (objG == null) {
                                                                objG = "UNKNOWN";
                                                            }
                                                            cVarF = og.a.F(bVar3);
                                                            if (cVarF == null) {
                                                            }
                                                            i2.f36769a.getClass();
                                                            i2.a.k(a2Var4, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj5);
                                                        }
                                                    }
                                                    g3.f35298f.getClass();
                                                    g3VarA = g3.a.d(list2);
                                                } else {
                                                    g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                                }
                                            } while (!p2Var2.b(value2, g3VarA));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    su0.t tVar9 = su0.t.f161004a;
                                    this.f79383d = null;
                                    this.f79380a = (v2.a) v2Var;
                                    this.f79382c = 3;
                                    serializableF = tVar9.f(false, this);
                                    if (serializableF != aVar4) {
                                        v2Var2 = v2Var;
                                        obj = serializableF;
                                        list = (List) obj;
                                        p2Var = dVar.H0;
                                        do {
                                            value = p2Var.getValue();
                                            aVar2 = (v2.a) v2Var2;
                                        } while (!p2Var.b(value, g3.a.a(g3.f35298f, aVar2.f47385c, null, list, aVar2.f47384b, 2)));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar4;
            case 1:
                o13.r.b(obj);
                aVar = dVar.f79188f;
                zG = p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b);
                bVar = this.f79386g;
                if (!zG) {
                    if (!(aVar instanceof hl.a.b)) {
                        lc.u0.r();
                        return null;
                    }
                    kd0.m0 m0VarI5 = dVar.f79184b.getF104149f();
                    long j17 = ((hl.a.b) dVar.f79188f).f84252b;
                    this.f79383d = b0Var;
                    this.f79382c = 5;
                    obj = m0VarI5.i(j17, bVar, this);
                    break;
                } else if (!s3.b()) {
                    su0.t tVar10 = su0.t.f161004a;
                    this.f79383d = b0Var;
                    this.f79382c = 4;
                    obj = tVar10.o(bVar, this);
                    break;
                } else {
                    su0.t tVar11 = su0.t.f161004a;
                    this.f79383d = b0Var;
                    this.f79382c = 2;
                    obj = tVar11.n(bVar, this);
                    if (obj != aVar4) {
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            aVar3 = dVar.f79188f;
                            if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                                su0.t tVar12 = su0.t.f161004a;
                                this.f79383d = b0Var;
                                this.f79381b = BooleanValue;
                                this.f79382c = 6;
                                obj = tVar12.f(false, this);
                                if (obj != aVar4) {
                                    r15 = BooleanValue;
                                    list3 = (List) obj;
                                    r16 = r15;
                                    r16 = r14;
                                    list2 = list3;
                                    p2Var2 = dVar.H0;
                                    do {
                                        value2 = p2Var2.getValue();
                                        if (r16 != 0) {
                                            dVar.f79184b.getF104151h().getClass();
                                            yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                            if (list2 != null) {
                                                while (r2.hasNext()) {
                                                    a2 a2Var5 = a2.LIVETRACK;
                                                    objG = og.a.G(bVar3);
                                                    Object obj6 = "UNKNOWN";
                                                    if (objG == null) {
                                                        objG = "UNKNOWN";
                                                    }
                                                    cVarF = og.a.F(bVar3);
                                                    if (cVarF == null) {
                                                    }
                                                    i2.f36769a.getClass();
                                                    i2.a.k(a2Var5, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj6);
                                                }
                                            }
                                            g3.f35298f.getClass();
                                            g3VarA = g3.a.d(list2);
                                        } else {
                                            g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                        }
                                    } while (!p2Var2.b(value2, g3VarA));
                                    return Unit.INSTANCE;
                                }
                            } else {
                                if (aVar3 instanceof hl.a.b) {
                                    lc.u0.r();
                                    return null;
                                }
                                kd0.m0 m0VarI6 = dVar.f79184b.getF104149f();
                                long j18 = ((hl.a.b) dVar.f79188f).f84252b;
                                this.f79383d = b0Var;
                                this.f79381b = BooleanValue;
                                this.f79382c = 7;
                                obj = m0VarI6.g(j18, this);
                                if (obj != aVar4) {
                                    r14 = BooleanValue;
                                    v2Var3 = (v2) obj;
                                    if (v2Var3 instanceof v2.b) {
                                        list3 = (List) ((v2.b) v2Var3).f47386a;
                                        r16 = r14;
                                    } else if (!(v2Var3 instanceof v2.a)) {
                                        r16 = r14;
                                        lc.u0.r();
                                        return null;
                                    }
                                    r16 = r14;
                                    list2 = list3;
                                    p2Var2 = dVar.H0;
                                    do {
                                        value2 = p2Var2.getValue();
                                        if (r16 != 0) {
                                            dVar.f79184b.getF104151h().getClass();
                                            yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                            if (list2 != null) {
                                                while (r2.hasNext()) {
                                                    a2 a2Var6 = a2.LIVETRACK;
                                                    objG = og.a.G(bVar3);
                                                    Object obj7 = "UNKNOWN";
                                                    if (objG == null) {
                                                        objG = "UNKNOWN";
                                                    }
                                                    cVarF = og.a.F(bVar3);
                                                    if (cVarF == null) {
                                                    }
                                                    i2.f36769a.getClass();
                                                    i2.a.k(a2Var6, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj7);
                                                }
                                            }
                                            g3.f35298f.getClass();
                                            g3VarA = g3.a.d(list2);
                                        } else {
                                            g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                        }
                                    } while (!p2Var2.b(value2, g3VarA));
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            if (v2Var instanceof v2.a) {
                                lc.u0.r();
                                return null;
                            }
                            su0.t tVar13 = su0.t.f161004a;
                            this.f79383d = null;
                            this.f79380a = (v2.a) v2Var;
                            this.f79382c = 3;
                            serializableF = tVar13.f(false, this);
                            if (serializableF != aVar4) {
                                v2Var2 = v2Var;
                                obj = serializableF;
                                list = (List) obj;
                                p2Var = dVar.H0;
                                do {
                                    value = p2Var.getValue();
                                    aVar2 = (v2.a) v2Var2;
                                } while (!p2Var.b(value, g3.a.a(g3.f35298f, aVar2.f47385c, null, list, aVar2.f47384b, 2)));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar4;
            case 2:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    aVar3 = dVar.f79188f;
                    if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                        su0.t tVar14 = su0.t.f161004a;
                        this.f79383d = b0Var;
                        this.f79381b = BooleanValue;
                        this.f79382c = 6;
                        obj = tVar14.f(false, this);
                        if (obj != aVar4) {
                            r15 = BooleanValue;
                            list3 = (List) obj;
                            r16 = r15;
                            r16 = r14;
                            list2 = list3;
                            p2Var2 = dVar.H0;
                            do {
                                value2 = p2Var2.getValue();
                                if (r16 != 0) {
                                    dVar.f79184b.getF104151h().getClass();
                                    yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                    if (list2 != null) {
                                        while (r2.hasNext()) {
                                            a2 a2Var7 = a2.LIVETRACK;
                                            objG = og.a.G(bVar3);
                                            Object obj8 = "UNKNOWN";
                                            if (objG == null) {
                                                objG = "UNKNOWN";
                                            }
                                            cVarF = og.a.F(bVar3);
                                            if (cVarF == null) {
                                            }
                                            i2.f36769a.getClass();
                                            i2.a.k(a2Var7, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj8);
                                        }
                                    }
                                    g3.f35298f.getClass();
                                    g3VarA = g3.a.d(list2);
                                } else {
                                    g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                }
                            } while (!p2Var2.b(value2, g3VarA));
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (aVar3 instanceof hl.a.b) {
                            lc.u0.r();
                            return null;
                        }
                        kd0.m0 m0VarI7 = dVar.f79184b.getF104149f();
                        long j19 = ((hl.a.b) dVar.f79188f).f84252b;
                        this.f79383d = b0Var;
                        this.f79381b = BooleanValue;
                        this.f79382c = 7;
                        obj = m0VarI7.g(j19, this);
                        if (obj != aVar4) {
                            r14 = BooleanValue;
                            v2Var3 = (v2) obj;
                            if (v2Var3 instanceof v2.b) {
                                list3 = (List) ((v2.b) v2Var3).f47386a;
                                r16 = r14;
                            } else if (!(v2Var3 instanceof v2.a)) {
                                r16 = r14;
                                lc.u0.r();
                                return null;
                            }
                            r16 = r14;
                            list2 = list3;
                            p2Var2 = dVar.H0;
                            do {
                                value2 = p2Var2.getValue();
                                if (r16 != 0) {
                                    dVar.f79184b.getF104151h().getClass();
                                    yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                    if (list2 != null) {
                                        while (r2.hasNext()) {
                                            a2 a2Var8 = a2.LIVETRACK;
                                            objG = og.a.G(bVar3);
                                            Object obj9 = "UNKNOWN";
                                            if (objG == null) {
                                                objG = "UNKNOWN";
                                            }
                                            cVarF = og.a.F(bVar3);
                                            if (cVarF == null) {
                                            }
                                            i2.f36769a.getClass();
                                            i2.a.k(a2Var8, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj9);
                                        }
                                    }
                                    g3.f35298f.getClass();
                                    g3VarA = g3.a.d(list2);
                                } else {
                                    g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                                }
                            } while (!p2Var2.b(value2, g3VarA));
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    su0.t tVar15 = su0.t.f161004a;
                    this.f79383d = null;
                    this.f79380a = (v2.a) v2Var;
                    this.f79382c = 3;
                    serializableF = tVar15.f(false, this);
                    if (serializableF != aVar4) {
                        v2Var2 = v2Var;
                        obj = serializableF;
                        list = (List) obj;
                        p2Var = dVar.H0;
                        do {
                            value = p2Var.getValue();
                            aVar2 = (v2.a) v2Var2;
                        } while (!p2Var.b(value, g3.a.a(g3.f35298f, aVar2.f47385c, null, list, aVar2.f47384b, 2)));
                        return Unit.INSTANCE;
                    }
                }
                return aVar4;
            case 3:
                v2Var2 = this.f79380a;
                o13.r.b(obj);
                list = (List) obj;
                p2Var = dVar.H0;
                do {
                    value = p2Var.getValue();
                    aVar2 = (v2.a) v2Var2;
                } while (!p2Var.b(value, g3.a.a(g3.f35298f, aVar2.f47385c, null, list, aVar2.f47384b, 2)));
                return Unit.INSTANCE;
            case 4:
                o13.r.b(obj);
                BooleanValue = ((Boolean) obj).booleanValue();
                aVar3 = dVar.f79188f;
                if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                    su0.t tVar16 = su0.t.f161004a;
                    this.f79383d = b0Var;
                    this.f79381b = BooleanValue;
                    this.f79382c = 6;
                    obj = tVar16.f(false, this);
                    if (obj != aVar4) {
                        r15 = BooleanValue;
                        list3 = (List) obj;
                        r16 = r15;
                        r16 = r14;
                        list2 = list3;
                        p2Var2 = dVar.H0;
                        do {
                            value2 = p2Var2.getValue();
                            if (r16 != 0) {
                                dVar.f79184b.getF104151h().getClass();
                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                if (list2 != null) {
                                    while (r2.hasNext()) {
                                        a2 a2Var9 = a2.LIVETRACK;
                                        objG = og.a.G(bVar3);
                                        Object obj10 = "UNKNOWN";
                                        if (objG == null) {
                                            objG = "UNKNOWN";
                                        }
                                        cVarF = og.a.F(bVar3);
                                        if (cVarF == null) {
                                        }
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var9, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj10);
                                    }
                                }
                                g3.f35298f.getClass();
                                g3VarA = g3.a.d(list2);
                            } else {
                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                            }
                        } while (!p2Var2.b(value2, g3VarA));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (aVar3 instanceof hl.a.b) {
                        lc.u0.r();
                        return null;
                    }
                    kd0.m0 m0VarI8 = dVar.f79184b.getF104149f();
                    long j110 = ((hl.a.b) dVar.f79188f).f84252b;
                    this.f79383d = b0Var;
                    this.f79381b = BooleanValue;
                    this.f79382c = 7;
                    obj = m0VarI8.g(j110, this);
                    if (obj != aVar4) {
                        r14 = BooleanValue;
                        v2Var3 = (v2) obj;
                        if (v2Var3 instanceof v2.b) {
                            list3 = (List) ((v2.b) v2Var3).f47386a;
                            r16 = r14;
                        } else if (!(v2Var3 instanceof v2.a)) {
                            r16 = r14;
                            lc.u0.r();
                            return null;
                        }
                        r16 = r14;
                        list2 = list3;
                        p2Var2 = dVar.H0;
                        do {
                            value2 = p2Var2.getValue();
                            if (r16 != 0) {
                                dVar.f79184b.getF104151h().getClass();
                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                if (list2 != null) {
                                    while (r2.hasNext()) {
                                        a2 a2Var10 = a2.LIVETRACK;
                                        objG = og.a.G(bVar3);
                                        Object obj11 = "UNKNOWN";
                                        if (objG == null) {
                                            objG = "UNKNOWN";
                                        }
                                        cVarF = og.a.F(bVar3);
                                        if (cVarF == null) {
                                        }
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var10, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj11);
                                    }
                                }
                                g3.f35298f.getClass();
                                g3VarA = g3.a.d(list2);
                            } else {
                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                            }
                        } while (!p2Var2.b(value2, g3VarA));
                        return Unit.INSTANCE;
                    }
                }
                return aVar4;
            case 5:
                o13.r.b(obj);
                BooleanValue = ((Boolean) obj).booleanValue();
                aVar3 = dVar.f79188f;
                if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                    su0.t tVar17 = su0.t.f161004a;
                    this.f79383d = b0Var;
                    this.f79381b = BooleanValue;
                    this.f79382c = 6;
                    obj = tVar17.f(false, this);
                    if (obj != aVar4) {
                        r15 = BooleanValue;
                        list3 = (List) obj;
                        r16 = r15;
                        r16 = r14;
                        list2 = list3;
                        p2Var2 = dVar.H0;
                        do {
                            value2 = p2Var2.getValue();
                            if (r16 != 0) {
                                dVar.f79184b.getF104151h().getClass();
                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                if (list2 != null) {
                                    while (r2.hasNext()) {
                                        a2 a2Var11 = a2.LIVETRACK;
                                        objG = og.a.G(bVar3);
                                        Object obj12 = "UNKNOWN";
                                        if (objG == null) {
                                            objG = "UNKNOWN";
                                        }
                                        cVarF = og.a.F(bVar3);
                                        if (cVarF == null) {
                                        }
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var11, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj12);
                                    }
                                }
                                g3.f35298f.getClass();
                                g3VarA = g3.a.d(list2);
                            } else {
                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                            }
                        } while (!p2Var2.b(value2, g3VarA));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (aVar3 instanceof hl.a.b) {
                        lc.u0.r();
                        return null;
                    }
                    kd0.m0 m0VarI9 = dVar.f79184b.getF104149f();
                    long j111 = ((hl.a.b) dVar.f79188f).f84252b;
                    this.f79383d = b0Var;
                    this.f79381b = BooleanValue;
                    this.f79382c = 7;
                    obj = m0VarI9.g(j111, this);
                    if (obj != aVar4) {
                        r14 = BooleanValue;
                        v2Var3 = (v2) obj;
                        if (v2Var3 instanceof v2.b) {
                            list3 = (List) ((v2.b) v2Var3).f47386a;
                            r16 = r14;
                        } else if (!(v2Var3 instanceof v2.a)) {
                            r16 = r14;
                            lc.u0.r();
                            return null;
                        }
                        r16 = r14;
                        list2 = list3;
                        p2Var2 = dVar.H0;
                        do {
                            value2 = p2Var2.getValue();
                            if (r16 != 0) {
                                dVar.f79184b.getF104151h().getClass();
                                yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                                if (list2 != null) {
                                    while (r2.hasNext()) {
                                        a2 a2Var12 = a2.LIVETRACK;
                                        objG = og.a.G(bVar3);
                                        Object obj13 = "UNKNOWN";
                                        if (objG == null) {
                                            objG = "UNKNOWN";
                                        }
                                        cVarF = og.a.F(bVar3);
                                        if (cVarF == null) {
                                        }
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var12, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj13);
                                    }
                                }
                                g3.f35298f.getClass();
                                g3VarA = g3.a.d(list2);
                            } else {
                                g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                            }
                        } while (!p2Var2.b(value2, g3VarA));
                        return Unit.INSTANCE;
                    }
                }
                return aVar4;
            case 6:
                int i15 = this.f79381b;
                o13.r.b(obj);
                r15 = i15;
                list3 = (List) obj;
                r16 = r15;
                r16 = r14;
                list2 = list3;
                p2Var2 = dVar.H0;
                do {
                    value2 = p2Var2.getValue();
                    if (r16 != 0) {
                        dVar.f79184b.getF104151h().getClass();
                        yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                        if (list2 != null) {
                            while (r2.hasNext()) {
                                a2 a2Var13 = a2.LIVETRACK;
                                objG = og.a.G(bVar3);
                                Object obj14 = "UNKNOWN";
                                if (objG == null) {
                                    objG = "UNKNOWN";
                                }
                                cVarF = og.a.F(bVar3);
                                if (cVarF == null) {
                                }
                                i2.f36769a.getClass();
                                i2.a.k(a2Var13, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj14);
                            }
                        }
                        g3.f35298f.getClass();
                        g3VarA = g3.a.d(list2);
                    } else {
                        g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                    }
                } while (!p2Var2.b(value2, g3VarA));
                return Unit.INSTANCE;
            case 7:
                int i16 = this.f79381b;
                o13.r.b(obj);
                r14 = i16;
                v2Var3 = (v2) obj;
                if (v2Var3 instanceof v2.b) {
                    list3 = (List) ((v2.b) v2Var3).f47386a;
                    r16 = r14;
                } else if (!(v2Var3 instanceof v2.a)) {
                    r16 = r14;
                    lc.u0.r();
                    return null;
                }
                r16 = r14;
                list2 = list3;
                p2Var2 = dVar.H0;
                do {
                    value2 = p2Var2.getValue();
                    if (r16 != 0) {
                        dVar.f79184b.getF104151h().getClass();
                        yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
                        if (list2 != null) {
                            while (r2.hasNext()) {
                                a2 a2Var14 = a2.LIVETRACK;
                                objG = og.a.G(bVar3);
                                Object obj15 = "UNKNOWN";
                                if (objG == null) {
                                    objG = "UNKNOWN";
                                }
                                cVarF = og.a.F(bVar3);
                                if (cVarF == null) {
                                }
                                i2.f36769a.getClass();
                                i2.a.k(a2Var14, "LivetrackSettingsViewModel", "LiveTrack recipient with phone sms status: " + objG + " and feature status: " + obj15);
                            }
                        }
                        g3.f35298f.getClass();
                        g3VarA = g3.a.d(list2);
                    } else {
                        g3VarA = g3.a.a(g3.f35298f, null, null, list2, null, 11);
                    }
                } while (!p2Var2.b(value2, g3VarA));
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
