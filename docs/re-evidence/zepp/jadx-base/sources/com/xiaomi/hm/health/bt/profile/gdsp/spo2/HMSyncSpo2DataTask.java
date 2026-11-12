package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMRawDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B=\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u001a¢\u0006\u0004\b%\u0010&J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/HMSyncSpo2DataTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "error", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/RawData;", "rawData", "", "a", "doWork", "", "b", "Z", "getSupportVersion", "()Z", "supportVersion", "", "c", "B", "getType", "()B", "type", "Ljava/util/Calendar;", GoogleApiAvailabilityLight.a, "Ljava/util/Calendar;", "mStartTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/HMSyncSpo2Profile;", "f", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/HMSyncSpo2Profile;", "mProfile", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(ZLcom/xiaomi/hm/health/bt/gatt/GattPeripheral;BLjava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncSpo2DataTask extends HMBaseTask {

    @NotNull
    private static final String g = "HMSyncSpo2DataTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean supportVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final byte type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Calendar mStartTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IHMDataCallback<List<Spo2Data>> mCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final HMSyncSpo2Profile mProfile;

    public /* synthetic */ HMSyncSpo2DataTask(boolean z, GattPeripheral gattPeripheral, byte b, Calendar calendar, IHMDataCallback iHMDataCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, gattPeripheral, b, calendar, iHMDataCallback);
    }

    private final void a(int error, List<RawData> rawData) {
        IHMDataCallback<List<Spo2Data>> iHMDataCallback = this.mCallback;
        if (iHMDataCallback instanceof IHMRawDataCallback) {
            if (error != 0) {
                ((IHMRawDataCallback) iHMDataCallback).onRawData(null);
            } else {
                ((IHMRawDataCallback) iHMDataCallback).onRawData(rawData);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.mCallback.onStart();
        int i = 2;
        if (!this.mProfile.init()) {
            Debug.i(g, "init failed!!!");
            this.mCallback.onStop(null, new HMDeviceError(2));
            return;
        }
        Debug.fi(g, "start sync time : " + this.mStartTime.getTime() + ", type: " + ((int) this.type));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            DataHeader gpsHeader = this.mProfile.getGpsHeader(this.mStartTime, this.type);
            if (gpsHeader == null) {
                Debug.fi(g, "get header failed!!!");
                break;
            }
            if (gpsHeader.size <= 0) {
                Debug.fi(g, "return as size is 0 !!!");
                i = 0;
                break;
            }
            byte[] bArrFetchData = this.mProfile.fetchData();
            List<Spo2Data> data = this.mProfile.parseData(bArrFetchData);
            if (data == null || bArrFetchData == null) {
                Debug.fi(g, "return as spo2 data is null!!!");
                i = 100;
                break;
            }
            arrayList2.add(new RawData(bArrFetchData, gpsHeader.calendar));
            Debug.i(g, Intrinsics.stringPlus("spo2Data:", data));
            arrayList.addAll(data);
            Debug.fi(g, Intrinsics.stringPlus("allSpo2Data size: ", Integer.valueOf(arrayList.size())));
            byte b = this.type;
            if (b == 37 || b == 39 || b == 43 || b == 38) {
                this.mStartTime.setTimeInMillis((((Spo2Data) CollectionsKt.last((List) arrayList)).getTimeStamp() * ((long) 1000)) + ((long) 30000));
            } else if (b == 40) {
                this.mStartTime.setTimeInMillis(((Spo2OdiData) CollectionsKt.last((List) arrayList)).getStopTime() * ((long) 1000));
            }
        }
        this.mProfile.stopTransfer();
        this.mProfile.deInit();
        a(i, arrayList2);
        this.mCallback.onStop(arrayList, new HMDeviceError(i));
    }

    public final boolean getSupportVersion() {
        return this.supportVersion;
    }

    public final byte getType() {
        return this.type;
    }

    public HMSyncSpo2DataTask(boolean z, @NotNull GattPeripheral gattPeripheral, byte b, @NotNull Calendar calendar, @NotNull IHMDataCallback<List<Spo2Data>> iHMDataCallback) {
        this.supportVersion = z;
        this.type = b;
        this.mStartTime = calendar;
        this.mCallback = iHMDataCallback;
        this.mProfile = new HMSyncSpo2Profile(gattPeripheral, b, z);
    }
}
