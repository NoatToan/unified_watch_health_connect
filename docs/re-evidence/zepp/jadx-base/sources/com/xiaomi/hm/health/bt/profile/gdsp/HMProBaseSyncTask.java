package com.xiaomi.hm.health.bt.profile.gdsp;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "后续请不要使用，有使用需求，请参考GdspFactory")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001b8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/HMProBaseSyncTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", "doWork", "", "dataList", "updateStartTime", "fetchData", "", "b", "B", "getDataType", "()B", "dataType", "", "c", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "getProfile", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", Scopes.PROFILE, "Ljava/util/Calendar;", "getStartTimeCalendar", "()Ljava/util/Calendar;", "startTimeCalendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "callback", "<init>", "(B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HMProBaseSyncTask<T> extends HMBaseTask {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte dataType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "HMProBaseSyncTask";

    public HMProBaseSyncTask(byte b) {
        this.dataType = b;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        Debug.fi(this.TAG, Intrinsics.stringPlus("start sync data:", Byte.valueOf(this.dataType)));
        getCallback().onStart();
        int i = 2;
        if (!getProfile().init()) {
            Debug.fi(this.TAG, "init profile failed while sync data");
            getCallback().onStop(CollectionsKt__CollectionsKt.emptyList(), new HMDeviceError(2));
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            DataHeader dataHeader = getProfile().getDataHeader(getStartTimeCalendar(), this.dataType);
            if (dataHeader == null) {
                Debug.fi(this.TAG, "get header failed");
                break;
            }
            if (dataHeader.size <= 0) {
                Debug.fi(this.TAG, "return as size is 0");
                i = 4;
                break;
            }
            List<T> listFetchData = fetchData();
            if (listFetchData.isEmpty()) {
                Debug.fi(this.TAG, "data(" + ((int) this.dataType) + ") is null");
                i = 100;
                break;
            }
            arrayList.addAll(listFetchData);
            updateStartTime(arrayList);
        }
        getCallback().onStop(arrayList, new HMDeviceError(i));
        getProfile().stopTransfer();
        getProfile().deInit();
        Debug.fi(this.TAG, "start sync data(" + ((int) this.dataType) + ") finished");
    }

    @NotNull
    public abstract List<T> fetchData();

    @NotNull
    public abstract IHMDataCallback<List<T>> getCallback();

    public final byte getDataType() {
        return this.dataType;
    }

    @NotNull
    public abstract HMProSyncDataBaseProfile getProfile();

    @NotNull
    public abstract Calendar getStartTimeCalendar();

    public abstract void updateStartTime(@NotNull List<? extends T> dataList);
}
