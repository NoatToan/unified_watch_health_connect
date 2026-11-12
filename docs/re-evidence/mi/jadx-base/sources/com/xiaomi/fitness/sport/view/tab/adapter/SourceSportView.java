package com.xiaomi.fitness.sport.view.tab.adapter;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.sport.bean.CourseRecommendBean;
import com.xiaomi.fitness.sport.course.CourseGridAdapter;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.ISportTabItemData;
import com.xiaomi.fitness.sport.view.tab.adapter.SourceSportView;
import defpackage.dvi;
import defpackage.gak;
import defpackage.yt4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001fB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/SourceSportView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Lyt4;", "Lcom/xiaomi/fitness/sport/bean/CourseRecommendBean;", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "", "refreshLayoutManagerAndAdapter", "()V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "getLayoutId", "()I", "data", "setDataToView", "(Lcom/xiaomi/fitness/sport/bean/CourseRecommendBean;)V", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/sport/course/CourseGridAdapter;", "adapter", "Lcom/xiaomi/fitness/sport/course/CourseGridAdapter;", "Landroid/content/Context;", "context", "", "sourceKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SourceSportView extends BaseSportItemView<yt4, CourseRecommendBean> implements ISportTabItemData<CourseRecommendBean> {

    @NotNull
    public static final String TAG = "SourceSportView";

    @NotNull
    private final CourseGridAdapter adapter;

    @NotNull
    private List<CourseModel.CourseData> dataList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceSportView(@NotNull Context context, @NotNull String sourceKey) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        this.dataList = new ArrayList();
        this.adapter = new CourseGridAdapter(context, 3, sourceKey);
    }

    private final void refreshLayoutManagerAndAdapter() {
        int i;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            i = 5;
        } else {
            i = uIUtils.isFoldableExpandOrPadPortrait() ? 3 : 2;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i, 1, false);
        yt4 binding = getBinding();
        if (binding != null && (recyclerView3 = binding.C) != null) {
            recyclerView3.setLayoutManager(gridLayoutManager);
        }
        yt4 binding2 = getBinding();
        if (binding2 != null && (recyclerView2 = binding2.C) != null) {
            ItemDecorationExtKt.clearAllItemDecorations(recyclerView2);
        }
        yt4 binding3 = getBinding();
        if (binding3 != null && (recyclerView = binding3.C) != null) {
            recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(13), false));
        }
        ArrayList arrayList = new ArrayList();
        if (this.dataList.size() > i) {
            arrayList.addAll(this.dataList.subList(0, i));
        } else {
            arrayList.addAll(this.dataList);
        }
        Logger.d(TAG, "dataList.size=" + this.dataList.size());
        this.adapter.setData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDataToView$lambda$1$lambda$0(CourseRecommendBean data, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), data.getJumpScene(), null, null, data.getJumpTitle(), false, 22, null);
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.course_launch_layout_grid;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView, android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        refreshLayoutManagerAndAdapter();
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull final CourseRecommendBean data) {
        RecyclerView recyclerView;
        TextView textView;
        Intrinsics.checkNotNullParameter(data, "data");
        List<CourseModel.CourseData> list = data.getList();
        this.dataList = list;
        Logger.i(TAG, "setDataToView dataList.size=" + list.size());
        yt4 binding = getBinding();
        if (binding != null && (textView = binding.B) != null) {
            ExtUtilsKt.setVisible(textView, true);
            textView.setOnClickListener(new View.OnClickListener() { // from class: v4n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SourceSportView.setDataToView$lambda$1$lambda$0(data, view);
                }
            });
        }
        yt4 binding2 = getBinding();
        if (binding2 != null && (recyclerView = binding2.C) != null) {
            recyclerView.setAdapter(this.adapter);
        }
        refreshLayoutManagerAndAdapter();
    }
}
