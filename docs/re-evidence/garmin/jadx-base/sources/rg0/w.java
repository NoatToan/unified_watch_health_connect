package rg0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import lc.u0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$acceptInviteFromUser$1", f = "AuthorizedViewersViewModel.kt", l = {198, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 210, 213}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ue0.n f152628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f152629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f152631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f152633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1 f152634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, long j8, l1 l1Var, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f152632e = hVar;
        this.f152633f = j8;
        this.f152634g = l1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f152632e, this.f152633f, this.f152634g, dVar);
        wVar.f152631d = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[PHI: r2 r10
      0x0083: PHI (r2v4 ue0.n) = (r2v2 ue0.n), (r2v2 ue0.n), (r2v9 ue0.n) binds: [B:24:0x0072, B:26:0x0080, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r10v2 long) = (r10v1 long), (r10v1 long), (r10v6 long) binds: [B:24:0x0072, B:26:0x0080, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[PHI: r0 r10
      0x00b6: PHI (r0v8 ue0.n) = (r0v5 ue0.n), (r0v9 ue0.n) binds: [B:35:0x00a1, B:40:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r10v4 long) = (r10v3 long), (r10v5 long) binds: [B:35:0x00a1, B:40:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        if (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.y4(r8, r14, r10, r13) == r1) goto L43;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ue0.n nVar;
        Long inviteId;
        long jLongValue;
        ue0.n nVar2;
        v2 v2Var;
        te0.d dVar;
        long j8;
        o53.b0 b0Var = (o53.b0) this.f152631d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152630c;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar = this.f152632e;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f152631d = b0Var;
            this.f152630c = 1;
            obj = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.x4(hVar, this.f152633f, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                jLongValue = this.f152629b;
                nVar = this.f152628a;
                o13.r.b(obj);
                re0.h hVar2 = hVar.f35086b;
                this.f152631d = b0Var;
                this.f152628a = nVar;
                this.f152629b = jLongValue;
                this.f152630c = 3;
                obj = hVar2.b(jLongValue, this);
                if (obj != aVar) {
                    nVar2 = nVar;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        if (hVar.f35089e.X3()) {
                            ue0.n nVarA = ue0.n.a(nVar2);
                            this.f152631d = null;
                            this.f152628a = null;
                            this.f152629b = jLongValue;
                            this.f152630c = 5;
                        } else {
                            dVar = hVar.f35090f;
                            this.f152631d = null;
                            this.f152628a = nVar2;
                            this.f152629b = jLongValue;
                            this.f152630c = 4;
                            if (dVar.a(this) != aVar) {
                                j8 = jLongValue;
                                jLongValue = j8;
                                ue0.n nVarA2 = ue0.n.a(nVar2);
                                this.f152631d = null;
                                this.f152628a = null;
                                this.f152629b = jLongValue;
                                this.f152630c = 5;
                            }
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar2 = (v2.a) v2Var;
                        Exception exc = aVar2.f47383a;
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to accept invite. ");
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "AuthorizedViewersViewModel", strD);
                        p2 p2Var = hVar.f35099o;
                        fw.m.a aVar4 = fw.m.f73767e;
                        Integer num = aVar2.f47384b;
                        aVar4.getClass();
                        p2Var.k(null, fw.m.a.a(num, exc));
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            }
            if (i14 == 3) {
                jLongValue = this.f152629b;
                nVar2 = this.f152628a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (hVar.f35089e.X3()) {
                        dVar = hVar.f35090f;
                        this.f152631d = null;
                        this.f152628a = nVar2;
                        this.f152629b = jLongValue;
                        this.f152630c = 4;
                        if (dVar.a(this) != aVar) {
                            j8 = jLongValue;
                            jLongValue = j8;
                            ue0.n nVarA3 = ue0.n.a(nVar2);
                            this.f152631d = null;
                            this.f152628a = null;
                            this.f152629b = jLongValue;
                            this.f152630c = 5;
                        }
                    } else {
                        ue0.n nVarA4 = ue0.n.a(nVar2);
                        this.f152631d = null;
                        this.f152628a = null;
                        this.f152629b = jLongValue;
                        this.f152630c = 5;
                    }
                    return aVar;
                }
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar5 = (v2.a) v2Var;
                Exception exc2 = aVar5.f47383a;
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc2, "Failed to accept invite. ");
                i2.a aVar6 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var2, "AuthorizedViewersViewModel", strD2);
                p2 p2Var2 = hVar.f35099o;
                fw.m.a aVar7 = fw.m.f73767e;
                Integer num2 = aVar5.f47384b;
                aVar7.getClass();
                p2Var2.k(null, fw.m.a.a(num2, exc2));
                return Unit.INSTANCE;
            }
            if (i14 == 4) {
                j8 = this.f152629b;
                nVar2 = this.f152628a;
                o13.r.b(obj);
                jLongValue = j8;
                ue0.n nVarA5 = ue0.n.a(nVar2);
                this.f152631d = null;
                this.f152628a = null;
                this.f152629b = jLongValue;
                this.f152630c = 5;
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        hVar.f35099o.k(null, fw.m.a.g(fw.m.f73767e, null, 3));
        hVar.f35104v.set(true);
        return Unit.INSTANCE;
        nVar = (ue0.n) obj;
        if (nVar == null || (inviteId = nVar.getInviteId()) == null) {
            p2 p2Var3 = hVar.f35099o;
            fw.m.a aVar8 = fw.m.f73767e;
            IllegalStateException illegalStateException = new IllegalStateException("Missing invite ID");
            aVar8.getClass();
            p2Var3.k(null, fw.m.a.a(null, illegalStateException));
            return Unit.INSTANCE;
        }
        jLongValue = inviteId.longValue();
        hVar.f35099o.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
        l1 l1Var = this.f152634g;
        if (l1Var != null) {
            this.f152631d = b0Var;
            this.f152628a = nVar;
            this.f152629b = jLongValue;
            this.f152630c = 2;
            if (l1Var.P(this) != aVar) {
                re0.h hVar3 = hVar.f35086b;
                this.f152631d = b0Var;
                this.f152628a = nVar;
                this.f152629b = jLongValue;
                this.f152630c = 3;
                obj = hVar3.b(jLongValue, this);
                if (obj != aVar) {
                    nVar2 = nVar;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        if (hVar.f35089e.X3()) {
                            dVar = hVar.f35090f;
                            this.f152631d = null;
                            this.f152628a = nVar2;
                            this.f152629b = jLongValue;
                            this.f152630c = 4;
                            if (dVar.a(this) != aVar) {
                                j8 = jLongValue;
                                jLongValue = j8;
                                ue0.n nVarA6 = ue0.n.a(nVar2);
                                this.f152631d = null;
                                this.f152628a = null;
                                this.f152629b = jLongValue;
                                this.f152630c = 5;
                            }
                        } else {
                            ue0.n nVarA7 = ue0.n.a(nVar2);
                            this.f152631d = null;
                            this.f152628a = null;
                            this.f152629b = jLongValue;
                            this.f152630c = 5;
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar9 = (v2.a) v2Var;
                        Exception exc3 = aVar9.f47383a;
                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(exc3, "Failed to accept invite. ");
                        i2.a aVar10 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar10.getClass();
                        i2.a.f(a2Var3, "AuthorizedViewersViewModel", strD3);
                        p2 p2Var4 = hVar.f35099o;
                        fw.m.a aVar11 = fw.m.f73767e;
                        Integer num3 = aVar9.f47384b;
                        aVar11.getClass();
                        p2Var4.k(null, fw.m.a.a(num3, exc3));
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            re0.h hVar4 = hVar.f35086b;
            this.f152631d = b0Var;
            this.f152628a = nVar;
            this.f152629b = jLongValue;
            this.f152630c = 3;
            obj = hVar4.b(jLongValue, this);
            if (obj != aVar) {
                nVar2 = nVar;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (hVar.f35089e.X3()) {
                        dVar = hVar.f35090f;
                        this.f152631d = null;
                        this.f152628a = nVar2;
                        this.f152629b = jLongValue;
                        this.f152630c = 4;
                        if (dVar.a(this) != aVar) {
                            j8 = jLongValue;
                            jLongValue = j8;
                            ue0.n nVarA8 = ue0.n.a(nVar2);
                            this.f152631d = null;
                            this.f152628a = null;
                            this.f152629b = jLongValue;
                            this.f152630c = 5;
                        }
                    } else {
                        ue0.n nVarA9 = ue0.n.a(nVar2);
                        this.f152631d = null;
                        this.f152628a = null;
                        this.f152629b = jLongValue;
                        this.f152630c = 5;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar12 = (v2.a) v2Var;
                    Exception exc4 = aVar12.f47383a;
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(exc4, "Failed to accept invite. ");
                    i2.a aVar13 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar13.getClass();
                    i2.a.f(a2Var4, "AuthorizedViewersViewModel", strD4);
                    p2 p2Var5 = hVar.f35099o;
                    fw.m.a aVar14 = fw.m.f73767e;
                    Integer num4 = aVar12.f47384b;
                    aVar14.getClass();
                    p2Var5.k(null, fw.m.a.a(num4, exc4));
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
