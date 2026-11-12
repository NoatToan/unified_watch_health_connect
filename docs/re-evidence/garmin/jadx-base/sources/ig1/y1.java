package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class y1 extends fb2.m<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93429f;

    public y1(Context context) {
        super(context);
        this.f93429f = View.generateViewId();
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF180422f() {
        return this.f93429f;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.lbl_strength_training);
    }
}
