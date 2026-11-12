package re2;

import android.content.Context;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r1.q2;
import te2.g2;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$refreshUserProfileByDIEndpoint$2", f = "AuthenticationHelper.kt", l = {2054, 2060, 2065, 2071, 2072}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f152334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i14, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f152334c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f152334c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r1.v(r2, r12, r11) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        wc2.a aVar;
        Integer num;
        int i14;
        Object objE0;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f152333b;
        int i16 = this.f152334c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (i16 > 2) {
                q2.u("refreshUserProfileByDIEndpoint: exceeded max attempts");
                return null;
            }
            b bVar = b.f152215a;
            this.f152333b = 1;
            obj = b.o(bVar, this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(obj);
                    g2.f164047a.getClass();
                    ve2.d dVarA = g2.a();
                    dVarA.getClass();
                    return dVarA;
                }
                if (i15 != 4) {
                    if (i15 == 5) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.f152332a;
                o13.r.b(obj);
                b bVar2 = b.f152215a;
                this.f152333b = 5;
                bVar2.getClass();
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new t(i14 + 1, null), this);
                if (objE0 != aVar2) {
                    return aVar2;
                }
                return objE0;
            }
            i16 = this.f152332a;
            o13.r.b(obj);
            aVar = (wc2.a) obj;
            if (!(aVar instanceof wc2.a.b)) {
                zc2.a aVar3 = (zc2.a) ((wc2.a.b) aVar).f184316a;
                j2 j2Var = j2.f164115a;
                Context contextB = b.f152215a.b();
                this.f152333b = 3;
            } else {
                if (aVar instanceof wc2.a.C3415a) {
                    u0.r();
                    return null;
                }
                wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar;
                num = c3415a.f184313b;
                if (num != null || 401 != num.intValue()) {
                    throw c3415a.f184312a;
                }
                b bVar3 = b.f152215a;
                this.f152332a = i16;
                this.f152333b = 4;
                if (b.z(bVar3, this) != aVar2) {
                    i14 = i16;
                    b bVar4 = b.f152215a;
                    this.f152333b = 5;
                    bVar4.getClass();
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new t(i14 + 1, null), this);
                    if (objE0 != aVar2) {
                        return objE0;
                    }
                }
            }
            return aVar2;
        }
        o13.r.b(obj);
        sc2.m mVar = (sc2.m) obj;
        if (mVar == null) {
            q2.u("refreshUserProfileByDIEndpoint: getOAuth2DICredentials returned null");
            return null;
        }
        b.f152216b.debug("refreshUserProfileByDIEndpoint");
        Context contextB2 = b.f152215a.b();
        g2.f164047a.getClass();
        ve2.d dVarA2 = g2.a();
        dVarA2.getClass();
        yc2.b bVar5 = new yc2.b(contextB2, dVarA2.f177690a, mVar.f158528b);
        this.f152332a = i16;
        this.f152333b = 2;
        r0 r0Var = new r0();
        x53.c cVar3 = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new yc2.c(r0Var, bVar5, null), this);
        if (obj != aVar2) {
            aVar = (wc2.a) obj;
            if (!(aVar instanceof wc2.a.b)) {
                if (aVar instanceof wc2.a.C3415a) {
                    u0.r();
                    return null;
                }
                wc2.a.C3415a c3415a2 = (wc2.a.C3415a) aVar;
                num = c3415a2.f184313b;
                if (num != null) {
                }
                throw c3415a2.f184312a;
            }
            zc2.a aVar4 = (zc2.a) ((wc2.a.b) aVar).f184316a;
            j2 j2Var2 = j2.f164115a;
            Context contextB3 = b.f152215a.b();
            this.f152333b = 3;
        }
        return aVar2;
    }
}
