package com.xiaomi.hm.health.bt.profile.gdsp.firstbeat;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/HMSyncFirstBeatProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "fetchData", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncFirstBeatProfile extends HMProSyncDataBaseProfile {

    @NotNull
    public static final String TAG = "HMSyncFirstBeatProfile";

    public HMSyncFirstBeatProfile(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    @NotNull
    public final List<FirstbeatData> fetchData() {
        Debug.fi(TAG, "sync firstbeat data");
        byte[] bArrFetchRawData = fetchRawData();
        int length = bArrFetchRawData.length;
        if (length % 32 != 0) {
            Debug.fi(TAG, "firstbeat raw data damaged");
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = e.step(e.until(0, length), 32);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i = first + step;
                FirstbeatData fromBytes = FirstbeatData.INSTANCE.parseFromBytes(bArrFetchRawData, first);
                if (fromBytes != null) {
                    arrayList.add(fromBytes);
                }
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }
}
