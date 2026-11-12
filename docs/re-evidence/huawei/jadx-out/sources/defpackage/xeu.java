package defpackage;

import android.app.Activity;
import huawei.android.widget.HwImmersiveMode;

/* JADX INFO: loaded from: classes20.dex */
public class xeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwImmersiveMode f52805a;
    private Activity d;

    public xeu(Activity activity) {
        this.f52805a = new HwImmersiveMode(activity);
        this.d = activity;
    }

    public void a(boolean z) {
        this.f52805a.setNavigationBarBlurEnable(z);
    }
}
