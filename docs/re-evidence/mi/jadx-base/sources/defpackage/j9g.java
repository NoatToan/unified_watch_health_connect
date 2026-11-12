package defpackage;

import com.xiaomi.fitness.sport_manager.sensor.SportSensorManager;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;

/* JADX INFO: loaded from: classes4.dex */
public final class j9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f22561a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f22562b = {44100, MIOTAudioModuleCore.SAMPLING_RATE, 32000};
    public static final int[] c = {32000, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, MIOTAudioModuleCore.SAMPLING_RATE, 56000, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, MIOTAudioModuleCore.SAMPLING_RATE, 56000, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, SportSensorManager.SAMPLING_PERIOD_US_25HZ, MIOTAudioModuleCore.SAMPLING_RATE, 56000, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, SportSensorManager.SAMPLING_PERIOD_US_25HZ, MIOTAudioModuleCore.SAMPLING_RATE, 56000, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f22564b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!j9g.l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f22563a = i2;
            this.f22564b = j9g.f22561a[3 - i3];
            int i6 = j9g.f22562b[i5];
            this.d = i6;
            if (i2 == 2) {
                this.d = i6 / 2;
            } else if (i2 == 0) {
                this.d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.g = j9g.k(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? j9g.c[i4 - 1] : j9g.d[i4 - 1];
                this.f = i8;
                this.c = (((i8 * 12) / this.d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? j9g.e[i4 - 1] : j9g.f[i4 - 1];
                    this.f = i9;
                    this.c = ((i9 * 144) / this.d) + i7;
                } else {
                    int i10 = j9g.g[i4 - 1];
                    this.f = i10;
                    this.c = (((i3 == 1 ? 72 : 144) * i10) / this.d) + i7;
                }
            }
            this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f22562b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    public static int k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int m(int i) {
        int i2;
        int i3;
        if (!l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return k(i2, i3);
    }
}
