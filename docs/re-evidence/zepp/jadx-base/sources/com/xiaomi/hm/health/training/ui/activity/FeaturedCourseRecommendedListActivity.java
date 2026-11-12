package com.xiaomi.hm.health.training.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0014J\u0018\u0010\f\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0014¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/activity/FeaturedCourseRecommendedListActivity;", "Lcom/xiaomi/hm/health/training/ui/activity/BaseRecyclerListActivity;", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseItem;", "", "provideTitleText", "Lcom/xiaomi/hm/health/traininglib/event/EventReqTrainingData$MethodType;", "getMethodType", "", "initRecyclerView", "loadData", "", "itemList", "updateListUI", "<init>", "()V", "Companion", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCourseRecommendedListActivity extends BaseRecyclerListActivity<FeaturedCourseItem> {

    @NotNull
    public static final String EXTRA_RECOMMENDED_COURSES = "RECOMMENDED_COURSES";

    @Override // com.xiaomi.hm.health.training.ui.activity.BaseRecyclerListActivity
    @NotNull
    public EventReqTrainingData.MethodType getMethodType() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.BaseRecyclerListActivity
    public void initRecyclerView() {
        super.initRecyclerView();
        int iDp2px = (int) ViewUtils.dp2px(this, 16.0f);
        this.recycler_view.setPadding(iDp2px, 0, iDp2px, 0);
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.BaseRecyclerListActivity
    public void loadData() {
        Intent intent = getIntent();
        updateListUI(intent == null ? null : intent.getParcelableArrayListExtra(EXTRA_RECOMMENDED_COURSES));
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.BaseRecyclerListActivity
    @NotNull
    public String provideTitleText() {
        return getResources().getString(R.string.tr_recommendation_related);
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.BaseRecyclerListActivity
    public void updateListUI(@Nullable final List<FeaturedCourseItem> itemList) {
        final int i = R.layout.item_featured_course_list;
        final int i2 = R.id.iv_img;
        this.recycler_view.setAdapter(new CommonRecycleAdapter<FeaturedCourseItem>(itemList, i, i2) { // from class: com.xiaomi.hm.health.training.ui.activity.FeaturedCourseRecommendedListActivity$updateListUI$adapter$1
            public final /* synthetic */ List<FeaturedCourseItem> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i, i2, itemList);
                this.e = itemList;
            }

            @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
            public void bindViewHolder(@NotNull CommonViewHolder commonViewHolder, @NotNull FeaturedCourseItem item) {
                if (!TextUtils.isEmpty(item.listImgUrl)) {
                    commonViewHolder.setImageByUrlWithPressedDrawable(R.id.iv_img, item.listImgUrl);
                }
                if (!TextUtils.isEmpty(item.name)) {
                    commonViewHolder.setText(R.id.tv_name, item.name);
                }
                if (TextUtils.isEmpty(item.labelValue)) {
                    commonViewHolder.getView(R.id.badge_end).setVisibility(8);
                } else {
                    int i3 = R.id.badge_end;
                    commonViewHolder.getView(i3).setVisibility(0);
                    ((TextView) commonViewHolder.getView(i3)).setText(item.labelValue);
                }
                Integer num = item.participantNumber;
                if (num != null) {
                    if (num != null && num.intValue() == 0) {
                        commonViewHolder.setText(R.id.tv_participantNumber, this.d.getResources().getString(R.string.tr_not_learn_yet));
                    } else {
                        commonViewHolder.setQuantityString(R.id.tv_participantNumber, R.plurals.learn_times, item.participantNumber.intValue(), item.participantNumber);
                    }
                }
                Integer num2 = item.actionAmount;
                if (num2 != null) {
                    commonViewHolder.setQuantityString(R.id.tv_action_amount, R.plurals.course_number, num2.intValue(), item.actionAmount);
                }
                Integer num3 = item.difficultyDegree;
                if (num3 != null) {
                    commonViewHolder.setRating(R.id.rb_difficulty, num3.intValue());
                }
            }

            @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
            public void onItemClick(@Nullable FeaturedCourseItem item, int position) {
                TrainingBus.refreshFeaturedCourse().postValue(item == null ? null : item.id);
                this.d.finish();
            }
        });
    }
}
