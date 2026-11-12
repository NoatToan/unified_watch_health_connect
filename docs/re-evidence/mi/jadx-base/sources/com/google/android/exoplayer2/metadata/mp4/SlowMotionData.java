package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import defpackage.j4h;
import defpackage.rk1;
import defpackage.u94;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Segment> f8015a;

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: k2n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.c((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8017b;
        public final int c;

        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            rk1.a(j < j2);
            this.f8016a = j;
            this.f8017b = j2;
            this.c = i;
        }

        public static /* synthetic */ int c(Segment segment, Segment segment2) {
            return u94.k().e(segment.f8016a, segment2.f8016a).e(segment.f8017b, segment2.f8017b).d(segment.c, segment2.c).j();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f8016a == segment.f8016a && this.f8017b == segment.f8017b && this.c == segment.c;
        }

        public int hashCode() {
            return j4h.b(Long.valueOf(this.f8016a), Long.valueOf(this.f8017b), Integer.valueOf(this.c));
        }

        public String toString() {
            return wlq.D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8016a), Long.valueOf(this.f8017b), Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8016a);
            parcel.writeLong(this.f8017b);
            parcel.writeInt(this.c);
        }
    }

    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f8015a = list;
        rk1.a(!a(list));
    }

    public static boolean a(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f8017b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f8016a < j) {
                return true;
            }
            j = list.get(i).f8017b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f8015a.equals(((SlowMotionData) obj).f8015a);
    }

    public int hashCode() {
        return this.f8015a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f8015a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8015a);
    }
}
