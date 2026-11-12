package com.xiaomi.hm.health.bt.profile.gdsp.rr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/rr/RRData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getRrAppCRC16", "()I", "setRrAppCRC16", "(I)V", "rrAppCRC16", "e", "getRrHwCRC16", "setRrHwCRC16", "rrHwCRC16", "Ljava/util/Calendar;", "timestamp", "dataLen", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RRData extends ActivityDataFragment<Byte> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int rrAppCRC16;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int rrHwCRC16;

    public RRData(@Nullable Calendar calendar, int i) {
        super(calendar, i);
    }

    public final int getRrAppCRC16() {
        return this.rrAppCRC16;
    }

    public final int getRrHwCRC16() {
        return this.rrHwCRC16;
    }

    public final void setRrAppCRC16(int i) {
        this.rrAppCRC16 = i;
    }

    public final void setRrHwCRC16(int i) {
        this.rrHwCRC16 = i;
    }
}
