package ig1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f0 extends fb2.e<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f93305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f93306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f93307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f93308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f93309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexOneLineButton f93310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f93311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexOneLineButton f93312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexOneLineButton f93313l;

    public f0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        return this.f93305d;
    }

    public final void p() {
        setChanged();
        notifyObservers(Boolean.TRUE);
    }
}
