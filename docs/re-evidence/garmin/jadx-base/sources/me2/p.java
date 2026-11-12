package me2;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$4$1$1$1", f = "GoogleMapCompose.kt", l = {147}, m = "invokeSuspend", v = 1)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f118214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cluster<f> f118215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f118216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, Cluster<f> cluster, float f14, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f118214b = eVar;
        this.f118215c = cluster;
        this.f118216d = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f118214b, this.f118215c, this.f118216d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118213a;
        if (i14 == 0) {
            o13.r.b(obj);
            LatLng position = this.f118215c.getPosition();
            position.getClass();
            ke2.b bVarB = ke2.c.b(position);
            Double d14 = new Double(((double) this.f118216d) + ((double) 1.0f));
            this.f118213a = 1;
            if (this.f118214b.k(bVarB, d14, null, this) == aVar) {
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
