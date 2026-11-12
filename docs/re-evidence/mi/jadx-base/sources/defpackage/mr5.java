package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.FpsView;

/* JADX INFO: loaded from: classes4.dex */
public class mr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f27119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactContext f27120b;
    public FrameLayout c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27121a;

        public a(boolean z) {
            this.f27121a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f27121a || mr5.this.c != null) {
                if (this.f27121a || mr5.this.c == null) {
                    return;
                }
                mr5.this.c.removeAllViews();
                mr5.this.f27119a.removeView(mr5.this.c);
                mr5.this.c = null;
                return;
            }
            if (!mr5.g(mr5.this.f27120b)) {
                cm8.b("ReactNative", "Wait for overlay permission to be set");
                return;
            }
            mr5.this.c = new FpsView(mr5.this.f27120b);
            mr5.this.f27119a.addView(mr5.this.c, new WindowManager.LayoutParams(-1, -1, ylr.f40311b, 24, -3));
        }
    }

    public mr5(ReactContext reactContext) {
        this.f27120b = reactContext;
        this.f27119a = (WindowManager) reactContext.getSystemService("window");
    }

    public static boolean f(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        cm8.C("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (f(context, intent)) {
            context.startActivity(intent);
        }
    }

    public void i(boolean z) {
        UiThreadUtil.runOnUiThread(new a(z));
    }
}
