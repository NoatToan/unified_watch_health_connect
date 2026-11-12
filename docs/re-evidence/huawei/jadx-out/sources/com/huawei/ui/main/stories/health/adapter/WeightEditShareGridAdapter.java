package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.view.RoundedImageView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qqf;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WeightEditShareGridAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Bitmap> f27797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27798b;
    private int d;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WeightEditShareGridAdapter(Context context, List<Bitmap> list, int i) {
        this.f27798b = context;
        this.f27797a = list;
        this.d = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<Bitmap> list = this.f27797a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.c(this.f27797a, i)) {
            return this.f27797a.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f27798b).inflate(R.layout.hw_health_edit_share_gridview_item, (ViewGroup) null);
        if (viewInflate == null) {
            LogUtil.j("WeightEditShareGridAdapter", "getView convertView is null");
            return viewInflate;
        }
        RoundedImageView roundedImageView = (RoundedImageView) viewInflate.findViewById(R.id.hw_health_edit_share_select);
        qqf.d(R.mipmap.hw_health_edit_share_select_img, roundedImageView);
        RoundedImageView roundedImageView2 = (RoundedImageView) viewInflate.findViewById(R.id.hw_health_edit_share_gridview_img);
        if (this.d != 0) {
            roundedImageView.setVisibility(8);
        } else if (i == 1) {
            roundedImageView.setVisibility(0);
        }
        if (njy.c(this.f27797a, i)) {
            roundedImageView2.setImageBitmap(this.f27797a.get(i));
        }
        return viewInflate;
    }
}
