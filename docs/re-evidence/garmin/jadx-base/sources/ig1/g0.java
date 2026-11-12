package ig1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g0 extends fb2.e<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f93321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f93322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f93323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f93324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f93325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f93326i;

    public g0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        return this.f93321d;
    }

    public final void p() {
        setChanged();
        notifyObservers(Boolean.TRUE);
    }
}
