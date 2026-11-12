package pk1;

import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements com.garmin.android.apps.connectmobile.settings.d.a, j42.b.InterfaceC1852b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f138312a;

    public /* synthetic */ s(u uVar) {
        this.f138312a = uVar;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        u uVar = this.f138312a;
        GCMSettingsItemView gCMSettingsItemView = uVar.f138321f;
        if (gCMSettingsItemView != null) {
            gCMSettingsItemView.setSummary(uVar.F6(f14));
        } else {
            p005kotlin.jvm.internal.s.m("heightView");
            throw null;
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        u uVar = this.f138312a;
        GCMSettingsItemView gCMSettingsItemView = uVar.f138322g;
        if (gCMSettingsItemView != null) {
            gCMSettingsItemView.setSummary(uVar.G6(d14));
        } else {
            p005kotlin.jvm.internal.s.m("weightView");
            throw null;
        }
    }
}
