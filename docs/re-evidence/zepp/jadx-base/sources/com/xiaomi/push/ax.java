package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ax extends ba {
    private Bitmap k;
    private Bitmap l;
    private int m;

    public ax(Context context, String str) {
        super(context, str);
        this.m = 16777216;
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a */
    public ax setLargeIcon(Bitmap bitmap) {
        if (m3593b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.k = bitmap;
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ay
    /* JADX INFO: renamed from: a */
    public ax mo3576a(String str) {
        if (m3593b() && !TextUtils.isEmpty(str)) {
            try {
                this.m = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ba, android.app.Notification.Builder
    /* JADX INFO: renamed from: a */
    public ba setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a */
    public String mo3590a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.ba, com.xiaomi.push.ay
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3574a() {
        RemoteViews remoteViewsA;
        Bitmap bitmapA;
        if (!m3593b() || this.k == null) {
            m3592b();
            return;
        }
        super.mo3574a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int iA = a(resources, "bg", "id", packageName);
        if (com.xiaomi.channel.commonutils.android.f.a(a()) >= 10) {
            remoteViewsA = a();
            bitmapA = a(this.k, 30.0f);
        } else {
            remoteViewsA = a();
            bitmapA = this.k;
        }
        remoteViewsA.setImageViewBitmap(iA, bitmapA);
        int iA2 = a(resources, "icon", "id", packageName);
        if (this.l != null) {
            a().setImageViewBitmap(iA2, this.l);
        } else {
            a(iA2);
        }
        int iA3 = a(resources, "title", "id", packageName);
        a().setTextViewText(iA3, ((ba) this).f45a);
        Map<String, String> map = ((ba) this).f46a;
        if (map != null && this.m == 16777216) {
            mo3576a(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsA2 = a();
        int i = this.m;
        remoteViewsA2.setTextColor(iA3, (i == 16777216 || !m3591a(i)) ? -1 : -16777216);
        setCustomContentView(a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // com.xiaomi.push.ba
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo3575a() {
        if (!com.xiaomi.channel.commonutils.android.f.m3426a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(a().getResources(), "bg", "id", a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || com.xiaomi.channel.commonutils.android.f.a(a()) < 9) ? false : true;
    }

    public ax b(Bitmap bitmap) {
        if (m3593b() && bitmap != null) {
            this.l = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.ba
    public String b() {
        return null;
    }
}
