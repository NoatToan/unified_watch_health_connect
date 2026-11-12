package com.huami.training.ui.joined;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/training/ui/joined/MiDongJoinedCourseDelegate;", "Lcom/huami/training/ui/joined/JoinedCourseDelegate;", "", "getTitleBarBackButtonDrawable", "getAddCourseButtonTextColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getContentListView", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiDongJoinedCourseDelegate implements JoinedCourseDelegate {
    @Override // com.huami.training.ui.joined.JoinedCourseDelegate
    public int getAddCourseButtonTextColor() {
        return Color.parseColor("#ff5353");
    }

    @Override // com.huami.training.ui.joined.JoinedCourseDelegate
    @NotNull
    public View getContentListView(@NotNull Context context, @NotNull ViewGroup parent) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.recycler_view);
        recyclerView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        recyclerView.setPadding((int) ViewExKt.dpToPx(recyclerView, 20.0f), 0, (int) ViewExKt.dpToPx(recyclerView, 20.0f), 0);
        return recyclerView;
    }

    @Override // com.huami.training.ui.joined.JoinedCourseDelegate
    public int getTitleBarBackButtonDrawable() {
        return R.drawable.ic_arrow_back_20_2x;
    }
}
