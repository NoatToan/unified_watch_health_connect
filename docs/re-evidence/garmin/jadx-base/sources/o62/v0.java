package o62;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011Bo\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo62/v0;", "Landroid/os/Parcelable;", "", "manualWeight", "", "isBodyWeightSupported", "isBodyWeightExercise", "", "benchmarkKey", "benchmarkName", "benchmarkPercentage", "benchmarkWeight", "isVerbalWeightSupported", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0$c;", "verbalWeight", "<init>", "(Ljava/lang/Double;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/garmin/android/apps/connectmobile/workouts/data/model/j0$c;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f129789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f129792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f129793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f129794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f129795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f129796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0.c f129797i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<v0> {
        /* JADX WARN: Failed to calculate best type for var: r10v2 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: java.lang.Double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r10v2 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: java.lang.Double
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
        /* JADX WARN: Failed to calculate best type for var: r10v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: java.lang.Double
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
        /* JADX WARN: Failed to calculate best type for var: r13v2 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: com.garmin.android.apps.connectmobile.workouts.data.model.j0$c
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
        /* JADX WARN: Failed to calculate best type for var: r7v3 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.Double
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
        /* JADX WARN: Failed to calculate best type for var: r9v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: com.garmin.android.apps.connectmobile.workouts.data.model.j0$c
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
        /* JADX WARN: Failed to calculate best type for var: r9v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: com.garmin.android.apps.connectmobile.workouts.data.model.j0$c
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
        /* JADX WARN: Failed to calculate best type for var: r9v6 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: com.garmin.android.apps.connectmobile.workouts.data.model.j0$c
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
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: java.lang.Object
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
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
        public final o62.v0 createFromParcel(android.os.Parcel r13) {
            /*
                r12 = this;
                r13.getClass()
                o62.v0 r0 = new o62.v0
                int r1 = r13.readInt()
                r2 = 0
                if (r1 != 0) goto Le
                r1 = r2
                goto L16
            Le:
                double r3 = r13.readDouble()
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
            L16:
                int r3 = r13.readInt()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L21
                r3 = r2
                r2 = r5
                goto L23
            L21:
                r3 = r2
                r2 = r4
            L23:
                int r6 = r13.readInt()
                if (r6 == 0) goto L2d
                r6 = r3
                r7 = r4
                r3 = r5
                goto L30
            L2d:
                r6 = r3
                r3 = r4
                r7 = r3
            L30:
                java.lang.String r4 = r13.readString()
                r8 = r5
                java.lang.String r5 = r13.readString()
                int r9 = r13.readInt()
                if (r9 != 0) goto L41
                r9 = r6
                goto L49
            L41:
                double r9 = r13.readDouble()
                java.lang.Double r9 = java.lang.Double.valueOf(r9)
            L49:
                int r10 = r13.readInt()
                if (r10 != 0) goto L51
                r10 = r6
                goto L59
            L51:
                double r10 = r13.readDouble()
                java.lang.Double r10 = java.lang.Double.valueOf(r10)
            L59:
                int r11 = r13.readInt()
                if (r11 == 0) goto L60
                goto L61
            L60:
                r8 = r7
            L61:
                int r7 = r13.readInt()
                if (r7 != 0) goto L6c
                r7 = r9
                r9 = r6
                r6 = r7
            L6a:
                r7 = r10
                goto L77
            L6c:
                java.lang.String r13 = r13.readString()
                com.garmin.android.apps.connectmobile.workouts.data.model.j0$c r13 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.c.valueOf(r13)
                r6 = r9
                r9 = r13
                goto L6a
            L77:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o62.v0.b.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final v0[] newArray(int i14) {
            return new v0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ v0(Double d14, boolean z14, boolean z15, String str, String str2, Double d15, Double d16, boolean z16, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : d16, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? null : cVar);
    }

    public static v0 b(v0 v0Var, Double d14, Double d15, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            d14 = v0Var.f129789a;
        }
        Double d16 = d14;
        boolean z14 = v0Var.f129790b;
        boolean z15 = v0Var.f129791c;
        String str = v0Var.f129792d;
        String str2 = v0Var.f129793e;
        if ((i14 & 32) != 0) {
            d15 = v0Var.f129794f;
        }
        Double d17 = d15;
        Double d18 = v0Var.f129795g;
        boolean z16 = v0Var.f129796h;
        if ((i14 & 256) != 0) {
            cVar = v0Var.f129797i;
        }
        v0Var.getClass();
        return new v0(d16, z14, z15, str, str2, d17, d18, z16, cVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return p005kotlin.jvm.internal.s.g(this.f129789a, v0Var.f129789a) && this.f129790b == v0Var.f129790b && this.f129791c == v0Var.f129791c && p005kotlin.jvm.internal.s.g(this.f129792d, v0Var.f129792d) && p005kotlin.jvm.internal.s.g(this.f129793e, v0Var.f129793e) && p005kotlin.jvm.internal.s.g(this.f129794f, v0Var.f129794f) && p005kotlin.jvm.internal.s.g(this.f129795g, v0Var.f129795g) && this.f129796h == v0Var.f129796h && this.f129797i == v0Var.f129797i;
    }

    public final int hashCode() {
        Double d14 = this.f129789a;
        int iG = q6.f.g(q6.f.g((d14 == null ? 0 : d14.hashCode()) * 31, 31, this.f129790b), 31, this.f129791c);
        String str = this.f129792d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f129793e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d15 = this.f129794f;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f129795g;
        int iG2 = q6.f.g((iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31, 31, this.f129796h);
        com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar = this.f129797i;
        return iG2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutStepWeightData(manualWeight=");
        sb3.append(this.f129789a);
        sb3.append(", isBodyWeightSupported=");
        sb3.append(this.f129790b);
        sb3.append(", isBodyWeightExercise=");
        fb1.c.w(", benchmarkKey=", this.f129792d, ", benchmarkName=", sb3, this.f129791c);
        b71.i.x(sb3, this.f129793e, ", benchmarkPercentage=", this.f129794f, ", benchmarkWeight=");
        sb3.append(this.f129795g);
        sb3.append(", isVerbalWeightSupported=");
        sb3.append(this.f129796h);
        sb3.append(", verbalWeight=");
        sb3.append(this.f129797i);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.f129789a;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeInt(this.f129790b ? 1 : 0);
        parcel.writeInt(this.f129791c ? 1 : 0);
        parcel.writeString(this.f129792d);
        parcel.writeString(this.f129793e);
        Double d15 = this.f129794f;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f129795g;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        parcel.writeInt(this.f129796h ? 1 : 0);
        com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar = this.f129797i;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lo62/v0$a;", "", "<init>", "()V", "", "BENCHMARK_WEIGHT_MIN_VALUE", "D", "", "BENCHMARK_PERCENTAGE_MAX_VALUE", "I", "BENCHMARK_PERCENTAGE_MIN_VALUE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public v0(Double d14) {
        this(d14, false, false, null, null, null, null, false, null, 510, null);
    }

    public v0(Double d14, boolean z14) {
        this(d14, z14, false, null, null, null, null, false, null, 508, null);
    }

    public v0(Double d14, boolean z14, boolean z15) {
        this(d14, z14, z15, null, null, null, null, false, null, 504, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str) {
        this(d14, z14, z15, str, null, null, null, false, null, 496, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str, String str2) {
        this(d14, z14, z15, str, str2, null, null, false, null, 480, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str, String str2, Double d15) {
        this(d14, z14, z15, str, str2, d15, null, false, null, 448, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str, String str2, Double d15, Double d16) {
        this(d14, z14, z15, str, str2, d15, d16, false, null, 384, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str, String str2, Double d15, Double d16, boolean z16) {
        this(d14, z14, z15, str, str2, d15, d16, z16, null, 256, null);
    }

    public v0(Double d14, boolean z14, boolean z15, String str, String str2, Double d15, Double d16, boolean z16, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar) {
        this.f129789a = d14;
        this.f129790b = z14;
        this.f129791c = z15;
        this.f129792d = str;
        this.f129793e = str2;
        this.f129794f = d15;
        this.f129795g = d16;
        this.f129796h = z16;
        this.f129797i = cVar;
    }

    public v0() {
        this(null, false, false, null, null, null, null, false, null, 511, null);
    }
}
