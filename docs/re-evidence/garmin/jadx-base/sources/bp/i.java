package bp;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbp/i;", "Ld80/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewImageActivity f19391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19392b;

    public i(ViewImageActivity viewImageActivity, int i14) {
        this.f19391a = viewImageActivity;
        this.f19392b = i14;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        ViewImageActivity viewImageActivity = this.f19391a;
        viewImageActivity.hideProgressOverlay();
        Toast.makeText(viewImageActivity, viewImageActivity.getString(R.string.delete_photo_error), 0).show();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        ViewImageActivity viewImageActivity = this.f19391a;
        viewImageActivity.hideProgressOverlay();
        viewImageActivity.ha(this.f19392b);
    }
}
