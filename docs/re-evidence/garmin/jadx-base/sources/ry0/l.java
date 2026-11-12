package ry0;

import cy0.n;
import cy0.q;
import e23.p;
import gy0.j0;
import gy0.k0;
import gy0.n0;
import gy0.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ly0.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.y;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListViewModel$processSummaries$2", f = "MultiDayActivitiesListViewModel.kt", l = {169, 180}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f155156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f155157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f155158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f155159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1 f155160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f155161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f155162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f155163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f155164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f155165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<q> f155166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f155167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f155168m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lry0/c;", "<anonymous>", "(Lo53/b0;)Lry0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListViewModel$processSummaries$2$tasks$1$1$1", f = "MultiDayActivitiesListViewModel.kt", l = {128, 130, 148, 151}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f155169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0 f155170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f155171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f155172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f155173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f155174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q f155175g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str, q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155173e = jVar;
            this.f155174f = str;
            this.f155175g = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155173e, this.f155174f, this.f155175g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super c> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00be A[LOOP:0: B:32:0x00b8->B:34:0x00be, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e1 A[LOOP:1: B:36:0x00db->B:38:0x00e1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:42:0x0105 A[LOOP:2: B:40:0x00ff->B:42:0x0105, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x014c A[PHI: r2 r6
          0x014c: PHI (r2v15 java.lang.Object) = (r2v13 java.lang.Object), (r2v33 java.lang.Object) binds: [B:46:0x0149, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r6v7 kotlin.jvm.internal.r0) = (r6v5 kotlin.jvm.internal.r0), (r6v13 kotlin.jvm.internal.r0) binds: [B:46:0x0149, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x0150  */
        /* JADX WARN: Code duplicated, block: B:59:0x0186  */
        /* JADX WARN: Code duplicated, block: B:62:0x018b  */
        /* JADX WARN: Code duplicated, block: B:66:0x019d  */
        /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            r0 r0Var;
            Object objA;
            List list;
            r0 r0Var2;
            T sVar;
            Object objE;
            ArrayList arrayList;
            Iterator it;
            ArrayList arrayList2;
            Iterator it3;
            ArrayList arrayList3;
            Iterator it4;
            cy0.k kVar;
            List<Long> listF;
            Long l14;
            Object objA2;
            r0 r0Var3;
            com.garmin.android.apps.connectmobile.courses.model.e eVar;
            com.garmin.android.library.mapsdkadapter.q qVarA;
            ArrayList arrayListB;
            s sVar2;
            T sVar3;
            i53.c<com.garmin.android.library.mapsdkadapter.p> cVar;
            ArrayList arrayList4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155172d;
            String str = this.f155174f;
            j jVar = this.f155173e;
            if (i14 == 0) {
                r.b(obj);
                k0 k0Var = (k0) jVar.f155106g.getValue();
                this.f155172d = 1;
                objD = k0Var.f80185a.d(str, this);
                if (objD != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                objD = obj;
            } else {
                if (i14 == 2) {
                    r0Var = (r0) this.f155171c;
                    r0 r0Var4 = this.f155170b;
                    List list2 = this.f155169a;
                    r.b(obj);
                    list = list2;
                    r0Var2 = r0Var4;
                    objA = obj;
                    List list3 = (List) objA;
                    arrayList = new ArrayList(y.r(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cy0.p) it.next()).c(jVar.f155100a, list));
                    }
                    arrayList2 = new ArrayList(y.r(list3, 10));
                    it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((cy0.p) it3.next()).a(jVar.f155100a));
                    }
                    arrayList3 = new ArrayList(y.r(list3, 10));
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((cy0.p) it4.next()).b(jVar.f155100a, list));
                    }
                    sVar = new s(i53.a.j(h0.C0(arrayList2, arrayList)), i53.a.j(arrayList3), null, 4, null);
                    r0Var.f105810a = sVar;
                    j0 j0Var = (j0) jVar.f155107h.getValue();
                    this.f155169a = null;
                    this.f155170b = r0Var2;
                    this.f155171c = null;
                    this.f155172d = 3;
                    objE = j0Var.f80181a.e(str, this);
                    if (objE != aVar) {
                        kVar = (cy0.k) objE;
                        if (kVar != null) {
                            long jLongValue = l14.longValue();
                            v vVar = (v) jVar.f155108i.getValue();
                            this.f155169a = null;
                            this.f155170b = r0Var2;
                            this.f155171c = jVar;
                            this.f155172d = 4;
                            objA2 = vVar.a(jLongValue, this);
                            if (objA2 != aVar) {
                                r0Var3 = r0Var2;
                            }
                        }
                        return new c(this.f155175g, (s) r0Var2.f105810a, null, 4, null);
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    r0 r0Var5 = this.f155170b;
                    r.b(obj);
                    r0Var2 = r0Var5;
                    objE = obj;
                    kVar = (cy0.k) objE;
                    if (kVar != null && !p005kotlin.jvm.internal.s.g(kVar.getInaccessibleCourses(), Boolean.TRUE) && (listF = kVar.f()) != null && (l14 = (Long) h0.d0(listF)) != null) {
                        long jLongValue2 = l14.longValue();
                        v vVar2 = (v) jVar.f155108i.getValue();
                        this.f155169a = null;
                        this.f155170b = r0Var2;
                        this.f155171c = jVar;
                        this.f155172d = 4;
                        objA2 = vVar2.a(jLongValue2, this);
                        if (objA2 != aVar) {
                            r0Var3 = r0Var2;
                        }
                        return aVar;
                    }
                    return new c(this.f155175g, (s) r0Var2.f105810a, null, 4, null);
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar = (j) this.f155171c;
                r0Var3 = this.f155170b;
                r.b(obj);
                objA2 = obj;
            }
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objA2;
            if (eVar != null && (qVarA = py0.a.a(jVar.f155100a, eVar)) != null) {
                arrayListB = py0.a.b(eVar);
                sVar2 = (s) r0Var3.f105810a;
                if (sVar2 != null) {
                    cVar = sVar2.f115384b;
                    if (cVar != null) {
                        arrayList4 = new ArrayList(cVar);
                    } else {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.addAll(arrayListB);
                    sVar3 = s.a(sVar2, i53.a.j(arrayList4), qVarA);
                } else {
                    sVar3 = new s(null, i53.a.j(arrayListB), qVarA, 1, null);
                }
                r0Var3.f105810a = sVar3;
            }
            r0Var2 = r0Var3;
            return new c(this.f155175g, (s) r0Var2.f105810a, null, 4, null);
            List list4 = (List) objD;
            r0Var = new r0();
            if (list4 == null || !list4.isEmpty()) {
                Iterator it5 = list4.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (((n) it5.next()).getHasPositionDetails()) {
                            n0 n0Var = (n0) jVar.f155105f.getValue();
                            this.f155169a = list4;
                            this.f155170b = r0Var;
                            this.f155171c = r0Var;
                            this.f155172d = 2;
                            objA = n0Var.a(str, this);
                            if (objA != aVar) {
                                list = list4;
                                r0Var2 = r0Var;
                                List list5 = (List) objA;
                                arrayList = new ArrayList(y.r(list5, 10));
                                it = list5.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((cy0.p) it.next()).c(jVar.f155100a, list));
                                }
                                arrayList2 = new ArrayList(y.r(list5, 10));
                                it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((cy0.p) it3.next()).a(jVar.f155100a));
                                }
                                arrayList3 = new ArrayList(y.r(list5, 10));
                                it4 = list5.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(((cy0.p) it4.next()).b(jVar.f155100a, list));
                                }
                                sVar = new s(i53.a.j(h0.C0(arrayList2, arrayList)), i53.a.j(arrayList3), null, 4, null);
                                r0Var.f105810a = sVar;
                                j0 j0Var2 = (j0) jVar.f155107h.getValue();
                                this.f155169a = null;
                                this.f155170b = r0Var2;
                                this.f155171c = null;
                                this.f155172d = 3;
                                objE = j0Var2.f80181a.e(str, this);
                                if (objE != aVar) {
                                    kVar = (cy0.k) objE;
                                    if (kVar != null) {
                                        long jLongValue3 = l14.longValue();
                                        v vVar3 = (v) jVar.f155108i.getValue();
                                        this.f155169a = null;
                                        this.f155170b = r0Var2;
                                        this.f155171c = jVar;
                                        this.f155172d = 4;
                                        objA2 = vVar3.a(jLongValue3, this);
                                        if (objA2 != aVar) {
                                            r0Var3 = r0Var2;
                                            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objA2;
                                            if (eVar != null) {
                                                arrayListB = py0.a.b(eVar);
                                                sVar2 = (s) r0Var3.f105810a;
                                                if (sVar2 != null) {
                                                    cVar = sVar2.f115384b;
                                                    if (cVar != null) {
                                                        arrayList4 = new ArrayList(cVar);
                                                    } else {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.addAll(arrayListB);
                                                    sVar3 = s.a(sVar2, i53.a.j(arrayList4), qVarA);
                                                } else {
                                                    sVar3 = new s(null, i53.a.j(arrayListB), qVarA, 1, null);
                                                }
                                                r0Var3.f105810a = sVar3;
                                            }
                                            r0Var2 = r0Var3;
                                        }
                                    }
                                    return new c(this.f155175g, (s) r0Var2.f105810a, null, 4, null);
                                }
                            }
                        }
                    }
                    return aVar;
                }
            }
            r0Var2 = r0Var;
            sVar = 0;
            r0Var.f105810a = sVar;
            j0 j0Var3 = (j0) jVar.f155107h.getValue();
            this.f155169a = null;
            this.f155170b = r0Var2;
            this.f155171c = null;
            this.f155172d = 3;
            objE = j0Var3.f80181a.e(str, this);
            if (objE != aVar) {
                kVar = (cy0.k) objE;
                if (kVar != null) {
                    long jLongValue4 = l14.longValue();
                    v vVar4 = (v) jVar.f155108i.getValue();
                    this.f155169a = null;
                    this.f155170b = r0Var2;
                    this.f155171c = jVar;
                    this.f155172d = 4;
                    objA2 = vVar4.a(jLongValue4, this);
                    if (objA2 != aVar) {
                        r0Var3 = r0Var2;
                        eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objA2;
                        if (eVar != null) {
                            arrayListB = py0.a.b(eVar);
                            sVar2 = (s) r0Var3.f105810a;
                            if (sVar2 != null) {
                                cVar = sVar2.f115384b;
                                if (cVar != null) {
                                    arrayList4 = new ArrayList(cVar);
                                } else {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.addAll(arrayListB);
                                sVar3 = s.a(sVar2, i53.a.j(arrayList4), qVarA);
                            } else {
                                sVar3 = new s(null, i53.a.j(arrayListB), qVarA, 1, null);
                            }
                            r0Var3.f105810a = sVar3;
                        }
                        r0Var2 = r0Var3;
                    }
                }
                return new c(this.f155175g, (s) r0Var2.f105810a, null, 4, null);
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List<q> list, j jVar, boolean z14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f155166k = list;
        this.f155167l = jVar;
        this.f155168m = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f155166k, this.f155167l, this.f155168m, dVar);
        lVar.f155165j = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c A[LOOP:0: B:53:0x0136->B:55:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0173 -> B:60:0x0176). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry0.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
