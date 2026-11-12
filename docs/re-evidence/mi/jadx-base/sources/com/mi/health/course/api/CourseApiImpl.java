package com.mi.health.course.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mi.health.course.activity.CourseAllCatalogActivityKt;
import com.mi.health.course.activity.CourseCatalogActivityKt;
import com.mi.health.course.activity.CourseFeedActivity;
import com.mi.health.course.activity.CourseFeedActivityKt;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.activity.CourseMeActivityKt;
import com.mi.health.course.activity.CourseSeriseInfoActivityKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.mi.health.course.export.data.CourseExchangeBenefits;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseInfoList;
import com.mi.health.course.export.data.CourseItem;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseNewEquipmentBenefits;
import com.mi.health.course.export.data.CourseSeriesRecommend;
import com.mi.health.course.export.data.CourseTrainRecord;
import com.mi.health.course.export.data.CourseVipInfo;
import com.mi.health.course.export.data.ReqItemList;
import com.mi.health.course.export.data.TrainingCourseInfo;
import com.mi.health.course.export.data.UnderArmourCourseModel;
import com.mi.health.course.export.perference.CourseVipSharePreference;
import com.mi.health.course.service.FloatWindowFragment;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.czi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 }2\u00020\u0001:\u0001}B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020'H\u0016J'\u0010/\u001a\u00020*\"\b\b\u0000\u00100*\u0002012\u0006\u00102\u001a\u0002H02\u0006\u00103\u001a\u000204H\u0016¢\u0006\u0002\u00105J\u0018\u00106\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u00107\u001a\u00020-H\u0016J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020!H\u0016J*\u0010:\u001a\u00020*2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020*0<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020*0?H\u0016J,\u0010@\u001a\u00020*2\u0014\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020*0<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020*0?H\u0016J8\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020'2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020*0<2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020*0<H\u0016J\n\u0010F\u001a\u0004\u0018\u00010=H\u0016J \u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020-H\u0096@¢\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J8\u0010O\u001a\u00020*2\b\u0010I\u001a\u0004\u0018\u00010'2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010'2\b\u0010S\u001a\u0004\u0018\u00010'2\u0006\u0010T\u001a\u00020UH\u0016J\u0012\u0010V\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010'H\u0016J0\u0010W\u001a\u00020*2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020*0<2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020*0<H\u0016J4\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020-2\b\u0010R\u001a\u0004\u0018\u00010'2\b\u0010\\\u001a\u0004\u0018\u00010'2\u0006\u0010J\u001a\u00020-H\u0096@¢\u0006\u0002\u0010]J@\u0010^\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010'2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010'2\b\u0010\\\u001a\u0004\u0018\u00010'2\u0006\u0010J\u001a\u00020-H\u0096@¢\u0006\u0002\u0010_J\u0016\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0096@¢\u0006\u0002\u0010dJ\u0016\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hH\u0096@¢\u0006\u0002\u0010iJ\u0010\u0010j\u001a\u00020*2\u0006\u0010k\u001a\u00020'H\u0016J*\u0010l\u001a\u00020*2\u0006\u0010m\u001a\u00020n2\u0006\u0010 \u001a\u00020!2\b\u0010o\u001a\u0004\u0018\u00010p2\u0006\u00107\u001a\u00020-H\u0016J@\u0010w\u001a\u00020*26\u0010x\u001a2\u0012\u0013\u0012\u00110'¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110-¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020*0sH\u0016J@\u0010y\u001a\u00020*26\u0010x\u001a2\u0012\u0013\u0012\u00110'¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110-¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020*0sH\u0016J\u0018\u0010z\u001a\u00020*2\u0006\u0010v\u001a\u00020'2\u0006\u0010P\u001a\u00020-H\u0016J\u0010\u0010{\u001a\u00020'2\u0006\u0010|\u001a\u00020-H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRD\u0010q\u001a8\u00124\u00122\u0012\u0013\u0012\u00110'¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110-¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020*0s0rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006~"}, d2 = {"Lcom/mi/health/course/api/CourseApiImpl;", "Lcom/mi/health/course/export/CourseApi;", "request", "Lcom/mi/health/course/api/CourseRequest;", "<init>", "(Lcom/mi/health/course/api/CourseRequest;)V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "setMGson", "(Lcom/google/gson/Gson;)V", "requestV3", "Lcom/mi/health/course/api/CourseRequestV3;", "getRequestV3", "()Lcom/mi/health/course/api/CourseRequestV3;", "setRequestV3", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "requestVip", "Lcom/mi/health/course/api/CourseVipRequest;", "getRequestVip", "()Lcom/mi/health/course/api/CourseVipRequest;", "setRequestVip", "(Lcom/mi/health/course/api/CourseVipRequest;)V", "courseVipActivityRequest", "Lcom/mi/health/course/api/CourseVipActivityRequest;", "getCourseVipActivityRequest", "()Lcom/mi/health/course/api/CourseVipActivityRequest;", "setCourseVipActivityRequest", "(Lcom/mi/health/course/api/CourseVipActivityRequest;)V", "getTrainRecord", "Lcom/mi/health/course/export/data/CourseTrainRecord;", "courseId", "", "time", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMultiCourseInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseBasicInformationList;", "idsStr", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goFeedPage", "", "tag", DailyRecordKey.sportType, "", "title", "goFloatWindow", "T", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragment", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Landroid/os/Bundle;)V", "goInfoPage", "from", "goSeriesInfoPage", "seriesId", "refreshCourseVipData", "success", "Lkotlin/Function1;", "Lcom/mi/health/course/export/data/CourseVipInfo;", "error", "Lkotlin/Function0;", "getNewEquipmentBenefits", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "exchangeCourseBenefits", "code", "Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "Lcom/xiaomi/fitness/net/response/ApiException;", "getAidongCourseVipInfo", "getCourseRecommend", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "scene", "count", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseSeriesRecommend", "Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "params", "goCourseCatalog", "type", "", "tags", "sportName", "needSideTab", "", "startCourseMe", "getAidongMemberUserInfo", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "getPracticedCourseList", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "courseType", "nextKey", "(ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseList", "(Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfos", "Lcom/mi/health/course/export/data/CourseInfoList;", "reqItemList", "Lcom/mi/health/course/export/data/ReqItemList;", "(Lcom/mi/health/course/export/data/ReqItemList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "(Lcom/mi/health/course/export/data/CourseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goToCourseInfoPage", "jsonStr", "goToCourseInfoActivity", "context", "Landroid/content/Context;", "trainingCourseInfo", "Lcom/mi/health/course/export/data/TrainingCourseInfo;", "mCourseChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "status", "addCourseChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeCourseChangeListener", "notifyCourseChanged", "getCourseLevelStr", "level", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseApiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseApiImpl.kt\ncom/mi/health/course/api/CourseApiImpl\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n29#2:238\n1863#3,2:239\n*S KotlinDebug\n*F\n+ 1 CourseApiImpl.kt\ncom/mi/health/course/api/CourseApiImpl\n*L\n104#1:238\n223#1:239,2\n*E\n"})
public final class CourseApiImpl implements CourseApi {

    @NotNull
    public static final String TAG = "CourseApiImpl";
    public CourseVipActivityRequest courseVipActivityRequest;

    @NotNull
    private final CopyOnWriteArrayList<Function2<String, Integer, Unit>> mCourseChangeListeners;
    public Gson mGson;

    @NotNull
    private final CourseRequest request;
    public CourseRequestV3 requestV3;
    public CourseVipRequest requestVip;

    public CourseApiImpl(@NotNull CourseRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.mCourseChangeListeners = new CopyOnWriteArrayList<>();
    }

    @Override // com.mi.health.course.export.CourseApi
    public void addCourseChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mCourseChangeListeners.add(listener);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void exchangeCourseBenefits(@NotNull String code, @NotNull Function1<? super CourseExchangeBenefits, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getCourseVipActivityRequest().exchangeCourseBenefits(code, success, error);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public CourseVipInfo getAidongCourseVipInfo() {
        CourseVipSharePreference courseVipSharePreference = CourseVipSharePreference.INSTANCE;
        String key_course_vip_date = courseVipSharePreference.getKEY_COURSE_VIP_DATE();
        if (key_course_vip_date == null || key_course_vip_date.length() == 0) {
            return null;
        }
        return (CourseVipInfo) new Gson().fromJson(courseVipSharePreference.getKEY_COURSE_VIP_DATE(), new TypeToken<CourseVipInfo>() { // from class: com.mi.health.course.api.CourseApiImpl$getAidongCourseVipInfo$$inlined$fromJson$1
        }.getType());
    }

    @Override // com.mi.health.course.export.CourseApi
    public void getAidongMemberUserInfo(@NotNull Function1<? super AidongVipUserInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getRequestV3().getAidongMemberUserInfoOnce(success, error);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getCourseInfo(@NotNull CourseItem courseItem, @NotNull Continuation<? super CourseInfoItem> continuation) {
        return getRequestV3().getCourseInfo(courseItem, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getCourseInfos(@NotNull ReqItemList reqItemList, @NotNull Continuation<? super CourseInfoList> continuation) {
        return getRequestV3().getCourseInfos(reqItemList, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    @NotNull
    public String getCourseLevelStr(int level) {
        int i;
        Application application = ApplicationExtKt.getApplication();
        if (level == 1) {
            i = czi.course_difficult_starte;
        } else if (level == 2) {
            i = czi.course_difficult_basic;
        } else if (level != 3) {
            i = level != 4 ? czi.course_difficult_challenge : czi.course_difficult_strengthen;
        } else {
            i = czi.course_difficult_advance;
        }
        String string = application.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getCourseList(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation) {
        return getRequestV3().getCourseList(str, iArr, str2, str3, i, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getCourseRecommend(@NotNull String str, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation) {
        Logger.d(TAG, "getCourseRecommend: scene = " + str + ", count = " + i);
        return getRequestV3().getCourseRecommend(str, i, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getCourseSeriesRecommend(@NotNull String str, @NotNull Continuation<? super CourseSeriesRecommend> continuation) {
        return getRequestV3().getCourseSeriesRecommend(str, continuation);
    }

    @NotNull
    public final CourseVipActivityRequest getCourseVipActivityRequest() {
        CourseVipActivityRequest courseVipActivityRequest = this.courseVipActivityRequest;
        if (courseVipActivityRequest != null) {
            return courseVipActivityRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("courseVipActivityRequest");
        return null;
    }

    @NotNull
    public final Gson getMGson() {
        Gson gson = this.mGson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mGson");
        return null;
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getMultiCourseInfo(@NotNull String str, @NotNull Continuation<? super CourseModel.CourseBasicInformationList> continuation) {
        return this.request.getMultiCourseInfo(str, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void getNewEquipmentBenefits(@NotNull Function1<? super CourseNewEquipmentBenefits, Unit> success, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getCourseVipActivityRequest().getNewEquipmentBenefits(success, error);
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getPracticedCourseList(int i, @Nullable String str, @Nullable String str2, int i2, @NotNull Continuation<? super CourseModel.PracticedCourseList> continuation) {
        return this.request.getPracticedCourseList(i, str, str2, i2, continuation);
    }

    @NotNull
    public final CourseRequestV3 getRequestV3() {
        CourseRequestV3 courseRequestV3 = this.requestV3;
        if (courseRequestV3 != null) {
            return courseRequestV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestV3");
        return null;
    }

    @NotNull
    public final CourseVipRequest getRequestVip() {
        CourseVipRequest courseVipRequest = this.requestVip;
        if (courseVipRequest != null) {
            return courseVipRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestVip");
        return null;
    }

    @Override // com.mi.health.course.export.CourseApi
    @Nullable
    public Object getTrainRecord(long j, long j2, @NotNull Continuation<? super CourseTrainRecord> continuation) {
        return this.request.getTrainRecord(j, j2, continuation);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goCourseCatalog(@Nullable String scene, @Nullable int[] type, @Nullable String tags, @Nullable String sportName, boolean needSideTab) {
        if (needSideTab) {
            CourseAllCatalogActivityKt.startCourseAllCatalog(scene, type, tags, sportName);
        } else {
            CourseCatalogActivityKt.startCourseCatalog(scene, type, tags, sportName);
        }
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goFeedPage(@NotNull String tag, int sportType, @NotNull String title) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseFeedActivity.class);
        intent.putExtra(CourseFeedActivityKt.KEY_FEED_TITLE, title);
        intent.putExtra(CourseFeedActivityKt.KEY_SPORT_TAG, tag);
        intent.putExtra("sport_type", sportType);
        intent.addFlags(268435456);
        app.startActivity(intent);
    }

    @Override // com.mi.health.course.export.CourseApi
    public <T extends BaseFragment> void goFloatWindow(@NotNull T fragment, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        BaseFragmentExKt.gotoPage(fragment, FloatWindowFragment.class, bundle, true);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goInfoPage(long courseId, int from) {
        CourseInfoActivityKt.startCourseInfo$default(courseId, null, from, false, 10, null);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goSeriesInfoPage(long seriesId) {
        CourseSeriseInfoActivityKt.startCourseSeriesInfo(seriesId, 1);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goToCourseInfoActivity(@NotNull Context context, long courseId, @Nullable TrainingCourseInfo trainingCourseInfo, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        CourseInfoActivityKt.startCourseInfo$default(courseId, trainingCourseInfo, from, false, 8, null);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void goToCourseInfoPage(@NotNull String jsonStr) {
        Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
        try {
            CourseInfoActivityKt.startCourseInfo$default(Long.parseLong(((UnderArmourCourseModel) getMGson().fromJson(jsonStr, UnderArmourCourseModel.class)).getCourseId()), null, 8, false, 10, null);
        } catch (Exception e) {
            Logger.i(TAG, "goToCourseInfoPage e=" + e);
        }
    }

    @Override // com.mi.health.course.export.CourseApi
    public void notifyCourseChanged(@NotNull String status, int type) {
        Intrinsics.checkNotNullParameter(status, "status");
        Iterator<T> it = this.mCourseChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(status, Integer.valueOf(type));
        }
    }

    @Override // com.mi.health.course.export.CourseApi
    public void refreshCourseVipData(@NotNull Function1<? super CourseVipInfo, Unit> success, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getRequestVip().getCourseVipInfo(success, error);
    }

    @Override // com.mi.health.course.export.CourseApi
    public void removeCourseChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mCourseChangeListeners.remove(listener);
    }

    public final void setCourseVipActivityRequest(@NotNull CourseVipActivityRequest courseVipActivityRequest) {
        Intrinsics.checkNotNullParameter(courseVipActivityRequest, "<set-?>");
        this.courseVipActivityRequest = courseVipActivityRequest;
    }

    public final void setMGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.mGson = gson;
    }

    public final void setRequestV3(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.requestV3 = courseRequestV3;
    }

    public final void setRequestVip(@NotNull CourseVipRequest courseVipRequest) {
        Intrinsics.checkNotNullParameter(courseVipRequest, "<set-?>");
        this.requestVip = courseVipRequest;
    }

    @Override // com.mi.health.course.export.CourseApi
    public void startCourseMe(@Nullable String tag) {
        CourseMeActivityKt.startMyCourse(tag);
    }
}
