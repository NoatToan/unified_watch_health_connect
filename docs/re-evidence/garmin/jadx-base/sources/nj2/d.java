package nj2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$deletePhoneNumber$1", f = "CustomerManagementViewModel.kt", l = {574}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f126305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f126304b = aVar;
        this.f126305c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f126304b, this.f126305c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126303a;
        a aVar2 = this.f126304b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("deletePhoneNumber");
                dj2.a aVar3 = aVar2.f126249a;
                String str = this.f126305c;
                this.f126303a = 1;
                if (aVar3.f(str, this) == aVar) {
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
            int i15 = a.A;
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
