package com.mi.health.course.adapter;

import android.app.Application;
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
import com.google.android.material.imageview.ShapeableImageView;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.czi;
import defpackage.ju4;
import defpackage.kyi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u001e\u0010 \u001a\u00020\u001d2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u000eJ\b\u0010$\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/mi/health/course/adapter/CourseFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CourseFeedAdapter$Holder;", "context", "Landroid/content/Context;", "sourceKey", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "isEdit", "", "states", "", "", "list", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "isMale", "sContext", "Landroid/app/Application;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "addData", PluginDeviceInfo.FICONOFF, "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "getItemCount", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseFeedAdapter extends RecyclerView.Adapter<Holder> {
    private final LayoutInflater inflater;
    private boolean isEdit;
    private final boolean isMale;

    @NotNull
    private final List<CourseModel.CourseData> list;

    @NotNull
    private final Application sContext;

    @NotNull
    private final String sourceKey;

    @NotNull
    private Map<Integer, Boolean> states;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/adapter/CourseFeedAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "pos", "", "bind", "(I)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lju4;", "itemBinding", "Lju4;", "<init>", "(Lcom/mi/health/course/adapter/CourseFeedAdapter;Lju4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseFeedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseFeedAdapter.kt\ncom/mi/health/course/adapter/CourseFeedAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,98:1\n54#2,3:99\n24#2:102\n57#2,6:103\n63#2,2:110\n57#3:109\n*S KotlinDebug\n*F\n+ 1 CourseFeedAdapter.kt\ncom/mi/health/course/adapter/CourseFeedAdapter$Holder\n*L\n65#1:99,3\n65#1:102\n65#1:103,6\n65#1:110,2\n65#1:109\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {

        @NotNull
        private final ju4 itemBinding;
        final /* synthetic */ CourseFeedAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseFeedAdapter courseFeedAdapter, ju4 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.this$0 = courseFeedAdapter;
            this.itemBinding = itemBinding;
            TextView countView = itemBinding.B;
            Intrinsics.checkNotNullExpressionValue(countView, "countView");
            ViewExtKt.gone(countView);
            this.itemView.setOnClickListener(this);
        }

        public final void bind(int pos) {
            this.itemBinding.A.setTag(Integer.valueOf(pos));
            CourseModel.CourseData courseData = (CourseModel.CourseData) this.this$0.list.get(pos);
            this.itemBinding.E.setText(courseData.title);
            ShapeableImageView imageView = this.itemBinding.D;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(courseData.middleImageUrl).target(imageView).build());
            String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(courseData.duration);
            int i = this.this$0.isMale ? courseData.maleCalories : courseData.femaleCalories;
            String quantityString = this.this$0.sContext.getResources().getQuantityString(kyi.common_unit_calorie_desc, i, Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.itemBinding.C.setText(ResourceExtKt.getString(czi.course_item_info, zNTimeWithMin, quantityString, CourseExtKt.getDifficult(courseData).getFirst()));
            if (this.this$0.isEdit) {
                View checkView = this.itemBinding.A;
                Intrinsics.checkNotNullExpressionValue(checkView, "checkView");
                ViewExtKt.visible(checkView);
                View view = this.itemBinding.A;
                Boolean bool = (Boolean) this.this$0.states.get(Integer.valueOf(pos));
                view.setSelected(bool != null ? bool.booleanValue() : false);
            } else {
                View checkView2 = this.itemBinding.A;
                Intrinsics.checkNotNullExpressionValue(checkView2, "checkView");
                ViewExtKt.gone(checkView2);
            }
            this.itemBinding.getRoot().setTag(courseData);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Logger.d("CourseCatalogAdapter", "onClick: source = " + this.this$0.sourceKey);
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.CourseData");
            CourseModel.CourseData courseData = (CourseModel.CourseData) tag;
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_cover"), TuplesKt.to("source", this.this$0.sourceKey), TuplesKt.to("asset_id", Long.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name), TuplesKt.to("tip", "56.2.2.1.19568")));
            CourseInfoActivityKt.startCourseInfo$default(courseData.courseId, null, 7, false, 10, null);
        }
    }

    public CourseFeedAdapter(@NotNull Context context, @NotNull String sourceKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        this.sourceKey = sourceKey;
        this.inflater = LayoutInflater.from(context);
        this.states = new LinkedHashMap();
        this.list = new ArrayList();
        this.isMale = Intrinsics.areEqual(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "male");
        this.sContext = AppUtil.getApp();
    }

    public final void addData(@Nullable List<? extends CourseModel.CourseData> d, boolean set) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ju4 ju4VarA0 = ju4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(ju4VarA0, "inflate(...)");
        return new Holder(this, ju4VarA0);
    }
}
