package me2;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$8$1", f = "GoogleMapCompose.kt", l = {226}, m = "invokeSuspend", v = 1)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f118231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f118232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<i53.c<le2.d>> f118233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z14, e eVar, p1<i53.c<le2.d>> p1Var, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f118231b = z14;
        this.f118232c = eVar;
        this.f118233d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f118231b, this.f118232c, this.f118233d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        LatLngBounds latLngBounds;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118230a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f118231b) {
                p1<i53.c<le2.d>> p1Var = this.f118233d;
                if (!p1Var.getF182175a().isEmpty()) {
                    LatLngBounds.Builder builder = LatLngBounds.builder();
                    builder.getClass();
                    Iterator<le2.d> it = p1Var.getF182175a().iterator();
                    while (it.hasNext()) {
                        Iterator<ke2.b> it3 = it.next().f112063b.iterator();
                        while (it3.hasNext()) {
                            builder.include(ke2.c.c(it3.next()));
                        }
                    }
                    LatLngBounds latLngBoundsBuild = builder.build();
                    latLngBoundsBuild.getClass();
                    double dAbs = Math.abs(latLngBoundsBuild.northeast.latitude - latLngBoundsBuild.southwest.latitude);
                    double dAbs2 = Math.abs(latLngBoundsBuild.northeast.longitude - latLngBoundsBuild.southwest.longitude);
                    double d14 = dAbs / dAbs2;
                    LatLng latLng = latLngBoundsBuild.southwest;
                    if (d14 < 0.6d) {
                        double d15 = latLng.longitude;
                        LatLng latLng2 = latLngBoundsBuild.northeast;
                        latLngBounds = new LatLngBounds(new LatLng((latLng.latitude - dAbs2) - dAbs, d15), new LatLng((dAbs2 / ((double) 3)) + latLng2.latitude, latLng2.longitude));
                    } else {
                        double d16 = 0.75d * dAbs;
                        double d17 = dAbs2 * 0.5d;
                        double d18 = (latLng.longitude - d16) - d17;
                        LatLng latLng3 = latLngBoundsBuild.northeast;
                        double d19 = latLng3.longitude + d16 + d17;
                        latLngBounds = new LatLngBounds(new LatLng(latLng.latitude - (((double) 2) * dAbs), d18), new LatLng((0.2d * dAbs) + latLng3.latitude, d19));
                    }
                    LatLng latLng4 = latLngBounds.northeast;
                    latLng4.getClass();
                    ke2.b bVarB = ke2.c.b(latLng4);
                    LatLng latLng5 = latLngBounds.southwest;
                    latLng5.getClass();
                    List<ke2.b> listK = p13.x.k(bVarB, ke2.c.b(latLng5));
                    this.f118230a = 1;
                    if (this.f118232c.c(listK, null, this) == aVar) {
                        return aVar;
                    }
                }
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
