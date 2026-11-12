package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class iaa extends eih {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private k mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public iaa(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.eih
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.o();
        }
        this.mCurTransaction.q(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // defpackage.eih
    public void finishUpdate(ViewGroup viewGroup) {
        k kVar = this.mCurTransaction;
        if (kVar != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    kVar.o();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // defpackage.eih
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.o();
        }
        long itemId = getItemId(i);
        Fragment fragmentL0 = this.mFragmentManager.l0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentL0 != null) {
            this.mCurTransaction.k(fragmentL0);
        } else {
            fragmentL0 = getItem(i);
            this.mCurTransaction.c(viewGroup.getId(), fragmentL0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentL0 != this.mCurrentPrimaryItem) {
            fragmentL0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.B(fragmentL0, Lifecycle.State.STARTED);
            } else {
                fragmentL0.setUserVisibleHint(false);
            }
        }
        return fragmentL0;
    }

    @Override // defpackage.eih
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // defpackage.eih
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // defpackage.eih
    public Parcelable saveState() {
        return null;
    }

    @Override // defpackage.eih
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.o();
                    }
                    this.mCurTransaction.B(this.mCurrentPrimaryItem, Lifecycle.State.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.o();
                }
                this.mCurTransaction.B(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // defpackage.eih
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public iaa(FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }
}
