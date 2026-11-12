package com.huawei.uikit.hwrecyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.uikit.hwrecyclerview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes44.dex */
public class HwDefaultItemAnimator extends SimpleItemAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static TimeInterpolator f29564b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RecyclerView.ViewHolder> f29565a = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<RecyclerView.ViewHolder> f29566c = new ArrayList(10);
    private List<k> d = new ArrayList(10);
    private List<n> e = new ArrayList(10);
    private List<List<RecyclerView.ViewHolder>> h = new ArrayList(10);
    private List<List<k>> f = new ArrayList(10);
    private List<List<n>> j = new ArrayList(10);
    private List<RecyclerView.ViewHolder> g = new ArrayList(10);
    private List<RecyclerView.ViewHolder> i = new ArrayList(10);
    private List<RecyclerView.ViewHolder> l = new ArrayList(10);
    private List<RecyclerView.ViewHolder> k = new ArrayList(10);
    private int m = 1;
    private ItemDeleteCallBack o = null;
    private Animator n = null;

    public interface ItemDeleteCallBack {
        Animator playDisappearAnimator();
    }

    class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29567a;
        private int d;

        /* synthetic */ a(HwDefaultItemAnimator hwDefaultItemAnimator, Resources resources, Bitmap bitmap, m mVar) {
            this(resources, bitmap);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (canvas == null) {
                Log.e("DefaultItemAnimator", "draw: canvas is null");
                return;
            }
            canvas.save();
            canvas.translate(this.f29567a, this.d);
            super.draw(canvas);
            canvas.restore();
        }

        private a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, int i2) {
            this.f29567a = i;
            this.d = i2;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f29568a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f29570c;
        final /* synthetic */ RecyclerView.ViewHolder d;
        final /* synthetic */ View e;

        b(RecyclerView.ViewHolder viewHolder, Animator animator, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.d = viewHolder;
            this.f29568a = animator;
            this.f29570c = viewPropertyAnimator;
            this.e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29568a.cancel();
            if (HwDefaultItemAnimator.this.n != null) {
                HwDefaultItemAnimator.this.n.cancel();
                HwDefaultItemAnimator.this.n = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwDefaultItemAnimator.this.n = null;
            this.f29570c.setListener(null);
            this.e.setAlpha(1.0f);
            this.e.setScaleX(1.0f);
            this.e.setScaleY(1.0f);
            HwDefaultItemAnimator.this.dispatchRemoveFinished(this.d);
            HwDefaultItemAnimator.this.l.remove(this.d);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchRemoveStarting(this.d);
        }
    }

    class c implements Runnable {
        final /* synthetic */ List e;

        c(List list) {
            this.e = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (RecyclerView.ViewHolder viewHolder : this.e) {
                if (HwDefaultItemAnimator.this.m == 3) {
                    HwDefaultItemAnimator.this.b(viewHolder, false, null);
                } else {
                    HwDefaultItemAnimator.this.c(viewHolder);
                }
            }
            this.e.clear();
            HwDefaultItemAnimator.this.h.remove(this.e);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        d(View view) {
            this.e = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("DefaultItemAnimator", "animatorScale: onAnimationUpdate: animation is null");
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Float) {
                float fFloatValue = ((Float) animatedValue).floatValue();
                this.e.setScaleX(fFloatValue);
                this.e.setScaleY(fFloatValue);
            }
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f29573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f29574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29575c;

        e(n nVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f29573a = nVar;
            this.f29574b = viewPropertyAnimator;
            this.f29575c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29574b.setListener(null);
            this.f29575c.setAlpha(1.0f);
            this.f29575c.setTranslationX(0.0f);
            this.f29575c.setTranslationY(0.0f);
            HwDefaultItemAnimator.this.dispatchChangeFinished(this.f29573a.f29595c, true);
            HwDefaultItemAnimator.this.k.remove(this.f29573a.f29595c);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchChangeStarting(this.f29573a.f29595c, true);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29576a;
        final /* synthetic */ ViewPropertyAnimator d;
        final /* synthetic */ RecyclerView.ViewHolder e;

        f(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.e = viewHolder;
            this.d = viewPropertyAnimator;
            this.f29576a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.d.setListener(null);
            this.f29576a.setAlpha(1.0f);
            HwDefaultItemAnimator.this.dispatchRemoveFinished(this.e);
            HwDefaultItemAnimator.this.l.remove(this.e);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchRemoveStarting(this.e);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewParent f29578b;
        final /* synthetic */ BitmapDrawable d;

        g(BitmapDrawable bitmapDrawable, ViewParent viewParent) {
            this.d = bitmapDrawable;
            this.f29578b = viewParent;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("DefaultItemAnimator", "animateMoveImplPre: onAnimationUpdate: animation is null");
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.d.setAlpha(((Integer) animatedValue).intValue());
                ((ViewGroup) this.f29578b).invalidate();
            }
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f29579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29580b;
        final /* synthetic */ n d;

        h(n nVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.d = nVar;
            this.f29579a = viewPropertyAnimator;
            this.f29580b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29579a.setListener(null);
            this.f29580b.setAlpha(1.0f);
            this.f29580b.setTranslationX(0.0f);
            this.f29580b.setTranslationY(0.0f);
            HwDefaultItemAnimator.this.dispatchChangeFinished(this.d.f29594b, false);
            HwDefaultItemAnimator.this.k.remove(this.d.f29594b);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchChangeStarting(this.d.f29594b, false);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f29582b;

        i(List list) {
            this.f29582b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f29582b.iterator();
            while (it.hasNext()) {
                HwDefaultItemAnimator.this.d((n) it.next());
            }
            this.f29582b.clear();
            HwDefaultItemAnimator.this.j.remove(this.f29582b);
        }
    }

    class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f29584b;
        final /* synthetic */ RecyclerView.ViewHolder e;

        j(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.e = viewHolder;
            this.f29583a = view;
            this.f29584b = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29583a.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29584b.setListener(null);
            HwDefaultItemAnimator.this.dispatchAddFinished(this.e);
            HwDefaultItemAnimator.this.g.remove(this.e);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchAddStarting(this.e);
        }
    }

    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29587c;
        private RecyclerView.ViewHolder d;
        private int e;

        k(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.d = viewHolder;
            this.f29585a = i;
            this.f29587c = i2;
            this.e = i3;
            this.f29586b = i4;
        }
    }

    class l extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f29588a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroupOverlay f29590c;

        l(ViewGroupOverlay viewGroupOverlay, BitmapDrawable bitmapDrawable) {
            this.f29590c = viewGroupOverlay;
            this.f29588a = bitmapDrawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29590c.remove(this.f29588a);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f29592b;
        final /* synthetic */ List d;

        m(List list, List list2) {
            this.f29592b = list;
            this.d = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            for (Object obj : this.f29592b) {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    if (HwDefaultItemAnimator.this.m != 1) {
                        HwDefaultItemAnimator.this.b(kVar.d, true, z ? this.d : null);
                    } else {
                        HwDefaultItemAnimator.this.b(kVar.d, kVar.f29585a, kVar.f29587c, kVar.e, kVar.f29586b);
                    }
                    z = false;
                }
            }
            this.f29592b.clear();
            HwDefaultItemAnimator.this.f.remove(this.f29592b);
        }
    }

    static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.ViewHolder f29594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RecyclerView.ViewHolder f29595c;
        private int d;
        private int e;
        private int g;

        /* synthetic */ n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, m mVar) {
            this(viewHolder, viewHolder2);
        }

        public String toString() {
            return "ChangeInfo{mOldHolder=" + this.f29595c + ", mNewHolder=" + this.f29594b + ", mFromX=" + this.e + ", mFromY=" + this.d + ", mToX=" + this.f29593a + ", mToY=" + this.g + '}';
        }

        private n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f29595c = viewHolder;
            this.f29594b = viewHolder2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, int i2, int i3, int i4) {
            this.e = i;
            this.d = i2;
            this.f29593a = i3;
            this.g = i4;
        }
    }

    class o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f29596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29598c;
        final /* synthetic */ RecyclerView.ViewHolder d;
        final /* synthetic */ Animator e;
        final /* synthetic */ ViewPropertyAnimator j;

        o(RecyclerView.ViewHolder viewHolder, Animator animator, boolean z, List list, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.d = viewHolder;
            this.e = animator;
            this.f29598c = z;
            this.f29596a = list;
            this.f29597b = view;
            this.j = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            List list;
            this.e.cancel();
            if (this.f29598c && (list = this.f29596a) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Animator) it.next()).cancel();
                }
            }
            this.f29597b.setAlpha(1.0f);
            this.f29597b.setScaleX(1.0f);
            this.f29597b.setScaleY(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.j.setListener(null);
            if (this.f29598c) {
                HwDefaultItemAnimator.this.dispatchMoveFinished(this.d);
                HwDefaultItemAnimator.this.i.remove(this.d);
                HwDefaultItemAnimator.this.c();
            } else {
                HwDefaultItemAnimator.this.dispatchAddFinished(this.d);
                HwDefaultItemAnimator.this.g.remove(this.d);
                HwDefaultItemAnimator.this.c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchMoveStarting(this.d);
        }
    }

    class q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f29601c;
        final /* synthetic */ ViewPropertyAnimator d;
        final /* synthetic */ int e;

        q(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f29601c = viewHolder;
            this.e = i;
            this.f29600b = view;
            this.f29599a = i2;
            this.d = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.e != 0) {
                this.f29600b.setTranslationX(0.0f);
            }
            if (this.f29599a != 0) {
                this.f29600b.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.d.setListener(null);
            HwDefaultItemAnimator.this.dispatchMoveFinished(this.f29601c);
            HwDefaultItemAnimator.this.i.remove(this.f29601c);
            HwDefaultItemAnimator.this.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwDefaultItemAnimator.this.dispatchMoveStarting(this.f29601c);
        }
    }

    class t implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f29602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f29603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29604c;

        t(float f, float f2, View view) {
            this.f29602a = f;
            this.f29603b = f2;
            this.f29604c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("DefaultItemAnimator", "animateRemoveImplEx: animatorScale: animation is null");
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f29602a;
            float f2 = this.f29603b;
            this.f29604c.setScaleX(f - ((f - 0.3f) * fFloatValue));
            this.f29604c.setScaleY(f2 - ((f2 - 0.3f) * fFloatValue));
        }
    }

    private boolean b(boolean z, boolean z2, boolean z3, boolean z4) {
        return z || z2 || z3 || z4;
    }

    protected void a(ViewPropertyAnimator viewPropertyAnimator) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f29566c.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        a(viewHolder);
        viewHolder.itemView.setAlpha(alpha);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        if (viewHolder2 != null) {
            a(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i6);
            viewHolder2.itemView.setTranslationY(-i7);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        n nVar = new n(viewHolder, viewHolder2, null);
        nVar.d(i2, i3, i4, i5);
        this.e.add(nVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        a(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.d.add(new k(viewHolder, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
        this.f29565a.add(viewHolder);
        return true;
    }

    protected void c(ViewPropertyAnimator viewPropertyAnimator) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    protected void e(int i2, ViewPropertyAnimator viewPropertyAnimator) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.d.size() - 1; size >= 0; size--) {
            if (this.d.get(size).d == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.d.remove(size);
            }
        }
        e(this.e, viewHolder);
        if (this.f29565a.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f29566c.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.j.size() - 1; size2 >= 0; size2--) {
            List<n> list = this.j.get(size2);
            e(list, viewHolder);
            if (list.isEmpty()) {
                this.j.remove(size2);
            }
        }
        a(view, viewHolder);
        d(view, viewHolder);
        this.l.remove(viewHolder);
        this.g.remove(viewHolder);
        this.k.remove(viewHolder);
        this.i.remove(viewHolder);
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            k kVar = this.d.get(size);
            View view = kVar.d.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(kVar.d);
            this.d.remove(size);
        }
        for (int size2 = this.f29565a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f29565a.get(size2));
            this.f29565a.remove(size2);
        }
        for (int size3 = this.f29566c.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f29566c.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f29566c.remove(size3);
        }
        for (int size4 = this.e.size() - 1; size4 >= 0; size4--) {
            e(this.e.get(size4));
        }
        this.e.clear();
        if (isRunning()) {
            d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.f29566c.isEmpty() && this.e.isEmpty() && this.d.isEmpty() && this.f29565a.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.k.isEmpty() && this.h.isEmpty() && this.j.isEmpty()) {
            return !this.f.isEmpty();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z = !this.f29565a.isEmpty();
        boolean zIsEmpty = this.d.isEmpty();
        boolean z2 = !zIsEmpty;
        boolean zIsEmpty2 = this.e.isEmpty();
        boolean z3 = !zIsEmpty2;
        boolean zIsEmpty3 = this.f29566c.isEmpty();
        if (b(z, z2, !zIsEmpty3, z3)) {
            a();
            if (!zIsEmpty) {
                e(z);
            }
            if (!zIsEmpty2) {
                d(z);
            }
            if (zIsEmpty3) {
                return;
            }
            a(z, z2, z3);
        }
    }

    private void a() {
        ItemDeleteCallBack itemDeleteCallBack;
        for (RecyclerView.ViewHolder viewHolder : this.f29565a) {
            if (this.m == 1) {
                d(viewHolder);
            } else {
                e(viewHolder);
            }
        }
        if (this.m == 3 && (itemDeleteCallBack = this.o) != null) {
            this.n = itemDeleteCallBack.playDisappearAnimator();
        }
        this.f29565a.clear();
    }

    private void a(RecyclerView.ViewHolder viewHolder) {
        if (f29564b == null) {
            f29564b = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f29564b);
        endAnimation(viewHolder);
    }

    private void e(boolean z) {
        ArrayList<k> arrayList = new ArrayList(this.d.size());
        arrayList.addAll(this.d);
        this.f.add(arrayList);
        this.d.clear();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (this.m != 1) {
            for (k kVar : arrayList) {
                Animator animatorA = a(kVar.d, kVar.f29585a, kVar.f29587c, kVar.e, kVar.f29586b);
                if (animatorA != null) {
                    arrayList2.add(animatorA);
                }
            }
        }
        m mVar = new m(arrayList, arrayList2);
        if (!z) {
            mVar.run();
            return;
        }
        View view = ((k) arrayList.get(0)).d.itemView;
        if (this.m == 1) {
            ViewCompat.postOnAnimationDelayed(view, mVar, getRemoveDuration());
        } else {
            ViewCompat.postOnAnimationDelayed(view, mVar, 100L);
        }
    }

    private void d(boolean z) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(this.e);
        this.j.add(arrayList);
        this.e.clear();
        i iVar = new i(arrayList);
        if (z) {
            ViewCompat.postOnAnimationDelayed(((n) arrayList.get(0)).f29595c.itemView, iVar, getRemoveDuration());
        } else {
            iVar.run();
        }
    }

    private void e(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(150L).alpha(0.0f).setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), R.interpolator.cubic_bezier_interpolator_type_33_33)).setListener(c(viewHolder, valueAnimatorOfFloat, viewPropertyAnimatorAnimate)).start();
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), 17563663));
        valueAnimatorOfFloat.addUpdateListener(new t(scaleX, scaleY, view));
        valueAnimatorOfFloat.start();
    }

    private void a(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(this.f29566c);
        this.h.add(arrayList);
        this.f29566c.clear();
        c cVar = new c(arrayList);
        if (!z && !z2 && !z3) {
            cVar.run();
            return;
        }
        long removeDuration = z ? getRemoveDuration() : 0L;
        long moveDuration = z2 ? getMoveDuration() : 0L;
        if (this.m != 1 && z) {
            removeDuration = 100;
            moveDuration = 0;
        }
        long changeDuration = z3 ? getChangeDuration() : 0L;
        ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder) arrayList.get(0)).itemView, cVar, moveDuration > changeDuration ? removeDuration + moveDuration : removeDuration + changeDuration);
    }

    private void d(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.l.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration());
        c(viewPropertyAnimatorAnimate);
        viewPropertyAnimatorAnimate.alpha(0.0f).setListener(new f(viewHolder, viewPropertyAnimatorAnimate, view)).start();
    }

    private void b(View view) {
        view.setAlpha(0.0f);
        view.setScaleX(0.85f);
        view.setScaleY(0.85f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    private Animator.AnimatorListener c(RecyclerView.ViewHolder viewHolder, Animator animator, ViewPropertyAnimator viewPropertyAnimator) {
        return new b(viewHolder, animator, viewPropertyAnimator, viewHolder.itemView);
    }

    private Animator a(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        BitmapDrawable bitmapDrawableC = c(view, i4 - i2, i5 - i3);
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            Log.e("DefaultItemAnimator", "animateMoveImplPre: viewParent is not instance of ViewGroup");
            return null;
        }
        ViewGroupOverlay overlay = ((ViewGroup) parent).getOverlay();
        if (overlay != null && bitmapDrawableC != null) {
            overlay.add(bitmapDrawableC);
            view.setAlpha(0.0f);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), R.interpolator.cubic_bezier_interpolator_type_33_33));
            valueAnimatorOfInt.addListener(new l(overlay, bitmapDrawableC));
            valueAnimatorOfInt.addUpdateListener(new g(bitmapDrawableC, parent));
            valueAnimatorOfInt.start();
            return valueAnimatorOfInt;
        }
        Log.e("DefaultItemAnimator", "animateMoveImplPre: overlayView or drawable is null");
        return null;
    }

    private BitmapDrawable c(View view, int i2, int i3) {
        int width = view.getWidth();
        int height = view.getHeight();
        m mVar = null;
        if (width > 0 && height > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            a aVar = new a(this, view.getResources(), bitmapCreateBitmap, mVar);
            aVar.setBounds(0, 0, width, height);
            aVar.b(view.getLeft() - i2, view.getTop() - i3);
            return aVar;
        }
        Log.w("DefaultItemAnimator", "getDrawableByView: width or height is invalid.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return;
        }
        View view = viewHolder.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.g.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getAddDuration());
        a(viewPropertyAnimatorAnimate);
        viewPropertyAnimatorAnimate.alpha(1.0f).setListener(new j(viewHolder, view, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.i.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration());
        e(i7, viewPropertyAnimatorAnimate);
        viewPropertyAnimatorAnimate.setListener(new q(viewHolder, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    private void e(n nVar) {
        if (nVar.f29595c != null) {
            c(nVar, nVar.f29595c);
        }
        if (nVar.f29594b != null) {
            c(nVar, nVar.f29594b);
        }
    }

    private void a(View view, RecyclerView.ViewHolder viewHolder) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            List<k> list = this.f.get(size);
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (list.get(size2).d == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    list.remove(size2);
                    if (!list.isEmpty()) {
                        break;
                    }
                    this.f.remove(size);
                    break;
                }
            }
        }
    }

    private void d() {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            List<k> list = this.f.get(size);
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                k kVar = list.get(size2);
                View view = kVar.d.itemView;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(kVar.d);
                list.remove(size2);
                if (list.isEmpty()) {
                    this.f.remove(list);
                }
            }
        }
        for (int size3 = this.h.size() - 1; size3 >= 0; size3--) {
            List<RecyclerView.ViewHolder> list2 = this.h.get(size3);
            for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
                RecyclerView.ViewHolder viewHolder = list2.get(size4);
                viewHolder.itemView.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                list2.remove(size4);
                if (list2.isEmpty()) {
                    this.h.remove(list2);
                }
            }
        }
        for (int size5 = this.j.size() - 1; size5 >= 0; size5--) {
            List<n> list3 = this.j.get(size5);
            for (int size6 = list3.size() - 1; size6 >= 0; size6--) {
                e(list3.get(size6));
                if (list3.isEmpty()) {
                    this.j.remove(list3);
                }
            }
        }
        c(this.l);
        c(this.i);
        c(this.g);
        c(this.k);
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerView.ViewHolder viewHolder, boolean z, List<Animator> list) {
        View view = viewHolder.itemView;
        b(view);
        if (z) {
            this.i.add(viewHolder);
        } else {
            this.g.add(viewHolder);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.85f, 1.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        Animator.AnimatorListener animatorListenerA = a(viewHolder, z, viewPropertyAnimatorAnimate, valueAnimatorOfFloat, list);
        viewPropertyAnimatorAnimate.alpha(1.0f).setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), R.interpolator.cubic_bezier_interpolator_type_33_33));
        viewPropertyAnimatorAnimate.setDuration(200L).setListener(animatorListenerA).start();
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), 17563661));
        valueAnimatorOfFloat.addUpdateListener(new d(view));
        valueAnimatorOfFloat.start();
    }

    private Animator.AnimatorListener a(RecyclerView.ViewHolder viewHolder, boolean z, ViewPropertyAnimator viewPropertyAnimator, Animator animator, List<Animator> list) {
        return new o(viewHolder, animator, z, list, viewHolder.itemView, viewPropertyAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(n nVar) {
        RecyclerView.ViewHolder viewHolder = nVar.f29595c;
        View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = nVar.f29594b;
        View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.k.add(nVar.f29595c);
            duration.translationX(nVar.f29593a - nVar.e);
            duration.translationY(nVar.g - nVar.d);
            duration.alpha(0.0f).setListener(new e(nVar, duration, view)).start();
        }
        if (view2 != null) {
            e(view2, nVar);
        }
    }

    private void e(View view, n nVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.k.add(nVar.f29594b);
        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(nVar, viewPropertyAnimatorAnimate, view)).start();
    }

    private void e(List<n> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            n nVar = list.get(size);
            if (c(nVar, viewHolder) && nVar.f29595c == null && nVar.f29594b == null) {
                list.remove(nVar);
            }
        }
    }

    private boolean c(n nVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (nVar.f29594b != viewHolder) {
            if (nVar.f29595c != viewHolder) {
                return false;
            }
            nVar.f29595c = null;
            z = true;
        } else {
            nVar.f29594b = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    private void d(View view, RecyclerView.ViewHolder viewHolder) {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            List<RecyclerView.ViewHolder> list = this.h.get(size);
            if (list.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (list.isEmpty()) {
                    this.h.remove(size);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    private void c(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }
}
