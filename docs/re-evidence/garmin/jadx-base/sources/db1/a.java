package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0018\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ldb1/a;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "startTimestamp", "", "duration", "count", "Ldb1/g;", "movementType", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ldb1/g;)V", "a", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "(Lorg/joda/time/DateTime;)V", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;)V", "c", "h", "Ldb1/g;", "f", "()Ldb1/g;", "j", "(Ldb1/g;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestamp")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private DateTime startTimestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private Integer duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("count")
    private Integer count;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movementType")
    private g movementType;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1254a f58980e = new C1254a(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(DateTime dateTime, Integer num, Integer num2, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
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
        return p005kotlin.jvm.internal.s.g(this.startTimestamp, aVar.startTimestamp) && p005kotlin.jvm.internal.s.g(this.duration, aVar.duration) && p005kotlin.jvm.internal.s.g(this.count, aVar.count) && this.movementType == aVar.movementType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getMovementType() {
        return this.movementType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void h(Integer num) {
        this.count = num;
    }

    public final int hashCode() {
        DateTime dateTime = this.startTimestamp;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Integer num = this.duration;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        g gVar = this.movementType;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final void i(Integer num) {
        this.duration = num;
    }

    public final void j(g gVar) {
        this.movementType = gVar;
    }

    public final void k(DateTime dateTime) {
        this.startTimestamp = dateTime;
    }

    public final String toString() {
        return "BabyMovementDTO(startTimestamp=" + this.startTimestamp + ", duration=" + this.duration + ", count=" + this.count + ", movementType=" + this.movementType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.startTimestamp);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        g gVar = this.movementType;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar.name());
        }
    }

    /* JADX INFO: renamed from: db1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/a$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1254a {
        public /* synthetic */ C1254a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(a aVar) {
            aVar.getClass();
            return new a(aVar.getStartTimestamp(), aVar.getDuration(), aVar.getCount(), aVar.getMovementType());
        }

        private C1254a() {
        }
    }

    public a(DateTime dateTime, Integer num, Integer num2, g gVar) {
        this.startTimestamp = dateTime;
        this.duration = num;
        this.count = num2;
        this.movementType = gVar;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
