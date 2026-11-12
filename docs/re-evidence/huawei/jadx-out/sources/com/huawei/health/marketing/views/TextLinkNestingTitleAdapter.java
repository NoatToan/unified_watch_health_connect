package com.huawei.health.marketing.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.SingleTextContent;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
class TextLinkNestingTitleAdapter extends RecyclerView.Adapter<TitleHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8434a;
    private final List<SingleTextContent> d = new ArrayList();

    public TextLinkNestingTitleAdapter(Context context) {
        this.f8434a = context;
    }

    public void a(List<SingleTextContent> list) {
        this.d.clear();
        if (list != null) {
            this.d.addAll(list);
        }
        notifyDataSetChanged();
    }

    public List<SingleTextContent> e() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TitleHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TitleHolder(LayoutInflater.from(this.f8434a).inflate(R.layout.text_link_nesting_title_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(TitleHolder titleHolder, int i) {
        SingleTextContent singleTextContent;
        if (njy.e(this.d, i) || (singleTextContent = this.d.get(i)) == null) {
            return;
        }
        titleHolder.d(singleTextContent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public static final class TitleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8435c;

        public TitleHolder(View view) {
            super(view);
            this.f8435c = (HealthTextView) view.findViewById(R.id.title);
        }

        public void d(SingleTextContent singleTextContent) {
            this.f8435c.setText(singleTextContent.getTheme());
            this.itemView.setOnClickListener(singleTextContent.getOnClickListener());
            e(singleTextContent.isSelected());
        }

        public void e(boolean z) {
            int i;
            Context context = this.itemView.getContext();
            this.f8435c.setTextColor(ContextCompat.getColor(context, z ? R.color.common_colorAccent : R.color.textColorPrimary));
            if (z) {
                i = R.drawable.text_link_nesting_title_background_selected;
            } else {
                i = R.drawable.text_link_nesting_title_background_unselected;
            }
            this.f8435c.setBackground(ContextCompat.getDrawable(context, i));
        }
    }
}
