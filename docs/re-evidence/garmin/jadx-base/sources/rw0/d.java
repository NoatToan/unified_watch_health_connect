package rw0;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/d;", "Landroid/content/ComponentCallbacks;", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements ComponentCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMMapPreview f154825a;

    public d(GCMMapPreview gCMMapPreview) {
        this.f154825a = gCMMapPreview;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f154825a.onLowMemory();
    }
}
