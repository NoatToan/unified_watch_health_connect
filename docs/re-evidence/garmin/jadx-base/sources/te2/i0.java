package te2;

import android.content.Context;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.CreateSysAcctHandler$execute$2", f = "CreateSysAcctHandler.kt", l = {43, 44, 58}, m = "invokeSuspend")
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.h f164083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve2.l f164084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f164085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f164087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f164087f = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f164087f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:13:0x0021, B:30:0x008d, B:32:0x0097, B:34:0x009c, B:33:0x009a, B:18:0x0032, B:27:0x006c, B:23:0x0049), top: B:45:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:13:0x0021, B:30:0x008d, B:32:0x0097, B:34:0x009c, B:33:0x009a, B:18:0x0032, B:27:0x006c, B:23:0x0049), top: B:45:0x0009 }] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r14.c(r13) == r0) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Context context;
        sc2.h hVar;
        boolean z14;
        ve2.l lVar;
        re2.b.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164086e;
        j0 j0Var = this.f164087f;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    j2 j2Var = j2.f164115a;
                    Context context2 = j0Var.f164108a;
                    j2Var.getClass();
                    if (j2.k(context2) != null) {
                        ((Logger) j0Var.f164111d.getValue()).error("system account already exists");
                        r1.q2.u("system account already exists");
                        return null;
                    }
                    context = j0Var.f164108a;
                    hVar = j0Var.f164109b;
                    z14 = j0Var.f164110c;
                    re2.b.f152215a.getClass();
                    ve2.l lVarM = re2.b.m();
                    this.f164082a = context;
                    this.f164083b = hVar;
                    this.f164084c = lVarM;
                    this.f164085d = z14;
                    this.f164086e = 1;
                    Object objQ = re2.b.q(this);
                    if (objQ != aVar) {
                        lVar = lVarM;
                        obj = objQ;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    z14 = this.f164085d;
                    ve2.l lVar2 = this.f164084c;
                    hVar = this.f164083b;
                    context = this.f164082a;
                    o13.r.b(obj);
                    lVar = lVar2;
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    ve2.d dVar2 = (ve2.d) obj;
                    j2 j2Var2 = j2.f164115a;
                    Context context3 = j0Var.f164108a;
                    if (j0Var.f164110c) {
                        dVar = re2.b.d.IT_WEB_CREATE_ACCT;
                    } else {
                        dVar = re2.b.d.IT_WEB_SIGN_IN;
                    }
                    j2Var2.getClass();
                    j2.i(context3, dVar2, dVar);
                    k0 k0Var = new k0();
                    this.f164086e = 3;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                ((Logger) j0Var.f164111d.getValue()).debug("success");
                return Unit.INSTANCE;
                s1 s1Var = new s1(context, hVar, z14, lVar, (ve2.e) obj, re2.b.c.DEFAULT);
                this.f164082a = null;
                this.f164083b = null;
                this.f164084c = null;
                this.f164086e = 2;
                obj = ge1.b.e0(o53.s0.f129406a, new o1(s1Var, null), this);
                if (obj != aVar) {
                    ve2.d dVar3 = (ve2.d) obj;
                    j2 j2Var3 = j2.f164115a;
                    Context context4 = j0Var.f164108a;
                    if (j0Var.f164110c) {
                        dVar = re2.b.d.IT_WEB_CREATE_ACCT;
                    } else {
                        dVar = re2.b.d.IT_WEB_SIGN_IN;
                    }
                    j2Var3.getClass();
                    j2.i(context4, dVar3, dVar);
                    k0 k0Var2 = new k0();
                    this.f164086e = 3;
                }
                return aVar;
            } catch (Throwable th3) {
                ((Logger) j0Var.f164111d.getValue()).error("", th3);
                throw th3;
            }
        } catch (Exception e4) {
            ((Logger) j0Var.f164111d.getValue()).warn("fetchAgeStatus", (Throwable) e4);
        }
    }
}
