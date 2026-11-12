package qt1;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import yc.t2;
import yc.u2;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$initializeTrailDetails$1", f = "TrailDetailsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 180, 201, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 212, 215, 258, 269, 289, 278, 293, 297}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f147549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r53.i f147550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qs1.s f147551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c80.p f147552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i53.c f147553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pt1.p f147554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pt1.n f147555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p2 f147556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f147557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f147558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f147559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f147560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f147561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f147562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f147563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f147564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ qs1.d f147565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List<pt1.t> f147566r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f147567t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Long f147568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f147569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f147570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Long f147571y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$initializeTrailDetails$1$photosFlow$1$1$1", f = "TrailDetailsViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f147573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f147574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f147573b = kVar;
            this.f147574c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f147573b, this.f147574c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147572a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = this.f147573b.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, this.f147574c, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073740799);
                this.f147572a = 1;
                p2Var.k(null, oVarA);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k kVar, boolean z14, long j8, qs1.d dVar, List<pt1.t> list, Context context, Long l14, Integer num, Long l15, Long l16, t13.d<? super c0> dVar2) {
        super(2, dVar2);
        this.f147562n = kVar;
        this.f147563o = z14;
        this.f147564p = j8;
        this.f147565q = dVar;
        this.f147566r = list;
        this.f147567t = context;
        this.f147568v = l14;
        this.f147569w = num;
        this.f147570x = l15;
        this.f147571y = l16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f147562n, this.f147563o, this.f147564p, this.f147565q, this.f147566r, this.f147567t, this.f147568v, this.f147569w, this.f147570x, this.f147571y, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0342  */
    /* JADX WARN: Code duplicated, block: B:105:0x0345  */
    /* JADX WARN: Code duplicated, block: B:107:0x0354  */
    /* JADX WARN: Code duplicated, block: B:109:0x035b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0387  */
    /* JADX WARN: Code duplicated, block: B:114:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x03be  */
    /* JADX WARN: Code duplicated, block: B:125:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:138:0x040e  */
    /* JADX WARN: Code duplicated, block: B:142:0x041b  */
    /* JADX WARN: Code duplicated, block: B:144:0x041f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0421  */
    /* JADX WARN: Code duplicated, block: B:146:0x0424  */
    /* JADX WARN: Code duplicated, block: B:150:0x0452  */
    /* JADX WARN: Code duplicated, block: B:153:0x0466  */
    /* JADX WARN: Code duplicated, block: B:154:0x0469  */
    /* JADX WARN: Code duplicated, block: B:158:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:160:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:164:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0166 A[PHI: r0 r2 r3
      0x0166: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v17 java.lang.Object) binds: [B:32:0x0162, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:32:0x0162, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r3v3 java.lang.Long) = (r3v1 java.lang.Long), (r3v5 java.lang.Long) binds: [B:32:0x0162, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x01be  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0210  */
    /* JADX WARN: Code duplicated, block: B:55:0x0217  */
    /* JADX WARN: Code duplicated, block: B:58:0x0238  */
    /* JADX WARN: Code duplicated, block: B:62:0x0267  */
    /* JADX WARN: Code duplicated, block: B:65:0x0272  */
    /* JADX WARN: Code duplicated, block: B:68:0x027f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0282  */
    /* JADX WARN: Code duplicated, block: B:73:0x0297  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f7 A[PHI: r6
      0x02f7: PHI (r6v14 boolean) = (r6v3 boolean), (r6v16 boolean) binds: [B:96:0x031c, B:86:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0303  */
    /* JADX WARN: Code duplicated, block: B:94:0x0313 A[LOOP:1: B:89:0x02fd->B:94:0x0313, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0315  */
    /* JADX WARN: Code duplicated, block: B:97:0x031e  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e9, code lost:
    
        if (qt1.k.C4(r10, r12, r5) == r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04fe, code lost:
    
        if (qt1.k.x4(r10) == r7) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v6, types: [e23.a, java.lang.Object, java.util.List, org.koin.core.qualifier.Qualifier, r53.i] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32, types: [c80.p, i53.c, java.util.List, pt1.n, pt1.p, qs1.s, r53.i] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v3 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i14;
        Long l14;
        Object objS3;
        List list;
        r53.i iVarA;
        qs1.d dVar;
        Long curatedCourseId;
        int i15;
        Long l15;
        Object objC3;
        List list2;
        Long l16;
        Object objW;
        v2 v2Var;
        ?? r14;
        qs1.s sVar;
        Object objJ;
        qs1.s sVar2;
        List list3;
        ?? r15;
        c80.p pVar;
        List list4;
        Object objW0;
        r53.i iVar;
        List list5;
        c80.p pVar2;
        ?? r16;
        v2 v2Var2;
        ?? r17;
        i53.c cVarE;
        List<pt1.t> list6;
        boolean z14;
        Boolean favorite;
        ?? BooleanValue;
        pt1.p pVarB;
        Integer num;
        Long l17;
        int i16;
        Long l18;
        Object objO4;
        i53.c cVar;
        pt1.p pVar3;
        c80.p pVar4;
        int i17;
        r53.i iVar2;
        int i18;
        int i19;
        i53.c cVar2;
        int i24;
        Long l19;
        long millis;
        Iterator it;
        ArrayList arrayList;
        Iterator it3;
        qs1.h locationDTO;
        String courseNameUriComponent;
        qs1.v vVar;
        List<qs1.u> listB;
        v2 v2Var3;
        r53.i iVar3;
        Integer num2;
        ?? r18;
        Object obj2;
        pt1.x xVar;
        pt1.n nVar;
        pt1.n nVar2;
        p2 p2Var;
        boolean z15;
        Object objB4;
        r53.i iVar4;
        pt1.p pVar5;
        c80.p pVar6;
        ?? r19;
        int i25;
        pt1.o oVar;
        ?? r44;
        ?? r24;
        int i26;
        int i27;
        ?? r25;
        c0 c0Var = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i28 = c0Var.f147561m;
        Context context = c0Var.f147567t;
        boolean z16 = c0Var.f147563o;
        long j8 = c0Var.f147564p;
        k kVar = c0Var.f147562n;
        switch (i28) {
            case 0:
                o13.r.b(obj);
                if (kVar.f147672g != null && !z16) {
                    return Unit.INSTANCE;
                }
                p2 p2Var2 = kVar.f147673h;
                pt1.o oVar2 = new pt1.o(true, false, false, null, false, false, 0, false, false, z16 ? ((pt1.o) p2Var2.getValue()).f140912j : null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 1073741308, null);
                i14 = 1;
                c0Var.f147561m = 1;
                l14 = null;
                p2Var2.k(null, oVar2);
                if (Unit.INSTANCE != aVar) {
                    ss1.a0 a0Var = kVar.f147667b;
                    c0Var.f147561m = 2;
                    objS3 = a0Var.s3(j8, c0Var);
                    if (objS3 != aVar) {
                        list = (List) objS3;
                        vs1.k kVar2 = kVar.f147684t;
                        list.getClass();
                        TreeSet treeSet = new TreeSet();
                        p13.h0.W0(list, treeSet);
                        kVar2.getClass();
                        kVar2.f179847f = treeSet;
                        iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, j8, 0), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                        dVar = c0Var.f147565q;
                        if (dVar != null) {
                            curatedCourseId = dVar.getCuratedCourseId();
                        } else {
                            curatedCourseId = l14;
                        }
                        if (curatedCourseId == null || dVar.getLocationDTO() == null || dVar.getCourseNameUriComponent() == null) {
                            i15 = i14;
                            l15 = l14;
                            ss1.a aVar2 = kVar.f147666a;
                            c0Var.f147549a = list;
                            c0Var.f147550b = iVarA;
                            c0Var.f147561m = 4;
                            objC3 = aVar2.c3(j8, c0Var);
                            if (objC3 != aVar) {
                                list2 = list;
                                v2Var = (v2) objC3;
                                r14 = l15;
                                if (v2Var instanceof v2.b) {
                                    c0Var.f147549a = r14;
                                    c0Var.f147550b = r14;
                                    c0Var.f147561m = 12;
                                } else {
                                    sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                                    j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                                    c80.q qVar = c80.q.GARMIN_TRAILS;
                                    c0Var.f147549a = list2;
                                    c0Var.f147550b = iVarA;
                                    c0Var.f147551c = sVar;
                                    c0Var.f147561m = 5;
                                    objJ = j1Var.j(qVar, c0Var);
                                    if (objJ != aVar) {
                                        sVar2 = sVar;
                                        list3 = list2;
                                        r15 = r14;
                                        pVar = (c80.p) objJ;
                                        kVar.f147672g = sVar2.f147341a;
                                        ss1.a0 a0Var2 = kVar.f147667b;
                                        us1.e eVar = us1.e.MOST_HELPFUL;
                                        c0Var.f147549a = list3;
                                        c0Var.f147550b = iVarA;
                                        c0Var.f147551c = sVar2;
                                        c0Var.f147552d = pVar;
                                        c0Var.f147561m = 6;
                                        list4 = list3;
                                        objW0 = a0Var2.w0(c0Var.f147564p, eVar, 0, 5, this);
                                        c0Var = this;
                                        if (objW0 != aVar) {
                                            iVar = iVarA;
                                            list5 = list4;
                                            pVar2 = pVar;
                                            r16 = r15;
                                            v2Var2 = (v2) objW0;
                                            if ((v2Var2 instanceof v2.b) || (vVar = (qs1.v) ((v2.b) v2Var2).f47386a) == null) {
                                                r17 = r16;
                                            } else {
                                                listB = vVar.b();
                                            }
                                            if (r17 != 0) {
                                                r17 = listB;
                                                arrayList = new ArrayList(p13.y.r(r17, 10));
                                                it3 = r17.iterator();
                                                while (it3.hasNext()) {
                                                    qs1.u uVar = (qs1.u) it3.next();
                                                    lt1.j jVar = lt1.j.f114865a;
                                                    boolean zR = p13.h0.R(list5, uVar.getTripReportId());
                                                    Iterator it4 = it3;
                                                    locationDTO = sVar2.f147341a.getLocationDTO();
                                                    if (locationDTO == null) {
                                                        locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                    }
                                                    List list7 = list5;
                                                    courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                                    if (courseNameUriComponent == null) {
                                                        courseNameUriComponent = "";
                                                    }
                                                    jVar.getClass();
                                                    arrayList.add(lt1.j.e(uVar, context, zR, locationDTO, courseNameUriComponent));
                                                    it3 = it4;
                                                    list5 = list7;
                                                }
                                                cVarE = i53.a.e(arrayList);
                                            } else {
                                                r17 = listB;
                                                cVarE = null;
                                            }
                                            list6 = c0Var.f147566r;
                                            if (list6.isEmpty()) {
                                                if (!list6.isEmpty()) {
                                                    it = list6.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            z14 = z16;
                                                            if (((pt1.t) it.next()).f140967a == j8) {
                                                                BooleanValue = i15;
                                                            } else {
                                                                z16 = z14;
                                                            }
                                                        }
                                                    }
                                                }
                                                z14 = z16;
                                                BooleanValue = 0;
                                            } else {
                                                z14 = z16;
                                                favorite = sVar2.f147341a.getFavorite();
                                                if (favorite != null) {
                                                    BooleanValue = favorite.booleanValue();
                                                } else {
                                                    BooleanValue = 0;
                                                }
                                            }
                                            lt1.j jVar2 = lt1.j.f114865a;
                                            Boolean boolValueOf = Boolean.valueOf((boolean) BooleanValue);
                                            jVar2.getClass();
                                            pVarB = lt1.j.b(sVar2, context, boolValueOf);
                                            kVar.f147677l.setValue(null);
                                            num = c0Var.f147569w;
                                            l17 = c0Var.f147568v;
                                            if (l17 != null || num == null || z14) {
                                                i16 = 0;
                                            } else {
                                                i16 = i15;
                                            }
                                            if (i16 != 0) {
                                                long j14 = pVarB.f140929a;
                                                String str = pVarB.f140931c.f140953a;
                                                l19 = c0Var.f147570x;
                                                if (l19 != null) {
                                                    millis = l19.longValue();
                                                } else {
                                                    millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                                }
                                                c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j14, str, millis, new Long(l17.longValue()));
                                            } else {
                                                l18 = c0Var.f147571y;
                                                if (l18 == null && !z14) {
                                                    long jLongValue = l18.longValue();
                                                    c0Var.f147549a = null;
                                                    c0Var.f147550b = iVar;
                                                    c0Var.f147551c = null;
                                                    c0Var.f147552d = pVar2;
                                                    c0Var.f147553e = cVarE;
                                                    c0Var.f147554f = pVarB;
                                                    c0Var.f147557i = BooleanValue == true ? 1 : 0;
                                                    c0Var.f147558j = i16;
                                                    c0Var.f147559k = 0;
                                                    c0Var.f147561m = 7;
                                                    objO4 = k.O4(kVar, context, jLongValue, c0Var);
                                                    if (objO4 != aVar) {
                                                        cVar = cVarE;
                                                        pVar3 = pVarB;
                                                        pVar4 = pVar2;
                                                        i17 = i16;
                                                        iVar2 = iVar;
                                                        i18 = BooleanValue == true ? 1 : 0;
                                                        i19 = 0;
                                                        v2Var3 = (v2) objO4;
                                                        if (!(v2Var3 instanceof v2.b)) {
                                                            obj2 = ((v2.b) v2Var3).f47386a;
                                                            xVar = (pt1.x) obj2;
                                                            if (xVar.f141019p || !xVar.f141023t) {
                                                                kVar.f147677l.setValue(obj2);
                                                            }
                                                        } else if ((v2Var3 instanceof v2.a) || (num2 = ((v2.a) v2Var3).f47384b) == null || num2.intValue() != 404) {
                                                            c0Var.f147549a = null;
                                                            c0Var.f147550b = iVar2;
                                                            c0Var.f147551c = null;
                                                            c0Var.f147552d = pVar4;
                                                            c0Var.f147553e = cVar;
                                                            c0Var.f147554f = pVar3;
                                                            c0Var.f147555g = null;
                                                            c0Var.f147557i = i18;
                                                            c0Var.f147558j = i17;
                                                            c0Var.f147559k = i19;
                                                            c0Var.f147561m = 8;
                                                            if (kVar.K4(context, c0Var) != aVar) {
                                                                iVar3 = iVar2;
                                                                i16 = i17;
                                                                i24 = i19;
                                                                r18 = i18;
                                                                iVar = iVar3;
                                                                cVar2 = cVar;
                                                                if (i16 != 0) {
                                                                    nVar = pt1.n.f.f140900a;
                                                                } else if (i24 != 0) {
                                                                    nVar = pt1.n.h.f140902a;
                                                                } else {
                                                                    nVar = pt1.n.b.f140894a;
                                                                }
                                                                nVar2 = nVar;
                                                                p2Var = kVar.f147673h;
                                                                z15 = pVar4 instanceof c80.p.a;
                                                                c0Var.f147549a = null;
                                                                c0Var.f147550b = iVar;
                                                                c0Var.f147551c = null;
                                                                c0Var.f147552d = pVar4;
                                                                c0Var.f147553e = cVar2;
                                                                c0Var.f147554f = pVar3;
                                                                c0Var.f147555g = nVar2;
                                                                c0Var.f147556h = p2Var;
                                                                c0Var.f147557i = r18;
                                                                c0Var.f147558j = i16;
                                                                c0Var.f147559k = i24;
                                                                c0Var.f147560l = z15 ? 1 : 0;
                                                                c0Var.f147561m = 9;
                                                                objB4 = k.B4(kVar, c0Var);
                                                                if (objB4 != aVar) {
                                                                    iVar4 = iVar;
                                                                    pVar5 = pVar3;
                                                                    pVar6 = pVar4;
                                                                    r19 = r18;
                                                                    i25 = z15 ? 1 : 0;
                                                                    i53.c cVar3 = cVar2;
                                                                    pt1.n nVar3 = nVar2;
                                                                    boolean zBooleanValue = ((Boolean) objB4).booleanValue();
                                                                    if (i25 != 0) {
                                                                        r44 = i15;
                                                                    } else {
                                                                        r44 = 0;
                                                                    }
                                                                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar3, null, null, nVar3, null, null, null, pVar6, r44, false, zBooleanValue, false, false, false, 980825598, null);
                                                                    r24 = 0;
                                                                    c0Var.f147549a = null;
                                                                    c0Var.f147550b = null;
                                                                    c0Var.f147551c = null;
                                                                    c0Var.f147552d = null;
                                                                    c0Var.f147553e = null;
                                                                    c0Var.f147554f = null;
                                                                    c0Var.f147555g = null;
                                                                    c0Var.f147556h = null;
                                                                    c0Var.f147557i = r19;
                                                                    c0Var.f147558j = i16;
                                                                    c0Var.f147559k = i24;
                                                                    c0Var.f147561m = 10;
                                                                    if (p2Var.emit(oVar, c0Var) != aVar) {
                                                                        i26 = i24;
                                                                        i27 = i16;
                                                                        if (i27 == 0) {
                                                                            r25 = r19;
                                                                            c0Var.f147549a = r24;
                                                                            c0Var.f147550b = r24;
                                                                            c0Var.f147551c = r24;
                                                                            c0Var.f147552d = r24;
                                                                            c0Var.f147553e = r24;
                                                                            c0Var.f147554f = r24;
                                                                            c0Var.f147555g = r24;
                                                                            c0Var.f147557i = r25;
                                                                            c0Var.f147558j = i27;
                                                                            c0Var.f147559k = i26;
                                                                            c0Var.f147561m = 11;
                                                                            break;
                                                                        }
                                                                        r25 = r19;
                                                                        k.y4(kVar, context);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        r18 = i18;
                                                        cVar2 = cVar;
                                                        iVar = iVar2;
                                                        i16 = i17;
                                                        i24 = i15;
                                                        if (i16 != 0) {
                                                            nVar = pt1.n.f.f140900a;
                                                        } else if (i24 != 0) {
                                                            nVar = pt1.n.h.f140902a;
                                                        } else {
                                                            nVar = pt1.n.b.f140894a;
                                                        }
                                                        nVar2 = nVar;
                                                        p2Var = kVar.f147673h;
                                                        z15 = pVar4 instanceof c80.p.a;
                                                        c0Var.f147549a = null;
                                                        c0Var.f147550b = iVar;
                                                        c0Var.f147551c = null;
                                                        c0Var.f147552d = pVar4;
                                                        c0Var.f147553e = cVar2;
                                                        c0Var.f147554f = pVar3;
                                                        c0Var.f147555g = nVar2;
                                                        c0Var.f147556h = p2Var;
                                                        c0Var.f147557i = r18;
                                                        c0Var.f147558j = i16;
                                                        c0Var.f147559k = i24;
                                                        c0Var.f147560l = z15 ? 1 : 0;
                                                        c0Var.f147561m = 9;
                                                        objB4 = k.B4(kVar, c0Var);
                                                        if (objB4 != aVar) {
                                                            iVar4 = iVar;
                                                            pVar5 = pVar3;
                                                            pVar6 = pVar4;
                                                            r19 = r18;
                                                            i25 = z15 ? 1 : 0;
                                                            i53.c cVar4 = cVar2;
                                                            pt1.n nVar4 = nVar2;
                                                            boolean zBooleanValue2 = ((Boolean) objB4).booleanValue();
                                                            if (i25 != 0) {
                                                                r44 = i15;
                                                            } else {
                                                                r44 = 0;
                                                            }
                                                            oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar4, null, null, nVar4, null, null, null, pVar6, r44, false, zBooleanValue2, false, false, false, 980825598, null);
                                                            r24 = 0;
                                                            c0Var.f147549a = null;
                                                            c0Var.f147550b = null;
                                                            c0Var.f147551c = null;
                                                            c0Var.f147552d = null;
                                                            c0Var.f147553e = null;
                                                            c0Var.f147554f = null;
                                                            c0Var.f147555g = null;
                                                            c0Var.f147556h = null;
                                                            c0Var.f147557i = r19;
                                                            c0Var.f147558j = i16;
                                                            c0Var.f147559k = i24;
                                                            c0Var.f147561m = 10;
                                                            if (p2Var.emit(oVar, c0Var) != aVar) {
                                                                i26 = i24;
                                                                i27 = i16;
                                                                if (i27 == 0) {
                                                                    r25 = r19;
                                                                    c0Var.f147549a = r24;
                                                                    c0Var.f147550b = r24;
                                                                    c0Var.f147551c = r24;
                                                                    c0Var.f147552d = r24;
                                                                    c0Var.f147553e = r24;
                                                                    c0Var.f147554f = r24;
                                                                    c0Var.f147555g = r24;
                                                                    c0Var.f147557i = r25;
                                                                    c0Var.f147558j = i27;
                                                                    c0Var.f147559k = i26;
                                                                    c0Var.f147561m = 11;
                                                                    break;
                                                                }
                                                                r25 = r19;
                                                                k.y4(kVar, context);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            pVar4 = pVar2;
                                            cVar2 = cVarE;
                                            pVar3 = pVarB;
                                            i24 = 0;
                                            r18 = BooleanValue;
                                            if (i16 != 0) {
                                                nVar = pt1.n.f.f140900a;
                                            } else if (i24 != 0) {
                                                nVar = pt1.n.h.f140902a;
                                            } else {
                                                nVar = pt1.n.b.f140894a;
                                            }
                                            nVar2 = nVar;
                                            p2Var = kVar.f147673h;
                                            z15 = pVar4 instanceof c80.p.a;
                                            c0Var.f147549a = null;
                                            c0Var.f147550b = iVar;
                                            c0Var.f147551c = null;
                                            c0Var.f147552d = pVar4;
                                            c0Var.f147553e = cVar2;
                                            c0Var.f147554f = pVar3;
                                            c0Var.f147555g = nVar2;
                                            c0Var.f147556h = p2Var;
                                            c0Var.f147557i = r18;
                                            c0Var.f147558j = i16;
                                            c0Var.f147559k = i24;
                                            c0Var.f147560l = z15 ? 1 : 0;
                                            c0Var.f147561m = 9;
                                            objB4 = k.B4(kVar, c0Var);
                                            if (objB4 != aVar) {
                                                iVar4 = iVar;
                                                pVar5 = pVar3;
                                                pVar6 = pVar4;
                                                r19 = r18;
                                                i25 = z15 ? 1 : 0;
                                                i53.c cVar5 = cVar2;
                                                pt1.n nVar5 = nVar2;
                                                boolean zBooleanValue3 = ((Boolean) objB4).booleanValue();
                                                if (i25 != 0) {
                                                    r44 = i15;
                                                } else {
                                                    r44 = 0;
                                                }
                                                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar5, null, null, nVar5, null, null, null, pVar6, r44, false, zBooleanValue3, false, false, false, 980825598, null);
                                                r24 = 0;
                                                c0Var.f147549a = null;
                                                c0Var.f147550b = null;
                                                c0Var.f147551c = null;
                                                c0Var.f147552d = null;
                                                c0Var.f147553e = null;
                                                c0Var.f147554f = null;
                                                c0Var.f147555g = null;
                                                c0Var.f147556h = null;
                                                c0Var.f147557i = r19;
                                                c0Var.f147558j = i16;
                                                c0Var.f147559k = i24;
                                                c0Var.f147561m = 10;
                                                if (p2Var.emit(oVar, c0Var) != aVar) {
                                                    i26 = i24;
                                                    i27 = i16;
                                                    if (i27 == 0) {
                                                        r25 = r19;
                                                        c0Var.f147549a = r24;
                                                        c0Var.f147550b = r24;
                                                        c0Var.f147551c = r24;
                                                        c0Var.f147552d = r24;
                                                        c0Var.f147553e = r24;
                                                        c0Var.f147554f = r24;
                                                        c0Var.f147555g = r24;
                                                        c0Var.f147557i = r25;
                                                        c0Var.f147558j = i27;
                                                        c0Var.f147559k = i26;
                                                        c0Var.f147561m = 11;
                                                        break;
                                                    }
                                                    r25 = r19;
                                                    k.y4(kVar, context);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ss1.a aVar3 = kVar.f147666a;
                            long jLongValue2 = dVar.getCuratedCourseId().longValue();
                            Long l24 = l14;
                            qs1.h locationDTO2 = dVar.getLocationDTO();
                            String courseNameUriComponent2 = dVar.getCourseNameUriComponent();
                            c0Var.f147549a = list;
                            c0Var.f147550b = iVarA;
                            c0Var.f147561m = 3;
                            l16 = l24;
                            i15 = i14;
                            objW = aVar3.W(jLongValue2, locationDTO2, courseNameUriComponent2, c0Var);
                            if (objW != aVar) {
                                list2 = list;
                                v2Var = (v2) objW;
                                r14 = l16;
                                if (v2Var instanceof v2.b) {
                                    c0Var.f147549a = r14;
                                    c0Var.f147550b = r14;
                                    c0Var.f147561m = 12;
                                } else {
                                    sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                                    j1 j1Var2 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                                    c80.q qVar2 = c80.q.GARMIN_TRAILS;
                                    c0Var.f147549a = list2;
                                    c0Var.f147550b = iVarA;
                                    c0Var.f147551c = sVar;
                                    c0Var.f147561m = 5;
                                    objJ = j1Var2.j(qVar2, c0Var);
                                    if (objJ != aVar) {
                                        sVar2 = sVar;
                                        list3 = list2;
                                        r15 = r14;
                                        pVar = (c80.p) objJ;
                                        kVar.f147672g = sVar2.f147341a;
                                        ss1.a0 a0Var3 = kVar.f147667b;
                                        us1.e eVar2 = us1.e.MOST_HELPFUL;
                                        c0Var.f147549a = list3;
                                        c0Var.f147550b = iVarA;
                                        c0Var.f147551c = sVar2;
                                        c0Var.f147552d = pVar;
                                        c0Var.f147561m = 6;
                                        list4 = list3;
                                        objW0 = a0Var3.w0(c0Var.f147564p, eVar2, 0, 5, this);
                                        c0Var = this;
                                        if (objW0 != aVar) {
                                            iVar = iVarA;
                                            list5 = list4;
                                            pVar2 = pVar;
                                            r16 = r15;
                                            v2Var2 = (v2) objW0;
                                            if (v2Var2 instanceof v2.b) {
                                                r17 = r16;
                                            } else {
                                                r17 = r16;
                                            }
                                            if (r17 != 0) {
                                                r17 = listB;
                                                arrayList = new ArrayList(p13.y.r(r17, 10));
                                                it3 = r17.iterator();
                                                while (it3.hasNext()) {
                                                    qs1.u uVar2 = (qs1.u) it3.next();
                                                    lt1.j jVar3 = lt1.j.f114865a;
                                                    boolean zR2 = p13.h0.R(list5, uVar2.getTripReportId());
                                                    Iterator it5 = it3;
                                                    locationDTO = sVar2.f147341a.getLocationDTO();
                                                    if (locationDTO == null) {
                                                        locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                    }
                                                    List list8 = list5;
                                                    courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                                    if (courseNameUriComponent == null) {
                                                        courseNameUriComponent = "";
                                                    }
                                                    jVar3.getClass();
                                                    arrayList.add(lt1.j.e(uVar2, context, zR2, locationDTO, courseNameUriComponent));
                                                    it3 = it5;
                                                    list5 = list8;
                                                }
                                                cVarE = i53.a.e(arrayList);
                                            } else {
                                                r17 = listB;
                                                cVarE = null;
                                            }
                                            list6 = c0Var.f147566r;
                                            if (list6.isEmpty()) {
                                                z14 = z16;
                                                favorite = sVar2.f147341a.getFavorite();
                                                if (favorite != null) {
                                                    BooleanValue = favorite.booleanValue();
                                                } else {
                                                    BooleanValue = 0;
                                                }
                                            } else {
                                                if (!list6.isEmpty()) {
                                                    it = list6.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            z14 = z16;
                                                            if (((pt1.t) it.next()).f140967a == j8) {
                                                                BooleanValue = i15;
                                                            } else {
                                                                z16 = z14;
                                                            }
                                                        }
                                                    }
                                                }
                                                z14 = z16;
                                                BooleanValue = 0;
                                            }
                                            lt1.j jVar4 = lt1.j.f114865a;
                                            Boolean boolValueOf2 = Boolean.valueOf((boolean) BooleanValue);
                                            jVar4.getClass();
                                            pVarB = lt1.j.b(sVar2, context, boolValueOf2);
                                            kVar.f147677l.setValue(null);
                                            num = c0Var.f147569w;
                                            l17 = c0Var.f147568v;
                                            if (l17 != null) {
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                            }
                                            if (i16 != 0) {
                                                long j15 = pVarB.f140929a;
                                                String str2 = pVarB.f140931c.f140953a;
                                                l19 = c0Var.f147570x;
                                                if (l19 != null) {
                                                    millis = l19.longValue();
                                                } else {
                                                    millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                                }
                                                c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j15, str2, millis, new Long(l17.longValue()));
                                            } else {
                                                l18 = c0Var.f147571y;
                                                if (l18 == null) {
                                                }
                                            }
                                            pVar4 = pVar2;
                                            cVar2 = cVarE;
                                            pVar3 = pVarB;
                                            i24 = 0;
                                            r18 = BooleanValue;
                                            if (i16 != 0) {
                                                nVar = pt1.n.f.f140900a;
                                            } else if (i24 != 0) {
                                                nVar = pt1.n.h.f140902a;
                                            } else {
                                                nVar = pt1.n.b.f140894a;
                                            }
                                            nVar2 = nVar;
                                            p2Var = kVar.f147673h;
                                            z15 = pVar4 instanceof c80.p.a;
                                            c0Var.f147549a = null;
                                            c0Var.f147550b = iVar;
                                            c0Var.f147551c = null;
                                            c0Var.f147552d = pVar4;
                                            c0Var.f147553e = cVar2;
                                            c0Var.f147554f = pVar3;
                                            c0Var.f147555g = nVar2;
                                            c0Var.f147556h = p2Var;
                                            c0Var.f147557i = r18;
                                            c0Var.f147558j = i16;
                                            c0Var.f147559k = i24;
                                            c0Var.f147560l = z15 ? 1 : 0;
                                            c0Var.f147561m = 9;
                                            objB4 = k.B4(kVar, c0Var);
                                            if (objB4 != aVar) {
                                                iVar4 = iVar;
                                                pVar5 = pVar3;
                                                pVar6 = pVar4;
                                                r19 = r18;
                                                i25 = z15 ? 1 : 0;
                                                i53.c cVar6 = cVar2;
                                                pt1.n nVar6 = nVar2;
                                                boolean zBooleanValue4 = ((Boolean) objB4).booleanValue();
                                                if (i25 != 0) {
                                                    r44 = i15;
                                                } else {
                                                    r44 = 0;
                                                }
                                                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar6, null, null, nVar6, null, null, null, pVar6, r44, false, zBooleanValue4, false, false, false, 980825598, null);
                                                r24 = 0;
                                                c0Var.f147549a = null;
                                                c0Var.f147550b = null;
                                                c0Var.f147551c = null;
                                                c0Var.f147552d = null;
                                                c0Var.f147553e = null;
                                                c0Var.f147554f = null;
                                                c0Var.f147555g = null;
                                                c0Var.f147556h = null;
                                                c0Var.f147557i = r19;
                                                c0Var.f147558j = i16;
                                                c0Var.f147559k = i24;
                                                c0Var.f147561m = 10;
                                                if (p2Var.emit(oVar, c0Var) != aVar) {
                                                    i26 = i24;
                                                    i27 = i16;
                                                    if (i27 == 0) {
                                                        r25 = r19;
                                                        c0Var.f147549a = r24;
                                                        c0Var.f147550b = r24;
                                                        c0Var.f147551c = r24;
                                                        c0Var.f147552d = r24;
                                                        c0Var.f147553e = r24;
                                                        c0Var.f147554f = r24;
                                                        c0Var.f147555g = r24;
                                                        c0Var.f147557i = r25;
                                                        c0Var.f147558j = i27;
                                                        c0Var.f147559k = i26;
                                                        c0Var.f147561m = 11;
                                                        break;
                                                    }
                                                    r25 = r19;
                                                    k.y4(kVar, context);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                i14 = 1;
                l14 = null;
                ss1.a0 a0Var4 = kVar.f147667b;
                c0Var.f147561m = 2;
                objS3 = a0Var4.s3(j8, c0Var);
                if (objS3 != aVar) {
                    list = (List) objS3;
                    vs1.k kVar3 = kVar.f147684t;
                    list.getClass();
                    TreeSet treeSet2 = new TreeSet();
                    p13.h0.W0(list, treeSet2);
                    kVar3.getClass();
                    kVar3.f179847f = treeSet2;
                    iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, j8, 0), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                    dVar = c0Var.f147565q;
                    if (dVar != null) {
                        curatedCourseId = dVar.getCuratedCourseId();
                    } else {
                        curatedCourseId = l14;
                    }
                    if (curatedCourseId == null) {
                        i15 = i14;
                        l15 = l14;
                        ss1.a aVar4 = kVar.f147666a;
                        c0Var.f147549a = list;
                        c0Var.f147550b = iVarA;
                        c0Var.f147561m = 4;
                        objC3 = aVar4.c3(j8, c0Var);
                        if (objC3 != aVar) {
                            list2 = list;
                            v2Var = (v2) objC3;
                            r14 = l15;
                            if (v2Var instanceof v2.b) {
                                c0Var.f147549a = r14;
                                c0Var.f147550b = r14;
                                c0Var.f147561m = 12;
                            } else {
                                sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                                j1 j1Var3 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                                c80.q qVar3 = c80.q.GARMIN_TRAILS;
                                c0Var.f147549a = list2;
                                c0Var.f147550b = iVarA;
                                c0Var.f147551c = sVar;
                                c0Var.f147561m = 5;
                                objJ = j1Var3.j(qVar3, c0Var);
                                if (objJ != aVar) {
                                    sVar2 = sVar;
                                    list3 = list2;
                                    r15 = r14;
                                    pVar = (c80.p) objJ;
                                    kVar.f147672g = sVar2.f147341a;
                                    ss1.a0 a0Var5 = kVar.f147667b;
                                    us1.e eVar3 = us1.e.MOST_HELPFUL;
                                    c0Var.f147549a = list3;
                                    c0Var.f147550b = iVarA;
                                    c0Var.f147551c = sVar2;
                                    c0Var.f147552d = pVar;
                                    c0Var.f147561m = 6;
                                    list4 = list3;
                                    objW0 = a0Var5.w0(c0Var.f147564p, eVar3, 0, 5, this);
                                    c0Var = this;
                                    if (objW0 != aVar) {
                                        iVar = iVarA;
                                        list5 = list4;
                                        pVar2 = pVar;
                                        r16 = r15;
                                        v2Var2 = (v2) objW0;
                                        if (v2Var2 instanceof v2.b) {
                                            r17 = r16;
                                        } else {
                                            r17 = r16;
                                        }
                                        if (r17 != 0) {
                                            r17 = listB;
                                            arrayList = new ArrayList(p13.y.r(r17, 10));
                                            it3 = r17.iterator();
                                            while (it3.hasNext()) {
                                                qs1.u uVar3 = (qs1.u) it3.next();
                                                lt1.j jVar5 = lt1.j.f114865a;
                                                boolean zR3 = p13.h0.R(list5, uVar3.getTripReportId());
                                                Iterator it6 = it3;
                                                locationDTO = sVar2.f147341a.getLocationDTO();
                                                if (locationDTO == null) {
                                                    locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                }
                                                List list9 = list5;
                                                courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                                if (courseNameUriComponent == null) {
                                                    courseNameUriComponent = "";
                                                }
                                                jVar5.getClass();
                                                arrayList.add(lt1.j.e(uVar3, context, zR3, locationDTO, courseNameUriComponent));
                                                it3 = it6;
                                                list5 = list9;
                                            }
                                            cVarE = i53.a.e(arrayList);
                                        } else {
                                            r17 = listB;
                                            cVarE = null;
                                        }
                                        list6 = c0Var.f147566r;
                                        if (list6.isEmpty()) {
                                            if (!list6.isEmpty()) {
                                                it = list6.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        z14 = z16;
                                                        if (((pt1.t) it.next()).f140967a == j8) {
                                                            BooleanValue = i15;
                                                        } else {
                                                            z16 = z14;
                                                        }
                                                    }
                                                }
                                            }
                                            z14 = z16;
                                            BooleanValue = 0;
                                        } else {
                                            z14 = z16;
                                            favorite = sVar2.f147341a.getFavorite();
                                            if (favorite != null) {
                                                BooleanValue = favorite.booleanValue();
                                            } else {
                                                BooleanValue = 0;
                                            }
                                        }
                                        lt1.j jVar6 = lt1.j.f114865a;
                                        Boolean boolValueOf3 = Boolean.valueOf((boolean) BooleanValue);
                                        jVar6.getClass();
                                        pVarB = lt1.j.b(sVar2, context, boolValueOf3);
                                        kVar.f147677l.setValue(null);
                                        num = c0Var.f147569w;
                                        l17 = c0Var.f147568v;
                                        if (l17 != null) {
                                            i16 = 0;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (i16 != 0) {
                                            long j16 = pVarB.f140929a;
                                            String str3 = pVarB.f140931c.f140953a;
                                            l19 = c0Var.f147570x;
                                            if (l19 != null) {
                                                millis = l19.longValue();
                                            } else {
                                                millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                            }
                                            c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j16, str3, millis, new Long(l17.longValue()));
                                        } else {
                                            l18 = c0Var.f147571y;
                                            if (l18 == null) {
                                            }
                                        }
                                        pVar4 = pVar2;
                                        cVar2 = cVarE;
                                        pVar3 = pVarB;
                                        i24 = 0;
                                        r18 = BooleanValue;
                                        if (i16 != 0) {
                                            nVar = pt1.n.f.f140900a;
                                        } else if (i24 != 0) {
                                            nVar = pt1.n.h.f140902a;
                                        } else {
                                            nVar = pt1.n.b.f140894a;
                                        }
                                        nVar2 = nVar;
                                        p2Var = kVar.f147673h;
                                        z15 = pVar4 instanceof c80.p.a;
                                        c0Var.f147549a = null;
                                        c0Var.f147550b = iVar;
                                        c0Var.f147551c = null;
                                        c0Var.f147552d = pVar4;
                                        c0Var.f147553e = cVar2;
                                        c0Var.f147554f = pVar3;
                                        c0Var.f147555g = nVar2;
                                        c0Var.f147556h = p2Var;
                                        c0Var.f147557i = r18;
                                        c0Var.f147558j = i16;
                                        c0Var.f147559k = i24;
                                        c0Var.f147560l = z15 ? 1 : 0;
                                        c0Var.f147561m = 9;
                                        objB4 = k.B4(kVar, c0Var);
                                        if (objB4 != aVar) {
                                            iVar4 = iVar;
                                            pVar5 = pVar3;
                                            pVar6 = pVar4;
                                            r19 = r18;
                                            i25 = z15 ? 1 : 0;
                                            i53.c cVar7 = cVar2;
                                            pt1.n nVar7 = nVar2;
                                            boolean zBooleanValue5 = ((Boolean) objB4).booleanValue();
                                            if (i25 != 0) {
                                                r44 = i15;
                                            } else {
                                                r44 = 0;
                                            }
                                            oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar7, null, null, nVar7, null, null, null, pVar6, r44, false, zBooleanValue5, false, false, false, 980825598, null);
                                            r24 = 0;
                                            c0Var.f147549a = null;
                                            c0Var.f147550b = null;
                                            c0Var.f147551c = null;
                                            c0Var.f147552d = null;
                                            c0Var.f147553e = null;
                                            c0Var.f147554f = null;
                                            c0Var.f147555g = null;
                                            c0Var.f147556h = null;
                                            c0Var.f147557i = r19;
                                            c0Var.f147558j = i16;
                                            c0Var.f147559k = i24;
                                            c0Var.f147561m = 10;
                                            if (p2Var.emit(oVar, c0Var) != aVar) {
                                                i26 = i24;
                                                i27 = i16;
                                                if (i27 == 0) {
                                                    r25 = r19;
                                                    c0Var.f147549a = r24;
                                                    c0Var.f147550b = r24;
                                                    c0Var.f147551c = r24;
                                                    c0Var.f147552d = r24;
                                                    c0Var.f147553e = r24;
                                                    c0Var.f147554f = r24;
                                                    c0Var.f147555g = r24;
                                                    c0Var.f147557i = r25;
                                                    c0Var.f147558j = i27;
                                                    c0Var.f147559k = i26;
                                                    c0Var.f147561m = 11;
                                                    break;
                                                }
                                                r25 = r19;
                                                k.y4(kVar, context);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i15 = i14;
                        l15 = l14;
                        ss1.a aVar5 = kVar.f147666a;
                        c0Var.f147549a = list;
                        c0Var.f147550b = iVarA;
                        c0Var.f147561m = 4;
                        objC3 = aVar5.c3(j8, c0Var);
                        if (objC3 != aVar) {
                            list2 = list;
                            v2Var = (v2) objC3;
                            r14 = l15;
                            if (v2Var instanceof v2.b) {
                                c0Var.f147549a = r14;
                                c0Var.f147550b = r14;
                                c0Var.f147561m = 12;
                            } else {
                                sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                                j1 j1Var4 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                                c80.q qVar4 = c80.q.GARMIN_TRAILS;
                                c0Var.f147549a = list2;
                                c0Var.f147550b = iVarA;
                                c0Var.f147551c = sVar;
                                c0Var.f147561m = 5;
                                objJ = j1Var4.j(qVar4, c0Var);
                                if (objJ != aVar) {
                                    sVar2 = sVar;
                                    list3 = list2;
                                    r15 = r14;
                                    pVar = (c80.p) objJ;
                                    kVar.f147672g = sVar2.f147341a;
                                    ss1.a0 a0Var6 = kVar.f147667b;
                                    us1.e eVar4 = us1.e.MOST_HELPFUL;
                                    c0Var.f147549a = list3;
                                    c0Var.f147550b = iVarA;
                                    c0Var.f147551c = sVar2;
                                    c0Var.f147552d = pVar;
                                    c0Var.f147561m = 6;
                                    list4 = list3;
                                    objW0 = a0Var6.w0(c0Var.f147564p, eVar4, 0, 5, this);
                                    c0Var = this;
                                    if (objW0 != aVar) {
                                        iVar = iVarA;
                                        list5 = list4;
                                        pVar2 = pVar;
                                        r16 = r15;
                                        v2Var2 = (v2) objW0;
                                        if (v2Var2 instanceof v2.b) {
                                            r17 = r16;
                                        } else {
                                            r17 = r16;
                                        }
                                        if (r17 != 0) {
                                            r17 = listB;
                                            arrayList = new ArrayList(p13.y.r(r17, 10));
                                            it3 = r17.iterator();
                                            while (it3.hasNext()) {
                                                qs1.u uVar4 = (qs1.u) it3.next();
                                                lt1.j jVar7 = lt1.j.f114865a;
                                                boolean zR4 = p13.h0.R(list5, uVar4.getTripReportId());
                                                Iterator it7 = it3;
                                                locationDTO = sVar2.f147341a.getLocationDTO();
                                                if (locationDTO == null) {
                                                    locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                }
                                                List list10 = list5;
                                                courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                                if (courseNameUriComponent == null) {
                                                    courseNameUriComponent = "";
                                                }
                                                jVar7.getClass();
                                                arrayList.add(lt1.j.e(uVar4, context, zR4, locationDTO, courseNameUriComponent));
                                                it3 = it7;
                                                list5 = list10;
                                            }
                                            cVarE = i53.a.e(arrayList);
                                        } else {
                                            r17 = listB;
                                            cVarE = null;
                                        }
                                        list6 = c0Var.f147566r;
                                        if (list6.isEmpty()) {
                                            if (!list6.isEmpty()) {
                                                it = list6.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        z14 = z16;
                                                        if (((pt1.t) it.next()).f140967a == j8) {
                                                            BooleanValue = i15;
                                                        } else {
                                                            z16 = z14;
                                                        }
                                                    }
                                                }
                                            }
                                            z14 = z16;
                                            BooleanValue = 0;
                                        } else {
                                            z14 = z16;
                                            favorite = sVar2.f147341a.getFavorite();
                                            if (favorite != null) {
                                                BooleanValue = favorite.booleanValue();
                                            } else {
                                                BooleanValue = 0;
                                            }
                                        }
                                        lt1.j jVar8 = lt1.j.f114865a;
                                        Boolean boolValueOf4 = Boolean.valueOf((boolean) BooleanValue);
                                        jVar8.getClass();
                                        pVarB = lt1.j.b(sVar2, context, boolValueOf4);
                                        kVar.f147677l.setValue(null);
                                        num = c0Var.f147569w;
                                        l17 = c0Var.f147568v;
                                        if (l17 != null) {
                                            i16 = 0;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (i16 != 0) {
                                            long j17 = pVarB.f140929a;
                                            String str4 = pVarB.f140931c.f140953a;
                                            l19 = c0Var.f147570x;
                                            if (l19 != null) {
                                                millis = l19.longValue();
                                            } else {
                                                millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                            }
                                            c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j17, str4, millis, new Long(l17.longValue()));
                                        } else {
                                            l18 = c0Var.f147571y;
                                            if (l18 == null) {
                                            }
                                        }
                                        pVar4 = pVar2;
                                        cVar2 = cVarE;
                                        pVar3 = pVarB;
                                        i24 = 0;
                                        r18 = BooleanValue;
                                        if (i16 != 0) {
                                            nVar = pt1.n.f.f140900a;
                                        } else if (i24 != 0) {
                                            nVar = pt1.n.h.f140902a;
                                        } else {
                                            nVar = pt1.n.b.f140894a;
                                        }
                                        nVar2 = nVar;
                                        p2Var = kVar.f147673h;
                                        z15 = pVar4 instanceof c80.p.a;
                                        c0Var.f147549a = null;
                                        c0Var.f147550b = iVar;
                                        c0Var.f147551c = null;
                                        c0Var.f147552d = pVar4;
                                        c0Var.f147553e = cVar2;
                                        c0Var.f147554f = pVar3;
                                        c0Var.f147555g = nVar2;
                                        c0Var.f147556h = p2Var;
                                        c0Var.f147557i = r18;
                                        c0Var.f147558j = i16;
                                        c0Var.f147559k = i24;
                                        c0Var.f147560l = z15 ? 1 : 0;
                                        c0Var.f147561m = 9;
                                        objB4 = k.B4(kVar, c0Var);
                                        if (objB4 != aVar) {
                                            iVar4 = iVar;
                                            pVar5 = pVar3;
                                            pVar6 = pVar4;
                                            r19 = r18;
                                            i25 = z15 ? 1 : 0;
                                            i53.c cVar8 = cVar2;
                                            pt1.n nVar8 = nVar2;
                                            boolean zBooleanValue6 = ((Boolean) objB4).booleanValue();
                                            if (i25 != 0) {
                                                r44 = i15;
                                            } else {
                                                r44 = 0;
                                            }
                                            oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar8, null, null, nVar8, null, null, null, pVar6, r44, false, zBooleanValue6, false, false, false, 980825598, null);
                                            r24 = 0;
                                            c0Var.f147549a = null;
                                            c0Var.f147550b = null;
                                            c0Var.f147551c = null;
                                            c0Var.f147552d = null;
                                            c0Var.f147553e = null;
                                            c0Var.f147554f = null;
                                            c0Var.f147555g = null;
                                            c0Var.f147556h = null;
                                            c0Var.f147557i = r19;
                                            c0Var.f147558j = i16;
                                            c0Var.f147559k = i24;
                                            c0Var.f147561m = 10;
                                            if (p2Var.emit(oVar, c0Var) != aVar) {
                                                i26 = i24;
                                                i27 = i16;
                                                if (i27 == 0) {
                                                    r25 = r19;
                                                    c0Var.f147549a = r24;
                                                    c0Var.f147550b = r24;
                                                    c0Var.f147551c = r24;
                                                    c0Var.f147552d = r24;
                                                    c0Var.f147553e = r24;
                                                    c0Var.f147554f = r24;
                                                    c0Var.f147555g = r24;
                                                    c0Var.f147557i = r25;
                                                    c0Var.f147558j = i27;
                                                    c0Var.f147559k = i26;
                                                    c0Var.f147561m = 11;
                                                    break;
                                                }
                                                r25 = r19;
                                                k.y4(kVar, context);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objS3 = obj;
                i14 = 1;
                l14 = null;
                list = (List) objS3;
                vs1.k kVar4 = kVar.f147684t;
                list.getClass();
                TreeSet treeSet3 = new TreeSet();
                p13.h0.W0(list, treeSet3);
                kVar4.getClass();
                kVar4.f179847f = treeSet3;
                iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, j8, 0), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                dVar = c0Var.f147565q;
                if (dVar != null) {
                    curatedCourseId = dVar.getCuratedCourseId();
                } else {
                    curatedCourseId = l14;
                }
                if (curatedCourseId == null) {
                    i15 = i14;
                    l15 = l14;
                    ss1.a aVar6 = kVar.f147666a;
                    c0Var.f147549a = list;
                    c0Var.f147550b = iVarA;
                    c0Var.f147561m = 4;
                    objC3 = aVar6.c3(j8, c0Var);
                    if (objC3 != aVar) {
                        list2 = list;
                        v2Var = (v2) objC3;
                        r14 = l15;
                        if (v2Var instanceof v2.b) {
                            c0Var.f147549a = r14;
                            c0Var.f147550b = r14;
                            c0Var.f147561m = 12;
                        } else {
                            sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                            j1 j1Var5 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                            c80.q qVar5 = c80.q.GARMIN_TRAILS;
                            c0Var.f147549a = list2;
                            c0Var.f147550b = iVarA;
                            c0Var.f147551c = sVar;
                            c0Var.f147561m = 5;
                            objJ = j1Var5.j(qVar5, c0Var);
                            if (objJ != aVar) {
                                sVar2 = sVar;
                                list3 = list2;
                                r15 = r14;
                                pVar = (c80.p) objJ;
                                kVar.f147672g = sVar2.f147341a;
                                ss1.a0 a0Var7 = kVar.f147667b;
                                us1.e eVar5 = us1.e.MOST_HELPFUL;
                                c0Var.f147549a = list3;
                                c0Var.f147550b = iVarA;
                                c0Var.f147551c = sVar2;
                                c0Var.f147552d = pVar;
                                c0Var.f147561m = 6;
                                list4 = list3;
                                objW0 = a0Var7.w0(c0Var.f147564p, eVar5, 0, 5, this);
                                c0Var = this;
                                if (objW0 != aVar) {
                                    iVar = iVarA;
                                    list5 = list4;
                                    pVar2 = pVar;
                                    r16 = r15;
                                    v2Var2 = (v2) objW0;
                                    if (v2Var2 instanceof v2.b) {
                                        r17 = r16;
                                    } else {
                                        r17 = r16;
                                    }
                                    if (r17 != 0) {
                                        r17 = listB;
                                        arrayList = new ArrayList(p13.y.r(r17, 10));
                                        it3 = r17.iterator();
                                        while (it3.hasNext()) {
                                            qs1.u uVar5 = (qs1.u) it3.next();
                                            lt1.j jVar9 = lt1.j.f114865a;
                                            boolean zR5 = p13.h0.R(list5, uVar5.getTripReportId());
                                            Iterator it8 = it3;
                                            locationDTO = sVar2.f147341a.getLocationDTO();
                                            if (locationDTO == null) {
                                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                            }
                                            List list11 = list5;
                                            courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                            if (courseNameUriComponent == null) {
                                                courseNameUriComponent = "";
                                            }
                                            jVar9.getClass();
                                            arrayList.add(lt1.j.e(uVar5, context, zR5, locationDTO, courseNameUriComponent));
                                            it3 = it8;
                                            list5 = list11;
                                        }
                                        cVarE = i53.a.e(arrayList);
                                    } else {
                                        r17 = listB;
                                        cVarE = null;
                                    }
                                    list6 = c0Var.f147566r;
                                    if (list6.isEmpty()) {
                                        if (!list6.isEmpty()) {
                                            it = list6.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    z14 = z16;
                                                    if (((pt1.t) it.next()).f140967a == j8) {
                                                        BooleanValue = i15;
                                                    } else {
                                                        z16 = z14;
                                                    }
                                                }
                                            }
                                        }
                                        z14 = z16;
                                        BooleanValue = 0;
                                    } else {
                                        z14 = z16;
                                        favorite = sVar2.f147341a.getFavorite();
                                        if (favorite != null) {
                                            BooleanValue = favorite.booleanValue();
                                        } else {
                                            BooleanValue = 0;
                                        }
                                    }
                                    lt1.j jVar10 = lt1.j.f114865a;
                                    Boolean boolValueOf5 = Boolean.valueOf((boolean) BooleanValue);
                                    jVar10.getClass();
                                    pVarB = lt1.j.b(sVar2, context, boolValueOf5);
                                    kVar.f147677l.setValue(null);
                                    num = c0Var.f147569w;
                                    l17 = c0Var.f147568v;
                                    if (l17 != null) {
                                        i16 = 0;
                                    } else {
                                        i16 = 0;
                                    }
                                    if (i16 != 0) {
                                        long j18 = pVarB.f140929a;
                                        String str5 = pVarB.f140931c.f140953a;
                                        l19 = c0Var.f147570x;
                                        if (l19 != null) {
                                            millis = l19.longValue();
                                        } else {
                                            millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                        }
                                        c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j18, str5, millis, new Long(l17.longValue()));
                                    } else {
                                        l18 = c0Var.f147571y;
                                        if (l18 == null) {
                                        }
                                    }
                                    pVar4 = pVar2;
                                    cVar2 = cVarE;
                                    pVar3 = pVarB;
                                    i24 = 0;
                                    r18 = BooleanValue;
                                    if (i16 != 0) {
                                        nVar = pt1.n.f.f140900a;
                                    } else if (i24 != 0) {
                                        nVar = pt1.n.h.f140902a;
                                    } else {
                                        nVar = pt1.n.b.f140894a;
                                    }
                                    nVar2 = nVar;
                                    p2Var = kVar.f147673h;
                                    z15 = pVar4 instanceof c80.p.a;
                                    c0Var.f147549a = null;
                                    c0Var.f147550b = iVar;
                                    c0Var.f147551c = null;
                                    c0Var.f147552d = pVar4;
                                    c0Var.f147553e = cVar2;
                                    c0Var.f147554f = pVar3;
                                    c0Var.f147555g = nVar2;
                                    c0Var.f147556h = p2Var;
                                    c0Var.f147557i = r18;
                                    c0Var.f147558j = i16;
                                    c0Var.f147559k = i24;
                                    c0Var.f147560l = z15 ? 1 : 0;
                                    c0Var.f147561m = 9;
                                    objB4 = k.B4(kVar, c0Var);
                                    if (objB4 != aVar) {
                                        iVar4 = iVar;
                                        pVar5 = pVar3;
                                        pVar6 = pVar4;
                                        r19 = r18;
                                        i25 = z15 ? 1 : 0;
                                        i53.c cVar9 = cVar2;
                                        pt1.n nVar9 = nVar2;
                                        boolean zBooleanValue7 = ((Boolean) objB4).booleanValue();
                                        if (i25 != 0) {
                                            r44 = i15;
                                        } else {
                                            r44 = 0;
                                        }
                                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar9, null, null, nVar9, null, null, null, pVar6, r44, false, zBooleanValue7, false, false, false, 980825598, null);
                                        r24 = 0;
                                        c0Var.f147549a = null;
                                        c0Var.f147550b = null;
                                        c0Var.f147551c = null;
                                        c0Var.f147552d = null;
                                        c0Var.f147553e = null;
                                        c0Var.f147554f = null;
                                        c0Var.f147555g = null;
                                        c0Var.f147556h = null;
                                        c0Var.f147557i = r19;
                                        c0Var.f147558j = i16;
                                        c0Var.f147559k = i24;
                                        c0Var.f147561m = 10;
                                        if (p2Var.emit(oVar, c0Var) != aVar) {
                                            i26 = i24;
                                            i27 = i16;
                                            if (i27 == 0) {
                                                r25 = r19;
                                                c0Var.f147549a = r24;
                                                c0Var.f147550b = r24;
                                                c0Var.f147551c = r24;
                                                c0Var.f147552d = r24;
                                                c0Var.f147553e = r24;
                                                c0Var.f147554f = r24;
                                                c0Var.f147555g = r24;
                                                c0Var.f147557i = r25;
                                                c0Var.f147558j = i27;
                                                c0Var.f147559k = i26;
                                                c0Var.f147561m = 11;
                                                break;
                                            }
                                            r25 = r19;
                                            k.y4(kVar, context);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    i15 = i14;
                    l15 = l14;
                    ss1.a aVar7 = kVar.f147666a;
                    c0Var.f147549a = list;
                    c0Var.f147550b = iVarA;
                    c0Var.f147561m = 4;
                    objC3 = aVar7.c3(j8, c0Var);
                    if (objC3 != aVar) {
                        list2 = list;
                        v2Var = (v2) objC3;
                        r14 = l15;
                        if (v2Var instanceof v2.b) {
                            c0Var.f147549a = r14;
                            c0Var.f147550b = r14;
                            c0Var.f147561m = 12;
                        } else {
                            sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                            j1 j1Var6 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                            c80.q qVar6 = c80.q.GARMIN_TRAILS;
                            c0Var.f147549a = list2;
                            c0Var.f147550b = iVarA;
                            c0Var.f147551c = sVar;
                            c0Var.f147561m = 5;
                            objJ = j1Var6.j(qVar6, c0Var);
                            if (objJ != aVar) {
                                sVar2 = sVar;
                                list3 = list2;
                                r15 = r14;
                                pVar = (c80.p) objJ;
                                kVar.f147672g = sVar2.f147341a;
                                ss1.a0 a0Var8 = kVar.f147667b;
                                us1.e eVar6 = us1.e.MOST_HELPFUL;
                                c0Var.f147549a = list3;
                                c0Var.f147550b = iVarA;
                                c0Var.f147551c = sVar2;
                                c0Var.f147552d = pVar;
                                c0Var.f147561m = 6;
                                list4 = list3;
                                objW0 = a0Var8.w0(c0Var.f147564p, eVar6, 0, 5, this);
                                c0Var = this;
                                if (objW0 != aVar) {
                                    iVar = iVarA;
                                    list5 = list4;
                                    pVar2 = pVar;
                                    r16 = r15;
                                    v2Var2 = (v2) objW0;
                                    if (v2Var2 instanceof v2.b) {
                                        r17 = r16;
                                    } else {
                                        r17 = r16;
                                    }
                                    if (r17 != 0) {
                                        r17 = listB;
                                        arrayList = new ArrayList(p13.y.r(r17, 10));
                                        it3 = r17.iterator();
                                        while (it3.hasNext()) {
                                            qs1.u uVar6 = (qs1.u) it3.next();
                                            lt1.j jVar11 = lt1.j.f114865a;
                                            boolean zR6 = p13.h0.R(list5, uVar6.getTripReportId());
                                            Iterator it9 = it3;
                                            locationDTO = sVar2.f147341a.getLocationDTO();
                                            if (locationDTO == null) {
                                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                            }
                                            List list12 = list5;
                                            courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                            if (courseNameUriComponent == null) {
                                                courseNameUriComponent = "";
                                            }
                                            jVar11.getClass();
                                            arrayList.add(lt1.j.e(uVar6, context, zR6, locationDTO, courseNameUriComponent));
                                            it3 = it9;
                                            list5 = list12;
                                        }
                                        cVarE = i53.a.e(arrayList);
                                    } else {
                                        r17 = listB;
                                        cVarE = null;
                                    }
                                    list6 = c0Var.f147566r;
                                    if (list6.isEmpty()) {
                                        if (!list6.isEmpty()) {
                                            it = list6.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    z14 = z16;
                                                    if (((pt1.t) it.next()).f140967a == j8) {
                                                        BooleanValue = i15;
                                                    } else {
                                                        z16 = z14;
                                                    }
                                                }
                                            }
                                        }
                                        z14 = z16;
                                        BooleanValue = 0;
                                    } else {
                                        z14 = z16;
                                        favorite = sVar2.f147341a.getFavorite();
                                        if (favorite != null) {
                                            BooleanValue = favorite.booleanValue();
                                        } else {
                                            BooleanValue = 0;
                                        }
                                    }
                                    lt1.j jVar12 = lt1.j.f114865a;
                                    Boolean boolValueOf6 = Boolean.valueOf((boolean) BooleanValue);
                                    jVar12.getClass();
                                    pVarB = lt1.j.b(sVar2, context, boolValueOf6);
                                    kVar.f147677l.setValue(null);
                                    num = c0Var.f147569w;
                                    l17 = c0Var.f147568v;
                                    if (l17 != null) {
                                        i16 = 0;
                                    } else {
                                        i16 = 0;
                                    }
                                    if (i16 != 0) {
                                        long j19 = pVarB.f140929a;
                                        String str6 = pVarB.f140931c.f140953a;
                                        l19 = c0Var.f147570x;
                                        if (l19 != null) {
                                            millis = l19.longValue();
                                        } else {
                                            millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                        }
                                        c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j19, str6, millis, new Long(l17.longValue()));
                                    } else {
                                        l18 = c0Var.f147571y;
                                        if (l18 == null) {
                                        }
                                    }
                                    pVar4 = pVar2;
                                    cVar2 = cVarE;
                                    pVar3 = pVarB;
                                    i24 = 0;
                                    r18 = BooleanValue;
                                    if (i16 != 0) {
                                        nVar = pt1.n.f.f140900a;
                                    } else if (i24 != 0) {
                                        nVar = pt1.n.h.f140902a;
                                    } else {
                                        nVar = pt1.n.b.f140894a;
                                    }
                                    nVar2 = nVar;
                                    p2Var = kVar.f147673h;
                                    z15 = pVar4 instanceof c80.p.a;
                                    c0Var.f147549a = null;
                                    c0Var.f147550b = iVar;
                                    c0Var.f147551c = null;
                                    c0Var.f147552d = pVar4;
                                    c0Var.f147553e = cVar2;
                                    c0Var.f147554f = pVar3;
                                    c0Var.f147555g = nVar2;
                                    c0Var.f147556h = p2Var;
                                    c0Var.f147557i = r18;
                                    c0Var.f147558j = i16;
                                    c0Var.f147559k = i24;
                                    c0Var.f147560l = z15 ? 1 : 0;
                                    c0Var.f147561m = 9;
                                    objB4 = k.B4(kVar, c0Var);
                                    if (objB4 != aVar) {
                                        iVar4 = iVar;
                                        pVar5 = pVar3;
                                        pVar6 = pVar4;
                                        r19 = r18;
                                        i25 = z15 ? 1 : 0;
                                        i53.c cVar10 = cVar2;
                                        pt1.n nVar10 = nVar2;
                                        boolean zBooleanValue8 = ((Boolean) objB4).booleanValue();
                                        if (i25 != 0) {
                                            r44 = i15;
                                        } else {
                                            r44 = 0;
                                        }
                                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar10, null, null, nVar10, null, null, null, pVar6, r44, false, zBooleanValue8, false, false, false, 980825598, null);
                                        r24 = 0;
                                        c0Var.f147549a = null;
                                        c0Var.f147550b = null;
                                        c0Var.f147551c = null;
                                        c0Var.f147552d = null;
                                        c0Var.f147553e = null;
                                        c0Var.f147554f = null;
                                        c0Var.f147555g = null;
                                        c0Var.f147556h = null;
                                        c0Var.f147557i = r19;
                                        c0Var.f147558j = i16;
                                        c0Var.f147559k = i24;
                                        c0Var.f147561m = 10;
                                        if (p2Var.emit(oVar, c0Var) != aVar) {
                                            i26 = i24;
                                            i27 = i16;
                                            if (i27 == 0) {
                                                r25 = r19;
                                                c0Var.f147549a = r24;
                                                c0Var.f147550b = r24;
                                                c0Var.f147551c = r24;
                                                c0Var.f147552d = r24;
                                                c0Var.f147553e = r24;
                                                c0Var.f147554f = r24;
                                                c0Var.f147555g = r24;
                                                c0Var.f147557i = r25;
                                                c0Var.f147558j = i27;
                                                c0Var.f147559k = i26;
                                                c0Var.f147561m = 11;
                                                break;
                                            }
                                            r25 = r19;
                                            k.y4(kVar, context);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                r53.i iVar5 = c0Var.f147550b;
                list2 = c0Var.f147549a;
                o13.r.b(obj);
                iVarA = iVar5;
                l16 = null;
                i15 = 1;
                objW = obj;
                v2Var = (v2) objW;
                r14 = l16;
                if (v2Var instanceof v2.b) {
                    c0Var.f147549a = r14;
                    c0Var.f147550b = r14;
                    c0Var.f147561m = 12;
                    break;
                } else {
                    sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                    j1 j1Var7 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                    c80.q qVar7 = c80.q.GARMIN_TRAILS;
                    c0Var.f147549a = list2;
                    c0Var.f147550b = iVarA;
                    c0Var.f147551c = sVar;
                    c0Var.f147561m = 5;
                    objJ = j1Var7.j(qVar7, c0Var);
                    if (objJ != aVar) {
                        sVar2 = sVar;
                        list3 = list2;
                        r15 = r14;
                        pVar = (c80.p) objJ;
                        kVar.f147672g = sVar2.f147341a;
                        ss1.a0 a0Var9 = kVar.f147667b;
                        us1.e eVar7 = us1.e.MOST_HELPFUL;
                        c0Var.f147549a = list3;
                        c0Var.f147550b = iVarA;
                        c0Var.f147551c = sVar2;
                        c0Var.f147552d = pVar;
                        c0Var.f147561m = 6;
                        list4 = list3;
                        objW0 = a0Var9.w0(c0Var.f147564p, eVar7, 0, 5, this);
                        c0Var = this;
                        if (objW0 != aVar) {
                            iVar = iVarA;
                            list5 = list4;
                            pVar2 = pVar;
                            r16 = r15;
                            v2Var2 = (v2) objW0;
                            if (v2Var2 instanceof v2.b) {
                                r17 = r16;
                            } else {
                                r17 = r16;
                            }
                            if (r17 != 0) {
                                r17 = listB;
                                arrayList = new ArrayList(p13.y.r(r17, 10));
                                it3 = r17.iterator();
                                while (it3.hasNext()) {
                                    qs1.u uVar7 = (qs1.u) it3.next();
                                    lt1.j jVar13 = lt1.j.f114865a;
                                    boolean zR7 = p13.h0.R(list5, uVar7.getTripReportId());
                                    Iterator it10 = it3;
                                    locationDTO = sVar2.f147341a.getLocationDTO();
                                    if (locationDTO == null) {
                                        locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                    }
                                    List list13 = list5;
                                    courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                    if (courseNameUriComponent == null) {
                                        courseNameUriComponent = "";
                                    }
                                    jVar13.getClass();
                                    arrayList.add(lt1.j.e(uVar7, context, zR7, locationDTO, courseNameUriComponent));
                                    it3 = it10;
                                    list5 = list13;
                                }
                                cVarE = i53.a.e(arrayList);
                            } else {
                                r17 = listB;
                                cVarE = null;
                            }
                            list6 = c0Var.f147566r;
                            if (list6.isEmpty()) {
                                if (!list6.isEmpty()) {
                                    it = list6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z14 = z16;
                                            if (((pt1.t) it.next()).f140967a == j8) {
                                                BooleanValue = i15;
                                            } else {
                                                z16 = z14;
                                            }
                                        }
                                    }
                                }
                                z14 = z16;
                                BooleanValue = 0;
                            } else {
                                z14 = z16;
                                favorite = sVar2.f147341a.getFavorite();
                                if (favorite != null) {
                                    BooleanValue = favorite.booleanValue();
                                } else {
                                    BooleanValue = 0;
                                }
                            }
                            lt1.j jVar14 = lt1.j.f114865a;
                            Boolean boolValueOf7 = Boolean.valueOf((boolean) BooleanValue);
                            jVar14.getClass();
                            pVarB = lt1.j.b(sVar2, context, boolValueOf7);
                            kVar.f147677l.setValue(null);
                            num = c0Var.f147569w;
                            l17 = c0Var.f147568v;
                            if (l17 != null) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                            if (i16 != 0) {
                                long j110 = pVarB.f140929a;
                                String str7 = pVarB.f140931c.f140953a;
                                l19 = c0Var.f147570x;
                                if (l19 != null) {
                                    millis = l19.longValue();
                                } else {
                                    millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                }
                                c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j110, str7, millis, new Long(l17.longValue()));
                            } else {
                                l18 = c0Var.f147571y;
                                if (l18 == null) {
                                }
                            }
                            pVar4 = pVar2;
                            cVar2 = cVarE;
                            pVar3 = pVarB;
                            i24 = 0;
                            r18 = BooleanValue;
                            if (i16 != 0) {
                                nVar = pt1.n.f.f140900a;
                            } else if (i24 != 0) {
                                nVar = pt1.n.h.f140902a;
                            } else {
                                nVar = pt1.n.b.f140894a;
                            }
                            nVar2 = nVar;
                            p2Var = kVar.f147673h;
                            z15 = pVar4 instanceof c80.p.a;
                            c0Var.f147549a = null;
                            c0Var.f147550b = iVar;
                            c0Var.f147551c = null;
                            c0Var.f147552d = pVar4;
                            c0Var.f147553e = cVar2;
                            c0Var.f147554f = pVar3;
                            c0Var.f147555g = nVar2;
                            c0Var.f147556h = p2Var;
                            c0Var.f147557i = r18;
                            c0Var.f147558j = i16;
                            c0Var.f147559k = i24;
                            c0Var.f147560l = z15 ? 1 : 0;
                            c0Var.f147561m = 9;
                            objB4 = k.B4(kVar, c0Var);
                            if (objB4 != aVar) {
                                iVar4 = iVar;
                                pVar5 = pVar3;
                                pVar6 = pVar4;
                                r19 = r18;
                                i25 = z15 ? 1 : 0;
                                i53.c cVar11 = cVar2;
                                pt1.n nVar11 = nVar2;
                                boolean zBooleanValue9 = ((Boolean) objB4).booleanValue();
                                if (i25 != 0) {
                                    r44 = i15;
                                } else {
                                    r44 = 0;
                                }
                                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar11, null, null, nVar11, null, null, null, pVar6, r44, false, zBooleanValue9, false, false, false, 980825598, null);
                                r24 = 0;
                                c0Var.f147549a = null;
                                c0Var.f147550b = null;
                                c0Var.f147551c = null;
                                c0Var.f147552d = null;
                                c0Var.f147553e = null;
                                c0Var.f147554f = null;
                                c0Var.f147555g = null;
                                c0Var.f147556h = null;
                                c0Var.f147557i = r19;
                                c0Var.f147558j = i16;
                                c0Var.f147559k = i24;
                                c0Var.f147561m = 10;
                                if (p2Var.emit(oVar, c0Var) != aVar) {
                                    i26 = i24;
                                    i27 = i16;
                                    if (i27 == 0) {
                                        r25 = r19;
                                        c0Var.f147549a = r24;
                                        c0Var.f147550b = r24;
                                        c0Var.f147551c = r24;
                                        c0Var.f147552d = r24;
                                        c0Var.f147553e = r24;
                                        c0Var.f147554f = r24;
                                        c0Var.f147555g = r24;
                                        c0Var.f147557i = r25;
                                        c0Var.f147558j = i27;
                                        c0Var.f147559k = i26;
                                        c0Var.f147561m = 11;
                                        break;
                                    }
                                    r25 = r19;
                                    k.y4(kVar, context);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                r53.i iVar6 = c0Var.f147550b;
                list2 = c0Var.f147549a;
                o13.r.b(obj);
                iVarA = iVar6;
                l15 = null;
                i15 = 1;
                objC3 = obj;
                v2Var = (v2) objC3;
                r14 = l15;
                if (v2Var instanceof v2.b) {
                    c0Var.f147549a = r14;
                    c0Var.f147550b = r14;
                    c0Var.f147561m = 12;
                    break;
                } else {
                    sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                    j1 j1Var8 = (j1) KoinJavaComponent.get$default(j1.class, r14, r14, 6, r14);
                    c80.q qVar8 = c80.q.GARMIN_TRAILS;
                    c0Var.f147549a = list2;
                    c0Var.f147550b = iVarA;
                    c0Var.f147551c = sVar;
                    c0Var.f147561m = 5;
                    objJ = j1Var8.j(qVar8, c0Var);
                    if (objJ != aVar) {
                        sVar2 = sVar;
                        list3 = list2;
                        r15 = r14;
                        pVar = (c80.p) objJ;
                        kVar.f147672g = sVar2.f147341a;
                        ss1.a0 a0Var10 = kVar.f147667b;
                        us1.e eVar8 = us1.e.MOST_HELPFUL;
                        c0Var.f147549a = list3;
                        c0Var.f147550b = iVarA;
                        c0Var.f147551c = sVar2;
                        c0Var.f147552d = pVar;
                        c0Var.f147561m = 6;
                        list4 = list3;
                        objW0 = a0Var10.w0(c0Var.f147564p, eVar8, 0, 5, this);
                        c0Var = this;
                        if (objW0 != aVar) {
                            iVar = iVarA;
                            list5 = list4;
                            pVar2 = pVar;
                            r16 = r15;
                            v2Var2 = (v2) objW0;
                            if (v2Var2 instanceof v2.b) {
                                r17 = r16;
                            } else {
                                r17 = r16;
                            }
                            if (r17 != 0) {
                                r17 = listB;
                                arrayList = new ArrayList(p13.y.r(r17, 10));
                                it3 = r17.iterator();
                                while (it3.hasNext()) {
                                    qs1.u uVar8 = (qs1.u) it3.next();
                                    lt1.j jVar15 = lt1.j.f114865a;
                                    boolean zR8 = p13.h0.R(list5, uVar8.getTripReportId());
                                    Iterator it11 = it3;
                                    locationDTO = sVar2.f147341a.getLocationDTO();
                                    if (locationDTO == null) {
                                        locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                    }
                                    List list14 = list5;
                                    courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                                    if (courseNameUriComponent == null) {
                                        courseNameUriComponent = "";
                                    }
                                    jVar15.getClass();
                                    arrayList.add(lt1.j.e(uVar8, context, zR8, locationDTO, courseNameUriComponent));
                                    it3 = it11;
                                    list5 = list14;
                                }
                                cVarE = i53.a.e(arrayList);
                            } else {
                                r17 = listB;
                                cVarE = null;
                            }
                            list6 = c0Var.f147566r;
                            if (list6.isEmpty()) {
                                if (!list6.isEmpty()) {
                                    it = list6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z14 = z16;
                                            if (((pt1.t) it.next()).f140967a == j8) {
                                                BooleanValue = i15;
                                            } else {
                                                z16 = z14;
                                            }
                                        }
                                    }
                                }
                                z14 = z16;
                                BooleanValue = 0;
                            } else {
                                z14 = z16;
                                favorite = sVar2.f147341a.getFavorite();
                                if (favorite != null) {
                                    BooleanValue = favorite.booleanValue();
                                } else {
                                    BooleanValue = 0;
                                }
                            }
                            lt1.j jVar16 = lt1.j.f114865a;
                            Boolean boolValueOf8 = Boolean.valueOf((boolean) BooleanValue);
                            jVar16.getClass();
                            pVarB = lt1.j.b(sVar2, context, boolValueOf8);
                            kVar.f147677l.setValue(null);
                            num = c0Var.f147569w;
                            l17 = c0Var.f147568v;
                            if (l17 != null) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                            if (i16 != 0) {
                                long j111 = pVarB.f140929a;
                                String str8 = pVarB.f140931c.f140953a;
                                l19 = c0Var.f147570x;
                                if (l19 != null) {
                                    millis = l19.longValue();
                                } else {
                                    millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                                }
                                c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j111, str8, millis, new Long(l17.longValue()));
                            } else {
                                l18 = c0Var.f147571y;
                                if (l18 == null) {
                                }
                            }
                            pVar4 = pVar2;
                            cVar2 = cVarE;
                            pVar3 = pVarB;
                            i24 = 0;
                            r18 = BooleanValue;
                            if (i16 != 0) {
                                nVar = pt1.n.f.f140900a;
                            } else if (i24 != 0) {
                                nVar = pt1.n.h.f140902a;
                            } else {
                                nVar = pt1.n.b.f140894a;
                            }
                            nVar2 = nVar;
                            p2Var = kVar.f147673h;
                            z15 = pVar4 instanceof c80.p.a;
                            c0Var.f147549a = null;
                            c0Var.f147550b = iVar;
                            c0Var.f147551c = null;
                            c0Var.f147552d = pVar4;
                            c0Var.f147553e = cVar2;
                            c0Var.f147554f = pVar3;
                            c0Var.f147555g = nVar2;
                            c0Var.f147556h = p2Var;
                            c0Var.f147557i = r18;
                            c0Var.f147558j = i16;
                            c0Var.f147559k = i24;
                            c0Var.f147560l = z15 ? 1 : 0;
                            c0Var.f147561m = 9;
                            objB4 = k.B4(kVar, c0Var);
                            if (objB4 != aVar) {
                                iVar4 = iVar;
                                pVar5 = pVar3;
                                pVar6 = pVar4;
                                r19 = r18;
                                i25 = z15 ? 1 : 0;
                                i53.c cVar12 = cVar2;
                                pt1.n nVar12 = nVar2;
                                boolean zBooleanValue10 = ((Boolean) objB4).booleanValue();
                                if (i25 != 0) {
                                    r44 = i15;
                                } else {
                                    r44 = 0;
                                }
                                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar12, null, null, nVar12, null, null, null, pVar6, r44, false, zBooleanValue10, false, false, false, 980825598, null);
                                r24 = 0;
                                c0Var.f147549a = null;
                                c0Var.f147550b = null;
                                c0Var.f147551c = null;
                                c0Var.f147552d = null;
                                c0Var.f147553e = null;
                                c0Var.f147554f = null;
                                c0Var.f147555g = null;
                                c0Var.f147556h = null;
                                c0Var.f147557i = r19;
                                c0Var.f147558j = i16;
                                c0Var.f147559k = i24;
                                c0Var.f147561m = 10;
                                if (p2Var.emit(oVar, c0Var) != aVar) {
                                    i26 = i24;
                                    i27 = i16;
                                    if (i27 == 0) {
                                        r25 = r19;
                                        c0Var.f147549a = r24;
                                        c0Var.f147550b = r24;
                                        c0Var.f147551c = r24;
                                        c0Var.f147552d = r24;
                                        c0Var.f147553e = r24;
                                        c0Var.f147554f = r24;
                                        c0Var.f147555g = r24;
                                        c0Var.f147557i = r25;
                                        c0Var.f147558j = i27;
                                        c0Var.f147559k = i26;
                                        c0Var.f147561m = 11;
                                        break;
                                    }
                                    r25 = r19;
                                    k.y4(kVar, context);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 5:
                qs1.s sVar3 = c0Var.f147551c;
                r53.i iVar7 = c0Var.f147550b;
                List list15 = c0Var.f147549a;
                o13.r.b(obj);
                sVar2 = sVar3;
                iVarA = iVar7;
                list3 = list15;
                r15 = 0;
                i15 = 1;
                objJ = obj;
                pVar = (c80.p) objJ;
                kVar.f147672g = sVar2.f147341a;
                ss1.a0 a0Var11 = kVar.f147667b;
                us1.e eVar9 = us1.e.MOST_HELPFUL;
                c0Var.f147549a = list3;
                c0Var.f147550b = iVarA;
                c0Var.f147551c = sVar2;
                c0Var.f147552d = pVar;
                c0Var.f147561m = 6;
                list4 = list3;
                objW0 = a0Var11.w0(c0Var.f147564p, eVar9, 0, 5, this);
                c0Var = this;
                if (objW0 != aVar) {
                    iVar = iVarA;
                    list5 = list4;
                    pVar2 = pVar;
                    r16 = r15;
                    v2Var2 = (v2) objW0;
                    if (v2Var2 instanceof v2.b) {
                        r17 = r16;
                    } else {
                        r17 = r16;
                    }
                    if (r17 != 0) {
                        r17 = listB;
                        arrayList = new ArrayList(p13.y.r(r17, 10));
                        it3 = r17.iterator();
                        while (it3.hasNext()) {
                            qs1.u uVar9 = (qs1.u) it3.next();
                            lt1.j jVar17 = lt1.j.f114865a;
                            boolean zR9 = p13.h0.R(list5, uVar9.getTripReportId());
                            Iterator it12 = it3;
                            locationDTO = sVar2.f147341a.getLocationDTO();
                            if (locationDTO == null) {
                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                            }
                            List list16 = list5;
                            courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                            if (courseNameUriComponent == null) {
                                courseNameUriComponent = "";
                            }
                            jVar17.getClass();
                            arrayList.add(lt1.j.e(uVar9, context, zR9, locationDTO, courseNameUriComponent));
                            it3 = it12;
                            list5 = list16;
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        r17 = listB;
                        cVarE = null;
                    }
                    list6 = c0Var.f147566r;
                    if (list6.isEmpty()) {
                        if (!list6.isEmpty()) {
                            it = list6.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z14 = z16;
                                    if (((pt1.t) it.next()).f140967a == j8) {
                                        BooleanValue = i15;
                                    } else {
                                        z16 = z14;
                                    }
                                }
                            }
                        }
                        z14 = z16;
                        BooleanValue = 0;
                    } else {
                        z14 = z16;
                        favorite = sVar2.f147341a.getFavorite();
                        if (favorite != null) {
                            BooleanValue = favorite.booleanValue();
                        } else {
                            BooleanValue = 0;
                        }
                    }
                    lt1.j jVar18 = lt1.j.f114865a;
                    Boolean boolValueOf9 = Boolean.valueOf((boolean) BooleanValue);
                    jVar18.getClass();
                    pVarB = lt1.j.b(sVar2, context, boolValueOf9);
                    kVar.f147677l.setValue(null);
                    num = c0Var.f147569w;
                    l17 = c0Var.f147568v;
                    if (l17 != null) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                    }
                    if (i16 != 0) {
                        long j112 = pVarB.f140929a;
                        String str9 = pVarB.f140931c.f140953a;
                        l19 = c0Var.f147570x;
                        if (l19 != null) {
                            millis = l19.longValue();
                        } else {
                            millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                        }
                        c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j112, str9, millis, new Long(l17.longValue()));
                    } else {
                        l18 = c0Var.f147571y;
                        if (l18 == null) {
                        }
                    }
                    pVar4 = pVar2;
                    cVar2 = cVarE;
                    pVar3 = pVarB;
                    i24 = 0;
                    r18 = BooleanValue;
                    if (i16 != 0) {
                        nVar = pt1.n.f.f140900a;
                    } else if (i24 != 0) {
                        nVar = pt1.n.h.f140902a;
                    } else {
                        nVar = pt1.n.b.f140894a;
                    }
                    nVar2 = nVar;
                    p2Var = kVar.f147673h;
                    z15 = pVar4 instanceof c80.p.a;
                    c0Var.f147549a = null;
                    c0Var.f147550b = iVar;
                    c0Var.f147551c = null;
                    c0Var.f147552d = pVar4;
                    c0Var.f147553e = cVar2;
                    c0Var.f147554f = pVar3;
                    c0Var.f147555g = nVar2;
                    c0Var.f147556h = p2Var;
                    c0Var.f147557i = r18;
                    c0Var.f147558j = i16;
                    c0Var.f147559k = i24;
                    c0Var.f147560l = z15 ? 1 : 0;
                    c0Var.f147561m = 9;
                    objB4 = k.B4(kVar, c0Var);
                    if (objB4 != aVar) {
                        iVar4 = iVar;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        r19 = r18;
                        i25 = z15 ? 1 : 0;
                        i53.c cVar13 = cVar2;
                        pt1.n nVar13 = nVar2;
                        boolean zBooleanValue11 = ((Boolean) objB4).booleanValue();
                        if (i25 != 0) {
                            r44 = i15;
                        } else {
                            r44 = 0;
                        }
                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar13, null, null, nVar13, null, null, null, pVar6, r44, false, zBooleanValue11, false, false, false, 980825598, null);
                        r24 = 0;
                        c0Var.f147549a = null;
                        c0Var.f147550b = null;
                        c0Var.f147551c = null;
                        c0Var.f147552d = null;
                        c0Var.f147553e = null;
                        c0Var.f147554f = null;
                        c0Var.f147555g = null;
                        c0Var.f147556h = null;
                        c0Var.f147557i = r19;
                        c0Var.f147558j = i16;
                        c0Var.f147559k = i24;
                        c0Var.f147561m = 10;
                        if (p2Var.emit(oVar, c0Var) != aVar) {
                            i26 = i24;
                            i27 = i16;
                            if (i27 == 0) {
                                r25 = r19;
                                c0Var.f147549a = r24;
                                c0Var.f147550b = r24;
                                c0Var.f147551c = r24;
                                c0Var.f147552d = r24;
                                c0Var.f147553e = r24;
                                c0Var.f147554f = r24;
                                c0Var.f147555g = r24;
                                c0Var.f147557i = r25;
                                c0Var.f147558j = i27;
                                c0Var.f147559k = i26;
                                c0Var.f147561m = 11;
                                break;
                            }
                            r25 = r19;
                            k.y4(kVar, context);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 6:
                c80.p pVar7 = c0Var.f147552d;
                qs1.s sVar4 = c0Var.f147551c;
                iVar = c0Var.f147550b;
                list5 = c0Var.f147549a;
                o13.r.b(obj);
                sVar2 = sVar4;
                r16 = 0;
                i15 = 1;
                pVar2 = pVar7;
                objW0 = obj;
                v2Var2 = (v2) objW0;
                if (v2Var2 instanceof v2.b) {
                    r17 = r16;
                } else {
                    r17 = r16;
                }
                if (r17 != 0) {
                    r17 = listB;
                    arrayList = new ArrayList(p13.y.r(r17, 10));
                    it3 = r17.iterator();
                    while (it3.hasNext()) {
                        qs1.u uVar10 = (qs1.u) it3.next();
                        lt1.j jVar19 = lt1.j.f114865a;
                        boolean zR10 = p13.h0.R(list5, uVar10.getTripReportId());
                        Iterator it13 = it3;
                        locationDTO = sVar2.f147341a.getLocationDTO();
                        if (locationDTO == null) {
                            locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                        }
                        List list17 = list5;
                        courseNameUriComponent = sVar2.f147341a.getCourseNameUriComponent();
                        if (courseNameUriComponent == null) {
                            courseNameUriComponent = "";
                        }
                        jVar19.getClass();
                        arrayList.add(lt1.j.e(uVar10, context, zR10, locationDTO, courseNameUriComponent));
                        it3 = it13;
                        list5 = list17;
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    r17 = listB;
                    cVarE = null;
                }
                list6 = c0Var.f147566r;
                if (list6.isEmpty()) {
                    if (!list6.isEmpty()) {
                        it = list6.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z14 = z16;
                                if (((pt1.t) it.next()).f140967a == j8) {
                                    BooleanValue = i15;
                                } else {
                                    z16 = z14;
                                }
                            }
                        }
                    }
                    z14 = z16;
                    BooleanValue = 0;
                } else {
                    z14 = z16;
                    favorite = sVar2.f147341a.getFavorite();
                    if (favorite != null) {
                        BooleanValue = favorite.booleanValue();
                    } else {
                        BooleanValue = 0;
                    }
                }
                lt1.j jVar110 = lt1.j.f114865a;
                Boolean boolValueOf10 = Boolean.valueOf((boolean) BooleanValue);
                jVar110.getClass();
                pVarB = lt1.j.b(sVar2, context, boolValueOf10);
                kVar.f147677l.setValue(null);
                num = c0Var.f147569w;
                l17 = c0Var.f147568v;
                if (l17 != null) {
                    i16 = 0;
                } else {
                    i16 = 0;
                }
                if (i16 != 0) {
                    long j113 = pVarB.f140929a;
                    String str10 = pVarB.f140931c.f140953a;
                    l19 = c0Var.f147570x;
                    if (l19 != null) {
                        millis = l19.longValue();
                    } else {
                        millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                    }
                    c0Var.f147562n.M4(c0Var.f147567t, num.intValue(), j113, str10, millis, new Long(l17.longValue()));
                } else {
                    l18 = c0Var.f147571y;
                    if (l18 == null) {
                    }
                }
                pVar4 = pVar2;
                cVar2 = cVarE;
                pVar3 = pVarB;
                i24 = 0;
                r18 = BooleanValue;
                if (i16 != 0) {
                    nVar = pt1.n.f.f140900a;
                } else if (i24 != 0) {
                    nVar = pt1.n.h.f140902a;
                } else {
                    nVar = pt1.n.b.f140894a;
                }
                nVar2 = nVar;
                p2Var = kVar.f147673h;
                z15 = pVar4 instanceof c80.p.a;
                c0Var.f147549a = null;
                c0Var.f147550b = iVar;
                c0Var.f147551c = null;
                c0Var.f147552d = pVar4;
                c0Var.f147553e = cVar2;
                c0Var.f147554f = pVar3;
                c0Var.f147555g = nVar2;
                c0Var.f147556h = p2Var;
                c0Var.f147557i = r18;
                c0Var.f147558j = i16;
                c0Var.f147559k = i24;
                c0Var.f147560l = z15 ? 1 : 0;
                c0Var.f147561m = 9;
                objB4 = k.B4(kVar, c0Var);
                if (objB4 != aVar) {
                    iVar4 = iVar;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    r19 = r18;
                    i25 = z15 ? 1 : 0;
                    i53.c cVar14 = cVar2;
                    pt1.n nVar14 = nVar2;
                    boolean zBooleanValue12 = ((Boolean) objB4).booleanValue();
                    if (i25 != 0) {
                        r44 = i15;
                    } else {
                        r44 = 0;
                    }
                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar14, null, null, nVar14, null, null, null, pVar6, r44, false, zBooleanValue12, false, false, false, 980825598, null);
                    r24 = 0;
                    c0Var.f147549a = null;
                    c0Var.f147550b = null;
                    c0Var.f147551c = null;
                    c0Var.f147552d = null;
                    c0Var.f147553e = null;
                    c0Var.f147554f = null;
                    c0Var.f147555g = null;
                    c0Var.f147556h = null;
                    c0Var.f147557i = r19;
                    c0Var.f147558j = i16;
                    c0Var.f147559k = i24;
                    c0Var.f147561m = 10;
                    if (p2Var.emit(oVar, c0Var) != aVar) {
                        i26 = i24;
                        i27 = i16;
                        if (i27 == 0) {
                            r25 = r19;
                            c0Var.f147549a = r24;
                            c0Var.f147550b = r24;
                            c0Var.f147551c = r24;
                            c0Var.f147552d = r24;
                            c0Var.f147553e = r24;
                            c0Var.f147554f = r24;
                            c0Var.f147555g = r24;
                            c0Var.f147557i = r25;
                            c0Var.f147558j = i27;
                            c0Var.f147559k = i26;
                            c0Var.f147561m = 11;
                            break;
                        }
                        r25 = r19;
                        k.y4(kVar, context);
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 7:
                i19 = c0Var.f147559k;
                i17 = c0Var.f147558j;
                i18 = c0Var.f147557i;
                pVar3 = c0Var.f147554f;
                cVar = c0Var.f147553e;
                c80.p pVar8 = c0Var.f147552d;
                r53.i iVar8 = c0Var.f147550b;
                o13.r.b(obj);
                pVar4 = pVar8;
                iVar2 = iVar8;
                i15 = 1;
                objO4 = obj;
                v2Var3 = (v2) objO4;
                if (!(v2Var3 instanceof v2.b)) {
                    if (v2Var3 instanceof v2.a) {
                        break;
                    }
                    c0Var.f147549a = null;
                    c0Var.f147550b = iVar2;
                    c0Var.f147551c = null;
                    c0Var.f147552d = pVar4;
                    c0Var.f147553e = cVar;
                    c0Var.f147554f = pVar3;
                    c0Var.f147555g = null;
                    c0Var.f147557i = i18;
                    c0Var.f147558j = i17;
                    c0Var.f147559k = i19;
                    c0Var.f147561m = 8;
                    if (kVar.K4(context, c0Var) != aVar) {
                        iVar3 = iVar2;
                        i16 = i17;
                        i24 = i19;
                        r18 = i18;
                        iVar = iVar3;
                        cVar2 = cVar;
                        if (i16 != 0) {
                            nVar = pt1.n.f.f140900a;
                        } else if (i24 != 0) {
                            nVar = pt1.n.h.f140902a;
                        } else {
                            nVar = pt1.n.b.f140894a;
                        }
                        nVar2 = nVar;
                        p2Var = kVar.f147673h;
                        z15 = pVar4 instanceof c80.p.a;
                        c0Var.f147549a = null;
                        c0Var.f147550b = iVar;
                        c0Var.f147551c = null;
                        c0Var.f147552d = pVar4;
                        c0Var.f147553e = cVar2;
                        c0Var.f147554f = pVar3;
                        c0Var.f147555g = nVar2;
                        c0Var.f147556h = p2Var;
                        c0Var.f147557i = r18;
                        c0Var.f147558j = i16;
                        c0Var.f147559k = i24;
                        c0Var.f147560l = z15 ? 1 : 0;
                        c0Var.f147561m = 9;
                        objB4 = k.B4(kVar, c0Var);
                        if (objB4 != aVar) {
                            iVar4 = iVar;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            r19 = r18;
                            i25 = z15 ? 1 : 0;
                            i53.c cVar15 = cVar2;
                            pt1.n nVar15 = nVar2;
                            boolean zBooleanValue13 = ((Boolean) objB4).booleanValue();
                            if (i25 != 0) {
                                r44 = i15;
                            } else {
                                r44 = 0;
                            }
                            oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar15, null, null, nVar15, null, null, null, pVar6, r44, false, zBooleanValue13, false, false, false, 980825598, null);
                            r24 = 0;
                            c0Var.f147549a = null;
                            c0Var.f147550b = null;
                            c0Var.f147551c = null;
                            c0Var.f147552d = null;
                            c0Var.f147553e = null;
                            c0Var.f147554f = null;
                            c0Var.f147555g = null;
                            c0Var.f147556h = null;
                            c0Var.f147557i = r19;
                            c0Var.f147558j = i16;
                            c0Var.f147559k = i24;
                            c0Var.f147561m = 10;
                            if (p2Var.emit(oVar, c0Var) != aVar) {
                                i26 = i24;
                                i27 = i16;
                                if (i27 == 0) {
                                    r25 = r19;
                                    c0Var.f147549a = r24;
                                    c0Var.f147550b = r24;
                                    c0Var.f147551c = r24;
                                    c0Var.f147552d = r24;
                                    c0Var.f147553e = r24;
                                    c0Var.f147554f = r24;
                                    c0Var.f147555g = r24;
                                    c0Var.f147557i = r25;
                                    c0Var.f147558j = i27;
                                    c0Var.f147559k = i26;
                                    c0Var.f147561m = 11;
                                    break;
                                }
                                r25 = r19;
                                k.y4(kVar, context);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar;
                }
                obj2 = ((v2.b) v2Var3).f47386a;
                xVar = (pt1.x) obj2;
                if (xVar.f141019p) {
                    kVar.f147677l.setValue(obj2);
                } else {
                    kVar.f147677l.setValue(obj2);
                }
                r18 = i18;
                cVar2 = cVar;
                iVar = iVar2;
                i16 = i17;
                i24 = i15;
                if (i16 != 0) {
                    nVar = pt1.n.f.f140900a;
                } else if (i24 != 0) {
                    nVar = pt1.n.h.f140902a;
                } else {
                    nVar = pt1.n.b.f140894a;
                }
                nVar2 = nVar;
                p2Var = kVar.f147673h;
                z15 = pVar4 instanceof c80.p.a;
                c0Var.f147549a = null;
                c0Var.f147550b = iVar;
                c0Var.f147551c = null;
                c0Var.f147552d = pVar4;
                c0Var.f147553e = cVar2;
                c0Var.f147554f = pVar3;
                c0Var.f147555g = nVar2;
                c0Var.f147556h = p2Var;
                c0Var.f147557i = r18;
                c0Var.f147558j = i16;
                c0Var.f147559k = i24;
                c0Var.f147560l = z15 ? 1 : 0;
                c0Var.f147561m = 9;
                objB4 = k.B4(kVar, c0Var);
                if (objB4 != aVar) {
                    iVar4 = iVar;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    r19 = r18;
                    i25 = z15 ? 1 : 0;
                    i53.c cVar16 = cVar2;
                    pt1.n nVar16 = nVar2;
                    boolean zBooleanValue14 = ((Boolean) objB4).booleanValue();
                    if (i25 != 0) {
                        r44 = i15;
                    } else {
                        r44 = 0;
                    }
                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar16, null, null, nVar16, null, null, null, pVar6, r44, false, zBooleanValue14, false, false, false, 980825598, null);
                    r24 = 0;
                    c0Var.f147549a = null;
                    c0Var.f147550b = null;
                    c0Var.f147551c = null;
                    c0Var.f147552d = null;
                    c0Var.f147553e = null;
                    c0Var.f147554f = null;
                    c0Var.f147555g = null;
                    c0Var.f147556h = null;
                    c0Var.f147557i = r19;
                    c0Var.f147558j = i16;
                    c0Var.f147559k = i24;
                    c0Var.f147561m = 10;
                    if (p2Var.emit(oVar, c0Var) != aVar) {
                        i26 = i24;
                        i27 = i16;
                        if (i27 == 0) {
                            r25 = r19;
                            c0Var.f147549a = r24;
                            c0Var.f147550b = r24;
                            c0Var.f147551c = r24;
                            c0Var.f147552d = r24;
                            c0Var.f147553e = r24;
                            c0Var.f147554f = r24;
                            c0Var.f147555g = r24;
                            c0Var.f147557i = r25;
                            c0Var.f147558j = i27;
                            c0Var.f147559k = i26;
                            c0Var.f147561m = 11;
                            break;
                        }
                        r25 = r19;
                        k.y4(kVar, context);
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 8:
                i19 = c0Var.f147559k;
                i17 = c0Var.f147558j;
                i18 = c0Var.f147557i;
                pVar3 = c0Var.f147554f;
                cVar = c0Var.f147553e;
                c80.p pVar9 = c0Var.f147552d;
                iVar3 = c0Var.f147550b;
                o13.r.b(obj);
                pVar4 = pVar9;
                i15 = 1;
                i16 = i17;
                i24 = i19;
                r18 = i18;
                iVar = iVar3;
                cVar2 = cVar;
                if (i16 != 0) {
                    nVar = pt1.n.f.f140900a;
                } else if (i24 != 0) {
                    nVar = pt1.n.h.f140902a;
                } else {
                    nVar = pt1.n.b.f140894a;
                }
                nVar2 = nVar;
                p2Var = kVar.f147673h;
                z15 = pVar4 instanceof c80.p.a;
                c0Var.f147549a = null;
                c0Var.f147550b = iVar;
                c0Var.f147551c = null;
                c0Var.f147552d = pVar4;
                c0Var.f147553e = cVar2;
                c0Var.f147554f = pVar3;
                c0Var.f147555g = nVar2;
                c0Var.f147556h = p2Var;
                c0Var.f147557i = r18;
                c0Var.f147558j = i16;
                c0Var.f147559k = i24;
                c0Var.f147560l = z15 ? 1 : 0;
                c0Var.f147561m = 9;
                objB4 = k.B4(kVar, c0Var);
                if (objB4 != aVar) {
                    iVar4 = iVar;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    r19 = r18;
                    i25 = z15 ? 1 : 0;
                    i53.c cVar17 = cVar2;
                    pt1.n nVar17 = nVar2;
                    boolean zBooleanValue15 = ((Boolean) objB4).booleanValue();
                    if (i25 != 0) {
                        r44 = i15;
                    } else {
                        r44 = 0;
                    }
                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar17, null, null, nVar17, null, null, null, pVar6, r44, false, zBooleanValue15, false, false, false, 980825598, null);
                    r24 = 0;
                    c0Var.f147549a = null;
                    c0Var.f147550b = null;
                    c0Var.f147551c = null;
                    c0Var.f147552d = null;
                    c0Var.f147553e = null;
                    c0Var.f147554f = null;
                    c0Var.f147555g = null;
                    c0Var.f147556h = null;
                    c0Var.f147557i = r19;
                    c0Var.f147558j = i16;
                    c0Var.f147559k = i24;
                    c0Var.f147561m = 10;
                    if (p2Var.emit(oVar, c0Var) != aVar) {
                        i26 = i24;
                        i27 = i16;
                        if (i27 == 0) {
                            r25 = r19;
                            c0Var.f147549a = r24;
                            c0Var.f147550b = r24;
                            c0Var.f147551c = r24;
                            c0Var.f147552d = r24;
                            c0Var.f147553e = r24;
                            c0Var.f147554f = r24;
                            c0Var.f147555g = r24;
                            c0Var.f147557i = r25;
                            c0Var.f147558j = i27;
                            c0Var.f147559k = i26;
                            c0Var.f147561m = 11;
                            break;
                        }
                        r25 = r19;
                        k.y4(kVar, context);
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 9:
                i25 = c0Var.f147560l;
                int i29 = c0Var.f147559k;
                int i30 = c0Var.f147558j;
                int i34 = c0Var.f147557i;
                p2 p2Var3 = c0Var.f147556h;
                nVar2 = c0Var.f147555g;
                pt1.p pVar10 = c0Var.f147554f;
                cVar2 = c0Var.f147553e;
                c80.p pVar11 = c0Var.f147552d;
                r53.i iVar9 = c0Var.f147550b;
                o13.r.b(obj);
                pVar5 = pVar10;
                iVar4 = iVar9;
                pVar6 = pVar11;
                i24 = i29;
                r19 = i34;
                p2Var = p2Var3;
                i15 = 1;
                objB4 = obj;
                i16 = i30;
                i53.c cVar18 = cVar2;
                pt1.n nVar18 = nVar2;
                boolean zBooleanValue16 = ((Boolean) objB4).booleanValue();
                if (i25 != 0) {
                    r44 = i15;
                } else {
                    r44 = 0;
                }
                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar4, false, null, c0Var.f147568v, c0Var.f147570x, cVar18, null, null, nVar18, null, null, null, pVar6, r44, false, zBooleanValue16, false, false, false, 980825598, null);
                r24 = 0;
                c0Var.f147549a = null;
                c0Var.f147550b = null;
                c0Var.f147551c = null;
                c0Var.f147552d = null;
                c0Var.f147553e = null;
                c0Var.f147554f = null;
                c0Var.f147555g = null;
                c0Var.f147556h = null;
                c0Var.f147557i = r19;
                c0Var.f147558j = i16;
                c0Var.f147559k = i24;
                c0Var.f147561m = 10;
                if (p2Var.emit(oVar, c0Var) != aVar) {
                    i26 = i24;
                    i27 = i16;
                    if (i27 == 0) {
                        r25 = r19;
                        c0Var.f147549a = r24;
                        c0Var.f147550b = r24;
                        c0Var.f147551c = r24;
                        c0Var.f147552d = r24;
                        c0Var.f147553e = r24;
                        c0Var.f147554f = r24;
                        c0Var.f147555g = r24;
                        c0Var.f147557i = r25;
                        c0Var.f147558j = i27;
                        c0Var.f147559k = i26;
                        c0Var.f147561m = 11;
                        break;
                    }
                    r25 = r19;
                    k.y4(kVar, context);
                    return Unit.INSTANCE;
                }
                return aVar;
            case 10:
                i26 = c0Var.f147559k;
                i27 = c0Var.f147558j;
                int i35 = c0Var.f147557i;
                o13.r.b(obj);
                context = context;
                r24 = 0;
                r25 = i35;
                if (i27 == 0) {
                    r25 = r19;
                    c0Var.f147549a = r24;
                    c0Var.f147550b = r24;
                    c0Var.f147551c = r24;
                    c0Var.f147552d = r24;
                    c0Var.f147553e = r24;
                    c0Var.f147554f = r24;
                    c0Var.f147555g = r24;
                    c0Var.f147557i = r25;
                    c0Var.f147558j = i27;
                    c0Var.f147559k = i26;
                    c0Var.f147561m = 11;
                    break;
                }
                r25 = r19;
                k.y4(kVar, context);
                return Unit.INSTANCE;
            case 11:
                o13.r.b(obj);
                context = context;
                r25 = r19;
                k.y4(kVar, context);
                return Unit.INSTANCE;
            case 12:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
