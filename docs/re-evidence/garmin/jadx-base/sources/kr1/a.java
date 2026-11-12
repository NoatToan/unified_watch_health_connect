package kr1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import j20.x;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkr1/a;", "Landroid/os/Parcelable;", "", "_calendarDate", "Lkr1/a$b;", "values", "<init>", "(Ljava/lang/String;Lkr1/a$b;)V", "a", "Ljava/lang/String;", "b", "Lkr1/a$b;", "d", "()Lkr1/a$b;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2051a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String _calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("values")
    private final b values;

    /* JADX INFO: renamed from: kr1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2051a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bVar);
    }

    public final LocalDate b() {
        String str = this._calendarDate;
        if (str != null) {
            return k.v(str, "yyyy-MM-dd");
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getValues() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this._calendarDate, aVar._calendarDate) && s.g(this.values, aVar.values);
    }

    public final int hashCode() {
        String str = this._calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.values;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DailyStressSummaryDTO(_calendarDate=" + this._calendarDate + ", values=" + this.values + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this._calendarDate);
        b bVar = this.values;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public a(String str, b bVar) {
        this._calendarDate = str;
        this.values = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lkr1/a$b;", "Landroid/os/Parcelable;", "", "highStressDuration", "lowStressDuration", "overallStressLevel", "restStressDuration", "mediumStressDuration", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "c", "g", "h", JWKParameterNames.RSA_EXPONENT, "f", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C2052a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("highStressDuration")
        private final Integer highStressDuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("lowStressDuration")
        private final Integer lowStressDuration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("overallStressLevel")
        private final Integer overallStressLevel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restStressDuration")
        private final Integer restStressDuration;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("mediumStressDuration")
        private final Integer mediumStressDuration;

        /* JADX INFO: renamed from: kr1.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2052a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4, (i14 & 16) != 0 ? null : num5);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getHighStressDuration() {
            return this.highStressDuration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getLowStressDuration() {
            return this.lowStressDuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.highStressDuration, bVar.highStressDuration) && s.g(this.lowStressDuration, bVar.lowStressDuration) && s.g(this.overallStressLevel, bVar.overallStressLevel) && s.g(this.restStressDuration, bVar.restStressDuration) && s.g(this.mediumStressDuration, bVar.mediumStressDuration);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getMediumStressDuration() {
            return this.mediumStressDuration;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getOverallStressLevel() {
            return this.overallStressLevel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Integer getRestStressDuration() {
            return this.restStressDuration;
        }

        public final int hashCode() {
            Integer num = this.highStressDuration;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.lowStressDuration;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.overallStressLevel;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.restStressDuration;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.mediumStressDuration;
            return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
        }

        public final String toString() {
            Integer num = this.highStressDuration;
            Integer num2 = this.lowStressDuration;
            Integer num3 = this.overallStressLevel;
            Integer num4 = this.restStressDuration;
            Integer num5 = this.mediumStressDuration;
            StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "Values(highStressDuration=", ", lowStressDuration=", ", overallStressLevel=", num2);
            x.m(sbL, num3, ", restStressDuration=", num4, ", mediumStressDuration=");
            return f3.i(sbL, num5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.highStressDuration;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num);
            }
            Integer num2 = this.lowStressDuration;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num2);
            }
            Integer num3 = this.overallStressLevel;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num3);
            }
            Integer num4 = this.restStressDuration;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num4);
            }
            Integer num5 = this.mediumStressDuration;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                f.k(parcel, 1, num5);
            }
        }

        public b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.highStressDuration = num;
            this.lowStressDuration = num2;
            this.overallStressLevel = num3;
            this.restStressDuration = num4;
            this.mediumStressDuration = num5;
        }

        public b() {
            this(null, null, null, null, null, 31, null);
        }
    }
}
