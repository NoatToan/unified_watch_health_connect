package com.xiaomi.fit.fitness.device.mi.send;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.db.FitnessSyncDataBase;
import com.xiaomi.fit.fitness.db.dao.DataSyncEntity;
import com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao;
import com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0013\u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013J'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0018J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J*\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0016H\u0002J&\u0010\u0015\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0016J\"\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0012\u001a\u00020\u0016H\u0002J*\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010*J&\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender;", "", "pbImpl", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "<init>", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;)V", "deviceSyncDao", "Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "getDeviceSyncDao", "()Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "deviceSyncDao$delegate", "Lkotlin/Lazy;", "confirmFitnessId", "", "did", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "callback", "Lkotlin/Function1;", "", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$SentCallback;", "isBgAutoSync", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$SentCallback;Ljava/lang/Boolean;)V", "requestTodayData", "requestHistoryData", "hasTodayDataToSync", "requestDataIdIfHas", "dataIds", "", "isTodayRequest", "sid", "sendRequestDataToWear", "dataIdsToSync", "getUnSyncedDataIds", "ids", "(Ljava/lang/String;[BZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needToSyncData", "isTodayId", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNeedToSync", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasSyncedToServer", "saveDataIdToSynced", "forceSync", "Companion", "SentCallback", "ErrorCode", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessWearSender {

    @NotNull
    private static final String TAG = "FitnessWearSender";

    /* JADX INFO: renamed from: deviceSyncDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSyncDao;

    @NotNull
    private final FitnessDeviceSyncPbApi pbImpl;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$ErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_GET_TODAY_IDS", "ERROR_GET_HISTORY_IDS", "ERROR_REQUEST_DATA_IDS", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ErrorCode {
        ERROR_GET_TODAY_IDS,
        ERROR_GET_HISTORY_IDS,
        ERROR_REQUEST_DATA_IDS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ErrorCode> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$SentCallback;", "", "onRequestSentSuccess", "", "onNoDataToSync", "onError", "errorCode", "Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearSender$ErrorCode;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SentCallback {
        void onError(@NotNull ErrorCode errorCode);

        void onNoDataToSync();

        void onRequestSentSuccess();
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$checkNeedToSync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender", f = "FitnessWearSender.kt", i = {}, l = {211}, m = "checkNeedToSync", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return FitnessWearSender.this.checkNeedToSync(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$getUnSyncedDataIds$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender", f = "FitnessWearSender.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {154, 165}, m = "getUnSyncedDataIds", n = {"ids", "this", "did", "byteBuffer", "outputStream", "dataIdBytes", "dataId", "isTodayRequest", "length", "i"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1"})
    public static final class C15791 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C15791(Continuation<? super C15791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessWearSender.this.getUnSyncedDataIds(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$hasSyncedToServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender", f = "FitnessWearSender.kt", i = {}, l = {220}, m = "hasSyncedToServer", n = {}, s = {})
    public static final class C15801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C15801(Continuation<? super C15801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessWearSender.this.hasSyncedToServer(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$needToSyncData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender", f = "FitnessWearSender.kt", i = {0, 0, 0, 0, 1}, l = {SportReportBaseParser.ReportType.divingCNS, SportReportBaseParser.ReportType.algorithmDataSource}, m = "needToSyncData", n = {"this", "did", "dataId", "isTodayId", "toSync"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$0"})
    public static final class C15811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C15811(Continuation<? super C15811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessWearSender.this.needToSyncData(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$requestData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$requestData$2", f = "FitnessWearSender.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SentCallback $callback;
        final /* synthetic */ byte[] $dataIds;
        final /* synthetic */ boolean $isTodayRequest;
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, byte[] bArr, boolean z, SentCallback sentCallback, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$dataIds = bArr;
            this.$isTodayRequest = z;
            this.$callback = sentCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessWearSender.this.new AnonymousClass2(this.$sid, this.$dataIds, this.$isTodayRequest, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessWearSender fitnessWearSender = FitnessWearSender.this;
                String str = this.$sid;
                byte[] bArr = this.$dataIds;
                boolean z = this.$isTodayRequest;
                this.label = 1;
                obj = fitnessWearSender.getUnSyncedDataIds(str, bArr, z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FitnessWearSender.this.sendRequestDataToWear(this.$sid, (byte[]) obj, this.$callback);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$sendRequestDataToWear$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$sendRequestDataToWear$1", f = "FitnessWearSender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SentCallback $callback;
        final /* synthetic */ byte[] $dataIdsToSync;
        final /* synthetic */ String $did;
        int label;
        final /* synthetic */ FitnessWearSender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15851(byte[] bArr, SentCallback sentCallback, FitnessWearSender fitnessWearSender, String str, Continuation<? super C15851> continuation) {
            super(2, continuation);
            this.$dataIdsToSync = bArr;
            this.$callback = sentCallback;
            this.this$0 = fitnessWearSender;
            this.$did = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SentCallback sentCallback, boolean z) {
            FitnessLogUtils.i(FitnessWearSender.TAG, "requestFitnessIds result(" + z + ")");
            if (z) {
                sentCallback.onRequestSentSuccess();
            } else {
                sentCallback.onError(ErrorCode.ERROR_REQUEST_DATA_IDS);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15851(this.$dataIdsToSync, this.$callback, this.this$0, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = this.$dataIdsToSync;
            if (bArr == null || bArr.length == 0) {
                this.$callback.onNoDataToSync();
            } else {
                FitnessLogUtils.i(FitnessWearSender.TAG, "sendRequestDataToWear: size(" + (bArr.length / 7) + ")");
                FitnessDeviceSyncPbApi fitnessDeviceSyncPbApi = this.this$0.pbImpl;
                String str = this.$did;
                byte[] bArr2 = this.$dataIdsToSync;
                final SentCallback sentCallback = this.$callback;
                fitnessDeviceSyncPbApi.requestFitnessIds(str, bArr2, new Function1() { // from class: com.xiaomi.fit.fitness.device.mi.send.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FitnessWearSender.C15851.invokeSuspend$lambda$0(sentCallback, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FitnessWearSender(@NotNull FitnessDeviceSyncPbApi pbImpl) {
        Intrinsics.checkNotNullParameter(pbImpl, "pbImpl");
        this.pbImpl = pbImpl;
        this.deviceSyncDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pw9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FitnessWearSender.deviceSyncDao_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object checkNeedToSync(String str, FitnessDataId fitnessDataId, Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
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
        Object objHasSyncedToServer = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasSyncedToServer);
            if (fitnessDataId.getDataType() == 0) {
                return fitnessDataId.getDailyType() == 5 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
            }
            anonymousClass1.label = 1;
            objHasSyncedToServer = hasSyncedToServer(str, fitnessDataId, anonymousClass1);
            if (objHasSyncedToServer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHasSyncedToServer);
        }
        return ((Boolean) objHasSyncedToServer).booleanValue() ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDataSyncDao deviceSyncDao_delegate$lambda$0() {
        return FitnessSyncDataBase.INSTANCE.getInstance().deviceDataSyncDao();
    }

    private final DeviceDataSyncDao getDeviceSyncDao() {
        return (DeviceDataSyncDao) this.deviceSyncDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[Catch: all -> 0x0057, IOException -> 0x005a, TryCatch #0 {IOException -> 0x005a, blocks: (B:13:0x004d, B:44:0x00de, B:46:0x00e6, B:48:0x00ec, B:50:0x00f2, B:52:0x00f8, B:54:0x00fe, B:55:0x010c), top: B:69:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[Catch: all -> 0x0057, IOException -> 0x005a, TryCatch #0 {IOException -> 0x005a, blocks: (B:13:0x004d, B:44:0x00de, B:46:0x00e6, B:48:0x00ec, B:50:0x00f2, B:52:0x00f8, B:54:0x00fe, B:55:0x010c), top: B:69:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d7 -> B:44:0x00de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getUnSyncedDataIds(java.lang.String r18, byte[] r19, boolean r20, kotlin.coroutines.Continuation<? super byte[]> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.getUnSyncedDataIds(java.lang.String, byte[], boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object hasSyncedToServer(String str, FitnessDataId fitnessDataId, Continuation<? super Boolean> continuation) {
        C15801 c15801;
        if (continuation instanceof C15801) {
            c15801 = (C15801) continuation;
            int i = c15801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15801.label = i - Integer.MIN_VALUE;
            } else {
                c15801 = new C15801(continuation);
            }
        } else {
            c15801 = new C15801(continuation);
        }
        Object obj = c15801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceDataSyncDao deviceSyncDao = getDeviceSyncDao();
            byte[] byteArray = fitnessDataId.toByteArray();
            c15801.label = 1;
            obj = deviceSyncDao.get(str, byteArray, c15801);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        DataSyncEntity dataSyncEntity = (DataSyncEntity) obj;
        return Boxing.boxBoolean(dataSyncEntity != null && dataSyncEntity.getSyncStatus() > 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object needToSyncData(String str, FitnessDataId fitnessDataId, boolean z, Continuation<? super Boolean> continuation) {
        C15811 c15811;
        FitnessWearSender fitnessWearSender;
        boolean zBooleanValue;
        boolean z2;
        if (continuation instanceof C15811) {
            c15811 = (C15811) continuation;
            int i = c15811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15811.label = i - Integer.MIN_VALUE;
            } else {
                c15811 = new C15811(continuation);
            }
        } else {
            c15811 = new C15811(continuation);
        }
        Object objCheckNeedToSync = c15811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15811.label;
        if (i2 != 0) {
            if (i2 == 1) {
                z = c15811.Z$0;
                fitnessDataId = (FitnessDataId) c15811.L$2;
                str = (String) c15811.L$1;
                fitnessWearSender = (FitnessWearSender) c15811.L$0;
                ResultKt.throwOnFailure(objCheckNeedToSync);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = c15811.Z$0;
                ResultKt.throwOnFailure(objCheckNeedToSync);
            }
            zBooleanValue = z2;
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(objCheckNeedToSync);
        c15811.L$0 = this;
        c15811.L$1 = str;
        c15811.L$2 = fitnessDataId;
        c15811.Z$0 = z;
        c15811.label = 1;
        objCheckNeedToSync = checkNeedToSync(str, fitnessDataId, c15811);
        if (objCheckNeedToSync == coroutine_suspended) {
            return coroutine_suspended;
        }
        fitnessWearSender = this;
        zBooleanValue = ((Boolean) objCheckNeedToSync).booleanValue();
        boolean z3 = z && fitnessDataId.getDailyType() != 8;
        FitnessLogUtils.i(TAG, "toSyncData(" + zBooleanValue + ")-forceSync(" + z3 + "): " + fitnessDataId);
        if (zBooleanValue) {
            c15811.L$0 = null;
            c15811.L$1 = null;
            c15811.L$2 = null;
            c15811.Z$0 = zBooleanValue;
            c15811.label = 2;
            if (fitnessWearSender.saveDataIdToSynced(str, fitnessDataId, z3, c15811) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z2 = zBooleanValue;
            zBooleanValue = z2;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public static /* synthetic */ void requestData$default(FitnessWearSender fitnessWearSender, String str, SentCallback sentCallback, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        fitnessWearSender.requestData(str, sentCallback, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestDataIdIfHas(String did, byte[] dataIds, boolean isTodayRequest, SentCallback callback) {
        if (dataIds == null || dataIds.length == 0) {
            callback.onNoDataToSync();
        } else {
            requestData(did, dataIds, isTodayRequest, callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHistoryData(final String did, final SentCallback callback, final boolean hasTodayDataToSync) {
        FitnessLogUtils.i(TAG, "getHistoryDataIds, did = " + did);
        this.pbImpl.getHistoryFitnessIds(did, new OnGetFitnessIdsCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.requestHistoryData.1
            @Override // com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback
            public void onError(int code) {
                FitnessLogUtils.w(FitnessWearSender.TAG, "getHistoryFitnessIds: did =" + did + ", errCode= " + code);
                callback.onError(ErrorCode.ERROR_GET_HISTORY_IDS);
            }

            @Override // com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback
            public void onSuccess(byte[] dataIds) {
                FitnessLogUtils.i(FitnessWearSender.TAG, "getHistoryDataIds success, and requestHistoryData");
                FitnessWearSender fitnessWearSender = FitnessWearSender.this;
                String str = did;
                final SentCallback sentCallback = callback;
                final boolean z = hasTodayDataToSync;
                fitnessWearSender.requestDataIdIfHas(str, dataIds, false, new SentCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender$requestHistoryData$1$onSuccess$1
                    @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
                    public void onError(FitnessWearSender.ErrorCode errorCode) {
                        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                        FitnessLogUtils.i("FitnessWearSender", "requestHistoryData: " + errorCode);
                        sentCallback.onError(errorCode);
                    }

                    @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
                    public void onNoDataToSync() {
                        FitnessLogUtils.i("FitnessWearSender", "requestHistoryData: no data to sync");
                        if (z) {
                            sentCallback.onRequestSentSuccess();
                        } else {
                            sentCallback.onNoDataToSync();
                        }
                    }

                    @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
                    public void onRequestSentSuccess() {
                        FitnessLogUtils.i("FitnessWearSender", "requestHistoryData msg sent success!");
                        sentCallback.onRequestSentSuccess();
                    }
                });
            }
        });
    }

    private final void requestTodayData(final String did, final SentCallback callback, Boolean isBgAutoSync) {
        FitnessLogUtils.i(TAG, "getTodayDataIds, did = " + did);
        this.pbImpl.getTodayFitnessIds(did, isBgAutoSync, new OnGetFitnessIdsCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.requestTodayData.1
            @Override // com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback
            public void onError(int code) {
                FitnessLogUtils.w(FitnessWearSender.TAG, "requestTodayData: did =" + did + ", onError code= " + code);
                callback.onError(ErrorCode.ERROR_GET_TODAY_IDS);
            }

            @Override // com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback
            public void onSuccess(byte[] dataIds) {
                FitnessLogUtils.i(FitnessWearSender.TAG, "getTodayFitnessIds, and requestTodayData");
                FitnessWearSender.this.requestDataIdIfHas(did, dataIds, true, callback);
            }
        });
    }

    public static /* synthetic */ void requestTodayData$default(FitnessWearSender fitnessWearSender, String str, SentCallback sentCallback, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        fitnessWearSender.requestTodayData(str, sentCallback, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveDataIdToSynced(String str, FitnessDataId fitnessDataId, boolean z, Continuation<? super Unit> continuation) {
        if (fitnessDataId.getDataType() == 0 && fitnessDataId.getDailyType() == 5) {
            return Unit.INSTANCE;
        }
        DataSyncEntity dataSyncEntity = new DataSyncEntity(str, fitnessDataId.toByteArray(), 0, false, 8, null);
        dataSyncEntity.setForceSync(z);
        Object objInsertAll = getDeviceSyncDao().insertAll(new DataSyncEntity[]{dataSyncEntity}, continuation);
        return objInsertAll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertAll : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRequestDataToWear(String did, byte[] dataIdsToSync, SentCallback callback) {
        AnyExtKt.main$default(null, new C15851(dataIdsToSync, callback, this, did, null), 1, null);
    }

    public final void confirmFitnessId(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.pbImpl.confirmFitnessId(did, dataId, callback);
    }

    public final void requestData(@NotNull final String did, @NotNull final SentCallback callback, @Nullable Boolean isBgAutoSync) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        requestTodayData(did, new SentCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.requestData.1
            @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
            public void onError(ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                FitnessLogUtils.i(FitnessWearSender.TAG, "requestTodayData: " + errorCode);
                callback.onError(errorCode);
            }

            @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
            public void onNoDataToSync() {
                FitnessLogUtils.i(FitnessWearSender.TAG, " no today data to sync");
                FitnessWearSender.this.requestHistoryData(did, callback, false);
            }

            @Override // com.xiaomi.fit.fitness.device.mi.send.FitnessWearSender.SentCallback
            public void onRequestSentSuccess() {
                FitnessLogUtils.i(FitnessWearSender.TAG, "requestTodayData msg sent success !");
                FitnessWearSender.this.requestHistoryData(did, callback, true);
            }
        }, isBgAutoSync);
    }

    public final void requestData(@NotNull String sid, @NotNull byte[] dataIds, boolean isTodayRequest, @NotNull SentCallback callback) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AnyExtKt.io$default(null, new AnonymousClass2(sid, dataIds, isTodayRequest, callback, null), 1, null);
    }
}
