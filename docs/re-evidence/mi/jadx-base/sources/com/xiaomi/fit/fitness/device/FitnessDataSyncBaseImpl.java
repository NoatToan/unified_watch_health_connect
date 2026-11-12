package com.xiaomi.fit.fitness.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.db.FitnessSyncDataBase;
import com.xiaomi.fit.fitness.db.dao.DataSyncEntity;
import com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao;
import com.xiaomi.fit.fitness.db.dao.SyncStatus;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.iw9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bq\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\bJ \u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\tH ¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H ¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tH ¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H ¢\u0006\u0004\b&\u0010\bJ\u0015\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00100\u001a\u00020\t¢\u0006\u0004\b1\u00102J4\u00106\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u000203H\u0086@¢\u0006\u0004\b6\u00107J*\u00108\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u00104\u001a\u000203H\u0086@¢\u0006\u0004\b8\u00109J4\u0010;\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u00104\u001a\u0002032\b\b\u0002\u0010:\u001a\u00020\tH\u0084@¢\u0006\u0004\b;\u0010<J*\u0010=\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u00104\u001a\u000203H\u0084@¢\u0006\u0004\b=\u00109J(\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u00104\u001a\u000203H\u0084@¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00058\u0004X\u0084D¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010ER\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010ZR&\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010S\u001a\u0004\bb\u0010cR$\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\"\u0010h\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bh\u0010P\u001a\u0004\bi\u0010j\"\u0004\bk\u0010*R\u0017\u0010m\u001a\u00020l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/xiaomi/fit/fitness/device/FitnessDataSyncBaseImpl;", "Landroid/os/Handler$Callback;", "", "addDeviceConnectListener", "()V", "", "did", "waitingTheSyncResultAgain", "(Ljava/lang/String;)V", "", "syncSuccess", "syncFinished", Constants.EXTRA_ERROR_MESSAGE, "handleSyncResult", "(Ljava/lang/String;ZZLjava/lang/String;)V", "sid", "success", "notifySyncResultListener", "(Ljava/lang/String;ZLjava/lang/String;)V", "Liw9;", "callback", "onResponse", "(Ljava/lang/String;ZLjava/lang/String;Liw9;)V", "clearSyncingTaskMask", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "isForceSyncedId", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBgAutoSync", "startSyncWithDevice$fitness_sync_release", "(Ljava/lang/String;Liw9;Ljava/lang/Boolean;)V", "startSyncWithDevice", "confirmFitnessId$fitness_sync_release", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;)V", "confirmFitnessId", "handleSpecialSyncResult$fitness_sync_release", "(Ljava/lang/String;Z)V", "handleSpecialSyncResult", "syncLocalData$fitness_sync_release", "syncLocalData", "manualForce", "manualForceSync", "(Z)V", "syncWithDevice", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)Z", "syncInvalidVersion", "checkAllDataToSynced", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "", "status", "resultCode", "onSyncSuccess", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncError", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceSync", "updateSyncStatus", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSyncStatus", "", "Lcom/xiaomi/fit/fitness/db/dao/DataSyncEntity;", "getSyncStatusLessThan", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSyncResultListener", "(Ljava/lang/String;Liw9;)V", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG_SUMMARY", "EXTRA_KEY_DID", "", "TIMEOUT_WAIT_SYNC_COMPLETE", "J", "MSG_HANDLE_SYNC_RESPONSE", "I", "mSyncInvalidVersion", "Z", "Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "deviceSyncDao$delegate", "Lkotlin/Lazy;", "getDeviceSyncDao", "()Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "deviceSyncDao", "Landroid/os/Handler;", "mMainHandler$delegate", "getMMainHandler", "()Landroid/os/Handler;", "mMainHandler", "", "", "mDeviceSyncResultListener", "Ljava/util/Map;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lkotlin/Pair;", "hasSyncingTask", "Lkotlin/Pair;", "manualForceCloudSync", "getManualForceCloudSync", "()Z", "setManualForceCloudSync", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "deviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "getDeviceStatusListener", "()Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public abstract class FitnessDataSyncBaseImpl implements Handler.Callback {

    @Nullable
    private Pair<String, Boolean> hasSyncingTask;
    private boolean mSyncInvalidVersion;
    private boolean manualForceCloudSync;

    @NotNull
    private final String TAG = "FitnessDataSyncImpl";

    @NotNull
    private final String TAG_SUMMARY = "FitnessDataSyncSummary";

    @NotNull
    private final String EXTRA_KEY_DID = "sid";
    private final long TIMEOUT_WAIT_SYNC_COMPLETE = TimeUnit.MINUTES.toMillis(1);
    private final int MSG_HANDLE_SYNC_RESPONSE = 1;

    /* JADX INFO: renamed from: deviceSyncDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSyncDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataSyncBaseImpl.deviceSyncDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mMainHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMainHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataSyncBaseImpl.mMainHandler_delegate$lambda$1(this.f16956a);
        }
    });

    @NotNull
    private final Map<String, List<iw9>> mDeviceSyncResultListener = new LinkedHashMap();

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataSyncBaseImpl.serverSyncer_delegate$lambda$2();
        }
    });

    @NotNull
    private final OnDeviceStatusListener deviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$deviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            FitnessLogUtils.i(this.this$0.TAG_SUMMARY, "did:" + did + " , onConnectFailure");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
            FitnessLogUtils.i(this.this$0.TAG_SUMMARY, "did:" + did + " , onConnectStart");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            FitnessLogUtils.i(this.this$0.TAG_SUMMARY, "did:" + did + " , onConnectSuccess");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            FitnessLogUtils.i(this.this$0.TAG_SUMMARY, "did:" + did + " , onDisconnect");
            this.this$0.hasSyncingTask = new Pair(did == null ? "" : did, Boolean.FALSE);
            this.this$0.getMMainHandler().removeMessages(this.this$0.MSG_HANDLE_SYNC_RESPONSE);
            if (did != null) {
                FitnessDataSyncBaseImpl.checkAllDataToSynced$default(this.this$0, did, null, Boolean.TRUE, false, 10, null);
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$checkAllDataToSynced$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$checkAllDataToSynced$1", f = "FitnessDataSyncBaseImpl.kt", i = {1, 1}, l = {148, 155}, m = "invokeSuspend", n = {"entityList", "finished"}, s = {"L$0", "I$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        final /* synthetic */ Boolean $syncFinished;
        final /* synthetic */ boolean $syncInvalidVersion;
        final /* synthetic */ Boolean $syncSuccess;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Boolean bool, boolean z, Boolean bool2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$syncFinished = bool;
            this.$syncInvalidVersion = z;
            this.$syncSuccess = bool2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessDataSyncBaseImpl.this.new AnonymousClass1(this.$sid, this.$syncFinished, this.$syncInvalidVersion, this.$syncSuccess, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0094  */
        /* JADX WARN: Code duplicated, block: B:38:0x0096  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x00cd, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            int i;
            int i2;
            boolean zBooleanValue;
            boolean z;
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                zBooleanValue = ((List) obj).isEmpty();
                i = i2;
                String str = FitnessDataSyncBaseImpl.this.TAG_SUMMARY;
                int size = list.size();
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                FitnessLogUtils.i(str, "syncedSuccess = " + zBooleanValue + ", unSynced size = " + size + ", finish = " + z);
                FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl = FitnessDataSyncBaseImpl.this;
                String str2 = this.$sid;
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                FitnessDataSyncBaseImpl.handleSyncResult$default(fitnessDataSyncBaseImpl, str2, zBooleanValue, z2, null, 8, null);
                if (i == 0) {
                    FitnessLogUtils.i(FitnessDataSyncBaseImpl.this.TAG_SUMMARY, "waitingTheSyncResult, unSynced size = " + list.size());
                    FitnessDataSyncBaseImpl.this.waitingTheSyncResultAgain(this.$sid);
                }
                DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(FitnessDataSyncBaseImpl.this.getDeviceStatusListener());
                FitnessLogUtils.i(FitnessDataSyncBaseImpl.this.getTAG(), "removeDeviceStatusListener , listener:" + FitnessDataSyncBaseImpl.this.getDeviceStatusListener());
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DeviceDataSyncDao deviceSyncDao = FitnessDataSyncBaseImpl.this.getDeviceSyncDao();
            String str3 = this.$sid;
            this.label = 1;
            obj = deviceSyncDao.getSyncStatusLessThan(str3, 2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) obj;
            Boolean bool = this.$syncFinished;
            i = ((bool == null || !bool.booleanValue()) && !list.isEmpty()) ? 0 : 1;
            boolean z3 = this.$syncInvalidVersion;
            if (z3) {
                FitnessDataSyncBaseImpl.this.mSyncInvalidVersion = z3;
            }
            if (i != 0 || this.$syncSuccess != null) {
                Boolean bool2 = this.$syncSuccess;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    DeviceDataSyncDao deviceSyncDao2 = FitnessDataSyncBaseImpl.this.getDeviceSyncDao();
                    String str4 = this.$sid;
                    this.L$0 = list;
                    this.I$0 = i;
                    this.label = 2;
                    Object forceSyncStatusLessThan = deviceSyncDao2.getForceSyncStatusLessThan(str4, 2, this);
                    if (forceSyncStatusLessThan == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    obj = forceSyncStatusLessThan;
                    zBooleanValue = ((List) obj).isEmpty();
                    i = i2;
                }
                String str5 = FitnessDataSyncBaseImpl.this.TAG_SUMMARY;
                int size2 = list.size();
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                FitnessLogUtils.i(str5, "syncedSuccess = " + zBooleanValue + ", unSynced size = " + size2 + ", finish = " + z);
                FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl2 = FitnessDataSyncBaseImpl.this;
                String str6 = this.$sid;
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                FitnessDataSyncBaseImpl.handleSyncResult$default(fitnessDataSyncBaseImpl2, str6, zBooleanValue, z2, null, 8, null);
            }
            if (i == 0) {
                FitnessLogUtils.i(FitnessDataSyncBaseImpl.this.TAG_SUMMARY, "waitingTheSyncResult, unSynced size = " + list.size());
                FitnessDataSyncBaseImpl.this.waitingTheSyncResultAgain(this.$sid);
            }
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(FitnessDataSyncBaseImpl.this.getDeviceStatusListener());
            FitnessLogUtils.i(FitnessDataSyncBaseImpl.this.getTAG(), "removeDeviceStatusListener , listener:" + FitnessDataSyncBaseImpl.this.getDeviceStatusListener());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$handleSyncResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$handleSyncResult$1", f = "FitnessDataSyncBaseImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $errorMsg;
        final /* synthetic */ boolean $syncFinished;
        final /* synthetic */ boolean $syncSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15391(String str, boolean z, boolean z2, String str2, Continuation<? super C15391> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$syncSuccess = z;
            this.$syncFinished = z2;
            this.$errorMsg = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessDataSyncBaseImpl.this.new C15391(this.$did, this.$syncSuccess, this.$syncFinished, this.$errorMsg, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessLogUtils.i(FitnessDataSyncBaseImpl.this.TAG_SUMMARY, "handleSyncResult(did = " + this.$did + ", success = " + this.$syncSuccess + "， syncFinished = " + this.$syncFinished + ")");
            FitnessDataSyncBaseImpl.this.getMMainHandler().removeMessages(FitnessDataSyncBaseImpl.this.MSG_HANDLE_SYNC_RESPONSE);
            if (FitnessDataSyncBaseImpl.this.mSyncInvalidVersion) {
                FitnessDataSyncBaseImpl.this.notifySyncResultListener(this.$did, false, this.$errorMsg);
            } else {
                FitnessDataSyncBaseImpl.this.notifySyncResultListener(this.$did, this.$syncSuccess, this.$errorMsg);
            }
            Pair pair = FitnessDataSyncBaseImpl.this.hasSyncingTask;
            if (pair != null) {
                z = ((Boolean) pair.getSecond()).booleanValue();
            }
            if (this.$syncFinished) {
                FitnessDataSyncBaseImpl.this.clearSyncingTaskMask(this.$did);
                FitnessDataSyncBaseImpl.this.handleSpecialSyncResult$fitness_sync_release(this.$did, this.$syncSuccess);
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataSyncBaseImpl.this.getServerSyncer(), FitnessDataSyncBaseImpl.this.getManualForceCloudSync(), "device_sync", null, 4, null);
                FitnessDataSyncBaseImpl.this.manualForceSync(false);
                if (z) {
                    FitnessDataPreference.INSTANCE.setDEVICE_SYNC_TIME(System.currentTimeMillis());
                }
            }
            FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.DeviceSync, this.$syncSuccess, null, null, FitnessDataSyncBaseImpl.this.mSyncInvalidVersion, 12, null);
            FitnessDataSyncBaseImpl.this.mSyncInvalidVersion = false;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$isForceSyncedId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl", f = "FitnessDataSyncBaseImpl.kt", i = {}, l = {285}, m = "isForceSyncedId", n = {}, s = {})
    public static final class C15401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C15401(Continuation<? super C15401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataSyncBaseImpl.this.isForceSyncedId(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$onSyncError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl", f = "FitnessDataSyncBaseImpl.kt", i = {0, 0, 0, 0}, l = {278}, m = "onSyncError", n = {"this", "sid", "dataId", "status"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class C15411 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C15411(Continuation<? super C15411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataSyncBaseImpl.this.onSyncError(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$onSyncSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl", f = "FitnessDataSyncBaseImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {SportSummary.VERSION_102, SportSummary.VERSION_103, 265, 273}, m = "onSyncSuccess", n = {"this", "sid", "dataId", "status", "resultCode", "this", "sid", "dataId", "status", "resultCode", "forceSync", "this", "sid", "dataId", "resultCode"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "Z$0", "L$0", "L$1", "L$2", "I$0"})
    public static final class C15421 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C15421(Continuation<? super C15421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataSyncBaseImpl.this.onSyncSuccess(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$waitingTheSyncResultAgain$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl$waitingTheSyncResultAgain$1", f = "FitnessDataSyncBaseImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15431(String str, Continuation<? super C15431> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessDataSyncBaseImpl.this.new C15431(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessDataSyncBaseImpl.this.getMMainHandler().removeMessages(FitnessDataSyncBaseImpl.this.MSG_HANDLE_SYNC_RESPONSE);
            Bundle bundle = new Bundle();
            bundle.putString(FitnessDataSyncBaseImpl.this.EXTRA_KEY_DID, this.$did);
            Message messageObtainMessage = FitnessDataSyncBaseImpl.this.getMMainHandler().obtainMessage(FitnessDataSyncBaseImpl.this.MSG_HANDLE_SYNC_RESPONSE);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
            messageObtainMessage.setData(bundle);
            FitnessDataSyncBaseImpl.this.getMMainHandler().sendMessageDelayed(messageObtainMessage, FitnessDataSyncBaseImpl.this.TIMEOUT_WAIT_SYNC_COMPLETE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addDeviceConnectListener() {
        FitnessLogUtils.i(this.TAG, "addDeviceConnectListener , listener:" + this.deviceStatusListener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.deviceStatusListener);
    }

    public static /* synthetic */ void checkAllDataToSynced$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, Boolean bool, Boolean bool2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAllDataToSynced");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        fitnessDataSyncBaseImpl.checkAllDataToSynced(str, bool, bool2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSyncingTaskMask(String did) {
        Pair<String, Boolean> pair = this.hasSyncingTask;
        if (pair != null) {
            Intrinsics.checkNotNull(pair);
            if (TextUtils.equals(did, pair.getFirst())) {
                this.hasSyncingTask = new Pair<>(did, Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDataSyncDao deviceSyncDao_delegate$lambda$0() {
        return FitnessSyncDataBase.INSTANCE.getInstance().deviceDataSyncDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataSyncDao getDeviceSyncDao() {
        return (DeviceDataSyncDao) this.deviceSyncDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getMMainHandler() {
        return (Handler) this.mMainHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    private final void handleSyncResult(String did, boolean syncSuccess, boolean syncFinished, String errorMsg) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C15391(did, syncSuccess, syncFinished, errorMsg, null), 3, null);
    }

    public static /* synthetic */ void handleSyncResult$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSyncResult");
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        fitnessDataSyncBaseImpl.handleSyncResult(str, z, z2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object isForceSyncedId(String str, FitnessDataId fitnessDataId, Continuation<? super Boolean> continuation) {
        C15401 c15401;
        if (continuation instanceof C15401) {
            c15401 = (C15401) continuation;
            int i = c15401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15401.label = i - Integer.MIN_VALUE;
            } else {
                c15401 = new C15401(continuation);
            }
        } else {
            c15401 = new C15401(continuation);
        }
        Object theSyncStatus = c15401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(theSyncStatus);
            DeviceDataSyncDao deviceSyncDao = getDeviceSyncDao();
            byte[] byteArray = fitnessDataId.toByteArray();
            c15401.label = 1;
            theSyncStatus = deviceSyncDao.getTheSyncStatus(str, byteArray, c15401);
            if (theSyncStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(theSyncStatus);
        }
        DataSyncEntity dataSyncEntity = (DataSyncEntity) theSyncStatus;
        return Boxing.boxBoolean(dataSyncEntity != null ? dataSyncEntity.getForceSync() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mMainHandler_delegate$lambda$1(FitnessDataSyncBaseImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Handler(Looper.getMainLooper(), this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySyncResultListener(String sid, boolean success, String errorMsg) {
        List<iw9> list = this.mDeviceSyncResultListener.get(sid);
        List<iw9> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.w(this.TAG_SUMMARY, "notifySyncResultListener: no sync listener: sid = " + sid);
            return;
        }
        Iterator<iw9> it = list.iterator();
        while (it.hasNext()) {
            try {
                onResponse(sid, success, errorMsg, it.next());
            } catch (Exception e) {
                FitnessLogUtils.w(this.TAG, "notifySyncResultListener: callback error: " + e);
            }
        }
        this.mDeviceSyncResultListener.remove(sid);
    }

    public static /* synthetic */ void notifySyncResultListener$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, boolean z, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifySyncResultListener");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        fitnessDataSyncBaseImpl.notifySyncResultListener(str, z, str2);
    }

    private final void onResponse(String sid, boolean success, String errorMsg, iw9 callback) {
        if (callback == null || !callback.asBinder().isBinderAlive()) {
            return;
        }
        FitnessLogUtils.i(this.TAG_SUMMARY, "onResponse sync:" + success + ", sid = " + sid);
        try {
            if (success) {
                callback.onSyncSuccess(sid, 1);
            } else {
                callback.onSyncError(sid, 1, errorMsg);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG_SUMMARY, "onResponse", e);
        }
    }

    public static /* synthetic */ Object onSyncSuccess$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, FitnessDataId fitnessDataId, int i, int i2, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSyncSuccess");
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return fitnessDataSyncBaseImpl.onSyncSuccess(str, fitnessDataId, i, i2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$2() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    public static /* synthetic */ void startSyncWithDevice$fitness_sync_release$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, iw9 iw9Var, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncWithDevice");
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        fitnessDataSyncBaseImpl.startSyncWithDevice$fitness_sync_release(str, iw9Var, bool);
    }

    public static /* synthetic */ void syncWithDevice$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, iw9 iw9Var, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncWithDevice");
        }
        if ((i & 2) != 0) {
            iw9Var = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        fitnessDataSyncBaseImpl.syncWithDevice(str, iw9Var, bool);
    }

    public static /* synthetic */ Object updateSyncStatus$default(FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl, String str, FitnessDataId fitnessDataId, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSyncStatus");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        return fitnessDataSyncBaseImpl.updateSyncStatus(str, fitnessDataId, i, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitingTheSyncResultAgain(String did) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C15431(did, null), 3, null);
    }

    public final void addSyncResultListener(@NotNull String sid, @Nullable iw9 callback) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        if (callback == null) {
            return;
        }
        List<iw9> arrayList = this.mDeviceSyncResultListener.get(sid);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mDeviceSyncResultListener.put(sid, arrayList);
        }
        arrayList.add(callback);
    }

    public final void checkAllDataToSynced(@NotNull String sid, @Nullable Boolean syncSuccess, @Nullable Boolean syncFinished, boolean syncInvalidVersion) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(sid, syncFinished, syncInvalidVersion, syncSuccess, null), 3, null);
    }

    public abstract void confirmFitnessId$fitness_sync_release(@NotNull String sid, @NotNull FitnessDataId dataId);

    @Nullable
    public final Object deleteSyncStatus(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @SyncStatus int i, @NotNull Continuation<? super Unit> continuation) {
        Object objDelete = getDeviceSyncDao().delete(new DataSyncEntity[]{new DataSyncEntity(str, fitnessDataId.toByteArray(), i, false, 8, null)}, continuation);
        return objDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @NotNull
    public final OnDeviceStatusListener getDeviceStatusListener() {
        return this.deviceStatusListener;
    }

    public final boolean getManualForceCloudSync() {
        return this.manualForceCloudSync;
    }

    @Nullable
    public final Object getSyncStatusLessThan(@NotNull String str, @SyncStatus int i, @NotNull Continuation<? super List<DataSyncEntity>> continuation) {
        return getDeviceSyncDao().getSyncStatusLessThan(str, i, continuation);
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        String string;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != this.MSG_HANDLE_SYNC_RESPONSE) {
            return false;
        }
        Bundle data = msg.getData();
        if (data == null || !data.containsKey(this.EXTRA_KEY_DID) || (string = data.getString(this.EXTRA_KEY_DID)) == null) {
            return true;
        }
        FitnessLogUtils.i(this.TAG_SUMMARY, "timeout, and send false result");
        checkAllDataToSynced$default(this, string, null, Boolean.TRUE, false, 10, null);
        return true;
    }

    public abstract void handleSpecialSyncResult$fitness_sync_release(@NotNull String did, boolean success);

    public final void manualForceSync(boolean manualForce) {
        this.manualForceCloudSync = manualForce;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object onSyncError(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @SyncStatus int i, @NotNull Continuation<? super Unit> continuation) {
        C15411 c15411;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl;
        String str2;
        if (continuation instanceof C15411) {
            c15411 = (C15411) continuation;
            int i2 = c15411.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15411.label = i2 - Integer.MIN_VALUE;
            } else {
                c15411 = new C15411(continuation);
            }
        } else {
            c15411 = new C15411(continuation);
        }
        Object objIsForceSyncedId = c15411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c15411.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objIsForceSyncedId);
            c15411.L$0 = this;
            c15411.L$1 = str;
            c15411.L$2 = fitnessDataId;
            c15411.I$0 = i;
            c15411.label = 1;
            objIsForceSyncedId = isForceSyncedId(str, fitnessDataId, c15411);
            if (objIsForceSyncedId == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessDataSyncBaseImpl = this;
            str2 = str;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c15411.I$0;
            fitnessDataId = (FitnessDataId) c15411.L$2;
            String str3 = (String) c15411.L$1;
            FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl2 = (FitnessDataSyncBaseImpl) c15411.L$0;
            ResultKt.throwOnFailure(objIsForceSyncedId);
            str2 = str3;
            fitnessDataSyncBaseImpl = fitnessDataSyncBaseImpl2;
        }
        boolean zBooleanValue = ((Boolean) objIsForceSyncedId).booleanValue();
        FitnessLogUtils.i(fitnessDataSyncBaseImpl.TAG, "onSyncError: dataId(" + fitnessDataId + "), status(" + i + ")-" + zBooleanValue);
        checkAllDataToSynced$default(fitnessDataSyncBaseImpl, str2, zBooleanValue ? Boxing.boxBoolean(false) : null, null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    /* JADX WARN: Code duplicated, block: B:33:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0126  */
    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:43:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object onSyncSuccess(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @SyncStatus int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        C15421 c15421;
        int i3;
        Object objIsForceSyncedId;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl;
        int i4;
        String str2;
        FitnessDataId fitnessDataId2;
        int i5;
        boolean z;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl2;
        int i6;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl3;
        String str3;
        Boolean boolBoxBoolean;
        FitnessDataId fitnessDataId3;
        int i7;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl4;
        String str4;
        FitnessDataId fitnessDataId4;
        String str5 = str;
        FitnessDataId fitnessDataId5 = fitnessDataId;
        if (continuation instanceof C15421) {
            c15421 = (C15421) continuation;
            int i8 = c15421.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c15421.label = i8 - Integer.MIN_VALUE;
            } else {
                c15421 = new C15421(continuation);
            }
        } else {
            c15421 = new C15421(continuation);
        }
        Object forceSyncStatusLessThan = c15421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = c15421.label;
        Boolean bool = null;
        if (i9 == 0) {
            ResultKt.throwOnFailure(forceSyncStatusLessThan);
            c15421.L$0 = this;
            c15421.L$1 = str5;
            c15421.L$2 = fitnessDataId5;
            i3 = i;
            c15421.I$0 = i3;
            c15421.I$1 = i2;
            c15421.label = 1;
            objIsForceSyncedId = isForceSyncedId(str5, fitnessDataId5, c15421);
            if (objIsForceSyncedId == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessDataSyncBaseImpl = this;
            i4 = i2;
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(forceSyncStatusLessThan);
                        return Unit.INSTANCE;
                    }
                    i7 = c15421.I$0;
                    fitnessDataId4 = (FitnessDataId) c15421.L$2;
                    str4 = (String) c15421.L$1;
                    fitnessDataSyncBaseImpl4 = (FitnessDataSyncBaseImpl) c15421.L$0;
                    ResultKt.throwOnFailure(forceSyncStatusLessThan);
                    bool = null;
                    if (((List) forceSyncStatusLessThan).isEmpty()) {
                        fitnessDataId3 = fitnessDataId4;
                        i6 = i7;
                        fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
                        str3 = str4;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                    } else {
                        str3 = str4;
                        boolBoxBoolean = bool;
                        fitnessDataId3 = fitnessDataId4;
                        i6 = i7;
                        fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
                    }
                    checkAllDataToSynced$default(fitnessDataSyncBaseImpl3, str3, boolBoxBoolean, null, i6 == -2, 4, null);
                    if (i6 != -1 || i6 == 0) {
                        fitnessDataSyncBaseImpl3.confirmFitnessId$fitness_sync_release(str3, fitnessDataId3);
                    }
                    return Unit.INSTANCE;
                }
                z = c15421.Z$0;
                i6 = c15421.I$1;
                int i10 = c15421.I$0;
                FitnessDataId fitnessDataId6 = (FitnessDataId) c15421.L$2;
                String str6 = (String) c15421.L$1;
                FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl5 = (FitnessDataSyncBaseImpl) c15421.L$0;
                ResultKt.throwOnFailure(forceSyncStatusLessThan);
                i5 = i10;
                fitnessDataSyncBaseImpl2 = fitnessDataSyncBaseImpl5;
                fitnessDataId2 = fitnessDataId6;
                str2 = str6;
                FitnessLogUtils.i(fitnessDataSyncBaseImpl2.TAG, "onSyncSuccess: dataId(" + fitnessDataId2 + "), status(" + i5 + ")-force(" + z + ")");
                if (i5 == 2) {
                    c15421.L$0 = bool;
                    c15421.L$1 = bool;
                    c15421.L$2 = bool;
                    c15421.label = 4;
                    if (updateSyncStatus$default(fitnessDataSyncBaseImpl2, str2, fitnessDataId2, i5, false, c15421, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (z) {
                    DeviceDataSyncDao deviceSyncDao = fitnessDataSyncBaseImpl2.getDeviceSyncDao();
                    c15421.L$0 = fitnessDataSyncBaseImpl2;
                    c15421.L$1 = str2;
                    c15421.L$2 = fitnessDataId2;
                    c15421.I$0 = i6;
                    c15421.label = 3;
                    forceSyncStatusLessThan = deviceSyncDao.getForceSyncStatusLessThan(str2, 2, c15421);
                    if (forceSyncStatusLessThan == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i7 = i6;
                    fitnessDataSyncBaseImpl4 = fitnessDataSyncBaseImpl2;
                    str4 = str2;
                    fitnessDataId4 = fitnessDataId2;
                    if (((List) forceSyncStatusLessThan).isEmpty()) {
                        fitnessDataId3 = fitnessDataId4;
                        i6 = i7;
                        fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
                        str3 = str4;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                    } else {
                        str3 = str4;
                        boolBoxBoolean = bool;
                        fitnessDataId3 = fitnessDataId4;
                        i6 = i7;
                        fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
                    }
                } else {
                    fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl2;
                    str3 = str2;
                    boolBoxBoolean = bool;
                    fitnessDataId3 = fitnessDataId2;
                }
                checkAllDataToSynced$default(fitnessDataSyncBaseImpl3, str3, boolBoxBoolean, null, i6 == -2, 4, null);
                if (i6 != -1) {
                    fitnessDataSyncBaseImpl3.confirmFitnessId$fitness_sync_release(str3, fitnessDataId3);
                } else {
                    fitnessDataSyncBaseImpl3.confirmFitnessId$fitness_sync_release(str3, fitnessDataId3);
                }
                return Unit.INSTANCE;
            }
            int i11 = c15421.I$1;
            int i12 = c15421.I$0;
            FitnessDataId fitnessDataId7 = (FitnessDataId) c15421.L$2;
            String str7 = (String) c15421.L$1;
            FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl6 = (FitnessDataSyncBaseImpl) c15421.L$0;
            ResultKt.throwOnFailure(forceSyncStatusLessThan);
            i4 = i11;
            str5 = str7;
            fitnessDataSyncBaseImpl = fitnessDataSyncBaseImpl6;
            objIsForceSyncedId = forceSyncStatusLessThan;
            i3 = i12;
            fitnessDataId5 = fitnessDataId7;
        }
        boolean zBooleanValue = ((Boolean) objIsForceSyncedId).booleanValue();
        c15421.L$0 = fitnessDataSyncBaseImpl;
        c15421.L$1 = str5;
        c15421.L$2 = fitnessDataId5;
        c15421.I$0 = i3;
        c15421.I$1 = i4;
        c15421.Z$0 = zBooleanValue;
        c15421.label = 2;
        FitnessDataSyncBaseImpl fitnessDataSyncBaseImpl7 = fitnessDataSyncBaseImpl;
        int i13 = i4;
        if (fitnessDataSyncBaseImpl.updateSyncStatus(str5, fitnessDataId5, i3, zBooleanValue, c15421) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str2 = str5;
        fitnessDataId2 = fitnessDataId5;
        i5 = i3;
        z = zBooleanValue;
        fitnessDataSyncBaseImpl2 = fitnessDataSyncBaseImpl7;
        i6 = i13;
        FitnessLogUtils.i(fitnessDataSyncBaseImpl2.TAG, "onSyncSuccess: dataId(" + fitnessDataId2 + "), status(" + i5 + ")-force(" + z + ")");
        if (i5 == 2) {
            c15421.L$0 = bool;
            c15421.L$1 = bool;
            c15421.L$2 = bool;
            c15421.label = 4;
            if (updateSyncStatus$default(fitnessDataSyncBaseImpl2, str2, fitnessDataId2, i5, false, c15421, 8, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (z) {
            DeviceDataSyncDao deviceSyncDao2 = fitnessDataSyncBaseImpl2.getDeviceSyncDao();
            c15421.L$0 = fitnessDataSyncBaseImpl2;
            c15421.L$1 = str2;
            c15421.L$2 = fitnessDataId2;
            c15421.I$0 = i6;
            c15421.label = 3;
            forceSyncStatusLessThan = deviceSyncDao2.getForceSyncStatusLessThan(str2, 2, c15421);
            if (forceSyncStatusLessThan == coroutine_suspended) {
                return coroutine_suspended;
            }
            i7 = i6;
            fitnessDataSyncBaseImpl4 = fitnessDataSyncBaseImpl2;
            str4 = str2;
            fitnessDataId4 = fitnessDataId2;
            if (((List) forceSyncStatusLessThan).isEmpty()) {
                fitnessDataId3 = fitnessDataId4;
                i6 = i7;
                fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
                str3 = str4;
                boolBoxBoolean = Boxing.boxBoolean(true);
            } else {
                str3 = str4;
                boolBoxBoolean = bool;
                fitnessDataId3 = fitnessDataId4;
                i6 = i7;
                fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl4;
            }
        } else {
            fitnessDataSyncBaseImpl3 = fitnessDataSyncBaseImpl2;
            str3 = str2;
            boolBoxBoolean = bool;
            fitnessDataId3 = fitnessDataId2;
        }
        checkAllDataToSynced$default(fitnessDataSyncBaseImpl3, str3, boolBoxBoolean, null, i6 == -2, 4, null);
        if (i6 != -1) {
            fitnessDataSyncBaseImpl3.confirmFitnessId$fitness_sync_release(str3, fitnessDataId3);
        } else {
            fitnessDataSyncBaseImpl3.confirmFitnessId$fitness_sync_release(str3, fitnessDataId3);
        }
        return Unit.INSTANCE;
    }

    public final void setManualForceCloudSync(boolean z) {
        this.manualForceCloudSync = z;
    }

    public abstract void startSyncWithDevice$fitness_sync_release(@NotNull String sid, @Nullable iw9 callback, @Nullable Boolean isBgAutoSync);

    public abstract void syncLocalData$fitness_sync_release(@NotNull String sid);

    public final void syncWithDevice(@NotNull String sid, @Nullable iw9 callback, @Nullable Boolean isBgAutoSync) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Pair<String, Boolean> pair = this.hasSyncingTask;
        if (pair != null) {
            Intrinsics.checkNotNull(pair);
            if (TextUtils.equals(sid, pair.getFirst())) {
                Pair<String, Boolean> pair2 = this.hasSyncingTask;
                Intrinsics.checkNotNull(pair2);
                if (pair2.getSecond().booleanValue()) {
                    FitnessLogUtils.i(this.TAG_SUMMARY, "device(" + sid + ") has syncing task, and abort");
                    addSyncResultListener(sid, callback);
                    return;
                }
            }
        }
        FitnessLogUtils.i(this.TAG_SUMMARY, "syncWithDevice(did=" + sid + ")");
        this.hasSyncingTask = new Pair<>(sid, Boolean.TRUE);
        addDeviceConnectListener();
        syncLocalData$fitness_sync_release(sid);
        startSyncWithDevice$fitness_sync_release(sid, callback, isBgAutoSync);
    }

    @Nullable
    public final Object updateSyncStatus(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @SyncStatus int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertAll = getDeviceSyncDao().insertAll(new DataSyncEntity[]{new DataSyncEntity(str, fitnessDataId.toByteArray(), i, z)}, continuation);
        return objInsertAll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertAll : Unit.INSTANCE;
    }
}
