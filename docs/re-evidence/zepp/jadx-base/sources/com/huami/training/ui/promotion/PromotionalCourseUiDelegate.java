package com.huami.training.ui.promotion;

import com.huami.training.dto.PromotePlace;
import com.huami.training.helper.AppExecutors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/huami/training/ui/promotion/PromotionalCourseUiDelegate;", "", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lkotlin/Function0;", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "getAdapter", "", "getItemHorizontalMargin", "getItemSpacing", "getTitleHorizontalMargin", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface PromotionalCourseUiDelegate {
    @NotNull
    BaseCourseListAdapter getAdapter(@NotNull AppExecutors appExecutors, @NotNull Function0<? extends PromotePlace> promotePlace);

    float getItemHorizontalMargin();

    float getItemSpacing();

    float getTitleHorizontalMargin();
}
