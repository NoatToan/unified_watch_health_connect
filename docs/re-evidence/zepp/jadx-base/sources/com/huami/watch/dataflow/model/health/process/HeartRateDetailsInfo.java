package com.huami.watch.dataflow.model.health.process;

import android.content.Context;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateDetailsInfo {
    public static final int MINUTES_OF_DAY = 1440;
    public static final int MODE_OTHER = 14;
    public static final int MODE_SLEEP = HeartRateIntervalDefine.HeartRateMode.SLEEP.ordinal();
    private static final String q = "AnalysisUtils";
    private static final int r = 30;
    private static final int s = 228;
    private static final byte t = 5;
    private static final byte u = 6;
    private static final byte v = 7;
    private static final int w = 126;
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private SleepInfo d;
    private SleepInfo e;
    private SingleHeartRate g;
    private HeartRateIntervalDefine n;
    private String o;
    public int mAverageQuietRate = 0;
    public int mQuietRateCount = 0;
    private int f = 0;
    private int h = 300;
    private int[] i = null;
    private int[] j = null;
    private final int k = 2;
    private final int l = 0;
    private final int m = 1;
    private int p = 9;

    public static class SingleHeartRate {
        public int heartRate;
        public long timeMills;

        public SingleHeartRate(String str) {
            this.timeMills = DateDay.from(str).calendar().getTimeInMillis();
        }

        public static SingleHeartRate getValidRecentHeartRate(SingleHeartRate singleHeartRate, SingleHeartRate singleHeartRate2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (singleHeartRate != null && singleHeartRate.timeMills > jCurrentTimeMillis) {
                singleHeartRate = null;
            }
            if (singleHeartRate2 != null && singleHeartRate2.timeMills > jCurrentTimeMillis) {
                singleHeartRate2 = null;
            }
            if (singleHeartRate == null && singleHeartRate2 == null) {
                return null;
            }
            if (singleHeartRate == null && singleHeartRate2.heartRate != 0) {
                return singleHeartRate2;
            }
            if (singleHeartRate2 == null && singleHeartRate.heartRate != 0) {
                return singleHeartRate;
            }
            if (singleHeartRate != null && singleHeartRate2 != null) {
                long j = singleHeartRate.timeMills;
                long j2 = singleHeartRate2.timeMills;
                if (j < j2 && singleHeartRate2.heartRate != 0) {
                    return singleHeartRate2;
                }
                if (singleHeartRate.heartRate != 0 && j >= j2) {
                    return singleHeartRate;
                }
            }
            return null;
        }
    }

    public HeartRateDetailsInfo(Context context, String str, int i, byte[] bArr, SleepInfo sleepInfo, SleepInfo sleepInfo2) {
        i = i == 0 ? 30 : i;
        this.o = str;
        this.n = new HeartRateIntervalDefine(context, i);
        this.c = bArr;
        this.d = sleepInfo;
        this.e = sleepInfo2;
        this.g = new SingleHeartRate(str);
    }

    private boolean a(int i) {
        return i >= 30 && i <= s;
    }

    private int b(int i, StageSleep stageSleep) {
        int i2 = stageSleep.start;
        int i3 = stageSleep.stop;
        int i4 = i2 < 1440 ? 0 : i2 - 1440;
        int i5 = i3 - 1440;
        if (i < i4) {
            return 1;
        }
        return (i > i5 || i < i4) ? -1 : 0;
    }

    private int c(int i, StageSleep stageSleep) {
        int i2 = stageSleep.start;
        int i3 = stageSleep.stop;
        if (i2 >= 1440) {
            i2 = 1440;
        }
        if (i3 >= 1440) {
            i3 = 1440;
        }
        if (i < i2) {
            return 1;
        }
        return (i > i3 || i < i2) ? -1 : 0;
    }

    public int getAverageRate() {
        int i = this.mQuietRateCount;
        if (i > 0) {
            return this.mAverageQuietRate / i;
        }
        return 0;
    }

    public String getDate() {
        return this.o;
    }

    public byte[] getFivewHoursData(int i) {
        int i2;
        if (i < 300) {
            i = 300;
            i2 = 0;
        } else {
            i2 = i + PersonInfoSettingBaseFragment.CODE_ADD_GEUST;
        }
        int i3 = (i - i2) * 2;
        Log.d("AnalysisUtils", "startMin : " + i2 + " currentMintus :  " + i, new Object[0]);
        int i4 = i2 * 2;
        Log.d("AnalysisUtils", "getFivewHoursData  length: " + i3 + "statIndex  :" + i4, new Object[0]);
        if (i3 < 1) {
            return null;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.b, i4, bArr, 0, i3);
        return bArr;
    }

    public byte[] getGenerateHeartRate() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        if (this.a == null) {
            this.a = new byte[bArr.length / this.p];
            for (int i = 0; i < this.a.length / 2; i++) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = this.p;
                    if (i2 < i6) {
                        byte[] bArr2 = this.b;
                        int i7 = i2 * 2;
                        int i8 = bArr2[(i6 * i * 2) + i7 + 0] & 255;
                        int i9 = bArr2[(i6 * i * 2) + i7 + 1] & 255;
                        int i10 = MODE_SLEEP;
                        if (i8 == i10) {
                            i3++;
                        }
                        if (i9 > 0) {
                            i4++;
                            i5 += i9;
                        }
                        if (i2 == i6 - 1) {
                            if (i4 == 0) {
                                byte[] bArr3 = this.a;
                                int i11 = i * 2;
                                bArr3[i11 + 0] = 14;
                                bArr3[i11 + 1] = 0;
                            } else if (i3 > 5 || i3 == i4) {
                                byte[] bArr4 = this.a;
                                int i12 = i * 2;
                                bArr4[i12 + 0] = (byte) i10;
                                bArr4[i12 + 1] = (byte) (i5 / i4);
                            } else {
                                int i13 = i5 / i4;
                                int i14 = i * 2;
                                this.a[i14 + 0] = (byte) this.n.getHeartRateMode(i13, false).ordinal();
                                this.a[i14 + 1] = (byte) i13;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
        return this.a;
    }

    public int[] getHeartRateIntervalPercent() {
        return this.j;
    }

    public int getMaxHeartRate() {
        return this.f;
    }

    public int getMinHeartRate() {
        int i = this.h;
        if (i == 300) {
            return 0;
        }
        return i;
    }

    public SingleHeartRate getRecentRate() {
        return this.g;
    }

    public byte[] getRegulateHeartRate() {
        return this.b;
    }

    public int getRegulateHeartRateValue(int i) {
        int i2;
        int i3;
        byte[] bArr = this.b;
        if (bArr == null || (i2 = (i * 2) + 1) >= bArr.length || (i3 = bArr[i2] & 255) <= 0) {
            return 0;
        }
        return i3;
    }

    public int getRestHeartRate() {
        SleepInfo sleepInfo = this.d;
        if (sleepInfo != null) {
            return sleepInfo.getRestHeartRate();
        }
        return 0;
    }

    public void regulateModeAndAverage() {
        ArrayList<StageSleep> stageSleep;
        boolean zHasSleep;
        ArrayList<StageSleep> stageSleep2;
        boolean zHasSleep2;
        byte[] bArr = this.c;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        SleepInfo sleepInfo = this.d;
        if (sleepInfo != null) {
            stageSleep = sleepInfo.getStageSleep();
            zHasSleep = this.d.hasSleep();
        } else {
            stageSleep = null;
            zHasSleep = false;
        }
        SleepInfo sleepInfo2 = this.e;
        if (sleepInfo2 != null) {
            stageSleep2 = sleepInfo2.getStageSleep();
            zHasSleep2 = this.e.hasSleep();
        } else {
            stageSleep2 = null;
            zHasSleep2 = false;
        }
        this.n.prepareCount();
        int i = 0;
        StageSleep stageSleep3 = null;
        int i2 = 0;
        StageSleep stageSleep4 = null;
        int i3 = 0;
        while (i < 1440) {
            byte[] bArr3 = this.c;
            int i4 = i * 2;
            int i5 = i4 + 0;
            int i6 = (bArr3[i5] >> 4) & 255;
            int i7 = i4 + 1;
            int i8 = bArr3[i7] & 255;
            int i9 = -1;
            int iB = (!zHasSleep || stageSleep3 == null) ? -1 : b(i, stageSleep3);
            if (iB == -1 && zHasSleep) {
                while (true) {
                    if (i2 >= stageSleep.size()) {
                        i9 = -1;
                        break;
                    }
                    stageSleep3 = stageSleep.get(i2);
                    iB = b(i, stageSleep3);
                    i9 = -1;
                    if (iB != -1) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (iB == i9 && zHasSleep) {
                stageSleep3 = null;
            }
            if (iB != 0) {
                if (zHasSleep2 && stageSleep4 != null) {
                    iB = c(i, stageSleep4);
                }
                int i10 = -1;
                if (iB == -1 && zHasSleep2) {
                    while (true) {
                        if (i3 >= stageSleep2.size()) {
                            i10 = -1;
                            break;
                        }
                        stageSleep4 = stageSleep2.get(i3);
                        iB = c(i, stageSleep4);
                        i10 = -1;
                        if (iB != -1) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (iB == i10 && zHasSleep2) {
                    stageSleep4 = null;
                }
            }
            byte b = (byte) (iB == 0 ? MODE_SLEEP : 14);
            boolean zA = a(i8);
            ArrayList<StageSleep> arrayList = stageSleep;
            if (zA && ((i6 == 5 || i6 == 6 || i6 == 7) && MODE_SLEEP != b)) {
                this.mAverageQuietRate += i8;
                this.mQuietRateCount++;
            }
            this.h = (!zA || i8 >= this.h) ? this.h : i8;
            this.f = (!zA || i8 <= this.f) ? this.f : i8;
            if (zA) {
                SingleHeartRate singleHeartRate = this.g;
                singleHeartRate.heartRate = i8;
                singleHeartRate.timeMills = DateDay.from(this.o).calendar().getTimeInMillis() + ((long) (i * 60 * 1000));
            }
            HeartRateIntervalDefine heartRateIntervalDefine = this.n;
            byte bOrdinal = (byte) heartRateIntervalDefine.ERROR_CODE;
            if (i6 != 126 && zA) {
                bOrdinal = (byte) heartRateIntervalDefine.getHeartRateMode(i8, MODE_SLEEP == b).ordinal();
            }
            byte[] bArr4 = this.b;
            bArr4[i5] = bOrdinal;
            bArr4[i7] = (byte) i8;
            i++;
            stageSleep = arrayList;
            zHasSleep = zHasSleep;
            stageSleep2 = stageSleep2;
            zHasSleep2 = zHasSleep2;
        }
        this.n.endCount();
        this.i = this.n.getHeartRateInterval();
        this.j = this.n.getHeartRateIntervalPercent();
    }
}
