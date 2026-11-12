package ly0;

import com.garmin.android.apps.connectmobile.map.GCMMapView;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lly0/p;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f115380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMMapView f115381b;

    public p(s sVar, GCMMapView gCMMapView) {
        this.f115380a = sVar;
        this.f115381b = gCMMapView;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        this.f115381b.c();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        s sVar = this.f115380a;
        if (sVar.c()) {
            iVar.getUiSettings().setAllGesturesEnabled(false);
            i53.c<com.garmin.android.library.mapsdkadapter.p> cVar = sVar.f115384b;
            GCMMapView gCMMapView = this.f115381b;
            if (cVar != null) {
                Iterator<com.garmin.android.library.mapsdkadapter.p> it = cVar.iterator();
                while (it.hasNext()) {
                    gCMMapView.g(it.next());
                }
            }
            com.garmin.android.library.mapsdkadapter.q qVar = sVar.f115385c;
            if (qVar != null) {
                gCMMapView.h(qVar);
            }
            i53.c<com.garmin.android.library.mapsdkadapter.q> cVar2 = sVar.f115383a;
            if (cVar2 != null) {
                Iterator<com.garmin.android.library.mapsdkadapter.q> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    gCMMapView.h(it3.next());
                }
            }
            q.c(sVar, gCMMapView);
        }
    }
}
