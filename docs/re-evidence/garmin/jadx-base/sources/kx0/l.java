package kx0;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkx0/l;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f107055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107056b;

    public l(ViewTreeObserver viewTreeObserver, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar) {
        this.f107055a = viewTreeObserver;
        this.f107056b = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f107055a.removeOnGlobalLayoutListener(this);
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107056b;
        ScrollView scrollView = aVar.D;
        if (scrollView != null) {
            scrollView.post(new k32.n(aVar, 5));
        } else {
            p005kotlin.jvm.internal.s.m("mScrollView");
            throw null;
        }
    }
}
