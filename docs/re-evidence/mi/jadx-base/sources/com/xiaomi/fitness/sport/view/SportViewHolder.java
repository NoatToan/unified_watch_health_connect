package com.xiaomi.fitness.sport.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport.bean.CourseRecommendBean;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/SportViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "data", "", "bind", "(Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;)V", "", "source", "statistic", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "mItemView", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "(Lcom/xiaomi/fitness/sport/view/ISportTabItemData;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportViewHolder extends RecyclerView.d0 {

    @Nullable
    private BaseSportItemBean data;

    @NotNull
    private ISportTabItemData<BaseSportItemBean> mItemView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SportViewHolder(@NotNull ISportTabItemData<BaseSportItemBean> mItemView) {
        super((View) mItemView);
        Intrinsics.checkNotNullParameter(mItemView, "mItemView");
        this.mItemView = mItemView;
    }

    public final void bind(@NotNull BaseSportItemBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.mItemView.setData(data);
    }

    public final void statistic(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        BaseSportItemBean baseSportItemBean = this.data;
        if (baseSportItemBean instanceof CourseRecommendBean) {
            Intrinsics.checkNotNull(baseSportItemBean, "null cannot be cast to non-null type com.xiaomi.fitness.sport.bean.CourseRecommendBean");
            List<CourseModel.CourseData> list = ((CourseRecommendBean) baseSportItemBean).getList();
            Logger.d("CourseRecommend", "statistic: source = " + source);
            CourseModel.CourseData courseData = (CourseModel.CourseData) CollectionsKt___CollectionsKt.firstOrNull((List) list);
            if (courseData != null) {
                Logger.d("CourseRecommend", "statistic 1: name = " + courseData.name);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_recommend"), TuplesKt.to("source", source), TuplesKt.to("asset_id", Long.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name), TuplesKt.to("tip", "56.2.2.1.19561")));
            }
            CourseModel.CourseData courseData2 = (CourseModel.CourseData) CollectionsKt___CollectionsKt.getOrNull(list, 1);
            if (courseData2 != null) {
                Logger.d("CourseRecommend", "statistic 2: name = " + courseData2.name);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_recommend"), TuplesKt.to("source", source), TuplesKt.to("asset_id", Long.valueOf(courseData2.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData2.name), TuplesKt.to("tip", "56.2.2.1.19561")));
            }
        }
    }
}
