package com.xiaomi.fitness.sport.course;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.widget.view.RatioImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.c1j;
import defpackage.cu4;
import defpackage.xri;
import defpackage.zxi;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseVideoHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "level", "", "getDifficultStr", "(I)Ljava/lang/String;", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "data", "", MedicalIdSPContract.PREF_FIRST, "", "bind", "(Lcom/mi/health/course/export/data/CourseModel$CourseData;Z)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcu4;", "view", "Lcu4;", "getView", "()Lcu4;", "isMale", "Z", "<init>", "(Lcu4;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseVideoHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoHolder.kt\ncom/xiaomi/fitness/sport/course/CourseVideoHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,77:1\n54#2,3:78\n24#2:81\n59#2,6:82\n*S KotlinDebug\n*F\n+ 1 CourseVideoHolder.kt\ncom/xiaomi/fitness/sport/course/CourseVideoHolder\n*L\n43#1:78,3\n43#1:81\n43#1:82,6\n*E\n"})
public final class CourseVideoHolder extends RecyclerView.d0 implements View.OnClickListener {
    private final boolean isMale;

    @NotNull
    private final cu4 view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseVideoHolder(@NotNull cu4 view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.isMale = Intrinsics.areEqual(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "male");
        view.getRoot().setOnClickListener(this);
    }

    private final String getDifficultStr(int level) {
        return CourseApiKt.getCourseApi().getCourseLevelStr(level);
    }

    public final void bind(@NotNull CourseModel.CourseData data, boolean first) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.view.getRoot().setTag(xri.Y0, first ? null : 504);
        this.view.getRoot().setTag(data);
        String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(data.duration);
        int i = this.isMale ? data.maleCalories : data.femaleCalories;
        String quantityString = AppUtil.getApp().getResources().getQuantityString(zxi.common_unit_calorie_desc, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.view.A.setText(ResourceExtKt.getString(c1j.course_item_info, zNTimeWithMin, quantityString, getDifficultStr(data.difficulty)));
        this.view.C.setText(data.name);
        RatioImageView imgView = this.view.B;
        Intrinsics.checkNotNullExpressionValue(imgView, "imgView");
        Coil.imageLoader(imgView.getContext()).enqueue(new ImageRequest.Builder(imgView.getContext()).data(data.middleImageUrl).target(imgView).build());
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.108.0.1.40461"), TuplesKt.to("area", 5), TuplesKt.to(FaceDetailFragment.PAGE_NAME, "发起运动推荐"), TuplesKt.to("type_sku", Integer.valueOf(data.pricingStatus + 1)), TuplesKt.to("asset_id", String.valueOf(data.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, data.name)));
    }

    @NotNull
    public final cu4 getView() {
        return this.view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.CourseData");
        CourseModel.CourseData courseData = (CourseModel.CourseData) tag;
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "treadmill_video_course_cover"), TuplesKt.to("source", "mijia_treadmill_home_page"), TuplesKt.to("asset_id", Long.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name), TuplesKt.to("tip", "56.2.2.1.19570")));
        CourseApiKt.getCourseApi().goInfoPage(courseData.courseId, 6);
    }
}
