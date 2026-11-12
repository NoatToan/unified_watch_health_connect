package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b-\u0010$¨\u0006."}, d2 = {"Lps/r0;", "Landroid/os/Parcelable;", "", "duration", "", "Lps/q0;", "exercisesSet", "", "exerciseTypeCandidates", "", "messageIndex", "", "repCount", "startTimeGMT", NotificationConstants.KEY_DATA_MIME_TYPE, "weight", "workoutStepIndex", "primaryMuscleList", "secondaryMuscleList", "exerciseName", "", "isBodyWeight", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "getExerciseTypeCandidates", "Ljava/lang/Integer;", "getMessageIndex", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "f", "Ljava/lang/String;", "h", JWKParameterNames.OCT_KEY_VALUE, "getWorkoutStepIndex", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exercises")
    private final List<q0> exercisesSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseTypeCandidates")
    private final List<String> exerciseTypeCandidates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageIndex")
    private final Integer messageIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("repetitionCount")
    private final Long repCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private final String startTimeGMT;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("setType")
    private final String type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final Long weight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wktStepIndex")
    private final Integer workoutStepIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f140203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f140204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f140205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f140206m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<r0> {
        @Override // android.os.Parcelable.Creator
        public final r0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Boolean boolValueOf = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(q0.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new r0(dValueOf, arrayList, arrayListCreateStringArrayList, numValueOf, lValueOf, string, string2, lValueOf2, numValueOf2, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final r0[] newArray(int i14) {
            return new r0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ r0(Double d14, List list, List list2, Integer num, Long l14, String str, String str2, Long l15, Integer num2, List list3, List list4, String str3, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : list3, (i14 & 1024) != 0 ? null : list4, (i14 & 2048) != 0 ? null : str3, (i14 & 4096) != 0 ? null : bool);
    }

    public static r0 b(r0 r0Var, ArrayList arrayList, List list, List list2, String str, Boolean bool) {
        return new r0(r0Var.duration, arrayList, r0Var.exerciseTypeCandidates, r0Var.messageIndex, r0Var.repCount, r0Var.startTimeGMT, r0Var.type, r0Var.weight, r0Var.workoutStepIndex, list, list2, str, bool);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getDuration() {
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
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p005kotlin.jvm.internal.s.g(this.duration, r0Var.duration) && p005kotlin.jvm.internal.s.g(this.exercisesSet, r0Var.exercisesSet) && p005kotlin.jvm.internal.s.g(this.exerciseTypeCandidates, r0Var.exerciseTypeCandidates) && p005kotlin.jvm.internal.s.g(this.messageIndex, r0Var.messageIndex) && p005kotlin.jvm.internal.s.g(this.repCount, r0Var.repCount) && p005kotlin.jvm.internal.s.g(this.startTimeGMT, r0Var.startTimeGMT) && p005kotlin.jvm.internal.s.g(this.type, r0Var.type) && p005kotlin.jvm.internal.s.g(this.weight, r0Var.weight) && p005kotlin.jvm.internal.s.g(this.workoutStepIndex, r0Var.workoutStepIndex) && p005kotlin.jvm.internal.s.g(this.f140203j, r0Var.f140203j) && p005kotlin.jvm.internal.s.g(this.f140204k, r0Var.f140204k) && p005kotlin.jvm.internal.s.g(this.f140205l, r0Var.f140205l) && p005kotlin.jvm.internal.s.g(this.f140206m, r0Var.f140206m);
    }

    public final String f() {
        q0 q0VarH = h();
        String strD = q0VarH != null ? q0VarH.getExerciseName() : null;
        if (strD == null || strD.length() == 0) {
            if (q0VarH != null) {
                return q0VarH.getCategory();
            }
            return null;
        }
        if (q0VarH != null) {
            return q0VarH.getExerciseName();
        }
        return null;
    }

    public final List<q0> g() {
        return this.exercisesSet;
    }

    public final q0 h() {
        List<q0> list = this.exercisesSet;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        p13.d0.A(arrayList, new sk0.r1(6), true);
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return null;
        }
        q0 q0Var = (q0) it.next();
        while (it.hasNext()) {
            q0 q0Var2 = (q0) it.next();
            Double dF = q0Var.getProbability();
            double dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
            Double dF2 = q0Var2.getProbability();
            if (Double.compare(dDoubleValue, dF2 != null ? dF2.doubleValue() : 0.0d) < 0) {
                q0Var = q0Var2;
            }
        }
        return q0Var;
    }

    public final int hashCode() {
        Double d14 = this.duration;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        List<q0> list = this.exercisesSet;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.exerciseTypeCandidates;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.messageIndex;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.repCount;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.startTimeGMT;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.weight;
        int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num2 = this.workoutStepIndex;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list3 = this.f140203j;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f140204k;
        int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.f140205l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f140206m;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getRepCount() {
        return this.repCount;
    }

    public final qs.i j() {
        Object next;
        w13.c cVar = qs.i.f147091d;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (d53.u.q(((qs.i) next).name(), this.type, true)) {
                return (qs.i) next;
            }
        }
        next = null;
        return (qs.i) next;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getWeight() {
        return this.weight;
    }

    public final String toString() {
        Double d14 = this.duration;
        List<q0> list = this.exercisesSet;
        List<String> list2 = this.exerciseTypeCandidates;
        Integer num = this.messageIndex;
        Long l14 = this.repCount;
        String str = this.startTimeGMT;
        String str2 = this.type;
        Long l15 = this.weight;
        Integer num2 = this.workoutStepIndex;
        List<String> list3 = this.f140203j;
        List<String> list4 = this.f140204k;
        String str3 = this.f140205l;
        Boolean bool = this.f140206m;
        StringBuilder sb3 = new StringBuilder("ExerciseSetDTO(duration=");
        sb3.append(d14);
        sb3.append(", exercisesSet=");
        sb3.append(list);
        sb3.append(", exerciseTypeCandidates=");
        sb3.append(list2);
        sb3.append(", messageIndex=");
        sb3.append(num);
        sb3.append(", repCount=");
        b71.i.q(l14, ", startTimeGMT=", str, ", type=", sb3);
        n23.j.q(l15, str2, ", weight=", ", workoutStepIndex=", sb3);
        sb3.append(num2);
        sb3.append(", primaryMuscleList=");
        sb3.append(list3);
        sb3.append(", secondaryMuscleList=");
        o2.c.n(", exerciseName=", str3, ", isBodyWeight=", sb3, list4);
        return p6.b.f(sb3, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.duration;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        List<q0> list = this.exercisesSet;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((q0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeStringList(this.exerciseTypeCandidates);
        Integer num = this.messageIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l14 = this.repCount;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.startTimeGMT);
        parcel.writeString(this.type);
        Long l15 = this.weight;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num2 = this.workoutStepIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeStringList(this.f140203j);
        parcel.writeStringList(this.f140204k);
        parcel.writeString(this.f140205l);
        Boolean bool = this.f140206m;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/r0$a;", "", "<init>", "()V", "", "PROBABILITY_THRESHOLD", "D", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public r0(Double d14, List<q0> list, List<String> list2, Integer num, Long l14, String str, String str2, Long l15, Integer num2, List<String> list3, List<String> list4, String str3, Boolean bool) {
        this.duration = d14;
        this.exercisesSet = list;
        this.exerciseTypeCandidates = list2;
        this.messageIndex = num;
        this.repCount = l14;
        this.startTimeGMT = str;
        this.type = str2;
        this.weight = l15;
        this.workoutStepIndex = num2;
        this.f140203j = list3;
        this.f140204k = list4;
        this.f140205l = str3;
        this.f140206m = bool;
    }

    public r0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
