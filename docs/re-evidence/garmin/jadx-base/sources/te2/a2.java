package te2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$isMFAGloballyEnabled$2", f = "MFAManager.kt", l = {300}, m = "invokeSuspend")
public final class a2 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f163960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dd2.a f163961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f163962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve2.d f163963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ve2.l f163964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(e2 e2Var, dd2.a aVar, Context context, ve2.d dVar, ve2.l lVar, t13.d<? super a2> dVar2) {
        super(2, dVar2);
        this.f163960b = e2Var;
        this.f163961c = aVar;
        this.f163962d = context;
        this.f163963e = dVar;
        this.f163964f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a2(this.f163960b, this.f163961c, this.f163962d, this.f163963e, this.f163964f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((a2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163959a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                dd2.a aVar2 = this.f163961c;
                Context context = this.f163962d;
                ve2.d dVar = this.f163963e;
                ve2.l lVar = this.f163964f;
                this.f163959a = 1;
                obj = e2.b(aVar2, context, dVar, lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        } catch (Exception e4) {
            e2.a(this.f163960b).error("isMFAGloballyEnabled", (Throwable) e4);
            throw e4;
        }
    }
}
