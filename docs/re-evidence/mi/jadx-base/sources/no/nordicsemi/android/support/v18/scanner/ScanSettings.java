package no.nordicsemi.android.support.v18.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes3.dex */
public final class ScanSettings implements Parcelable {
    public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
    public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
    public static final int CALLBACK_TYPE_MATCH_LOST = 4;
    public static final Parcelable.Creator<ScanSettings> CREATOR = new a();
    public static final long MATCH_LOST_DEVICE_TIMEOUT_DEFAULT = 10000;
    public static final long MATCH_LOST_TASK_INTERVAL_DEFAULT = 10000;
    public static final int MATCH_MODE_AGGRESSIVE = 1;
    public static final int MATCH_MODE_STICKY = 2;
    public static final int MATCH_NUM_FEW_ADVERTISEMENT = 2;
    public static final int MATCH_NUM_MAX_ADVERTISEMENT = 3;
    public static final int MATCH_NUM_ONE_ADVERTISEMENT = 1;
    public static final int PHY_LE_ALL_SUPPORTED = 255;
    public static final int SCAN_MODE_BALANCED = 1;
    public static final int SCAN_MODE_LOW_LATENCY = 2;
    public static final int SCAN_MODE_LOW_POWER = 0;
    public static final int SCAN_MODE_OPPORTUNISTIC = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28174b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f28175k;
    public final long l;
    public final boolean m;
    public final int n;

    public class a implements Parcelable.Creator<ScanSettings> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScanSettings createFromParcel(Parcel parcel) {
            return new ScanSettings(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScanSettings[] newArray(int i) {
            return new ScanSettings[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28176a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28177b = 1;
        public long c = 0;
        public int d = 1;
        public int e = 3;
        public boolean f = true;
        public int g = 255;
        public boolean h = true;
        public boolean i = true;
        public boolean j = true;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f28178k = 10000;
        public long l = 10000;
        public long m = 0;
        public long n = 0;

        public ScanSettings a() {
            if (this.m == 0 && this.n == 0) {
                n();
            }
            return new ScanSettings(this.f28176a, this.f28177b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f28178k, this.l, this.n, this.m, null);
        }

        public final boolean b(int i) {
            return i == 1 || i == 2 || i == 4 || i == 6;
        }

        public b c(int i) {
            if (b(i)) {
                this.f28177b = i;
                return this;
            }
            throw new IllegalArgumentException("invalid callback type - " + i);
        }

        public b d(boolean z) {
            this.f = z;
            return this;
        }

        public b e(int i) {
            if (i >= 1 && i <= 2) {
                this.d = i;
                return this;
            }
            throw new IllegalArgumentException("invalid matchMode " + i);
        }

        public b f(long j, long j2) {
            if (j <= 0 || j2 <= 0) {
                throw new IllegalArgumentException("maxDeviceAgeMillis and taskIntervalMillis must be > 0");
            }
            this.f28178k = j;
            this.l = j2;
            return this;
        }

        public b g(int i) {
            if (i >= 1 && i <= 3) {
                this.e = i;
                return this;
            }
            throw new IllegalArgumentException("invalid numOfMatches " + i);
        }

        public b h(int i) {
            this.g = i;
            return this;
        }

        public b i(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("reportDelay must be > 0");
            }
            this.c = j;
            return this;
        }

        public b j(int i) {
            if (i >= -1 && i <= 2) {
                this.f28176a = i;
                return this;
            }
            throw new IllegalArgumentException("invalid scan mode " + i);
        }

        public b k(boolean z) {
            this.i = z;
            return this;
        }

        public b l(boolean z) {
            this.j = z;
            return this;
        }

        public b m(boolean z) {
            this.h = z;
            return this;
        }

        public final void n() {
            int i = this.f28176a;
            if (i == 1) {
                this.n = VibrateModeProgressBar.sLongToLong;
                this.m = 3000L;
            } else if (i != 2) {
                this.n = 500L;
                this.m = 4500L;
            } else {
                this.n = 0L;
                this.m = 0L;
            }
        }
    }

    public /* synthetic */ ScanSettings(int i, int i2, long j, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, long j2, long j3, long j4, long j5, a aVar) {
        this(i, i2, j, i3, i4, z, i5, z2, z3, z4, j2, j3, j4, j5);
    }

    public void a() {
        this.j = false;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f28175k;
    }

    public long f() {
        return this.l;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.n;
    }

    public long j() {
        return this.e;
    }

    public int k() {
        return this.c;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return this.j;
    }

    public boolean o() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeLong(this.f28175k);
        parcel.writeLong(this.l);
        parcel.writeLong(this.f28173a);
        parcel.writeLong(this.f28174b);
    }

    public /* synthetic */ ScanSettings(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ScanSettings(int i, int i2, long j, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, long j2, long j3, long j4, long j5) {
        this.c = i;
        this.d = i2;
        this.e = j;
        this.g = i4;
        this.f = i3;
        this.m = z;
        this.n = i5;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.f28175k = FolmeCore.NANOS_TO_MS * j2;
        this.l = j3;
        this.f28173a = j4;
        this.f28174b = j5;
    }

    public ScanSettings(Parcel parcel) {
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt();
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.f28175k = parcel.readLong();
        this.l = parcel.readLong();
        this.f28173a = parcel.readLong();
        this.f28174b = parcel.readLong();
    }
}
