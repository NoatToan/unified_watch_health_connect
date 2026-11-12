package com.xiaomi.hm.health.bt.profile.gdsp.firstbeat;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\b8\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/HMProSyncFirstbeatTask;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMProBaseSyncTask;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "", "dataList", "", "updateStartTime", "fetchData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/HMSyncFirstBeatProfile;", "e", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/HMSyncFirstBeatProfile;", "getProfile", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/HMSyncFirstBeatProfile;", Scopes.PROFILE, "Ljava/util/Calendar;", "f", "Ljava/util/Calendar;", "getStartTimeCalendar", "()Ljava/util/Calendar;", "startTimeCalendar", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "calendar", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMProSyncFirstbeatTask extends HMProBaseSyncTask<FirstbeatData> {

    @NotNull
    public static final String TAG = "HMProSyncFirstbeatTask";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IHMDataCallback<List<FirstbeatData>> callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HMSyncFirstBeatProfile profile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTimeCalendar;

    public HMProSyncFirstbeatTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar calendar, @NotNull IHMDataCallback<List<FirstbeatData>> iHMDataCallback) {
        super((byte) 35);
        this.callback = iHMDataCallback;
        this.profile = new HMSyncFirstBeatProfile(gattPeripheral);
        this.startTimeCalendar = (Calendar) calendar.clone();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask
    @NotNull
    public List<FirstbeatData> fetchData() {
        return getProfile().fetchData();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask
    @NotNull
    public IHMDataCallback<List<FirstbeatData>> getCallback() {
        return this.callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask
    @NotNull
    public Calendar getStartTimeCalendar() {
        return this.startTimeCalendar;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask
    public void updateStartTime(@NotNull List<? extends FirstbeatData> dataList) {
        Object obj;
        Iterator<T> it2 = dataList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int updateTime = ((FirstbeatData) next).getUpdateTime();
                do {
                    Object next2 = it2.next();
                    int updateTime2 = ((FirstbeatData) next2).getUpdateTime();
                    if (updateTime < updateTime2) {
                        next = next2;
                        updateTime = updateTime2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        FirstbeatData firstbeatData = (FirstbeatData) obj;
        if (firstbeatData == null) {
            return;
        }
        Calendar startTimeCalendar = getStartTimeCalendar();
        startTimeCalendar.setTimeInMillis(firstbeatData.getUpdateTime());
        startTimeCalendar.setTimeZone(ProfileUtils.getTimezone((byte) firstbeatData.getZone()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.HMProBaseSyncTask
    @NotNull
    public HMSyncFirstBeatProfile getProfile() {
        return this.profile;
    }
}
