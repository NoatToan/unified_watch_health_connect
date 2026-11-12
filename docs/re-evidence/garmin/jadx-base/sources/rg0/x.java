package rg0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import lc.u0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$declineInviteFromUser$1", f = "AuthorizedViewersViewModel.kt", l = {231, 237, 238, PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f152635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f152637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f152639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f152640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, long j8, l1 l1Var, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f152638d = hVar;
        this.f152639e = j8;
        this.f152640f = l1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f152638d, this.f152639e, this.f152640f, dVar);
        xVar.f152637c = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f A[PHI: r9
      0x006f: PHI (r9v2 long) = (r9v1 long), (r9v1 long), (r9v4 long) binds: [B:22:0x0060, B:24:0x006c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[PHI: r9 r12
      0x007e: PHI (r9v3 long) = (r9v2 long), (r9v5 long) binds: [B:27:0x007b, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:27:0x007b, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.y4(r7, null, r9, r11) == r1) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long inviteId;
        long jLongValue;
        v2 v2Var;
        o53.b0 b0Var = (o53.b0) this.f152637c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152636b;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar = this.f152638d;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f152637c = b0Var;
            this.f152636b = 1;
            obj = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.x4(hVar, this.f152639e, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                jLongValue = this.f152635a;
                o13.r.b(obj);
                re0.h hVar2 = hVar.f35086b;
                this.f152637c = b0Var;
                this.f152635a = jLongValue;
                this.f152636b = 3;
                obj = hVar2.c(jLongValue, this);
                if (obj != aVar) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        this.f152637c = null;
                        this.f152635a = jLongValue;
                        this.f152636b = 4;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        Exception exc = ((v2.a) v2Var).f47383a;
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to decline invite. ");
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "AuthorizedViewersViewModel", strD);
                        hVar.f35101q.k(null, fw.m.a.d(fw.m.f73767e, exc));
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            }
            if (i14 == 3) {
                jLongValue = this.f152635a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f152637c = null;
                    this.f152635a = jLongValue;
                    this.f152636b = 4;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    Exception exc2 = ((v2.a) v2Var).f47383a;
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc2, "Failed to decline invite. ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var2, "AuthorizedViewersViewModel", strD2);
                    hVar.f35101q.k(null, fw.m.a.d(fw.m.f73767e, exc2));
                }
                return Unit.INSTANCE;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        hVar.f35101q.k(null, fw.m.a.g(fw.m.f73767e, null, 3));
        hVar.f35104v.set(true);
        return Unit.INSTANCE;
        ue0.n nVar = (ue0.n) obj;
        if (nVar == null || (inviteId = nVar.getInviteId()) == null) {
            p2 p2Var = hVar.f35101q;
            fw.m.a aVar4 = fw.m.f73767e;
            IllegalStateException illegalStateException = new IllegalStateException("Missing invite ID");
            aVar4.getClass();
            p2Var.k(null, fw.m.a.a(null, illegalStateException));
            return Unit.INSTANCE;
        }
        jLongValue = inviteId.longValue();
        hVar.f35101q.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
        l1 l1Var = this.f152640f;
        if (l1Var != null) {
            this.f152637c = b0Var;
            this.f152635a = jLongValue;
            this.f152636b = 2;
            if (l1Var.P(this) != aVar) {
                re0.h hVar3 = hVar.f35086b;
                this.f152637c = b0Var;
                this.f152635a = jLongValue;
                this.f152636b = 3;
                obj = hVar3.c(jLongValue, this);
                if (obj != aVar) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        this.f152637c = null;
                        this.f152635a = jLongValue;
                        this.f152636b = 4;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        Exception exc3 = ((v2.a) v2Var).f47383a;
                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(exc3, "Failed to decline invite. ");
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var3, "AuthorizedViewersViewModel", strD3);
                        hVar.f35101q.k(null, fw.m.a.d(fw.m.f73767e, exc3));
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            re0.h hVar4 = hVar.f35086b;
            this.f152637c = b0Var;
            this.f152635a = jLongValue;
            this.f152636b = 3;
            obj = hVar4.c(jLongValue, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f152637c = null;
                    this.f152635a = jLongValue;
                    this.f152636b = 4;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    Exception exc4 = ((v2.a) v2Var).f47383a;
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(exc4, "Failed to decline invite. ");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var4, "AuthorizedViewersViewModel", strD4);
                    hVar.f35101q.k(null, fw.m.a.d(fw.m.f73767e, exc4));
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
