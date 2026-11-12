package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import c22.f2;
import c80.c1;
import c80.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import oj0.y;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zd0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$updateSubscriptionAfterPurchase$1", f = "GCPlusHomeViewModel.kt", l = {416, 417, 426, 432, 442, 456, 480, 481, 482}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f35471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p2 f35472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g3.a f35473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f35476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f35477h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$updateSubscriptionAfterPurchase$1$guid$1", f = "GCPlusHomeViewModel.kt", l = {416}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35478a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35478a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            this.f35478a = 1;
            Object objC = bVar.C(this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f35477h = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f35477h, dVar);
        gVar.f35476g = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ca A[PHI: r3
      0x00ca: PHI (r3v14 java.lang.Object) = (r3v11 java.lang.Object), (r3v16 java.lang.Object) binds: [B:23:0x00c6, B:10:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0215  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (com.garmin.android.apps.connectmobile.f0.J(r10, new oj0.t(r10, (java.lang.String) r9, r11, null), r17) == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01dd, code lost:
    
        if (r1.c(r17) == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f6, code lost:
    
        if (r1.a(r17) == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020f, code lost:
    
        if (r1.a(r17) == r2) goto L76;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objE0;
        Object objK;
        s sVar;
        s sVar2;
        s sVar3;
        p2 p2Var;
        g3 g3VarD;
        g3.a aVar;
        Object objA;
        s sVar4;
        p2 p2Var2;
        int i14;
        g3.a aVar2;
        Object objA2;
        int i15;
        boolean z14;
        g3 g3VarD2;
        boolean z15;
        b0 b0Var = (b0) this.f35476g;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f35475f;
        e eVar = this.f35477h;
        switch (i16) {
            case 0:
                r.b(obj);
                eVar.f35418l.k(null, g3.a.c(g3.f35298f));
                str = eVar.f35421o;
                if (str == null) {
                    u uVar = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
                    this.f35476g = b0Var;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35475f = 3;
                    objK = uVar.k(false, this);
                    if (objK != aVar3) {
                        sVar = (s) objK;
                        eVar.f35420n.setValue(sVar);
                        if (!(sVar instanceof s.c)) {
                            sVar2 = sVar;
                            p2Var = eVar.f35418l;
                            if (!(sVar2 instanceof s.a)) {
                                aVar2 = g3.f35298f;
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = sVar2;
                                this.f35472c = p2Var;
                                this.f35473d = aVar2;
                                this.f35474e = 1;
                                this.f35475f = 5;
                                objA2 = wj0.d.a(this);
                                if (objA2 != aVar3) {
                                    sVar4 = sVar2;
                                    p2Var2 = p2Var;
                                    i15 = 1;
                                    boolean zBooleanValue = ((Boolean) objA2).booleanValue();
                                    if (i15 != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    i.a aVar4 = new i.a(new c.a(z14, zBooleanValue, false, 4, (p005kotlin.jvm.internal.j) null));
                                    aVar2.getClass();
                                    g3VarD2 = g3.a.d(aVar4);
                                    g3VarD = g3VarD2;
                                    p2Var = p2Var2;
                                    sVar2 = sVar4;
                                    p2Var.setValue(g3VarD);
                                    zd0.f fVar = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                    if (sVar2 instanceof s.a) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 7;
                                    } else if (sVar2 instanceof s.b) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 8;
                                    } else {
                                        if (!(sVar2 instanceof s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 9;
                                    }
                                }
                            } else if (sVar2 instanceof s.b) {
                                a80.b bVar = eVar.f35412f;
                                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                                dateTimePlusDays.getClass();
                                bVar.k(dateTimePlusDays);
                                aVar = g3.f35298f;
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = sVar2;
                                this.f35472c = p2Var;
                                this.f35473d = aVar;
                                this.f35474e = 0;
                                this.f35475f = 6;
                                objA = wj0.d.a(this);
                                if (objA != aVar3) {
                                    sVar4 = sVar2;
                                    p2Var2 = p2Var;
                                    i14 = 0;
                                    boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                                    if (i14 != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    i.a aVar5 = new i.a(new c.a(z15, zBooleanValue2, false, 4, (p005kotlin.jvm.internal.j) null));
                                    aVar.getClass();
                                    g3VarD2 = g3.a.d(aVar5);
                                    g3VarD = g3VarD2;
                                    p2Var = p2Var2;
                                    sVar2 = sVar4;
                                    p2Var.setValue(g3VarD);
                                    zd0.f fVar2 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                    if (sVar2 instanceof s.a) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 7;
                                    } else if (sVar2 instanceof s.b) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 8;
                                    } else {
                                        if (!(sVar2 instanceof s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 9;
                                    }
                                }
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                                    g3.a aVar6 = g3.f35298f;
                                    i.b bVar2 = new i.b(c.d.API);
                                    aVar6.getClass();
                                    g3VarD = g3.a.d(bVar2);
                                } else {
                                    a2 a2Var = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.e(a2Var, "Cannot display subscription information to ineligible user");
                                    g3.a aVar7 = g3.f35298f;
                                    i.b bVar3 = new i.b(c.d.UNAVAILABLE);
                                    aVar7.getClass();
                                    g3VarD = g3.a.d(bVar3);
                                }
                                p2Var.setValue(g3VarD);
                                zd0.f fVar3 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        } else {
                            this.f35476g = b0Var;
                            this.f35470a = null;
                            this.f35471b = sVar;
                            this.f35475f = 4;
                            if (f2.a("GCPlusHomeViewModel", this) != aVar3) {
                                sVar3 = sVar;
                                sVar2 = sVar3;
                                p2Var = eVar.f35418l;
                                if (!(sVar2 instanceof s.a)) {
                                    aVar2 = g3.f35298f;
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = sVar2;
                                    this.f35472c = p2Var;
                                    this.f35473d = aVar2;
                                    this.f35474e = 1;
                                    this.f35475f = 5;
                                    objA2 = wj0.d.a(this);
                                    if (objA2 != aVar3) {
                                        sVar4 = sVar2;
                                        p2Var2 = p2Var;
                                        i15 = 1;
                                        boolean zBooleanValue3 = ((Boolean) objA2).booleanValue();
                                        if (i15 != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        i.a aVar8 = new i.a(new c.a(z14, zBooleanValue3, false, 4, (p005kotlin.jvm.internal.j) null));
                                        aVar2.getClass();
                                        g3VarD2 = g3.a.d(aVar8);
                                        g3VarD = g3VarD2;
                                        p2Var = p2Var2;
                                        sVar2 = sVar4;
                                        p2Var.setValue(g3VarD);
                                        zd0.f fVar4 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                        if (sVar2 instanceof s.a) {
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 7;
                                        } else if (sVar2 instanceof s.b) {
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 8;
                                        } else {
                                            if (!(sVar2 instanceof s.c)) {
                                                u0.r();
                                                return null;
                                            }
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 9;
                                        }
                                    }
                                } else if (sVar2 instanceof s.b) {
                                    a80.b bVar4 = eVar.f35412f;
                                    DateTime dateTimePlusDays2 = DateTime.now().plusDays(1);
                                    dateTimePlusDays2.getClass();
                                    bVar4.k(dateTimePlusDays2);
                                    aVar = g3.f35298f;
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = sVar2;
                                    this.f35472c = p2Var;
                                    this.f35473d = aVar;
                                    this.f35474e = 0;
                                    this.f35475f = 6;
                                    objA = wj0.d.a(this);
                                    if (objA != aVar3) {
                                        sVar4 = sVar2;
                                        p2Var2 = p2Var;
                                        i14 = 0;
                                        boolean zBooleanValue4 = ((Boolean) objA).booleanValue();
                                        if (i14 != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        i.a aVar9 = new i.a(new c.a(z15, zBooleanValue4, false, 4, (p005kotlin.jvm.internal.j) null));
                                        aVar.getClass();
                                        g3VarD2 = g3.a.d(aVar9);
                                        g3VarD = g3VarD2;
                                        p2Var = p2Var2;
                                        sVar2 = sVar4;
                                        p2Var.setValue(g3VarD);
                                        zd0.f fVar5 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                        if (sVar2 instanceof s.a) {
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 7;
                                        } else if (sVar2 instanceof s.b) {
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 8;
                                        } else {
                                            if (!(sVar2 instanceof s.c)) {
                                                u0.r();
                                                return null;
                                            }
                                            this.f35476g = null;
                                            this.f35470a = null;
                                            this.f35471b = null;
                                            this.f35472c = null;
                                            this.f35473d = null;
                                            this.f35475f = 9;
                                        }
                                    }
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                                        g3.a aVar10 = g3.f35298f;
                                        i.b bVar5 = new i.b(c.d.API);
                                        aVar10.getClass();
                                        g3VarD = g3.a.d(bVar5);
                                    } else {
                                        a2 a2Var2 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.e(a2Var2, "Cannot display subscription information to ineligible user");
                                        g3.a aVar11 = g3.f35298f;
                                        i.b bVar6 = new i.b(c.d.UNAVAILABLE);
                                        aVar11.getClass();
                                        g3VarD = g3.a.d(bVar6);
                                    }
                                    p2Var.setValue(g3VarD);
                                    zd0.f fVar6 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                    if (sVar2 instanceof s.a) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 7;
                                    } else if (sVar2 instanceof s.b) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 8;
                                    } else {
                                        if (!(sVar2 instanceof s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 9;
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    x53.c cVar = s0.f129406a;
                    x53.b bVar7 = x53.b.f189152a;
                    a aVar12 = new a(null);
                    this.f35476g = b0Var;
                    this.f35470a = str;
                    this.f35475f = 1;
                    objE0 = ge1.b.e0(bVar7, aVar12, this);
                    if (objE0 != aVar3) {
                        oj0.f fVar7 = eVar.f35411e;
                        y yVar = new y(str);
                        this.f35476g = b0Var;
                        this.f35470a = null;
                        this.f35471b = null;
                        this.f35475f = 2;
                        fVar7.getClass();
                    }
                    break;
                }
                return aVar3;
            case 1:
                str = this.f35470a;
                r.b(obj);
                objE0 = obj;
                oj0.f fVar8 = eVar.f35411e;
                y yVar2 = new y(str);
                this.f35476g = b0Var;
                this.f35470a = null;
                this.f35471b = null;
                this.f35475f = 2;
                fVar8.getClass();
                break;
            case 2:
                r.b(obj);
                eVar.f35421o = null;
                eVar.f35422p = null;
                u uVar2 = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
                this.f35476g = b0Var;
                this.f35470a = null;
                this.f35471b = null;
                this.f35475f = 3;
                objK = uVar2.k(false, this);
                if (objK != aVar3) {
                    sVar = (s) objK;
                    eVar.f35420n.setValue(sVar);
                    if (!(sVar instanceof s.c)) {
                        this.f35476g = b0Var;
                        this.f35470a = null;
                        this.f35471b = sVar;
                        this.f35475f = 4;
                        if (f2.a("GCPlusHomeViewModel", this) != aVar3) {
                            sVar3 = sVar;
                            sVar2 = sVar3;
                            p2Var = eVar.f35418l;
                            if (!(sVar2 instanceof s.a)) {
                                aVar2 = g3.f35298f;
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = sVar2;
                                this.f35472c = p2Var;
                                this.f35473d = aVar2;
                                this.f35474e = 1;
                                this.f35475f = 5;
                                objA2 = wj0.d.a(this);
                                if (objA2 != aVar3) {
                                    sVar4 = sVar2;
                                    p2Var2 = p2Var;
                                    i15 = 1;
                                    boolean zBooleanValue5 = ((Boolean) objA2).booleanValue();
                                    if (i15 != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    i.a aVar13 = new i.a(new c.a(z14, zBooleanValue5, false, 4, (p005kotlin.jvm.internal.j) null));
                                    aVar2.getClass();
                                    g3VarD2 = g3.a.d(aVar13);
                                    g3VarD = g3VarD2;
                                    p2Var = p2Var2;
                                    sVar2 = sVar4;
                                    p2Var.setValue(g3VarD);
                                    zd0.f fVar9 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                    if (sVar2 instanceof s.a) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 7;
                                    } else if (sVar2 instanceof s.b) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 8;
                                    } else {
                                        if (!(sVar2 instanceof s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 9;
                                    }
                                }
                            } else if (sVar2 instanceof s.b) {
                                a80.b bVar8 = eVar.f35412f;
                                DateTime dateTimePlusDays3 = DateTime.now().plusDays(1);
                                dateTimePlusDays3.getClass();
                                bVar8.k(dateTimePlusDays3);
                                aVar = g3.f35298f;
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = sVar2;
                                this.f35472c = p2Var;
                                this.f35473d = aVar;
                                this.f35474e = 0;
                                this.f35475f = 6;
                                objA = wj0.d.a(this);
                                if (objA != aVar3) {
                                    sVar4 = sVar2;
                                    p2Var2 = p2Var;
                                    i14 = 0;
                                    boolean zBooleanValue6 = ((Boolean) objA).booleanValue();
                                    if (i14 != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    i.a aVar14 = new i.a(new c.a(z15, zBooleanValue6, false, 4, (p005kotlin.jvm.internal.j) null));
                                    aVar.getClass();
                                    g3VarD2 = g3.a.d(aVar14);
                                    g3VarD = g3VarD2;
                                    p2Var = p2Var2;
                                    sVar2 = sVar4;
                                    p2Var.setValue(g3VarD);
                                    zd0.f fVar10 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                    if (sVar2 instanceof s.a) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 7;
                                    } else if (sVar2 instanceof s.b) {
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 8;
                                    } else {
                                        if (!(sVar2 instanceof s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f35476g = null;
                                        this.f35470a = null;
                                        this.f35471b = null;
                                        this.f35472c = null;
                                        this.f35473d = null;
                                        this.f35475f = 9;
                                    }
                                }
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                                    g3.a aVar15 = g3.f35298f;
                                    i.b bVar9 = new i.b(c.d.API);
                                    aVar15.getClass();
                                    g3VarD = g3.a.d(bVar9);
                                } else {
                                    a2 a2Var3 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.e(a2Var3, "Cannot display subscription information to ineligible user");
                                    g3.a aVar16 = g3.f35298f;
                                    i.b bVar10 = new i.b(c.d.UNAVAILABLE);
                                    aVar16.getClass();
                                    g3VarD = g3.a.d(bVar10);
                                }
                                p2Var.setValue(g3VarD);
                                zd0.f fVar11 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        }
                    } else {
                        sVar2 = sVar;
                        p2Var = eVar.f35418l;
                        if (!(sVar2 instanceof s.a)) {
                            aVar2 = g3.f35298f;
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = sVar2;
                            this.f35472c = p2Var;
                            this.f35473d = aVar2;
                            this.f35474e = 1;
                            this.f35475f = 5;
                            objA2 = wj0.d.a(this);
                            if (objA2 != aVar3) {
                                sVar4 = sVar2;
                                p2Var2 = p2Var;
                                i15 = 1;
                                boolean zBooleanValue7 = ((Boolean) objA2).booleanValue();
                                if (i15 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                i.a aVar17 = new i.a(new c.a(z14, zBooleanValue7, false, 4, (p005kotlin.jvm.internal.j) null));
                                aVar2.getClass();
                                g3VarD2 = g3.a.d(aVar17);
                                g3VarD = g3VarD2;
                                p2Var = p2Var2;
                                sVar2 = sVar4;
                                p2Var.setValue(g3VarD);
                                zd0.f fVar12 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        } else if (sVar2 instanceof s.b) {
                            a80.b bVar11 = eVar.f35412f;
                            DateTime dateTimePlusDays4 = DateTime.now().plusDays(1);
                            dateTimePlusDays4.getClass();
                            bVar11.k(dateTimePlusDays4);
                            aVar = g3.f35298f;
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = sVar2;
                            this.f35472c = p2Var;
                            this.f35473d = aVar;
                            this.f35474e = 0;
                            this.f35475f = 6;
                            objA = wj0.d.a(this);
                            if (objA != aVar3) {
                                sVar4 = sVar2;
                                p2Var2 = p2Var;
                                i14 = 0;
                                boolean zBooleanValue8 = ((Boolean) objA).booleanValue();
                                if (i14 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                i.a aVar18 = new i.a(new c.a(z15, zBooleanValue8, false, 4, (p005kotlin.jvm.internal.j) null));
                                aVar.getClass();
                                g3VarD2 = g3.a.d(aVar18);
                                g3VarD = g3VarD2;
                                p2Var = p2Var2;
                                sVar2 = sVar4;
                                p2Var.setValue(g3VarD);
                                zd0.f fVar13 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        } else {
                            if (!(sVar2 instanceof s.c)) {
                                u0.r();
                                return null;
                            }
                            if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                                g3.a aVar19 = g3.f35298f;
                                i.b bVar12 = new i.b(c.d.API);
                                aVar19.getClass();
                                g3VarD = g3.a.d(bVar12);
                            } else {
                                a2 a2Var4 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.e(a2Var4, "Cannot display subscription information to ineligible user");
                                g3.a aVar110 = g3.f35298f;
                                i.b bVar13 = new i.b(c.d.UNAVAILABLE);
                                aVar110.getClass();
                                g3VarD = g3.a.d(bVar13);
                            }
                            p2Var.setValue(g3VarD);
                            zd0.f fVar14 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                            if (sVar2 instanceof s.a) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 7;
                            } else if (sVar2 instanceof s.b) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 8;
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 9;
                            }
                        }
                    }
                    break;
                }
                return aVar3;
            case 3:
                r.b(obj);
                objK = obj;
                sVar = (s) objK;
                eVar.f35420n.setValue(sVar);
                if (!(sVar instanceof s.c)) {
                    sVar2 = sVar;
                    p2Var = eVar.f35418l;
                    if (!(sVar2 instanceof s.a)) {
                        aVar2 = g3.f35298f;
                        this.f35476g = null;
                        this.f35470a = null;
                        this.f35471b = sVar2;
                        this.f35472c = p2Var;
                        this.f35473d = aVar2;
                        this.f35474e = 1;
                        this.f35475f = 5;
                        objA2 = wj0.d.a(this);
                        if (objA2 != aVar3) {
                            sVar4 = sVar2;
                            p2Var2 = p2Var;
                            i15 = 1;
                            boolean zBooleanValue9 = ((Boolean) objA2).booleanValue();
                            if (i15 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            i.a aVar111 = new i.a(new c.a(z14, zBooleanValue9, false, 4, (p005kotlin.jvm.internal.j) null));
                            aVar2.getClass();
                            g3VarD2 = g3.a.d(aVar111);
                            g3VarD = g3VarD2;
                            p2Var = p2Var2;
                            sVar2 = sVar4;
                            p2Var.setValue(g3VarD);
                            zd0.f fVar15 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                            if (sVar2 instanceof s.a) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 7;
                            } else if (sVar2 instanceof s.b) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 8;
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 9;
                            }
                        }
                    } else if (sVar2 instanceof s.b) {
                        a80.b bVar14 = eVar.f35412f;
                        DateTime dateTimePlusDays5 = DateTime.now().plusDays(1);
                        dateTimePlusDays5.getClass();
                        bVar14.k(dateTimePlusDays5);
                        aVar = g3.f35298f;
                        this.f35476g = null;
                        this.f35470a = null;
                        this.f35471b = sVar2;
                        this.f35472c = p2Var;
                        this.f35473d = aVar;
                        this.f35474e = 0;
                        this.f35475f = 6;
                        objA = wj0.d.a(this);
                        if (objA != aVar3) {
                            sVar4 = sVar2;
                            p2Var2 = p2Var;
                            i14 = 0;
                            boolean zBooleanValue10 = ((Boolean) objA).booleanValue();
                            if (i14 != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i.a aVar112 = new i.a(new c.a(z15, zBooleanValue10, false, 4, (p005kotlin.jvm.internal.j) null));
                            aVar.getClass();
                            g3VarD2 = g3.a.d(aVar112);
                            g3VarD = g3VarD2;
                            p2Var = p2Var2;
                            sVar2 = sVar4;
                            p2Var.setValue(g3VarD);
                            zd0.f fVar16 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                            if (sVar2 instanceof s.a) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 7;
                            } else if (sVar2 instanceof s.b) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 8;
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 9;
                            }
                        }
                    } else {
                        if (!(sVar2 instanceof s.c)) {
                            u0.r();
                            return null;
                        }
                        if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                            g3.a aVar113 = g3.f35298f;
                            i.b bVar15 = new i.b(c.d.API);
                            aVar113.getClass();
                            g3VarD = g3.a.d(bVar15);
                        } else {
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.e(a2Var5, "Cannot display subscription information to ineligible user");
                            g3.a aVar114 = g3.f35298f;
                            i.b bVar16 = new i.b(c.d.UNAVAILABLE);
                            aVar114.getClass();
                            g3VarD = g3.a.d(bVar16);
                        }
                        p2Var.setValue(g3VarD);
                        zd0.f fVar17 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                        if (sVar2 instanceof s.a) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 7;
                        } else if (sVar2 instanceof s.b) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 8;
                        } else {
                            if (!(sVar2 instanceof s.c)) {
                                u0.r();
                                return null;
                            }
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 9;
                        }
                    }
                    break;
                } else {
                    this.f35476g = b0Var;
                    this.f35470a = null;
                    this.f35471b = sVar;
                    this.f35475f = 4;
                    if (f2.a("GCPlusHomeViewModel", this) != aVar3) {
                        sVar3 = sVar;
                        sVar2 = sVar3;
                        p2Var = eVar.f35418l;
                        if (!(sVar2 instanceof s.a)) {
                            aVar2 = g3.f35298f;
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = sVar2;
                            this.f35472c = p2Var;
                            this.f35473d = aVar2;
                            this.f35474e = 1;
                            this.f35475f = 5;
                            objA2 = wj0.d.a(this);
                            if (objA2 != aVar3) {
                                sVar4 = sVar2;
                                p2Var2 = p2Var;
                                i15 = 1;
                                boolean zBooleanValue11 = ((Boolean) objA2).booleanValue();
                                if (i15 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                i.a aVar115 = new i.a(new c.a(z14, zBooleanValue11, false, 4, (p005kotlin.jvm.internal.j) null));
                                aVar2.getClass();
                                g3VarD2 = g3.a.d(aVar115);
                                g3VarD = g3VarD2;
                                p2Var = p2Var2;
                                sVar2 = sVar4;
                                p2Var.setValue(g3VarD);
                                zd0.f fVar18 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        } else if (sVar2 instanceof s.b) {
                            a80.b bVar17 = eVar.f35412f;
                            DateTime dateTimePlusDays6 = DateTime.now().plusDays(1);
                            dateTimePlusDays6.getClass();
                            bVar17.k(dateTimePlusDays6);
                            aVar = g3.f35298f;
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = sVar2;
                            this.f35472c = p2Var;
                            this.f35473d = aVar;
                            this.f35474e = 0;
                            this.f35475f = 6;
                            objA = wj0.d.a(this);
                            if (objA != aVar3) {
                                sVar4 = sVar2;
                                p2Var2 = p2Var;
                                i14 = 0;
                                boolean zBooleanValue12 = ((Boolean) objA).booleanValue();
                                if (i14 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                i.a aVar116 = new i.a(new c.a(z15, zBooleanValue12, false, 4, (p005kotlin.jvm.internal.j) null));
                                aVar.getClass();
                                g3VarD2 = g3.a.d(aVar116);
                                g3VarD = g3VarD2;
                                p2Var = p2Var2;
                                sVar2 = sVar4;
                                p2Var.setValue(g3VarD);
                                zd0.f fVar19 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                                if (sVar2 instanceof s.a) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 7;
                                } else if (sVar2 instanceof s.b) {
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 8;
                                } else {
                                    if (!(sVar2 instanceof s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f35476g = null;
                                    this.f35470a = null;
                                    this.f35471b = null;
                                    this.f35472c = null;
                                    this.f35473d = null;
                                    this.f35475f = 9;
                                }
                            }
                        } else {
                            if (!(sVar2 instanceof s.c)) {
                                u0.r();
                                return null;
                            }
                            if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                                g3.a aVar117 = g3.f35298f;
                                i.b bVar18 = new i.b(c.d.API);
                                aVar117.getClass();
                                g3VarD = g3.a.d(bVar18);
                            } else {
                                a2 a2Var6 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.e(a2Var6, "Cannot display subscription information to ineligible user");
                                g3.a aVar118 = g3.f35298f;
                                i.b bVar19 = new i.b(c.d.UNAVAILABLE);
                                aVar118.getClass();
                                g3VarD = g3.a.d(bVar19);
                            }
                            p2Var.setValue(g3VarD);
                            zd0.f fVar110 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                            if (sVar2 instanceof s.a) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 7;
                            } else if (sVar2 instanceof s.b) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 8;
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 9;
                            }
                        }
                    }
                    break;
                }
                return aVar3;
            case 4:
                sVar3 = this.f35471b;
                r.b(obj);
                sVar2 = sVar3;
                p2Var = eVar.f35418l;
                if (!(sVar2 instanceof s.a)) {
                    if (sVar2 instanceof s.b) {
                        a80.b bVar110 = eVar.f35412f;
                        DateTime dateTimePlusDays7 = DateTime.now().plusDays(1);
                        dateTimePlusDays7.getClass();
                        bVar110.k(dateTimePlusDays7);
                        aVar = g3.f35298f;
                        this.f35476g = null;
                        this.f35470a = null;
                        this.f35471b = sVar2;
                        this.f35472c = p2Var;
                        this.f35473d = aVar;
                        this.f35474e = 0;
                        this.f35475f = 6;
                        objA = wj0.d.a(this);
                        if (objA != aVar3) {
                            sVar4 = sVar2;
                            p2Var2 = p2Var;
                            i14 = 0;
                            boolean zBooleanValue13 = ((Boolean) objA).booleanValue();
                            if (i14 != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i.a aVar119 = new i.a(new c.a(z15, zBooleanValue13, false, 4, (p005kotlin.jvm.internal.j) null));
                            aVar.getClass();
                            g3VarD2 = g3.a.d(aVar119);
                            g3VarD = g3VarD2;
                            p2Var = p2Var2;
                            sVar2 = sVar4;
                            p2Var.setValue(g3VarD);
                            zd0.f fVar111 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                            if (sVar2 instanceof s.a) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 7;
                            } else if (sVar2 instanceof s.b) {
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 8;
                            } else {
                                if (!(sVar2 instanceof s.c)) {
                                    u0.r();
                                    return null;
                                }
                                this.f35476g = null;
                                this.f35470a = null;
                                this.f35471b = null;
                                this.f35472c = null;
                                this.f35473d = null;
                                this.f35475f = 9;
                            }
                        }
                    } else {
                        if (!(sVar2 instanceof s.c)) {
                            u0.r();
                            return null;
                        }
                        if (((s.c) sVar2).f25560a == c1.API_ISSUE) {
                            g3.a aVar1110 = g3.f35298f;
                            i.b bVar111 = new i.b(c.d.API);
                            aVar1110.getClass();
                            g3VarD = g3.a.d(bVar111);
                        } else {
                            a2 a2Var7 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.e(a2Var7, "Cannot display subscription information to ineligible user");
                            g3.a aVar1111 = g3.f35298f;
                            i.b bVar112 = new i.b(c.d.UNAVAILABLE);
                            aVar1111.getClass();
                            g3VarD = g3.a.d(bVar112);
                        }
                        p2Var.setValue(g3VarD);
                        zd0.f fVar112 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                        if (sVar2 instanceof s.a) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 7;
                        } else if (sVar2 instanceof s.b) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 8;
                        } else {
                            if (!(sVar2 instanceof s.c)) {
                                u0.r();
                                return null;
                            }
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 9;
                        }
                    }
                    break;
                } else {
                    aVar2 = g3.f35298f;
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = sVar2;
                    this.f35472c = p2Var;
                    this.f35473d = aVar2;
                    this.f35474e = 1;
                    this.f35475f = 5;
                    objA2 = wj0.d.a(this);
                    if (objA2 != aVar3) {
                        sVar4 = sVar2;
                        p2Var2 = p2Var;
                        i15 = 1;
                        boolean zBooleanValue14 = ((Boolean) objA2).booleanValue();
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        i.a aVar1112 = new i.a(new c.a(z14, zBooleanValue14, false, 4, (p005kotlin.jvm.internal.j) null));
                        aVar2.getClass();
                        g3VarD2 = g3.a.d(aVar1112);
                        g3VarD = g3VarD2;
                        p2Var = p2Var2;
                        sVar2 = sVar4;
                        p2Var.setValue(g3VarD);
                        zd0.f fVar113 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                        if (sVar2 instanceof s.a) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 7;
                        } else if (sVar2 instanceof s.b) {
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 8;
                        } else {
                            if (!(sVar2 instanceof s.c)) {
                                u0.r();
                                return null;
                            }
                            this.f35476g = null;
                            this.f35470a = null;
                            this.f35471b = null;
                            this.f35472c = null;
                            this.f35473d = null;
                            this.f35475f = 9;
                        }
                    }
                    break;
                }
                return aVar3;
            case 5:
                i15 = this.f35474e;
                aVar2 = this.f35473d;
                p2 p2Var3 = this.f35472c;
                s sVar5 = this.f35471b;
                r.b(obj);
                sVar4 = sVar5;
                p2Var2 = p2Var3;
                objA2 = obj;
                boolean zBooleanValue15 = ((Boolean) objA2).booleanValue();
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i.a aVar1113 = new i.a(new c.a(z14, zBooleanValue15, false, 4, (p005kotlin.jvm.internal.j) null));
                aVar2.getClass();
                g3VarD2 = g3.a.d(aVar1113);
                g3VarD = g3VarD2;
                p2Var = p2Var2;
                sVar2 = sVar4;
                p2Var.setValue(g3VarD);
                zd0.f fVar114 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                if (sVar2 instanceof s.a) {
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 7;
                } else if (sVar2 instanceof s.b) {
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 8;
                } else {
                    if (!(sVar2 instanceof s.c)) {
                        u0.r();
                        return null;
                    }
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 9;
                }
                break;
            case 6:
                i14 = this.f35474e;
                aVar = this.f35473d;
                p2 p2Var4 = this.f35472c;
                s sVar6 = this.f35471b;
                r.b(obj);
                sVar4 = sVar6;
                p2Var2 = p2Var4;
                objA = obj;
                boolean zBooleanValue16 = ((Boolean) objA).booleanValue();
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i.a aVar1114 = new i.a(new c.a(z15, zBooleanValue16, false, 4, (p005kotlin.jvm.internal.j) null));
                aVar.getClass();
                g3VarD2 = g3.a.d(aVar1114);
                g3VarD = g3VarD2;
                p2Var = p2Var2;
                sVar2 = sVar4;
                p2Var.setValue(g3VarD);
                zd0.f fVar115 = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                if (sVar2 instanceof s.a) {
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 7;
                } else if (sVar2 instanceof s.b) {
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 8;
                } else {
                    if (!(sVar2 instanceof s.c)) {
                        u0.r();
                        return null;
                    }
                    this.f35476g = null;
                    this.f35470a = null;
                    this.f35471b = null;
                    this.f35472c = null;
                    this.f35473d = null;
                    this.f35475f = 9;
                }
                break;
            case 7:
            case 8:
            case 9:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
