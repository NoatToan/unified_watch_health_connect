package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements OnMapClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125585b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f125584a = i14;
        this.f125585b = obj;
    }

    @Override // com.mapbox.maps.plugin.gestures.OnMapClickListener
    public final boolean onMapClick(Point point) {
        int i14 = this.f125584a;
        Object obj = this.f125585b;
        switch (i14) {
            case 0:
                point.getClass();
                s sVar = ((s) obj).L0.f125713a;
                int i15 = s.M0;
                com.garmin.android.library.mapsdkadapter.i.j jVar = sVar.f50243d;
                if (jVar != null) {
                    jVar.X(p.e(point));
                }
                break;
            default:
                e23.a aVar = (e23.a) obj;
                point.getClass();
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
        return true;
    }
}
