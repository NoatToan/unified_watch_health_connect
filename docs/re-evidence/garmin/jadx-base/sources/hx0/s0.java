package hx0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhx0/s0;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "date", "Lhx0/o;", "dayState", "Ljava/util/HashSet;", "Lhx0/d;", "Lkotlin/collections/HashSet;", "dayActivities", "featureState", "", "isFeatureStartDay", "Lhx0/e;", "featureType", "isPregnancyDay", "isOverlapCycle", "<init>", "(Lorg/joda/time/LocalDate;Lhx0/o;Ljava/util/HashSet;Lhx0/o;ZLhx0/e;ZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s0 implements Parcelable {
    public static final Parcelable.Creator<s0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f86164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f86165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<d> f86166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f86167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f86169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86171h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s0> {
        @Override // android.os.Parcelable.Creator
        public final s0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            o oVarValueOf = o.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            HashSet hashSet = new HashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                hashSet.add(d.valueOf(parcel.readString()));
            }
            o oVarValueOf2 = o.valueOf(parcel.readString());
            boolean z14 = true;
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            return new s0(localDate, oVarValueOf, hashSet, oVarValueOf2, z14, e.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? z14 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final s0[] newArray(int i14) {
            return new s0[i14];
        }
    }

    public /* synthetic */ s0(LocalDate localDate, o oVar, HashSet hashSet, o oVar2, boolean z14, e eVar, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(localDate, (i14 & 2) != 0 ? o.None : oVar, (i14 & 4) != 0 ? new HashSet() : hashSet, (i14 & 8) != 0 ? o.None : oVar2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? e.None : eVar, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? false : z16);
    }

    public final void b(o oVar) {
        oVar.getClass();
        this.f86165b = oVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p005kotlin.jvm.internal.s.g(this.f86164a, s0Var.f86164a) && this.f86165b == s0Var.f86165b && p005kotlin.jvm.internal.s.g(this.f86166c, s0Var.f86166c) && this.f86167d == s0Var.f86167d && this.f86168e == s0Var.f86168e && this.f86169f == s0Var.f86169f && this.f86170g == s0Var.f86170g && this.f86171h == s0Var.f86171h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86171h) + q6.f.g((this.f86169f.hashCode() + q6.f.g((this.f86167d.hashCode() + ((this.f86166c.hashCode() + ((this.f86165b.hashCode() + (this.f86164a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f86168e)) * 31, 31, this.f86170g);
    }

    public final String toString() {
        o oVar = this.f86165b;
        boolean z14 = this.f86168e;
        e eVar = this.f86169f;
        boolean z15 = this.f86170g;
        boolean z16 = this.f86171h;
        StringBuilder sb3 = new StringBuilder("RangeCalendarDayModel(date=");
        sb3.append(this.f86164a);
        sb3.append(", dayState=");
        sb3.append(oVar);
        sb3.append(", dayActivities=");
        sb3.append(this.f86166c);
        sb3.append(", featureState=");
        sb3.append(this.f86167d);
        sb3.append(", isFeatureStartDay=");
        sb3.append(z14);
        sb3.append(", featureType=");
        sb3.append(eVar);
        sb3.append(", isPregnancyDay=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isOverlapCycle=", ")", sb3, z15, z16);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f86164a);
        parcel.writeString(this.f86165b.name());
        HashSet<d> hashSet = this.f86166c;
        parcel.writeInt(hashSet.size());
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        parcel.writeString(this.f86167d.name());
        parcel.writeInt(this.f86168e ? 1 : 0);
        parcel.writeString(this.f86169f.name());
        parcel.writeInt(this.f86170g ? 1 : 0);
        parcel.writeInt(this.f86171h ? 1 : 0);
    }

    public s0(LocalDate localDate, o oVar, HashSet<d> hashSet, o oVar2, boolean z14, e eVar, boolean z15, boolean z16) {
        localDate.getClass();
        oVar.getClass();
        hashSet.getClass();
        oVar2.getClass();
        eVar.getClass();
        this.f86164a = localDate;
        this.f86165b = oVar;
        this.f86166c = hashSet;
        this.f86167d = oVar2;
        this.f86168e = z14;
        this.f86169f = eVar;
        this.f86170g = z15;
        this.f86171h = z16;
    }
}
