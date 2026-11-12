package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class a0 extends fe.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private g0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final v mFragmentManager;

    public a0(v vVar, int i14) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = vVar;
        this.mBehavior = i14;
    }

    private static String makeFragmentName(int i14, long j8) {
        return "android:switcher:" + i14 + ":" + j8;
    }

    @Override // fe.a
    public void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            v vVar = this.mFragmentManager;
            this.mCurTransaction = androidx.core.view.j.b(vVar, vVar);
        }
        this.mCurTransaction.h(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // fe.a
    public void finishUpdate(ViewGroup viewGroup) {
        g0 g0Var = this.mCurTransaction;
        if (g0Var != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    g0Var.f();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th3) {
                    this.mExecutingFinishUpdate = false;
                    throw th3;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i14);

    public long getItemId(int i14) {
        return i14;
    }

    @Override // fe.a
    public Object instantiateItem(ViewGroup viewGroup, int i14) {
        if (this.mCurTransaction == null) {
            v vVar = this.mFragmentManager;
            this.mCurTransaction = androidx.core.view.j.b(vVar, vVar);
        }
        long itemId = getItemId(i14);
        Fragment fragmentG = this.mFragmentManager.G(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentG != null) {
            g0 g0Var = this.mCurTransaction;
            g0Var.getClass();
            g0Var.c(new g0.a(7, fragmentG));
        } else {
            fragmentG = getItem(i14);
            this.mCurTransaction.j(viewGroup.getId(), fragmentG, makeFragmentName(viewGroup.getId(), itemId), 1);
        }
        if (fragmentG != this.mCurrentPrimaryItem) {
            fragmentG.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.p(fragmentG, androidx.lifecycle.b0.b.STARTED);
                return fragmentG;
            }
            fragmentG.setUserVisibleHint(false);
        }
        return fragmentG;
    }

    @Override // fe.a
    public boolean isViewFromObject(View view2, Object obj) {
        return ((Fragment) obj).getView() == view2;
    }

    @Override // fe.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // fe.a
    public Parcelable saveState() {
        return null;
    }

    @Override // fe.a
    public void setPrimaryItem(ViewGroup viewGroup, int i14, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        v vVar = this.mFragmentManager;
                        this.mCurTransaction = androidx.core.view.j.b(vVar, vVar);
                    }
                    this.mCurTransaction.p(this.mCurrentPrimaryItem, androidx.lifecycle.b0.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    v vVar2 = this.mFragmentManager;
                    this.mCurTransaction = androidx.core.view.j.b(vVar2, vVar2);
                }
                this.mCurTransaction.p(fragment, androidx.lifecycle.b0.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // fe.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        kg.f.o("ViewPager with adapter ", this, " requires a view id");
    }

    @Deprecated
    public a0(v vVar) {
        this(vVar, 0);
    }
}
