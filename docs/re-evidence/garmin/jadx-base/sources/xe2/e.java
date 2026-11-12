package xe2;

import android.content.Context;
import com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.q1;
import te2.s1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity$fetchCustomerGUID$1", f = "AuthenticateAndFetchCustomerGUIDActivity.kt", l = {232, 239}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f190461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthenticateAndFetchCustomerGUIDActivity f190462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f190463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h f190464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity, Context context, sc2.h hVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f190462c = authenticateAndFetchCustomerGUIDActivity;
        this.f190463d = context;
        this.f190464e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f190462c, this.f190463d, this.f190464e, dVar);
        eVar.f190461b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:24:0x0089, B:26:0x0091, B:14:0x0027, B:20:0x004c, B:17:0x003c), top: B:31:0x000b }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        Object objQ;
        Object objE0;
        o53.b0 b0Var2;
        ve2.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190460a;
        AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity = this.f190462c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b0Var = (o53.b0) this.f190461b;
                int i15 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.X9().debug("fetchCustomerGUID");
                re2.b bVar = re2.b.f152215a;
                this.f190461b = b0Var;
                this.f190460a = 1;
                bVar.getClass();
                objQ = re2.b.q(this);
                if (objQ == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                b0Var = (o53.b0) this.f190461b;
                o13.r.b(obj);
                objQ = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var2 = (o53.b0) this.f190461b;
                o13.r.b(obj);
                objE0 = obj;
            }
            dVar = (ve2.d) objE0;
            if (o53.c0.g(b0Var2)) {
                String str = dVar.f177691b;
                int i16 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.X9().debug("finishWithResultOK");
                authenticateAndFetchCustomerGUIDActivity.Q9().post(new vg1.d(16, authenticateAndFetchCustomerGUIDActivity, str));
            }
            return Unit.INSTANCE;
            ve2.e eVar = (ve2.e) objQ;
            s1 s1Var = new s1(this.f190463d, this.f190464e, false, authenticateAndFetchCustomerGUIDActivity.R9(), eVar, re2.b.c.DEFAULT);
            sc2.l lVarC = authenticateAndFetchCustomerGUIDActivity.R9().c(eVar);
            lVarC.getClass();
            String str2 = lVarC.f158524a;
            String strD = authenticateAndFetchCustomerGUIDActivity.R9().d();
            this.f190461b = b0Var;
            this.f190460a = 2;
            x53.c cVar = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new q1(s1Var, str2, strD, null), this);
            if (objE0 != aVar) {
                b0Var2 = b0Var;
                dVar = (ve2.d) objE0;
                if (o53.c0.g(b0Var2)) {
                    String str3 = dVar.f177691b;
                    int i17 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                    authenticateAndFetchCustomerGUIDActivity.X9().debug("finishWithResultOK");
                    authenticateAndFetchCustomerGUIDActivity.Q9().post(new vg1.d(16, authenticateAndFetchCustomerGUIDActivity, str3));
                }
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Throwable th3) {
            int i18 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
            authenticateAndFetchCustomerGUIDActivity.X9().error("fetchCustomerGUID", th3);
            authenticateAndFetchCustomerGUIDActivity.W9();
        }
    }
}
