package com.huami.training.ui.joined;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0004\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseDelegate;", "", "", "getTitleBarBackButtonDrawable", "getAddCourseButtonTextColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getContentListView", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface JoinedCourseDelegate {
    @ColorInt
    int getAddCourseButtonTextColor();

    @NotNull
    View getContentListView(@NotNull Context context, @NotNull ViewGroup parent);

    @DrawableRes
    int getTitleBarBackButtonDrawable();
}
