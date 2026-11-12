package com.xiaomi.fitness.sport.sporttab.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.sporttab.recycler.RecommendationCourseAdapter;
import com.xiaomi.fitness.widget.view.RatioImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.dvi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "courseList", "", "bindData", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "mCourseList", "Ljava/util/List;", "<init>", "(Landroid/content/Context;)V", "Companion", "ItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecommendationCourseAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "RecommendationCourseAdapter";

    @NotNull
    private final Context context;

    @NotNull
    private final List<CourseModel.CourseData> mCourseList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "courseData", "", "bindData", "(Lcom/mi/health/course/export/data/CourseModel$CourseData;)V", "Lcom/xiaomi/fitness/widget/view/RatioImageView;", "imgView", "Lcom/xiaomi/fitness/widget/view/RatioImageView;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecommendationCourseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendationCourseAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter$ItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,73:1\n54#2,3:74\n24#2:77\n57#2,6:78\n63#2,2:85\n57#3:84\n*S KotlinDebug\n*F\n+ 1 RecommendationCourseAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/RecommendationCourseAdapter$ItemViewHolder\n*L\n69#1:74,3\n69#1:77\n69#1:78,6\n69#1:85,2\n69#1:84\n*E\n"})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RatioImageView imgView;
        final /* synthetic */ RecommendationCourseAdapter this$0;

        @NotNull
        private final TextView titleTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull RecommendationCourseAdapter recommendationCourseAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = recommendationCourseAdapter;
            View viewFindViewById = itemView.findViewById(xri.A2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.imgView = (RatioImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.q7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.titleTv = (TextView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(CourseModel.CourseData courseData, RatioImageView it) {
            Intrinsics.checkNotNullParameter(courseData, "$courseData");
            Intrinsics.checkNotNullParameter(it, "it");
            CourseApiKt.getCourseApi().goInfoPage(courseData.courseId, 1);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_recommend_cover"), TuplesKt.to("source", "workout_tab_page"), TuplesKt.to("asset_id", Long.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name), TuplesKt.to("tip", "56.2.2.1.19567")));
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final CourseModel.CourseData courseData) {
            Intrinsics.checkNotNullParameter(courseData, "courseData");
            ViewExtKt.clickWithTrigger$default(this.imgView, 0L, new Function1() { // from class: mjj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RecommendationCourseAdapter.ItemViewHolder.bindData$lambda$0(courseData, (RatioImageView) obj);
                }
            }, 1, null);
            this.imgView.setContentDescription(courseData.title);
            RatioImageView ratioImageView = this.imgView;
            Coil.imageLoader(ratioImageView.getContext()).enqueue(new ImageRequest.Builder(ratioImageView.getContext()).data(courseData.smallImageUrl).target(ratioImageView).build());
            this.titleTv.setText(courseData.title);
        }
    }

    public RecommendationCourseAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mCourseList = new ArrayList();
    }

    public final void bindData(@NotNull List<? extends CourseModel.CourseData> courseList) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        this.mCourseList.clear();
        this.mCourseList.addAll(courseList);
        notifyDataSetChanged();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mCourseList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bindData(this.mCourseList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.course_launch_layout_post, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }
}
