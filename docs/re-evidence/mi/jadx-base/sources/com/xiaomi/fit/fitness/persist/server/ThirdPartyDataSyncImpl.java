package com.xiaomi.fit.fitness.persist.server;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.HMDataParams;
import com.xiaomi.fit.fitness.export.data.item.ThirdPartyDataModel;
import com.xiaomi.fit.fitness.export.data.item.ThirdPartyDataParam;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.server.ThirdPartyDataSyncImpl;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@¢\u0006\u0002\u0010\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/ThirdPartyDataSyncImpl;", "Lcom/xiaomi/fit/fitness/export/api/ThirdPartyDataServerSyncer;", "<init>", "()V", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "TAG", "", "isEnable", "", "syncHmDataToServer", "data", "Lcom/xiaomi/fit/fitness/export/data/item/HMDataParams;", "(Lcom/xiaomi/fit/fitness/export/data/item/HMDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncCgmGlucoseToServer", "thirdToken", "appName", "dataList", "", "Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartyDataSyncImpl implements ThirdPartyDataServerSyncer {

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ubp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdPartyDataSyncImpl.mFitnessRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final String TAG = "ThirdPartyDataSyncImpl";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.ThirdPartyDataSyncImpl$syncCgmGlucoseToServer$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.ThirdPartyDataSyncImpl", f = "ThirdPartyDataSyncImpl.kt", i = {0}, l = {40}, m = "syncCgmGlucoseToServer", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return ThirdPartyDataSyncImpl.this.syncCgmGlucoseToServer(null, null, null, this);
        }
    }

    private final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) this.mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    @Override // com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer
    public boolean isEnable() {
        return FitnessPersistUtils.INSTANCE.checkServerRequestEnable() == CloudSyncCheckResult.SUCCESS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer
    @Nullable
    public Object syncCgmGlucoseToServer(@NotNull String str, @NotNull String str2, @NotNull List<ThirdPartyDataModel> list, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        ThirdPartyDataSyncImpl thirdPartyDataSyncImpl;
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
        Object objSyncThirdPartyDataToServer = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSyncThirdPartyDataToServer);
            if (!isEnable()) {
                FitnessLogUtils.w(this.TAG, "syncCgmGlucoseToServer: not allowed");
                return Boxing.boxBoolean(false);
            }
            try {
                ThirdPartyDataParam thirdPartyDataParam = new ThirdPartyDataParam(str, "synapsor", list, null, 8, null);
                thirdPartyDataParam.setExtra(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("appName", str2)));
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objSyncThirdPartyDataToServer = mFitnessRequest.syncThirdPartyDataToServer(thirdPartyDataParam, anonymousClass1);
                if (objSyncThirdPartyDataToServer == coroutine_suspended) {
                    return coroutine_suspended;
                }
                thirdPartyDataSyncImpl = this;
            } catch (Exception e) {
                e = e;
                thirdPartyDataSyncImpl = this;
                FitnessLogUtils.e(thirdPartyDataSyncImpl.TAG, "syncCgmGlucoseToServer(" + e + ")", e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            thirdPartyDataSyncImpl = (ThirdPartyDataSyncImpl) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objSyncThirdPartyDataToServer);
            } catch (Exception e2) {
                e = e2;
                FitnessLogUtils.e(thirdPartyDataSyncImpl.TAG, "syncCgmGlucoseToServer(" + e + ")", e);
            }
        }
        zBooleanValue = ((Boolean) objSyncThirdPartyDataToServer).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer
    @Nullable
    public Object syncHmDataToServer(@NotNull HMDataParams hMDataParams, @NotNull Continuation<? super Boolean> continuation) {
        return getMFitnessRequest().syncHmDataToServer(hMDataParams, continuation);
    }
}
