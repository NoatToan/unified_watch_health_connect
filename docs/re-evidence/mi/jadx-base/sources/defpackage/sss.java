package defpackage;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"NewApi"})
public class sss extends Notification.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33958a;

    public sss(Context context) {
        super(context);
        this.f33958a = context;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public final int b(String str) {
        return a(c().getResources(), str, "id", c().getPackageName());
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        g();
        return super.build();
    }

    public Context c() {
        return this.f33958a;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public sss addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public sss setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    public sss f(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                zbs.e(this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e) {
                x9s.D("fail to set color. " + e);
            }
        }
        return this;
    }

    public void g() {
    }
}
