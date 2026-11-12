package x01;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionStateProvider$onLogout$1", f = "NutritionStateProvider.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f188264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f188265b;

    public g(t13.d<? super g> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return new g(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z53.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188265b;
        if (i14 == 0) {
            r.b(obj);
            bVar = i.f188281d;
            this.f188264a = bVar;
            this.f188265b = 1;
            if (bVar.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = this.f188264a;
            r.b(obj);
            bVar = bVar2;
        }
        try {
            i.f188279b.k(null, new e(null, null, null, null, false, false, false, 127, null));
            ((e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null)).l();
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
