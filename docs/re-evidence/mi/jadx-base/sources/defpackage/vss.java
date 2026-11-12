package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.push.service.l;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vss extends yss {
    public int m;
    public Bitmap n;
    public CharSequence o;
    public PendingIntent p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37195r;

    public vss(Context context, int i, String str) {
        super(context, i, str);
        this.m = 16777216;
        this.q = 16777216;
        this.f37195r = 16777216;
    }

    public final Drawable G(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    public vss H(Bitmap bitmap) {
        if (y() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                x9s.o("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.n = bitmap;
            }
        }
        return this;
    }

    public vss I(CharSequence charSequence, PendingIntent pendingIntent) {
        if (y()) {
            super.addAction(0, charSequence, pendingIntent);
            this.o = charSequence;
            this.p = pendingIntent;
        }
        return this;
    }

    public vss J(String str) {
        if (y() && !TextUtils.isEmpty(str)) {
            try {
                this.q = Color.parseColor(str);
            } catch (Exception unused) {
                x9s.o("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    public final void K(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int iH = h(6.0f);
        remoteViews.setViewPadding(i, iH, 0, iH, 0);
        if (z) {
            remoteViews.setTextColor(i2, -1);
            remoteViews.setTextColor(i3, -1);
        } else {
            remoteViews.setTextColor(i2, -16777216);
            remoteViews.setTextColor(i3, -16777216);
        }
    }

    public vss L(String str) {
        if (y() && !TextUtils.isEmpty(str)) {
            try {
                this.m = Color.parseColor(str);
            } catch (Exception unused) {
                x9s.o("parse colorful notification bg color error");
            }
        }
        return this;
    }

    public vss M(String str) {
        if (y() && !TextUtils.isEmpty(str)) {
            try {
                this.f37195r = Color.parseColor(str);
            } catch (Exception unused) {
                x9s.o("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // defpackage.yss, defpackage.sss
    public void g() {
        if (!y()) {
            x();
            return;
        }
        super.g();
        Resources resources = c().getResources();
        String packageName = c().getPackageName();
        int iA = a(resources, "icon", "id", packageName);
        if (this.d == null) {
            r(iA);
        } else {
            k().setImageViewBitmap(iA, this.d);
        }
        int iA2 = a(resources, "title", "id", packageName);
        int iA3 = a(resources, MiuiCursorConstants.CONTENT, "id", packageName);
        k().setTextViewText(iA2, this.e);
        k().setTextViewText(iA3, this.f);
        if (!TextUtils.isEmpty(this.o)) {
            int iA4 = a(resources, "buttonContainer", "id", packageName);
            int iA5 = a(resources, "button", "id", packageName);
            int iA6 = a(resources, "buttonBg", "id", packageName);
            k().setViewVisibility(iA4, 0);
            k().setTextViewText(iA5, this.o);
            k().setOnClickPendingIntent(iA4, this.p);
            if (this.q != 16777216) {
                int iH = h(70.0f);
                int iH2 = h(29.0f);
                k().setImageViewBitmap(iA6, l.n(G(this.q, iH, iH2, iH2 / 2.0f)));
                k().setTextColor(iA5, u(this.q) ? -1 : -16777216);
            }
        }
        int iA7 = a(resources, "bg", "id", packageName);
        int iA8 = a(resources, "container", "id", packageName);
        if (this.m != 16777216) {
            if (y0t.b(c()) >= 10) {
                k().setImageViewBitmap(iA7, l.n(G(this.m, 984, 192, 30.0f)));
            } else {
                k().setImageViewBitmap(iA7, l.n(G(this.m, 984, 192, 0.0f)));
            }
            K(k(), iA8, iA2, iA3, u(this.m));
        } else if (this.n != null) {
            if (y0t.b(c()) >= 10) {
                k().setImageViewBitmap(iA7, j(this.n, 30.0f));
            } else {
                k().setImageViewBitmap(iA7, this.n);
            }
            Map<String, String> map = this.g;
            if (map != null && this.f37195r == 16777216) {
                M(map.get("notification_image_text_color"));
            }
            int i = this.f37195r;
            K(k(), iA8, iA2, iA3, i == 16777216 || !u(i));
        } else {
            k().setViewVisibility(iA, 8);
            k().setViewVisibility(iA7, 8);
            try {
                zbs.e(this, "setStyle", odt.c(c(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Exception unused) {
                x9s.o("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(k());
    }

    @Override // defpackage.yss
    public String q() {
        return "notification_colorful";
    }

    @Override // defpackage.yss
    public boolean t() {
        if (!y0t.i()) {
            return false;
        }
        Resources resources = c().getResources();
        String packageName = c().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, MiuiCursorConstants.CONTENT, "id", packageName) == 0) ? false : true;
    }

    @Override // defpackage.yss
    public String w() {
        return "notification_colorful_copy";
    }
}
