package com.xiaomi.fitness.step;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.migration.exercise.transformation.StepItemInserter;
import com.xiaomi.fitness.steps.PhoneStepsProvider;
import com.xiaomi.fitness.steps.StepItem;
import defpackage.b2c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/step/MiuiStepSyncer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "TAG", "", "MSG_SYNC", "", "curTZOffsetInSecond", "getCurTZOffsetInSecond", "()I", "curTZOffsetInSecond$delegate", "Lkotlin/Lazy;", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "requestCallback", "Lcom/xiaomi/fitness/step/MiuiStepCallback;", "syncWorker", "Landroid/os/Handler;", "setOnMiuiStepListener", "", "callback", "doRequestSteps", "tag", "doRequestStepsInternal", "requestPhoneSid", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiStepSyncer {
    private final int MSG_SYNC;

    @NotNull
    private final String TAG;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: curTZOffsetInSecond$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy curTZOffsetInSecond;

    @Nullable
    private MiuiStepCallback requestCallback;

    @NotNull
    private final Handler syncWorker;

    /* JADX INFO: renamed from: com.xiaomi.fitness.step.MiuiStepSyncer$doRequestStepsInternal$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.step.MiuiStepSyncer$doRequestStepsInternal$2", f = "MiuiStepSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "miui_function_step", null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MiuiStepSyncer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.TAG = "MiuiStepSyncer";
        this.MSG_SYNC = 1;
        this.curTZOffsetInSecond = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o6g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
            }
        });
        this.syncWorker = SyncWorker.INSTANCE.obtainWorkerHandler(new Handler.Callback() { // from class: com.xiaomi.fitness.step.MiuiStepSyncer$syncWorker$1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what != this.this$0.MSG_SYNC) {
                    return false;
                }
                String string = msg.obj.toString();
                FitnessLogUtils.i(this.this$0.TAG, "doRequestSteps reason = " + string);
                this.this$0.doRequestStepsInternal();
                return true;
            }
        });
        StepProviderPreference stepProviderPreference = StepProviderPreference.INSTANCE;
        if (stepProviderPreference.getStepFirstInitTimeMillis() <= 0) {
            FitnessLogUtils.i("MiuiStepSyncer", "MiuiStepSyncer step first init");
            stepProviderPreference.updateStepFirstInitTimeMillis(System.currentTimeMillis());
        }
        FitnessLogUtils.i("MiuiStepSyncer", "MiuiStepSyncer inited");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRequestStepsInternal() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt == null || !RegionExtKt.isRegionSelected(regionExtKt)) {
            FitnessLogUtils.i(this.TAG, "doRequestStepsInternal: receive step event, but has no region");
            MiuiStepCallback miuiStepCallback = this.requestCallback;
            if (miuiStepCallback != null) {
                miuiStepCallback.onStepRequestDone(false);
                return;
            }
            return;
        }
        String strRequestPhoneSid = requestPhoneSid();
        long jCurrentTimeMillis = System.currentTimeMillis();
        FitnessLogUtils.i(this.TAG, "doRequestStepsInternal: sid = " + strRequestPhoneSid);
        long j = (long) 1000;
        DailyRecordItem recentOneData = getDbGetter().getRecentOneData("steps", jCurrentTimeMillis / j, strRequestPhoneSid);
        long timestamp = recentOneData != null ? recentOneData.getTimestamp() : 0L;
        long jMax = timestamp == 0 ? 0L : (timestamp + ((long) 60)) * j;
        if (!TimeUtils.INSTANCE.isSameDay(jCurrentTimeMillis, jMax)) {
            long stepFirstInitTimeMillis = StepProviderPreference.INSTANCE.getStepFirstInitTimeMillis();
            jMax = Math.max(stepFirstInitTimeMillis, jMax);
            FitnessLogUtils.i(this.TAG, "firstInitTime " + stepFirstInitTimeMillis + "; begin " + jMax);
        }
        long stepLastEndTimeMillis = StepProviderPreference.INSTANCE.getStepLastEndTimeMillis();
        if (stepLastEndTimeMillis != 0 && stepLastEndTimeMillis <= jCurrentTimeMillis) {
            jMax = stepLastEndTimeMillis;
        }
        FitnessLogUtils.i(this.TAG, "doRequestSteps: beginTime = " + jMax + ", endTime = " + jCurrentTimeMillis + ";recentItem = " + recentOneData + " ;spfLastEndTime = " + stepLastEndTimeMillis);
        List<StepItem> steps = PhoneStepsProvider.INSTANCE.getSteps(jMax, jCurrentTimeMillis, 0);
        ArrayList arrayList = new ArrayList();
        List<StepItem> list = steps;
        if (list != null && !list.isEmpty()) {
            for (StepItem stepItem : steps) {
                arrayList.add(new b2c(stepItem.getBeginTime(), stepItem.getEndTime(), stepItem.getSteps()));
            }
        }
        FitnessLogUtils.i(this.TAG, "doRequestStepsInternal: phone stepItemList.size=" + steps.size());
        Long lInsertStepItemToDB = StepItemInserter.INSTANCE.insertStepItemToDB(jMax, jCurrentTimeMillis, arrayList);
        FitnessLogUtils.i(this.TAG, "receive MIUI steps num: " + arrayList.size() + ", endItemTime = " + lInsertStepItemToDB);
        if (lInsertStepItemToDB != null) {
            StepProviderPreference.INSTANCE.updateStepLastEndTimeMillis(lInsertStepItemToDB.longValue());
        }
        if (!steps.isEmpty()) {
            FitnessLogUtils.e(this.TAG, "doRequestStepsInternal: syncWithServer");
            AnyExtKt.io$default(null, new AnonymousClass2(null), 1, null);
        }
        MiuiStepCallback miuiStepCallback2 = this.requestCallback;
        if (miuiStepCallback2 != null) {
            miuiStepCallback2.onStepRequestDone(true ^ arrayList.isEmpty());
        }
    }

    private final int getCurTZOffsetInSecond() {
        return ((Number) this.curTZOffsetInSecond.getValue()).intValue();
    }

    private final FitnessDataGetter getDbGetter() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    private final String requestPhoneSid() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
    }

    public final void doRequestSteps(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.syncWorker.hasMessages(this.MSG_SYNC)) {
            return;
        }
        this.syncWorker.obtainMessage(this.MSG_SYNC, tag).sendToTarget();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void setOnMiuiStepListener(@Nullable MiuiStepCallback callback) {
        this.requestCallback = callback;
    }
}
