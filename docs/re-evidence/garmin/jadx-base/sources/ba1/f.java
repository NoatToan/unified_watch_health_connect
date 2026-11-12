package ba1;

import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$fetchBestEffortsScreenState$1", f = "PersonalRecordsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q91.d f17026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f17027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, q91.d dVar2, e23.a<Unit> aVar, t13.d<? super f> dVar3) {
        super(2, dVar3);
        this.f17025a = dVar;
        this.f17026b = dVar2;
        this.f17027c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f17025a, this.f17026b, this.f17027c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        d dVar = this.f17025a;
        r91.c cVar = dVar.f16994v;
        cVar.getClass();
        q91.d dVar2 = this.f17026b;
        dVar2.getClass();
        e23.a<Unit> aVar2 = this.f17027c;
        aVar2.getClass();
        b0 b0Var = cVar.f151372c;
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new r91.d(cVar, dVar2, null, aVar2, null), 2);
        dVar.L4();
        return Unit.INSTANCE;
    }
}
