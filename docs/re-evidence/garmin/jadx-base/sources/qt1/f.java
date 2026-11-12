package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$selectSearchResultItem$1", f = "GarminTrailsViewModel.kt", l = {440, 451, 459}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f147625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f147627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pt1.i f147628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt1.a f147629e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$selectSearchResultItem$1$1", f = "GarminTrailsViewModel.kt", l = {428}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qt1.a f147631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pt1.i f147632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qt1.a aVar, pt1.i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f147631b = aVar;
            this.f147632c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f147631b, this.f147632c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147630a;
            if (i14 == 0) {
                o13.r.b(obj);
                qt1.a aVar2 = this.f147631b;
                ss1.a aVar3 = aVar2.f147489b;
                b2 b2Var = aVar2.f147511z;
                qs1.r rVar = new qs1.r(((pt1.c) b2Var.f150540a.getValue()).f140821f.f140867a, ((pt1.c) b2Var.f150540a.getValue()).f140821f.f140868b, this.f147632c.f140858c);
                this.f147630a = 1;
                if (aVar3.p3(rVar, this) == aVar) {
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
    public f(pt1.i iVar, qt1.a aVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f147628d = iVar;
        this.f147629e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f147628d, this.f147629e, dVar);
        fVar.f147627c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        if (qt1.a.y4(r9, r1, r22) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [T, qs1.d] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p005kotlin.jvm.internal.r0 r0Var;
        T next;
        Object objC3;
        v2 v2Var;
        vs1.h hVar;
        pt1.k kVar;
        p2 p2Var;
        le2.d dVarA;
        Object value;
        p2 p2Var2;
        Object value2;
        qs1.d dVar;
        Iterator it;
        Object next2;
        Long curatedCourseId;
        p2 p2Var3;
        Object value3;
        pt1.c cVar;
        o53.b0 b0Var = (o53.b0) this.f147627c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147626b;
        pt1.i iVar = this.f147628d;
        qt1.a aVar2 = this.f147629e;
        if (i14 != 0) {
            if (i14 == 1) {
                r0Var = this.f147625a;
                o13.r.b(obj);
                objC3 = obj;
                v2Var = (v2) objC3;
                if (!(v2Var instanceof v2.b)) {
                    hVar = aVar2.f147492e;
                    kVar = new pt1.k(aVar2.f147488a.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f147627c = null;
                    this.f147625a = r0Var;
                    this.f147626b = 2;
                    if (hVar.a(kVar, this) != aVar) {
                    }
                    return aVar;
                }
                ?? r14 = ((qs1.s) ((v2.b) v2Var).f47386a).f147341a;
                r0Var.f105810a = r14;
                lt1.b bVar = lt1.b.f114858a;
                Context context = aVar2.f147488a;
                p2Var = aVar2.f147496i;
                dVarA = lt1.b.a(bVar, context, r14, null, qt1.a.B4((List) p2Var.getValue()), 4);
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, p13.h0.D0((List) value, r0Var.f105810a)));
                p2Var2 = aVar2.f147497j;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, p13.h0.D0((List) value2, dVarA)));
                dVar = (qs1.d) r0Var.f105810a;
                if (dVar != null) {
                    int i15 = qt1.a.I;
                    aVar2.D4(null);
                    it = ((Iterable) aVar2.f147497j.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        long j8 = ((le2.d) next2).f112062a;
                        curatedCourseId = dVar.getCuratedCourseId();
                        if (curatedCourseId != null) {
                            break;
                            break;
                        }
                    }
                    List listL = p13.x.l(next2);
                    this.f147627c = null;
                    this.f147625a = null;
                    this.f147626b = 3;
                }
            } else if (i14 == 2) {
                r0Var = this.f147625a;
                o13.r.b(obj);
                dVar = (qs1.d) r0Var.f105810a;
                if (dVar != null) {
                    int i16 = qt1.a.I;
                    aVar2.D4(null);
                    it = ((Iterable) aVar2.f147497j.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        long j14 = ((le2.d) next2).f112062a;
                        curatedCourseId = dVar.getCuratedCourseId();
                        if (curatedCourseId != null && j14 == curatedCourseId.longValue()) {
                            break;
                        }
                    }
                    List listL2 = p13.x.l(next2);
                    this.f147627c = null;
                    this.f147625a = null;
                    this.f147626b = 3;
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            p2Var3 = aVar2.f147503p;
            do {
                value3 = p2Var3.getValue();
                cVar = (pt1.c) value3;
            } while (!p2Var3.b(value3, pt1.c.a(cVar, false, false, false, null, null, pt1.j.a(cVar.f140821f, iVar.f140856a, j53.l.b(), null, 10), false, false, 479)));
            aVar2.G4(false);
        } else {
            o13.r.b(obj);
            ge1.b.T(b0Var, null, null, new a(aVar2, iVar, null), 3);
            us1.f fVar = iVar.f140859d;
            String str = iVar.f140856a;
            Long l14 = iVar.f140863h;
            if (fVar == us1.f.f172389e && l14 != null) {
                r0Var = new p005kotlin.jvm.internal.r0();
                Iterator it3 = ((Iterable) aVar2.f147496i.getValue()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it3.next();
                    Long curatedCourseId2 = ((qs1.d) next).getCuratedCourseId();
                    long jLongValue = l14.longValue();
                    if (curatedCourseId2 != null && curatedCourseId2.longValue() == jLongValue) {
                        break;
                    }
                }
                r0Var.f105810a = next;
                if (next == 0) {
                    aVar2.G4(true);
                    ss1.a aVar3 = aVar2.f147489b;
                    long jLongValue2 = l14.longValue();
                    this.f147627c = null;
                    this.f147625a = r0Var;
                    this.f147626b = 1;
                    objC3 = aVar3.c3(jLongValue2, this);
                    if (objC3 != aVar) {
                        v2Var = (v2) objC3;
                        if (!(v2Var instanceof v2.b)) {
                            ?? r15 = ((qs1.s) ((v2.b) v2Var).f47386a).f147341a;
                            r0Var.f105810a = r15;
                            lt1.b bVar2 = lt1.b.f114858a;
                            Context context2 = aVar2.f147488a;
                            p2Var = aVar2.f147496i;
                            dVarA = lt1.b.a(bVar2, context2, r15, null, qt1.a.B4((List) p2Var.getValue()), 4);
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, p13.h0.D0((List) value, r0Var.f105810a)));
                            p2Var2 = aVar2.f147497j;
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, p13.h0.D0((List) value2, dVarA)));
                        } else {
                            hVar = aVar2.f147492e;
                            kVar = new pt1.k(aVar2.f147488a.getString(R.string.txt_error_occurred), null, null, 6, null);
                            this.f147627c = null;
                            this.f147625a = r0Var;
                            this.f147626b = 2;
                            if (hVar.a(kVar, this) != aVar) {
                            }
                        }
                        dVar = (qs1.d) r0Var.f105810a;
                        if (dVar != null) {
                            int i17 = qt1.a.I;
                            aVar2.D4(null);
                            it = ((Iterable) aVar2.f147497j.getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                long j15 = ((le2.d) next2).f112062a;
                                curatedCourseId = dVar.getCuratedCourseId();
                                if (curatedCourseId != null) {
                                    break;
                                    break;
                                }
                            }
                            List listL3 = p13.x.l(next2);
                            this.f147627c = null;
                            this.f147625a = null;
                            this.f147626b = 3;
                        }
                        p2Var3 = aVar2.f147503p;
                        do {
                            value3 = p2Var3.getValue();
                            cVar = (pt1.c) value3;
                        } while (!p2Var3.b(value3, pt1.c.a(cVar, false, false, false, null, null, pt1.j.a(cVar.f140821f, iVar.f140856a, j53.l.b(), null, 10), false, false, 479)));
                        aVar2.G4(false);
                    }
                } else {
                    dVar = (qs1.d) r0Var.f105810a;
                    if (dVar != null) {
                        int i18 = qt1.a.I;
                        aVar2.D4(null);
                        it = ((Iterable) aVar2.f147497j.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            long j16 = ((le2.d) next2).f112062a;
                            curatedCourseId = dVar.getCuratedCourseId();
                            if (curatedCourseId != null) {
                                break;
                                break;
                            }
                        }
                        List listL4 = p13.x.l(next2);
                        this.f147627c = null;
                        this.f147625a = null;
                        this.f147626b = 3;
                    }
                    p2Var3 = aVar2.f147503p;
                    do {
                        value3 = p2Var3.getValue();
                        cVar = (pt1.c) value3;
                    } while (!p2Var3.b(value3, pt1.c.a(cVar, false, false, false, null, null, pt1.j.a(cVar.f140821f, iVar.f140856a, j53.l.b(), null, 10), false, false, 479)));
                    aVar2.G4(false);
                }
                return aVar;
            }
            le2.a aVar4 = iVar.f140862g;
            aVar4.getClass();
            ke2.b bVar3 = aVar4.f112052a;
            Double dValueOf = Double.valueOf(bVar3.f104551a);
            ke2.b bVar4 = aVar4.f112053b;
            ke2.a aVar5 = new ke2.a(dValueOf, Double.valueOf(bVar4.f104551a), Double.valueOf(bVar3.f104552b), Double.valueOf(bVar4.f104552b));
            Double northLatitude = aVar5.getNorthLatitude();
            double dDoubleValue = northLatitude != null ? northLatitude.doubleValue() : 0.0d;
            Double southLatitude = aVar5.getSouthLatitude();
            double dAbs = Math.abs(dDoubleValue - (southLatitude != null ? southLatitude.doubleValue() : 0.0d)) * 1.1d;
            Double northLatitude2 = aVar5.getNorthLatitude();
            ke2.a aVarB = ke2.a.b(aVar5, new Double((northLatitude2 != null ? northLatitude2.doubleValue() : 0.0d) - dAbs));
            Double northLatitude3 = aVarB.getNorthLatitude();
            double dDoubleValue2 = northLatitude3 != null ? northLatitude3.doubleValue() : 0.0d;
            Double eastLongitude = aVarB.getEastLongitude();
            ke2.b bVar5 = new ke2.b(dDoubleValue2, eastLongitude != null ? eastLongitude.doubleValue() : 0.0d, null, 4, null);
            Double southLatitude2 = aVarB.getSouthLatitude();
            double dDoubleValue3 = southLatitude2 != null ? southLatitude2.doubleValue() : 0.0d;
            Double westLongitude = aVarB.getWestLongitude();
            le2.a aVar6 = new le2.a(bVar5, new ke2.b(dDoubleValue3, westLongitude != null ? westLongitude.doubleValue() : 0.0d, null, 4, null));
            p2 p2Var4 = aVar2.f147503p;
            while (true) {
                Object value4 = p2Var4.getValue();
                pt1.c cVar2 = (pt1.c) value4;
                pt1.j jVar = cVar2.f140821f;
                j53.j jVarB = j53.l.b();
                String str2 = iVar.f140857b;
                String str3 = iVar.f140858c;
                us1.f fVar2 = iVar.f140859d;
                String str4 = iVar.f140860e;
                String str5 = iVar.f140861f;
                Long l15 = iVar.f140863h;
                String str6 = iVar.f140864i;
                String str7 = iVar.f140865j;
                String str8 = iVar.f140866k;
                str.getClass();
                str2.getClass();
                str3.getClass();
                fVar2.getClass();
                str4.getClass();
                str5.getClass();
                le2.a aVar7 = aVar6;
                if (p2Var4.b(value4, pt1.c.a(cVar2, false, false, false, null, null, pt1.j.a(jVar, str, jVarB, new pt1.i(str, str2, str3, fVar2, str4, str5, aVar7, l15, str6, str7, str8), 2), false, false, 479))) {
                    break;
                }
                aVar6 = aVar7;
            }
        }
        return Unit.INSTANCE;
    }
}
