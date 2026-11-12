package qt1;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import yc.t2;
import yc.u2;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$loadDeepLinkedTrail$1", f = "TrailDetailsViewModel.kt", l = {316, 323, 326, 342, 346, 354, 358, 395, 382, 399, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs1.s f147603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c80.p f147604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r53.i f147605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f147606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i53.c f147607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pt1.n f147608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pt1.p f147609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p2 f147610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f147611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f147612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f147613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f147614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f147615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f147616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f147617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f147618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f147619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Long f147620r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f147621t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$loadDeepLinkedTrail$1$photosFlow$1$1$1", f = "TrailDetailsViewModel.kt", l = {337}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f147623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f147624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f147623b = kVar;
            this.f147624c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f147623b, this.f147624c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147622a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = this.f147623b.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, this.f147624c, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073740799);
                this.f147622a = 1;
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
    public e0(k kVar, boolean z14, String str, String str2, String str3, Long l14, Context context, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f147615m = kVar;
        this.f147616n = z14;
        this.f147617o = str;
        this.f147618p = str2;
        this.f147619q = str3;
        this.f147620r = l14;
        this.f147621t = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f147615m, this.f147616n, this.f147617o, this.f147618p, this.f147619q, this.f147620r, this.f147621t, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x033b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0351  */
    /* JADX WARN: Code duplicated, block: B:106:0x0354  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x012f A[PHI: r0
      0x012f: PHI (r0v7 java.lang.Object) = (r0v6 java.lang.Object), (r0v14 java.lang.Object) binds: [B:26:0x012b, B:15:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0135  */
    /* JADX WARN: Code duplicated, block: B:33:0x0152 A[PHI: r0 r5
      0x0152: PHI (r0v15 qs1.s) = (r0v13 qs1.s), (r0v17 qs1.s) binds: [B:31:0x014e, B:14:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r5v8 java.lang.Object) = (r5v7 java.lang.Object), (r5v10 java.lang.Object) binds: [B:31:0x014e, B:14:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0160  */
    /* JADX WARN: Code duplicated, block: B:36:0x0166  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x0209  */
    /* JADX WARN: Code duplicated, block: B:56:0x021a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0274  */
    /* JADX WARN: Code duplicated, block: B:75:0x027b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0288  */
    /* JADX WARN: Code duplicated, block: B:80:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0304  */
    /* JADX WARN: Code duplicated, block: B:98:0x0309  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03cb, code lost:
    
        if (qt1.k.C4(r11, r1, r51) == r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03d6, code lost:
    
        if (qt1.k.x4(r11) == r7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0240, code lost:
    
        if (r11.K4(r12, r51) == r7) goto L116;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0152, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [c80.p, i53.c, java.util.List, pt1.n, qs1.s, r53.i] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC3;
        v2 v2Var;
        qs1.s sVar;
        Object objJ;
        c80.p pVar;
        Long curatedCourseId;
        long jLongValue;
        r53.i iVarA;
        Object objS3;
        qs1.s sVar2;
        r53.i iVar;
        long j8;
        List list;
        Long l14;
        boolean z14;
        List list2;
        qs1.s sVar3;
        c80.p pVar2;
        long j14;
        r53.i iVar2;
        int i14;
        boolean z15;
        Object objO4;
        qs1.s sVar4;
        List list3;
        r53.i iVar3;
        int i15;
        v2 v2Var2;
        Integer num;
        List<qs1.u> list4;
        boolean z16;
        Object objW0;
        List list5;
        v2 v2Var3;
        List<qs1.u> listB;
        i53.c cVarE;
        pt1.n nVar;
        p2 p2Var;
        Boolean favorite;
        boolean zBooleanValue;
        pt1.p pVarB;
        boolean z17;
        Object objB4;
        pt1.n nVar2;
        i53.c cVar;
        c80.p pVar3;
        int i16;
        p2 p2Var2;
        long j15;
        int i17;
        ArrayList arrayList;
        Iterator it;
        qs1.h locationDTO;
        String courseNameUriComponent;
        qs1.v vVar;
        pt1.o oVar;
        boolean z18;
        ?? r15;
        int i18;
        long j16;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = this.f147614l;
        boolean z19 = this.f147616n;
        Context context = this.f147621t;
        k kVar = this.f147615m;
        switch (i19) {
            case 0:
                o13.r.b(obj);
                if (kVar.f147672g != null && !z19) {
                    return Unit.INSTANCE;
                }
                p2 p2Var3 = kVar.f147673h;
                pt1.o oVar2 = new pt1.o(true, false, false, null, false, false, 0, false, false, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 1073741308, null);
                this.f147614l = 1;
                p2Var3.k(null, oVar2);
                if (Unit.INSTANCE != aVar) {
                    ss1.a aVar2 = kVar.f147666a;
                    this.f147614l = 2;
                    objC3 = aVar2.C3(this.f147617o, this.f147618p, this.f147619q, this);
                    if (objC3 != aVar) {
                        v2Var = (v2) objC3;
                        if (v2Var instanceof v2.b) {
                            this.f147614l = 11;
                        } else {
                            sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                            c80.q qVar = c80.q.GARMIN_TRAILS;
                            this.f147603a = sVar;
                            this.f147614l = 3;
                            objJ = j1Var.j(qVar, this);
                            if (objJ != aVar) {
                                pVar = (c80.p) objJ;
                                qs1.d dVar = sVar.f147341a;
                                kVar.f147672g = dVar;
                                curatedCourseId = dVar.getCuratedCourseId();
                                if (curatedCourseId != null) {
                                    jLongValue = curatedCourseId.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                                iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, jLongValue, 1), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                                ss1.a0 a0Var = kVar.f147667b;
                                Long curatedCourseId2 = sVar.f147341a.getCuratedCourseId();
                                long jLongValue2 = curatedCourseId2 != null ? curatedCourseId2.longValue() : -1L;
                                this.f147603a = sVar;
                                this.f147604b = pVar;
                                this.f147605c = iVarA;
                                this.f147611i = jLongValue;
                                this.f147614l = 4;
                                objS3 = a0Var.s3(jLongValue2, this);
                                if (objS3 != aVar) {
                                    sVar2 = sVar;
                                    iVar = iVarA;
                                    j8 = jLongValue;
                                    list = (List) objS3;
                                    vs1.k kVar2 = kVar.f147684t;
                                    list.getClass();
                                    TreeSet treeSet = new TreeSet();
                                    p13.h0.W0(list, treeSet);
                                    kVar2.getClass();
                                    kVar2.f179847f = treeSet;
                                    l14 = this.f147620r;
                                    if (l14 == null && !z19) {
                                        long jLongValue3 = l14.longValue();
                                        this.f147603a = sVar2;
                                        this.f147604b = pVar;
                                        this.f147605c = iVar;
                                        this.f147606d = list;
                                        this.f147611i = j8;
                                        z15 = false;
                                        this.f147612j = 0;
                                        this.f147614l = 5;
                                        objO4 = k.O4(kVar, context, jLongValue3, this);
                                        if (objO4 != aVar) {
                                            sVar4 = sVar2;
                                            pVar2 = pVar;
                                            list3 = list;
                                            iVar3 = iVar;
                                            i15 = 0;
                                            v2Var2 = (v2) objO4;
                                            if (!(v2Var2 instanceof v2.b)) {
                                                kVar.f147677l.setValue(((v2.b) v2Var2).f47386a);
                                            } else if ((v2Var2 instanceof v2.a) || (num = ((v2.a) v2Var2).f47384b) == null || num.intValue() != 404) {
                                                this.f147603a = sVar4;
                                                this.f147604b = pVar2;
                                                this.f147605c = iVar3;
                                                this.f147606d = list3;
                                                this.f147611i = j8;
                                                this.f147612j = i15;
                                                this.f147614l = 6;
                                            }
                                            z14 = z15;
                                            j14 = j8;
                                            sVar3 = sVar4;
                                            i14 = 1;
                                            iVar2 = iVar3;
                                            list2 = list3;
                                            ss1.a0 a0Var2 = kVar.f147667b;
                                            us1.e eVar = us1.e.MOST_HELPFUL;
                                            this.f147603a = sVar3;
                                            this.f147604b = pVar2;
                                            this.f147605c = iVar2;
                                            this.f147606d = list2;
                                            this.f147611i = j14;
                                            this.f147612j = i14;
                                            this.f147614l = 7;
                                            list4 = null;
                                            z16 = true;
                                            objW0 = a0Var2.w0(j14, eVar, 0, 5, this);
                                            if (objW0 != aVar) {
                                                list5 = list2;
                                                v2Var3 = (v2) objW0;
                                                if (v2Var3 instanceof v2.b) {
                                                    listB = list4;
                                                } else {
                                                    listB = list4;
                                                }
                                                if (listB != null) {
                                                    arrayList = new ArrayList(p13.y.r(listB, 10));
                                                    it = listB.iterator();
                                                    while (it.hasNext()) {
                                                        qs1.u uVar = (qs1.u) it.next();
                                                        lt1.j jVar = lt1.j.f114865a;
                                                        boolean zR = p13.h0.R(list5, uVar.getTripReportId());
                                                        Iterator it3 = it;
                                                        locationDTO = sVar3.f147341a.getLocationDTO();
                                                        if (locationDTO == null) {
                                                            locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                        }
                                                        List list6 = list5;
                                                        courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                                                        if (courseNameUriComponent == null) {
                                                            courseNameUriComponent = "";
                                                        }
                                                        jVar.getClass();
                                                        arrayList.add(lt1.j.e(uVar, context, zR, locationDTO, courseNameUriComponent));
                                                        it = it3;
                                                        list5 = list6;
                                                    }
                                                    cVarE = i53.a.e(arrayList);
                                                } else {
                                                    cVarE = null;
                                                }
                                                if (i14 != 0) {
                                                    nVar = pt1.n.h.f140902a;
                                                } else {
                                                    nVar = pt1.n.b.f140894a;
                                                }
                                                p2Var = kVar.f147673h;
                                                lt1.j jVar2 = lt1.j.f114865a;
                                                favorite = sVar3.f147341a.getFavorite();
                                                if (favorite != null) {
                                                    zBooleanValue = favorite.booleanValue();
                                                } else {
                                                    zBooleanValue = z14;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                                jVar2.getClass();
                                                pVarB = lt1.j.b(sVar3, context, boolValueOf);
                                                z17 = pVar2 instanceof c80.p.a;
                                                this.f147603a = null;
                                                this.f147604b = pVar2;
                                                this.f147605c = iVar2;
                                                this.f147606d = null;
                                                this.f147607e = cVarE;
                                                this.f147608f = nVar;
                                                this.f147609g = pVarB;
                                                this.f147610h = p2Var;
                                                this.f147611i = j14;
                                                this.f147612j = i14;
                                                this.f147613k = z17 ? 1 : 0;
                                                this.f147614l = 8;
                                                objB4 = k.B4(kVar, this);
                                                if (objB4 != aVar) {
                                                    nVar2 = nVar;
                                                    cVar = cVarE;
                                                    pVar3 = pVar2;
                                                    i16 = z17 ? 1 : 0;
                                                    p2Var2 = p2Var;
                                                    j15 = j14;
                                                    i17 = i14;
                                                    pt1.p pVar4 = pVarB;
                                                    r53.i iVar4 = iVar2;
                                                    boolean zBooleanValue2 = ((Boolean) objB4).booleanValue();
                                                    if (i16 != 0) {
                                                        z18 = z16;
                                                    } else {
                                                        z18 = z14;
                                                    }
                                                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar4, 0, iVar4, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue2, false, false, false, 980874750, null);
                                                    r15 = 0;
                                                    this.f147603a = null;
                                                    this.f147604b = null;
                                                    this.f147605c = null;
                                                    this.f147606d = null;
                                                    this.f147607e = null;
                                                    this.f147608f = null;
                                                    this.f147609g = null;
                                                    this.f147610h = null;
                                                    this.f147611i = j15;
                                                    this.f147612j = i17;
                                                    this.f147614l = 9;
                                                    if (p2Var2.emit(oVar, this) != aVar) {
                                                        i18 = i17;
                                                        j16 = j15;
                                                        k.y4(kVar, context);
                                                        this.f147603a = r15;
                                                        this.f147604b = r15;
                                                        this.f147605c = r15;
                                                        this.f147606d = r15;
                                                        this.f147607e = r15;
                                                        this.f147608f = r15;
                                                        this.f147611i = j16;
                                                        this.f147612j = i18;
                                                        this.f147614l = 10;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                        list2 = list;
                                        sVar3 = sVar2;
                                        pVar2 = pVar;
                                        j14 = j8;
                                        iVar2 = iVar;
                                        i14 = 0;
                                        ss1.a0 a0Var3 = kVar.f147667b;
                                        us1.e eVar2 = us1.e.MOST_HELPFUL;
                                        this.f147603a = sVar3;
                                        this.f147604b = pVar2;
                                        this.f147605c = iVar2;
                                        this.f147606d = list2;
                                        this.f147611i = j14;
                                        this.f147612j = i14;
                                        this.f147614l = 7;
                                        list4 = null;
                                        z16 = true;
                                        objW0 = a0Var3.w0(j14, eVar2, 0, 5, this);
                                        if (objW0 != aVar) {
                                            list5 = list2;
                                            v2Var3 = (v2) objW0;
                                            if ((v2Var3 instanceof v2.b) || (vVar = (qs1.v) ((v2.b) v2Var3).f47386a) == null) {
                                                listB = list4;
                                            } else {
                                                listB = vVar.b();
                                            }
                                            if (listB != null) {
                                                arrayList = new ArrayList(p13.y.r(listB, 10));
                                                it = listB.iterator();
                                                while (it.hasNext()) {
                                                    qs1.u uVar2 = (qs1.u) it.next();
                                                    lt1.j jVar3 = lt1.j.f114865a;
                                                    boolean zR2 = p13.h0.R(list5, uVar2.getTripReportId());
                                                    Iterator it4 = it;
                                                    locationDTO = sVar3.f147341a.getLocationDTO();
                                                    if (locationDTO == null) {
                                                        locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                                    }
                                                    List list7 = list5;
                                                    courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                                                    if (courseNameUriComponent == null) {
                                                        courseNameUriComponent = "";
                                                    }
                                                    jVar3.getClass();
                                                    arrayList.add(lt1.j.e(uVar2, context, zR2, locationDTO, courseNameUriComponent));
                                                    it = it4;
                                                    list5 = list7;
                                                }
                                                cVarE = i53.a.e(arrayList);
                                            } else {
                                                cVarE = null;
                                            }
                                            if (i14 != 0) {
                                                nVar = pt1.n.h.f140902a;
                                            } else {
                                                nVar = pt1.n.b.f140894a;
                                            }
                                            p2Var = kVar.f147673h;
                                            lt1.j jVar4 = lt1.j.f114865a;
                                            favorite = sVar3.f147341a.getFavorite();
                                            if (favorite != null) {
                                                zBooleanValue = favorite.booleanValue();
                                            } else {
                                                zBooleanValue = z14;
                                            }
                                            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                                            jVar4.getClass();
                                            pVarB = lt1.j.b(sVar3, context, boolValueOf2);
                                            z17 = pVar2 instanceof c80.p.a;
                                            this.f147603a = null;
                                            this.f147604b = pVar2;
                                            this.f147605c = iVar2;
                                            this.f147606d = null;
                                            this.f147607e = cVarE;
                                            this.f147608f = nVar;
                                            this.f147609g = pVarB;
                                            this.f147610h = p2Var;
                                            this.f147611i = j14;
                                            this.f147612j = i14;
                                            this.f147613k = z17 ? 1 : 0;
                                            this.f147614l = 8;
                                            objB4 = k.B4(kVar, this);
                                            if (objB4 != aVar) {
                                                nVar2 = nVar;
                                                cVar = cVarE;
                                                pVar3 = pVar2;
                                                i16 = z17 ? 1 : 0;
                                                p2Var2 = p2Var;
                                                j15 = j14;
                                                i17 = i14;
                                                pt1.p pVar5 = pVarB;
                                                r53.i iVar5 = iVar2;
                                                boolean zBooleanValue3 = ((Boolean) objB4).booleanValue();
                                                if (i16 != 0) {
                                                    z18 = z16;
                                                } else {
                                                    z18 = z14;
                                                }
                                                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar5, 0, iVar5, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue3, false, false, false, 980874750, null);
                                                r15 = 0;
                                                this.f147603a = null;
                                                this.f147604b = null;
                                                this.f147605c = null;
                                                this.f147606d = null;
                                                this.f147607e = null;
                                                this.f147608f = null;
                                                this.f147609g = null;
                                                this.f147610h = null;
                                                this.f147611i = j15;
                                                this.f147612j = i17;
                                                this.f147614l = 9;
                                                if (p2Var2.emit(oVar, this) != aVar) {
                                                    i18 = i17;
                                                    j16 = j15;
                                                    k.y4(kVar, context);
                                                    this.f147603a = r15;
                                                    this.f147604b = r15;
                                                    this.f147605c = r15;
                                                    this.f147606d = r15;
                                                    this.f147607e = r15;
                                                    this.f147608f = r15;
                                                    this.f147611i = j16;
                                                    this.f147612j = i18;
                                                    this.f147614l = 10;
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
                ss1.a aVar3 = kVar.f147666a;
                this.f147614l = 2;
                objC3 = aVar3.C3(this.f147617o, this.f147618p, this.f147619q, this);
                if (objC3 != aVar) {
                    v2Var = (v2) objC3;
                    if (v2Var instanceof v2.b) {
                        this.f147614l = 11;
                    } else {
                        sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                        j1 j1Var2 = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                        c80.q qVar2 = c80.q.GARMIN_TRAILS;
                        this.f147603a = sVar;
                        this.f147614l = 3;
                        objJ = j1Var2.j(qVar2, this);
                        if (objJ != aVar) {
                            pVar = (c80.p) objJ;
                            qs1.d dVar2 = sVar.f147341a;
                            kVar.f147672g = dVar2;
                            curatedCourseId = dVar2.getCuratedCourseId();
                            if (curatedCourseId != null) {
                                jLongValue = curatedCourseId.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, jLongValue, 1), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                            ss1.a0 a0Var4 = kVar.f147667b;
                            Long curatedCourseId3 = sVar.f147341a.getCuratedCourseId();
                            if (curatedCourseId3 != null) {
                            }
                            this.f147603a = sVar;
                            this.f147604b = pVar;
                            this.f147605c = iVarA;
                            this.f147611i = jLongValue;
                            this.f147614l = 4;
                            objS3 = a0Var4.s3(jLongValue2, this);
                            if (objS3 != aVar) {
                                sVar2 = sVar;
                                iVar = iVarA;
                                j8 = jLongValue;
                                list = (List) objS3;
                                vs1.k kVar3 = kVar.f147684t;
                                list.getClass();
                                TreeSet treeSet2 = new TreeSet();
                                p13.h0.W0(list, treeSet2);
                                kVar3.getClass();
                                kVar3.f179847f = treeSet2;
                                l14 = this.f147620r;
                                if (l14 == null) {
                                }
                                z14 = false;
                                list2 = list;
                                sVar3 = sVar2;
                                pVar2 = pVar;
                                j14 = j8;
                                iVar2 = iVar;
                                i14 = 0;
                                ss1.a0 a0Var5 = kVar.f147667b;
                                us1.e eVar3 = us1.e.MOST_HELPFUL;
                                this.f147603a = sVar3;
                                this.f147604b = pVar2;
                                this.f147605c = iVar2;
                                this.f147606d = list2;
                                this.f147611i = j14;
                                this.f147612j = i14;
                                this.f147614l = 7;
                                list4 = null;
                                z16 = true;
                                objW0 = a0Var5.w0(j14, eVar3, 0, 5, this);
                                if (objW0 != aVar) {
                                    list5 = list2;
                                    v2Var3 = (v2) objW0;
                                    if (v2Var3 instanceof v2.b) {
                                        listB = list4;
                                    } else {
                                        listB = list4;
                                    }
                                    if (listB != null) {
                                        arrayList = new ArrayList(p13.y.r(listB, 10));
                                        it = listB.iterator();
                                        while (it.hasNext()) {
                                            qs1.u uVar3 = (qs1.u) it.next();
                                            lt1.j jVar5 = lt1.j.f114865a;
                                            boolean zR3 = p13.h0.R(list5, uVar3.getTripReportId());
                                            Iterator it5 = it;
                                            locationDTO = sVar3.f147341a.getLocationDTO();
                                            if (locationDTO == null) {
                                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                            }
                                            List list8 = list5;
                                            courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                                            if (courseNameUriComponent == null) {
                                                courseNameUriComponent = "";
                                            }
                                            jVar5.getClass();
                                            arrayList.add(lt1.j.e(uVar3, context, zR3, locationDTO, courseNameUriComponent));
                                            it = it5;
                                            list5 = list8;
                                        }
                                        cVarE = i53.a.e(arrayList);
                                    } else {
                                        cVarE = null;
                                    }
                                    if (i14 != 0) {
                                        nVar = pt1.n.h.f140902a;
                                    } else {
                                        nVar = pt1.n.b.f140894a;
                                    }
                                    p2Var = kVar.f147673h;
                                    lt1.j jVar6 = lt1.j.f114865a;
                                    favorite = sVar3.f147341a.getFavorite();
                                    if (favorite != null) {
                                        zBooleanValue = favorite.booleanValue();
                                    } else {
                                        zBooleanValue = z14;
                                    }
                                    Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                                    jVar6.getClass();
                                    pVarB = lt1.j.b(sVar3, context, boolValueOf3);
                                    z17 = pVar2 instanceof c80.p.a;
                                    this.f147603a = null;
                                    this.f147604b = pVar2;
                                    this.f147605c = iVar2;
                                    this.f147606d = null;
                                    this.f147607e = cVarE;
                                    this.f147608f = nVar;
                                    this.f147609g = pVarB;
                                    this.f147610h = p2Var;
                                    this.f147611i = j14;
                                    this.f147612j = i14;
                                    this.f147613k = z17 ? 1 : 0;
                                    this.f147614l = 8;
                                    objB4 = k.B4(kVar, this);
                                    if (objB4 != aVar) {
                                        nVar2 = nVar;
                                        cVar = cVarE;
                                        pVar3 = pVar2;
                                        i16 = z17 ? 1 : 0;
                                        p2Var2 = p2Var;
                                        j15 = j14;
                                        i17 = i14;
                                        pt1.p pVar6 = pVarB;
                                        r53.i iVar6 = iVar2;
                                        boolean zBooleanValue4 = ((Boolean) objB4).booleanValue();
                                        if (i16 != 0) {
                                            z18 = z16;
                                        } else {
                                            z18 = z14;
                                        }
                                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar6, 0, iVar6, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue4, false, false, false, 980874750, null);
                                        r15 = 0;
                                        this.f147603a = null;
                                        this.f147604b = null;
                                        this.f147605c = null;
                                        this.f147606d = null;
                                        this.f147607e = null;
                                        this.f147608f = null;
                                        this.f147609g = null;
                                        this.f147610h = null;
                                        this.f147611i = j15;
                                        this.f147612j = i17;
                                        this.f147614l = 9;
                                        if (p2Var2.emit(oVar, this) != aVar) {
                                            i18 = i17;
                                            j16 = j15;
                                            k.y4(kVar, context);
                                            this.f147603a = r15;
                                            this.f147604b = r15;
                                            this.f147605c = r15;
                                            this.f147606d = r15;
                                            this.f147607e = r15;
                                            this.f147608f = r15;
                                            this.f147611i = j16;
                                            this.f147612j = i18;
                                            this.f147614l = 10;
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
                objC3 = obj;
                v2Var = (v2) objC3;
                if (v2Var instanceof v2.b) {
                    sVar = (qs1.s) ((v2.b) v2Var).f47386a;
                    j1 j1Var3 = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                    c80.q qVar3 = c80.q.GARMIN_TRAILS;
                    this.f147603a = sVar;
                    this.f147614l = 3;
                    objJ = j1Var3.j(qVar3, this);
                    if (objJ != aVar) {
                        pVar = (c80.p) objJ;
                        qs1.d dVar3 = sVar.f147341a;
                        kVar.f147672g = dVar3;
                        curatedCourseId = dVar3.getCuratedCourseId();
                        if (curatedCourseId != null) {
                            jLongValue = curatedCourseId.longValue();
                        } else {
                            jLongValue = -1;
                        }
                        iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, jLongValue, 1), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                        ss1.a0 a0Var6 = kVar.f147667b;
                        Long curatedCourseId4 = sVar.f147341a.getCuratedCourseId();
                        if (curatedCourseId4 != null) {
                        }
                        this.f147603a = sVar;
                        this.f147604b = pVar;
                        this.f147605c = iVarA;
                        this.f147611i = jLongValue;
                        this.f147614l = 4;
                        objS3 = a0Var6.s3(jLongValue2, this);
                        if (objS3 != aVar) {
                            sVar2 = sVar;
                            iVar = iVarA;
                            j8 = jLongValue;
                            list = (List) objS3;
                            vs1.k kVar4 = kVar.f147684t;
                            list.getClass();
                            TreeSet treeSet3 = new TreeSet();
                            p13.h0.W0(list, treeSet3);
                            kVar4.getClass();
                            kVar4.f179847f = treeSet3;
                            l14 = this.f147620r;
                            if (l14 == null) {
                            }
                            z14 = false;
                            list2 = list;
                            sVar3 = sVar2;
                            pVar2 = pVar;
                            j14 = j8;
                            iVar2 = iVar;
                            i14 = 0;
                            ss1.a0 a0Var7 = kVar.f147667b;
                            us1.e eVar4 = us1.e.MOST_HELPFUL;
                            this.f147603a = sVar3;
                            this.f147604b = pVar2;
                            this.f147605c = iVar2;
                            this.f147606d = list2;
                            this.f147611i = j14;
                            this.f147612j = i14;
                            this.f147614l = 7;
                            list4 = null;
                            z16 = true;
                            objW0 = a0Var7.w0(j14, eVar4, 0, 5, this);
                            if (objW0 != aVar) {
                                list5 = list2;
                                v2Var3 = (v2) objW0;
                                if (v2Var3 instanceof v2.b) {
                                    listB = list4;
                                } else {
                                    listB = list4;
                                }
                                if (listB != null) {
                                    arrayList = new ArrayList(p13.y.r(listB, 10));
                                    it = listB.iterator();
                                    while (it.hasNext()) {
                                        qs1.u uVar4 = (qs1.u) it.next();
                                        lt1.j jVar7 = lt1.j.f114865a;
                                        boolean zR4 = p13.h0.R(list5, uVar4.getTripReportId());
                                        Iterator it6 = it;
                                        locationDTO = sVar3.f147341a.getLocationDTO();
                                        if (locationDTO == null) {
                                            locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                        }
                                        List list9 = list5;
                                        courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                                        if (courseNameUriComponent == null) {
                                            courseNameUriComponent = "";
                                        }
                                        jVar7.getClass();
                                        arrayList.add(lt1.j.e(uVar4, context, zR4, locationDTO, courseNameUriComponent));
                                        it = it6;
                                        list5 = list9;
                                    }
                                    cVarE = i53.a.e(arrayList);
                                } else {
                                    cVarE = null;
                                }
                                if (i14 != 0) {
                                    nVar = pt1.n.h.f140902a;
                                } else {
                                    nVar = pt1.n.b.f140894a;
                                }
                                p2Var = kVar.f147673h;
                                lt1.j jVar8 = lt1.j.f114865a;
                                favorite = sVar3.f147341a.getFavorite();
                                if (favorite != null) {
                                    zBooleanValue = favorite.booleanValue();
                                } else {
                                    zBooleanValue = z14;
                                }
                                Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
                                jVar8.getClass();
                                pVarB = lt1.j.b(sVar3, context, boolValueOf4);
                                z17 = pVar2 instanceof c80.p.a;
                                this.f147603a = null;
                                this.f147604b = pVar2;
                                this.f147605c = iVar2;
                                this.f147606d = null;
                                this.f147607e = cVarE;
                                this.f147608f = nVar;
                                this.f147609g = pVarB;
                                this.f147610h = p2Var;
                                this.f147611i = j14;
                                this.f147612j = i14;
                                this.f147613k = z17 ? 1 : 0;
                                this.f147614l = 8;
                                objB4 = k.B4(kVar, this);
                                if (objB4 != aVar) {
                                    nVar2 = nVar;
                                    cVar = cVarE;
                                    pVar3 = pVar2;
                                    i16 = z17 ? 1 : 0;
                                    p2Var2 = p2Var;
                                    j15 = j14;
                                    i17 = i14;
                                    pt1.p pVar7 = pVarB;
                                    r53.i iVar7 = iVar2;
                                    boolean zBooleanValue5 = ((Boolean) objB4).booleanValue();
                                    if (i16 != 0) {
                                        z18 = z16;
                                    } else {
                                        z18 = z14;
                                    }
                                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar7, 0, iVar7, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue5, false, false, false, 980874750, null);
                                    r15 = 0;
                                    this.f147603a = null;
                                    this.f147604b = null;
                                    this.f147605c = null;
                                    this.f147606d = null;
                                    this.f147607e = null;
                                    this.f147608f = null;
                                    this.f147609g = null;
                                    this.f147610h = null;
                                    this.f147611i = j15;
                                    this.f147612j = i17;
                                    this.f147614l = 9;
                                    if (p2Var2.emit(oVar, this) != aVar) {
                                        i18 = i17;
                                        j16 = j15;
                                        k.y4(kVar, context);
                                        this.f147603a = r15;
                                        this.f147604b = r15;
                                        this.f147605c = r15;
                                        this.f147606d = r15;
                                        this.f147607e = r15;
                                        this.f147608f = r15;
                                        this.f147611i = j16;
                                        this.f147612j = i18;
                                        this.f147614l = 10;
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    this.f147614l = 11;
                    break;
                }
                return aVar;
            case 3:
                sVar = this.f147603a;
                o13.r.b(obj);
                objJ = obj;
                pVar = (c80.p) objJ;
                qs1.d dVar4 = sVar.f147341a;
                kVar.f147672g = dVar4;
                curatedCourseId = dVar4.getCuratedCourseId();
                if (curatedCourseId != null) {
                    jLongValue = curatedCourseId.longValue();
                } else {
                    jLongValue = -1;
                }
                iVarA = r53.s.A(yc.o.a(new t2(new u2(5, 0, false, 0, 0, 0, 62, null), null, new b0(kVar, context, jLongValue, 1), 2, null).f196485a, v1.a(kVar)), x53.b.f189152a);
                ss1.a0 a0Var8 = kVar.f147667b;
                Long curatedCourseId5 = sVar.f147341a.getCuratedCourseId();
                if (curatedCourseId5 != null) {
                }
                this.f147603a = sVar;
                this.f147604b = pVar;
                this.f147605c = iVarA;
                this.f147611i = jLongValue;
                this.f147614l = 4;
                objS3 = a0Var8.s3(jLongValue2, this);
                if (objS3 != aVar) {
                    sVar2 = sVar;
                    iVar = iVarA;
                    j8 = jLongValue;
                    list = (List) objS3;
                    vs1.k kVar5 = kVar.f147684t;
                    list.getClass();
                    TreeSet treeSet4 = new TreeSet();
                    p13.h0.W0(list, treeSet4);
                    kVar5.getClass();
                    kVar5.f179847f = treeSet4;
                    l14 = this.f147620r;
                    if (l14 == null) {
                    }
                    z14 = false;
                    list2 = list;
                    sVar3 = sVar2;
                    pVar2 = pVar;
                    j14 = j8;
                    iVar2 = iVar;
                    i14 = 0;
                    ss1.a0 a0Var9 = kVar.f147667b;
                    us1.e eVar5 = us1.e.MOST_HELPFUL;
                    this.f147603a = sVar3;
                    this.f147604b = pVar2;
                    this.f147605c = iVar2;
                    this.f147606d = list2;
                    this.f147611i = j14;
                    this.f147612j = i14;
                    this.f147614l = 7;
                    list4 = null;
                    z16 = true;
                    objW0 = a0Var9.w0(j14, eVar5, 0, 5, this);
                    if (objW0 != aVar) {
                        list5 = list2;
                        v2Var3 = (v2) objW0;
                        if (v2Var3 instanceof v2.b) {
                            listB = list4;
                        } else {
                            listB = list4;
                        }
                        if (listB != null) {
                            arrayList = new ArrayList(p13.y.r(listB, 10));
                            it = listB.iterator();
                            while (it.hasNext()) {
                                qs1.u uVar5 = (qs1.u) it.next();
                                lt1.j jVar9 = lt1.j.f114865a;
                                boolean zR5 = p13.h0.R(list5, uVar5.getTripReportId());
                                Iterator it7 = it;
                                locationDTO = sVar3.f147341a.getLocationDTO();
                                if (locationDTO == null) {
                                    locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                                }
                                List list10 = list5;
                                courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                                if (courseNameUriComponent == null) {
                                    courseNameUriComponent = "";
                                }
                                jVar9.getClass();
                                arrayList.add(lt1.j.e(uVar5, context, zR5, locationDTO, courseNameUriComponent));
                                it = it7;
                                list5 = list10;
                            }
                            cVarE = i53.a.e(arrayList);
                        } else {
                            cVarE = null;
                        }
                        if (i14 != 0) {
                            nVar = pt1.n.h.f140902a;
                        } else {
                            nVar = pt1.n.b.f140894a;
                        }
                        p2Var = kVar.f147673h;
                        lt1.j jVar10 = lt1.j.f114865a;
                        favorite = sVar3.f147341a.getFavorite();
                        if (favorite != null) {
                            zBooleanValue = favorite.booleanValue();
                        } else {
                            zBooleanValue = z14;
                        }
                        Boolean boolValueOf5 = Boolean.valueOf(zBooleanValue);
                        jVar10.getClass();
                        pVarB = lt1.j.b(sVar3, context, boolValueOf5);
                        z17 = pVar2 instanceof c80.p.a;
                        this.f147603a = null;
                        this.f147604b = pVar2;
                        this.f147605c = iVar2;
                        this.f147606d = null;
                        this.f147607e = cVarE;
                        this.f147608f = nVar;
                        this.f147609g = pVarB;
                        this.f147610h = p2Var;
                        this.f147611i = j14;
                        this.f147612j = i14;
                        this.f147613k = z17 ? 1 : 0;
                        this.f147614l = 8;
                        objB4 = k.B4(kVar, this);
                        if (objB4 != aVar) {
                            nVar2 = nVar;
                            cVar = cVarE;
                            pVar3 = pVar2;
                            i16 = z17 ? 1 : 0;
                            p2Var2 = p2Var;
                            j15 = j14;
                            i17 = i14;
                            pt1.p pVar8 = pVarB;
                            r53.i iVar8 = iVar2;
                            boolean zBooleanValue6 = ((Boolean) objB4).booleanValue();
                            if (i16 != 0) {
                                z18 = z16;
                            } else {
                                z18 = z14;
                            }
                            oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar8, 0, iVar8, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue6, false, false, false, 980874750, null);
                            r15 = 0;
                            this.f147603a = null;
                            this.f147604b = null;
                            this.f147605c = null;
                            this.f147606d = null;
                            this.f147607e = null;
                            this.f147608f = null;
                            this.f147609g = null;
                            this.f147610h = null;
                            this.f147611i = j15;
                            this.f147612j = i17;
                            this.f147614l = 9;
                            if (p2Var2.emit(oVar, this) != aVar) {
                                i18 = i17;
                                j16 = j15;
                                k.y4(kVar, context);
                                this.f147603a = r15;
                                this.f147604b = r15;
                                this.f147605c = r15;
                                this.f147606d = r15;
                                this.f147607e = r15;
                                this.f147608f = r15;
                                this.f147611i = j16;
                                this.f147612j = i18;
                                this.f147614l = 10;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 4:
                j8 = this.f147611i;
                iVar = this.f147605c;
                pVar = this.f147604b;
                sVar2 = this.f147603a;
                o13.r.b(obj);
                objS3 = obj;
                list = (List) objS3;
                vs1.k kVar6 = kVar.f147684t;
                list.getClass();
                TreeSet treeSet5 = new TreeSet();
                p13.h0.W0(list, treeSet5);
                kVar6.getClass();
                kVar6.f179847f = treeSet5;
                l14 = this.f147620r;
                if (l14 == null) {
                }
                z14 = false;
                list2 = list;
                sVar3 = sVar2;
                pVar2 = pVar;
                j14 = j8;
                iVar2 = iVar;
                i14 = 0;
                ss1.a0 a0Var10 = kVar.f147667b;
                us1.e eVar6 = us1.e.MOST_HELPFUL;
                this.f147603a = sVar3;
                this.f147604b = pVar2;
                this.f147605c = iVar2;
                this.f147606d = list2;
                this.f147611i = j14;
                this.f147612j = i14;
                this.f147614l = 7;
                list4 = null;
                z16 = true;
                objW0 = a0Var10.w0(j14, eVar6, 0, 5, this);
                if (objW0 != aVar) {
                    list5 = list2;
                    v2Var3 = (v2) objW0;
                    if (v2Var3 instanceof v2.b) {
                        listB = list4;
                    } else {
                        listB = list4;
                    }
                    if (listB != null) {
                        arrayList = new ArrayList(p13.y.r(listB, 10));
                        it = listB.iterator();
                        while (it.hasNext()) {
                            qs1.u uVar6 = (qs1.u) it.next();
                            lt1.j jVar11 = lt1.j.f114865a;
                            boolean zR6 = p13.h0.R(list5, uVar6.getTripReportId());
                            Iterator it8 = it;
                            locationDTO = sVar3.f147341a.getLocationDTO();
                            if (locationDTO == null) {
                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                            }
                            List list11 = list5;
                            courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                            if (courseNameUriComponent == null) {
                                courseNameUriComponent = "";
                            }
                            jVar11.getClass();
                            arrayList.add(lt1.j.e(uVar6, context, zR6, locationDTO, courseNameUriComponent));
                            it = it8;
                            list5 = list11;
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    if (i14 != 0) {
                        nVar = pt1.n.h.f140902a;
                    } else {
                        nVar = pt1.n.b.f140894a;
                    }
                    p2Var = kVar.f147673h;
                    lt1.j jVar12 = lt1.j.f114865a;
                    favorite = sVar3.f147341a.getFavorite();
                    if (favorite != null) {
                        zBooleanValue = favorite.booleanValue();
                    } else {
                        zBooleanValue = z14;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(zBooleanValue);
                    jVar12.getClass();
                    pVarB = lt1.j.b(sVar3, context, boolValueOf6);
                    z17 = pVar2 instanceof c80.p.a;
                    this.f147603a = null;
                    this.f147604b = pVar2;
                    this.f147605c = iVar2;
                    this.f147606d = null;
                    this.f147607e = cVarE;
                    this.f147608f = nVar;
                    this.f147609g = pVarB;
                    this.f147610h = p2Var;
                    this.f147611i = j14;
                    this.f147612j = i14;
                    this.f147613k = z17 ? 1 : 0;
                    this.f147614l = 8;
                    objB4 = k.B4(kVar, this);
                    if (objB4 != aVar) {
                        nVar2 = nVar;
                        cVar = cVarE;
                        pVar3 = pVar2;
                        i16 = z17 ? 1 : 0;
                        p2Var2 = p2Var;
                        j15 = j14;
                        i17 = i14;
                        pt1.p pVar9 = pVarB;
                        r53.i iVar9 = iVar2;
                        boolean zBooleanValue7 = ((Boolean) objB4).booleanValue();
                        if (i16 != 0) {
                            z18 = z16;
                        } else {
                            z18 = z14;
                        }
                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar9, 0, iVar9, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue7, false, false, false, 980874750, null);
                        r15 = 0;
                        this.f147603a = null;
                        this.f147604b = null;
                        this.f147605c = null;
                        this.f147606d = null;
                        this.f147607e = null;
                        this.f147608f = null;
                        this.f147609g = null;
                        this.f147610h = null;
                        this.f147611i = j15;
                        this.f147612j = i17;
                        this.f147614l = 9;
                        if (p2Var2.emit(oVar, this) != aVar) {
                            i18 = i17;
                            j16 = j15;
                            k.y4(kVar, context);
                            this.f147603a = r15;
                            this.f147604b = r15;
                            this.f147605c = r15;
                            this.f147606d = r15;
                            this.f147607e = r15;
                            this.f147608f = r15;
                            this.f147611i = j16;
                            this.f147612j = i18;
                            this.f147614l = 10;
                        }
                    }
                    break;
                }
                return aVar;
            case 5:
                i15 = this.f147612j;
                j8 = this.f147611i;
                List list12 = this.f147606d;
                r53.i iVar10 = this.f147605c;
                pVar2 = this.f147604b;
                sVar4 = this.f147603a;
                o13.r.b(obj);
                objO4 = obj;
                iVar3 = iVar10;
                list3 = list12;
                z15 = false;
                v2Var2 = (v2) objO4;
                if (!(v2Var2 instanceof v2.b)) {
                    if (v2Var2 instanceof v2.a) {
                    }
                    this.f147603a = sVar4;
                    this.f147604b = pVar2;
                    this.f147605c = iVar3;
                    this.f147606d = list3;
                    this.f147611i = j8;
                    this.f147612j = i15;
                    this.f147614l = 6;
                    break;
                } else {
                    kVar.f147677l.setValue(((v2.b) v2Var2).f47386a);
                }
                z14 = z15;
                j14 = j8;
                sVar3 = sVar4;
                i14 = 1;
                iVar2 = iVar3;
                list2 = list3;
                ss1.a0 a0Var11 = kVar.f147667b;
                us1.e eVar7 = us1.e.MOST_HELPFUL;
                this.f147603a = sVar3;
                this.f147604b = pVar2;
                this.f147605c = iVar2;
                this.f147606d = list2;
                this.f147611i = j14;
                this.f147612j = i14;
                this.f147614l = 7;
                list4 = null;
                z16 = true;
                objW0 = a0Var11.w0(j14, eVar7, 0, 5, this);
                if (objW0 != aVar) {
                    list5 = list2;
                    v2Var3 = (v2) objW0;
                    if (v2Var3 instanceof v2.b) {
                        listB = list4;
                    } else {
                        listB = list4;
                    }
                    if (listB != null) {
                        arrayList = new ArrayList(p13.y.r(listB, 10));
                        it = listB.iterator();
                        while (it.hasNext()) {
                            qs1.u uVar7 = (qs1.u) it.next();
                            lt1.j jVar13 = lt1.j.f114865a;
                            boolean zR7 = p13.h0.R(list5, uVar7.getTripReportId());
                            Iterator it9 = it;
                            locationDTO = sVar3.f147341a.getLocationDTO();
                            if (locationDTO == null) {
                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                            }
                            List list13 = list5;
                            courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                            if (courseNameUriComponent == null) {
                                courseNameUriComponent = "";
                            }
                            jVar13.getClass();
                            arrayList.add(lt1.j.e(uVar7, context, zR7, locationDTO, courseNameUriComponent));
                            it = it9;
                            list5 = list13;
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    if (i14 != 0) {
                        nVar = pt1.n.h.f140902a;
                    } else {
                        nVar = pt1.n.b.f140894a;
                    }
                    p2Var = kVar.f147673h;
                    lt1.j jVar14 = lt1.j.f114865a;
                    favorite = sVar3.f147341a.getFavorite();
                    if (favorite != null) {
                        zBooleanValue = favorite.booleanValue();
                    } else {
                        zBooleanValue = z14;
                    }
                    Boolean boolValueOf7 = Boolean.valueOf(zBooleanValue);
                    jVar14.getClass();
                    pVarB = lt1.j.b(sVar3, context, boolValueOf7);
                    z17 = pVar2 instanceof c80.p.a;
                    this.f147603a = null;
                    this.f147604b = pVar2;
                    this.f147605c = iVar2;
                    this.f147606d = null;
                    this.f147607e = cVarE;
                    this.f147608f = nVar;
                    this.f147609g = pVarB;
                    this.f147610h = p2Var;
                    this.f147611i = j14;
                    this.f147612j = i14;
                    this.f147613k = z17 ? 1 : 0;
                    this.f147614l = 8;
                    objB4 = k.B4(kVar, this);
                    if (objB4 != aVar) {
                        nVar2 = nVar;
                        cVar = cVarE;
                        pVar3 = pVar2;
                        i16 = z17 ? 1 : 0;
                        p2Var2 = p2Var;
                        j15 = j14;
                        i17 = i14;
                        pt1.p pVar10 = pVarB;
                        r53.i iVar11 = iVar2;
                        boolean zBooleanValue8 = ((Boolean) objB4).booleanValue();
                        if (i16 != 0) {
                            z18 = z16;
                        } else {
                            z18 = z14;
                        }
                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar10, 0, iVar11, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue8, false, false, false, 980874750, null);
                        r15 = 0;
                        this.f147603a = null;
                        this.f147604b = null;
                        this.f147605c = null;
                        this.f147606d = null;
                        this.f147607e = null;
                        this.f147608f = null;
                        this.f147609g = null;
                        this.f147610h = null;
                        this.f147611i = j15;
                        this.f147612j = i17;
                        this.f147614l = 9;
                        if (p2Var2.emit(oVar, this) != aVar) {
                            i18 = i17;
                            j16 = j15;
                            k.y4(kVar, context);
                            this.f147603a = r15;
                            this.f147604b = r15;
                            this.f147605c = r15;
                            this.f147606d = r15;
                            this.f147607e = r15;
                            this.f147608f = r15;
                            this.f147611i = j16;
                            this.f147612j = i18;
                            this.f147614l = 10;
                        }
                    }
                    break;
                }
                return aVar;
            case 6:
                i15 = this.f147612j;
                long j17 = this.f147611i;
                list3 = this.f147606d;
                r53.i iVar12 = this.f147605c;
                c80.p pVar11 = this.f147604b;
                qs1.s sVar5 = this.f147603a;
                o13.r.b(obj);
                iVar3 = iVar12;
                sVar4 = sVar5;
                pVar2 = pVar11;
                j8 = j17;
                z15 = false;
                z14 = z15;
                j14 = j8;
                sVar3 = sVar4;
                i14 = i15;
                iVar2 = iVar3;
                list2 = list3;
                ss1.a0 a0Var12 = kVar.f147667b;
                us1.e eVar8 = us1.e.MOST_HELPFUL;
                this.f147603a = sVar3;
                this.f147604b = pVar2;
                this.f147605c = iVar2;
                this.f147606d = list2;
                this.f147611i = j14;
                this.f147612j = i14;
                this.f147614l = 7;
                list4 = null;
                z16 = true;
                objW0 = a0Var12.w0(j14, eVar8, 0, 5, this);
                if (objW0 != aVar) {
                    list5 = list2;
                    v2Var3 = (v2) objW0;
                    if (v2Var3 instanceof v2.b) {
                        listB = list4;
                    } else {
                        listB = list4;
                    }
                    if (listB != null) {
                        arrayList = new ArrayList(p13.y.r(listB, 10));
                        it = listB.iterator();
                        while (it.hasNext()) {
                            qs1.u uVar8 = (qs1.u) it.next();
                            lt1.j jVar15 = lt1.j.f114865a;
                            boolean zR8 = p13.h0.R(list5, uVar8.getTripReportId());
                            Iterator it10 = it;
                            locationDTO = sVar3.f147341a.getLocationDTO();
                            if (locationDTO == null) {
                                locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                            }
                            List list14 = list5;
                            courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                            if (courseNameUriComponent == null) {
                                courseNameUriComponent = "";
                            }
                            jVar15.getClass();
                            arrayList.add(lt1.j.e(uVar8, context, zR8, locationDTO, courseNameUriComponent));
                            it = it10;
                            list5 = list14;
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    if (i14 != 0) {
                        nVar = pt1.n.h.f140902a;
                    } else {
                        nVar = pt1.n.b.f140894a;
                    }
                    p2Var = kVar.f147673h;
                    lt1.j jVar16 = lt1.j.f114865a;
                    favorite = sVar3.f147341a.getFavorite();
                    if (favorite != null) {
                        zBooleanValue = favorite.booleanValue();
                    } else {
                        zBooleanValue = z14;
                    }
                    Boolean boolValueOf8 = Boolean.valueOf(zBooleanValue);
                    jVar16.getClass();
                    pVarB = lt1.j.b(sVar3, context, boolValueOf8);
                    z17 = pVar2 instanceof c80.p.a;
                    this.f147603a = null;
                    this.f147604b = pVar2;
                    this.f147605c = iVar2;
                    this.f147606d = null;
                    this.f147607e = cVarE;
                    this.f147608f = nVar;
                    this.f147609g = pVarB;
                    this.f147610h = p2Var;
                    this.f147611i = j14;
                    this.f147612j = i14;
                    this.f147613k = z17 ? 1 : 0;
                    this.f147614l = 8;
                    objB4 = k.B4(kVar, this);
                    if (objB4 != aVar) {
                        nVar2 = nVar;
                        cVar = cVarE;
                        pVar3 = pVar2;
                        i16 = z17 ? 1 : 0;
                        p2Var2 = p2Var;
                        j15 = j14;
                        i17 = i14;
                        pt1.p pVar12 = pVarB;
                        r53.i iVar13 = iVar2;
                        boolean zBooleanValue9 = ((Boolean) objB4).booleanValue();
                        if (i16 != 0) {
                            z18 = z16;
                        } else {
                            z18 = z14;
                        }
                        oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar12, 0, iVar13, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue9, false, false, false, 980874750, null);
                        r15 = 0;
                        this.f147603a = null;
                        this.f147604b = null;
                        this.f147605c = null;
                        this.f147606d = null;
                        this.f147607e = null;
                        this.f147608f = null;
                        this.f147609g = null;
                        this.f147610h = null;
                        this.f147611i = j15;
                        this.f147612j = i17;
                        this.f147614l = 9;
                        if (p2Var2.emit(oVar, this) != aVar) {
                            i18 = i17;
                            j16 = j15;
                            k.y4(kVar, context);
                            this.f147603a = r15;
                            this.f147604b = r15;
                            this.f147605c = r15;
                            this.f147606d = r15;
                            this.f147607e = r15;
                            this.f147608f = r15;
                            this.f147611i = j16;
                            this.f147612j = i18;
                            this.f147614l = 10;
                        }
                    }
                    break;
                }
                return aVar;
            case 7:
                int i24 = this.f147612j;
                j14 = this.f147611i;
                list5 = this.f147606d;
                iVar2 = this.f147605c;
                c80.p pVar13 = this.f147604b;
                qs1.s sVar6 = this.f147603a;
                o13.r.b(obj);
                z16 = true;
                list4 = null;
                sVar3 = sVar6;
                z14 = false;
                pVar2 = pVar13;
                i14 = i24;
                objW0 = obj;
                v2Var3 = (v2) objW0;
                if (v2Var3 instanceof v2.b) {
                    listB = list4;
                } else {
                    listB = list4;
                }
                if (listB != null) {
                    arrayList = new ArrayList(p13.y.r(listB, 10));
                    it = listB.iterator();
                    while (it.hasNext()) {
                        qs1.u uVar9 = (qs1.u) it.next();
                        lt1.j jVar17 = lt1.j.f114865a;
                        boolean zR9 = p13.h0.R(list5, uVar9.getTripReportId());
                        Iterator it11 = it;
                        locationDTO = sVar3.f147341a.getLocationDTO();
                        if (locationDTO == null) {
                            locationDTO = new qs1.h(null, null, null, null, null, 31, null);
                        }
                        List list15 = list5;
                        courseNameUriComponent = sVar3.f147341a.getCourseNameUriComponent();
                        if (courseNameUriComponent == null) {
                            courseNameUriComponent = "";
                        }
                        jVar17.getClass();
                        arrayList.add(lt1.j.e(uVar9, context, zR9, locationDTO, courseNameUriComponent));
                        it = it11;
                        list5 = list15;
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                if (i14 != 0) {
                    nVar = pt1.n.h.f140902a;
                } else {
                    nVar = pt1.n.b.f140894a;
                }
                p2Var = kVar.f147673h;
                lt1.j jVar18 = lt1.j.f114865a;
                favorite = sVar3.f147341a.getFavorite();
                if (favorite != null) {
                    zBooleanValue = favorite.booleanValue();
                } else {
                    zBooleanValue = z14;
                }
                Boolean boolValueOf9 = Boolean.valueOf(zBooleanValue);
                jVar18.getClass();
                pVarB = lt1.j.b(sVar3, context, boolValueOf9);
                z17 = pVar2 instanceof c80.p.a;
                this.f147603a = null;
                this.f147604b = pVar2;
                this.f147605c = iVar2;
                this.f147606d = null;
                this.f147607e = cVarE;
                this.f147608f = nVar;
                this.f147609g = pVarB;
                this.f147610h = p2Var;
                this.f147611i = j14;
                this.f147612j = i14;
                this.f147613k = z17 ? 1 : 0;
                this.f147614l = 8;
                objB4 = k.B4(kVar, this);
                if (objB4 != aVar) {
                    nVar2 = nVar;
                    cVar = cVarE;
                    pVar3 = pVar2;
                    i16 = z17 ? 1 : 0;
                    p2Var2 = p2Var;
                    j15 = j14;
                    i17 = i14;
                    pt1.p pVar14 = pVarB;
                    r53.i iVar14 = iVar2;
                    boolean zBooleanValue10 = ((Boolean) objB4).booleanValue();
                    if (i16 != 0) {
                        z18 = z16;
                    } else {
                        z18 = z14;
                    }
                    oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar14, 0, iVar14, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue10, false, false, false, 980874750, null);
                    r15 = 0;
                    this.f147603a = null;
                    this.f147604b = null;
                    this.f147605c = null;
                    this.f147606d = null;
                    this.f147607e = null;
                    this.f147608f = null;
                    this.f147609g = null;
                    this.f147610h = null;
                    this.f147611i = j15;
                    this.f147612j = i17;
                    this.f147614l = 9;
                    if (p2Var2.emit(oVar, this) != aVar) {
                        i18 = i17;
                        j16 = j15;
                        k.y4(kVar, context);
                        this.f147603a = r15;
                        this.f147604b = r15;
                        this.f147605c = r15;
                        this.f147606d = r15;
                        this.f147607e = r15;
                        this.f147608f = r15;
                        this.f147611i = j16;
                        this.f147612j = i18;
                        this.f147614l = 10;
                    }
                    break;
                }
                return aVar;
            case 8:
                i16 = this.f147613k;
                i17 = this.f147612j;
                long j18 = this.f147611i;
                p2 p2Var4 = this.f147610h;
                pVarB = this.f147609g;
                pt1.n nVar3 = this.f147608f;
                i53.c cVar2 = this.f147607e;
                iVar2 = this.f147605c;
                c80.p pVar15 = this.f147604b;
                o13.r.b(obj);
                p2Var2 = p2Var4;
                z16 = true;
                pVar3 = pVar15;
                nVar2 = nVar3;
                j15 = j18;
                cVar = cVar2;
                z14 = false;
                objB4 = obj;
                pt1.p pVar16 = pVarB;
                r53.i iVar15 = iVar2;
                boolean zBooleanValue11 = ((Boolean) objB4).booleanValue();
                if (i16 != 0) {
                    z18 = z16;
                } else {
                    z18 = z14;
                }
                oVar = new pt1.o(false, false, false, null, false, false, 0, false, false, pVar16, 0, iVar15, false, null, null, null, cVar, null, null, nVar2, null, null, null, pVar3, z18, false, zBooleanValue11, false, false, false, 980874750, null);
                r15 = 0;
                this.f147603a = null;
                this.f147604b = null;
                this.f147605c = null;
                this.f147606d = null;
                this.f147607e = null;
                this.f147608f = null;
                this.f147609g = null;
                this.f147610h = null;
                this.f147611i = j15;
                this.f147612j = i17;
                this.f147614l = 9;
                if (p2Var2.emit(oVar, this) != aVar) {
                    i18 = i17;
                    j16 = j15;
                    k.y4(kVar, context);
                    this.f147603a = r15;
                    this.f147604b = r15;
                    this.f147605c = r15;
                    this.f147606d = r15;
                    this.f147607e = r15;
                    this.f147608f = r15;
                    this.f147611i = j16;
                    this.f147612j = i18;
                    this.f147614l = 10;
                    break;
                }
                return aVar;
            case 9:
                i18 = this.f147612j;
                j16 = this.f147611i;
                o13.r.b(obj);
                r15 = 0;
                k.y4(kVar, context);
                this.f147603a = r15;
                this.f147604b = r15;
                this.f147605c = r15;
                this.f147606d = r15;
                this.f147607e = r15;
                this.f147608f = r15;
                this.f147611i = j16;
                this.f147612j = i18;
                this.f147614l = 10;
                break;
            case 10:
            case 11:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
