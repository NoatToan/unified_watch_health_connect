package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.a4;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b\u001e\u0010'R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"Lix1/f;", "Landroid/os/Parcelable;", "Lc22/a4;", "dayOfWeek", "", "trainingDayName", "", "estimatedDurationInSeconds", "", "Lix1/i;", "primaryExercises", "Lix1/j;", "secondaryExercises", "", "includeWarmup", "includeActivation", "includeCooldown", "<init>", "(Lc22/a4;Ljava/lang/String;JLjava/util/List;Ljava/util/List;ZZZ)V", "a", "Lc22/a4;", "b", "()Lc22/a4;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "c", "J", "getEstimatedDurationInSeconds", "()J", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "f", "Z", "g", "()Z", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayOfWeek")
    private final a4 dayOfWeek;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingDayName")
    private final String trainingDayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDurationInSeconds")
    private final long estimatedDurationInSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryExercises")
    private final List<i> primaryExercises;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryExercises")
    private final List<j> secondaryExercises;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeWarmup")
    private final boolean includeWarmup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeActivation")
    private final boolean includeActivation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeCooldown")
    private final boolean includeCooldown;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z14;
            boolean z15;
            parcel.getClass();
            a4 a4VarValueOf = a4.valueOf(parcel.readString());
            String string = parcel.readString();
            long j8 = parcel.readLong();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(i.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(j.CREATOR, parcel, arrayList2, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = false;
            }
            return new f(a4VarValueOf, string, j8, arrayList, arrayList2, z15, parcel.readInt() != 0 ? z14 : false, parcel.readInt() != 0 ? z14 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(a4 a4Var, String str, long j8, List list, List list2, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a4Var, str, j8, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2, z14, z15, z16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a4 getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIncludeActivation() {
        return this.includeActivation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.dayOfWeek == fVar.dayOfWeek && s.g(this.trainingDayName, fVar.trainingDayName) && this.estimatedDurationInSeconds == fVar.estimatedDurationInSeconds && s.g(this.primaryExercises, fVar.primaryExercises) && s.g(this.secondaryExercises, fVar.secondaryExercises) && this.includeWarmup == fVar.includeWarmup && this.includeActivation == fVar.includeActivation && this.includeCooldown == fVar.includeCooldown;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIncludeCooldown() {
        return this.includeCooldown;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIncludeWarmup() {
        return this.includeWarmup;
    }

    public final List<i> h() {
        return this.primaryExercises;
    }

    public final int hashCode() {
        int iE = q6.f.e(wr.g.j(this.dayOfWeek.hashCode() * 31, 31, this.trainingDayName), 31, this.estimatedDurationInSeconds);
        List<i> list = this.primaryExercises;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List<j> list2 = this.secondaryExercises;
        return Boolean.hashCode(this.includeCooldown) + q6.f.g(q6.f.g((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.includeWarmup), 31, this.includeActivation);
    }

    public final List<j> i() {
        return this.secondaryExercises;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTrainingDayName() {
        return this.trainingDayName;
    }

    public final String toString() {
        a4 a4Var = this.dayOfWeek;
        String str = this.trainingDayName;
        long j8 = this.estimatedDurationInSeconds;
        List<i> list = this.primaryExercises;
        List<j> list2 = this.secondaryExercises;
        boolean z14 = this.includeWarmup;
        boolean z15 = this.includeActivation;
        boolean z16 = this.includeCooldown;
        StringBuilder sb3 = new StringBuilder("StrengthTrainingDayDTO(dayOfWeek=");
        sb3.append(a4Var);
        sb3.append(", trainingDayName=");
        sb3.append(str);
        sb3.append(", estimatedDurationInSeconds=");
        sb3.append(j8);
        sb3.append(", primaryExercises=");
        sb3.append(list);
        sb3.append(", secondaryExercises=");
        sb3.append(list2);
        sb3.append(", includeWarmup=");
        sb3.append(z14);
        com.airbnb.lottie.animation.keyframe.a.v(", includeActivation=", ", includeCooldown=", sb3, z15, z16);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.dayOfWeek.name());
        parcel.writeString(this.trainingDayName);
        parcel.writeLong(this.estimatedDurationInSeconds);
        List<i> list = this.primaryExercises;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((i) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<j> list2 = this.secondaryExercises;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((j) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.includeWarmup ? 1 : 0);
        parcel.writeInt(this.includeActivation ? 1 : 0);
        parcel.writeInt(this.includeCooldown ? 1 : 0);
    }

    public f(a4 a4Var, String str, long j8, List<i> list, List<j> list2, boolean z14, boolean z15, boolean z16) {
        a4Var.getClass();
        str.getClass();
        this.dayOfWeek = a4Var;
        this.trainingDayName = str;
        this.estimatedDurationInSeconds = j8;
        this.primaryExercises = list;
        this.secondaryExercises = list2;
        this.includeWarmup = z14;
        this.includeActivation = z15;
        this.includeCooldown = z16;
    }
}
