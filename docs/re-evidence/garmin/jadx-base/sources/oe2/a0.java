package oe2;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapPreviewContainer$mapViewportState$1$1", f = "MapboxMapCompose.kt", l = {359}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapViewportState f131451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<ke2.b> f131452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f131453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(MapViewportState mapViewportState, List<ke2.b> list, boolean z14, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f131451b = mapViewportState;
        this.f131452c = list;
        this.f131453d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f131451b, this.f131452c, this.f131453d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131450a;
        MapViewportState mapViewportState = this.f131451b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f131450a = 1;
            obj = f.k(mapViewportState, this.f131452c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        CameraOptions cameraOptionsBuild = (CameraOptions) obj;
        if (this.f131453d) {
            CameraOptions.Builder builder = cameraOptionsBuild.toBuilder();
            builder.pitch(new Double(60.0d));
            cameraOptionsBuild = builder.build();
        }
        cameraOptionsBuild.getClass();
        mapViewportState.setCameraOptions(cameraOptionsBuild);
        return Unit.INSTANCE;
    }
}
