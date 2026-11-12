package ke;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f104530a;

    public e(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f104530a = webSettingsBoundaryInterface;
    }

    public void a(boolean z14) {
        this.f104530a.setAlgorithmicDarkeningAllowed(z14);
    }

    public void b(int i14) {
        this.f104530a.setForceDark(i14);
    }
}
