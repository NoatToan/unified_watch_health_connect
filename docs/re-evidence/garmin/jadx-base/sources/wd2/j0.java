package wd2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwd2/c;", "<anonymous>", "(Lo53/b0;)Lwd2/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$createRepository$deviceInfoSource$1$getCurrentPhoneLocation$2", f = "LivetrackService.kt", l = {550}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f184511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(a aVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f184511b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f184511b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super c> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184510a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184510a = 1;
            Object objB = this.f184511b.b(this);
            return objB == aVar ? aVar : objB;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
