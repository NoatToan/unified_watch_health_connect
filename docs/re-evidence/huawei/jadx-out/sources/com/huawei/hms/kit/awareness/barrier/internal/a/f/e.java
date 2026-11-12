package com.huawei.hms.kit.awareness.barrier.internal.a.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.internal.b.h;
import com.huawei.hms.kit.awareness.barrier.internal.d.g;
import com.huawei.hms.kit.awareness.barrier.internal.type.State;
import com.huawei.hms.kit.awareness.barrier.internal.type.i;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public class e extends f {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }
    };
    private static final String l = "InTimeCategoryCondition";

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static final class a extends g {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.f.e.a.1
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
        private static final int f13941a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f13942b = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13943c;

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int a() {
            return 0;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public void a(TimeZone timeZone) {
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int c() {
            return 0;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long d() {
            return 0L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public TimeZone e() {
            return null;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public long f() {
            return 0L;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f13943c);
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
        public boolean g() {
            int i = this.f13943c;
            return 1 <= i && i <= 8;
        }

        @Override // com.huawei.hms.kit.awareness.barrier.internal.d.g
        public int b() {
            return this.f13943c;
        }

        private a(Parcel parcel) {
            this.f13943c = parcel.readInt();
        }

        private a(int i) {
            this.f13943c = i;
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

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void b() {
        int iB = i().b();
        if (iB == 1 || iB == 2 || iB == 3 || iB == 4) {
            com.huawei.hms.kit.awareness.b.a.c.a(l, "rootConditionCheck check result:" + s(), new Object[0]);
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.f.f, com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void a(com.huawei.hms.kit.awareness.barrier.internal.b.f fVar) {
        switch (i().b()) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (fVar instanceof h) {
                    h hVar = (h) fVar;
                    if (hVar.b()) {
                        this.k = hVar;
                    }
                }
                com.huawei.hms.kit.awareness.b.a.c.a(l, "rootConditionCheck check result:" + s(), new Object[0]);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                super.a(fVar);
                break;
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a() {
        long j;
        long j2;
        long jA = h.a();
        long jA2 = h.a(this.k.i());
        long j3 = i.j + jA2;
        long j4 = 43200000 + jA2;
        long j5 = i.l + jA2;
        long j6 = i.m + jA2;
        switch (i().b()) {
            case 1:
                j = j3;
                j2 = j4;
                break;
            case 2:
                j = j4;
                j2 = j5;
                break;
            case 3:
                j = j5;
                j2 = j6;
                break;
            case 4:
                return State.not(a(jA, j3, j6));
            case 5:
                return this.k.j();
            case 6:
            case 7:
                if (this.k.h() == 2) {
                    return 2;
                }
                return this.k.a(i().b(), this.k.i());
            case 8:
                return State.not(this.k.j());
            default:
                return 2;
        }
        return a(jA, j, j2);
    }

    public static e a(int i) {
        return new e(i);
    }

    private e(Parcel parcel) {
        super(parcel);
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(a.class.getClassLoader()));
    }

    private e(int i) {
        a(new a(i));
    }
}
