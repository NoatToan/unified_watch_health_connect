package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.uwr;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class StateIndexHorizontalAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f27779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27780b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27781c;
    private List<uwr> d;

    public interface OnItemClickListener {
        void onItemClick(String str, int i);
    }

    public StateIndexHorizontalAdapter(List<uwr> list, Context context) {
        this.d = list;
        this.f27781c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f27781c).inflate(R.layout.item_state_index_horizontal, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public void e(OnItemClickListener onItemClickListener) {
        this.f27779a = onItemClickListener;
    }

    public void a(int i) {
        int i2 = 0;
        while (i2 < this.d.size()) {
            this.d.get(i2).c(i2 == i);
            i2++;
        }
        notifyDataSetChanged();
    }

    public int c() {
        return this.f27780b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        if (njy.c(this.d, i)) {
            eVar.e.setText(this.d.get(i).a());
            eVar.f27783a.setText(this.d.get(i).e());
            if (this.d.get(i).d()) {
                this.f27780b = i;
                eVar.itemView.setBackground(this.f27781c.getResources().getDrawable(R.drawable.rq_state_category_item_click));
                eVar.f27783a.setTextColor(ContextCompat.getColor(this.f27781c, R.color.textColorPrimaryInverse));
                eVar.e.setTextColor(ContextCompat.getColor(this.f27781c, R.color.textColorPrimaryInverse));
            } else {
                eVar.itemView.setBackground(this.f27781c.getResources().getDrawable(R.drawable.rq_state_category_item));
                eVar.f27783a.setTextColor(ContextCompat.getColor(this.f27781c, R.color.textColorSecondary));
                eVar.e.setTextColor(ContextCompat.getColor(this.f27781c, R.color.textColorPrimary));
            }
            eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.StateIndexHorizontalAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (StateIndexHorizontalAdapter.this.f27779a != null) {
                        StateIndexHorizontalAdapter.this.f27779a.onItemClick(((uwr) StateIndexHorizontalAdapter.this.d.get(i)).e(), i);
                    }
                }
            });
        }
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f27783a;
        private HealthTextView e;

        public e(View view) {
            super(view);
            this.f27783a = (HealthTextView) view.findViewById(R.id.item_horizontal_index);
            this.e = (HealthTextView) view.findViewById(R.id.item_horizontal_value);
        }
    }
}
