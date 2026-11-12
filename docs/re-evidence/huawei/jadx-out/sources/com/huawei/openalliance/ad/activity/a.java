package com.huawei.openalliance.ad.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.ae;
import com.huawei.openalliance.ad.views.i;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class a extends e implements jq.a {
    private static Context s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f18204c;
    protected int d;
    protected RelativeLayout e;
    protected View f;
    protected View g;
    protected int[] h;
    protected int[] i;
    protected i j;
    protected i k;
    protected i l;
    protected ImageView m;
    protected ImageView n;
    protected ImageView o;
    private C0197a q;
    private boolean r = false;

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
    }

    protected void b() {
    }

    protected void c() {
    }

    protected int d() {
        return 0;
    }

    protected void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setBackgroundDrawableResource(R.color.hiad_transparent);
            getWindow().setFlags(67108864, 67108864);
            setContentView(d());
            s = getApplicationContext();
            h();
            if (!i()) {
                hw.c("BaseDialogActivity", "getIntentExtra return false");
                b();
                finish();
                return;
            }
            j();
            getWindow().addFlags(134217728);
            c();
            n();
            l();
            m();
            g();
            o();
            e();
        } catch (Throwable th) {
            hw.c("BaseDialogActivity", "onCreate ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        finish();
    }

    protected void k() {
        try {
            C0197a c0197a = this.q;
            if (c0197a != null) {
                unregisterReceiver(c0197a);
            }
            jq.a().b(NotifyMessageNames.FEEDBACK_RECEIVE, this);
        } catch (Throwable th) {
            hw.c("BaseDialogActivity", "unRegisterReceiver: %s", th.getClass().getSimpleName());
        }
    }

    protected void j() {
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    protected boolean i() {
        try {
            SafeIntent safeIntent = new SafeIntent(getIntent());
            this.h = safeIntent.getIntArrayExtra(MapKeyNames.ANCHOR_LOCATION);
            this.i = safeIntent.getIntArrayExtra(MapKeyNames.ANCHOR_SIZE);
            if (!a(this.h) && !a(this.i)) {
                if (dk.c()) {
                    int[] iArr = this.h;
                    int i = (this.f18202a - iArr[0]) - this.i[0];
                    iArr[0] = i;
                    hw.b("BaseDialogActivity", "rtl mAnchorViewLoc[x,y]= %d, %d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
                }
                if (dk.b((Activity) this)) {
                    int iY = dk.y(this);
                    int[] iArr2 = this.h;
                    iArr2[1] = iArr2[1] - iY;
                    hw.a("BaseDialogActivity", "windowing mode is freeform");
                    hw.a("BaseDialogActivity", "initDevicesInfo dragBarHeight: %s", Integer.valueOf(iY));
                }
                return true;
            }
            hw.c("BaseDialogActivity", "mAnchorViewLoc or mAnchorViewSize is unavailable");
            return false;
        } catch (Throwable th) {
            hw.c("BaseDialogActivity", "getIntentExtra error: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    protected void h() {
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f18202a = getWindowManager().getCurrentWindowMetrics().getBounds().width();
            iHeight = getWindowManager().getCurrentWindowMetrics().getBounds().height();
        } else {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            this.f18202a = point.x;
            iHeight = point.y;
        }
        this.f18203b = iHeight;
        hw.a("BaseDialogActivity", "initDevicesInfo screenWidth: %s, screenHeight: %s", Integer.valueOf(this.f18202a), Integer.valueOf(iHeight));
        this.f18204c = dk.k(this);
        this.d = as.a(this, 22.0f);
    }

    protected void g() {
        ImageView imageView;
        float f;
        int iA = as.a(this, 36.0f);
        int i = this.d;
        int i2 = (this.f18202a - i) - iA;
        int i3 = (this.h[0] + (this.i[0] >> 1)) - (iA >> 1);
        if (i3 >= i) {
            i = i3;
        }
        if (i <= i2) {
            i2 = i;
        }
        if (dk.c()) {
            imageView = this.o;
            f = -i2;
        } else {
            imageView = this.o;
            f = i2;
        }
        imageView.setX(f);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
        hw.b("BaseDialogActivity", "finish");
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    protected void f() {
        int i;
        int iA;
        int iA2;
        int viewWith;
        hw.b("BaseDialogActivity", "getRealOrientation orientation %s", Integer.valueOf(this.f18204c));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        int iAbs = Math.abs((int) this.o.getX());
        int iA3 = as.a(this, 36.0f);
        int i2 = (iA3 >> 1) + iAbs;
        double d = ((double) iA3) * 0.5d;
        int viewWidthPercent = (int) ((((double) (this.f18202a * (1.0f - this.l.getViewWidthPercent()))) * 0.5d) + ((double) as.a(this, 16.0f)) + d);
        int viewWidthPercent2 = (int) (((((double) this.f18202a) * ((((double) this.l.getViewWidthPercent()) * 0.5d) + 0.5d)) - ((double) as.a(this, 16.0f))) - d);
        hw.a("BaseDialogActivity", "locationX: %s, locationX2: %s", Integer.valueOf(viewWidthPercent), Integer.valueOf(viewWidthPercent2));
        hw.a("BaseDialogActivity", "curImgX: %s, curImgWidth: %s, curImgCenter: %s", Integer.valueOf(iAbs), Integer.valueOf(iA3), Integer.valueOf(i2));
        int i3 = this.f18204c;
        if (1 != i3 && 9 != i3) {
            layoutParams.removeRule(14);
            this.l.setLayoutParams(layoutParams);
            int i4 = this.f18202a;
            if (i2 < i4 / 3) {
                iA2 = as.a(this, 16.0f);
                viewWith = iAbs - iA2;
            } else if (i2 < (i4 * 2) / 3) {
                viewWith = i2 - (this.l.getViewWith() >> 1);
            } else {
                i = iAbs + iA3;
                iA = as.a(this, 16.0f);
                iAbs = i + iA;
                iA2 = this.l.getViewWith();
                viewWith = iAbs - iA2;
            }
            this.l.setPaddingStart(viewWith);
        } else if (i2 < viewWidthPercent) {
            hw.a("BaseDialogActivity", "curImgCenter < locationX");
            layoutParams.removeRule(14);
            this.l.setLayoutParams(layoutParams);
            iA2 = as.a(this, 16.0f);
            viewWith = iAbs - iA2;
            this.l.setPaddingStart(viewWith);
        } else if (i2 > viewWidthPercent2) {
            hw.a("BaseDialogActivity", "curImgCenter > locationX2");
            layoutParams.removeRule(14);
            this.l.setLayoutParams(layoutParams);
            i = iAbs + iA3;
            iA = as.a(this, 16.0f);
            iAbs = i + iA;
            iA2 = this.l.getViewWith();
            viewWith = iAbs - iA2;
            this.l.setPaddingStart(viewWith);
        } else {
            hw.a("BaseDialogActivity", "locationX =< curImgCenter =< locationX2");
            layoutParams.addRule(14);
            this.l.setLayoutParams(layoutParams);
        }
        dk.a(this, new b(this));
    }

    @Override // com.huawei.openalliance.ad.jq.a
    public void a(String str, Intent intent) {
        if (TextUtils.isEmpty(str) || intent == null) {
            hw.b("BaseDialogActivity", "msgName or msgData is empty!");
            return;
        }
        hw.a("BaseDialogActivity", "onMessageNotify msgName:%s", str);
        try {
            String action = intent.getAction();
            hw.b("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
            if ("com.huawei.ads.feedback.action.ANCHOR_LOCATION_CHANGE".equals(action) || "com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY".equals(action)) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hw.b("BaseDialogActivity", "anchor point changed, do finish.");
                        a.this.finish();
                    }
                });
            }
        } catch (Throwable th) {
            hw.c("BaseDialogActivity", "error: " + th.getClass().getSimpleName());
        }
    }

    private void o() {
        try {
            this.q = new C0197a();
            registerReceiver(this.q, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", null);
            as.a(getBaseContext(), this.q, new IntentFilter(Constants.CLICK_STATUS_BAR_ACTION), Constants.SYSTEM_UI_PERMISSION, (Handler) null);
            jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, this);
        } catch (Throwable th) {
            hw.c("BaseDialogActivity", "registerReceiver error: %s", th.getClass().getSimpleName());
        }
    }

    private void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.e.setForceDarkAllowed(false);
        }
    }

    private void m() {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.h[0];
            layoutParams2.height = this.h[1];
            this.f.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.g.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.width = this.i[0];
            layoutParams4.height = this.i[1];
            this.g.setLayoutParams(layoutParams4);
        }
    }

    private void l() {
        int i;
        if (this.h[1] + (this.i[1] >> 1) > (this.f18203b >> 1)) {
            this.k.setVisibility(8);
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            this.l = this.j;
            this.o = this.m;
            int iH = as.h(this);
            if (cc.a(this).a(this)) {
                iH = Math.max(iH, cc.a(this).a(this.e));
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.setMargins(0, iH, 0, 0);
            this.l.setLayoutParams(layoutParams);
            return;
        }
        this.j.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(0);
        this.l = this.k;
        this.o = this.n;
        boolean zN = ab.n(this);
        boolean z = ab.o(this) && (1 == (i = this.f18204c) || 9 == i);
        boolean z2 = ab.q(this) && ab.r(this);
        if (zN || z || z2) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, Math.max(as.a(this, 40.0f), dk.g(this)));
            this.l.setLayoutParams(layoutParams2);
        }
    }

    private boolean a(int[] iArr) {
        return iArr == null || iArr.length != 2;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.activity.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes12.dex */
    class C0197a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                hw.b("BaseDialogActivity", "intent is empty");
                return;
            }
            String action = intent.getAction();
            hw.b("BaseDialogActivity", "FeedbackEventReceiver action = %s", action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action) || Constants.CLICK_STATUS_BAR_ACTION.equals(action)) {
                a.this.finish();
            }
        }

        private C0197a() {
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    static class b implements ae {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<a> f18207a;

        @Override // com.huawei.openalliance.ad.views.ae
        public void a(int i) {
            a aVar = this.f18207a.get();
            if (aVar == null || aVar.r) {
                return;
            }
            hw.b("BaseDialogActivity", "got safePadding: %s", Integer.valueOf(i));
            aVar.a(i);
        }

        public b(a aVar) {
            this.f18207a = new WeakReference<>(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        i iVar = this.l;
        if (iVar != null) {
            iVar.a(i);
        }
        if (this.o != null) {
            this.d += i;
            g();
        }
        this.r = true;
    }
}
