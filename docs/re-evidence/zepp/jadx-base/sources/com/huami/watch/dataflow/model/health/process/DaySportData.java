package com.huami.watch.dataflow.model.health.process;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DaySportData {
    public static final String TAG = "DaySportData";
    private static final boolean f = true;
    private static final int g = 1440;
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final byte k = 126;
    private static final byte l = 0;
    private static final byte m = 0;
    private static final int n = 3;
    private static int o = 2;
    private static int p = 0;
    private static int q = 1;
    private final String a;
    private byte[] c;
    private byte[] d;
    private ArrayList<SportData> e;
    public StepsInfo mStepsInfo = null;
    private SleepInfo b = null;

    public DaySportData(String str, byte[] bArr, byte[] bArr2) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = str;
        this.d = bArr;
        this.c = bArr2;
        if (bArr == null) {
            byte[] bArr3 = new byte[4320];
            Log.w(TAG, "null data, new all 0xff bytes");
            Arrays.fill(bArr3, (byte) -1);
            this.d = bArr3;
        }
        if (this.c == null) {
            byte[] bArr4 = new byte[1440];
            Log.w(TAG, "null hrBytes, new all 0xff bytes");
            Arrays.fill(bArr4, (byte) -1);
            this.c = bArr4;
        }
        if (this.d.length != 4320) {
            Log.w(TAG, "source length illegal!!!");
        } else {
            this.e = new ArrayList<>(1440);
            for (int i2 = 0; i2 < 1440; i2++) {
                ArrayList<SportData> arrayList = this.e;
                byte[] bArr5 = this.d;
                int i3 = i2 * 3;
                arrayList.add(new SportData(i2, bArr5[i3 + 0] & 255, bArr5[i3 + 1] & 255, bArr5[i3 + 2] & 255));
            }
        }
        if (this.c.length != 1440) {
            Log.w(TAG, "hr source length illegal!!!");
        }
    }

    @Nullable
    private List<SportData> a(int i2) {
        ArrayList arrayList = null;
        if (i2 < 0 || i2 > 1440) {
            Log.d(TAG, "minute " + i2 + " is invalid!!");
            return null;
        }
        ArrayList<SportData> arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.size() == 1440) {
            arrayList = new ArrayList();
            int i3 = 0;
            int step = 0;
            int i4 = 0;
            while (i3 < this.e.size()) {
                step += this.e.get(i3).getStep();
                i3++;
                if (i3 % i2 == 0) {
                    arrayList.add(new SportData(i4, step));
                    i4++;
                    step = 0;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public byte[] extractHeartRateWithMode() {
        if (this.d == null || this.c == null) {
            Log.d(TAG, "Data or HrBytes is null!!");
            return null;
        }
        byte[] bArr = new byte[o * 1440];
        for (int i2 = 0; i2 < 1440; i2++) {
            byte b = this.d[(i2 * 3) + 0];
            byte b2 = this.c[i2];
            if ((b2 & 255) == 255 || (b2 & 254) == 254) {
                b2 = 0;
            }
            int i3 = o;
            int i4 = (i3 * i2) + p;
            if ((b & 255) == 255) {
                b = 126;
            }
            bArr[i4] = b;
            bArr[(i3 * i2) + q] = b2;
        }
        return bArr;
    }

    public byte[] getBinaryData() {
        return this.d;
    }

    public String getDay() {
        return this.a;
    }

    public byte[] getHrBinaryData() {
        return this.c;
    }

    public SleepInfo getSleepInfo() {
        return this.b;
    }

    public StepsInfo getStepsInfo() {
        return this.mStepsInfo;
    }

    @Nullable
    public List<SportData> getStepsPer10Min() {
        return a(10);
    }

    public void setSleepInfo(SleepInfo sleepInfo) {
        Log.d(TAG, "setSleepInfo");
        this.b = sleepInfo;
    }

    public void setStepsInfo(StepsInfo stepsInfo) {
        Log.d(TAG, "setStepsInfo");
        this.mStepsInfo = stepsInfo;
    }
}
