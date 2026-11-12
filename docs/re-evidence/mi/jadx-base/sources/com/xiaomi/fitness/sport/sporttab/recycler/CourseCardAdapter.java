package com.xiaomi.fitness.sport.sporttab.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.TrackContentBean;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.export.data.CourseSeriesData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.sporttab.recycler.CourseCardAdapter;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/course/export/data/CourseSeriesData;", "dataModel", "", "bindData", "(Lcom/mi/health/course/export/data/CourseSeriesData;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "Lcom/mi/health/course/export/data/CourseListItem;", "mCourseList", "Ljava/util/List;", "", "mSeriesId", "J", "<init>", "()V", "Companion", "CourseViewHolder", "MoreBtnViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseCardAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_SHOW_NUM = 5;

    @NotNull
    public static final String TAG = "CourseCardAdapter";
    public static final int TYPE_COURSE_ITEM = 1;
    public static final int TYPE_MORE_BTN = 2;

    @NotNull
    private final List<CourseListItem> mCourseList = new ArrayList();
    private long mSeriesId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter$Companion;", "", "<init>", "()V", "TAG", "", "TYPE_COURSE_ITEM", "", "TYPE_MORE_BTN", "MAX_SHOW_NUM", "getMAX_SHOW_NUM", "()I", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMAX_SHOW_NUM() {
            return CourseCardAdapter.MAX_SHOW_NUM;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter$CourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/course/export/data/CourseListItem;", "courseData", "", "bindData", "(Lcom/mi/health/course/export/data/CourseListItem;)V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "desTv", "Landroid/widget/TextView;", "courseNameTv", "Landroid/widget/ImageView;", "thumbnailIv", "Landroid/widget/ImageView;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseCardAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter$CourseViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,132:1\n54#2,3:133\n24#2:136\n57#2,6:137\n63#2,2:144\n57#3:143\n*S KotlinDebug\n*F\n+ 1 CourseCardAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter$CourseViewHolder\n*L\n100#1:133,3\n100#1:136\n100#1:137,6\n100#1:144,2\n100#1:143\n*E\n"})
    public final class CourseViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView courseNameTv;

        @NotNull
        private final TextView desTv;

        @NotNull
        private final View itemView;
        final /* synthetic */ CourseCardAdapter this$0;

        @NotNull
        private final ImageView thumbnailIv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourseViewHolder(@NotNull CourseCardAdapter courseCardAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = courseCardAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(xri.e1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.desTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.course_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.courseNameTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(xri.k7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.thumbnailIv = (ImageView) viewFindViewById3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(CourseListItem courseData, View it) {
            Intrinsics.checkNotNullParameter(courseData, "$courseData");
            Intrinsics.checkNotNullParameter(it, "it");
            CourseApi courseApi = CourseApiKt.getCourseApi();
            Long id = courseData.getId();
            courseApi.goInfoPage(id != null ? id.longValue() : 0L, 1);
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final CourseListItem courseData) {
            Intrinsics.checkNotNullParameter(courseData, "courseData");
            this.courseNameTv.setText(courseData.getName());
            String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(courseData.getDuration());
            String first = CourseVipExtKt.getDifficult(courseData).getFirst();
            this.desTv.setText(zNTimeWithMin + " | " + first);
            ImageView imageView = this.thumbnailIv;
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(courseData.getCover()).target(imageView).build());
            ViewExtKt.clickWithTrigger$default(this.itemView, 0L, new Function1() { // from class: dp4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseCardAdapter.CourseViewHolder.bindData$lambda$0(courseData, (View) obj);
                }
            }, 1, null);
            Long id = courseData.getId();
            this.thumbnailIv.setTag(new TrackContentBean(id != null ? id.toString() : null, false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.108.0.1.40461"), TuplesKt.to("area", 1), TuplesKt.to(FaceDetailFragment.PAGE_NAME, "运动tab首页"), TuplesKt.to("type_sku", Integer.valueOf(courseData.getPricingStatus() + 1)), TuplesKt.to("asset_id", String.valueOf(courseData.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.getName())), 0.0f, 16, null));
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter$MoreBtnViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/CourseCardAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MoreBtnViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View itemView;
        final /* synthetic */ CourseCardAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreBtnViewHolder(@NotNull CourseCardAdapter courseCardAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = courseCardAdapter;
            this.itemView = itemView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(CourseCardAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            Logger.d(CourseCardAdapter.TAG, "more click:" + this$0.mSeriesId);
            CourseApiKt.getCourseApi().goSeriesInfoPage(this$0.mSeriesId);
            return Unit.INSTANCE;
        }

        public final void bindData() {
            View view = this.itemView;
            final CourseCardAdapter courseCardAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: ep4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseCardAdapter.MoreBtnViewHolder.bindData$lambda$0(courseCardAdapter, (View) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    public final void bindData(@NotNull CourseSeriesData dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.mCourseList.clear();
        ArrayList<CourseListItem> item = dataModel.getItem();
        if (item != null) {
            this.mCourseList.addAll(item);
        }
        Long id = dataModel.getId();
        this.mSeriesId = id != null ? id.longValue() : 0L;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        int size = this.mCourseList.size();
        int i = MAX_SHOW_NUM;
        return size > i ? i + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position < MAX_SHOW_NUM ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof CourseViewHolder) {
            ((CourseViewHolder) holder).bindData(this.mCourseList.get(position));
        }
        if (holder instanceof MoreBtnViewHolder) {
            ((MoreBtnViewHolder) holder).bindData();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.c1, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new CourseViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(dvi.d1, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new MoreBtnViewHolder(this, viewInflate2);
    }
}
