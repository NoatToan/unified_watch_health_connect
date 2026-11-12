package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.ReactChoreographer;
import com.swmansion.rnscreens.ScreenFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenContainer<T extends ScreenFragment> extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<T> f10663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<ScreenFragment> f10664b;
    public FragmentManager c;
    public k d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final com.facebook.react.modules.core.a.AbstractC0164a h;
    public final Runnable i;

    public class a extends com.facebook.react.modules.core.a.AbstractC0164a {
        public a() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0164a
        public void a(long j) {
            ScreenContainer.this.p();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenContainer.this.g = false;
            ScreenContainer screenContainer = ScreenContainer.this;
            screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ScreenContainer.this.getHeight(), 1073741824));
            ScreenContainer screenContainer2 = ScreenContainer.this;
            screenContainer2.layout(screenContainer2.getLeft(), ScreenContainer.this.getTop(), ScreenContainer.this.getRight(), ScreenContainer.this.getBottom());
        }
    }

    public ScreenContainer(Context context) {
        super(context);
        this.f10663a = new ArrayList<>();
        this.f10664b = new HashSet();
        this.g = false;
        this.h = new a();
        this.i = new b();
    }

    public T c(Screen screen) {
        return (T) new ScreenFragment(screen);
    }

    public void d(Screen screen, int i) {
        ScreenFragment screenFragmentC = c(screen);
        screen.setFragment(screenFragmentC);
        this.f10663a.add(i, (T) screenFragmentC);
        screen.setContainer(this);
        j();
    }

    public final void e(ScreenFragment screenFragment) {
        getOrCreateTransaction().b(getId(), screenFragment);
        this.f10664b.add(screenFragment);
    }

    public final void f(ScreenFragment screenFragment) {
        getOrCreateTransaction().v(screenFragment);
        this.f10664b.remove(screenFragment);
    }

    public final FragmentManager g() {
        boolean z;
        boolean z2;
        ViewParent parent = this;
        while (true) {
            z = parent instanceof ReactRootView;
            if (z || (parent instanceof Screen) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
        }
        if (parent instanceof Screen) {
            return ((Screen) parent).getFragment().getChildFragmentManager();
        }
        if (!z) {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        }
        Context context = ((ReactRootView) parent).getContext();
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z2) {
            return ((FragmentActivity) context).getSupportFragmentManager();
        }
        throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactFragmentActivity or ReactCompatActivity");
    }

    public final FragmentManager getFragmentManager() {
        if (this.c == null) {
            this.c = g();
        }
        return this.c;
    }

    public k getOrCreateTransaction() {
        if (this.d == null) {
            k kVarO = getFragmentManager().o();
            this.d = kVarO;
            kVarO.D(true);
        }
        return this.d;
    }

    public int getScreenCount() {
        return this.f10663a.size();
    }

    public Screen h(int i) {
        return this.f10663a.get(i).s();
    }

    public boolean i(ScreenFragment screenFragment) {
        return screenFragment.s().b();
    }

    public void j() {
        if (this.e) {
            return;
        }
        this.e = true;
        ReactChoreographer.i().m(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.h);
    }

    public final void k(ScreenFragment screenFragment) {
        k orCreateTransaction = getOrCreateTransaction();
        orCreateTransaction.v(screenFragment);
        orCreateTransaction.b(getId(), screenFragment);
    }

    public void l() {
        j();
    }

    public void m() {
        HashSet hashSet = new HashSet(this.f10664b);
        int size = this.f10663a.size();
        for (int i = 0; i < size; i++) {
            T t = this.f10663a.get(i);
            if (!i(t) && this.f10664b.contains(t)) {
                f(t);
            }
            hashSet.remove(t);
        }
        if (!hashSet.isEmpty()) {
            for (Object obj : hashSet.toArray()) {
                f((ScreenFragment) obj);
            }
        }
        int size2 = this.f10663a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            if (i(this.f10663a.get(i3))) {
                i2++;
            }
        }
        boolean z = i2 > 1;
        int size3 = this.f10663a.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size3; i4++) {
            T t2 = this.f10663a.get(i4);
            boolean zI = i(t2);
            if (zI && !this.f10664b.contains(t2)) {
                e(t2);
                z2 = true;
            } else if (zI && z2) {
                k(t2);
            }
            t2.s().setTransitioning(z);
        }
        o();
    }

    public void n(int i) {
        this.f10663a.get(i).s().setContainer(null);
        this.f10663a.remove(i);
        j();
    }

    public void o() {
        k kVar = this.d;
        if (kVar != null) {
            kVar.m();
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    public final void p() {
        if (this.e && this.f) {
            this.e = false;
            m();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.g) {
            return;
        }
        this.g = true;
        post(this.i);
    }
}
