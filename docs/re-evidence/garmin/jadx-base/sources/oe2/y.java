package oe2;

import com.mapbox.maps.extension.compose.MapState;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapPreviewContainer$4$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapState f131578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(MapState mapState, boolean z14, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f131578a = mapState;
        this.f131579b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f131578a, this.f131579b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        MapState mapState = this.f131578a;
        GesturesSettings.Builder builder = mapState.getGesturesSettings().toBuilder();
        boolean z14 = this.f131579b;
        builder.m269setPinchToZoomEnabled(z14);
        builder.m262setDoubleTapToZoomInEnabled(z14);
        builder.m271setQuickZoomEnabled(z14);
        builder.m275setScrollEnabled(z14);
        builder.m267setPinchScrollEnabled(z14);
        builder.m273setRotateEnabled(z14);
        mapState.setGesturesSettings(builder.build());
        return Unit.INSTANCE;
    }
}
