package com.xiaomi.hm.health.bt.profile.adreminder;

import com.alipay.sdk.m.u.i;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AdReminder {
    private static final String g = "AdReminder";
    private static final short h = 1;
    private static final short i = 0;
    private short a;
    private byte b;
    private Calendar d;
    private Calendar e;
    private byte c = 1;
    private List<GoalReminder> f = new ArrayList();

    public static byte[] a(Calendar calendar) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) calendar.get(1)));
        byteArrayOutputStream.write(calendar.get(2) + 1);
        byteArrayOutputStream.write(calendar.get(5));
        byteArrayOutputStream.write(calendar.get(11));
        byteArrayOutputStream.write(calendar.get(12));
        return byteArrayOutputStream.toByteArray();
    }

    public void addGoalReminder(GoalReminder goalReminder) {
        this.f.add(goalReminder);
    }

    public short getFlag() {
        return this.a;
    }

    public byte getIndex() {
        return this.b;
    }

    public Calendar getStartTime() {
        return this.d;
    }

    public Calendar getStopTime() {
        return this.e;
    }

    public byte getVersion() {
        return this.c;
    }

    public void setEnable(boolean enable) {
        if (enable) {
            this.a = (short) 1;
        } else {
            this.a = (short) 0;
        }
    }

    public void setFlag(short flag) {
        this.a = flag;
    }

    public void setIndex(byte index) {
        this.b = index;
    }

    public void setStartTime(Calendar startTime) {
        this.d = startTime;
    }

    public void setStopTime(Calendar stopTime) {
        this.e = stopTime;
    }

    public void setVersion(byte version) {
        this.c = version;
    }

    public byte[] toBleBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.c);
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(GattUtils.shortToBytes(this.a));
            if ((this.a & 1) == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(a(this.d));
            byteArrayOutputStream.write(a(this.e));
            byteArrayOutputStream.write(this.f.size());
            Iterator<GoalReminder> it2 = this.f.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(it2.next().a());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.fi(g, "toBleBytes: " + e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdReminder{flag=");
        sb.append((int) this.a);
        sb.append(", index=");
        sb.append((int) this.b);
        sb.append(", version=");
        sb.append((int) this.c);
        sb.append(", startTime=");
        Calendar calendar = this.d;
        sb.append(calendar == null ? "null" : calendar.getTime());
        sb.append(", stopTime=");
        Calendar calendar2 = this.e;
        sb.append(calendar2 == null ? "null" : calendar2.getTime());
        sb.append(", goals=");
        List<GoalReminder> list = this.f;
        sb.append(list != null ? Arrays.toString(list.toArray()) : "null");
        sb.append(i.d);
        return sb.toString();
    }
}
