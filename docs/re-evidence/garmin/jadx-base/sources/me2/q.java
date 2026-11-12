package me2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$4$2$1$1", f = "GoogleMapCompose.kt", l = {157}, m = "invokeSuspend", v = 1)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f118218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f118219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f118220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e eVar, f fVar, float f14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f118218b = eVar;
        this.f118219c = fVar;
        this.f118220d = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f118218b, this.f118219c, this.f118220d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118217a;
        if (i14 == 0) {
            o13.r.b(obj);
            ke2.b bVarB = ke2.c.b(z.d(this.f118219c.getPosition()));
            Double d14 = new Double(((double) this.f118220d) + ((double) 1.0f));
            this.f118217a = 1;
            if (this.f118218b.k(bVarB, d14, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
