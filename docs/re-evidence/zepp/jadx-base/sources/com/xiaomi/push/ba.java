package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ba extends ay {
    public Bitmap a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public CharSequence f45a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f46a;
    public CharSequence b;
    private RemoteViews d;
    private boolean e;
    private int f;
    private String g;
    private boolean h;
    private ArrayList<Notification.Action> i;
    private int j;

    public ba(Context context, int i, String str) {
        super(context);
        this.i = new ArrayList<>();
        this.j = 0;
        this.g = str;
        this.f = i;
        e();
    }

    public ba(Context context, String str) {
        this(context, 0, str);
    }

    private Bitmap c() {
        return com.xiaomi.push.service.ag.a(com.xiaomi.channel.commonutils.android.a.m3416a(a(), this.g));
    }

    private String d() {
        boolean zI = i();
        this.h = zI;
        return zI ? b() : mo3590a();
    }

    private void e() {
        int iA = a(a().getResources(), d(), "layout", a().getPackageName());
        if (iA == 0) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("create RemoteViews failed, no such layout resource was found");
        } else {
            this.d = new RemoteViews(a().getPackageName(), iA);
            this.e = mo3575a();
        }
    }

    private boolean f() {
        Map<String, String> map = this.f46a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    private void g() {
        super.setContentTitle(this.f45a);
        super.setContentText(this.b);
    }

    private boolean h() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.g)) ? false : true;
    }

    private boolean i() {
        return h() && j();
    }

    private boolean j() {
        List<StatusBarNotification> listB;
        if (Build.VERSION.SDK_INT >= 20 && (listB = com.xiaomi.push.service.aq.a(a(), this.g).b()) != null && !listB.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listB) {
                if (statusBarNotification.getId() == this.f) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification == null) {
                        return false;
                    }
                    return !notification.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    public int a(float f) {
        return (int) ((f * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public Bitmap a(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public final RemoteViews a() {
        return this.d;
    }

    @Override // com.xiaomi.push.ay
    public ay a(Map<String, String> map) {
        this.f46a = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ba addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ba addAction(Notification.Action action) {
        if (action != null) {
            this.i.add(action);
        }
        int i = this.j;
        this.j = i + 1;
        a(i, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ba setLargeIcon(Bitmap bitmap) {
        this.a = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ba setContentTitle(CharSequence charSequence) {
        this.f45a = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public abstract String mo3590a();

    @Override // com.xiaomi.push.ay
    /* JADX INFO: renamed from: a */
    public void mo3574a() {
        super.mo3574a();
        Bundle bundle = new Bundle();
        if (h()) {
            bundle.putBoolean("mipush.customCopyLayout", this.h);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.i.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.i.size()];
            this.i.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (f() || !com.xiaomi.push.service.ar.m3822a(a().getContentResolver())) {
            g();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f45a);
            bundle.putCharSequence("mipush.customContent", this.b);
        }
        addExtras(bundle);
    }

    public void a(int i) {
        Bitmap bitmapC = c();
        if (bitmapC != null) {
            a().setImageViewBitmap(i, bitmapC);
            return;
        }
        int iB = com.xiaomi.channel.commonutils.android.a.b(a(), this.g);
        if (iB != 0) {
            a().setImageViewResource(i, iB);
        }
    }

    public void a(int i, Notification.Action action) {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3575a();

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m3591a(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ba setContentText(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public abstract String b();

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m3592b() {
        super.setContentTitle(this.f45a);
        super.setContentText(this.b);
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final boolean m3593b() {
        return this.e;
    }
}
