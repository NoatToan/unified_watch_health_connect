package nj2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfj2/a;", "<anonymous>", "(Lo53/b0;)Lfj2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$addAddressWithPhoneNumber$1", f = "CustomerManagementViewModel.kt", l = {527}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super fj2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f126295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gj2.a f126296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gj2.d f126297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, gj2.a aVar2, gj2.d dVar, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f126295b = aVar;
        this.f126296c = aVar2;
        this.f126297d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f126295b, this.f126296c, this.f126297d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super fj2.a> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126294a;
        a aVar2 = this.f126295b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                dj2.a aVar3 = aVar2.f126249a;
                gj2.a aVar4 = this.f126296c;
                gj2.d dVar = this.f126297d;
                this.f126294a = 1;
                obj = aVar3.c(aVar4, dVar, this);
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
            fj2.a aVar5 = (fj2.a) obj;
            aVar2.f126252d.setValue(Boolean.FALSE);
            return aVar5;
        } catch (Exception e4) {
            aVar2.f126252d.setValue(Boolean.FALSE);
            aVar2.I4(e4);
            return null;
        }
    }
}
