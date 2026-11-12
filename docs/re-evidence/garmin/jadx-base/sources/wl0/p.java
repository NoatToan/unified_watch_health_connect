package wl0;

import androidx.lifecycle.t0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$loadHistoricalSwings$1", f = "GolfSwingAnalysisViewModel.kt", l = {71, 72, 84, 88, 94}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<t0<v2<? extends List<? extends SwingDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f185966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f185967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f185968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f185969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<Long> f185970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185971f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$loadHistoricalSwings$1$swingDetailFirst$1", f = "GolfSwingAnalysisViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends SwingDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Long> f185974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, List<Long> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f185973b = cVar;
            this.f185974c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f185973b, this.f185974c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends SwingDTO>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185972a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ql0.b bVar = this.f185973b.f35814a;
            String strValueOf = String.valueOf(this.f185974c.get(0));
            this.f185972a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.e(bVar, strValueOf, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$loadHistoricalSwings$1$swingDetailSecond$1", f = "GolfSwingAnalysisViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends SwingDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Long> f185977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, List<Long> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f185976b = cVar;
            this.f185977c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f185976b, this.f185977c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends SwingDTO>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185975a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ql0.b bVar = this.f185976b.f35814a;
            String strValueOf = String.valueOf(this.f185977c.get(1));
            this.f185975a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.e(bVar, strValueOf, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List<Long> list, com.garmin.android.apps.connectmobile.golf.truswing.c cVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f185970e = list;
        this.f185971f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f185970e, this.f185971f, dVar);
        pVar.f185969d = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends List<? extends SwingDTO>>> t0Var, t13.d<? super Unit> dVar) {
        return ((p) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[PHI: r3 r8
      0x0083: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v15 java.lang.Object) binds: [B:24:0x007f, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r8v4 com.garmin.android.apps.connectmobile.v2) = (r8v3 com.garmin.android.apps.connectmobile.v2), (r8v7 com.garmin.android.apps.connectmobile.v2) binds: [B:24:0x007f, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r1.emit(r11, r18) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r1.emit(r11, r18) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (r1.emit(r11, r18) == r2) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        Object objC;
        v2 v2Var;
        Object objAwait;
        v2 v2Var2;
        ArrayList arrayList;
        t0 t0Var = (t0) this.f185969d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185968c;
        com.garmin.android.apps.connectmobile.golf.truswing.c cVar = this.f185971f;
        if (i14 == 0) {
            o13.r.b(obj);
            List<Long> list = this.f185970e;
            if (list != null && !list.isEmpty()) {
                j0 j0VarJ2 = ge1.b.j(v1.a(cVar), null, null, new a(cVar, list, null), 3);
                j0VarJ = ge1.b.j(v1.a(cVar), null, null, new b(cVar, list, null), 3);
                this.f185969d = t0Var;
                this.f185966a = j0VarJ;
                this.f185968c = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                    v2Var = (v2) objC;
                    this.f185969d = t0Var;
                    this.f185966a = null;
                    this.f185967b = v2Var;
                    this.f185968c = 2;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar) {
                        v2Var2 = (v2) objAwait;
                        if (v2Var instanceof v2.b) {
                            arrayList = new ArrayList();
                            T t7 = ((v2.b) v2Var).f47386a;
                            com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t7);
                            arrayList.add(t7);
                            if (v2Var2 instanceof v2.b) {
                                T t14 = ((v2.b) v2Var2).f47386a;
                                com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t14);
                                arrayList.add(t14);
                                v2.b bVar = new v2.b(arrayList, 200, null, null, 12, null);
                                this.f185969d = null;
                                this.f185966a = null;
                                this.f185967b = null;
                                this.f185968c = 3;
                            } else {
                                if (!(v2Var2 instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                a2 a2Var = a2.GOLF;
                                i2.f36769a.getClass();
                                i2.a.a(a2Var, "Second swing load failed in compare mode!");
                                v2.a aVar2 = new v2.a(new Exception("Second swing load failed in compare mode!"), null, null, 6, null);
                                this.f185969d = null;
                                this.f185966a = null;
                                this.f185967b = null;
                                this.f185968c = 4;
                            }
                        } else {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            a2 a2Var2 = a2.GOLF;
                            i2.f36769a.getClass();
                            i2.a.a(a2Var2, "First swing load failed in compare mode!");
                            v2.a aVar3 = new v2.a(new Exception("First swing load failed in compare mode!"), null, null, 6, null);
                            this.f185969d = null;
                            this.f185966a = null;
                            this.f185967b = null;
                            this.f185968c = 5;
                        }
                    }
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            j0VarJ = this.f185966a;
            o13.r.b(obj);
            objC = obj;
            v2Var = (v2) objC;
            this.f185969d = t0Var;
            this.f185966a = null;
            this.f185967b = v2Var;
            this.f185968c = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                v2Var2 = (v2) objAwait;
                if (v2Var instanceof v2.b) {
                    arrayList = new ArrayList();
                    T t15 = ((v2.b) v2Var).f47386a;
                    com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t15);
                    arrayList.add(t15);
                    if (v2Var2 instanceof v2.b) {
                        T t16 = ((v2.b) v2Var2).f47386a;
                        com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t16);
                        arrayList.add(t16);
                        v2.b bVar2 = new v2.b(arrayList, 200, null, null, 12, null);
                        this.f185969d = null;
                        this.f185966a = null;
                        this.f185967b = null;
                        this.f185968c = 3;
                    } else {
                        if (!(v2Var2 instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        a2 a2Var3 = a2.GOLF;
                        i2.f36769a.getClass();
                        i2.a.a(a2Var3, "Second swing load failed in compare mode!");
                        v2.a aVar4 = new v2.a(new Exception("Second swing load failed in compare mode!"), null, null, 6, null);
                        this.f185969d = null;
                        this.f185966a = null;
                        this.f185967b = null;
                        this.f185968c = 4;
                    }
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var4 = a2.GOLF;
                    i2.f36769a.getClass();
                    i2.a.a(a2Var4, "First swing load failed in compare mode!");
                    v2.a aVar5 = new v2.a(new Exception("First swing load failed in compare mode!"), null, null, 6, null);
                    this.f185969d = null;
                    this.f185966a = null;
                    this.f185967b = null;
                    this.f185968c = 5;
                }
            }
            return aVar;
        }
        if (i14 == 2) {
            v2 v2Var3 = this.f185967b;
            o13.r.b(obj);
            v2Var = v2Var3;
            objAwait = obj;
            v2Var2 = (v2) objAwait;
            if (v2Var instanceof v2.b) {
                arrayList = new ArrayList();
                T t17 = ((v2.b) v2Var).f47386a;
                com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t17);
                arrayList.add(t17);
                if (v2Var2 instanceof v2.b) {
                    T t18 = ((v2.b) v2Var2).f47386a;
                    com.garmin.android.apps.connectmobile.golf.truswing.c.x4(cVar, (SwingDTO) t18);
                    arrayList.add(t18);
                    v2.b bVar3 = new v2.b(arrayList, 200, null, null, 12, null);
                    this.f185969d = null;
                    this.f185966a = null;
                    this.f185967b = null;
                    this.f185968c = 3;
                } else {
                    if (!(v2Var2 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var5 = a2.GOLF;
                    i2.f36769a.getClass();
                    i2.a.a(a2Var5, "Second swing load failed in compare mode!");
                    v2.a aVar6 = new v2.a(new Exception("Second swing load failed in compare mode!"), null, null, 6, null);
                    this.f185969d = null;
                    this.f185966a = null;
                    this.f185967b = null;
                    this.f185968c = 4;
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                a2 a2Var6 = a2.GOLF;
                i2.f36769a.getClass();
                i2.a.a(a2Var6, "First swing load failed in compare mode!");
                v2.a aVar7 = new v2.a(new Exception("First swing load failed in compare mode!"), null, null, 6, null);
                this.f185969d = null;
                this.f185966a = null;
                this.f185967b = null;
                this.f185968c = 5;
            }
        } else {
            if (i14 != 3 && i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
