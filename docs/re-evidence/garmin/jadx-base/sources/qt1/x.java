package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$editReview$1", f = "TrailDetailsViewModel.kt", l = {654, 663, 666, 668, 671, 678, 684}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f147825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f147826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pt1.x f147827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pt1.l f147828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f147829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f147830h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k kVar, pt1.x xVar, pt1.l lVar, Context context, e23.a<Unit> aVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f147826d = kVar;
        this.f147827e = xVar;
        this.f147828f = lVar;
        this.f147829g = context;
        this.f147830h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f147826d, this.f147827e, this.f147828f, this.f147829g, this.f147830h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8 A[LOOP:0: B:21:0x00c2->B:23:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4 A[LOOP:1: B:29:0x00ee->B:31:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x017d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0194  */
    /* JADX WARN: Code duplicated, block: B:54:0x019e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x020c  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0241, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r6) goto L77;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i14;
        int i15;
        i53.c<us1.g> cVar;
        ArrayList arrayList;
        i53.c<us1.i> cVar2;
        ArrayList arrayList2;
        us1.h hVar;
        Integer num;
        Object objB0;
        int i16;
        int i17;
        ArrayList arrayList3;
        Iterator<us1.i> it;
        ArrayList arrayList4;
        Iterator<us1.g> it3;
        v2 v2Var;
        int i18;
        int i19;
        Integer num2;
        int i24;
        pt1.x xVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i25 = this.f147825c;
        pt1.x xVar2 = this.f147827e;
        k kVar = this.f147826d;
        switch (i25) {
            case 0:
                o13.r.b(obj);
                p2 p2Var = kVar.f147674i;
                pt1.l lVarA = pt1.l.a((pt1.l) p2Var.getValue(), 0L, null, 0, 0L, null, null, false, null, null, null, null, false, 16383);
                this.f147825c = 1;
                p2Var.k(null, lVarA);
                if (Unit.INSTANCE != aVar) {
                    kVar.Q4(true);
                    if (xVar2 != null) {
                        i14 = 0;
                        i15 = 0;
                        if (i15 == 0) {
                            kVar.Q4(false);
                            if (i14 == 0) {
                                p2 p2Var2 = kVar.f147674i;
                                pt1.l lVar = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                this.f147823a = i15;
                                this.f147824b = i14;
                                this.f147825c = 7;
                                p2Var2.k(null, lVar);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    vs1.g gVar = kVar.f147681p;
                    long j8 = xVar2.f141004a;
                    pt1.l lVar2 = this.f147828f;
                    long j14 = lVar2.f140879f;
                    this.f147823a = 0;
                    this.f147824b = 0;
                    this.f147825c = 2;
                    ss1.a0 a0Var = gVar.f179795b;
                    long j15 = lVar2.f140874a;
                    boolean z14 = lVar2.f140882i;
                    int i26 = lVar2.f140878e;
                    Long l14 = lVar2.f140875b;
                    String str = lVar2.f140881h;
                    cVar = lVar2.f140884k;
                    if (cVar != null) {
                        arrayList4 = new ArrayList(p13.y.r(cVar, 10));
                        it3 = cVar.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(it3.next().f172401a);
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    cVar2 = lVar2.f140885l;
                    if (cVar2 != null) {
                        arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
                        it = cVar2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next().f172417a);
                        }
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = null;
                    }
                    hVar = lVar2.f140883j;
                    if (hVar != null) {
                        num = new Integer(hVar.f172407a);
                    } else {
                        num = null;
                    }
                    objB0 = a0Var.B0(j8, new qs1.u(new Long(j15), Boolean.valueOf(z14), new Long(j14), null, l14, str, new Integer(i26), num, arrayList2, false, null, null, arrayList, new Long(j8), null, null, null, null, 249352, null), this);
                    if (objB0 != aVar) {
                        i16 = 0;
                        i17 = 0;
                        v2Var = (v2) objB0;
                        if (v2Var instanceof v2.b) {
                            this.f147823a = i16;
                            this.f147824b = i17;
                            this.f147825c = 3;
                            if (k.z4(this.f147826d, this.f147829g, this.f147827e, this.f147828f, this.f147830h, this) != aVar) {
                                i14 = i17;
                                p2 p2Var3 = kVar.f147679n;
                                Boolean bool = Boolean.TRUE;
                                this.f147823a = 1;
                                this.f147824b = i14;
                                this.f147825c = 4;
                                p2Var3.k(null, bool);
                                if (Unit.INSTANCE != aVar) {
                                    i15 = 1;
                                    xVar = xVar2;
                                    kVar.F4(xVar.f141004a);
                                    if (i15 == 0) {
                                        kVar.Q4(false);
                                        if (i14 == 0) {
                                            p2 p2Var4 = kVar.f147674i;
                                            pt1.l lVar3 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                            this.f147823a = i15;
                                            this.f147824b = i14;
                                            this.f147825c = 7;
                                            p2Var4.k(null, lVar3);
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            i18 = 1;
                            if ((v2Var instanceof v2.a) || (num2 = ((v2.a) v2Var).f47384b) == null || num2.intValue() != 400) {
                                this.f147823a = i16;
                                this.f147824b = i17;
                                this.f147825c = 6;
                                if (kVar.K4(this.f147829g, this) != aVar) {
                                    i19 = i17;
                                    i14 = i19;
                                    i15 = i16;
                                    if (i15 == 0) {
                                        kVar.Q4(false);
                                        if (i14 == 0) {
                                            p2 p2Var5 = kVar.f147674i;
                                            pt1.l lVar4 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                            this.f147823a = i15;
                                            this.f147824b = i14;
                                            this.f147825c = 7;
                                            p2Var5.k(null, lVar4);
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                p2 p2Var6 = kVar.f147674i;
                                pt1.l lVarA2 = pt1.l.a((pt1.l) p2Var6.getValue(), 0L, null, 0, 0L, null, null, false, null, null, null, null, true, 16383);
                                this.f147823a = i16;
                                this.f147824b = i17;
                                this.f147825c = 5;
                                p2Var6.k(null, lVarA2);
                                if (Unit.INSTANCE != aVar) {
                                    i24 = i16;
                                    i15 = i24;
                                    i14 = i18;
                                    if (i15 == 0) {
                                        kVar.Q4(false);
                                        if (i14 == 0) {
                                            p2 p2Var7 = kVar.f147674i;
                                            pt1.l lVar5 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                            this.f147823a = i15;
                                            this.f147824b = i14;
                                            this.f147825c = 7;
                                            p2Var7.k(null, lVar5);
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                kVar.Q4(true);
                if (xVar2 != null) {
                    i14 = 0;
                    i15 = 0;
                    if (i15 == 0) {
                        kVar.Q4(false);
                        if (i14 == 0) {
                            p2 p2Var8 = kVar.f147674i;
                            pt1.l lVar6 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                            this.f147823a = i15;
                            this.f147824b = i14;
                            this.f147825c = 7;
                            p2Var8.k(null, lVar6);
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                vs1.g gVar2 = kVar.f147681p;
                long j16 = xVar2.f141004a;
                pt1.l lVar7 = this.f147828f;
                long j17 = lVar7.f140879f;
                this.f147823a = 0;
                this.f147824b = 0;
                this.f147825c = 2;
                ss1.a0 a0Var2 = gVar2.f179795b;
                long j18 = lVar7.f140874a;
                boolean z15 = lVar7.f140882i;
                int i27 = lVar7.f140878e;
                Long l15 = lVar7.f140875b;
                String str2 = lVar7.f140881h;
                cVar = lVar7.f140884k;
                if (cVar != null) {
                    arrayList4 = new ArrayList(p13.y.r(cVar, 10));
                    it3 = cVar.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().f172401a);
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                cVar2 = lVar7.f140885l;
                if (cVar2 != null) {
                    arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
                    it = cVar2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().f172417a);
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                hVar = lVar7.f140883j;
                if (hVar != null) {
                    num = new Integer(hVar.f172407a);
                } else {
                    num = null;
                }
                objB0 = a0Var2.B0(j16, new qs1.u(new Long(j18), Boolean.valueOf(z15), new Long(j17), null, l15, str2, new Integer(i27), num, arrayList2, false, null, null, arrayList, new Long(j16), null, null, null, null, 249352, null), this);
                if (objB0 != aVar) {
                    i16 = 0;
                    i17 = 0;
                    v2Var = (v2) objB0;
                    if (v2Var instanceof v2.b) {
                        this.f147823a = i16;
                        this.f147824b = i17;
                        this.f147825c = 3;
                        if (k.z4(this.f147826d, this.f147829g, this.f147827e, this.f147828f, this.f147830h, this) != aVar) {
                            i14 = i17;
                            p2 p2Var9 = kVar.f147679n;
                            Boolean bool2 = Boolean.TRUE;
                            this.f147823a = 1;
                            this.f147824b = i14;
                            this.f147825c = 4;
                            p2Var9.k(null, bool2);
                            if (Unit.INSTANCE != aVar) {
                                i15 = 1;
                                xVar = xVar2;
                                kVar.F4(xVar.f141004a);
                                if (i15 == 0) {
                                    kVar.Q4(false);
                                    if (i14 == 0) {
                                        p2 p2Var10 = kVar.f147674i;
                                        pt1.l lVar8 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                        this.f147823a = i15;
                                        this.f147824b = i14;
                                        this.f147825c = 7;
                                        p2Var10.k(null, lVar8);
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        i18 = 1;
                        if (v2Var instanceof v2.a) {
                            this.f147823a = i16;
                            this.f147824b = i17;
                            this.f147825c = 6;
                            if (kVar.K4(this.f147829g, this) != aVar) {
                                i19 = i17;
                                i14 = i19;
                                i15 = i16;
                                if (i15 == 0) {
                                    kVar.Q4(false);
                                    if (i14 == 0) {
                                        p2 p2Var11 = kVar.f147674i;
                                        pt1.l lVar9 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                        this.f147823a = i15;
                                        this.f147824b = i14;
                                        this.f147825c = 7;
                                        p2Var11.k(null, lVar9);
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            this.f147823a = i16;
                            this.f147824b = i17;
                            this.f147825c = 6;
                            if (kVar.K4(this.f147829g, this) != aVar) {
                                i19 = i17;
                                i14 = i19;
                                i15 = i16;
                                if (i15 == 0) {
                                    kVar.Q4(false);
                                    if (i14 == 0) {
                                        p2 p2Var12 = kVar.f147674i;
                                        pt1.l lVar10 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                        this.f147823a = i15;
                                        this.f147824b = i14;
                                        this.f147825c = 7;
                                        p2Var12.k(null, lVar10);
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                int i28 = this.f147824b;
                i16 = this.f147823a;
                o13.r.b(obj);
                xVar2 = xVar2;
                i17 = i28;
                objB0 = obj;
                v2Var = (v2) objB0;
                if (v2Var instanceof v2.b) {
                    this.f147823a = i16;
                    this.f147824b = i17;
                    this.f147825c = 3;
                    if (k.z4(this.f147826d, this.f147829g, this.f147827e, this.f147828f, this.f147830h, this) != aVar) {
                        i14 = i17;
                        p2 p2Var13 = kVar.f147679n;
                        Boolean bool3 = Boolean.TRUE;
                        this.f147823a = 1;
                        this.f147824b = i14;
                        this.f147825c = 4;
                        p2Var13.k(null, bool3);
                        if (Unit.INSTANCE != aVar) {
                            i15 = 1;
                            xVar = xVar2;
                            kVar.F4(xVar.f141004a);
                            if (i15 == 0) {
                                kVar.Q4(false);
                                if (i14 == 0) {
                                    p2 p2Var14 = kVar.f147674i;
                                    pt1.l lVar11 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                    this.f147823a = i15;
                                    this.f147824b = i14;
                                    this.f147825c = 7;
                                    p2Var14.k(null, lVar11);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    i18 = 1;
                    if (v2Var instanceof v2.a) {
                        this.f147823a = i16;
                        this.f147824b = i17;
                        this.f147825c = 6;
                        if (kVar.K4(this.f147829g, this) != aVar) {
                            i19 = i17;
                            i14 = i19;
                            i15 = i16;
                            if (i15 == 0) {
                                kVar.Q4(false);
                                if (i14 == 0) {
                                    p2 p2Var15 = kVar.f147674i;
                                    pt1.l lVar12 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                    this.f147823a = i15;
                                    this.f147824b = i14;
                                    this.f147825c = 7;
                                    p2Var15.k(null, lVar12);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        this.f147823a = i16;
                        this.f147824b = i17;
                        this.f147825c = 6;
                        if (kVar.K4(this.f147829g, this) != aVar) {
                            i19 = i17;
                            i14 = i19;
                            i15 = i16;
                            if (i15 == 0) {
                                kVar.Q4(false);
                                if (i14 == 0) {
                                    p2 p2Var16 = kVar.f147674i;
                                    pt1.l lVar13 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                                    this.f147823a = i15;
                                    this.f147824b = i14;
                                    this.f147825c = 7;
                                    p2Var16.k(null, lVar13);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 3:
                i14 = this.f147824b;
                o13.r.b(obj);
                xVar2 = xVar2;
                p2 p2Var17 = kVar.f147679n;
                Boolean bool4 = Boolean.TRUE;
                this.f147823a = 1;
                this.f147824b = i14;
                this.f147825c = 4;
                p2Var17.k(null, bool4);
                if (Unit.INSTANCE != aVar) {
                    i15 = 1;
                    xVar = xVar2;
                    kVar.F4(xVar.f141004a);
                    if (i15 == 0) {
                        kVar.Q4(false);
                        if (i14 == 0) {
                            p2 p2Var18 = kVar.f147674i;
                            pt1.l lVar14 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                            this.f147823a = i15;
                            this.f147824b = i14;
                            this.f147825c = 7;
                            p2Var18.k(null, lVar14);
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 4:
                i14 = this.f147824b;
                i15 = this.f147823a;
                o13.r.b(obj);
                xVar = xVar2;
                kVar.F4(xVar.f141004a);
                if (i15 == 0) {
                    kVar.Q4(false);
                    if (i14 == 0) {
                        p2 p2Var19 = kVar.f147674i;
                        pt1.l lVar15 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                        this.f147823a = i15;
                        this.f147824b = i14;
                        this.f147825c = 7;
                        p2Var19.k(null, lVar15);
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 5:
                i24 = this.f147823a;
                o13.r.b(obj);
                i18 = 1;
                i15 = i24;
                i14 = i18;
                if (i15 == 0) {
                    kVar.Q4(false);
                    if (i14 == 0) {
                        p2 p2Var110 = kVar.f147674i;
                        pt1.l lVar16 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                        this.f147823a = i15;
                        this.f147824b = i14;
                        this.f147825c = 7;
                        p2Var110.k(null, lVar16);
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 6:
                int i29 = this.f147824b;
                i16 = this.f147823a;
                o13.r.b(obj);
                i19 = i29;
                i14 = i19;
                i15 = i16;
                if (i15 == 0) {
                    kVar.Q4(false);
                    if (i14 == 0) {
                        p2 p2Var111 = kVar.f147674i;
                        pt1.l lVar17 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
                        this.f147823a = i15;
                        this.f147824b = i14;
                        this.f147825c = 7;
                        p2Var111.k(null, lVar17);
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 7:
                o13.r.b(obj);
                kVar.I4();
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
