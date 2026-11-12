package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lj12/f;", "Landroid/os/Parcelable;", "", "", "typeId", "activityId", "", "activityName", "", "value", "Lj12/g;", "poolLengthUnit", "<init>", "(JJLjava/lang/String;DLj12/g;)V", "a", "J", "b", "()J", "setTypeId", "(J)V", "getActivityId", "setActivityId", "c", "Ljava/lang/String;", "getActivityName", "()Ljava/lang/String;", "setActivityName", "(Ljava/lang/String;)V", "d", "D", "()D", "setValue", "(D)V", JWKParameterNames.RSA_EXPONENT, "Lj12/g;", "getPoolLengthUnit", "()Lj12/g;", "setPoolLengthUnit", "(Lj12/g;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements Parcelable, Comparable<f> {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private long typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private long activityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private String activityName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private double value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("poolLengthUnit")
    private g poolLengthUnit;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(long j8, long j14, String str, double d14, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? 0.0d : d14, (i14 & 16) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTypeId() {
        return this.typeId;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f fVar2 = fVar;
        fVar2.getClass();
        return s.i(this.typeId, fVar2.typeId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.typeId);
        parcel.writeLong(this.activityId);
        parcel.writeString(this.activityName);
        parcel.writeDouble(this.value);
        g gVar = this.poolLengthUnit;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
    }

    public f(long j8, long j14, String str, double d14, g gVar) {
        this.typeId = j8;
        this.activityId = j14;
        this.activityName = str;
        this.value = d14;
        this.poolLengthUnit = gVar;
    }

    public f() {
        this(0L, 0L, null, 0.0d, null, 31, null);
    }
}
