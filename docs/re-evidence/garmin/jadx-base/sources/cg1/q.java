package cg1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.segments.domain.SegmentMapActivity;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements com.garmin.android.library.mapsdkadapter.i.m, com.garmin.android.library.mapsdkadapter.i.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.e f27175a;

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        com.garmin.android.apps.connectmobile.segments.presentation.e.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.e.f41438f;
        SegmentMapActivity.a aVar2 = SegmentMapActivity.f41270c;
        com.garmin.android.apps.connectmobile.segments.presentation.e eVar = this.f27175a;
        Context contextRequireContext = eVar.requireContext();
        contextRequireContext.getClass();
        SegmentDetailsDTO segmentDetailsDTO = eVar.f41439e;
        aVar2.getClass();
        SegmentMapActivity.a.a(contextRequireContext, segmentDetailsDTO);
        return true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.apps.connectmobile.segments.presentation.e.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.e.f41438f;
        SegmentMapActivity.a aVar2 = SegmentMapActivity.f41270c;
        com.garmin.android.apps.connectmobile.segments.presentation.e eVar = this.f27175a;
        Context contextRequireContext = eVar.requireContext();
        contextRequireContext.getClass();
        SegmentDetailsDTO segmentDetailsDTO = eVar.f41439e;
        aVar2.getClass();
        SegmentMapActivity.a.a(contextRequireContext, segmentDetailsDTO);
    }
}
