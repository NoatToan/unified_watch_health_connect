package v41;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv41/m;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isUsingMetric", "Lo53/b0;", "coroutineScope", "Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm;", "algorithm", "Lr53/z1;", "Lu41/b;", "paceProPlanFlow", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailFlow", "", "userProfilePk", "Lr41/a;", "paceProApiRepository", "Ld60/b;", "coursesRepo", "Ls41/a;", "paceProDelegate", "Lv41/s;", "processPlanUpdatesUseCase", "<init>", "(Landroid/content/Context;ZLo53/b0;Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm;Lr53/z1;Lr53/z1;JLr41/a;Ld60/b;Ls41/a;Lv41/s;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f175633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaceProAlgorithm f175634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1<u41.b> f175635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<com.garmin.android.apps.connectmobile.courses.model.e> f175636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f175637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r41.a f175638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d60.b f175639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s41.a f175640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f175641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u41.b f175642k;

    public m(Context context, boolean z14, o53.b0 b0Var, PaceProAlgorithm paceProAlgorithm, z1<u41.b> z1Var, z1<com.garmin.android.apps.connectmobile.courses.model.e> z1Var2, long j8, r41.a aVar, d60.b bVar, s41.a aVar2, s sVar) {
        context.getClass();
        b0Var.getClass();
        paceProAlgorithm.getClass();
        z1Var.getClass();
        z1Var2.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        sVar.getClass();
        this.f175632a = context;
        this.f175633b = b0Var;
        this.f175634c = paceProAlgorithm;
        this.f175635d = z1Var;
        this.f175636e = z1Var2;
        this.f175637f = j8;
        this.f175638g = aVar;
        this.f175639h = bVar;
        this.f175640i = aVar2;
        this.f175641j = sVar;
        String string = context.getString(R.string.txt_untitle);
        string.getClass();
        this.f175642k = new u41.b(new com.garmin.android.apps.connectmobile.pacepro.data.dto.a((List) null, new com.garmin.android.apps.connectmobile.pacepro.data.dto.b((Long) null, string, (Long) null, (Long) null, z14 ? t41.i.EVERY_KM : t41.i.EVERY_MILE, z14 ? t41.a.KILOMETER : t41.a.MILE, 0.0d, (Double) null, (Double) null, 0L, 0.0d, (String) null, (String) null, (String) null, false, (Float) null, (Float) null, (Float) null, 262093, (p005kotlin.jvm.internal.j) null), 1, (p005kotlin.jvm.internal.j) null), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(m mVar, v13.c cVar) {
        f fVar;
        PaceProAlgorithm paceProAlgorithm = mVar.f175634c;
        s41.a aVar = mVar.f175640i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f175597c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f175597c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(mVar, cVar);
            }
        } else {
            fVar = new f(mVar, cVar);
        }
        Object objJ = fVar.f175595a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f175597c;
        if (i15 == 0) {
            o13.r.b(objJ);
            r41.a aVar3 = mVar.f175638g;
            fVar.f175597c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar3, new r41.d(aVar3, null), fVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.PACE_PRO;
            Object obj = ((v2.b) v2Var).f47386a;
            aVar4.getClass();
            i2.a.a(a2Var, "Fetched and set paceband parameters: " + obj);
            q41.a aVar5 = (q41.a) obj;
            aVar.e(aVar5);
            paceProAlgorithm.b(aVar5);
        } else {
            q41.a aVarF = aVar.f();
            i2.a aVar6 = i2.f36769a;
            aVar6.getClass();
            i2.a.e(a2.PACE_PRO, "Could not fetch paceband parameters. Using cached params instead: " + aVarF);
            paceProAlgorithm.b(aVarF);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(m mVar, long j8, Long l14, String str, v13.c cVar) {
        i iVar;
        Long l15;
        String str2;
        u41.b value;
        u41.b value2;
        u41.b bVar;
        double dQ;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar;
        long j14;
        String str3;
        double d14;
        String str4;
        long j15 = j8;
        z1<u41.b> z1Var = mVar.f175635d;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f175619f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f175619f = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(mVar, cVar);
            }
        } else {
            iVar = new i(mVar, cVar);
        }
        Object objJ = iVar.f175617d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f175619f;
        if (i15 == 0) {
            o13.r.b(objJ);
            d60.b bVar2 = mVar.f175639h;
            iVar.f175615b = l14;
            iVar.f175616c = str;
            iVar.f175614a = j15;
            iVar.f175619f = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new d60.j(bVar2, j15, null), iVar);
            if (objJ == aVar2) {
                return aVar2;
            }
            l15 = l14;
            str2 = str;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j15 = iVar.f175614a;
            String str5 = iVar.f175616c;
            l15 = iVar.f175615b;
            o13.r.b(objJ);
            str2 = str5;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
            z1<com.garmin.android.apps.connectmobile.courses.model.e> z1Var2 = mVar.f175636e;
            while (!z1Var2.b(z1Var2.getValue(), eVar)) {
            }
            i2.a aVar3 = i2.f36769a;
            aVar3.getClass();
            i2.a.a(a2.PACE_PRO, "Fetched course details: " + eVar);
            do {
                value2 = z1Var.getValue();
                bVar = value2;
                dQ = eVar.q();
                aVar = bVar.f168609a;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar3 = aVar.f39760b;
                double d15 = bVar3.f39770g;
                double d16 = bVar3.f39774k;
                long jLongValue = l15 != null ? l15.longValue() : bVar3.f39773j;
                String string = aVar.f39760b.f39765b;
                if (l15 != null) {
                    double d17 = dQ / jLongValue;
                    String str6 = eVar.courseName;
                    if (str6 != null) {
                        string = str6;
                    }
                    String str7 = eVar.userProfilePk;
                    long j16 = jLongValue;
                    if (str7 != null) {
                        long j17 = mVar.f175637f;
                        Long lJ = d53.t.j(str7);
                        if (lJ == null || j17 != lJ.longValue()) {
                            Context context = mVar.f175632a;
                            if (str2 == null) {
                                str4 = eVar.courseName;
                            } else {
                                str4 = str2;
                            }
                            string = context.getString(R.string.workout_duplicate_default_format, str4);
                            string.getClass();
                        }
                    } else {
                        Context context2 = mVar.f175632a;
                        if (str2 == null) {
                            str4 = eVar.courseName;
                        } else {
                            str4 = str2;
                        }
                        string = context2.getString(R.string.workout_duplicate_default_format, str4);
                        string.getClass();
                    }
                    str3 = string;
                    d14 = d17;
                    j14 = j16;
                } else {
                    long j18 = Math.abs(dQ - d15) >= 0.01d ? (long) (dQ / d16) : jLongValue;
                    if (j18 != 0) {
                        d16 = dQ / j18;
                    }
                    j14 = j18;
                    str3 = string;
                    d14 = d16;
                }
            } while (!z1Var.b(value2, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, str3, new Long(j15), null, null, dQ, null, null, j14, d14, false, null, null, null, 260537), 1), null, null, 0, 0, null, null, null, null, null, str2, false, false, false, 11262)));
        } else {
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, false, true, false, 12287)));
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.PACE_PRO;
            aVar4.getClass();
            i2.a.e(a2Var, "Could not fetch course details!");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object c(m mVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, v13.c cVar) {
        j jVar;
        Long l14;
        Long l15;
        u41.b value;
        u41.b value2;
        u41.b bVar2;
        Long l16;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB;
        List listB1;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar3 = bVar;
        z1<u41.b> z1Var = mVar.f175635d;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f175626e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f175626e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(mVar, cVar);
            }
        } else {
            jVar = new j(mVar, cVar);
        }
        Object obj = jVar.f175624c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f175626e;
        boolean z14 = true;
        Object obj2 = null;
        if (i15 == 0) {
            o13.r.b(obj);
            Long l17 = bVar3.f39766c;
            if (l17 == null || l17.longValue() == 0) {
                l17 = null;
            }
            Long l18 = bVar3.f39764a;
            if (l18 == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.PACE_PRO;
                aVar2.getClass();
                i2.a.e(a2Var, "paceBandPk is null!");
            } else if (bVar3.f39778o) {
                r41.a aVar3 = mVar.f175638g;
                long jLongValue = l18.longValue();
                jVar.f175622a = l17;
                jVar.f175623b = l18;
                jVar.f175626e = 1;
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(aVar3, new r41.f(aVar3, jLongValue, null), jVar);
                if (objJ == aVar) {
                    return aVar;
                }
                l14 = l17;
                obj = objJ;
                l15 = l18;
            } else {
                while (true) {
                    u41.b value3 = z1Var.getValue();
                    u41.b bVar4 = value3;
                    z1<u41.b> z1Var2 = z1Var;
                    Long l19 = l17;
                    if (z1Var2.b(value3, u41.b.a(bVar4, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(bVar4.f168609a, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar3, null, l19, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262139), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 12286))) {
                        break;
                    }
                    z14 = true;
                    l17 = l19;
                    obj2 = null;
                    z1Var = z1Var2;
                    bVar3 = bVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l15 = jVar.f175623b;
        l14 = jVar.f175622a;
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.PACE_PRO;
            Object obj3 = ((v2.b) v2Var).f47386a;
            aVar4.getClass();
            i2.a.a(a2Var2, "Fetched paceband with id=" + l15 + ": " + obj3);
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar5 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.a) obj3;
            ArrayList arrayListD1 = p13.h0.d1(aVar5.f39759a);
            int size = arrayListD1.size();
            for (int i16 = 0; i16 < size; i16++) {
                if (i16 >= 1) {
                    PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) arrayListD1.get(i16);
                    arrayListD1.set(i16, paceBandSplitDTO.copy((2003 & 1) != 0 ? paceBandSplitDTO.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO.cumulativeDistanceFromStart : 0.0d, (2003 & 8) != 0 ? paceBandSplitDTO.cumulativeTimeFromStart : 0.0d, (2003 & 16) != 0 ? paceBandSplitDTO.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO.splitAvgSpeed : 0.0d, (2003 & 64) != 0 ? paceBandSplitDTO.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO.startPoint : null, (2003 & 256) != 0 ? paceBandSplitDTO.endPoint : null, (2003 & 512) != 0 ? paceBandSplitDTO.splitTime : new Float((float) (((PaceBandSplitDTO) arrayListD1.get(i16)).getCumulativeTimeFromStart() - ((PaceBandSplitDTO) arrayListD1.get(i16 - 1)).getCumulativeTimeFromStart())), (2003 & 1024) != 0 ? paceBandSplitDTO.elevationChange : null));
                } else {
                    PaceBandSplitDTO paceBandSplitDTO2 = (PaceBandSplitDTO) arrayListD1.get(i16);
                    arrayListD1.set(i16, paceBandSplitDTO2.copy((2003 & 1) != 0 ? paceBandSplitDTO2.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO2.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO2.cumulativeDistanceFromStart : 0.0d, (2003 & 8) != 0 ? paceBandSplitDTO2.cumulativeTimeFromStart : 0.0d, (2003 & 16) != 0 ? paceBandSplitDTO2.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO2.splitAvgSpeed : 0.0d, (2003 & 64) != 0 ? paceBandSplitDTO2.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO2.startPoint : null, (2003 & 256) != 0 ? paceBandSplitDTO2.endPoint : null, (2003 & 512) != 0 ? paceBandSplitDTO2.splitTime : new Float((float) aVar5.f39759a.get(i16).getCumulativeTimeFromStart()), (2003 & 1024) != 0 ? paceBandSplitDTO2.elevationChange : null));
                }
            }
            do {
                value2 = z1Var.getValue();
                bVar2 = value2;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar5 = aVar5.f39760b;
                if (l14 == null) {
                    Long l24 = bVar5.f39766c;
                    l16 = (l24 == null || l24.longValue() == 0) ? null : l24;
                } else {
                    l16 = l14;
                }
                bVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar5, null, l16, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262139);
                listB1 = p13.h0.b1(arrayListD1);
                listB1.getClass();
            } while (!z1Var.b(value2, u41.b.a(bVar2, new com.garmin.android.apps.connectmobile.pacepro.data.dto.a(listB1, bVarB), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 12286)));
        } else {
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, false, true, false, 12287)));
            i2.a aVar6 = i2.f36769a;
            aVar6.getClass();
            i2.a.e(a2.PACE_PRO, "Could not get paceband with id=" + l15 + "!");
        }
        return Unit.INSTANCE;
    }
}
