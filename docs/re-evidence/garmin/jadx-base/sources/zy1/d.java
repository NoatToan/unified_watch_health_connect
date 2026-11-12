package zy1;

import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.j;
import fg0.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzy1/d;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends j0 {
    public static final /* synthetic */ int Q0 = 0;
    public dg0.a I;
    public final t J0;
    public final y0 K0;
    public final w0 L0;
    public final w0 M0;
    public final w0 N0;
    public final y0<g3<k>> O0;
    public k P;
    public final y0 P0;
    public List<k> T;
    public final t X = m.b(new zu1.a(2));
    public final y0 Y = a5();
    public final t Z = m.b(new zu1.a(3));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0 f207469k0 = Z4();
    public final t H0 = m.b(new zu1.a(4));
    public final y0 I0 = b5();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$saveSupportingEventsIfChanged$1", f = "EventDashBoardViewModel.kt", l = {390}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f207470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection f207471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f207472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection f207473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f207474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f207475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f207476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f207477h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<k> f207479j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$saveSupportingEventsIfChanged$1$result$1$1", f = "EventDashBoardViewModel.kt", l = {377, 386}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f207480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f207481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f207482c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f207481b = kVar;
                this.f207482c = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f207481b, this.f207482c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:29:0x009c  */
            /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
            
                if (r2 == r1) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
            
                if (r2 == r1) goto L31;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objZ4;
                Object objV4;
                j eventCustomization;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f207480a;
                d dVar = this.f207482c;
                k kVarD = this.f207481b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        objZ4 = obj;
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                        objV4 = obj;
                    }
                    return (v2) objV4;
                }
                r.b(obj);
                gg0.f eventType = kVarD.getEventType();
                if (eventType != null && eventType.g()) {
                    this.f207480a = 1;
                    objZ4 = dVar.z4(kVarD, this);
                } else {
                    if (kVarD != null) {
                        return null;
                    }
                    this.f207480a = 2;
                    objV4 = dVar.V4(kVarD, this);
                }
                return aVar;
                k kVar = (k) objZ4;
                j eventCustomization2 = kVarD.getEventCustomization();
                if (eventCustomization2 == null) {
                    eventCustomization2 = new j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
                kVarD = kVar != null ? k.d(kVar, null, null, null, null, null, null, (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : j.b(eventCustomization, null, null, eventCustomization2.getIsPrimaryEvent(), eventCustomization2.getIsTrainingEvent(), eventCustomization2.getTrainingPlanId(), eventCustomization2.getTrainingPlanType(), 7963), -16777217) : null;
                if (kVarD != null) {
                    return null;
                }
                this.f207480a = 2;
                objV4 = dVar.V4(kVarD, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<k> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f207479j = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = d.this.new b(this.f207479j, dVar);
            bVar.f207477h = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0058  */
        /* JADX WARN: Code duplicated, block: B:13:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0084 -> B:15:0x0085). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zy1.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$updatePrimaryEvent$1", f = "EventDashBoardViewModel.kt", l = {423, 435}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f207483a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f207485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f207485c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f207485c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r7 == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f207483a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                this.f207483a = 1;
                obj = dVar.z4(this.f207485c, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                int i15 = d.Q0;
                y0<g3<Boolean>> y0VarB5 = dVar.b5();
                g3.a aVar2 = g3.f35298f;
                Boolean bool = Boolean.TRUE;
                aVar2.getClass();
                y0VarB5.m(g3.a.d(bool));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                int i16 = d.Q0;
                dVar.b5().m(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
            k kVar = (k) obj;
            if (kVar == null) {
                int i17 = d.Q0;
                dVar.b5().m(g3.a.a(g3.f35298f, null, null, null, null, 15));
                return Unit.INSTANCE;
            }
            j eventCustomization = kVar.getEventCustomization();
            if (eventCustomization != null) {
                Boolean bool2 = Boolean.TRUE;
                eventCustomization.H(bool2);
                eventCustomization.G(bool2);
            }
            this.f207483a = 2;
            obj = dVar.V4(kVar, this);
        }
    }

    static {
        new a(null);
    }

    public d() {
        t tVarB = m.b(new zu1.a(5));
        this.J0 = tVarB;
        this.K0 = (y0) tVarB.getValue();
        w0 w0VarA = t1.a(Z4(), new zw.b(this, 5));
        this.L0 = w0VarA;
        this.M0 = t1.a(Z4(), new zw.b(this, 6));
        this.N0 = t1.b(w0VarA, new yw2.h(this, 23));
        y0<g3<k>> y0Var = new y0<>();
        this.O0 = y0Var;
        this.P0 = y0Var;
        ge1.b.T(v1.a(this), null, null, new g(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r7 == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r7 == r10) goto L25;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X4(d dVar, Long l14, String str, v13.c cVar) {
        f fVar;
        v2 v2Var;
        zf0.d dVar2 = dVar.f204384a;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f207492c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f207492c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar, cVar);
            }
        } else {
            fVar = new f(dVar, cVar);
        }
        Object objD = fVar.f207490a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f207492c;
        if (i15 == 0) {
            r.b(objD);
            if (str != null) {
                fVar.f207492c = 1;
                objD = dVar2.f(str, fVar);
            } else {
                if (l14 == null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "EventDashBoardViewModel", "Both eventID and sharableEventUUID are null");
                    return null;
                }
                long jLongValue = l14.longValue();
                fVar.f207492c = 2;
                objD = dVar2.d(jLongValue, fVar);
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(objD);
            v2Var = (v2) objD;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
            v2Var = (v2) objD;
        }
        if (v2Var instanceof v2.b) {
            return (k) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String string = ((v2.a) v2Var).f47383a.toString();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var2, "EventDashBoardViewModel", string);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static final Object Y4(d dVar, v13.c cVar) {
        h hVar;
        ww1.g gVar;
        int i14;
        long j8;
        bz1.b bVar;
        int i15;
        dVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i16 = hVar.f207522g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                hVar.f207522g = i16 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar, cVar);
            }
        } else {
            hVar = new h(dVar, cVar);
        }
        Object objS4 = hVar.f207520e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = hVar.f207522g;
        if (i17 == 0) {
            r.b(objS4);
            g3<bz1.b> g3VarD = dVar.Z4().d();
            gVar = (g3VarD == null || (bVar = g3VarD.f35301b) == null) ? null : bVar.f22294f;
            Long l14 = gVar != null ? gVar.f187764b : null;
            ?? r14 = (gVar != null ? gVar.f187766d : null) != null ? 1 : 0;
            if (l14 == null) {
                return new v2.a(new IllegalStateException("Training Plan id is null"), null, null, 6, null);
            }
            long jLongValue = l14.longValue();
            long jLongValue2 = l14.longValue();
            hVar.f207516a = gVar;
            hVar.f207517b = r14;
            hVar.f207519d = jLongValue;
            hVar.f207518c = 0;
            hVar.f207522g = 1;
            objS4 = dVar.S4(jLongValue2, hVar, r14);
            if (objS4 != aVar) {
                i14 = 0;
                j8 = jLongValue;
                i15 = r14;
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                r.b(objS4);
                return objS4;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = hVar.f207518c;
        j8 = hVar.f207519d;
        int i18 = hVar.f207517b;
        gVar = hVar.f207516a;
        r.b(objS4);
        i15 = i18;
        v2 v2Var = (v2) objS4;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        k kVar = gVar.f187767e;
        if (kVar == null) {
            return (v2.b) v2Var;
        }
        cg0.a aVar2 = (cg0.a) dVar.f204401r.getValue();
        dg0.a aVar3 = dg0.a.NO_PRIORITY;
        hVar.f207516a = null;
        hVar.f207517b = i15;
        hVar.f207519d = j8;
        hVar.f207518c = i14;
        hVar.f207522g = 2;
        aVar2.getClass();
        Object objB = aVar2.b(cg0.a.a(kVar, aVar3, true), hVar);
        return objB == aVar ? aVar : objB;
    }

    public final y0<g3<bz1.b>> Z4() {
        return (y0) this.Z.getValue();
    }

    public final y0<String> a5() {
        return (y0) this.X.getValue();
    }

    public final y0<g3<Boolean>> b5() {
        return (y0) this.H0.getValue();
    }

    public final void c5(Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        boolean zEquals = bool.equals(bool2);
        t tVar = this.J0;
        if (zEquals) {
            ((y0) tVar.getValue()).m(bool2);
        } else {
            ((y0) tVar.getValue()).m(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d5(List<k> list) {
        LinkedHashMap linkedHashMap;
        k kVar;
        bz1.a aVar;
        List<k> list2;
        list.getClass();
        g3 g3Var = (g3) this.M0.d();
        if (g3Var == null || (aVar = (bz1.a) g3Var.f35301b) == null || (list2 = aVar.f22287c) == null) {
            linkedHashMap = null;
        } else {
            int iA = t0.a(y.r(list2, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list2) {
                linkedHashMap.put(((k) obj).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            k kVar2 = (k) obj2;
            if (!s.g(kVar2.getEventCustomization(), (linkedHashMap == null || (kVar = (k) linkedHashMap.get(kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String())) == null) ? null : kVar.getEventCustomization())) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            ge1.b.T(v1.a(this), null, null, new b(arrayList, null), 3);
            return;
        }
        y0<g3<Boolean>> y0VarB5 = b5();
        g3.a aVar2 = g3.f35298f;
        Boolean bool = Boolean.FALSE;
        aVar2.getClass();
        y0VarB5.m(g3.a.d(bool));
    }

    public final boolean e5(boolean z14) {
        bz1.b bVar;
        ww1.g gVar;
        ww1.i iVar;
        bz1.b bVar2;
        ww1.g gVar2;
        bz1.b bVar3;
        ww1.g gVar3;
        ww1.i iVar2;
        bz1.b bVar4;
        ww1.g gVar4;
        g3<bz1.b> g3VarD = Z4().d();
        boolean z15 = (g3VarD == null || (bVar4 = g3VarD.f35301b) == null || (gVar4 = bVar4.f22294f) == null) ? false : gVar4.f187763a;
        g3<bz1.b> g3VarD2 = Z4().d();
        boolean zM = (g3VarD2 == null || (bVar3 = g3VarD2.f35301b) == null || (gVar3 = bVar3.f22294f) == null || (iVar2 = gVar3.f187765c) == null) ? false : iVar2.m();
        g3<bz1.b> g3VarD3 = Z4().d();
        vt1.m mVarF = null;
        boolean z16 = ((g3VarD3 == null || (bVar2 = g3VarD3.f35301b) == null || (gVar2 = bVar2.f22294f) == null) ? null : gVar2.f187766d) != null;
        g3<bz1.b> g3VarD4 = Z4().d();
        if (g3VarD4 != null && (bVar = g3VarD4.f35301b) != null && (gVar = bVar.f22294f) != null && (iVar = gVar.f187765c) != null) {
            mVarF = iVar.f();
        }
        return (z15 && z14) || (!z14 && (z16 || (mVarF == vt1.m.ITP) || zM));
    }

    public final void f5(k kVar) {
        kVar.getClass();
        b5().m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new c(kVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzy1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PAST_EVENTS_START_DATE", "", "LIMIT_MAX_PAST_EVENTS", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
