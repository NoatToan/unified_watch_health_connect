package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.eps;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SecondRopeItemAdapter extends BaseRecyclerAdapter<eps> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<eps> f6650b;

    @Deprecated
    public SecondRopeItemAdapter(List<eps> list) {
        super(list, R.layout.second_rope_item);
        this.f6650b = new ArrayList(10);
    }

    public SecondRopeItemAdapter() {
        super(new ArrayList(0), R.layout.second_rope_item);
        ArrayList arrayList = new ArrayList(10);
        this.f6650b = arrayList;
        refreshDataChange(arrayList);
    }

    public void e(List<eps> list) {
        this.f6650b.clear();
        this.f6650b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, eps epsVar) {
        if (recyclerHolder == null || epsVar == null) {
            LogUtil.j("SecondRopeItemAdapter", "convert holder or itemData is null");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) recyclerHolder.d(R.id.second_rope_item_layout);
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.second_rope_item_title);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.second_rope_item_description);
        HealthImageView healthImageView = (HealthImageView) recyclerHolder.d(R.id.second_rope_item_img);
        relativeLayout.setAlpha(epsVar.a() ? 1.0f : 0.5f);
        healthTextView.setText(epsVar.c());
        if (TextUtils.isEmpty(epsVar.e())) {
            healthTextView2.setVisibility(8);
        } else {
            healthTextView2.setText(epsVar.e());
            healthTextView2.setVisibility(0);
        }
        healthImageView.setBackgroundResource(epsVar.d());
    }
}
