package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.emotion;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import defpackage.jhg;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class GridViewEmotionAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<jhg> f10762b;
    private Context e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public GridViewEmotionAdapter(Context context, List<jhg> list) {
        this.e = context;
        this.f10762b = list;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (!(view instanceof ImageView)) {
            imageView = new ImageView(this.e);
        } else {
            imageView = (ImageView) view;
        }
        Object item = getItem(i);
        if (item instanceof jhg) {
            imageView.setImageResource(((jhg) item).a());
        }
        return imageView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10762b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.f10762b, i)) {
            return null;
        }
        return this.f10762b.get(i);
    }
}
