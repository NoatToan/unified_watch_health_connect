package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.foz;
import defpackage.qqf;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1Card_01_Inner_Adapter extends RecyclerView.Adapter<ListThreeInnerViewHolder> {
    private static final int e = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f7239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7240c;
    private List<Object> d;
    private OnClickSectionListener f;
    private Context g;
    private int i;

    public Section1_1Card_01_Inner_Adapter(Context context) {
        this.g = context;
    }

    public Section1_1Card_01_Inner_Adapter(Context context, OnClickSectionListener onClickSectionListener) {
        this.g = context;
        this.f = onClickSectionListener;
    }

    public void a(foz fozVar) {
        if (fozVar != null) {
            this.f7239b = fozVar.b();
            this.d = fozVar.a();
            this.f7240c = fozVar.d();
            this.f7238a = fozVar.c();
            this.i = fozVar.e();
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ListThreeInnerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ListThreeInnerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section1_1card_inner_recyclerview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ListThreeInnerViewHolder listThreeInnerViewHolder, final int i) {
        if (listThreeInnerViewHolder.j != null && this.f != null) {
            listThreeInnerViewHolder.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section1_1Card_01_Inner_Adapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Section1_1Card_01_Inner_Adapter.this.f.onClick(Section1_1Card_01_Inner_Adapter.this.i, i);
                }
            });
        }
        b(listThreeInnerViewHolder, i);
        c(listThreeInnerViewHolder, i);
        d(listThreeInnerViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Object> list = this.f7239b;
        int size = list != null ? list.size() : 0;
        List<Object> list2 = this.d;
        int size2 = list2 != null ? list2.size() : 0;
        List<Object> list3 = this.f7240c;
        int size3 = list3 != null ? list3.size() : 0;
        List<Object> list4 = this.f7238a;
        return Math.max(size, Math.max(size2, Math.max(size3, Math.max(list4 != null ? list4.size() : 0, 2))));
    }

    private void d(ListThreeInnerViewHolder listThreeInnerViewHolder, int i) {
        RecyclerView.LayoutParams layoutParamsA = a(listThreeInnerViewHolder, i);
        if (layoutParamsA == null) {
            LogUtil.c("params is invalid!", new Object[0]);
        } else if (listThreeInnerViewHolder.f7243b != null) {
            listThreeInnerViewHolder.f7243b.setLayoutParams(layoutParamsA);
        }
    }

    protected RecyclerView.LayoutParams a(ListThreeInnerViewHolder listThreeInnerViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = listThreeInnerViewHolder.f7243b.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.c("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalL);
        this.g.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalL);
        if (i == 0) {
            layoutParams2.topMargin = dimensionPixelSize;
        }
        return layoutParams2;
    }

    public static class ListThreeInnerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f7243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthImageView f7244c;
        private HealthTextView d;
        private HealthTextView e;
        private HealthDivider g;
        private RelativeLayout j;

        public ListThreeInnerViewHolder(View view) {
            super(view);
            this.j = (RelativeLayout) view.findViewById(R.id.inner_recyclerview_item);
            this.f7244c = (HealthImageView) view.findViewById(R.id.section_inner_image);
            this.d = (HealthTextView) view.findViewById(R.id.section_inner_title);
            this.e = (HealthTextView) view.findViewById(R.id.section_item_left_text);
            this.f7242a = (HealthTextView) view.findViewById(R.id.section_item_right_text);
            this.g = (HealthDivider) view.findViewById(R.id.recyclerview_divider);
            this.f7243b = (LinearLayout) view.findViewById(R.id.section1_1card_inner_item_ll);
        }
    }

    private void c(ListThreeInnerViewHolder listThreeInnerViewHolder, int i) {
        List<Object> list;
        List<Object> list2;
        List<Object> list3;
        if (listThreeInnerViewHolder.d != null && (list3 = this.d) != null && i < list3.size() && (this.d.get(i) instanceof String)) {
            listThreeInnerViewHolder.d.setText(String.valueOf(this.d.get(i)));
        }
        if (listThreeInnerViewHolder.e != null && (list2 = this.f7240c) != null && i < list2.size() && (this.f7240c.get(i) instanceof String)) {
            listThreeInnerViewHolder.e.setText(String.valueOf(this.f7240c.get(i)));
        }
        if (listThreeInnerViewHolder.f7242a != null && (list = this.f7238a) != null && i < list.size() && (this.f7238a.get(i) instanceof String)) {
            listThreeInnerViewHolder.f7242a.setText(String.valueOf(this.f7238a.get(i)));
        }
        if (i != getItemCount() - 1 || listThreeInnerViewHolder.g == null) {
            return;
        }
        listThreeInnerViewHolder.g.setVisibility(8);
    }

    private void b(ListThreeInnerViewHolder listThreeInnerViewHolder, int i) {
        List<Object> list;
        if (listThreeInnerViewHolder.f7244c == null || (list = this.f7239b) == null || i >= list.size()) {
            return;
        }
        Object obj = this.f7239b.get(i);
        if (obj instanceof Integer) {
            listThreeInnerViewHolder.f7244c.setBackgroundResource(((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                qqf.e(listThreeInnerViewHolder.f7244c, str, e, 0, R.drawable.section_blank_1008);
            } else {
                qqf.a(R.drawable.section_blank_1008, listThreeInnerViewHolder.f7244c, e);
            }
        }
    }
}
