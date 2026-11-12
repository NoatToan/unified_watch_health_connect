package bo;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BÃ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,B\u0095\u0003\b\u0010\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b+\u00101¨\u00065"}, d2 = {"Lbo/j;", "", "", "noOfSplits", "Lbo/h;", "maxGradeValue", "", "totalAscent", "duration", "", "splitType", "numClimbSends", "maxElevationGain", "averageElevationGain", "maxDistance", "maxDistanceWithPrecision", "distance", "averageSpeed", "maxSpeed", "mode", "numFalls", "avgStress", "avgStressWin", "avgStressLoss", "avgStressDraw", "gamesWon", "gamesNotWon", "gamesAverageWon", "elevationLoss", "maxPackWeight", "avgPackWeight", "maxDuration", "avgReactionTime", "minReactionTime", "avgDistanceToMaxSpeed", "avgStepFrequency", "maxStepFrequency", "avgStepLength", "verticalRatio", "verticalOscillation", "avgGroundContactBalanceLeft", "avgGroundContactTime", "avgStanceTimePercent", "<init>", "(Ljava/lang/Integer;Lbo/h;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/Integer;Lbo/h;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Double A;
    public final Double B;
    public final Double C;
    public final Double D;
    public final Double E;
    public final Double F;
    public final Double G;
    public final Double H;
    public final Double I;
    public final Double J;
    public final Double K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f19129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f19130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f19132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f19133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f19134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f19135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f19136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f19137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f19138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f19139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f19140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f19141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f19142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f19143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f19144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f19145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f19146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f19147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Double f19148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f19149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f19150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Integer f19151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Double f19152z;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/MinimalSplitSummaryDTO.$serializer", "Lm63/e0;", "Lbo/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19153a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19153a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.MinimalSplitSummaryDTO", aVar, 37);
            m1Var.j("noOfSplits", true);
            m1Var.j("maxGradeValue", true);
            m1Var.j("totalAscent", true);
            m1Var.j("duration", true);
            m1Var.j("splitType", true);
            m1Var.j("numClimbSends", true);
            m1Var.j("maxElevationGain", true);
            m1Var.j("averageElevationGain", true);
            m1Var.j("maxDistance", true);
            m1Var.j("maxDistanceWithPrecision", true);
            m1Var.j("distance", true);
            m1Var.j("averageSpeed", true);
            m1Var.j("maxSpeed", true);
            m1Var.j("mode", true);
            m1Var.j("numFalls", true);
            m1Var.j("avgStress", true);
            m1Var.j("avgStressWin", true);
            m1Var.j("avgStressLoss", true);
            m1Var.j("avgStressDraw", true);
            m1Var.j("gamesWon", true);
            m1Var.j("gamesNotWon", true);
            m1Var.j("gamesAverageWon", true);
            m1Var.j("elevationLoss", true);
            m1Var.j("maxPackWeight", true);
            m1Var.j("avgPackWeight", true);
            m1Var.j("maxDuration", true);
            m1Var.j("avgReactionTime", true);
            m1Var.j("minReactionTime", true);
            m1Var.j("avgDistanceToMaxSpeed", true);
            m1Var.j("avgStepFrequency", true);
            m1Var.j("maxStepFrequency", true);
            m1Var.j("avgStepLength", true);
            m1Var.j("verticalRatio", true);
            m1Var.j("verticalOscillation", true);
            m1Var.j("avgGroundContactBalanceLeft", true);
            m1Var.j("avgGroundContactTime", true);
            m1Var.j("avgStanceTimePercent", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            i63.c<?> cVarD = j63.a.d(m0Var);
            i63.c<?> cVarD2 = j63.a.d(h.a.f19123a);
            x xVar = x.f117036a;
            i63.c<?> cVarD3 = j63.a.d(xVar);
            i63.c<?> cVarD4 = j63.a.d(xVar);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            Integer num;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i19 = l63.c.f110557a;
            Integer num2 = null;
            Double d14 = null;
            Double d15 = null;
            Integer num3 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            Double d24 = null;
            Double d25 = null;
            Double d26 = null;
            Double d27 = null;
            Double d28 = null;
            Double d29 = null;
            boolean z14 = true;
            int i24 = 0;
            Integer num4 = null;
            h hVar = null;
            Double d34 = null;
            Double d35 = null;
            String str = null;
            Integer num5 = null;
            Double d36 = null;
            Double d37 = null;
            Integer num6 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            String str2 = null;
            int i25 = 0;
            Integer num7 = null;
            Double d46 = null;
            Double d47 = null;
            Double d48 = null;
            Double d49 = null;
            Integer num8 = null;
            Integer num9 = null;
            Double d54 = null;
            Double d55 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        Integer num10 = num2;
                        hVar = hVar;
                        Unit unit = Unit.INSTANCE;
                        z14 = false;
                        d15 = d15;
                        num2 = num10;
                        num7 = num7;
                        i25 = i25;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 0:
                        Integer num11 = num2;
                        int i26 = i25;
                        Integer num12 = num7;
                        Double d56 = d15;
                        hVar = hVar;
                        Integer num13 = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num4);
                        int i27 = i26 | 1;
                        Unit unit2 = Unit.INSTANCE;
                        i25 = i27;
                        d15 = d56;
                        num7 = num12;
                        num4 = num13;
                        num2 = num11;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 1:
                        num2 = num2;
                        d14 = d14;
                        num3 = num3;
                        int i28 = i25;
                        num = num7;
                        d15 = d15;
                        h hVar2 = (h) cVarC.v(eVar2, 1, h.a.f19123a, hVar);
                        i14 = i28 | 2;
                        Unit unit3 = Unit.INSTANCE;
                        hVar = hVar2;
                        d34 = d34;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 2:
                        int i29 = i25;
                        num = num7;
                        Double d57 = (Double) cVarC.v(eVar2, 2, x.f117036a, d34);
                        i14 = i29 | 4;
                        Unit unit4 = Unit.INSTANCE;
                        d34 = d57;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 3:
                        int i30 = i25;
                        num = num7;
                        Double d58 = (Double) cVarC.v(eVar2, 3, x.f117036a, d35);
                        i14 = i30 | 8;
                        Unit unit5 = Unit.INSTANCE;
                        d35 = d58;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 4:
                        int i34 = i25;
                        num = num7;
                        String str3 = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i14 = i34 | 16;
                        Unit unit6 = Unit.INSTANCE;
                        str = str3;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 5:
                        int i35 = i25;
                        num = num7;
                        Integer num14 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num5);
                        i14 = i35 | 32;
                        Unit unit7 = Unit.INSTANCE;
                        num5 = num14;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 6:
                        int i36 = i25;
                        num = num7;
                        Double d59 = (Double) cVarC.v(eVar2, 6, x.f117036a, d36);
                        i14 = i36 | 64;
                        Unit unit8 = Unit.INSTANCE;
                        d36 = d59;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 7:
                        int i37 = i25;
                        num = num7;
                        Double d64 = (Double) cVarC.v(eVar2, 7, x.f117036a, d37);
                        i14 = i37 | 128;
                        Unit unit9 = Unit.INSTANCE;
                        d37 = d64;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 8:
                        Integer num15 = (Integer) cVarC.v(eVar2, 8, m0.f116981a, num6);
                        i15 = i25 | 256;
                        Unit unit10 = Unit.INSTANCE;
                        num6 = num15;
                        hVar = hVar;
                        d15 = d15;
                        num3 = num3;
                        num7 = num7;
                        i25 = i15;
                        num2 = num2;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 9:
                        Double d65 = (Double) cVarC.v(eVar2, 9, x.f117036a, d38);
                        i15 = i25 | 512;
                        Unit unit11 = Unit.INSTANCE;
                        d38 = d65;
                        hVar = hVar;
                        d15 = d15;
                        num3 = num3;
                        num7 = num7;
                        i25 = i15;
                        num2 = num2;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 10:
                        int i38 = i25;
                        num = num7;
                        Double d66 = (Double) cVarC.v(eVar2, 10, x.f117036a, d39);
                        i14 = i38 | 1024;
                        Unit unit12 = Unit.INSTANCE;
                        d39 = d66;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 11:
                        int i39 = i25;
                        num = num7;
                        Double d67 = (Double) cVarC.v(eVar2, 11, x.f117036a, d44);
                        i14 = i39 | 2048;
                        Unit unit13 = Unit.INSTANCE;
                        d44 = d67;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 12:
                        int i44 = i25;
                        num = num7;
                        Double d68 = (Double) cVarC.v(eVar2, 12, x.f117036a, d45);
                        i14 = i44 | 4096;
                        Unit unit14 = Unit.INSTANCE;
                        d45 = d68;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 13:
                        int i45 = i25;
                        num = num7;
                        String str4 = (String) cVarC.v(eVar2, 13, y1.f117048a, str2);
                        i14 = i45 | 8192;
                        Unit unit15 = Unit.INSTANCE;
                        str2 = str4;
                        hVar = hVar;
                        d15 = d15;
                        num2 = num2;
                        num3 = num3;
                        num7 = num;
                        i25 = i14;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 14:
                        Integer num16 = (Integer) cVarC.v(eVar2, 14, m0.f116981a, num7);
                        i16 = i25 | 16384;
                        Unit unit16 = Unit.INSTANCE;
                        num7 = num16;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 15:
                        Double d69 = (Double) cVarC.v(eVar2, 15, x.f117036a, d46);
                        i16 = i25 | 32768;
                        Unit unit17 = Unit.INSTANCE;
                        d46 = d69;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 16:
                        Double d74 = (Double) cVarC.v(eVar2, 16, x.f117036a, d47);
                        i16 = i25 | 65536;
                        Unit unit18 = Unit.INSTANCE;
                        d47 = d74;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 17:
                        Double d75 = (Double) cVarC.v(eVar2, 17, x.f117036a, d48);
                        i16 = i25 | 131072;
                        Unit unit19 = Unit.INSTANCE;
                        d48 = d75;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 18:
                        Double d76 = (Double) cVarC.v(eVar2, 18, x.f117036a, d49);
                        i16 = i25 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit20 = Unit.INSTANCE;
                        d49 = d76;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 19:
                        Integer num17 = (Integer) cVarC.v(eVar2, 19, m0.f116981a, num8);
                        i16 = i25 | 524288;
                        Unit unit21 = Unit.INSTANCE;
                        num8 = num17;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 20:
                        Integer num18 = (Integer) cVarC.v(eVar2, 20, m0.f116981a, num9);
                        i16 = i25 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit22 = Unit.INSTANCE;
                        num9 = num18;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 21:
                        Double d77 = (Double) cVarC.v(eVar2, 21, x.f117036a, d54);
                        i16 = i25 | 2097152;
                        Unit unit23 = Unit.INSTANCE;
                        d54 = d77;
                        i25 = i16;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 22:
                        d14 = d14;
                        num3 = num3;
                        num2 = num2;
                        Double d78 = (Double) cVarC.v(eVar2, 22, x.f117036a, d55);
                        Unit unit24 = Unit.INSTANCE;
                        i25 |= 4194304;
                        d55 = d78;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 23:
                        d14 = d14;
                        num3 = num3;
                        num2 = (Integer) cVarC.v(eVar2, 23, m0.f116981a, num2);
                        Unit unit25 = Unit.INSTANCE;
                        i25 |= 8388608;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 24:
                        Integer num19 = num2;
                        d14 = d14;
                        num3 = (Integer) cVarC.v(eVar2, 24, m0.f116981a, num3);
                        int i46 = i25 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit26 = Unit.INSTANCE;
                        i25 = i46;
                        hVar = hVar;
                        num2 = num19;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 25:
                        d18 = (Double) cVarC.v(eVar2, 25, x.f117036a, d18);
                        i17 = 33554432;
                        Unit unit27 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 26:
                        d19 = (Double) cVarC.v(eVar2, 26, x.f117036a, d19);
                        i17 = 67108864;
                        Unit unit28 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 27:
                        d17 = (Double) cVarC.v(eVar2, 27, x.f117036a, d17);
                        i17 = 134217728;
                        Unit unit29 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 28:
                        d24 = (Double) cVarC.v(eVar2, 28, x.f117036a, d24);
                        i17 = 268435456;
                        Unit unit210 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 29:
                        d25 = (Double) cVarC.v(eVar2, 29, x.f117036a, d25);
                        i17 = 536870912;
                        Unit unit211 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 30:
                        d26 = (Double) cVarC.v(eVar2, 30, x.f117036a, d26);
                        i17 = 1073741824;
                        Unit unit212 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 31:
                        d27 = (Double) cVarC.v(eVar2, 31, x.f117036a, d27);
                        i17 = Integer.MIN_VALUE;
                        Unit unit213 = Unit.INSTANCE;
                        i25 |= i17;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 32:
                        d28 = (Double) cVarC.v(eVar2, 32, x.f117036a, d28);
                        i18 = i24 | 1;
                        Unit unit30 = Unit.INSTANCE;
                        i24 = i18;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 33:
                        d29 = (Double) cVarC.v(eVar2, 33, x.f117036a, d29);
                        i18 = i24 | 2;
                        Unit unit31 = Unit.INSTANCE;
                        i24 = i18;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 34:
                        d16 = (Double) cVarC.v(eVar2, 34, x.f117036a, d16);
                        i18 = i24 | 4;
                        Unit unit32 = Unit.INSTANCE;
                        i24 = i18;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 35:
                        d15 = (Double) cVarC.v(eVar2, 35, x.f117036a, d15);
                        i18 = i24 | 8;
                        Unit unit33 = Unit.INSTANCE;
                        i24 = i18;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    case 36:
                        d14 = (Double) cVarC.v(eVar2, 36, x.f117036a, d14);
                        i18 = i24 | 16;
                        Unit unit34 = Unit.INSTANCE;
                        i24 = i18;
                        d14 = d14;
                        num2 = num2;
                        num3 = num3;
                        hVar = hVar;
                        d14 = d14;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d79 = d14;
            Integer num20 = num3;
            h hVar3 = hVar;
            Double d84 = d34;
            int i47 = i25;
            Integer num21 = num7;
            Double d85 = d15;
            Integer num22 = num4;
            cVarC.b(eVar2);
            Double d86 = d18;
            return new j(i47, i24, num22, hVar3, d84, d35, str, num5, d36, d37, num6, d38, d39, d44, d45, str2, num21, d46, d47, d48, d49, num8, num9, d54, d55, num2, num20, d86, d19, d17, d24, d25, d26, d27, d28, d29, d16, d85, d79, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            Double d14 = jVar.K;
            Double d15 = jVar.J;
            Double d16 = jVar.I;
            Double d17 = jVar.H;
            Double d18 = jVar.G;
            Double d19 = jVar.F;
            Double d24 = jVar.E;
            Double d25 = jVar.D;
            Double d26 = jVar.C;
            Double d27 = jVar.B;
            Double d28 = jVar.A;
            Double d29 = jVar.f19152z;
            Integer num = jVar.f19151y;
            Integer num2 = jVar.f19150x;
            Double d34 = jVar.f19149w;
            Double d35 = jVar.f19148v;
            Integer num3 = jVar.f19147u;
            Integer num4 = jVar.f19146t;
            Double d36 = jVar.f19145s;
            Double d37 = jVar.f19144r;
            Double d38 = jVar.f19143q;
            Double d39 = jVar.f19142p;
            Integer num5 = jVar.f19141o;
            String str = jVar.f19140n;
            Double d44 = jVar.f19139m;
            Double d45 = jVar.f19138l;
            Double d46 = jVar.f19137k;
            Double d47 = jVar.f19136j;
            Integer num6 = jVar.f19135i;
            Double d48 = jVar.f19134h;
            Double d49 = jVar.f19133g;
            Integer num7 = jVar.f19132f;
            String str2 = jVar.f19131e;
            Double d54 = jVar.f19130d;
            Double d55 = jVar.f19129c;
            h hVar = jVar.f19128b;
            Integer num8 = jVar.f19127a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || num8 != null) {
                dVarC.d(eVar, 0, m0.f116981a, num8);
            }
            if (dVarC.C(eVar) || hVar != null) {
                dVarC.d(eVar, 1, h.a.f19123a, hVar);
            }
            if (dVarC.C(eVar) || d55 != null) {
                dVarC.d(eVar, 2, x.f117036a, d55);
            }
            if (dVarC.C(eVar) || d54 != null) {
                dVarC.d(eVar, 3, x.f117036a, d54);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || num7 != null) {
                dVarC.d(eVar, 5, m0.f116981a, num7);
            }
            if (dVarC.C(eVar) || d49 != null) {
                dVarC.d(eVar, 6, x.f117036a, d49);
            }
            if (dVarC.C(eVar) || d48 != null) {
                dVarC.d(eVar, 7, x.f117036a, d48);
            }
            if (dVarC.C(eVar) || num6 != null) {
                dVarC.d(eVar, 8, m0.f116981a, num6);
            }
            if (dVarC.C(eVar) || d47 != null) {
                dVarC.d(eVar, 9, x.f117036a, d47);
            }
            if (dVarC.C(eVar) || d46 != null) {
                dVarC.d(eVar, 10, x.f117036a, d46);
            }
            if (dVarC.C(eVar) || d45 != null) {
                dVarC.d(eVar, 11, x.f117036a, d45);
            }
            if (dVarC.C(eVar) || d44 != 0) {
                dVarC.d(eVar, 12, x.f117036a, d44);
            }
            if (dVarC.C(eVar) || str != 0) {
                dVarC.d(eVar, 13, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num5 != null) {
                dVarC.d(eVar, 14, m0.f116981a, num5);
            }
            if (dVarC.C(eVar) || d39 != null) {
                dVarC.d(eVar, 15, x.f117036a, d39);
            }
            if (dVarC.C(eVar) || d38 != null) {
                dVarC.d(eVar, 16, x.f117036a, d38);
            }
            if (dVarC.C(eVar) || d37 != null) {
                dVarC.d(eVar, 17, x.f117036a, d37);
            }
            if (dVarC.C(eVar) || d36 != null) {
                dVarC.d(eVar, 18, x.f117036a, d36);
            }
            if (dVarC.C(eVar) || num4 != null) {
                dVarC.d(eVar, 19, m0.f116981a, num4);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 20, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || d35 != null) {
                dVarC.d(eVar, 21, x.f117036a, d35);
            }
            if (dVarC.C(eVar) || d34 != null) {
                dVarC.d(eVar, 22, x.f117036a, d34);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 23, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 24, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || d29 != null) {
                dVarC.d(eVar, 25, x.f117036a, d29);
            }
            if (dVarC.C(eVar) || d28 != null) {
                dVarC.d(eVar, 26, x.f117036a, d28);
            }
            if (dVarC.C(eVar) || d27 != null) {
                dVarC.d(eVar, 27, x.f117036a, d27);
            }
            if (dVarC.C(eVar) || d26 != null) {
                dVarC.d(eVar, 28, x.f117036a, d26);
            }
            if (dVarC.C(eVar) || d25 != null) {
                dVarC.d(eVar, 29, x.f117036a, d25);
            }
            if (dVarC.C(eVar) || d24 != null) {
                dVarC.d(eVar, 30, x.f117036a, d24);
            }
            if (dVarC.C(eVar) || d19 != null) {
                dVarC.d(eVar, 31, x.f117036a, d19);
            }
            if (dVarC.C(eVar) || d18 != null) {
                dVarC.d(eVar, 32, x.f117036a, d18);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 33, x.f117036a, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 34, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 35, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 36, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ j(Integer num, h hVar, Double d14, Double d15, String str, Integer num2, Double d16, Double d17, Integer num3, Double d18, Double d19, Double d24, Double d25, String str2, Integer num4, Double d26, Double d27, Double d28, Double d29, Integer num5, Integer num6, Double d34, Double d35, Integer num7, Integer num8, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : d16, (i14 & 128) != 0 ? null : d17, (i14 & 256) != 0 ? null : num3, (i14 & 512) != 0 ? null : d18, (i14 & 1024) != 0 ? null : d19, (i14 & 2048) != 0 ? null : d24, (i14 & 4096) != 0 ? null : d25, (i14 & 8192) != 0 ? null : str2, (i14 & 16384) != 0 ? null : num4, (i14 & 32768) != 0 ? null : d26, (i14 & 65536) != 0 ? null : d27, (i14 & 131072) != 0 ? null : d28, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d29, (i14 & 524288) != 0 ? null : num5, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num6, (i14 & 2097152) != 0 ? null : d34, (i14 & 4194304) != 0 ? null : d35, (i14 & 8388608) != 0 ? null : num7, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num8, (i14 & 33554432) != 0 ? null : d36, (i14 & 67108864) != 0 ? null : d37, (i14 & 134217728) != 0 ? null : d38, (i14 & 268435456) != 0 ? null : d39, (i14 & 536870912) != 0 ? null : d44, (i14 & 1073741824) != 0 ? null : d45, (i14 & Integer.MIN_VALUE) != 0 ? null : d46, (i15 & 1) != 0 ? null : d47, (i15 & 2) != 0 ? null : d48, (i15 & 4) != 0 ? null : d49, (i15 & 8) != 0 ? null : d54, (i15 & 16) != 0 ? null : d55);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f19127a, jVar.f19127a) && s.g(this.f19128b, jVar.f19128b) && s.g(this.f19129c, jVar.f19129c) && s.g(this.f19130d, jVar.f19130d) && s.g(this.f19131e, jVar.f19131e) && s.g(this.f19132f, jVar.f19132f) && s.g(this.f19133g, jVar.f19133g) && s.g(this.f19134h, jVar.f19134h) && s.g(this.f19135i, jVar.f19135i) && s.g(this.f19136j, jVar.f19136j) && s.g(this.f19137k, jVar.f19137k) && s.g(this.f19138l, jVar.f19138l) && s.g(this.f19139m, jVar.f19139m) && s.g(this.f19140n, jVar.f19140n) && s.g(this.f19141o, jVar.f19141o) && s.g(this.f19142p, jVar.f19142p) && s.g(this.f19143q, jVar.f19143q) && s.g(this.f19144r, jVar.f19144r) && s.g(this.f19145s, jVar.f19145s) && s.g(this.f19146t, jVar.f19146t) && s.g(this.f19147u, jVar.f19147u) && s.g(this.f19148v, jVar.f19148v) && s.g(this.f19149w, jVar.f19149w) && s.g(this.f19150x, jVar.f19150x) && s.g(this.f19151y, jVar.f19151y) && s.g(this.f19152z, jVar.f19152z) && s.g(this.A, jVar.A) && s.g(this.B, jVar.B) && s.g(this.C, jVar.C) && s.g(this.D, jVar.D) && s.g(this.E, jVar.E) && s.g(this.F, jVar.F) && s.g(this.G, jVar.G) && s.g(this.H, jVar.H) && s.g(this.I, jVar.I) && s.g(this.J, jVar.J) && s.g(this.K, jVar.K);
    }

    public final int hashCode() {
        Integer num = this.f19127a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        h hVar = this.f19128b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Double d14 = this.f19129c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f19130d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.f19131e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f19132f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d16 = this.f19133g;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f19134h;
        int iHashCode8 = (iHashCode7 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num3 = this.f19135i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d18 = this.f19136j;
        int iHashCode10 = (iHashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f19137k;
        int iHashCode11 = (iHashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f19138l;
        int iHashCode12 = (iHashCode11 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f19139m;
        int iHashCode13 = (iHashCode12 + (d25 == null ? 0 : d25.hashCode())) * 31;
        String str2 = this.f19140n;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.f19141o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d26 = this.f19142p;
        int iHashCode16 = (iHashCode15 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f19143q;
        int iHashCode17 = (iHashCode16 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f19144r;
        int iHashCode18 = (iHashCode17 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f19145s;
        int iHashCode19 = (iHashCode18 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Integer num5 = this.f19146t;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f19147u;
        int iHashCode21 = (iHashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d34 = this.f19148v;
        int iHashCode22 = (iHashCode21 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f19149w;
        int iHashCode23 = (iHashCode22 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Integer num7 = this.f19150x;
        int iHashCode24 = (iHashCode23 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f19151y;
        int iHashCode25 = (iHashCode24 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d36 = this.f19152z;
        int iHashCode26 = (iHashCode25 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.A;
        int iHashCode27 = (iHashCode26 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.B;
        int iHashCode28 = (iHashCode27 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.C;
        int iHashCode29 = (iHashCode28 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.D;
        int iHashCode30 = (iHashCode29 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.E;
        int iHashCode31 = (iHashCode30 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.F;
        int iHashCode32 = (iHashCode31 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.G;
        int iHashCode33 = (iHashCode32 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.H;
        int iHashCode34 = (iHashCode33 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.I;
        int iHashCode35 = (iHashCode34 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.J;
        int iHashCode36 = (iHashCode35 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Double d55 = this.K;
        return iHashCode36 + (d55 != null ? d55.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MinimalSplitSummaryDTO(noOfSplits=");
        sb3.append(this.f19127a);
        sb3.append(", maxGradeValue=");
        sb3.append(this.f19128b);
        sb3.append(", totalAscent=");
        b71.i.p(this.f19129c, this.f19130d, ", duration=", ", splitType=", sb3);
        fb1.c.u(this.f19132f, this.f19131e, ", numClimbSends=", ", maxElevationGain=", sb3);
        b71.i.p(this.f19133g, this.f19134h, ", averageElevationGain=", ", maxDistance=", sb3);
        b71.i.v(sb3, this.f19135i, ", maxDistanceWithPrecision=", this.f19136j, ", distance=");
        b71.i.p(this.f19137k, this.f19138l, ", averageSpeed=", ", maxSpeed=", sb3);
        b71.i.u(sb3, this.f19139m, ", mode=", this.f19140n, ", numFalls=");
        b71.i.v(sb3, this.f19141o, ", avgStress=", this.f19142p, ", avgStressWin=");
        b71.i.p(this.f19143q, this.f19144r, ", avgStressLoss=", ", avgStressDraw=", sb3);
        b71.i.t(sb3, this.f19145s, ", gamesWon=", this.f19146t, ", gamesNotWon=");
        b71.i.v(sb3, this.f19147u, ", gamesAverageWon=", this.f19148v, ", elevationLoss=");
        b71.i.t(sb3, this.f19149w, ", maxPackWeight=", this.f19150x, ", avgPackWeight=");
        b71.i.v(sb3, this.f19151y, ", maxDuration=", this.f19152z, ", avgReactionTime=");
        b71.i.p(this.A, this.B, ", minReactionTime=", ", avgDistanceToMaxSpeed=", sb3);
        b71.i.p(this.C, this.D, ", avgStepFrequency=", ", maxStepFrequency=", sb3);
        b71.i.p(this.E, this.F, ", avgStepLength=", ", verticalRatio=", sb3);
        b71.i.p(this.G, this.H, ", verticalOscillation=", ", avgGroundContactBalanceLeft=", sb3);
        b71.i.p(this.I, this.J, ", avgGroundContactTime=", ", avgStanceTimePercent=", sb3);
        return b71.i.g(sb3, this.K, ")");
    }

    /* JADX INFO: renamed from: bo.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/j$b;", "", "<init>", "()V", "Li63/c;", "Lbo/j;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f19153a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ j(int i14, int i15, Integer num, h hVar, Double d14, Double d15, String str, Integer num2, Double d16, Double d17, Integer num3, Double d18, Double d19, Double d24, Double d25, String str2, Integer num4, Double d26, Double d27, Double d28, Double d29, Integer num5, Integer num6, Double d34, Double d35, Integer num7, Integer num8, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19127a = null;
        } else {
            this.f19127a = num;
        }
        if ((i14 & 2) == 0) {
            this.f19128b = null;
        } else {
            this.f19128b = hVar;
        }
        if ((i14 & 4) == 0) {
            this.f19129c = null;
        } else {
            this.f19129c = d14;
        }
        if ((i14 & 8) == 0) {
            this.f19130d = null;
        } else {
            this.f19130d = d15;
        }
        if ((i14 & 16) == 0) {
            this.f19131e = null;
        } else {
            this.f19131e = str;
        }
        if ((i14 & 32) == 0) {
            this.f19132f = null;
        } else {
            this.f19132f = num2;
        }
        if ((i14 & 64) == 0) {
            this.f19133g = null;
        } else {
            this.f19133g = d16;
        }
        if ((i14 & 128) == 0) {
            this.f19134h = null;
        } else {
            this.f19134h = d17;
        }
        if ((i14 & 256) == 0) {
            this.f19135i = null;
        } else {
            this.f19135i = num3;
        }
        if ((i14 & 512) == 0) {
            this.f19136j = null;
        } else {
            this.f19136j = d18;
        }
        if ((i14 & 1024) == 0) {
            this.f19137k = null;
        } else {
            this.f19137k = d19;
        }
        if ((i14 & 2048) == 0) {
            this.f19138l = null;
        } else {
            this.f19138l = d24;
        }
        if ((i14 & 4096) == 0) {
            this.f19139m = null;
        } else {
            this.f19139m = d25;
        }
        if ((i14 & 8192) == 0) {
            this.f19140n = null;
        } else {
            this.f19140n = str2;
        }
        if ((i14 & 16384) == 0) {
            this.f19141o = null;
        } else {
            this.f19141o = num4;
        }
        if ((32768 & i14) == 0) {
            this.f19142p = null;
        } else {
            this.f19142p = d26;
        }
        if ((65536 & i14) == 0) {
            this.f19143q = null;
        } else {
            this.f19143q = d27;
        }
        if ((131072 & i14) == 0) {
            this.f19144r = null;
        } else {
            this.f19144r = d28;
        }
        if ((262144 & i14) == 0) {
            this.f19145s = null;
        } else {
            this.f19145s = d29;
        }
        if ((524288 & i14) == 0) {
            this.f19146t = null;
        } else {
            this.f19146t = num5;
        }
        if ((1048576 & i14) == 0) {
            this.f19147u = null;
        } else {
            this.f19147u = num6;
        }
        if ((2097152 & i14) == 0) {
            this.f19148v = null;
        } else {
            this.f19148v = d34;
        }
        if ((4194304 & i14) == 0) {
            this.f19149w = null;
        } else {
            this.f19149w = d35;
        }
        if ((8388608 & i14) == 0) {
            this.f19150x = null;
        } else {
            this.f19150x = num7;
        }
        if ((16777216 & i14) == 0) {
            this.f19151y = null;
        } else {
            this.f19151y = num8;
        }
        if ((33554432 & i14) == 0) {
            this.f19152z = null;
        } else {
            this.f19152z = d36;
        }
        if ((67108864 & i14) == 0) {
            this.A = null;
        } else {
            this.A = d37;
        }
        if ((134217728 & i14) == 0) {
            this.B = null;
        } else {
            this.B = d38;
        }
        if ((268435456 & i14) == 0) {
            this.C = null;
        } else {
            this.C = d39;
        }
        if ((536870912 & i14) == 0) {
            this.D = null;
        } else {
            this.D = d44;
        }
        if ((1073741824 & i14) == 0) {
            this.E = null;
        } else {
            this.E = d45;
        }
        if ((i14 & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = d46;
        }
        if ((i15 & 1) == 0) {
            this.G = null;
        } else {
            this.G = d47;
        }
        if ((i15 & 2) == 0) {
            this.H = null;
        } else {
            this.H = d48;
        }
        if ((i15 & 4) == 0) {
            this.I = null;
        } else {
            this.I = d49;
        }
        if ((i15 & 8) == 0) {
            this.J = null;
        } else {
            this.J = d54;
        }
        if ((i15 & 16) == 0) {
            this.K = null;
        } else {
            this.K = d55;
        }
    }

    public j(Integer num, h hVar, Double d14, Double d15, String str, Integer num2, Double d16, Double d17, Integer num3, Double d18, Double d19, Double d24, Double d25, String str2, Integer num4, Double d26, Double d27, Double d28, Double d29, Integer num5, Integer num6, Double d34, Double d35, Integer num7, Integer num8, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55) {
        this.f19127a = num;
        this.f19128b = hVar;
        this.f19129c = d14;
        this.f19130d = d15;
        this.f19131e = str;
        this.f19132f = num2;
        this.f19133g = d16;
        this.f19134h = d17;
        this.f19135i = num3;
        this.f19136j = d18;
        this.f19137k = d19;
        this.f19138l = d24;
        this.f19139m = d25;
        this.f19140n = str2;
        this.f19141o = num4;
        this.f19142p = d26;
        this.f19143q = d27;
        this.f19144r = d28;
        this.f19145s = d29;
        this.f19146t = num5;
        this.f19147u = num6;
        this.f19148v = d34;
        this.f19149w = d35;
        this.f19150x = num7;
        this.f19151y = num8;
        this.f19152z = d36;
        this.A = d37;
        this.B = d38;
        this.C = d39;
        this.D = d44;
        this.E = d45;
        this.F = d46;
        this.G = d47;
        this.H = d48;
        this.I = d49;
        this.J = d54;
        this.K = d55;
    }

    public j() {
        this((Integer) null, (h) null, (Double) null, (Double) null, (String) null, (Integer) null, (Double) null, (Double) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (String) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, -1, 31, (p005kotlin.jvm.internal.j) null);
    }
}
