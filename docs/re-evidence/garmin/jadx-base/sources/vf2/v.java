package vf2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b$\u00100R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b.\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b,\u00109R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b(\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b=\u0010'R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b4\u00103R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b6\u0010+¨\u0006@"}, d2 = {"Lvf2/v;", "", "", TtmlNode.ATTR_ID, "", "stepName", "intensity", "durationType", "Lvf2/g;", "_intensityType", "", "duration", "Lvf2/i;", "_stepDurationType", "", "Lvf2/w;", "targets", "exerciseCategoryId", "_exerciseCategory", "exerciseNameId", "_exerciseName", "", "exerciseWeight", "exerciseBenchmarkWeight", "exerciseBenchmarkPercent", "notes", "noteHandleIds", "skipFinalRest", "Lvf2/c;", "exerciseData", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lvf2/g;Ljava/lang/Double;Lvf2/i;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lvf2/c;)V", "a", "I", "h", "()I", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getIntensity", "()Ljava/lang/Integer;", "d", "getDurationType", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Ljava/util/List;", "m", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Float;", "g", "()Ljava/lang/Float;", JWKParameterNames.RSA_MODULUS, "o", "p", "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stepName")
    private final String stepName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intensity")
    private final Integer intensity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationType")
    private final Integer durationType;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f178039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f178041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targets")
    private final List<w> targets;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseCategory")
    private final Integer exerciseCategoryId;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f178044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseName")
    private final Integer exerciseNameId;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f178046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseWeight")
    private final Float exerciseWeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseBenchmarkWeight")
    private final Float exerciseBenchmarkWeight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseBenchmarkPercent")
    private final Float exerciseBenchmarkPercent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private final String notes;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noteHandleIds")
    private final List<String> noteHandleIds;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skipFinalRest")
    private final Integer skipFinalRest;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f178053s;

    public /* synthetic */ v(int i14, String str, Integer num, Integer num2, g gVar, Double d14, i iVar, List list, Integer num3, String str2, Integer num4, String str3, Float f14, Float f15, Float f16, String str4, List list2, Integer num5, c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : num2, (i15 & 16) != 0 ? null : gVar, (i15 & 32) != 0 ? null : d14, (i15 & 64) != 0 ? null : iVar, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? null : num3, (i15 & 512) != 0 ? null : str2, (i15 & 1024) != 0 ? null : num4, (i15 & 2048) != 0 ? null : str3, (i15 & 4096) != 0 ? null : f14, (i15 & 8192) != 0 ? null : f15, (i15 & 16384) != 0 ? null : f16, (i15 & 32768) != 0 ? null : str4, (i15 & 65536) != 0 ? null : list2, (i15 & 131072) != 0 ? null : num5, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : cVar);
    }

    public static v a(v vVar, String str, String str2, c cVar) {
        int i14 = vVar.id;
        String str3 = vVar.stepName;
        Integer num = vVar.intensity;
        Integer num2 = vVar.durationType;
        g gVar = vVar.f178039e;
        Double d14 = vVar.duration;
        i iVar = vVar.f178041g;
        List<w> list = vVar.targets;
        Integer num3 = vVar.exerciseCategoryId;
        Integer num4 = vVar.exerciseNameId;
        Float f14 = vVar.exerciseWeight;
        Float f15 = vVar.exerciseBenchmarkWeight;
        Float f16 = vVar.exerciseBenchmarkPercent;
        String str4 = vVar.notes;
        List<String> list2 = vVar.noteHandleIds;
        Integer num5 = vVar.skipFinalRest;
        vVar.getClass();
        return new v(i14, str3, num, num2, gVar, d14, iVar, list, num3, str, num4, str2, f14, f15, f16, str4, list2, num5, cVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getExerciseBenchmarkPercent() {
        return this.exerciseBenchmarkPercent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getExerciseBenchmarkWeight() {
        return this.exerciseBenchmarkWeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getExerciseCategoryId() {
        return this.exerciseCategoryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.id == vVar.id && p005kotlin.jvm.internal.s.g(this.stepName, vVar.stepName) && p005kotlin.jvm.internal.s.g(this.intensity, vVar.intensity) && p005kotlin.jvm.internal.s.g(this.durationType, vVar.durationType) && this.f178039e == vVar.f178039e && p005kotlin.jvm.internal.s.g(this.duration, vVar.duration) && this.f178041g == vVar.f178041g && p005kotlin.jvm.internal.s.g(this.targets, vVar.targets) && p005kotlin.jvm.internal.s.g(this.exerciseCategoryId, vVar.exerciseCategoryId) && p005kotlin.jvm.internal.s.g(this.f178044j, vVar.f178044j) && p005kotlin.jvm.internal.s.g(this.exerciseNameId, vVar.exerciseNameId) && p005kotlin.jvm.internal.s.g(this.f178046l, vVar.f178046l) && p005kotlin.jvm.internal.s.g(this.exerciseWeight, vVar.exerciseWeight) && p005kotlin.jvm.internal.s.g(this.exerciseBenchmarkWeight, vVar.exerciseBenchmarkWeight) && p005kotlin.jvm.internal.s.g(this.exerciseBenchmarkPercent, vVar.exerciseBenchmarkPercent) && p005kotlin.jvm.internal.s.g(this.notes, vVar.notes) && p005kotlin.jvm.internal.s.g(this.noteHandleIds, vVar.noteHandleIds) && p005kotlin.jvm.internal.s.g(this.skipFinalRest, vVar.skipFinalRest) && p005kotlin.jvm.internal.s.g(this.f178053s, vVar.f178053s);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getExerciseNameId() {
        return this.exerciseNameId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getExerciseWeight() {
        return this.exerciseWeight;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.stepName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.intensity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.durationType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        g gVar = this.f178039e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Double d14 = this.duration;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        i iVar = this.f178041g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List<w> list = this.targets;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.exerciseCategoryId;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f178044j;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.exerciseNameId;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f178046l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f14 = this.exerciseWeight;
        int iHashCode13 = (iHashCode12 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.exerciseBenchmarkWeight;
        int iHashCode14 = (iHashCode13 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.exerciseBenchmarkPercent;
        int iHashCode15 = (iHashCode14 + (f16 == null ? 0 : f16.hashCode())) * 31;
        String str4 = this.notes;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list2 = this.noteHandleIds;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num5 = this.skipFinalRest;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        c cVar = this.f178053s;
        return iHashCode18 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final List<String> i() {
        return this.noteHandleIds;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getSkipFinalRest() {
        return this.skipFinalRest;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    public final List<w> m() {
        return this.targets;
    }

    public final void n() {
        g gVar;
        Object next;
        Integer num = this.intensity;
        i iVar = null;
        Object obj = null;
        if (num != null) {
            int iIntValue = num.intValue();
            g.f177936b.getClass();
            Iterator<T> it = g.f177946l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((g) next).f177947a != iIntValue);
            gVar = (g) next;
        } else {
            gVar = null;
        }
        this.f178039e = gVar;
        Integer num2 = this.durationType;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            i.f177952b.getClass();
            for (Object obj2 : i.f177972x) {
                if (((i) obj2).f177973a == iIntValue2) {
                    obj = obj2;
                    break;
                }
            }
            iVar = (i) obj;
        }
        this.f178041g = iVar;
    }

    public final boolean o() {
        if (this.duration == null && this.targets == null && this.durationType == null && this.stepName == null) {
            return true;
        }
        List<w> list = this.targets;
        if ((list != null ? (w) h0.d0(list) : null) == null) {
            return false;
        }
        w wVar = (w) h0.d0(this.targets);
        return (wVar != null ? wVar.getTargetType() : null) == null;
    }

    public final String toString() {
        int i14 = this.id;
        String str = this.stepName;
        Integer num = this.intensity;
        Integer num2 = this.durationType;
        g gVar = this.f178039e;
        Double d14 = this.duration;
        i iVar = this.f178041g;
        List<w> list = this.targets;
        Integer num3 = this.exerciseCategoryId;
        Integer num4 = this.exerciseNameId;
        Float f14 = this.exerciseWeight;
        Float f15 = this.exerciseBenchmarkWeight;
        Float f16 = this.exerciseBenchmarkPercent;
        String str2 = this.notes;
        List<String> list2 = this.noteHandleIds;
        Integer num5 = this.skipFinalRest;
        StringBuilder sbR = wr.g.r(i14, "WorkoutStepDTO(id=", ", stepName=", str, ", intensity=");
        x.m(sbR, num, ", durationType=", num2, ", _intensityType=");
        sbR.append(gVar);
        sbR.append(", duration=");
        sbR.append(d14);
        sbR.append(", _stepDurationType=");
        sbR.append(iVar);
        sbR.append(", targets=");
        sbR.append(list);
        sbR.append(", exerciseCategoryId=");
        p6.b.l(num3, ", _exerciseCategory=", this.f178044j, ", exerciseNameId=", sbR);
        p6.b.l(num4, ", _exerciseName=", this.f178046l, ", exerciseWeight=", sbR);
        sbR.append(f14);
        sbR.append(", exerciseBenchmarkWeight=");
        sbR.append(f15);
        sbR.append(", exerciseBenchmarkPercent=");
        sbR.append(f16);
        sbR.append(", notes=");
        sbR.append(str2);
        sbR.append(", noteHandleIds=");
        sbR.append(list2);
        sbR.append(", skipFinalRest=");
        sbR.append(num5);
        sbR.append(", exerciseData=");
        sbR.append(this.f178053s);
        sbR.append(")");
        return sbR.toString();
    }

    public v(int i14, String str, Integer num, Integer num2, g gVar, Double d14, i iVar, List<w> list, Integer num3, String str2, Integer num4, String str3, Float f14, Float f15, Float f16, String str4, List<String> list2, Integer num5, c cVar) {
        this.id = i14;
        this.stepName = str;
        this.intensity = num;
        this.durationType = num2;
        this.f178039e = gVar;
        this.duration = d14;
        this.f178041g = iVar;
        this.targets = list;
        this.exerciseCategoryId = num3;
        this.f178044j = str2;
        this.exerciseNameId = num4;
        this.f178046l = str3;
        this.exerciseWeight = f14;
        this.exerciseBenchmarkWeight = f15;
        this.exerciseBenchmarkPercent = f16;
        this.notes = str4;
        this.noteHandleIds = list2;
        this.skipFinalRest = num5;
        this.f178053s = cVar;
    }
}
