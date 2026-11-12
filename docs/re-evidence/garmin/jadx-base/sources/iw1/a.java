package iw1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.w;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import fb1.c;
import fg0.k;
import fg0.r;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\n\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103B\u0083\u0001\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\b¢\u0006\u0004\b2\u00104B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00105B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b2\u00106B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b2\u00107Bg\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b2\u00108¨\u00069"}, d2 = {"Liw1/a;", "Landroid/os/Parcelable;", "", "workoutId", "", "workoutUuid", "workoutScheduleId", "associatedActivityId", "", "weekId", "", "isWorkout", "isSupportingEvent", "isRestDay", "isNote", "isFooter", "isCompleted", "note", "workoutName", "", "duration", "description", "descriptionContentDescription", "Lorg/joda/time/DateTime;", "date", "associatedActivityDate", "isRaceDay", "isTimeBasedRace", "Lfg0/r;", "raceStartTime", "isFBTFutureItem", "taskDescription", "activityCompletedDistance", "isPlanLinkedWorkout", "isCalendarBarItem", "eventID", "eventUuid", "Lfg0/k;", "eventDTO", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityDTO", "Lm52/k;", "workoutSportType", "groupWorkouts", "activityGroupEnumerator", "isAfterPlanEndDate", "workoutPhrase", "hasBenchmarkWorkoutOnPlan", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;", "runWalkDescription", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLfg0/r;ZLjava/lang/String;Ljava/lang/Double;ZZLjava/lang/Long;Ljava/lang/String;Lfg0/k;Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Lm52/k;ZIZLjava/lang/String;ZLcom/garmin/android/apps/connectmobile/workouts/data/model/w;)V", "(Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;ZLcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;ZI)V", "(ZLjava/lang/String;)V", "(ZLorg/joda/time/DateTime;)V", "(Z)V", "(Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;ZLfg0/r;Ljava/lang/Long;Ljava/lang/String;Lfg0/k;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1824a();
    public final boolean A;
    public final boolean B;
    public final Long C;
    public final String D;
    public final k E;
    public final ActivityListItemDTO F;
    public final m52.k I;
    public final boolean P;
    public final int T;
    public final boolean X;
    public final String Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f95313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f95315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f95316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f95317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f95319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f95320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f95321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f95322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f95323k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final w f95324k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f95325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f95326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f95327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f95328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f95329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DateTime f95330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DateTime f95331r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f95332t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f95333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f95334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f95335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f95336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Double f95337z;

    /* JADX INFO: renamed from: iw1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1824a implements Parcelable.Creator<a> {
        /* JADX WARN: Failed to calculate best type for var: r28v0 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: java.lang.Long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r28v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v5 ??, new type: java.lang.Long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: java.lang.Object
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        @Override // android.os.Parcelable.Creator
        public final iw1.a createFromParcel(android.os.Parcel r42) {
            /*
                Method dump skipped, instruction units count: 485
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.a.C1824a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Long l14, String str, Long l15, Long l16, Integer num, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str2, String str3, Double d14, String str4, String str5, DateTime dateTime, DateTime dateTime2, boolean z24, boolean z25, r rVar, boolean z26, String str6, Double d15, boolean z27, boolean z28, Long l17, String str7, k kVar, ActivityListItemDTO activityListItemDTO, m52.k kVar2, boolean z29, int i14, boolean z34, String str8, boolean z35, w wVar, int i15, int i16, j jVar) {
        this(l14, str, l15, l16, num, z14, (i15 & 64) != 0 ? false : z15, z16, z17, z18, z19, str2, str3, d14, str4, str5, dateTime, dateTime2, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? false : z24, (i15 & 524288) != 0 ? false : z25, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : rVar, (i15 & 2097152) != 0 ? false : z26, (i15 & 4194304) != 0 ? null : str6, (i15 & 8388608) != 0 ? null : d15, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z27, (i15 & 33554432) != 0 ? false : z28, (i15 & 67108864) != 0 ? null : l17, (i15 & 134217728) != 0 ? null : str7, (i15 & 268435456) != 0 ? null : kVar, (i15 & 536870912) != 0 ? null : activityListItemDTO, (i15 & 1073741824) != 0 ? m52.k.f116756p : kVar2, (i15 & Integer.MIN_VALUE) != 0 ? false : z29, (i16 & 1) != 0 ? -1 : i14, (i16 & 2) != 0 ? false : z34, (i16 & 4) != 0 ? null : str8, (i16 & 8) != 0 ? false : z35, (i16 & 16) != 0 ? null : wVar);
    }

    public static a b(a aVar, boolean z14, boolean z15, DateTime dateTime, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15) {
        Long l14 = aVar.f95313a;
        String str = aVar.f95314b;
        Long l15 = aVar.f95315c;
        Long l16 = aVar.f95316d;
        Integer num = aVar.f95317e;
        boolean z24 = (i14 & 32) != 0 ? aVar.f95318f : z14;
        boolean z25 = aVar.f95319g;
        boolean z26 = (i14 & 128) != 0 ? aVar.f95320h : z15;
        boolean z27 = aVar.f95321i;
        boolean z28 = z24;
        boolean z29 = z26;
        boolean z34 = aVar.f95322j;
        boolean z35 = (i14 & 1024) != 0 ? aVar.f95323k : true;
        String str2 = aVar.f95325l;
        String str3 = aVar.f95326m;
        boolean z36 = z35;
        Double d14 = aVar.f95327n;
        String str4 = aVar.f95328o;
        String str5 = aVar.f95329p;
        DateTime dateTime2 = (i14 & 65536) != 0 ? aVar.f95330q : dateTime;
        DateTime dateTime3 = aVar.f95331r;
        boolean z37 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? aVar.f95332t : z16;
        boolean z38 = aVar.f95333v;
        r rVar = aVar.f95334w;
        boolean z39 = (i14 & 2097152) != 0 ? aVar.f95335x : z17;
        String str6 = aVar.f95336y;
        Double d15 = aVar.f95337z;
        boolean z44 = aVar.A;
        boolean z45 = (i14 & 33554432) != 0 ? aVar.B : true;
        Long l17 = aVar.C;
        String str7 = aVar.D;
        k kVar = aVar.E;
        ActivityListItemDTO activityListItemDTO = aVar.F;
        m52.k kVar2 = aVar.I;
        boolean z46 = aVar.P;
        int i16 = aVar.T;
        boolean z47 = (i15 & 2) != 0 ? aVar.X : z18;
        String str8 = aVar.Y;
        boolean z48 = (i15 & 8) != 0 ? aVar.Z : z19;
        w wVar = aVar.f95324k0;
        kVar2.getClass();
        return new a(l14, str, l15, l16, num, z28, z25, z29, z27, z34, z36, str2, str3, d14, str4, str5, dateTime2, dateTime3, z37, z38, rVar, z39, str6, d15, z44, z45, l17, str7, kVar, activityListItemDTO, kVar2, z46, i16, z47, str8, z48, wVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f95313a, aVar.f95313a) && s.g(this.f95314b, aVar.f95314b) && s.g(this.f95315c, aVar.f95315c) && s.g(this.f95316d, aVar.f95316d) && s.g(this.f95317e, aVar.f95317e) && this.f95318f == aVar.f95318f && this.f95319g == aVar.f95319g && this.f95320h == aVar.f95320h && this.f95321i == aVar.f95321i && this.f95322j == aVar.f95322j && this.f95323k == aVar.f95323k && s.g(this.f95325l, aVar.f95325l) && s.g(this.f95326m, aVar.f95326m) && s.g(this.f95327n, aVar.f95327n) && s.g(this.f95328o, aVar.f95328o) && s.g(this.f95329p, aVar.f95329p) && s.g(this.f95330q, aVar.f95330q) && s.g(this.f95331r, aVar.f95331r) && this.f95332t == aVar.f95332t && this.f95333v == aVar.f95333v && s.g(this.f95334w, aVar.f95334w) && this.f95335x == aVar.f95335x && s.g(this.f95336y, aVar.f95336y) && s.g(this.f95337z, aVar.f95337z) && this.A == aVar.A && this.B == aVar.B && s.g(this.C, aVar.C) && s.g(this.D, aVar.D) && s.g(this.E, aVar.E) && s.g(this.F, aVar.F) && this.I == aVar.I && this.P == aVar.P && this.T == aVar.T && this.X == aVar.X && s.g(this.Y, aVar.Y) && this.Z == aVar.Z && s.g(this.f95324k0, aVar.f95324k0);
    }

    public final int hashCode() {
        Long l14 = this.f95313a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f95314b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.f95315c;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f95316d;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num = this.f95317e;
        int iG = f.g(f.g(f.g(f.g(f.g(f.g((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f95318f), 31, this.f95319g), 31, this.f95320h), 31, this.f95321i), 31, this.f95322j), 31, this.f95323k);
        String str2 = this.f95325l;
        int iHashCode5 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95326m;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f95327n;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.f95328o;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95329p;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DateTime dateTime = this.f95330q;
        int iHashCode10 = (iHashCode9 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f95331r;
        int iG2 = f.g(f.g((iHashCode10 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31, 31, this.f95332t), 31, this.f95333v);
        r rVar = this.f95334w;
        int iG3 = f.g((iG2 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f95335x);
        String str6 = this.f95336y;
        int iHashCode11 = (iG3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d15 = this.f95337z;
        int iG4 = f.g(f.g((iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.A), 31, this.B);
        Long l17 = this.C;
        int iHashCode12 = (iG4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str7 = this.D;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        k kVar = this.E;
        int iHashCode14 = (iHashCode13 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ActivityListItemDTO activityListItemDTO = this.F;
        int iG5 = f.g(q2.d(this.T, f.g((this.I.hashCode() + ((iHashCode14 + (activityListItemDTO == null ? 0 : activityListItemDTO.hashCode())) * 31)) * 31, 31, this.P), 31), 31, this.X);
        String str8 = this.Y;
        int iG6 = f.g((iG5 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.Z);
        w wVar = this.f95324k0;
        return iG6 + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f95328o;
        String str2 = this.f95329p;
        StringBuilder sbJ = i.j("FBTWorkoutTaskAdapterItem(workoutId=", ", workoutUuid=", this.f95314b, this.f95313a, ", workoutScheduleId=");
        kg.f.s(sbJ, this.f95315c, ", associatedActivityId=", this.f95316d, ", weekId=");
        sbJ.append(this.f95317e);
        sbJ.append(", isWorkout=");
        sbJ.append(this.f95318f);
        sbJ.append(", isSupportingEvent=");
        kg.f.q(", isRestDay=", ", isNote=", sbJ, this.f95319g, this.f95320h);
        kg.f.q(", isFooter=", ", isCompleted=", sbJ, this.f95321i, this.f95322j);
        c.w(", note=", this.f95325l, ", workoutName=", sbJ, this.f95323k);
        i.x(sbJ, this.f95326m, ", duration=", this.f95327n, ", description=");
        sn.a.t(sbJ, str, ", descriptionContentDescription=", str2, ", date=");
        sbJ.append(this.f95330q);
        sbJ.append(", associatedActivityDate=");
        sbJ.append(this.f95331r);
        sbJ.append(", isRaceDay=");
        kg.f.q(", isTimeBasedRace=", ", raceStartTime=", sbJ, this.f95332t, this.f95333v);
        sbJ.append(this.f95334w);
        sbJ.append(", isFBTFutureItem=");
        sbJ.append(this.f95335x);
        sbJ.append(", taskDescription=");
        i.x(sbJ, this.f95336y, ", activityCompletedDistance=", this.f95337z, ", isPlanLinkedWorkout=");
        kg.f.q(", isCalendarBarItem=", ", eventID=", sbJ, this.A, this.B);
        i.q(this.C, ", eventUuid=", this.D, ", eventDTO=", sbJ);
        sbJ.append(this.E);
        sbJ.append(", activityDTO=");
        sbJ.append(this.F);
        sbJ.append(", workoutSportType=");
        sbJ.append(this.I);
        sbJ.append(", groupWorkouts=");
        sbJ.append(this.P);
        sbJ.append(", activityGroupEnumerator=");
        c.x(sbJ, this.T, ", isAfterPlanEndDate=", this.X, ", workoutPhrase=");
        h.C(this.Y, ", hasBenchmarkWorkoutOnPlan=", ", runWalkDescription=", sbJ, this.Z);
        sbJ.append(this.f95324k0);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f95313a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f95314b);
        Long l15 = this.f95315c;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.f95316d;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Integer num = this.f95317e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.f95318f ? 1 : 0);
        parcel.writeInt(this.f95319g ? 1 : 0);
        parcel.writeInt(this.f95320h ? 1 : 0);
        parcel.writeInt(this.f95321i ? 1 : 0);
        parcel.writeInt(this.f95322j ? 1 : 0);
        parcel.writeInt(this.f95323k ? 1 : 0);
        parcel.writeString(this.f95325l);
        parcel.writeString(this.f95326m);
        Double d14 = this.f95327n;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.f95328o);
        parcel.writeString(this.f95329p);
        parcel.writeSerializable(this.f95330q);
        parcel.writeSerializable(this.f95331r);
        parcel.writeInt(this.f95332t ? 1 : 0);
        parcel.writeInt(this.f95333v ? 1 : 0);
        parcel.writeParcelable(this.f95334w, i14);
        parcel.writeInt(this.f95335x ? 1 : 0);
        parcel.writeString(this.f95336y);
        Double d15 = this.f95337z;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        Long l17 = this.C;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.D);
        parcel.writeParcelable(this.E, i14);
        parcel.writeParcelable(this.F, i14);
        parcel.writeString(this.I.name());
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.T);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeParcelable(this.f95324k0, i14);
    }

    public a(Long l14, String str, Long l15, Long l16, Integer num, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str2, String str3, Double d14, String str4, String str5, DateTime dateTime, DateTime dateTime2, boolean z24, boolean z25, r rVar, boolean z26, String str6, Double d15, boolean z27, boolean z28, Long l17, String str7, k kVar, ActivityListItemDTO activityListItemDTO, m52.k kVar2, boolean z29, int i14, boolean z34, String str8, boolean z35, w wVar) {
        kVar2.getClass();
        this.f95313a = l14;
        this.f95314b = str;
        this.f95315c = l15;
        this.f95316d = l16;
        this.f95317e = num;
        this.f95318f = z14;
        this.f95319g = z15;
        this.f95320h = z16;
        this.f95321i = z17;
        this.f95322j = z18;
        this.f95323k = z19;
        this.f95325l = str2;
        this.f95326m = str3;
        this.f95327n = d14;
        this.f95328o = str4;
        this.f95329p = str5;
        this.f95330q = dateTime;
        this.f95331r = dateTime2;
        this.f95332t = z24;
        this.f95333v = z25;
        this.f95334w = rVar;
        this.f95335x = z26;
        this.f95336y = str6;
        this.f95337z = d15;
        this.A = z27;
        this.B = z28;
        this.C = l17;
        this.D = str7;
        this.E = kVar;
        this.F = activityListItemDTO;
        this.I = kVar2;
        this.P = z29;
        this.T = i14;
        this.X = z34;
        this.Y = str8;
        this.Z = z35;
        this.f95324k0 = wVar;
    }

    public /* synthetic */ a(Long l14, Long l15, boolean z14, String str, Double d14, DateTime dateTime, DateTime dateTime2, Double d15, boolean z15, ActivityListItemDTO activityListItemDTO, boolean z16, int i14, int i15, j jVar) {
        this(l14, l15, z14, str, d14, dateTime, dateTime2, (i15 & 128) != 0 ? null : d15, (i15 & 256) != 0 ? false : z15, (i15 & 512) != 0 ? null : activityListItemDTO, (i15 & 1024) != 0 ? true : z16, (i15 & 2048) != 0 ? -1 : i14);
    }

    public a(Long l14, Long l15, boolean z14, String str, Double d14, DateTime dateTime, DateTime dateTime2, Double d15, boolean z15, ActivityListItemDTO activityListItemDTO, boolean z16, int i14) {
        this(l14, null, null, l15, -1, true, false, false, false, false, z14, null, str, d14, null, null, dateTime, dateTime2, false, false, null, false, null, d15, z15, z16, null, null, null, activityListItemDTO, null, false, i14, false, null, false, null, -596115392, 30, null);
    }

    public a(boolean z14, String str) {
        this(null, null, null, null, 0, false, false, false, z14, false, false, str, null, null, null, null, null, null, false, false, null, false, null, null, false, false, null, null, null, null, null, false, 0, false, null, false, null, -262080, 31, null);
    }

    public a(boolean z14, DateTime dateTime) {
        this(null, null, null, null, 0, false, false, z14, false, false, false, null, null, null, null, null, dateTime, null, false, false, null, false, null, null, false, true, null, null, null, null, null, false, 0, false, null, false, null, -33816512, 31, null);
    }

    public a(boolean z14) {
        this(null, null, null, null, 0, false, false, false, false, z14, false, null, null, null, null, null, null, null, false, false, null, false, null, null, false, false, null, null, null, null, null, false, 0, false, null, false, null, -262080, 31, null);
    }

    public a(DateTime dateTime, String str, Double d14, boolean z14, r rVar, Long l14, String str2, k kVar, boolean z15, boolean z16) {
        this(null, null, null, null, -1, false, z16, false, false, false, false, null, str, d14, null, null, dateTime, null, true, z14, rVar, z15, null, null, false, true, l14, str2, kVar, null, null, false, 0, false, "EVENT_DAY", false, null, -532676608, 27, null);
    }
}
