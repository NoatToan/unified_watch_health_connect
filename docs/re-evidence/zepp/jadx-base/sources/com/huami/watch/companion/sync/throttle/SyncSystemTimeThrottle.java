package com.huami.watch.companion.sync.throttle;

import android.text.TextUtils;
import com.huami.watch.companion.sync.throttle.bean.SyncSystemTimeTag;
import com.huami.watch.companion.sync.throttle.bean.SyncTag;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class SyncSystemTimeThrottle extends SyncIntervalThrottle {
    private static final String e = "SyncSystemTime-TimeChanged";
    private static final String f = "SyncSystemTime-TransChannelAvailable";
    private String c;
    private int d;

    public SyncSystemTimeThrottle(long j, int i) {
        super(j);
        this.d = i;
    }

    private int a(String str, long j) {
        String strB = b(str);
        String date = TimeUtil.formatDate(j);
        String str2 = !TextUtils.isEmpty(strB) ? strB.split("_")[0] : null;
        if (TextUtils.isEmpty(str2) || !str2.equals(date)) {
            return 0;
        }
        return Integer.valueOf(strB.split("_")[1]).intValue();
    }

    private String b(String str) {
        String strC = c(str);
        String string = SyncThrottler.b.getString(strC);
        Log.d(tag(), "LastSync DateWithCount : " + string + ", Key : " + strC, new Object[0]);
        return string;
    }

    private String c(String str) {
        if (SyncThrottler.FROM_TIME_CHANGED.equals(str)) {
            return e;
        }
        return SyncThrottler.FROM_TRANS_CHANNEL_AVAILABLE.equals(str) ? f : "";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0040  */
    @Override // com.huami.watch.companion.sync.throttle.SyncIntervalThrottle, com.huami.watch.companion.sync.throttle.a
    public boolean isThrough(SyncTag syncTag) {
        boolean z;
        boolean z2;
        boolean zIsThrough = super.isThrough(syncTag);
        if (syncTag instanceof SyncSystemTimeTag) {
            String timeZoneID = ((SyncSystemTimeTag) syncTag).getTimeZoneID();
            Log.d(tag(), syncTag.getName() + ", Last TimeZoneID : " + this.c, new Object[0]);
            if (timeZoneID == null || timeZoneID.equals(this.c)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (zIsThrough) {
            int iA = a(syncTag.getFrom(), syncTag.getTime());
            Log.d(tag(), "LastSync Count : " + iA + " >= " + this.d + "?", new Object[0]);
            if (iA >= this.d) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return (zIsThrough && !z2) || z;
    }

    @Override // com.huami.watch.companion.sync.throttle.SyncIntervalThrottle
    public String tag() {
        return super.tag() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + SyncThrottler.SYNC_SYSTEM_TIME;
    }

    @Override // com.huami.watch.companion.sync.throttle.SyncIntervalThrottle, com.huami.watch.companion.sync.throttle.a
    public void updateSyncTag(SyncTag syncTag) {
        updateSyncTime(syncTag.getTime());
        if (syncTag instanceof SyncSystemTimeTag) {
            this.c = ((SyncSystemTimeTag) syncTag).getTimeZoneID();
        }
        String strC = c(syncTag.getFrom());
        String strB = b(syncTag.getFrom());
        String date = TimeUtil.formatDate(syncTag.getTime());
        String str = TextUtils.isEmpty(strB) ? null : strB.split("_")[0];
        int iIntValue = 1;
        if (!TextUtils.isEmpty(str) && str.equals(date)) {
            iIntValue = 1 + Integer.valueOf(strB.split("_")[1]).intValue();
        }
        Log.d(tag(), "Update SyncCount : " + date + "_" + iIntValue, new Object[0]);
        SyncThrottler.b.put(strC, date + "_" + iIntValue);
    }
}
