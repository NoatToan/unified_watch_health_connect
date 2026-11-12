package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.content.ReceiverCallNotAllowedException;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class HwRollbackRuleDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29668a = "HwRollbackRuleDetector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f29670c;
    private int d;
    private GestureDetector e;
    private RollBackScrollListener f;
    private boolean g;
    private Class<?> h;
    private Object i;
    private Context j;
    private Handler n = new c();
    private GestureDetector.OnGestureListener l = new d();

    public interface RollBackScrollListener {
        int getScrollYDistance();
    }

    class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            HwRollbackRuleDetector.this.f29669b = 0;
        }
    }

    class d implements GestureDetector.OnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HwRollbackRuleDetector.this.n.removeMessages(1);
            if (motionEvent == null || motionEvent2 == null || motionEvent.getY() >= motionEvent2.getY() || Math.abs(f2) <= Math.abs(f)) {
                HwRollbackRuleDetector.this.f29669b = 0;
            } else {
                HwRollbackRuleDetector.b(HwRollbackRuleDetector.this);
                HwRollbackRuleDetector.this.a();
                if (HwRollbackRuleDetector.this.b() && HwRollbackRuleDetector.this.e()) {
                    HwRollbackRuleDetector.this.f29669b = 0;
                    HwRollbackRuleDetector.this.d("com.huawei.control.intent.action.RollBackEvent");
                }
                HwRollbackRuleDetector.this.n.sendEmptyMessageDelayed(1, 1000L);
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public HwRollbackRuleDetector(RollBackScrollListener rollBackScrollListener) {
        this.f = rollBackScrollListener;
    }

    public void b(View view) {
        if (view == null) {
            Log.w(f29668a, "view is null!");
            return;
        }
        if (this.g) {
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            Log.w(f29668a, "context is null");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.j = context;
        if (c(context)) {
            try {
                Class<?> cls = Class.forName("com.huawei.decision.DecisionHelper");
                Object objNewInstance = cls.newInstance();
                cls.getDeclaredMethod("bindService", Context.class).invoke(objNewInstance, this.j);
                this.e = new GestureDetector(this.j, this.l);
                this.h = cls;
                this.i = objNewInstance;
                this.f29670c = view;
                this.g = true;
            } catch (ReceiverCallNotAllowedException unused) {
                Log.w(f29668a, "There is a problem with the APP application scenario:BroadcastReceiver components are not allowed to register to receive intents");
            } catch (ClassNotFoundException unused2) {
                Log.w(f29668a, "com.huawei.decision.DecisionHelper not found!");
            } catch (IllegalAccessException unused3) {
                Log.w(f29668a, "com.huawei.decision.DecisionHelper.bindService() Illegal Access");
            } catch (InstantiationException unused4) {
                Log.w(f29668a, "com.huawei.decision.DecisionHelper.bindService() InstantiationException!");
            } catch (NoSuchMethodException unused5) {
                Log.w(f29668a, "com.huawei.decision.DecisionHelper no function bindService()");
            } catch (InvocationTargetException unused6) {
                Log.w(f29668a, "com.huawei.decision.DecisionHelper.bindService() Invocation Target");
            }
        }
    }

    public void c() {
        if (this.g) {
            if (this.j == null) {
                Log.w(f29668a, "mServiceContext is null");
                return;
            }
            Class<?> cls = this.h;
            if (cls != null && this.i != null) {
                try {
                    cls.getDeclaredMethod("unbindService", Context.class).invoke(this.i, this.j);
                } catch (IllegalAccessException unused) {
                    Log.w(f29668a, "com.huawei.decision.DecisionHelper.unbindService() Illegal Access");
                } catch (NoSuchMethodException unused2) {
                    Log.w(f29668a, "com.huawei.decision.DecisionHelper no function unbindService()");
                } catch (InvocationTargetException unused3) {
                    Log.w(f29668a, "com.huawei.decision.DecisionHelper.unbindService() Invocation Target");
                }
                this.h = null;
            }
            this.f29670c = null;
            this.e = null;
            this.g = false;
        }
    }

    public void c(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        if (this.g && (gestureDetector = this.e) != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
    }

    public void d(String str) {
        Class<?> cls = this.h;
        if (cls == null || this.i == null) {
            return;
        }
        try {
            cls.getDeclaredMethod("executeEvent", String.class).invoke(this.i, str);
        } catch (IllegalAccessException unused) {
            Log.w(f29668a, "com.huawei.decision.DecisionHelper.executeEvent() IllegalAccessException!");
        } catch (NoSuchMethodException unused2) {
            Log.w(f29668a, "com.huawei.decision.DecisionHelper no function executeEvent()!");
        } catch (InvocationTargetException unused3) {
            Log.w(f29668a, "com.huawei.decision.DecisionHelper.executeEvent() InvocationTargetException!");
        }
    }

    static /* synthetic */ int b(HwRollbackRuleDetector hwRollbackRuleDetector) {
        int i = hwRollbackRuleDetector.f29669b;
        hwRollbackRuleDetector.f29669b = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.f29669b > 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        RollBackScrollListener rollBackScrollListener = this.f;
        return rollBackScrollListener != null && rollBackScrollListener.getScrollYDistance() > this.d;
    }

    private boolean c(Context context) {
        if (context != null) {
            return (Settings.Secure.getInt(context.getContentResolver(), "com.huawei.recsys.LMT_FeatureRecStatus", 0) & 1) != 1;
        }
        Log.w(f29668a, "isRollbackUnused context is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        View view = this.f29670c;
        if (view != null) {
            this.d = view.getHeight() * 3;
        }
    }
}
