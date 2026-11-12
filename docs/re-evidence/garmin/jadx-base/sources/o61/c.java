package o61;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lo61/c;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "a", "Ljava/lang/Long;", "getActivityId", "()Ljava/lang/Long;", "setActivityId", "(Ljava/lang/Long;)V", "activityId", "", "b", "Ljava/lang/String;", "getStartLocal", "()Ljava/lang/String;", "setStartLocal", "(Ljava/lang/String;)V", "startLocal", "", "c", "Ljava/lang/Double;", "getBottomTime", "()Ljava/lang/Double;", "setBottomTime", "(Ljava/lang/Double;)V", "bottomTime", "CREATOR", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends s1 implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLocal")
    private String startLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bottomTime")
    private Double bottomTime;

    public c(Parcel parcel) {
        parcel.getClass();
        this.activityId = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.startLocal = parcel.readString();
        this.bottomTime = parcel.readByte() != 0 ? Double.valueOf(parcel.readDouble()) : null;
    }

    public final long C() {
        Double d14 = this.bottomTime;
        if (d14 == null) {
            return 0L;
        }
        d14.getClass();
        if (d14.doubleValue() < 0.0d) {
            return 0L;
        }
        Double d15 = this.bottomTime;
        d15.getClass();
        return Math.round(d15.doubleValue() / ((double) 1000));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.activityId = Long.valueOf(jSONObject.optLong("activityId", -1L));
        this.startLocal = jSONObject.optString("startLocal");
        this.bottomTime = Double.valueOf(jSONObject.optDouble("bottomTime", 0.0d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        if (this.activityId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Long l14 = this.activityId;
            l14.getClass();
            parcel.writeLong(l14.longValue());
        }
        parcel.writeString(this.startLocal);
        if (this.bottomTime == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        Double d14 = this.bottomTime;
        d14.getClass();
        parcel.writeDouble(d14.doubleValue());
    }

    /* JADX INFO: renamed from: o61.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo61/c$a;", "Landroid/os/Parcelable$Creator;", "Lo61/c;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<c> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }

        private Companion() {
        }
    }

    public c() {
    }
}
