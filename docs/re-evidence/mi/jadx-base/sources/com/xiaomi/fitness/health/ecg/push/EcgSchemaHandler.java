package com.xiaomi.fitness.health.ecg.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.IEcgRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivityKt;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/push/EcgSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPage", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PAGE_TYPE_ECG = "ecg";

    @NotNull
    public static final String PARAM_MEASURE_TIME = "measureTime";

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String PARAM_SID = "sid";

    @NotNull
    public static final String PARAM_TARGET = "target";

    @NotNull
    public static final String TAG = "EcgPushSchemaHandler";

    @NotNull
    public static final String TARGET_ECG_ANALYZE_FINISH = "analyzeFinish";

    @NotNull
    public static final String TARGET_ECG_HLW_MONTH_REPORT_LIST = "hlwMonthReportList";

    @NotNull
    public static final String TARGET_ECG_HLW_SERVICE_PURCHASE = "hlwServicePurchase";

    @NotNull
    public static final String TARGET_ECG_UNINTERPRETED_LIST = "unInterpretedEcgList";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1", f = "EcgSchemaHandler.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $measureTime;
        final /* synthetic */ String $sid;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1$1", f = "EcgSchemaHandler.kt", i = {0}, l = {84, 85}, m = "invokeSuspend", n = {"ecgMedicalItemReport"}, s = {"L$0"})
        public static final class C05941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Long $measureTime;
            final /* synthetic */ String $sid;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler$jumpPage$1$1$1", f = "EcgSchemaHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C05951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ EcgMedicalItemReport $ecgMedicalItemReport;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05951(EcgMedicalItemReport ecgMedicalItemReport, Continuation<? super C05951> continuation) {
                    super(2, continuation);
                    this.$ecgMedicalItemReport = ecgMedicalItemReport;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05951(this.$ecgMedicalItemReport, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("ecg_report_detail"), this.$ecgMedicalItemReport, null, null, 12, null);
                    EcgTrackHelper.INSTANCE.trackViewReportDetailClick("ecg_view_report_push");
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C05951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05941(String str, Long l, Continuation<? super C05941> continuation) {
                super(2, continuation);
                this.$sid = str;
                this.$measureTime = l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05941(this.$sid, this.$measureTime, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                EcgMedicalItemReport theEcgReport;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        theEcgReport = (EcgMedicalItemReport) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "ecg_interpreted_notification", null, 4, null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                IEcgRepository iEcgRepository = (IEcgRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IEcgRepository.class);
                theEcgReport = iEcgRepository.getTheEcgReport(this.$sid, this.$measureTime.longValue());
                if (theEcgReport == null) {
                    Logger.w(EcgSchemaHandler.TAG, "not find report in database");
                } else {
                    theEcgReport.setInterpretStatus(3);
                    this.L$0 = theEcgReport;
                    this.label = 1;
                    if (iEcgRepository.addRecord(theEcgReport, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C05951 c05951 = new C05951(theEcgReport, null);
                this.L$0 = null;
                this.label = 2;
                if (BuildersKt.withContext(main, c05951, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "ecg_interpreted_notification", null, 4, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Long l, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$measureTime = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sid, this.$measureTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05941 c05941 = new C05941(this.$sid, this.$measureTime, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05941, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void jumpPage(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("target");
        if (queryParameter != null) {
            switch (queryParameter.hashCode()) {
                case 327548447:
                    if (queryParameter.equals(TARGET_ECG_HLW_MONTH_REPORT_LIST)) {
                        EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("month_report_list"), null, null, null, 14, null);
                        break;
                    }
                    break;
                case 428453119:
                    if (queryParameter.equals(TARGET_ECG_ANALYZE_FINISH)) {
                        String queryParameter2 = uri.getQueryParameter("sid");
                        String queryParameter3 = uri.getQueryParameter(PARAM_MEASURE_TIME);
                        Long lValueOf = queryParameter3 != null ? Long.valueOf(Long.parseLong(queryParameter3)) : null;
                        Logger.w(TAG, "analyzeFinish param " + queryParameter2 + ";" + lValueOf);
                        if (queryParameter2 == null || StringsKt__StringsKt.isBlank(queryParameter2) || lValueOf == null) {
                            Logger.w(TAG, "param exception sid or time exception...");
                        } else {
                            AnyExtKt.globalLaunch$default(null, null, new AnonymousClass1(queryParameter2, lValueOf, null), 3, null);
                        }
                        break;
                    }
                    break;
                case 865208931:
                    if (queryParameter.equals(TARGET_ECG_HLW_SERVICE_PURCHASE)) {
                        EcgWebViewActivityKt.startEcgWebActivity$default(EcgConstantsKt.getHlwUrl("service_purchase"), null, null, null, 14, null);
                        break;
                    }
                    break;
                case 1793328692:
                    if (queryParameter.equals(TARGET_ECG_UNINTERPRETED_LIST)) {
                        FragmentParams fragmentParamsB = new FragmentParams.b().e(SelectEcgForAnalyzingFragment.class).a(true).b();
                        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
                        Intent intent = new Intent();
                        intent.setClass(context, CommonBaseActivity.class);
                        intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "doProcess uri is " + uri);
        String queryParameter = uri.getQueryParameter("pageType");
        if (CollectionsKt___CollectionsKt.contains(parameterList(), queryParameter)) {
            try {
                jumpPage(context, uri);
                return;
            } catch (Exception e) {
                Logger.w(TAG, "doProcess exception , exception is", e);
                return;
            }
        }
        Logger.i(TAG, "pageType " + queryParameter + " is invalid");
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        List<String> listSingletonList = Collections.singletonList("ecg");
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
