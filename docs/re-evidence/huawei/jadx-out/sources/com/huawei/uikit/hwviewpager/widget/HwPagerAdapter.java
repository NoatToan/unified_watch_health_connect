package com.huawei.uikit.hwviewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HwPagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29805c = "HwPagerAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataSetObservable f29806a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f29807b;

    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f29807b = dataSetObserver;
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public void finishUpdate(ViewGroup viewGroup) {
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public float getPageHeight(int i) {
        return 1.0f;
    }

    public CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return null;
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f29807b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f29806a.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f29806a.registerObserver(dataSetObserver);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f29806a.unregisterObserver(dataSetObserver);
    }
}
