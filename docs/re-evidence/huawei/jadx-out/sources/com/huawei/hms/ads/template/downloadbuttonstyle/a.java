package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f12836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f12837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WeakReference<AppDownloadButton> f12838c;
    private BroadcastReceiver d;

    public abstract void a();

    protected abstract void b(Context context);

    public void b() {
        if (this.d != null) {
            this.f12836a.getApplicationContext().unregisterReceiver(this.d);
            this.d = null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.template.downloadbuttonstyle.a$a, reason: collision with other inner class name */
    static class C0097a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f12839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f12840b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                hw.b("BaseDwnButtonStyle", "on Receive");
                a aVar = this.f12840b;
                if (aVar != null) {
                    aVar.f12837b = fp.b(this.f12839a).cB();
                    this.f12840b.a();
                }
            } catch (Throwable th) {
                hw.c("BaseDwnButtonStyle", "ui mode receiver err, %s", th.getClass().getSimpleName());
            }
        }

        public C0097a(Context context, a aVar) {
            this.f12839a = context.getApplicationContext();
            this.f12840b = aVar;
        }
    }

    public void a(Context context) {
        b(context);
        a();
        c();
    }

    private void c() {
        this.d = new C0097a(this.f12836a, this);
        as.a(this.f12836a.getApplicationContext(), this.d, new IntentFilter(Constants.UI_CHANGE_ACTION));
    }

    public a(Context context, AppDownloadButton appDownloadButton) {
        Context applicationContext = context.getApplicationContext();
        this.f12836a = applicationContext;
        this.f12837b = fp.b(applicationContext).cB();
        this.f12838c = new WeakReference<>(appDownloadButton);
    }
}
