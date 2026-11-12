package ba1;

import b63.o;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$fetchBestEffortsForTimeLine$1", f = "PersonalRecordsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f17022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f17023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q91.d f17024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, o oVar, o oVar2, q91.d dVar2, t13.d<? super e> dVar3) {
        super(2, dVar3);
        this.f17021a = dVar;
        this.f17022b = oVar;
        this.f17023c = oVar2;
        this.f17024d = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f17021a, this.f17022b, this.f17023c, this.f17024d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        r91.c cVar = this.f17021a.f16994v;
        cVar.getClass();
        o oVar = this.f17022b;
        oVar.getClass();
        o oVar2 = this.f17023c;
        oVar2.getClass();
        q91.d dVar = this.f17024d;
        dVar.getClass();
        b0 b0Var = cVar.f151372c;
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new r91.e(cVar, oVar, oVar2, dVar, null), 2);
        return Unit.INSTANCE;
    }
}
