package cg1;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcg1/t;", "Lqw0/a;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends qw0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f27200j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SegmentDetailsDTO f27201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27202i = 1;

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        SegmentDetailsDTO segmentDetailsDTO = this.f27201h;
        segmentDetailsDTO.getClass();
        ArrayList arrayList = segmentDetailsDTO.f41283x;
        if (arrayList == null || arrayList.size() <= 1) {
            return;
        }
        com.garmin.android.apps.connectmobile.segments.model.a aVar = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(0);
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(aVar.f41341a, aVar.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            pVar.b(2131232323);
            pVar.d(fVar);
            hVar.x(pVar);
        }
        com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
        int color = a7.b.getColor(requireContext(), R.color.gcm_map_segment_track_path);
        ie2.p pVar2 = qVar.f50328a;
        pVar2.f93156d = color;
        pVar2.f93155c = 5.0f;
        pVar2.f93161i = true;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            com.garmin.android.apps.connectmobile.segments.model.a aVar2 = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(i14);
            pVar2.f93153a.add(new com.garmin.android.library.mapsdkadapter.f(aVar2.f41341a, aVar2.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
        }
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            hVar2.h(qVar);
        }
        com.garmin.android.apps.connectmobile.segments.model.a aVar3 = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(arrayList.size() - 1);
        com.garmin.android.library.mapsdkadapter.f fVar2 = new com.garmin.android.library.mapsdkadapter.f(aVar3.f41341a, aVar3.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        qe2.h hVar3 = this.f148294e;
        if (hVar3 != null) {
            com.garmin.android.library.mapsdkadapter.p pVar3 = new com.garmin.android.library.mapsdkadapter.p();
            pVar3.b(2131232324);
            pVar3.d(fVar2);
            hVar3.x(pVar3);
        }
        qe2.h hVar4 = this.f148294e;
        if (hVar4 != null) {
            com.garmin.android.library.mapsdkadapter.i.a.e(hVar4, true, true, 28);
        }
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        if (bundleC != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleC.getParcelable("GCM_extra_segment_data", SegmentDetailsDTO.class);
            } else {
                Parcelable parcelable2 = bundleC.getParcelable("GCM_extra_segment_data");
                if (!(parcelable2 instanceof SegmentDetailsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (SegmentDetailsDTO) parcelable2;
            }
            this.f27201h = (SegmentDetailsDTO) parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcg1/t$a;", "", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
