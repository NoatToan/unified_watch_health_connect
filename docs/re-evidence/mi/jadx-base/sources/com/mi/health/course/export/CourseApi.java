package com.mi.health.course.export;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ4\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0014JJ\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u001aJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000bH&J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0005H&J.\u0010$\u001a\u00020\u001c2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001c0&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0)H&J0\u0010*\u001a\u00020\u001c2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u001c0&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0)H&J<\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u000b2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001c0&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001c0&H&J\n\u00100\u001a\u0004\u0018\u00010'H&J'\u00101\u001a\u00020\u001c\"\b\b\u0000\u00102*\u0002032\u0006\u00104\u001a\u0002H22\u0006\u00105\u001a\u000206H&¢\u0006\u0002\u00107J\"\u00108\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H¦@¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJB\u0010=\u001a\u00020\u001c2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010?\u001a\u00020@H&J\u0014\u0010A\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000bH&J0\u0010B\u001a\u00020\u001c2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u001c0&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001c0&H&J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH¦@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH¦@¢\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u000bH&J.\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010!\u001a\u00020\u0010H&J@\u0010U\u001a\u00020\u001c26\u0010V\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u001c0WH&J@\u0010[\u001a\u00020\u001c26\u0010V\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u001c0WH&J\u0018\u0010\\\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0010H&J\u0010\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u0010H&¨\u0006_"}, d2 = {"Lcom/mi/health/course/export/CourseApi;", "", "getTrainRecord", "Lcom/mi/health/course/export/data/CourseTrainRecord;", "courseId", "", "time", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMultiCourseInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseBasicInformationList;", "idsStr", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPracticedCourseList", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "courseType", "", "tags", "nextKey", "count", "(ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseList", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "scene", "type", "", "(Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goFeedPage", "", "tag", DailyRecordKey.sportType, "title", "goInfoPage", "from", "goSeriesInfoPage", "seriesId", "refreshCourseVipData", "success", "Lkotlin/Function1;", "Lcom/mi/health/course/export/data/CourseVipInfo;", "error", "Lkotlin/Function0;", "getNewEquipmentBenefits", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "exchangeCourseBenefits", "code", "Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "Lcom/xiaomi/fitness/net/response/ApiException;", "getAidongCourseVipInfo", "goFloatWindow", "T", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragment", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Landroid/os/Bundle;)V", "getCourseRecommend", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseSeriesRecommend", "Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "params", "goCourseCatalog", "sportName", "needSideTab", "", "startCourseMe", "getAidongMemberUserInfo", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "getCourseInfos", "Lcom/mi/health/course/export/data/CourseInfoList;", "reqItemList", "Lcom/mi/health/course/export/data/ReqItemList;", "(Lcom/mi/health/course/export/data/ReqItemList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "(Lcom/mi/health/course/export/data/CourseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goToCourseInfoPage", "jsonStr", "goToCourseInfoActivity", "context", "Landroid/content/Context;", "trainingCourseInfo", "Lcom/mi/health/course/export/data/TrainingCourseInfo;", "addCourseChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "status", "removeCourseChangeListener", "notifyCourseChanged", "getCourseLevelStr", "level", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void exchangeCourseBenefits$default(CourseApi courseApi, String str, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeCourseBenefits");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: un4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CourseApi.DefaultImpls.exchangeCourseBenefits$lambda$4((CourseExchangeBenefits) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function2 = new Function1() { // from class: vn4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CourseApi.DefaultImpls.exchangeCourseBenefits$lambda$5((ApiException) obj2);
                    }
                };
            }
            courseApi.exchangeCourseBenefits(str, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit exchangeCourseBenefits$lambda$4(CourseExchangeBenefits it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit exchangeCourseBenefits$lambda$5(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object getCourseList$default(CourseApi courseApi, String str, int[] iArr, String str2, String str3, int i, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return courseApi.getCourseList((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : iArr, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 20 : i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCourseList");
        }

        public static /* synthetic */ Object getCourseRecommend$default(CourseApi courseApi, String str, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCourseRecommend");
            }
            if ((i2 & 2) != 0) {
                i = 20;
            }
            return courseApi.getCourseRecommend(str, i, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getNewEquipmentBenefits$default(CourseApi courseApi, Function1 function1, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewEquipmentBenefits");
            }
            if ((i & 1) != 0) {
                function1 = new Function1() { // from class: sn4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CourseApi.DefaultImpls.getNewEquipmentBenefits$lambda$2((CourseNewEquipmentBenefits) obj2);
                    }
                };
            }
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: tn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            courseApi.getNewEquipmentBenefits(function1, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit getNewEquipmentBenefits$lambda$2(CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void goCourseCatalog$default(CourseApi courseApi, String str, int[] iArr, String str2, String str3, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goCourseCatalog");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                iArr = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            courseApi.goCourseCatalog(str, iArr, str2, str3, z);
        }

        public static /* synthetic */ void goToCourseInfoActivity$default(CourseApi courseApi, Context context, long j, TrainingCourseInfo trainingCourseInfo, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToCourseInfoActivity");
            }
            if ((i2 & 4) != 0) {
                trainingCourseInfo = null;
            }
            TrainingCourseInfo trainingCourseInfo2 = trainingCourseInfo;
            if ((i2 & 8) != 0) {
                i = 0;
            }
            courseApi.goToCourseInfoActivity(context, j, trainingCourseInfo2, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshCourseVipData$default(CourseApi courseApi, Function1 function1, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshCourseVipData");
            }
            if ((i & 1) != 0) {
                function1 = new Function1() { // from class: wn4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CourseApi.DefaultImpls.refreshCourseVipData$lambda$0((CourseVipInfo) obj2);
                    }
                };
            }
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: xn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            courseApi.refreshCourseVipData(function1, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit refreshCourseVipData$lambda$0(CourseVipInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void startCourseMe$default(CourseApi courseApi, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCourseMe");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            courseApi.startCourseMe(str);
        }
    }

    void addCourseChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener);

    void exchangeCourseBenefits(@NotNull String code, @NotNull Function1<? super CourseExchangeBenefits, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    @Nullable
    CourseVipInfo getAidongCourseVipInfo();

    void getAidongMemberUserInfo(@NotNull Function1<? super AidongVipUserInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    @Nullable
    Object getCourseInfo(@NotNull CourseItem courseItem, @NotNull Continuation<? super CourseInfoItem> continuation);

    @Nullable
    Object getCourseInfos(@NotNull ReqItemList reqItemList, @NotNull Continuation<? super CourseInfoList> continuation);

    @NotNull
    String getCourseLevelStr(int level);

    @Nullable
    Object getCourseList(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation);

    @Nullable
    Object getCourseRecommend(@NotNull String str, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation);

    @Nullable
    Object getCourseSeriesRecommend(@NotNull String str, @NotNull Continuation<? super CourseSeriesRecommend> continuation);

    @Nullable
    Object getMultiCourseInfo(@NotNull String str, @NotNull Continuation<? super CourseModel.CourseBasicInformationList> continuation);

    void getNewEquipmentBenefits(@NotNull Function1<? super CourseNewEquipmentBenefits, Unit> success, @NotNull Function0<Unit> error);

    @Nullable
    Object getPracticedCourseList(int i, @Nullable String str, @Nullable String str2, int i2, @NotNull Continuation<? super CourseModel.PracticedCourseList> continuation);

    @Nullable
    Object getTrainRecord(long j, long j2, @NotNull Continuation<? super CourseTrainRecord> continuation);

    void goCourseCatalog(@Nullable String scene, @Nullable int[] type, @Nullable String tags, @Nullable String sportName, boolean needSideTab);

    void goFeedPage(@NotNull String tag, int sportType, @NotNull String title);

    <T extends BaseFragment> void goFloatWindow(@NotNull T fragment, @NotNull Bundle bundle);

    void goInfoPage(long courseId, int from);

    void goSeriesInfoPage(long seriesId);

    void goToCourseInfoActivity(@NotNull Context context, long courseId, @Nullable TrainingCourseInfo trainingCourseInfo, int from);

    void goToCourseInfoPage(@NotNull String jsonStr);

    void notifyCourseChanged(@NotNull String status, int type);

    void refreshCourseVipData(@NotNull Function1<? super CourseVipInfo, Unit> success, @NotNull Function0<Unit> error);

    void removeCourseChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener);

    void startCourseMe(@Nullable String tag);
}
