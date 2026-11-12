package hp;

import ah2.g;
import am.x0;
import android.content.Context;
import au0.h0;
import au0.z;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import is.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jr.q;
import jr.r;
import jr.s;
import o13.t;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.s0;
import o53.t1;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p13.x;
import r53.j;
import r53.p2;
import r53.q2;
import ss.k;
import u53.o;
import v13.i;
import vb.h;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lhp/c;", "Lr70/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lau0/z;", "liveActivityRepository", "Lah2/g;", "liveActivityFormatter", "Lkr/a;", "activityConfigurationDataSource", "<init>", "(Landroid/content/Context;Lau0/z;Lah2/g;Lkr/a;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r70.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f84895j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f84896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f84897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kr.a f84898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o70.b f84899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f84900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f84902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f84903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f84904i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.presentation.dashboard.stateholder.LiveActivityCardStateHolder$1", f = "LiveActivityCardStateHolder.kt", l = {74, 78}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f84905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i53.d f84906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f84908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f84909e;

        /* JADX INFO: renamed from: hp.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1683a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f84911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f84912b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i53.d<Integer, List<r>> f84913c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sd2.f f84914d;

            /* JADX INFO: renamed from: hp.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.activities.presentation.dashboard.stateholder.LiveActivityCardStateHolder$1$1$1$1$1", f = "LiveActivityCardStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C1684a extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c f84915a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ au0.t f84916b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1684a(c cVar, au0.t tVar, t13.d<? super C1684a> dVar) {
                    super(2, dVar);
                    this.f84915a = cVar;
                    this.f84916b = tVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C1684a(this.f84915a, this.f84916b, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C1684a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    this.f84915a.f84904i.setValue(this.f84916b);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: hp.c$a$a$b */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activities.presentation.dashboard.stateholder.LiveActivityCardStateHolder$1$1$1", f = "LiveActivityCardStateHolder.kt", l = {89}, m = "emit", v = 2)
            public static final class b extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public sf2.a f84917a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f84918b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C1683a<T> f84919c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f84920d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C1683a<? super T> c1683a, t13.d<? super b> dVar) {
                    super(dVar);
                    this.f84919c = c1683a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f84918b = obj;
                    this.f84920d |= Integer.MIN_VALUE;
                    return this.f84919c.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1683a(b0 b0Var, c cVar, i53.d<Integer, ? extends List<r>> dVar, sd2.f fVar) {
                this.f84911a = b0Var;
                this.f84912b = cVar;
                this.f84913c = dVar;
                this.f84914d = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0243  */
            /* JADX WARN: Code duplicated, block: B:139:0x0296  */
            /* JADX WARN: Code duplicated, block: B:149:0x01d9 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code duplicated, block: B:89:0x01db A[LOOP:1: B:67:0x0196->B:89:0x01db, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v13 */
            /* JADX WARN: Type inference failed for: r0v21, types: [t13.d] */
            /* JADX WARN: Type inference failed for: r0v24 */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.CancellationException] */
            /* JADX WARN: Type inference failed for: r0v28 */
            /* JADX WARN: Type inference failed for: r0v29 */
            /* JADX WARN: Type inference failed for: r0v31 */
            /* JADX WARN: Type inference failed for: r0v32 */
            /* JADX WARN: Type inference failed for: r0v33 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r1v1, types: [r53.p2] */
            /* JADX WARN: Type inference failed for: r1v2, types: [o53.c2, o53.p1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(sf2.a aVar, t13.d<? super Unit> dVar) {
                b bVar;
                ?? r14;
                au0.t tVar;
                ?? r15;
                au0.t tVarA;
                ArrayList arrayList;
                au0.t tVar2;
                g gVar;
                String strL;
                boolean z14;
                ls.e eVarA;
                ls.e eVarA2;
                boolean z15;
                ?? r16;
                sf2.a aVar2 = aVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i14 = bVar.f84920d;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bVar.f84920d = i14 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj = bVar.f84918b;
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                int i15 = bVar.f84920d;
                c cVar = this.f84912b;
                int i16 = 1;
                if (i15 == 0) {
                    o13.r.b(obj);
                    if (aVar2 != null) {
                        p2 p2Var = cVar.f84904i;
                        t tVar3 = cVar.f84903h;
                        au0.t tVar4 = (au0.t) p2Var.getValue();
                        int i17 = 0;
                        sd2.f fVar = this.f84914d;
                        boolean zS = fVar != null ? u0.s(fVar.getProductNumber()) : false;
                        if (aVar2 instanceof sf2.a.d) {
                            sf2.a.d dVar2 = (sf2.a.d) aVar2;
                            String str = dVar2.f158880b;
                            if (str == null) {
                                i2.a aVar4 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar4.getClass();
                                i2.a.k(a2Var, "LiveActivityCardStateHolder", "No activity type key found");
                            } else {
                                h0.f12930a.getClass();
                                x0 x0VarA = h0.a.a(str);
                                if (x0VarA == null) {
                                    String strConcat = "No GCMActivityType found for key ".concat(str);
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.f(a2Var2, "LiveActivityCardStateHolder", strConcat);
                                } else {
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.k(a2Var3, "LiveActivityCardStateHolder", "ActivityStarted-type " + x0VarA);
                                    UUID uuid = dVar2.f158879a;
                                    String str2 = dVar2.f158881c;
                                    vf2.p pVar = dVar2.f158882d;
                                    r15 = 0;
                                    tVarA = new au0.t(uuid, x0VarA, str2, pVar != null ? pVar.getName() : null, null, null, null, 112, null);
                                }
                            }
                            tVar = null;
                            tVarA = tVar;
                            r15 = tVar;
                        } else if (aVar2 instanceof sf2.a.e) {
                            sf2.a.e eVar = (sf2.a.e) aVar2;
                            if (eVar.f158888f) {
                                h0.a aVar7 = h0.f12930a;
                                String str3 = eVar.f158884b;
                                aVar7.getClass();
                                x0 x0VarA2 = h0.a.a(str3);
                                if (x0VarA2 == null) {
                                    i2.a aVar8 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar8.getClass();
                                    i2.a.f(a2Var4, "LiveActivityCardStateHolder", "No GCMActivityType found for key " + aVar2 + ".activityTypeKey");
                                } else {
                                    List<rf2.b> list = eVar.f158887e;
                                    boolean z16 = eVar.f158889g;
                                    g gVar2 = cVar.f84897b;
                                    i53.d<Integer, List<r>> dVar3 = this.f84913c;
                                    if (dVar3 == null) {
                                        arrayList = null;
                                        break;
                                    }
                                    arrayList = new ArrayList();
                                    for (Map.Entry<Integer, List<r>> entry : dVar3.entrySet()) {
                                        if (entry.getValue().size() != i16) {
                                            gVar = gVar2;
                                            arrayList = arrayList;
                                            Iterator<T> it = entry.getValue().iterator();
                                            String strL2 = null;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    strL = strL2;
                                                    break;
                                                }
                                                jr.p pVarA = ((r) it.next()).a();
                                                if (pVarA != null && (eVarA = m.a(pVarA)) != null) {
                                                    strL2 = k.l(eVarA, list, gVar.f3293b, (((Boolean) tVar3.getValue()).booleanValue() ? rf2.k.METRIC : rf2.k.STATUTE) == rf2.k.METRIC, z16, zS);
                                                    z14 = strL2 != null;
                                                    if (z14) {
                                                        strL = strL2;
                                                        break;
                                                    }
                                                } else {
                                                    strL2 = strL2;
                                                }
                                                if (z14) {
                                                    strL = strL2;
                                                    break;
                                                }
                                            }
                                        } else {
                                            jr.p pVarA2 = entry.getValue().get(i17).a();
                                            if (pVarA2 == null || (eVarA2 = m.a(pVarA2)) == null) {
                                                arrayList = null;
                                                break;
                                            }
                                            ah2.d dVar4 = gVar2.f3293b;
                                            if ((((Boolean) tVar3.getValue()).booleanValue() ? rf2.k.METRIC : rf2.k.STATUTE) == rf2.k.METRIC) {
                                                gVar = gVar2;
                                                z15 = true;
                                            } else {
                                                gVar = gVar2;
                                                z15 = false;
                                            }
                                            strL = k.l(eVarA2, list, dVar4, z15, z16, zS);
                                        }
                                        if (strL != null) {
                                            arrayList.add(strL);
                                        }
                                        arrayList = arrayList;
                                        gVar2 = gVar;
                                        i16 = 1;
                                        i17 = 0;
                                    }
                                    if (arrayList != null) {
                                        String str4 = (String) p13.h0.e0(0, arrayList);
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        String str5 = (String) p13.h0.e0(1, arrayList);
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        String str6 = (String) p13.h0.e0(2, arrayList);
                                        String str7 = str6 != null ? str6 : "";
                                        if (tVar4 != null) {
                                            tVar2 = au0.t.a(tVar4, str4, str5, str7, 15);
                                        } else {
                                            UUID uuid2 = eVar.f158883a;
                                            String str8 = eVar.f158885c;
                                            vf2.p pVar2 = eVar.f158886d;
                                            tVar2 = new au0.t(uuid2, x0VarA2, str8, pVar2 != null ? pVar2.getName() : null, null, null, null, 112, null);
                                        }
                                        r15 = 0;
                                        tVarA = tVar2;
                                    } else {
                                        tVar = null;
                                        tVarA = tVar;
                                        r15 = tVar;
                                    }
                                }
                            } else {
                                i2.a aVar9 = i2.f36769a;
                                a2 a2Var5 = a2.GENERAL;
                                aVar9.getClass();
                                i2.a.k(a2Var5, "LiveActivityCardStateHolder", "Unsupported activity type. Dismiss home card.");
                            }
                            tVar = null;
                            tVarA = tVar;
                            r15 = tVar;
                        } else if (aVar2 instanceof sf2.a.C3001a) {
                            r15 = 0;
                            tVarA = null;
                        } else if (!(aVar2 instanceof sf2.a.b)) {
                            tVar = null;
                            r15 = 0;
                            tVar = null;
                            if (aVar2 instanceof sf2.a.c) {
                                if (tVar4 != null) {
                                    tVarA = au0.t.a(tVar4, null, null, null, 127);
                                }
                            } else if (!aVar2.equals(sf2.a.f.f158890a)) {
                                lc.u0.r();
                                return null;
                            }
                            tVarA = tVar;
                            r15 = tVar;
                        } else if (tVar4 != null) {
                            r15 = 0;
                            tVarA = au0.t.a(tVar4, null, null, null, 127);
                        } else {
                            tVar = null;
                            tVarA = tVar;
                            r15 = tVar;
                        }
                        x53.c cVar2 = s0.f129406a;
                        t1 t1Var = o.f168762a;
                        C1684a c1684a = new C1684a(cVar, tVarA, r15);
                        bVar.f84917a = aVar2;
                        bVar.f84920d = 1;
                        r14 = r15;
                        if (ge1.b.e0(t1Var, c1684a, bVar) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        r14 = 0;
                    }
                    cVar.f84904i.setValue(r14);
                    r16 = cVar.f84902g;
                    if (r16 != 0) {
                        r16.c(r14);
                    }
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = bVar.f84917a;
                o13.r.b(obj);
                r14 = 0;
                if (aVar2 == null) {
                    cVar.f84904i.setValue(r14);
                    r16 = cVar.f84902g;
                    if (r16 != 0) {
                        r16.c(r14);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.presentation.dashboard.stateholder.LiveActivityCardStateHolder$1$1$device$1", f = "LiveActivityCardStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super sd2.f>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f84921a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f84921a = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f84921a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                rs2.c cVar = (rs2.c) this.f84921a.f84896a.f13016o.f150540a.getValue();
                if (cVar == null) {
                    return null;
                }
                long f92746j = cVar.getF92746j();
                rd2.f.a().f152045a.getClass();
                return rd2.j.i(f92746j, null);
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f84909e = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
        
            if (r4.collect(r9, r20) == r2) goto L76;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            c cVar;
            q qVar;
            i53.d dVarG;
            int i14;
            Object objE0;
            List<r> listG;
            Object next;
            Object next2;
            Object next3;
            b0 b0Var = (b0) this.f84909e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f84908d;
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = this.f84907c;
                    dVarG = this.f84906b;
                    cVar = this.f84905a;
                    o13.r.b(obj);
                    i14 = i16;
                    objE0 = obj;
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
            o13.r.b(obj);
            cVar = c.this;
            x0 x0Var = cVar.f84896a.f13019r;
            if (x0Var == null) {
                return Unit.INSTANCE;
            }
            List<q> listA = cVar.f84898c.a(x0Var).a();
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                } while (((q) next3).d() != s.Home);
                qVar = (q) next3;
            } else {
                qVar = null;
            }
            if (qVar == null || (listG = qVar.g()) == null) {
                dVarG = null;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i17 = 0;
                for (Object obj2 : listG) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        x.q();
                        throw null;
                    }
                    r rVar = (r) obj2;
                    if (rVar.getZOrder() == null) {
                        linkedHashMap.put(Integer.valueOf(i17), w.c(rVar));
                    } else {
                        Iterator it3 = linkedHashMap.values().iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            Iterator it4 = ((List) next).iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                Integer zOrder = ((r) next2).getZOrder();
                                int iIntValue = rVar.getZOrder().intValue();
                                if (zOrder != null && zOrder.intValue() == iIntValue) {
                                    break;
                                }
                            }
                        } while (next2 == null);
                        Collection collection = (Collection) next;
                        if (collection == null || collection.isEmpty()) {
                            Integer numValueOf = Integer.valueOf(i17);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : listG) {
                                Integer zOrder2 = ((r) obj3).getZOrder();
                                int iIntValue2 = rVar.getZOrder().intValue();
                                if (zOrder2 != null && zOrder2.intValue() == iIntValue2) {
                                    arrayList.add(obj3);
                                }
                            }
                            linkedHashMap.put(numValueOf, arrayList);
                        }
                    }
                    i17 = i18;
                }
                dVarG = i53.a.g(linkedHashMap);
            }
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(cVar, null);
            this.f84909e = b0Var;
            this.f84905a = cVar;
            this.f84906b = dVarG;
            i14 = 0;
            this.f84907c = 0;
            this.f84908d = 1;
            objE0 = ge1.b.e0(bVar, bVar2, this);
            if (objE0 != aVar) {
            }
            return aVar;
            p2 p2Var = cVar.f84896a.f13010i;
            C1683a c1683a = new C1683a(b0Var, cVar, dVarG, (sd2.f) objE0);
            this.f84909e = null;
            this.f84905a = null;
            this.f84906b = null;
            this.f84907c = i14;
            this.f84908d = 2;
        }
    }

    static {
        new b(null);
    }

    public c(Context context, z zVar, g gVar, kr.a aVar) {
        context.getClass();
        zVar.getClass();
        gVar.getClass();
        aVar.getClass();
        this.f84896a = zVar;
        this.f84897b = gVar;
        this.f84898c = aVar;
        o70.b bVar = o70.b.LIVE_ACTIVITY;
        this.f84899d = bVar;
        this.f84900e = new DateTime();
        this.f84901f = bVar.f129925a;
        context.getString(R.string.no_value).getClass();
        this.f84903h = o13.m.b(new ha0.a(22));
        this.f84904i = q2.a(null);
        x53.c cVar = s0.f129406a;
        this.f84902g = ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(null), 3);
    }

    @Override // r70.s
    public final String a() {
        return this.f84899d.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF84890e() {
        return this.f84900e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF84891f() {
        return this.f84901f;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF84889d() {
        return this.f84899d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhp/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
