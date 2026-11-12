package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.g2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.k2;
import r53.p2;
import r53.q2;
import v01.b2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu21/t;", "Landroidx/lifecycle/u1;", "", "dailyCaloriesGoal", "Ls21/e;", "dailyMacroGoals", "", "isEditingExistingSettings", "Lv01/i0;", "getDefaultMealsUseCase", "Lv01/p0;", "getMealsUseCase", "Lv01/b2;", "saveMealSettingsUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Ljava/lang/Integer;Ls21/e;ZLv01/i0;Lv01/p0;Lv01/b2;Ls01/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f168131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21.e f168132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v01.i0 f168134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v01.p0 f168135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f168136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s01.f f168137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f168138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f168139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f168140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r53.b2 f168141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f168142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f168143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b11.j f168144n;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168145a;

        static {
            int[] iArr = new int[s21.c.values().length];
            try {
                iArr[s21.c.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.c.TIMELINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f168145a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lu21/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealSettingsViewModel$uiState$1", f = "MealSettingsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super s>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f168146a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f168146a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f168146a = 1;
                if (t.x4(t.this, this) == aVar) {
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

    public t(Integer num, s21.e eVar, boolean z14, v01.i0 i0Var, v01.p0 p0Var, b2 b2Var, s01.f fVar) {
        i0Var.getClass();
        p0Var.getClass();
        b2Var.getClass();
        fVar.getClass();
        this.f168131a = num;
        this.f168132b = eVar;
        this.f168133c = z14;
        this.f168134d = i0Var;
        this.f168135e = p0Var;
        this.f168136f = b2Var;
        this.f168137g = fVar;
        boolean zA = fVar.a();
        this.f168138h = zA;
        v21.f.f175333a.getClass();
        this.f168139i = v21.f.s(num) && eVar != null;
        p2 p2VarA = q2.a(new s(false, zA, null, z14, false, false, null, null, null, null, false, false, false, false, false, null, 65525, null));
        this.f168140j = p2VarA;
        r53.v vVar = new r53.v(new b(null), r53.s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f168141k = r53.s.K(vVar, aVarA, k2.a.f150706c, new s(true, zA, null, z14, false, false, null, null, null, null, false, false, false, false, false, null, 65524, null));
        p13.j0 j0Var = p13.j0.f134944a;
        this.f168142l = j0Var;
        this.f168143m = j0Var;
        v21.c.f175296a.getClass();
        this.f168144n = v21.c.b(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public static o13.p C4(ArrayList arrayList, s21.e0 e0Var, s21.e0 e0Var2) {
        b63.v vVarH4 = H4(arrayList);
        b63.v vVarG4 = G4(arrayList);
        if (vVarH4 == null) {
            vVarH4 = e0Var.f156100a;
        } else {
            if (e0Var.f156100a.compareTo(vVarH4) <= 0) {
                vVarH4 = null;
            }
            if (vVarH4 == null) {
                vVarH4 = e0Var.f156100a;
            }
        }
        if (vVarG4 == null) {
            vVarG4 = e0Var2.f156100a;
        } else {
            if (e0Var2.f156100a.compareTo(vVarG4) >= 0) {
                vVarG4 = null;
            }
            if (vVarG4 == null) {
                vVarG4 = e0Var2.f156100a;
            }
        }
        v21.f.f175333a.getClass();
        return new o13.p(s21.e0.a(e0Var, v21.f.y(vVarH4), null, 6), s21.e0.a(e0Var2, v21.f.d(vVarG4), v21.f.u(vVarH4), 4));
    }

    public static o13.p D4(t tVar, ArrayList arrayList) {
        s21.e0 e0Var = ((s) tVar.f168140j.getValue()).f168119h;
        s21.e0 e0Var2 = ((s) tVar.f168140j.getValue()).f168120i;
        tVar.getClass();
        return C4(arrayList, e0Var, e0Var2);
    }

    public static ArrayList F4(List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((q01.e) next).f141996d);
        q01.e eVar = (q01.e) next;
        return p13.h0.C0(p13.h0.z0(list, eVar != null ? p13.a1.b(eVar) : p13.l0.f134950a), p13.x.l(eVar != null ? q01.e.a(eVar, null, true, false, null, null, null, 0, 4079) : null));
    }

    public static b63.v G4(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s21.l lVar = ((s21.k) it.next()).f156141e;
            b63.v vVar = lVar != null ? lVar.f156146b : null;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return (b63.v) p13.h0.o0(arrayList);
    }

    public static b63.v H4(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s21.l lVar = ((s21.k) it.next()).f156141e;
            b63.v vVar = lVar != null ? lVar.f156145a : null;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return (b63.v) p13.h0.t0(arrayList);
    }

    public static boolean J4(s21.c cVar, List list, s21.e0 e0Var, s21.e0 e0Var2) {
        boolean z14;
        o21.a aVar;
        o21.a aVar2;
        int i14 = a.f168145a[cVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                lc.u0.r();
                return false;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        s21.k kVar = (s21.k) it.next();
                        if (kVar.f156140d || kVar.f156144h != null) {
                            z14 = true;
                        }
                    } else {
                        z14 = false;
                    }
                }
            } else {
                z14 = false;
            }
            boolean z15 = ((e0Var == null || (aVar2 = e0Var.f156103d) == null || !aVar2.f128640a) && (e0Var2 == null || (aVar = e0Var2.f156103d) == null || !aVar.f128640a)) ? false : true;
            if (z14 || z15) {
                return false;
            }
        }
        return true;
    }

    public static boolean K4(t tVar, s21.c cVar, List list, s21.e0 e0Var, s21.e0 e0Var2, int i14) {
        if ((i14 & 1) != 0) {
            cVar = ((s) tVar.f168140j.getValue()).f168114c;
        }
        if ((i14 & 4) != 0) {
            e0Var = ((s) tVar.f168140j.getValue()).f168119h;
        }
        if ((i14 & 8) != 0) {
            e0Var2 = ((s) tVar.f168140j.getValue()).f168120i;
        }
        tVar.getClass();
        return J4(cVar, list, e0Var, e0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x027e  */
    /* JADX WARN: Code duplicated, block: B:159:0x03cc A[PHI: r12
      0x03cc: PHI (r12v12 ??) = (r12v5 ??), (r12v7 ??) binds: [B:158:0x03ca, B:163:0x03d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x03e1 A[PHI: r14
      0x03e1: PHI (r14v10 ??) = (r14v3 ??), (r14v5 ??) binds: [B:167:0x03df, B:172:0x03ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x03fa A[PHI: r3
      0x03fa: PHI (r3v21 ??) = (r3v16 ??), (r3v18 ??) binds: [B:176:0x03f8, B:181:0x0406] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r1 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r1 == r8) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3, types: [k01.d] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r54v0, types: [u21.t] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(t tVar, v13.c cVar) throws Throwable {
        v vVar;
        Object value;
        v2 v2Var;
        Object value2;
        double dDoubleValue;
        Double d14;
        double dDoubleValue2;
        Double d15;
        double dDoubleValue3;
        Double d16;
        Double d17;
        Map linkedHashMap;
        ?? r14;
        Integer num;
        boolean z14;
        Throwable th3;
        Object eVar;
        r53.b2 b2Var = tVar.f168141k;
        Integer num2 = tVar.f168131a;
        boolean z15 = tVar.f168139i;
        boolean z16 = tVar.f168133c;
        p2 p2Var = tVar.f168140j;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f168172c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f168172c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(tVar, cVar);
            }
        } else {
            vVar = new v(tVar, cVar);
        }
        Object objE0 = vVar.f168170a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f168172c;
        boolean z17 = false;
        boolean z18 = true;
        Throwable th4 = null;
        if (i15 == 0) {
            o13.r.b(objE0);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s.a((s) value, true, null, false, null, null, null, null, false, false, false, false, false, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE)));
            if (z16) {
                v01.p0 p0Var = tVar.f168135e;
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                vVar.f168172c = 1;
                objE0 = ge1.b.e0(p0Var.f174501d, new v01.o0(true, p0Var, oVarD, false, null), vVar);
            } else {
                th4 = null;
                v01.i0 i0Var = tVar.f168134d;
                vVar.f168172c = 2;
                objE0 = ge1.b.e0(i0Var.f174403b, new v01.h0(i0Var, null), vVar);
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
            v2Var = (v2) objE0;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
            th4 = null;
            v2Var = (v2) objE0;
        }
        if (v2Var instanceof v2.b) {
            s21.c.a aVar2 = s21.c.f156079a;
            g01.z zVar = (g01.z) ((v2.b) v2Var).f47386a;
            l01.e eVar2 = zVar.f74298e;
            boolean zE = tVar.f168137g.e();
            aVar2.getClass();
            s21.c cVarA = s21.c.a.a(eVar2, zE);
            Iterable iterable = zVar.f74294a;
            if (iterable == null) {
                iterable = p13.j0.f134944a;
            }
            List<g01.x> listN0 = p13.h0.N0(iterable, new u());
            ArrayList<q01.e> arrayList = new ArrayList();
            for (g01.x xVar : listN0) {
                xVar.getClass();
                Integer num3 = xVar.f74275b;
                if (num3 != null) {
                    int iIntValue = num3.intValue();
                    String str = xVar.f74276c;
                    if (str == null) {
                        z14 = z15;
                        th3 = th4;
                        eVar = th3;
                    } else {
                        Long l14 = xVar.f74274a;
                        th3 = th4;
                        Boolean bool = xVar.f74282i;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : z18;
                        Boolean bool2 = xVar.f74281h;
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : z17;
                        Boolean bool3 = xVar.f74283j;
                        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : z17;
                        b63.v vVar2 = xVar.f74278e;
                        b63.v vVar3 = xVar.f74279f;
                        Integer num4 = xVar.f74277d;
                        z14 = z15;
                        k01.d dVar = xVar.f74280g;
                        eVar = new q01.e(iIntValue, l14, str, zBooleanValue, zBooleanValue2, zBooleanValue3, vVar2, vVar3, num4, (dVar == null || !z14) ? th3 : dVar, 0, xVar.f74284k, 1024, null);
                    }
                } else {
                    z14 = z15;
                    th3 = th4;
                    eVar = th3;
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
                th4 = th3;
                z15 = z14;
                z18 = true;
                z17 = false;
            }
            boolean z19 = z15;
            Throwable th5 = th4;
            tVar.f168143m = arrayList;
            if (cVarA == s21.c.TIMELINE) {
                arrayList = F4(arrayList);
            }
            tVar.f168142l = arrayList;
            if (z19) {
                if (z16) {
                    v21.c.f175296a.getClass();
                    if (num2 == null) {
                        linkedHashMap = p13.k0.f134949a;
                        linkedHashMap.getClass();
                    } else {
                        if (num2.intValue() <= 0) {
                            r14 = num2;
                            r14 = th5;
                        }
                        if (r14 != 0) {
                            int iIntValue2 = r14.intValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                q01.e eVar3 = (q01.e) obj;
                                eVar3.getClass();
                                if (eVar3.f141997e) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                k01.d dVar2 = ((q01.e) it.next()).f142002j;
                                arrayList3.add(Double.valueOf((((double) ((dVar2 == null || (num = dVar2.f102022a) == null) ? 0 : num.intValue())) / ((double) iIntValue2)) * 100.0d));
                            }
                            v21.f.f175333a.getClass();
                            ArrayList arrayListG = v21.f.g(arrayList3);
                            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList2, 10));
                            int i16 = 0;
                            for (Object obj2 : arrayList2) {
                                int i17 = i16 + 1;
                                if (i16 < 0) {
                                    p13.x.q();
                                    throw th5;
                                }
                                arrayList4.add(new o13.p(Integer.valueOf(((q01.e) obj2).f141993a), arrayListG.get(i16)));
                                i16 = i17;
                            }
                            Map mapL = p13.u0.l(arrayList4);
                            int iA = p13.t0.a(p13.y.r(arrayList, 10));
                            linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                            for (q01.e eVar4 : arrayList) {
                                Integer numValueOf = Integer.valueOf(eVar4.f141993a);
                                Integer num5 = (Integer) mapL.get(Integer.valueOf(eVar4.f141993a));
                                o13.p pVar = new o13.p(numValueOf, Integer.valueOf(num5 != null ? num5.intValue() : 0));
                                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                            }
                        } else {
                            linkedHashMap = p13.k0.f134949a;
                            linkedHashMap.getClass();
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        ?? r15 = tVar.f168142l;
                        ArrayList arrayList5 = new ArrayList(p13.y.r(r15, 10));
                        for (q01.e eVar5 : r15) {
                            Integer num6 = (Integer) linkedHashMap.get(Integer.valueOf(eVar5.f141993a));
                            arrayList5.add(q01.e.a(eVar5, null, false, false, null, null, null, num6 != null ? num6.intValue() : 0, 3071));
                        }
                        tVar.f168142l = arrayList5;
                    }
                } else {
                    ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        k01.d dVar3 = ((q01.e) it3.next()).f142002j;
                        arrayList6.add(Double.valueOf(((dVar3 == null || (d17 = dVar3.f102030i) == null) ? 0.0d : d17.doubleValue()) * 100.0d));
                    }
                    v21.f.f175333a.getClass();
                    ArrayList arrayListG2 = v21.f.g(arrayList6);
                    ?? r16 = tVar.f168142l;
                    ArrayList arrayList7 = new ArrayList(p13.y.r(r16, 10));
                    int i18 = 0;
                    for (Object obj3 : r16) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw th5;
                        }
                        q01.e eVar6 = (q01.e) obj3;
                        arrayList7.add(new s21.j(eVar6.f141993a, eVar6.f141995c, eVar6.f141998f, ((Number) arrayListG2.get(i18)).intValue(), null, null, null, null));
                        i18 = i19;
                    }
                    v21.c cVar2 = v21.c.f175296a;
                    b11.j jVar = tVar.f168144n;
                    s21.e eVar7 = tVar.f168132b;
                    cVar2.getClass();
                    List listA = v21.c.a(arrayList7, num2, jVar, eVar7);
                    int iA2 = p13.t0.a(p13.y.r(listA, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj4 : (ArrayList) listA) {
                        linkedHashMap2.put(Integer.valueOf(((s21.j) obj4).f156129a), obj4);
                    }
                    ?? r17 = tVar.f168142l;
                    ArrayList arrayList8 = new ArrayList(p13.y.r(r17, 10));
                    Iterator it4 = r17.iterator();
                    while (it4.hasNext()) {
                        q01.e eVarA = (q01.e) it4.next();
                        int i24 = eVarA.f141993a;
                        k01.d dVar4 = eVarA.f142002j;
                        s21.j jVar2 = (s21.j) linkedHashMap2.get(Integer.valueOf(i24));
                        if (jVar2 == null) {
                            it4 = it4;
                        } else {
                            Integer num7 = jVar2.f156133e;
                            ?? r18 = jVar2.f156134f;
                            if (r18 == 0) {
                                if (dVar4 != null) {
                                    d14 = dVar4.f102025d;
                                } else {
                                    r18 = th5;
                                }
                                if (r18 != 0) {
                                    r18 = d14;
                                    dDoubleValue = r18.doubleValue();
                                } else {
                                    r18 = d14;
                                    dDoubleValue = 0.0d;
                                }
                            } else {
                                r18 = d14;
                                dDoubleValue = r18.doubleValue();
                            }
                            ?? r19 = jVar2.f156135g;
                            if (r19 == 0) {
                                if (dVar4 != null) {
                                    d15 = dVar4.f102024c;
                                } else {
                                    r19 = th5;
                                }
                                if (r19 != 0) {
                                    r19 = d15;
                                    dDoubleValue2 = r19.doubleValue();
                                } else {
                                    r19 = d15;
                                    dDoubleValue2 = 0.0d;
                                }
                            } else {
                                r19 = d15;
                                dDoubleValue2 = r19.doubleValue();
                            }
                            ?? r24 = jVar2.f156136h;
                            if (r24 == 0) {
                                if (dVar4 != null) {
                                    d16 = dVar4.f102026e;
                                } else {
                                    r24 = th5;
                                }
                                if (r24 != 0) {
                                    r24 = d16;
                                    dDoubleValue3 = r24.doubleValue();
                                } else {
                                    r24 = d16;
                                    dDoubleValue3 = 0.0d;
                                }
                            } else {
                                r24 = d16;
                                dDoubleValue3 = r24.doubleValue();
                            }
                            eVarA = q01.e.a(eVarA, null, false, false, null, null, new k01.d(num7, (Integer) null, Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue3), (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 16777186, (p005kotlin.jvm.internal.j) null), jVar2.f156132d, 2559);
                        }
                        arrayList8.add(eVarA);
                        it4 = it4;
                    }
                    tVar.f168142l = arrayList8;
                }
            }
            ArrayList arrayListS4 = tVar.S4(tVar.f168142l, cVarA, false);
            b63.v vVar4 = zVar.f74296c;
            if (vVar4 == null) {
                vVar4 = ((s) b2Var.f150540a.getValue()).f168119h.f156100a;
            }
            b63.v vVar5 = vVar4;
            b63.v vVar6 = zVar.f74297d;
            if (vVar6 == null) {
                vVar6 = ((s) b2Var.f150540a.getValue()).f168120i.f156100a;
            }
            s21.e0 e0Var = new s21.e0(vVar5, null, null, null, 14, null);
            v21.f.f175333a.getClass();
            o13.p pVarC4 = C4(arrayListS4, e0Var, new s21.e0(vVar6, v21.f.u(vVar5), null, null, 12, null));
            s21.e0 e0Var2 = (s21.e0) pVarC4.f128594a;
            s21.e0 e0Var3 = (s21.e0) pVarC4.f128595b;
            while (true) {
                Object value3 = p2Var.getValue();
                ArrayList arrayList9 = arrayListS4;
                s21.e0 e0Var4 = e0Var3;
                s21.e0 e0Var5 = e0Var2;
                s21.c cVar3 = cVarA;
                if (p2Var.b(value3, s.a((s) value3, false, cVar3, false, arrayList9, e0Var5, e0Var4, null, J4(cVarA, arrayListS4, e0Var2, e0Var3), false, false, false, false, null, 64010))) {
                    break;
                }
                cVarA = cVar3;
                arrayListS4 = arrayList9;
                e0Var2 = e0Var5;
                e0Var3 = e0Var4;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, s.a((s) value2, false, null, true, null, null, null, null, false, false, false, false, false, null, 64494)));
        }
        return Unit.INSTANCE;
    }

    public final void A4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168140j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, null, 60927)));
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168140j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, null, 32767)));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void E4() {
        int i14;
        LinkedHashMap linkedHashMap;
        s21.j jVar;
        ArrayList arrayList;
        int i15;
        k01.d dVarA;
        v21.c cVar = v21.c.f175296a;
        ?? r14 = this.f168142l;
        cVar.getClass();
        Double dValueOf = Double.valueOf(0.0d);
        int i16 = 0;
        r14.getClass();
        b11.j jVar2 = this.f168144n;
        jVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : r14) {
            q01.e eVar = (q01.e) obj;
            eVar.getClass();
            if (eVar.f141997e) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i17 = 10;
        if (size == 0) {
            i14 = 10;
            linkedHashMap = null;
        } else {
            int i18 = 100 / size;
            int i19 = 100 % size;
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
            int i24 = 0;
            for (Object obj2 : arrayList2) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList3.add(new o13.p(Integer.valueOf(((q01.e) obj2).f141993a), Integer.valueOf((i24 == 0 ? i19 : i16) + i18)));
                i24 = i25;
                i16 = 0;
            }
            Map mapL = p13.u0.l(arrayList3);
            ArrayList arrayList4 = new ArrayList(p13.y.r(r14, 10));
            for (q01.e eVar2 : r14) {
                eVar2.getClass();
                boolean z14 = eVar2.f141997e;
                int i26 = eVar2.f141993a;
                if (z14) {
                    arrayList = arrayList4;
                    i15 = i17;
                    jVar = new s21.j(i26, eVar2.f141995c, eVar2.f141998f, ((Number) mapL.getOrDefault(Integer.valueOf(i26), 0)).intValue(), null, null, null, null);
                } else {
                    arrayList = arrayList4;
                    i15 = i17;
                    jVar = new s21.j(i26, eVar2.f141995c, eVar2.f141998f, 0, 0, dValueOf, dValueOf, dValueOf);
                }
                arrayList.add(jVar);
                arrayList4 = arrayList;
                i17 = i15;
            }
            i14 = i17;
            List listA = v21.c.a(arrayList4, this.f168131a, jVar2, this.f168132b);
            int iA = p13.t0.a(p13.y.r(listA, i14));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj3 : (ArrayList) listA) {
                linkedHashMap.put(Integer.valueOf(((s21.j) obj3).f156129a), obj3);
            }
        }
        if (linkedHashMap == null) {
            return;
        }
        ?? r15 = this.f168142l;
        ArrayList arrayList5 = new ArrayList(p13.y.r(r15, i14));
        for (q01.e eVarA : r15) {
            int i27 = eVarA.f141993a;
            k01.d dVar = eVarA.f142002j;
            s21.j jVar3 = (s21.j) linkedHashMap.get(Integer.valueOf(i27));
            if (jVar3 != null) {
                if (dVar != null) {
                    Integer num = jVar3.f156133e;
                    if (num == null) {
                        num = dVar.f102022a;
                    }
                    Double d14 = jVar3.f156134f;
                    double dDoubleValue = (d14 == null && (d14 = dVar.f102025d) == null) ? 0.0d : d14.doubleValue();
                    Double d15 = jVar3.f156135g;
                    double dDoubleValue2 = (d15 == null && (d15 = dVar.f102024c) == null) ? 0.0d : d15.doubleValue();
                    Double d16 = jVar3.f156136h;
                    dVarA = k01.d.a(dVar, num, Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue), Double.valueOf((d16 == null && (d16 = dVar.f102026e) == null) ? 0.0d : d16.doubleValue()));
                } else {
                    dVarA = null;
                }
                eVarA = q01.e.a(eVarA, null, false, false, null, null, dVarA, jVar3.f156132d, 2559);
            }
            arrayList5.add(eVarA);
        }
        this.f168142l = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.List] */
    public final s21.d0 I4() {
        ArrayList arrayList;
        s21.c cVar = ((s) this.f168140j.getValue()).f168114c;
        ?? r14 = this.f168143m;
        int iA = p13.t0.a(p13.y.r(r14, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : r14) {
            linkedHashMap.put(Integer.valueOf(((q01.e) obj).f141993a), obj);
        }
        int i14 = a.f168145a[cVar.ordinal()];
        if (i14 == 1) {
            ?? r15 = this.f168142l;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : r15) {
                q01.e eVar = (q01.e) obj2;
                if (eVar.f141997e && eVar.f141996d) {
                    arrayList2.add(obj2);
                }
            }
            ?? r16 = this.f168142l;
            ArrayList<q01.e> arrayList3 = new ArrayList(p13.y.r(r16, 10));
            for (q01.e eVarA : r16) {
                if (eVarA.f141996d && eVarA.f141997e && L4(eVarA, arrayList2)) {
                    q01.e eVar2 = (q01.e) linkedHashMap.get(Integer.valueOf(eVarA.f141993a));
                    eVarA = q01.e.a(eVarA, null, false, false, eVar2 != null ? eVar2.f141999g : null, eVar2 != null ? eVar2.f142000h : null, null, 0, 3903);
                }
                arrayList3.add(eVarA);
            }
            arrayList = new ArrayList(p13.y.r(arrayList3, 10));
            for (q01.e eVarA2 : arrayList3) {
                if (eVarA2.f141996d && L4(eVarA2, arrayList3)) {
                    eVarA2 = q01.e.a(eVarA2, null, false, false, null, null, null, 0, 3903);
                }
                arrayList.add(eVarA2);
            }
        } else {
            if (i14 != 2) {
                lc.u0.r();
                return null;
            }
            ?? r17 = this.f168142l;
            arrayList = new ArrayList(p13.y.r(r17, 10));
            for (q01.e eVarA3 : r17) {
                if (eVarA3.f141996d && !eVarA3.f141997e && L4(eVarA3, this.f168142l)) {
                    eVarA3 = q01.e.a(eVarA3, null, false, false, null, null, null, 0, 3903);
                }
                arrayList.add(eVarA3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add(T4((q01.e) it.next(), s21.c.TIMELINE, arrayList, false));
        }
        o13.p pVarD4 = D4(this, arrayList4);
        return new s21.d0(arrayList, cVar, ((s21.e0) pVarD4.f128594a).f156100a, ((s21.e0) pVarD4.f128595b).f156100a);
    }

    public final boolean L4(q01.e eVar, List<q01.e> list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (q01.e eVar2 : list) {
            if (eVar2.f141993a != eVar.f141993a && M4(eVar, eVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean M4(q01.e eVar, q01.e eVar2) {
        b63.v vVar;
        b63.v vVar2;
        b63.v vVar3;
        b63.v vVar4 = eVar.f141999g;
        if (vVar4 == null || (vVar = eVar.f142000h) == null || (vVar2 = eVar2.f141999g) == null || (vVar3 = eVar2.f142000h) == null) {
            return false;
        }
        if (this.f168138h) {
            return vVar4.compareTo(vVar3) <= 0 && vVar.compareTo(vVar2) >= 0;
        }
        return vVar4.compareTo(vVar3) < 0 && vVar.compareTo(vVar2) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.lang.Object] */
    public final void N4(s21.c cVar) {
        Object value;
        cVar.getClass();
        p2 p2Var = this.f168140j;
        if (((s) p2Var.getValue()).f168114c == cVar) {
            return;
        }
        if (cVar == s21.c.TIMELINE) {
            ?? r14 = this.f168142l;
            ArrayList arrayList = new ArrayList();
            for (Object obj : r14) {
                if (((q01.e) obj).f141997e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayListF4 = F4(this.f168142l);
            this.f168142l = arrayListF4;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayListF4) {
                if (((q01.e) obj2).f141997e) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList.size() != arrayList2.size() && this.f168139i) {
                E4();
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, true, null, 49151)));
            }
        }
        List<s21.k> listU4 = U4(this.f168142l, cVar, S4(this.f168142l, cVar, false), ((s) p2Var.getValue()).f168119h, ((s) p2Var.getValue()).f168120i);
        while (true) {
            Object value2 = p2Var.getValue();
            List<s21.k> list = listU4;
            if (p2Var.b(value2, s.a((s) value2, false, cVar, false, list, null, null, null, K4(this, cVar, list, null, null, 12), false, false, false, false, null, 64443))) {
                return;
            } else {
                listU4 = list;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void O4(b63.v vVar) {
        t tVar = this;
        b63.v vVar2 = vVar;
        vVar2.getClass();
        p2 p2Var = tVar.f168140j;
        if (p005kotlin.jvm.internal.s.g(((s) p2Var.getValue()).f168120i.f156100a, vVar2)) {
            return;
        }
        b63.v vVarG4 = G4(((s) p2Var.getValue()).f168118g);
        s21.c cVar = ((s) p2Var.getValue()).f168114c;
        t tVar2 = tVar;
        while (true) {
            Object value = p2Var.getValue();
            s sVar = (s) value;
            s21.e0 e0Var = new s21.e0(vVar2, null, null, (vVarG4 == null || vVar2.compareTo(vVarG4) >= 0) ? null : new o21.a(true, Integer.valueOf(R.string.timeline_stop_error)), 6, null);
            s21.c cVar2 = cVar;
            List<s21.k> listU4 = tVar2.U4(tVar2.f168142l, cVar2, sVar.f168118g, sVar.f168119h, e0Var);
            if (p2Var.b(value, s.a(sVar, false, null, false, listU4, null, e0Var, null, K4(this, null, listU4, sVar.f168119h, e0Var, 1), false, false, false, false, null, 64191))) {
                return;
            }
            tVar2 = this;
            vVar2 = vVar;
            cVar = cVar2;
        }
    }

    public final void P4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168140j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, true, false, null, 57343)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void Q4(List<s21.j> list) {
        Object next;
        list.getClass();
        ?? r14 = this.f168142l;
        ArrayList arrayList = new ArrayList(p13.y.r(r14, 10));
        for (q01.e eVarA : r14) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((s21.j) next).f156129a != eVarA.f141993a);
            s21.j jVar = (s21.j) next;
            if (jVar != null) {
                k01.d dVar = eVarA.f142002j;
                eVarA = q01.e.a(eVarA, null, false, false, null, null, dVar != null ? k01.d.a(dVar, jVar.f156133e, jVar.f156135g, jVar.f156134f, jVar.f156136h) : null, jVar.f156132d, 2559);
            }
            arrayList.add(eVarA);
        }
        this.f168142l = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    public final void R4(b63.v vVar) {
        t tVar = this;
        b63.v vVar2 = vVar;
        vVar2.getClass();
        p2 p2Var = tVar.f168140j;
        if (p005kotlin.jvm.internal.s.g(((s) p2Var.getValue()).f168119h.f156100a, vVar2)) {
            return;
        }
        b63.v vVarH4 = H4(((s) p2Var.getValue()).f168118g);
        s21.c cVar = ((s) p2Var.getValue()).f168114c;
        t tVar2 = tVar;
        while (true) {
            Object value = p2Var.getValue();
            s sVar = (s) value;
            s21.e0 e0Var = new s21.e0(vVar2, null, null, (vVarH4 == null || vVar2.compareTo(vVarH4) <= 0) ? null : new o21.a(true, Integer.valueOf(R.string.timeline_start_error)), 6, null);
            s21.e0 e0Var2 = sVar.f168120i;
            v21.f.f175333a.getClass();
            s21.e0 e0VarA = s21.e0.a(e0Var2, null, v21.f.u(vVar), 13);
            s21.c cVar2 = cVar;
            List<s21.k> listU4 = tVar2.U4(tVar2.f168142l, cVar2, sVar.f168118g, e0Var, e0VarA);
            if (p2Var.b(value, s.a(sVar, false, null, false, listU4, e0Var, e0VarA, null, K4(this, null, listU4, e0Var, e0VarA, 1), false, false, false, false, null, 64063))) {
                return;
            }
            tVar2 = this;
            vVar2 = vVar;
            cVar = cVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    public final ArrayList S4(List list, s21.c cVar, boolean z14) {
        boolean z15;
        Object next;
        ArrayList<q01.e> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q01.e) obj).f141997e) {
                arrayList.add(obj);
            }
        }
        List<s21.k> list2 = ((s) this.f168140j.getValue()).f168118g;
        ArrayList arrayList2 = new ArrayList();
        for (q01.e eVar : arrayList) {
            if (z14) {
                z15 = true;
            } else {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((s21.k) next).f156137a != eVar.f141993a);
                s21.k kVar = (s21.k) next;
                if (kVar != null && kVar.f156140d && kVar.f156141e == null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            arrayList2.add(T4(eVar, cVar, arrayList, z15));
        }
        return arrayList2;
    }

    public final s21.k T4(q01.e eVar, s21.c cVar, ArrayList arrayList, boolean z14) {
        Integer numValueOf;
        Integer num;
        String str;
        String str2;
        boolean z15 = eVar.f141996d;
        b63.v vVar = eVar.f141999g;
        b63.v vVar2 = eVar.f142000h;
        if (!z15) {
            if (cVar == s21.c.TIMELINE) {
                c22.x0.f23314a.getClass();
                str2 = c22.x0.f23630se;
            } else {
                str2 = null;
            }
            return new s21.k(eVar.f141993a, eVar.f141995c, eVar.f141998f, false, null, this.f168139i, str2 != null ? g2.b(str2) : null, null, SyslogConstants.LOG_LOCAL2, null);
        }
        if (cVar != s21.c.TIMELINE) {
            return new s21.k(eVar.f141993a, eVar.f141995c, eVar.f141998f, false, null, true, null, null, 216, null);
        }
        boolean z16 = (vVar == null || vVar2 == null) ? false : true;
        if (!z15 || vVar == null || vVar2 == null) {
            num = null;
        } else {
            if (vVar.compareTo(vVar2) >= 0) {
                numValueOf = Integer.valueOf(R.string.start_and_stop_times_warning_msg);
            } else {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            q01.e eVar2 = (q01.e) it.next();
                            if (eVar2.f141993a != eVar.f141993a && eVar2.f141996d && M4(eVar, eVar2)) {
                                numValueOf = Integer.valueOf(R.string.msg_meal_windows_overlapping_error);
                            }
                        }
                    }
                }
                num = null;
            }
            num = numValueOf;
        }
        int i14 = eVar.f141993a;
        String str3 = eVar.f141995c;
        boolean z17 = eVar.f141998f;
        boolean z18 = num != null || (!z16 && z14);
        s21.l lVar = z16 ? new s21.l(vVar, vVar2) : null;
        if (z16) {
            str = null;
        } else {
            c22.x0.f23314a.getClass();
            str = c22.x0.Ke;
        }
        return new s21.k(i14, str3, z17, z18, lVar, true, str != null ? g2.b(str) : null, num);
    }

    public final List<s21.k> U4(List<q01.e> list, s21.c cVar, List<s21.k> list2, s21.e0 e0Var, s21.e0 e0Var2) {
        return !J4(cVar, list2, e0Var, e0Var2) ? S4(list, cVar, true) : list2;
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168140j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, null, 57343)));
    }

    public final void z4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168140j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, null, 49151)));
    }
}
