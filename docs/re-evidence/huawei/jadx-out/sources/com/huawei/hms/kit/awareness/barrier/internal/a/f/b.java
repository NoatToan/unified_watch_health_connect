package com.huawei.hms.kit.awareness.barrier.internal.a.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.internal.b.h;
import com.huawei.hms.kit.awareness.barrier.internal.d.g;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public class b extends f {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };
    private static final String l = "DuringPeriodOfWeekCondition";

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static final class a extends g {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.b.a.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f13933a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f13934b = 7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13935c;
        private final long d;
        private final long e;
        private TimeZone f;

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int b() {
            return 0;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int c() {
            return 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f13935c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
            TimeZone timeZone = this.f;
            parcel.writeString(timeZone == null ? "" : timeZone.getID());
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
        public boolean g() {
            int i = this.f13935c;
            if (i < 1 || i > 7) {
                return false;
            }
            long j = this.d;
            if (j < 0) {
                return false;
            }
            long j2 = this.e;
            return j <= j2 && j2 <= 86400000;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long f() {
            return this.e;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public TimeZone e() {
            return this.f;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long d() {
            return this.d;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public void a(TimeZone timeZone) {
            this.f = timeZone;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int a() {
            return this.f13935c;
        }

        private a(Parcel parcel) {
            this.f13935c = parcel.readInt();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
            String string = parcel.readString();
            this.f = com.huawei.hms.kit.awareness.barrier.internal.f.c.a(string) ? null : TimeZone.getTimeZone(string);
        }

        private a(int i, TimeZone timeZone, long j, long j2) {
            this.f13935c = i;
            this.f = timeZone;
            this.d = j;
            this.e = j2;
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(i(), i);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final a i() {
        return (a) a(a.class);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a() {
        if (!j()) {
            com.huawei.hms.kit.awareness.b.a.c.a(l, "mStartTimeOfDayMillis is: {0}, mStopTimeOfDayMillis is: {1}", Long.valueOf(i().d()), Long.valueOf(i().f()));
            return 2;
        }
        i().a(com.huawei.hms.kit.awareness.barrier.internal.f.c.a(i().e()) ? this.k.i() : i().e());
        long jA = h.a();
        long jA2 = h.a(i().e());
        int iA = a(i().e());
        return a(jA, (((long) (i().a() - iA)) * 86400000) + jA2 + i().d(), i().f() + jA2 + (((long) (i().a() - iA)) * 86400000));
    }

    public static b a(int i, TimeZone timeZone, long j, long j2) {
        return new b(i, timeZone, j, j2);
    }

    private b(Parcel parcel) {
        super(parcel);
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(a.class.getClassLoader()));
    }

    private b(int i, TimeZone timeZone, long j, long j2) {
        a(new a(i, timeZone, j, j2));
    }
}
