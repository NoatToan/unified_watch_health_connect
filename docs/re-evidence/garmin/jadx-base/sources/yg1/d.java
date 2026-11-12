package yg1;

import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class d implements Comparator<g> {
    public d(ControlsMenuActivity controlsMenuActivity) {
    }

    @Override // java.util.Comparator
    public final int compare(g gVar, g gVar2) {
        return Integer.compare(gVar.f196926h, gVar2.f196926h);
    }
}
