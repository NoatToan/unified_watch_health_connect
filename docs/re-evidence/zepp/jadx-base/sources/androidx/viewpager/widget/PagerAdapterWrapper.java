package androidx.viewpager.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class PagerAdapterWrapper extends PagerAdapter {
    public PagerAdapter wrapped;

    public PagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.wrapped = null;
        this.wrapped = pagerAdapter;
    }

    public void attachViewPager(ViewPager viewPager) {
        try {
            Field[] declaredFields = ViewPager.class.getDeclaredFields();
            if (declaredFields == null || declaredFields.length <= 0) {
                return;
            }
            for (Field field : declaredFields) {
                if (PagerAdapter.class.equals(field.getType())) {
                    field.setAccessible(true);
                    field.set(viewPager, this);
                    return;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.wrapped.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.wrapped.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.wrapped.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.wrapped.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.wrapped.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return this.wrapped.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.wrapped.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.wrapped.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.wrapped.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.wrapped.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.wrapped.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.wrapped.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.wrapped.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        super.setViewPagerObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.wrapped.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.wrapped.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void destroyItem(View view, int i, Object obj) {
        this.wrapped.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void finishUpdate(View view) {
        this.wrapped.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public Object instantiateItem(View view, int i) {
        return this.wrapped.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void setPrimaryItem(View view, int i, Object obj) {
        this.wrapped.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void startUpdate(View view) {
        this.wrapped.startUpdate(view);
    }
}
