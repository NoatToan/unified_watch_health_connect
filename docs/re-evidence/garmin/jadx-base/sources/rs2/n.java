package rs2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lus2/f;", "<anonymous>", "(Lo53/b0;)Lus2/f;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.GfdiDevice$Companion$startCommunication$deviceInfo$1", f = "GfdiDevice.kt", l = {277}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super us2.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.r<us2.f> f154439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o53.r<us2.f> rVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f154439b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f154439b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super us2.f> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154438a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f154438a = 1;
            Object objAwait = this.f154439b.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
