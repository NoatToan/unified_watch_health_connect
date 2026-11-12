package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.util.Locale;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.z1;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002@ABû\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0015\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010)\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020\u0015\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u00106\u001a\u00020\u0015\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u00109\u001a\u00020\u0015\u0012\b\b\u0002\u0010:\u001a\u00020\u0015\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "Landroid/os/Parcelable;", "", "stepOrder", "stepId", "Lm52/d;", "stepType", "childStepId", "numberOfIterations", "", "smartRepeat", "skipLastRestStep", "isSkipLastRestStepUpdated", "minReps", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0$c;", "relativeWeight", "", "description", "Lm52/a;", "endConditionType", "endConditionFactor", "", "endConditionValue", "endConditionCompare", "Lm52/j;", "preferredEndConditionUnit", "Lm52/g;", "targetType", "targetValueOne", "targetValueTwo", "Lm52/h;", "targetValueUnit", "powerCurveDuration", "powerCurveScale", "powerCurveRange", "secondaryTargetPowerCurveDuration", "secondaryTargetPowerCurveScale", "secondaryTargetPowerCurveRange", "zoneNumber", "targetValueMidpoint", "secondaryTargetType", "secondaryTargetValueOne", "secondaryTargetValueTwo", "secondaryTargetValueUnit", "secondaryZoneNumber", "Lm52/f;", "strokeType", "strokeId", "Lm52/e;", "equipmentType", "Lqs/f;", "drillType", "category", "exerciseName", "weightValue", "weightUnit", "benchmarkKey", "benchmarkPercentage", "benchmarkWeight", "audioNoteUUID", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "audioNote", "<init>", "(IILm52/d;IIZLjava/lang/Boolean;ZZLcom/garmin/android/apps/connectmobile/workouts/data/model/j0$c;Ljava/lang/String;Lm52/a;IDLjava/lang/String;Lm52/j;Lm52/g;DDLm52/h;IIIIIIIDLm52/g;DDLm52/h;ILm52/f;ILm52/e;Lqs/f;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;)V", "a", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 implements Parcelable {
    public int A;
    public int B;
    public int C;
    public double D;
    public m52.g E;
    public double F;
    public String H0;
    public double I;
    public String I0;
    public double J0;
    public final String K0;
    public String L0;
    public double M0;
    public double N0;
    public String O0;
    public m52.h P;
    public com.garmin.android.apps.connectmobile.workouts.data.model.a P0;
    public int T;
    public m52.f X;
    public final int Y;
    public m52.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m52.d f48217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f48221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f48224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48225k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public qs.f f48226k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m52.a f48227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f48229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f48230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m52.j f48231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m52.g f48232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f48233r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f48234t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m52.h f48235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f48236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f48237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f48238y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f48239z;
    public static final a Q0 = new a(null);
    public static final Parcelable.Creator<j0> CREATOR = new b();
    public static final int R0 = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final j0 createFromParcel(Parcel parcel) {
            m52.d dVarValueOf;
            m52.a aVar;
            Boolean boolValueOf;
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            if (parcel.readInt() == 0) {
                dVarValueOf = null;
                aVar = null;
            } else {
                dVarValueOf = m52.d.valueOf(parcel.readString());
                aVar = null;
            }
            int i16 = parcel.readInt();
            m52.a aVar2 = aVar;
            int i17 = parcel.readInt();
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = aVar2;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            boolean z16 = parcel.readInt() != 0;
            Object objValueOf = parcel.readInt() == 0 ? aVar2 : c.valueOf(parcel.readString());
            String string = parcel.readString();
            m52.a aVarValueOf = parcel.readInt() == 0 ? aVar2 : m52.a.valueOf(parcel.readString());
            int i18 = parcel.readInt();
            Boolean bool = boolValueOf;
            c cVar = objValueOf;
            m52.a aVar3 = aVarValueOf;
            double d14 = parcel.readDouble();
            String string2 = parcel.readString();
            Object objValueOf2 = parcel.readInt() == 0 ? aVar2 : m52.j.valueOf(parcel.readString());
            Object objValueOf3 = parcel.readInt() == 0 ? aVar2 : m52.g.valueOf(parcel.readString());
            double d15 = parcel.readDouble();
            m52.j jVar = objValueOf2;
            m52.g gVar = objValueOf3;
            double d16 = parcel.readDouble();
            Object objValueOf4 = parcel.readInt() == 0 ? aVar2 : m52.h.valueOf(parcel.readString());
            return new j0(i14, i15, dVarValueOf, i16, i17, z15, bool, z14, z16, cVar, string, aVar3, i18, d14, string2, jVar, gVar, d15, d16, objValueOf4, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt() == 0 ? aVar2 : m52.g.valueOf(parcel.readString()), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? aVar2 : m52.h.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? aVar2 : m52.f.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? aVar2 : m52.e.valueOf(parcel.readString()), parcel.readInt() == 0 ? aVar2 : qs.f.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), (com.garmin.android.apps.connectmobile.workouts.data.model.a) (parcel.readInt() == 0 ? aVar2 : com.garmin.android.apps.connectmobile.workouts.data.model.a.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final j0[] newArray(int i14) {
            return new j0[i14];
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.workouts.data.model.j0$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.workouts.data.model.j0$c[]) from 0x003a: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.workouts.data.model.j0$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        LIGHT,
        MODERATE,
        HEAVY,
        VERY_HEAVY,
        BODY_WEIGHT;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f48246g;

        static {
            f48246g = new w13.c(cVarArr);
        }

        private c() {
            super(str, i);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f48245f.clone();
        }
    }

    public /* synthetic */ j0(int i14, int i15, m52.d dVar, int i16, int i17, boolean z14, Boolean bool, boolean z15, boolean z16, c cVar, String str, m52.a aVar, int i18, double d14, String str2, m52.j jVar, m52.g gVar, double d15, double d16, m52.h hVar, int i19, int i24, int i25, int i26, int i27, int i28, int i29, double d17, m52.g gVar2, double d18, double d19, m52.h hVar2, int i30, m52.f fVar, int i34, m52.e eVar, qs.f fVar2, String str3, String str4, double d24, String str5, String str6, double d25, double d26, String str7, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2, int i35, int i36, p005kotlin.jvm.internal.j jVar2) {
        this((i35 & 1) != 0 ? 1 : i14, (i35 & 2) != 0 ? 0 : i15, (i35 & 4) != 0 ? null : dVar, (i35 & 8) != 0 ? 0 : i16, (i35 & 16) != 0 ? 0 : i17, (i35 & 32) != 0 ? false : z14, (i35 & 64) != 0 ? null : bool, (i35 & 128) != 0 ? false : z15, (i35 & 256) != 0 ? false : z16, (i35 & 512) != 0 ? null : cVar, (i35 & 1024) != 0 ? null : str, (i35 & 2048) != 0 ? null : aVar, (i35 & 4096) != 0 ? 0 : i18, (i35 & 8192) != 0 ? 0.0d : d14, (i35 & 16384) != 0 ? null : str2, (i35 & 32768) != 0 ? null : jVar, (i35 & 65536) != 0 ? null : gVar, (i35 & 131072) != 0 ? 0.0d : d15, (i35 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? 0.0d : d16, (i35 & 524288) != 0 ? null : hVar, (i35 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? -1 : i19, (i35 & 2097152) != 0 ? -1 : i24, (i35 & 4194304) != 0 ? -1 : i25, (i35 & 8388608) != 0 ? -1 : i26, (i35 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? -1 : i27, (i35 & 33554432) == 0 ? i28 : -1, (i35 & 67108864) != 0 ? 0 : i29, (i35 & 134217728) != 0 ? 0.0d : d17, (i35 & 268435456) != 0 ? null : gVar2, (i35 & 536870912) != 0 ? 0.0d : d18, (i35 & 1073741824) == 0 ? d19 : 0.0d, (i35 & Integer.MIN_VALUE) != 0 ? null : hVar2, (i36 & 1) != 0 ? 0 : i30, (i36 & 2) != 0 ? null : fVar, (i36 & 4) != 0 ? 0 : i34, (i36 & 8) != 0 ? null : eVar, (i36 & 16) != 0 ? null : fVar2, (i36 & 32) != 0 ? null : str3, (i36 & 64) != 0 ? null : str4, (i36 & 128) != 0 ? Double.NaN : d24, (i36 & 256) != 0 ? null : str5, (i36 & 512) != 0 ? null : str6, (i36 & 1024) != 0 ? Double.NaN : d25, (i36 & 2048) == 0 ? d26 : Double.NaN, (i36 & 4096) != 0 ? null : str7, (i36 & 8192) != 0 ? null : aVar2);
    }

    public static j0 b(j0 j0Var, int i14, Boolean bool, boolean z14, boolean z15, String str, double d14, m52.g gVar, double d15, double d16, m52.h hVar, int i15, int i16, int i17, int i18, m52.g gVar2, double d17, double d18, m52.h hVar2, m52.f fVar, m52.e eVar, qs.f fVar2, double d19, String str2, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, int i19, int i24) {
        int i25 = j0Var.f48215a;
        int i26 = j0Var.f48216b;
        m52.d dVar = j0Var.f48217c;
        int i27 = j0Var.f48218d;
        int i28 = (i19 & 16) != 0 ? j0Var.f48219e : i14;
        boolean z16 = j0Var.f48220f;
        Boolean bool2 = (i19 & 64) != 0 ? j0Var.f48221g : bool;
        boolean z17 = (i19 & 128) != 0 ? j0Var.f48222h : z14;
        boolean z18 = (i19 & 256) != 0 ? j0Var.f48223i : z15;
        boolean z19 = z17;
        c cVar = j0Var.f48224j;
        String str3 = (i19 & 1024) != 0 ? j0Var.f48225k : str;
        m52.a aVar2 = j0Var.f48227l;
        int i29 = i28;
        Boolean bool3 = bool2;
        boolean z24 = z18;
        String str4 = str3;
        int i30 = j0Var.f48228m;
        double d24 = (i19 & 8192) != 0 ? j0Var.f48229n : d14;
        String str5 = j0Var.f48230o;
        m52.j jVar = j0Var.f48231p;
        m52.g gVar3 = (i19 & 65536) != 0 ? j0Var.f48232q : gVar;
        double d25 = d24;
        double d26 = (i19 & 131072) != 0 ? j0Var.f48233r : d15;
        double d27 = (i19 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? j0Var.f48234t : d16;
        m52.h hVar3 = (i19 & 524288) != 0 ? j0Var.f48235v : hVar;
        int i34 = (i19 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? j0Var.f48236w : i15;
        int i35 = (i19 & 2097152) != 0 ? j0Var.f48237x : i16;
        int i36 = j0Var.f48238y;
        int i37 = (i19 & 8388608) != 0 ? j0Var.f48239z : i17;
        int i38 = (i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? j0Var.A : i18;
        int i39 = j0Var.B;
        m52.g gVar4 = gVar3;
        int i44 = j0Var.C;
        double d28 = j0Var.D;
        m52.g gVar5 = (i19 & 268435456) != 0 ? j0Var.E : gVar2;
        double d29 = (i19 & 536870912) != 0 ? j0Var.F : d17;
        double d34 = (i19 & 1073741824) != 0 ? j0Var.I : d18;
        m52.h hVar4 = (i19 & Integer.MIN_VALUE) != 0 ? j0Var.P : hVar2;
        int i45 = j0Var.T;
        m52.f fVar3 = (i24 & 2) != 0 ? j0Var.X : fVar;
        int i46 = j0Var.Y;
        m52.e eVar2 = (i24 & 8) != 0 ? j0Var.Z : eVar;
        qs.f fVar4 = (i24 & 16) != 0 ? j0Var.f48226k0 : fVar2;
        String str6 = j0Var.H0;
        String str7 = j0Var.I0;
        double d35 = (i24 & 128) != 0 ? j0Var.J0 : d19;
        String str8 = j0Var.K0;
        String str9 = j0Var.L0;
        double d36 = j0Var.M0;
        double d37 = j0Var.N0;
        String str10 = (i24 & 4096) != 0 ? j0Var.O0 : str2;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar3 = (i24 & 8192) != 0 ? j0Var.P0 : aVar;
        j0Var.getClass();
        return new j0(i25, i26, dVar, i27, i29, z16, bool3, z19, z24, cVar, str4, aVar2, i30, d25, str5, jVar, gVar4, d26, d27, hVar3, i34, i35, i36, i37, i38, i39, i44, d28, gVar5, d29, d34, hVar4, i45, fVar3, i46, eVar2, fVar4, str6, str7, d35, str8, str9, d36, d37, str10, aVar3);
    }

    public static int d(double d14) {
        double d15 = d14 % 1.0d;
        if (d15 != 0.0d && Math.signum(d15) != Math.signum(1.0d)) {
            d15 += 1.0d;
        }
        return (int) (d15 <= 0.5d ? Math.floor(d14) : Math.ceil(d14));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f48215a == j0Var.f48215a && this.f48216b == j0Var.f48216b && this.f48217c == j0Var.f48217c && this.f48218d == j0Var.f48218d && this.f48219e == j0Var.f48219e && this.f48220f == j0Var.f48220f && p005kotlin.jvm.internal.s.g(this.f48221g, j0Var.f48221g) && this.f48222h == j0Var.f48222h && this.f48223i == j0Var.f48223i && this.f48224j == j0Var.f48224j && p005kotlin.jvm.internal.s.g(this.f48225k, j0Var.f48225k) && this.f48227l == j0Var.f48227l && this.f48228m == j0Var.f48228m && Double.compare(this.f48229n, j0Var.f48229n) == 0 && p005kotlin.jvm.internal.s.g(this.f48230o, j0Var.f48230o) && this.f48231p == j0Var.f48231p && this.f48232q == j0Var.f48232q && Double.compare(this.f48233r, j0Var.f48233r) == 0 && Double.compare(this.f48234t, j0Var.f48234t) == 0 && this.f48235v == j0Var.f48235v && this.f48236w == j0Var.f48236w && this.f48237x == j0Var.f48237x && this.f48238y == j0Var.f48238y && this.f48239z == j0Var.f48239z && this.A == j0Var.A && this.B == j0Var.B && this.C == j0Var.C && Double.compare(this.D, j0Var.D) == 0 && this.E == j0Var.E && Double.compare(this.F, j0Var.F) == 0 && Double.compare(this.I, j0Var.I) == 0 && this.P == j0Var.P && this.T == j0Var.T && this.X == j0Var.X && this.Y == j0Var.Y && this.Z == j0Var.Z && this.f48226k0 == j0Var.f48226k0 && p005kotlin.jvm.internal.s.g(this.H0, j0Var.H0) && p005kotlin.jvm.internal.s.g(this.I0, j0Var.I0) && Double.compare(this.J0, j0Var.J0) == 0 && p005kotlin.jvm.internal.s.g(this.K0, j0Var.K0) && p005kotlin.jvm.internal.s.g(this.L0, j0Var.L0) && Double.compare(this.M0, j0Var.M0) == 0 && Double.compare(this.N0, j0Var.N0) == 0 && p005kotlin.jvm.internal.s.g(this.O0, j0Var.O0) && p005kotlin.jvm.internal.s.g(this.P0, j0Var.P0);
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.a f() {
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.P0;
        return aVar == null ? new com.garmin.android.apps.connectmobile.workouts.data.model.a(this.O0, null, null) : aVar;
    }

    public final String g() {
        String str;
        if (this.I0 == null && (str = this.H0) != null) {
            this.I0 = str;
        }
        return this.I0;
    }

    public final double h(double d14, double d15) {
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        m52.g gVar = this.f48232q;
        m52.g gVar2 = m52.g.SPEED;
        if (gVar == gVar2 || this.E == gVar2) {
            return (d14 + d15) / 2.0d;
        }
        l3.a aVar = l3.f23124b;
        boolean zY = lVar.y();
        aVar.getClass();
        return l3.a.m(((double) (l3.a.p(d15, lVar.y()) + l3.a.p(d14, zY))) / 2.0d, lVar.y());
    }

    public final int hashCode() {
        int iD = q2.d(this.f48216b, Integer.hashCode(this.f48215a) * 31, 31);
        m52.d dVar = this.f48217c;
        int iG = q6.f.g(q2.d(this.f48219e, q2.d(this.f48218d, (iD + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31, this.f48220f);
        Boolean bool = this.f48221g;
        int iG2 = q6.f.g(q6.f.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f48222h), 31, this.f48223i);
        c cVar = this.f48224j;
        int iHashCode = (iG2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f48225k;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m52.a aVar = this.f48227l;
        int iB = org.apache.commons.lang3.e.b(q2.d(this.f48228m, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f48229n);
        String str2 = this.f48230o;
        int iHashCode3 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        m52.j jVar = this.f48231p;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        m52.g gVar = this.f48232q;
        int iB2 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f48233r), 31, this.f48234t);
        m52.h hVar = this.f48235v;
        int iB3 = org.apache.commons.lang3.e.b(q2.d(this.C, q2.d(this.B, q2.d(this.A, q2.d(this.f48239z, q2.d(this.f48238y, q2.d(this.f48237x, q2.d(this.f48236w, (iB2 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.D);
        m52.g gVar2 = this.E;
        int iB4 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iB3 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31, 31, this.F), 31, this.I);
        m52.h hVar2 = this.P;
        int iD2 = q2.d(this.T, (iB4 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31, 31);
        m52.f fVar = this.X;
        int iD3 = q2.d(this.Y, (iD2 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
        m52.e eVar = this.Z;
        int iHashCode5 = (iD3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        qs.f fVar2 = this.f48226k0;
        int iHashCode6 = (iHashCode5 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        String str3 = this.H0;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.I0;
        int iB5 = org.apache.commons.lang3.e.b((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.J0);
        String str5 = this.K0;
        int iHashCode8 = (iB5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.L0;
        int iB6 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.M0), 31, this.N0);
        String str7 = this.O0;
        int iHashCode9 = (iB6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = this.P0;
        return iHashCode9 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final void i(JSONObject jSONObject, Double d14, m52.j jVar) {
        m52.a aVar;
        if (jSONObject.optJSONObject("endCondition") != null) {
            m52.a.C2219a c2219a = m52.a.f116647c;
            int iOptInt = jSONObject.getJSONObject("endCondition").optInt("conditionTypeId");
            c2219a.getClass();
            m52.a[] aVarArrValues = m52.a.values();
            int length = aVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    aVar = m52.a.f116658n;
                    break;
                }
                aVar = aVarArrValues[i14];
                if (aVar.f116661a == iOptInt) {
                    break;
                } else {
                    i14++;
                }
            }
            this.f48227l = aVar;
        }
        double dOptDouble = jSONObject.optDouble("endConditionValue");
        if (zf.b.D(d14) && this.f48227l == m52.a.f116650f) {
            d14.getClass();
            int iD = d(dOptDouble / d14.doubleValue());
            if (iD == 0) {
                iD = 1;
            }
            j((float) d14.doubleValue(), iD);
            return;
        }
        if (zf.b.D(d14) || this.f48227l != m52.a.f116656l) {
            this.f48229n = dOptDouble;
        } else {
            this.f48231p = jVar;
            this.f48229n = dOptDouble;
        }
    }

    public final void j(float f14, int i14) {
        this.f48228m = i14;
        this.f48229n = i14 * f14;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("stepOrder", Integer.valueOf(this.f48215a));
            if (this.f48217c != null) {
                JSONObject jSONObject2 = new JSONObject();
                m52.d dVar = this.f48217c;
                dVar.getClass();
                jSONObject2.putOpt("stepTypeId", Integer.valueOf(dVar.f116693a));
                jSONObject.putOpt("stepType", jSONObject2);
            }
            jSONObject.putOpt("childStepId", Integer.valueOf(this.f48218d));
            if (this.f48217c == m52.d.REPEAT) {
                m52.a aVar = this.f48227l;
                if (aVar == m52.a.f116654j) {
                    jSONObject.putOpt("numberOfIterations", Integer.valueOf(this.f48219e));
                } else if (aVar == m52.a.f116649e) {
                    JSONObject jSONObject3 = new JSONObject();
                    m52.a aVar2 = this.f48227l;
                    aVar2.getClass();
                    jSONObject3.putOpt("conditionTypeId", Integer.valueOf(aVar2.f116661a));
                    jSONObject.putOpt("endCondition", jSONObject3);
                    if (!Double.isNaN(this.f48229n)) {
                        jSONObject.putOpt("endConditionValue", Double.valueOf(this.f48229n));
                    }
                }
                jSONObject.putOpt("smartRepeat", Boolean.valueOf(this.f48220f));
                jSONObject.putOpt("skipLastRestStep", this.f48221g);
                jSONObject.putOpt(NotificationConstants.KEY_DATA_MIME_TYPE, "RepeatGroupDTO");
                return jSONObject;
            }
            jSONObject.putOpt("isMinReps", Boolean.valueOf(this.f48223i));
            jSONObject.putOpt(NotificationConstants.KEY_DATA_MIME_TYPE, "ExecutableStepDTO");
            jSONObject.putOpt("description", this.f48225k);
            if (this.f48227l != null) {
                JSONObject jSONObject4 = new JSONObject();
                m52.a aVar3 = this.f48227l;
                aVar3.getClass();
                jSONObject4.putOpt("conditionTypeId", Integer.valueOf(aVar3.f116661a));
                jSONObject.putOpt("endCondition", jSONObject4);
            }
            if (!Double.isNaN(this.f48229n)) {
                jSONObject.putOpt("endConditionValue", Double.valueOf(this.f48229n));
            }
            if (this.f48231p != null) {
                m52.j jVar = this.f48231p;
                jVar.getClass();
                String lowerCase = jVar.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                jSONObject.putOpt("preferredEndConditionUnit", new z1(null, null, lowerCase).i());
            }
            if (this.X != null) {
                JSONObject jSONObject5 = new JSONObject();
                m52.f fVar = this.X;
                fVar.getClass();
                jSONObject5.putOpt("strokeTypeId", Integer.valueOf(fVar.f116711a));
                jSONObject.putOpt("strokeType", jSONObject5);
            }
            if (this.f48226k0 != null) {
                JSONObject jSONObject6 = new JSONObject();
                qs.f fVar2 = this.f48226k0;
                fVar2.getClass();
                jSONObject6.putOpt("drillTypeId", Integer.valueOf(fVar2.f147068a));
                jSONObject.putOpt("drillType", jSONObject6);
            }
            m52.e eVar = this.Z;
            if (eVar != null && eVar != m52.e.NONE) {
                JSONObject jSONObject7 = new JSONObject();
                m52.e eVar2 = this.Z;
                eVar2.getClass();
                jSONObject7.putOpt("equipmentTypeId", Integer.valueOf(eVar2.f116703a));
                jSONObject.putOpt("equipmentType", jSONObject7);
            }
            String str = this.f48230o;
            if (str != null && str.length() != 0) {
                jSONObject.putOpt("endConditionCompare", this.f48230o);
            }
            if (this.f48232q != null) {
                JSONObject jSONObject8 = new JSONObject();
                m52.g gVar = this.f48232q;
                gVar.getClass();
                jSONObject8.putOpt("workoutTargetTypeId", Integer.valueOf(gVar.f116727a));
                jSONObject.putOpt("targetType", jSONObject8);
            }
            if (!Double.isNaN(this.f48233r)) {
                jSONObject.putOpt("targetValueOne", Double.valueOf(this.f48233r));
            }
            if (!Double.isNaN(this.f48234t)) {
                jSONObject.putOpt("targetValueTwo", Double.valueOf(this.f48234t));
            }
            if (this.f48235v != null) {
                JSONObject jSONObject9 = new JSONObject();
                m52.h hVar = this.f48235v;
                hVar.getClass();
                jSONObject9.putOpt("unitKey", hVar.f116733a);
                jSONObject.putOpt("targetValueUnit", jSONObject9);
            }
            int i14 = this.f48236w;
            if (i14 != -1 && this.f48232q == m52.g.POWER_CURVE) {
                jSONObject.putOpt("powerCurveDuration", Integer.valueOf(i14));
            }
            int i15 = this.f48237x;
            if (i15 != -1 && this.f48232q == m52.g.POWER_CURVE) {
                jSONObject.putOpt("powerCurveScale", Integer.valueOf(i15));
            }
            int i16 = this.f48238y;
            if (i16 != -1 && this.f48232q == m52.g.POWER_CURVE) {
                jSONObject.putOpt("powerCurveRange", Integer.valueOf(i16));
            }
            int i17 = this.f48239z;
            if (i17 != -1 && this.E == m52.g.POWER_CURVE) {
                jSONObject.putOpt("secondaryTargetPowerCurveDuration", Integer.valueOf(i17));
            }
            int i18 = this.A;
            if (i18 != -1 && this.E == m52.g.POWER_CURVE) {
                jSONObject.putOpt("secondaryTargetPowerCurveScale", Integer.valueOf(i18));
            }
            int i19 = this.B;
            if (i19 != -1 && this.E == m52.g.POWER_CURVE) {
                jSONObject.putOpt("secondaryTargetPowerCurveRange", Integer.valueOf(i19));
            }
            int i24 = this.C;
            if (i24 != 0) {
                jSONObject.putOpt("zoneNumber", Integer.valueOf(i24));
            }
            if (this.E != null) {
                JSONObject jSONObject10 = new JSONObject();
                m52.g gVar2 = this.E;
                gVar2.getClass();
                jSONObject10.putOpt("workoutTargetTypeId", Integer.valueOf(gVar2.f116727a));
                jSONObject.putOpt("secondaryTargetType", jSONObject10);
            }
            if (!Double.isNaN(this.F)) {
                jSONObject.putOpt("secondaryTargetValueOne", Double.valueOf(this.F));
            }
            if (!Double.isNaN(this.I)) {
                double d14 = this.I;
                if (d14 != 0.0d) {
                    jSONObject.putOpt("secondaryTargetValueTwo", Double.valueOf(d14));
                }
            }
            if (this.P != null) {
                JSONObject jSONObject11 = new JSONObject();
                m52.h hVar2 = this.P;
                hVar2.getClass();
                jSONObject11.putOpt("unitKey", hVar2.f116733a);
                jSONObject.putOpt("secondaryTargetValueUnit", jSONObject11);
            }
            int i25 = this.T;
            if (i25 != 0) {
                jSONObject.putOpt("secondaryZoneNumber", Integer.valueOf(i25));
            }
            String str2 = this.H0;
            if (str2 != null) {
                jSONObject.putOpt("category", str2);
            }
            String str3 = this.I0;
            if (str3 != null) {
                jSONObject.putOpt("exerciseName", str3);
            }
            if (!Double.isNaN(this.J0)) {
                double d15 = this.J0;
                if (d15 < 0.0d) {
                    jSONObject.putOpt("weightValue", null);
                } else {
                    jSONObject.putOpt("weightValue", Double.valueOf(d15));
                }
            }
            c cVar = this.f48224j;
            if (cVar != null) {
                jSONObject.putOpt("relativeWeight", cVar.name());
            }
            JSONObject jSONObject12 = new JSONObject();
            jSONObject12.putOpt("unitKey", (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a);
            jSONObject.putOpt("weightUnit", jSONObject12);
            String str4 = this.L0;
            boolean z14 = (str4 == null || str4.length() == 0 || Double.isNaN(this.M0) || this.M0 < 1.0d) ? false : true;
            jSONObject.putOpt("benchmarkKey", z14 ? this.L0 : null);
            jSONObject.putOpt("benchmarkPercentage", z14 ? Double.valueOf(this.M0) : null);
            String str5 = this.O0;
            if (str5 != null && str5.length() != 0) {
                jSONObject.putOpt("stepAudioNoteUuid", this.O0);
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar4 = this.P0;
            if (aVar4 != null) {
                jSONObject.putOpt("stepAudioNote", aVar4 != null ? aVar4.H() : null);
            }
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        int i14 = this.f48215a;
        int i15 = this.f48216b;
        m52.d dVar = this.f48217c;
        int i16 = this.f48218d;
        int i17 = this.f48219e;
        boolean z14 = this.f48220f;
        Boolean bool = this.f48221g;
        boolean z15 = this.f48222h;
        boolean z16 = this.f48223i;
        c cVar = this.f48224j;
        String str = this.f48225k;
        m52.a aVar = this.f48227l;
        int i18 = this.f48228m;
        double d14 = this.f48229n;
        String str2 = this.f48230o;
        m52.j jVar = this.f48231p;
        m52.g gVar = this.f48232q;
        double d15 = this.f48233r;
        double d16 = this.f48234t;
        m52.h hVar = this.f48235v;
        int i19 = this.f48236w;
        int i24 = this.f48237x;
        int i25 = this.f48238y;
        int i26 = this.f48239z;
        int i27 = this.A;
        int i28 = this.B;
        int i29 = this.C;
        double d17 = this.D;
        m52.g gVar2 = this.E;
        double d18 = this.F;
        double d19 = this.I;
        m52.h hVar2 = this.P;
        int i30 = this.T;
        m52.f fVar = this.X;
        m52.e eVar = this.Z;
        qs.f fVar2 = this.f48226k0;
        String str3 = this.H0;
        String str4 = this.I0;
        double d24 = this.J0;
        String str5 = this.L0;
        double d25 = this.M0;
        double d26 = this.N0;
        String str6 = this.O0;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = this.P0;
        StringBuilder sbJ = e5.j(i14, i15, "WorkoutStepDTO(stepOrder=", ", stepId=", ", stepType=");
        sbJ.append(dVar);
        sbJ.append(", childStepId=");
        sbJ.append(i16);
        sbJ.append(", numberOfIterations=");
        fb1.c.x(sbJ, i17, ", smartRepeat=", z14, ", skipLastRestStep=");
        sbJ.append(bool);
        sbJ.append(", isSkipLastRestStepUpdated=");
        sbJ.append(z15);
        sbJ.append(", minReps=");
        sbJ.append(z16);
        sbJ.append(", relativeWeight=");
        sbJ.append(cVar);
        sbJ.append(", description=");
        sbJ.append(str);
        sbJ.append(", endConditionType=");
        sbJ.append(aVar);
        sbJ.append(", endConditionFactor=");
        sbJ.append(i18);
        sbJ.append(", endConditionValue=");
        sbJ.append(d14);
        sbJ.append(", endConditionCompare=");
        sbJ.append(str2);
        sbJ.append(", preferredEndConditionUnit=");
        sbJ.append(jVar);
        sbJ.append(", targetType=");
        sbJ.append(gVar);
        sbJ.append(", targetValueOne=");
        sbJ.append(d15);
        am.j.x(sbJ, ", targetValueTwo=", d16, ", targetValueUnit=");
        sbJ.append(hVar);
        sbJ.append(", powerCurveDuration=");
        sbJ.append(i19);
        sbJ.append(", powerCurveScale=");
        ds.e0.m(i24, i25, ", powerCurveRange=", ", secondaryTargetPowerCurveDuration=", sbJ);
        ds.e0.m(i26, i27, ", secondaryTargetPowerCurveScale=", ", secondaryTargetPowerCurveRange=", sbJ);
        ds.e0.m(i28, i29, ", zoneNumber=", ", targetValueMidpoint=", sbJ);
        sbJ.append(d17);
        sbJ.append(", secondaryTargetType=");
        sbJ.append(gVar2);
        am.j.x(sbJ, ", secondaryTargetValueOne=", d18, ", secondaryTargetValueTwo=");
        sbJ.append(d19);
        sbJ.append(", secondaryTargetValueUnit=");
        sbJ.append(hVar2);
        sbJ.append(", secondaryZoneNumber=");
        sbJ.append(i30);
        sbJ.append(", strokeType=");
        sbJ.append(fVar);
        sbJ.append(", strokeId=");
        sbJ.append(this.Y);
        sbJ.append(", equipmentType=");
        sbJ.append(eVar);
        sbJ.append(", drillType=");
        sbJ.append(fVar2);
        sbJ.append(", category=");
        sbJ.append(str3);
        am.j.y(sbJ, ", exerciseName=", str4, ", weightValue=");
        sbJ.append(d24);
        sbJ.append(", weightUnit=");
        sbJ.append(this.K0);
        am.j.y(sbJ, ", benchmarkKey=", str5, ", benchmarkPercentage=");
        sbJ.append(d25);
        am.j.x(sbJ, ", benchmarkWeight=", d26, ", audioNoteUUID=");
        sbJ.append(str6);
        sbJ.append(", audioNote=");
        sbJ.append(aVar2);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f48215a);
        parcel.writeInt(this.f48216b);
        m52.d dVar = this.f48217c;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        parcel.writeInt(this.f48218d);
        parcel.writeInt(this.f48219e);
        parcel.writeInt(this.f48220f ? 1 : 0);
        Boolean bool = this.f48221g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeInt(this.f48222h ? 1 : 0);
        parcel.writeInt(this.f48223i ? 1 : 0);
        c cVar = this.f48224j;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.f48225k);
        m52.a aVar = this.f48227l;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeInt(this.f48228m);
        parcel.writeDouble(this.f48229n);
        parcel.writeString(this.f48230o);
        m52.j jVar = this.f48231p;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        m52.g gVar = this.f48232q;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar.name());
        }
        parcel.writeDouble(this.f48233r);
        parcel.writeDouble(this.f48234t);
        m52.h hVar = this.f48235v;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        parcel.writeInt(this.f48236w);
        parcel.writeInt(this.f48237x);
        parcel.writeInt(this.f48238y);
        parcel.writeInt(this.f48239z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeDouble(this.D);
        m52.g gVar2 = this.E;
        if (gVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar2.name());
        }
        parcel.writeDouble(this.F);
        parcel.writeDouble(this.I);
        m52.h hVar2 = this.P;
        if (hVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar2.name());
        }
        parcel.writeInt(this.T);
        m52.f fVar = this.X;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        parcel.writeInt(this.Y);
        m52.e eVar = this.Z;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
        qs.f fVar2 = this.f48226k0;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar2.name());
        }
        parcel.writeString(this.H0);
        parcel.writeString(this.I0);
        parcel.writeDouble(this.J0);
        parcel.writeString(this.K0);
        parcel.writeString(this.L0);
        parcel.writeDouble(this.M0);
        parcel.writeDouble(this.N0);
        parcel.writeString(this.O0);
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = this.P0;
        if (aVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar2.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00109\u001a\u0002088\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010=\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010D\u001a\u00020<8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010>¨\u0006E"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0$a;", "", "<init>", "()V", "", "STROKE_TYPE_ID", "Ljava/lang/String;", "DRILL_TYPE_ID", "EQUIPMENT_TYPE_ID", "STEP_ORDER", "STEP_TYPE", "TYPE", "STEP_TYPE_ID", "CHILD_STEP_ID", "NUMBER_OF_ITERATIONS", "SMART_REPEAT", "DESCRIPTION", "END_CONDITION", "END_CONDITION_TYPE_ID", "END_CONDITION_VALUE", "PREFERRED_END_CONDITION_UNIT", "STROKE_TYPE", "DRILL_TYPE", "EQUIPMENT_TYPE", "END_CONDITION_COMPARE", "TARGET_TYPE", "TARGET_TYPE_ID", "TARGET_VALUE_ONE", "TARGET_VALUE_TWO", "TARGET_VALUE_UNIT", "POWER_CURVE_DURATION", "POWER_CURVE_SCALE", "POWER_CURVE_RANGE", "SECONDARY_TARGET_POWER_CURVE_DURATION", "SECONDARY_TARGET_POWER_CURVE_SCALE", "SECONDARY_TARGET_POWER_CURVE_RANGE", "ZONE_NUMBER", "SECONDARY_TARGET_TYPE", "SECONDARY_TARGET_VALUE_ONE", "SECONDARY_TARGET_VALUE_TWO", "SECONDARY_TARGET_VALUE_UNIT", "SECONDARY_ZONE_NUMBER", "TYPE_EXECUTABLE", "TYPE_REPEATGROUP", "CATEGORY", "EXERCISE_NAME", "WEIGHT_VALUE", "WEIGHT_UNIT", "UNIT_KEY", "BENCHMARK_KEY", "BENCHMARK_PERCENTAGE", "KEY_AUDIO_NOTE_UUID", "KEY_AUDIO_NOTE", "KEY_SKIP_LAST_REST_STEP", "MIN_REPS", "RELATIVE_WEIGHT", "", "EMPTY_ZONE_NUMBER", "I", "BENCHMARK_KEY_NO_VALUE", "", "BENCHMARK_PERCENTAGE_NO_VALUE", "D", "BENCHMARK_PERCENTAGE_MIN_VALUE", "BENCHMARK_WEIGHT_NO_VALUE", "BENCHMARK_WEIGHT_MIN_VALUE", "WEIGHT_NO_VALUE", "WEIGHT_MIN_VALUE", "WEIGHT_BODY_VALUE", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j0(int i14, int i15, m52.d dVar, int i16, int i17, boolean z14, Boolean bool, boolean z15, boolean z16, c cVar, String str, m52.a aVar, int i18, double d14, String str2, m52.j jVar, m52.g gVar, double d15, double d16, m52.h hVar, int i19, int i24, int i25, int i26, int i27, int i28, int i29, double d17, m52.g gVar2, double d18, double d19, m52.h hVar2, int i30, m52.f fVar, int i34, m52.e eVar, qs.f fVar2, String str3, String str4, double d24, String str5, String str6, double d25, double d26, String str7, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2) {
        this.f48215a = i14;
        this.f48216b = i15;
        this.f48217c = dVar;
        this.f48218d = i16;
        this.f48219e = i17;
        this.f48220f = z14;
        this.f48221g = bool;
        this.f48222h = z15;
        this.f48223i = z16;
        this.f48224j = cVar;
        this.f48225k = str;
        this.f48227l = aVar;
        this.f48228m = i18;
        this.f48229n = d14;
        this.f48230o = str2;
        this.f48231p = jVar;
        this.f48232q = gVar;
        this.f48233r = d15;
        this.f48234t = d16;
        this.f48235v = hVar;
        this.f48236w = i19;
        this.f48237x = i24;
        this.f48238y = i25;
        this.f48239z = i26;
        this.A = i27;
        this.B = i28;
        this.C = i29;
        this.D = d17;
        this.E = gVar2;
        this.F = d18;
        this.I = d19;
        this.P = hVar2;
        this.T = i30;
        this.X = fVar;
        this.Y = i34;
        this.Z = eVar;
        this.f48226k0 = fVar2;
        this.H0 = str3;
        this.I0 = str4;
        this.J0 = d24;
        this.K0 = str5;
        this.L0 = str6;
        this.M0 = d25;
        this.N0 = d26;
        this.O0 = str7;
        this.P0 = aVar2;
    }

    public j0() {
        this(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
    }
}
