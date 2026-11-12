package ca0;

import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import java.util.ArrayList;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26190a;

    public /* synthetic */ d2(int i14) {
        this.f26190a = i14;
    }

    private final Object a(Object obj) throws Exception {
        ud.a aVar = (ud.a) obj;
        cf.b0.c cVar = cf.b0.f26898d;
        aVar.getClass();
        ud.c cVarM0 = aVar.M0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        try {
            int iB = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
            int iB2 = ge1.b.B(cVarM0, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iB3 = ge1.b.B(cVarM0, "worker_class_name");
            int iB4 = ge1.b.B(cVarM0, "input_merger_class_name");
            int iB5 = ge1.b.B(cVarM0, "input");
            int iB6 = ge1.b.B(cVarM0, "output");
            int iB7 = ge1.b.B(cVarM0, "initial_delay");
            int iB8 = ge1.b.B(cVarM0, "interval_duration");
            int iB9 = ge1.b.B(cVarM0, "flex_duration");
            int iB10 = ge1.b.B(cVarM0, "run_attempt_count");
            int iB11 = ge1.b.B(cVarM0, "backoff_policy");
            int iB12 = ge1.b.B(cVarM0, "backoff_delay_duration");
            int iB13 = ge1.b.B(cVarM0, "last_enqueue_time");
            int iB14 = ge1.b.B(cVarM0, "minimum_retention_duration");
            int iB15 = ge1.b.B(cVarM0, "schedule_requested_at");
            int iB16 = ge1.b.B(cVarM0, "run_in_foreground");
            int iB17 = ge1.b.B(cVarM0, "out_of_quota_policy");
            int iB18 = ge1.b.B(cVarM0, "period_count");
            int iB19 = ge1.b.B(cVarM0, "generation");
            int iB20 = ge1.b.B(cVarM0, "next_schedule_time_override");
            int iB21 = ge1.b.B(cVarM0, "next_schedule_time_override_generation");
            int iB22 = ge1.b.B(cVarM0, DownloadService.KEY_STOP_REASON);
            int iB23 = ge1.b.B(cVarM0, "trace_tag");
            int iB24 = ge1.b.B(cVarM0, "backoff_on_system_interruptions");
            int iB25 = ge1.b.B(cVarM0, "required_network_type");
            int iB26 = ge1.b.B(cVarM0, "required_network_request");
            int iB27 = ge1.b.B(cVarM0, "requires_charging");
            int iB28 = ge1.b.B(cVarM0, "requires_device_idle");
            int iB29 = ge1.b.B(cVarM0, "requires_battery_not_low");
            int iB30 = ge1.b.B(cVarM0, "requires_storage_not_low");
            int iB31 = ge1.b.B(cVarM0, "trigger_content_update_delay");
            int iB32 = ge1.b.B(cVarM0, "trigger_max_content_delay");
            int iB33 = ge1.b.B(cVarM0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (cVarM0.J0()) {
                String strM1 = cVarM0.M1(iB);
                int i14 = iB14;
                ArrayList arrayList2 = arrayList;
                ue.h0.c cVarF = cf.f0.f((int) cVarM0.getLong(iB2));
                String strM2 = cVarM0.M1(iB3);
                String strM3 = cVarM0.M1(iB4);
                byte[] blob = cVarM0.getBlob(iB5);
                androidx.work.c.f11464b.getClass();
                androidx.work.c cVarA = androidx.work.c.b.a(blob);
                androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM0.getBlob(iB6));
                long j8 = cVarM0.getLong(iB7);
                long j14 = cVarM0.getLong(iB8);
                long j15 = cVarM0.getLong(iB9);
                int i15 = (int) cVarM0.getLong(iB10);
                int i16 = iB2;
                int i17 = iB3;
                ue.a aVarC = cf.f0.c((int) cVarM0.getLong(iB11));
                long j16 = cVarM0.getLong(iB12);
                long j17 = cVarM0.getLong(iB13);
                long j18 = cVarM0.getLong(i14);
                int i18 = iB15;
                long j19 = cVarM0.getLong(i18);
                int i19 = iB;
                int i24 = iB16;
                boolean z14 = ((int) cVarM0.getLong(i24)) != 0;
                int i25 = iB17;
                int i26 = iB4;
                ue.b0 b0VarE = cf.f0.e((int) cVarM0.getLong(i25));
                int i27 = iB18;
                int i28 = iB5;
                int i29 = (int) cVarM0.getLong(i27);
                int i30 = iB19;
                int i34 = (int) cVarM0.getLong(i30);
                int i35 = iB20;
                long j24 = cVarM0.getLong(i35);
                int i36 = iB21;
                int i37 = (int) cVarM0.getLong(i36);
                int i38 = iB22;
                int i39 = (int) cVarM0.getLong(i38);
                int i44 = iB23;
                Boolean boolValueOf = null;
                String strM4 = cVarM0.isNull(i44) ? null : cVarM0.M1(i44);
                int i45 = iB24;
                Integer numValueOf = cVarM0.isNull(i45) ? null : Integer.valueOf((int) cVarM0.getLong(i45));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i46 = iB25;
                Boolean bool = boolValueOf;
                ue.v vVarD = cf.f0.d((int) cVarM0.getLong(i46));
                int i47 = iB26;
                df.m mVarJ = cf.f0.j(cVarM0.getBlob(i47));
                iB25 = i46;
                iB26 = i47;
                int i48 = iB27;
                boolean z15 = ((int) cVarM0.getLong(i48)) != 0;
                iB27 = i48;
                int i49 = iB28;
                boolean z16 = ((int) cVarM0.getLong(i49)) != 0;
                int i54 = iB29;
                boolean z17 = ((int) cVarM0.getLong(i54)) != 0;
                iB29 = i54;
                int i55 = iB30;
                int i56 = iB31;
                int i57 = iB32;
                int i58 = iB33;
                iB33 = i58;
                arrayList2.add(new cf.t(strM1, cVarF, strM2, strM3, cVarA, cVarA2, j8, j14, j15, new ue.f(mVarJ, vVarD, z15, z16, z17, ((int) cVarM0.getLong(i55)) != 0, cVarM0.getLong(i56), cVarM0.getLong(i57), cf.f0.a(cVarM0.getBlob(i58))), i15, aVarC, j16, j17, j18, j19, z14, b0VarE, i29, i34, j24, i37, i39, strM4, bool));
                iB30 = i55;
                iB4 = i26;
                iB17 = i25;
                iB19 = i30;
                iB22 = i38;
                iB24 = i45;
                iB31 = i56;
                iB32 = i57;
                iB2 = i16;
                iB14 = i14;
                iB3 = i17;
                arrayList = arrayList2;
                iB = i19;
                iB15 = i18;
                iB16 = i24;
                iB20 = i35;
                iB21 = i36;
                iB23 = i44;
                iB28 = i49;
                iB5 = i28;
                iB18 = i27;
            }
            return arrayList;
        } finally {
            cVarM0.close();
        }
    }

    private final Object b(Object obj) throws Exception {
        ud.a aVar = (ud.a) obj;
        cf.b0.c cVar = cf.b0.f26898d;
        aVar.getClass();
        ud.c cVarM0 = aVar.M0("SELECT * FROM workspec WHERE state=1");
        try {
            int iB = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
            int iB2 = ge1.b.B(cVarM0, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iB3 = ge1.b.B(cVarM0, "worker_class_name");
            int iB4 = ge1.b.B(cVarM0, "input_merger_class_name");
            int iB5 = ge1.b.B(cVarM0, "input");
            int iB6 = ge1.b.B(cVarM0, "output");
            int iB7 = ge1.b.B(cVarM0, "initial_delay");
            int iB8 = ge1.b.B(cVarM0, "interval_duration");
            int iB9 = ge1.b.B(cVarM0, "flex_duration");
            int iB10 = ge1.b.B(cVarM0, "run_attempt_count");
            int iB11 = ge1.b.B(cVarM0, "backoff_policy");
            int iB12 = ge1.b.B(cVarM0, "backoff_delay_duration");
            int iB13 = ge1.b.B(cVarM0, "last_enqueue_time");
            int iB14 = ge1.b.B(cVarM0, "minimum_retention_duration");
            int iB15 = ge1.b.B(cVarM0, "schedule_requested_at");
            int iB16 = ge1.b.B(cVarM0, "run_in_foreground");
            int iB17 = ge1.b.B(cVarM0, "out_of_quota_policy");
            int iB18 = ge1.b.B(cVarM0, "period_count");
            int iB19 = ge1.b.B(cVarM0, "generation");
            int iB20 = ge1.b.B(cVarM0, "next_schedule_time_override");
            int iB21 = ge1.b.B(cVarM0, "next_schedule_time_override_generation");
            int iB22 = ge1.b.B(cVarM0, DownloadService.KEY_STOP_REASON);
            int iB23 = ge1.b.B(cVarM0, "trace_tag");
            int iB24 = ge1.b.B(cVarM0, "backoff_on_system_interruptions");
            int iB25 = ge1.b.B(cVarM0, "required_network_type");
            int iB26 = ge1.b.B(cVarM0, "required_network_request");
            int iB27 = ge1.b.B(cVarM0, "requires_charging");
            int iB28 = ge1.b.B(cVarM0, "requires_device_idle");
            int iB29 = ge1.b.B(cVarM0, "requires_battery_not_low");
            int iB30 = ge1.b.B(cVarM0, "requires_storage_not_low");
            int iB31 = ge1.b.B(cVarM0, "trigger_content_update_delay");
            int iB32 = ge1.b.B(cVarM0, "trigger_max_content_delay");
            int iB33 = ge1.b.B(cVarM0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (cVarM0.J0()) {
                String strM1 = cVarM0.M1(iB);
                int i14 = iB14;
                ArrayList arrayList2 = arrayList;
                ue.h0.c cVarF = cf.f0.f((int) cVarM0.getLong(iB2));
                String strM2 = cVarM0.M1(iB3);
                String strM3 = cVarM0.M1(iB4);
                byte[] blob = cVarM0.getBlob(iB5);
                androidx.work.c.f11464b.getClass();
                androidx.work.c cVarA = androidx.work.c.b.a(blob);
                androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM0.getBlob(iB6));
                long j8 = cVarM0.getLong(iB7);
                long j14 = cVarM0.getLong(iB8);
                long j15 = cVarM0.getLong(iB9);
                int i15 = (int) cVarM0.getLong(iB10);
                int i16 = iB2;
                int i17 = iB3;
                ue.a aVarC = cf.f0.c((int) cVarM0.getLong(iB11));
                long j16 = cVarM0.getLong(iB12);
                long j17 = cVarM0.getLong(iB13);
                long j18 = cVarM0.getLong(i14);
                int i18 = iB15;
                long j19 = cVarM0.getLong(i18);
                int i19 = iB;
                int i24 = iB16;
                boolean z14 = ((int) cVarM0.getLong(i24)) != 0;
                int i25 = iB17;
                int i26 = iB4;
                ue.b0 b0VarE = cf.f0.e((int) cVarM0.getLong(i25));
                int i27 = iB18;
                int i28 = iB5;
                int i29 = (int) cVarM0.getLong(i27);
                int i30 = iB19;
                int i34 = (int) cVarM0.getLong(i30);
                int i35 = iB20;
                long j24 = cVarM0.getLong(i35);
                int i36 = iB21;
                int i37 = (int) cVarM0.getLong(i36);
                int i38 = iB22;
                int i39 = (int) cVarM0.getLong(i38);
                int i44 = iB23;
                Boolean boolValueOf = null;
                String strM4 = cVarM0.isNull(i44) ? null : cVarM0.M1(i44);
                int i45 = iB24;
                Integer numValueOf = cVarM0.isNull(i45) ? null : Integer.valueOf((int) cVarM0.getLong(i45));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i46 = iB25;
                Boolean bool = boolValueOf;
                ue.v vVarD = cf.f0.d((int) cVarM0.getLong(i46));
                int i47 = iB26;
                df.m mVarJ = cf.f0.j(cVarM0.getBlob(i47));
                iB25 = i46;
                iB26 = i47;
                int i48 = iB27;
                boolean z15 = ((int) cVarM0.getLong(i48)) != 0;
                iB27 = i48;
                int i49 = iB28;
                boolean z16 = ((int) cVarM0.getLong(i49)) != 0;
                int i54 = iB29;
                boolean z17 = ((int) cVarM0.getLong(i54)) != 0;
                iB29 = i54;
                int i55 = iB30;
                int i56 = iB31;
                int i57 = iB32;
                int i58 = iB33;
                iB33 = i58;
                arrayList2.add(new cf.t(strM1, cVarF, strM2, strM3, cVarA, cVarA2, j8, j14, j15, new ue.f(mVarJ, vVarD, z15, z16, z17, ((int) cVarM0.getLong(i55)) != 0, cVarM0.getLong(i56), cVarM0.getLong(i57), cf.f0.a(cVarM0.getBlob(i58))), i15, aVarC, j16, j17, j18, j19, z14, b0VarE, i29, i34, j24, i37, i39, strM4, bool));
                iB30 = i55;
                iB4 = i26;
                iB17 = i25;
                iB19 = i30;
                iB22 = i38;
                iB24 = i45;
                iB31 = i56;
                iB32 = i57;
                iB2 = i16;
                iB14 = i14;
                iB3 = i17;
                arrayList = arrayList2;
                iB = i19;
                iB15 = i18;
                iB16 = i24;
                iB20 = i35;
                iB21 = i36;
                iB23 = i44;
                iB28 = i49;
                iB5 = i28;
                iB18 = i27;
            }
            return arrayList;
        } finally {
            cVarM0.close();
        }
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        switch (this.f26190a) {
            case 0:
                lc.p0 p0Var = (lc.p0) obj;
                p0Var.getClass();
                p0Var.f111835h = p005kotlin.jvm.internal.s0.f105811a.b(z1.p.class);
                p0Var.f111833f = false;
                lc.y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = false;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = false;
                p0Var.f111834g = y0VarI.f111915b;
                p0Var.f111829b = true;
                return Unit.INSTANCE;
            case 1:
                lc.p0 p0Var2 = (lc.p0) obj;
                k23.d<?> dVarB = p005kotlin.jvm.internal.s0.f105811a.b(z1.j.class);
                p0Var2.getClass();
                p0Var2.f111835h = dVarB;
                p0Var2.f111833f = false;
                lc.y0 y0VarI2 = kg.f.i(p0Var2, -1);
                y0VarI2.f111914a = false;
                Unit unit2 = Unit.INSTANCE;
                p0Var2.f111833f = false;
                p0Var2.f111834g = y0VarI2.f111915b;
                p0Var2.f111829b = true;
                return Unit.INSTANCE;
            case 2:
                c.q qVar = (c.q) obj;
                qVar.getClass();
                t2.b(qVar);
                return Unit.INSTANCE;
            case 3:
                c.q qVar2 = (c.q) obj;
                qVar2.getClass();
                t2.b(qVar2);
                return Unit.INSTANCE;
            case 4:
                c.q qVar3 = (c.q) obj;
                qVar3.getClass();
                t2.b(qVar3);
                return Unit.INSTANCE;
            case 5:
                c.q qVar4 = (c.q) obj;
                qVar4.getClass();
                t2.b(qVar4);
                return Unit.INSTANCE;
            case 6:
                c.q qVar5 = (c.q) obj;
                qVar5.getClass();
                t2.b(qVar5);
                return Unit.INSTANCE;
            case 7:
                c.q qVar6 = (c.q) obj;
                qVar6.getClass();
                t2.b(qVar6);
                return Unit.INSTANCE;
            case 8:
                lc.p0 p0Var3 = (lc.p0) obj;
                p0Var3.getClass();
                p0Var3.f111835h = p005kotlin.jvm.internal.s0.f105811a.b(z1.m.class);
                p0Var3.f111833f = false;
                lc.y0 y0VarI3 = kg.f.i(p0Var3, -1);
                y0VarI3.f111914a = false;
                Unit unit3 = Unit.INSTANCE;
                p0Var3.f111833f = false;
                p0Var3.f111834g = y0VarI3.f111915b;
                p0Var3.f111829b = true;
                return Unit.INSTANCE;
            case 9:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 10:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 11:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 12:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 13:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 14:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 15:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 16:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 17:
                lc.p0 p0Var4 = (lc.p0) obj;
                k23.d<?> dVarB2 = p005kotlin.jvm.internal.s0.f105811a.b(z1.q.class);
                p0Var4.getClass();
                p0Var4.f111835h = dVarB2;
                p0Var4.f111833f = false;
                lc.y0 y0VarI4 = kg.f.i(p0Var4, -1);
                y0VarI4.f111914a = false;
                Unit unit4 = Unit.INSTANCE;
                p0Var4.f111833f = false;
                p0Var4.f111834g = y0VarI4.f111915b;
                return Unit.INSTANCE;
            case 18:
                Module module = (Module) obj;
                ce1.a aVar = ce1.a.f26890a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.Y.a());
                c50.a aVar2 = new c50.a(14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new c50.a(15), kind, j0Var), module));
                return Unit.INSTANCE;
            case 19:
                Module module2 = (Module) obj;
                ce1.b bVar = ce1.b.f26892a;
                module2.getClass();
                c50.a aVar3 = new c50.a(16);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(com.garmin.android.apps.connectmobile.respiration.data.a.class), null, aVar3, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.respiration.data.c.class), null, new c50.a(17), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(fe1.n.class), null, new c50.a(18), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 20:
                ud.a aVar4 = (ud.a) obj;
                cf.l.b bVar2 = cf.l.f26926c;
                aVar4.getClass();
                ud.c cVarM0 = aVar4.M0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        arrayList.add(cVarM0.M1(0));
                    }
                    cVarM0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            case 21:
                ud.a aVar5 = (ud.a) obj;
                cf.s.b bVar3 = cf.s.f26938b;
                aVar5.getClass();
                ud.c cVarM1 = aVar5.M0("DELETE FROM WorkProgress");
                try {
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 22:
                ud.a aVar6 = (ud.a) obj;
                cf.b0.c cVar = cf.b0.f26898d;
                aVar6.getClass();
                ud.c cVarM2 = aVar6.M0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i14 = cVarM2.J0() ? (int) cVarM2.getLong(0) : 0;
                    cVarM2.close();
                    return Integer.valueOf(i14);
                } catch (Throwable th4) {
                    cVarM2.close();
                    throw th4;
                }
            case 23:
                ud.a aVar7 = (ud.a) obj;
                cf.b0.c cVar2 = cf.b0.f26898d;
                aVar7.getClass();
                ud.c cVarM3 = aVar7.M0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    cVarM3.J0();
                    return Integer.valueOf(g8.i.L(aVar7));
                } finally {
                    cVarM3.close();
                }
            case 24:
                ud.a aVar8 = (ud.a) obj;
                cf.b0.c cVar3 = cf.b0.f26898d;
                aVar8.getClass();
                ud.c cVarM4 = aVar8.M0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iB = ge1.b.B(cVarM4, TtmlNode.ATTR_ID);
                    int iB2 = ge1.b.B(cVarM4, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int iB3 = ge1.b.B(cVarM4, "worker_class_name");
                    int iB4 = ge1.b.B(cVarM4, "input_merger_class_name");
                    int iB5 = ge1.b.B(cVarM4, "input");
                    int iB6 = ge1.b.B(cVarM4, "output");
                    int iB7 = ge1.b.B(cVarM4, "initial_delay");
                    int iB8 = ge1.b.B(cVarM4, "interval_duration");
                    int iB9 = ge1.b.B(cVarM4, "flex_duration");
                    int iB10 = ge1.b.B(cVarM4, "run_attempt_count");
                    int iB11 = ge1.b.B(cVarM4, "backoff_policy");
                    int iB12 = ge1.b.B(cVarM4, "backoff_delay_duration");
                    int iB13 = ge1.b.B(cVarM4, "last_enqueue_time");
                    int iB14 = ge1.b.B(cVarM4, "minimum_retention_duration");
                    int iB15 = ge1.b.B(cVarM4, "schedule_requested_at");
                    int iB16 = ge1.b.B(cVarM4, "run_in_foreground");
                    int iB17 = ge1.b.B(cVarM4, "out_of_quota_policy");
                    int iB18 = ge1.b.B(cVarM4, "period_count");
                    int iB19 = ge1.b.B(cVarM4, "generation");
                    int iB20 = ge1.b.B(cVarM4, "next_schedule_time_override");
                    int iB21 = ge1.b.B(cVarM4, "next_schedule_time_override_generation");
                    int iB22 = ge1.b.B(cVarM4, DownloadService.KEY_STOP_REASON);
                    int iB23 = ge1.b.B(cVarM4, "trace_tag");
                    int iB24 = ge1.b.B(cVarM4, "backoff_on_system_interruptions");
                    int iB25 = ge1.b.B(cVarM4, "required_network_type");
                    int iB26 = ge1.b.B(cVarM4, "required_network_request");
                    int iB27 = ge1.b.B(cVarM4, "requires_charging");
                    int iB28 = ge1.b.B(cVarM4, "requires_device_idle");
                    int iB29 = ge1.b.B(cVarM4, "requires_battery_not_low");
                    int iB30 = ge1.b.B(cVarM4, "requires_storage_not_low");
                    int iB31 = ge1.b.B(cVarM4, "trigger_content_update_delay");
                    int iB32 = ge1.b.B(cVarM4, "trigger_max_content_delay");
                    int iB33 = ge1.b.B(cVarM4, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM4.J0()) {
                        String strM1 = cVarM4.M1(iB);
                        int i15 = iB14;
                        int i16 = iB13;
                        ue.h0.c cVarF = cf.f0.f((int) cVarM4.getLong(iB2));
                        String strM2 = cVarM4.M1(iB3);
                        String strM3 = cVarM4.M1(iB4);
                        byte[] blob = cVarM4.getBlob(iB5);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA = androidx.work.c.b.a(blob);
                        androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM4.getBlob(iB6));
                        long j8 = cVarM4.getLong(iB7);
                        long j14 = cVarM4.getLong(iB8);
                        long j15 = cVarM4.getLong(iB9);
                        int i17 = (int) cVarM4.getLong(iB10);
                        int i18 = iB3;
                        int i19 = iB2;
                        ue.a aVarC = cf.f0.c((int) cVarM4.getLong(iB11));
                        long j16 = cVarM4.getLong(iB12);
                        long j17 = cVarM4.getLong(i16);
                        long j18 = cVarM4.getLong(i15);
                        int i24 = iB15;
                        long j19 = cVarM4.getLong(i24);
                        iB15 = i24;
                        int i25 = iB16;
                        int i26 = iB;
                        boolean z14 = ((int) cVarM4.getLong(i25)) != 0;
                        int i27 = iB4;
                        int i28 = iB17;
                        ue.b0 b0VarE = cf.f0.e((int) cVarM4.getLong(i28));
                        iB17 = i28;
                        int i29 = iB18;
                        int i30 = (int) cVarM4.getLong(i29);
                        iB18 = i29;
                        int i34 = iB19;
                        int i35 = (int) cVarM4.getLong(i34);
                        int i36 = iB20;
                        long j24 = cVarM4.getLong(i36);
                        int i37 = iB21;
                        int i38 = (int) cVarM4.getLong(i37);
                        int i39 = iB22;
                        int i44 = (int) cVarM4.getLong(i39);
                        int i45 = iB23;
                        String strM4 = cVarM4.isNull(i45) ? null : cVarM4.M1(i45);
                        int i46 = iB24;
                        Integer numValueOf = cVarM4.isNull(i46) ? null : Integer.valueOf((int) cVarM4.getLong(i46));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i47 = iB25;
                        ue.v vVarD = cf.f0.d((int) cVarM4.getLong(i47));
                        int i48 = iB26;
                        df.m mVarJ = cf.f0.j(cVarM4.getBlob(i48));
                        int i49 = iB27;
                        boolean z15 = ((int) cVarM4.getLong(i49)) != 0;
                        int i54 = iB28;
                        boolean z16 = ((int) cVarM4.getLong(i54)) != 0;
                        int i55 = iB29;
                        boolean z17 = ((int) cVarM4.getLong(i55)) != 0;
                        iB29 = i55;
                        int i56 = iB30;
                        int i57 = iB31;
                        int i58 = iB32;
                        iB31 = i57;
                        int i59 = iB33;
                        iB33 = i59;
                        arrayList2.add(new cf.t(strM1, cVarF, strM2, strM3, cVarA, cVarA2, j8, j14, j15, new ue.f(mVarJ, vVarD, z15, z16, z17, ((int) cVarM4.getLong(i56)) != 0, cVarM4.getLong(i57), cVarM4.getLong(i58), cf.f0.a(cVarM4.getBlob(i59))), i17, aVarC, j16, j17, j18, j19, z14, b0VarE, i30, i35, j24, i38, i44, strM4, boolValueOf));
                        iB26 = i48;
                        iB = i26;
                        iB16 = i25;
                        iB19 = i34;
                        iB21 = i37;
                        iB22 = i39;
                        iB23 = i45;
                        iB24 = i46;
                        iB25 = i47;
                        iB32 = i58;
                        iB30 = i56;
                        iB2 = i19;
                        iB4 = i27;
                        iB20 = i36;
                        iB27 = i49;
                        iB13 = i16;
                        iB3 = i18;
                        iB28 = i54;
                        iB14 = i15;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM4.close();
                }
            case 25:
                ud.a aVar9 = (ud.a) obj;
                cf.b0.c cVar4 = cf.b0.f26898d;
                aVar9.getClass();
                ud.c cVarM5 = aVar9.M0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(cVarM5.J0() && ((int) cVarM5.getLong(0)) != 0);
                } finally {
                    cVarM5.close();
                }
            case 26:
                ud.a aVar10 = (ud.a) obj;
                cf.b0.c cVar5 = cf.b0.f26898d;
                aVar10.getClass();
                ud.c cVarM6 = aVar10.M0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    cVarM6.h(1, 200);
                    int iB34 = ge1.b.B(cVarM6, TtmlNode.ATTR_ID);
                    int iB35 = ge1.b.B(cVarM6, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int iB36 = ge1.b.B(cVarM6, "worker_class_name");
                    int iB37 = ge1.b.B(cVarM6, "input_merger_class_name");
                    int iB38 = ge1.b.B(cVarM6, "input");
                    int iB39 = ge1.b.B(cVarM6, "output");
                    int iB40 = ge1.b.B(cVarM6, "initial_delay");
                    int iB41 = ge1.b.B(cVarM6, "interval_duration");
                    int iB42 = ge1.b.B(cVarM6, "flex_duration");
                    int iB43 = ge1.b.B(cVarM6, "run_attempt_count");
                    int iB44 = ge1.b.B(cVarM6, "backoff_policy");
                    int iB45 = ge1.b.B(cVarM6, "backoff_delay_duration");
                    int iB46 = ge1.b.B(cVarM6, "last_enqueue_time");
                    int iB47 = ge1.b.B(cVarM6, "minimum_retention_duration");
                    int iB48 = ge1.b.B(cVarM6, "schedule_requested_at");
                    int iB49 = ge1.b.B(cVarM6, "run_in_foreground");
                    int iB50 = ge1.b.B(cVarM6, "out_of_quota_policy");
                    int iB51 = ge1.b.B(cVarM6, "period_count");
                    int iB52 = ge1.b.B(cVarM6, "generation");
                    int iB53 = ge1.b.B(cVarM6, "next_schedule_time_override");
                    int iB54 = ge1.b.B(cVarM6, "next_schedule_time_override_generation");
                    int iB55 = ge1.b.B(cVarM6, DownloadService.KEY_STOP_REASON);
                    int iB56 = ge1.b.B(cVarM6, "trace_tag");
                    int iB57 = ge1.b.B(cVarM6, "backoff_on_system_interruptions");
                    int iB58 = ge1.b.B(cVarM6, "required_network_type");
                    int iB59 = ge1.b.B(cVarM6, "required_network_request");
                    int iB60 = ge1.b.B(cVarM6, "requires_charging");
                    int iB61 = ge1.b.B(cVarM6, "requires_device_idle");
                    int iB62 = ge1.b.B(cVarM6, "requires_battery_not_low");
                    int iB63 = ge1.b.B(cVarM6, "requires_storage_not_low");
                    int iB64 = ge1.b.B(cVarM6, "trigger_content_update_delay");
                    int iB65 = ge1.b.B(cVarM6, "trigger_max_content_delay");
                    int iB66 = ge1.b.B(cVarM6, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarM6.J0()) {
                        String strM5 = cVarM6.M1(iB34);
                        int i64 = iB47;
                        ArrayList arrayList4 = arrayList3;
                        ue.h0.c cVarF2 = cf.f0.f((int) cVarM6.getLong(iB35));
                        String strM6 = cVarM6.M1(iB36);
                        String strM7 = cVarM6.M1(iB37);
                        byte[] blob2 = cVarM6.getBlob(iB38);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA3 = androidx.work.c.b.a(blob2);
                        androidx.work.c cVarA4 = androidx.work.c.b.a(cVarM6.getBlob(iB39));
                        long j25 = cVarM6.getLong(iB40);
                        long j26 = cVarM6.getLong(iB41);
                        long j27 = cVarM6.getLong(iB42);
                        int i65 = (int) cVarM6.getLong(iB43);
                        int i66 = iB36;
                        int i67 = iB35;
                        ue.a aVarC2 = cf.f0.c((int) cVarM6.getLong(iB44));
                        long j28 = cVarM6.getLong(iB45);
                        long j29 = cVarM6.getLong(iB46);
                        long j34 = cVarM6.getLong(i64);
                        int i68 = iB48;
                        long j35 = cVarM6.getLong(i68);
                        iB48 = i68;
                        int i69 = iB49;
                        boolean z18 = ((int) cVarM6.getLong(i69)) != 0;
                        int i74 = iB50;
                        int i75 = iB34;
                        ue.b0 b0VarE2 = cf.f0.e((int) cVarM6.getLong(i74));
                        int i76 = iB37;
                        int i77 = iB38;
                        int i78 = iB51;
                        int i79 = (int) cVarM6.getLong(i78);
                        int i84 = iB52;
                        int i85 = (int) cVarM6.getLong(i84);
                        int i86 = iB53;
                        long j36 = cVarM6.getLong(i86);
                        int i87 = iB54;
                        int i88 = (int) cVarM6.getLong(i87);
                        int i89 = iB55;
                        int i93 = (int) cVarM6.getLong(i89);
                        int i94 = iB56;
                        String strM8 = cVarM6.isNull(i94) ? null : cVarM6.M1(i94);
                        int i95 = iB57;
                        Integer numValueOf2 = cVarM6.isNull(i95) ? null : Integer.valueOf((int) cVarM6.getLong(i95));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i96 = iB58;
                        ue.v vVarD2 = cf.f0.d((int) cVarM6.getLong(i96));
                        int i97 = iB59;
                        df.m mVarJ2 = cf.f0.j(cVarM6.getBlob(i97));
                        int i98 = iB60;
                        boolean z19 = ((int) cVarM6.getLong(i98)) != 0;
                        int i99 = iB61;
                        boolean z24 = ((int) cVarM6.getLong(i99)) != 0;
                        int i100 = iB62;
                        boolean z25 = ((int) cVarM6.getLong(i100)) != 0;
                        iB62 = i100;
                        int i101 = iB63;
                        int i102 = iB64;
                        int i103 = iB65;
                        iB64 = i102;
                        int i104 = iB66;
                        iB66 = i104;
                        arrayList4.add(new cf.t(strM5, cVarF2, strM6, strM7, cVarA3, cVarA4, j25, j26, j27, new ue.f(mVarJ2, vVarD2, z19, z24, z25, ((int) cVarM6.getLong(i101)) != 0, cVarM6.getLong(i102), cVarM6.getLong(i103), cf.f0.a(cVarM6.getBlob(i104))), i65, aVarC2, j28, j29, j34, j35, z18, b0VarE2, i79, i85, j36, i88, i93, strM8, boolValueOf2));
                        iB65 = i103;
                        iB63 = i101;
                        iB37 = i76;
                        iB53 = i86;
                        iB54 = i87;
                        iB55 = i89;
                        iB56 = i94;
                        iB57 = i95;
                        iB58 = i96;
                        iB47 = i64;
                        iB35 = i67;
                        iB59 = i97;
                        iB34 = i75;
                        iB50 = i74;
                        iB51 = i78;
                        iB52 = i84;
                        iB60 = i98;
                        iB61 = i99;
                        iB38 = i77;
                        iB49 = i69;
                        arrayList3 = arrayList4;
                        iB36 = i66;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarM6.close();
                }
            case 27:
                return a(obj);
            case 28:
                return b(obj);
            default:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.b();
                return Unit.INSTANCE;
        }
    }
}
