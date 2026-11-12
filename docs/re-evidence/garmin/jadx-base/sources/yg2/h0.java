package yg2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b,\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b1\u00107R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b;\u00104¨\u0006<"}, d2 = {"Lyg2/h0;", "", "", FirebaseAnalytics.Param.INDEX, "Lmt2/l;", NotificationConstants.KEY_DATA_MIME_TYPE, "Llt2/a;", "duration", "Llt2/b;", "primaryTarget", "secondaryTarget", "Lyg2/n;", "status", "Lyg2/i0;", "workoutStepStrings", "", "Lcg2/a;", "primaryMuscles", "secondaryMuscles", "", "exerciseName", "category", "", "skipFinalRest", "notes", "noteHandleIds", "isRepeatStep", "<init>", "(ILmt2/l;Llt2/a;Llt2/b;Llt2/b;Lyg2/n;Lyg2/i0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Z)V", "a", "I", "f", "()I", "b", "Lmt2/l;", "o", "()Lmt2/l;", "c", "Llt2/a;", "d", "()Llt2/a;", "Llt2/b;", "j", "()Llt2/b;", JWKParameterNames.RSA_EXPONENT, "l", "Lyg2/n;", JWKParameterNames.RSA_MODULUS, "()Lyg2/n;", "h", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "g", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.INDEX)
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final mt2.l type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final lt2.a duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryTarget")
    private final lt2.b primaryTarget;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryTarget")
    private final lt2.b secondaryTarget;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final n status;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f197040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private final List<cg2.a> primaryMuscles;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryMuscles")
    private final List<cg2.a> secondaryMuscles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseName")
    private final String exerciseName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skipFinalRest")
    private final Boolean skipFinalRest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private final String notes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noteHandleIds")
    private final List<String> noteHandleIds;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f197048o;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197049a;

        static {
            int[] iArr = new int[mt2.i.values().length];
            try {
                iArr[mt2.i.INHALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mt2.i.EXHALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mt2.i.INHALE_HOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mt2.i.EXHALE_HOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f197049a = iArr;
        }
    }

    public /* synthetic */ h0(int i14, mt2.l lVar, lt2.a aVar, lt2.b bVar, lt2.b bVar2, n nVar, i0 i0Var, List list, List list2, String str, String str2, Boolean bool, String str3, List list3, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, lVar, aVar, bVar, (i15 & 16) != 0 ? null : bVar2, (i15 & 32) != 0 ? n.IDLE : nVar, (i15 & 64) != 0 ? null : i0Var, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? null : list2, (i15 & 512) != 0 ? null : str, (i15 & 1024) != 0 ? null : str2, (i15 & 2048) != 0 ? null : bool, str3, (i15 & 8192) != 0 ? null : list3, z14);
    }

    public static h0 a(h0 h0Var, n nVar) {
        int i14 = h0Var.index;
        mt2.l lVar = h0Var.type;
        lt2.a aVar = h0Var.duration;
        lt2.b bVar = h0Var.primaryTarget;
        lt2.b bVar2 = h0Var.secondaryTarget;
        i0 i0Var = h0Var.f197040g;
        List<cg2.a> list = h0Var.primaryMuscles;
        List<cg2.a> list2 = h0Var.secondaryMuscles;
        String str = h0Var.exerciseName;
        String str2 = h0Var.category;
        Boolean bool = h0Var.skipFinalRest;
        String str3 = h0Var.notes;
        List<String> list3 = h0Var.noteHandleIds;
        boolean z14 = h0Var.f197048o;
        h0Var.getClass();
        lVar.getClass();
        nVar.getClass();
        return new h0(i14, lVar, aVar, bVar, bVar2, nVar, i0Var, list, list2, str, str2, bool, str3, list3, z14);
    }

    public final String b(p3.m mVar) {
        int i14;
        int i15;
        x1 x1Var = p3.n.f135158a;
        lt2.b bVar = this.primaryTarget;
        mt2.i iVar = bVar != null ? bVar.f114870a : null;
        int i16 = iVar == null ? -1 : a.f197049a[iVar.ordinal()];
        if (i16 == 1) {
            i14 = -537112230;
            i15 = R.string.lbl_breathe_in;
        } else if (i16 == 2) {
            i14 = -537109701;
            i15 = R.string.lbl_breathe_out;
        } else {
            if (i16 != 3 && i16 != 4) {
                mVar.C(529653834);
                mVar.f();
                return null;
            }
            i14 = -537105637;
            i15 = R.string.lbl_hold_breath;
        }
        return sn.a.h(mVar, i14, i15, mVar);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lt2.a getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.index == h0Var.index && this.type == h0Var.type && p005kotlin.jvm.internal.s.g(this.duration, h0Var.duration) && p005kotlin.jvm.internal.s.g(this.primaryTarget, h0Var.primaryTarget) && p005kotlin.jvm.internal.s.g(this.secondaryTarget, h0Var.secondaryTarget) && this.status == h0Var.status && p005kotlin.jvm.internal.s.g(this.f197040g, h0Var.f197040g) && p005kotlin.jvm.internal.s.g(this.primaryMuscles, h0Var.primaryMuscles) && p005kotlin.jvm.internal.s.g(this.secondaryMuscles, h0Var.secondaryMuscles) && p005kotlin.jvm.internal.s.g(this.exerciseName, h0Var.exerciseName) && p005kotlin.jvm.internal.s.g(this.category, h0Var.category) && p005kotlin.jvm.internal.s.g(this.skipFinalRest, h0Var.skipFinalRest) && p005kotlin.jvm.internal.s.g(this.notes, h0Var.notes) && p005kotlin.jvm.internal.s.g(this.noteHandleIds, h0Var.noteHandleIds) && this.f197048o == h0Var.f197048o;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final List<String> g() {
        return this.noteHandleIds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + (Integer.hashCode(this.index) * 31)) * 31;
        lt2.a aVar = this.duration;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        lt2.b bVar = this.primaryTarget;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        lt2.b bVar2 = this.secondaryTarget;
        int iHashCode4 = (this.status.hashCode() + ((iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31;
        i0 i0Var = this.f197040g;
        int iHashCode5 = (iHashCode4 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        List<cg2.a> list = this.primaryMuscles;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<cg2.a> list2 = this.secondaryMuscles;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.exerciseName;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.skipFinalRest;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.notes;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list3 = this.noteHandleIds;
        return Boolean.hashCode(this.f197048o) + ((iHashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final List<cg2.a> i() {
        return this.primaryMuscles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final lt2.b getPrimaryTarget() {
        return this.primaryTarget;
    }

    public final List<cg2.a> k() {
        return this.secondaryMuscles;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final lt2.b getSecondaryTarget() {
        return this.secondaryTarget;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getSkipFinalRest() {
        return this.skipFinalRest;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final n getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final mt2.l getType() {
        return this.type;
    }

    public final boolean p() {
        return this.type == mt2.l.WARM_UP;
    }

    public final String toString() {
        if (!this.f197048o) {
            return super.toString();
        }
        return "Repeat Step: startIndex=" + fg2.h0.k(this) + ", endIndex=" + getIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(int i14, mt2.l lVar, lt2.a aVar, lt2.b bVar, lt2.b bVar2, n nVar, i0 i0Var, List<? extends cg2.a> list, List<? extends cg2.a> list2, String str, String str2, Boolean bool, String str3, List<String> list3, boolean z14) {
        lVar.getClass();
        nVar.getClass();
        this.index = i14;
        this.type = lVar;
        this.duration = aVar;
        this.primaryTarget = bVar;
        this.secondaryTarget = bVar2;
        this.status = nVar;
        this.f197040g = i0Var;
        this.primaryMuscles = list;
        this.secondaryMuscles = list2;
        this.exerciseName = str;
        this.category = str2;
        this.skipFinalRest = bool;
        this.notes = str3;
        this.noteHandleIds = list3;
        this.f197048o = z14;
    }
}
