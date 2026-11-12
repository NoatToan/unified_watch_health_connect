package vs1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.HelpfulReviewUseCase$toggleReviewHelpful$1", f = "HelpfulReviewUseCase.kt", l = {27, 28, 37, 56, 69, 71}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f179830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f179831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f179832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j8, boolean z14, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f179830b = kVar;
        this.f179831c = j8;
        this.f179832d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f179830b, this.f179831c, this.f179832d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0096 A[PHI: r2
      0x0096: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v15 java.lang.Object) binds: [B:16:0x0092, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0206, code lost:
    
        if (r2.emit(r3, r40) == r1) goto L75;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB2;
        pt1.x value;
        i53.c<pt1.x> cVar;
        i53.c cVarE;
        z1<pt1.w> z1Var;
        pt1.w wVarA;
        ArrayList arrayList;
        int i14;
        int i15;
        i53.c<pt1.x> cVar2;
        i53.c cVarB;
        z1<pt1.o> z1Var2;
        pt1.o oVarA;
        ArrayList arrayList2;
        int i16;
        int i17;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = this.f179829a;
        boolean z14 = this.f179832d;
        long j8 = this.f179831c;
        k kVar = this.f179830b;
        switch (i18) {
            case 0:
                o13.r.b(obj);
                z1<pt1.o> z1Var3 = kVar.f179844c;
                pt1.o oVarA2 = pt1.o.a(z1Var3.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179829a = 1;
                if (z1Var3.emit(oVarA2, this) != aVar) {
                    ss1.a0 a0Var = kVar.f179843b;
                    this.f179829a = 2;
                    objB2 = a0Var.b2(j8, z14, this);
                    if (objB2 != aVar) {
                        if (!(((v2) objB2) instanceof v2.b)) {
                            if (z14) {
                                kVar.f179847f.add(new Long(j8));
                            } else {
                                kVar.f179847f.remove(new Long(j8));
                            }
                            value = kVar.f179846e.getValue();
                            if (value == null && value.f141004a == j8) {
                                z1<pt1.x> z1Var4 = kVar.f179846e;
                                int i19 = value.f141014k;
                                pt1.x xVarA = pt1.x.a(value, z14 ? i19 + 1 : i19 - 1, z14, null, 4191231);
                                this.f179829a = 3;
                                if (z1Var4.emit(xVarA, this) != aVar) {
                                    pt1.w value2 = kVar.f179845d.getValue();
                                    cVar = value2.f141000d;
                                    if (cVar != null) {
                                        arrayList = new ArrayList(p13.y.r(cVar, 10));
                                        while (r2.hasNext()) {
                                            if (xVarA.f141004a == j8) {
                                                i14 = xVarA.f141014k;
                                                if (z14) {
                                                    i15 = i14 + 1;
                                                } else {
                                                    i15 = i14 - 1;
                                                }
                                                xVarA = pt1.x.a(xVarA, i15, z14, null, 4191231);
                                            }
                                            arrayList.add(xVarA);
                                        }
                                        cVarE = i53.a.e(arrayList);
                                    } else {
                                        cVarE = null;
                                    }
                                    z1Var = kVar.f179845d;
                                    wVarA = pt1.w.a(value2, false, false, cVarE, false, false, false, 119);
                                    this.f179829a = 4;
                                    if (z1Var.emit(wVarA, this) != aVar) {
                                        pt1.o value3 = kVar.f179844c.getValue();
                                        cVar2 = value3.f140919q;
                                        if (cVar2 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                            while (r2.hasNext()) {
                                                if (xVarA.f141004a == j8) {
                                                    i16 = xVarA.f141014k;
                                                    if (z14) {
                                                        i17 = i16 + 1;
                                                    } else {
                                                        i17 = i16 - 1;
                                                    }
                                                    xVarA = pt1.x.a(xVarA, i17, z14, null, 4191231);
                                                }
                                                arrayList2.add(xVarA);
                                            }
                                            cVarB = i53.a.e(arrayList2);
                                            if (cVarB == null) {
                                                cVarB = j53.l.b();
                                            }
                                        } else {
                                            cVarB = j53.l.b();
                                        }
                                        i53.c cVar3 = cVarB;
                                        z1Var2 = kVar.f179844c;
                                        oVarA = pt1.o.a(value3, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar3, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                                        this.f179829a = 5;
                                        if (z1Var2.emit(oVarA, this) != aVar) {
                                            z1<pt1.o> z1Var5 = kVar.f179844c;
                                            pt1.o oVarA3 = pt1.o.a(z1Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                            this.f179829a = 6;
                                        }
                                    }
                                }
                            } else {
                                pt1.w value4 = kVar.f179845d.getValue();
                                cVar = value4.f141000d;
                                if (cVar != null) {
                                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                                    for (pt1.x xVarA2 : cVar) {
                                        if (xVarA2.f141004a == j8) {
                                            i14 = xVarA2.f141014k;
                                            if (z14) {
                                                i15 = i14 + 1;
                                            } else {
                                                i15 = i14 - 1;
                                            }
                                            xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                                        }
                                        arrayList.add(xVarA2);
                                    }
                                    cVarE = i53.a.e(arrayList);
                                } else {
                                    cVarE = null;
                                }
                                z1Var = kVar.f179845d;
                                wVarA = pt1.w.a(value4, false, false, cVarE, false, false, false, 119);
                                this.f179829a = 4;
                                if (z1Var.emit(wVarA, this) != aVar) {
                                    pt1.o value5 = kVar.f179844c.getValue();
                                    cVar2 = value5.f140919q;
                                    if (cVar2 != null) {
                                        arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                        for (pt1.x xVarA3 : cVar2) {
                                            if (xVarA3.f141004a == j8) {
                                                i16 = xVarA3.f141014k;
                                                if (z14) {
                                                    i17 = i16 + 1;
                                                } else {
                                                    i17 = i16 - 1;
                                                }
                                                xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                                            }
                                            arrayList2.add(xVarA3);
                                        }
                                        cVarB = i53.a.e(arrayList2);
                                        if (cVarB == null) {
                                            cVarB = j53.l.b();
                                        }
                                    } else {
                                        cVarB = j53.l.b();
                                    }
                                    i53.c cVar4 = cVarB;
                                    z1Var2 = kVar.f179844c;
                                    oVarA = pt1.o.a(value5, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar4, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                                    this.f179829a = 5;
                                    if (z1Var2.emit(oVarA, this) != aVar) {
                                        z1<pt1.o> z1Var6 = kVar.f179844c;
                                        pt1.o oVarA4 = pt1.o.a(z1Var6.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                        this.f179829a = 6;
                                    }
                                }
                            }
                        } else {
                            z1<pt1.o> z1Var7 = kVar.f179844c;
                            pt1.o oVarA5 = pt1.o.a(z1Var7.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179829a = 6;
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                ss1.a0 a0Var2 = kVar.f179843b;
                this.f179829a = 2;
                objB2 = a0Var2.b2(j8, z14, this);
                if (objB2 != aVar) {
                    if (!(((v2) objB2) instanceof v2.b)) {
                        z1<pt1.o> z1Var8 = kVar.f179844c;
                        pt1.o oVarA6 = pt1.o.a(z1Var8.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179829a = 6;
                    } else {
                        if (z14) {
                            kVar.f179847f.add(new Long(j8));
                        } else {
                            kVar.f179847f.remove(new Long(j8));
                        }
                        value = kVar.f179846e.getValue();
                        if (value == null) {
                            pt1.w value6 = kVar.f179845d.getValue();
                            cVar = value6.f141000d;
                            if (cVar != null) {
                                arrayList = new ArrayList(p13.y.r(cVar, 10));
                                while (r2.hasNext()) {
                                    if (xVarA2.f141004a == j8) {
                                        i14 = xVarA2.f141014k;
                                        if (z14) {
                                            i15 = i14 + 1;
                                        } else {
                                            i15 = i14 - 1;
                                        }
                                        xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                                    }
                                    arrayList.add(xVarA2);
                                }
                                cVarE = i53.a.e(arrayList);
                            } else {
                                cVarE = null;
                            }
                            z1Var = kVar.f179845d;
                            wVarA = pt1.w.a(value6, false, false, cVarE, false, false, false, 119);
                            this.f179829a = 4;
                            if (z1Var.emit(wVarA, this) != aVar) {
                                pt1.o value7 = kVar.f179844c.getValue();
                                cVar2 = value7.f140919q;
                                if (cVar2 != null) {
                                    arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                    while (r2.hasNext()) {
                                        if (xVarA3.f141004a == j8) {
                                            i16 = xVarA3.f141014k;
                                            if (z14) {
                                                i17 = i16 + 1;
                                            } else {
                                                i17 = i16 - 1;
                                            }
                                            xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                                        }
                                        arrayList2.add(xVarA3);
                                    }
                                    cVarB = i53.a.e(arrayList2);
                                    if (cVarB == null) {
                                        cVarB = j53.l.b();
                                    }
                                } else {
                                    cVarB = j53.l.b();
                                }
                                i53.c cVar5 = cVarB;
                                z1Var2 = kVar.f179844c;
                                oVarA = pt1.o.a(value7, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar5, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                                this.f179829a = 5;
                                if (z1Var2.emit(oVarA, this) != aVar) {
                                    z1<pt1.o> z1Var9 = kVar.f179844c;
                                    pt1.o oVarA7 = pt1.o.a(z1Var9.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179829a = 6;
                                }
                            }
                        } else {
                            pt1.w value8 = kVar.f179845d.getValue();
                            cVar = value8.f141000d;
                            if (cVar != null) {
                                arrayList = new ArrayList(p13.y.r(cVar, 10));
                                while (r2.hasNext()) {
                                    if (xVarA2.f141004a == j8) {
                                        i14 = xVarA2.f141014k;
                                        if (z14) {
                                            i15 = i14 + 1;
                                        } else {
                                            i15 = i14 - 1;
                                        }
                                        xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                                    }
                                    arrayList.add(xVarA2);
                                }
                                cVarE = i53.a.e(arrayList);
                            } else {
                                cVarE = null;
                            }
                            z1Var = kVar.f179845d;
                            wVarA = pt1.w.a(value8, false, false, cVarE, false, false, false, 119);
                            this.f179829a = 4;
                            if (z1Var.emit(wVarA, this) != aVar) {
                                pt1.o value9 = kVar.f179844c.getValue();
                                cVar2 = value9.f140919q;
                                if (cVar2 != null) {
                                    arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                    while (r2.hasNext()) {
                                        if (xVarA3.f141004a == j8) {
                                            i16 = xVarA3.f141014k;
                                            if (z14) {
                                                i17 = i16 + 1;
                                            } else {
                                                i17 = i16 - 1;
                                            }
                                            xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                                        }
                                        arrayList2.add(xVarA3);
                                    }
                                    cVarB = i53.a.e(arrayList2);
                                    if (cVarB == null) {
                                        cVarB = j53.l.b();
                                    }
                                } else {
                                    cVarB = j53.l.b();
                                }
                                i53.c cVar6 = cVarB;
                                z1Var2 = kVar.f179844c;
                                oVarA = pt1.o.a(value9, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar6, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                                this.f179829a = 5;
                                if (z1Var2.emit(oVarA, this) != aVar) {
                                    z1<pt1.o> z1Var10 = kVar.f179844c;
                                    pt1.o oVarA8 = pt1.o.a(z1Var10.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179829a = 6;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objB2 = obj;
                if (!(((v2) objB2) instanceof v2.b)) {
                    if (z14) {
                        kVar.f179847f.add(new Long(j8));
                    } else {
                        kVar.f179847f.remove(new Long(j8));
                    }
                    value = kVar.f179846e.getValue();
                    if (value == null) {
                        pt1.w value10 = kVar.f179845d.getValue();
                        cVar = value10.f141000d;
                        if (cVar != null) {
                            arrayList = new ArrayList(p13.y.r(cVar, 10));
                            while (r2.hasNext()) {
                                if (xVarA2.f141004a == j8) {
                                    i14 = xVarA2.f141014k;
                                    if (z14) {
                                        i15 = i14 + 1;
                                    } else {
                                        i15 = i14 - 1;
                                    }
                                    xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                                }
                                arrayList.add(xVarA2);
                            }
                            cVarE = i53.a.e(arrayList);
                        } else {
                            cVarE = null;
                        }
                        z1Var = kVar.f179845d;
                        wVarA = pt1.w.a(value10, false, false, cVarE, false, false, false, 119);
                        this.f179829a = 4;
                        if (z1Var.emit(wVarA, this) != aVar) {
                            pt1.o value11 = kVar.f179844c.getValue();
                            cVar2 = value11.f140919q;
                            if (cVar2 != null) {
                                arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                while (r2.hasNext()) {
                                    if (xVarA3.f141004a == j8) {
                                        i16 = xVarA3.f141014k;
                                        if (z14) {
                                            i17 = i16 + 1;
                                        } else {
                                            i17 = i16 - 1;
                                        }
                                        xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                                    }
                                    arrayList2.add(xVarA3);
                                }
                                cVarB = i53.a.e(arrayList2);
                                if (cVarB == null) {
                                    cVarB = j53.l.b();
                                }
                            } else {
                                cVarB = j53.l.b();
                            }
                            i53.c cVar7 = cVarB;
                            z1Var2 = kVar.f179844c;
                            oVarA = pt1.o.a(value11, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar7, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                            this.f179829a = 5;
                            if (z1Var2.emit(oVarA, this) != aVar) {
                                z1<pt1.o> z1Var11 = kVar.f179844c;
                                pt1.o oVarA9 = pt1.o.a(z1Var11.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179829a = 6;
                            }
                        }
                    } else {
                        pt1.w value12 = kVar.f179845d.getValue();
                        cVar = value12.f141000d;
                        if (cVar != null) {
                            arrayList = new ArrayList(p13.y.r(cVar, 10));
                            while (r2.hasNext()) {
                                if (xVarA2.f141004a == j8) {
                                    i14 = xVarA2.f141014k;
                                    if (z14) {
                                        i15 = i14 + 1;
                                    } else {
                                        i15 = i14 - 1;
                                    }
                                    xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                                }
                                arrayList.add(xVarA2);
                            }
                            cVarE = i53.a.e(arrayList);
                        } else {
                            cVarE = null;
                        }
                        z1Var = kVar.f179845d;
                        wVarA = pt1.w.a(value12, false, false, cVarE, false, false, false, 119);
                        this.f179829a = 4;
                        if (z1Var.emit(wVarA, this) != aVar) {
                            pt1.o value13 = kVar.f179844c.getValue();
                            cVar2 = value13.f140919q;
                            if (cVar2 != null) {
                                arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                                while (r2.hasNext()) {
                                    if (xVarA3.f141004a == j8) {
                                        i16 = xVarA3.f141014k;
                                        if (z14) {
                                            i17 = i16 + 1;
                                        } else {
                                            i17 = i16 - 1;
                                        }
                                        xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                                    }
                                    arrayList2.add(xVarA3);
                                }
                                cVarB = i53.a.e(arrayList2);
                                if (cVarB == null) {
                                    cVarB = j53.l.b();
                                }
                            } else {
                                cVarB = j53.l.b();
                            }
                            i53.c cVar8 = cVarB;
                            z1Var2 = kVar.f179844c;
                            oVarA = pt1.o.a(value13, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar8, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                            this.f179829a = 5;
                            if (z1Var2.emit(oVarA, this) != aVar) {
                                z1<pt1.o> z1Var12 = kVar.f179844c;
                                pt1.o oVarA10 = pt1.o.a(z1Var12.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179829a = 6;
                            }
                        }
                    }
                    break;
                } else {
                    z1<pt1.o> z1Var13 = kVar.f179844c;
                    pt1.o oVarA11 = pt1.o.a(z1Var13.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179829a = 6;
                    break;
                }
                return aVar;
            case 3:
                o13.r.b(obj);
                pt1.w value14 = kVar.f179845d.getValue();
                cVar = value14.f141000d;
                if (cVar != null) {
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    while (r2.hasNext()) {
                        if (xVarA2.f141004a == j8) {
                            i14 = xVarA2.f141014k;
                            if (z14) {
                                i15 = i14 + 1;
                            } else {
                                i15 = i14 - 1;
                            }
                            xVarA2 = pt1.x.a(xVarA2, i15, z14, null, 4191231);
                        }
                        arrayList.add(xVarA2);
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                z1Var = kVar.f179845d;
                wVarA = pt1.w.a(value14, false, false, cVarE, false, false, false, 119);
                this.f179829a = 4;
                if (z1Var.emit(wVarA, this) != aVar) {
                    pt1.o value15 = kVar.f179844c.getValue();
                    cVar2 = value15.f140919q;
                    if (cVar2 != null) {
                        arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                        while (r2.hasNext()) {
                            if (xVarA3.f141004a == j8) {
                                i16 = xVarA3.f141014k;
                                if (z14) {
                                    i17 = i16 + 1;
                                } else {
                                    i17 = i16 - 1;
                                }
                                xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                            }
                            arrayList2.add(xVarA3);
                        }
                        cVarB = i53.a.e(arrayList2);
                        if (cVarB == null) {
                            cVarB = j53.l.b();
                        }
                    } else {
                        cVarB = j53.l.b();
                    }
                    i53.c cVar9 = cVarB;
                    z1Var2 = kVar.f179844c;
                    oVarA = pt1.o.a(value15, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar9, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                    this.f179829a = 5;
                    if (z1Var2.emit(oVarA, this) != aVar) {
                        z1<pt1.o> z1Var14 = kVar.f179844c;
                        pt1.o oVarA12 = pt1.o.a(z1Var14.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179829a = 6;
                    }
                    break;
                }
                return aVar;
            case 4:
                o13.r.b(obj);
                pt1.o value16 = kVar.f179844c.getValue();
                cVar2 = value16.f140919q;
                if (cVar2 != null) {
                    arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                    while (r2.hasNext()) {
                        if (xVarA3.f141004a == j8) {
                            i16 = xVarA3.f141014k;
                            if (z14) {
                                i17 = i16 + 1;
                            } else {
                                i17 = i16 - 1;
                            }
                            xVarA3 = pt1.x.a(xVarA3, i17, z14, null, 4191231);
                        }
                        arrayList2.add(xVarA3);
                    }
                    cVarB = i53.a.e(arrayList2);
                    if (cVarB == null) {
                        cVarB = j53.l.b();
                    }
                } else {
                    cVarB = j53.l.b();
                }
                i53.c cVar10 = cVarB;
                z1Var2 = kVar.f179844c;
                oVarA = pt1.o.a(value16, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVar10, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                this.f179829a = 5;
                if (z1Var2.emit(oVarA, this) != aVar) {
                    z1<pt1.o> z1Var15 = kVar.f179844c;
                    pt1.o oVarA13 = pt1.o.a(z1Var15.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179829a = 6;
                    break;
                }
                return aVar;
            case 5:
                o13.r.b(obj);
                z1<pt1.o> z1Var16 = kVar.f179844c;
                pt1.o oVarA14 = pt1.o.a(z1Var16.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179829a = 6;
                break;
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
