package com.google.android.exoplayer2.trackselection;

import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.g;
import com.google.android.exoplayer2.source.TrackGroup;
import f12.l;
import java.util.List;
import zb0.r1;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements DefaultTrackSelector.TrackInfo.Factory, com.garmin.android.apps.connectmobile.devices.setup.a.InterfaceC0580a, z22.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f53098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53099c;

    public /* synthetic */ b(Object obj, boolean z14, int i14) {
        this.f53097a = i14;
        this.f53099c = obj;
        this.f53098b = z14;
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.a.InterfaceC0580a
    public void a(boolean z14) {
        switch (this.f53097a) {
            case 1:
                BLEDeviceSetupWizardActivity.ga((BLEDeviceSetupWizardActivity) this.f53099c, this.f53098b, z14);
                break;
            default:
                BLEScanningWizardActivity.ga((BLEScanningWizardActivity) this.f53099c, this.f53098b, z14);
                break;
        }
    }

    @Override // z22.a.b
    public void b(String str) {
        switch (this.f53097a) {
            case 3:
                g gVar = (g) this.f53099c;
                if (gVar.z6()) {
                    if (this.f53098b) {
                        gVar.D.setText(str);
                        l.f68084a.getClass();
                        gVar.f34541d = l.a.a().h();
                    } else {
                        gVar.E.setText(str);
                        l.f68084a.getClass();
                        gVar.f34542e = l.a.a().d();
                    }
                    gVar.u6();
                }
                break;
            default:
                r1 r1Var = (r1) this.f53099c;
                if (r1Var.z6()) {
                    if (this.f53098b) {
                        r1Var.A.setText(str);
                        l.f68084a.getClass();
                        l.a.a().h();
                    } else {
                        r1Var.B.setText(str);
                        l.f68084a.getClass();
                        l.a.a().d();
                    }
                    r1Var.u6();
                }
                break;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i14, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectAudioTrack$3((DefaultTrackSelector.Parameters) this.f53099c, this.f53098b, i14, trackGroup, iArr);
    }
}
