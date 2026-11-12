package com.huawei.ui.main.stories.soical.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.operationbundle.R;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AssessmentRecyclerAdapter extends BaseRecyclerAdapter<SingleGridContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28951b;
    private OnItemVisibleListener<RecyclerHolder, SingleGridContent> d;

    public AssessmentRecyclerAdapter(List<SingleGridContent> list) {
        super(list, R.layout.item_assessment_health);
        this.f28951b = -1;
        this.f28950a = -2;
    }

    public void e(int i, int i2) {
        if (i == this.f28951b && i2 == this.f28950a) {
            return;
        }
        this.f28951b = i;
        this.f28950a = i2;
        notifyDataSetChanged();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, SingleGridContent singleGridContent) {
        if (singleGridContent == null) {
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, getItemCount());
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerHolder.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f28951b;
            layoutParams.height = this.f28950a;
            recyclerHolder.itemView.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = recyclerHolder.itemView.findViewById(R.id.assessment_dataLayout).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
            layoutParams2.height = this.f28950a / 3;
            recyclerHolder.itemView.findViewById(R.id.assessment_dataLayout).setLayoutParams(layoutParams2);
        }
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.assessment_themeImg);
        Context context = recyclerHolder.itemView.getContext();
        Glide.with(context).load(singleGridContent.getDetailPicture()).into(imageView);
        ((HealthTextView) recyclerHolder.d(R.id.assessment_questionQuantityTxt)).setText(context.getResources().getQuantityString(R.plurals.IDS_assessment_question_quantity, singleGridContent.getQuestionNumber(), Integer.valueOf(singleGridContent.getQuestionNumber())));
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.assessment_personQuantityTxt);
        healthTextView.setVisibility(singleGridContent.getParticipantCount() > 0 ? 0 : 8);
        healthTextView.setText(context.getResources().getQuantityString(R.plurals.IDS_assessment_person_quantity, singleGridContent.getParticipantCount() <= 1 ? 1 : Integer.MAX_VALUE, String.valueOf(singleGridContent.getParticipantCount())));
        ((HealthTextView) recyclerHolder.d(R.id.assessment_timeTakeTxt)).setText(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min_number, singleGridContent.getCostTime(), Integer.valueOf(singleGridContent.getCostTime())));
        recyclerHolder.itemView.setTag(R.layout.item_assessment_health, Long.valueOf(System.currentTimeMillis()));
        OnItemVisibleListener<RecyclerHolder, SingleGridContent> onItemVisibleListener = this.d;
        if (onItemVisibleListener != null) {
            onItemVisibleListener.onItemVisible(recyclerHolder, i, singleGridContent);
        }
    }

    public void b(OnItemVisibleListener<RecyclerHolder, SingleGridContent> onItemVisibleListener) {
        this.d = onItemVisibleListener;
    }
}
