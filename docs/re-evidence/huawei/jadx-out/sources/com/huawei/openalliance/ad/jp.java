package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public abstract class jp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    protected static Map<View, List<jp>> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f19374b;
    private long e;
    private int f;
    private BroadcastReceiver k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19373a = "ViewMonitor";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19375c = false;
    private Rect g = new Rect();
    private boolean h = true;
    private boolean i = true;
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.jp.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            hw.b(jp.this.f19373a, "receive screen state: %s", action);
            if (TextUtils.equals("android.intent.action.SCREEN_ON", action) || TextUtils.equals("android.intent.action.SCREEN_OFF", action) || TextUtils.equals("android.intent.action.USER_PRESENT", action)) {
                jp.this.d();
                jp.this.f();
            }
        }
    };

    protected void a() {
    }

    protected void a(int i) {
    }

    protected void a(long j, int i) {
    }

    public boolean p() {
        return this.f19375c && this.f19374b.isShown();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        if (hw.a()) {
            hw.a(this.f19373a, "onScrollChanged");
        }
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (hw.a()) {
            hw.a(this.f19373a, "onGlobalLayout");
        }
        f();
    }

    public void o() {
        if (this.f19375c) {
            hw.b(this.f19373a, "onViewHidden");
            this.f19375c = false;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
            if (hw.a()) {
                hw.a(this.f19373a, "max physical visible area percentage: %d duration: %d", Integer.valueOf(this.f), Long.valueOf(jCurrentTimeMillis));
            }
            a(jCurrentTimeMillis, this.f);
            this.f = 0;
        }
    }

    public void n() {
        if (this.f19375c) {
            return;
        }
        hw.b(this.f19373a, "onViewShown");
        this.f19375c = true;
        this.e = System.currentTimeMillis();
        a();
    }

    public int m() {
        boolean z = this.h && this.f19374b.isShown() && this.f19374b.getLocalVisibleRect(this.g);
        int width = this.f19374b.getWidth() * this.f19374b.getHeight();
        if (!z || width <= 0) {
            return 0;
        }
        return ((this.g.width() * this.g.height()) * 100) / width;
    }

    public void l() {
        hw.b(this.f19373a, BaseDialog.LIFE_CYCLE_ON_RESUME);
        h();
    }

    public void k() {
        hw.b(this.f19373a, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        e();
        o();
    }

    public void j() {
        hw.b(this.f19373a, "onViewVisibilityChanged");
        f();
    }

    public void i() {
        if (hw.a()) {
            hw.a(this.f19373a, "onViewDetachedFromWindow");
        }
        e();
        o();
    }

    public void h() {
        hw.b(this.f19373a, "onViewAttachedToWindow");
        c();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    public void f() {
        boolean z = this.h && this.f19374b.isShown() && this.f19374b.getLocalVisibleRect(this.g);
        int width = this.f19374b.getWidth() * this.f19374b.getHeight();
        if (z && width > 0) {
            int iWidth = ((this.g.width() * this.g.height()) * 100) / width;
            if (iWidth > this.f) {
                this.f = iWidth;
            }
            a(iWidth);
            if (iWidth > 0) {
                if (z) {
                    n();
                    return;
                }
            }
        } else if (z) {
            n();
            return;
        }
        o();
    }

    private void e() {
        List<jp> listRemove;
        hw.b(this.f19373a, "unregisterObservers");
        View view = this.f19374b;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.i && viewTreeObserver.isAlive() && (listRemove = d.remove(this.f19374b)) != null) {
            for (jp jpVar : listRemove) {
                viewTreeObserver.removeOnGlobalLayoutListener(jpVar);
                viewTreeObserver.removeOnScrollChangedListener(jpVar);
            }
        }
        this.f19374b.setOnSystemUiVisibilityChangeListener(null);
        if (this.k != null) {
            HiAd.a(this.f19374b.getContext()).a(this.k);
            this.k = null;
        }
        d.remove(this.f19374b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Context context = this.f19374b.getContext();
        this.h = com.huawei.openalliance.ad.utils.dk.a(context) && !com.huawei.openalliance.ad.utils.dk.b(context);
        if (hw.a()) {
            hw.a(this.f19373a, "checkScreenState screen available: %s ", Boolean.valueOf(this.h));
        }
    }

    private void c() {
        hw.b(this.f19373a, "registerObservers");
        View view = this.f19374b;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.i && viewTreeObserver.isAlive()) {
            List<jp> copyOnWriteArrayList = d.get(this.f19374b);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                d.put(this.f19374b, copyOnWriteArrayList);
            }
            viewTreeObserver.addOnGlobalLayoutListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            copyOnWriteArrayList.add(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.k = this.j;
        HiAd.a(this.f19374b.getContext()).a(this.k, intentFilter);
        this.h = true;
    }

    private void b() {
        if (this.f19374b != null) {
            this.f19373a = this.f19374b.getClass().getSimpleName() + "ViewMonitor";
        }
    }

    public jp(View view) {
        this.f19374b = view;
        b();
    }
}
