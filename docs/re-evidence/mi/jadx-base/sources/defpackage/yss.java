package defpackage;

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
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.push.g;
import com.xiaomi.push.service.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yss extends sss {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RemoteViews f40502b;
    public boolean c;
    public Bitmap d;
    public CharSequence e;
    public CharSequence f;
    public Map<String, String> g;
    public int h;
    public String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<Notification.Action> f40503k;
    public int l;

    public yss(Context context, String str) {
        this(context, 0, str);
    }

    public final void A() {
        int iA = a(c().getResources(), z(), "layout", c().getPackageName());
        if (iA == 0) {
            x9s.o("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f40502b = new RemoteViews(c().getPackageName(), iA);
            this.c = t();
        }
    }

    public final boolean B() {
        Map<String, String> map = this.g;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    public final void C() {
        super.setContentTitle(this.e);
        super.setContentText(this.f);
    }

    public final boolean D() {
        return (TextUtils.isEmpty(w()) || TextUtils.isEmpty(this.i)) ? false : true;
    }

    public final boolean E() {
        return D() && F();
    }

    public final boolean F() {
        List<StatusBarNotification> listY = p8s.e(c(), this.i).y();
        if (listY != null && !listY.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listY) {
                if (statusBarNotification.getId() == this.h) {
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

    @Override // defpackage.sss
    public void g() {
        super.g();
        Bundle bundle = new Bundle();
        if (D()) {
            bundle.putBoolean("mipush.customCopyLayout", this.j);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", b("large_icon"));
        if (this.f40503k.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f40503k.size()];
            this.f40503k.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (B() || !s8s.r(c().getContentResolver())) {
            C();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.e);
            bundle.putCharSequence("mipush.customContent", this.f);
        }
        addExtras(bundle);
    }

    public int h(float f) {
        return (int) ((f * c().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final Bitmap i() {
        return l.n(g.d(c(), this.i));
    }

    public Bitmap j(Bitmap bitmap, float f) {
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

    public final RemoteViews k() {
        return this.f40502b;
    }

    public sss l(Map<String, String> map) {
        this.g = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public yss addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public yss addAction(Notification.Action action) {
        if (action != null) {
            this.f40503k.add(action);
        }
        int i = this.l;
        this.l = i + 1;
        s(i, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public yss setLargeIcon(Bitmap bitmap) {
        this.d = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public yss setContentTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public abstract String q();

    public void r(int i) {
        Bitmap bitmapI = i();
        if (bitmapI != null) {
            k().setImageViewBitmap(i, bitmapI);
            return;
        }
        int iM = g.m(c(), this.i);
        if (iM != 0) {
            k().setImageViewResource(i, iM);
        }
    }

    public void s(int i, Notification.Action action) {
    }

    public abstract boolean t();

    public final boolean u(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public yss setContentText(CharSequence charSequence) {
        this.f = charSequence;
        return this;
    }

    public abstract String w();

    public final void x() {
        super.setContentTitle(this.e);
        super.setContentText(this.f);
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    public final boolean y() {
        return this.c;
    }

    public final String z() {
        boolean zE = E();
        this.j = zE;
        return zE ? w() : q();
    }

    public yss(Context context, int i, String str) {
        super(context);
        this.f40503k = new ArrayList<>();
        this.l = 0;
        this.i = str;
        this.h = i;
        A();
    }
}
