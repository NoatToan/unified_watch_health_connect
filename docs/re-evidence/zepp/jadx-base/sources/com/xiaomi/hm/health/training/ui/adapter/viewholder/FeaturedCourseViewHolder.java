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
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.utils.OtherUtils;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseViewHolder extends RecyclerView.ViewHolder {
    private static final float g = 0.33333334f;
    private ImageView a;
    private TextView b;
    private TextView c;
    private RatingBar d;
    private TextView e;
    private TextView f;

    private FeaturedCourseViewHolder(@NonNull View view) {
        super(view);
        a();
        b();
    }

    private void a() {
        this.a = (ImageView) this.itemView.findViewById(R.id.iv_img);
        this.b = (TextView) this.itemView.findViewById(R.id.tv_name);
        this.c = (TextView) this.itemView.findViewById(R.id.tv_action_amount);
        this.d = (RatingBar) this.itemView.findViewById(R.id.rb_difficulty);
        this.e = (TextView) this.itemView.findViewById(R.id.badge_end);
        this.f = (TextView) this.itemView.findViewById(R.id.tv_participantNumber);
    }

    private void b() {
        Context context = this.itemView.getContext();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        layoutParams.width = i;
        layoutParams.height = (int) (i * 0.33333334f);
        this.itemView.setLayoutParams(layoutParams);
    }

    public static FeaturedCourseViewHolder create(@NonNull ViewGroup viewGroup) {
        return new FeaturedCourseViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_featured_course_list, viewGroup, false));
    }

    public void bind(@Nullable FeaturedCourseListItem featuredCourseListItem) {
        if (featuredCourseListItem == null) {
            return;
        }
        Context context = this.itemView.getContext();
        Resources resources = this.itemView.getContext().getResources();
        if (!TextUtils.isEmpty(featuredCourseListItem.listImgUrl)) {
            OtherUtils.loadWithGlide(context, this.a, featuredCourseListItem.listImgUrl);
        }
        if (!TextUtils.isEmpty(featuredCourseListItem.name)) {
            this.b.setText(featuredCourseListItem.name);
        }
        Integer num = featuredCourseListItem.actionAmount;
        if (num != null) {
            this.c.setText(resources.getQuantityString(R.plurals.action_amout, num.intValue(), featuredCourseListItem.actionAmount));
        }
        Integer num2 = featuredCourseListItem.difficultyDegree;
        if (num2 != null) {
            this.d.setRating(num2.intValue());
        }
        if (TextUtils.isEmpty(featuredCourseListItem.labelValue)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(featuredCourseListItem.labelValue);
        }
        Integer num3 = featuredCourseListItem.participantNumber;
        if (num3 != null) {
            if (num3.intValue() == 0) {
                this.f.setText(context.getResources().getString(R.string.tr_not_learn_yet));
            } else {
                this.f.setText(resources.getQuantityString(R.plurals.learn_times, featuredCourseListItem.participantNumber.intValue(), featuredCourseListItem.participantNumber));
            }
        }
    }
}
