package com.huawei.hms.kit.awareness.barrier.internal.a.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.internal.b.h;
import com.huawei.hms.kit.awareness.barrier.internal.d.g;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public class a extends f {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.a.1
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
    private static final String l = "DuringPeriodOfDayCondition";

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: com.huawei.hms.kit.awareness.barrier.internal.a.f.a$a, reason: collision with other inner class name */
    static final class C0145a extends g {
        public static final Parcelable.Creator<C0145a> CREATOR = new Parcelable.Creator<C0145a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.a.a.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0145a[] newArray(int i) {
                return new C0145a[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0145a createFromParcel(Parcel parcel) {
                return new C0145a(parcel);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f13930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f13931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TimeZone f13932c;

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int a() {
            return 0;
        }

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
            parcel.writeLong(this.f13930a);
            parcel.writeLong(this.f13931b);
            TimeZone timeZone = this.f13932c;
            parcel.writeString(timeZone == null ? "" : timeZone.getID());
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
        public boolean g() {
            long j = this.f13930a;
            if (j < 0) {
                return false;
            }
            long j2 = this.f13931b;
            return j <= j2 && j2 <= 86400000;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long f() {
            return this.f13931b;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public TimeZone e() {
            return this.f13932c;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long d() {
            return this.f13930a;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public void a(TimeZone timeZone) {
            this.f13932c = timeZone;
        }

        private C0145a(TimeZone timeZone, long j, long j2) {
            this.f13932c = timeZone;
            this.f13930a = j;
            this.f13931b = j2;
        }

        private C0145a(Parcel parcel) {
            this.f13930a = parcel.readLong();
            this.f13931b = parcel.readLong();
            String string = parcel.readString();
            this.f13932c = com.huawei.hms.kit.awareness.barrier.internal.f.c.a(string) ? null : TimeZone.getTimeZone(string);
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(i(), i);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C0145a i() {
        return (C0145a) a(C0145a.class);
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
        return a(jA, i().d() + jA2, i().f() + jA2);
    }

    public static a a(TimeZone timeZone, long j, long j2) {
        return new a(timeZone, j, j2);
    }

    private a(TimeZone timeZone, long j, long j2) {
        a(new C0145a(timeZone, j, j2));
    }

    private a(Parcel parcel) {
        super(parcel);
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(C0145a.class.getClassLoader()));
    }
}
