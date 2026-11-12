package bi1;

import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3ClassicWatchFaceSettingsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbi1/e;", "Lzp0/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements zp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Vivomove3ClassicWatchFaceSettingsActivity f18031a;

    public e(Vivomove3ClassicWatchFaceSettingsActivity vivomove3ClassicWatchFaceSettingsActivity) {
        this.f18031a = vivomove3ClassicWatchFaceSettingsActivity;
    }

    @Override // zp0.b
    public final void H1() {
        Vivomove3ClassicWatchFaceSettingsActivity vivomove3ClassicWatchFaceSettingsActivity = this.f18031a;
        ImageView imageView = vivomove3ClassicWatchFaceSettingsActivity.f43195c;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("deviceFrame");
            throw null;
        }
        imageView.setVisibility(0);
        vivomove3ClassicWatchFaceSettingsActivity.hideProgressOverlay();
    }

    @Override // zp0.b
    public final void n4() {
        Vivomove3ClassicWatchFaceSettingsActivity vivomove3ClassicWatchFaceSettingsActivity = this.f18031a;
        ImageView imageView = vivomove3ClassicWatchFaceSettingsActivity.f43195c;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("deviceFrame");
            throw null;
        }
        imageView.setVisibility(0);
        vivomove3ClassicWatchFaceSettingsActivity.hideProgressOverlay();
    }
}
