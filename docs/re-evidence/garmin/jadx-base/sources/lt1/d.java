package lt1;

import com.garmin.android.library.mapsdkadapter.n;
import com.google.android.gms.maps.model.LatLng;
import java.util.Comparator;
import p005kotlin.Metadata;
import pt1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LatLng f114861a;

    public d(LatLng latLng) {
        this.f114861a = latLng;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Float fValueOf = Float.valueOf(Float.MAX_VALUE);
        ke2.b bVar = ((t) t7).f140971e;
        LatLng latLng = this.f114861a;
        Float fValueOf2 = bVar != null ? Float.valueOf(n.a(ke2.c.c(bVar), latLng)) : fValueOf;
        ke2.b bVar2 = ((t) t14).f140971e;
        if (bVar2 != null) {
            fValueOf = Float.valueOf(n.a(ke2.c.c(bVar2), latLng));
        }
        return r13.a.b(fValueOf2, fValueOf);
    }
}
