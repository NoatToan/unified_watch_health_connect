package com.xiaomi.hm.health.bt.profile.gdsp.pai;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class HMPaiData {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 4;
    public static final int D = 5;
    public static final int OP_DELETE_ZONE_MINUTES = 3;
    public static final int OP_SET_ACTIVITY_SCORES = 1;
    public static final int OP_SET_MAX_HR_OFFSET = 4;
    public static final int OP_SET_ZONE_MINUTES = 2;
    public static final int OP_WRITE_BACK_PAI_INFO = 5;
    public static final int TYPE_REALTIME = 1;
    public static final int z = 0;
    private long a;
    private long b;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private List<HMWriteBackPaiInfo> w;
    private float[] c = new float[7];
    private int o = 0;
    private int p = 0;
    private float[] q = new float[7];
    private int r = 0;
    private int s = 0;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int x = 0;
    private int y = 1;

    public void a(float dailyPai) {
        this.j = dailyPai;
    }

    public void b(float highZonePai) {
        this.f = highZonePai;
    }

    public void c(float lowZonePai) {
        this.d = lowZonePai;
    }

    public void d(int maxHr) {
        this.m = maxHr;
    }

    public void e(float mediumZonePai) {
        this.e = mediumZonePai;
    }

    public void f(float[] nextActivityScores) {
        this.q = nextActivityScores;
    }

    public void g(int restHr) {
        this.l = restHr;
    }

    public float[] getActivityScores() {
        return this.c;
    }

    public int getAge() {
        return this.s;
    }

    public float getDailyPai() {
        return this.j;
    }

    public int getGender() {
        return this.r;
    }

    public int getHighZoneLimit() {
        return this.v;
    }

    public int getHighZoneMinutes() {
        return this.i;
    }

    public float getHighZonePai() {
        return this.f;
    }

    public int getIndex() {
        return this.n;
    }

    public int getLowZoneLimit() {
        return this.t;
    }

    public int getLowZoneMinutes() {
        return this.g;
    }

    public float getLowZonePai() {
        return this.d;
    }

    public int getMaxHr() {
        return this.m;
    }

    public int getMaxHrOffset() {
        return this.x;
    }

    public int getMediumZoneLimit() {
        return this.u;
    }

    public int getMediumZoneMinutes() {
        return this.h;
    }

    public float getMediumZonePai() {
        return this.e;
    }

    public float[] getNextActivityScores() {
        return this.q;
    }

    public int getOp() {
        return this.y;
    }

    public int getRestHr() {
        return this.l;
    }

    public long getTime() {
        return this.a;
    }

    public long getTimezone() {
        return this.b;
    }

    public float getTotalPai() {
        return this.k;
    }

    public int getType() {
        return this.o;
    }

    public int getVersion() {
        return this.p;
    }

    public byte[] getWriteBytes() throws Exception {
        return getWriteBytes(1);
    }

    public void h(float totalPai) {
        this.k = totalPai;
    }

    public void setActivityScores(float[] activityScores) {
        this.c = activityScores;
    }

    public void setAge(int age) {
        this.s = age;
    }

    public void setGender(int gender) {
        this.r = gender;
    }

    public void setHighZoneLimit(int highZoneLimit) {
        this.v = highZoneLimit;
    }

    public void setHighZoneMinutes(int highZoneMinutes) {
        this.i = highZoneMinutes;
    }

    public void setIndex(int index) {
        this.n = index;
    }

    public void setLowZoneLimit(int lowZoneLimit) {
        this.t = lowZoneLimit;
    }

    public void setLowZoneMinutes(int lowZoneMinutes) {
        this.g = lowZoneMinutes;
    }

    public void setMaxHrOffset(int maxHrOffset) {
        this.x = maxHrOffset;
    }

    public void setMediumZoneLimit(int mediumZoneLimit) {
        this.u = mediumZoneLimit;
    }

    public void setMediumZoneMinutes(int mediumZoneMinutes) {
        this.h = mediumZoneMinutes;
    }

    public void setOp(int op) {
        this.y = op;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public void setTimezone(long timezone) {
        this.b = timezone;
    }

    public void setType(int type) {
        this.o = type;
    }

    public void setVersion(int version) {
        this.p = version;
    }

    public void setWriteBackPaiList(List<HMWriteBackPaiInfo> writeBackPaiList) {
        this.w = writeBackPaiList;
    }

    @NonNull
    public String toString() {
        return "HMPaiData{time=" + this.a + ", timezone=" + this.b + ", activityScores=" + Arrays.toString(this.c) + ", lowZonePai=" + this.d + ", mediumZonePai=" + this.e + ", highZonePai=" + this.f + ", lowZoneMinutes=" + this.g + ", mediumZoneMinutes=" + this.h + ", highZoneMinutes=" + this.i + ", dailyPai=" + this.j + ", totalPai=" + this.k + ", restHr=" + this.l + ", maxHr=" + this.m + ", index=" + this.n + ", type=" + this.o + ", version=" + this.p + ", nextActivityScores=" + Arrays.toString(this.q) + ", gender=" + this.r + ", age=" + this.s + ", lowZoneLimit=" + this.t + ", mediumZoneLimit=" + this.u + ", highZoneLimit=" + this.v + '}';
    }

    public byte[] getWriteBytes(int version) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.y));
        int i = this.y;
        if (i == 1) {
            byteArrayOutputStream.write(this.n);
            for (float f : this.c) {
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
            }
        } else if (i == 2 || i == 3) {
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.g));
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.h));
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.i));
        } else if (i == 4) {
            byteArrayOutputStream.write(this.x);
        } else if (i == 5) {
            List<HMWriteBackPaiInfo> list = this.w;
            byteArrayOutputStream.write(list != null ? list.size() : 0);
            List<HMWriteBackPaiInfo> list2 = this.w;
            if (list2 != null) {
                Iterator<HMWriteBackPaiInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    byteArrayOutputStream.write(it2.next().toBytes(version));
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
