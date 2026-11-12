package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes5.dex */
public class lvk implements IRnScreenProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider
    public float getDisplayDensity(Activity activity) {
        return 0.0f;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider
    public View getRootView(Activity activity) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider
    public boolean isPad() {
        DisplayMetrics displayMetrics = MiJiaEnvironment.getAppContext().getResources().getDisplayMetrics();
        float fMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        return fMin / displayMetrics.density >= 530.0f && ((float) Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)) / fMin < 1.8f;
    }
}
