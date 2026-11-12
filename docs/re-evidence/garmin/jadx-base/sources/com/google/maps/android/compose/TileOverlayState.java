package com.google.maps.android.compose;

import com.google.android.gms.maps.model.TileOverlay;
import p005kotlin.Metadata;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState;", "", "<init>", "()V", "", "clearTileCache", "Lcom/google/android/gms/maps/model/TileOverlay;", "<set-?>", "tileOverlay$delegate", "Lp3/p1;", "getTileOverlay$maps_compose_release", "()Lcom/google/android/gms/maps/model/TileOverlay;", "setTileOverlay$maps_compose_release", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "tileOverlay", "Companion", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TileOverlayState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: tileOverlay$delegate, reason: from kotlin metadata */
    private final p1 tileOverlay;

    private TileOverlayState() {
        this.tileOverlay = p3.p0.n(null);
    }

    public final void clearTileCache() {
        TileOverlay tileOverlay$maps_compose_release = getTileOverlay$maps_compose_release();
        if (tileOverlay$maps_compose_release != null) {
            tileOverlay$maps_compose_release.clearTileCache();
        } else {
            vb.h.z("This TileOverlayState is not used in any TileOverlay");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TileOverlay getTileOverlay$maps_compose_release() {
        return (TileOverlay) this.tileOverlay.getF182175a();
    }

    public final void setTileOverlay$maps_compose_release(TileOverlay tileOverlay) {
        this.tileOverlay.setValue(tileOverlay);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087\u0002¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState$Companion;", "", "<init>", "()V", "invoke", "Lcom/google/maps/android/compose/TileOverlayState;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final TileOverlayState invoke() {
            return new TileOverlayState(null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileOverlayState(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
