package com.xiaomi.fit.fitness.device.mi;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
import com.xiaomi.fit.fitness.device.VitaliyDataSender;
import com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor;
import com.xiaomi.fit.fitness.device.mi.parse.utils.SleepSegmentUtils;
import com.xiaomi.fit.fitness.device.mi.send.FitnessWearPbImpl;
import com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.iw9;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 <2\u00020\u0001:\u0002<=B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b:\u0010;J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ(\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\nJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\nJ\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "Lcom/xiaomi/fit/fitness/device/FitnessDataSyncBaseImpl;", "", "sid", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "", "data", "", "parseTheFitnessData", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "did", "parseBinaryData", "", "resultCode", "onParseSuccess", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onParseError", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAsFile", "", "success", "handleSpecialSyncResult$fitness_sync_release", "(Ljava/lang/String;Z)V", "handleSpecialSyncResult", "Liw9;", "callback", "isBgAutoSync", "startSyncWithDevice$fitness_sync_release", "(Ljava/lang/String;Liw9;Ljava/lang/Boolean;)V", "startSyncWithDevice", "dataIds", "syncWithDevice", "(Ljava/lang/String;[BLiw9;)V", "syncTheData", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B)V", "confirmFitnessId$fitness_sync_release", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;)V", "confirmFitnessId", "syncLocalData$fitness_sync_release", "(Ljava/lang/String;)V", "syncLocalData", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "pbImpl", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender;", "wearSender$delegate", "Lkotlin/Lazy;", "getWearSender", "()Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender;", "wearSender", "Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "dataProcessor$delegate", "getDataProcessor", "()Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "dataProcessor", "hasNewSleep", "Z", "<init>", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;)V", "Companion", "RequestDataCallback", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFitnessDeviceSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,225:1\n29#2:226\n*S KotlinDebug\n*F\n+ 1 FitnessDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager\n*L\n162#1:226\n*E\n"})
public final class FitnessDeviceSyncManager extends FitnessDataSyncBaseImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<FitnessDeviceSyncManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDeviceSyncManager.instance_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: dataProcessor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataProcessor;
    private boolean hasNewSleep;

    @NotNull
    private final FitnessDeviceSyncPbApi pbImpl;

    /* JADX INFO: renamed from: wearSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wearSender;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "instance$delegate", "Lkotlin/Lazy;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDeviceSyncManager getInstance() {
            return (FitnessDeviceSyncManager) FitnessDeviceSyncManager.instance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager$RequestDataCallback;", "Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$SentCallback;", "", "onRequestSentSuccess", "()V", "onNoDataToSync", "Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$ErrorCode;", "errorCode", "onError", "(Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$ErrorCode;)V", "", "sid", "Ljava/lang/String;", "Liw9;", "callBack", "Liw9;", "<init>", "(Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;Ljava/lang/String;Liw9;)V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
    public final class RequestDataCallback implements FitnessWearSender.SentCallback {

        @Nullable
        private final iw9 callBack;

        @NotNull
        private final String sid;
        final /* synthetic */ FitnessDeviceSyncManager this$0;

        public RequestDataCallback(@NotNull FitnessDeviceSyncManager fitnessDeviceSyncManager, @Nullable String sid, iw9 iw9Var) {
            Intrinsics.checkNotNullParameter(sid, "sid");
            this.this$0 = fitnessDeviceSyncManager;
            this.sid = sid;
            this.callBack = iw9Var;
        }

        @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
        public void onError(@NotNull FitnessWearSender.ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            FitnessLogUtils.i(this.this$0.getTAG(), "onError " + errorCode);
            this.this$0.addSyncResultListener(this.sid, this.callBack);
            if (errorCode == FitnessWearSender.ErrorCode.ERROR_GET_TODAY_IDS || errorCode == FitnessWearSender.ErrorCode.ERROR_REQUEST_DATA_IDS) {
                FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this.this$0, this.sid, Boolean.FALSE, Boolean.TRUE, false, 8, null);
            } else {
                FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this.this$0, this.sid, null, null, false, 14, null);
            }
        }

        @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
        public void onNoDataToSync() {
            FitnessLogUtils.i(this.this$0.getTAG(), "onNoDataToSync");
            this.this$0.addSyncResultListener(this.sid, this.callBack);
            FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this.this$0, this.sid, null, null, false, 14, null);
        }

        @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
        public void onRequestSentSuccess() {
            FitnessLogUtils.i(this.this$0.getTAG(), "onRequestSentSuccess");
            this.this$0.addSyncResultListener(this.sid, this.callBack);
            FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this.this$0, this.sid, null, null, false, 14, null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$parseBinaryData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager", f = "FitnessDeviceSyncManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {154, 169, 171, 175}, m = "parseBinaryData", n = {"this", "did", "dataId", "this", "did", "dataId", "this", "did", "dataId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDeviceSyncManager.this.parseBinaryData(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$parseTheFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager", f = "FitnessDeviceSyncManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {135, 138, 140, 144}, m = "parseTheFitnessData", n = {"this", "sid", "dataId", "this", "sid", "dataId", "data", "this", "sid", "dataId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    public static final class C15751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C15751(Continuation<? super C15751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDeviceSyncManager.this.parseTheFitnessData(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$syncTheData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$syncTheData$1", f = "FitnessDeviceSyncManager.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ FitnessDataId $dataId;
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15761(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super C15761> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$dataId = fitnessDataId;
            this.$data = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessDeviceSyncManager.this.new C15761(this.$sid, this.$dataId, this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessDeviceSyncManager fitnessDeviceSyncManager = FitnessDeviceSyncManager.this;
                String str = this.$sid;
                FitnessDataId fitnessDataId = this.$dataId;
                byte[] bArr = this.$data;
                this.label = 1;
                if (fitnessDeviceSyncManager.parseTheFitnessData(str, fitnessDataId, bArr, this) == coroutine_suspended) {
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
            return ((C15761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FitnessDeviceSyncManager(@NotNull FitnessDeviceSyncPbApi pbImpl) {
        Intrinsics.checkNotNullParameter(pbImpl, "pbImpl");
        this.pbImpl = pbImpl;
        this.wearSender = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nq9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FitnessDeviceSyncManager.wearSender_delegate$lambda$0(this.f28252a);
            }
        });
        this.dataProcessor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pq9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FitnessDeviceSyncManager.dataProcessor_delegate$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmFitnessId$lambda$2(FitnessDeviceSyncManager this$0, FitnessDataId dataId, String sid, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataId, "$dataId");
        Intrinsics.checkNotNullParameter(sid, "$sid");
        ScopeExtKt.scope(Dispatchers.getIO(), new FitnessDeviceSyncManager$confirmFitnessId$2$1(this$0, z, dataId, sid, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataProcessor dataProcessor_delegate$lambda$1() {
        return FitnessDataProcessor.INSTANCE.getInstance();
    }

    private final FitnessDataProcessor getDataProcessor() {
        return (FitnessDataProcessor) this.dataProcessor.getValue();
    }

    private final FitnessWearSender getWearSender() {
        return (FitnessWearSender) this.wearSender.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDeviceSyncManager instance_delegate$lambda$3() {
        return new FitnessDeviceSyncManager(new FitnessWearPbImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onParseError(String str, FitnessDataId fitnessDataId, Continuation<? super Unit> continuation) {
        Object objOnSyncError = onSyncError(str, fitnessDataId, 2, continuation);
        return objOnSyncError == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncError : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onParseSuccess(String str, FitnessDataId fitnessDataId, int i, Continuation<? super Unit> continuation) {
        int dailyType = fitnessDataId.getDailyType();
        if (dailyType == 8) {
            this.hasNewSleep = true;
        } else if (dailyType == 11) {
            setManualForceCloudSync(true);
        }
        Object objOnSyncSuccess = onSyncSuccess(str, fitnessDataId, 2, i, continuation);
        return objOnSyncSuccess == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSyncSuccess : Unit.INSTANCE;
    }

    public static /* synthetic */ Object onParseSuccess$default(FitnessDeviceSyncManager fitnessDeviceSyncManager, String str, FitnessDataId fitnessDataId, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return fitnessDeviceSyncManager.onParseSuccess(str, fitnessDataId, i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    public final Object parseBinaryData(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        FitnessDeviceSyncManager fitnessDeviceSyncManager;
        String model;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object andRecord = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fitnessDataId = (FitnessDataId) anonymousClass1.L$2;
                    str = (String) anonymousClass1.L$1;
                    fitnessDeviceSyncManager = (FitnessDeviceSyncManager) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(andRecord);
                } else if (i2 == 2 || i2 == 3) {
                    ResultKt.throwOnFailure(andRecord);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(andRecord);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(andRecord);
            try {
                FitnessDataProcessor dataProcessor = getDataProcessor();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = fitnessDataId;
                anonymousClass1.label = 1;
                andRecord = dataProcessor.parseAndRecord(str, fitnessDataId, bArr, anonymousClass1);
                if (andRecord == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessDeviceSyncManager = this;
            } catch (Throwable th) {
                th = th;
                bArr = this;
                FitnessLogUtils.INSTANCE.w(bArr.getTAG(), "processBinaryData: onError(" + fitnessDataId + ")", th);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 4;
                if (bArr.onParseError(str, fitnessDataId, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DataResult dataResult = (DataResult) andRecord;
            FitnessLogUtils.i(fitnessDeviceSyncManager.getTAG(), "processBinaryData: (" + dataResult + ")-(" + fitnessDataId + ")");
            int i3 = -1;
            if (dataResult.isSuccess() || dataResult.getCode() == -1 || dataResult.getCode() == -2) {
                int code = dataResult.getCode();
                if (dataResult.getCode() != -2) {
                    i3 = code;
                } else {
                    DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(str);
                    if (deviceInfoInAll == null || (model = deviceInfoInAll.getModel()) == null) {
                        model = "";
                    }
                    String updater_dialog_app_in_black_list = ConfigPreference.INSTANCE.getUPDATER_DIALOG_APP_IN_BLACK_LIST();
                    if (updater_dialog_app_in_black_list.length() > 0) {
                        List list = (List) new Gson().fromJson(updater_dialog_app_in_black_list, new TypeToken<List<? extends String>>() { // from class: com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$parseBinaryData$$inlined$fromJson$1
                        }.getType());
                        if ((true ^ list.isEmpty()) && list.contains(model)) {
                            Logger.i("data id Invalid Version " + fitnessDataId + ", deviceMode in black " + model, new Object[0]);
                        } else {
                            i3 = code;
                        }
                    } else {
                        i3 = code;
                    }
                }
                anonymousClass1.L$0 = fitnessDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = fitnessDataId;
                anonymousClass1.label = 2;
                if (fitnessDeviceSyncManager.onParseSuccess(str, fitnessDataId, i3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                anonymousClass1.L$0 = fitnessDeviceSyncManager;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = fitnessDataId;
                anonymousClass1.label = 3;
                if (fitnessDeviceSyncManager.onParseError(str, fitnessDataId, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object parseTheFitnessData(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super Unit> continuation) {
        C15751 c15751;
        FitnessDeviceSyncManager fitnessDeviceSyncManager;
        FitnessDeviceSyncManager fitnessDeviceSyncManager2;
        String str2;
        FitnessDataId fitnessDataId2;
        FitnessDataId fitnessDataId3;
        String str3;
        String str4 = str;
        FitnessDataId fitnessDataId4 = fitnessDataId;
        byte[] bArr2 = bArr;
        if (continuation instanceof C15751) {
            c15751 = (C15751) continuation;
            int i = c15751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15751.label = i - Integer.MIN_VALUE;
            } else {
                c15751 = new C15751(continuation);
            }
        } else {
            c15751 = new C15751(continuation);
        }
        C15751 c15752 = c15751;
        Object obj = c15752.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15752.label;
        if (i2 != 0) {
            if (i2 == 1) {
                fitnessDataId3 = (FitnessDataId) c15752.L$2;
                str3 = (String) c15752.L$1;
                fitnessDeviceSyncManager = (FitnessDeviceSyncManager) c15752.L$0;
            } else if (i2 == 2) {
                bArr2 = (byte[]) c15752.L$3;
                fitnessDataId2 = (FitnessDataId) c15752.L$2;
                str2 = (String) c15752.L$1;
                fitnessDeviceSyncManager2 = (FitnessDeviceSyncManager) c15752.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c15752.L$0 = fitnessDeviceSyncManager2;
                    c15752.L$1 = str2;
                    c15752.L$2 = fitnessDataId2;
                    c15752.L$3 = null;
                    c15752.label = 3;
                    if (fitnessDeviceSyncManager2.parseBinaryData(str2, fitnessDataId2, bArr2, c15752) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    fitnessDataId4 = fitnessDataId2;
                    str4 = str2;
                    fitnessDeviceSyncManager = fitnessDeviceSyncManager2;
                    FitnessLogUtils.INSTANCE.w(fitnessDeviceSyncManager.getTAG(), "parseFitnessData: onError(" + fitnessDataId4 + ")", th);
                    c15752.L$0 = null;
                    c15752.L$1 = null;
                    c15752.L$2 = null;
                    c15752.L$3 = null;
                    c15752.label = 4;
                    if (fitnessDeviceSyncManager.onParseError(str4, fitnessDataId4, c15752) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 == 3) {
                fitnessDataId3 = (FitnessDataId) c15752.L$2;
                str3 = (String) c15752.L$1;
                fitnessDeviceSyncManager = (FitnessDeviceSyncManager) c15752.L$0;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                fitnessDataId4 = fitnessDataId3;
                str4 = str3;
                FitnessLogUtils.INSTANCE.w(fitnessDeviceSyncManager.getTAG(), "parseFitnessData: onError(" + fitnessDataId4 + ")", th);
                c15752.L$0 = null;
                c15752.L$1 = null;
                c15752.L$2 = null;
                c15752.L$3 = null;
                c15752.label = 4;
                if (fitnessDeviceSyncManager.onParseError(str4, fitnessDataId4, c15752) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                FitnessDataHeader fitnessDataHeader = new FitnessDataHeader(fitnessDataId4);
                if (bArr2.length != 0 && bArr2.length > fitnessDataHeader.getHeaderLen()) {
                    if (FitnessTestPref.INSTANCE.getENABLE_SAVE_FITNESS_FILE()) {
                        c15752.L$0 = this;
                        c15752.L$1 = str4;
                        c15752.L$2 = fitnessDataId4;
                        c15752.L$3 = bArr2;
                        c15752.label = 2;
                        if (saveAsFile(str4, fitnessDataId4, bArr2, c15752) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    fitnessDeviceSyncManager2 = this;
                    str2 = str4;
                    fitnessDataId2 = fitnessDataId4;
                    c15752.L$0 = fitnessDeviceSyncManager2;
                    c15752.L$1 = str2;
                    c15752.L$2 = fitnessDataId2;
                    c15752.L$3 = null;
                    c15752.label = 3;
                    if (fitnessDeviceSyncManager2.parseBinaryData(str2, fitnessDataId2, bArr2, c15752) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    FitnessLogUtils.i(getTAG(), "empty fitness data file: (" + fitnessDataId4 + ")");
                    c15752.L$0 = this;
                    c15752.L$1 = str4;
                    c15752.L$2 = fitnessDataId4;
                    c15752.label = 1;
                    if (onParseSuccess$default(this, str, fitnessDataId, 0, c15752, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fitnessDeviceSyncManager = this;
                FitnessLogUtils.INSTANCE.w(fitnessDeviceSyncManager.getTAG(), "parseFitnessData: onError(" + fitnessDataId4 + ")", th);
                c15752.L$0 = null;
                c15752.L$1 = null;
                c15752.L$2 = null;
                c15752.L$3 = null;
                c15752.label = 4;
                if (fitnessDeviceSyncManager.onParseError(str4, fitnessDataId4, c15752) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveAsFile(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super Unit> continuation) {
        FitnessFileUtils.writeFile(FitnessFileUtils.getCacheDataFile(ApplicationExtKt.getApplication(), str, fitnessDataId), bArr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessWearSender wearSender_delegate$lambda$0(FitnessDeviceSyncManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new FitnessWearSender(this$0.pbImpl);
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void confirmFitnessId$fitness_sync_release(@NotNull final String sid, @NotNull final FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        if (TextUtils.equals(sid, "xiaomiwear_app")) {
            ScopeExtKt.scope(Dispatchers.getIO(), new FitnessDeviceSyncManager$confirmFitnessId$1(this, sid, dataId, null));
        } else {
            getWearSender().confirmFitnessId(sid, dataId, new Function1() { // from class: rq9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FitnessDeviceSyncManager.confirmFitnessId$lambda$2(this.f32794a, dataId, sid, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void handleSpecialSyncResult$fitness_sync_release(@NotNull String did, boolean success) {
        Intrinsics.checkNotNullParameter(did, "did");
        VitaliyDataSender.INSTANCE.getInstance().registerBroadcast();
        SleepSegmentUtils.INSTANCE.writeBackSleepToDevice(did, this.hasNewSleep);
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void startSyncWithDevice$fitness_sync_release(@NotNull String sid, @Nullable iw9 callback, @Nullable Boolean isBgAutoSync) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        FitnessLogUtils.i(getTAG(), "startSyncWithDevice");
        this.hasNewSleep = false;
        this.pbImpl.syncWearSportStatus();
        getWearSender().requestData(sid, new RequestDataCallback(this, sid, callback), isBgAutoSync);
    }

    @Override // com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl
    public void syncLocalData$fitness_sync_release(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new FitnessDeviceSyncManager$syncLocalData$1(this, sid, null), 3, null);
    }

    public final void syncTheData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        if (dataId.getDataType() != 0 || dataId.getDailyType() != 5) {
            ScopeExtKt.scope(Dispatchers.getIO(), new C15761(sid, dataId, data, null));
            return;
        }
        FitnessLogUtils.i(getTAG(), "abort user profile file(" + dataId + ")");
    }

    public final void syncWithDevice(@NotNull String sid, @NotNull byte[] dataIds, @Nullable iw9 callback) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        this.hasNewSleep = false;
        getWearSender().requestData(sid, dataIds, true, new RequestDataCallback(this, sid, callback));
    }
}
