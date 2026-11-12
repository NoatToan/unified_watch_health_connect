package qv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jv1.e0;
import kv1.m;
import kv1.y;
import kv1.z;
import lc.u0;
import o13.r;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.w;
import tw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getDataForCompletedPlan$2", f = "FBTProgressReportViewModel.kt", l = {380, 387, 397, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 407, 408, 414}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f148136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f148137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f148138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f148140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qv1.b f148141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f148142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uv1.c f148143h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getDataForCompletedPlan$2$fbtAdaptiveTrainingPlansAsync$1", f = "FBTProgressReportViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qv1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148145b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148145b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148144a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kv1.b bVar = this.f148145b.f147936c;
            fy1.i.f73924a.getClass();
            String strF = fy1.i.a.f();
            List listC = w.c("FBT_ADAPTIVE");
            this.f148144a = 1;
            bVar.getClass();
            Object objJ = f0.J(bVar, new m(bVar, strF, listC, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getDataForCompletedPlan$2$fbtPlanAsync$1", f = "FBTProgressReportViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends tw1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f148148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qv1.b bVar, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148147b = bVar;
            this.f148148c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f148147b, this.f148148c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends tw1.m>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148146a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kv1.b bVar = this.f148147b.f147936c;
            this.f148146a = 1;
            Object objC = bVar.c(this.f148148c, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljv1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getDataForCompletedPlan$2$fbtWorkoutTypesAsync$1", f = "FBTProgressReportViewModel.kt", l = {407}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends jv1.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qv1.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f148150b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f148150b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jv1.b>>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148149a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVar = this.f148150b.f147937d;
            this.f148149a = 1;
            yVar.getClass();
            Object objJ = f0.J(yVar, new z(yVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((tw1.m) t14).o(), ((tw1.m) t7).o());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/e0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getDataForCompletedPlan$2$userSettingsAsync$1", f = "FBTProgressReportViewModel.kt", l = {408}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super v2<? extends e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148152b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qv1.b bVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f148152b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f148152b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends e0>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148151a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVar = this.f148152b.f147937d;
            this.f148151a = 1;
            Object objA = yVar.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qv1.b bVar, long j8, uv1.c cVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f148141f = bVar;
        this.f148142g = j8;
        this.f148143h = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f148141f, this.f148142g, this.f148143h, dVar);
        gVar.f148140e = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0235  */
    /* JADX WARN: Code duplicated, block: B:102:0x023e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0242  */
    /* JADX WARN: Code duplicated, block: B:107:0x025a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0266  */
    /* JADX WARN: Code duplicated, block: B:111:0x026b  */
    /* JADX WARN: Code duplicated, block: B:113:0x026f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0288  */
    /* JADX WARN: Code duplicated, block: B:116:0x028c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0290  */
    /* JADX WARN: Code duplicated, block: B:120:0x0294  */
    /* JADX WARN: Code duplicated, block: B:124:0x029b  */
    /* JADX WARN: Code duplicated, block: B:127:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b A[PHI: r3
      0x018b: PHI (r3v44 java.lang.Object) = (r3v37 java.lang.Object), (r3v46 java.lang.Object) binds: [B:74:0x0188, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4 A[PHI: r3 r5
      0x01a4: PHI (r3v47 com.garmin.android.apps.connectmobile.v2) = (r3v45 com.garmin.android.apps.connectmobile.v2), (r3v49 com.garmin.android.apps.connectmobile.v2) binds: [B:77:0x01a1, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r5v9 java.lang.Object) = (r5v8 java.lang.Object), (r5v12 java.lang.Object) binds: [B:77:0x01a1, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        v2 v2Var;
        Object objG4;
        qv1.b bVar;
        List<tw1.m> listA;
        tw1.m mVar;
        Object objG5;
        List<tw1.m> list;
        qv1.b bVar2;
        boolean zBooleanValue;
        Iterator<T> it;
        Object next;
        tw1.m mVar2;
        Long l14;
        List listN0;
        tw1.m mVar3;
        tw1.m mVar4;
        Object objC;
        v2 v2Var2;
        Object objC2;
        v2 v2Var3;
        Object objC3;
        v2 v2Var4;
        v2 v2Var5;
        v2 v2Var6;
        Object objC4;
        v2 v2Var7;
        v2 v2Var8;
        v2 v2Var9;
        List<tw1.m> listA2;
        b0 b0Var = (b0) this.f148140e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148139d;
        boolean z14 = false;
        long j8 = this.f148142g;
        qv1.b bVar3 = this.f148141f;
        switch (i14) {
            case 0:
                r.b(obj);
                uw1.b bVar4 = bVar3.f147938e;
                this.f148140e = b0Var;
                this.f148139d = 1;
                objB = bVar4.b(this);
                if (objB != aVar) {
                    v2Var = (v2) objB;
                    if (v2Var instanceof v2.b) {
                        listA = ((o) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            it = listA.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    mVar2 = (tw1.m) next;
                                    if (!mVar2.Z()) {
                                    }
                                } else {
                                    next = null;
                                }
                                mVar = (tw1.m) next;
                            } while (!mVar2.k0());
                            mVar = (tw1.m) next;
                        } else {
                            mVar = null;
                        }
                        if (mVar != null) {
                            zBooleanValue = true;
                            list = listA;
                            bVar2 = bVar3;
                            bVar2.f147950q = zBooleanValue;
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    mVar4 = (tw1.m) obj2;
                                    if (!mVar4.e0() && mVar4.h0()) {
                                        arrayList.add(obj2);
                                    }
                                }
                                listN0 = h0.N0(arrayList, new d());
                                if (listN0 != null || (mVar3 = (tw1.m) h0.d0(listN0)) == null) {
                                    l14 = null;
                                } else {
                                    l14 = new Long(mVar3.getTrainingPlanId());
                                }
                            } else {
                                l14 = null;
                            }
                            if (l14 != null && l14.longValue() == j8) {
                                z14 = true;
                            }
                            bVar3.f147951r = z14;
                            if (bVar3.f147951r && !bVar3.f147950q && this.f148143h == uv1.c.OPEN_LOOP) {
                                j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = null;
                                this.f148137b = null;
                                this.f148138c = null;
                                this.f148139d = 4;
                                objC = j0VarJ.C(this);
                                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                                if (objC != aVar) {
                                    v2Var2 = (v2) objC;
                                    j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148139d = 5;
                                    objC2 = j0VarJ2.C(this);
                                    if (objC2 != aVar) {
                                        v2Var3 = (v2) objC2;
                                        j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var2;
                                        this.f148137b = v2Var3;
                                        this.f148139d = 6;
                                        objC3 = j0VarJ3.C(this);
                                        if (objC3 != aVar) {
                                            v2Var4 = v2Var2;
                                            v2Var5 = v2Var3;
                                            v2Var6 = (v2) objC3;
                                            j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                            this.f148140e = b0Var;
                                            this.f148136a = v2Var4;
                                            this.f148137b = v2Var5;
                                            this.f148138c = v2Var6;
                                            this.f148139d = 7;
                                            objC4 = j0VarJ4.C(this);
                                            if (objC4 != aVar) {
                                                v2Var7 = v2Var5;
                                                v2Var8 = v2Var4;
                                                v2Var9 = (v2) objC4;
                                                if (v2Var8 instanceof v2.b) {
                                                    bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                                } else {
                                                    if (v2Var8 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strN = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                    i2.a aVar3 = i2.f36769a;
                                                    a2 a2Var = a2.GENERAL;
                                                    aVar3.getClass();
                                                    i2.a.f(a2Var, "FBTProgressReportViewModel", strN);
                                                }
                                                if (v2Var7 instanceof v2.b) {
                                                    bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                                } else {
                                                    if (v2Var7 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                    i2.a aVar4 = i2.f36769a;
                                                    a2 a2Var2 = a2.GENERAL;
                                                    aVar4.getClass();
                                                    i2.a.f(a2Var2, "FBTProgressReportViewModel", strD);
                                                }
                                                if (v2Var6 instanceof v2.b) {
                                                    bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                                } else {
                                                    if (v2Var6 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                    i2.a aVar5 = i2.f36769a;
                                                    a2 a2Var3 = a2.GENERAL;
                                                    aVar5.getClass();
                                                    i2.a.f(a2Var3, "FBTProgressReportViewModel", strD2);
                                                }
                                                if (v2Var9 instanceof v2.b) {
                                                    listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                    if (listA2 == null) {
                                                        listA2 = p13.j0.f134944a;
                                                    }
                                                    bVar3.f147949p = listA2;
                                                } else {
                                                    if (v2Var9 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                    i2.a aVar6 = i2.f36769a;
                                                    a2 a2Var4 = a2.GENERAL;
                                                    aVar6.getClass();
                                                    i2.a.f(a2Var4, "FBTProgressReportViewModel", strD3);
                                                    bVar3.f147949p = p13.j0.f134944a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        this.f148140e = b0Var;
                        this.f148136a = null;
                        this.f148137b = listA;
                        this.f148138c = bVar3;
                        this.f148139d = 2;
                        objG5 = qv1.b.G4(bVar3, this);
                        if (objG5 != aVar) {
                            list = listA;
                            bVar2 = bVar3;
                            zBooleanValue = ((Boolean) objG5).booleanValue();
                            bVar2.f147950q = zBooleanValue;
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                while (r12.hasNext()) {
                                    mVar4 = (tw1.m) obj2;
                                    if (!mVar4.e0()) {
                                    }
                                }
                                listN0 = h0.N0(arrayList2, new d());
                                if (listN0 != null) {
                                    l14 = null;
                                } else {
                                    l14 = null;
                                }
                            } else {
                                l14 = null;
                            }
                            if (l14 != null) {
                                z14 = true;
                            }
                            bVar3.f147951r = z14;
                            if (bVar3.f147951r) {
                                j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = null;
                                this.f148137b = null;
                                this.f148138c = null;
                                this.f148139d = 4;
                                objC = j0VarJ5.C(this);
                                u13.a aVar7 = u13.a.COROUTINE_SUSPENDED;
                                if (objC != aVar) {
                                    v2Var2 = (v2) objC;
                                    j0 j0VarJ6 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148139d = 5;
                                    objC2 = j0VarJ6.C(this);
                                    if (objC2 != aVar) {
                                        v2Var3 = (v2) objC2;
                                        j0 j0VarJ7 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var2;
                                        this.f148137b = v2Var3;
                                        this.f148139d = 6;
                                        objC3 = j0VarJ7.C(this);
                                        if (objC3 != aVar) {
                                            v2Var4 = v2Var2;
                                            v2Var5 = v2Var3;
                                            v2Var6 = (v2) objC3;
                                            j0 j0VarJ8 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                            this.f148140e = b0Var;
                                            this.f148136a = v2Var4;
                                            this.f148137b = v2Var5;
                                            this.f148138c = v2Var6;
                                            this.f148139d = 7;
                                            objC4 = j0VarJ8.C(this);
                                            if (objC4 != aVar) {
                                                v2Var7 = v2Var5;
                                                v2Var8 = v2Var4;
                                                v2Var9 = (v2) objC4;
                                                if (v2Var8 instanceof v2.b) {
                                                    bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                                } else {
                                                    if (v2Var8 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strN2 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                    i2.a aVar8 = i2.f36769a;
                                                    a2 a2Var5 = a2.GENERAL;
                                                    aVar8.getClass();
                                                    i2.a.f(a2Var5, "FBTProgressReportViewModel", strN2);
                                                }
                                                if (v2Var7 instanceof v2.b) {
                                                    bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                                } else {
                                                    if (v2Var7 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                    i2.a aVar9 = i2.f36769a;
                                                    a2 a2Var6 = a2.GENERAL;
                                                    aVar9.getClass();
                                                    i2.a.f(a2Var6, "FBTProgressReportViewModel", strD4);
                                                }
                                                if (v2Var6 instanceof v2.b) {
                                                    bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                                } else {
                                                    if (v2Var6 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                    i2.a aVar10 = i2.f36769a;
                                                    a2 a2Var7 = a2.GENERAL;
                                                    aVar10.getClass();
                                                    i2.a.f(a2Var7, "FBTProgressReportViewModel", strD5);
                                                }
                                                if (v2Var9 instanceof v2.b) {
                                                    listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                    if (listA2 == null) {
                                                        listA2 = p13.j0.f134944a;
                                                    }
                                                    bVar3.f147949p = listA2;
                                                } else {
                                                    if (v2Var9 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                    i2.a aVar11 = i2.f36769a;
                                                    a2 a2Var8 = a2.GENERAL;
                                                    aVar11.getClass();
                                                    i2.a.f(a2Var8, "FBTProgressReportViewModel", strD6);
                                                    bVar3.f147949p = p13.j0.f134944a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD7 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting list of training plans. Unable to determine if there is a current active plan. Error=");
                        i2.a aVar12 = i2.f36769a;
                        a2 a2Var9 = a2.GENERAL;
                        aVar12.getClass();
                        i2.a.f(a2Var9, "FBTProgressReportViewModel", strD7);
                        this.f148140e = b0Var;
                        this.f148136a = null;
                        this.f148137b = bVar3;
                        this.f148139d = 3;
                        objG4 = qv1.b.G4(bVar3, this);
                        if (objG4 != aVar) {
                            bVar = bVar3;
                            bVar.f147950q = ((Boolean) objG4).booleanValue();
                            bVar3.f147951r = false;
                            if (bVar3.f147951r) {
                                j0 j0VarJ9 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = null;
                                this.f148137b = null;
                                this.f148138c = null;
                                this.f148139d = 4;
                                objC = j0VarJ9.C(this);
                                u13.a aVar13 = u13.a.COROUTINE_SUSPENDED;
                                if (objC != aVar) {
                                    v2Var2 = (v2) objC;
                                    j0 j0VarJ10 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148139d = 5;
                                    objC2 = j0VarJ10.C(this);
                                    if (objC2 != aVar) {
                                        v2Var3 = (v2) objC2;
                                        j0 j0VarJ11 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var2;
                                        this.f148137b = v2Var3;
                                        this.f148139d = 6;
                                        objC3 = j0VarJ11.C(this);
                                        if (objC3 != aVar) {
                                            v2Var4 = v2Var2;
                                            v2Var5 = v2Var3;
                                            v2Var6 = (v2) objC3;
                                            j0 j0VarJ12 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                            this.f148140e = b0Var;
                                            this.f148136a = v2Var4;
                                            this.f148137b = v2Var5;
                                            this.f148138c = v2Var6;
                                            this.f148139d = 7;
                                            objC4 = j0VarJ12.C(this);
                                            if (objC4 != aVar) {
                                                v2Var7 = v2Var5;
                                                v2Var8 = v2Var4;
                                                v2Var9 = (v2) objC4;
                                                if (v2Var8 instanceof v2.b) {
                                                    bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                                } else {
                                                    if (v2Var8 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strN3 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                    i2.a aVar14 = i2.f36769a;
                                                    a2 a2Var10 = a2.GENERAL;
                                                    aVar14.getClass();
                                                    i2.a.f(a2Var10, "FBTProgressReportViewModel", strN3);
                                                }
                                                if (v2Var7 instanceof v2.b) {
                                                    bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                                } else {
                                                    if (v2Var7 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD8 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                    i2.a aVar15 = i2.f36769a;
                                                    a2 a2Var11 = a2.GENERAL;
                                                    aVar15.getClass();
                                                    i2.a.f(a2Var11, "FBTProgressReportViewModel", strD8);
                                                }
                                                if (v2Var6 instanceof v2.b) {
                                                    bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                                } else {
                                                    if (v2Var6 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD9 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                    i2.a aVar16 = i2.f36769a;
                                                    a2 a2Var12 = a2.GENERAL;
                                                    aVar16.getClass();
                                                    i2.a.f(a2Var12, "FBTProgressReportViewModel", strD9);
                                                }
                                                if (v2Var9 instanceof v2.b) {
                                                    listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                    if (listA2 == null) {
                                                        listA2 = p13.j0.f134944a;
                                                    }
                                                    bVar3.f147949p = listA2;
                                                } else {
                                                    if (v2Var9 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strD10 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                    i2.a aVar17 = i2.f36769a;
                                                    a2 a2Var13 = a2.GENERAL;
                                                    aVar17.getClass();
                                                    i2.a.f(a2Var13, "FBTProgressReportViewModel", strD10);
                                                    bVar3.f147949p = p13.j0.f134944a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 1:
                r.b(obj);
                objB = obj;
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    listA = ((o) ((v2.b) v2Var).f47386a).a();
                    if (listA != null) {
                        it = listA.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                mVar2 = (tw1.m) next;
                                if (!mVar2.Z()) {
                                }
                            } else {
                                next = null;
                            }
                            mVar = (tw1.m) next;
                        } while (!mVar2.k0());
                        mVar = (tw1.m) next;
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        zBooleanValue = true;
                        list = listA;
                        bVar2 = bVar3;
                        bVar2.f147950q = zBooleanValue;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList();
                            while (r12.hasNext()) {
                                mVar4 = (tw1.m) obj2;
                                if (!mVar4.e0()) {
                                }
                            }
                            listN0 = h0.N0(arrayList3, new d());
                            if (listN0 != null) {
                                l14 = null;
                            } else {
                                l14 = null;
                            }
                        } else {
                            l14 = null;
                        }
                        if (l14 != null) {
                            z14 = true;
                        }
                        bVar3.f147951r = z14;
                        if (bVar3.f147951r) {
                            j0 j0VarJ13 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                            this.f148140e = b0Var;
                            this.f148136a = null;
                            this.f148137b = null;
                            this.f148138c = null;
                            this.f148139d = 4;
                            objC = j0VarJ13.C(this);
                            u13.a aVar18 = u13.a.COROUTINE_SUSPENDED;
                            if (objC != aVar) {
                                v2Var2 = (v2) objC;
                                j0 j0VarJ14 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = v2Var2;
                                this.f148139d = 5;
                                objC2 = j0VarJ14.C(this);
                                if (objC2 != aVar) {
                                    v2Var3 = (v2) objC2;
                                    j0 j0VarJ15 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148137b = v2Var3;
                                    this.f148139d = 6;
                                    objC3 = j0VarJ15.C(this);
                                    if (objC3 != aVar) {
                                        v2Var4 = v2Var2;
                                        v2Var5 = v2Var3;
                                        v2Var6 = (v2) objC3;
                                        j0 j0VarJ16 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var4;
                                        this.f148137b = v2Var5;
                                        this.f148138c = v2Var6;
                                        this.f148139d = 7;
                                        objC4 = j0VarJ16.C(this);
                                        if (objC4 != aVar) {
                                            v2Var7 = v2Var5;
                                            v2Var8 = v2Var4;
                                            v2Var9 = (v2) objC4;
                                            if (v2Var8 instanceof v2.b) {
                                                bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                            } else {
                                                if (v2Var8 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strN4 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                i2.a aVar19 = i2.f36769a;
                                                a2 a2Var14 = a2.GENERAL;
                                                aVar19.getClass();
                                                i2.a.f(a2Var14, "FBTProgressReportViewModel", strN4);
                                            }
                                            if (v2Var7 instanceof v2.b) {
                                                bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                            } else {
                                                if (v2Var7 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD11 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                i2.a aVar110 = i2.f36769a;
                                                a2 a2Var15 = a2.GENERAL;
                                                aVar110.getClass();
                                                i2.a.f(a2Var15, "FBTProgressReportViewModel", strD11);
                                            }
                                            if (v2Var6 instanceof v2.b) {
                                                bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                            } else {
                                                if (v2Var6 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD12 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                i2.a aVar111 = i2.f36769a;
                                                a2 a2Var16 = a2.GENERAL;
                                                aVar111.getClass();
                                                i2.a.f(a2Var16, "FBTProgressReportViewModel", strD12);
                                            }
                                            if (v2Var9 instanceof v2.b) {
                                                listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                if (listA2 == null) {
                                                    listA2 = p13.j0.f134944a;
                                                }
                                                bVar3.f147949p = listA2;
                                            } else {
                                                if (v2Var9 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD13 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                i2.a aVar112 = i2.f36769a;
                                                a2 a2Var17 = a2.GENERAL;
                                                aVar112.getClass();
                                                i2.a.f(a2Var17, "FBTProgressReportViewModel", strD13);
                                                bVar3.f147949p = p13.j0.f134944a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    this.f148140e = b0Var;
                    this.f148136a = null;
                    this.f148137b = listA;
                    this.f148138c = bVar3;
                    this.f148139d = 2;
                    objG5 = qv1.b.G4(bVar3, this);
                    if (objG5 != aVar) {
                        list = listA;
                        bVar2 = bVar3;
                        zBooleanValue = ((Boolean) objG5).booleanValue();
                        bVar2.f147950q = zBooleanValue;
                        if (list != null) {
                            ArrayList arrayList4 = new ArrayList();
                            while (r12.hasNext()) {
                                mVar4 = (tw1.m) obj2;
                                if (!mVar4.e0()) {
                                }
                            }
                            listN0 = h0.N0(arrayList4, new d());
                            if (listN0 != null) {
                                l14 = null;
                            } else {
                                l14 = null;
                            }
                        } else {
                            l14 = null;
                        }
                        if (l14 != null) {
                            z14 = true;
                        }
                        bVar3.f147951r = z14;
                        if (bVar3.f147951r) {
                            j0 j0VarJ17 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                            this.f148140e = b0Var;
                            this.f148136a = null;
                            this.f148137b = null;
                            this.f148138c = null;
                            this.f148139d = 4;
                            objC = j0VarJ17.C(this);
                            u13.a aVar113 = u13.a.COROUTINE_SUSPENDED;
                            if (objC != aVar) {
                                v2Var2 = (v2) objC;
                                j0 j0VarJ18 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = v2Var2;
                                this.f148139d = 5;
                                objC2 = j0VarJ18.C(this);
                                if (objC2 != aVar) {
                                    v2Var3 = (v2) objC2;
                                    j0 j0VarJ19 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148137b = v2Var3;
                                    this.f148139d = 6;
                                    objC3 = j0VarJ19.C(this);
                                    if (objC3 != aVar) {
                                        v2Var4 = v2Var2;
                                        v2Var5 = v2Var3;
                                        v2Var6 = (v2) objC3;
                                        j0 j0VarJ110 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var4;
                                        this.f148137b = v2Var5;
                                        this.f148138c = v2Var6;
                                        this.f148139d = 7;
                                        objC4 = j0VarJ110.C(this);
                                        if (objC4 != aVar) {
                                            v2Var7 = v2Var5;
                                            v2Var8 = v2Var4;
                                            v2Var9 = (v2) objC4;
                                            if (v2Var8 instanceof v2.b) {
                                                bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                            } else {
                                                if (v2Var8 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strN5 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                i2.a aVar114 = i2.f36769a;
                                                a2 a2Var18 = a2.GENERAL;
                                                aVar114.getClass();
                                                i2.a.f(a2Var18, "FBTProgressReportViewModel", strN5);
                                            }
                                            if (v2Var7 instanceof v2.b) {
                                                bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                            } else {
                                                if (v2Var7 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD14 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                i2.a aVar115 = i2.f36769a;
                                                a2 a2Var19 = a2.GENERAL;
                                                aVar115.getClass();
                                                i2.a.f(a2Var19, "FBTProgressReportViewModel", strD14);
                                            }
                                            if (v2Var6 instanceof v2.b) {
                                                bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                            } else {
                                                if (v2Var6 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD15 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                i2.a aVar116 = i2.f36769a;
                                                a2 a2Var110 = a2.GENERAL;
                                                aVar116.getClass();
                                                i2.a.f(a2Var110, "FBTProgressReportViewModel", strD15);
                                            }
                                            if (v2Var9 instanceof v2.b) {
                                                listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                if (listA2 == null) {
                                                    listA2 = p13.j0.f134944a;
                                                }
                                                bVar3.f147949p = listA2;
                                            } else {
                                                if (v2Var9 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD16 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                i2.a aVar117 = i2.f36769a;
                                                a2 a2Var111 = a2.GENERAL;
                                                aVar117.getClass();
                                                i2.a.f(a2Var111, "FBTProgressReportViewModel", strD16);
                                                bVar3.f147949p = p13.j0.f134944a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD17 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting list of training plans. Unable to determine if there is a current active plan. Error=");
                    i2.a aVar118 = i2.f36769a;
                    a2 a2Var20 = a2.GENERAL;
                    aVar118.getClass();
                    i2.a.f(a2Var20, "FBTProgressReportViewModel", strD17);
                    this.f148140e = b0Var;
                    this.f148136a = null;
                    this.f148137b = bVar3;
                    this.f148139d = 3;
                    objG4 = qv1.b.G4(bVar3, this);
                    if (objG4 != aVar) {
                        bVar = bVar3;
                        bVar.f147950q = ((Boolean) objG4).booleanValue();
                        bVar3.f147951r = false;
                        if (bVar3.f147951r) {
                            j0 j0VarJ111 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                            this.f148140e = b0Var;
                            this.f148136a = null;
                            this.f148137b = null;
                            this.f148138c = null;
                            this.f148139d = 4;
                            objC = j0VarJ111.C(this);
                            u13.a aVar119 = u13.a.COROUTINE_SUSPENDED;
                            if (objC != aVar) {
                                v2Var2 = (v2) objC;
                                j0 j0VarJ112 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = v2Var2;
                                this.f148139d = 5;
                                objC2 = j0VarJ112.C(this);
                                if (objC2 != aVar) {
                                    v2Var3 = (v2) objC2;
                                    j0 j0VarJ113 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                                    this.f148140e = b0Var;
                                    this.f148136a = v2Var2;
                                    this.f148137b = v2Var3;
                                    this.f148139d = 6;
                                    objC3 = j0VarJ113.C(this);
                                    if (objC3 != aVar) {
                                        v2Var4 = v2Var2;
                                        v2Var5 = v2Var3;
                                        v2Var6 = (v2) objC3;
                                        j0 j0VarJ114 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                        this.f148140e = b0Var;
                                        this.f148136a = v2Var4;
                                        this.f148137b = v2Var5;
                                        this.f148138c = v2Var6;
                                        this.f148139d = 7;
                                        objC4 = j0VarJ114.C(this);
                                        if (objC4 != aVar) {
                                            v2Var7 = v2Var5;
                                            v2Var8 = v2Var4;
                                            v2Var9 = (v2) objC4;
                                            if (v2Var8 instanceof v2.b) {
                                                bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                            } else {
                                                if (v2Var8 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strN6 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                                i2.a aVar1110 = i2.f36769a;
                                                a2 a2Var112 = a2.GENERAL;
                                                aVar1110.getClass();
                                                i2.a.f(a2Var112, "FBTProgressReportViewModel", strN6);
                                            }
                                            if (v2Var7 instanceof v2.b) {
                                                bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                            } else {
                                                if (v2Var7 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD18 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                                i2.a aVar1111 = i2.f36769a;
                                                a2 a2Var113 = a2.GENERAL;
                                                aVar1111.getClass();
                                                i2.a.f(a2Var113, "FBTProgressReportViewModel", strD18);
                                            }
                                            if (v2Var6 instanceof v2.b) {
                                                bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                            } else {
                                                if (v2Var6 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD19 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                                i2.a aVar1112 = i2.f36769a;
                                                a2 a2Var114 = a2.GENERAL;
                                                aVar1112.getClass();
                                                i2.a.f(a2Var114, "FBTProgressReportViewModel", strD19);
                                            }
                                            if (v2Var9 instanceof v2.b) {
                                                listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                                if (listA2 == null) {
                                                    listA2 = p13.j0.f134944a;
                                                }
                                                bVar3.f147949p = listA2;
                                            } else {
                                                if (v2Var9 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                String strD110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                                i2.a aVar1113 = i2.f36769a;
                                                a2 a2Var115 = a2.GENERAL;
                                                aVar1113.getClass();
                                                i2.a.f(a2Var115, "FBTProgressReportViewModel", strD110);
                                                bVar3.f147949p = p13.j0.f134944a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 2:
                qv1.b bVar5 = (qv1.b) this.f148138c;
                List<tw1.m> list2 = (List) this.f148137b;
                r.b(obj);
                list = list2;
                bVar2 = bVar5;
                objG5 = obj;
                zBooleanValue = ((Boolean) objG5).booleanValue();
                bVar2.f147950q = zBooleanValue;
                if (list != null) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r12.hasNext()) {
                        mVar4 = (tw1.m) obj2;
                        if (!mVar4.e0()) {
                        }
                    }
                    listN0 = h0.N0(arrayList5, new d());
                    if (listN0 != null) {
                        l14 = null;
                    } else {
                        l14 = null;
                    }
                } else {
                    l14 = null;
                }
                if (l14 != null) {
                    z14 = true;
                }
                bVar3.f147951r = z14;
                if (bVar3.f147951r) {
                    j0 j0VarJ115 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                    this.f148140e = b0Var;
                    this.f148136a = null;
                    this.f148137b = null;
                    this.f148138c = null;
                    this.f148139d = 4;
                    objC = j0VarJ115.C(this);
                    u13.a aVar1114 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        v2Var2 = (v2) objC;
                        j0 j0VarJ116 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                        this.f148140e = b0Var;
                        this.f148136a = v2Var2;
                        this.f148139d = 5;
                        objC2 = j0VarJ116.C(this);
                        if (objC2 != aVar) {
                            v2Var3 = (v2) objC2;
                            j0 j0VarJ117 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                            this.f148140e = b0Var;
                            this.f148136a = v2Var2;
                            this.f148137b = v2Var3;
                            this.f148139d = 6;
                            objC3 = j0VarJ117.C(this);
                            if (objC3 != aVar) {
                                v2Var4 = v2Var2;
                                v2Var5 = v2Var3;
                                v2Var6 = (v2) objC3;
                                j0 j0VarJ118 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = v2Var4;
                                this.f148137b = v2Var5;
                                this.f148138c = v2Var6;
                                this.f148139d = 7;
                                objC4 = j0VarJ118.C(this);
                                if (objC4 != aVar) {
                                    v2Var7 = v2Var5;
                                    v2Var8 = v2Var4;
                                    v2Var9 = (v2) objC4;
                                    if (v2Var8 instanceof v2.b) {
                                        bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                    } else {
                                        if (v2Var8 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strN7 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                        i2.a aVar1115 = i2.f36769a;
                                        a2 a2Var116 = a2.GENERAL;
                                        aVar1115.getClass();
                                        i2.a.f(a2Var116, "FBTProgressReportViewModel", strN7);
                                    }
                                    if (v2Var7 instanceof v2.b) {
                                        bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                    } else {
                                        if (v2Var7 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                        i2.a aVar1116 = i2.f36769a;
                                        a2 a2Var117 = a2.GENERAL;
                                        aVar1116.getClass();
                                        i2.a.f(a2Var117, "FBTProgressReportViewModel", strD111);
                                    }
                                    if (v2Var6 instanceof v2.b) {
                                        bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                    } else {
                                        if (v2Var6 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                        i2.a aVar1117 = i2.f36769a;
                                        a2 a2Var118 = a2.GENERAL;
                                        aVar1117.getClass();
                                        i2.a.f(a2Var118, "FBTProgressReportViewModel", strD112);
                                    }
                                    if (v2Var9 instanceof v2.b) {
                                        listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                        if (listA2 == null) {
                                            listA2 = p13.j0.f134944a;
                                        }
                                        bVar3.f147949p = listA2;
                                    } else {
                                        if (v2Var9 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                        i2.a aVar1118 = i2.f36769a;
                                        a2 a2Var119 = a2.GENERAL;
                                        aVar1118.getClass();
                                        i2.a.f(a2Var119, "FBTProgressReportViewModel", strD113);
                                        bVar3.f147949p = p13.j0.f134944a;
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            case 3:
                qv1.b bVar6 = (qv1.b) this.f148137b;
                r.b(obj);
                bVar = bVar6;
                objG4 = obj;
                bVar.f147950q = ((Boolean) objG4).booleanValue();
                bVar3.f147951r = false;
                if (bVar3.f147951r) {
                    j0 j0VarJ119 = ge1.b.j(b0Var, null, null, new b(bVar3, j8, null), 3);
                    this.f148140e = b0Var;
                    this.f148136a = null;
                    this.f148137b = null;
                    this.f148138c = null;
                    this.f148139d = 4;
                    objC = j0VarJ119.C(this);
                    u13.a aVar1119 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        v2Var2 = (v2) objC;
                        j0 j0VarJ1110 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                        this.f148140e = b0Var;
                        this.f148136a = v2Var2;
                        this.f148139d = 5;
                        objC2 = j0VarJ1110.C(this);
                        if (objC2 != aVar) {
                            v2Var3 = (v2) objC2;
                            j0 j0VarJ1111 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                            this.f148140e = b0Var;
                            this.f148136a = v2Var2;
                            this.f148137b = v2Var3;
                            this.f148139d = 6;
                            objC3 = j0VarJ1111.C(this);
                            if (objC3 != aVar) {
                                v2Var4 = v2Var2;
                                v2Var5 = v2Var3;
                                v2Var6 = (v2) objC3;
                                j0 j0VarJ1112 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                                this.f148140e = b0Var;
                                this.f148136a = v2Var4;
                                this.f148137b = v2Var5;
                                this.f148138c = v2Var6;
                                this.f148139d = 7;
                                objC4 = j0VarJ1112.C(this);
                                if (objC4 != aVar) {
                                    v2Var7 = v2Var5;
                                    v2Var8 = v2Var4;
                                    v2Var9 = (v2) objC4;
                                    if (v2Var8 instanceof v2.b) {
                                        bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                                    } else {
                                        if (v2Var8 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strN8 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                        i2.a aVar11110 = i2.f36769a;
                                        a2 a2Var1110 = a2.GENERAL;
                                        aVar11110.getClass();
                                        i2.a.f(a2Var1110, "FBTProgressReportViewModel", strN8);
                                    }
                                    if (v2Var7 instanceof v2.b) {
                                        bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                                    } else {
                                        if (v2Var7 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                        i2.a aVar11111 = i2.f36769a;
                                        a2 a2Var1111 = a2.GENERAL;
                                        aVar11111.getClass();
                                        i2.a.f(a2Var1111, "FBTProgressReportViewModel", strD114);
                                    }
                                    if (v2Var6 instanceof v2.b) {
                                        bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                                    } else {
                                        if (v2Var6 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                        i2.a aVar11112 = i2.f36769a;
                                        a2 a2Var1112 = a2.GENERAL;
                                        aVar11112.getClass();
                                        i2.a.f(a2Var1112, "FBTProgressReportViewModel", strD115);
                                    }
                                    if (v2Var9 instanceof v2.b) {
                                        listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                        if (listA2 == null) {
                                            listA2 = p13.j0.f134944a;
                                        }
                                        bVar3.f147949p = listA2;
                                    } else {
                                        if (v2Var9 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                        i2.a aVar11113 = i2.f36769a;
                                        a2 a2Var1113 = a2.GENERAL;
                                        aVar11113.getClass();
                                        i2.a.f(a2Var1113, "FBTProgressReportViewModel", strD116);
                                        bVar3.f147949p = p13.j0.f134944a;
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            case 4:
                r.b(obj);
                objC = obj;
                v2Var2 = (v2) objC;
                j0 j0VarJ1113 = ge1.b.j(b0Var, null, null, new c(bVar3, null), 3);
                this.f148140e = b0Var;
                this.f148136a = v2Var2;
                this.f148139d = 5;
                objC2 = j0VarJ1113.C(this);
                if (objC2 != aVar) {
                    v2Var3 = (v2) objC2;
                    j0 j0VarJ1114 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                    this.f148140e = b0Var;
                    this.f148136a = v2Var2;
                    this.f148137b = v2Var3;
                    this.f148139d = 6;
                    objC3 = j0VarJ1114.C(this);
                    if (objC3 != aVar) {
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        v2Var6 = (v2) objC3;
                        j0 j0VarJ1115 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                        this.f148140e = b0Var;
                        this.f148136a = v2Var4;
                        this.f148137b = v2Var5;
                        this.f148138c = v2Var6;
                        this.f148139d = 7;
                        objC4 = j0VarJ1115.C(this);
                        if (objC4 != aVar) {
                            v2Var7 = v2Var5;
                            v2Var8 = v2Var4;
                            v2Var9 = (v2) objC4;
                            if (v2Var8 instanceof v2.b) {
                                bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                            } else {
                                if (v2Var8 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strN9 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                                i2.a aVar11114 = i2.f36769a;
                                a2 a2Var1114 = a2.GENERAL;
                                aVar11114.getClass();
                                i2.a.f(a2Var1114, "FBTProgressReportViewModel", strN9);
                            }
                            if (v2Var7 instanceof v2.b) {
                                bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                            } else {
                                if (v2Var7 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strD117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                                i2.a aVar11115 = i2.f36769a;
                                a2 a2Var1115 = a2.GENERAL;
                                aVar11115.getClass();
                                i2.a.f(a2Var1115, "FBTProgressReportViewModel", strD117);
                            }
                            if (v2Var6 instanceof v2.b) {
                                bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                            } else {
                                if (v2Var6 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strD118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                                i2.a aVar11116 = i2.f36769a;
                                a2 a2Var1116 = a2.GENERAL;
                                aVar11116.getClass();
                                i2.a.f(a2Var1116, "FBTProgressReportViewModel", strD118);
                            }
                            if (v2Var9 instanceof v2.b) {
                                listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                                if (listA2 == null) {
                                    listA2 = p13.j0.f134944a;
                                }
                                bVar3.f147949p = listA2;
                            } else {
                                if (v2Var9 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strD119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                                i2.a aVar11117 = i2.f36769a;
                                a2 a2Var1117 = a2.GENERAL;
                                aVar11117.getClass();
                                i2.a.f(a2Var1117, "FBTProgressReportViewModel", strD119);
                                bVar3.f147949p = p13.j0.f134944a;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 5:
                v2Var2 = this.f148136a;
                r.b(obj);
                objC2 = obj;
                v2Var3 = (v2) objC2;
                j0 j0VarJ1116 = ge1.b.j(b0Var, null, null, new e(bVar3, null), 3);
                this.f148140e = b0Var;
                this.f148136a = v2Var2;
                this.f148137b = v2Var3;
                this.f148139d = 6;
                objC3 = j0VarJ1116.C(this);
                if (objC3 != aVar) {
                    v2Var4 = v2Var2;
                    v2Var5 = v2Var3;
                    v2Var6 = (v2) objC3;
                    j0 j0VarJ1117 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                    this.f148140e = b0Var;
                    this.f148136a = v2Var4;
                    this.f148137b = v2Var5;
                    this.f148138c = v2Var6;
                    this.f148139d = 7;
                    objC4 = j0VarJ1117.C(this);
                    if (objC4 != aVar) {
                        v2Var7 = v2Var5;
                        v2Var8 = v2Var4;
                        v2Var9 = (v2) objC4;
                        if (v2Var8 instanceof v2.b) {
                            bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                        } else {
                            if (v2Var8 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strN10 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                            i2.a aVar11118 = i2.f36769a;
                            a2 a2Var1118 = a2.GENERAL;
                            aVar11118.getClass();
                            i2.a.f(a2Var1118, "FBTProgressReportViewModel", strN10);
                        }
                        if (v2Var7 instanceof v2.b) {
                            bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                        } else {
                            if (v2Var7 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strD1110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                            i2.a aVar11119 = i2.f36769a;
                            a2 a2Var1119 = a2.GENERAL;
                            aVar11119.getClass();
                            i2.a.f(a2Var1119, "FBTProgressReportViewModel", strD1110);
                        }
                        if (v2Var6 instanceof v2.b) {
                            bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                        } else {
                            if (v2Var6 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strD1111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                            i2.a aVar111110 = i2.f36769a;
                            a2 a2Var11110 = a2.GENERAL;
                            aVar111110.getClass();
                            i2.a.f(a2Var11110, "FBTProgressReportViewModel", strD1111);
                        }
                        if (v2Var9 instanceof v2.b) {
                            listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                            if (listA2 == null) {
                                listA2 = p13.j0.f134944a;
                            }
                            bVar3.f147949p = listA2;
                        } else {
                            if (v2Var9 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strD1112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                            i2.a aVar111111 = i2.f36769a;
                            a2 a2Var11111 = a2.GENERAL;
                            aVar111111.getClass();
                            i2.a.f(a2Var11111, "FBTProgressReportViewModel", strD1112);
                            bVar3.f147949p = p13.j0.f134944a;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 6:
                v2Var5 = (v2) this.f148137b;
                v2Var4 = this.f148136a;
                r.b(obj);
                objC3 = obj;
                v2Var6 = (v2) objC3;
                j0 j0VarJ1118 = ge1.b.j(b0Var, null, null, new a(bVar3, null), 3);
                this.f148140e = b0Var;
                this.f148136a = v2Var4;
                this.f148137b = v2Var5;
                this.f148138c = v2Var6;
                this.f148139d = 7;
                objC4 = j0VarJ1118.C(this);
                if (objC4 != aVar) {
                    v2Var7 = v2Var5;
                    v2Var8 = v2Var4;
                    v2Var9 = (v2) objC4;
                    if (v2Var8 instanceof v2.b) {
                        bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                    } else {
                        if (v2Var8 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strN11 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                        i2.a aVar111112 = i2.f36769a;
                        a2 a2Var11112 = a2.GENERAL;
                        aVar111112.getClass();
                        i2.a.f(a2Var11112, "FBTProgressReportViewModel", strN11);
                    }
                    if (v2Var7 instanceof v2.b) {
                        bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                    } else {
                        if (v2Var7 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD1113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                        i2.a aVar111113 = i2.f36769a;
                        a2 a2Var11113 = a2.GENERAL;
                        aVar111113.getClass();
                        i2.a.f(a2Var11113, "FBTProgressReportViewModel", strD1113);
                    }
                    if (v2Var6 instanceof v2.b) {
                        bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                    } else {
                        if (v2Var6 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD1114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                        i2.a aVar111114 = i2.f36769a;
                        a2 a2Var11114 = a2.GENERAL;
                        aVar111114.getClass();
                        i2.a.f(a2Var11114, "FBTProgressReportViewModel", strD1114);
                    }
                    if (v2Var9 instanceof v2.b) {
                        listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                        if (listA2 == null) {
                            listA2 = p13.j0.f134944a;
                        }
                        bVar3.f147949p = listA2;
                    } else {
                        if (v2Var9 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD1115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                        i2.a aVar111115 = i2.f36769a;
                        a2 a2Var11115 = a2.GENERAL;
                        aVar111115.getClass();
                        i2.a.f(a2Var11115, "FBTProgressReportViewModel", strD1115);
                        bVar3.f147949p = p13.j0.f134944a;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 7:
                v2 v2Var10 = (v2) this.f148138c;
                v2Var7 = (v2) this.f148137b;
                v2Var8 = this.f148136a;
                r.b(obj);
                v2Var6 = v2Var10;
                objC4 = obj;
                v2Var9 = (v2) objC4;
                if (v2Var8 instanceof v2.b) {
                    bVar3.f147952t = (tw1.m) ((v2.b) v2Var8).f47386a;
                } else {
                    if (v2Var8 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strN12 = wr.g.n("Error retrieving training plan with id=", j8, ". Error=", ((v2.a) v2Var8).f47383a);
                    i2.a aVar111116 = i2.f36769a;
                    a2 a2Var11116 = a2.GENERAL;
                    aVar111116.getClass();
                    i2.a.f(a2Var11116, "FBTProgressReportViewModel", strN12);
                }
                if (v2Var7 instanceof v2.b) {
                    bVar3.f147948o = (List) ((v2.b) v2Var7).f47386a;
                } else {
                    if (v2Var7 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD1116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var7).f47383a, "Error getting adaptive workout types: ");
                    i2.a aVar111117 = i2.f36769a;
                    a2 a2Var11117 = a2.GENERAL;
                    aVar111117.getClass();
                    i2.a.f(a2Var11117, "FBTProgressReportViewModel", strD1116);
                }
                if (v2Var6 instanceof v2.b) {
                    bVar3.f147953v = (e0) ((v2.b) v2Var6).f47386a;
                } else {
                    if (v2Var6 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD1117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var6).f47383a, "Error retrieving user settings: ");
                    i2.a aVar111118 = i2.f36769a;
                    a2 a2Var11118 = a2.GENERAL;
                    aVar111118.getClass();
                    i2.a.f(a2Var11118, "FBTProgressReportViewModel", strD1117);
                }
                if (v2Var9 instanceof v2.b) {
                    listA2 = ((o) ((v2.b) v2Var9).f47386a).a();
                    if (listA2 == null) {
                        listA2 = p13.j0.f134944a;
                    }
                    bVar3.f147949p = listA2;
                } else {
                    if (v2Var9 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD1118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var9).f47383a, "Error retrieving the FBT adaptive training types: ");
                    i2.a aVar111119 = i2.f36769a;
                    a2 a2Var11119 = a2.GENERAL;
                    aVar111119.getClass();
                    i2.a.f(a2Var11119, "FBTProgressReportViewModel", strD1118);
                    bVar3.f147949p = p13.j0.f134944a;
                }
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
