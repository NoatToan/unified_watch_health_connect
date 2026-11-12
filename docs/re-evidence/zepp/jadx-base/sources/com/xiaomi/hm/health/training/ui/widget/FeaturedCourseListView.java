package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002!\"B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "a", "", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseItem;", "list", "setCourseItems", "Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemShowListener;", "onItemShowListener", "setOnItemShowListener", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "courseItems", "Lcom/xiaomi/hm/health/training/ui/adapter/CommonRecycleAdapter;", "b", "Lcom/xiaomi/hm/health/training/ui/adapter/CommonRecycleAdapter;", "courseItemAdapter", "c", "Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemClickListener;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemShowListener;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnItemClickListener", "OnItemShowListener", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCourseListView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<FeaturedCourseItem> courseItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private CommonRecycleAdapter<FeaturedCourseItem> courseItemAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener onItemClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private OnItemShowListener onItemShowListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemClickListener;", "", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseItem;", "item", "", "position", "", "onItemClick", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onItemClick(@NotNull FeaturedCourseItem item, int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/widget/FeaturedCourseListView$OnItemShowListener;", "", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseItem;", "item", "", "position", "", "OnItemShow", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnItemShowListener {
        void OnItemShow(@NotNull FeaturedCourseItem item, int position);
    }

    @JvmOverloads
    public FeaturedCourseListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeaturedCourseListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public FeaturedCourseListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.courseItems = new ArrayList<>();
        a();
    }

    private final void a() {
        setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        setLayoutManager(linearLayoutManager);
        addItemDecoration(new LinearLayoutDecoration(getContext(), 0, R.dimen.divider_size_dp8, R.color.s36));
        setHasFixedSize(true);
        final int i = R.layout.item_featured_course_narrow;
        final int i2 = R.id.view_bg;
        final ArrayList<FeaturedCourseItem> arrayList = this.courseItems;
        CommonRecycleAdapter<FeaturedCourseItem> commonRecycleAdapter = new CommonRecycleAdapter<FeaturedCourseItem>(i, i2, arrayList) { // from class: com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView$initRecyclerView$1
            @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            /* JADX INFO: renamed from: getItemCount */
            public int getFragmentsCount() {
                return super.getFragmentsCount();
            }

            @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
            public void bindViewHolder(@NotNull CommonViewHolder commonViewHolder, @NotNull FeaturedCourseItem item) {
                FeaturedCourseListView.OnItemShowListener onItemShowListener = this.d.onItemShowListener;
                if (onItemShowListener != null) {
                    onItemShowListener.OnItemShow(item, commonViewHolder.getLayoutPosition());
                }
                if (this.d.courseItemAdapter.getData() != null) {
                    View view = commonViewHolder.getView(R.id.root_view);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Context context = view.getContext();
                    if (this.d.courseItemAdapter.getData().size() == 1) {
                        layoutParams.width = context.getResources().getDisplayMetrics().widthPixels;
                    } else {
                        layoutParams.width = context.getResources().getDimensionPixelOffset(R.dimen.free_training_item_narrow_width);
                    }
                    layoutParams.height = context.getResources().getDimensionPixelOffset(R.dimen.free_training_item_height);
                    view.setLayoutParams(layoutParams);
                }
                if (!TextUtils.isEmpty(item.listImgUrl)) {
                    commonViewHolder.setImageByUrlWithPressedDrawable(R.id.iv_bg, item.listImgUrl);
                }
                if (!TextUtils.isEmpty(item.name)) {
                    commonViewHolder.setText(R.id.tv_title, item.name);
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
                        commonViewHolder.setText(R.id.tv_learn_times, this.d.getContext().getResources().getString(R.string.tr_not_learn_yet));
                    } else {
                        commonViewHolder.setQuantityString(R.id.tv_learn_times, R.plurals.learn_times, item.participantNumber.intValue(), item.participantNumber);
                    }
                }
                Integer num2 = item.actionAmount;
                if (num2 != null) {
                    commonViewHolder.setQuantityString(R.id.tv_course_number, R.plurals.course_number, num2.intValue(), item.actionAmount);
                }
                Integer num3 = item.difficultyDegree;
                if (num3 != null) {
                    commonViewHolder.setRating(R.id.rb_difficulty, num3.intValue());
                }
            }

            @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
            public void onItemClick(@NotNull FeaturedCourseItem item, int position) {
                if (this.d.onItemClickListener != null) {
                    this.d.onItemClickListener.onItemClick(item, position);
                }
            }
        };
        this.courseItemAdapter = commonRecycleAdapter;
        setAdapter(commonRecycleAdapter);
    }

    public final void setCourseItems(@NotNull List<? extends FeaturedCourseItem> list) {
        this.courseItemAdapter.setData(list);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public final void setOnItemShowListener(@NotNull OnItemShowListener onItemShowListener) {
        this.onItemShowListener = onItemShowListener;
    }

    public /* synthetic */ FeaturedCourseListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
