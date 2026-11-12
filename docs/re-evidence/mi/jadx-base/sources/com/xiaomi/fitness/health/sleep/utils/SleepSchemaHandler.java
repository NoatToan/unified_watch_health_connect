package com.xiaomi.fitness.health.sleep.utils;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPage", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PAGE_TYPE = "sleep";

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String PARAM_TARGET = "target";

    @NotNull
    public static final String TAG = "SleepSchemaHandler";

    @NotNull
    public static final String TARGET_SLEEP_ANIMAL_DETECTING = "animalDetecting";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.utils.SleepSchemaHandler$jumpPage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.utils.SleepSchemaHandler$jumpPage$1", f = "SleepSchemaHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiveData<SleepAnimalReport> $animalReportLiveData;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.utils.SleepSchemaHandler$jumpPage$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.utils.SleepSchemaHandler$jumpPage$1$1", f = "SleepSchemaHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SleepAnimalReport $sleepAnimalReport;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06191(SleepAnimalReport sleepAnimalReport, Continuation<? super C06191> continuation) {
                super(2, continuation);
                this.$sleepAnimalReport = sleepAnimalReport;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06191(this.$sleepAnimalReport, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SleepAnimalExtKt.gotoSleepAnimalDetectingActivity(AppUtil.getApp(), this.$sleepAnimalReport);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<SleepAnimalReport> liveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animalReportLiveData = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$animalReportLiveData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepAnimalReport sleepAnimalReport = (SleepAnimalReport) LiveDataHelper.INSTANCE.takeData(this.$animalReportLiveData, null);
            Logger.i(SleepSchemaHandler.TAG, "getLatestSleepAnimal result " + sleepAnimalReport);
            AnyExtKt.main$default(null, new C06191(sleepAnimalReport, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void jumpPage(Uri uri) {
        String queryParameter = uri.getQueryParameter("target");
        if (queryParameter != null && queryParameter.hashCode() == -1244768317 && queryParameter.equals(TARGET_SLEEP_ANIMAL_DETECTING)) {
            AnyExtKt.io$default(null, new AnonymousClass1(((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getLatestSleepAnimal(), null), 1, null);
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
                jumpPage(uri);
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
        List<String> listSingletonList = Collections.singletonList("sleep");
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
