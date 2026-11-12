package com.huami.training.ui.course;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0004\u001a\u00020\u0002H'J\b\u0010\u0005\u001a\u00020\u0002H'J*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterListDelegate;", "", "", "getTitleBarBackButtonDrawable", "getTabSelectedTextColor", "getTabSelectedIndicatorColor", "", "filterName", "Lkotlin/Function0;", "", "retryCallback", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getListAdapter", "", "getItemHorizontalMargin", "getItemSpacing", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface TrainingFilterListDelegate {
    float getItemHorizontalMargin();

    float getItemSpacing();

    @NotNull
    PagingListAdapter<TrainingVo, RecyclerView.ViewHolder> getListAdapter(@NotNull String filterName, @NotNull Function0<Unit> retryCallback);

    @ColorRes
    int getTabSelectedIndicatorColor();

    @ColorInt
    int getTabSelectedTextColor();

    @DrawableRes
    int getTitleBarBackButtonDrawable();
}
