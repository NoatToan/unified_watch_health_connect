package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.workouts.data.model.w;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010,¨\u00063"}, d2 = {"Ltw1/r;", "Landroid/os/Parcelable;", "", "trainingPlanId", "weekId", "dayOfWeekId", "workoutOrder", "Ltw1/j;", "taskWorkout", "Ltw1/i;", "taskNote", "", "noteNameI18nKey", "noteContentI18nKey", "", "longWkt", "priority", "_calendarDate", "_grouped", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ltw1/j;Ltw1/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "getTrainingPlanId", "()Ljava/lang/Integer;", "b", "f", "c", "getDayOfWeekId", "d", "getWorkoutOrder", JWKParameterNames.RSA_EXPONENT, "Ltw1/j;", "()Ltw1/j;", "Ltw1/i;", "getTaskNote", "()Ltw1/i;", "g", "Ljava/lang/String;", "getNoteNameI18nKey", "()Ljava/lang/String;", "h", "getNoteContentI18nKey", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "getLongWkt", "()Ljava/lang/Boolean;", "j", "getPriority", JWKParameterNames.OCT_KEY_VALUE, "l", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private final Integer trainingPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekId")
    private final Integer weekId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayOfWeekId")
    private final Integer dayOfWeekId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutOrder")
    private final Integer workoutOrder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("taskWorkout")
    private final j taskWorkout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("taskNote")
    private final i taskNote;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noteNameI18nKey")
    private final String noteNameI18nKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noteContentI18nKey")
    private final String noteContentI18nKey;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longWkt")
    private final Boolean longWkt;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private final Integer priority;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("grouped")
    private final Boolean _grouped;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            j jVarCreateFromParcel = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = null;
            Integer num = numValueOf3;
            String string = parcel.readString();
            Integer num2 = numValueOf;
            Integer num3 = numValueOf2;
            Integer num4 = numValueOf4;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z14 = false;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                boolValueOf2 = Boolean.valueOf(z14);
            }
            return new r(num2, num3, num, num4, jVarCreateFromParcel, iVarCreateFromParcel, string, string2, boolValueOf, numValueOf5, string3, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    static {
        Parcelable.Creator<w> creator = w.CREATOR;
    }

    public r(Integer num, Integer num2, Integer num3, Integer num4, j jVar, i iVar, String str, String str2, Boolean bool, Integer num5, String str3, Boolean bool2) {
        this.trainingPlanId = num;
        this.weekId = num2;
        this.dayOfWeekId = num3;
        this.workoutOrder = num4;
        this.taskWorkout = jVar;
        this.taskNote = iVar;
        this.noteNameI18nKey = str;
        this.noteContentI18nKey = str2;
        this.longWkt = bool;
        this.priority = num5;
        this._calendarDate = str3;
        this._grouped = bool2;
    }

    public final DateTime b() {
        String str = this._calendarDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getTaskWorkout() {
        return this.taskWorkout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.trainingPlanId, rVar.trainingPlanId) && p005kotlin.jvm.internal.s.g(this.weekId, rVar.weekId) && p005kotlin.jvm.internal.s.g(this.dayOfWeekId, rVar.dayOfWeekId) && p005kotlin.jvm.internal.s.g(this.workoutOrder, rVar.workoutOrder) && p005kotlin.jvm.internal.s.g(this.taskWorkout, rVar.taskWorkout) && p005kotlin.jvm.internal.s.g(this.taskNote, rVar.taskNote) && p005kotlin.jvm.internal.s.g(this.noteNameI18nKey, rVar.noteNameI18nKey) && p005kotlin.jvm.internal.s.g(this.noteContentI18nKey, rVar.noteContentI18nKey) && p005kotlin.jvm.internal.s.g(this.longWkt, rVar.longWkt) && p005kotlin.jvm.internal.s.g(this.priority, rVar.priority) && p005kotlin.jvm.internal.s.g(this._calendarDate, rVar._calendarDate) && p005kotlin.jvm.internal.s.g(this._grouped, rVar._grouped);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getWeekId() {
        return this.weekId;
    }

    public final boolean g() {
        return p005kotlin.jvm.internal.s.g(this._grouped, Boolean.TRUE);
    }

    public final int hashCode() {
        Integer num = this.trainingPlanId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.weekId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dayOfWeekId;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.workoutOrder;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        j jVar = this.taskWorkout;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i iVar = this.taskNote;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.noteNameI18nKey;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.noteContentI18nKey;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.longWkt;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.priority;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this._calendarDate;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this._grouped;
        return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.trainingPlanId;
        Integer num2 = this.weekId;
        Integer num3 = this.dayOfWeekId;
        Integer num4 = this.workoutOrder;
        j jVar = this.taskWorkout;
        i iVar = this.taskNote;
        String str = this.noteNameI18nKey;
        String str2 = this.noteContentI18nKey;
        Boolean bool = this.longWkt;
        Integer num5 = this.priority;
        String str3 = this._calendarDate;
        Boolean bool2 = this._grouped;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "TrainingTaskDTO(trainingPlanId=", ", weekId=", ", dayOfWeekId=", num2);
        x.m(sbL, num3, ", workoutOrder=", num4, ", taskWorkout=");
        sbL.append(jVar);
        sbL.append(", taskNote=");
        sbL.append(iVar);
        sbL.append(", noteNameI18nKey=");
        sn.a.t(sbL, str, ", noteContentI18nKey=", str2, ", longWkt=");
        sbL.append(bool);
        sbL.append(", priority=");
        sbL.append(num5);
        sbL.append(", _calendarDate=");
        sbL.append(str3);
        sbL.append(", _grouped=");
        sbL.append(bool2);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.trainingPlanId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.weekId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.dayOfWeekId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.workoutOrder;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        j jVar = this.taskWorkout;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        i iVar = this.taskNote;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.noteNameI18nKey);
        parcel.writeString(this.noteContentI18nKey);
        Boolean bool = this.longWkt;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Integer num5 = this.priority;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        parcel.writeString(this._calendarDate);
        Boolean bool2 = this._grouped;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }
}
