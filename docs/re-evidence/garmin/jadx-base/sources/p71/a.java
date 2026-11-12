package p71;

import android.os.Parcel;
import android.os.Parcelable;
import n71.g;
import o13.m;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp71/a;", "Lp71/f;", "Ln71/g$a;", "stringHandle", "<init>", "(Ln71/g$a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements f {
    public static final Parcelable.Creator<a> CREATOR = new C2580a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f136301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f136302b;

    /* JADX INFO: renamed from: p71.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2580a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(g.a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(g.a aVar) {
        aVar.getClass();
        this.f136301a = aVar;
        this.f136302b = m.b(new p40.f(3));
    }

    @Override // p71.f
    public final boolean B0(com.garmin.android.apps.connectmobile.performance.dto.c cVar) {
        cVar.getClass();
        return true;
    }

    @Override // p71.f
    public final g I0() {
        return this.f136301a;
    }

    @Override // p71.f
    public final g Z1() {
        return (g.a) this.f136302b.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f136301a.equals(((a) obj).f136301a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136301a.f124840a);
    }

    public final String toString() {
        return "AlwaysMatchFilter(stringHandle=" + this.f136301a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f136301a.f124840a);
    }
}
