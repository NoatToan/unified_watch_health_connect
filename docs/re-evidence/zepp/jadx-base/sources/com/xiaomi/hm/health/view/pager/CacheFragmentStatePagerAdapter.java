package com.xiaomi.hm.health.view.pager;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/* JADX INFO: loaded from: classes22.dex */
public abstract class CacheFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private static final String c = "superState";
    private static final String d = "pages";
    private static final String e = "pageIndex:";
    private static final String f = "page:";
    private FragmentManager a;
    private SparseArray<Fragment> b;

    public CacheFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
        this.b = new SparseArray<>();
        this.a = fm;
    }

    public String createCacheIndex(int index) {
        return e + index;
    }

    public String createCacheKey(int position) {
        return f + position;
    }

    public abstract Fragment createItem(int position);

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (this.b.indexOfKey(position) >= 0) {
            this.b.remove(position);
        }
        super.destroyItem(container, position, object);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        Fragment fragmentCreateItem = createItem(position);
        this.b.put(position, fragmentCreateItem);
        return fragmentCreateItem;
    }

    public Fragment getItemAt(int position) {
        return this.b.get(position);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable state, ClassLoader loader) {
        Bundle bundle = (Bundle) state;
        int i = bundle.getInt("pages");
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = bundle.getInt(createCacheIndex(i2));
                this.b.put(i3, this.a.getFragment(bundle, createCacheKey(i3)));
            }
        }
        super.restoreState(bundle.getParcelable(c), loader);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Parcelable parcelableSaveState = super.saveState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(c, parcelableSaveState);
        bundle.putInt("pages", this.b.size());
        if (this.b.size() > 0) {
            for (int i = 0; i < this.b.size(); i++) {
                int iKeyAt = this.b.keyAt(i);
                bundle.putInt(createCacheIndex(i), iKeyAt);
                Fragment fragment = this.b.get(iKeyAt);
                if (fragment.isAdded()) {
                    this.a.putFragment(bundle, createCacheKey(iKeyAt), fragment);
                }
            }
        }
        return bundle;
    }
}
