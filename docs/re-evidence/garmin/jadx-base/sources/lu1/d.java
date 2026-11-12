package lu1;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c53.f0;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import g22.k;
import gl1.y;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kd0.h6;
import lc.u0;
import o13.p;
import o4.d0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import vt1.o;
import ww1.b0;
import ww1.c0;
import ww1.g0;
import ww1.h;
import ww1.s;
import ww1.t;
import z72.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llu1/d;", "Lr70/r;", "Lmu1/a;", "stateHolder", "<init>", "(Lmu1/a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f115002b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu1.a f115003a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115004a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.ATP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.ITP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.FBT_ADAPTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.STP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115004a = iArr;
        }
    }

    static {
        new a(null);
    }

    public d(mu1.a aVar) {
        aVar.getClass();
        this.f115003a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static boolean c(s sVar, g0 g0Var, DateTime dateTime, LocalDate localDate, LocalDate localDate2) {
        o oVar;
        LocalDate localDate3 = dateTime.toLocalDate();
        localDate3.getClass();
        if (localDate3.compareTo(localDate) < 0 || localDate3.compareTo(localDate2) > 0 || !sVar.c()) {
            return false;
        }
        if (g0Var != null) {
            int i14 = g0.b.f187779a[g0Var.ordinal()];
            if (i14 == 1) {
                oVar = o.f180175f;
            } else if (i14 == 2) {
                oVar = o.f180176g;
            } else if (i14 == 3) {
                oVar = o.f180178i;
            } else if (i14 == 4) {
                oVar = o.f180177h;
            } else {
                if (i14 != 5) {
                    u0.r();
                    return false;
                }
                oVar = o.f180179j;
            }
            List<String> listC = oVar.c();
            if (listC == null || !listC.contains(sVar.getActivityType())) {
                if (!u.q(sVar.getActivityType(), x0.f4316p.f4358a, true)) {
                    return false;
                }
            }
        } else if (!u.q(sVar.getActivityType(), x0.f4316p.f4358a, true)) {
            return false;
        }
        DateTime dateTimeB = sVar.b();
        return dateTimeB != null && k.f(dateTimeB, dateTime);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02de  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:146:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:153:0x031a  */
    /* JADX WARN: Code duplicated, block: B:158:0x032b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0335  */
    /* JADX WARN: Code duplicated, block: B:163:0x034e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0358  */
    /* JADX WARN: Code duplicated, block: B:168:0x0362  */
    /* JADX WARN: Code duplicated, block: B:169:0x0390  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:189:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:193:0x0403  */
    /* JADX WARN: Code duplicated, block: B:194:0x0408  */
    /* JADX WARN: Code duplicated, block: B:197:0x0445  */
    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0469  */
    /* JADX WARN: Code duplicated, block: B:204:0x0471  */
    /* JADX WARN: Code duplicated, block: B:210:0x0483  */
    /* JADX WARN: Code duplicated, block: B:213:0x048f  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:237:0x050a  */
    /* JADX WARN: Code duplicated, block: B:238:0x050d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0516  */
    /* JADX WARN: Code duplicated, block: B:243:0x0523  */
    /* JADX WARN: Code duplicated, block: B:246:0x053b  */
    /* JADX WARN: Code duplicated, block: B:248:0x0542  */
    /* JADX WARN: Code duplicated, block: B:251:0x054e  */
    /* JADX WARN: Code duplicated, block: B:258:0x057f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0585  */
    /* JADX WARN: Code duplicated, block: B:267:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:269:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:272:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:275:0x0602  */
    /* JADX WARN: Code duplicated, block: B:277:0x0605  */
    /* JADX WARN: Code duplicated, block: B:278:0x063c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x063e  */
    /* JADX WARN: Code duplicated, block: B:281:0x067c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0682  */
    /* JADX WARN: Code duplicated, block: B:284:0x0689  */
    /* JADX WARN: Code duplicated, block: B:287:0x0692  */
    /* JADX WARN: Code duplicated, block: B:288:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:293:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:295:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:297:0x0700  */
    /* JADX WARN: Code duplicated, block: B:298:0x0706  */
    /* JADX WARN: Code duplicated, block: B:300:0x0709  */
    /* JADX WARN: Code duplicated, block: B:301:0x070b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0726  */
    /* JADX WARN: Code duplicated, block: B:306:0x0732  */
    /* JADX WARN: Code duplicated, block: B:308:0x0738  */
    /* JADX WARN: Code duplicated, block: B:309:0x073b  */
    /* JADX WARN: Code duplicated, block: B:317:0x0750  */
    /* JADX WARN: Code duplicated, block: B:364:0x088f  */
    /* JADX WARN: Code duplicated, block: B:365:0x089a  */
    /* JADX WARN: Code duplicated, block: B:373:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:375:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:376:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:378:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:379:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:385:0x0919  */
    /* JADX WARN: Code duplicated, block: B:394:0x0939  */
    /* JADX WARN: Code duplicated, block: B:398:0x0957  */
    /* JADX WARN: Code duplicated, block: B:400:0x0963  */
    /* JADX WARN: Code duplicated, block: B:402:0x096b  */
    /* JADX WARN: Code duplicated, block: B:405:0x097e  */
    /* JADX WARN: Code duplicated, block: B:407:0x099a  */
    /* JADX WARN: Code duplicated, block: B:410:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:411:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:415:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:417:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:421:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:438:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:465:0x0aaf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0aed A[PHI: r30 r35
      0x0aed: PHI (r30v3 com.garmin.android.apps.connectmobile.workouts.data.model.d) = 
      (r30v0 com.garmin.android.apps.connectmobile.workouts.data.model.d)
      (r30v5 com.garmin.android.apps.connectmobile.workouts.data.model.d)
     binds: [B:483:0x0af9, B:479:0x0aeb] A[DONT_GENERATE, DONT_INLINE]
      0x0aed: PHI (r35v3 java.util.ArrayList) = (r35v0 java.util.ArrayList), (r35v5 java.util.ArrayList) binds: [B:483:0x0af9, B:479:0x0aeb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:481:0x0aef A[PHI: r30 r35
      0x0aef: PHI (r30v1 com.garmin.android.apps.connectmobile.workouts.data.model.d) = 
      (r30v0 com.garmin.android.apps.connectmobile.workouts.data.model.d)
      (r30v5 com.garmin.android.apps.connectmobile.workouts.data.model.d)
     binds: [B:483:0x0af9, B:479:0x0aeb] A[DONT_GENERATE, DONT_INLINE]
      0x0aef: PHI (r35v1 java.util.ArrayList) = (r35v0 java.util.ArrayList), (r35v5 java.util.ArrayList) binds: [B:483:0x0af9, B:479:0x0aeb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:482:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:487:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:493:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:494:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:496:0x0b25 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:499:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:502:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:506:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:509:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:511:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:516:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:519:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:531:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:534:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:537:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:538:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:563:0x099d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x09e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x0489 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        o0 o0Var;
        p pVar;
        String strJ;
        boolean z14;
        boolean z15;
        p pVar2;
        p pVar3;
        i53.c cVar;
        ww1.u uVar;
        i53.c cVar2;
        boolean z16;
        lu1.a aVar;
        ww1.u uVar2;
        ww1.u uVar3;
        u4.d dVar;
        boolean z17;
        lu1.a aVar2;
        Context context;
        boolean zB;
        ww1.u uVar4;
        String planName;
        boolean z18;
        String str;
        String str2;
        String str3;
        ww1.u uVar5;
        ww1.u uVar6;
        boolean z19;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z24;
        ?? r14;
        boolean z25;
        boolean z26;
        Object objQ;
        t tVar;
        ww1.u uVar7;
        List<s> list;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> listA;
        c0 trainingPlanDetailBrief;
        LocalDate localDate;
        c0 trainingPlanDetailBrief2;
        LocalDate localDate2;
        ?? D1;
        f0.a aVar3;
        DateTime dateTime;
        f0.a aVar4;
        String str8;
        String str9;
        String str10;
        List list2;
        ArrayList arrayList;
        List list3;
        List list4;
        com.garmin.android.apps.connectmobile.workouts.data.model.d dVar2;
        com.garmin.android.apps.connectmobile.workouts.data.model.d dVar3;
        boolean z27;
        m52.k kVarJ;
        DateTime dateTimeG;
        DateTime dateTime2;
        boolean z28;
        boolean z29;
        DateTime dateTimeG2;
        int i15;
        Integer numValueOf;
        e eVar;
        Object next;
        e eVar2;
        boolean z34;
        boolean z35;
        Object next2;
        ww1.u uVar8;
        ww1.u uVar9;
        ArrayList arrayList2;
        h athleteRace;
        DateTime dateTimeB;
        DateTime dateTimeR;
        ww1.u uVar10;
        t tVar2;
        c0 trainingPlanDetailBrief3;
        boolean z36;
        int i16;
        Integer numValueOf2;
        e eVar3;
        xw1.p pVarA;
        t tVar3;
        NumberFormat integerInstance;
        ww1.u uVar11;
        ww1.u uVar12;
        int size;
        c0 trainingPlanDetailBrief4;
        DateTime dateTimeR2;
        b0 b0VarB;
        b0 b0Var;
        c0 trainingPlanDetailBrief5;
        DateTime dateTimeNow;
        ww1.u uVar13;
        Boolean boolValueOf;
        lu1.a aVar5;
        boolean z37;
        boolean z38;
        String strJ2;
        c0 trainingPlanDetailBrief6;
        t tVar4;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d> listD;
        Iterator it;
        int i17;
        ww1.u uVar14;
        int i18;
        List<s> list5;
        DateTime dateTimeWithTimeAtStartOfDay;
        DateTime dateTimeA;
        Iterator it3;
        s sVar;
        Iterator it4;
        t tVar5;
        c0 trainingPlanDetailBrief7;
        NumberFormat integerInstance2;
        c0 trainingPlanDetailBrief8;
        t tVar6;
        b0 b0VarB2;
        b0 b0Var2;
        int iO;
        int iT;
        c0 trainingPlanDetailBrief9;
        DateTime dateTimeB2;
        c0 trainingPlanDetailBrief10;
        DateTime dateTimeB3;
        String strB;
        h athleteRace2;
        c0 trainingPlanDetailBrief11;
        DateTime dateTimeB4;
        h athleteRace3;
        h athleteRace4;
        long j8;
        long jC;
        j70.d<ww1.u> dVar4 = this.f115003a.f121119a;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -926196645);
        int i19 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i19 |= (i14 & 512) == 0 ? o0VarQ.B(this) : o0VarQ.r(this) ? 256 : 128;
        }
        int i24 = i19;
        if (o0VarQ.n(i24 & 1, (i24 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            ww1.u uVar15 = dVar4.f97521b;
            t tVar7 = uVar15 != null ? uVar15.f187871a : null;
            if ((tVar7 != null ? tVar7.b() : null) == null) {
                o0VarQ.C(-1454003573);
                o0VarQ.g0(false);
                o0Var = o0VarQ;
            } else {
                o0VarQ.C(-1454003572);
                ww1.u uVar16 = dVar4.f97521b;
                g0 g0VarB = uVar16 != null ? uVar16.b() : null;
                if (g0VarB == null) {
                    o0VarQ.C(-335153779);
                    o0VarQ.g0(false);
                    pVar = null;
                } else {
                    o0VarQ.C(-335153778);
                    pVar = new p(g0VarB.f187777b, y.P(R.string.training_plan_type_param, new Object[]{y.Q(o0VarQ, g0VarB.f187778c)}, o0VarQ));
                    o0VarQ.g0(false);
                }
                if (pVar == null) {
                    pVar = new p(null, null);
                }
                u4.d dVar5 = (u4.d) pVar.f128594a;
                String str11 = (String) pVar.f128595b;
                ww1.u uVar17 = dVar4.f97521b;
                if (uVar17 == null) {
                    strJ = null;
                } else {
                    strJ = uVar17.f187871a.getPlanName();
                    if (strJ == null) {
                        xw1.p pVarA2 = uVar17.a();
                        if (pVarA2 != null) {
                            strJ = pVarA2.getName();
                        } else {
                            strJ = null;
                        }
                    }
                }
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 915371826, R.string.title_training_plan, o0VarQ, false);
                } else {
                    o0VarQ.C(915370121);
                    o0VarQ.g0(false);
                }
                String str12 = strJ;
                ww1.u uVar18 = dVar4.f97521b;
                if (!(uVar18 != null && uVar18.f187875e)) {
                    z14 = false;
                } else if (uVar18 != null ? uVar18.f187871a.g() : false) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                o0VarQ.C(-1034459807);
                ww1.u uVar19 = dVar4.f97521b;
                if (uVar19 != null) {
                    t tVar8 = uVar19.f187871a;
                    c0 trainingPlanDetailBrief12 = tVar8.getTrainingPlanDetailBrief();
                    if (trainingPlanDetailBrief12 == null) {
                        pVar3 = new p(i53.a.j(j0.f134944a), null);
                        o0VarQ.g0(false);
                    } else {
                        f02.c0.f67727a.getClass();
                        d92.b.f58623a.getClass();
                        if (d92.b.d(o0VarQ)) {
                            gl.c.f77766a.getClass();
                            j8 = gl.c.f77767b.f77785i;
                        } else {
                            gl.c.f77766a.getClass();
                            j8 = gl.c.f77767b.f77787j;
                        }
                        b0 b0VarB3 = tVar8.b();
                        int i25 = b0VarB3 == null ? -1 : b.f115004a[b0VarB3.ordinal()];
                        if (i25 != 1) {
                            if (i25 == 2) {
                                o0VarQ.C(-1199708498);
                                float fT = trainingPlanDetailBrief12.t();
                                float fM = trainingPlanDetailBrief12.m() / trainingPlanDetailBrief12.s();
                                ArrayList arrayList3 = new ArrayList();
                                Integer baseWeeks = trainingPlanDetailBrief12.getBaseWeeks();
                                float fIntValue = (baseWeeks != null ? baseWeeks.intValue() : 0.0f) / fT;
                                if (fIntValue > 0.0f) {
                                    arrayList3.add(new l(fIntValue, j8, null));
                                }
                                Integer buildWeeks = trainingPlanDetailBrief12.getBuildWeeks();
                                float fIntValue2 = (buildWeeks != null ? buildWeeks.intValue() : 0.0f) / fT;
                                if (fIntValue2 > 0.0f) {
                                    arrayList3.add(new l(fIntValue2, j8, null));
                                }
                                Integer peakWeeks = trainingPlanDetailBrief12.getPeakWeeks();
                                float fIntValue3 = (peakWeeks != null ? peakWeeks.intValue() : 0.0f) / fT;
                                if (fIntValue3 > 0.0f) {
                                    arrayList3.add(new l(fIntValue3, j8, null));
                                }
                                p pVar4 = new p(i53.a.e(arrayList3), Float.valueOf(fM));
                                o0VarQ.g0(false);
                                o0VarQ.g0(false);
                                pVar3 = pVar4;
                            } else if (i25 != 3 && i25 != 4) {
                                o0VarQ.C(-1198495778);
                                o0VarQ.g0(false);
                                a0.s(tVar8.b(), "Invalid plan classification type: ");
                                return;
                            }
                        }
                        o0VarQ.C(-1201096554);
                        float fM2 = (tVar8.b() == b0.FBT_ADAPTIVE || tVar8.b() == b0.ATP) ? trainingPlanDetailBrief12.m() / trainingPlanDetailBrief12.s() : trainingPlanDetailBrief12.o() / trainingPlanDetailBrief12.t();
                        long jA = f02.c0.a(o0VarQ);
                        if (d92.b.d(o0VarQ)) {
                            gl.c.f77766a.getClass();
                            jC = gl.c.f77767b.f77791l;
                        } else {
                            gl.c.f77766a.getClass();
                            jC = gl.c.f77767b.f77781g;
                        }
                        if (d()) {
                            jA = d0.c(0.5f, jA, 14);
                            jC = d0.c(0.5f, jC, 14);
                        }
                        pVar2 = new p(i53.a.a(new l(fM2, jA, null), new l(1 - fM2, jC, null)), null);
                        z15 = false;
                        o0VarQ.g0(false);
                    }
                    cVar = (i53.c) pVar3.f128594a;
                    Float f14 = (Float) pVar3.f128595b;
                    o0VarQ.C(1082567640);
                    uVar = dVar4.f97521b;
                    if (uVar != null) {
                        tVar5 = uVar.f187871a;
                        trainingPlanDetailBrief7 = tVar5.getTrainingPlanDetailBrief();
                        integerInstance2 = NumberFormat.getIntegerInstance();
                        trainingPlanDetailBrief8 = tVar5.getTrainingPlanDetailBrief();
                        if (trainingPlanDetailBrief8 != null) {
                            tVar6 = tVar5;
                            if (trainingPlanDetailBrief8.getPlanComplete()) {
                                o0VarQ.C(-136446929);
                                trainingPlanDetailBrief9 = tVar6.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief9 != null || (athleteRace4 = trainingPlanDetailBrief9.getAthleteRace()) == null) {
                                    dateTimeB2 = null;
                                } else {
                                    dateTimeB2 = athleteRace4.b();
                                }
                                if (k.j(dateTimeB2, DateTime.now())) {
                                    trainingPlanDetailBrief11 = tVar6.getTrainingPlanDetailBrief();
                                    if (trainingPlanDetailBrief11 != null || (athleteRace3 = trainingPlanDetailBrief11.getAthleteRace()) == null) {
                                        dateTimeB4 = null;
                                    } else {
                                        dateTimeB4 = athleteRace3.b();
                                    }
                                    strB = c22.j0.b(dateTimeB4, "MMM d", null);
                                } else {
                                    trainingPlanDetailBrief10 = tVar6.getTrainingPlanDetailBrief();
                                    if (trainingPlanDetailBrief10 != null || (athleteRace2 = trainingPlanDetailBrief10.getAthleteRace()) == null) {
                                        dateTimeB3 = null;
                                    } else {
                                        dateTimeB3 = athleteRace2.b();
                                    }
                                    strB = c22.j0.b(dateTimeB3, "MMM d, yyyy", null);
                                }
                                if (strB == null) {
                                    strB = "";
                                }
                                String strP = y.P(R.string.completed_on_date, new Object[]{strB}, o0VarQ);
                                aVar = new lu1.a(strP, strP);
                                z16 = false;
                                o0VarQ.g0(false);
                                cVar2 = cVar;
                            }
                        } else {
                            tVar6 = tVar5;
                        }
                        if (tVar6.i()) {
                            cVar2 = cVar;
                            if (tVar6.b() != b0.STP) {
                                o0VarQ.C(-135717220);
                                String strQ = y.Q(o0VarQ, R.string.race_week);
                                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                                aVar = new lu1.a(strQ, String.format("%s, %s", Arrays.copyOf(new Object[]{y.Q(o0VarQ, R.string.lbl_progress), strQ}, 2)));
                                z16 = false;
                                o0VarQ.g0(false);
                            }
                        } else {
                            cVar2 = cVar;
                        }
                        b0VarB2 = tVar6.b();
                        b0Var2 = b0.STP;
                        if (b0VarB2 == b0Var2 || trainingPlanDetailBrief7 == null || trainingPlanDetailBrief7.o() != 0) {
                            if (tVar6.b() == b0.ATP && tVar6.b() != b0.ITP && tVar6.b() != b0.FBT_ADAPTIVE && tVar6.b() != b0Var2) {
                                o0VarQ.C(-134298102);
                                o0VarQ.g0(false);
                                vb.h.z("Invalid plan classification type.");
                                return;
                            }
                            o0VarQ.C(-134789948);
                            if (trainingPlanDetailBrief7 != null) {
                                iO = trainingPlanDetailBrief7.o();
                            } else {
                                iO = 0;
                            }
                            String str13 = integerInstance2.format(Integer.valueOf(iO));
                            if (trainingPlanDetailBrief7 != null) {
                                iT = trainingPlanDetailBrief7.t();
                            } else {
                                iT = 0;
                            }
                            String str14 = integerInstance2.format(Integer.valueOf(iT));
                            str13.getClass();
                            str14.getClass();
                            String strP2 = y.P(R.string.week_num_of_num, new Object[]{str13, str14}, o0VarQ);
                            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                            aVar = new lu1.a(strP2, String.format("%s, %s", Arrays.copyOf(new Object[]{y.Q(o0VarQ, R.string.lbl_progress), strP2}, 2)));
                            z16 = false;
                            o0VarQ.g0(false);
                        } else {
                            o0VarQ.C(-135327984);
                            String strQ2 = y.Q(o0VarQ, R.string.lbl_training_plan_not_started);
                            aVar = new lu1.a(strQ2, strQ2);
                            z16 = false;
                            o0VarQ.g0(false);
                        }
                    } else {
                        cVar2 = cVar;
                        z16 = false;
                        aVar = new lu1.a("", "");
                    }
                    o0VarQ.g0(z16);
                    o0VarQ.C(1832863292);
                    uVar2 = dVar4.f97521b;
                    uVar3 = dVar4.f97521b;
                    if (uVar3 != null) {
                        tVar3 = uVar3.f187871a;
                        integerInstance = NumberFormat.getIntegerInstance();
                        uVar11 = uVar2;
                        if (uVar11 != null) {
                            tVar4 = uVar11.f187871a;
                            if (tVar4.g()) {
                                listD = tVar4.d();
                                if (listD == null && listD.isEmpty()) {
                                    i17 = 0;
                                } else {
                                    it = listD.iterator();
                                    i17 = 0;
                                    while (it.hasNext()) {
                                        if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it.next()).r() && (i17 = i17 + 1) < 0) {
                                            x.p();
                                            throw null;
                                        }
                                    }
                                }
                                uVar12 = uVar2;
                                uVar14 = uVar12;
                                if (uVar14 != null) {
                                    list5 = uVar14.f187876f;
                                    dVar = dVar5;
                                    int i26 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                                    dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                                    dateTimeWithTimeAtStartOfDay.getClass();
                                    dateTimeA = k.A(k.b(i26, dateTimeWithTimeAtStartOfDay));
                                    if (list5.isEmpty()) {
                                        it3 = list5.iterator();
                                        i18 = 0;
                                        while (it3.hasNext()) {
                                            sVar = (s) it3.next();
                                            if (sVar.c()) {
                                                it4 = it3;
                                                if (k.e(sVar.b(), dateTimeWithTimeAtStartOfDay, dateTimeA) && (i18 = i18 + 1) < 0) {
                                                    x.p();
                                                    throw null;
                                                }
                                            } else {
                                                it4 = it3;
                                            }
                                            it3 = it4;
                                        }
                                    }
                                    size = i17 - i18;
                                    if (size < 0) {
                                    }
                                } else {
                                    dVar = dVar5;
                                }
                                i18 = 0;
                                size = i17 - i18;
                                if (size < 0) {
                                }
                            } else {
                                uVar12 = uVar2;
                                dVar = dVar5;
                                size = tVar4.d().size();
                            }
                            pi0.e eVar4 = new pi0.e((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
                            trainingPlanDetailBrief4 = tVar3.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief4 != null) {
                                dateTimeR2 = trainingPlanDetailBrief4.r();
                            } else {
                                dateTimeR2 = null;
                            }
                            b0VarB = tVar3.b();
                            b0Var = b0.STP;
                            if (b0VarB == b0Var || (trainingPlanDetailBrief6 = tVar3.getTrainingPlanDetailBrief()) == null || trainingPlanDetailBrief6.o() != 0 || dateTimeR2 == null) {
                                trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief5 == null && trainingPlanDetailBrief5.getPlanComplete()) {
                                    o0VarQ.C(912086981);
                                    if (tVar3.g()) {
                                        z38 = false;
                                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 912149136, R.string.tap_to_view_final_report, o0VarQ, false);
                                    } else {
                                        z38 = false;
                                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 912240462, R.string.badges_lbl_congratulations, o0VarQ, false);
                                    }
                                    aVar2 = new lu1.a(strJ2, strJ2);
                                    o0VarQ.g0(z38);
                                    z17 = z38;
                                } else if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ3 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ3, strQ3);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow) && tVar3.b() != b0Var) {
                                        o0VarQ.C(912661876);
                                        String strQ4 = y.Q(o0VarQ, R.string.your_race_is_tday);
                                        aVar2 = new lu1.a(strQ4, strQ4);
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str15 = integerInstance.format(1L);
                                        str15.getClass();
                                        String strP3 = y.P(R.string.single_workout_remaining, new Object[]{str15}, o0VarQ);
                                        String str16 = integerInstance.format(1L);
                                        str16.getClass();
                                        aVar2 = new lu1.a(strP3, y.P(R.string.lbl_workout_this_week, new Object[]{str16}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str17 = integerInstance.format(Integer.valueOf(size));
                                            str17.getClass();
                                            String strP4 = y.P(R.string.num_workouts_remaining, new Object[]{str17}, o0VarQ);
                                            String str18 = integerInstance.format(Integer.valueOf(size));
                                            str18.getClass();
                                            aVar5 = new lu1.a(strP4, y.P(R.string.lbl_workouts_this_week, new Object[]{str18}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                x1 x1Var2 = n.f135158a;
                                o0VarQ.g0(z17);
                            } else {
                                o0VarQ.C(911768301);
                                String strP5 = y.P(R.string.lbl_plan_begins_date, new Object[]{eVar4.a(dateTimeR2, qi0.a.YEAR_MONTH_DAY)}, o0VarQ);
                                aVar2 = new lu1.a(strP5, strP5);
                                z37 = false;
                                o0VarQ.g0(false);
                            }
                            z17 = z37;
                            x1 x1Var3 = n.f135158a;
                            o0VarQ.g0(z17);
                        } else {
                            uVar12 = uVar2;
                            dVar = dVar5;
                        }
                        size = 0;
                        pi0.e eVar5 = new pi0.e((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
                        trainingPlanDetailBrief4 = tVar3.getTrainingPlanDetailBrief();
                        if (trainingPlanDetailBrief4 != null) {
                            dateTimeR2 = trainingPlanDetailBrief4.r();
                        } else {
                            dateTimeR2 = null;
                        }
                        b0VarB = tVar3.b();
                        b0Var = b0.STP;
                        if (b0VarB == b0Var) {
                            trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief5 == null) {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ5 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ5, strQ5);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str19 = integerInstance.format(1L);
                                            str19.getClass();
                                            String strP6 = y.P(R.string.single_workout_remaining, new Object[]{str19}, o0VarQ);
                                            String str110 = integerInstance.format(1L);
                                            str110.getClass();
                                            aVar2 = new lu1.a(strP6, y.P(R.string.lbl_workout_this_week, new Object[]{str110}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str111 = integerInstance.format(Integer.valueOf(size));
                                                str111.getClass();
                                                String strP7 = y.P(R.string.num_workouts_remaining, new Object[]{str111}, o0VarQ);
                                                String str112 = integerInstance.format(Integer.valueOf(size));
                                                str112.getClass();
                                                aVar5 = new lu1.a(strP7, y.P(R.string.lbl_workouts_this_week, new Object[]{str112}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str113 = integerInstance.format(1L);
                                        str113.getClass();
                                        String strP8 = y.P(R.string.single_workout_remaining, new Object[]{str113}, o0VarQ);
                                        String str114 = integerInstance.format(1L);
                                        str114.getClass();
                                        aVar2 = new lu1.a(strP8, y.P(R.string.lbl_workout_this_week, new Object[]{str114}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str115 = integerInstance.format(Integer.valueOf(size));
                                            str115.getClass();
                                            String strP9 = y.P(R.string.num_workouts_remaining, new Object[]{str115}, o0VarQ);
                                            String str116 = integerInstance.format(Integer.valueOf(size));
                                            str116.getClass();
                                            aVar5 = new lu1.a(strP9, y.P(R.string.lbl_workouts_this_week, new Object[]{str116}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            } else {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ6 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ6, strQ6);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str117 = integerInstance.format(1L);
                                            str117.getClass();
                                            String strP10 = y.P(R.string.single_workout_remaining, new Object[]{str117}, o0VarQ);
                                            String str118 = integerInstance.format(1L);
                                            str118.getClass();
                                            aVar2 = new lu1.a(strP10, y.P(R.string.lbl_workout_this_week, new Object[]{str118}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str119 = integerInstance.format(Integer.valueOf(size));
                                                str119.getClass();
                                                String strP11 = y.P(R.string.num_workouts_remaining, new Object[]{str119}, o0VarQ);
                                                String str1110 = integerInstance.format(Integer.valueOf(size));
                                                str1110.getClass();
                                                aVar5 = new lu1.a(strP11, y.P(R.string.lbl_workouts_this_week, new Object[]{str1110}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str1111 = integerInstance.format(1L);
                                        str1111.getClass();
                                        String strP12 = y.P(R.string.single_workout_remaining, new Object[]{str1111}, o0VarQ);
                                        String str1112 = integerInstance.format(1L);
                                        str1112.getClass();
                                        aVar2 = new lu1.a(strP12, y.P(R.string.lbl_workout_this_week, new Object[]{str1112}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str1113 = integerInstance.format(Integer.valueOf(size));
                                            str1113.getClass();
                                            String strP13 = y.P(R.string.num_workouts_remaining, new Object[]{str1113}, o0VarQ);
                                            String str1114 = integerInstance.format(Integer.valueOf(size));
                                            str1114.getClass();
                                            aVar5 = new lu1.a(strP13, y.P(R.string.lbl_workouts_this_week, new Object[]{str1114}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            }
                        } else {
                            trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief5 == null) {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ7 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ7, strQ7);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str1115 = integerInstance.format(1L);
                                            str1115.getClass();
                                            String strP14 = y.P(R.string.single_workout_remaining, new Object[]{str1115}, o0VarQ);
                                            String str1116 = integerInstance.format(1L);
                                            str1116.getClass();
                                            aVar2 = new lu1.a(strP14, y.P(R.string.lbl_workout_this_week, new Object[]{str1116}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str1117 = integerInstance.format(Integer.valueOf(size));
                                                str1117.getClass();
                                                String strP15 = y.P(R.string.num_workouts_remaining, new Object[]{str1117}, o0VarQ);
                                                String str1118 = integerInstance.format(Integer.valueOf(size));
                                                str1118.getClass();
                                                aVar5 = new lu1.a(strP15, y.P(R.string.lbl_workouts_this_week, new Object[]{str1118}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str1119 = integerInstance.format(1L);
                                        str1119.getClass();
                                        String strP16 = y.P(R.string.single_workout_remaining, new Object[]{str1119}, o0VarQ);
                                        String str11110 = integerInstance.format(1L);
                                        str11110.getClass();
                                        aVar2 = new lu1.a(strP16, y.P(R.string.lbl_workout_this_week, new Object[]{str11110}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str11111 = integerInstance.format(Integer.valueOf(size));
                                            str11111.getClass();
                                            String strP17 = y.P(R.string.num_workouts_remaining, new Object[]{str11111}, o0VarQ);
                                            String str11112 = integerInstance.format(Integer.valueOf(size));
                                            str11112.getClass();
                                            aVar5 = new lu1.a(strP17, y.P(R.string.lbl_workouts_this_week, new Object[]{str11112}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            } else {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ8 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ8, strQ8);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str11113 = integerInstance.format(1L);
                                            str11113.getClass();
                                            String strP18 = y.P(R.string.single_workout_remaining, new Object[]{str11113}, o0VarQ);
                                            String str11114 = integerInstance.format(1L);
                                            str11114.getClass();
                                            aVar2 = new lu1.a(strP18, y.P(R.string.lbl_workout_this_week, new Object[]{str11114}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str11115 = integerInstance.format(Integer.valueOf(size));
                                                str11115.getClass();
                                                String strP19 = y.P(R.string.num_workouts_remaining, new Object[]{str11115}, o0VarQ);
                                                String str11116 = integerInstance.format(Integer.valueOf(size));
                                                str11116.getClass();
                                                aVar5 = new lu1.a(strP19, y.P(R.string.lbl_workouts_this_week, new Object[]{str11116}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str11117 = integerInstance.format(1L);
                                        str11117.getClass();
                                        String strP110 = y.P(R.string.single_workout_remaining, new Object[]{str11117}, o0VarQ);
                                        String str11118 = integerInstance.format(1L);
                                        str11118.getClass();
                                        aVar2 = new lu1.a(strP110, y.P(R.string.lbl_workout_this_week, new Object[]{str11118}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str11119 = integerInstance.format(Integer.valueOf(size));
                                            str11119.getClass();
                                            String strP111 = y.P(R.string.num_workouts_remaining, new Object[]{str11119}, o0VarQ);
                                            String str111110 = integerInstance.format(Integer.valueOf(size));
                                            str111110.getClass();
                                            aVar5 = new lu1.a(strP111, y.P(R.string.lbl_workouts_this_week, new Object[]{str111110}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            }
                        }
                        x1 x1Var4 = n.f135158a;
                        o0VarQ.g0(z17);
                    } else {
                        dVar = dVar5;
                        z17 = false;
                        lu1.a aVar6 = new lu1.a("", "");
                        o0VarQ.g0(false);
                        aVar2 = aVar6;
                    }
                    context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                    zB = yz1.e.b(dVar4.f97520a);
                    uVar4 = dVar4.f97521b;
                    if (uVar4 == null) {
                        planName = null;
                    } else {
                        planName = uVar4.f187871a.getPlanName();
                        if (planName == null) {
                            pVarA = uVar4.a();
                            if (pVarA != null) {
                                planName = pVarA.getName();
                            } else {
                                planName = null;
                            }
                        }
                    }
                    if (planName == null) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                    str = (String) aVar.f114983a;
                    str2 = (String) aVar.f114984b;
                    str3 = (String) aVar2.f114983a;
                    String str20 = (String) aVar2.f114984b;
                    uVar5 = dVar4.f97521b;
                    uVar6 = dVar4.f97521b;
                    if (uVar6 != null) {
                        tVar = uVar6.f187871a;
                        if (tVar.b() == b0.STP) {
                            uVar10 = uVar5;
                            if (uVar10 != null) {
                                tVar2 = uVar10.f187871a;
                            } else {
                                tVar2 = null;
                            }
                            if (tVar2 != null || d() || ((trainingPlanDetailBrief3 = tVar2.getTrainingPlanDetailBrief()) != null && trainingPlanDetailBrief3.o() == 0)) {
                                z19 = zB;
                                str4 = str2;
                                D1 = j0.f134944a;
                            } else {
                                int i27 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                                List<com.garmin.android.apps.connectmobile.workouts.data.model.d> listA2 = tVar2.a();
                                z19 = zB;
                                ArrayList arrayList4 = new ArrayList(p13.y.r(listA2, 10));
                                for (com.garmin.android.apps.connectmobile.workouts.data.model.d dVar6 : listA2) {
                                    String associatedActivityDateTimeString = dVar6.getAssociatedActivityDateTimeString();
                                    if (associatedActivityDateTimeString == null) {
                                        associatedActivityDateTimeString = dVar6.getScheduleDateString();
                                    }
                                    arrayList4.add(com.garmin.android.apps.connectmobile.workouts.data.model.d.a(dVar6, associatedActivityDateTimeString));
                                }
                                DateTime dateTimeWithTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
                                dateTimeWithTimeAtStartOfDay2.getClass();
                                List listS = c53.c0.s(gg.b.Q(new Interval(k.o(i27, dateTimeWithTimeAtStartOfDay2), k.A(k.b(i27, dateTimeWithTimeAtStartOfDay2)))));
                                ArrayList arrayList5 = new ArrayList(p13.y.r(listS, 10));
                                Iterator it5 = listS.iterator();
                                while (it5.hasNext()) {
                                    DateTime dateTime3 = (DateTime) it5.next();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj : arrayList4) {
                                        Iterator it6 = it5;
                                        String str21 = str2;
                                        if (k.f(((com.garmin.android.apps.connectmobile.workouts.data.model.d) obj).g(), dateTime3)) {
                                            arrayList6.add(obj);
                                        }
                                        it5 = it6;
                                        str2 = str21;
                                    }
                                    Iterator it7 = it5;
                                    String str22 = str2;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.d dVar7 = (com.garmin.android.apps.connectmobile.workouts.data.model.d) h0.d0(arrayList6);
                                    if (dVar7 == null) {
                                        eVar3 = new e(null, dateTime3, false, false, k.k(dateTime3), false, null, false, false, 480, null);
                                    } else {
                                        if (arrayList6.isEmpty()) {
                                            z36 = false;
                                            break;
                                        }
                                        Iterator it8 = arrayList6.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it8.next()).getAssociatedActivityId() != null) {
                                                    z36 = true;
                                                    break;
                                                }
                                            } else {
                                                z36 = false;
                                                break;
                                            }
                                        }
                                        m52.k kVarJ2 = arrayList6.size() == 1 ? dVar7.j() : null;
                                        DateTime dateTimeG3 = dVar7.g();
                                        DateTime dateTime4 = dateTimeG3 == null ? dateTime3 : dateTimeG3;
                                        DateTime dateTimeG4 = dVar7.g();
                                        if (dateTimeG4 != null) {
                                            i16 = 1;
                                            boolean z39 = k.k(dateTimeG4);
                                            if (arrayList6.size() > i16) {
                                                numValueOf2 = Integer.valueOf(arrayList6.size());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            eVar3 = new e(kVarJ2, dateTime4, z36, false, z39, false, numValueOf2, false, false, 416, null);
                                        } else {
                                            i16 = 1;
                                        }
                                        if (arrayList6.size() > i16) {
                                            numValueOf2 = Integer.valueOf(arrayList6.size());
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        eVar3 = new e(kVarJ2, dateTime4, z36, false, z39, false, numValueOf2, false, false, 416, null);
                                    }
                                    arrayList5.add(eVar3);
                                    it5 = it7;
                                    str2 = str22;
                                }
                                str4 = str2;
                                D1 = arrayList5;
                            }
                        } else {
                            z19 = zB;
                            str4 = str2;
                            if (d()) {
                                D1 = j0.f134944a;
                            } else {
                                int i28 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                                uVar7 = uVar5;
                                if (uVar7 != null) {
                                    list = uVar7.f187876f;
                                } else {
                                    list = j0.f134944a;
                                }
                                listA = tVar.a();
                                DateTime dateTimeWithTimeAtStartOfDay3 = DateTime.now().withTimeAtStartOfDay();
                                dateTimeWithTimeAtStartOfDay3.getClass();
                                DateTime dateTimeO = k.o(i28, dateTimeWithTimeAtStartOfDay3);
                                DateTime dateTimeA2 = k.A(k.b(i28, dateTimeWithTimeAtStartOfDay3));
                                trainingPlanDetailBrief = tVar.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief != null || (dateTimeR = trainingPlanDetailBrief.r()) == null) {
                                    localDate = null;
                                } else {
                                    localDate = dateTimeR.toLocalDate();
                                }
                                trainingPlanDetailBrief2 = tVar.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief2 != null || (athleteRace = trainingPlanDetailBrief2.getAthleteRace()) == null || (dateTimeB = athleteRace.b()) == null) {
                                    localDate2 = null;
                                } else {
                                    localDate2 = dateTimeB.toLocalDate();
                                }
                                Interval interval = new Interval(dateTimeO, dateTimeA2);
                                D1 = h0.d1(j0.f134944a);
                                aVar3 = new f0.a(gg.b.Q(interval));
                                while (aVar3.hasNext()) {
                                    dateTime = (DateTime) aVar3.next();
                                    if (tVar.g()) {
                                        aVar4 = aVar3;
                                        uVar9 = uVar5;
                                        if (uVar9 != null) {
                                            List<fg0.e> list6 = uVar9.f187872b;
                                            arrayList2 = new ArrayList();
                                            for (Object obj2 : list6) {
                                                String str23 = str;
                                                String str24 = str3;
                                                String str25 = str12;
                                                if (k.g(((fg0.e) obj2).getDate(), dateTime.toLocalDate())) {
                                                    arrayList2.add(obj2);
                                                }
                                                str = str23;
                                                str12 = str25;
                                                str3 = str24;
                                            }
                                            str8 = str;
                                            str9 = str3;
                                            str10 = str12;
                                            list2 = arrayList2;
                                        } else {
                                            str8 = str;
                                            str9 = str3;
                                            str10 = str12;
                                            list2 = j0.f134944a;
                                        }
                                    } else {
                                        aVar4 = aVar3;
                                        str8 = str;
                                        str9 = str3;
                                        str10 = str12;
                                        list2 = j0.f134944a;
                                    }
                                    arrayList = new ArrayList();
                                    list3 = list2;
                                    for (Object obj3 : listA) {
                                        List list7 = list3;
                                        if (k.f(((com.garmin.android.apps.connectmobile.workouts.data.model.d) obj3).g(), dateTime)) {
                                            arrayList.add(obj3);
                                        }
                                        list3 = list7;
                                    }
                                    list4 = list3;
                                    dVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.d) h0.d0(arrayList);
                                    if (dVar2 == null) {
                                        if (tVar.g() || localDate == null || localDate2 == null) {
                                            z34 = false;
                                        } else {
                                            Iterator it9 = list.iterator();
                                            do {
                                                if (!it9.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                } else {
                                                    next2 = it9.next();
                                                    uVar8 = uVar5;
                                                }
                                            } while (!c((s) next2, uVar8 != null ? uVar8.b() : null, dateTime, localDate, localDate2));
                                            if (next2 != null) {
                                                z34 = true;
                                            } else {
                                                z34 = false;
                                            }
                                        }
                                        boolean zB2 = b(dateTime, tVar, list, localDate);
                                        if (!z34 || zB2) {
                                            z35 = true;
                                        } else {
                                            z35 = false;
                                        }
                                        eVar2 = new e(null, dateTime, z35, !list4.isEmpty(), k.k(dateTime), false, null, false, false, 416, null);
                                    } else {
                                        if ((tVar.g() && dVar2.s()) || (tVar.g() && dVar2.r())) {
                                            eVar2 = new e(null, dateTime, b(dateTime, tVar, list, localDate), !list4.isEmpty() || tVar.h(dateTime), k.k(dateTime), false, null, false, false, 416, null);
                                        } else {
                                            if (tVar.g() || localDate == null || localDate2 == null) {
                                                dVar3 = dVar2;
                                                arrayList = arrayList;
                                                if (dVar3.getAssociatedActivityId() != null) {
                                                    z27 = true;
                                                } else {
                                                    z27 = false;
                                                }
                                            } else {
                                                Iterator it10 = list.iterator();
                                                while (true) {
                                                    if (!it10.hasNext()) {
                                                        dVar3 = dVar2;
                                                        arrayList = arrayList;
                                                        next = null;
                                                        break;
                                                    } else {
                                                        next = it10.next();
                                                        dVar3 = dVar2;
                                                        ww1.u uVar20 = uVar5;
                                                        if (c((s) next, uVar20 != null ? uVar20.b() : null, dateTime, localDate, localDate2)) {
                                                            break;
                                                        }
                                                        dVar2 = dVar3;
                                                        arrayList = arrayList;
                                                    }
                                                }
                                                if (next != null) {
                                                    z27 = true;
                                                } else {
                                                    z27 = false;
                                                }
                                            }
                                            boolean zB3 = b(dateTime, tVar, list, localDate);
                                            if (arrayList.size() == 1 || !list4.isEmpty()) {
                                                kVarJ = null;
                                            } else {
                                                kVarJ = dVar3.j();
                                            }
                                            dateTimeG = dVar3.g();
                                            if (dateTimeG == null) {
                                                dateTime2 = dateTime;
                                            } else {
                                                dateTime2 = dateTimeG;
                                            }
                                            if (!z27 || zB3) {
                                                z28 = true;
                                            } else {
                                                z28 = false;
                                            }
                                            if (list4.isEmpty() || tVar.h(dateTime)) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            dateTimeG2 = dVar3.g();
                                            if (dateTimeG2 != null) {
                                                i15 = 1;
                                                boolean z44 = k.k(dateTimeG2);
                                                if (list4.isEmpty() || arrayList.size() <= i15) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(arrayList.size());
                                                }
                                                eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                            } else {
                                                i15 = 1;
                                            }
                                            if (list4.isEmpty()) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                            eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                        }
                                        D1.add(eVar);
                                        aVar3 = aVar4;
                                        str = str8;
                                        str12 = str10;
                                        str3 = str9;
                                    }
                                    eVar = eVar2;
                                    D1.add(eVar);
                                    aVar3 = aVar4;
                                    str = str8;
                                    str12 = str10;
                                    str3 = str9;
                                }
                            }
                            str5 = str;
                            str6 = str3;
                            str7 = str12;
                            z24 = true;
                            r14 = D1;
                        }
                        str5 = str;
                        str6 = str3;
                        str7 = str12;
                        z24 = true;
                        r14 = D1;
                    } else {
                        z19 = zB;
                        str4 = str2;
                        z18 = z18;
                        str5 = str;
                        str6 = str3;
                        str7 = str12;
                        z24 = true;
                        r14 = j0.f134944a;
                    }
                    ?? r15 = r14;
                    boolean zR = o0VarQ.r(tVar7) | o0VarQ.r(context) | o0VarQ.h(z14);
                    if ((i24 & 896) != 256 || ((i24 & 512) != 0 && o0VarQ.r(this))) {
                        z25 = z24;
                    } else {
                        z25 = false;
                    }
                    z26 = zR | z25;
                    objQ = o0VarQ.q();
                    if (z26) {
                        an0.d dVar8 = new an0.d(tVar7, context, z14, this, 5);
                        o0VarQ.K(dVar8);
                        objQ = dVar8;
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            an0.d dVar9 = new an0.d(tVar7, context, z14, this, 5);
                            o0VarQ.K(dVar9);
                            objQ = dVar9;
                        }
                    }
                    c.c(rVar, z19, z18, dVar, str11, str7, str5, str4, str6, str20, cVar2, 0L, f14, r15, z14, (e23.a) objQ, o0VarQ, i24 & 14);
                    o0Var = o0VarQ;
                    o0Var.g0(false);
                } else {
                    z15 = false;
                    pVar2 = new p(i53.a.j(j0.f134944a), null);
                }
                o0VarQ.g0(z15);
                pVar3 = pVar2;
                cVar = (i53.c) pVar3.f128594a;
                Float f15 = (Float) pVar3.f128595b;
                o0VarQ.C(1082567640);
                uVar = dVar4.f97521b;
                if (uVar != null) {
                    tVar5 = uVar.f187871a;
                    trainingPlanDetailBrief7 = tVar5.getTrainingPlanDetailBrief();
                    integerInstance2 = NumberFormat.getIntegerInstance();
                    trainingPlanDetailBrief8 = tVar5.getTrainingPlanDetailBrief();
                    if (trainingPlanDetailBrief8 != null) {
                        tVar6 = tVar5;
                        if (trainingPlanDetailBrief8.getPlanComplete()) {
                            o0VarQ.C(-136446929);
                            trainingPlanDetailBrief9 = tVar6.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief9 != null) {
                                dateTimeB2 = null;
                            } else {
                                dateTimeB2 = null;
                            }
                            if (k.j(dateTimeB2, DateTime.now())) {
                                trainingPlanDetailBrief11 = tVar6.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief11 != null) {
                                    dateTimeB4 = null;
                                } else {
                                    dateTimeB4 = null;
                                }
                                strB = c22.j0.b(dateTimeB4, "MMM d", null);
                            } else {
                                trainingPlanDetailBrief10 = tVar6.getTrainingPlanDetailBrief();
                                if (trainingPlanDetailBrief10 != null) {
                                    dateTimeB3 = null;
                                } else {
                                    dateTimeB3 = null;
                                }
                                strB = c22.j0.b(dateTimeB3, "MMM d, yyyy", null);
                            }
                            if (strB == null) {
                                strB = "";
                            }
                            String strP20 = y.P(R.string.completed_on_date, new Object[]{strB}, o0VarQ);
                            aVar = new lu1.a(strP20, strP20);
                            z16 = false;
                            o0VarQ.g0(false);
                            cVar2 = cVar;
                        }
                    } else {
                        tVar6 = tVar5;
                    }
                    if (tVar6.i()) {
                        cVar2 = cVar;
                        if (tVar6.b() != b0.STP) {
                            o0VarQ.C(-135717220);
                            String strQ9 = y.Q(o0VarQ, R.string.race_week);
                            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                            aVar = new lu1.a(strQ9, String.format("%s, %s", Arrays.copyOf(new Object[]{y.Q(o0VarQ, R.string.lbl_progress), strQ9}, 2)));
                            z16 = false;
                            o0VarQ.g0(false);
                        }
                    } else {
                        cVar2 = cVar;
                    }
                    b0VarB2 = tVar6.b();
                    b0Var2 = b0.STP;
                    if (b0VarB2 == b0Var2) {
                        if (tVar6.b() == b0.ATP) {
                        }
                        o0VarQ.C(-134789948);
                        if (trainingPlanDetailBrief7 != null) {
                            iO = trainingPlanDetailBrief7.o();
                        } else {
                            iO = 0;
                        }
                        String str120 = integerInstance2.format(Integer.valueOf(iO));
                        if (trainingPlanDetailBrief7 != null) {
                            iT = trainingPlanDetailBrief7.t();
                        } else {
                            iT = 0;
                        }
                        String str121 = integerInstance2.format(Integer.valueOf(iT));
                        str120.getClass();
                        str121.getClass();
                        String strP21 = y.P(R.string.week_num_of_num, new Object[]{str120, str121}, o0VarQ);
                        p005kotlin.jvm.internal.x0 x0Var4 = p005kotlin.jvm.internal.x0.f105818a;
                        aVar = new lu1.a(strP21, String.format("%s, %s", Arrays.copyOf(new Object[]{y.Q(o0VarQ, R.string.lbl_progress), strP21}, 2)));
                        z16 = false;
                        o0VarQ.g0(false);
                    } else {
                        if (tVar6.b() == b0.ATP) {
                        }
                        o0VarQ.C(-134789948);
                        if (trainingPlanDetailBrief7 != null) {
                            iO = trainingPlanDetailBrief7.o();
                        } else {
                            iO = 0;
                        }
                        String str122 = integerInstance2.format(Integer.valueOf(iO));
                        if (trainingPlanDetailBrief7 != null) {
                            iT = trainingPlanDetailBrief7.t();
                        } else {
                            iT = 0;
                        }
                        String str123 = integerInstance2.format(Integer.valueOf(iT));
                        str122.getClass();
                        str123.getClass();
                        String strP22 = y.P(R.string.week_num_of_num, new Object[]{str122, str123}, o0VarQ);
                        p005kotlin.jvm.internal.x0 x0Var5 = p005kotlin.jvm.internal.x0.f105818a;
                        aVar = new lu1.a(strP22, String.format("%s, %s", Arrays.copyOf(new Object[]{y.Q(o0VarQ, R.string.lbl_progress), strP22}, 2)));
                        z16 = false;
                        o0VarQ.g0(false);
                    }
                } else {
                    cVar2 = cVar;
                    z16 = false;
                    aVar = new lu1.a("", "");
                }
                o0VarQ.g0(z16);
                o0VarQ.C(1832863292);
                uVar2 = dVar4.f97521b;
                uVar3 = dVar4.f97521b;
                if (uVar3 != null) {
                    tVar3 = uVar3.f187871a;
                    integerInstance = NumberFormat.getIntegerInstance();
                    uVar11 = uVar2;
                    if (uVar11 != null) {
                        tVar4 = uVar11.f187871a;
                        if (tVar4.g()) {
                            listD = tVar4.d();
                            if (listD == null) {
                                it = listD.iterator();
                                i17 = 0;
                                while (it.hasNext()) {
                                    if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it.next()).r()) {
                                    }
                                }
                            } else {
                                it = listD.iterator();
                                i17 = 0;
                                while (it.hasNext()) {
                                    if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it.next()).r()) {
                                    }
                                }
                            }
                            uVar12 = uVar2;
                            uVar14 = uVar12;
                            if (uVar14 != null) {
                                list5 = uVar14.f187876f;
                                dVar = dVar5;
                                int i29 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                                dateTimeWithTimeAtStartOfDay.getClass();
                                dateTimeA = k.A(k.b(i29, dateTimeWithTimeAtStartOfDay));
                                if (list5.isEmpty()) {
                                    it3 = list5.iterator();
                                    i18 = 0;
                                    while (it3.hasNext()) {
                                        sVar = (s) it3.next();
                                        if (sVar.c()) {
                                            it4 = it3;
                                            if (k.e(sVar.b(), dateTimeWithTimeAtStartOfDay, dateTimeA)) {
                                                continue;
                                            }
                                        } else {
                                            it4 = it3;
                                        }
                                        it3 = it4;
                                    }
                                }
                                size = i17 - i18;
                                if (size < 0) {
                                }
                            } else {
                                dVar = dVar5;
                            }
                            i18 = 0;
                            size = i17 - i18;
                            if (size < 0) {
                            }
                        } else {
                            uVar12 = uVar2;
                            dVar = dVar5;
                            size = tVar4.d().size();
                        }
                        pi0.e eVar6 = new pi0.e((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
                        trainingPlanDetailBrief4 = tVar3.getTrainingPlanDetailBrief();
                        if (trainingPlanDetailBrief4 != null) {
                            dateTimeR2 = trainingPlanDetailBrief4.r();
                        } else {
                            dateTimeR2 = null;
                        }
                        b0VarB = tVar3.b();
                        b0Var = b0.STP;
                        if (b0VarB == b0Var) {
                            trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief5 == null) {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ10 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ10, strQ10);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str111111 = integerInstance.format(1L);
                                            str111111.getClass();
                                            String strP112 = y.P(R.string.single_workout_remaining, new Object[]{str111111}, o0VarQ);
                                            String str111112 = integerInstance.format(1L);
                                            str111112.getClass();
                                            aVar2 = new lu1.a(strP112, y.P(R.string.lbl_workout_this_week, new Object[]{str111112}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str111113 = integerInstance.format(Integer.valueOf(size));
                                                str111113.getClass();
                                                String strP113 = y.P(R.string.num_workouts_remaining, new Object[]{str111113}, o0VarQ);
                                                String str111114 = integerInstance.format(Integer.valueOf(size));
                                                str111114.getClass();
                                                aVar5 = new lu1.a(strP113, y.P(R.string.lbl_workouts_this_week, new Object[]{str111114}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str111115 = integerInstance.format(1L);
                                        str111115.getClass();
                                        String strP114 = y.P(R.string.single_workout_remaining, new Object[]{str111115}, o0VarQ);
                                        String str111116 = integerInstance.format(1L);
                                        str111116.getClass();
                                        aVar2 = new lu1.a(strP114, y.P(R.string.lbl_workout_this_week, new Object[]{str111116}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str111117 = integerInstance.format(Integer.valueOf(size));
                                            str111117.getClass();
                                            String strP115 = y.P(R.string.num_workouts_remaining, new Object[]{str111117}, o0VarQ);
                                            String str111118 = integerInstance.format(Integer.valueOf(size));
                                            str111118.getClass();
                                            aVar5 = new lu1.a(strP115, y.P(R.string.lbl_workouts_this_week, new Object[]{str111118}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            } else {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ11 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ11, strQ11);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str111119 = integerInstance.format(1L);
                                            str111119.getClass();
                                            String strP116 = y.P(R.string.single_workout_remaining, new Object[]{str111119}, o0VarQ);
                                            String str1111110 = integerInstance.format(1L);
                                            str1111110.getClass();
                                            aVar2 = new lu1.a(strP116, y.P(R.string.lbl_workout_this_week, new Object[]{str1111110}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str1111111 = integerInstance.format(Integer.valueOf(size));
                                                str1111111.getClass();
                                                String strP117 = y.P(R.string.num_workouts_remaining, new Object[]{str1111111}, o0VarQ);
                                                String str1111112 = integerInstance.format(Integer.valueOf(size));
                                                str1111112.getClass();
                                                aVar5 = new lu1.a(strP117, y.P(R.string.lbl_workouts_this_week, new Object[]{str1111112}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str1111113 = integerInstance.format(1L);
                                        str1111113.getClass();
                                        String strP118 = y.P(R.string.single_workout_remaining, new Object[]{str1111113}, o0VarQ);
                                        String str1111114 = integerInstance.format(1L);
                                        str1111114.getClass();
                                        aVar2 = new lu1.a(strP118, y.P(R.string.lbl_workout_this_week, new Object[]{str1111114}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str1111115 = integerInstance.format(Integer.valueOf(size));
                                            str1111115.getClass();
                                            String strP119 = y.P(R.string.num_workouts_remaining, new Object[]{str1111115}, o0VarQ);
                                            String str1111116 = integerInstance.format(Integer.valueOf(size));
                                            str1111116.getClass();
                                            aVar5 = new lu1.a(strP119, y.P(R.string.lbl_workouts_this_week, new Object[]{str1111116}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            }
                        } else {
                            trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief5 == null) {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ12 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ12, strQ12);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str1111117 = integerInstance.format(1L);
                                            str1111117.getClass();
                                            String strP1110 = y.P(R.string.single_workout_remaining, new Object[]{str1111117}, o0VarQ);
                                            String str1111118 = integerInstance.format(1L);
                                            str1111118.getClass();
                                            aVar2 = new lu1.a(strP1110, y.P(R.string.lbl_workout_this_week, new Object[]{str1111118}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str1111119 = integerInstance.format(Integer.valueOf(size));
                                                str1111119.getClass();
                                                String strP1111 = y.P(R.string.num_workouts_remaining, new Object[]{str1111119}, o0VarQ);
                                                String str11111110 = integerInstance.format(Integer.valueOf(size));
                                                str11111110.getClass();
                                                aVar5 = new lu1.a(strP1111, y.P(R.string.lbl_workouts_this_week, new Object[]{str11111110}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str11111111 = integerInstance.format(1L);
                                        str11111111.getClass();
                                        String strP1112 = y.P(R.string.single_workout_remaining, new Object[]{str11111111}, o0VarQ);
                                        String str11111112 = integerInstance.format(1L);
                                        str11111112.getClass();
                                        aVar2 = new lu1.a(strP1112, y.P(R.string.lbl_workout_this_week, new Object[]{str11111112}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str11111113 = integerInstance.format(Integer.valueOf(size));
                                            str11111113.getClass();
                                            String strP1113 = y.P(R.string.num_workouts_remaining, new Object[]{str11111113}, o0VarQ);
                                            String str11111114 = integerInstance.format(Integer.valueOf(size));
                                            str11111114.getClass();
                                            aVar5 = new lu1.a(strP1113, y.P(R.string.lbl_workouts_this_week, new Object[]{str11111114}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            } else {
                                if (d()) {
                                    o0VarQ.C(912419177);
                                    String strQ13 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                    aVar2 = new lu1.a(strQ13, strQ13);
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    dateTimeNow = DateTime.now();
                                    dateTimeNow.getClass();
                                    if (!tVar3.h(dateTimeNow)) {
                                        if (size == 1) {
                                            o0VarQ.C(912849085);
                                            String str11111115 = integerInstance.format(1L);
                                            str11111115.getClass();
                                            String strP1114 = y.P(R.string.single_workout_remaining, new Object[]{str11111115}, o0VarQ);
                                            String str11111116 = integerInstance.format(1L);
                                            str11111116.getClass();
                                            aVar2 = new lu1.a(strP1114, y.P(R.string.lbl_workout_this_week, new Object[]{str11111116}, o0VarQ));
                                            z37 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            if (size > 1) {
                                                o0VarQ.C(913181622);
                                                String str11111117 = integerInstance.format(Integer.valueOf(size));
                                                str11111117.getClass();
                                                String strP1115 = y.P(R.string.num_workouts_remaining, new Object[]{str11111117}, o0VarQ);
                                                String str11111118 = integerInstance.format(Integer.valueOf(size));
                                                str11111118.getClass();
                                                aVar5 = new lu1.a(strP1115, y.P(R.string.lbl_workouts_this_week, new Object[]{str11111118}, o0VarQ));
                                                o0VarQ.g0(false);
                                                z17 = false;
                                            } else {
                                                uVar13 = uVar12;
                                                if (uVar13 != null) {
                                                    boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                    o0VarQ.C(913548662);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                    z17 = false;
                                                    o0VarQ.g0(false);
                                                } else {
                                                    z17 = false;
                                                    o0VarQ.C(913792694);
                                                    aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                    o0VarQ.g0(false);
                                                }
                                            }
                                            aVar2 = aVar5;
                                        }
                                    } else if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str11111119 = integerInstance.format(1L);
                                        str11111119.getClass();
                                        String strP1116 = y.P(R.string.single_workout_remaining, new Object[]{str11111119}, o0VarQ);
                                        String str111111110 = integerInstance.format(1L);
                                        str111111110.getClass();
                                        aVar2 = new lu1.a(strP1116, y.P(R.string.lbl_workout_this_week, new Object[]{str111111110}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str111111111 = integerInstance.format(Integer.valueOf(size));
                                            str111111111.getClass();
                                            String strP1117 = y.P(R.string.num_workouts_remaining, new Object[]{str111111111}, o0VarQ);
                                            String str111111112 = integerInstance.format(Integer.valueOf(size));
                                            str111111112.getClass();
                                            aVar5 = new lu1.a(strP1117, y.P(R.string.lbl_workouts_this_week, new Object[]{str111111112}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                }
                                z17 = z37;
                            }
                        }
                        x1 x1Var5 = n.f135158a;
                        o0VarQ.g0(z17);
                    } else {
                        uVar12 = uVar2;
                        dVar = dVar5;
                    }
                    size = 0;
                    pi0.e eVar7 = new pi0.e((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
                    trainingPlanDetailBrief4 = tVar3.getTrainingPlanDetailBrief();
                    if (trainingPlanDetailBrief4 != null) {
                        dateTimeR2 = trainingPlanDetailBrief4.r();
                    } else {
                        dateTimeR2 = null;
                    }
                    b0VarB = tVar3.b();
                    b0Var = b0.STP;
                    if (b0VarB == b0Var) {
                        trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                        if (trainingPlanDetailBrief5 == null) {
                            if (d()) {
                                o0VarQ.C(912419177);
                                String strQ14 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                aVar2 = new lu1.a(strQ14, strQ14);
                                z37 = false;
                                o0VarQ.g0(false);
                            } else {
                                dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                if (!tVar3.h(dateTimeNow)) {
                                    if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str111111113 = integerInstance.format(1L);
                                        str111111113.getClass();
                                        String strP1118 = y.P(R.string.single_workout_remaining, new Object[]{str111111113}, o0VarQ);
                                        String str111111114 = integerInstance.format(1L);
                                        str111111114.getClass();
                                        aVar2 = new lu1.a(strP1118, y.P(R.string.lbl_workout_this_week, new Object[]{str111111114}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str111111115 = integerInstance.format(Integer.valueOf(size));
                                            str111111115.getClass();
                                            String strP1119 = y.P(R.string.num_workouts_remaining, new Object[]{str111111115}, o0VarQ);
                                            String str111111116 = integerInstance.format(Integer.valueOf(size));
                                            str111111116.getClass();
                                            aVar5 = new lu1.a(strP1119, y.P(R.string.lbl_workouts_this_week, new Object[]{str111111116}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                } else if (size == 1) {
                                    o0VarQ.C(912849085);
                                    String str111111117 = integerInstance.format(1L);
                                    str111111117.getClass();
                                    String strP11110 = y.P(R.string.single_workout_remaining, new Object[]{str111111117}, o0VarQ);
                                    String str111111118 = integerInstance.format(1L);
                                    str111111118.getClass();
                                    aVar2 = new lu1.a(strP11110, y.P(R.string.lbl_workout_this_week, new Object[]{str111111118}, o0VarQ));
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    if (size > 1) {
                                        o0VarQ.C(913181622);
                                        String str111111119 = integerInstance.format(Integer.valueOf(size));
                                        str111111119.getClass();
                                        String strP11111 = y.P(R.string.num_workouts_remaining, new Object[]{str111111119}, o0VarQ);
                                        String str1111111110 = integerInstance.format(Integer.valueOf(size));
                                        str1111111110.getClass();
                                        aVar5 = new lu1.a(strP11111, y.P(R.string.lbl_workouts_this_week, new Object[]{str1111111110}, o0VarQ));
                                        o0VarQ.g0(false);
                                        z17 = false;
                                    } else {
                                        uVar13 = uVar12;
                                        if (uVar13 != null) {
                                            boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                            o0VarQ.C(913548662);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                            z17 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            z17 = false;
                                            o0VarQ.C(913792694);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                            o0VarQ.g0(false);
                                        }
                                    }
                                    aVar2 = aVar5;
                                }
                            }
                            z17 = z37;
                        } else {
                            if (d()) {
                                o0VarQ.C(912419177);
                                String strQ15 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                aVar2 = new lu1.a(strQ15, strQ15);
                                z37 = false;
                                o0VarQ.g0(false);
                            } else {
                                dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                if (!tVar3.h(dateTimeNow)) {
                                    if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str1111111111 = integerInstance.format(1L);
                                        str1111111111.getClass();
                                        String strP11112 = y.P(R.string.single_workout_remaining, new Object[]{str1111111111}, o0VarQ);
                                        String str1111111112 = integerInstance.format(1L);
                                        str1111111112.getClass();
                                        aVar2 = new lu1.a(strP11112, y.P(R.string.lbl_workout_this_week, new Object[]{str1111111112}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str1111111113 = integerInstance.format(Integer.valueOf(size));
                                            str1111111113.getClass();
                                            String strP11113 = y.P(R.string.num_workouts_remaining, new Object[]{str1111111113}, o0VarQ);
                                            String str1111111114 = integerInstance.format(Integer.valueOf(size));
                                            str1111111114.getClass();
                                            aVar5 = new lu1.a(strP11113, y.P(R.string.lbl_workouts_this_week, new Object[]{str1111111114}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                } else if (size == 1) {
                                    o0VarQ.C(912849085);
                                    String str1111111115 = integerInstance.format(1L);
                                    str1111111115.getClass();
                                    String strP11114 = y.P(R.string.single_workout_remaining, new Object[]{str1111111115}, o0VarQ);
                                    String str1111111116 = integerInstance.format(1L);
                                    str1111111116.getClass();
                                    aVar2 = new lu1.a(strP11114, y.P(R.string.lbl_workout_this_week, new Object[]{str1111111116}, o0VarQ));
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    if (size > 1) {
                                        o0VarQ.C(913181622);
                                        String str1111111117 = integerInstance.format(Integer.valueOf(size));
                                        str1111111117.getClass();
                                        String strP11115 = y.P(R.string.num_workouts_remaining, new Object[]{str1111111117}, o0VarQ);
                                        String str1111111118 = integerInstance.format(Integer.valueOf(size));
                                        str1111111118.getClass();
                                        aVar5 = new lu1.a(strP11115, y.P(R.string.lbl_workouts_this_week, new Object[]{str1111111118}, o0VarQ));
                                        o0VarQ.g0(false);
                                        z17 = false;
                                    } else {
                                        uVar13 = uVar12;
                                        if (uVar13 != null) {
                                            boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                            o0VarQ.C(913548662);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                            z17 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            z17 = false;
                                            o0VarQ.C(913792694);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                            o0VarQ.g0(false);
                                        }
                                    }
                                    aVar2 = aVar5;
                                }
                            }
                            z17 = z37;
                        }
                    } else {
                        trainingPlanDetailBrief5 = tVar3.getTrainingPlanDetailBrief();
                        if (trainingPlanDetailBrief5 == null) {
                            if (d()) {
                                o0VarQ.C(912419177);
                                String strQ16 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                aVar2 = new lu1.a(strQ16, strQ16);
                                z37 = false;
                                o0VarQ.g0(false);
                            } else {
                                dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                if (!tVar3.h(dateTimeNow)) {
                                    if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str1111111119 = integerInstance.format(1L);
                                        str1111111119.getClass();
                                        String strP11116 = y.P(R.string.single_workout_remaining, new Object[]{str1111111119}, o0VarQ);
                                        String str11111111110 = integerInstance.format(1L);
                                        str11111111110.getClass();
                                        aVar2 = new lu1.a(strP11116, y.P(R.string.lbl_workout_this_week, new Object[]{str11111111110}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str11111111111 = integerInstance.format(Integer.valueOf(size));
                                            str11111111111.getClass();
                                            String strP11117 = y.P(R.string.num_workouts_remaining, new Object[]{str11111111111}, o0VarQ);
                                            String str11111111112 = integerInstance.format(Integer.valueOf(size));
                                            str11111111112.getClass();
                                            aVar5 = new lu1.a(strP11117, y.P(R.string.lbl_workouts_this_week, new Object[]{str11111111112}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                } else if (size == 1) {
                                    o0VarQ.C(912849085);
                                    String str11111111113 = integerInstance.format(1L);
                                    str11111111113.getClass();
                                    String strP11118 = y.P(R.string.single_workout_remaining, new Object[]{str11111111113}, o0VarQ);
                                    String str11111111114 = integerInstance.format(1L);
                                    str11111111114.getClass();
                                    aVar2 = new lu1.a(strP11118, y.P(R.string.lbl_workout_this_week, new Object[]{str11111111114}, o0VarQ));
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    if (size > 1) {
                                        o0VarQ.C(913181622);
                                        String str11111111115 = integerInstance.format(Integer.valueOf(size));
                                        str11111111115.getClass();
                                        String strP11119 = y.P(R.string.num_workouts_remaining, new Object[]{str11111111115}, o0VarQ);
                                        String str11111111116 = integerInstance.format(Integer.valueOf(size));
                                        str11111111116.getClass();
                                        aVar5 = new lu1.a(strP11119, y.P(R.string.lbl_workouts_this_week, new Object[]{str11111111116}, o0VarQ));
                                        o0VarQ.g0(false);
                                        z17 = false;
                                    } else {
                                        uVar13 = uVar12;
                                        if (uVar13 != null) {
                                            boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                            o0VarQ.C(913548662);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                            z17 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            z17 = false;
                                            o0VarQ.C(913792694);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                            o0VarQ.g0(false);
                                        }
                                    }
                                    aVar2 = aVar5;
                                }
                            }
                            z17 = z37;
                        } else {
                            if (d()) {
                                o0VarQ.C(912419177);
                                String strQ17 = y.Q(o0VarQ, R.string.plan_paused_lower);
                                aVar2 = new lu1.a(strQ17, strQ17);
                                z37 = false;
                                o0VarQ.g0(false);
                            } else {
                                dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                if (!tVar3.h(dateTimeNow)) {
                                    if (size == 1) {
                                        o0VarQ.C(912849085);
                                        String str11111111117 = integerInstance.format(1L);
                                        str11111111117.getClass();
                                        String strP111110 = y.P(R.string.single_workout_remaining, new Object[]{str11111111117}, o0VarQ);
                                        String str11111111118 = integerInstance.format(1L);
                                        str11111111118.getClass();
                                        aVar2 = new lu1.a(strP111110, y.P(R.string.lbl_workout_this_week, new Object[]{str11111111118}, o0VarQ));
                                        z37 = false;
                                        o0VarQ.g0(false);
                                    } else {
                                        if (size > 1) {
                                            o0VarQ.C(913181622);
                                            String str11111111119 = integerInstance.format(Integer.valueOf(size));
                                            str11111111119.getClass();
                                            String strP111111 = y.P(R.string.num_workouts_remaining, new Object[]{str11111111119}, o0VarQ);
                                            String str111111111110 = integerInstance.format(Integer.valueOf(size));
                                            str111111111110.getClass();
                                            aVar5 = new lu1.a(strP111111, y.P(R.string.lbl_workouts_this_week, new Object[]{str111111111110}, o0VarQ));
                                            o0VarQ.g0(false);
                                            z17 = false;
                                        } else {
                                            uVar13 = uVar12;
                                            if (uVar13 != null) {
                                                boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                                o0VarQ.C(913548662);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                                z17 = false;
                                                o0VarQ.g0(false);
                                            } else {
                                                z17 = false;
                                                o0VarQ.C(913792694);
                                                aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                                o0VarQ.g0(false);
                                            }
                                        }
                                        aVar2 = aVar5;
                                    }
                                } else if (size == 1) {
                                    o0VarQ.C(912849085);
                                    String str111111111111 = integerInstance.format(1L);
                                    str111111111111.getClass();
                                    String strP111112 = y.P(R.string.single_workout_remaining, new Object[]{str111111111111}, o0VarQ);
                                    String str111111111112 = integerInstance.format(1L);
                                    str111111111112.getClass();
                                    aVar2 = new lu1.a(strP111112, y.P(R.string.lbl_workout_this_week, new Object[]{str111111111112}, o0VarQ));
                                    z37 = false;
                                    o0VarQ.g0(false);
                                } else {
                                    if (size > 1) {
                                        o0VarQ.C(913181622);
                                        String str111111111113 = integerInstance.format(Integer.valueOf(size));
                                        str111111111113.getClass();
                                        String strP111113 = y.P(R.string.num_workouts_remaining, new Object[]{str111111111113}, o0VarQ);
                                        String str111111111114 = integerInstance.format(Integer.valueOf(size));
                                        str111111111114.getClass();
                                        aVar5 = new lu1.a(strP111113, y.P(R.string.lbl_workouts_this_week, new Object[]{str111111111114}, o0VarQ));
                                        o0VarQ.g0(false);
                                        z17 = false;
                                    } else {
                                        uVar13 = uVar12;
                                        if (uVar13 != null) {
                                            boolValueOf = Boolean.valueOf(uVar13.f187874d);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                            o0VarQ.C(913548662);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.no_workouts_remaining), y.Q(o0VarQ, R.string.no_workouts_remaining));
                                            z17 = false;
                                            o0VarQ.g0(false);
                                        } else {
                                            z17 = false;
                                            o0VarQ.C(913792694);
                                            aVar5 = new lu1.a(y.Q(o0VarQ, R.string.all_workouts_complete), y.Q(o0VarQ, R.string.all_workouts_complete));
                                            o0VarQ.g0(false);
                                        }
                                    }
                                    aVar2 = aVar5;
                                }
                            }
                            z17 = z37;
                        }
                    }
                    x1 x1Var6 = n.f135158a;
                    o0VarQ.g0(z17);
                } else {
                    dVar = dVar5;
                    z17 = false;
                    lu1.a aVar7 = new lu1.a("", "");
                    o0VarQ.g0(false);
                    aVar2 = aVar7;
                }
                context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                zB = yz1.e.b(dVar4.f97520a);
                uVar4 = dVar4.f97521b;
                if (uVar4 == null) {
                    planName = null;
                } else {
                    planName = uVar4.f187871a.getPlanName();
                    if (planName == null) {
                        pVarA = uVar4.a();
                        if (pVarA != null) {
                            planName = pVarA.getName();
                        } else {
                            planName = null;
                        }
                    }
                }
                if (planName == null) {
                    z18 = true;
                } else {
                    z18 = z17;
                }
                str = (String) aVar.f114983a;
                str2 = (String) aVar.f114984b;
                str3 = (String) aVar2.f114983a;
                String str26 = (String) aVar2.f114984b;
                uVar5 = dVar4.f97521b;
                uVar6 = dVar4.f97521b;
                if (uVar6 != null) {
                    tVar = uVar6.f187871a;
                    if (tVar.b() == b0.STP) {
                        uVar10 = uVar5;
                        if (uVar10 != null) {
                            tVar2 = uVar10.f187871a;
                        } else {
                            tVar2 = null;
                        }
                        if (tVar2 != null) {
                            z19 = zB;
                            str4 = str2;
                            D1 = j0.f134944a;
                        } else {
                            z19 = zB;
                            str4 = str2;
                            D1 = j0.f134944a;
                        }
                    } else {
                        z19 = zB;
                        str4 = str2;
                        if (d()) {
                            D1 = j0.f134944a;
                        } else {
                            int i210 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                            uVar7 = uVar5;
                            if (uVar7 != null) {
                                list = uVar7.f187876f;
                            } else {
                                list = j0.f134944a;
                            }
                            listA = tVar.a();
                            DateTime dateTimeWithTimeAtStartOfDay4 = DateTime.now().withTimeAtStartOfDay();
                            dateTimeWithTimeAtStartOfDay4.getClass();
                            DateTime dateTimeO2 = k.o(i210, dateTimeWithTimeAtStartOfDay4);
                            DateTime dateTimeA3 = k.A(k.b(i210, dateTimeWithTimeAtStartOfDay4));
                            trainingPlanDetailBrief = tVar.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief != null) {
                                localDate = null;
                            } else {
                                localDate = null;
                            }
                            trainingPlanDetailBrief2 = tVar.getTrainingPlanDetailBrief();
                            if (trainingPlanDetailBrief2 != null) {
                                localDate2 = null;
                            } else {
                                localDate2 = null;
                            }
                            Interval interval2 = new Interval(dateTimeO2, dateTimeA3);
                            D1 = h0.d1(j0.f134944a);
                            aVar3 = new f0.a(gg.b.Q(interval2));
                            while (aVar3.hasNext()) {
                                dateTime = (DateTime) aVar3.next();
                                if (tVar.g()) {
                                    aVar4 = aVar3;
                                    uVar9 = uVar5;
                                    if (uVar9 != null) {
                                        List<fg0.e> list8 = uVar9.f187872b;
                                        arrayList2 = new ArrayList();
                                        while (r30.hasNext()) {
                                            String str27 = str;
                                            String str28 = str3;
                                            String str29 = str12;
                                            if (k.g(((fg0.e) obj2).getDate(), dateTime.toLocalDate())) {
                                                arrayList2.add(obj2);
                                            }
                                            str = str27;
                                            str12 = str29;
                                            str3 = str28;
                                        }
                                        str8 = str;
                                        str9 = str3;
                                        str10 = str12;
                                        list2 = arrayList2;
                                    } else {
                                        str8 = str;
                                        str9 = str3;
                                        str10 = str12;
                                        list2 = j0.f134944a;
                                    }
                                } else {
                                    aVar4 = aVar3;
                                    str8 = str;
                                    str9 = str3;
                                    str10 = str12;
                                    list2 = j0.f134944a;
                                }
                                arrayList = new ArrayList();
                                list3 = list2;
                                while (r14.hasNext()) {
                                    List list9 = list3;
                                    if (k.f(((com.garmin.android.apps.connectmobile.workouts.data.model.d) obj3).g(), dateTime)) {
                                        arrayList.add(obj3);
                                    }
                                    list3 = list9;
                                }
                                list4 = list3;
                                dVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.d) h0.d0(arrayList);
                                if (dVar2 == null) {
                                    if (tVar.g()) {
                                        z34 = false;
                                    } else {
                                        z34 = false;
                                    }
                                    boolean zB4 = b(dateTime, tVar, list, localDate);
                                    if (z34) {
                                        z35 = true;
                                    } else {
                                        z35 = true;
                                    }
                                    eVar2 = new e(null, dateTime, z35, !list4.isEmpty(), k.k(dateTime), false, null, false, false, 416, null);
                                } else {
                                    if (tVar.g()) {
                                        if (tVar.g()) {
                                            dVar3 = dVar2;
                                            arrayList = arrayList;
                                            if (dVar3.getAssociatedActivityId() != null) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            boolean zB5 = b(dateTime, tVar, list, localDate);
                                            if (arrayList.size() == 1) {
                                                kVarJ = null;
                                            } else {
                                                kVarJ = null;
                                            }
                                            dateTimeG = dVar3.g();
                                            if (dateTimeG == null) {
                                                dateTime2 = dateTime;
                                            } else {
                                                dateTime2 = dateTimeG;
                                            }
                                            if (z27) {
                                                z28 = true;
                                            } else {
                                                z28 = true;
                                            }
                                            if (list4.isEmpty()) {
                                                z29 = true;
                                            } else {
                                                z29 = true;
                                            }
                                            dateTimeG2 = dVar3.g();
                                            if (dateTimeG2 != null) {
                                                i15 = 1;
                                                if (k.k(dateTimeG2)) {
                                                }
                                                if (list4.isEmpty()) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                                eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                            } else {
                                                i15 = 1;
                                            }
                                            if (list4.isEmpty()) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                            eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                        } else {
                                            dVar3 = dVar2;
                                            arrayList = arrayList;
                                            if (dVar3.getAssociatedActivityId() != null) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            boolean zB6 = b(dateTime, tVar, list, localDate);
                                            if (arrayList.size() == 1) {
                                                kVarJ = null;
                                            } else {
                                                kVarJ = null;
                                            }
                                            dateTimeG = dVar3.g();
                                            if (dateTimeG == null) {
                                                dateTime2 = dateTime;
                                            } else {
                                                dateTime2 = dateTimeG;
                                            }
                                            if (z27) {
                                                z28 = true;
                                            } else {
                                                z28 = true;
                                            }
                                            if (list4.isEmpty()) {
                                                z29 = true;
                                            } else {
                                                z29 = true;
                                            }
                                            dateTimeG2 = dVar3.g();
                                            if (dateTimeG2 != null) {
                                                i15 = 1;
                                                if (k.k(dateTimeG2)) {
                                                }
                                                if (list4.isEmpty()) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                                eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                            } else {
                                                i15 = 1;
                                            }
                                            if (list4.isEmpty()) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                            eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                        }
                                    } else if (tVar.g()) {
                                        dVar3 = dVar2;
                                        arrayList = arrayList;
                                        if (dVar3.getAssociatedActivityId() != null) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        boolean zB7 = b(dateTime, tVar, list, localDate);
                                        if (arrayList.size() == 1) {
                                            kVarJ = null;
                                        } else {
                                            kVarJ = null;
                                        }
                                        dateTimeG = dVar3.g();
                                        if (dateTimeG == null) {
                                            dateTime2 = dateTime;
                                        } else {
                                            dateTime2 = dateTimeG;
                                        }
                                        if (z27) {
                                            z28 = true;
                                        } else {
                                            z28 = true;
                                        }
                                        if (list4.isEmpty()) {
                                            z29 = true;
                                        } else {
                                            z29 = true;
                                        }
                                        dateTimeG2 = dVar3.g();
                                        if (dateTimeG2 != null) {
                                            i15 = 1;
                                            if (k.k(dateTimeG2)) {
                                            }
                                            if (list4.isEmpty()) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                            eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                        } else {
                                            i15 = 1;
                                        }
                                        if (list4.isEmpty()) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                        eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                    } else {
                                        dVar3 = dVar2;
                                        arrayList = arrayList;
                                        if (dVar3.getAssociatedActivityId() != null) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        boolean zB8 = b(dateTime, tVar, list, localDate);
                                        if (arrayList.size() == 1) {
                                            kVarJ = null;
                                        } else {
                                            kVarJ = null;
                                        }
                                        dateTimeG = dVar3.g();
                                        if (dateTimeG == null) {
                                            dateTime2 = dateTime;
                                        } else {
                                            dateTime2 = dateTimeG;
                                        }
                                        if (z27) {
                                            z28 = true;
                                        } else {
                                            z28 = true;
                                        }
                                        if (list4.isEmpty()) {
                                            z29 = true;
                                        } else {
                                            z29 = true;
                                        }
                                        dateTimeG2 = dVar3.g();
                                        if (dateTimeG2 != null) {
                                            i15 = 1;
                                            if (k.k(dateTimeG2)) {
                                            }
                                            if (list4.isEmpty()) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                            eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                        } else {
                                            i15 = 1;
                                        }
                                        if (list4.isEmpty()) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                        eVar = new e(kVarJ, dateTime2, z28, z29, z44, false, numValueOf, false, false, 416, null);
                                    }
                                    D1.add(eVar);
                                    aVar3 = aVar4;
                                    str = str8;
                                    str12 = str10;
                                    str3 = str9;
                                }
                                eVar = eVar2;
                                D1.add(eVar);
                                aVar3 = aVar4;
                                str = str8;
                                str12 = str10;
                                str3 = str9;
                            }
                        }
                        str5 = str;
                        str6 = str3;
                        str7 = str12;
                        z24 = true;
                        r14 = D1;
                    }
                    str5 = str;
                    str6 = str3;
                    str7 = str12;
                    z24 = true;
                    r14 = D1;
                } else {
                    z19 = zB;
                    str4 = str2;
                    z18 = z18;
                    str5 = str;
                    str6 = str3;
                    str7 = str12;
                    z24 = true;
                    r14 = j0.f134944a;
                }
                ?? r16 = r14;
                boolean zR2 = o0VarQ.r(tVar7) | o0VarQ.r(context) | o0VarQ.h(z14);
                if ((i24 & 896) != 256) {
                    z25 = z24;
                } else {
                    z25 = z24;
                }
                z26 = zR2 | z25;
                objQ = o0VarQ.q();
                if (z26) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        an0.d dVar10 = new an0.d(tVar7, context, z14, this, 5);
                        o0VarQ.K(dVar10);
                        objQ = dVar10;
                    }
                } else {
                    an0.d dVar11 = new an0.d(tVar7, context, z14, this, 5);
                    o0VarQ.K(dVar11);
                    objQ = dVar11;
                }
                c.c(rVar, z19, z18, dVar, str11, str7, str5, str4, str6, str26, cVar2, 0L, f15, r16, z14, (e23.a) objQ, o0VarQ, i24 & 14);
                o0Var = o0VarQ;
                o0Var.g0(false);
            }
            x1 x1Var7 = n.f135158a;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 24);
        }
    }

    public final boolean b(DateTime dateTime, t tVar, List<s> list, LocalDate localDate) {
        if (localDate == null) {
            return false;
        }
        ww1.u uVar = this.f115003a.f121119a.f97521b;
        g0 g0VarB = uVar != null ? uVar.b() : null;
        if (!tVar.g() || g0VarB == g0.FITNESS || dateTime.toLocalDate().isBefore(localDate)) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (s sVar : list) {
            if (k.f(sVar.b(), dateTime) && sVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        c0 trainingPlanDetailBrief;
        ww1.u uVar = this.f115003a.f121119a.f97521b;
        return ((uVar == null || (trainingPlanDetailBrief = uVar.f187871a.getTrainingPlanDetailBrief()) == null) ? null : trainingPlanDetailBrief.getPause()) != null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llu1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
