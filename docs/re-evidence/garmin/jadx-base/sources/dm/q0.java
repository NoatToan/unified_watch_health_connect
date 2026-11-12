package dm;

import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/q0;", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 implements iu1.k<SegmentDetailsListDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f60405a;

    public q0(r0 r0Var) {
        this.f60405a = r0Var;
    }

    @Override // iu1.k
    public final void onSuccess(SegmentDetailsListDTO segmentDetailsListDTO) {
        this.f60405a.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, segmentDetailsListDTO);
    }
}
