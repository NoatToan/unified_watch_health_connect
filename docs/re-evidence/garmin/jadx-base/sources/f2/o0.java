package f2;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.strava.StravaAuthConnectActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPrioritySelectionActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.tabs.TabLayout;
import f5.z1;
import g02.p1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68255b;

    public /* synthetic */ o0(Object obj, int i14) {
        this.f68254a = i14;
        this.f68255b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v16 java.lang.Object, still in use, count: 2, list:
          (r5v16 java.lang.Object) from 0x0116: PHI (r5 I:??) = (r5v13 java.lang.Object), (r5v16 java.lang.Object) binds: [B:45:0x0115, B:72:0x0116] A[DONT_GENERATE, DONT_INLINE]
          (r5v16 java.lang.Object) from 0x010a: CHECK_CAST (com.garmin.android.apps.connectmobile.workouts.data.model.k) (r5v16 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final java.lang.Object a(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.o0.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj) {
        Object value;
        Object value2;
        Object value3;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        Object value4;
        long j8;
        Object value5;
        l22.a aVar;
        int i14;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) this.f68255b;
        double dDoubleValue = ((Double) obj).doubleValue();
        double d14 = eVar.f46027c;
        p2 p2Var = eVar.f46036l;
        p2 p2Var2 = eVar.f46035k;
        long jD = MathKt.d(d14 / dDoubleValue);
        l3.f23124b.getClass();
        int i15 = ((int) jD) / DateTimeConstants.SECONDS_PER_HOUR;
        if (jD <= 0 || i15 > 48) {
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, null));
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, null));
        } else {
            eVar.f46028d = jD;
            p2 p2Var3 = eVar.f46037m;
            do {
                value3 = p2Var3.getValue();
                kVar = eVar.f46029e;
            } while (!p2Var3.b(value3, eVar.z6(kVar != null ? kVar.getEventLegActivityType() : null)));
            do {
                value4 = p2Var2.getValue();
                l3.a aVar2 = l3.f23124b;
                j8 = eVar.f46028d;
                aVar2.getClass();
            } while (!p2Var2.b(value4, l3.a.e1(j8)));
            do {
                value5 = p2Var.getValue();
                l3.a aVar3 = l3.f23124b;
                Context contextRequireContext = eVar.requireContext();
                contextRequireContext.getClass();
                aVar = new l22.a(contextRequireContext);
                i14 = (int) eVar.f46028d;
                aVar3.getClass();
            } while (!p2Var.b(value5, l3.a.k1(aVar, true, i14)));
        }
        if (eVar.f46032h != ng0.a.LEG_SCREEN_VIEW) {
            MenuItem menuItem = eVar.f46034j;
            if (menuItem == null) {
                p005kotlin.jvm.internal.s.m("saveMenu");
                throw null;
            }
            menuItem.setEnabled(eVar.f46028d > 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj) {
        j12.k kVar;
        com.garmin.android.apps.connectmobile.userprofile.d dVar = (com.garmin.android.apps.connectmobile.userprofile.d) this.f68255b;
        o13.u uVar = (o13.u) obj;
        com.garmin.android.apps.connectmobile.userprofile.d.a aVar = com.garmin.android.apps.connectmobile.userprofile.d.f46550p;
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar = (com.garmin.android.library.backgroundtaskmanagement.b.c) uVar.f128605a;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = (com.garmin.android.library.backgroundtaskmanagement.b.e) uVar.f128606b;
        Object obj2 = uVar.f128607c;
        if (((j12.k) obj2) == null) {
            obj2 = null;
        }
        j12.k kVar2 = (j12.k) obj2;
        dVar.f46553j = kVar2;
        if (eVar == com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED) {
            dVar.f46557n = true;
        }
        com.garmin.android.apps.connectmobile.userprofile.c cVar2 = dVar.f46554k;
        if (cVar2 != null) {
            cVar2.f46547b.f46549b = kVar2;
            cVar2.notifyDataSetChanged();
        }
        if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA || ((kVar = dVar.f46553j) != null && kVar.getSectionPublicity() == null && kVar.getBiometricProfile() == null && kVar.getLastUsedDevice() == null && kVar.d() == null)) {
            com.garmin.android.apps.connectmobile.userprofile.model.q qVar = dVar.f46552i;
            if (qVar != null) {
                qVar.s(com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE.f46930a);
            }
            dVar.J6();
        } else if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            dVar.f46557n = true;
            dVar.u6(cVar);
        }
        dVar.w6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0369  */
    /* JADX WARN: Code duplicated, block: B:182:0x0387  */
    /* JADX WARN: Code duplicated, block: B:184:0x038e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0397  */
    /* JADX WARN: Code duplicated, block: B:187:0x039c  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:196:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:198:0x03be  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:204:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:210:0x0403  */
    /* JADX WARN: Code duplicated, block: B:211:0x0407  */
    /* JADX WARN: Code duplicated, block: B:213:0x040b  */
    /* JADX WARN: Code duplicated, block: B:215:0x040f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0415  */
    /* JADX WARN: Code duplicated, block: B:219:0x0419  */
    /* JADX WARN: Code duplicated, block: B:220:0x0424  */
    /* JADX WARN: Code duplicated, block: B:222:0x0428  */
    /* JADX WARN: Code duplicated, block: B:224:0x042c  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0369, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        z zVar;
        Object value;
        View view2;
        View view3;
        String string;
        String strA;
        Throwable th3;
        View view4;
        Drawable drawable;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Integer cycleDay;
        int iIntValue;
        Integer currentPhase;
        int iIntValue2;
        Context context;
        ViewPager viewPager;
        fe.a adapter;
        ViewPager viewPager2;
        TabLayout tabLayout;
        ViewPager viewPager3;
        androidx.fragment.app.m activity;
        ViewPager viewPager4;
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        int i14 = 8;
        z zVar2 = null;
        f48998a = null;
        UUID f48998a = null;
        switch (this.f68254a) {
            case 0:
                p0 p0Var = (p0) this.f68255b;
                p0.c cVar = p0Var.f68276p;
                h0 h0Var = p0Var.f68261a;
                boolean z14 = p0Var.f68269i;
                float fFloatValue = ((Float) obj).floatValue();
                p0.a aVar2 = p0.f68259w;
                float f14 = -fFloatValue;
                if ((f14 >= 0.0f || p0Var.c()) && (f14 <= 0.0f || p0Var.e())) {
                    if (Math.abs(p0Var.f68267g) > 0.5f) {
                        b2.e.c("entered drag with non-zero pending scroll");
                    }
                    float f15 = p0Var.f68267g + f14;
                    p0Var.f68267g = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = p0Var.f68267g;
                        int iC = MathKt.c(f16);
                        z zVarI = ((z) p0Var.f68265e.getF182175a()).i(iC, !p0Var.f68262b);
                        if (zVarI == null || (zVar = p0Var.f68263c) == null) {
                            zVar2 = zVarI;
                        } else {
                            z zVarI2 = zVar.i(iC, true);
                            if (zVarI2 != null) {
                                p0Var.f68263c = zVarI2;
                                zVar2 = zVarI;
                            }
                        }
                        if (zVar2 != null) {
                            p0Var.f(zVar2, p0Var.f68262b, true);
                            p0Var.f68278r.setValue(Unit.INSTANCE);
                            float f17 = f16 - p0Var.f68267g;
                            if (z14) {
                                h0Var.d(cVar, f17, zVar2);
                            }
                        } else {
                            z1 z1Var = p0Var.f68270j;
                            if (z1Var != null) {
                                z1Var.l();
                            }
                            float f18 = f16 - p0Var.f68267g;
                            y yVarI = p0Var.i();
                            if (z14) {
                                h0Var.d(cVar, f18, yVarI);
                            }
                        }
                    }
                    if (Math.abs(p0Var.f68267g) > 0.5f) {
                        f14 -= p0Var.f68267g;
                        p0Var.f68267g = 0.0f;
                    }
                } else {
                    f14 = 0.0f;
                }
                return Float.valueOf(-f14);
            case 1:
                g21.f fVar = (g21.f) this.f68255b;
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                if (fVar.f75416b == null) {
                    p5.l.f136032b.getClass();
                    p5.h0.w(k0Var, 0);
                }
                return Unit.INSTANCE;
            case 2:
                f4.v vVar = (f4.v) this.f68255b;
                synchronized (vVar.f68819g) {
                    f4.v.a aVar3 = vVar.f68821i;
                    aVar3.getClass();
                    Object obj2 = aVar3.f68824b;
                    obj2.getClass();
                    int i15 = aVar3.f68826d;
                    p1.p0<Object> p0Var2 = aVar3.f68825c;
                    if (p0Var2 == null) {
                        p0Var2 = new p1.p0<>(0, 1, null);
                        aVar3.f68825c = p0Var2;
                        aVar3.f68828f.m(obj2, p0Var2);
                        Unit unit = Unit.INSTANCE;
                    }
                    aVar3.b(obj, i15, obj2, p0Var2);
                }
                return Unit.INSTANCE;
            case 3:
                w02.r rVar = (w02.r) this.f68255b;
                l52.i.a aVar4 = (l52.i.a) obj;
                aVar4.getClass();
                UUID uuid = aVar4.getUuid();
                T f182175a = rVar.f181127f.getF182175a();
                if (f182175a != 0) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.h hVar = f182175a instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.h ? (com.garmin.android.apps.connectmobile.workouts.presentation.edit.h) f182175a : null;
                    if (hVar != null) {
                        f48998a = hVar.getF48998a();
                    }
                }
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(uuid, f48998a));
            case 4:
                l52.f.a aVar5 = (l52.f.a) this.f68255b;
                l52.i.a aVar6 = (l52.i.a) obj;
                m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
                aVar6.getClass();
                l52.l.b(aVar5, com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.E4(aVar6));
                return Unit.INSTANCE;
            case 5:
                WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) this.f68255b;
                fw.m mVar = (fw.m) obj;
                WorkoutPreCreateActivity.a aVar7 = WorkoutPreCreateActivity.f48888d;
                int i16 = WorkoutPreCreateActivity.b.f48892a[mVar.f73769b.ordinal()];
                if (i16 == 1) {
                    workoutPreCreateActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    workoutPreCreateActivity.hideProgressOverlay();
                    workoutPreCreateActivity.displayFailedMessage();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    workoutPreCreateActivity.hideProgressOverlay();
                    List list = (List) mVar.f73770c;
                    if (list != null) {
                        long longExtra = workoutPreCreateActivity.getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        boolean zL0 = k1.f37122a.l0();
                        ComposeView composeView = workoutPreCreateActivity.f48890b;
                        if (composeView != null) {
                            composeView.setContent(new z3.e(-1535193585, true, new cr.t(workoutPreCreateActivity, list, zL0, longExtra)));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.f) this.f68255b;
                l52.j jVar2 = (l52.j) obj;
                int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.f.f49024b;
                jVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var.f48217c = m52.d.WARM_UP;
                m52.g gVar = m52.g.NONE;
                j0Var.f48232q = gVar;
                j0Var.J0 = 0.0d;
                m52.a aVar8 = m52.a.f116648d;
                j0Var.f48227l = aVar8;
                l52.l.c(jVar2, j0Var);
                l52.l.d(jVar2, fVar2.a());
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var2.f48217c = m52.d.COOL_DOWN;
                j0Var2.f48232q = gVar;
                j0Var2.J0 = 0.0d;
                j0Var2.f48227l = aVar8;
                l52.l.c(jVar2, j0Var2);
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.j jVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.j) this.f68255b;
                l52.j jVar4 = (l52.j) obj;
                int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.j.f49031b;
                jVar4.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var3.f48217c = m52.d.WARM_UP;
                j0Var3.f48232q = m52.g.WALK_INSTRUCTION;
                j0Var3.f48233r = x52.b.EASY.f189051a;
                j0Var3.f48227l = m52.a.f116648d;
                l52.l.c(jVar4, j0Var3);
                l52.l.d(jVar4, jVar3.a());
                return Unit.INSTANCE;
            case 8:
                fb0.a aVar9 = (fb0.a) this.f68255b;
                int iIntValue3 = ((Integer) obj).intValue();
                b2 b2Var = aVar9.f70174e;
                if (b2Var.f150540a.getValue() instanceof gb0.a.c) {
                    Object value2 = b2Var.f150540a.getValue();
                    value2.getClass();
                    int i19 = ((gb0.a.c) value2).f76639b;
                    j23.l lVar = new j23.l(0, i19 != 8 ? 11 : 4);
                    int iF0 = p13.h0.f0(lVar, Integer.valueOf(j23.t.f(iIntValue3, lVar)));
                    Integer numValueOf = iF0 >= 0 ? Integer.valueOf(iF0) : null;
                    int iIntValue4 = numValueOf != null ? numValueOf.intValue() : 0;
                    p2 p2Var = aVar9.f70173d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, new gb0.a.c(i19, iIntValue4)));
                }
                return Unit.INSTANCE;
            case 9:
                fb1.s sVar = (fb1.s) obj;
                fb1.v vVar2 = ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f) this.f68255b).f40621q;
                if (sVar != null) {
                    if (vVar2 != null) {
                        vVar2.a(sVar);
                    }
                } else if (vVar2 != null && (view2 = vVar2.f70309a) != null) {
                    view2.setVisibility(4);
                }
                return Unit.INSTANCE;
            case 10:
                fb1.s sVar2 = (fb1.s) obj;
                fb1.v vVar3 = ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j) this.f68255b).f40686t;
                if (sVar2 != null) {
                    if (vVar3 != null) {
                        vVar3.a(sVar2);
                    }
                } else if (vVar3 != null && (view3 = vVar3.f70309a) != null) {
                    view3.setVisibility(4);
                }
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l lVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l) this.f68255b;
                cx0.a aVar10 = (cx0.a) obj;
                if (aVar10 == null) {
                    ViewPager viewPager5 = lVar2.f40698j;
                    if (viewPager5 == null) {
                        p005kotlin.jvm.internal.s.m("mViewPager");
                        throw null;
                    }
                    fe.a adapter2 = viewPager5.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                    }
                } else {
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.a aVar11 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.f40695p;
                    if (!aVar10.f56602d && (th3 = aVar10.f56600b) != null) {
                        lVar2.u6(cx0.b.a(th3));
                        aVar10.f56602d = true;
                    }
                    lVar2.w6();
                    Context context2 = lVar2.getContext();
                    if (context2 != null) {
                        db1.m mVar2 = lVar2.f40700l;
                        if (mVar2 != null) {
                            tb1.e.a aVar12 = tb1.e.f163745a;
                            LocalDate localDateJ6 = lVar2.J6();
                            aVar12.getClass();
                            LocalDate pregnancyCycleStart = mVar2.getPregnancyCycleStart();
                            if (pregnancyCycleStart != null) {
                                int days = Days.daysBetween(pregnancyCycleStart, localDateJ6).getDays() / 7;
                                int i24 = days + 3;
                                if (i24 >= 42) {
                                    i24 = 41;
                                }
                                string = context2.getString(R.string.pregnancy_week_range, String.valueOf(days), String.valueOf(i24));
                            } else {
                                i2.a aVar13 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar13.getClass();
                                i2.a.f(a2Var, "PregnancyTrackingUtil", "Pregnancy cycle start date should not be null");
                                string = null;
                            }
                            TextView textView = lVar2.f40699k;
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("mWeeksTextView");
                                throw null;
                            }
                            textView.setText(string);
                            TextView textView2 = lVar2.f40699k;
                            if (textView2 == null) {
                                p005kotlin.jvm.internal.s.m("mWeeksTextView");
                                throw null;
                            }
                            if (string != null) {
                                Context contextRequireContext = lVar2.requireContext();
                                contextRequireContext.getClass();
                                strA = oi0.c.A(contextRequireContext, new f21.g0(27), string);
                            } else {
                                strA = null;
                            }
                            textView2.setContentDescription(strA);
                        } else {
                            TextView textView3 = lVar2.f40699k;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("mWeeksTextView");
                                throw null;
                            }
                            textView3.setText("");
                        }
                    } else {
                        ((Logger) lVar2.f40696h.getValue()).error("Activity context shouldn't be null");
                    }
                    Context context3 = lVar2.getContext();
                    if (context3 != null) {
                        ViewPager viewPager6 = lVar2.f40698j;
                        if (viewPager6 == null) {
                            p005kotlin.jvm.internal.s.m("mViewPager");
                            throw null;
                        }
                        fe.a adapter3 = viewPager6.getAdapter();
                        if (adapter3 == null) {
                            ViewPager viewPager7 = lVar2.f40698j;
                            if (viewPager7 == null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            androidx.fragment.app.v childFragmentManager = lVar2.getChildFragmentManager();
                            childFragmentManager.getClass();
                            viewPager7.setAdapter(new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.c(childFragmentManager, context3, lVar2.J6(), lVar2.I6()));
                            TabLayout tabLayout2 = lVar2.f40697i;
                            if (tabLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("mTabLayout");
                                throw null;
                            }
                            ViewPager viewPager8 = lVar2.f40698j;
                            if (viewPager8 == null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            tabLayout2.setupWithViewPager(viewPager8);
                            ViewPager viewPager9 = lVar2.f40698j;
                            if (viewPager9 == null) {
                                p005kotlin.jvm.internal.s.m("mViewPager");
                                throw null;
                            }
                            viewPager9.setOffscreenPageLimit(2);
                            Integer numD = lVar2.K6().f76718j.d();
                            if (numD != null) {
                                int iIntValue5 = numD.intValue();
                                ViewPager viewPager10 = lVar2.f40698j;
                                if (viewPager10 == null) {
                                    p005kotlin.jvm.internal.s.m("mViewPager");
                                    throw null;
                                }
                                viewPager10.C(iIntValue5, false);
                            }
                            lVar2.K6().f76718j.f(lVar2.getViewLifecycleOwner(), new fb1.f0(lVar2));
                        } else {
                            ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.c) adapter3).notifyDataSetChanged();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 12:
                rl1.a aVar14 = (rl1.a) obj;
                rl1.d dVar = ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.m) this.f68255b).f40725l;
                if (aVar14 != null) {
                    if (dVar != null) {
                        View view5 = dVar.f153409a;
                        ArrayList<rl1.b> arrayList = aVar14.f153402a;
                        if (!arrayList.isEmpty()) {
                            rl1.c[] cVarArr = dVar.f153410b;
                            int length = cVarArr.length;
                            int i25 = 0;
                            int i26 = 0;
                            while (i25 < length) {
                                rl1.c cVar2 = cVarArr[i25];
                                int i27 = i26 + 1;
                                if (i26 < arrayList.size()) {
                                    rl1.b bVar = arrayList.get(i26);
                                    if (bVar != null) {
                                        TextView textView4 = cVar2.f153407b;
                                        if (textView4 != null) {
                                            rl1.b bVar2 = arrayList.get(i26);
                                            textView4.setText(bVar2 != null ? bVar2.f153403a : null);
                                        }
                                        Context context4 = textView4 != null ? textView4.getContext() : null;
                                        Integer num = bVar.f153404b;
                                        if (context4 != null) {
                                            drawable = a7.b.getDrawable(context4, R.drawable.circle_pulse_ox_normal);
                                            if (drawable != null && num != null) {
                                                drawable.mutate();
                                                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC);
                                                if (textView4 != null) {
                                                    textView4.setCompoundDrawablePadding(context4.getResources().getDimensionPixelSize(R.dimen.spacing_micro));
                                                }
                                            }
                                        } else {
                                            drawable = null;
                                        }
                                        if (textView4 != null) {
                                            if (num == null) {
                                                drawable = null;
                                            }
                                            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                        }
                                        ViewGroup viewGroup = cVar2.f153406a;
                                        if (viewGroup != null) {
                                            viewGroup.setVisibility(0);
                                        }
                                        View view6 = cVar2.f153408c;
                                        if (view6 != null) {
                                            view6.setVisibility(0);
                                        }
                                    } else {
                                        ViewGroup viewGroup2 = cVar2.f153406a;
                                        if (viewGroup2 != null) {
                                            viewGroup2.setVisibility(8);
                                        }
                                        View view7 = cVar2.f153408c;
                                        if (view7 != null) {
                                            view7.setVisibility(8);
                                        }
                                    }
                                } else {
                                    int i28 = i14;
                                    ViewGroup viewGroup3 = cVar2.f153406a;
                                    if (viewGroup3 != null) {
                                        viewGroup3.setVisibility(i28);
                                    }
                                    View view8 = cVar2.f153408c;
                                    if (view8 != null) {
                                        view8.setVisibility(i28);
                                    }
                                }
                                i25++;
                                i26 = i27;
                                i14 = 8;
                            }
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                        } else if (view5 != null) {
                            view5.setVisibility(4);
                        }
                    }
                } else if (dVar != null && (view4 = dVar.f153409a) != null) {
                    view4.setVisibility(4);
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n nVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n) this.f68255b;
                cx0.a aVar15 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.a aVar16 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.n.f40726p;
                if (aVar15 == null) {
                    g22.e.l(nVar);
                } else {
                    g22.e.f(nVar);
                    T t7 = aVar15.f56599a;
                    if (t7 != 0) {
                        nVar.f40740n = (ww0.c) t7;
                        nVar.u6();
                    }
                    if (!aVar15.f56602d) {
                        g22.e.d(nVar, cx0.b.a(aVar15.f56600b));
                        aVar15.f56602d = true;
                    }
                }
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q qVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q) this.f68255b;
                cx0.a aVar17 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar18 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                o13.t tVar = qVar.f40795h;
                ((Logger) tVar.getValue()).debug("Got daily data update: " + aVar17 + " with response " + (aVar17 != null ? (ww0.c) aVar17.f56599a : null));
                if (aVar17 == null) {
                    g22.e.l(qVar);
                } else {
                    g22.e.f(qVar);
                    T t14 = aVar17.f56599a;
                    if (t14 != 0 || aVar17.f56602d) {
                        ww0.c cVar3 = (ww0.c) t14;
                        ww0.l cycleSummary = cVar3 != null ? cVar3.getCycleSummary() : null;
                        if (cycleSummary == null || !p005kotlin.jvm.internal.s.g(cycleSummary.getPregnancyCycle(), Boolean.TRUE)) {
                            qVar.K6();
                        } else {
                            Integer numberOfWeek = cycleSummary.getNumberOfWeek();
                            if (numberOfWeek == null) {
                                ((Logger) tVar.getValue()).debug("configureContent: weekNumber=[" + numberOfWeek + "], hiding over 42");
                                linearLayout = qVar.f40798k;
                                if (linearLayout != null) {
                                    p005kotlin.jvm.internal.s.m("mOver42WeekLinearLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                                linearLayout2 = qVar.f40797j;
                                if (linearLayout2 != null) {
                                    p005kotlin.jvm.internal.s.m("mUnder42WeekLinearLayout");
                                    throw null;
                                }
                                linearLayout2.setVisibility(0);
                                cycleDay = cycleSummary.getCycleDay();
                                if (cycleDay != null) {
                                    iIntValue = cycleDay.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                currentPhase = cycleSummary.getCurrentPhase();
                                if (currentPhase != null) {
                                    iIntValue2 = currentPhase.intValue();
                                } else {
                                    iIntValue2 = -1;
                                }
                                qVar.J6(iIntValue, iIntValue2);
                                context = qVar.getContext();
                                if (context != null) {
                                    viewPager = qVar.f40802o;
                                    if (viewPager != null) {
                                        p005kotlin.jvm.internal.s.m("mViewPager");
                                        throw null;
                                    }
                                    adapter = viewPager.getAdapter();
                                    if (adapter == null) {
                                        viewPager2 = qVar.f40802o;
                                        if (viewPager2 != null) {
                                            p005kotlin.jvm.internal.s.m("mViewPager");
                                            throw null;
                                        }
                                        androidx.fragment.app.v childFragmentManager2 = qVar.getChildFragmentManager();
                                        childFragmentManager2.getClass();
                                        viewPager2.setAdapter(new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c(childFragmentManager2, context, cVar3, qVar.I6()));
                                        tabLayout = qVar.f40804q;
                                        if (tabLayout != null) {
                                            p005kotlin.jvm.internal.s.m("mTabLayout");
                                            throw null;
                                        }
                                        viewPager3 = qVar.f40802o;
                                        if (viewPager3 != null) {
                                            p005kotlin.jvm.internal.s.m("mViewPager");
                                            throw null;
                                        }
                                        tabLayout.setupWithViewPager(viewPager3);
                                        if (qVar.getActivity() instanceof PregnancyDetailsActivity) {
                                            activity = qVar.getActivity();
                                            activity.getClass();
                                            if (((Boolean) ((PregnancyDetailsActivity) activity).f40498r.getValue()).booleanValue()) {
                                                viewPager4 = qVar.f40802o;
                                                if (viewPager4 != null) {
                                                    p005kotlin.jvm.internal.s.m("mViewPager");
                                                    throw null;
                                                }
                                                viewPager4.C(1, false);
                                            }
                                        }
                                    } else {
                                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c cVar4 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c) adapter;
                                        cVar3.getClass();
                                        cVar4.f40808i = cVar3;
                                        cVar4.notifyDataSetChanged();
                                    }
                                }
                            } else {
                                if (((numberOfWeek.intValue() > 42 && cycleSummary.getDeliveryDate() == null && cycleSummary.getEndDate() == null) ? numberOfWeek : null) != null) {
                                    ((Logger) tVar.getValue()).debug("configureContent: weekNumber=[" + numberOfWeek + "], hiding under 42");
                                    LinearLayout linearLayout3 = qVar.f40798k;
                                    if (linearLayout3 == null) {
                                        p005kotlin.jvm.internal.s.m("mOver42WeekLinearLayout");
                                        throw null;
                                    }
                                    linearLayout3.setVisibility(0);
                                    LinearLayout linearLayout4 = qVar.f40797j;
                                    if (linearLayout4 == null) {
                                        p005kotlin.jvm.internal.s.m("mUnder42WeekLinearLayout");
                                        throw null;
                                    }
                                    linearLayout4.setVisibility(8);
                                    TextView textView5 = qVar.f40800m;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("mStopTrackingButton");
                                        throw null;
                                    }
                                    textView5.setText(qVar.getString(R.string.pregnancy_stop_pregnancy_tracking));
                                } else {
                                    ((Logger) tVar.getValue()).debug("configureContent: weekNumber=[" + numberOfWeek + "], hiding over 42");
                                    linearLayout = qVar.f40798k;
                                    if (linearLayout != null) {
                                        p005kotlin.jvm.internal.s.m("mOver42WeekLinearLayout");
                                        throw null;
                                    }
                                    linearLayout.setVisibility(8);
                                    linearLayout2 = qVar.f40797j;
                                    if (linearLayout2 != null) {
                                        p005kotlin.jvm.internal.s.m("mUnder42WeekLinearLayout");
                                        throw null;
                                    }
                                    linearLayout2.setVisibility(0);
                                    cycleDay = cycleSummary.getCycleDay();
                                    if (cycleDay != null) {
                                        iIntValue = cycleDay.intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    currentPhase = cycleSummary.getCurrentPhase();
                                    if (currentPhase != null) {
                                        iIntValue2 = currentPhase.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    qVar.J6(iIntValue, iIntValue2);
                                    context = qVar.getContext();
                                    if (context != null) {
                                        viewPager = qVar.f40802o;
                                        if (viewPager != null) {
                                            p005kotlin.jvm.internal.s.m("mViewPager");
                                            throw null;
                                        }
                                        adapter = viewPager.getAdapter();
                                        if (adapter == null) {
                                            viewPager2 = qVar.f40802o;
                                            if (viewPager2 != null) {
                                                p005kotlin.jvm.internal.s.m("mViewPager");
                                                throw null;
                                            }
                                            androidx.fragment.app.v childFragmentManager3 = qVar.getChildFragmentManager();
                                            childFragmentManager3.getClass();
                                            viewPager2.setAdapter(new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c(childFragmentManager3, context, cVar3, qVar.I6()));
                                            tabLayout = qVar.f40804q;
                                            if (tabLayout != null) {
                                                p005kotlin.jvm.internal.s.m("mTabLayout");
                                                throw null;
                                            }
                                            viewPager3 = qVar.f40802o;
                                            if (viewPager3 != null) {
                                                p005kotlin.jvm.internal.s.m("mViewPager");
                                                throw null;
                                            }
                                            tabLayout.setupWithViewPager(viewPager3);
                                            if (qVar.getActivity() instanceof PregnancyDetailsActivity) {
                                                activity = qVar.getActivity();
                                                activity.getClass();
                                                if (((Boolean) ((PregnancyDetailsActivity) activity).f40498r.getValue()).booleanValue()) {
                                                    viewPager4 = qVar.f40802o;
                                                    if (viewPager4 != null) {
                                                        p005kotlin.jvm.internal.s.m("mViewPager");
                                                        throw null;
                                                    }
                                                    viewPager4.C(1, false);
                                                }
                                            }
                                        } else {
                                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c cVar5 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.c) adapter;
                                            cVar3.getClass();
                                            cVar5.f40808i = cVar3;
                                            cVar5.notifyDataSetChanged();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        qVar.K6();
                    }
                    if (!aVar17.f56602d) {
                        qVar.u6(cx0.b.a(aVar17.f56600b));
                        aVar17.f56602d = true;
                    }
                    qVar.w6();
                }
                return Unit.INSTANCE;
            case 15:
                ((fe2.b) this.f68255b).f70644l = (DateTime) obj;
                return Unit.INSTANCE;
            case 16:
                ((fe2.e0) this.f68255b).f70719h.debug("Cancelled periodicUploadJob");
                return Unit.INSTANCE;
            case 17:
                fk2.a aVar19 = (fk2.a) this.f68255b;
                dk2.h hVar2 = (dk2.h) obj;
                fk2.a.C1463a c1463a = fk2.a.f71937e;
                hVar2.getClass();
                return aVar19.f71938a.invoke(hVar2).booleanValue() ? fk2.c.ACCEPT : fk2.c.NOT_MATCH;
            case 18:
                fk2.b bVar3 = (fk2.b) this.f68255b;
                dk2.h hVar3 = (dk2.h) obj;
                hVar3.getClass();
                return bVar3.f71942a.contains(hVar3.getF60238b()) ? fk2.c.REJECT : fk2.c.NOT_MATCH;
            case 19:
                HashSet hashSet = (HashSet) this.f68255b;
                gy2.c cVar6 = (gy2.c) obj;
                Object obj3 = fl2.a.f72029k;
                cVar6.getClass();
                return Boolean.valueOf(hashSet.contains(Long.valueOf(cVar6.d())));
            case 20:
                c32.k kVar = (c32.k) this.f68255b;
                fq1.i.a aVar20 = fq1.i.f73249d;
                kVar.invoke();
                return Unit.INSTANCE;
            case 21:
                StravaAuthConnectActivity stravaAuthConnectActivity = (StravaAuthConnectActivity) this.f68255b;
                StravaAuthConnectActivity.a aVar21 = StravaAuthConnectActivity.f44933b;
                int i29 = StravaAuthConnectActivity.b.f44935a[((g3) obj).f35300a.ordinal()];
                if (i29 == 1) {
                    stravaAuthConnectActivity.hideProgressOverlay();
                    stravaAuthConnectActivity.finish();
                } else if (i29 == 2) {
                    stravaAuthConnectActivity.hideProgressOverlay();
                    stravaAuthConnectActivity.displayFailedMessage();
                    stravaAuthConnectActivity.finish();
                } else {
                    if (i29 != 3) {
                        u0.r();
                        return null;
                    }
                    stravaAuthConnectActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 22:
                fu0.b bVar4 = (fu0.b) this.f68255b;
                ud.a aVar22 = (ud.a) obj;
                fu0.b.C1485b c1485b = fu0.b.f73492d;
                aVar22.getClass();
                ud.c cVarM0 = aVar22.M0("SELECT * FROM live_event_contacts");
                try {
                    int iB = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
                    int iB2 = ge1.b.B(cVarM0, "first_name");
                    int iB3 = ge1.b.B(cVarM0, "last_name");
                    int iB4 = ge1.b.B(cVarM0, "phones");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM0.J0()) {
                        int i30 = (int) cVarM0.getLong(iB);
                        String strM1 = cVarM0.isNull(iB2) ? null : cVarM0.M1(iB2);
                        String strM2 = cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3);
                        String strM3 = cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4);
                        bVar4.f73495c.getClass();
                        arrayList2.add(new gu0.a(i30, strM1, strM2, strM3 == null ? null : (List) GsonUtil.f47253b.fromJson(strM3, new eu0.d().getType())));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM0.close();
                }
            case 23:
                fv1.g gVar2 = (fv1.g) this.f68255b;
                g3 g3Var = (g3) obj;
                fv1.g.a aVar23 = fv1.g.f73711d;
                if (g3Var != null) {
                    int i34 = fv1.g.b.f73715a[g3Var.f35300a.ordinal()];
                    if (i34 == 1) {
                        g22.e.f(gVar2);
                        androidx.fragment.app.m activity2 = gVar2.getActivity();
                        if (activity2 != null) {
                            activity2.setResult(-1);
                            activity2.finish();
                        }
                    } else if (i34 == 2) {
                        g22.e.f(gVar2);
                        g22.e.a(gVar2, null);
                    } else {
                        if (i34 != 3) {
                            u0.r();
                            return null;
                        }
                        g22.e.l(gVar2);
                    }
                }
                return Unit.INSTANCE;
            case 24:
                return a(obj);
            case 25:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d) this.f68255b;
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar24 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (g3Var2 != null) {
                    int i35 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.b.f46016a[g3Var2.f35300a.ordinal()];
                    if (i35 == 1) {
                        g22.e.f(dVar2);
                        if (p005kotlin.jvm.internal.s.g(g3Var2.f35301b, Boolean.TRUE)) {
                            androidx.fragment.app.m activity3 = dVar2.getActivity();
                            if (activity3 != null) {
                                TrainingPrioritySelectionActivity.a aVar25 = TrainingPrioritySelectionActivity.f46174b;
                                Context contextRequireContext2 = dVar2.requireContext();
                                contextRequireContext2.getClass();
                                fg0.k kVarX4 = dVar2.v6().x4();
                                CalendarItemDTO calendarItemDTO = dVar2.v6().f74005d;
                                boolean z15 = dVar2.v6().f74020t;
                                aVar25.getClass();
                                Intent intentA = TrainingPrioritySelectionActivity.a.a(contextRequireContext2, kVarX4, z15, false);
                                intentA.putExtra("GCM_calendar_items", calendarItemDTO);
                                intentA.putExtra("extra_navigating_from_goal_setup", true);
                                activity3.startActivityForResult(intentA, 124);
                            }
                        } else {
                            androidx.fragment.app.m activity4 = dVar2.getActivity();
                            if (activity4 != null) {
                                activity4.setResult(-1);
                                activity4.finish();
                            }
                        }
                    } else if (i35 == 2) {
                        g22.e.l(dVar2);
                    } else if (i35 != 3) {
                        g22.e.f(dVar2);
                    } else {
                        g22.e.f(dVar2);
                        g22.e.a(dVar2, null);
                    }
                }
                return Unit.INSTANCE;
            case 26:
                return b(obj);
            case 27:
                p1 p1Var = (p1) this.f68255b;
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.A(k0Var2, p1Var.f74517a);
                return Unit.INSTANCE;
            case 28:
                return c(obj);
            default:
                com.garmin.android.apps.connectmobile.userprofile.f fVar3 = (com.garmin.android.apps.connectmobile.userprofile.f) this.f68255b;
                zy0.p pVar = (zy0.p) obj;
                com.garmin.android.apps.connectmobile.userprofile.f.a aVar26 = com.garmin.android.apps.connectmobile.userprofile.f.f46715v;
                v2<T> v2Var = pVar.f207459a;
                zy0.c cVar7 = pVar.f207460b;
                if (v2Var instanceof v2.a) {
                    fVar3.f46720q = true;
                    v2.a aVar27 = (v2.a) v2Var;
                    if (!w2.a(aVar27)) {
                        fVar3.v6(aVar27.f47384b);
                    }
                } else {
                    if (!(v2Var instanceof v2.b)) {
                        u0.r();
                        return null;
                    }
                    if (cVar7 == zy0.c.CACHE) {
                        fVar3.f46720q = true;
                    }
                    T t15 = ((v2.b) v2Var).f47386a;
                    t15.getClass();
                    ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList3 = (ArrayList) t15;
                    com.garmin.android.apps.connectmobile.userprofile.e eVar = fVar3.f46719p;
                    if (eVar != null) {
                        com.garmin.android.apps.connectmobile.userprofile.e.a aVar28 = eVar.f46567c;
                        if ((aVar28 != null ? aVar28.f46571b : null) != arrayList3 && aVar28 != null) {
                            aVar28.f46571b = arrayList3;
                        }
                    }
                    if (eVar != null && ((aVar = eVar.f46567c) == null || !aVar.f46572c)) {
                        if (aVar != null) {
                            aVar.f46572c = true;
                        }
                        z12.h hVar4 = eVar.f46568d;
                        if (hVar4 == null || !hVar4.getF120672c()) {
                            eVar.x(eVar.f46568d, 0);
                        } else {
                            eVar.t(eVar.f46568d);
                        }
                    }
                    fVar3.f33121i.scrollToPosition(0);
                }
                fVar3.f7();
                return Unit.INSTANCE;
        }
    }
}
