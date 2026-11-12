package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxw1/l;", "Landroid/os/Parcelable;", "", "title", "", "message", "positiveAction", "negativeAction", "Lorg/joda/time/DateTime;", "raceStartTime", "raceEndTime", "", "planDistance", "", "isEventDeleted", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;IILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f192415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f192418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f192419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f192420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f192421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f192422h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Double d14;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                d14 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                d14 = null;
            }
            String string = parcel.readString();
            Double d15 = d14;
            int i14 = parcel.readInt();
            Double dValueOf = d15;
            int i15 = parcel.readInt();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new l(numValueOf, string, i14, i15, dateTime, dateTime2, dValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(Integer num, String str, int i14, int i15, DateTime dateTime, DateTime dateTime2, Double d14, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : num, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? R.string.find_new_event : i14, (i16 & 8) != 0 ? R.string.create_an_event_v2 : i15, (i16 & 16) != 0 ? null : dateTime, (i16 & 32) != 0 ? null : dateTime2, (i16 & 64) != 0 ? null : d14, (i16 & 128) != 0 ? false : z14);
    }

    public static l b(l lVar, Integer num, String str, DateTime dateTime, DateTime dateTime2, Double d14, int i14) {
        if ((i14 & 1) != 0) {
            num = lVar.f192415a;
        }
        Integer num2 = num;
        if ((i14 & 2) != 0) {
            str = lVar.f192416b;
        }
        String str2 = str;
        int i15 = (i14 & 4) != 0 ? lVar.f192417c : R.string.keep_my_event;
        int i16 = (i14 & 8) != 0 ? lVar.f192418d : R.string.find_new_event;
        if ((i14 & 16) != 0) {
            dateTime = lVar.f192419e;
        }
        DateTime dateTime3 = dateTime;
        if ((i14 & 32) != 0) {
            dateTime2 = lVar.f192420f;
        }
        DateTime dateTime4 = dateTime2;
        if ((i14 & 64) != 0) {
            d14 = lVar.f192421g;
        }
        return new l(num2, str2, i15, i16, dateTime3, dateTime4, d14, (i14 & 128) != 0 ? lVar.f192422h : true);
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
        return s.g(this.f192415a, lVar.f192415a) && s.g(this.f192416b, lVar.f192416b) && this.f192417c == lVar.f192417c && this.f192418d == lVar.f192418d && s.g(this.f192419e, lVar.f192419e) && s.g(this.f192420f, lVar.f192420f) && s.g(this.f192421g, lVar.f192421g) && this.f192422h == lVar.f192422h;
    }

    public final int hashCode() {
        Integer num = this.f192415a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f192416b;
        int iD = q2.d(this.f192418d, q2.d(this.f192417c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        DateTime dateTime = this.f192419e;
        int iHashCode2 = (iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f192420f;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Double d14 = this.f192421g;
        return Boolean.hashCode(this.f192422h) + ((iHashCode3 + (d14 != null ? d14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("RaceDialogDTO(title=", this.f192415a, ", message=", this.f192416b, ", positiveAction=");
        e0.m(this.f192417c, this.f192418d, ", negativeAction=", ", raceStartTime=", sbF);
        sbF.append(this.f192419e);
        sbF.append(", raceEndTime=");
        sbF.append(this.f192420f);
        sbF.append(", planDistance=");
        sbF.append(this.f192421g);
        sbF.append(", isEventDeleted=");
        sbF.append(this.f192422h);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f192415a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f192416b);
        parcel.writeInt(this.f192417c);
        parcel.writeInt(this.f192418d);
        parcel.writeSerializable(this.f192419e);
        parcel.writeSerializable(this.f192420f);
        Double d14 = this.f192421g;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeInt(this.f192422h ? 1 : 0);
    }

    public l(Integer num, String str, int i14, int i15, DateTime dateTime, DateTime dateTime2, Double d14, boolean z14) {
        this.f192415a = num;
        this.f192416b = str;
        this.f192417c = i14;
        this.f192418d = i15;
        this.f192419e = dateTime;
        this.f192420f = dateTime2;
        this.f192421g = d14;
        this.f192422h = z14;
    }

    public l() {
        this(null, null, 0, 0, null, null, null, false, 255, null);
    }
}
