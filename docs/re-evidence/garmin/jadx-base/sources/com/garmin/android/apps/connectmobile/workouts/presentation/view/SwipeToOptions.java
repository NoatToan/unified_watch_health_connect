package com.garmin.android.apps.connectmobile.workouts.presentation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.m;
import androidx.core.view.s0;
import androidx.media3.exoplayer.u;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.WeakHashMap;
import k52.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnSwipeOpenedListener", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions$b;)V", "getMainOpenLeft", "()I", "mainOpenLeft", "getMainOpenTop", "mainOpenTop", "getSecOpenLeft", "secOpenLeft", "getSecOpenTop", "secOpenTop", "getDistToClosestEdge", "distToClosestEdge", "getHalfwayPivotHorizontal", "halfwayPivotHorizontal", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"RtlHardcoded"})
public final class SwipeToOptions extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f49729r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f49730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f49731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f49732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f49733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f49734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f49735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f49738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f49739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f49740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f49741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f49742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f49743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.customview.widget.c f49744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f49745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f49746q;

    public interface b {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions$c", "Landroidx/customview/widget/c$c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends androidx.customview.widget.c.AbstractC0092c {
        public c() {
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int clampViewPositionHorizontal(View view2, int i14, int i15) {
            view2.getClass();
            SwipeToOptions swipeToOptions = SwipeToOptions.this;
            int i16 = swipeToOptions.f49741l;
            if (i16 == 1) {
                int i17 = swipeToOptions.f49732c.left;
                View view3 = swipeToOptions.f49731b;
                if (view3 != null) {
                    return Math.max(Math.min(i14, view3.getWidth() + i17), swipeToOptions.f49732c.left);
                }
                s.m("secondaryView");
                throw null;
            }
            if (i16 != 2) {
                return view2.getLeft();
            }
            int iMin = Math.min(i14, swipeToOptions.f49732c.left);
            int i18 = swipeToOptions.f49732c.left;
            View view4 = swipeToOptions.f49731b;
            if (view4 != null) {
                return Math.max(iMin, i18 - view4.getWidth());
            }
            s.m("secondaryView");
            throw null;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onEdgeDragStarted(int i14, int i15) {
            androidx.customview.widget.c cVar;
            super.onEdgeDragStarted(i14, i15);
            if (SwipeToOptions.this.f49739j) {
                return;
            }
            SwipeToOptions swipeToOptions = SwipeToOptions.this;
            int i16 = swipeToOptions.f49741l;
            boolean z14 = false;
            boolean z15 = i16 == 2 && i14 == 1;
            if (i16 == 1 && i14 == 2) {
                z14 = true;
            }
            if ((z15 || z14) && (cVar = swipeToOptions.f49744o) != null) {
                View view2 = swipeToOptions.f49730a;
                if (view2 != null) {
                    cVar.c(i15, view2);
                } else {
                    s.m("mainView");
                    throw null;
                }
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
            view2.getClass();
            super.onViewPositionChanged(view2, i14, i15, i16, i17);
            int i18 = SwipeToOptions.f49729r;
            SwipeToOptions swipeToOptions = SwipeToOptions.this;
            swipeToOptions.getClass();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            swipeToOptions.postInvalidateOnAnimation();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewReleased(View view2, float f14, float f15) {
            view2.getClass();
            int i14 = (int) f14;
            int i15 = SwipeToOptions.f49729r;
            SwipeToOptions swipeToOptions = SwipeToOptions.this;
            float f16 = i14;
            float f17 = swipeToOptions.getContext().getResources().getDisplayMetrics().densityDpi;
            float f18 = SyslogConstants.LOG_LOCAL4;
            boolean z14 = ((int) (f16 / (f17 / f18))) >= swipeToOptions.f49740k;
            boolean z15 = ((int) (f16 / (((float) swipeToOptions.getContext().getResources().getDisplayMetrics().densityDpi) / f18))) <= (-swipeToOptions.f49740k);
            int halfwayPivotHorizontal = swipeToOptions.getHalfwayPivotHorizontal();
            int i16 = swipeToOptions.f49741l;
            if (i16 == 1) {
                if (z14) {
                    swipeToOptions.d(true);
                    return;
                }
                if (z15) {
                    swipeToOptions.c(true);
                    return;
                }
                View view3 = swipeToOptions.f49730a;
                if (view3 == null) {
                    s.m("mainView");
                    throw null;
                }
                if (view3.getLeft() < halfwayPivotHorizontal) {
                    swipeToOptions.c(true);
                    return;
                } else {
                    swipeToOptions.d(true);
                    return;
                }
            }
            if (i16 != 2) {
                return;
            }
            if (z14) {
                swipeToOptions.c(true);
                return;
            }
            if (z15) {
                swipeToOptions.d(true);
                return;
            }
            View view4 = swipeToOptions.f49730a;
            if (view4 == null) {
                s.m("mainView");
                throw null;
            }
            if (view4.getRight() < halfwayPivotHorizontal) {
                swipeToOptions.d(true);
            } else {
                swipeToOptions.c(true);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final boolean tryCaptureView(View view2, int i14) {
            SwipeToOptions swipeToOptions;
            androidx.customview.widget.c cVar;
            view2.getClass();
            if (!SwipeToOptions.this.f49739j && (cVar = (swipeToOptions = SwipeToOptions.this).f49744o) != null) {
                View view3 = swipeToOptions.f49730a;
                if (view3 == null) {
                    s.m("mainView");
                    throw null;
                }
                cVar.c(i14, view3);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49748a;

        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            motionEvent.getClass();
            SwipeToOptions.this.f49738i = false;
            this.f49748a = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            motionEvent2.getClass();
            SwipeToOptions.this.f49738i = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            motionEvent2.getClass();
            boolean z14 = true;
            SwipeToOptions.this.f49738i = true;
            if (SwipeToOptions.this.getParent() != null) {
                if (!this.f49748a) {
                    boolean z15 = SwipeToOptions.this.getDistToClosestEdge() >= SwipeToOptions.this.f49736g;
                    if (z15) {
                        this.f49748a = true;
                    }
                    z14 = z15;
                }
                SwipeToOptions.this.getParent().requestDisallowInterceptTouchEvent(z14);
            }
            return false;
        }
    }

    static {
        new a(null);
    }

    public SwipeToOptions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49732c = new Rect();
        this.f49733d = new Rect();
        this.f49734e = new Rect();
        this.f49735f = new Rect();
        this.f49740k = 300;
        this.f49741l = 1;
        this.f49743n = -1.0f;
        d dVar = new d();
        c cVar = new c();
        if (attributeSet == null || context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.f102951c, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.f49741l = typedArrayObtainStyledAttributes.getInteger(0, 1);
        this.f49740k = 300;
        this.f49736g = 1;
        androidx.customview.widget.c cVarI = androidx.customview.widget.c.i(this, 1.0f, cVar);
        this.f49744o = cVarI;
        cVarI.f6646q = 15;
        this.f49745p = new m(context, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDistToClosestEdge() {
        Rect rect = this.f49732c;
        int i14 = this.f49741l;
        if (i14 == 1) {
            int i15 = rect.left;
            View view2 = this.f49731b;
            if (view2 == null) {
                s.m("secondaryView");
                throw null;
            }
            int width = view2.getWidth() + i15;
            View view3 = this.f49730a;
            if (view3 == null) {
                s.m("mainView");
                throw null;
            }
            int left = view3.getLeft() - rect.left;
            View view4 = this.f49730a;
            if (view4 != null) {
                return Math.min(left, width - view4.getLeft());
            }
            s.m("mainView");
            throw null;
        }
        if (i14 != 2) {
            return 0;
        }
        int i16 = rect.right;
        View view5 = this.f49731b;
        if (view5 == null) {
            s.m("secondaryView");
            throw null;
        }
        int width2 = i16 - view5.getWidth();
        View view6 = this.f49730a;
        if (view6 == null) {
            s.m("mainView");
            throw null;
        }
        int right = view6.getRight() - width2;
        int i17 = rect.right;
        View view7 = this.f49730a;
        if (view7 != null) {
            return Math.min(right, i17 - view7.getRight());
        }
        s.m("mainView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHalfwayPivotHorizontal() {
        int i14 = this.f49741l;
        Rect rect = this.f49732c;
        if (i14 == 1) {
            int i15 = rect.left;
            View view2 = this.f49731b;
            if (view2 != null) {
                return (view2.getWidth() / 2) + i15;
            }
            s.m("secondaryView");
            throw null;
        }
        int i16 = rect.right;
        View view3 = this.f49731b;
        if (view3 != null) {
            return i16 - (view3.getWidth() / 2);
        }
        s.m("secondaryView");
        throw null;
    }

    private final int getMainOpenLeft() {
        Rect rect = this.f49732c;
        int i14 = this.f49741l;
        if (i14 == 1) {
            int i15 = rect.left;
            View view2 = this.f49731b;
            if (view2 != null) {
                return view2.getWidth() + i15;
            }
            s.m("secondaryView");
            throw null;
        }
        if (i14 != 2) {
            return 0;
        }
        int i16 = rect.left;
        View view3 = this.f49731b;
        if (view3 != null) {
            return i16 - view3.getWidth();
        }
        s.m("secondaryView");
        throw null;
    }

    private final int getMainOpenTop() {
        Rect rect = this.f49732c;
        int i14 = this.f49741l;
        if (i14 == 1 || i14 == 2) {
            return rect.top;
        }
        return 0;
    }

    private final int getSecOpenLeft() {
        return this.f49734e.left;
    }

    private final int getSecOpenTop() {
        return this.f49734e.top;
    }

    public final void c(boolean z14) {
        this.f49737h = false;
        Rect rect = this.f49732c;
        androidx.customview.widget.c cVar = this.f49744o;
        if (!z14) {
            if (cVar != null) {
                cVar.a();
            }
            View view2 = this.f49730a;
            if (view2 == null) {
                s.m("mainView");
                throw null;
            }
            view2.layout(rect.left, rect.top, rect.right, rect.bottom);
            View view3 = this.f49731b;
            if (view3 == null) {
                s.m("secondaryView");
                throw null;
            }
            Rect rect2 = this.f49734e;
            view3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } else if (cVar != null) {
            View view4 = this.f49730a;
            if (view4 == null) {
                s.m("mainView");
                throw null;
            }
            cVar.u(view4, rect.left, rect.top);
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        androidx.customview.widget.c cVar = this.f49744o;
        if (cVar == null || !cVar.h()) {
            return;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z14) {
        int i14;
        b bVar = this.f49746q;
        if (bVar != null) {
            u uVar = (u) bVar;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f) uVar.f9695c;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar2 = fVar.f49177b;
            int i15 = uVar.f9694b;
            RecyclerView.f0 f0Var = (RecyclerView.f0) uVar.f9696d;
            if (bVar2 != null && (i14 = fVar.f49184i) > -1 && i14 != ((q62.b) f0Var).getBindingAdapterPosition()) {
                bVar2.c(fVar.f49184i);
            }
            fVar.f49184i = i15;
        }
        this.f49737h = true;
        Rect rect = this.f49733d;
        androidx.customview.widget.c cVar = this.f49744o;
        if (!z14) {
            if (cVar != null) {
                cVar.a();
            }
            View view2 = this.f49730a;
            if (view2 == null) {
                s.m("mainView");
                throw null;
            }
            view2.layout(rect.left, rect.top, rect.right, rect.bottom);
            View view3 = this.f49731b;
            if (view3 == null) {
                s.m("secondaryView");
                throw null;
            }
            Rect rect2 = this.f49735f;
            view3.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        } else if (cVar != null) {
            View view4 = this.f49730a;
            if (view4 == null) {
                s.m("mainView");
                throw null;
            }
            cVar.u(view4, rect.left, rect.top);
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() < 2) {
            if (getChildCount() == 1) {
                View childAt = getChildAt(0);
                childAt.getClass();
                this.f49730a = childAt;
                return;
            }
            return;
        }
        View childAt2 = getChildAt(0);
        childAt2.getClass();
        this.f49731b = childAt2;
        View childAt3 = getChildAt(1);
        childAt3.getClass();
        this.f49730a = childAt3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        boolean z15;
        boolean z16;
        motionEvent.getClass();
        if (this.f49739j) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        androidx.customview.widget.c cVar = this.f49744o;
        if (cVar != null) {
            cVar.m(motionEvent);
        }
        m mVar = this.f49745p;
        if (mVar != null) {
            mVar.f6501a.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f49742m = 0.0f;
        } else {
            this.f49742m += Math.abs(motionEvent.getX() - this.f49743n);
        }
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        View view2 = this.f49730a;
        if (view2 == null) {
            s.m("mainView");
            throw null;
        }
        if (view2.getTop() > y14) {
            z14 = false;
        } else {
            View view3 = this.f49730a;
            if (view3 == null) {
                s.m("mainView");
                throw null;
            }
            if (y14 <= view3.getBottom()) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        View view4 = this.f49730a;
        if (view4 == null) {
            s.m("mainView");
            throw null;
        }
        if (view4.getLeft() > x14) {
            z15 = false;
        } else {
            View view5 = this.f49730a;
            if (view5 == null) {
                s.m("mainView");
                throw null;
            }
            if (x14 <= view5.getRight()) {
                z15 = true;
            } else {
                z15 = false;
            }
        }
        if (z14 && z15) {
            androidx.customview.widget.c cVar2 = this.f49744o;
            if (this.f49742m >= (cVar2 != null ? cVar2.f6631b : 0.0f)) {
                z16 = false;
            } else {
                z16 = true;
            }
        } else {
            z16 = false;
        }
        androidx.customview.widget.c cVar3 = this.f49744o;
        boolean z17 = cVar3 != null && cVar3.f6630a == 2;
        boolean z18 = cVar3 != null && cVar3.f6630a == 0 && this.f49738i;
        this.f49743n = motionEvent.getX();
        return !z16 && (z17 || z18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        boolean z15;
        boolean z16;
        int iMin;
        int iMin2;
        int iMax;
        int iMax2;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            int paddingLeft = getPaddingLeft();
            int iMax3 = Math.max((i16 - getPaddingRight()) - i14, 0);
            int paddingTop = getPaddingTop();
            int iMax4 = Math.max((i17 - getPaddingBottom()) - i15, 0);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i19 = layoutParams.height;
                z15 = i19 == -1 || i19 == -1;
                int i24 = layoutParams.width;
                z16 = i24 == -1 || i24 == -1;
            } else {
                z15 = false;
                z16 = false;
            }
            if (z15) {
                measuredHeight = iMax4 - paddingTop;
                layoutParams.getClass();
                layoutParams.height = measuredHeight;
            }
            if (z16) {
                measuredWidth = iMax3 - paddingLeft;
                layoutParams.getClass();
                layoutParams.width = measuredWidth;
            }
            int i25 = this.f49741l;
            if (i25 == 1) {
                int iMin3 = Math.min(getPaddingLeft(), iMax3);
                iMin = Math.min(getPaddingTop(), iMax4);
                int iMin4 = Math.min(getPaddingLeft() + measuredWidth, iMax3);
                iMin2 = Math.min(getPaddingTop() + measuredHeight, iMax4);
                iMax = iMin3;
                iMax2 = iMin4;
            } else if (i25 != 2) {
                iMax2 = 0;
                iMax = 0;
                iMin = 0;
                iMin2 = 0;
            } else {
                iMax = Math.max(((i16 - measuredWidth) - getPaddingRight()) - i14, paddingLeft);
                iMin = Math.min(getPaddingTop(), iMax4);
                iMax2 = Math.max((i16 - getPaddingRight()) - i14, paddingLeft);
                iMin2 = Math.min(getPaddingTop() + measuredHeight, iMax4);
            }
            childAt.layout(iMax, iMin, iMax2, iMin2);
        }
        View view2 = this.f49730a;
        if (view2 == null) {
            s.m("mainView");
            throw null;
        }
        int left = view2.getLeft();
        View view3 = this.f49730a;
        if (view3 == null) {
            s.m("mainView");
            throw null;
        }
        int top = view3.getTop();
        View view4 = this.f49730a;
        if (view4 == null) {
            s.m("mainView");
            throw null;
        }
        int right = view4.getRight();
        View view5 = this.f49730a;
        if (view5 == null) {
            s.m("mainView");
            throw null;
        }
        this.f49732c.set(left, top, right, view5.getBottom());
        View view6 = this.f49731b;
        if (view6 == null) {
            s.m("secondaryView");
            throw null;
        }
        int left2 = view6.getLeft();
        View view7 = this.f49731b;
        if (view7 == null) {
            s.m("secondaryView");
            throw null;
        }
        int top2 = view7.getTop();
        View view8 = this.f49731b;
        if (view8 == null) {
            s.m("secondaryView");
            throw null;
        }
        int right2 = view8.getRight();
        View view9 = this.f49731b;
        if (view9 == null) {
            s.m("secondaryView");
            throw null;
        }
        this.f49734e.set(left2, top2, right2, view9.getBottom());
        int mainOpenLeft = getMainOpenLeft();
        int mainOpenTop = getMainOpenTop();
        int mainOpenLeft2 = getMainOpenLeft();
        View view10 = this.f49730a;
        if (view10 == null) {
            s.m("mainView");
            throw null;
        }
        int width = view10.getWidth() + mainOpenLeft2;
        int mainOpenTop2 = getMainOpenTop();
        View view11 = this.f49730a;
        if (view11 == null) {
            s.m("mainView");
            throw null;
        }
        this.f49733d.set(mainOpenLeft, mainOpenTop, width, view11.getHeight() + mainOpenTop2);
        int secOpenLeft = getSecOpenLeft();
        int secOpenTop = getSecOpenTop();
        int secOpenLeft2 = getSecOpenLeft();
        View view12 = this.f49731b;
        if (view12 == null) {
            s.m("secondaryView");
            throw null;
        }
        int width2 = view12.getWidth() + secOpenLeft2;
        int secOpenTop2 = getSecOpenTop();
        View view13 = this.f49731b;
        if (view13 == null) {
            s.m("secondaryView");
            throw null;
        }
        this.f49735f.set(secOpenLeft, secOpenTop, width2, view13.getHeight() + secOpenTop2);
        if (this.f49737h) {
            d(false);
        } else {
            c(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        if (getChildCount() < 2) {
            kg.f.n("Layout must have at least two children");
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            measureChild(childAt, i14, i15);
            iMax = Math.max(childAt.getMeasuredWidth(), iMax);
            iMax2 = Math.max(childAt.getMeasuredHeight(), iMax2);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode2);
        int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height == -1) {
                    childAt2.setMinimumHeight(size2);
                }
                if (layoutParams2.width == -1) {
                    childAt2.setMinimumWidth(size);
                }
            }
            measureChild(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(childAt2.getMeasuredWidth(), iMax);
            iMax2 = Math.max(childAt2.getMeasuredHeight(), iMax2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + iMax;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax2;
        if (mode != 1073741824) {
            if (layoutParams.width == -1) {
                paddingRight = size;
            }
            if (mode != Integer.MIN_VALUE || paddingRight <= size) {
                size = paddingRight;
            }
        }
        if (mode2 != 1073741824) {
            if (layoutParams.height == -1) {
                paddingBottom = size2;
            }
            if (mode2 != Integer.MIN_VALUE || paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("superState", Parcelable.class);
            } else {
                parcelable = bundle.getParcelable("superState");
                if (!(parcelable instanceof Parcelable)) {
                    parcelable = null;
                }
            }
            parcelable.getClass();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new Bundle().putParcelable("saved_instance_state_parcelable", super.onSaveInstanceState());
        return super.onSaveInstanceState();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        m mVar = this.f49745p;
        if (mVar != null) {
            mVar.f6501a.onTouchEvent(motionEvent);
        }
        androidx.customview.widget.c cVar = this.f49744o;
        if (cVar == null) {
            return true;
        }
        cVar.m(motionEvent);
        return true;
    }

    public final void setOnSwipeOpenedListener(b listener) {
        listener.getClass();
        this.f49746q = listener;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/view/SwipeToOptions$a;", "", "<init>", "()V", "", "SUPER_INSTANCE_STATE", "Ljava/lang/String;", "", "DEFAULT_MIN_FLING_VELOCITY", "I", "DEFAULT_MIN_DIST_REQUEST_DISALLOW_PARENT", "DRAG_EDGE_LEFT", "DRAG_EDGE_RIGHT", "MODE_NORMAL", "MODE_SAME_LEVEL", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public SwipeToOptions(Context context) {
        super(context);
        this.f49732c = new Rect();
        this.f49733d = new Rect();
        this.f49734e = new Rect();
        this.f49735f = new Rect();
        this.f49740k = 300;
        this.f49741l = 1;
        this.f49743n = -1.0f;
        new d();
        new c();
    }

    public SwipeToOptions(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f49732c = new Rect();
        this.f49733d = new Rect();
        this.f49734e = new Rect();
        this.f49735f = new Rect();
        this.f49740k = 300;
        this.f49741l = 1;
        this.f49743n = -1.0f;
        new d();
        new c();
    }
}
