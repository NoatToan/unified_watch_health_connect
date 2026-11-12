package lw1;

import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p13.y;
import r53.p2;
import rt1.q;
import tw1.m;
import tw1.n;
import tw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanViewModel$loadPlanSelectionData$1", f = "FindTrainingPlanViewModel.kt", l = {115, 133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f115094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f115095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f115096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f115097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f115100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f115101h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((g) t7).f115119a.f106981e), Integer.valueOf(((g) t14).f115119a.f106981e));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanViewModel$loadPlanSelectionData$1$primaryEventCall$1", f = "FindTrainingPlanViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends fg0.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f115103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f115103b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f115103b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends fg0.k>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115102a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kw1.a aVar2 = this.f115103b.f115108a;
            this.f115102a = 1;
            aVar2.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new kw1.c(aVar2, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanViewModel$loadPlanSelectionData$1$trainingPlansResult$1", f = "FindTrainingPlanViewModel.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f115105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f115105b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f115105b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends o>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115104a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kw1.e eVar = this.f115105b.f115109b;
            this.f115104a = 1;
            eVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new kw1.d(eVar, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanViewModel$loadPlanSelectionData$1$triathlonTypesCall$1", f = "FindTrainingPlanViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f115107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f115107b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f115107b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115106a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kw1.f fVar = this.f115107b.f115110c;
            this.f115106a = 1;
            fVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new kw1.g(fVar, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f115101h = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f115101h, dVar);
        eVar.f115100g = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x0202  */
    /* JADX WARN: Code duplicated, block: B:111:0x0208  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e A[EDGE_INSN: B:113:0x020e->B:126:0x0238 BREAK  A[LOOP:5: B:115:0x0215->B:253:0x0215]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0211  */
    /* JADX WARN: Code duplicated, block: B:117:0x021b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0227  */
    /* JADX WARN: Code duplicated, block: B:120:0x022c  */
    /* JADX WARN: Code duplicated, block: B:127:0x023d  */
    /* JADX WARN: Code duplicated, block: B:132:0x024e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0252  */
    /* JADX WARN: Code duplicated, block: B:137:0x025b  */
    /* JADX WARN: Code duplicated, block: B:139:0x026f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0274  */
    /* JADX WARN: Code duplicated, block: B:143:0x0278  */
    /* JADX WARN: Code duplicated, block: B:145:0x0280  */
    /* JADX WARN: Code duplicated, block: B:150:0x0291 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:172:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:179:0x0310 A[LOOP:6: B:177:0x030a->B:179:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x0337  */
    /* JADX WARN: Code duplicated, block: B:189:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x034e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0361 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0363  */
    /* JADX WARN: Code duplicated, block: B:203:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0380  */
    /* JADX WARN: Code duplicated, block: B:208:0x0383 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0387  */
    /* JADX WARN: Code duplicated, block: B:212:0x038b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0392  */
    /* JADX WARN: Code duplicated, block: B:218:0x039c  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:228:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:229:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[LOOP:4: B:103:0x01e9->B:249:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0215 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[LOOP:8: B:216:0x0396->B:261:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objX4;
        boolean zBooleanValue;
        i0 i0VarJ;
        Object objC;
        j0 j0Var;
        v2 v2Var;
        v2 v2Var2;
        boolean z14;
        v2 v2Var3;
        Object objAwait;
        List list;
        Object objAwait2;
        v2 v2Var4;
        boolean z15;
        LinkedHashSet<kw1.h> linkedHashSet;
        LinkedHashSet linkedHashSet2;
        boolean z16;
        kw1.h hVar;
        fg0.k kVar;
        boolean z17;
        boolean zContains;
        fg0.k kVar2;
        ArrayList arrayList;
        List listN0;
        p2 p2Var;
        Object value;
        lw1.a aVar;
        boolean z18;
        gg0.f eventType;
        boolean zContains2;
        gg0.f eventType2;
        boolean z19;
        boolean z24;
        Iterator it;
        boolean z25;
        gg0.f eventType3;
        gg0.f eventType4;
        gg0.f eventType5;
        gg0.f eventType6;
        o oVar;
        List<m> listA;
        List<m> listA2;
        ?? arrayList2;
        List<m> listA3;
        Boolean boolValueOf;
        Iterator it3;
        n trainingPlanType;
        vt1.o oVarB;
        boolean z26;
        Iterable iterable;
        Iterator it4;
        boolean z27;
        n trainingPlanType2;
        vt1.o oVarB2;
        n trainingPlanType3;
        vt1.o oVarB3;
        Iterator it5;
        Object next;
        kw1.h hVar2;
        b0 b0Var = (b0) this.f115100g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115099f;
        f fVar = this.f115101h;
        if (i14 == 0) {
            r.b(obj);
            fVar.z4();
            this.f115100g = b0Var;
            this.f115099f = 1;
            objX4 = fVar.x4(this);
            if (objX4 != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            r.b(obj);
            objX4 = obj;
        } else {
            if (i14 == 2) {
                boolean z28 = this.f115098e;
                i0 i0Var = this.f115095b;
                j0Var = this.f115094a;
                r.b(obj);
                i0VarJ = i0Var;
                zBooleanValue = z28;
                objC = obj;
                v2Var = (v2) objC;
                if (j0Var != null) {
                    boolean z29 = zBooleanValue;
                    v2Var2 = v2Var;
                    z14 = z29;
                    v2Var3 = null;
                    if (i0VarJ != null) {
                        this.f115100g = null;
                        this.f115094a = null;
                        this.f115095b = null;
                        this.f115096c = v2Var2;
                        this.f115097d = v2Var3;
                        this.f115098e = z14;
                        this.f115099f = 4;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar2) {
                            v2Var4 = v2Var3;
                        }
                    } else {
                        list = null;
                    }
                    z15 = z14;
                    linkedHashSet = new LinkedHashSet();
                    linkedHashSet2 = new LinkedHashSet();
                    fVar.getClass();
                    if (v2Var2 instanceof v2.b) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        boolean zL0 = k1.f37122a.l0();
                        oVar = (o) ((v2.b) v2Var2).f47386a;
                        listA = oVar.a();
                        if (listA != null) {
                            for (m mVar : listA) {
                                kw1.h.a aVar3 = kw1.h.f106969g;
                                trainingPlanType3 = mVar.getTrainingPlanType();
                                if (trainingPlanType3 != null) {
                                    oVarB3 = trainingPlanType3.b();
                                } else {
                                    oVarB3 = null;
                                }
                                aVar3.getClass();
                                if (oVarB3 == null) {
                                    hVar2 = null;
                                } else {
                                    vt1.o.f180174e.getClass();
                                    if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3)) {
                                        it5 = kw1.h.f106976n.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it5.next();
                                        } while (((kw1.h) next).f106980d != oVarB3);
                                        hVar2 = (kw1.h) next;
                                    } else {
                                        it5 = kw1.h.f106976n.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it5.next();
                                        } while (((kw1.h) next).f106980d != oVarB3);
                                        hVar2 = (kw1.h) next;
                                    }
                                }
                                if (hVar2 != null) {
                                    linkedHashSet.add(hVar2);
                                }
                            }
                        }
                        listA2 = oVar.a();
                        if (listA2 != null) {
                            arrayList2 = new ArrayList();
                            for (m mVar2 : listA2) {
                                vt1.o.a aVar4 = vt1.o.f180174e;
                                trainingPlanType2 = mVar2.getTrainingPlanType();
                                if (trainingPlanType2 != null) {
                                    oVarB2 = trainingPlanType2.b();
                                } else {
                                    oVarB2 = null;
                                }
                                aVar4.getClass();
                                if (oVarB2 != null) {
                                    mVar2 = null;
                                } else {
                                    mVar2 = null;
                                }
                                if (mVar2 != null) {
                                    arrayList2.add(mVar2);
                                }
                            }
                        } else {
                            arrayList2 = p13.j0.f134944a;
                        }
                        for (kw1.h hVar3 : linkedHashSet) {
                            if (hVar3 == kw1.h.f106974l) {
                                iterable = (Iterable) arrayList2;
                                if (!(iterable instanceof Collection)) {
                                    it4 = iterable.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z27 = true;
                                            break;
                                        }
                                        if (!((m) it4.next()).q0()) {
                                            z27 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    it4 = iterable.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z27 = true;
                                            break;
                                        }
                                        if (!((m) it4.next()).q0()) {
                                            z27 = false;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z27);
                            } else {
                                listA3 = oVar.a();
                                if (listA3 != null) {
                                    if (listA3.isEmpty()) {
                                        z26 = false;
                                        break;
                                    }
                                    it3 = listA3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            z26 = false;
                                            break;
                                        }
                                        m mVar3 = (m) it3.next();
                                        trainingPlanType = mVar3.getTrainingPlanType();
                                        if (trainingPlanType != null) {
                                            oVarB = trainingPlanType.b();
                                        } else {
                                            oVarB = null;
                                        }
                                        if (oVarB != hVar3.f106980d) {
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z26);
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            if (s.g(boolValueOf, Boolean.TRUE)) {
                                linkedHashSet2.add(hVar3);
                            }
                        }
                        z16 = false;
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        z16 = true;
                    }
                    hVar = kw1.h.f106970h;
                    if (!linkedHashSet.contains(hVar)) {
                        fy1.i.f73924a.getClass();
                        if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                            linkedHashSet.add(hVar);
                        }
                    }
                    if (v2Var3 != null) {
                        kVar = null;
                        z17 = false;
                        zContains = false;
                    } else if (v2Var3 instanceof v2.b) {
                        kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
                        if (kVar == null) {
                            if (kVar == null) {
                                if (kVar == null) {
                                    zContains = false;
                                } else {
                                    zContains = false;
                                }
                            } else if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                        if (zContains) {
                            q.f154552a.getClass();
                            zContains = q.a(kVar, list);
                        }
                        z17 = false;
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        z17 = true;
                        kVar = null;
                        zContains = false;
                    }
                    o13.p pVar = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
                    boolean zBooleanValue2 = ((Boolean) pVar.f128594a).booleanValue();
                    kVar2 = (fg0.k) pVar.f128595b;
                    arrayList = new ArrayList(y.r(linkedHashSet, 10));
                    for (kw1.h hVar4 : linkedHashSet) {
                        arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
                    }
                    listN0 = h0.N0(arrayList, new a());
                    p2Var = fVar.f115117j;
                    do {
                        value = p2Var.getValue();
                        aVar = (lw1.a) value;
                        if (kVar2 == null) {
                            if (kVar2 == null) {
                                if (kVar2 == null) {
                                }
                                z18 = false;
                            } else {
                                if (kVar2 == null) {
                                }
                                z18 = false;
                            }
                        } else if (kVar2 == null) {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        } else {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        }
                        if (z16) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        if (listN0 != null) {
                            it = listN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((g) it.next()).f115120b) {
                                    }
                                } else if (z15) {
                                    z25 = true;
                                }
                            }
                        } else {
                            it = listN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((g) it.next()).f115120b) {
                                    }
                                } else if (z15) {
                                    z25 = true;
                                }
                            }
                        }
                        z25 = false;
                    } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
                    return Unit.INSTANCE;
                }
                this.f115100g = null;
                this.f115094a = null;
                this.f115095b = i0VarJ;
                this.f115096c = v2Var;
                this.f115098e = zBooleanValue;
                this.f115099f = 3;
                objAwait = j0Var.await(this);
                if (objAwait != aVar2) {
                    boolean z34 = zBooleanValue;
                    v2Var2 = v2Var;
                    z14 = z34;
                    v2Var3 = (v2) objAwait;
                    if (i0VarJ != null) {
                        this.f115100g = null;
                        this.f115094a = null;
                        this.f115095b = null;
                        this.f115096c = v2Var2;
                        this.f115097d = v2Var3;
                        this.f115098e = z14;
                        this.f115099f = 4;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar2) {
                            v2Var4 = v2Var3;
                        }
                    } else {
                        list = null;
                    }
                    z15 = z14;
                    linkedHashSet = new LinkedHashSet();
                    linkedHashSet2 = new LinkedHashSet();
                    fVar.getClass();
                    if (v2Var2 instanceof v2.b) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        boolean zL1 = k1.f37122a.l0();
                        oVar = (o) ((v2.b) v2Var2).f47386a;
                        listA = oVar.a();
                        if (listA != null) {
                            while (r10.hasNext()) {
                                kw1.h.a aVar5 = kw1.h.f106969g;
                                trainingPlanType3 = mVar.getTrainingPlanType();
                                if (trainingPlanType3 != null) {
                                    oVarB3 = trainingPlanType3.b();
                                } else {
                                    oVarB3 = null;
                                }
                                aVar5.getClass();
                                if (oVarB3 == null) {
                                    hVar2 = null;
                                } else {
                                    vt1.o.f180174e.getClass();
                                    if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3)) {
                                        it5 = kw1.h.f106976n.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it5.next();
                                        } while (((kw1.h) next).f106980d != oVarB3);
                                        hVar2 = (kw1.h) next;
                                    } else {
                                        it5 = kw1.h.f106976n.iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it5.next();
                                        } while (((kw1.h) next).f106980d != oVarB3);
                                        hVar2 = (kw1.h) next;
                                    }
                                }
                                if (hVar2 != null) {
                                    linkedHashSet.add(hVar2);
                                }
                            }
                        }
                        listA2 = oVar.a();
                        if (listA2 != null) {
                            arrayList2 = new ArrayList();
                            while (r6.hasNext()) {
                                vt1.o.a aVar6 = vt1.o.f180174e;
                                trainingPlanType2 = mVar2.getTrainingPlanType();
                                if (trainingPlanType2 != null) {
                                    oVarB2 = trainingPlanType2.b();
                                } else {
                                    oVarB2 = null;
                                }
                                aVar6.getClass();
                                if (oVarB2 != null) {
                                    mVar2 = null;
                                } else {
                                    mVar2 = null;
                                }
                                if (mVar2 != null) {
                                    arrayList2.add(mVar2);
                                }
                            }
                        } else {
                            arrayList2 = p13.j0.f134944a;
                        }
                        while (r6.hasNext()) {
                            if (hVar3 == kw1.h.f106974l) {
                                iterable = (Iterable) arrayList2;
                                if (!(iterable instanceof Collection)) {
                                    it4 = iterable.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z27 = true;
                                            break;
                                        }
                                        if (!((m) it4.next()).q0()) {
                                            z27 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    it4 = iterable.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z27 = true;
                                            break;
                                        }
                                        if (!((m) it4.next()).q0()) {
                                            z27 = false;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z27);
                            } else {
                                listA3 = oVar.a();
                                if (listA3 != null) {
                                    if (listA3.isEmpty()) {
                                        z26 = false;
                                        break;
                                    }
                                    it3 = listA3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            z26 = false;
                                            break;
                                        }
                                        m mVar4 = (m) it3.next();
                                        trainingPlanType = mVar4.getTrainingPlanType();
                                        if (trainingPlanType != null) {
                                            oVarB = trainingPlanType.b();
                                        } else {
                                            oVarB = null;
                                        }
                                        if (oVarB != hVar3.f106980d) {
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z26);
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            if (s.g(boolValueOf, Boolean.TRUE)) {
                                linkedHashSet2.add(hVar3);
                            }
                        }
                        z16 = false;
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        z16 = true;
                    }
                    hVar = kw1.h.f106970h;
                    if (!linkedHashSet.contains(hVar)) {
                        fy1.i.f73924a.getClass();
                        if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                            linkedHashSet.add(hVar);
                        }
                    }
                    if (v2Var3 != null) {
                        kVar = null;
                        z17 = false;
                        zContains = false;
                    } else if (v2Var3 instanceof v2.b) {
                        kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
                        if (kVar == null) {
                            if (kVar == null) {
                                if (kVar == null) {
                                    zContains = false;
                                } else {
                                    zContains = false;
                                }
                            } else if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                        if (zContains) {
                            q.f154552a.getClass();
                            zContains = q.a(kVar, list);
                        }
                        z17 = false;
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        z17 = true;
                        kVar = null;
                        zContains = false;
                    }
                    o13.p pVar2 = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
                    boolean zBooleanValue3 = ((Boolean) pVar2.f128594a).booleanValue();
                    kVar2 = (fg0.k) pVar2.f128595b;
                    arrayList = new ArrayList(y.r(linkedHashSet, 10));
                    while (r1.hasNext()) {
                        arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
                    }
                    listN0 = h0.N0(arrayList, new a());
                    p2Var = fVar.f115117j;
                    do {
                        value = p2Var.getValue();
                        aVar = (lw1.a) value;
                        if (kVar2 == null) {
                            if (kVar2 == null) {
                                if (kVar2 == null) {
                                }
                                z18 = false;
                            } else {
                                if (kVar2 == null) {
                                }
                                z18 = false;
                            }
                        } else if (kVar2 == null) {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        } else {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        }
                        if (z16) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        if (listN0 != null) {
                            it = listN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((g) it.next()).f115120b) {
                                    }
                                } else if (z15) {
                                    z25 = true;
                                }
                            }
                        } else {
                            it = listN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((g) it.next()).f115120b) {
                                    }
                                } else if (z15) {
                                    z25 = true;
                                }
                            }
                        }
                        z25 = false;
                    } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
                    return Unit.INSTANCE;
                }
                return aVar2;
            }
            if (i14 == 3) {
                z14 = this.f115098e;
                v2Var2 = this.f115096c;
                i0 i0Var2 = this.f115095b;
                r.b(obj);
                i0VarJ = i0Var2;
                objAwait = obj;
                v2Var3 = (v2) objAwait;
                if (i0VarJ != null) {
                    this.f115100g = null;
                    this.f115094a = null;
                    this.f115095b = null;
                    this.f115096c = v2Var2;
                    this.f115097d = v2Var3;
                    this.f115098e = z14;
                    this.f115099f = 4;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var4 = v2Var3;
                    }
                    return aVar2;
                }
                list = null;
                z15 = z14;
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                fVar.getClass();
                if (v2Var2 instanceof v2.b) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zL2 = k1.f37122a.l0();
                    oVar = (o) ((v2.b) v2Var2).f47386a;
                    listA = oVar.a();
                    if (listA != null) {
                        while (r10.hasNext()) {
                            kw1.h.a aVar7 = kw1.h.f106969g;
                            trainingPlanType3 = mVar.getTrainingPlanType();
                            if (trainingPlanType3 != null) {
                                oVarB3 = trainingPlanType3.b();
                            } else {
                                oVarB3 = null;
                            }
                            aVar7.getClass();
                            if (oVarB3 == null) {
                                hVar2 = null;
                            } else {
                                vt1.o.f180174e.getClass();
                                if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3) || zL2) {
                                    it5 = kw1.h.f106976n.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it5.next();
                                    } while (((kw1.h) next).f106980d != oVarB3);
                                    hVar2 = (kw1.h) next;
                                } else {
                                    hVar2 = kw1.h.f106974l;
                                }
                            }
                            if (hVar2 != null) {
                                linkedHashSet.add(hVar2);
                            }
                        }
                    }
                    listA2 = oVar.a();
                    if (listA2 != null) {
                        arrayList2 = new ArrayList();
                        while (r6.hasNext()) {
                            vt1.o.a aVar8 = vt1.o.f180174e;
                            trainingPlanType2 = mVar2.getTrainingPlanType();
                            if (trainingPlanType2 != null) {
                                oVarB2 = trainingPlanType2.b();
                            } else {
                                oVarB2 = null;
                            }
                            aVar8.getClass();
                            if (oVarB2 != null || !x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB2)) {
                                mVar2 = null;
                            }
                            if (mVar2 != null) {
                                arrayList2.add(mVar2);
                            }
                        }
                    } else {
                        arrayList2 = p13.j0.f134944a;
                    }
                    while (r6.hasNext()) {
                        if (hVar3 == kw1.h.f106974l) {
                            iterable = (Iterable) arrayList2;
                            if (!(iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                                z27 = true;
                                break;
                            }
                            it4 = iterable.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z27 = true;
                                    break;
                                }
                                if (!((m) it4.next()).q0()) {
                                    z27 = false;
                                    break;
                                }
                            }
                            boolValueOf = Boolean.valueOf(z27);
                        } else {
                            listA3 = oVar.a();
                            if (listA3 != null) {
                                if (listA3.isEmpty()) {
                                    z26 = false;
                                    break;
                                }
                                it3 = listA3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z26 = false;
                                        break;
                                    }
                                    m mVar5 = (m) it3.next();
                                    trainingPlanType = mVar5.getTrainingPlanType();
                                    if (trainingPlanType != null) {
                                        oVarB = trainingPlanType.b();
                                    } else {
                                        oVarB = null;
                                    }
                                    if (oVarB != hVar3.f106980d && mVar5.q0()) {
                                        z26 = true;
                                        break;
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z26);
                            } else {
                                boolValueOf = null;
                            }
                        }
                        if (s.g(boolValueOf, Boolean.TRUE)) {
                            linkedHashSet2.add(hVar3);
                        }
                    }
                    z16 = false;
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z16 = true;
                }
                hVar = kw1.h.f106970h;
                if (!linkedHashSet.contains(hVar)) {
                    fy1.i.f73924a.getClass();
                    if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                        linkedHashSet.add(hVar);
                    }
                }
                if (v2Var3 != null) {
                    kVar = null;
                    z17 = false;
                    zContains = false;
                } else if (v2Var3 instanceof v2.b) {
                    kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
                    if (kVar == null && (eventType6 = kVar.getEventType()) != null && eventType6.f()) {
                        zContains = linkedHashSet.contains(hVar);
                    } else if (kVar == null && (eventType5 = kVar.getEventType()) != null && eventType5.e()) {
                        zContains = linkedHashSet.contains(kw1.h.f106971i);
                    } else if (kVar == null && (eventType4 = kVar.getEventType()) != null && eventType4.g()) {
                        zContains = linkedHashSet.contains(kw1.h.f106972j);
                    } else {
                        zContains = false;
                    }
                    if (zContains && kVar != null && list != null) {
                        q.f154552a.getClass();
                        zContains = q.a(kVar, list);
                    }
                    z17 = false;
                } else {
                    if (v2Var3 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z17 = true;
                    kVar = null;
                    zContains = false;
                }
                o13.p pVar3 = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
                boolean zBooleanValue4 = ((Boolean) pVar3.f128594a).booleanValue();
                kVar2 = (fg0.k) pVar3.f128595b;
                arrayList = new ArrayList(y.r(linkedHashSet, 10));
                while (r1.hasNext()) {
                    arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
                }
                listN0 = h0.N0(arrayList, new a());
                p2Var = fVar.f115117j;
                do {
                    value = p2Var.getValue();
                    aVar = (lw1.a) value;
                    if (kVar2 == null && (eventType3 = kVar2.getEventType()) != null && eventType3.f()) {
                        zContains2 = linkedHashSet2.contains(kw1.h.f106970h);
                    } else if (kVar2 == null && (eventType2 = kVar2.getEventType()) != null && eventType2.e()) {
                        zContains2 = linkedHashSet2.contains(kw1.h.f106971i);
                    } else {
                        if (kVar2 == null && (eventType = kVar2.getEventType()) != null && eventType.g()) {
                            zContains2 = linkedHashSet2.contains(kw1.h.f106972j);
                        } else {
                            z18 = false;
                        }
                        if (z16 || zBooleanValue4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z16 || zBooleanValue4) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        if (listN0 != null || !listN0.isEmpty()) {
                            it = listN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((g) it.next()).f115120b) {
                                    }
                                } else if (z15) {
                                    z25 = true;
                                }
                                z25 = false;
                            }
                        } else if (z15) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                    }
                    z18 = zContains2;
                    if (z16) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z16) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    if (listN0 != null) {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    } else {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    }
                    z25 = false;
                } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
                return Unit.INSTANCE;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f115098e;
            v2Var4 = this.f115097d;
            v2Var2 = this.f115096c;
            r.b(obj);
            objAwait2 = obj;
        }
        list = (List) objAwait2;
        v2Var3 = v2Var4;
        z15 = z14;
        linkedHashSet = new LinkedHashSet();
        linkedHashSet2 = new LinkedHashSet();
        fVar.getClass();
        if (v2Var2 instanceof v2.b) {
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL3 = k1.f37122a.l0();
            oVar = (o) ((v2.b) v2Var2).f47386a;
            listA = oVar.a();
            if (listA != null) {
                while (r10.hasNext()) {
                    kw1.h.a aVar9 = kw1.h.f106969g;
                    trainingPlanType3 = mVar.getTrainingPlanType();
                    if (trainingPlanType3 != null) {
                        oVarB3 = trainingPlanType3.b();
                    } else {
                        oVarB3 = null;
                    }
                    aVar9.getClass();
                    if (oVarB3 == null) {
                        hVar2 = null;
                    } else {
                        vt1.o.f180174e.getClass();
                        if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3)) {
                            it5 = kw1.h.f106976n.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it5.next();
                            } while (((kw1.h) next).f106980d != oVarB3);
                            hVar2 = (kw1.h) next;
                        } else {
                            it5 = kw1.h.f106976n.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it5.next();
                            } while (((kw1.h) next).f106980d != oVarB3);
                            hVar2 = (kw1.h) next;
                        }
                    }
                    if (hVar2 != null) {
                        linkedHashSet.add(hVar2);
                    }
                }
            }
            listA2 = oVar.a();
            if (listA2 != null) {
                arrayList2 = new ArrayList();
                while (r6.hasNext()) {
                    vt1.o.a aVar10 = vt1.o.f180174e;
                    trainingPlanType2 = mVar2.getTrainingPlanType();
                    if (trainingPlanType2 != null) {
                        oVarB2 = trainingPlanType2.b();
                    } else {
                        oVarB2 = null;
                    }
                    aVar10.getClass();
                    if (oVarB2 != null) {
                        mVar2 = null;
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 != null) {
                        arrayList2.add(mVar2);
                    }
                }
            } else {
                arrayList2 = p13.j0.f134944a;
            }
            while (r6.hasNext()) {
                if (hVar3 == kw1.h.f106974l) {
                    iterable = (Iterable) arrayList2;
                    if (!(iterable instanceof Collection)) {
                        it4 = iterable.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z27 = true;
                                break;
                            }
                            if (!((m) it4.next()).q0()) {
                                z27 = false;
                                break;
                            }
                        }
                    } else {
                        it4 = iterable.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z27 = true;
                                break;
                            }
                            if (!((m) it4.next()).q0()) {
                                z27 = false;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z27);
                } else {
                    listA3 = oVar.a();
                    if (listA3 != null) {
                        if (listA3.isEmpty()) {
                            z26 = false;
                            break;
                        }
                        it3 = listA3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                z26 = false;
                                break;
                            }
                            m mVar6 = (m) it3.next();
                            trainingPlanType = mVar6.getTrainingPlanType();
                            if (trainingPlanType != null) {
                                oVarB = trainingPlanType.b();
                            } else {
                                oVarB = null;
                            }
                            if (oVarB != hVar3.f106980d) {
                            }
                        }
                        boolValueOf = Boolean.valueOf(z26);
                    } else {
                        boolValueOf = null;
                    }
                }
                if (s.g(boolValueOf, Boolean.TRUE)) {
                    linkedHashSet2.add(hVar3);
                }
            }
            z16 = false;
        } else {
            if (v2Var2 instanceof v2.a) {
                u0.r();
                return null;
            }
            z16 = true;
        }
        hVar = kw1.h.f106970h;
        if (!linkedHashSet.contains(hVar)) {
            fy1.i.f73924a.getClass();
            if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                linkedHashSet.add(hVar);
            }
        }
        if (v2Var3 != null) {
            kVar = null;
            z17 = false;
            zContains = false;
        } else if (v2Var3 instanceof v2.b) {
            kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
            if (kVar == null) {
                if (kVar == null) {
                    if (kVar == null) {
                        zContains = false;
                    } else {
                        zContains = false;
                    }
                } else if (kVar == null) {
                    zContains = false;
                } else {
                    zContains = false;
                }
            } else if (kVar == null) {
                if (kVar == null) {
                    zContains = false;
                } else {
                    zContains = false;
                }
            } else if (kVar == null) {
                zContains = false;
            } else {
                zContains = false;
            }
            if (zContains) {
                q.f154552a.getClass();
                zContains = q.a(kVar, list);
            }
            z17 = false;
        } else {
            if (v2Var3 instanceof v2.a) {
                u0.r();
                return null;
            }
            z17 = true;
            kVar = null;
            zContains = false;
        }
        o13.p pVar4 = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
        boolean zBooleanValue5 = ((Boolean) pVar4.f128594a).booleanValue();
        kVar2 = (fg0.k) pVar4.f128595b;
        arrayList = new ArrayList(y.r(linkedHashSet, 10));
        while (r1.hasNext()) {
            arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
        }
        listN0 = h0.N0(arrayList, new a());
        p2Var = fVar.f115117j;
        do {
            value = p2Var.getValue();
            aVar = (lw1.a) value;
            if (kVar2 == null) {
                if (kVar2 == null) {
                    if (kVar2 == null) {
                    }
                    z18 = false;
                } else {
                    if (kVar2 == null) {
                    }
                    z18 = false;
                }
            } else if (kVar2 == null) {
                if (kVar2 == null) {
                }
                z18 = false;
            } else {
                if (kVar2 == null) {
                }
                z18 = false;
            }
            if (z16) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (z16) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (listN0 != null) {
                it = listN0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((g) it.next()).f115120b) {
                        }
                    } else if (z15) {
                        z25 = true;
                    }
                }
            } else {
                it = listN0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((g) it.next()).f115120b) {
                        }
                    } else if (z15) {
                        z25 = true;
                    }
                }
            }
            z25 = false;
        } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
        return Unit.INSTANCE;
        zBooleanValue = ((Boolean) objX4).booleanValue();
        j0 j0VarJ = fVar.f115111d ? ge1.b.j(b0Var, null, null, new b(fVar, null), 3) : null;
        i0VarJ = fVar.f115111d ? ge1.b.j(b0Var, null, null, new d(fVar, null), 3) : null;
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(fVar, null), 3);
        this.f115100g = null;
        this.f115094a = j0VarJ;
        this.f115095b = i0VarJ;
        this.f115098e = zBooleanValue;
        this.f115099f = 2;
        objC = j0VarJ2.C(this);
        if (objC != aVar2) {
            j0Var = j0VarJ;
            v2Var = (v2) objC;
            if (j0Var != null) {
                boolean z210 = zBooleanValue;
                v2Var2 = v2Var;
                z14 = z210;
                v2Var3 = null;
                if (i0VarJ != null) {
                    this.f115100g = null;
                    this.f115094a = null;
                    this.f115095b = null;
                    this.f115096c = v2Var2;
                    this.f115097d = v2Var3;
                    this.f115098e = z14;
                    this.f115099f = 4;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var4 = v2Var3;
                        list = (List) objAwait2;
                        v2Var3 = v2Var4;
                    }
                } else {
                    list = null;
                }
                z15 = z14;
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                fVar.getClass();
                if (v2Var2 instanceof v2.b) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zL4 = k1.f37122a.l0();
                    oVar = (o) ((v2.b) v2Var2).f47386a;
                    listA = oVar.a();
                    if (listA != null) {
                        while (r10.hasNext()) {
                            kw1.h.a aVar11 = kw1.h.f106969g;
                            trainingPlanType3 = mVar.getTrainingPlanType();
                            if (trainingPlanType3 != null) {
                                oVarB3 = trainingPlanType3.b();
                            } else {
                                oVarB3 = null;
                            }
                            aVar11.getClass();
                            if (oVarB3 == null) {
                                hVar2 = null;
                            } else {
                                vt1.o.f180174e.getClass();
                                if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3)) {
                                    it5 = kw1.h.f106976n.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it5.next();
                                    } while (((kw1.h) next).f106980d != oVarB3);
                                    hVar2 = (kw1.h) next;
                                } else {
                                    it5 = kw1.h.f106976n.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it5.next();
                                    } while (((kw1.h) next).f106980d != oVarB3);
                                    hVar2 = (kw1.h) next;
                                }
                            }
                            if (hVar2 != null) {
                                linkedHashSet.add(hVar2);
                            }
                        }
                    }
                    listA2 = oVar.a();
                    if (listA2 != null) {
                        arrayList2 = new ArrayList();
                        while (r6.hasNext()) {
                            vt1.o.a aVar12 = vt1.o.f180174e;
                            trainingPlanType2 = mVar2.getTrainingPlanType();
                            if (trainingPlanType2 != null) {
                                oVarB2 = trainingPlanType2.b();
                            } else {
                                oVarB2 = null;
                            }
                            aVar12.getClass();
                            if (oVarB2 != null) {
                                mVar2 = null;
                            } else {
                                mVar2 = null;
                            }
                            if (mVar2 != null) {
                                arrayList2.add(mVar2);
                            }
                        }
                    } else {
                        arrayList2 = p13.j0.f134944a;
                    }
                    while (r6.hasNext()) {
                        if (hVar3 == kw1.h.f106974l) {
                            iterable = (Iterable) arrayList2;
                            if (!(iterable instanceof Collection)) {
                                it4 = iterable.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z27 = true;
                                        break;
                                    }
                                    if (!((m) it4.next()).q0()) {
                                        z27 = false;
                                        break;
                                    }
                                }
                            } else {
                                it4 = iterable.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z27 = true;
                                        break;
                                    }
                                    if (!((m) it4.next()).q0()) {
                                        z27 = false;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z27);
                        } else {
                            listA3 = oVar.a();
                            if (listA3 != null) {
                                if (listA3.isEmpty()) {
                                    z26 = false;
                                    break;
                                }
                                it3 = listA3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z26 = false;
                                        break;
                                    }
                                    m mVar7 = (m) it3.next();
                                    trainingPlanType = mVar7.getTrainingPlanType();
                                    if (trainingPlanType != null) {
                                        oVarB = trainingPlanType.b();
                                    } else {
                                        oVarB = null;
                                    }
                                    if (oVarB != hVar3.f106980d) {
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z26);
                            } else {
                                boolValueOf = null;
                            }
                        }
                        if (s.g(boolValueOf, Boolean.TRUE)) {
                            linkedHashSet2.add(hVar3);
                        }
                    }
                    z16 = false;
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z16 = true;
                }
                hVar = kw1.h.f106970h;
                if (!linkedHashSet.contains(hVar)) {
                    fy1.i.f73924a.getClass();
                    if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                        linkedHashSet.add(hVar);
                    }
                }
                if (v2Var3 != null) {
                    kVar = null;
                    z17 = false;
                    zContains = false;
                } else if (v2Var3 instanceof v2.b) {
                    kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
                    if (kVar == null) {
                        if (kVar == null) {
                            if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                    } else if (kVar == null) {
                        if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                    } else if (kVar == null) {
                        zContains = false;
                    } else {
                        zContains = false;
                    }
                    if (zContains) {
                        q.f154552a.getClass();
                        zContains = q.a(kVar, list);
                    }
                    z17 = false;
                } else {
                    if (v2Var3 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z17 = true;
                    kVar = null;
                    zContains = false;
                }
                o13.p pVar5 = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
                boolean zBooleanValue6 = ((Boolean) pVar5.f128594a).booleanValue();
                kVar2 = (fg0.k) pVar5.f128595b;
                arrayList = new ArrayList(y.r(linkedHashSet, 10));
                while (r1.hasNext()) {
                    arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
                }
                listN0 = h0.N0(arrayList, new a());
                p2Var = fVar.f115117j;
                do {
                    value = p2Var.getValue();
                    aVar = (lw1.a) value;
                    if (kVar2 == null) {
                        if (kVar2 == null) {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        } else {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        }
                    } else if (kVar2 == null) {
                        if (kVar2 == null) {
                        }
                        z18 = false;
                    } else {
                        if (kVar2 == null) {
                        }
                        z18 = false;
                    }
                    if (z16) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z16) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    if (listN0 != null) {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    } else {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    }
                    z25 = false;
                } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
                return Unit.INSTANCE;
            }
            this.f115100g = null;
            this.f115094a = null;
            this.f115095b = i0VarJ;
            this.f115096c = v2Var;
            this.f115098e = zBooleanValue;
            this.f115099f = 3;
            objAwait = j0Var.await(this);
            if (objAwait != aVar2) {
                boolean z35 = zBooleanValue;
                v2Var2 = v2Var;
                z14 = z35;
                v2Var3 = (v2) objAwait;
                if (i0VarJ != null) {
                    this.f115100g = null;
                    this.f115094a = null;
                    this.f115095b = null;
                    this.f115096c = v2Var2;
                    this.f115097d = v2Var3;
                    this.f115098e = z14;
                    this.f115099f = 4;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar2) {
                        v2Var4 = v2Var3;
                        list = (List) objAwait2;
                        v2Var3 = v2Var4;
                    }
                } else {
                    list = null;
                }
                z15 = z14;
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                fVar.getClass();
                if (v2Var2 instanceof v2.b) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zL5 = k1.f37122a.l0();
                    oVar = (o) ((v2.b) v2Var2).f47386a;
                    listA = oVar.a();
                    if (listA != null) {
                        while (r10.hasNext()) {
                            kw1.h.a aVar13 = kw1.h.f106969g;
                            trainingPlanType3 = mVar.getTrainingPlanType();
                            if (trainingPlanType3 != null) {
                                oVarB3 = trainingPlanType3.b();
                            } else {
                                oVarB3 = null;
                            }
                            aVar13.getClass();
                            if (oVarB3 == null) {
                                hVar2 = null;
                            } else {
                                vt1.o.f180174e.getClass();
                                if (x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVarB3)) {
                                    it5 = kw1.h.f106976n.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it5.next();
                                    } while (((kw1.h) next).f106980d != oVarB3);
                                    hVar2 = (kw1.h) next;
                                } else {
                                    it5 = kw1.h.f106976n.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it5.next();
                                    } while (((kw1.h) next).f106980d != oVarB3);
                                    hVar2 = (kw1.h) next;
                                }
                            }
                            if (hVar2 != null) {
                                linkedHashSet.add(hVar2);
                            }
                        }
                    }
                    listA2 = oVar.a();
                    if (listA2 != null) {
                        arrayList2 = new ArrayList();
                        while (r6.hasNext()) {
                            vt1.o.a aVar14 = vt1.o.f180174e;
                            trainingPlanType2 = mVar2.getTrainingPlanType();
                            if (trainingPlanType2 != null) {
                                oVarB2 = trainingPlanType2.b();
                            } else {
                                oVarB2 = null;
                            }
                            aVar14.getClass();
                            if (oVarB2 != null) {
                                mVar2 = null;
                            } else {
                                mVar2 = null;
                            }
                            if (mVar2 != null) {
                                arrayList2.add(mVar2);
                            }
                        }
                    } else {
                        arrayList2 = p13.j0.f134944a;
                    }
                    while (r6.hasNext()) {
                        if (hVar3 == kw1.h.f106974l) {
                            iterable = (Iterable) arrayList2;
                            if (!(iterable instanceof Collection)) {
                                it4 = iterable.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z27 = true;
                                        break;
                                    }
                                    if (!((m) it4.next()).q0()) {
                                        z27 = false;
                                        break;
                                    }
                                }
                            } else {
                                it4 = iterable.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z27 = true;
                                        break;
                                    }
                                    if (!((m) it4.next()).q0()) {
                                        z27 = false;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z27);
                        } else {
                            listA3 = oVar.a();
                            if (listA3 != null) {
                                if (listA3.isEmpty()) {
                                    z26 = false;
                                    break;
                                }
                                it3 = listA3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z26 = false;
                                        break;
                                    }
                                    m mVar8 = (m) it3.next();
                                    trainingPlanType = mVar8.getTrainingPlanType();
                                    if (trainingPlanType != null) {
                                        oVarB = trainingPlanType.b();
                                    } else {
                                        oVarB = null;
                                    }
                                    if (oVarB != hVar3.f106980d) {
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z26);
                            } else {
                                boolValueOf = null;
                            }
                        }
                        if (s.g(boolValueOf, Boolean.TRUE)) {
                            linkedHashSet2.add(hVar3);
                        }
                    }
                    z16 = false;
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z16 = true;
                }
                hVar = kw1.h.f106970h;
                if (!linkedHashSet.contains(hVar)) {
                    fy1.i.f73924a.getClass();
                    if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).o()) {
                        linkedHashSet.add(hVar);
                    }
                }
                if (v2Var3 != null) {
                    kVar = null;
                    z17 = false;
                    zContains = false;
                } else if (v2Var3 instanceof v2.b) {
                    kVar = (fg0.k) ((v2.b) v2Var3).f47386a;
                    if (kVar == null) {
                        if (kVar == null) {
                            if (kVar == null) {
                                zContains = false;
                            } else {
                                zContains = false;
                            }
                        } else if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                    } else if (kVar == null) {
                        if (kVar == null) {
                            zContains = false;
                        } else {
                            zContains = false;
                        }
                    } else if (kVar == null) {
                        zContains = false;
                    } else {
                        zContains = false;
                    }
                    if (zContains) {
                        q.f154552a.getClass();
                        zContains = q.a(kVar, list);
                    }
                    z17 = false;
                } else {
                    if (v2Var3 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z17 = true;
                    kVar = null;
                    zContains = false;
                }
                o13.p pVar6 = new o13.p(Boolean.valueOf(z17), zContains ? kVar : null);
                boolean zBooleanValue7 = ((Boolean) pVar6.f128594a).booleanValue();
                kVar2 = (fg0.k) pVar6.f128595b;
                arrayList = new ArrayList(y.r(linkedHashSet, 10));
                while (r1.hasNext()) {
                    arrayList.add(new g(hVar4, linkedHashSet2.contains(hVar4)));
                }
                listN0 = h0.N0(arrayList, new a());
                p2Var = fVar.f115117j;
                do {
                    value = p2Var.getValue();
                    aVar = (lw1.a) value;
                    if (kVar2 == null) {
                        if (kVar2 == null) {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        } else {
                            if (kVar2 == null) {
                            }
                            z18 = false;
                        }
                    } else if (kVar2 == null) {
                        if (kVar2 == null) {
                        }
                        z18 = false;
                    } else {
                        if (kVar2 == null) {
                        }
                        z18 = false;
                    }
                    if (z16) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z16) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    if (listN0 != null) {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    } else {
                        it = listN0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((g) it.next()).f115120b) {
                                }
                            } else if (z15) {
                                z25 = true;
                            }
                        }
                    }
                    z25 = false;
                } while (!p2Var.b(value, lw1.a.a(aVar, false, z19, z24, null, 0, listN0, null, kVar2, z18, false, z15, z25, 600)));
                return Unit.INSTANCE;
            }
        }
        return aVar2;
    }
}
