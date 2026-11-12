package je;

import android.os.Build;
import android.webkit.WebSettings;
import ke.e;
import ke.f;
import ke.g;
import ke.h;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    private a() {
    }

    public static e a(WebSettings webSettings) {
        try {
            return new e((WebSettingsBoundaryInterface) d73.a.a(WebSettingsBoundaryInterface.class, h.a.f104535a.f104538a.convertSettings(webSettings)));
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new f();
            }
            throw e4;
        }
    }

    @Deprecated
    public static void b(WebSettings webSettings, int i14) {
        ke.a.h hVar = g.f104533c;
        if (hVar.b()) {
            webSettings.setForceDark(i14);
        } else if (hVar.c()) {
            a(webSettings).b(i14);
        } else {
            org.apache.commons.lang3.e.w("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }
}
