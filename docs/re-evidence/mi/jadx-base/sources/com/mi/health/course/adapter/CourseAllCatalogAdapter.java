package com.mi.health.course.adapter;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.activity.CourseSeriseInfoActivityKt;
import com.mi.health.course.adapter.CourseAllCatalogAdapter;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.ext.CourseExtKt;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bli;
import defpackage.czi;
import defpackage.kyi;
import defpackage.qn4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020$2\n\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\"H\u0016J\u001e\u0010'\u001a\u00020$2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010)2\u0006\u0010*\u001a\u00020\u0011J\b\u0010+\u001a\u00020\"H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/mi/health/course/adapter/CourseAllCatalogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CourseAllCatalogAdapter$Holder;", "context", "Landroid/content/Context;", "sourceKey", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "list", "", "Lcom/mi/health/course/export/data/CourseListItem;", "isMale", "", "sContext", "Landroid/app/Application;", "dpCorner", "", "getDpCorner", "()F", "dpCorner$delegate", "Lkotlin/Lazy;", "isSeries", "()Z", "setSeries", "(Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "addData", PluginDeviceInfo.FICONOFF, "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "getItemCount", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseAllCatalogAdapter extends RecyclerView.Adapter<Holder> {

    /* JADX INFO: renamed from: dpCorner$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dpCorner;
    private final LayoutInflater inflater;
    private final boolean isMale;
    private boolean isSeries;

    @NotNull
    private final List<CourseListItem> list;

    @NotNull
    private final Application sContext;

    @NotNull
    private final String sourceKey;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/adapter/CourseAllCatalogAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "pos", "", "bind", "(I)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lqn4;", "itemBinding", "Lqn4;", "<init>", "(Lcom/mi/health/course/adapter/CourseAllCatalogAdapter;Lqn4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseAllCatalogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAllCatalogAdapter.kt\ncom/mi/health/course/adapter/CourseAllCatalogAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,169:1\n54#2,3:170\n24#2:173\n57#2,6:174\n63#2,2:181\n57#3:180\n*S KotlinDebug\n*F\n+ 1 CourseAllCatalogAdapter.kt\ncom/mi/health/course/adapter/CourseAllCatalogAdapter$Holder\n*L\n74#1:170,3\n74#1:173\n74#1:174,6\n74#1:181,2\n74#1:180\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private final qn4 itemBinding;
        final /* synthetic */ CourseAllCatalogAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseAllCatalogAdapter courseAllCatalogAdapter, qn4 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.this$0 = courseAllCatalogAdapter;
            this.itemBinding = itemBinding;
            this.itemView.setOnClickListener(this);
        }

        public final void bind(int pos) {
            CourseListItem courseListItem = (CourseListItem) this.this$0.list.get(pos);
            this.itemBinding.B.setText(courseListItem.getName());
            ShapeableImageView ivCoursePic = this.itemBinding.A;
            Intrinsics.checkNotNullExpressionValue(ivCoursePic, "ivCoursePic");
            Coil.imageLoader(ivCoursePic.getContext()).enqueue(new ImageRequest.Builder(ivCoursePic.getContext()).data(courseListItem.getCover()).target(ivCoursePic).build());
            String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(courseListItem.getDuration());
            int maleCalorie = this.this$0.isMale ? courseListItem.getMaleCalorie() : courseListItem.getFemaleCalorie();
            String quantityString = this.this$0.sContext.getResources().getQuantityString(kyi.common_unit_calorie_desc, maleCalorie, Integer.valueOf(maleCalorie));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String first = CourseVipExtKt.getDifficult(courseListItem).getFirst();
            View view = this.itemBinding.F;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ExtUtilsKt.getColor(bli.l), ExtUtilsKt.getColor(bli.d)});
            CourseAllCatalogAdapter courseAllCatalogAdapter = this.this$0;
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, courseAllCatalogAdapter.getDpCorner(), courseAllCatalogAdapter.getDpCorner(), courseAllCatalogAdapter.getDpCorner(), courseAllCatalogAdapter.getDpCorner()});
            view.setBackground(gradientDrawable);
            Context context = this.itemBinding.C.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i = kyi.course_series_item_info_persons;
            Integer trainedCount = courseListItem.getTrainedCount();
            int iIntValue = trainedCount != null ? trainedCount.intValue() : 0;
            Integer trainedCount2 = courseListItem.getTrainedCount();
            String quantityString2 = ResourceExtKt.getQuantityString(context, i, iIntValue, Integer.valueOf(trainedCount2 != null ? trainedCount2.intValue() : 0));
            Context context2 = this.itemBinding.C.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i2 = kyi.course_series_item_info_courses;
            Integer itemsCount = courseListItem.getItemsCount();
            int iIntValue2 = itemsCount != null ? itemsCount.intValue() : 0;
            Integer itemsCount2 = courseListItem.getItemsCount();
            this.itemBinding.C.setText(this.this$0.getIsSeries() ? ResourceExtKt.getString(czi.course_series_item_info, quantityString2, ResourceExtKt.getQuantityString(context2, i2, iIntValue2, Integer.valueOf(itemsCount2 != null ? itemsCount2.intValue() : 0))) : ResourceExtKt.getString(czi.course_item_info, first, quantityString, zNTimeWithMin));
            this.itemBinding.getRoot().setTag(courseListItem);
            TextView tvCourseTag = this.itemBinding.D;
            Intrinsics.checkNotNullExpressionValue(tvCourseTag, "tvCourseTag");
            CourseExtKt.showCourseTag(tvCourseTag, courseListItem.getPricingStatus());
            TextView tvCourseTagSeries = this.itemBinding.E;
            Intrinsics.checkNotNullExpressionValue(tvCourseTagSeries, "tvCourseTagSeries");
            CourseExtKt.showCourseTag(tvCourseTagSeries, this.this$0.getIsSeries() ? 3 : 0);
            if (this.this$0.getIsSeries()) {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Series"), TuplesKt.to("tip", "56.108.0.1.40466"), TuplesKt.to("area", 2), TuplesKt.to("asset_id", String.valueOf(courseListItem.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseListItem.getName())));
            } else {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.108.0.1.40461"), TuplesKt.to("area", 2), TuplesKt.to(FaceDetailFragment.PAGE_NAME, "全部课程列表"), TuplesKt.to("type_sku", Integer.valueOf(courseListItem.getPricingStatus() + 1)), TuplesKt.to("asset_id", String.valueOf(courseListItem.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseListItem.getName())));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Logger.d("CourseAllCatalogAdapter", "onClick: source = " + this.this$0.sourceKey);
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseListItem");
            CourseListItem courseListItem = (CourseListItem) tag;
            Logger.d("CourseAllCatalogAdapter", "series click:" + courseListItem.getId() + ",isSeries:" + this.this$0.getIsSeries());
            if (!this.this$0.getIsSeries()) {
                Long id = courseListItem.getId();
                CourseInfoActivityKt.startCourseInfo$default(id != null ? id.longValue() : 0L, null, 2, false, 10, null);
            } else {
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Series"), TuplesKt.to("tip", "56.0.0.0.40467"), TuplesKt.to("area", 2), TuplesKt.to("asset_id", String.valueOf(courseListItem.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseListItem.getName())));
                Long id2 = courseListItem.getId();
                CourseSeriseInfoActivityKt.startCourseSeriesInfo(id2 != null ? id2.longValue() : 0L, 2);
            }
        }
    }

    public CourseAllCatalogAdapter(@NotNull Context context, @NotNull String sourceKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        this.sourceKey = sourceKey;
        this.inflater = LayoutInflater.from(context);
        this.list = new ArrayList();
        this.isMale = Intrinsics.areEqual(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "male");
        this.sContext = AppUtil.getApp();
        this.dpCorner = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pn4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(CourseAllCatalogAdapter.dpCorner_delegate$lambda$0());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dpCorner_delegate$lambda$0() {
        return ExtUtilsKt.getDp(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDpCorner() {
        return ((Number) this.dpCorner.getValue()).floatValue();
    }

    public final void addData(@Nullable List<CourseListItem> d, boolean set) {
        if (d == null) {
            return;
        }
        if (set) {
            this.list.clear();
        }
        this.list.addAll(d);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    /* JADX INFO: renamed from: isSeries, reason: from getter */
    public final boolean getIsSeries() {
        return this.isSeries;
    }

    public final void setSeries(boolean z) {
        this.isSeries = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        qn4 qn4VarA0 = qn4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(qn4VarA0, "inflate(...)");
        return new Holder(this, qn4VarA0);
    }
}
