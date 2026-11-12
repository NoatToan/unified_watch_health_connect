package o61;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo61/l;", "Landroid/os/Parcelable;", "", "Lo61/k;", "activityStatList", "", "aerobicValue", "anaerobicValue", "Lorg/joda/time/DateTime;", "calendarDate", "", "trainingEffectLabel", "<init>", "(Ljava/util/List;DDLorg/joda/time/DateTime;Ljava/lang/String;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f129605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f129606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f129607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f129608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f129609e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel));
            }
            return new l(arrayList, parcel.readDouble(), parcel.readDouble(), (DateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(List list, double d14, double d15, DateTime dateTime, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? Double.NaN : d14, (i14 & 4) != 0 ? Double.NaN : d15, dateTime, (i14 & 16) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f129605a, lVar.f129605a) && Double.compare(this.f129606b, lVar.f129606b) == 0 && Double.compare(this.f129607c, lVar.f129607c) == 0 && s.g(this.f129608d, lVar.f129608d) && s.g(this.f129609e, lVar.f129609e);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f129605a.hashCode() * 31, 31, this.f129606b), 31, this.f129607c);
        DateTime dateTime = this.f129608d;
        int iHashCode = (iB + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str = this.f129609e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingEffectSummaryStat(activityStatList=");
        sb3.append(this.f129605a);
        sb3.append(", aerobicValue=");
        sb3.append(this.f129606b);
        am.j.x(sb3, ", anaerobicValue=", this.f129607c, ", calendarDate=");
        sb3.append(this.f129608d);
        sb3.append(", trainingEffectLabel=");
        sb3.append(this.f129609e);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f129605a, parcel);
        while (itE.hasNext()) {
            k kVar = (k) itE.next();
            if (kVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                kVar.writeToParcel(parcel, i14);
            }
        }
        parcel.writeDouble(this.f129606b);
        parcel.writeDouble(this.f129607c);
        parcel.writeSerializable(this.f129608d);
        parcel.writeString(this.f129609e);
    }

    public l(List<k> list, double d14, double d15, DateTime dateTime, String str) {
        list.getClass();
        this.f129605a = list;
        this.f129606b = d14;
        this.f129607c = d15;
        this.f129608d = dateTime;
        this.f129609e = str;
    }
}
