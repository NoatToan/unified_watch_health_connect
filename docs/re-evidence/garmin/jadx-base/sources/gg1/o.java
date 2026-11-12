package gg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.settings.GCMDumpAppLogActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgg1/o;", "Lj83/m;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends j83.m<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMDumpAppLogActivity f77284b;

    public o(GCMDumpAppLogActivity gCMDumpAppLogActivity) {
        this.f77284b = gCMDumpAppLogActivity;
    }

    @Override // j83.m
    public final void b(Throwable th3) {
        th3.getClass();
        GCMDumpAppLogActivity gCMDumpAppLogActivity = this.f77284b;
        gCMDumpAppLogActivity.hideProgressOverlay();
        GCMDumpAppLogActivity.f41533b.error("Fail to dump gcm log zip file:", th3);
        Toast.makeText(gCMDumpAppLogActivity, "Fail to dump gcm log zip file: " + th3, 0).show();
        gCMDumpAppLogActivity.finish();
    }

    @Override // j83.m
    public final void c(String str) {
        String str2 = str;
        str2.getClass();
        GCMDumpAppLogActivity gCMDumpAppLogActivity = this.f77284b;
        gCMDumpAppLogActivity.hideProgressOverlay();
        GCMDumpAppLogActivity.f41533b.debug("GCM log zip file dumped: ".concat(str2));
        Toast.makeText(gCMDumpAppLogActivity, "GCM log zip file dumped: ".concat(str2), 0).show();
        gCMDumpAppLogActivity.finish();
    }
}
