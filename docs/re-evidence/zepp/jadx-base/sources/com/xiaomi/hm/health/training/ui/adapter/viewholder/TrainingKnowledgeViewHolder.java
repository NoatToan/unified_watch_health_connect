package com.xiaomi.hm.health.training.ui.adapter.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.imageload.HMLoadListener;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.utils.OtherUtils;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingKnowledgeViewHolder extends RecyclerView.ViewHolder {
    private ImageView a;
    private TextView b;
    private TextView c;

    public class a implements HMLoadListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadListener
        public boolean onLoadFailed(Exception exc) {
            TrainingKnowledgeViewHolder.this.a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return false;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadListener
        public boolean onLoadFinish(Object obj) {
            return false;
        }
    }

    private TrainingKnowledgeViewHolder(View view) {
        super(view);
        b(view);
    }

    private void b(View view) {
        this.a = (ImageView) view.findViewById(R.id.imv_item);
        this.b = (TextView) view.findViewById(R.id.tx_knowledge_title);
        this.c = (TextView) view.findViewById(R.id.tx_knowledge_content);
    }

    public static TrainingKnowledgeViewHolder create(@NonNull ViewGroup viewGroup) {
        return new TrainingKnowledgeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_training_knowledge, viewGroup, false));
    }

    public void bind(TrainingKnowledge trainingKnowledge) {
        this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Context context = this.a.getContext();
        ImageView imageView = this.a;
        String str = trainingKnowledge.imageUrl;
        int i = R.drawable.icon_default_item_head;
        OtherUtils.loadWithGlideListener(context, imageView, str, i, i, new a());
        this.b.setText(trainingKnowledge.title);
        this.c.setText(trainingKnowledge.description);
    }
}
