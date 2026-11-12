package me2;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme2/m;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements GoogleMap.OnMarkerDragListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f118197a;

    public m(l lVar) {
        this.f118197a = lVar;
    }

    public final a0 a(Marker marker) {
        a0 next;
        l lVar = this.f118197a;
        Iterator<a0> it = lVar.B.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(next.f118121b, marker));
        if (next != null) {
            return new a0(marker, lVar);
        }
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDrag(Marker marker) {
        j40.c cVar;
        marker.getClass();
        a0 a0VarA = a(marker);
        if (a0VarA == null || (cVar = this.f118197a.f50249j) == null) {
            return;
        }
        cVar.q7(a0VarA);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragEnd(Marker marker) {
        j40.c cVar;
        marker.getClass();
        a0 a0VarA = a(marker);
        if (a0VarA == null || (cVar = this.f118197a.f50249j) == null) {
            return;
        }
        cVar.r7(a0VarA);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragStart(Marker marker) {
        j40.c cVar;
        marker.getClass();
        a0 a0VarA = a(marker);
        if (a0VarA == null || (cVar = this.f118197a.f50249j) == null) {
            return;
        }
        cVar.u7(a0VarA);
    }
}
