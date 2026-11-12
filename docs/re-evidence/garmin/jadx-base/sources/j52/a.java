package j52;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lj52/a;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "startTimestamp", "", "duration", "count", "Lj52/h;", "movementType", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lj52/h;)V", "a", "Lorg/joda/time/DateTime;", "getStartTimestamp", "()Lorg/joda/time/DateTime;", "setStartTimestamp", "(Lorg/joda/time/DateTime;)V", "b", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "c", "getCount", "setCount", "d", "Lj52/h;", "getMovementType", "()Lj52/h;", "setMovementType", "(Lj52/h;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

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
    private h movementType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? h.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C1854a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(DateTime dateTime, Integer num, Integer num2, h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : hVar);
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
        return s.g(this.startTimestamp, aVar.startTimestamp) && s.g(this.duration, aVar.duration) && s.g(this.count, aVar.count) && this.movementType == aVar.movementType;
    }

    public final int hashCode() {
        DateTime dateTime = this.startTimestamp;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        Integer num = this.duration;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        h hVar = this.movementType;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
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
        h hVar = this.movementType;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
    }

    /* JADX INFO: renamed from: j52.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj52/a$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1854a {
        public /* synthetic */ C1854a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1854a() {
        }
    }

    public a(DateTime dateTime, Integer num, Integer num2, h hVar) {
        this.startTimestamp = dateTime;
        this.duration = num;
        this.count = num2;
        this.movementType = hVar;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
