package com.huami.reddot;

import android.annotation.SuppressLint;
import com.huami.reddot.entity.DeviceEntranceRedDotInfo;
import com.huami.reddot.network.RedDotAPI;
import com.huami.tools.log.HMLog;
import rx.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class RedDotManager {
    private static final String c = "Discovery-Manager";

    @SuppressLint({"StaticFieldLeak"})
    private static RedDotManager d;
    private RedDotProvider a = RedDotProvider.getProvider();
    private Subscription b;

    private RedDotManager() {
    }

    public static RedDotManager getManager() {
        if (d == null) {
            d = new RedDotManager();
        }
        return d;
    }

    public void cancelCheckNew() {
        if (this.b != null) {
            HMLog.d(c, "Cancel CheckNew!!", new Object[0]);
            this.b.unsubscribe();
            this.b = null;
        }
    }

    public void clear() {
        this.a.clear();
        RedDotAPI.clear();
        DeviceEntranceRedDotInfo.clear();
    }

    public String getRedDotCountStr(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(Math.min(i, 99));
        objArr[1] = i > 99 ? "+" : "";
        return String.format("%s%s", objArr);
    }

    public void updateHomeDotDismissTime(long j) {
        if (j > this.a.readLastHomeDotDismissTime()) {
            this.a.saveHomeDotDismissTime(j);
        }
    }
}
