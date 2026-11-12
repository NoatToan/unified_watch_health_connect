package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/f0;", "Landroid/os/Parcelable;", "", "messageIndex", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "lapIndexes", "", "duration", "movingDuration", "totalExerciseReps", "Lorg/joda/time/DateTime;", "startTimeGMT", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Double;", "getDuration", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "f", "getTotalExerciseReps", "g", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageIndex")
    private final Integer messageIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapIndexes")
    private final List<Integer> lapIndexes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movingDuration")
    private final Double movingDuration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalExerciseReps")
    private final Integer totalExerciseReps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime startTimeGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new f0(numValueOf, string, arrayList, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i14) {
            return new f0[i14];
        }
    }

    public /* synthetic */ f0(Integer num, String str, List list, Double d14, Double d15, Integer num2, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : d15, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : dateTime);
    }

    public final List<Integer> b() {
        return this.lapIndexes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getMessageIndex() {
        return this.messageIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.messageIndex, f0Var.messageIndex) && p005kotlin.jvm.internal.s.g(this.type, f0Var.type) && p005kotlin.jvm.internal.s.g(this.lapIndexes, f0Var.lapIndexes) && p005kotlin.jvm.internal.s.g(this.duration, f0Var.duration) && p005kotlin.jvm.internal.s.g(this.movingDuration, f0Var.movingDuration) && p005kotlin.jvm.internal.s.g(this.totalExerciseReps, f0Var.totalExerciseReps) && p005kotlin.jvm.internal.s.g(this.startTimeGMT, f0Var.startTimeGMT);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMovingDuration() {
        return this.movingDuration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getStartTimeGMT() {
        return this.startTimeGMT;
    }

    public final int hashCode() {
        Integer num = this.messageIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.lapIndexes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Double d14 = this.duration;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.movingDuration;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num2 = this.totalExerciseReps;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DateTime dateTime = this.startTimeGMT;
        return iHashCode6 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.messageIndex;
        String str = this.type;
        List<Integer> list = this.lapIndexes;
        Double d14 = this.duration;
        Double d15 = this.movingDuration;
        Integer num2 = this.totalExerciseReps;
        DateTime dateTime = this.startTimeGMT;
        StringBuilder sbF = l2.f("SplitDTO(messageIndex=", num, ", type=", str, ", lapIndexes=");
        sbF.append(list);
        sbF.append(", duration=");
        sbF.append(d14);
        sbF.append(", movingDuration=");
        b71.i.t(sbF, d15, ", totalExerciseReps=", num2, ", startTimeGMT=");
        sbF.append(dateTime);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.messageIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.type);
        List<Integer> list = this.lapIndexes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        Double d14 = this.duration;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.movingDuration;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num2 = this.totalExerciseReps;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeSerializable(this.startTimeGMT);
    }

    public f0(Integer num, String str, List<Integer> list, Double d14, Double d15, Integer num2, DateTime dateTime) {
        this.messageIndex = num;
        this.type = str;
        this.lapIndexes = list;
        this.duration = d14;
        this.movingDuration = d15;
        this.totalExerciseReps = num2;
        this.startTimeGMT = dateTime;
    }

    public f0() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
