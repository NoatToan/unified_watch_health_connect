package uy0;

import c22.s3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetAvailableNavigationItemsUseCase$invoke$2", f = "GetAvailableNavigationItemsUseCase.kt", l = {56, 58, 62, 64, 68, 70, 74, 78, 80, 82, 84, 86, 90, 92}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ty0.b f173180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f173181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f173182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f173183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f173184f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173185a;

        static {
            int[] iArr = new int[ty0.b.values().length];
            try {
                iArr[ty0.b.f166892l3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.b.K1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.b.f166878i1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ty0.b.f166881j1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ty0.b.f166898n1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ty0.b.R0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ty0.b.L1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ty0.b.V1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ty0.b.Q1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ty0.b.J2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ty0.b.P2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ty0.b.F1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ty0.b.f166864d2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ty0.b.f166870f2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ty0.b.f166861c2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ty0.b.f166879i2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ty0.b.f166882j2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ty0.b.f166880i3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ty0.b.f166871f3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            f173185a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ty0.b bVar, i iVar, List<String> list, boolean z14, boolean z15, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f173180b = bVar;
        this.f173181c = iVar;
        this.f173182d = list;
        this.f173183e = z14;
        this.f173184f = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f173180b, this.f173181c, this.f173182d, this.f173183e, this.f173184f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0208, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026e, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0285, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a2, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b8, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d0, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e6, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018c, code lost:
    
        if (r15 == r0) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        List listI0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f173179a) {
            case 0:
                o13.r.b(obj);
                int[] iArr = a.f173185a;
                ty0.b bVar = this.f173180b;
                int i14 = iArr[bVar.ordinal()];
                List<String> list = this.f173182d;
                boolean z14 = this.f173184f;
                i iVar = this.f173181c;
                switch (i14) {
                    case 1:
                        y yVar = iVar.f173190a;
                        this.f173179a = 1;
                        obj = ge1.b.e0(yVar.f173361e, new x(yVar, list, null), this);
                        break;
                    case 2:
                        f fVar = iVar.f173191b;
                        this.f173179a = 2;
                        obj = ge1.b.e0(fVar.f173160d, new e(fVar, this.f173183e, null), this);
                        break;
                    case 3:
                    case 4:
                        s sVar = iVar.f173192c;
                        this.f173179a = 3;
                        obj = ge1.b.e0(sVar.f173296b, new r(bVar, sVar, list, null), this);
                        break;
                    case 5:
                        j0 j0Var = iVar.f173193d;
                        this.f173179a = 4;
                        obj = ge1.b.e0(j0Var.f173214b, new i0(j0Var, list, null), this);
                        break;
                    case 6:
                        return iVar.f173194e.a();
                    case 7:
                        c1 c1Var = iVar.f173195f;
                        this.f173179a = 5;
                        obj = ge1.b.e0(c1Var.f173110b, new b1(c1Var, list, null), this);
                        break;
                    case 8:
                        q0 q0Var = iVar.f173196g;
                        this.f173179a = 6;
                        obj = ge1.b.e0(q0Var.f173284c, new p0(q0Var, null), this);
                        break;
                    case 9:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        o oVar = iVar.f173197h;
                        oVar.getClass();
                        ArrayList arrayListD1 = p13.h0.d1(ty0.e.f166953h);
                        if (s3.b()) {
                            arrayListD1.remove(ty0.e.FOLLOWER);
                            arrayListD1.remove(ty0.e.FOLLOWING);
                            arrayListD1.remove(ty0.e.SUGGESTED);
                            arrayListD1.remove(ty0.e.DISCOVER);
                        }
                        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListD1, 10));
                        Iterator it = arrayListD1.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.c(oVar.f173270a, (ty0.e) it.next()));
                        }
                        return arrayList2;
                    case 10:
                        v0 v0Var = iVar.f173198i;
                        this.f173179a = 7;
                        obj = v0Var.d(z14, this);
                        break;
                    case 11:
                        t tVar = iVar.f173201l;
                        tVar.getClass();
                        ty0.b[] bVarArr = ty0.b.P2.f166941g;
                        if (bVarArr == null) {
                            return p13.j0.f134944a;
                        }
                        List<ty0.b> listA = ty0.c.a(p13.u.l0(bVarArr));
                        ArrayList arrayList3 = new ArrayList(p13.y.r(listA, 10));
                        for (ty0.b bVar2 : listA) {
                            String strB = bVar2.b(tVar.f173306a);
                            ty0.b[] bVarArr2 = bVar2.f166941g;
                            if (bVarArr2 != null) {
                                arrayList = new ArrayList(bVarArr2.length);
                                for (ty0.b bVar3 : bVarArr2) {
                                    arrayList.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(tVar.f173307b, bVar3, null, false, 12, null));
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            arrayList3.add(new com.garmin.android.apps.connectmobile.navigation.more.b.k(strB, arrayList, null, 4, null));
                        }
                        return arrayList3;
                    case 12:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        l lVar = iVar.f173202m;
                        this.f173179a = 8;
                        obj = lVar.a(this);
                        break;
                        break;
                    case 13:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        m0 m0Var = iVar.f173203n;
                        this.f173179a = 9;
                        obj = ge1.b.e0(m0Var.f173238d, new n0(null, m0Var, null), this);
                        break;
                        break;
                    case 14:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        f1 f1Var = iVar.f173199j;
                        this.f173179a = 10;
                        obj = ge1.b.e0(f1Var.f173168d, new e1(null, f1Var, null), this);
                        break;
                        break;
                    case 15:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        v vVar = iVar.f173200k;
                        this.f173179a = 11;
                        obj = ge1.b.e0(vVar.f173325b, new u(vVar, null), this);
                        break;
                        break;
                    case 16:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        b0 b0Var = iVar.f173205p;
                        this.f173179a = 12;
                        obj = ge1.b.e0(b0Var.f173093e, new d0(null, b0Var, null), this);
                        break;
                        break;
                    case 17:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        l0 l0Var = iVar.f173204o;
                        l0Var.getClass();
                        new y81.a();
                        List listA2 = y81.a.a();
                        ArrayList arrayList4 = new ArrayList(p13.y.r(listA2, 10));
                        Iterator it3 = listA2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(new com.garmin.android.apps.connectmobile.navigation.more.b.h(l0Var.f173227a, new ty0.m((j22.g) it3.next())));
                        }
                        return arrayList4;
                    case 18:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        q qVar = iVar.f173207r;
                        this.f173179a = 13;
                        obj = qVar.a(this);
                        break;
                        break;
                    case 19:
                        if (!z14) {
                            return p13.j0.f134944a;
                        }
                        h0 h0Var = iVar.f173206q;
                        this.f173179a = 14;
                        obj = h0Var.b(this);
                        break;
                        break;
                    default:
                        ty0.b[] bVarArr3 = bVar.f166941g;
                        if (bVarArr3 == null || (listI0 = p13.u.i0(bVarArr3)) == null) {
                            return p13.j0.f134944a;
                        }
                        ArrayList arrayList5 = new ArrayList(p13.y.r(listI0, 10));
                        Iterator it4 = listI0.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173180b, (ty0.b) it4.next(), null, false, 12, null));
                        }
                        return arrayList5;
                }
                break;
            case 1:
                o13.r.b(obj);
                return (List) obj;
            case 2:
                o13.r.b(obj);
                return (List) obj;
            case 3:
                o13.r.b(obj);
                return (List) obj;
            case 4:
                o13.r.b(obj);
                return (List) obj;
            case 5:
                o13.r.b(obj);
                return (List) obj;
            case 6:
                o13.r.b(obj);
                return (List) obj;
            case 7:
                o13.r.b(obj);
                return (List) obj;
            case 8:
                o13.r.b(obj);
                return (List) obj;
            case 9:
                o13.r.b(obj);
                return (List) obj;
            case 10:
                o13.r.b(obj);
                return (List) obj;
            case 11:
                o13.r.b(obj);
                return (List) obj;
            case 12:
                o13.r.b(obj);
                return (List) obj;
            case 13:
                o13.r.b(obj);
                return (List) obj;
            case 14:
                o13.r.b(obj);
                return (List) obj;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
