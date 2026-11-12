package wv2;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwv2/j;", "Ljava/lang/Runnable;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f187491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.realtimesettings.app.baseviews.reorderable.b f187492b;

    public j(View view2, com.garmin.realtimesettings.app.baseviews.reorderable.b bVar) {
        this.f187491a = view2;
        this.f187492b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView;
        int[] iArr = new int[2];
        this.f187491a.getLocationOnScreen(iArr);
        int i14 = iArr[1];
        com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = this.f187492b;
        NestedScrollView nestedScrollView2 = bVar.f52556i;
        int height = nestedScrollView2 != null ? nestedScrollView2.getHeight() : 0;
        if (i14 < 200) {
            NestedScrollView nestedScrollView3 = bVar.f52556i;
            if (nestedScrollView3 != null) {
                nestedScrollView3.p(0, -30, 250, false);
            }
        } else if (i14 > height - 200 && (nestedScrollView = bVar.f52556i) != null) {
            nestedScrollView.p(0, 30, 250, false);
        }
        bVar.f52553f.postDelayed(this, 50L);
    }
}
