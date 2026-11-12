package com.mi.health.course.adapter;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.adapter.CourseSeriesAdapter;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.export.data.CourseSeriesData;
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
import com.xiaomi.fitness.widget.expandable.ExpandableTextView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.czi;
import defpackage.dx4;
import defpackage.kyi;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003678B\u001f\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b4\u00105J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u00020\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/mi/health/course/adapter/CourseSeriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Lcom/mi/health/course/adapter/CourseSeriesEntity;", "entity", "addData", "(Lcom/mi/health/course/adapter/CourseSeriesEntity;)V", "", PluginDeviceInfo.FICONOFF, "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Ljava/util/List;Z)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "", "sourceKey", "Ljava/lang/String;", "isFromSearch", "Z", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "", "list", "Ljava/util/List;", "isMale", "Landroid/app/Application;", "sContext", "Landroid/app/Application;", "pageTitle", "getPageTitle", "()Ljava/lang/String;", "setPageTitle", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Companion", "Holder", "HeadHolder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseSeriesAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "CourseSeriesAdapter";
    public static final int TYPE_COURSE_ITEM = 2;
    public static final int TYPE_SERIES_HEAD = 1;
    private final LayoutInflater inflater;
    private final boolean isFromSearch;
    private final boolean isMale;

    @NotNull
    private final List<CourseSeriesEntity> list;

    @NotNull
    private String pageTitle;

    @NotNull
    private final Application sContext;

    @NotNull
    private final String sourceKey;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/adapter/CourseSeriesAdapter$HeadHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Lcom/mi/health/course/export/data/CourseSeriesData;", "seriesData", "", "bindHead", "(Lcom/mi/health/course/export/data/CourseSeriesData;)V", "Landroid/view/View;", "p0", "onClick", "(Landroid/view/View;)V", "Ldx4;", "headBinding", "Ldx4;", "<init>", "(Lcom/mi/health/course/adapter/CourseSeriesAdapter;Ldx4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseSeriesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSeriesAdapter.kt\ncom/mi/health/course/adapter/CourseSeriesAdapter$HeadHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,175:1\n54#2,3:176\n24#2:179\n57#2,6:180\n63#2,2:187\n57#3:186\n*S KotlinDebug\n*F\n+ 1 CourseSeriesAdapter.kt\ncom/mi/health/course/adapter/CourseSeriesAdapter$HeadHolder\n*L\n144#1:176,3\n144#1:179\n144#1:180,6\n144#1:187,2\n144#1:186\n*E\n"})
    public final class HeadHolder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private final dx4 headBinding;
        final /* synthetic */ CourseSeriesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeadHolder(@NotNull CourseSeriesAdapter courseSeriesAdapter, dx4 headBinding) {
            super(headBinding.getRoot());
            Intrinsics.checkNotNullParameter(headBinding, "headBinding");
            this.this$0 = courseSeriesAdapter;
            this.headBinding = headBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindHead$lambda$0(HeadHolder this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.headBinding.C.showLess();
        }

        public final void bindHead(@NotNull CourseSeriesData seriesData) {
            Intrinsics.checkNotNullParameter(seriesData, "seriesData");
            ImageView ivSeriesPic = this.headBinding.B;
            Intrinsics.checkNotNullExpressionValue(ivSeriesPic, "ivSeriesPic");
            Coil.imageLoader(ivSeriesPic.getContext()).enqueue(new ImageRequest.Builder(ivSeriesPic.getContext()).data(seriesData.getCover()).target(ivSeriesPic).build());
            this.headBinding.D.setText(seriesData.getName());
            Context context = this.headBinding.A.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i = kyi.course_series_item_info_persons;
            Integer trainedCount = seriesData.getTrainedCount();
            int iIntValue = trainedCount != null ? trainedCount.intValue() : 0;
            Integer trainedCount2 = seriesData.getTrainedCount();
            String quantityString = ResourceExtKt.getQuantityString(context, i, iIntValue, Integer.valueOf(trainedCount2 != null ? trainedCount2.intValue() : 0));
            Context context2 = this.headBinding.A.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i2 = kyi.course_series_item_info_courses;
            Integer itemsCount = seriesData.getItemsCount();
            int iIntValue2 = itemsCount != null ? itemsCount.intValue() : 0;
            Integer itemsCount2 = seriesData.getItemsCount();
            this.headBinding.A.setText(ResourceExtKt.getString(czi.course_series_item_info, quantityString, ResourceExtKt.getQuantityString(context2, i2, iIntValue2, Integer.valueOf(itemsCount2 != null ? itemsCount2.intValue() : 0))));
            ExpandableTextView tvInfo = this.headBinding.C;
            Intrinsics.checkNotNullExpressionValue(tvInfo, "tvInfo");
            ExtUtilsKt.setVisible(tvInfo, true);
            this.headBinding.C.setText(seriesData.getIntroduce());
            this.headBinding.C.post(new Runnable() { // from class: ax4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseSeriesAdapter.HeadHolder.bindHead$lambda$0(this.f3532a);
                }
            });
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View p0) {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/adapter/CourseSeriesAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Lcom/mi/health/course/export/data/CourseListItem;", PluginDeviceInfo.FICONOFF, "", "bind", "(Lcom/mi/health/course/export/data/CourseListItem;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lxm4;", "itemBinding", "Lxm4;", "<init>", "(Lcom/mi/health/course/adapter/CourseSeriesAdapter;Lxm4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseSeriesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSeriesAdapter.kt\ncom/mi/health/course/adapter/CourseSeriesAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,175:1\n54#2,3:176\n24#2:179\n57#2,6:180\n63#2,2:187\n57#3:186\n*S KotlinDebug\n*F\n+ 1 CourseSeriesAdapter.kt\ncom/mi/health/course/adapter/CourseSeriesAdapter$Holder\n*L\n95#1:176,3\n95#1:179\n95#1:180,6\n95#1:187,2\n95#1:186\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private final xm4 itemBinding;
        final /* synthetic */ CourseSeriesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseSeriesAdapter courseSeriesAdapter, xm4 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.this$0 = courseSeriesAdapter;
            this.itemBinding = itemBinding;
            this.itemView.setOnClickListener(this);
        }

        public final void bind(@NotNull CourseListItem d) {
            Intrinsics.checkNotNullParameter(d, "d");
            TextView tvCourseTag = this.itemBinding.D;
            Intrinsics.checkNotNullExpressionValue(tvCourseTag, "tvCourseTag");
            CourseExtKt.showCourseTag(tvCourseTag, d.getPricingStatus());
            this.itemBinding.C.setText(d.getName());
            ShapeableImageView imageView = this.itemBinding.B;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(d.getCover()).target(imageView).build());
            String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(d.getDuration());
            int maleCalorie = this.this$0.isMale ? d.getMaleCalorie() : d.getFemaleCalorie();
            String quantityString = this.this$0.sContext.getResources().getQuantityString(kyi.common_unit_calorie_desc, maleCalorie, Integer.valueOf(maleCalorie));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.itemBinding.A.setText(ResourceExtKt.getString(czi.course_item_info, zNTimeWithMin, quantityString, CourseVipExtKt.getDifficult(d).getFirst()));
            this.itemBinding.getRoot().setTag(d);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[7];
            pairArr[0] = TuplesKt.to("name", "Class_Entrance");
            pairArr[1] = TuplesKt.to("tip", "56.108.0.1.40461");
            pairArr[2] = TuplesKt.to("area", Integer.valueOf(this.this$0.isFromSearch ? 3 : 4));
            pairArr[3] = TuplesKt.to(FaceDetailFragment.PAGE_NAME, this.this$0.isFromSearch ? "" : this.this$0.getPageTitle());
            pairArr[4] = TuplesKt.to("type_sku", Integer.valueOf(d.getPricingStatus() + 1));
            pairArr[5] = TuplesKt.to("asset_id", String.valueOf(d.getId()));
            pairArr[6] = TuplesKt.to(OneTrack.Param.ASSET_NAME, d.getName());
            oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseListItem");
            CourseListItem courseListItem = (CourseListItem) tag;
            Logger.d("CourseSeriesAdapter", "onClick: source = " + this.this$0.sourceKey + ",d:" + courseListItem);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_cover"), TuplesKt.to("source", this.this$0.sourceKey), TuplesKt.to("asset_id", String.valueOf(courseListItem.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseListItem.getName()), TuplesKt.to("tip", "56.2.2.1.19568")));
            Long id = courseListItem.getId();
            CourseInfoActivityKt.startCourseInfo$default(id != null ? id.longValue() : 0L, null, this.this$0.isFromSearch ? 3 : 4, false, 10, null);
        }
    }

    public CourseSeriesAdapter(@NotNull Context context, @NotNull String sourceKey, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        this.sourceKey = sourceKey;
        this.isFromSearch = z;
        this.inflater = LayoutInflater.from(context);
        this.list = new ArrayList();
        this.isMale = Intrinsics.areEqual(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "male");
        this.sContext = AppUtil.getApp();
        this.pageTitle = "";
    }

    public final void addData(@NotNull CourseSeriesEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.list.add(entity);
        notifyDataSetChanged();
    }

    public final void clear() {
        this.list.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.list.get(position).getType();
    }

    @NotNull
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof Holder) {
            Object data = this.list.get(position).getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseListItem");
            ((Holder) holder).bind((CourseListItem) data);
        }
        if (holder instanceof HeadHolder) {
            Object data2 = this.list.get(position).getData();
            Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseSeriesData");
            ((HeadHolder) holder).bindHead((CourseSeriesData) data2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            dx4 dx4VarA0 = dx4.A0(this.inflater, parent, false);
            Intrinsics.checkNotNullExpressionValue(dx4VarA0, "inflate(...)");
            return new HeadHolder(this, dx4VarA0);
        }
        xm4 xm4VarA0 = xm4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(xm4VarA0, "inflate(...)");
        return new Holder(this, xm4VarA0);
    }

    public final void setPageTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageTitle = str;
    }

    public final void addData(@Nullable List<CourseSeriesEntity> d, boolean set) {
        if (d == null) {
            return;
        }
        if (set) {
            this.list.clear();
        }
        this.list.addAll(d);
        notifyDataSetChanged();
    }
}
