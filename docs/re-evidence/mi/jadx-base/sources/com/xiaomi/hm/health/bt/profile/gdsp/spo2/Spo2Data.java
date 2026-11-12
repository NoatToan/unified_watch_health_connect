package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", SportConstants.KEY_TIMESTAMP, "", "(J)V", "getTimeStamp", "()J", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class Spo2Data {
    private final long timeStamp;

    public Spo2Data(long j) {
        this.timeStamp = j;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }
}
