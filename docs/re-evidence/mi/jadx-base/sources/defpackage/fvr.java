package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.mipay.sdk.util.NavBarUtils;

/* JADX INFO: loaded from: classes2.dex */
public class fvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bvr f18303a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final fvr f18304a = new fvr();
    }

    public static fvr c() {
        return b.f18304a;
    }

    public final boolean d(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public final boolean e(Context context, String str) {
        return hvr.f(context, str) < 1.0f;
    }

    public final /* synthetic */ void f(Activity activity, ImageView imageView, ImageView imageView2, Bitmap bitmap) {
        if (!d(activity) || imageView == null || imageView2 == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        imageView2.setImageBitmap(bitmap);
    }

    public final /* synthetic */ void g(final Activity activity, String str, final ImageView imageView, final ImageView imageView2, View view) {
        if (!d(activity) || TextUtils.isEmpty(str) || imageView == null || imageView2 == null) {
            return;
        }
        boolean zE = e(activity, str);
        imageView.setVisibility(zE ? 0 : 8);
        imageView2.setVisibility(zE ? 0 : 8);
        bvr bvrVar = this.f18303a;
        if (bvrVar != null) {
            if (zE) {
                bvrVar.h(view, new bvr.c() { // from class: evr
                    @Override // bvr.c
                    public final void a(Bitmap bitmap) {
                        this.f17117a.f(activity, imageView, imageView2, bitmap);
                    }
                });
            } else {
                bvrVar.k();
            }
        }
    }

    public void h(final Activity activity, final String str, final ImageView imageView, final ImageView imageView2, final View view) {
        if (view == null || !d(activity)) {
            return;
        }
        view.post(new Runnable() { // from class: dvr
            @Override // java.lang.Runnable
            public final void run() {
                this.f15979a.g(activity, str, imageView, imageView2, view);
            }
        });
        if (!hvr.j(activity) || !hvr.i(str) || Settings.Global.getInt(activity.getContentResolver(), NavBarUtils.FORCE_FSG_NAV_BAR, 0) == 0 || vvr.a(activity)) {
            return;
        }
        vvr.e(activity, view, false, "#FFFFFF");
    }

    public void i() {
        bvr bvrVar = this.f18303a;
        if (bvrVar != null) {
            bvrVar.k();
        }
    }

    public fvr() {
        this.f18303a = new bvr();
    }
}
