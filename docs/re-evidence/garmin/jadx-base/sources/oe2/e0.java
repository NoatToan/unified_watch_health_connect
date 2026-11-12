package oe2;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class e0 implements e23.a<MapViewportState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<MapViewportState, Unit> f131484a;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(e23.l<? super MapViewportState, Unit> lVar) {
        this.f131484a = lVar;
    }

    @Override // e23.a
    public final MapViewportState invoke() {
        MapViewportState mapViewportState = new MapViewportState(null, 1, null);
        this.f131484a.invoke(mapViewportState);
        return mapViewportState;
    }
}
