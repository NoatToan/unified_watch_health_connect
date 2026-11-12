package com.xiaomi.fitness.trail;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.SportDetailCommonFragment;
import com.xiaomi.fitness.detail.SportDetailGpsFragment;
import com.xiaomi.fitness.detail.SportDetailTriathlonFragment;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.detail.model.SportsReportOperationalInfo;
import com.xiaomi.fitness.detail.util.HrmUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.net.SportRecordRouteRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.track.ExportTrackActivity;
import com.xiaomi.fitness.trail.SportRecordApiImpl;
import com.xiaomi.fitness.trail.diving.DivingRepository;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.util.TestUtil;
import defpackage.byi;
import defpackage.dih;
import defpackage.j1j;
import defpackage.lp5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J8\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J(\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J(\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J \u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J*\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110+0*2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130$H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020 0.2\u0006\u0010/\u001a\u000200H\u0016J\u001e\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b05H\u0016J\u0010\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u001bH\u0016J\u0018\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/trail/SportRecordApiImpl;", "Lcom/xiaomi/fitness/trail/export/SportRecordApi;", "<init>", "()V", "divingRepository", "Lcom/xiaomi/fitness/trail/diving/DivingRepository;", "getDivingRepository", "()Lcom/xiaomi/fitness/trail/diving/DivingRepository;", "setDivingRepository", "(Lcom/xiaomi/fitness/trail/diving/DivingRepository;)V", "goSportRecordList", "", "context", "Landroid/content/Context;", "activityOptions", "Landroid/app/ActivityOptions;", "category", "", "tabPosition", "", "(Landroid/content/Context;Landroid/app/ActivityOptions;Ljava/lang/String;Ljava/lang/Integer;)V", "getIntentToSportRecordListPage", "Landroid/content/Intent;", "goSportDetail", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gotoPage", "targetClazz", "Ljava/lang/Class;", "isParcelable", "", "deviceIsConnect", "flag", "getTestData", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "goEcoSportBicycleDetail", "it", "goExportTrackActivity", "getDivePointDetailMapLiveDataByIds", "Landroidx/lifecycle/LiveData;", "", "idList", "downloadResourcesAndGetIfDoneLiveData", "Landroidx/lifecycle/MutableLiveData;", "fragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "checkExternalStoragePermissionIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "callback", "Lkotlin/Function0;", "getSportReportCourseName", "report", "getHrSectionStr", "section", "sectionType", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordApiImpl implements SportRecordApi {
    public DivingRepository divingRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.SportRecordApiImpl$getDivePointDetailMapLiveDataByIds$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.SportRecordApiImpl$getDivePointDetailMapLiveDataByIds$1", f = "SportRecordApiImpl.kt", i = {}, l = {200, 200}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Map<Integer, ? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Integer> $idList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Integer> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$idList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SportRecordApiImpl.this.new AnonymousClass1(this.$idList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<Integer, String>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            DivingRepository divingRepository = SportRecordApiImpl.this.getDivingRepository();
            List<Integer> list = this.$idList;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = divingRepository.getDivingPointDetailMap(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<Integer, ? extends String>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<Integer, String>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.CharSequence, java.lang.Object, java.lang.String] */
    public static final Unit getSportReportCourseName$lambda$7$lambda$5(Ref.ObjectRef courseName, SportsReportOperationalInfo course) {
        Intrinsics.checkNotNullParameter(courseName, "$courseName");
        Intrinsics.checkNotNullParameter(course, "course");
        SportsReportOperationalCourseData courseData = course.getCourseData();
        Logger.i(SportRecordDetailViewModel.TAG, "getReportInfoFromNet suc");
        SportsReportOperationalCourseTrainSummary trainSummary = courseData.getTrainSummary();
        Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
        ?? name = courseData.getCourseInfo().getName();
        if (!TextUtils.isEmpty(name)) {
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                courseName.element = name;
            } else {
                String quantityString = AppUtil.getApp().getResources().getQuantityString(byi.course_record_times, numValueOf.intValue(), numValueOf);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ResourceExtKt.getString(j1j.course_record_summary, name, quantityString);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportReportCourseName$lambda$7$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(SportRecordDetailViewModel.TAG, "getReportInfoFromNet fail" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goSportDetail$lambda$1(SportRecordApiImpl this$0, Context context, Bundle bundle, ActivityOptions activityOptions, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (z) {
            this$0.gotoPage(context, SportDetailTriathlonFragment.class, bundle, true, activityOptions);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goSportDetail$lambda$2(SportRecordApiImpl this$0, Context context, Bundle bundle, ActivityOptions activityOptions, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (z) {
            this$0.gotoPage(context, SportDetailGpsFragment.class, bundle, true, activityOptions);
        }
        return Unit.INSTANCE;
    }

    private final void gotoPage(Context context, Class<?> targetClazz, Bundle bundle, boolean isParcelable, ActivityOptions activityOptions) {
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(context, fragmentParamsB, isParcelable, activityOptions);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void checkExternalStoragePermissionIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkExternalStoragePermissionIfNeed(fragmentActivity, callback);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public MutableLiveData<Boolean> downloadResourcesAndGetIfDoneLiveData(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return downloadResourcesAndGetIfDoneLiveData(fragment);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public LiveData<Map<Integer, String>> getDivePointDetailMapLiveDataByIds(@NotNull List<Integer> idList) {
        Intrinsics.checkNotNullParameter(idList, "idList");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(idList, null), 3, (Object) null);
    }

    @NotNull
    public final DivingRepository getDivingRepository() {
        DivingRepository divingRepository = this.divingRepository;
        if (divingRepository != null) {
            return divingRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("divingRepository");
        return null;
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public String getHrSectionStr(int section, int sectionType) {
        return HrmUtil.INSTANCE.getModelStrByIndex(ApplicationExtKt.getApplication(), section, Integer.valueOf(sectionType));
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public Intent getIntentToSportRecordListPage() {
        return new Intent(ApplicationExtKt.getApplication(), (Class<?>) RecordMainActivity.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public String getSportReportCourseName(@NotNull SportBasicReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(report.getSportType());
        if (report.getSid() != null && sportReportKey != null && report.getCloudCourseId() != null) {
            Long cloudCourseId = report.getCloudCourseId();
            Intrinsics.checkNotNull(cloudCourseId);
            if (cloudCourseId.longValue() > 0) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = lp5.c(report.getSportType());
                SportRecordRouteRequest companion = SportRecordRouteRequest.INSTANCE.getInstance();
                String sid = report.getSid();
                Intrinsics.checkNotNull(sid);
                String key = sportReportKey.getKey();
                long startTime = report.getStartTime();
                long endTime = report.getEndTime();
                Long cloudCourseId2 = report.getCloudCourseId();
                companion.getSportsReportOperationalData(sid, key, startTime, endTime, cloudCourseId2 != null ? cloudCourseId2.toString() : null, report.getCloudCourseSource(), new Function1() { // from class: zsn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportRecordApiImpl.getSportReportCourseName$lambda$7$lambda$5(objectRef, (SportsReportOperationalInfo) obj);
                    }
                }, new Function1() { // from class: atn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportRecordApiImpl.getSportReportCourseName$lambda$7$lambda$6((ApiException) obj);
                    }
                });
                T element = objectRef.element;
                Intrinsics.checkNotNullExpressionValue(element, "element");
                return (String) element;
            }
        }
        String strC = lp5.c(report.getSportType());
        Intrinsics.checkNotNullExpressionValue(strC, "getSportTypeName(...)");
        return strC;
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    @NotNull
    public List<Location> getTestData() {
        List<Location> gpsValues = TestUtil.INSTANCE.getGpsValues();
        return gpsValues == null ? new ArrayList() : gpsValues;
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goEcoSportBicycleDetail(@NotNull Context context, @NotNull Bundle bundle, @NotNull SportBasicReport it) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        SportRecordApi.DefaultImpls.goSportDetail$default(this, context, bundle, it, false, 8, null);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goExportTrackActivity(@NotNull Context context, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent(context, (Class<?>) ExportTrackActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goSportDetail(@NotNull final Context context, @NotNull final Bundle bundle, @Nullable final ActivityOptions activityOptions, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getProtoType() == 17) {
            MapDynamicUtils.INSTANCE.checkSoLoaded(context instanceof FragmentActivity ? (FragmentActivity) context : null, new Function2() { // from class: btn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportRecordApiImpl.goSportDetail$lambda$1(this.f4597a, context, bundle, activityOptions, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        } else if (FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportReport)) {
            MapDynamicUtils.INSTANCE.checkSoLoaded(context instanceof FragmentActivity ? (FragmentActivity) context : null, new Function2() { // from class: ctn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportRecordApiImpl.goSportDetail$lambda$2(this.f14707a, context, bundle, activityOptions, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        } else {
            gotoPage(context, SportDetailCommonFragment.class, bundle, true, activityOptions);
        }
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goSportRecordList(@NotNull Context context, @Nullable ActivityOptions activityOptions, @Nullable String category, @Nullable Integer tabPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) RecordMainActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(SportRecordApiKt.KEY_SPORT_CATEGORY, category);
        intent.putExtra(RecordMainActivityKt.KEY_TAB_POSITION, tabPosition);
        if (activityOptions != null) {
            context.startActivity(intent, activityOptions.toBundle());
        } else {
            context.startActivity(intent);
        }
    }

    public final void setDivingRepository(@NotNull DivingRepository divingRepository) {
        Intrinsics.checkNotNullParameter(divingRepository, "<set-?>");
        this.divingRepository = divingRepository;
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goSportDetail(@NotNull Context context, @NotNull Bundle bundle, @NotNull SportBasicReport sportReport, boolean deviceIsConnect) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        bundle.putString("sport_source", "Auto_workout");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportReport) ? SportDetailGpsFragment.class : SportDetailCommonFragment.class).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(context, fragmentParamsB, false);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goSportDetail(@NotNull Context context, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", sportReport);
        bundle.putInt("sport_type", lp5.a(sportReport));
        FragmentParams fragmentParamsB = new FragmentParams.b().e(FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportReport) ? SportDetailGpsFragment.class : SportDetailCommonFragment.class).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(context, fragmentParamsB, false);
    }

    @Override // com.xiaomi.fitness.trail.export.SportRecordApi
    public void goSportDetail(@NotNull Context context, int flag, @NotNull Bundle bundle, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportReport) ? SportDetailGpsFragment.class : SportDetailCommonFragment.class).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().d(context, flag, fragmentParamsB, false);
    }
}
