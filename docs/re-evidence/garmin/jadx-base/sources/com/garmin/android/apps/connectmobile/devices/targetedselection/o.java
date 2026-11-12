package com.garmin.android.apps.connectmobile.devices.targetedselection;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$checkDeviceCapability$1", f = "TDSViewModel.kt", l = {459, 539}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f34663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f34666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd0.d f34667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.b f34668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f34669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f34670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m52.k f34671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f34672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k30.h f34673k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "", "Lsd2/f;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$checkDeviceCapability$1$devices$1", f = "TDSViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super List<sd2.f>>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<sd2.f>> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            rd2.f.a().f152045a.getClass();
            return rd2.j.d();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Lbz/d;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$checkDeviceCapability$1$tasks$1$1", f = "TDSViewModel.kt", l = {468}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends Long, ? extends bz.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sd2.f f34675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fd0.d f34676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m52.k f34677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f34678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f0 f34679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k30.h f34680g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sd2.f fVar, fd0.d dVar, m52.k kVar, n nVar, f0 f0Var, k30.h hVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f34675b = fVar;
            this.f34676c = dVar;
            this.f34677d = kVar;
            this.f34678e = nVar;
            this.f34679f = f0Var;
            this.f34680g = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f34675b, this.f34676c, this.f34677d, this.f34678e, this.f34679f, this.f34680g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Long, ? extends bz.d>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            k30.h hVar;
            Integer numValueOf;
            Object objX4;
            m52.k kVar;
            boolean z14;
            m52.k kVar2;
            bz.d.C0336d c0336d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34674a;
            sd2.f fVar = this.f34675b;
            boolean z15 = true;
            if (i14 == 0) {
                r.b(obj);
                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                String strValueOf = String.valueOf(fVar.getUnitID());
                this.f34674a = 1;
                obj = dVarA.c(strValueOf, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return new o13.p(new Long(fVar.getUnitID()), bz.d.f22264c);
                }
                u0.r();
                return null;
            }
            fd0.d dVar = fd0.d.WORKOUTS;
            n nVar = this.f34678e;
            fd0.d dVar2 = this.f34676c;
            if (dVar2 == dVar && (kVar = this.f34677d) != null) {
                o52.d dVar3 = nVar.f34637e;
                o52.d dVar4 = nVar.f34637e;
                com.garmin.android.apps.connectmobile.devices.model.m mVar = (com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a;
                dVar3.getClass();
                boolean zA = o52.d.a(mVar, kVar);
                Boolean workoutCapable = mVar.getWorkoutCapable();
                Boolean bool = Boolean.TRUE;
                if (s.g(workoutCapable, bool) && zA) {
                    m52.k kVar3 = m52.k.f116761w;
                    f0 f0Var = this.f34679f;
                    if (kVar != kVar3 && f0Var.f48167e && !s.g(mVar.getEnhancedWorkoutStepCapable(), bool)) {
                        objX4 = bz.d.f22264c;
                    } else if ((s.g(mVar.getWorkoutAudioPromptsCapable(), bool) || !f0Var.f48166d) && ((s.g(mVar.getSwimWorkout2Capable(), bool) || !f0Var.f48173k) && (s.g(mVar.getSkipLastRestStepCapable(), bool) || !f0Var.f48168f))) {
                        boolean z16 = f0Var.f48165c;
                        List<m52.k> list = f0Var.f48176n;
                        if ((z16 && !s.g(mVar.getBenchmarkExerciseCapable(), bool)) || kVar != m52.k.A) {
                            objX4 = bz.d.f22262a;
                        } else if (f0Var.f48174l) {
                            if (list != null && list.isEmpty()) {
                                z14 = true;
                                break;
                            }
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z14 = true;
                                    break;
                                }
                                m52.k kVar4 = (m52.k) it.next();
                                dVar4.getClass();
                                if (!o52.d.a(mVar, kVar4)) {
                                    z14 = false;
                                    break;
                                }
                            }
                            if (list != null && list.isEmpty()) {
                                z15 = false;
                                break;
                            }
                            Iterator<T> it3 = list.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    z15 = false;
                                    break;
                                }
                                kVar2 = (m52.k) it3.next();
                                dVar4.getClass();
                            } while (!o52.d.a(mVar, kVar2));
                            if (z14) {
                                objX4 = bz.d.f22262a;
                            } else {
                                objX4 = z15 ? bz.d.f22263b : bz.d.f22264c;
                            }
                        } else {
                            objX4 = bz.d.f22264c;
                        }
                    } else {
                        List<String> list2 = f0Var.f48175m;
                        Integer numValueOf2 = Integer.valueOf(R.string.msg_workout_device_does_not_support_more_than_three_features_long);
                        Integer numValueOf3 = Integer.valueOf(R.string.msg_workout_device_does_not_support_two_or_three_features_long);
                        int size = list2.size();
                        if (size == 1) {
                            c0336d = bz.d.f22263b;
                            c0336d.f22267f = Integer.valueOf(R.string.msg_workout_device_does_not_support_one_feature_long);
                            c0336d.f22268g = Integer.valueOf(R.string.msg_workout_device_does_not_support_up_to_three_features_short);
                            c0336d.f22269h = list2;
                        } else if (size == 2) {
                            c0336d = bz.d.f22263b;
                            c0336d.f22267f = numValueOf3;
                            c0336d.f22268g = numValueOf3;
                            c0336d.f22269h = list2;
                        } else if (size != 3) {
                            bz.d.C0336d c0336d2 = bz.d.f22263b;
                            c0336d2.f22267f = numValueOf2;
                            c0336d2.f22268g = numValueOf2;
                            objX4 = c0336d2;
                        } else {
                            c0336d = bz.d.f22263b;
                            c0336d.f22267f = numValueOf3;
                            c0336d.f22268g = numValueOf3;
                            c0336d.f22269h = list2;
                        }
                        objX4 = c0336d;
                    }
                } else {
                    objX4 = bz.d.f22264c;
                }
            } else if (dVar2 == fd0.d.PACEPRO) {
                objX4 = n.x4(nVar, ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getPacebandCapable());
            } else if (dVar2 == fd0.d.POWER_GUIDE) {
                objX4 = n.x4(nVar, ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getPowerGuidanceCapable());
            } else if (dVar2 == fd0.d.GROUP_RIDE) {
                objX4 = n.x4(nVar, ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getGroupTrack2Capable());
            } else if (dVar2 != fd0.d.COURSES || (hVar = this.f34680g) == null) {
                objX4 = (dVar2 == fd0.d.ACTIVITY_TO_COURSE || dVar2 == fd0.d.TRAILS) ? n.x4(nVar, ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getCourseCapable()) : bz.d.f22264c;
            } else {
                com.garmin.android.apps.connectmobile.devices.model.m mVar2 = (com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a;
                nVar.getClass();
                mVar2.getClass();
                if (s.g(mVar2.getCourseCapable(), Boolean.TRUE)) {
                    boolean z17 = hVar.f102550b;
                    boolean z18 = hVar.f102549a;
                    ArrayList arrayList = new ArrayList();
                    if (z17 && s.g(mVar2.getCourseCapable(), Boolean.FALSE)) {
                        String string = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a().getString(fd0.a.COURSE_PLANNER.f70449a);
                        string.getClass();
                        arrayList.add(string);
                    }
                    if (z18 && s.g(mVar2.getLapByCoursePointsCapable(), Boolean.FALSE)) {
                        String string2 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a().getString(fd0.a.AUTO_LAP_BY_TIMING_GATES.f70449a);
                        string2.getClass();
                        arrayList.add(string2);
                    }
                    if (arrayList.size() == 1) {
                        numValueOf = Integer.valueOf(R.string.incompatible_single_feature_message);
                    } else if (arrayList.size() == 2) {
                        numValueOf = Integer.valueOf(R.string.incompatible_2_features_message);
                    } else if (arrayList.size() >= 3) {
                        numValueOf = Integer.valueOf(R.string.incompatible_generic_features_message);
                        arrayList = null;
                    } else {
                        numValueOf = null;
                        arrayList = null;
                    }
                    o13.p pVar = numValueOf != null ? new o13.p(numValueOf, arrayList) : null;
                    if (pVar == null) {
                        objX4 = bz.d.f22262a;
                    } else {
                        bz.d.C0336d c0336d3 = bz.d.f22263b;
                        c0336d3.f22267f = (Integer) pVar.f128594a;
                        c0336d3.f22269h = (List) pVar.f128595b;
                        objX4 = c0336d3;
                    }
                } else {
                    objX4 = bz.d.f22264c;
                }
            }
            return new o13.p(new Long(fVar.getUnitID()), objX4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, fd0.d dVar, com.garmin.android.library.mapsdkadapter.i.b bVar, boolean z14, boolean z15, m52.k kVar, f0 f0Var, k30.h hVar, t13.d<? super o> dVar2) {
        super(2, dVar2);
        this.f34666d = nVar;
        this.f34667e = dVar;
        this.f34668f = bVar;
        this.f34669g = z14;
        this.f34670h = z15;
        this.f34671i = kVar;
        this.f34672j = f0Var;
        this.f34673k = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f34666d, this.f34667e, this.f34668f, this.f34669g, this.f34670h, this.f34671i, this.f34672j, this.f34673k, dVar);
        oVar.f34665c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r1 == r2) goto L28;
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
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        List<? extends sd2.f> list;
        Object objO;
        b0 b0Var = (b0) this.f34665c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f34664b;
        n nVar = this.f34666d;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f34665c = b0Var;
            this.f34664b = 1;
            objE0 = ge1.b.e0(bVar, aVar2, this);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objE0 = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List<? extends sd2.f> list2 = this.f34663a;
            r.b(obj);
            list = list2;
            objO = obj;
        }
        for (o13.p pVar : (List) objO) {
            nVar.f34634b.f(((Number) pVar.f128594a).longValue(), pVar.f128595b);
        }
        this.f34666d.y4(this.f34667e, this.f34668f, this.f34669g, this.f34670h, list);
        return Unit.INSTANCE;
        list = (List) objE0;
        if (list != null && !list.isEmpty()) {
            y0<p> y0Var = nVar.f34638f;
            p pVarD = y0Var.d();
            y0Var.m(pVarD != null ? p.a(pVarD, true, null, null, null, 30) : null);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                sd2.f fVar = (sd2.f) it.next();
                x53.c cVar2 = s0.f129406a;
                arrayList.add(ge1.b.j(b0Var, x53.b.f189152a, null, new b(fVar, this.f34667e, this.f34671i, this.f34666d, this.f34672j, this.f34673k, null), 2));
            }
            this.f34665c = null;
            this.f34663a = list;
            this.f34664b = 2;
            objO = g8.i.o(arrayList, this);
        }
        this.f34666d.y4(this.f34667e, this.f34668f, this.f34669g, this.f34670h, list);
        return Unit.INSTANCE;
    }
}
