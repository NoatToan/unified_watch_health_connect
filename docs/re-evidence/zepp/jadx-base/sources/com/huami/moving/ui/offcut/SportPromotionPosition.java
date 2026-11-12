package com.huami.moving.ui.offcut;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.moving.maps.IGPSSolution;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH&J(\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H&¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/ui/offcut/SportPromotionPosition;", "", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroid/widget/FrameLayout;", "container", "Landroid/view/View;", "title", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "sportType", "", "showSportEndPromotionCourse", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/recyclerview/widget/RecyclerView;", "recycleView", "showSportEndPromotionActivities", "Landroidx/core/widget/NestedScrollView;", "scrollView", "parent", "showSportEndPromotionTextChainView", "Lcom/huami/moving/maps/IGPSSolution;", "solution", "updateSportTrackDetailEndMarker", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface SportPromotionPosition {
    void showSportEndPromotionActivities(@NotNull Context context, @NotNull View title, @NotNull RecyclerView recycleView, int sportType);

    void showSportEndPromotionCourse(@NotNull FragmentManager fm, @NotNull FrameLayout container, @NotNull View title, @NotNull LifecycleOwner owner, int sportType);

    void showSportEndPromotionTextChainView(@NotNull Context context, @NotNull NestedScrollView scrollView, @NotNull FrameLayout parent, int sportType);

    void updateSportTrackDetailEndMarker(@Nullable Context context, @NotNull IGPSSolution solution);
}
