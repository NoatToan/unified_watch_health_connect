package ig1;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes10.dex */
public class f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f93304a;

    public f(h hVar) {
        this.f93304a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        h hVar = this.f93304a;
        if (z14) {
            hVar.f93323f.setVisibility(0);
        } else {
            hVar.f93323f.setVisibility(8);
        }
        int[] iArr = h.f93330j;
        ((com.garmin.android.apps.connectmobile.devices.model.f) hVar.f70344b).y1("autoLapEnabled", Boolean.valueOf(z14));
        hVar.p();
    }
}
