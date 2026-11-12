package com.swmansion.rnscreens;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.miui.tsmclient.service.DKFRequestService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenStack extends ScreenContainer<ScreenStackFragment> {
    public final ArrayList<ScreenStackFragment> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set<ScreenStackFragment> f10668k;
    public ScreenStackFragment l;
    public final FragmentManager.n m;
    public final FragmentManager.l n;

    public class a implements FragmentManager.n {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public void a() {
            if (ScreenStack.this.getFragmentManager().s0() == 0) {
                ScreenStack screenStack = ScreenStack.this;
                screenStack.t(screenStack.l);
            }
        }
    }

    public class b extends FragmentManager.l {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            if (ScreenStack.this.l == fragment) {
                ScreenStack screenStack = ScreenStack.this;
                screenStack.setupBackHandlerIfNeeded(screenStack.l);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScreenStackFragment f10671a;

        public c(ScreenStackFragment screenStackFragment) {
            this.f10671a = screenStackFragment;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10671a.s().bringToFront();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10673a;

        static {
            int[] iArr = new int[Screen.StackAnimation.values().length];
            f10673a = iArr;
            try {
                iArr[Screen.StackAnimation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10673a[Screen.StackAnimation.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ScreenStack(Context context) {
        super(context);
        this.j = new ArrayList<>();
        this.f10668k = new HashSet();
        this.l = null;
        this.m = new a();
        this.n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupBackHandlerIfNeeded(ScreenStackFragment screenStackFragment) {
        ScreenStackFragment screenStackFragment2;
        if (this.l.isResumed()) {
            getFragmentManager().removeOnBackStackChangedListener(this.m);
            getFragmentManager().j1("RN_SCREEN_LAST", 1);
            int size = this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    screenStackFragment2 = null;
                    break;
                }
                screenStackFragment2 = this.j.get(i);
                if (!this.f10668k.contains(screenStackFragment2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (screenStackFragment == screenStackFragment2 || !screenStackFragment.t()) {
                return;
            }
            getFragmentManager().o().t(screenStackFragment).F(screenStackFragment).j("RN_SCREEN_LAST").C(screenStackFragment).m();
            getFragmentManager().addOnBackStackChangedListener(this.m);
        }
    }

    public Screen getRootScreen() {
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            Screen screenH = h(i);
            if (!this.f10668k.contains(screenH.getFragment())) {
                return screenH;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    public Screen getTopScreen() {
        return this.l.s();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void m() {
        for (ScreenStackFragment screenStackFragment : this.j) {
            if (!this.f10663a.contains(screenStackFragment) || this.f10668k.contains(screenStackFragment)) {
                getOrCreateTransaction().v(screenStackFragment);
            }
        }
        ScreenStackFragment screenStackFragment2 = null;
        ScreenStackFragment screenStackFragment3 = null;
        for (int size = this.f10663a.size() - 1; size >= 0; size--) {
            ScreenStackFragment screenStackFragment4 = (ScreenStackFragment) this.f10663a.get(size);
            if (!this.f10668k.contains(screenStackFragment4)) {
                if (screenStackFragment3 != null) {
                    screenStackFragment2 = screenStackFragment4;
                    break;
                } else {
                    if (screenStackFragment4.s().getStackPresentation() != Screen.StackPresentation.TRANSPARENT_MODAL) {
                        screenStackFragment3 = screenStackFragment4;
                        break;
                    }
                    screenStackFragment3 = screenStackFragment4;
                }
            }
        }
        for (T t : this.f10663a) {
            if (!this.j.contains(t) && !this.f10668k.contains(t)) {
                getOrCreateTransaction().b(getId(), t);
            }
            if (t != screenStackFragment3 && t != screenStackFragment2 && !this.f10668k.contains(t)) {
                getOrCreateTransaction().t(t);
            }
        }
        if (screenStackFragment2 != null) {
            getOrCreateTransaction().F(screenStackFragment2).z(new c(screenStackFragment3));
        }
        if (screenStackFragment3 != null) {
            getOrCreateTransaction().F(screenStackFragment3);
        }
        if (this.j.contains(screenStackFragment3)) {
            ScreenStackFragment screenStackFragment5 = this.l;
            if (screenStackFragment5 != null && !screenStackFragment5.equals(screenStackFragment3)) {
                int i = d.f10673a[this.l.s().getStackAnimation().ordinal()];
                getOrCreateTransaction().E(i != 1 ? i != 2 ? 8194 : 4099 : 0);
            }
        } else {
            ScreenStackFragment screenStackFragment6 = this.l;
            if (screenStackFragment6 != null) {
                int i2 = d.f10673a[screenStackFragment6.s().getStackAnimation().ordinal()];
                getOrCreateTransaction().E(i2 != 1 ? i2 != 2 ? DKFRequestService.s0 : 4099 : 0);
            }
        }
        this.l = screenStackFragment3;
        this.j.clear();
        this.j.addAll(this.f10663a);
        o();
        ScreenStackFragment screenStackFragment7 = this.l;
        if (screenStackFragment7 != null) {
            setupBackHandlerIfNeeded(screenStackFragment7);
        }
        Iterator<ScreenStackFragment> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void n(int i) {
        this.f10668k.remove(h(i));
        super.n(i);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getFragmentManager().p1(this.n, false);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.removeOnBackStackChangedListener(this.m);
        getFragmentManager().I1(this.n);
        if (fragmentManager.T0()) {
            return;
        }
        fragmentManager.j1("RN_SCREEN_LAST", 1);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ScreenStackFragment c(Screen screen) {
        return new ScreenStackFragment(screen);
    }

    public void t(ScreenStackFragment screenStackFragment) {
        this.f10668k.add(screenStackFragment);
        m();
    }
}
