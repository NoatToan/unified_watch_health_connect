package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.core.view.GravityCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class qlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f46435c;
    private boolean e;
    private WindowManager.LayoutParams g;
    private Application.ActivityLifecycleCallbacks i;
    private qla j;
    private boolean d = false;
    private WindowManager h = (WindowManager) BaseApplication.f().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);

    public void d(qla qlaVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        LogUtil.a("FloatingWindowMgr", "setFloatingWindow callback:", activityLifecycleCallbacks);
        this.j = qlaVar;
        this.g = qlaVar.d();
        if (activityLifecycleCallbacks != null) {
            this.i = activityLifecycleCallbacks;
        } else {
            this.i = new d();
        }
        if (!this.f46433a) {
            BaseApplication.f().registerActivityLifecycleCallbacks(this.i);
            this.f46433a = true;
        }
        int i = this.g.gravity;
        this.e = (i & 112) == 80;
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 8388613) {
            this.f46434b = true;
        } else if (i2 == 8388611) {
            this.f46434b = false;
        } else {
            this.f46434b = i2 == 5;
        }
    }

    public void e() {
        LogUtil.a("FloatingWindowMgr", "showFloatingWindow");
        b(BaseApplication.j());
    }

    public void d() {
        LogUtil.a("FloatingWindowMgr", "removeFloatingWindow");
        a();
        this.j = null;
        if (!this.f46433a || this.i == null) {
            return;
        }
        BaseApplication.f().unregisterActivityLifecycleCallbacks(this.i);
        this.i = null;
        this.f46433a = false;
    }

    public void c() {
        this.j.c().setOnTouchListener(new View.OnTouchListener() { // from class: qlh.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f46436a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f46437b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f46438c;
            private int e;
            private float h;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f46437b = motionEvent.getRawX();
                    this.h = motionEvent.getRawY();
                    this.e = qlh.this.g.x;
                    this.f46438c = qlh.this.g.y;
                    this.f46436a = false;
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX() - this.f46437b;
                        float rawY = motionEvent.getRawY() - this.h;
                        if (qlh.this.f46434b) {
                            qlh.this.g.x = this.e - ((int) rawX);
                        } else {
                            qlh.this.g.x = this.e + ((int) rawX);
                        }
                        if (qlh.this.e) {
                            qlh.this.g.y = this.f46438c - ((int) rawY);
                        } else {
                            qlh.this.g.y = this.f46438c + ((int) rawY);
                        }
                        int scaledTouchSlop = ViewConfiguration.get(BaseApplication.b()).getScaledTouchSlop();
                        if (!this.f46436a) {
                            float f = scaledTouchSlop;
                            if (Math.abs(rawX) > f || Math.abs(rawY) > f) {
                                this.f46436a = true;
                            }
                        }
                        qlh.this.h.updateViewLayout(qlh.this.j.c(), qlh.this.g);
                        return true;
                    }
                    if (action != 3) {
                        return false;
                    }
                }
                if (!this.f46436a) {
                    view.performClick();
                }
                this.f46436a = false;
                return true;
            }
        });
    }

    public void b(final Activity activity) {
        if (activity == null) {
            LogUtil.j("FloatingWindowMgr", "activity is empty");
            return;
        }
        if (this.d && activity == this.f46435c) {
            LogUtil.j("FloatingWindowMgr", "floatingWindow is attached");
            return;
        }
        qla qlaVar = this.j;
        if (qlaVar == null) {
            return;
        }
        if (qlaVar.c().getParent() != null) {
            this.h.removeView(this.j.c());
        }
        this.f46435c = activity;
        LogUtil.a("FloatingWindowMgr", "attachToActivity currentActivity:", activity);
        final View decorView = activity.getWindow().getDecorView();
        decorView.post(new Runnable() { // from class: qld
            @Override // java.lang.Runnable
            public final void run() {
                this.f46422a.a(activity, decorView);
            }
        });
    }

    /* synthetic */ void a(Activity activity, View view) {
        if (activity != this.f46435c) {
            LogUtil.j("FloatingWindowMgr", "activity changed");
            return;
        }
        this.g.token = view.getWindowToken();
        try {
            this.h.addView(this.j.c(), this.g);
            this.d = true;
        } catch (Exception e) {
            LogUtil.j("FloatingWindowMgr", "addView exception:", e.getMessage());
        }
    }

    private void a() {
        qla qlaVar;
        LogUtil.a("FloatingWindowMgr", "detach currentActivity:", this.f46435c);
        if (this.d && (qlaVar = this.j) != null && qlaVar.c().getParent() != null) {
            this.h.removeView(this.j.c());
            LogUtil.a("FloatingWindowMgr", "really detach");
            this.d = false;
        }
        this.f46435c = null;
    }

    class d implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        private d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            LogUtil.a("FloatingWindowMgr", "onActivityResumed ", activity.getComponentName().getClassName());
            qlh.this.b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            LogUtil.a("FloatingWindowMgr", "onActivityDestroyed ", activity.getComponentName().getClassName());
            if ("com.huawei.health.MainActivity".equals(activity.getComponentName().getClassName())) {
                qlh.this.d();
            }
        }
    }
}
