package com.huawei.uikit.hwrecyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchUIUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwanimations.R;
import com.huawei.uikit.hwrecyclerview.widget.HwItemTouchHelperEx;
import defpackage.xet;
import defpackage.xfp;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes44.dex */
public class HwItemTouchHelperEx extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<View> f29608a;
    private int aa;
    private float ab;
    private RecyclerView.ChildDrawingOrderCallback ac;
    private List<Integer> ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f29609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f29610c;
    float d;
    RecyclerView.ViewHolder e;
    List<b> f;
    VelocityTracker g;
    Callback h;
    int i;
    RecyclerView j;
    int k;
    private ValueAnimator l;
    private boolean m;
    private long n;
    View o;
    private boolean p;
    private long q;
    private float r;
    private boolean s;
    private xet t;
    private float u;
    private final float[] v;
    private float w;
    private long x;
    private float y;
    private List<RecyclerView.ViewHolder> z;

    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        static final int f = 3158064;
        private static final int g = 789516;
        private static final Interpolator h = new Interpolator() { // from class: xfk
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                return HwItemTouchHelperEx.Callback.a(f2);
            }
        };
        private static final Interpolator i = new Interpolator() { // from class: xfi
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                return HwItemTouchHelperEx.Callback.b(f2);
            }
        };
        private static final long j = 2000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29611a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f29612b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29613c = false;
        private int d = 0;
        private int e = 0;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ float a(float f2) {
            return f2 * f2 * f2 * f2 * f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ float b(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }

        public static int convertToRelativeDirection(int i2, int i3) {
            int i4;
            int i5 = i2 & g;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & g) << 2;
            }
            return i6 | i4;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return xfp.d;
        }

        public static int makeFlag(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        public static int makeMovementFlags(int i2, int i3) {
            int iMakeFlag = makeFlag(0, i3 | i2);
            return makeFlag(2, i2) | makeFlag(1, i3) | iMakeFlag;
        }

        boolean c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (a(recyclerView, viewHolder) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) != 0;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public boolean canScaleOverlappedItem(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i2, int i3) {
            d dVar = new d();
            dVar.f29626c = -1;
            dVar.e = i2;
            dVar.d = i3;
            RecyclerView.ViewHolder viewHolderA = a(viewHolder, list, dVar);
            dVar.f29625b = viewHolderA;
            if (viewHolderA != null && !this.f29613c && canScaleOverlappedItem(viewHolderA)) {
                b(dVar.f29625b.itemView);
            }
            return dVar.f29625b;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            xfp.d.clearView(viewHolder.itemView);
            viewHolder.itemView.setScaleX(1.0f);
            viewHolder.itemView.setScaleY(1.0f);
        }

        public int convertToAbsoluteDirection(int i2, int i3) {
            int i4;
            int i5 = i2 & f;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & f) >> 2;
            }
            return i6 | i4;
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i2, float f2, float f3) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i2 == 8 ? 200L : 250L;
            }
            return i2 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.0f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f2) {
            return f2;
        }

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f2) {
            return f2;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
            int iSignum = (int) (((int) (((int) Math.signum(i3)) * a(recyclerView) * i.getInterpolation(Math.min(1.0f, Math.abs(i3) / i2)))) * h.getInterpolation(j2 <= 2000 ? j2 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i3 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
            xfp.d.onDraw(canvas, recyclerView, viewHolder.itemView, f2, f3, i2, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
            xfp.d.onDrawOver(canvas, recyclerView, viewHolder.itemView, f2, f3, i2, z);
        }

        public boolean onMove(RecyclerView recyclerView, int i2, int i3) {
            return false;
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i2, RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ItemTouchHelper.ViewDropHandler) {
                ((ItemTouchHelper.ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i4, i5);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
            if (viewHolder != null) {
                xfp.d.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.ViewHolder viewHolder, int i2);

        public void updateSelectedScale(float f2) {
            this.f29612b = f2;
        }

        boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (a(recyclerView, viewHolder) & HwColorPicker.MASK_RESULT_STATE) != 0;
        }

        private void b(RecyclerView.ViewHolder viewHolder, d dVar, int i2, int i3, RecyclerView.ViewHolder viewHolder2) {
            int left;
            int iAbs;
            int right;
            int iAbs2;
            if (i3 > 0 && (right = viewHolder2.itemView.getRight() - i2) < 0 && viewHolder2.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs2 = Math.abs(right)) > dVar.f29626c) {
                dVar.f29626c = iAbs2;
                dVar.f29625b = viewHolder2;
            }
            if (i3 >= 0 || (left = viewHolder2.itemView.getLeft() - dVar.e) <= 0 || viewHolder2.itemView.getLeft() >= viewHolder.itemView.getLeft() || (iAbs = Math.abs(left)) <= dVar.f29626c) {
                return;
            }
            dVar.f29626c = iAbs;
            dVar.f29625b = viewHolder2;
        }

        final int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView));
        }

        private RecyclerView.ViewHolder a(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, d dVar) {
            int i2 = dVar.e;
            int width = viewHolder.itemView.getWidth();
            int i3 = dVar.d;
            int height = viewHolder.itemView.getHeight();
            int left = dVar.e - viewHolder.itemView.getLeft();
            int top = dVar.d - viewHolder.itemView.getTop();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder2 = list.get(i4);
                if (this.f29613c) {
                    dVar.f29626c = (int) (viewHolder2.itemView.getHeight() * 0.1f);
                }
                b(viewHolder, dVar, i2 + width, left, viewHolder2);
                a(viewHolder, dVar, top, viewHolder2);
                a(viewHolder, dVar, i3 + height, top, viewHolder2);
            }
            return dVar.f29625b;
        }

        private void b(View view) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), R.interpolator.cubic_bezier_interpolator_type_20_80));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(a(view));
            valueAnimatorOfFloat.start();
        }

        private void a(RecyclerView.ViewHolder viewHolder, d dVar, int i2, int i3, RecyclerView.ViewHolder viewHolder2) {
            int iAbs;
            int iAbs2;
            if (i3 <= 0) {
                return;
            }
            int bottom = viewHolder2.itemView.getBottom() - i2;
            if (this.f29613c && this.d < this.e && (bottom = viewHolder2.itemView.getTop() - i2) < 0 && (iAbs2 = Math.abs(bottom)) > dVar.f29626c) {
                dVar.f29626c = iAbs2;
                dVar.f29625b = viewHolder2;
            }
            if (bottom >= 0 || viewHolder2.itemView.getBottom() <= viewHolder.itemView.getBottom() || (iAbs = Math.abs(bottom)) <= dVar.f29626c) {
                return;
            }
            dVar.f29626c = iAbs;
            dVar.f29625b = viewHolder2;
        }

        private void a(RecyclerView.ViewHolder viewHolder, d dVar, int i2, RecyclerView.ViewHolder viewHolder2) {
            int iAbs;
            int iAbs2;
            if (i2 >= 0) {
                return;
            }
            int top = viewHolder2.itemView.getTop() - dVar.d;
            if (this.f29613c && this.d > this.e) {
                int bottom = viewHolder2.itemView.getBottom() - dVar.d;
                if (bottom <= 0 || (iAbs2 = Math.abs(bottom)) <= dVar.f29626c) {
                    return;
                }
                dVar.f29626c = iAbs2;
                dVar.f29625b = viewHolder2;
                return;
            }
            if (top <= 0 || viewHolder2.itemView.getTop() >= viewHolder.itemView.getTop() || (iAbs = Math.abs(top)) <= dVar.f29626c) {
                return;
            }
            dVar.f29626c = iAbs;
            dVar.f29625b = viewHolder2;
        }

        private ValueAnimator.AnimatorUpdateListener a(final View view) {
            return new ValueAnimator.AnimatorUpdateListener() { // from class: xfh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HwItemTouchHelperEx.Callback.a(view, valueAnimator);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwItemTouchHelper", "getAlphaListener: onAnimationUpdate: animation is null");
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            view.setScaleX(fFloatValue);
            view.setScaleY(fFloatValue);
        }

        private int a(RecyclerView recyclerView) {
            if (this.f29611a == -1) {
                this.f29611a = recyclerView.getResources().getDimensionPixelSize(androidx.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f29611a;
        }

        void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<b> list, a aVar) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = list.get(i2);
                bVar.c();
                int iSave = canvas.save();
                bVar.a();
                onChildDraw(canvas, recyclerView, bVar.e, bVar.j, bVar.h, bVar.f29617c, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                viewHolder.itemView.setScaleX(this.f29612b);
                viewHolder.itemView.setScaleY(this.f29612b);
                onChildDraw(canvas, recyclerView, viewHolder, aVar.d, aVar.e, aVar.f29614b, true);
                canvas.restoreToCount(iSave2);
            }
        }

        void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<b> list, int i2, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = list.get(i3);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, bVar.e, bVar.j, bVar.h, bVar.f29617c, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f2, f3, i2, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i4 = size - 1; i4 >= 0; i4--) {
                b bVar2 = list.get(i4);
                boolean z2 = bVar2.k;
                if (z2 && !bVar2.f) {
                    list.remove(i4);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int k;
        private int l;

        public SimpleCallback(int i, int i2) {
            this.l = i;
            this.k = i2;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.k;
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwItemTouchHelperEx.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.l;
        }

        public void setDefaultDragDirs(int i) {
            this.k = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.l = i;
        }
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29614b;
        float d;
        float e;

        a() {
        }
    }

    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f29615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f29616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29617c;
        final float d;
        final RecyclerView.ViewHolder e;
        boolean f;
        final int g;
        float h;
        final float i;
        float j;
        private xet q;
        private List<a> r;
        private float s;
        private final ValueAnimator t;
        boolean k = false;
        boolean o = false;
        boolean m = false;
        boolean l = true;

        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float f29618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f29619b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f29620c;
            RecyclerView.ViewHolder d;
            private float j;

            a(RecyclerView.ViewHolder viewHolder) {
                this.d = viewHolder;
                this.f29619b = viewHolder.itemView.getScaleX();
                this.f29618a = this.d.itemView.getScaleY();
            }
        }

        /* JADX INFO: renamed from: com.huawei.uikit.hwrecyclerview.widget.HwItemTouchHelperEx$b$b, reason: collision with other inner class name */
        class C0288b implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HwItemTouchHelperEx f29621b;

            C0288b(HwItemTouchHelperEx hwItemTouchHelperEx) {
                this.f29621b = hwItemTouchHelperEx;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.this.b(valueAnimator.getAnimatedFraction());
            }
        }

        b(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.d = f4;
            this.f29615a = f3;
            this.f29616b = f2;
            this.i = f;
            this.e = viewHolder;
            this.g = i;
            this.f29617c = i2;
            this.q = new xet(viewHolder.itemView.getContext(), viewHolder.itemView, 1, 0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C0288b(HwItemTouchHelperEx.this));
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(viewHolder.itemView.getContext(), android.R.anim.linear_interpolator));
            valueAnimatorOfFloat.addListener(this);
            a(0.0f);
        }

        private boolean c(float f) {
            return f < Float.MAX_VALUE && f > -3.4028235E38f;
        }

        public void b() {
            this.e.setIsRecyclable(false);
            this.t.start();
        }

        public void b(float f) {
            a(f);
        }

        public void c() {
            float f = this.s / 0.36363637f;
            Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(this.e.itemView.getContext(), R.interpolator.cubic_bezier_interpolator_type_33_33);
            if (this.s < 0.36363637f) {
                float interpolation = interpolatorLoadInterpolator.getInterpolation(f);
                float f2 = this.i;
                float f3 = this.f29615a;
                if (f2 == f3) {
                    this.j = this.e.itemView.getTranslationX();
                } else {
                    this.j = f2 + ((f3 - f2) * interpolation);
                }
                float f4 = this.f29616b;
                float f5 = this.d;
                if (f4 == f5) {
                    this.h = this.e.itemView.getTranslationY();
                } else {
                    this.h = f4 + ((f5 - f4) * interpolation);
                }
                if (this.m) {
                    for (a aVar : this.r) {
                        aVar.f29620c = aVar.f29619b + ((1.0f - aVar.f29619b) * interpolation);
                        aVar.j = aVar.f29618a + ((1.0f - aVar.f29618a) * interpolation);
                    }
                }
            }
            if (this.s > 0.27272728f) {
                float f6 = this.i;
                float f7 = this.f29615a;
                if (f6 == f7) {
                    this.j = this.e.itemView.getTranslationX();
                } else {
                    this.j = f7;
                }
                float f8 = this.f29616b;
                float f9 = this.d;
                if (f8 == f9) {
                    this.h = this.e.itemView.getTranslationY();
                } else {
                    this.h = f9;
                }
                if (this.m) {
                    for (a aVar2 : this.r) {
                        aVar2.f29620c = 1.0f;
                        aVar2.j = 1.0f;
                    }
                }
                e(this.e, 0.27272728f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            List<a> list = this.r;
            if (list != null) {
                for (a aVar : list) {
                    aVar.d.itemView.setScaleX(1.0f);
                    aVar.d.itemView.setScaleY(1.0f);
                }
            }
            b(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.k) {
                this.e.setIsRecyclable(true);
            }
            RecyclerView.ViewHolder viewHolder = this.e;
            if (viewHolder != null) {
                viewHolder.itemView.setScaleX(1.0f);
                this.e.itemView.setScaleY(1.0f);
                this.e.itemView.setTranslationY(0.0f);
            }
            this.k = true;
            HwItemTouchHelperEx.this.s = false;
            HwItemTouchHelperEx.this.p = false;
            HwItemTouchHelperEx.this.m = false;
            HwItemTouchHelperEx hwItemTouchHelperEx = HwItemTouchHelperEx.this;
            hwItemTouchHelperEx.n = hwItemTouchHelperEx.q;
            if (this.l) {
                this.q.c(true);
                this.q.c(false);
                this.l = false;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (HwItemTouchHelperEx.this.p) {
                for (a aVar : this.r) {
                    aVar.d.itemView.setScaleX(1.0f);
                    aVar.d.itemView.setScaleY(1.0f);
                }
            }
            if (!this.m || HwItemTouchHelperEx.this.p) {
                return;
            }
            for (a aVar2 : this.r) {
                if (aVar2.f29619b < 1.0f) {
                    aVar2.d.itemView.setScaleX(aVar2.f29620c);
                    aVar2.d.itemView.setScaleY(aVar2.j);
                }
            }
        }

        private void a(float f) {
            this.s = f;
        }

        public void d(long j) {
            this.t.setDuration(j);
        }

        public void d() {
            this.t.cancel();
        }

        private void e(RecyclerView.ViewHolder viewHolder, float f) {
            if (this.f29617c != 2) {
                return;
            }
            HwItemTouchHelperEx.this.r = 1.05f - (AnimationUtils.loadInterpolator(this.e.itemView.getContext(), R.interpolator.cubic_bezier_interpolator_type_onshot_bounce).getInterpolation((this.s - f) / (1.0f - f)) * 0.05f);
            if (this.l) {
                this.q.c(true);
                this.q.c(false);
                this.l = false;
            }
            if (viewHolder == null || !c(HwItemTouchHelperEx.this.r)) {
                return;
            }
            viewHolder.itemView.setScaleX(HwItemTouchHelperEx.this.r);
            viewHolder.itemView.setScaleY(HwItemTouchHelperEx.this.r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            this.m = z;
            if (z) {
                ArrayList arrayList = new ArrayList();
                this.r = arrayList;
                arrayList.add(new a(this.e));
                Iterator it = HwItemTouchHelperEx.this.a(this.e).iterator();
                while (it.hasNext()) {
                    this.r.add(new a((RecyclerView.ViewHolder) it.next()));
                }
                HwItemTouchHelperEx.this.z.clear();
                HwItemTouchHelperEx.this.ad.clear();
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29623a;
        final /* synthetic */ int e;

        c(b bVar, int i) {
            this.f29623a = bVar;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = HwItemTouchHelperEx.this.j;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            b bVar = this.f29623a;
            if (bVar.o || bVar.e.getAdapterPosition() == -1) {
                return;
            }
            RecyclerView.ItemAnimator itemAnimator = HwItemTouchHelperEx.this.j.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !HwItemTouchHelperEx.this.e()) {
                HwItemTouchHelperEx.this.h.onSwiped(this.f29623a.e, this.e);
            } else {
                HwItemTouchHelperEx.this.j.post(this);
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.ViewHolder f29625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29626c;
        int d;
        int e;

        d() {
        }
    }

    class e extends b {
        final /* synthetic */ int r;
        final /* synthetic */ RecyclerView.ViewHolder s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i, i2, f, f2, f3, f4);
            this.r = i3;
            this.s = viewHolder2;
        }

        private void a() {
            int i = this.r;
            if (i > 0) {
                HwItemTouchHelperEx.this.b(this, i);
            }
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwItemTouchHelperEx.b, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.o) {
                return;
            }
            if (this.r <= 0) {
                HwItemTouchHelperEx hwItemTouchHelperEx = HwItemTouchHelperEx.this;
                hwItemTouchHelperEx.h.clearView(hwItemTouchHelperEx.j, this.s);
            } else {
                HwItemTouchHelperEx.this.f29608a.add(this.s.itemView);
                this.f = true;
                a();
            }
            HwItemTouchHelperEx hwItemTouchHelperEx2 = HwItemTouchHelperEx.this;
            View view = hwItemTouchHelperEx2.o;
            View view2 = this.s.itemView;
            if (view == view2) {
                hwItemTouchHelperEx2.e(view2);
            }
        }
    }

    private int a(int i, int i2) {
        if (i == 2) {
            return 8;
        }
        return i2 > 0 ? 2 : 4;
    }

    private void a() {
    }

    private void b() {
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
    }

    public void b(View view, Callback callback, xet xetVar) {
    }

    boolean e() {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            if (!this.f.get(i).k) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        e(view);
        RecyclerView.ViewHolder childViewHolder = this.j.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder != null && childViewHolder == viewHolder) {
            this.p = true;
            e((RecyclerView.ViewHolder) null, 0);
        } else {
            e(childViewHolder, false);
            if (this.f29608a.remove(childViewHolder.itemView)) {
                this.h.clearView(this.j, childViewHolder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.k = -1;
        if (this.e != null) {
            a(this.v);
            float[] fArr = this.v;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        a aVar = new a();
        aVar.f29614b = this.aa;
        aVar.d = f;
        aVar.e = f2;
        this.h.a(canvas, recyclerView, this.e, this.f, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.e != null) {
            a(this.v);
            float[] fArr = this.v;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.h.a(canvas, recyclerView, this.e, this.f, this.aa, f, f2);
    }

    private void d(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2) {
            if (viewHolder != null) {
                xet xetVar = new xet(viewHolder.itemView.getContext(), viewHolder.itemView, 1, 0);
                this.t = xetVar;
                b(viewHolder.itemView, this.h, xetVar);
                this.o = viewHolder.itemView;
                a();
                return;
            }
            throw new IllegalArgumentException("ViewHolder must be passed when dragging");
        }
    }

    private void a(float[] fArr) {
        if ((this.i & 12) != 0) {
            fArr[0] = (this.u + this.d) - this.e.itemView.getLeft();
        } else {
            fArr[0] = this.e.itemView.getTranslationX();
        }
        if ((this.i & 3) != 0) {
            fArr[1] = (this.w + this.f29609b) - this.e.itemView.getTop();
        } else {
            fArr[1] = this.e.itemView.getTranslationY();
        }
    }

    private boolean b(int i, boolean z) {
        float fSignum;
        RecyclerView.ViewHolder viewHolder = this.e;
        if (viewHolder != null) {
            if (viewHolder.itemView.getParent() != null) {
                int iC = i == 2 ? 0 : c(viewHolder);
                b();
                float fSignum2 = 0.0f;
                if (iC == 1 || iC == 2) {
                    fSignum = Math.signum(this.f29609b) * this.j.getHeight();
                } else if (iC == 4 || iC == 8 || iC == 16 || iC == 32) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.d) * this.j.getWidth();
                } else {
                    fSignum = 0.0f;
                }
                int iA = a(i, iC);
                a(this.v);
                b bVarA = a(i, fSignum2, fSignum, iA);
                bVarA.d(this.n + 150);
                if (i == 2) {
                    bVarA.a(true);
                }
                this.f.add(bVarA);
                bVarA.b();
                z = true;
            } else {
                e(viewHolder.itemView);
                this.h.clearView(this.j, viewHolder);
            }
            this.e = null;
        }
        return z;
    }

    void e(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == this.e && i == this.aa) {
            return;
        }
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            return;
        }
        this.x = Long.MIN_VALUE;
        int i2 = this.aa;
        e(viewHolder, true);
        this.aa = i;
        d(viewHolder, i);
        boolean zB = b(i2, false);
        if (viewHolder != null) {
            Log.d("HwItemTouchHelper", "selected is not empty.");
            this.i = (this.h.a(this.j, viewHolder) & ((1 << ((i * 8) + 8)) - 1)) >> (this.aa * 8);
            this.u = viewHolder.itemView.getLeft();
            this.w = viewHolder.itemView.getTop();
            this.e = viewHolder;
            if (i == 2 && !this.m) {
                viewHolder.itemView.performHapticFeedback(0);
            }
        }
        ViewParent parent = this.j.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.e != null);
        }
        if (!zB) {
            this.j.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.h.onSelectedChanged(this.e, this.aa);
        this.j.invalidate();
    }

    private int c(RecyclerView.ViewHolder viewHolder) {
        if (this.aa == 2) {
            return 0;
        }
        int movementFlags = this.h.getMovementFlags(this.j, viewHolder);
        int iConvertToAbsoluteDirection = (this.h.convertToAbsoluteDirection(movementFlags, ViewCompat.getLayoutDirection(this.j)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (Math.abs(this.d) > Math.abs(this.f29609b)) {
            int iC = c(viewHolder, iConvertToAbsoluteDirection);
            if (iC > 0) {
                return (i & iC) == 0 ? Callback.convertToRelativeDirection(iC, ViewCompat.getLayoutDirection(this.j)) : iC;
            }
            int iA = a(viewHolder, iConvertToAbsoluteDirection);
            if (iA > 0) {
                return iA;
            }
        } else {
            int iA2 = a(viewHolder, iConvertToAbsoluteDirection);
            if (iA2 > 0) {
                return iA2;
            }
            int iC2 = c(viewHolder, iConvertToAbsoluteDirection);
            if (iC2 > 0) {
                return (i & iC2) == 0 ? Callback.convertToRelativeDirection(iC2, ViewCompat.getLayoutDirection(this.j)) : iC2;
            }
        }
        return 0;
    }

    private int c(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = ((int) this.d) > 0 ? 8 : 4;
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null && this.f29610c > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.h.getSwipeVelocityThreshold(this.ab));
            float xVelocity = this.g.getXVelocity(this.f29610c);
            float yVelocity = this.g.getYVelocity(this.f29610c);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.h.getSwipeEscapeVelocity(this.y) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.j.getWidth();
        float swipeThreshold = this.h.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.d) <= width * swipeThreshold) {
            return 0;
        }
        return i2;
    }

    private b a(int i, float f, float f2, int i2) {
        RecyclerView.ViewHolder viewHolder = this.e;
        float[] fArr = this.v;
        return new e(viewHolder, i2, i, fArr[0], fArr[1], f, f2, i == 2 ? 0 : c(viewHolder), viewHolder);
    }

    private int a(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f29609b > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null && this.f29610c > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.h.getSwipeVelocityThreshold(this.ab));
            float xVelocity = this.g.getXVelocity(this.f29610c);
            float yVelocity = this.g.getYVelocity(this.f29610c);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.h.getSwipeEscapeVelocity(this.y) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.j.getHeight();
        float swipeThreshold = this.h.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.f29609b) <= height * swipeThreshold) {
            return 0;
        }
        return i2;
    }

    void b(b bVar, int i) {
        this.j.post(new c(bVar, i));
    }

    void e(View view) {
        if (view == this.o) {
            this.o = null;
            Callback callback = this.h;
            if (callback != null) {
                callback.updateSelectedScale(1.0f);
            }
            if (this.ac != null) {
                this.j.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<RecyclerView.ViewHolder> a(RecyclerView.ViewHolder viewHolder) {
        List<RecyclerView.ViewHolder> list = this.z;
        if (list == null) {
            this.z = new ArrayList();
            this.ad = new ArrayList();
        } else {
            list.clear();
            this.ad.clear();
        }
        int boundingBoxMargin = this.h.getBoundingBoxMargin();
        int iRound = Math.round(this.u + this.d) - boundingBoxMargin;
        int iRound2 = Math.round(this.w + this.f29609b) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = viewHolder.itemView.getWidth() + iRound + i;
        int height = viewHolder.itemView.getHeight() + iRound2 + i;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.j.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != viewHolder.itemView) {
                if (childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    e(i2, i3, childAt);
                } else {
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
            }
        }
        return this.z;
    }

    private void e(int i, int i2, View view) {
        RecyclerView.ViewHolder childViewHolder = this.j.getChildViewHolder(view);
        if (this.h.canDropOver(this.j, this.e, childViewHolder)) {
            int iAbs = Math.abs(i - ((view.getLeft() + view.getRight()) / 2));
            int iAbs2 = Math.abs(i2 - ((view.getTop() + view.getBottom()) / 2));
            int i3 = (iAbs * iAbs) + (iAbs2 * iAbs2);
            int size = this.z.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size && i3 > this.ad.get(i5).intValue(); i5++) {
                i4++;
            }
            this.z.add(i4, childViewHolder);
            this.ad.add(i4, Integer.valueOf(i3));
        }
    }

    void e(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            b bVar = this.f.get(size);
            if (bVar.e == viewHolder) {
                bVar.o |= z;
                if (!bVar.k) {
                    bVar.d();
                }
                this.f.remove(size);
                return;
            }
        }
    }
}
