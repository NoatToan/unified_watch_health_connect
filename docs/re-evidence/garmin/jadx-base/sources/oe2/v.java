package oe2;

import com.mapbox.maps.extension.compose.MapState;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v extends p005kotlin.jvm.internal.w implements e23.a<MapState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f131569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e23.l lVar) {
        super(0);
        this.f131569a = lVar;
    }

    @Override // e23.a
    public final MapState invoke() {
        MapState mapState = new MapState();
        this.f131569a.invoke(mapState);
        return mapState;
    }
}
