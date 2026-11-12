package te2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITTicketForCredentialExchanger$forDI2$2", f = "ITTicketForCredentialExchanger.kt", l = {151, 166, SyslogConstants.LOG_LOCAL6, 178, 187}, m = "invokeSuspend")
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.m f164233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f164234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sc2.b f164235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f164237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.l f164238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, sc2.l lVar, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f164237f = s1Var;
        this.f164238g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f164237f, this.f164238g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x014a A[Catch: all -> 0x0022, PHI: r2 r4
      0x014a: PHI (r2v19 java.lang.String) = (r2v18 java.lang.String), (r2v26 java.lang.String) binds: [B:44:0x0147, B:18:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v5 java.lang.Object) binds: [B:44:0x0147, B:18:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001e, B:17:0x002f, B:46:0x014a, B:20:0x0040, B:43:0x0117, B:24:0x0052, B:37:0x00d5, B:39:0x00e4, B:25:0x005b, B:31:0x0091, B:33:0x00a4, B:28:0x0064), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157 A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objE0;
        sc2.n nVar;
        String str;
        sc2.m mVar;
        sc2.b bVar;
        Object objE1;
        sc2.n nVar2;
        sc2.m mVar2;
        String str2;
        Object objE2;
        sc2.b bVar2;
        String str3;
        Object objE3;
        ve2.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164236e;
        s1 s1Var = this.f164237f;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                s1Var.f164294g.debug("forDI2: calling 'ITTicketForDI2Request'...");
                pc2.p pVar = new pc2.p(s1Var.f164288a, s1Var.f164292e, s1Var.f164289b, this.f164238g, s1Var.f164291d.f177765f);
                this.f164236e = 1;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.o(pVar, null), this);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objE0 = obj;
            } else {
                if (i14 == 2) {
                    str2 = this.f164234c;
                    sc2.m mVar3 = this.f164233b;
                    sc2.n nVar3 = (sc2.n) this.f164232a;
                    o13.r.b(obj);
                    nVar2 = nVar3;
                    mVar2 = mVar3;
                    objE1 = obj;
                    str = str2;
                    bVar = (sc2.b) wc2.b.a((wc2.a) objE1);
                    mVar = mVar2;
                    nVar = nVar2;
                    s1Var.f164294g.debug("forOAuth2DI: calling 'DIGarminUserProfileRequest'...");
                    yc2.b bVar3 = new yc2.b(s1Var.f164288a, s1Var.f164292e, str);
                    this.f164232a = nVar;
                    this.f164233b = mVar;
                    this.f164234c = str;
                    this.f164235d = bVar;
                    this.f164236e = 3;
                    p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                    x53.c cVar2 = o53.s0.f129406a;
                    objE2 = ge1.b.e0(x53.b.f189152a, new yc2.c(r0Var, bVar3, null), this);
                    if (objE2 != aVar) {
                        bVar2 = bVar;
                        str3 = str;
                        sc2.m mVar4 = mVar;
                        zc2.a aVar2 = (zc2.a) wc2.b.a((wc2.a) objE2);
                        new s0();
                        ve2.e eVar = s1Var.f164292e;
                        ve2.k kVar = nVar.f158541a;
                        re2.b.c cVar3 = s1Var.f164293f;
                        this.f164232a = str3;
                        this.f164233b = null;
                        this.f164234c = null;
                        this.f164235d = null;
                        this.f164236e = 4;
                        objE3 = ge1.b.e0(o53.s0.f129406a, new q0(aVar2, bVar2, null, mVar4, cVar3, eVar, kVar, null), this);
                        if (objE3 == aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    sc2.b bVar4 = this.f164235d;
                    String str4 = this.f164234c;
                    mVar = this.f164233b;
                    nVar = (sc2.n) this.f164232a;
                    o13.r.b(obj);
                    bVar2 = bVar4;
                    str3 = str4;
                    objE2 = obj;
                    sc2.m mVar5 = mVar;
                    zc2.a aVar3 = (zc2.a) wc2.b.a((wc2.a) objE2);
                    new s0();
                    ve2.e eVar2 = s1Var.f164292e;
                    ve2.k kVar2 = nVar.f158541a;
                    re2.b.c cVar4 = s1Var.f164293f;
                    this.f164232a = str3;
                    this.f164233b = null;
                    this.f164234c = null;
                    this.f164235d = null;
                    this.f164236e = 4;
                    objE3 = ge1.b.e0(o53.s0.f129406a, new q0(aVar3, bVar2, null, mVar5, cVar4, eVar2, kVar2, null), this);
                    if (objE3 == aVar) {
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ve2.d dVar2 = (ve2.d) this.f164232a;
                    o13.r.b(obj);
                    return dVar2;
                }
                str3 = (String) this.f164232a;
                o13.r.b(obj);
                objE3 = obj;
            }
            dVar = (ve2.d) objE3;
            this.f164232a = dVar;
            this.f164236e = 5;
            if (s1.a(s1Var, str3, this) == aVar) {
                return aVar;
            }
            return dVar;
            nVar = (sc2.n) wc2.b.a((wc2.a) objE0);
            sc2.m mVar6 = nVar.f158542b;
            str = mVar6.f158528b;
            if (s1Var.f164291d.f177766g) {
                mVar = mVar6;
                bVar = null;
                s1Var.f164294g.debug("forOAuth2DI: calling 'DIGarminUserProfileRequest'...");
                yc2.b bVar5 = new yc2.b(s1Var.f164288a, s1Var.f164292e, str);
                this.f164232a = nVar;
                this.f164233b = mVar;
                this.f164234c = str;
                this.f164235d = bVar;
                this.f164236e = 3;
                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                x53.c cVar5 = o53.s0.f129406a;
                objE2 = ge1.b.e0(x53.b.f189152a, new yc2.c(r0Var2, bVar5, null), this);
                if (objE2 != aVar) {
                    bVar2 = bVar;
                    str3 = str;
                    sc2.m mVar7 = mVar;
                    zc2.a aVar4 = (zc2.a) wc2.b.a((wc2.a) objE2);
                    new s0();
                    ve2.e eVar3 = s1Var.f164292e;
                    ve2.k kVar3 = nVar.f158541a;
                    re2.b.c cVar6 = s1Var.f164293f;
                    this.f164232a = str3;
                    this.f164233b = null;
                    this.f164234c = null;
                    this.f164235d = null;
                    this.f164236e = 4;
                    objE3 = ge1.b.e0(o53.s0.f129406a, new q0(aVar4, bVar2, null, mVar7, cVar6, eVar3, kVar3, null), this);
                    if (objE3 == aVar) {
                        dVar = (ve2.d) objE3;
                        this.f164232a = dVar;
                        this.f164236e = 5;
                        if (s1.a(s1Var, str3, this) == aVar) {
                            return dVar;
                        }
                    }
                }
            } else {
                s1Var.f164294g.debug("forDI2: calling 'GCSocialProfileRequest'...");
                qc2.o oVar = new qc2.o(s1Var.f164288a, s1Var.f164292e, str, null, 8, null);
                this.f164232a = nVar;
                this.f164233b = mVar6;
                this.f164234c = str;
                this.f164236e = 2;
                x53.c cVar7 = o53.s0.f129406a;
                objE1 = ge1.b.e0(x53.b.f189152a, new qc2.n(oVar, null), this);
                if (objE1 != aVar) {
                    nVar2 = nVar;
                    mVar2 = mVar6;
                    str2 = str;
                    str = str2;
                    bVar = (sc2.b) wc2.b.a((wc2.a) objE1);
                    mVar = mVar2;
                    nVar = nVar2;
                    s1Var.f164294g.debug("forOAuth2DI: calling 'DIGarminUserProfileRequest'...");
                    yc2.b bVar6 = new yc2.b(s1Var.f164288a, s1Var.f164292e, str);
                    this.f164232a = nVar;
                    this.f164233b = mVar;
                    this.f164234c = str;
                    this.f164235d = bVar;
                    this.f164236e = 3;
                    p005kotlin.jvm.internal.r0 r0Var3 = new p005kotlin.jvm.internal.r0();
                    x53.c cVar8 = o53.s0.f129406a;
                    objE2 = ge1.b.e0(x53.b.f189152a, new yc2.c(r0Var3, bVar6, null), this);
                    if (objE2 != aVar) {
                        bVar2 = bVar;
                        str3 = str;
                        sc2.m mVar8 = mVar;
                        zc2.a aVar5 = (zc2.a) wc2.b.a((wc2.a) objE2);
                        new s0();
                        ve2.e eVar4 = s1Var.f164292e;
                        ve2.k kVar4 = nVar.f158541a;
                        re2.b.c cVar9 = s1Var.f164293f;
                        this.f164232a = str3;
                        this.f164233b = null;
                        this.f164234c = null;
                        this.f164235d = null;
                        this.f164236e = 4;
                        objE3 = ge1.b.e0(o53.s0.f129406a, new q0(aVar5, bVar2, null, mVar8, cVar9, eVar4, kVar4, null), this);
                        if (objE3 == aVar) {
                            dVar = (ve2.d) objE3;
                            this.f164232a = dVar;
                            this.f164236e = 5;
                            if (s1.a(s1Var, str3, this) == aVar) {
                                return dVar;
                            }
                        }
                    }
                }
            }
            return aVar;
        } catch (Throwable th3) {
            s1Var.f164294g.error("forDI2", th3);
            throw th3;
        }
    }
}
