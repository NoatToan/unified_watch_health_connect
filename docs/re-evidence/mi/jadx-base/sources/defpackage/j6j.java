package defpackage;

import com.xiaomi.hm.health.bt.model.HMReminderInfo;

/* JADX INFO: loaded from: classes4.dex */
public class j6j extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22464b = "RCHeader";
    public byte c;
    public short d;

    public j6j(byte b2, short s) {
        this.c = b2;
        this.d = s;
        this.f31524a = new byte[]{b2, (byte) (s / HMReminderInfo.FLAG_THURSDAY), (byte) (s % HMReminderInfo.FLAG_THURSDAY)};
    }
}
