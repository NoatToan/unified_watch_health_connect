package net.lucode.hackware.magicindicator.buildins.commonnavigator.abs;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CommonNavigatorAdapter {
    private final DataSetObservable a = new DataSetObservable();

    public abstract int getCount();

    public abstract IPagerIndicator getIndicator(Context context);

    public abstract IPagerTitleView getTitleView(Context context, int i);

    public float getTitleWeight(Context context, int i) {
        return 1.0f;
    }

    public final void notifyDataSetChanged() {
        this.a.notifyChanged();
    }

    public final void notifyDataSetInvalidated() {
        this.a.notifyInvalidated();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
