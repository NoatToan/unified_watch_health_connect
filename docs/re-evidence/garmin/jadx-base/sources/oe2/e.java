package oe2;

import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import java.util.List;
import o72.i3;
import o72.o3;
import o72.z0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Loe2/e;", "Lje2/b;", "Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "Lje2/a;", "cameraSettings", "<init>", "(Lje2/a;)V", "a", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends je2.b<MapViewportState> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f131472d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d4.l f131473e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f131474c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxCameraStateAdapter", f = "MapboxCameraStateAdapter.kt", l = {66}, m = "animateBoundedMap", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i3 f131475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MapViewportState f131476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f131477c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f131479e;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f131477c = obj;
            this.f131479e |= Integer.MIN_VALUE;
            return e.this.c(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxCameraStateAdapter", f = "MapboxCameraStateAdapter.kt", l = {50}, m = "moveBoundedMap", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MapViewportState f131480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f131481b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f131483d;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f131481b = obj;
            this.f131483d |= Integer.MIN_VALUE;
            return e.this.f(null, this);
        }
    }

    static {
        o3 o3Var = new o3(11);
        z0 z0Var = new z0(24);
        d4.l lVar = d4.m.f57455a;
        f131473e = new d4.l(o3Var, z0Var);
    }

    public /* synthetic */ e(je2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null) : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object c(List<ke2.b> list, e23.l<? super Boolean, Unit> lVar, t13.d<? super Unit> dVar) {
        b bVar;
        MapViewportState mapViewportState;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f131479e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f131479e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f131477c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f131479e;
        if (i15 == 0) {
            o13.r.b(obj);
            MapViewportState mapViewportState2 = (MapViewportState) this.f98598b;
            if (mapViewportState2 != null) {
                bVar.f131475a = (i3) lVar;
                bVar.f131476b = mapViewportState2;
                bVar.f131479e = 1;
                Object objK = f.k(mapViewportState2, list, bVar);
                if (objK == aVar) {
                    return aVar;
                }
                obj = objK;
                mapViewportState = mapViewportState2;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mapViewportState = bVar.f131476b;
        lVar = bVar.f131475a;
        o13.r.b(obj);
        mapViewportState.easeTo((CameraOptions) obj, new MapAnimationOptions.Builder().duration(500L).build(), new oe2.c(this, lVar, 1));
        return Unit.INSTANCE;
    }

    @Override // je2.b
    public final z3.e d(h4.r rVar, ie2.l lVar, le2.b bVar, boolean z14, boolean z15, boolean z16, e23.l lVar2, e23.r rVar2, e23.l lVar3) {
        rVar.getClass();
        bVar.getClass();
        return new z3.e(-1000522094, true, new me2.c(rVar, this, lVar, bVar, z14, z15, z16, lVar2, rVar2, lVar3, 2));
    }

    @Override // je2.b
    public final z3.e e(h4.r rVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar) {
        rVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        list.getClass();
        return new z3.e(-1096369957, true, new oe2.b(rVar, this, cVar, cVar2, list, i14, z14, aVar, z15, lVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object f(List<ke2.b> list, t13.d<? super Unit> dVar) {
        c cVar;
        MapViewportState mapViewportState;
        p2 p2Var;
        Object value;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f131483d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f131483d = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f131481b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f131483d;
        if (i15 == 0) {
            o13.r.b(obj);
            MapViewportState mapViewportState2 = (MapViewportState) this.f98598b;
            if (mapViewportState2 != null) {
                cVar.f131480a = mapViewportState2;
                cVar.f131483d = 1;
                Object objK = f.k(mapViewportState2, list, cVar);
                if (objK == aVar) {
                    return aVar;
                }
                obj = objK;
                mapViewportState = mapViewportState2;
            }
            do {
                p2Var = this.f131474c;
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mapViewportState = cVar.f131480a;
        o13.r.b(obj);
        mapViewportState.setCameraOptions((CameraOptions) obj);
        do {
            p2Var = this.f131474c;
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Unit g(ke2.b bVar) {
        p2 p2Var;
        Object value;
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center(ne2.p.i(bVar)).build();
        MapViewportState mapViewportState = (MapViewportState) this.f98598b;
        if (mapViewportState != null) {
            cameraOptionsBuild.getClass();
            mapViewportState.setCameraOptions(cameraOptionsBuild);
        }
        do {
            p2Var = this.f131474c;
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object h(t13.d<? super Unit> dVar) {
        MapViewportState mapViewportState = (MapViewportState) this.f98598b;
        if (mapViewportState != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(new Double(0.0d)).build();
            MapAnimationOptions mapAnimationOptionsBuild = new MapAnimationOptions.Builder().build();
            cameraOptionsBuild.getClass();
            mapViewportState.easeTo(cameraOptionsBuild, mapAnimationOptionsBuild, new CompletionListener() { // from class: oe2.d
                @Override // com.mapbox.maps.plugin.viewport.CompletionListener
                public final void onComplete(boolean z14) {
                    Object value;
                    p2 p2Var = this.f131469a.f131474c;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, Integer.valueOf(((Number) value).intValue() + 1)));
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final void j(je2.a aVar) {
        CameraState cameraState;
        CameraOptions cameraOptions$default;
        CameraOptions.Builder builder;
        aVar.getClass();
        MapViewportState mapViewportState = (MapViewportState) this.f98598b;
        if (mapViewportState == null || (cameraState = mapViewportState.getCameraState()) == null || (cameraOptions$default = ExtensionUtils.toCameraOptions$default(cameraState, null, 1, null)) == null || (builder = cameraOptions$default.toBuilder()) == null) {
            return;
        }
        LatLng latLng = aVar.f98593a;
        latLng.getClass();
        Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
        pointFromLngLat.getClass();
        builder.center(pointFromLngLat);
        builder.zoom(Double.valueOf(aVar.f98594b));
        builder.bearing(Double.valueOf(aVar.f98595c));
        builder.pitch(Double.valueOf(aVar.f98596d));
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        mapViewportState.setCameraOptions(cameraOptionsBuild);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loe2/e$a;", "", "<init>", "()V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(je2.a aVar) {
        super(aVar);
        aVar.getClass();
        this.f131474c = q2.a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
