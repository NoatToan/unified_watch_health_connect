package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class qss extends yss {
    public Bitmap m;
    public Bitmap n;
    public int o;

    public qss(Context context, String str) {
        super(context, str);
        this.o = 16777216;
    }

    public qss G(Bitmap bitmap) {
        if (y() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                x9s.o("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.m = bitmap;
            }
        }
        return this;
    }

    public qss H(String str) {
        if (y() && !TextUtils.isEmpty(str)) {
            try {
                this.o = Color.parseColor(str);
            } catch (Exception unused) {
                x9s.o("parse banner notification image text color error");
            }
        }
        return this;
    }

    public qss I(Bitmap bitmap) {
        if (y() && bitmap != null) {
            this.n = bitmap;
        }
        return this;
    }

    @Override // defpackage.yss, defpackage.sss
    public void g() {
        if (!y() || this.m == null) {
            x();
            return;
        }
        super.g();
        Resources resources = c().getResources();
        String packageName = c().getPackageName();
        int iA = a(resources, "bg", "id", packageName);
        if (y0t.b(c()) >= 10) {
            k().setImageViewBitmap(iA, j(this.m, 30.0f));
        } else {
            k().setImageViewBitmap(iA, this.m);
        }
        int iA2 = a(resources, "icon", "id", packageName);
        if (this.n != null) {
            k().setImageViewBitmap(iA2, this.n);
        } else {
            r(iA2);
        }
        int iA3 = a(resources, "title", "id", packageName);
        k().setTextViewText(iA3, this.e);
        Map<String, String> map = this.g;
        if (map != null && this.o == 16777216) {
            H(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsK = k();
        int i = this.o;
        remoteViewsK.setTextColor(iA3, (i == 16777216 || !u(i)) ? -1 : -16777216);
        setCustomContentView(k());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // defpackage.yss, android.app.Notification.Builder
    /* JADX INFO: renamed from: o */
    public yss setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // defpackage.yss
    public String q() {
        return "notification_banner";
    }

    @Override // defpackage.yss
    public boolean t() {
        if (!y0t.i()) {
            return false;
        }
        Resources resources = c().getResources();
        String packageName = c().getPackageName();
        return (a(c().getResources(), "bg", "id", c().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || y0t.b(c()) < 9) ? false : true;
    }

    @Override // defpackage.yss
    public String w() {
        return null;
    }
}
