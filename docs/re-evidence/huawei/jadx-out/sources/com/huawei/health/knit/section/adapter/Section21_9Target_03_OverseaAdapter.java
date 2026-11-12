package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fqk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Target_03_OverseaAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7315a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7316c;
    private List<fqk> d = new ArrayList();
    private Context e;

    public Section21_9Target_03_OverseaAdapter(Context context, int i, int i2) {
        this.e = context;
        this.f7316c = i;
        this.f7315a = i2;
    }

    public void c(List<fqk> list) {
        this.d.clear();
        if (!njy.e(list)) {
            this.d.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.section21_9target_03_layout_oversea_item, viewGroup, false);
        c(viewInflate);
        return new a(viewInflate);
    }

    private void c(View view) {
        RecyclerView.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof RecyclerView.LayoutParams)) {
            layoutParams = new RecyclerView.LayoutParams(-1, -2);
        } else {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
        int iIntValue = ((Integer) safeRegionWidth.first).intValue();
        int iIntValue2 = ((Integer) safeRegionWidth.second).intValue();
        int iQ = qrs.q();
        int i = this.f7315a;
        int i2 = (((iQ - (iIntValue + dimensionPixelSize)) - (dimensionPixelSize + iIntValue2)) - ((i - 1) * this.f7316c)) / i;
        layoutParams.width = i2;
        layoutParams.height = (int) (i2 / 2.3333333f);
        view.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        fqk fqkVar = this.d.get(i);
        if (fqkVar == null) {
            return;
        }
        aVar.a(fqkVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    static class a extends RecyclerView.ViewHolder {
        private static final int e = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f7317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f7318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthImageView f7319c;
        HealthTextView d;

        public a(View view) {
            super(view);
            this.f7319c = (HealthImageView) view.findViewById(R.id.bg_img);
            this.f7318b = (HealthTextView) view.findViewById(R.id.title);
            this.d = (HealthTextView) view.findViewById(R.id.sub_title);
            this.f7317a = view.getContext();
        }

        public void a(fqk fqkVar) {
            HealthTextView healthTextView = this.f7318b;
            if (healthTextView != null) {
                healthTextView.setText(fqkVar != null ? fqkVar.c() : null);
            }
            HealthTextView healthTextView2 = this.d;
            if (healthTextView2 != null) {
                healthTextView2.setText(fqkVar != null ? fqkVar.b() : null);
            }
            HealthImageView healthImageView = this.f7319c;
            if (healthImageView != null) {
                if (fqkVar != null) {
                    qqf.a(fqkVar.d(), this.f7319c, e);
                } else {
                    healthImageView.setImageDrawable(null);
                }
            }
        }
    }
}
