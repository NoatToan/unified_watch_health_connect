package ne2;

import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.maps.plugin.gestures.OnMoveListener;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne2/g;", "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements OnMoveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f125594a;

    public g(s sVar) {
        this.f125594a = sVar;
    }

    @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
    public final boolean onMove(MoveGestureDetector moveGestureDetector) {
        moveGestureDetector.getClass();
        s sVar = this.f125594a;
        if (sVar.f50240a) {
            return true;
        }
        s sVar2 = s.this;
        int i14 = s.M0;
        sVar2.getClass();
        return false;
    }

    @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
    public final void onMoveBegin(MoveGestureDetector moveGestureDetector) {
        moveGestureDetector.getClass();
        s sVar = this.f125594a;
        if (sVar.f50240a) {
            return;
        }
        com.garmin.android.library.mapsdkadapter.f fVar = sVar.X;
        com.garmin.android.library.mapsdkadapter.e eVar = sVar.Z;
        Objects.toString(fVar);
        Objects.toString(eVar);
        s sVar2 = s.this;
        int i14 = s.M0;
        j40.a aVar = sVar2.f50254o;
        if (aVar != null) {
            j40.c cVar = aVar.f97001a;
            int i15 = j40.c.V0;
            cVar.X6().setRecenterMapButtonEnabled(true);
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
    public final void onMoveEnd(MoveGestureDetector moveGestureDetector) {
        moveGestureDetector.getClass();
        s sVar = this.f125594a;
        boolean z14 = sVar.f50240a;
        s.d dVar = sVar.L0;
        if (z14) {
            return;
        }
        v.f(sVar);
        com.garmin.android.library.mapsdkadapter.f fVar = sVar.X;
        com.garmin.android.library.mapsdkadapter.e eVar = sVar.Z;
        Objects.toString(fVar);
        Objects.toString(eVar);
        s sVar2 = s.this;
        int i14 = s.M0;
        com.garmin.android.library.mapsdkadapter.i.f fVar2 = sVar2.f50253n;
        if (fVar2 != null) {
            fVar2.i(sVar.Z);
        }
        com.garmin.android.library.mapsdkadapter.i.g gVar = s.this.f50255p;
        if (gVar != null) {
            gVar.onCameraIdle();
        }
    }
}
