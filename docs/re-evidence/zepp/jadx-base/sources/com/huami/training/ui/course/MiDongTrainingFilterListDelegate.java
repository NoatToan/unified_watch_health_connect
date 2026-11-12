package com.huami.training.ui.course;

import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.ui.R;
import com.huami.training.ui.common.MiDongCourseLayoutDelegate;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J*\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lcom/huami/training/ui/course/MiDongTrainingFilterListDelegate;", "Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "", "getTitleBarBackButtonDrawable", "getTabSelectedTextColor", "", "filterName", "Lkotlin/Function0;", "", "retryCallback", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getListAdapter", "", "getItemHorizontalMargin", "getItemSpacing", "getTabSelectedIndicatorColor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiDongTrainingFilterListDelegate implements TrainingFilterListDelegate {
    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    public float getItemHorizontalMargin() {
        return 20.0f;
    }

    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    public float getItemSpacing() {
        return 10.0f;
    }

    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    @NotNull
    public PagingListAdapter<TrainingVo, RecyclerView.ViewHolder> getListAdapter(@NotNull String filterName, @NotNull Function0<Unit> retryCallback) {
        return new TrainingFilterAdapter(new MiDongCourseLayoutDelegate(), filterName, retryCallback);
    }

    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    public int getTabSelectedIndicatorColor() {
        return R.color.tr_red_v2;
    }

    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    public int getTabSelectedTextColor() {
        return Color.parseColor("#ff5353");
    }

    @Override // com.huami.training.ui.course.TrainingFilterListDelegate
    public int getTitleBarBackButtonDrawable() {
        return R.drawable.ic_arrow_back_20_2x;
    }
}
