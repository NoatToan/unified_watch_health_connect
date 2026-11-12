package r91;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$refreshPRHistory$1$1", f = "PRHistoryUseCase.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f151423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q91.d f151424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.f f151425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, e23.a<Unit> aVar, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f151423b = kVar;
        this.f151424c = dVar;
        this.f151425d = fVar;
        this.f151426e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f151423b, this.f151424c, this.f151425d, this.f151426e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151422a;
        if (i14 == 0) {
            r.b(obj);
            this.f151422a = 1;
            if (this.f151423b.a(this.f151424c, this.f151425d, this.f151426e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
