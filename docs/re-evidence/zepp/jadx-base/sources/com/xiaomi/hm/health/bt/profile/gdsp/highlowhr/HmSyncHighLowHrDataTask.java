package com.xiaomi.hm.health.bt.profile.gdsp.highlowhr;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmSyncHighLowHrDataTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "b", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/Calendar;", "c", "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmHighLowHrData;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmSyncHighLowHrProfile;", "e", "Lkotlin/Lazy;", "a", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmSyncHighLowHrProfile;", "mProfile", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmSyncHighLowHrDataTask extends HMBaseTask {

    @NotNull
    private static final String f = "HMBaseTask-SyncHighLowHrData";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Calendar mStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IHMDataCallback<List<HmHighLowHrData>> mCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProfile = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmSyncHighLowHrProfile;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HmSyncHighLowHrProfile> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HmSyncHighLowHrProfile invoke() {
            return new HmSyncHighLowHrProfile(HmSyncHighLowHrDataTask.this.gattPeripheral);
        }
    }

    public HmSyncHighLowHrDataTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMDataCallback<List<HmHighLowHrData>> iHMDataCallback) {
        this.gattPeripheral = gattPeripheral;
        this.mStartTime = calendar;
        this.mCallback = iHMDataCallback;
    }

    private final HmSyncHighLowHrProfile a() {
        return (HmSyncHighLowHrProfile) this.mProfile.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.onStart();
        int i = 2;
        if (!a().init()) {
            Debug.i(f, "init failed!!!");
            this.mCallback.onStop(null, new HMDeviceError(2));
            return;
        }
        Debug.i(f, Intrinsics.stringPlus("start sync time :", this.mStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            DataHeader dataHeader = a().getDataHeader(this.mStartTime);
            if (dataHeader == null) {
                Debug.fi(f, "get header failed!!!");
                break;
            }
            if (dataHeader.size <= 0) {
                Debug.fi(f, "return as size is 0 !!!");
                i = 0;
                break;
            }
            List<HmHighLowHrData> listFetchData = a().fetchData();
            if (listFetchData == null) {
                Debug.fi(f, "return as highLowHr data is null!!!");
                i = 100;
                break;
            } else {
                arrayList.addAll(listFetchData);
                this.mStartTime.setTimeInMillis(dataHeader.calendar.getTimeInMillis() + ((long) 1000));
            }
        }
        a().stopTransfer();
        a().deInit();
        this.mCallback.onStop(arrayList, new HMDeviceError(i));
    }
}
