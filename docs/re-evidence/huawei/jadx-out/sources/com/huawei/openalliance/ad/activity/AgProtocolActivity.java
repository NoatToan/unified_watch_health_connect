package com.huawei.openalliance.ad.activity;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.appgallery.agd.api.PendingResult;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AgProtocolActivity extends f {
    private static final List<String> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f18111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f18112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f18113c;
    private final com.huawei.openalliance.ad.a e = new a(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            if (HiAd.getInstance(this).getCurActivity() != null) {
                hw.b("resolution", "current activity not null, inherit activity attributes.");
                dk.a(this, HiAd.getInstance(this).getCurActivity());
            } else {
                hw.b("resolution", "current activity is null, skip inherit activity attributes.");
            }
            dk.a(getWindow().getDecorView().findViewById(R.id.content), this);
        } catch (Throwable th) {
            hw.c("resolution", "adaptRingScreen err: %s", th.getClass().getSimpleName());
        }
        super.onCreate(bundle);
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.activity.AgProtocolActivity.1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                Intent intent = AgProtocolActivity.this.getIntent();
                try {
                    PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT);
                    AgProtocolActivity.this.f18112b = intent.getIntExtra("pendingIntent.type", 6);
                    AgProtocolActivity.this.f18111a = intent.getStringExtra("task.pkg");
                    AgProtocolActivity.this.f18113c = intent.getStringExtra(MapKeyNames.AG_ACTION_NAME);
                    AgProtocolActivity.this.b();
                    if (AgProtocolActivity.this.f18112b == 6) {
                        i = 101;
                    } else {
                        i = AgProtocolActivity.this.f18112b == 8888 ? 102 : 100;
                    }
                    int i2 = i;
                    Intent intent2 = new Intent();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder(PendingResult.RESOLUTION_EXTRA_BUNDLE_BINDER, AgProtocolActivity.this.e.asBinder());
                    bundle2.putInt(PendingResult.RESOLUTION_EXTRA_BUNDLE_REQUESTCODE, i2);
                    intent2.putExtra(PendingResult.RESOLUTION_EXTRA_BUNDLE, bundle2);
                    if (AgProtocolActivity.d.contains(AgProtocolActivity.this.getPackageName())) {
                        intent2.putExtra(PendingResult.RESOLUTION_EXTRA_AUTOFINISH, 1);
                    }
                    hw.b("resolution", "resolution type=" + AgProtocolActivity.this.f18112b);
                    AgProtocolActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, intent2, 0, 0, 0);
                } catch (Exception e) {
                    hw.b("resolution", " startIntentSenderForResult error:e=" + e.getClass().getName());
                    AgProtocolActivity.this.finish();
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        int i3;
        super.onActivityResult(i, i2, intent);
        hw.b("resolution", "requestCode=" + i + "resultCode=" + i2);
        if (100 != i) {
            if (101 == i) {
                str = this.f18111a;
                str2 = this.f18113c;
                i3 = 1003;
            } else if (102 == i) {
                if (i2 == -1) {
                    hw.b("resolution", "install hiapp");
                    str = this.f18111a;
                    str2 = this.f18113c;
                    i3 = 1004;
                } else {
                    str = this.f18111a;
                    str2 = this.f18113c;
                    i3 = 1005;
                }
            }
            com.huawei.openalliance.ad.download.ag.f.a(this, i3, str, str2, null);
        } else if (1001 == i2) {
            hw.b("resolution", "AG agree protocol");
            com.huawei.openalliance.ad.download.ag.f.a(this, 1001, this.f18111a, this.f18113c, null);
        } else {
            hw.b("resolution", "AG disagree protocol");
            str = this.f18111a;
            str2 = this.f18113c;
            i3 = 1002;
            com.huawei.openalliance.ad.download.ag.f.a(this, i3, str, str2, null);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        rc rcVarC;
        Context applicationContext = getApplicationContext();
        AppDownloadTask appDownloadTaskA = com.huawei.openalliance.ad.download.ag.d.a(applicationContext).a(this.f18111a);
        new com.huawei.openalliance.ad.analysis.c(applicationContext).a(this.f18111a, (appDownloadTaskA == null || (rcVarC = appDownloadTaskA.C()) == null) ? null : rcVarC.a(), this.f18112b, this.f18113c, "openAgProtocolActivity");
    }

    static class a extends com.huawei.openalliance.ad.a.AbstractBinderC0195a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<AgProtocolActivity> f18115a;

        @Override // com.huawei.openalliance.ad.a
        public void a(final int i) {
            hw.b("resolution", "onActivityCancel requestCode=" + i);
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.AgProtocolActivity.a.1
                @Override // java.lang.Runnable
                public void run() {
                    AgProtocolActivity agProtocolActivity = a.this.f18115a == null ? null : (AgProtocolActivity) a.this.f18115a.get();
                    if (agProtocolActivity != null) {
                        agProtocolActivity.onActivityResult(i, 0, null);
                    }
                }
            });
        }

        public a(AgProtocolActivity agProtocolActivity) {
            this.f18115a = new WeakReference<>(agProtocolActivity);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(Constants.HW_INTELLIEGNT_PACKAGE);
    }
}
