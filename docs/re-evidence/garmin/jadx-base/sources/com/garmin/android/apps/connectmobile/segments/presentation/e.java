package com.garmin.android.apps.connectmobile.segments.presentation;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import cg1.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.r1;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import com.garmin.android.library.mapsdkadapter.p;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/e;", "Lcom/garmin/android/apps/connectmobile/r1;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends r1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f41438f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SegmentDetailsDTO f41439e;

    @Override // com.garmin.android.apps.connectmobile.r1, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.setOnMarkerClickListener(new q(this));
        }
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.setOnMapClickListener(new q(this));
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
                parcelable = (Parcelable) bundleC.getParcelable("segment_detail", SegmentDetailsDTO.class);
            } else {
                Parcelable parcelable2 = bundleC.getParcelable("segment_detail");
                if (!(parcelable2 instanceof SegmentDetailsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (SegmentDetailsDTO) parcelable2;
            }
            this.f41439e = (SegmentDetailsDTO) parcelable;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void v6() {
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void w6() {
        SegmentDetailsDTO segmentDetailsDTO = this.f41439e;
        if (segmentDetailsDTO == null) {
            GCMMapPreview gCMMapPreview = this.f41077c;
            if (gCMMapPreview != null) {
                gCMMapPreview.j();
                return;
            }
            return;
        }
        ArrayList arrayList = segmentDetailsDTO.f41283x;
        if (arrayList == null || arrayList.size() <= 1) {
            GCMMapPreview gCMMapPreview2 = this.f41077c;
            if (gCMMapPreview2 != null) {
                gCMMapPreview2.j();
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.segments.model.a aVar = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(0);
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(aVar.f41341a, aVar.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        GCMMapPreview gCMMapPreview3 = this.f41077c;
        if (gCMMapPreview3 != null) {
            p pVar = new p();
            pVar.b(2131232323);
            pVar.d(fVar);
            gCMMapPreview3.g(pVar);
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
        GCMMapPreview gCMMapPreview4 = this.f41077c;
        if (gCMMapPreview4 != null) {
            gCMMapPreview4.h(qVar);
        }
        com.garmin.android.apps.connectmobile.segments.model.a aVar3 = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(arrayList.size() - 1);
        com.garmin.android.library.mapsdkadapter.f fVar2 = new com.garmin.android.library.mapsdkadapter.f(aVar3.f41341a, aVar3.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        GCMMapPreview gCMMapPreview5 = this.f41077c;
        if (gCMMapPreview5 != null) {
            p pVar3 = new p();
            pVar3.b(2131232324);
            pVar3.d(fVar2);
            gCMMapPreview5.g(pVar3);
        }
        GCMMapPreview gCMMapPreview6 = this.f41077c;
        if (gCMMapPreview6 != null) {
            gCMMapPreview6.i();
        }
        GCMMapPreview gCMMapPreview7 = this.f41077c;
        if (gCMMapPreview7 != null) {
            gCMMapPreview7.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/e$a;", "", "<init>", "()V", "", "SEGMENT_DETAIL", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
