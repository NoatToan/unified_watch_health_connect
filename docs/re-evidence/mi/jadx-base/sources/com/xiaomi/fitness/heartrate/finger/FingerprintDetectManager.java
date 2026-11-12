package com.xiaomi.fitness.heartrate.finger;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.heartrate.HeartRateCmdResult;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ServiceManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.heartrate.finger.FingerprintDetectManager;
import com.xiaomi.fitness.heartrate.utils.HeartRateExtKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010\u001d\u001a\u00020\u00172\n\u0010\u001e\u001a\u00020\u001f\"\u00020 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020 H\u0007J\u0012\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b#\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;", "Lcom/xiaomi/fitness/heartrate/finger/OnFpHeartRateCallback;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mFingerMgr", "Landroid/hardware/fingerprint/FingerprintManager;", "mDetectService", "Lcom/xiaomi/fitness/heartrate/finger/FingerDetectService;", "mFingerHeartRateResultLiveData", "Lcom/xiaomi/fitness/heartrate/finger/FingerResultLiveData;", "mFingerprintService", "Landroid/os/IBinder;", "mRecipient", "Landroid/os/IBinder$DeathRecipient;", "getMRecipient", "()Landroid/os/IBinder$DeathRecipient;", "setMRecipient", "(Landroid/os/IBinder$DeathRecipient;)V", "mRunningSendCmdTask", "Ljava/util/concurrent/Future;", "registerFpService", "", "unregisterFpService", "fingerHeartRateResultLiveData", "getFingerHeartRateResultLiveData", "()Lcom/xiaomi/fitness/heartrate/finger/FingerResultLiveData;", "clearResultLiveData", "doSendCommandInWorker", "cmdId", "", "", "doSendCommand", "Landroid/hardware/fingerprint/heartrate/HeartRateCmdResult;", "isHasHardwareFingerprint", "", "()Z", "onHeartRateCallback", "result", "Lcom/xiaomi/fitness/heartrate/finger/HeartRateCmdResultLocal;", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFingerprintDetectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FingerprintDetectManager.kt\ncom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,189:1\n1#2:190\n13423#3,2:191\n*S KotlinDebug\n*F\n+ 1 FingerprintDetectManager.kt\ncom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager\n*L\n94#1:191,2\n*E\n"})
public final class FingerprintDetectManager implements OnFpHeartRateCallback {

    @NotNull
    private static final String TAG = FingerDetectUtil.FP_TAG;

    @Nullable
    private FingerDetectService mDetectService;

    @Nullable
    private FingerResultLiveData mFingerHeartRateResultLiveData;

    @Nullable
    private FingerprintManager mFingerMgr;

    @Nullable
    private IBinder mFingerprintService;

    @NotNull
    private IBinder.DeathRecipient mRecipient;

    @Nullable
    private Future<?> mRunningSendCmdTask;

    public FingerprintDetectManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRecipient = new IBinder.DeathRecipient() { // from class: com.xiaomi.fitness.heartrate.finger.FingerprintDetectManager$mRecipient$1
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IBinder iBinder = this.this$0.mFingerprintService;
                if (iBinder != null) {
                    iBinder.unlinkToDeath(this, 0);
                }
                Logger.e(FingerprintDetectManager.TAG, "Fingerprint Service died, unlink");
            }
        };
        Object systemService = ApplicationExtKt.getSafeContext(context).getSystemService("fingerprint");
        if (!(systemService instanceof FingerprintManager)) {
            Logger.e(TAG, "there is no FingerprintManager in this device");
            return;
        }
        this.mFingerMgr = (FingerprintManager) systemService;
        try {
            Object objInvoke = ServiceManager.class.getMethod("getService", String.class).invoke(null, "fingerprint");
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.IBinder");
            IBinder iBinder = (IBinder) objInvoke;
            this.mFingerprintService = iBinder;
            if (iBinder == null) {
                throw new IllegalStateException("there is no service named fingerprint".toString());
            }
            Intrinsics.checkNotNull(iBinder);
            iBinder.linkToDeath(this.mRecipient, 0);
        } catch (Exception e) {
            Logger.e(TAG, "init fingerprint manager error: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doSendCommandInWorker$lambda$1(int[] cmdId, FingerprintDetectManager this$0) {
        Intrinsics.checkNotNullParameter(cmdId, "$cmdId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i : cmdId) {
            this$0.doSendCommand(i);
        }
    }

    public final void clearResultLiveData() {
        this.mFingerHeartRateResultLiveData = null;
    }

    @Nullable
    public final HeartRateCmdResult doSendCommand(int cmdId) {
        HeartRateExtKt.logi("doSendCommand: cmdName=" + DelmarConstants.INSTANCE.getCmdName(cmdId) + " cmdId = " + cmdId);
        Future<?> future = this.mRunningSendCmdTask;
        if (future != null && future.isCancelled()) {
            HeartRateExtKt.logi("doSendCommand is canceled, return null.");
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        Parcel parcelObtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain(...)");
        try {
            try {
                parcelObtain.writeInterfaceToken(MiuiHeartRateCode.DESCRIPTOR);
                parcelObtain.writeInt(cmdId);
                parcelObtain.writeInt(100);
                parcelObtain.writeByteArray(new byte[100]);
                IBinder iBinder = this.mFingerprintService;
                Intrinsics.checkNotNull(iBinder);
                if (!iBinder.transact(16777215, parcelObtain, parcelObtain2, 0)) {
                    Logger.e(TAG, "FingerprintService.transact() is failed @" + cmdId);
                }
                HeartRateCmdResult heartRateCmdResultCreateFromParcel = HeartRateCmdResult.CREATOR.createFromParcel(parcelObtain2);
                Intrinsics.checkNotNull(heartRateCmdResultCreateFromParcel);
                getFingerHeartRateResultLiveData().setHeartRateResultValue(new HeartRateCmdResultLocal(heartRateCmdResultCreateFromParcel));
            } catch (InterruptedException e) {
                HeartRateExtKt.logi("doSendCommand is interrupted " + e.getMessage());
            } catch (CancellationException e2) {
                HeartRateExtKt.logi("doSendCommand is canceled " + e2.getMessage());
            } catch (Exception e3) {
                HeartRateExtKt.logi("doSendCommand: error " + e3.getMessage());
            }
            return null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            this.mRunningSendCmdTask = null;
        }
    }

    public final void doSendCommandInWorker(@NotNull final int... cmdId) {
        Intrinsics.checkNotNullParameter(cmdId, "cmdId");
        Future<?> future = this.mRunningSendCmdTask;
        if (future != null) {
            future.cancel(true);
        }
        this.mRunningSendCmdTask = ExecutorHelper.runInWorker(new Runnable() { // from class: co9
            @Override // java.lang.Runnable
            public final void run() {
                FingerprintDetectManager.doSendCommandInWorker$lambda$1(cmdId, this);
            }
        });
    }

    @NotNull
    public final FingerResultLiveData getFingerHeartRateResultLiveData() {
        if (this.mFingerHeartRateResultLiveData == null) {
            this.mFingerHeartRateResultLiveData = new FingerResultLiveData();
        }
        FingerResultLiveData fingerResultLiveData = this.mFingerHeartRateResultLiveData;
        Intrinsics.checkNotNull(fingerResultLiveData);
        return fingerResultLiveData;
    }

    @NotNull
    public final IBinder.DeathRecipient getMRecipient() {
        return this.mRecipient;
    }

    public final boolean isHasHardwareFingerprint() {
        FingerprintManager fingerprintManager = this.mFingerMgr;
        if (fingerprintManager == null) {
            return false;
        }
        try {
            Intrinsics.checkNotNull(fingerprintManager);
            boolean zIsHardwareDetected = fingerprintManager.isHardwareDetected();
            if (!zIsHardwareDetected) {
                Logger.e(TAG, "This device has no fingerprint component");
            }
            return zIsHardwareDetected && SystemProperties.INSTANCE.getFpHeartRateEnable();
        } catch (Exception e) {
            Logger.e(TAG, "isHasHardwareFingerprint: %s" + e.getMessage());
            return false;
        }
    }

    @Override // com.xiaomi.fitness.heartrate.finger.OnFpHeartRateCallback
    public void onHeartRateCallback(@Nullable HeartRateCmdResultLocal result) {
        HeartRateExtKt.logi("onHeartRateCallback, resultCmdId=" + (result != null ? Integer.valueOf(result.getMMsgCode()) : null));
        getFingerHeartRateResultLiveData().setHeartRateResultValue(result);
    }

    public final void registerFpService() {
        this.mDetectService = new FingerDetectService(this);
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        Parcel parcelObtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain(...)");
        try {
            try {
                parcelObtain.writeInterfaceToken(MiuiHeartRateCode.DESCRIPTOR);
                parcelObtain.writeStrongBinder(this.mDetectService);
                IBinder iBinder = this.mFingerprintService;
                Intrinsics.checkNotNull(iBinder);
                iBinder.transact(MiuiHeartRateCode.HEARTBEAT_RATE_REGISTER, parcelObtain, parcelObtain2, 0);
            } catch (Exception e) {
                Logger.e(TAG, "registerFpService: " + e.getMessage());
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public final void setMRecipient(@NotNull IBinder.DeathRecipient deathRecipient) {
        Intrinsics.checkNotNullParameter(deathRecipient, "<set-?>");
        this.mRecipient = deathRecipient;
    }

    public final void unregisterFpService() {
        if (this.mFingerprintService == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        Parcel parcelObtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain(...)");
        try {
            try {
                parcelObtain.writeInterfaceToken(MiuiHeartRateCode.DESCRIPTOR);
                IBinder iBinder = this.mFingerprintService;
                Intrinsics.checkNotNull(iBinder);
                iBinder.transact(MiuiHeartRateCode.HEARTBEAT_RATE_UNREGISTER, parcelObtain, parcelObtain2, 0);
            } catch (Exception e) {
                Logger.e(TAG, "unregisterFpService: " + e.getMessage());
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
