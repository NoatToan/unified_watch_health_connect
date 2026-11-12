package com.xiaomi.fitness.sport_eco.course;

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
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.widget.view.RatioImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.mq4;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseVideoHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "", "level", "", "getDifficultStr", "(I)Ljava/lang/String;", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "data", "", MedicalIdSPContract.PREF_FIRST, "", "bind", "(Lcom/mi/health/course/export/data/CourseModel$CourseData;Z)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lmq4;", "view", "Lmq4;", "getView", "()Lmq4;", "isMale", "Z", "<init>", "(Lmq4;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseVideoHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoHolder.kt\ncom/xiaomi/fitness/sport_eco/course/CourseVideoHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,67:1\n54#2,3:68\n24#2:71\n57#2,6:72\n63#2,2:79\n54#2,3:81\n24#2:84\n57#2,6:85\n63#2,2:92\n57#3:78\n57#3:91\n*S KotlinDebug\n*F\n+ 1 CourseVideoHolder.kt\ncom/xiaomi/fitness/sport_eco/course/CourseVideoHolder\n*L\n44#1:68,3\n44#1:71\n44#1:72,6\n44#1:79,2\n46#1:81,3\n46#1:84\n46#1:85,6\n46#1:92,2\n44#1:78\n46#1:91\n*E\n"})
public final class CourseVideoHolder extends RecyclerView.d0 implements View.OnClickListener {
    private final boolean isMale;

    @NotNull
    private final mq4 view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseVideoHolder(@NotNull mq4 view) {
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
        this.view.getRoot().setTag(zri.H, first ? null : 504);
        this.view.getRoot().setTag(data);
        String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(data.duration);
        int i = this.isMale ? data.maleCalories : data.femaleCalories;
        String quantityString = AppUtil.getApp().getResources().getQuantityString(ayi.common_unit_calorie_desc, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        this.view.A.setText(ResourceExtKt.getString(e1j.course_item_info, zNTimeWithMin, quantityString, getDifficultStr(data.difficulty)));
        this.view.C.setText(data.name);
        if (Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "ksmb.treadmill.m1v1")) {
            RatioImageView imgView = this.view.B;
            Intrinsics.checkNotNullExpressionValue(imgView, "imgView");
            Coil.imageLoader(imgView.getContext()).enqueue(new ImageRequest.Builder(imgView.getContext()).data(data.middleImageUrl).target(imgView).build());
        } else {
            RatioImageView imgView2 = this.view.B;
            Intrinsics.checkNotNullExpressionValue(imgView2, "imgView");
            Coil.imageLoader(imgView2.getContext()).enqueue(new ImageRequest.Builder(imgView2.getContext()).data(data.smallImageUrl).target(imgView2).build());
        }
    }

    @NotNull
    public final mq4 getView() {
        return this.view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.CourseData");
        CourseModel.CourseData courseData = (CourseModel.CourseData) tag;
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "treadmill_video_course_cover"), TuplesKt.to("source", "mijia_treadmill_home_page"), TuplesKt.to("asset_id", Long.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name), TuplesKt.to("tip", "56.2.2.1.19570")));
        CourseApiKt.getCourseApi().goInfoPage(courseData.courseId, 0);
    }
}
