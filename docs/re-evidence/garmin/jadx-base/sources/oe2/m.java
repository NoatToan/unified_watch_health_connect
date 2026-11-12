package oe2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import o72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$1$1$1$1", f = "MapboxMapCompose.kt", l = {179}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f131527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f131528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f131529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Point point, double d14, p1<Boolean> p1Var, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f131527b = eVar;
        this.f131528c = point;
        this.f131529d = d14;
        this.f131530e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f131527b, this.f131528c, this.f131529d, this.f131530e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131526a;
        if (i14 == 0) {
            o13.r.b(obj);
            p1<Boolean> p1Var = this.f131530e;
            f0.d(p1Var, true);
            ke2.b bVarF = ne2.p.f(this.f131528c);
            Double d14 = new Double(this.f131529d + ((double) 1.0f));
            i3 i3Var = new i3(p1Var, 6);
            this.f131526a = 1;
            e eVar = this.f131527b;
            MapViewportState mapViewportState = (MapViewportState) eVar.f98598b;
            if (mapViewportState != null) {
                CameraOptions.Builder builder = new CameraOptions.Builder();
                builder.center(ne2.p.i(bVarF));
                builder.zoom(d14);
                CameraOptions cameraOptionsBuild = builder.build();
                MapAnimationOptions mapAnimationOptionsBuild = new MapAnimationOptions.Builder().duration(500L).build();
                cameraOptionsBuild.getClass();
                mapViewportState.easeTo(cameraOptionsBuild, mapAnimationOptionsBuild, new c(eVar, i3Var, 0));
            }
            if (Unit.INSTANCE == aVar) {
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
