package com.xiaomi.hm.health.bt.profile.gdsp.pressure;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IPressureAllDayDataListener;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IPressureSingleDataListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMSyncPressureTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "b", "a", "doWork", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "callback", "", GoogleApiAvailabilityLight.a, "Z", "isSingle", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataProfile;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataProfile;", Scopes.PROFILE, "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncPressureTask extends HMBaseTask {
    private static final int f = 2;

    @NotNull
    private static final String g = "HMSyncPressureTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Calendar startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMPressureDataCallback callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSingle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMProSyncDataProfile profile;

    public HMSyncPressureTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMPressureDataCallback iHMPressureDataCallback, boolean z) {
        this.startTime = calendar;
        this.callback = iHMPressureDataCallback;
        this.isSingle = z;
        this.profile = new HMProSyncDataProfile(gattPeripheral);
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    private final void a() {
        ArrayList<HMPressureData> arrayList;
        final Ref.IntRef intRef = new Ref.IntRef();
        ArrayList<HMPressureData> arrayList2 = new ArrayList<>();
        ?? r10 = 0;
        DataHeader dataHeader = this.profile.getDataHeader(this.startTime, (byte) 19);
        int i = 0;
        int i2 = 0;
        while (dataHeader != null) {
            intRef.element = r10;
            int i3 = dataHeader.size;
            if (dataHeader.getErrorCode() != 1) {
                Debug.fi(g, Intrinsics.stringPlus("return as cmd error:", Integer.valueOf(dataHeader.getErrorCode())));
                break;
            }
            if (i3 <= 0) {
                Debug.fi(g, Intrinsics.stringPlus("return as no data size:", Integer.valueOf(i3)));
                break;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(r10);
            final ArrayList arrayList3 = new ArrayList();
            long j = 1000;
            final long dstOffset = ((long) ProfileUtils.getDstOffset(dataHeader.calendar)) + ((dataHeader.calendar.getTimeInMillis() / j) * j);
            int i4 = i;
            ArrayList<HMPressureData> arrayList4 = arrayList2;
            if (!this.profile.fetchPressureAllDayData(new IPressureAllDayDataListener() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMSyncPressureTask$doPressureAllDayWork$success$1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IPressureAllDayDataListener
                public void onDataMissing() {
                    Debug.fi("HMSyncPressureTask", "onDataMissing!!!");
                    atomicBoolean.set(true);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IPressureAllDayDataListener
                public void onDataReceived(@NotNull List<Integer> data) {
                    ArrayList<HMPressureData> arrayList5 = arrayList3;
                    long j2 = dstOffset;
                    Ref.IntRef intRef2 = intRef;
                    int i5 = 0;
                    for (Object obj : data) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList5.add(new HMPressureData(((long) ((intRef2.element + i5) * 1000 * 60)) + j2, ((Number) obj).intValue()));
                        i5 = i6;
                    }
                    intRef.element += data.size();
                }
            })) {
                Debug.fi(g, "fetchData failed!!!");
            }
            this.profile.stopTransfer();
            Debug.fi(g, "mReceivedSize:" + intRef.element + ",header size:" + i3);
            this.startTime = (Calendar) dataHeader.calendar.clone();
            if ((atomicBoolean.get() || intRef.element < i3) && i2 < 2) {
                Debug.fi(g, Intrinsics.stringPlus("retry:", Integer.valueOf(i2)));
                i2++;
                i = i4;
                arrayList = arrayList4;
                i3 = 0;
            } else {
                arrayList = arrayList4;
                arrayList.addAll(arrayList3);
                i = i4 + i3;
                i2 = 0;
            }
            this.startTime.add(12, i3);
            this.startTime.add(13, 1);
            Debug.fi(g, Intrinsics.stringPlus("update start time:", this.startTime.getTime()));
            dataHeader = this.profile.getDataHeader(this.startTime, (byte) 19);
            arrayList2 = arrayList;
            r10 = 0;
        }
        ArrayList<HMPressureData> arrayList5 = arrayList2;
        int i5 = i;
        this.profile.stopTransfer();
        this.profile.deInit();
        this.callback.onPressureData(arrayList5);
        this.callback.onPressureStop(arrayList5.size() == i5);
    }

    private final void b() {
        DataHeader dataHeader = this.profile.getDataHeader(this.startTime, (byte) 18);
        if (dataHeader == null) {
            Debug.i(g, "get header failed!!!");
            this.profile.stopTransfer();
            this.profile.deInit();
            this.callback.onPressureStop(false);
            return;
        }
        if (dataHeader.size <= 0) {
            Debug.i(g, "size is 0 !!!");
            this.profile.stopTransfer();
            this.profile.deInit();
            this.callback.onPressureStop(true);
            return;
        }
        final ArrayList<HMPressureData> arrayList = new ArrayList<>();
        this.profile.fetchPressureSingleData(new IPressureSingleDataListener() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMSyncPressureTask$doPressureSingleWork$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IPressureSingleDataListener
            public void onDataReceived(@NotNull ArrayList<HMPressureData> data) {
                arrayList.addAll(data);
            }
        });
        this.profile.stopTransfer();
        this.profile.deInit();
        this.callback.onPressureData(arrayList);
        this.callback.onPressureStop(true);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.callback.onPressureStart();
        if (!this.profile.init()) {
            Debug.i(g, "init failed!!!");
            this.callback.onPressureStop(false);
        } else if (this.isSingle) {
            b();
        } else {
            a();
        }
    }
}
