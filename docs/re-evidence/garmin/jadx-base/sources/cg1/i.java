package cg1;

import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcg1/i;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MySegmentsActivity f27149a;

    public i(MySegmentsActivity mySegmentsActivity) {
        this.f27149a = mySegmentsActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA) {
            MySegmentsActivity mySegmentsActivity = this.f27149a;
            if (mySegmentsActivity.isFinishing()) {
                return;
            }
            g1.b(mySegmentsActivity, cVar);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
    }
}
