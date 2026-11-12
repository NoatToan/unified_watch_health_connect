package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class az extends ba {
    private int k;
    private Bitmap l;
    private CharSequence m;
    private PendingIntent n;
    private int o;
    private int p;

    public az(Context context, int i, String str) {
        super(context, i, str);
        this.k = 16777216;
        this.o = 16777216;
        this.p = 16777216;
    }

    private Drawable k(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    private void l(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int iA = a(6.0f);
        remoteViews.setViewPadding(i, iA, 0, iA, 0);
        int i4 = z ? -1 : -16777216;
        remoteViews.setTextColor(i2, i4);
        remoteViews.setTextColor(i3, i4);
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a */
    public az setLargeIcon(Bitmap bitmap) {
        if (m3593b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.l = bitmap;
            }
        }
        return this;
    }

    public az a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m3593b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.m = charSequence;
            this.n = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.ay
    /* JADX INFO: renamed from: a */
    public az mo3576a(String str) {
        if (m3593b() && !TextUtils.isEmpty(str)) {
            try {
                this.o = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a */
    public String mo3590a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.ba, com.xiaomi.push.ay
    /* JADX INFO: renamed from: a */
    public void mo3574a() {
        RemoteViews remoteViewsA;
        Bitmap bitmapA;
        boolean zM3591a;
        RemoteViews remoteViewsA2;
        RemoteViews remoteViewsA3;
        Drawable drawableK;
        if (!m3593b()) {
            m3592b();
            return;
        }
        super.mo3574a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int iA = a(resources, "icon", "id", packageName);
        if (((ba) this).a == null) {
            a(iA);
        } else {
            a().setImageViewBitmap(iA, ((ba) this).a);
        }
        int iA2 = a(resources, "title", "id", packageName);
        int iA3 = a(resources, "content", "id", packageName);
        a().setTextViewText(iA2, ((ba) this).f45a);
        a().setTextViewText(iA3, this.b);
        if (!TextUtils.isEmpty(this.m)) {
            int iA4 = a(resources, "buttonContainer", "id", packageName);
            int iA5 = a(resources, "button", "id", packageName);
            int iA6 = a(resources, "buttonBg", "id", packageName);
            a().setViewVisibility(iA4, 0);
            a().setTextViewText(iA5, this.m);
            a().setOnClickPendingIntent(iA4, this.n);
            if (this.o != 16777216) {
                int iA7 = a(70.0f);
                int iA8 = a(29.0f);
                a().setImageViewBitmap(iA6, com.xiaomi.push.service.ag.a(k(this.o, iA7, iA8, iA8 / 2.0f)));
                a().setTextColor(iA5, m3591a(this.o) ? -1 : -16777216);
            }
        }
        int iA9 = a(resources, "bg", "id", packageName);
        int iA10 = a(resources, "container", "id", packageName);
        if (this.k == 16777216) {
            if (this.l != null) {
                if (com.xiaomi.channel.commonutils.android.f.a(a()) >= 10) {
                    remoteViewsA = a();
                    bitmapA = a(this.l, 30.0f);
                } else {
                    remoteViewsA = a();
                    bitmapA = this.l;
                }
                remoteViewsA.setImageViewBitmap(iA9, bitmapA);
                Map<String, String> map = ((ba) this).f46a;
                if (map != null && this.p == 16777216) {
                    c(map.get("notification_image_text_color"));
                }
                int i = this.p;
                zM3591a = i == 16777216 || !m3591a(i);
                remoteViewsA2 = a();
            } else if (Build.VERSION.SDK_INT >= 24) {
                a().setViewVisibility(iA, 8);
                a().setViewVisibility(iA9, 8);
                try {
                    z.a((Object) this, "setStyle", com.xiaomi.channel.commonutils.android.k.a(a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("load class DecoratedCustomViewStyle failed");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("miui.customHeight", true);
            addExtras(bundle);
            setCustomContentView(a());
        }
        if (com.xiaomi.channel.commonutils.android.f.a(a()) >= 10) {
            remoteViewsA3 = a();
            drawableK = k(this.k, 984, 192, 30.0f);
        } else {
            remoteViewsA3 = a();
            drawableK = k(this.k, 984, 192, 0.0f);
        }
        remoteViewsA3.setImageViewBitmap(iA9, com.xiaomi.push.service.ag.a(drawableK));
        remoteViewsA2 = a();
        zM3591a = m3591a(this.k);
        l(remoteViewsA2, iA10, iA2, iA3, zM3591a);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("miui.customHeight", true);
        addExtras(bundle2);
        setCustomContentView(a());
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a */
    public boolean mo3575a() {
        if (!com.xiaomi.channel.commonutils.android.f.m3426a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    public az b(String str) {
        if (m3593b() && !TextUtils.isEmpty(str)) {
            try {
                this.k = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ba
    public String b() {
        return "notification_colorful_copy";
    }

    public az c(String str) {
        if (m3593b() && !TextUtils.isEmpty(str)) {
            try {
                this.p = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("parse colorful notification image text color error");
            }
        }
        return this;
    }
}
