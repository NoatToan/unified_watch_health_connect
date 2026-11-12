package com.xiaomi.hm.health.lab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.LabTools;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final int e = 4;
    private static final int f = 133;
    private Context a;
    private List<BehaviorTagEnity> b;
    private int c;
    private OnItemClickListener d;

    public interface OnItemClickListener {
        void onBehaviorItemClick(View view, BehaviorTagEnity behaviorTagEnity, int i);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView a;
        private ImageView b;
        private TextView c;
        private LinearLayout d;

        public ViewHolder(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tx_lab_action);
            this.b = (ImageView) view.findViewById(R.id.imv_lab_action);
            this.c = (TextView) view.findViewById(R.id.tx_mark_times);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_lab);
            this.d = linearLayout;
            linearLayout.setMinimumHeight(BehaviorsAdapter.this.c);
        }
    }

    public BehaviorsAdapter(Context context, List<BehaviorTagEnity> list, int i) {
        this.a = context;
        this.b = list;
        if (i > 0) {
            this.c = i / 4;
        } else {
            this.c = (int) LabTools.dp2px(context, 133.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(BehaviorTagEnity behaviorTagEnity, ViewHolder viewHolder, View view) {
        OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onBehaviorItemClick(view, behaviorTagEnity, viewHolder.getLayoutPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<BehaviorTagEnity> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final BehaviorTagEnity behaviorTagEnity = this.b.get(i);
        if (behaviorTagEnity == null) {
            viewHolder.d.setVisibility(8);
            return;
        }
        viewHolder.d.setVisibility(0);
        long behaviorTagCountByKeyFromSpf = BehaviorTaggingTools.getBehaviorTagCountByKeyFromSpf(this.a, behaviorTagEnity.getBehaviorKey());
        String string = viewHolder.a.getContext().getString(behaviorTagEnity.getBehaviorNameStrId());
        if (behaviorTagCountByKeyFromSpf > 0) {
            viewHolder.c.setVisibility(0);
            viewHolder.c.setText(viewHolder.c.getContext().getString(R.string.tagging_times, Long.valueOf(behaviorTagCountByKeyFromSpf)));
        } else {
            viewHolder.c.setVisibility(4);
        }
        viewHolder.a.setText(string);
        viewHolder.b.setImageResource(behaviorTagEnity.getBehaviorImgResId());
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: dv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(behaviorTagEnity, viewHolder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lab_action, viewGroup, false));
    }
}
