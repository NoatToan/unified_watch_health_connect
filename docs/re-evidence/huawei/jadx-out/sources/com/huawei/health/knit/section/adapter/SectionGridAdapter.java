package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionGridAdapter extends RecyclerView.Adapter<SectionGridHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SpannableString> f7356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f7357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7358c;
    private OnClickSectionListener d;
    private Context e;

    public SectionGridAdapter(Context context) {
        this.e = context;
    }

    public void b(List<String> list, List<Integer> list2, List<SpannableString> list3, OnClickSectionListener onClickSectionListener) {
        this.f7358c = list;
        this.f7357b = list2;
        this.f7356a = list3;
        this.d = onClickSectionListener;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SectionGridHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionGridHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_grid_record_layout_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionGridHolder sectionGridHolder, final int i) {
        if (d(this.f7358c, i)) {
            if (LanguageUtil.q(this.e)) {
                sectionGridHolder.d.setTextSize(0, this.e.getResources().getDimension(R.dimen.emui_text_size_body3));
                sectionGridHolder.d.setMaxLines(2);
                sectionGridHolder.d.setEllipsize(TextUtils.TruncateAt.END);
            }
            sectionGridHolder.d.setText(String.valueOf(this.f7358c.get(i)));
        }
        List<Integer> list = this.f7357b;
        if (list != null && i < list.size()) {
            sectionGridHolder.d.setTextColor(this.f7357b.get(i).intValue());
        }
        if (d(this.f7356a, i)) {
            sectionGridHolder.f7360b.setText(this.f7356a.get(i));
        }
        if (this.d != null) {
            sectionGridHolder.f7361c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionGridAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionGridAdapter.this.d.onClick(i);
                }
            });
        }
        a(sectionGridHolder.f7361c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f7358c;
        if (list == null) {
            return 6;
        }
        return list.size();
    }

    private boolean d(List list, int i) {
        return list != null && i < list.size();
    }

    private void a(HealthCardView healthCardView) {
        int i;
        ViewGroup.LayoutParams layoutParams = healthCardView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        int iB = qqp.b(this.e);
        int i2 = this.e.getResources().getDisplayMetrics().widthPixels;
        if (qrs.af(this.e)) {
            i = (i2 - (iB * 5)) / 4;
        } else {
            i = (i2 - (iB * 4)) / 3;
        }
        marginLayoutParams.width = i;
        healthCardView.setLayoutParams(marginLayoutParams);
        if (BaseApplication.getContext().getResources().getConfiguration().fontScale >= 1.2d) {
            ViewGroup.LayoutParams layoutParams2 = healthCardView.getLayoutParams();
            layoutParams2.height = -2;
            healthCardView.setLayoutParams(layoutParams2);
        }
    }

    public static class SectionGridHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthCardView f7361c;
        private HealthTextView d;

        public SectionGridHolder(View view) {
            super(view);
            this.f7361c = (HealthCardView) view.findViewById(R.id.section_card_view);
            this.d = (HealthTextView) view.findViewById(R.id.top_text);
            this.f7360b = (HealthTextView) view.findViewById(R.id.bottom_text);
        }
    }
}
