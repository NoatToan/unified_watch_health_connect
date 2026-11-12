package me2;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.compose.CameraPositionState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$5$1", f = "GoogleMapCompose.kt", l = {}, m = "invokeSuspend", v = 1)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraPositionState f118221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f118222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f118223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.r<ke2.b, Float, LatLng, LatLng, Unit> f118224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(CameraPositionState cameraPositionState, p1<Boolean> p1Var, e eVar, e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f118221a = cameraPositionState;
        this.f118222b = p1Var;
        this.f118223c = eVar;
        this.f118224d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f118221a, this.f118222b, this.f118223c, this.f118224d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Projection projection;
        VisibleRegion visibleRegion;
        LatLngBounds latLngBounds;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CameraPositionState cameraPositionState = this.f118221a;
        if (!cameraPositionState.isMoving() && this.f118222b.getF182175a().booleanValue() && (projection = cameraPositionState.getProjection()) != null && (visibleRegion = projection.getVisibleRegion()) != null && (latLngBounds = visibleRegion.latLngBounds) != null) {
            e eVar = this.f118223c;
            je2.a aVar2 = eVar.f98597a;
            LatLng latLng = cameraPositionState.getPosition().target;
            latLng.getClass();
            eVar.i(new je2.a(latLng, cameraPositionState.getPosition().zoom, aVar2.f98595c, aVar2.f98596d));
            e23.r<ke2.b, Float, LatLng, LatLng, Unit> rVar = this.f118224d;
            if (rVar != null) {
                LatLng latLng2 = cameraPositionState.getPosition().target;
                latLng2.getClass();
                ke2.b bVarB = ke2.c.b(latLng2);
                Float f14 = new Float(cameraPositionState.getPosition().zoom);
                LatLng latLng3 = latLngBounds.northeast;
                latLng3.getClass();
                LatLng latLng4 = latLngBounds.southwest;
                latLng4.getClass();
                rVar.invoke(bVarB, f14, latLng3, latLng4);
            }
        }
        return Unit.INSTANCE;
    }
}
