package te2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$deleteMFAToken$2", f = "MFAManager.kt", l = {199}, m = "invokeSuspend")
public final class u1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f164332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ve2.d f164333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve2.l f164334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f164335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context, ve2.d dVar, ve2.l lVar, e2 e2Var, t13.d<? super u1> dVar2) {
        super(2, dVar2);
        this.f164332b = context;
        this.f164333c = dVar;
        this.f164334d = lVar;
        this.f164335e = e2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u1(this.f164332b, this.f164333c, this.f164334d, this.f164335e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164331a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Context context = this.f164332b;
                ve2.d dVar = this.f164333c;
                ve2.e eVar = dVar.f177690a;
                String str = dVar.f177691b;
                ve2.k kVar = dVar.f177697h;
                kVar.getClass();
                String str2 = kVar.f177753a;
                str2.getClass();
                rc2.u uVar = new rc2.u(context, eVar, str, str2, this.f164334d.d());
                this.f164331a = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rc2.t(uVar, null), this);
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
            wc2.b.a((wc2.a) obj);
        } catch (Exception e4) {
            e2.a(this.f164335e).error("deleteMFAToken", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
