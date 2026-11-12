package com.xiaomi.hm.health.training.ui.adapter.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class ActionOrYogaTrainingViewHolder extends RecyclerView.ViewHolder {
    private static final float i = 0.33333334f;
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private RatingBar f;
    private TextView g;
    private TextView h;

    private ActionOrYogaTrainingViewHolder(View view) {
        super(view);
        a(view);
        b();
    }

    private void a(View view) {
        this.a = (ImageView) view.findViewById(R.id.preview_image);
        this.b = (TextView) view.findViewById(R.id.name);
        this.c = (TextView) view.findViewById(R.id.body_part);
        this.d = (TextView) view.findViewById(R.id.instrument);
        this.e = (TextView) view.findViewById(R.id.duration);
        this.f = (RatingBar) view.findViewById(R.id.difficulty);
        this.g = (TextView) view.findViewById(R.id.participants);
        this.h = (TextView) view.findViewById(R.id.top_end_corner_text);
    }

    private void b() {
        Context context = this.itemView.getContext();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        layoutParams.width = i2;
        layoutParams.height = (int) (i2 * 0.33333334f);
        this.itemView.setLayoutParams(layoutParams);
    }

    public static ActionOrYogaTrainingViewHolder create(@NonNull ViewGroup viewGroup) {
        return new ActionOrYogaTrainingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr_item_training, viewGroup, false));
    }

    public void bind(@Nullable ActionOrYogaTraining actionOrYogaTraining) {
        if (actionOrYogaTraining == null) {
            return;
        }
        Context context = this.itemView.getContext();
        Resources resources = context.getResources();
        OtherUtils.loadWithGlide(context, this.a, actionOrYogaTraining.largeListImageUrl);
        this.b.setText(actionOrYogaTraining.name);
        List<String> list = actionOrYogaTraining.bodyparts;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        this.c.setVisibility(z ? 0 : 8);
        if (z) {
            this.c.setText(TextUtils.join(" ", actionOrYogaTraining.bodyparts));
        }
        String str = actionOrYogaTraining.instrument;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        this.d.setVisibility(z2 ? 0 : 8);
        if (z2) {
            this.d.setText(actionOrYogaTraining.instrument);
        }
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(actionOrYogaTraining.duration);
        boolean z3 = minutes > 0;
        this.e.setVisibility(z3 ? 0 : 8);
        if (z3) {
            this.e.setText(resources.getQuantityString(R.plurals.with_minute_time, minutes, Integer.valueOf(minutes)));
        }
        this.f.setRating(actionOrYogaTraining.difficulty);
        this.g.setVisibility(0);
        int i2 = actionOrYogaTraining.numberOfParticipants;
        this.g.setText(context.getResources().getQuantityString(R.plurals.people_attended, i2, Integer.valueOf(i2)));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.startToStart = -1;
        layoutParams.endToEnd = 0;
        this.h.setVisibility(actionOrYogaTraining.hasJoined ? 0 : 8);
        if (actionOrYogaTraining.hasJoined) {
            this.h.setText(R.string.has_joined);
        }
    }
}
