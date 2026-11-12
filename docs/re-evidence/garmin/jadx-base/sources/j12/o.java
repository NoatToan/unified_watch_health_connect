package j12;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u001b\u0010\u001aR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lj12/o;", "Landroid/os/Parcelable;", "", "distance", "steps", "", "dailyAverageSteps", "dailyAveragePushes", "pushes", "pushDistance", "<init>", "(IIFFII)V", "a", "I", "f", "()I", "setDistance", "(I)V", "b", IntegerTokenConverter.CONVERTER_KEY, "setSteps", "c", "F", "d", "()F", "setDailyAverageSteps", "(F)V", "setDailyAveragePushes", JWKParameterNames.RSA_EXPONENT, "h", "setPushes", "g", "setPushDistance", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private int distance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private int steps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyAverageSteps")
    private float dailyAverageSteps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyAveragePushes")
    private float dailyAveragePushes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private int pushes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushDistance")
    private int pushDistance;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(int i14, int i15, float f14, float f15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this((i18 & 1) != 0 ? 0 : i14, (i18 & 2) != 0 ? 0 : i15, (i18 & 4) != 0 ? 0.0f : f14, (i18 & 8) != 0 ? 0.0f : f15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getDailyAveragePushes() {
        return this.dailyAveragePushes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getDailyAverageSteps() {
        return this.dailyAverageSteps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.distance == oVar.distance && this.steps == oVar.steps && Float.compare(this.dailyAverageSteps, oVar.dailyAverageSteps) == 0 && Float.compare(this.dailyAveragePushes, oVar.dailyAveragePushes) == 0 && this.pushes == oVar.pushes && this.pushDistance == oVar.pushDistance;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPushDistance() {
        return this.pushDistance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPushes() {
        return this.pushes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pushDistance) + q2.d(this.pushes, q6.f.d(this.dailyAveragePushes, q6.f.d(this.dailyAverageSteps, q2.d(this.steps, Integer.hashCode(this.distance) * 31, 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public final String toString() {
        int i14 = this.distance;
        int i15 = this.steps;
        float f14 = this.dailyAverageSteps;
        float f15 = this.dailyAveragePushes;
        int i16 = this.pushes;
        int i17 = this.pushDistance;
        StringBuilder sbJ = e5.j(i14, i15, "WellnessGoalDTO(distance=", ", steps=", ", dailyAverageSteps=");
        l2.n(sbJ, f14, ", dailyAveragePushes=", f15, ", pushes=");
        return androidx.core.view.j.e(i16, i17, ", pushDistance=", ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.distance);
        parcel.writeInt(this.steps);
        parcel.writeFloat(this.dailyAverageSteps);
        parcel.writeFloat(this.dailyAveragePushes);
        parcel.writeInt(this.pushes);
        parcel.writeInt(this.pushDistance);
    }

    public o(int i14, int i15, float f14, float f15, int i16, int i17) {
        this.distance = i14;
        this.steps = i15;
        this.dailyAverageSteps = f14;
        this.dailyAveragePushes = f15;
        this.pushes = i16;
        this.pushDistance = i17;
    }

    public o() {
        this(0, 0, 0.0f, 0.0f, 0, 0, 63, null);
    }
}
