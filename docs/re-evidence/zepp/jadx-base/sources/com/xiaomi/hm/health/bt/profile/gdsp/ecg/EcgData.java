package com.xiaomi.hm.health.bt.profile.gdsp.ecg;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/EcgData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getExtRawData", "()Ljava/util/List;", "setExtRawData", "(Ljava/util/List;)V", "extRawData", "", "e", "getLodData", "setLodData", "lodData", "", "f", "getDeviceLodData", "setDeviceLodData", "deviceLodData", "Ljava/util/Calendar;", "timeStamp", "dataLength", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EcgData extends ActivityDataFragment<Float> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<Byte> extRawData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<Integer> lodData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<int[]> deviceLodData;

    public EcgData(@NotNull Calendar calendar, int i) {
        super(calendar, i);
    }

    @Nullable
    public final List<int[]> getDeviceLodData() {
        return this.deviceLodData;
    }

    @Nullable
    public final List<Byte> getExtRawData() {
        return this.extRawData;
    }

    @Nullable
    public final List<Integer> getLodData() {
        return this.lodData;
    }

    public final void setDeviceLodData(@Nullable List<int[]> list) {
        this.deviceLodData = list;
    }

    public final void setExtRawData(@Nullable List<Byte> list) {
        this.extRawData = list;
    }

    public final void setLodData(@Nullable List<Integer> list) {
        this.lodData = list;
    }
}
