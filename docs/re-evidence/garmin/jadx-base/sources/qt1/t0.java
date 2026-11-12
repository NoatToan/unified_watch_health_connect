package qt1;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.identity.intents.AddressConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$submitTrailReview$1", f = "TrailDetailsViewModel.kt", l = {516, 519, 532, 537, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 565}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pt1.l f147785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f147786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f147787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f147789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pt1.l f147790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f147791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f147792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(k kVar, pt1.l lVar, Context context, e23.a<Unit> aVar, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f147789e = kVar;
        this.f147790f = lVar;
        this.f147791g = context;
        this.f147792h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f147789e, this.f147790f, this.f147791g, this.f147792h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0300  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x019e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x024a A[PHI: r0 r1 r3 r4 r15
      0x024a: PHI (r0v42 java.lang.Object) = (r0v34 java.lang.Object), (r0v48 java.lang.Object) binds: [B:71:0x0246, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r1v17 long) = (r1v15 long), (r1v19 long) binds: [B:71:0x0246, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r3v8 pt1.l) = (r3v6 pt1.l), (r3v13 pt1.l) binds: [B:71:0x0246, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r4v9 boolean) = (r4v8 boolean), (r4v10 boolean) binds: [B:71:0x0246, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r15v10 qt1.k) = (r15v8 qt1.k), (r15v11 qt1.k) binds: [B:71:0x0246, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0254  */
    /* JADX WARN: Code duplicated, block: B:79:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0297  */
    /* JADX WARN: Code duplicated, block: B:85:0x029c  */
    /* JADX WARN: Code duplicated, block: B:86:0x029f  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e3  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fb, code lost:
    
        if (r15.K4(r12, r65) == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x035f, code lost:
    
        if (r15.K4(r12, r65) == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0293, code lost:
    
        if (r0.a(r3, r65) == r6) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objS0;
        pt1.l lVar;
        Long curatedCourseId;
        v2 v2Var;
        k kVar;
        v2.a aVar;
        Integer num;
        p2 p2Var;
        Object value2;
        p2 p2Var2;
        Object value3;
        long jLongValue;
        Object objD4;
        long j8;
        pt1.l lVar2;
        boolean zBooleanValue;
        p2 p2Var3;
        Object value4;
        qs1.d dVar;
        k kVar2;
        Object objA4;
        Long curatedCourseId2;
        boolean zBooleanValue2;
        p2 p2Var4;
        Object value5;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147788d;
        Context context = this.f147791g;
        k kVar3 = this.f147789e;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                kVar3.Q4(true);
                p2 p2Var5 = kVar3.f147674i;
                do {
                    value = p2Var5.getValue();
                } while (!p2Var5.b(value, pt1.l.a(this.f147790f, 0L, null, 0, 0L, null, null, false, null, null, null, null, false, 16383)));
                pt1.l lVarA = this.f147790f;
                long jLongValue2 = -1;
                if (lVarA.f140874a == -1) {
                    qs1.d dVar2 = kVar3.f147672g;
                    if (dVar2 != null && (curatedCourseId = dVar2.getCuratedCourseId()) != null) {
                        jLongValue2 = curatedCourseId.longValue();
                    }
                    lVarA = pt1.l.a(lVarA, jLongValue2, null, 0, 0L, null, null, false, null, null, null, null, false, 32766);
                }
                vs1.x xVar = kVar3.f147669d;
                this.f147785a = lVarA;
                this.f147788d = 1;
                ss1.a0 a0Var = xVar.f179921a;
                long j14 = lVarA.f140874a;
                boolean z14 = lVarA.f140882i;
                int i15 = lVarA.f140878e;
                long j15 = lVarA.f140879f;
                Long l14 = lVarA.f140875b;
                String str = lVarA.f140881h;
                i53.c<us1.g> cVar = lVarA.f140884k;
                if (cVar != null) {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(cVar, 10));
                    Iterator<us1.g> it = cVar.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().f172401a);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                i53.c<us1.i> cVar2 = lVarA.f140885l;
                if (cVar2 != null) {
                    ArrayList arrayList4 = new ArrayList(p13.y.r(cVar2, 10));
                    Iterator<us1.i> it3 = cVar2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().f172417a);
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                us1.h hVar = lVarA.f140883j;
                objS0 = a0Var.S0(new qs1.u(new Long(j14), Boolean.valueOf(z14), new Long(j15), null, l14, str, new Integer(i15), hVar != null ? new Integer(hVar.f172407a) : null, arrayList2, false, null, null, arrayList, null, null, null, null, null, 257544, null), this);
                if (objS0 != aVar2) {
                    lVar = lVarA;
                    v2Var = (v2) objS0;
                    if (v2Var instanceof v2.b) {
                        kVar = kVar3;
                        if (v2Var instanceof v2.a) {
                            aVar = (v2.a) v2Var;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            num = aVar.f47384b;
                        } else {
                            num = null;
                        }
                        if (num != null || num.intValue() != 400) {
                            if (num != null && num.intValue() == 409) {
                                kVar.I4();
                                this.f147785a = null;
                                this.f147788d = 5;
                                break;
                            } else {
                                if (num == null && num.intValue() == 429) {
                                    p2Var = kVar.f147673h;
                                    do {
                                        value2 = p2Var.getValue();
                                    } while (!p2Var.b(value2, pt1.o.a((pt1.o) value2, false, null, true, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741807)));
                                } else {
                                    this.f147785a = null;
                                    this.f147788d = 6;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        p2Var2 = kVar.f147674i;
                        do {
                            value3 = p2Var2.getValue();
                        } while (!p2Var2.b(value3, pt1.l.a((pt1.l) value3, 0L, null, 0, 0L, null, null, false, null, null, null, null, true, 16383)));
                        kVar.Q4(false);
                        return Unit.INSTANCE;
                    }
                    jLongValue = ((Number) ((v2.b) v2Var).f47386a).longValue();
                    i53.c<pt1.u> cVar3 = lVar.f140886m;
                    this.f147785a = lVar;
                    this.f147786b = jLongValue;
                    this.f147788d = 2;
                    objD4 = k.D4(this.f147789e, this.f147791g, jLongValue, cVar3, this);
                    if (objD4 != aVar2) {
                        j8 = jLongValue;
                        lVar2 = lVar;
                        zBooleanValue = ((Boolean) objD4).booleanValue();
                        if (zBooleanValue) {
                            kVar3.I4();
                        } else {
                            p2Var3 = kVar3.f147674i;
                            do {
                                value4 = p2Var3.getValue();
                            } while (!p2Var3.b(value4, pt1.l.a((pt1.l) value4, 0L, new Long(j8), 0, 0L, null, null, false, null, null, null, null, false, 32763)));
                            ge1.b.T(v1.a(kVar3), null, null, new q0(kVar3, null), 3);
                        }
                        kVar3.Q4(false);
                        dVar = kVar3.f147672g;
                        if (dVar != null) {
                            long j16 = lVar2.f140874a;
                            curatedCourseId2 = dVar.getCuratedCourseId();
                            if (curatedCourseId2 == null && j16 == curatedCourseId2.longValue()) {
                                vs1.l lVar3 = kVar3.f147683r;
                                Set<Long> set = kVar3.f147684t.f179847f;
                                lVar3.getClass();
                                context.getClass();
                                set.getClass();
                                us1.e eVar = us1.e.CHRONOLOGICAL;
                                eVar.getClass();
                                kVar2 = kVar3;
                                ge1.b.T(lVar3.f179848a, null, null, new vs1.n(lVar3, eVar, context, set, null), 3);
                                w9.a aVarA = v1.a(kVar2);
                                x53.c cVar4 = o53.s0.f129406a;
                                ge1.b.T(aVarA, x53.b.f189152a, null, new h0(kVar2, context, null), 2);
                            } else {
                                kVar2 = kVar3;
                            }
                        } else {
                            kVar2 = kVar3;
                        }
                        this.f147785a = lVar2;
                        this.f147786b = j8;
                        this.f147787c = zBooleanValue;
                        this.f147788d = 3;
                        objA4 = k.A4(kVar2, context, this);
                        if (objA4 != aVar2) {
                            zBooleanValue2 = ((Boolean) objA4).booleanValue();
                            if (lVar2.f140875b != null) {
                                p2Var4 = kVar2.f147670e.f179871a;
                                do {
                                    value5 = p2Var4.getValue();
                                    ((Boolean) value5).getClass();
                                } while (!p2Var4.b(value5, Boolean.TRUE));
                            }
                            if (!zBooleanValue2 && zBooleanValue) {
                                vs1.h hVar2 = kVar2.f147668c;
                                pt1.k kVar4 = new pt1.k(context.getString(R.string.trail_review_submitted_message_redirect), context.getString(R.string.trail_review_go_to_my_reviews), this.f147792h);
                                this.f147785a = null;
                                this.f147786b = j8;
                                this.f147787c = zBooleanValue;
                                this.f147788d = 4;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar2;
            case 1:
                pt1.l lVar4 = this.f147785a;
                o13.r.b(obj);
                lVar = lVar4;
                objS0 = obj;
                v2Var = (v2) objS0;
                if (v2Var instanceof v2.b) {
                    kVar = kVar3;
                    if (v2Var instanceof v2.a) {
                        aVar = (v2.a) v2Var;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        num = aVar.f47384b;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (num != null) {
                            kVar.I4();
                            this.f147785a = null;
                            this.f147788d = 5;
                        } else {
                            if (num == null) {
                                this.f147785a = null;
                                this.f147788d = 6;
                            } else {
                                p2Var = kVar.f147673h;
                                do {
                                    value2 = p2Var.getValue();
                                } while (!p2Var.b(value2, pt1.o.a((pt1.o) value2, false, null, true, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741807)));
                            }
                            kVar.Q4(false);
                        }
                        break;
                    } else {
                        p2Var2 = kVar.f147674i;
                        do {
                            value3 = p2Var2.getValue();
                        } while (!p2Var2.b(value3, pt1.l.a((pt1.l) value3, 0L, null, 0, 0L, null, null, false, null, null, null, null, true, 16383)));
                        kVar.Q4(false);
                    }
                    return Unit.INSTANCE;
                }
                jLongValue = ((Number) ((v2.b) v2Var).f47386a).longValue();
                i53.c<pt1.u> cVar5 = lVar.f140886m;
                this.f147785a = lVar;
                this.f147786b = jLongValue;
                this.f147788d = 2;
                objD4 = k.D4(this.f147789e, this.f147791g, jLongValue, cVar5, this);
                if (objD4 != aVar2) {
                    j8 = jLongValue;
                    lVar2 = lVar;
                    zBooleanValue = ((Boolean) objD4).booleanValue();
                    if (zBooleanValue) {
                        kVar3.I4();
                    } else {
                        p2Var3 = kVar3.f147674i;
                        do {
                            value4 = p2Var3.getValue();
                        } while (!p2Var3.b(value4, pt1.l.a((pt1.l) value4, 0L, new Long(j8), 0, 0L, null, null, false, null, null, null, null, false, 32763)));
                        ge1.b.T(v1.a(kVar3), null, null, new q0(kVar3, null), 3);
                    }
                    kVar3.Q4(false);
                    dVar = kVar3.f147672g;
                    if (dVar != null) {
                        long j17 = lVar2.f140874a;
                        curatedCourseId2 = dVar.getCuratedCourseId();
                        if (curatedCourseId2 == null) {
                            kVar2 = kVar3;
                        } else {
                            vs1.l lVar5 = kVar3.f147683r;
                            Set<Long> set2 = kVar3.f147684t.f179847f;
                            lVar5.getClass();
                            context.getClass();
                            set2.getClass();
                            us1.e eVar2 = us1.e.CHRONOLOGICAL;
                            eVar2.getClass();
                            kVar2 = kVar3;
                            ge1.b.T(lVar5.f179848a, null, null, new vs1.n(lVar5, eVar2, context, set2, null), 3);
                            w9.a aVarA2 = v1.a(kVar2);
                            x53.c cVar6 = o53.s0.f129406a;
                            ge1.b.T(aVarA2, x53.b.f189152a, null, new h0(kVar2, context, null), 2);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                    this.f147785a = lVar2;
                    this.f147786b = j8;
                    this.f147787c = zBooleanValue;
                    this.f147788d = 3;
                    objA4 = k.A4(kVar2, context, this);
                    if (objA4 != aVar2) {
                        zBooleanValue2 = ((Boolean) objA4).booleanValue();
                        if (lVar2.f140875b != null) {
                            p2Var4 = kVar2.f147670e.f179871a;
                            do {
                                value5 = p2Var4.getValue();
                                ((Boolean) value5).getClass();
                            } while (!p2Var4.b(value5, Boolean.TRUE));
                        }
                        if (!zBooleanValue2) {
                            vs1.h hVar3 = kVar2.f147668c;
                            pt1.k kVar5 = new pt1.k(context.getString(R.string.trail_review_submitted_message_redirect), context.getString(R.string.trail_review_go_to_my_reviews), this.f147792h);
                            this.f147785a = null;
                            this.f147786b = j8;
                            this.f147787c = zBooleanValue;
                            this.f147788d = 4;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar2;
            case 2:
                long j18 = this.f147786b;
                pt1.l lVar6 = this.f147785a;
                o13.r.b(obj);
                lVar2 = lVar6;
                j8 = j18;
                objD4 = obj;
                zBooleanValue = ((Boolean) objD4).booleanValue();
                if (zBooleanValue) {
                    kVar3.I4();
                } else {
                    p2Var3 = kVar3.f147674i;
                    do {
                        value4 = p2Var3.getValue();
                    } while (!p2Var3.b(value4, pt1.l.a((pt1.l) value4, 0L, new Long(j8), 0, 0L, null, null, false, null, null, null, null, false, 32763)));
                    ge1.b.T(v1.a(kVar3), null, null, new q0(kVar3, null), 3);
                }
                kVar3.Q4(false);
                dVar = kVar3.f147672g;
                if (dVar != null) {
                    long j19 = lVar2.f140874a;
                    curatedCourseId2 = dVar.getCuratedCourseId();
                    if (curatedCourseId2 == null) {
                        kVar2 = kVar3;
                    } else {
                        vs1.l lVar7 = kVar3.f147683r;
                        Set<Long> set3 = kVar3.f147684t.f179847f;
                        lVar7.getClass();
                        context.getClass();
                        set3.getClass();
                        us1.e eVar3 = us1.e.CHRONOLOGICAL;
                        eVar3.getClass();
                        kVar2 = kVar3;
                        ge1.b.T(lVar7.f179848a, null, null, new vs1.n(lVar7, eVar3, context, set3, null), 3);
                        w9.a aVarA3 = v1.a(kVar2);
                        x53.c cVar7 = o53.s0.f129406a;
                        ge1.b.T(aVarA3, x53.b.f189152a, null, new h0(kVar2, context, null), 2);
                    }
                } else {
                    kVar2 = kVar3;
                }
                this.f147785a = lVar2;
                this.f147786b = j8;
                this.f147787c = zBooleanValue;
                this.f147788d = 3;
                objA4 = k.A4(kVar2, context, this);
                if (objA4 != aVar2) {
                    zBooleanValue2 = ((Boolean) objA4).booleanValue();
                    if (lVar2.f140875b != null) {
                        p2Var4 = kVar2.f147670e.f179871a;
                        do {
                            value5 = p2Var4.getValue();
                            ((Boolean) value5).getClass();
                        } while (!p2Var4.b(value5, Boolean.TRUE));
                    }
                    if (!zBooleanValue2) {
                        vs1.h hVar4 = kVar2.f147668c;
                        pt1.k kVar6 = new pt1.k(context.getString(R.string.trail_review_submitted_message_redirect), context.getString(R.string.trail_review_go_to_my_reviews), this.f147792h);
                        this.f147785a = null;
                        this.f147786b = j8;
                        this.f147787c = zBooleanValue;
                        this.f147788d = 4;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar2;
            case 3:
                boolean z15 = this.f147787c;
                j8 = this.f147786b;
                lVar2 = this.f147785a;
                o13.r.b(obj);
                zBooleanValue = z15;
                kVar2 = kVar3;
                objA4 = obj;
                zBooleanValue2 = ((Boolean) objA4).booleanValue();
                if (lVar2.f140875b != null) {
                    p2Var4 = kVar2.f147670e.f179871a;
                    do {
                        value5 = p2Var4.getValue();
                        ((Boolean) value5).getClass();
                    } while (!p2Var4.b(value5, Boolean.TRUE));
                }
                if (!zBooleanValue2) {
                    vs1.h hVar5 = kVar2.f147668c;
                    pt1.k kVar7 = new pt1.k(context.getString(R.string.trail_review_submitted_message_redirect), context.getString(R.string.trail_review_go_to_my_reviews), this.f147792h);
                    this.f147785a = null;
                    this.f147786b = j8;
                    this.f147787c = zBooleanValue;
                    this.f147788d = 4;
                    break;
                }
                return Unit.INSTANCE;
            case 4:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 5:
            case 6:
                o13.r.b(obj);
                kVar = kVar3;
                kVar.Q4(false);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
