package c82;

import cf.b0;
import cf.e0;
import cf.f0;
import cf.p;
import cf.s;
import cf.t;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import java.util.ArrayList;
import p005kotlin.Unit;
import p5.k0;
import ue.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25708b;

    public /* synthetic */ b(String str, int i14) {
        this.f25707a = i14;
        this.f25708b = str;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0208  */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        boolean z14;
        boolean z15;
        Long lValueOf;
        t tVar;
        h0.c cVarF;
        int i14 = this.f25707a;
        String str = this.f25708b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, str);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                p5.h0.n(k0Var3, str);
                return Unit.INSTANCE;
            case 3:
                ud.a aVar = (ud.a) obj;
                cf.c.b bVar = cf.c.f26902c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarM0.q3(1, str);
                    if (cVarM0.J0()) {
                        z14 = false;
                        if (((int) cVarM0.getLong(0)) != 0) {
                            z15 = true;
                        }
                        cVarM0.close();
                        return Boolean.valueOf(z15);
                    }
                    z14 = false;
                    z15 = z14;
                    cVarM0.close();
                    return Boolean.valueOf(z15);
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            case 4:
                ud.a aVar2 = (ud.a) obj;
                cf.c.b bVar2 = cf.c.f26902c;
                aVar2.getClass();
                ud.c cVarM1 = aVar2.M0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarM1.q3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarM1.J0()) {
                        arrayList.add(cVarM1.M1(0));
                    }
                    cVarM1.close();
                    return arrayList;
                } catch (Throwable th4) {
                    cVarM1.close();
                    throw th4;
                }
            case 5:
                ud.a aVar3 = (ud.a) obj;
                cf.c.b bVar3 = cf.c.f26902c;
                aVar3.getClass();
                ud.c cVarM2 = aVar3.M0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    cVarM2.q3(1, str);
                    return Boolean.valueOf(cVarM2.J0() && ((int) cVarM2.getLong(0)) != 0);
                } finally {
                    cVarM2.close();
                }
            case 6:
                ud.a aVar4 = (ud.a) obj;
                cf.f.b bVar4 = cf.f.f26912c;
                aVar4.getClass();
                ud.c cVarM3 = aVar4.M0("SELECT long_value FROM Preference where `key`=?");
                try {
                    cVarM3.q3(1, str);
                    if (cVarM3.J0() && !cVarM3.isNull(0)) {
                        lValueOf = Long.valueOf(cVarM3.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    cVarM3.close();
                }
            case 7:
                ud.a aVar5 = (ud.a) obj;
                cf.l.b bVar5 = cf.l.f26926c;
                aVar5.getClass();
                ud.c cVarM4 = aVar5.M0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    cVarM4.q3(1, str);
                    cVarM4.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM4.close();
                }
            case 8:
                ud.a aVar6 = (ud.a) obj;
                p.b bVar6 = p.f26933c;
                aVar6.getClass();
                ud.c cVarM5 = aVar6.M0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    cVarM5.q3(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM5.J0()) {
                        arrayList2.add(cVarM5.M1(0));
                    }
                    cVarM5.close();
                    return arrayList2;
                } catch (Throwable th5) {
                    cVarM5.close();
                    throw th5;
                }
            case 9:
                ud.a aVar7 = (ud.a) obj;
                s.b bVar7 = s.f26938b;
                aVar7.getClass();
                ud.c cVarM6 = aVar7.M0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    cVarM6.q3(1, str);
                    cVarM6.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM6.close();
                }
            case 10:
                ud.a aVar8 = (ud.a) obj;
                b0.c cVar = b0.f26898d;
                aVar8.getClass();
                ud.c cVarM7 = aVar8.M0("SELECT * FROM workspec WHERE id=?");
                try {
                    cVarM7.q3(1, str);
                    int iB = ge1.b.B(cVarM7, TtmlNode.ATTR_ID);
                    int iB2 = ge1.b.B(cVarM7, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int iB3 = ge1.b.B(cVarM7, "worker_class_name");
                    int iB4 = ge1.b.B(cVarM7, "input_merger_class_name");
                    int iB5 = ge1.b.B(cVarM7, "input");
                    int iB6 = ge1.b.B(cVarM7, "output");
                    int iB7 = ge1.b.B(cVarM7, "initial_delay");
                    int iB8 = ge1.b.B(cVarM7, "interval_duration");
                    int iB9 = ge1.b.B(cVarM7, "flex_duration");
                    int iB10 = ge1.b.B(cVarM7, "run_attempt_count");
                    int iB11 = ge1.b.B(cVarM7, "backoff_policy");
                    int iB12 = ge1.b.B(cVarM7, "backoff_delay_duration");
                    int iB13 = ge1.b.B(cVarM7, "last_enqueue_time");
                    int iB14 = ge1.b.B(cVarM7, "minimum_retention_duration");
                    int iB15 = ge1.b.B(cVarM7, "schedule_requested_at");
                    int iB16 = ge1.b.B(cVarM7, "run_in_foreground");
                    int iB17 = ge1.b.B(cVarM7, "out_of_quota_policy");
                    int iB18 = ge1.b.B(cVarM7, "period_count");
                    int iB19 = ge1.b.B(cVarM7, "generation");
                    int iB20 = ge1.b.B(cVarM7, "next_schedule_time_override");
                    int iB21 = ge1.b.B(cVarM7, "next_schedule_time_override_generation");
                    int iB22 = ge1.b.B(cVarM7, DownloadService.KEY_STOP_REASON);
                    int iB23 = ge1.b.B(cVarM7, "trace_tag");
                    int iB24 = ge1.b.B(cVarM7, "backoff_on_system_interruptions");
                    int iB25 = ge1.b.B(cVarM7, "required_network_type");
                    int iB26 = ge1.b.B(cVarM7, "required_network_request");
                    int iB27 = ge1.b.B(cVarM7, "requires_charging");
                    int iB28 = ge1.b.B(cVarM7, "requires_device_idle");
                    int iB29 = ge1.b.B(cVarM7, "requires_battery_not_low");
                    int iB30 = ge1.b.B(cVarM7, "requires_storage_not_low");
                    int iB31 = ge1.b.B(cVarM7, "trigger_content_update_delay");
                    int iB32 = ge1.b.B(cVarM7, "trigger_max_content_delay");
                    int iB33 = ge1.b.B(cVarM7, "content_uri_triggers");
                    if (cVarM7.J0()) {
                        String strM1 = cVarM7.M1(iB);
                        h0.c cVarF2 = f0.f((int) cVarM7.getLong(iB2));
                        String strM2 = cVarM7.M1(iB3);
                        String strM3 = cVarM7.M1(iB4);
                        byte[] blob = cVarM7.getBlob(iB5);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA = androidx.work.c.b.a(blob);
                        androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM7.getBlob(iB6));
                        long j8 = cVarM7.getLong(iB7);
                        long j14 = cVarM7.getLong(iB8);
                        long j15 = cVarM7.getLong(iB9);
                        int i15 = (int) cVarM7.getLong(iB10);
                        ue.a aVarC = f0.c((int) cVarM7.getLong(iB11));
                        long j16 = cVarM7.getLong(iB12);
                        long j17 = cVarM7.getLong(iB13);
                        long j18 = cVarM7.getLong(iB14);
                        long j19 = cVarM7.getLong(iB15);
                        boolean z16 = ((int) cVarM7.getLong(iB16)) != 0;
                        ue.b0 b0VarE = f0.e((int) cVarM7.getLong(iB17));
                        int i16 = (int) cVarM7.getLong(iB18);
                        int i17 = (int) cVarM7.getLong(iB19);
                        long j24 = cVarM7.getLong(iB20);
                        int i18 = (int) cVarM7.getLong(iB21);
                        int i19 = (int) cVarM7.getLong(iB22);
                        String strM4 = cVarM7.isNull(iB23) ? null : cVarM7.M1(iB23);
                        Integer numValueOf = cVarM7.isNull(iB24) ? null : Integer.valueOf((int) cVarM7.getLong(iB24));
                        tVar = new t(strM1, cVarF2, strM2, strM3, cVarA, cVarA2, j8, j14, j15, new ue.f(f0.j(cVarM7.getBlob(iB26)), f0.d((int) cVarM7.getLong(iB25)), ((int) cVarM7.getLong(iB27)) != 0, ((int) cVarM7.getLong(iB28)) != 0, ((int) cVarM7.getLong(iB29)) != 0, ((int) cVarM7.getLong(iB30)) != 0, cVarM7.getLong(iB31), cVarM7.getLong(iB32), f0.a(cVarM7.getBlob(iB33))), i15, aVarC, j16, j17, j18, j19, z16, b0VarE, i16, i17, j24, i18, i19, strM4, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        tVar = null;
                    }
                    return tVar;
                } finally {
                    cVarM7.close();
                }
            case 11:
                ud.a aVar9 = (ud.a) obj;
                b0.c cVar2 = b0.f26898d;
                aVar9.getClass();
                ud.c cVarM8 = aVar9.M0("DELETE FROM workspec WHERE id=?");
                try {
                    cVarM8.q3(1, str);
                    cVarM8.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM8.close();
                }
            case 12:
                ud.a aVar10 = (ud.a) obj;
                b0.c cVar3 = b0.f26898d;
                aVar10.getClass();
                ud.c cVarM9 = aVar10.M0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarM9.q3(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarM9.J0()) {
                        arrayList3.add(new t.b(cVarM9.M1(0), f0.f((int) cVarM9.getLong(1))));
                    }
                    cVarM9.close();
                    return arrayList3;
                } catch (Throwable th6) {
                    cVarM9.close();
                    throw th6;
                }
            case 13:
                ud.a aVar11 = (ud.a) obj;
                b0.c cVar4 = b0.f26898d;
                aVar11.getClass();
                ud.c cVarM10 = aVar11.M0("SELECT state FROM workspec WHERE id=?");
                try {
                    cVarM10.q3(1, str);
                    if (cVarM10.J0()) {
                        Integer numValueOf2 = cVarM10.isNull(0) ? null : Integer.valueOf((int) cVarM10.getLong(0));
                        if (numValueOf2 != null) {
                            cVarF = f0.f(numValueOf2.intValue());
                        } else {
                            cVarF = null;
                        }
                        break;
                    } else {
                        cVarF = null;
                    }
                    return cVarF;
                } finally {
                    cVarM10.close();
                }
            case 14:
                ud.a aVar12 = (ud.a) obj;
                b0.c cVar5 = b0.f26898d;
                aVar12.getClass();
                ud.c cVarM11 = aVar12.M0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarM11.q3(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarM11.J0()) {
                        arrayList4.add(cVarM11.M1(0));
                    }
                    cVarM11.close();
                    return arrayList4;
                } catch (Throwable th7) {
                    cVarM11.close();
                    throw th7;
                }
            case 15:
                ud.a aVar13 = (ud.a) obj;
                b0.c cVar6 = b0.f26898d;
                aVar13.getClass();
                ud.c cVarM12 = aVar13.M0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    cVarM12.q3(1, str);
                    cVarM12.J0();
                    return Integer.valueOf(g8.i.L(aVar13));
                } finally {
                    cVarM12.close();
                }
            case 16:
                ud.a aVar14 = (ud.a) obj;
                b0.c cVar7 = b0.f26898d;
                aVar14.getClass();
                ud.c cVarM13 = aVar14.M0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    cVarM13.q3(1, str);
                    cVarM13.J0();
                    return Integer.valueOf(g8.i.L(aVar14));
                } finally {
                    cVarM13.close();
                }
            case 17:
                ud.a aVar15 = (ud.a) obj;
                b0.c cVar8 = b0.f26898d;
                aVar15.getClass();
                ud.c cVarM14 = aVar15.M0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    cVarM14.q3(1, str);
                    cVarM14.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM14.close();
                }
            case 18:
                ud.a aVar16 = (ud.a) obj;
                b0.c cVar9 = b0.f26898d;
                aVar16.getClass();
                ud.c cVarM15 = aVar16.M0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    cVarM15.q3(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarM15.J0()) {
                        arrayList5.add(cVarM15.M1(0));
                    }
                    cVarM15.close();
                    return arrayList5;
                } catch (Throwable th8) {
                    cVarM15.close();
                    throw th8;
                }
            case 19:
                ud.a aVar17 = (ud.a) obj;
                b0.c cVar10 = b0.f26898d;
                aVar17.getClass();
                ud.c cVarM16 = aVar17.M0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    cVarM16.q3(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarM16.J0()) {
                        byte[] blob2 = cVarM16.getBlob(0);
                        androidx.work.c.f11464b.getClass();
                        arrayList6.add(androidx.work.c.b.a(blob2));
                    }
                    cVarM16.close();
                    return arrayList6;
                } catch (Throwable th9) {
                    cVarM16.close();
                    throw th9;
                }
            case 20:
                ud.a aVar18 = (ud.a) obj;
                b0.c cVar11 = b0.f26898d;
                aVar18.getClass();
                ud.c cVarM17 = aVar18.M0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    cVarM17.q3(1, str);
                    cVarM17.J0();
                    return Integer.valueOf(g8.i.L(aVar18));
                } finally {
                    cVarM17.close();
                }
            case 21:
                ud.a aVar19 = (ud.a) obj;
                e0.b bVar8 = e0.f26909c;
                aVar19.getClass();
                ud.c cVarM18 = aVar19.M0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    cVarM18.q3(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarM18.J0()) {
                        arrayList7.add(cVarM18.M1(0));
                    }
                    cVarM18.close();
                    return arrayList7;
                } catch (Throwable th10) {
                    cVarM18.close();
                    throw th10;
                }
            case 22:
                ud.a aVar20 = (ud.a) obj;
                e0.b bVar9 = e0.f26909c;
                aVar20.getClass();
                ud.c cVarM19 = aVar20.M0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    cVarM19.q3(1, str);
                    cVarM19.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM19.close();
                }
            case 23:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                p5.h0.n(k0Var4, str);
                return Unit.INSTANCE;
            case 24:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                p5.h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 25:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                p5.h0.n(k0Var6, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                p5.h0.n(k0Var7, str);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                p5.h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 28:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                p5.h0.n(k0Var9, str);
                return Unit.INSTANCE;
            default:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                p5.h0.n(k0Var10, str);
                return Unit.INSTANCE;
        }
    }
}
