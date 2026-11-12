package n30;

import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln30/e;", "Landroid/os/Parcelable;", "Lk30/k;", "courseRoutingType", "", "shouldAvoidHighTraffic", "shouldAvoidClosedRoads", "shouldAvoidUnpavedRoads", "", "courseTargetDistance", "Lw20/b;", "courseDirection", "", "courseCreateFlow", "<init>", "(Lk30/k;ZZZDLw20/b;I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k30.k f123446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f123449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f123450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w20.b f123451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f123452g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            k30.k kVarValueOf = k30.k.valueOf(parcel.readString());
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new e(kVarValueOf, z15, z14, parcel.readInt() != 0, parcel.readDouble(), w20.b.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(k30.k kVar, boolean z14, boolean z15, boolean z16, double d14, w20.b bVar, int i14) {
        kVar.getClass();
        bVar.getClass();
        this.f123446a = kVar;
        this.f123447b = z14;
        this.f123448c = z15;
        this.f123449d = z16;
        this.f123450e = d14;
        this.f123451f = bVar;
        this.f123452g = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f123446a == eVar.f123446a && this.f123447b == eVar.f123447b && this.f123448c == eVar.f123448c && this.f123449d == eVar.f123449d && Double.compare(this.f123450e, eVar.f123450e) == 0 && this.f123451f == eVar.f123451f && this.f123452g == eVar.f123452g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123452g) + ((this.f123451f.hashCode() + org.apache.commons.lang3.e.b(q6.f.g(q6.f.g(q6.f.g(this.f123446a.hashCode() * 31, 31, this.f123447b), 31, this.f123448c), 31, this.f123449d), 31, this.f123450e)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutomaticCourseParameters(courseRoutingType=");
        sb3.append(this.f123446a);
        sb3.append(", shouldAvoidHighTraffic=");
        sb3.append(this.f123447b);
        sb3.append(", shouldAvoidClosedRoads=");
        kg.f.q(", shouldAvoidUnpavedRoads=", ", courseTargetDistance=", sb3, this.f123448c, this.f123449d);
        sb3.append(this.f123450e);
        sb3.append(", courseDirection=");
        sb3.append(this.f123451f);
        return u0.k(sb3, ", courseCreateFlow=", this.f123452g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f123446a.name());
        parcel.writeInt(this.f123447b ? 1 : 0);
        parcel.writeInt(this.f123448c ? 1 : 0);
        parcel.writeInt(this.f123449d ? 1 : 0);
        parcel.writeDouble(this.f123450e);
        parcel.writeString(this.f123451f.name());
        parcel.writeInt(this.f123452g);
    }
}
