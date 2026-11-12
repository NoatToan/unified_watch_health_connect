package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WindowManager.LayoutParams f46416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f46417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46418c = true;
    private final View d;
    private final Activity e;

    public qla(Activity activity, int i) {
        this.e = activity;
        this.f46417b = (WindowManager) activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        this.d = LayoutInflater.from(activity).inflate(i, (ViewGroup) null);
        b();
    }

    private void b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 8, -3);
        this.f46416a = layoutParams;
        layoutParams.gravity = 8388691;
        this.f46416a.x = (int) this.e.getResources().getDimension(R.dimen.elementsMarginHorizontalM);
        this.f46416a.y = (int) this.e.getResources().getDimension(R.dimen.health_common_100dp);
        this.f46416a.token = this.e.getWindow().getDecorView().getWindowToken();
    }

    public void c(int i, int i2, int i3) {
        this.f46416a.gravity = i;
        this.f46416a.x = i2;
        this.f46416a.y = i3;
    }

    public WindowManager.LayoutParams d() {
        return this.f46416a;
    }

    public View c() {
        return this.d;
    }
}
