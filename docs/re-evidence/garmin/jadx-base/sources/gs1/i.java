package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgs1/i;", "Landroid/os/Parcelable;", "Lgs1/i$b;", "payload", "<init>", "(Lgs1/i$b;)V", "a", "Lgs1/i$b;", "b", "()Lgs1/i$b;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final b payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
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
        return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.payload, ((i) obj).payload);
    }

    public final int hashCode() {
        b bVar = this.payload;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "CurrentDayDailySleepDTO(payload=" + this.payload + ")";
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

    public i(b bVar) {
        this.payload = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'\"\u0004\b/\u0010)¨\u00060"}, d2 = {"Lgs1/i$b;", "Landroid/os/Parcelable;", "", "autoSleepEndTimestampGMT", "autoSleepStartTimestampGMT", "", "sleepTimeSeconds", "", "sleepWindowConfirmed", "napTimeSeconds", "", "Lgs1/k;", "dailyNaps", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;JJJJ)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "f", "c", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "getNapTimeSeconds", "Ljava/util/List;", "g", "()Ljava/util/List;", "J", "j", "()J", "setSleepStartTimestampGMT", "(J)V", "h", "setSleepEndTimestampGMT", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "setSleepStartTimestampLocal", "setSleepEndTimestampLocal", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("autoSleepEndTimestampGMT")
        private final Long autoSleepEndTimestampGMT;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("autoSleepStartTimestampGMT")
        private final Long autoSleepStartTimestampGMT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepTimeSeconds")
        private final Integer sleepTimeSeconds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepWindowConfirmed")
        private final Boolean sleepWindowConfirmed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("napTimeSeconds")
        private final Integer napTimeSeconds;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("dailyNapDTOS")
        private final List<k> dailyNaps;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepStartTimestampGMT")
        private long sleepStartTimestampGMT;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepEndTimestampGMT")
        private long sleepEndTimestampGMT;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepStartTimestampLocal")
        private long sleepStartTimestampLocal;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @SerializedName("sleepEndTimestampLocal")
        private long sleepEndTimestampLocal;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                parcel.getClass();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int iA = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList = new ArrayList(i14);
                    while (iA != i14) {
                        iA = kg.f.a(k.CREATOR, parcel, arrayList, iA, 1);
                    }
                }
                return new b(lValueOf, lValueOf2, numValueOf, boolValueOf, numValueOf2, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(Long l14, Long l15, Integer num, Boolean bool, Integer num2, List list, long j8, long j14, long j15, long j16, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : num2, (i14 & 32) == 0 ? list : null, (i14 & 64) != 0 ? 0L : j8, (i14 & 128) != 0 ? 0L : j14, (i14 & 256) != 0 ? 0L : j15, (i14 & 512) != 0 ? 0L : j16);
        }

        public static b b(b bVar, List list) {
            return new b(bVar.autoSleepEndTimestampGMT, bVar.autoSleepStartTimestampGMT, bVar.sleepTimeSeconds, bVar.sleepWindowConfirmed, bVar.napTimeSeconds, list, bVar.sleepStartTimestampGMT, bVar.sleepEndTimestampGMT, bVar.sleepStartTimestampLocal, bVar.sleepEndTimestampLocal);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getAutoSleepEndTimestampGMT() {
            return this.autoSleepEndTimestampGMT;
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
            return p005kotlin.jvm.internal.s.g(this.autoSleepEndTimestampGMT, bVar.autoSleepEndTimestampGMT) && p005kotlin.jvm.internal.s.g(this.autoSleepStartTimestampGMT, bVar.autoSleepStartTimestampGMT) && p005kotlin.jvm.internal.s.g(this.sleepTimeSeconds, bVar.sleepTimeSeconds) && p005kotlin.jvm.internal.s.g(this.sleepWindowConfirmed, bVar.sleepWindowConfirmed) && p005kotlin.jvm.internal.s.g(this.napTimeSeconds, bVar.napTimeSeconds) && p005kotlin.jvm.internal.s.g(this.dailyNaps, bVar.dailyNaps) && this.sleepStartTimestampGMT == bVar.sleepStartTimestampGMT && this.sleepEndTimestampGMT == bVar.sleepEndTimestampGMT && this.sleepStartTimestampLocal == bVar.sleepStartTimestampLocal && this.sleepEndTimestampLocal == bVar.sleepEndTimestampLocal;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getAutoSleepStartTimestampGMT() {
            return this.autoSleepStartTimestampGMT;
        }

        public final List<k> g() {
            return this.dailyNaps;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getSleepEndTimestampGMT() {
            return this.sleepEndTimestampGMT;
        }

        public final int hashCode() {
            Long l14 = this.autoSleepEndTimestampGMT;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            Long l15 = this.autoSleepStartTimestampGMT;
            int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
            Integer num = this.sleepTimeSeconds;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.sleepWindowConfirmed;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.napTimeSeconds;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<k> list = this.dailyNaps;
            return Long.hashCode(this.sleepEndTimestampLocal) + q6.f.e(q6.f.e(q6.f.e((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31, 31, this.sleepStartTimestampGMT), 31, this.sleepEndTimestampGMT), 31, this.sleepStartTimestampLocal);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final long getSleepEndTimestampLocal() {
            return this.sleepEndTimestampLocal;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final long getSleepStartTimestampGMT() {
            return this.sleepStartTimestampGMT;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getSleepStartTimestampLocal() {
            return this.sleepStartTimestampLocal;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Integer getSleepTimeSeconds() {
            return this.sleepTimeSeconds;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Boolean getSleepWindowConfirmed() {
            return this.sleepWindowConfirmed;
        }

        public final String toString() {
            Long l14 = this.autoSleepEndTimestampGMT;
            Long l15 = this.autoSleepStartTimestampGMT;
            Integer num = this.sleepTimeSeconds;
            Boolean bool = this.sleepWindowConfirmed;
            Integer num2 = this.napTimeSeconds;
            List<k> list = this.dailyNaps;
            long j8 = this.sleepStartTimestampGMT;
            long j14 = this.sleepEndTimestampGMT;
            long j15 = this.sleepStartTimestampLocal;
            long j16 = this.sleepEndTimestampLocal;
            StringBuilder sbJ = f3.j(l14, l15, "Payload(autoSleepEndTimestampGMT=", ", autoSleepStartTimestampGMT=", ", sleepTimeSeconds=");
            kg.f.r(sbJ, num, ", sleepWindowConfirmed=", bool, ", napTimeSeconds=");
            sbJ.append(num2);
            sbJ.append(", dailyNaps=");
            sbJ.append(list);
            sbJ.append(", sleepStartTimestampGMT=");
            sbJ.append(j8);
            j20.x.j(j14, ", sleepEndTimestampGMT=", ", sleepStartTimestampLocal=", sbJ);
            sbJ.append(j15);
            return com.nimbusds.jose.shaded.gson.internal.a.g(j16, ", sleepEndTimestampLocal=", ")", sbJ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Long l14 = this.autoSleepEndTimestampGMT;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            Long l15 = this.autoSleepStartTimestampGMT;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l15);
            }
            Integer num = this.sleepTimeSeconds;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Boolean bool = this.sleepWindowConfirmed;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                tn.k.m(parcel, 1, bool);
            }
            Integer num2 = this.napTimeSeconds;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            List<k> list = this.dailyNaps;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO = u0.o(parcel, list, 1);
                while (itO.hasNext()) {
                    ((k) itO.next()).writeToParcel(parcel, i14);
                }
            }
            parcel.writeLong(this.sleepStartTimestampGMT);
            parcel.writeLong(this.sleepEndTimestampGMT);
            parcel.writeLong(this.sleepStartTimestampLocal);
            parcel.writeLong(this.sleepEndTimestampLocal);
        }

        public b(Long l14, Long l15, Integer num, Boolean bool, Integer num2, List<k> list, long j8, long j14, long j15, long j16) {
            this.autoSleepEndTimestampGMT = l14;
            this.autoSleepStartTimestampGMT = l15;
            this.sleepTimeSeconds = num;
            this.sleepWindowConfirmed = bool;
            this.napTimeSeconds = num2;
            this.dailyNaps = list;
            this.sleepStartTimestampGMT = j8;
            this.sleepEndTimestampGMT = j14;
            this.sleepStartTimestampLocal = j15;
            this.sleepEndTimestampLocal = j16;
        }

        public b() {
            this(null, null, null, null, null, null, 0L, 0L, 0L, 0L, 1023, null);
        }
    }
}
