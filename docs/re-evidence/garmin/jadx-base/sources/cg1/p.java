package cg1;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import p005kotlin.Metadata;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcg1/p;", "Ld80/b;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsActivity f27173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am.l f27174b;

    public p(SegmentDetailsActivity segmentDetailsActivity, am.l lVar) {
        this.f27173a = segmentDetailsActivity;
        this.f27174b = lVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        SegmentDetailsActivity segmentDetailsActivity = this.f27173a;
        segmentDetailsActivity.hideProgressOverlay();
        i2.a.j(i2.f36769a, "SegmentDetailsActivity", "Error updating activity privacy: " + (bVar != null ? bVar.f112957a.name() : null) + " Error code: " + (bVar != null ? Integer.valueOf(bVar.f112958b) : null));
        SegmentDetailsActivity.a aVar = SegmentDetailsActivity.Z;
        segmentDetailsActivity.displayFailedMessage();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        aVar.getClass();
        SegmentDetailsActivity segmentDetailsActivity = this.f27173a;
        segmentDetailsActivity.hideProgressOverlay();
        PrivacyType.Companion companion = PrivacyType.INSTANCE;
        String str = this.f27174b.f4054a;
        PrivacyType privacyType = PrivacyType.ONLY_ME;
        companion.getClass();
        PrivacyType privacyTypeA = PrivacyType.Companion.a(str, privacyType);
        segmentDetailsActivity.f41409v = privacyTypeA;
        segmentDetailsActivity.wa(privacyTypeA);
        q0.b bVar = q0.f149800b;
        View viewFindViewById = segmentDetailsActivity.findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        bVar.getClass();
        q0.b.a(viewFindViewById, R.string.msg_segments_privacy_updated, 1).show();
    }
}
