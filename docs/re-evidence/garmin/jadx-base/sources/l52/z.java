package l52;

import c62.a2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ll52/z;", "Ll52/y;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ll52/x;", "workoutsAPI", "La31/e;", "onboardingChecksDelegate", "<init>", "(Ll52/x;La31/e;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements y, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f110389c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f110390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.e f110391b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110392a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.x0.f4329s2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.x0.f4322q2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[am.x0.C2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[am.x0.f4309n1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f110392a = iArr;
        }
    }

    public z(x xVar, a31.e eVar) {
        xVar.getClass();
        eVar.getClass();
        this.f110390a = xVar;
        this.f110391b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r9 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r9 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
    
        if (r9 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r9 == r1) goto L66;
     */
    @Override // l52.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(String str, v13.c cVar) {
        w0 w0Var;
        v2 v2Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f110384d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f110384d = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objJ = w0Var.f110382b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (w0Var.f110384d) {
            case 0:
                o13.r.b(objJ);
                bv.b.f21239a.getClass();
                bv.b.a();
                com.garmin.android.apps.connectmobile.k1 k1Var = com.garmin.android.apps.connectmobile.k1.f37122a;
                if (!k1Var.H()) {
                    bv.b.a();
                    if (!k1Var.F()) {
                        bv.b.a();
                        if (!k1Var.w()) {
                            x0 x0Var = new x0(str, null);
                            w0Var.f110381a = null;
                            w0Var.f110384d = 7;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, x0Var, w0Var);
                        } else {
                            c1 c1Var = new c1(str, null);
                            w0Var.f110381a = str;
                            w0Var.f110384d = 5;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, c1Var, w0Var);
                            if (objJ != aVar) {
                                if (!(((v2) objJ) instanceof v2.b)) {
                                    objJ = null;
                                }
                                v2Var = (v2) objJ;
                                if (v2Var == null) {
                                    d1 d1Var = new d1(str, null);
                                    w0Var.f110381a = null;
                                    w0Var.f110384d = 6;
                                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, d1Var, w0Var);
                                    break;
                                }
                                if (v2Var instanceof v2.b) {
                                    return v2Var;
                                }
                                v2.b bVar = (v2.b) v2Var;
                                return new v2.b(bVar.f47386a, bVar.f47387b, null, null, 12, null);
                            }
                        }
                    } else {
                        a1 a1Var = new a1(str, null);
                        w0Var.f110381a = str;
                        w0Var.f110384d = 3;
                        objJ = com.garmin.android.apps.connectmobile.f0.J(this, a1Var, w0Var);
                        if (objJ != aVar) {
                            if (!(((v2) objJ) instanceof v2.b)) {
                                objJ = null;
                            }
                            v2Var = (v2) objJ;
                            if (v2Var == null) {
                                b1 b1Var = new b1(str, null);
                                w0Var.f110381a = null;
                                w0Var.f110384d = 4;
                                objJ = com.garmin.android.apps.connectmobile.f0.J(this, b1Var, w0Var);
                                break;
                            }
                            if (v2Var instanceof v2.b) {
                                return v2Var;
                            }
                            v2.b bVar2 = (v2.b) v2Var;
                            return new v2.b(bVar2.f47386a, bVar2.f47387b, null, null, 12, null);
                        }
                    }
                    break;
                } else {
                    y0 y0Var = new y0(str, null);
                    w0Var.f110381a = str;
                    w0Var.f110384d = 1;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, y0Var, w0Var);
                    if (objJ != aVar) {
                        if (!(((v2) objJ) instanceof v2.b)) {
                            objJ = null;
                        }
                        v2Var = (v2) objJ;
                        if (v2Var == null) {
                            z0 z0Var = new z0(str, null);
                            w0Var.f110381a = null;
                            w0Var.f110384d = 2;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, z0Var, w0Var);
                            break;
                        }
                        if (v2Var instanceof v2.b) {
                            return v2Var;
                        }
                        v2.b bVar3 = (v2.b) v2Var;
                        return new v2.b(bVar3.f47386a, bVar3.f47387b, null, null, 12, null);
                    }
                }
                return aVar;
            case 1:
                str = w0Var.f110381a;
                o13.r.b(objJ);
                if (!(((v2) objJ) instanceof v2.b)) {
                    objJ = null;
                }
                v2Var = (v2) objJ;
                if (v2Var == null) {
                    z0 z0Var2 = new z0(str, null);
                    w0Var.f110381a = null;
                    w0Var.f110384d = 2;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, z0Var2, w0Var);
                    break;
                }
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar4 = (v2.b) v2Var;
                return new v2.b(bVar4.f47386a, bVar4.f47387b, null, null, 12, null);
            case 2:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar5 = (v2.b) v2Var;
                return new v2.b(bVar5.f47386a, bVar5.f47387b, null, null, 12, null);
            case 3:
                str = w0Var.f110381a;
                o13.r.b(objJ);
                if (!(((v2) objJ) instanceof v2.b)) {
                    objJ = null;
                }
                v2Var = (v2) objJ;
                if (v2Var == null) {
                    b1 b1Var2 = new b1(str, null);
                    w0Var.f110381a = null;
                    w0Var.f110384d = 4;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, b1Var2, w0Var);
                    break;
                }
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar6 = (v2.b) v2Var;
                return new v2.b(bVar6.f47386a, bVar6.f47387b, null, null, 12, null);
            case 4:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar7 = (v2.b) v2Var;
                return new v2.b(bVar7.f47386a, bVar7.f47387b, null, null, 12, null);
            case 5:
                str = w0Var.f110381a;
                o13.r.b(objJ);
                if (!(((v2) objJ) instanceof v2.b)) {
                    objJ = null;
                }
                v2Var = (v2) objJ;
                if (v2Var == null) {
                    d1 d1Var2 = new d1(str, null);
                    w0Var.f110381a = null;
                    w0Var.f110384d = 6;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, d1Var2, w0Var);
                    break;
                }
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar8 = (v2.b) v2Var;
                return new v2.b(bVar8.f47386a, bVar8.f47387b, null, null, 12, null);
            case 6:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar9 = (v2.b) v2Var;
                return new v2.b(bVar9.f47386a, bVar9.f47387b, null, null, 12, null);
            case 7:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar10 = (v2.b) v2Var;
                return new v2.b(bVar10.f47386a, bVar10.f47387b, null, null, 12, null);
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // l52.y
    public final Object E(File file, t13.d<? super v2<com.garmin.android.apps.connectmobile.workouts.data.model.a>> dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u1(file, this, null), dVar);
    }

    @Override // l52.y
    public final Object H(long j8, com.garmin.android.apps.connectmobile.workouts.presentation.details.p.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o1(this, j8, null), aVar);
    }

    @Override // l52.y
    public final o53.i0 I(String str) {
        return this.f110390a.z(str, k52.g.d());
    }

    @Override // l52.y
    public final Object L(long j8, s52.i.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q1(this, j8, null), aVar);
    }

    @Override // l52.y
    public final Object M(long j8, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, s52.k.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s1(this, j8, bVar, null), aVar);
    }

    @Override // l52.y
    public final Object N(WorkoutDetailsDTO workoutDetailsDTO, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t1(this, workoutDetailsDTO, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l52.y
    public final Object O(am.x0 x0Var, boolean z14, com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr, v13.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f110288d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f110288d = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objA = j0Var.f110286b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f110288d;
        if (i15 == 0) {
            o13.r.b(objA);
            ru1.d dVar = (ru1.d) KoinJavaComponent.get$default(ru1.d.class, null, null, 6, null);
            j0Var.f110285a = dVarArr;
            j0Var.f110288d = 1;
            objA = ru1.d.a(dVar, x0Var, j0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVarArr = j0Var.f110285a;
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr2 = dVarArr;
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                v2.a aVar2 = (v2.a) v2Var;
                return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
        v2.b bVar2 = (v2.b) v2Var;
        String str = (String) bVar2.f47386a;
        bVar.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArr2, str);
        return new v2.b(dVarArr2, bVar2.f47387b, null, null, 12, null);
    }

    @Override // l52.y
    public final Object R(long j8, long j14, com.garmin.android.apps.connectmobile.workouts.presentation.details.q.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n1(this, j8, j14, null), aVar);
    }

    @Override // l52.y
    public final Object T(long j8, String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c0(this, j8, RequestBody.INSTANCE.create(str, gz0.a.f80402b), null), iVar);
    }

    @Override // l52.y
    public final Object V(String str, String str2, c62.u1 u1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j1(this, str, str2, null), u1Var);
    }

    @Override // l52.y
    public final Object Y(v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new k1(this, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l52.y
    public final Serializable a(v13.c cVar) {
        g1 g1Var;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f110267c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f110267c = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        Object objAwait = g1Var.f110265a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f110267c;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<List<com.garmin.android.apps.connectmobile.workouts.data.model.i0>> i0VarP = this.f110390a.p();
            g1Var.f110267c = 1;
            objAwait = i0VarP.await(g1Var);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objAwait) {
            if (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.workouts.data.model.i0) obj).getSportTypeKey(), m52.k.B.f116765a)) {
                arrayList.add(obj);
            }
        }
        List listN0 = p13.h0.N0(arrayList, new f1());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            m52.k kVarB = ((com.garmin.android.apps.connectmobile.workouts.data.model.i0) it.next()).b();
            if (kVarB != null) {
                arrayList2.add(kVarB);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l52.y
    public final Object a0(String str, String str2, String str3, v13.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f110365c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f110365c = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objJ = u0Var.f110363a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f110365c;
        if (i15 == 0) {
            o13.r.b(objJ);
            v0 v0Var = new v0(str, str2, str3, null);
            u0Var.f110365c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, v0Var, u0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return v2Var;
        }
        v2.b bVar = (v2.b) v2Var;
        return new v2.b(bVar.f47386a, bVar.f47387b, null, null, 12, null);
    }

    @Override // l52.y
    public final o53.i0 b() {
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zH = com.garmin.android.apps.connectmobile.k1.f37122a.H();
        a aVar = f110389c;
        return zH ? a.a(aVar).K() : a.a(aVar).b();
    }

    @Override // l52.y
    public final o53.i0 b0() {
        return this.f110390a.H();
    }

    @Override // l52.y
    public final v2 c() {
        try {
            c83.a0<String> a0VarExecute = this.f110390a.c().execute();
            Response response = a0VarExecute.f25745a;
            return response.isSuccessful() ? new v2.b(a0VarExecute.f25746b, response.code(), null, null, 12, null) : new v2.a(new Exception(response.message()), null, null, 6, null);
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }

    @Override // l52.y
    public final Object c0(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new g0(this, str, null), iVar);
    }

    @Override // l52.y
    public final Object d(String str, f62.e0 e0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m0(this, str, null), e0Var);
    }

    @Override // l52.y
    public final Object f(List list, int i14, int i15, v13.c cVar) {
        return list.isEmpty() ? com.garmin.android.apps.connectmobile.f0.J(this, new h1(this, i14, i15, null), cVar) : com.garmin.android.apps.connectmobile.f0.J(this, new i1(this, list, i14, i15, null), cVar);
    }

    @Override // l52.y
    public final Object g(a2 a2Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new l0(null), a2Var);
    }

    @Override // l52.y
    public final Object h(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, s52.j.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r1(this, bVar, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l52.y
    public final Object i(v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f110273c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f110273c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objJ = h0Var.f110271a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f110273c;
        if (i15 == 0) {
            o13.r.b(objJ);
            i0 i0Var = new i0(this, null);
            h0Var.f110273c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, i0Var, h0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return v2Var;
        }
        v2.b bVar = (v2.b) v2Var;
        Iterable iterable = (Iterable) bVar.f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!d53.u.q(((com.garmin.android.apps.connectmobile.workouts.data.model.b) obj).getBenchmarkKey(), "barbell_upright_row", true) || ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).y()) {
                arrayList.add(obj);
            }
        }
        return new v2.b(arrayList, bVar.f47387b, null, null, 12, null);
    }

    @Override // l52.y
    public final Object j(long j8, String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new a0(this, j8, RequestBody.INSTANCE.create(str, gz0.a.f80402b), null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l52.y
    public final Object k(am.x0 x0Var, boolean z14, v13.c cVar) {
        k0 k0Var;
        c83.a0 a0VarE;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f110299e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f110299e = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f110297c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f110299e;
        if (i15 == 0) {
            o13.r.b(obj);
            ru1.a aVar2 = (ru1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, ru1.a.class, new c83.h.a[0], null, null, null, 120);
            try {
                if (x0Var != null) {
                    int i16 = b.f110392a[x0Var.ordinal()];
                    if (i16 == 1) {
                        a0VarE = o72.t.K(aVar2, z14);
                    } else if (i16 == 2) {
                        a0VarE = o72.t.J(aVar2, z14);
                    } else if (i16 != 3) {
                        a0VarE = (i16 == 4 || i16 != 5) ? o72.t.E(aVar2, z14) : o72.t.E(aVar2, z14);
                    } else {
                        a0VarE = o72.t.O(aVar2, z14);
                    }
                } else {
                    a0VarE = o72.t.E(aVar2, z14);
                }
                Response response = a0VarE.f25745a;
                if (!response.isSuccessful()) {
                    return new v2.a(new Exception(response.message()), null, null, 6, null);
                }
                com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
                String str = (String) a0VarE.f25746b;
                bVar.getClass();
                com.garmin.android.apps.connectmobile.repcounting.model.c cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str);
                ru1.d dVar = (ru1.d) KoinJavaComponent.get$default(ru1.d.class, null, null, 6, null);
                k0Var.f110295a = a0VarE;
                k0Var.f110296b = cVarA;
                k0Var.f110299e = 1;
                Object objA = ru1.d.a(dVar, x0Var, k0Var);
                if (objA == aVar) {
                    return aVar;
                }
                cVar2 = cVarA;
                obj = objA;
            } catch (Exception e4) {
                return new v2.a(e4, null, null, 6, null);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = k0Var.f110296b;
            a0VarE = k0Var.f110295a;
            o13.r.b(obj);
            cVar2 = cVar3;
        }
        v2 v2Var = (v2) obj;
        if ((v2Var instanceof v2.b) && cVar2 != null) {
            com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar2 = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVar2.F();
            String str2 = (String) ((v2.b) v2Var).f47386a;
            bVar2.getClass();
            com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArrF, str2);
            if (dVarArrF != null) {
                cVar2.I(dVarArrF);
            }
        }
        return new v2.b(cVar2, a0VarE.f25745a.code(), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l52.y
    public final Object l(v13.c cVar) {
        l1 l1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i14 = l1Var.f110305c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l1Var.f110305c = i14 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object objJ = l1Var.f110303a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l1Var.f110305c;
        if (i15 == 0) {
            o13.r.b(objJ);
            m1 m1Var = new m1(this, null);
            l1Var.f110305c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, m1Var, l1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!((WorkoutDTO) obj).D()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f110391b.b(e31.a.ENTERED_WORKOUTS);
            }
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l52.y
    public final Serializable m(v13.c cVar) {
        e1 e1Var;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i14 = e1Var.f110246c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e1Var.f110246c = i14 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, cVar);
            }
        } else {
            e1Var = new e1(this, cVar);
        }
        Object objAwait = e1Var.f110244a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e1Var.f110246c;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<List<com.garmin.android.apps.connectmobile.workouts.data.model.i0>> i0VarP = this.f110390a.p();
            e1Var.f110246c = 1;
            objAwait = i0VarP.await(e1Var);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
        }
        Iterable iterable = (Iterable) objAwait;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.workouts.data.model.i0) it.next()).getSportTypeKey());
        }
        return arrayList;
    }

    @Override // l52.y
    public final o53.i0 n(String str) {
        return this.f110390a.y(str, k52.g.d());
    }

    @Override // l52.y
    public final Object o(long j8, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f0(this, j8, null), iVar);
    }

    @Override // l52.y
    public final o53.i0 q(String str) {
        return this.f110390a.r(str, k52.g.d());
    }

    @Override // l52.y
    public final Object r(ArrayList arrayList, com.garmin.android.apps.connectmobile.workouts.presentation.edit.s sVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e0(this, arrayList, null), sVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        if (r10 == r1) goto L56;
     */
    @Override // l52.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, v13.c cVar) {
        n0 n0Var;
        v2 v2Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f110316e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f110316e = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objJ = n0Var.f110314c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (n0Var.f110316e) {
            case 0:
                o13.r.b(objJ);
                bv.b.f21239a.getClass();
                bv.b.a();
                com.garmin.android.apps.connectmobile.k1 k1Var = com.garmin.android.apps.connectmobile.k1.f37122a;
                if (!k1Var.H()) {
                    bv.b.a();
                    if (!k1Var.F()) {
                        bv.b.a();
                        if (!k1Var.w()) {
                            t0 t0Var = new t0(str, str2, null);
                            n0Var.f110312a = null;
                            n0Var.f110313b = null;
                            n0Var.f110316e = 6;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, t0Var, n0Var);
                        } else {
                            r0 r0Var = new r0(str, str2, null);
                            n0Var.f110312a = str;
                            n0Var.f110313b = str2;
                            n0Var.f110316e = 4;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, r0Var, n0Var);
                            if (objJ != aVar) {
                                if (!(((v2) objJ) instanceof v2.b)) {
                                    objJ = null;
                                }
                                v2Var = (v2) objJ;
                                if (v2Var == null) {
                                    s0 s0Var = new s0(str, str2, null);
                                    n0Var.f110312a = null;
                                    n0Var.f110313b = null;
                                    n0Var.f110316e = 5;
                                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, s0Var, n0Var);
                                    break;
                                }
                                if (v2Var instanceof v2.b) {
                                    return v2Var;
                                }
                                v2.b bVar = (v2.b) v2Var;
                                return new v2.b(bVar.f47386a, bVar.f47387b, null, null, 12, null);
                            }
                        }
                    } else {
                        q0 q0Var = new q0(str, str2, null);
                        n0Var.f110312a = null;
                        n0Var.f110313b = null;
                        n0Var.f110316e = 3;
                        objJ = com.garmin.android.apps.connectmobile.f0.J(this, q0Var, n0Var);
                    }
                    break;
                } else {
                    o0 o0Var = new o0(str, str2, null);
                    n0Var.f110312a = str;
                    n0Var.f110313b = str2;
                    n0Var.f110316e = 1;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, o0Var, n0Var);
                    if (objJ != aVar) {
                        if (!(((v2) objJ) instanceof v2.b)) {
                            objJ = null;
                        }
                        v2Var = (v2) objJ;
                        if (v2Var == null) {
                            p0 p0Var = new p0(str, str2, null);
                            n0Var.f110312a = null;
                            n0Var.f110313b = null;
                            n0Var.f110316e = 2;
                            objJ = com.garmin.android.apps.connectmobile.f0.J(this, p0Var, n0Var);
                            break;
                        }
                        if (v2Var instanceof v2.b) {
                            return v2Var;
                        }
                        v2.b bVar2 = (v2.b) v2Var;
                        return new v2.b(bVar2.f47386a, bVar2.f47387b, null, null, 12, null);
                    }
                }
                return aVar;
            case 1:
                str2 = n0Var.f110313b;
                str = n0Var.f110312a;
                o13.r.b(objJ);
                if (!(((v2) objJ) instanceof v2.b)) {
                    objJ = null;
                }
                v2Var = (v2) objJ;
                if (v2Var == null) {
                    p0 p0Var2 = new p0(str, str2, null);
                    n0Var.f110312a = null;
                    n0Var.f110313b = null;
                    n0Var.f110316e = 2;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, p0Var2, n0Var);
                    break;
                }
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar3 = (v2.b) v2Var;
                return new v2.b(bVar3.f47386a, bVar3.f47387b, null, null, 12, null);
            case 2:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar4 = (v2.b) v2Var;
                return new v2.b(bVar4.f47386a, bVar4.f47387b, null, null, 12, null);
            case 3:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar5 = (v2.b) v2Var;
                return new v2.b(bVar5.f47386a, bVar5.f47387b, null, null, 12, null);
            case 4:
                str2 = n0Var.f110313b;
                str = n0Var.f110312a;
                o13.r.b(objJ);
                if (!(((v2) objJ) instanceof v2.b)) {
                    objJ = null;
                }
                v2Var = (v2) objJ;
                if (v2Var == null) {
                    s0 s0Var2 = new s0(str, str2, null);
                    n0Var.f110312a = null;
                    n0Var.f110313b = null;
                    n0Var.f110316e = 5;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(this, s0Var2, n0Var);
                    break;
                }
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar6 = (v2.b) v2Var;
                return new v2.b(bVar6.f47386a, bVar6.f47387b, null, null, 12, null);
            case 5:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar7 = (v2.b) v2Var;
                return new v2.b(bVar7.f47386a, bVar7.f47387b, null, null, 12, null);
            case 6:
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    return v2Var;
                }
                v2.b bVar8 = (v2.b) v2Var;
                return new v2.b(bVar8.f47386a, bVar8.f47387b, null, null, 12, null);
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // l52.y
    public final Object v(WorkoutDetailsDTO workoutDetailsDTO, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, workoutDetailsDTO, null), iVar);
    }

    @Override // l52.y
    public final Object y(long j8, long j14, com.garmin.android.apps.connectmobile.workouts.presentation.details.f.o.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p1(this, j8, j14, null), aVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll52/z$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final x a(a aVar) {
            aVar.getClass();
            return (x) ez0.b.a(ez0.b.f67468a, ez0.c.STATIC_ATP_GATEWAY, x.class, new c83.h.a[0], null, null, null, 120);
        }

        public static z b() {
            return new z((x) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x.class, new c83.h.a[0], null, null, null, 120), (a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null));
        }

        private a() {
        }
    }
}
