package com.huawei.healthcloud.plugintrack.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.basesport.controls.ControlButtonLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jqi;
import defpackage.lrd;
import defpackage.qqv;
import defpackage.qre;

/* JADX INFO: loaded from: classes10.dex */
public class ToolsLayout extends FrameLayout implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConstraintLayout f11336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CircleProgressButton f11337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConstraintLayout f11338c;
    private ControlButtonLayout d;
    private int e;
    private View f;
    private GestureDetector g;
    private IBaseResponseCallback h;
    private Handler i;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public ToolsLayout(Context context) {
        this(context, null);
    }

    public ToolsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 8;
        this.h = new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ToolsLayout.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("Track_ToolsLayout", "mResetAnimateCallback = ", Integer.valueOf(i2));
                ToolsLayout.this.i.removeMessages(3);
                if (i2 == 100) {
                    ToolsLayout.this.i.sendMessageDelayed(ToolsLayout.this.i.obtainMessage(3), 2000L);
                } else if (i2 == 101) {
                    ToolsLayout.this.i.sendEmptyMessage(4);
                } else if (i2 != 102) {
                    LogUtil.j("Track_ToolsLayout", "error code ", Integer.valueOf(i2));
                } else {
                    ToolsLayout.this.i.sendEmptyMessage(4);
                }
            }
        };
        this.i = new a(Looper.getMainLooper(), this);
    }

    public void setShowOrHideView(View view) {
        this.f = view;
    }

    public ControlButtonLayout getControlButtonLayout() {
        if (this.d == null) {
            this.d = (ControlButtonLayout) findViewById(R.id.control_button);
        }
        return this.d;
    }

    public ConstraintLayout getEcologyRopeControlPanelLayout() {
        if (this.f11336a == null) {
            this.f11336a = (ConstraintLayout) findViewById(R.id.ecology_rope_control_panel);
        }
        return this.f11336a;
    }

    public ConstraintLayout getBottomPanel() {
        if (this.f11338c == null) {
            this.f11338c = (ConstraintLayout) findViewById(R.id.bottom_panel);
        }
        return this.f11338c;
    }

    public CircleProgressButton getCircleProgressButton() {
        if (this.f11337b == null) {
            CircleProgressButton circleProgressButton = (CircleProgressButton) findViewById(R.id.sport_control_button);
            this.f11337b = circleProgressButton;
            lrd.e(circleProgressButton, qre.i(R.string.IDS_motiontrack_show_sport_dialog_finish));
        }
        return this.f11337b;
    }

    public void e() {
        GestureDetector gestureDetector = new GestureDetector(getContext(), this);
        gestureDetector.setOnDoubleTapListener(this);
        setGestureDetector(gestureDetector);
        c();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        c();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        c();
        return true;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.g = gestureDetector;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.g;
        if (gestureDetector == null) {
            return true;
        }
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private void c() {
        a(this.e == 0 ? 4 : 0);
        if (lrd.d()) {
            LogUtil.a("Track_ToolsLayout", "toggleToolView isTouchExplorationEnabled");
        } else {
            this.i.removeMessages(3);
            this.i.sendMessageDelayed(this.i.obtainMessage(3), 2000L);
        }
    }

    public IBaseResponseCallback getAnimateCallback() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        this.e = i;
        View view = this.f;
        if (view == null) {
            return;
        }
        view.animate().translationY(c(i)).setInterpolator(jqi.e()).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ToolsLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (i == 0) {
                    ToolsLayout.this.f.setVisibility(i);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (i != 0) {
                    ToolsLayout.this.f.setVisibility(i);
                }
            }
        }).start();
    }

    private int c(int i) {
        int[] iArr = new int[2];
        this.f.getLocationInWindow(iArr);
        if (i == 0) {
            return 0;
        }
        return (Math.max(qqv.b(getContext()), getHeight()) + 20) - iArr[1];
    }

    /* JADX INFO: loaded from: classes33.dex */
    static class a extends BaseHandler<ToolsLayout> {
        a(Looper looper, ToolsLayout toolsLayout) {
            super(looper, toolsLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ToolsLayout toolsLayout, Message message) {
            if (message == null) {
                LogUtil.j("Track_ToolsLayout", "handleMessage message is null");
                return;
            }
            int i = message.what;
            if (i != 3) {
                if (i == 4 && toolsLayout.e == 8) {
                    toolsLayout.a(0);
                    return;
                }
                return;
            }
            if (toolsLayout.e == 0) {
                toolsLayout.a(8);
            }
        }
    }
}
