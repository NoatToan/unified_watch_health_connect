package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes22.dex */
public class HMMediaInfo implements Cloneable {
    private static final String c = "HMMediaInfo";
    public String a;
    public String b;
    public long duration;
    public long position;
    public HMMediaState state = HMMediaState.DISABLE;
    public String title;

    public boolean a(HMMediaInfo info) {
        if (info == null) {
            HMLog.d(c, "prevInfo null.", new Object[0]);
            return true;
        }
        if (!TextUtils.equals(this.a, info.a)) {
            HMLog.d(c, "artist: " + this.a + ", " + info.a, new Object[0]);
            return true;
        }
        if (!TextUtils.equals(this.b, info.b)) {
            HMLog.d(c, "album: " + this.b + ", " + info.b, new Object[0]);
            return true;
        }
        if (this.duration != info.duration) {
            HMLog.d(c, "duration: " + this.duration + ", " + info.duration, new Object[0]);
            return true;
        }
        if (this.state != info.state) {
            HMLog.d(c, "state: " + this.state + ", " + info.state, new Object[0]);
            return true;
        }
        long j = this.position;
        long j2 = info.position;
        if (j - j2 <= 5000 && j >= j2) {
            return false;
        }
        HMLog.d(c, "position: " + this.position + ", " + info.position, new Object[0]);
        return true;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "artist: " + this.a + ", album: " + this.b + ", title: " + this.title + ", state: " + this.state + ", duration: " + this.duration + ", position: " + this.position;
    }
}
