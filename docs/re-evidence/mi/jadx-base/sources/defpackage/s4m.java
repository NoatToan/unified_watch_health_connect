package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.SharePopupView;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.service.OnMedalWallPageShareMethodListener;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class s4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i7m f33286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharePopupView f33287b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final WeakReference<BaseActivity> d;
    public b e;
    public s9h f;
    public OnMedalWallPageShareMethodListener g;
    public ViewGroup h;

    public interface a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f33289b;
        public String c;
        public String d;
        public String e;
        public String f;
        public View g;
        public float h;
        public float i;
        public boolean j;

        public b() {
        }
    }

    public s4m(BaseActivity baseActivity) {
        this.d = new WeakReference<>(baseActivity);
    }

    public final void A() {
        BaseActivity baseActivity = this.d.get();
        if (baseActivity == null) {
            return;
        }
        if (this.f33286a == null) {
            this.f33286a = new i7m(baseActivity, g());
        }
        if (this.e.f33288a == 2) {
            this.f33286a.d.setVisibility(0);
        } else {
            this.f33286a.d.setVisibility(8);
        }
        if (this.e.j) {
            this.f33286a.e.setVisibility(8);
        } else {
            this.f33286a.e.setVisibility(0);
        }
        if (this.e.j) {
            ((LinearLayout.LayoutParams) this.f33286a.c.getLayoutParams()).setMarginEnd(0);
        }
        this.f33286a.showAtLocation(baseActivity.findViewById(R.id.content), 81, 0, 0);
    }

    public final void d() {
        this.e.getClass();
        View view = this.e.g;
        if (view == null) {
            throw new IllegalArgumentException("share view can't be null");
        }
        Bitmap bitmapLoadBitmapFromView = ShareUtil.loadBitmapFromView(view, 0.0f, 100.0f);
        if (bitmapLoadBitmapFromView == null) {
            Toast.makeText(AppUtil.getApp(), z0j.common_hint_unkonwn_error, 0).show();
            return;
        }
        BaseActivity baseActivity = this.d.get();
        if (baseActivity == null) {
            return;
        }
        ShareUtil.saveImageToGallery(baseActivity, bitmapLoadBitmapFromView);
    }

    public void e(String str, String str2, View view) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33289b = str;
        bVar.c = str2;
        bVar.g = view;
        d();
        s9h s9hVar = this.f;
        if (s9hVar != null) {
            s9hVar.onShareMethodClicked(2);
        }
    }

    public Activity f() {
        return this.d.get();
    }

    public final View.OnClickListener g() {
        return new View.OnClickListener() { // from class: p4m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29998a.i(view);
            }
        };
    }

    public final String h(String str) {
        Application app = AppUtil.getApp();
        Uri uriForFile = FileProvider.getUriForFile(app, im9.B(), new File(str));
        app.grantUriPermission(this.d.get().getPackageName(), uriForFile, 1);
        return uriForFile.toString();
    }

    public final /* synthetic */ void i(View view) {
        int i;
        i7m i7mVar = this.f33286a;
        if (i7mVar != null) {
            i7mVar.dismiss();
        }
        if (NetUtil.INSTANCE.getNetWorkAvailable(this.d.get())) {
            int id = view.getId();
            if (id == wri.d) {
                i = 0;
                s(0);
            } else if (id == wri.c) {
                i = 1;
                s(1);
            } else if (id == wri.f38286a) {
                d();
                i = 2;
            } else {
                if (id == wri.f38287b) {
                    t();
                }
                i = 3;
            }
            s9h s9hVar = this.f;
            if (s9hVar != null) {
                s9hVar.onShareMethodClicked(i);
            }
            OnMedalWallPageShareMethodListener onMedalWallPageShareMethodListener = this.g;
            if (onMedalWallPageShareMethodListener != null) {
                onMedalWallPageShareMethodListener.onShareMethodClicked(i);
            }
        }
    }

    public final /* synthetic */ void j(Bitmap bitmap, b bVar, int i) {
        BaseActivity baseActivity = this.d.get();
        if (baseActivity == null) {
            return;
        }
        o3r.i().v(baseActivity, bitmap, bVar.f33289b, bVar.c, i);
    }

    public final /* synthetic */ void k(final b bVar, final int i) {
        View view = bVar.g;
        if (view == null) {
            throw new IllegalArgumentException("share view can't be null");
        }
        final Bitmap bitmapLoadBitmapFromView = ShareUtil.loadBitmapFromView(view, bVar.h, bVar.i);
        this.c.post(new Runnable() { // from class: r4m
            @Override // java.lang.Runnable
            public final void run() {
                this.f32185a.j(bitmapLoadBitmapFromView, bVar, i);
            }
        });
    }

    public final void l(final b bVar, final int i) {
        Executors.newCachedThreadPool().execute(new Runnable() { // from class: q4m
            @Override // java.lang.Runnable
            public final void run() {
                this.f31099a.k(bVar, i);
            }
        });
    }

    public void m(View view, float f, float f2, boolean z) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33288a = 2;
        bVar.g = view;
        bVar.h = f;
        bVar.i = f2;
        if (z) {
            A();
        } else {
            z();
        }
    }

    public void n(String str, String str2, View view) {
        o(str, str2, view, null);
    }

    public void o(String str, String str2, View view, a aVar) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33288a = 2;
        bVar.f33289b = str;
        bVar.c = str2;
        bVar.g = view;
        A();
    }

    public final void p() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        b bVar = this.e;
        String strH = h(ShareUtil.INSTANCE.saveImageToTmp(ShareUtil.loadBitmapFromView(bVar.g, bVar.h, bVar.i)).getPath());
        Logger.d("ShareComponent", "shareImageViaMore path=" + strH);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(strH));
        intent.setType("image/*");
        this.d.get().startActivity(Intent.createChooser(intent, this.e.f33289b));
    }

    public final void q(b bVar, int i) {
        if (bVar.e == null) {
            Toast.makeText(AppUtil.getApp(), z0j.common_hint_unkonwn_error, 0).show();
        } else {
            o3r.i().C(bVar.e, i);
        }
    }

    public final void r() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.e.e);
        intent.setType("text/*");
        this.d.get().startActivity(Intent.createChooser(intent, null));
    }

    public final void s(int i) {
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        int i2 = bVar.f33288a;
        if (i2 == 2) {
            l(bVar, i);
        } else if (i2 == 3) {
            w(bVar, i);
        } else if (i2 == 1) {
            q(bVar, i);
        }
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        i7m i7mVar = this.f33286a;
        if (i7mVar != null) {
            i7mVar.setOnDismissListener(onDismissListener);
        }
    }

    public void setOnMedalWallPageShareMethodListener(OnMedalWallPageShareMethodListener onMedalWallPageShareMethodListener) {
        this.g = onMedalWallPageShareMethodListener;
    }

    public void setOnShareMethodListener(s9h s9hVar) {
        this.f = s9hVar;
    }

    public final void t() {
        int i = this.e.f33288a;
        if (i == 2) {
            p();
        } else if (i == 3) {
            y();
        } else if (i == 1) {
            r();
        }
    }

    public void u(String str, String str2, View view) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33289b = str;
        bVar.c = str2;
        bVar.g = view;
        l(bVar, 0);
        s9h s9hVar = this.f;
        if (s9hVar != null) {
            s9hVar.onShareMethodClicked(0);
        }
    }

    public void v(String str, String str2, View view) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33289b = str;
        bVar.c = str2;
        bVar.g = view;
        l(bVar, 1);
        s9h s9hVar = this.f;
        if (s9hVar != null) {
            s9hVar.onShareMethodClicked(1);
        }
    }

    public void w(b bVar, int i) {
        if (bVar.d == null) {
            q(bVar, i);
        } else {
            o3r.i().F(bVar.d, bVar.f33289b, bVar.c, bVar.f, i, null);
        }
    }

    public void x(String str, String str2, String str3, String str4, boolean z) {
        b bVar = new b();
        this.e = bVar;
        bVar.f33288a = 3;
        bVar.f33289b = str;
        bVar.c = str2;
        bVar.d = str3;
        bVar.f = str4;
        bVar.j = z;
        A();
    }

    public final void y() {
        String str = this.e.d;
        if (str == null || str.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            r();
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.e.d);
        String str2 = this.e.f33289b;
        if (str2 != null && !str2.isEmpty()) {
            intent.putExtra("android.intent.extra.TITLE", this.e.f33289b);
        }
        String str3 = this.e.f;
        if (str3 != null && !str3.isEmpty()) {
            intent.setData(Uri.parse(this.e.f));
            intent.setFlags(1);
        }
        this.d.get().startActivity(Intent.createChooser(intent, this.e.c));
    }

    public final void z() {
        BaseActivity baseActivity = this.d.get();
        if (baseActivity == null) {
            return;
        }
        this.h = (ViewGroup) baseActivity.findViewById(R.id.content);
        if (this.f33287b == null) {
            this.f33287b = new SharePopupView(baseActivity, g());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.h.removeView(this.f33287b);
        this.h.addView(this.f33287b, -1, layoutParams);
    }
}
