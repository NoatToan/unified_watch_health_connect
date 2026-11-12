package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DataSourceViewAdapter extends RecyclerView.Adapter<c> {
    private List<PrivacyDataModel> e = new ArrayList(10);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_detail_item_content, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        cVar.b(this.e.get(i));
        cVar.f28678c.setVisibility(i == this.e.size() + (-1) ? 4 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public void a(List<PrivacyDataModel> list) {
        this.e.clear();
        this.e.addAll(list);
        notifyDataSetChanged();
    }

    class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected HealthTextView f28676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected HealthTextView f28677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthDivider f28678c;

        c(View view) {
            super(view);
            this.f28677b = (HealthTextView) view.findViewById(R.id.privacy_detail_title);
            this.f28676a = (HealthTextView) view.findViewById(R.id.privacy_detail_desc);
            this.f28678c = (HealthDivider) view.findViewById(R.id.data_line);
        }

        void b(PrivacyDataModel privacyDataModel) {
            this.f28677b.setText(privacyDataModel.getDataTitle());
            this.f28676a.setText(privacyDataModel.getDataDesc());
        }
    }
}
