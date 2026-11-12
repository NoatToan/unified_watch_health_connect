package com.huami.respiratoryrate.bluetooth.device;

import com.huami.respiratoryrate.bluetooth.transform.IBleTransform;
import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.repo.ISyncTimeRepo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateData;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateDataSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEvent;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEventSyncParam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J3\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f0\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0097@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/device/RespRateDeviceApiImpl;", "Lcom/huami/respiratoryrate/bluetooth/device/IDeviceApi;", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "timeMillis", "Lcom/huami/respiratoryrate/bluetooth/device/DeviceSyncCallback;", "callback", "", "a", "Lkotlin/Pair;", "", "syncRespRateFromDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/respiratoryrate/bluetooth/transform/IBleTransform;", "Lcom/huami/respiratoryrate/bluetooth/transform/IBleTransform;", "transform", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "b", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "syncTimeRepo", "", "c", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/respiratoryrate/bluetooth/transform/IBleTransform;Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateDeviceApiImpl implements IDeviceApi<RespRateEntity> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBleTransform<RespRateEntity> transform;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISyncTimeRepo syncTimeRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public RespRateDeviceApiImpl(@NotNull IBleTransform<RespRateEntity> iBleTransform, @NotNull ISyncTimeRepo iSyncTimeRepo, @NotNull String str) {
        this.transform = iBleTransform;
        this.syncTimeRepo = iSyncTimeRepo;
        this.userId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(HMBaseDevice device, long timeMillis, final DeviceSyncCallback callback) {
        if (device instanceof HMMiLiProDevice) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timeMillis);
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
            hMMiLiProDevice.syncGdspListData(new BreathRateDataSyncParam(calendar), new HMCallback<List<? extends BreathRateData>>() { // from class: com.huami.respiratoryrate.bluetooth.device.RespRateDeviceApiImpl$syncFromDevice$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ List<BreathRateData> a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(List<BreathRateData> list) {
                        super(0);
                        this.a = list;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        List<BreathRateData> list = this.a;
                        return String.valueOf(list == null ? null : Integer.valueOf(list.size()));
                    }
                }

                {
                    super(false);
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onData(List<? extends BreathRateData> list) {
                    onData2((List<BreathRateData>) list);
                }

                /* JADX INFO: renamed from: onData, reason: avoid collision after fix types in other method */
                public void onData2(@Nullable List<BreathRateData> data) {
                    super.onData(data);
                    HMLog.info(RespRateConstants.TAG, new a(data));
                    callback.onFinished(data);
                }
            });
            hMMiLiProDevice.syncGdspListData(new BreathRateEventSyncParam(calendar), new HMCallback<List<? extends BreathRateEvent>>() { // from class: com.huami.respiratoryrate.bluetooth.device.RespRateDeviceApiImpl$syncFromDevice$2
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onData(List<? extends BreathRateEvent> list) {
                    onData2((List<BreathRateEvent>) list);
                }

                /* JADX INFO: renamed from: onData, reason: avoid collision after fix types in other method */
                public void onData2(@Nullable List<BreathRateEvent> t) {
                    super.onData(t);
                }
            });
        }
    }

    @Override // com.huami.respiratoryrate.bluetooth.device.IDeviceApi
    @ExperimentalCoroutinesApi
    @Nullable
    public Object syncRespRateFromDevice(@Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Pair<Long, ? extends List<? extends RespRateEntity>>> continuation) {
        long syncTime = this.syncTimeRepo.getSyncTime();
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a(hMBaseDevice, syncTime, new DeviceSyncCallback() { // from class: com.huami.respiratoryrate.bluetooth.device.RespRateDeviceApiImpl$syncRespRateFromDevice$2$1
            @Override // com.huami.respiratoryrate.bluetooth.device.DeviceSyncCallback
            public void onFinished(@Nullable List<BreathRateData> data) {
                BreathRateData breathRateData;
                Calendar calendar;
                ArrayList arrayList = null;
                Long lValueOf = (data == null || (breathRateData = (BreathRateData) CollectionsKt.lastOrNull((List) data)) == null || (calendar = breathRateData.getCalendar()) == null) ? null : Long.valueOf(calendar.getTimeInMillis());
                if (data != null) {
                    RespRateDeviceApiImpl respRateDeviceApiImpl = this;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                    Iterator<T> it2 = data.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((RespRateEntity) respRateDeviceApiImpl.transform.toDatabaseEntity((BreathRateData) it2.next(), respRateDeviceApiImpl.userId));
                    }
                    arrayList = arrayList2;
                }
                Pair pair = new Pair(lValueOf, arrayList);
                CancellableContinuation<Pair<Long, ? extends List<RespRateEntity>>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(pair));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
