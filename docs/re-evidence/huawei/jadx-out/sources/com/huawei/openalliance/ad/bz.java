package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.uiengine.ISplashApi;
import com.huawei.openalliance.ad.activity.SplashFeedbackActivity;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public class bz extends ISplashApi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected rc f18327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jj f18328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentRecord f18329c;
    private Context d;
    private WeakReference<Context> e;
    private String f;
    private com.huawei.openalliance.ad.analysis.c g;

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public Bundle callMethodForResult(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        return null;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void updatePhyShowStart(long j) {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.a(j);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void toShowSpare(int i) {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.b(i);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void reportSplashEvent(Bundle bundle) {
        com.huawei.openalliance.ad.analysis.c cVar = this.g;
        if (cVar != null) {
            cVar.a(bundle, this.f18329c);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void reportShowStartEvent() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.i();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void reportEvents(String str, Bundle bundle) {
        byte b2;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "playStart":
                b2 = 0;
                break;
            case "playEnd":
                b2 = 1;
                break;
            case "rptSoundBtnEvent":
                b2 = 2;
                break;
            case "playTime":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(bundle);
            return;
        }
        if (b2 == 1) {
            c(bundle);
        } else if (b2 == 2) {
            a(bundle);
        } else {
            if (b2 != 3) {
                return;
            }
            d(bundle);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void removeExSplashBlock() {
        com.huawei.openalliance.ad.utils.as.i(this.d);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean processWhyEventUnified() {
        return com.huawei.openalliance.ad.utils.as.a(this.d, this.f18329c);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean onTouch(int i, int i2, long j, String str, int i3) {
        hw.b("SplashProxy", "onTouch");
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            return jjVar.a(i, i2, this.f18329c, Long.valueOf(j), (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(str, MaterialClickInfo.class, new Class[0]), i3);
        }
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onStartEasterEggFailed(Bundle bundle) {
        hw.a("SplashProxy", "onStartEasterEggFailed");
        if (pz.a(this.d).a() == null && this.f18329c != null) {
            pz.a(this.d).a(this.f18329c);
        }
        pz pzVarA = pz.a(this.d);
        ContentRecord contentRecord = this.f18329c;
        pzVarA.a(contentRecord == null ? null : contentRecord.ac(), bundle);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onSkipAd(int i, int i2) {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.a(i, i2);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onMaterialLoaded() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.s();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onMaterialLoadFailed() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.f(this.f18329c);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onFeedback(int i) {
        try {
            hw.b("SplashProxy", "onFeedback");
            new com.huawei.openalliance.ad.analysis.i(this.d).a("145", "", "", "");
            Intent intent = new Intent(this.d, (Class<?>) SplashFeedbackActivity.class);
            intent.setPackage(this.d.getPackageName());
            intent.putExtra(MapKeyNames.SPLASH_CLICKABLE_TYPE, i);
            if (!(this.d instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.huawei.openalliance.ad.utils.dk.a(this.d, intent);
            jj jjVar = this.f18328b;
            if (jjVar != null) {
                jjVar.f();
            }
        } catch (Throwable th) {
            hw.c("SplashProxy", "onFeedback err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onEasterEggPrepare() {
        hw.a("SplashProxy", "onEasterEggPrepare");
        pz.a(this.d).a(this.f18329c.ac());
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onDisplayTimeUp() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.u();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onAdShowEnd(long j, int i) {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.a(this.f18329c, j, i);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onAdFailToDisplay() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.B();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public String notifyAdLoaded() {
        jj jjVar = this.f18328b;
        if (jjVar == null) {
            return null;
        }
        jjVar.a(this.f18329c);
        return this.f18328b.y();
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void notifyAdFailedToLoad(int i) {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.c(i);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void notifyAdDismissed() {
        jj jjVar = this.f18328b;
        if (jjVar != null) {
            jjVar.j();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean isFinishing() {
        if (this.e.get() instanceof Activity) {
            return ((Activity) this.e.get()).isFinishing();
        }
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean isDestroyed() {
        if (this.e.get() instanceof Activity) {
            return ((Activity) this.e.get()).isDestroyed();
        }
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void callMethod(String str, IObjectWrapper iObjectWrapper, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hw.b("SplashProxy", "callMethod: %s", str);
        str.hashCode();
        if (str.equals("reportCommonEvent")) {
            new bs(this.d).a(bundle, this.f18329c, this.f18327a);
        } else if (str.equals("onCommonAnalysis")) {
            new br(this.d).a(bundle, this.f18329c, this.f18327a);
        } else {
            hw.b("SplashProxy", "call method fall to default.");
        }
    }

    private void d(Bundle bundle) {
        ContentRecord contentRecord = this.f18329c;
        if (contentRecord == null || this.f18327a == null) {
            hw.b("SplashProxy", "contentRecord or eventProcessor is null");
            return;
        }
        if (bundle != null) {
            try {
                if (contentRecord.l() != null && this.f18329c.l().equals(this.f)) {
                    hw.b("SplashProxy", "Duplicate escalation videoTime event for %s", this.f18329c.l());
                    return;
                }
                this.f18327a.a(bundle.getLong(ParamConstants.Param.VIDEO_PLAY_TIME));
                this.f = this.f18329c.l();
            } catch (Throwable th) {
                hw.c("SplashProxy", "reportPlayTime err: %s", th.getClass().getSimpleName());
            }
        }
    }

    private void c(Bundle bundle) {
        try {
            this.f18327a.c(bundle.getLong("startTime"), bundle.getLong("endTime"), (int) bundle.getLong(ParamConstants.Param.START_PROGRESS), (int) bundle.getLong(ParamConstants.Param.END_PROGRESS));
        } catch (Throwable th) {
            hw.c("SplashProxy", "reportPlayEnd err: %s", th.getClass().getSimpleName());
        }
    }

    private void b(Bundle bundle) {
        this.f18327a.c();
    }

    private void a(Bundle bundle) {
        try {
            this.f18327a.b(bundle.getBoolean("isMute"));
        } catch (Throwable th) {
            hw.c("SplashProxy", "reportSoundClickEvent err: %s", th.getClass().getSimpleName());
        }
    }

    public bz(Context context, jj jjVar, ContentRecord contentRecord) {
        this.d = context.getApplicationContext();
        this.e = new WeakReference<>(context);
        this.f18328b = jjVar;
        this.f18329c = contentRecord;
        this.f18327a = new pc(context, new tc(context, 1), contentRecord);
        this.g = new com.huawei.openalliance.ad.analysis.c(this.d);
    }
}
