package aw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lxw1/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getAtpCoachPlans$2", f = "FBTPlanWizardViewModel.kt", l = {1792, 1796, 1836, 1861}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<xw1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f13580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f13586h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getAtpCoachPlans$2$coachDataDeferredList$1$1", f = "FBTPlanWizardViewModel.kt", l = {1818}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xw1.h f13589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f13591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<xw1.h> f13592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f13593g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xw1.h hVar, String str, h hVar2, List<xw1.h> list, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13589c = hVar;
            this.f13590d = str;
            this.f13591e = hVar2;
            this.f13592f = list;
            this.f13593g = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f13589c, this.f13590d, this.f13591e, this.f13592f, this.f13593g, dVar);
            aVar.f13588b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            xw1.i contentfulModel;
            o53.b0 b0Var = (o53.b0) this.f13588b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13587a;
            xw1.h hVar = this.f13589c;
            if (i14 == 0) {
                o13.r.b(obj);
                xw1.f coach = hVar.getCoach();
                String contentfulContentId = (coach == null || (contentfulModel = coach.getContentfulModel()) == null) ? null : contentfulModel.getContentfulContentId();
                if (contentfulContentId != null) {
                    fu1.k kVar = new fu1.k("coaches", new fu1.c(contentfulContentId, this.f13590d).a(), null, 4, null);
                    gu1.b bVar = this.f13591e.P;
                    this.f13588b = b0Var;
                    this.f13587a = 1;
                    bVar.getClass();
                    obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new gu1.g(kVar, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                hVar.e0(new com.garmin.android.apps.connectmobile.training.atp.biz.h.a((String) ((v2.b) v2Var).f47386a).a());
                this.f13592f.set(this.f13593g, hVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar2 = (v2.a) v2Var;
                String strI = u0.i(aVar2.f47384b, "getAtpCoachPlans: Error getting coach content - response ", " Error : ", aVar2.f47385c);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FBTPlanWizardViewModel", strI);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getAtpCoachPlans$2$coachVideoDeferredList$1$1", f = "FBTPlanWizardViewModel.kt", l = {1845}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xw1.h f13596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f13598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<xw1.h> f13599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f13600g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xw1.h hVar, String str, h hVar2, List<xw1.h> list, int i14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f13596c = hVar;
            this.f13597d = str;
            this.f13598e = hVar2;
            this.f13599f = list;
            this.f13600g = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f13596c, this.f13597d, this.f13598e, this.f13599f, this.f13600g, dVar);
            bVar.f13595b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f13595b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13594a;
            xw1.h hVar = this.f13596c;
            if (i14 == 0) {
                o13.r.b(obj);
                xw1.i iVar = hVar.getCom.google.android.exoplayer2.util.MimeTypes.BASE_TYPE_VIDEO java.lang.String();
                String contentfulContentId = iVar != null ? iVar.getContentfulContentId() : null;
                if (contentfulContentId != null) {
                    fu1.k kVar = new fu1.k("videos", new fu1.f(contentfulContentId, this.f13597d).a(), null, 4, null);
                    gu1.b bVar = this.f13598e.P;
                    this.f13595b = b0Var;
                    this.f13594a = 1;
                    bVar.getClass();
                    obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new gu1.g(kVar, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                this.f13599f.set(this.f13600g, xw1.h.b(hVar, new com.garmin.android.apps.connectmobile.training.atp.biz.d((String) ((v2.b) v2Var).f47386a).a()));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar2 = (v2.a) v2Var;
                String strI = u0.i(aVar2.f47384b, "getAtpCoachPlans: Error getting coach video content - response ", " Error : ", aVar2.f47385c);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FBTPlanWizardViewModel", strI);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h hVar, int i14, String str, Integer num, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f13583e = hVar;
        this.f13584f = i14;
        this.f13585g = str;
        this.f13586h = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f13583e, this.f13584f, this.f13585g, this.f13586h, dVar);
        xVar.f13582d = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<xw1.h>>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c A[LOOP:2: B:52:0x011e->B:56:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0176 A[LOOP:0: B:64:0x0168->B:68:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r9 == r2) goto L73;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strE;
        vt1.o oVar;
        Object objB5;
        jv1.s sVarI6;
        int i14;
        jv1.s sVarI7;
        Integer num;
        String str;
        Object objJ;
        String str2;
        hv1.j jVar;
        v2 v2Var;
        ArrayList arrayListD1;
        jv1.s sVarI8;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i15;
        String str3;
        int i16;
        fg0.k kVar;
        LocalDate date;
        ArrayList arrayList3;
        o13.p<LocalDate, LocalDate> pVarJ;
        List list;
        ArrayList arrayList4;
        int i17;
        List list2;
        int i18;
        o53.b0 b0Var = (o53.b0) this.f13582d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = this.f13581c;
        h hVar = this.f13583e;
        if (i19 == 0) {
            o13.r.b(obj);
            fy1.i.f73924a.getClass();
            strE = fy1.i.a.e();
            int i24 = h.S1;
            jv1.s sVarI9 = hVar.i6();
            if (sVarI9 == null || (oVar = sVarI9.f101125d) == null) {
                gu1.b bVar = hVar.P;
                sVarI6 = hVar.i6();
                if (sVarI6 != null || (jVar = sVarI6.f101143v) == null) {
                    i14 = hv1.j.ZERO.f85891c;
                } else {
                    i14 = jVar.f85891c;
                }
                Integer num2 = new Integer(i14);
                sVarI7 = hVar.i6();
                if (sVarI7 != null) {
                    num = sVarI7.f101144w;
                } else {
                    num = null;
                }
                this.f13582d = b0Var;
                this.f13579a = strE;
                this.f13581c = 2;
                bVar.getClass();
                str = strE;
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new gu1.e(bVar, this.f13584f, this.f13585g, this.f13586h, num2, num, str, null), this);
                if (objJ != aVar) {
                    str2 = str;
                    v2Var = (v2) objJ;
                    if (!(v2Var instanceof v2.b)) {
                        if (v2Var instanceof v2.a) {
                            return v2Var;
                        }
                        u0.r();
                        return null;
                    }
                    arrayListD1 = p13.h0.d1((Collection) ((v2.b) v2Var).f47386a);
                    int i25 = h.S1;
                    sVarI8 = hVar.i6();
                    if (sVarI8 != null) {
                        arrayList = arrayListD1;
                        arrayList = arrayListD1;
                        arrayList = arrayListD1;
                        arrayList3 = new ArrayList();
                        for (Object obj2 : arrayListD1) {
                            pVarJ = ((xw1.h) obj2).j();
                            if (tu1.a.o(date, pVarJ.f128594a, pVarJ.f128595b)) {
                                arrayList3.add(obj2);
                            }
                        }
                        arrayList = new ArrayList(arrayList3);
                    }
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    i15 = 0;
                    for (Object obj3 : arrayList) {
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        arrayList2.add(ge1.b.j(b0Var, null, null, new a((xw1.h) obj3, str2, this.f13583e, arrayList, i15, null), 3));
                        i15 = i16;
                    }
                    this.f13582d = b0Var;
                    this.f13579a = str2;
                    this.f13580b = arrayList;
                    this.f13581c = 3;
                    if (g8.i.o(arrayList2, this) != aVar) {
                        str3 = str2;
                        list = arrayList;
                        arrayList4 = new ArrayList(p13.y.r(list, 10));
                        i17 = 0;
                        for (Object obj4 : list) {
                            i18 = i17 + 1;
                            if (i17 >= 0) {
                                p13.x.q();
                                throw null;
                            }
                            arrayList4.add(ge1.b.j(b0Var, null, null, new b((xw1.h) obj4, str3, this.f13583e, list, i17, null), 3));
                            i17 = i18;
                        }
                        this.f13582d = null;
                        this.f13579a = null;
                        this.f13580b = list;
                        this.f13581c = 4;
                        if (g8.i.o(arrayList4, this) != aVar) {
                            list2 = list;
                            return new v2.b(list2, 200, null, null, 12, null);
                        }
                    }
                }
            } else {
                this.f13582d = b0Var;
                this.f13579a = strE;
                this.f13581c = 1;
                objB5 = h.b5(hVar, oVar, this);
            }
            return aVar;
        }
        if (i19 == 1) {
            strE = this.f13579a;
            o13.r.b(obj);
            objB5 = obj;
        } else {
            if (i19 == 2) {
                String str4 = this.f13579a;
                o13.r.b(obj);
                str2 = str4;
                objJ = obj;
                v2Var = (v2) objJ;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return v2Var;
                    }
                    u0.r();
                    return null;
                }
                arrayListD1 = p13.h0.d1((Collection) ((v2.b) v2Var).f47386a);
                int i26 = h.S1;
                sVarI8 = hVar.i6();
                if (sVarI8 != null && (kVar = sVarI8.f101124c) != null && (date = kVar.getDate()) != null) {
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList = arrayListD1;
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        pVarJ = ((xw1.h) obj2).j();
                        if (tu1.a.o(date, pVarJ.f128594a, pVarJ.f128595b)) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(arrayList3);
                }
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                i15 = 0;
                while (r9.hasNext()) {
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    arrayList2.add(ge1.b.j(b0Var, null, null, new a((xw1.h) obj3, str2, this.f13583e, arrayList, i15, null), 3));
                    i15 = i16;
                }
                this.f13582d = b0Var;
                this.f13579a = str2;
                this.f13580b = arrayList;
                this.f13581c = 3;
                if (g8.i.o(arrayList2, this) != aVar) {
                    str3 = str2;
                    list = arrayList;
                    arrayList4 = new ArrayList(p13.y.r(list, 10));
                    i17 = 0;
                    while (r4.hasNext()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            p13.x.q();
                            throw null;
                        }
                        arrayList4.add(ge1.b.j(b0Var, null, null, new b((xw1.h) obj4, str3, this.f13583e, list, i17, null), 3));
                        i17 = i18;
                    }
                    this.f13582d = null;
                    this.f13579a = null;
                    this.f13580b = list;
                    this.f13581c = 4;
                    if (g8.i.o(arrayList4, this) != aVar) {
                        list2 = list;
                    }
                }
                return aVar;
            }
            if (i19 == 3) {
                List list3 = this.f13580b;
                String str5 = this.f13579a;
                o13.r.b(obj);
                str3 = str5;
                list = list3;
                arrayList4 = new ArrayList(p13.y.r(list, 10));
                i17 = 0;
                while (r4.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    arrayList4.add(ge1.b.j(b0Var, null, null, new b((xw1.h) obj4, str3, this.f13583e, list, i17, null), 3));
                    i17 = i18;
                }
                this.f13582d = null;
                this.f13579a = null;
                this.f13580b = list;
                this.f13581c = 4;
                if (g8.i.o(arrayList4, this) != aVar) {
                    list2 = list;
                }
                return aVar;
            }
            if (i19 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list4 = this.f13580b;
            o13.r.b(obj);
            list2 = list4;
        }
        return new v2.b(list2, 200, null, null, 12, null);
        gu1.b bVar2 = hVar.P;
        sVarI6 = hVar.i6();
        if (sVarI6 != null) {
            i14 = hv1.j.ZERO.f85891c;
        } else {
            i14 = hv1.j.ZERO.f85891c;
        }
        Integer num3 = new Integer(i14);
        sVarI7 = hVar.i6();
        if (sVarI7 != null) {
            num = sVarI7.f101144w;
        } else {
            num = null;
        }
        this.f13582d = b0Var;
        this.f13579a = strE;
        this.f13581c = 2;
        bVar2.getClass();
        str = strE;
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new gu1.e(bVar2, this.f13584f, this.f13585g, this.f13586h, num3, num, str, null), this);
        if (objJ != aVar) {
            str2 = str;
            v2Var = (v2) objJ;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            arrayListD1 = p13.h0.d1((Collection) ((v2.b) v2Var).f47386a);
            int i27 = h.S1;
            sVarI8 = hVar.i6();
            if (sVarI8 != null) {
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList = arrayListD1;
                arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                    pVarJ = ((xw1.h) obj2).j();
                    if (tu1.a.o(date, pVarJ.f128594a, pVarJ.f128595b)) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList = new ArrayList(arrayList3);
            }
            arrayList = arrayListD1;
            arrayList = arrayListD1;
            arrayList = arrayListD1;
            arrayList = arrayListD1;
            arrayList = arrayListD1;
            arrayList = arrayListD1;
            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            i15 = 0;
            while (r9.hasNext()) {
                i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList2.add(ge1.b.j(b0Var, null, null, new a((xw1.h) obj3, str2, this.f13583e, arrayList, i15, null), 3));
                i15 = i16;
            }
            this.f13582d = b0Var;
            this.f13579a = str2;
            this.f13580b = arrayList;
            this.f13581c = 3;
            if (g8.i.o(arrayList2, this) != aVar) {
                str3 = str2;
                list = arrayList;
                arrayList4 = new ArrayList(p13.y.r(list, 10));
                i17 = 0;
                while (r4.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    arrayList4.add(ge1.b.j(b0Var, null, null, new b((xw1.h) obj4, str3, this.f13583e, list, i17, null), 3));
                    i17 = i18;
                }
                this.f13582d = null;
                this.f13579a = null;
                this.f13580b = list;
                this.f13581c = 4;
                if (g8.i.o(arrayList4, this) != aVar) {
                    list2 = list;
                    return new v2.b(list2, 200, null, null, 12, null);
                }
            }
        }
        return aVar;
    }
}
