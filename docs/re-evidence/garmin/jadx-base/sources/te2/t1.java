package te2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$clearSystemAccountMFAData$2", f = "MFAManager.kt", l = {213}, m = "invokeSuspend")
public final class t1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f164305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f164307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(e2 e2Var, String str, Context context, t13.d<? super t1> dVar) {
        super(2, dVar);
        this.f164305b = e2Var;
        this.f164306c = str;
        this.f164307d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t1(this.f164305b, this.f164306c, this.f164307d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164304a;
        String str = this.f164306c;
        e2 e2Var = this.f164305b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                e2.a(e2Var).debug("clearSystemAccountMFAData: callerName=" + str);
                j2 j2Var = j2.f164115a;
                Context context = this.f164307d;
                this.f164304a = 1;
                if (j2Var.z(context, null, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            e2.a(e2Var).error("clearSystemAccountMFAData: callerName=" + str + "\"", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
