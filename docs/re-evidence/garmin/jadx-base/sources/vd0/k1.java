package vd0;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogPageKt$EditDogPageContent$5$1", f = "EditDogPage.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f177319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f177320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f177321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, String str, p3.p1<Boolean> p1Var, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f177319b = context;
        this.f177320c = str;
        this.f177321d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k1(this.f177319b, this.f177320c, this.f177321d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177318a;
        if (i14 == 0) {
            o13.r.b(obj);
            Context context = this.f177319b;
            hf.j jVarA = hf.v.a(context);
            wf.f.a aVar2 = new wf.f.a(context);
            aVar2.f184930c = this.f177320c;
            aVar2.c(xf.g.f190618c);
            wf.f fVarA = aVar2.a();
            this.f177318a = 1;
            if (jVarA.a(fVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f177321d.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
