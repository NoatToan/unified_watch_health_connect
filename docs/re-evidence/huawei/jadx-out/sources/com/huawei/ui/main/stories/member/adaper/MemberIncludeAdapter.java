package com.huawei.ui.main.stories.member.adaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.njy;
import defpackage.qqf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MemberIncludeAdapter extends RecyclerView.Adapter<MemberIncludeViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Product> f28617a = new ArrayList();

    public void a(List<Product> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.f28617a)) {
            this.f28617a.clear();
        }
        this.f28617a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MemberIncludeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MemberIncludeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_expandable_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MemberIncludeViewHolder memberIncludeViewHolder, int i) {
        if (njy.e(this.f28617a, i)) {
            return;
        }
        Product product = this.f28617a.get(i);
        memberIncludeViewHolder.e.setText(product.getProductName());
        memberIncludeViewHolder.f28618b.setText(product.getProductDesc());
        qqf.b(product.getProductUrl(), memberIncludeViewHolder.d, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.b(this.f28617a)) {
            return this.f28617a.size();
        }
        return 0;
    }

    public class MemberIncludeViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28618b;
        HealthImageView d;
        HealthTextView e;

        public MemberIncludeViewHolder(View view) {
            super(view);
            this.d = (HealthImageView) view.findViewById(R.id.item_expand_icon);
            this.e = (HealthTextView) view.findViewById(R.id.item_expand_name);
            this.f28618b = (HealthTextView) view.findViewById(R.id.item_expand_detail);
        }
    }
}
