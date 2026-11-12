package hg1;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class l implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.e f83714a;

    public l(com.garmin.android.apps.connectmobile.settings.activityoptions.b bVar, androidx.appcompat.app.e eVar) {
        this.f83714a = eVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view2, boolean z14) {
        if (z14) {
            this.f83714a.getWindow().setSoftInputMode(5);
        }
    }
}
