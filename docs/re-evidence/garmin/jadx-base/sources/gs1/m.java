package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgs1/m;", "Landroid/os/Parcelable;", "Lgs1/m$b;", "payload", "<init>", "(Lgs1/m$b;)V", "a", "Lgs1/m$b;", "b", "()Lgs1/m$b;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final b payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPayload() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && p005kotlin.jvm.internal.s.g(this.payload, ((m) obj).payload);
    }

    public final int hashCode() {
        b bVar = this.payload;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "HeartRateZonesDTO(payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.payload;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public m(b bVar) {
        this.payload = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lgs1/m$b;", "Landroid/os/Parcelable;", "", "custom", "", "restingHeartRate", "", "userId", "zone0Ceiling", "zone1Ceiling", "zone2Ceiling", "zone3Ceiling", "zone4Ceiling", "zone5Ceiling", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Boolean;", "getCustom", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Integer;", "getRestingHeartRate", "()Ljava/lang/Integer;", "c", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("custom")
        private final Boolean custom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("restingHeartRate")
        private final Integer restingHeartRate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("userId")
        private final Long userId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone0Ceiling")
        private final Integer zone0Ceiling;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone1Ceiling")
        private final Integer zone1Ceiling;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone2Ceiling")
        private final Integer zone2Ceiling;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone3Ceiling")
        private final Integer zone3Ceiling;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone4Ceiling")
        private final Integer zone4Ceiling;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("zone5Ceiling")
        private final Integer zone5Ceiling;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<Integer> f78830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f78831k;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b(boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Boolean bool, Integer num, Long l14, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : num4, (i14 & 64) != 0 ? null : num5, (i14 & 128) != 0 ? null : num6, (i14 & 256) != 0 ? null : num7);
        }

        public final List<Integer> b() {
            if (this.f78830j == null) {
                this.f78830j = p13.x.k(this.zone0Ceiling, this.zone1Ceiling, this.zone2Ceiling, this.zone3Ceiling, this.zone4Ceiling, this.zone5Ceiling);
            }
            return this.f78830j;
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
            return p005kotlin.jvm.internal.s.g(this.custom, bVar.custom) && p005kotlin.jvm.internal.s.g(this.restingHeartRate, bVar.restingHeartRate) && p005kotlin.jvm.internal.s.g(this.userId, bVar.userId) && p005kotlin.jvm.internal.s.g(this.zone0Ceiling, bVar.zone0Ceiling) && p005kotlin.jvm.internal.s.g(this.zone1Ceiling, bVar.zone1Ceiling) && p005kotlin.jvm.internal.s.g(this.zone2Ceiling, bVar.zone2Ceiling) && p005kotlin.jvm.internal.s.g(this.zone3Ceiling, bVar.zone3Ceiling) && p005kotlin.jvm.internal.s.g(this.zone4Ceiling, bVar.zone4Ceiling) && p005kotlin.jvm.internal.s.g(this.zone5Ceiling, bVar.zone5Ceiling);
        }

        public final int hashCode() {
            Boolean bool = this.custom;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.restingHeartRate;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l14 = this.userId;
            int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Integer num2 = this.zone0Ceiling;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.zone1Ceiling;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.zone2Ceiling;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.zone3Ceiling;
            int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.zone4Ceiling;
            int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.zone5Ceiling;
            return iHashCode8 + (num7 != null ? num7.hashCode() : 0);
        }

        public final String toString() {
            Boolean bool = this.custom;
            Integer num = this.restingHeartRate;
            Long l14 = this.userId;
            Integer num2 = this.zone0Ceiling;
            Integer num3 = this.zone1Ceiling;
            Integer num4 = this.zone2Ceiling;
            Integer num5 = this.zone3Ceiling;
            Integer num6 = this.zone4Ceiling;
            Integer num7 = this.zone5Ceiling;
            StringBuilder sb3 = new StringBuilder("Payload(custom=");
            sb3.append(bool);
            sb3.append(", restingHeartRate=");
            sb3.append(num);
            sb3.append(", userId=");
            sb3.append(l14);
            sb3.append(", zone0Ceiling=");
            sb3.append(num2);
            sb3.append(", zone1Ceiling=");
            j20.x.m(sb3, num3, ", zone2Ceiling=", num4, ", zone3Ceiling=");
            j20.x.m(sb3, num5, ", zone4Ceiling=", num6, ", zone5Ceiling=");
            return f3.i(sb3, num7, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Boolean bool = this.custom;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                tn.k.m(parcel, 1, bool);
            }
            Integer num = this.restingHeartRate;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Long l14 = this.userId;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            Integer num2 = this.zone0Ceiling;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            Integer num3 = this.zone1Ceiling;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num3);
            }
            Integer num4 = this.zone2Ceiling;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num4);
            }
            Integer num5 = this.zone3Ceiling;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num5);
            }
            Integer num6 = this.zone4Ceiling;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num6);
            }
            Integer num7 = this.zone5Ceiling;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num7);
            }
        }

        public b(Boolean bool, Integer num, Long l14, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            this.custom = bool;
            this.restingHeartRate = num;
            this.userId = l14;
            this.zone0Ceiling = num2;
            this.zone1Ceiling = num3;
            this.zone2Ceiling = num4;
            this.zone3Ceiling = num5;
            this.zone4Ceiling = num6;
            this.zone5Ceiling = num7;
        }

        public b() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }
    }
}
