package re2;

import android.content.Context;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.mobileauth.exception.IllegalAccountStateException;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.e2;
import te2.v1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/i;", "<anonymous>", "(Lo53/b0;)Lve2/i;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getMFALoginInfo$2", f = "AuthenticationHelper.kt", l = {1868, 1869, 1870}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ve2.d f152273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152274b;

    public d(t13.d<? super d> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.i> dVar) {
        return new d(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r13 == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ve2.d dVar;
        ve2.d dVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152274b;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = b.f152215a;
            b.c cVar = b.c.DEFAULT;
            bVar.getClass();
            b.K("getMFALoginInfo", cVar, null);
            b.f152216b.debug("getMFALoginInfo");
            l0 l0Var = l0.f152316a;
            Context contextB = bVar.b();
            l0Var.getClass();
            if (!l0.e(contextB)) {
                throw new NoNetworkException();
            }
            this.f152274b = 1;
            obj = b.j(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            dVar = this.f152273a;
            o13.r.b(obj);
            dVar2 = dVar;
            if (((sc2.o) obj) != null) {
                return null;
            }
            e2 e2Var = new e2();
            Context contextB2 = b.f152215a.b();
            ve2.l lVarM = b.m();
            this.f152273a = null;
            this.f152274b = 3;
            x53.c cVar2 = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new v1(dVar2, contextB2, lVarM, e2Var, null), this);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return (ve2.i) obj;
        dVar = (ve2.d) obj;
        if (dVar == null) {
            throw new IllegalAccountStateException(b.a.SIGNED_OUT);
        }
        b bVar2 = b.f152215a;
        this.f152273a = dVar;
        this.f152274b = 2;
        obj = b.p(bVar2, this);
        if (obj != aVar) {
            dVar2 = dVar;
            if (((sc2.o) obj) != null) {
                return null;
            }
            e2 e2Var2 = new e2();
            Context contextB3 = b.f152215a.b();
            ve2.l lVarM2 = b.m();
            this.f152273a = null;
            this.f152274b = 3;
            x53.c cVar3 = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new v1(dVar2, contextB3, lVarM2, e2Var2, null), this);
        }
        return aVar;
    }
}
