package pv1;

import android.content.Context;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import gg1.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import jv1.e0;
import kv1.q;
import kv1.y;
import lc.u0;
import o13.p;
import o13.r;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpv1/b;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends j0 {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final /* synthetic */ int f141488i1 = 0;
    public final t H0;
    public final t I0;
    public final y0 J0;
    public final y0 K0;
    public final p2 L0;
    public final b2 M0;
    public final p2 N0;
    public final b2 O0;
    public mv1.a P0;
    public mv1.b Q0;
    public final p2 R0;
    public final b2 S0;
    public long T;
    public Boolean T0;
    public mv1.d U0;
    public final p2 V0;
    public final b2 W0;
    public Integer X;
    public mv1.c X0;
    public vt1.o Y;
    public final p2 Y0;
    public final b2 Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final p2 f141489a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final b2 f141490b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final p2 f141491c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final b2 f141492d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f141493e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public mv1.a f141494f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public mv1.b f141495g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f141496h1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public e0 f141497k0;
    public final t I = o13.m.b(new pk0.m(15));
    public final t P = o13.m.b(new pk0.m(16));
    public vt1.h Z = vt1.h.NONE;

    static {
        new a(null);
    }

    public b() {
        tw1.k.a aVar = tw1.k.f166742d;
        this.f141497k0 = new e0(null, null, null, null, null, 31, null);
        t tVarB = o13.m.b(new pk0.m(17));
        this.H0 = tVarB;
        this.I0 = o13.m.b(new pk0.m(18));
        this.J0 = (y0) tVarB.getValue();
        this.K0 = h5();
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.L0 = p2VarA;
        this.M0 = s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.N0 = p2VarA2;
        this.O0 = s.d(p2VarA2);
        boolean z14 = false;
        boolean z15 = false;
        this.P0 = new mv1.a(null, z14, z15, null, null, null, null, null, null, 511, null);
        u5("FBTEditPreferencesFragment2");
        p2 p2VarA3 = q2.a(null);
        this.R0 = p2VarA3;
        this.S0 = s.d(p2VarA3);
        this.U0 = new mv1.d(null, null, 3, null);
        p2 p2VarA4 = q2.a(null);
        this.V0 = p2VarA4;
        this.W0 = s.d(p2VarA4);
        this.X0 = new mv1.c(null, 1, null);
        p2 p2VarA5 = q2.a(null);
        this.Y0 = p2VarA5;
        this.Z0 = s.d(p2VarA5);
        p2 p2VarA6 = q2.a(null);
        this.f141489a1 = p2VarA6;
        this.f141490b1 = s.d(p2VarA6);
        p2 p2VarA7 = q2.a(null);
        this.f141491c1 = p2VarA7;
        this.f141492d1 = s.d(p2VarA7);
    }

    public static final List X4(b bVar, List list, List list2) {
        ArrayList arrayList;
        bVar.getClass();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                String str = (String) obj;
                if (list2 != null && list2.contains(str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? list : arrayList;
    }

    public static final int Y4(b bVar) {
        Integer num = bVar.X;
        return num != null ? num.intValue() : ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
    }

    public static final y Z4(b bVar) {
        return (y) bVar.I.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        if (r18.A5(r3) == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        if (r18.B5(r3) == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r18.B5(r3) == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c6, code lost:
    
        if (r18.A5(r3) == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (r18.A5(r3) == r4) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a5(b bVar, v13.c cVar) {
        l lVar;
        Object lVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        tw1.k kVar;
        v2 v2Var;
        p2 p2Var = bVar.N0;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i24 = lVar.f141600f;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                lVar.f141600f = i24 - Integer.MIN_VALUE;
            } else {
                lVar = new l(bVar, cVar);
            }
        } else {
            lVar = new l(bVar, cVar);
        }
        Object obj = lVar.f141598d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        switch (lVar.f141600f) {
            case 0:
                r.b(obj);
                if (bVar.e5()) {
                    tw1.k kVar2 = bVar.P0.f121163a;
                    tw1.k kVar3 = tw1.k.INTERMEDIATE;
                    lVar2 = null;
                    if (kVar2 != kVar3) {
                        i14 = 0;
                    } else {
                        mv1.a aVar = (mv1.a) p2Var.getValue();
                        if ((aVar != null ? aVar.f121163a : null) == tw1.k.BEGINNER) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                    }
                    if (bVar.P0.f121163a != tw1.k.BEGINNER) {
                        i15 = 0;
                    } else {
                        mv1.a aVar2 = (mv1.a) p2Var.getValue();
                        if ((aVar2 != null ? aVar2.f121163a : null) == kVar3) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                    }
                    if (i14 != 0) {
                        mv1.a aVar3 = (mv1.a) p2Var.getValue();
                        if (aVar3 != null && (kVar = aVar3.f121163a) != null) {
                            lVar2 = new tw1.l(Integer.valueOf(kVar.f166747a), kVar.f166748b);
                        }
                        tw1.l lVar3 = lVar2;
                        if (lVar3 != 0) {
                            kv1.b bVarD5 = bVar.d5();
                            long j8 = bVar.T;
                            lVar.f141595a = i14;
                            lVar.f141596b = i15;
                            lVar.f141597c = 0;
                            lVar.f141600f = 1;
                            bVarD5.getClass();
                            Object objJ = f0.J(bVarD5, new kv1.s(bVarD5, j8, lVar3, null), lVar);
                            if (objJ != obj2) {
                                i18 = i14;
                                obj = objJ;
                                i19 = 0;
                                v2Var = (v2) obj;
                                if (v2Var instanceof v2.b) {
                                    lVar.f141595a = i18;
                                    lVar.f141596b = i15;
                                    lVar.f141597c = i19;
                                    lVar.f141600f = 2;
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    v2.a aVar4 = (v2.a) v2Var;
                                    String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar4.f47383a, "Error occurred while updating training level ");
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.f(a2Var, "EventBaseViewModel", strD);
                                    bVar.h5().j(g3.a.a(g3.f35298f, null, aVar4.f47383a, null, null, 13));
                                }
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i15 == 0) {
                        lVar.f141595a = i14;
                        lVar.f141596b = i15;
                        lVar.f141600f = 6;
                    } else {
                        mv1.a aVar6 = (mv1.a) bVar.N0.getValue();
                        List<tw1.h> list = aVar6 != null ? aVar6.f121170h : null;
                        if (list != null) {
                            kv1.b bVarD6 = bVar.d5();
                            long j14 = bVar.T;
                            lVar.f141595a = i14;
                            lVar.f141596b = i15;
                            lVar.f141597c = 0;
                            lVar.f141600f = 3;
                            bVarD6.getClass();
                            Object objJ2 = f0.J(bVarD6, new q(bVarD6, j14, list, null), lVar);
                            if (objJ2 != obj2) {
                                int i25 = i15;
                                i16 = i14;
                                obj = objJ2;
                                i17 = i25;
                                lVar2 = (v2) obj;
                                i14 = i16;
                                i15 = i17;
                                if (lVar2 instanceof v2.b) {
                                    lVar.f141595a = i14;
                                    lVar.f141596b = i15;
                                    lVar.f141600f = 4;
                                } else {
                                    if (lVar2 instanceof v2.a) {
                                        v2.a aVar7 = (v2.a) lVar2;
                                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar7.f47383a, "Error updating supplemental sports ");
                                        i2.a aVar8 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar8.getClass();
                                        i2.a.f(a2Var2, "EventBaseViewModel", strD2);
                                        bVar.h5().j(g3.a.a(g3.f35298f, null, aVar7.f47383a, null, null, 13));
                                        return Unit.INSTANCE;
                                    }
                                    lVar.f141595a = i14;
                                    lVar.f141596b = i15;
                                    lVar.f141600f = 5;
                                }
                            }
                        } else if (lVar2 instanceof v2.b) {
                            lVar.f141595a = i14;
                            lVar.f141596b = i15;
                            lVar.f141600f = 4;
                        } else {
                            if (lVar2 instanceof v2.a) {
                                v2.a aVar9 = (v2.a) lVar2;
                                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(aVar9.f47383a, "Error updating supplemental sports ");
                                i2.a aVar10 = i2.f36769a;
                                a2 a2Var3 = a2.GENERAL;
                                aVar10.getClass();
                                i2.a.f(a2Var3, "EventBaseViewModel", strD3);
                                bVar.h5().j(g3.a.a(g3.f35298f, null, aVar9.f47383a, null, null, 13));
                                return Unit.INSTANCE;
                            }
                            lVar.f141595a = i14;
                            lVar.f141596b = i15;
                            lVar.f141600f = 5;
                        }
                    }
                    break;
                } else {
                    lVar.f141600f = 7;
                    break;
                }
                return obj2;
            case 1:
                i19 = lVar.f141597c;
                i15 = lVar.f141596b;
                i18 = lVar.f141595a;
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    lVar.f141595a = i18;
                    lVar.f141596b = i15;
                    lVar.f141597c = i19;
                    lVar.f141600f = 2;
                    break;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar11 = (v2.a) v2Var;
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(aVar11.f47383a, "Error occurred while updating training level ");
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.f(a2Var4, "EventBaseViewModel", strD4);
                    bVar.h5().j(g3.a.a(g3.f35298f, null, aVar11.f47383a, null, null, 13));
                }
                return Unit.INSTANCE;
            case 2:
                r.b(obj);
                return Unit.INSTANCE;
            case 3:
                i17 = lVar.f141596b;
                i16 = lVar.f141595a;
                r.b(obj);
                lVar2 = (v2) obj;
                i14 = i16;
                i15 = i17;
                if (lVar2 instanceof v2.b) {
                    lVar.f141595a = i14;
                    lVar.f141596b = i15;
                    lVar.f141600f = 4;
                    break;
                } else {
                    if (lVar2 instanceof v2.a) {
                        v2.a aVar13 = (v2.a) lVar2;
                        String strD5 = com.airbnb.lottie.animation.keyframe.a.d(aVar13.f47383a, "Error updating supplemental sports ");
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.f(a2Var5, "EventBaseViewModel", strD5);
                        bVar.h5().j(g3.a.a(g3.f35298f, null, aVar13.f47383a, null, null, 13));
                        return Unit.INSTANCE;
                    }
                    lVar.f141595a = i14;
                    lVar.f141596b = i15;
                    lVar.f141600f = 5;
                    break;
                }
                return obj2;
            case 4:
                r.b(obj);
                return Unit.INSTANCE;
            case 5:
                r.b(obj);
                return Unit.INSTANCE;
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            case 7:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A5(v13.c cVar) {
        m mVar;
        v2 v2Var;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f141603c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f141603c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objJ = mVar.f141601a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f141603c;
        if (i15 == 0) {
            r.b(objJ);
            mv1.a aVar2 = (mv1.a) this.N0.getValue();
            v2Var = null;
            List<tw1.h> list = aVar2 != null ? aVar2.f121170h : null;
            if (list != null) {
                kv1.b bVarD5 = d5();
                long j8 = this.T;
                mVar.f141603c = 1;
                bVarD5.getClass();
                objJ = f0.J(bVarD5, new q(bVarD5, j8, list, null), mVar);
                if (objJ == aVar) {
                    return aVar;
                }
            }
            if ((v2Var instanceof v2.b) && (v2Var instanceof v2.a)) {
                v2.a aVar3 = (v2.a) v2Var;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar3.f47383a, "Error updating supplemental sports ");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strD);
                h5().j(g3.a.a(g3.f35298f, null, aVar3.f47383a, null, null, 13));
            } else {
                q5();
                h5().j(g3.a.e(g3.f35298f));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            q5();
            h5().j(g3.a.e(g3.f35298f));
        } else {
            v2.a aVar5 = (v2.a) v2Var;
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar5.f47383a, "Error updating supplemental sports ");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var2, "EventBaseViewModel", strD2);
            h5().j(g3.a.a(g3.f35298f, null, aVar5.f47383a, null, null, 13));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B5(v13.c cVar) {
        n nVar;
        tw1.k kVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f141606c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f141606c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f141604a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f141606c;
        if (i15 == 0) {
            r.b(objJ);
            mv1.a aVar2 = (mv1.a) this.N0.getValue();
            tw1.l lVar = (aVar2 == null || (kVar = aVar2.f121163a) == null) ? null : new tw1.l(Integer.valueOf(kVar.f166747a), kVar.f166748b);
            if (lVar != null) {
                kv1.b bVarD5 = d5();
                long j8 = this.T;
                nVar.f141606c = 1;
                bVarD5.getClass();
                objJ = f0.J(bVarD5, new kv1.s(bVarD5, j8, lVar, null), nVar);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                q5();
                h5().j(g3.a.e(g3.f35298f));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            q5();
            h5().j(g3.a.e(g3.f35298f));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar3.f47383a, "Error occurred while updating training level ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", strD);
            h5().j(g3.a.a(g3.f35298f, null, aVar3.f47383a, null, null, 13));
        }
        return Unit.INSTANCE;
    }

    public final void C5(ArrayList arrayList) {
        p2 p2Var = this.R0;
        mv1.b bVar = (mv1.b) p2Var.getValue();
        p2Var.setValue(bVar != null ? mv1.b.a(bVar, null, arrayList, null, null, null, null, null, 509) : null);
    }

    public final void D5(List<String> list) {
        list.getClass();
        p2 p2Var = this.R0;
        mv1.b bVar = (mv1.b) p2Var.getValue();
        p2Var.setValue(bVar != null ? mv1.b.a(bVar, null, null, list, null, null, null, null, 507) : null);
    }

    public final void b5() {
        this.f141493e1 = false;
        this.f141496h1 = null;
        u5("FBTEditPreferencesFragment2");
    }

    public final jv1.h c5() {
        fg0.k kVar;
        mv1.a aVar = (mv1.a) this.O0.f150540a.getValue();
        if (aVar == null || (kVar = aVar.f121169g) == null) {
            return null;
        }
        return tu1.a.u(kVar);
    }

    public final kv1.b d5() {
        return (kv1.b) this.P.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    public final boolean e5() {
        vt1.o oVar;
        mv1.a aVar;
        jv1.h hVarC5;
        mv1.a aVar2;
        vt1.o oVar2 = this.Y;
        b2 b2Var = this.O0;
        if (oVar2 == null || oVar2 != vt1.o.f180175f) {
            oVar = this.Y;
            if (oVar == null && oVar == vt1.o.f180176g) {
                fy1.i.f73924a.getClass();
                if (!fy1.i.a.p()) {
                    return false;
                }
                jv1.h hVarC6 = c5();
                if ((hVarC6 == null || tu1.a.l(hVarC6)) && ((aVar = (mv1.a) b2Var.f150540a.getValue()) == null || !aVar.f121165c)) {
                    return false;
                }
            }
        } else {
            fy1.i.f73924a.getClass();
            if (!fy1.i.a.o() || !((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).n() || !bo1.a.a().c().q0() || !bo1.a.a().c().f() || (((hVarC5 = c5()) == null || tu1.a.m(hVarC5)) && ((aVar2 = (mv1.a) b2Var.f150540a.getValue()) == null || !aVar2.f121165c))) {
                oVar = this.Y;
                return oVar == null ? false : false;
            }
        }
        return true;
    }

    public final Double f5() {
        fg0.k kVar;
        mv1.a aVar = (mv1.a) this.N0.getValue();
        fg0.d completionTarget = (aVar == null || (kVar = aVar.f121169g) == null) ? null : kVar.getCompletionTarget();
        if (completionTarget == null || !completionTarget.m()) {
            return null;
        }
        return completionTarget.b();
    }

    public final y0<g3<Unit>> h5() {
        return (y0) this.I0.getValue();
    }

    public final void i5(String str, e23.a<Unit> aVar) {
        if (!p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
            aVar.invoke();
            return;
        }
        if (p5()) {
            this.R0.setValue(this.f141495g1);
        } else {
            this.N0.setValue(this.f141494f1);
        }
        this.f141493e1 = false;
        this.f141494f1 = null;
        this.Q0 = null;
        aVar.invoke();
    }

    public final void j5(hv1.e eVar) {
        fg0.k kVar;
        fg0.k kVar2;
        j61.f courseProfileDTO;
        eVar.getClass();
        p2 p2Var = this.N0;
        mv1.a aVar = (mv1.a) p2Var.getValue();
        j61.f fVarB = (aVar == null || (kVar2 = aVar.f121169g) == null || (courseProfileDTO = kVar2.getCourseProfileDTO()) == null) ? null : j61.f.b(courseProfileDTO, null, null, eVar.f85848a, 3);
        mv1.a aVar2 = (mv1.a) p2Var.getValue();
        fg0.k kVarD = (aVar2 == null || (kVar = aVar2.f121169g) == null) ? null : fg0.k.d(kVar, null, null, fVarB, null, null, null, null, -513);
        mv1.a aVar3 = (mv1.a) p2Var.getValue();
        p2Var.setValue(aVar3 != null ? mv1.a.a(aVar3, null, null, null, null, kVarD, null, null, 447) : null);
        if (this.f141493e1) {
            b5();
        } else {
            u5("FBTEditPreferencesFragment2");
        }
    }

    public final boolean k5() {
        fg0.k kVar;
        mv1.a aVar = (mv1.a) this.N0.getValue();
        j61.f courseProfileDTO = (aVar == null || (kVar = aVar.f121169g) == null) ? null : kVar.getCourseProfileDTO();
        if ((courseProfileDTO != null ? courseProfileDTO.getElevationProfileType() : null) != null) {
            return true;
        }
        if ((courseProfileDTO != null ? courseProfileDTO.getElevationGainMeter() : null) == null) {
            return (courseProfileDTO != null ? courseProfileDTO.getHillType() : null) != null;
        }
        return true;
    }

    public final boolean l5() {
        return this.Y == vt1.o.f180176g;
    }

    public final boolean m5() {
        if (this.Y == vt1.o.f180175f && o5()) {
            return true;
        }
        return l5() && o5();
    }

    public final boolean n5() {
        return this.Y == vt1.o.f180180k;
    }

    public final boolean o5() {
        mv1.a aVar = (mv1.a) this.O0.f150540a.getValue();
        return (aVar != null ? aVar.f121163a : null) == tw1.k.BEGINNER;
    }

    public final boolean p5() {
        return this.Y == vt1.o.f180178i;
    }

    public final void q5() {
        List<tw1.h> list;
        mv1.a aVar = (mv1.a) this.N0.getValue();
        if (this.P0.f121168f != (aVar != null ? aVar.f121168f : null)) {
            rt1.l.f154545a.getClass();
            rt1.l.f154547c.add("WorkoutTargetType");
        }
        if (!p005kotlin.jvm.internal.s.g(this.P0.f121166d, aVar != null ? aVar.f121166d : null)) {
            rt1.l.f154545a.getClass();
            rt1.l.f154547c.add("AvailableTrainingDays");
        }
        if (!p005kotlin.jvm.internal.s.g(this.P0.f121167e, aVar != null ? aVar.f121167e : null)) {
            rt1.l.f154545a.getClass();
            rt1.l.f154547c.add("LongTrainingDays");
        }
        if (!p005kotlin.jvm.internal.s.g(this.P0.f121170h, aVar != null ? aVar.f121170h : null)) {
            rt1.l lVar = rt1.l.f154545a;
            tw1.h hVar = (aVar == null || (list = aVar.f121170h) == null) ? null : (tw1.h) h0.d0(list);
            lVar.getClass();
            LinkedHashSet linkedHashSet = rt1.l.f154547c;
            if (hVar != null) {
                linkedHashSet.add(hVar.f166715a);
            } else {
                linkedHashSet.add(vt1.h.NONE.f180123d);
            }
        }
        if (this.P0.f121163a != (aVar != null ? aVar.f121163a : null)) {
            rt1.l lVar2 = rt1.l.f154545a;
            tw1.k kVar = aVar != null ? aVar.f121163a : null;
            lVar2.getClass();
            if (kVar != null) {
                rt1.l.f154547c.add(kVar.f166748b);
            }
        }
        rt1.l lVar3 = rt1.l.f154545a;
        vt1.o oVar = this.Y;
        lVar3.getClass();
        rt1.l.c(oVar);
    }

    public final void r5() {
        u5("FBTEditLongDaysFragment");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object s5(vt1.o oVar, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f141554c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f141554c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objJ = hVar.f141552a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f141554c;
        if (i15 == 0) {
            r.b(objJ);
            kv1.b bVarD5 = d5();
            String str = oVar.f180185b;
            fy1.i.f73924a.getClass();
            String str2 = fy1.i.a.C1501a.f73937a[oVar.ordinal()] == 1 ? "duration" : "distance";
            hVar.f141554c = 1;
            bVarD5.getClass();
            objJ = f0.J(bVarD5, new kv1.k(bVarD5, str, str2, null), hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (jv1.y) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        String str3 = "fetchRecentTrainingStats: " + aVar2.f47383a + " :: " + aVar2.f47384b;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "EventBaseViewModel", str3);
        return null;
    }

    public final void t5() {
        fg0.k kVar;
        p2 p2Var = this.N0;
        mv1.a aVar = (mv1.a) p2Var.getValue();
        fg0.k kVarD = (aVar == null || (kVar = aVar.f121169g) == null) ? null : fg0.k.d(kVar, null, null, null, null, null, null, null, -513);
        mv1.a aVar2 = (mv1.a) p2Var.getValue();
        p2Var.setValue(aVar2 != null ? mv1.a.a(aVar2, null, null, null, null, kVarD, null, null, 447) : null);
    }

    public final void u5(String str) {
        ((y0) this.H0.getValue()).m(str);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:116:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:0x0196  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01da  */
    /* JADX WARN: Code duplicated, block: B:141:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:149:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x0234  */
    /* JADX WARN: Code duplicated, block: B:156:0x023c  */
    /* JADX WARN: Code duplicated, block: B:157:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:186:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x02db  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:200:0x0304  */
    /* JADX WARN: Code duplicated, block: B:202:0x0335  */
    /* JADX WARN: Code duplicated, block: B:204:0x0339 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x033b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0343  */
    /* JADX WARN: Code duplicated, block: B:217:0x036a  */
    /* JADX WARN: Code duplicated, block: B:219:0x036d  */
    /* JADX WARN: Code duplicated, block: B:222:0x037a  */
    /* JADX WARN: Code duplicated, block: B:224:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:226:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:234:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:239:0x03de  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:252:0x040f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0413  */
    /* JADX WARN: Code duplicated, block: B:256:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0437  */
    /* JADX WARN: Code duplicated, block: B:271:0x044e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0469  */
    /* JADX WARN: Code duplicated, block: B:282:0x0473  */
    /* JADX WARN: Code duplicated, block: B:284:0x047b  */
    /* JADX WARN: Code duplicated, block: B:286:0x047f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0489  */
    /* JADX WARN: Code duplicated, block: B:294:0x0498  */
    /* JADX WARN: Code duplicated, block: B:297:0x049c  */
    /* JADX WARN: Code duplicated, block: B:302:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:304:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:309:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:312:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:314:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:316:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:325:0x04fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:327:0x0509  */
    /* JADX WARN: Code duplicated, block: B:330:0x0515  */
    /* JADX WARN: Code duplicated, block: B:335:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:339:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:343:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:351:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:354:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:356:0x05f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x05fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:366:0x0621  */
    /* JADX WARN: Code duplicated, block: B:368:0x062a  */
    /* JADX WARN: Code duplicated, block: B:374:0x063c  */
    /* JADX WARN: Code duplicated, block: B:376:0x0644  */
    /* JADX WARN: Code duplicated, block: B:378:0x0683 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x0685  */
    /* JADX WARN: Code duplicated, block: B:380:0x068b  */
    /* JADX WARN: Code duplicated, block: B:382:0x068e  */
    /* JADX WARN: Code duplicated, block: B:385:0x069d  */
    /* JADX WARN: Code duplicated, block: B:391:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:393:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:396:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:397:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:400:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:402:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:405:0x06e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:406:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:409:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:411:0x0703  */
    /* JADX WARN: Code duplicated, block: B:415:0x070f  */
    /* JADX WARN: Code duplicated, block: B:418:0x071a  */
    /* JADX WARN: Code duplicated, block: B:420:0x0722  */
    /* JADX WARN: Code duplicated, block: B:422:0x074f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:423:0x0751  */
    /* JADX WARN: Code duplicated, block: B:424:0x0757  */
    /* JADX WARN: Code duplicated, block: B:426:0x075a  */
    /* JADX WARN: Code duplicated, block: B:429:0x076b  */
    /* JADX WARN: Code duplicated, block: B:435:0x0785  */
    /* JADX WARN: Code duplicated, block: B:436:0x0787  */
    /* JADX WARN: Code duplicated, block: B:438:0x078d  */
    /* JADX WARN: Code duplicated, block: B:440:0x0793  */
    /* JADX WARN: Code duplicated, block: B:441:0x0795  */
    /* JADX WARN: Code duplicated, block: B:443:0x079b  */
    /* JADX WARN: Code duplicated, block: B:447:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:449:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:452:0x07b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:453:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:455:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:457:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:459:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:460:0x07f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:486:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x043f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0448 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x03e6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x03ef A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0632 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0697 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x070b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0778 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04e5, code lost:
    
        if ((r4.doubleValue() / r1.doubleValue()) > 7.0E-4d) goto L321;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Object, pv1.b] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v36, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v48, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v5(String str, e23.a aVar) {
        List<String> list;
        List list2;
        boolean z14;
        boolean z15;
        List list3;
        boolean z16;
        List<String> list4;
        boolean z17;
        boolean z18;
        boolean z19;
        p2 p2Var;
        mv1.a aVar2;
        p2 p2Var2;
        int iJ;
        p pVar;
        boolean zBooleanValue;
        int iIntValue;
        int iHashCode;
        p2 p2Var3;
        ?? arrayList;
        ArrayList arrayList2;
        List listB1;
        List listB2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List listB3;
        List listF;
        ArrayList arrayList6;
        Boolean boolValueOf;
        mv1.a aVar3;
        List list5;
        mv1.a aVar4;
        jv1.o oVarE;
        mv1.a aVar5;
        Double elevationGainMeter;
        Double dF5;
        fg0.k kVar;
        j61.f courseProfileDTO;
        fg0.k kVar2;
        j61.f courseProfileDTO2;
        ArrayList arrayList7;
        mv1.b bVar;
        ?? arrayList8;
        List<String> list6;
        ArrayList arrayList9;
        ?? arrayList10;
        List<String> list7;
        Long courseId;
        boolean z24;
        Double dF6;
        boolean z25;
        fg0.k kVar3;
        List<String> list8;
        Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
        l22.a aVar6 = new l22.a(contextB);
        String string = l5() ? contextB.getString(R.string.lbl_ride) : this.Y == vt1.o.f180175f ? contextB.getString(R.string.lbl_run) : contextB.getString(R.string.lbl_workout);
        string.getClass();
        boolean z26 = this.f141493e1;
        p2 p2Var4 = this.R0;
        p2 p2Var5 = this.N0;
        if (!z26) {
            this.f141493e1 = true;
            this.f141494f1 = (mv1.a) p2Var5.getValue();
            this.f141495g1 = (mv1.b) p2Var4.getValue();
            this.f141496h1 = str;
        }
        aVar.invoke();
        if (p5()) {
            mv1.b bVar2 = (mv1.b) p2Var4.getValue();
            if (bVar2 != null) {
                list = bVar2.f121173b;
            } else {
                list = null;
            }
        } else {
            mv1.a aVar7 = (mv1.a) p2Var5.getValue();
            if (aVar7 != null) {
                list = aVar7.f121167e;
            } else {
                list = null;
            }
        }
        if (list == null) {
            list = p13.j0.f134944a;
        }
        mv1.b bVar3 = (mv1.b) p2Var4.getValue();
        List<String> list9 = bVar3 != null ? bVar3.f121174c : null;
        if (p5()) {
            mv1.b bVar4 = (mv1.b) p2Var4.getValue();
            list2 = bVar4 != null ? bVar4.f121172a : null;
        } else {
            mv1.a aVar8 = (mv1.a) p2Var5.getValue();
            if (aVar8 == null || (list2 = aVar8.f121166d) == null) {
                list2 = p13.j0.f134944a;
            }
        }
        if (list != null && list.isEmpty()) {
            z14 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = false;
                break;
            }
            String str2 = (String) it.next();
            if (list2 != null && list2.contains(str2)) {
                z14 = true;
                break;
            }
        }
        if (p5()) {
            if (list9 == null) {
                if (list9 == null && !list9.isEmpty()) {
                    z15 = false;
                }
            } else if (!list9.isEmpty()) {
                Iterator it3 = list9.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        if (list2 != null && list2.contains(str3)) {
                            if (list9 == null) {
                            }
                        }
                    }
                }
            }
            z15 = true;
        } else {
            z15 = false;
        }
        if (p5()) {
            mv1.b bVar5 = (mv1.b) p2Var4.getValue();
            list3 = bVar5 != null ? bVar5.f121178g : null;
        } else {
            mv1.a aVar9 = (mv1.a) p2Var5.getValue();
            if (aVar9 == null || (list3 = aVar9.f121170h) == null) {
                list3 = p13.j0.f134944a;
            }
        }
        mv1.a aVar10 = this.f141494f1;
        int size = (aVar10 == null || (list8 = aVar10.f121166d) == null) ? 0 : list8.size();
        mv1.a aVar11 = this.f141494f1;
        if ((aVar11 != null ? aVar11.f121163a : null) != tw1.k.BEGINNER) {
            z16 = false;
        } else {
            mv1.a aVar12 = (mv1.a) p2Var5.getValue();
            if ((aVar12 != null ? aVar12.f121163a : null) == tw1.k.INTERMEDIATE) {
                z16 = true;
            } else {
                z16 = false;
            }
        }
        if (z16) {
            fy1.i.f73924a.getClass();
            boolean zD = bo1.a.a().c().D();
            z17 = true;
            mv1.a aVar13 = (mv1.a) p2Var5.getValue();
            if (l5() && aVar13 != null) {
                list4 = list;
                boolean z27 = aVar13.f121165c ? false : true;
                boolean zK5 = k5();
                if (aVar13 != null || (kVar3 = aVar13.f121169g) == null) {
                    courseId = null;
                } else {
                    courseId = kVar3.getCourseId();
                }
                if (courseId != null) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                dF6 = f5();
                if (zf.b.D(dF6) || dF6.doubleValue() <= 0.0d) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                if (!zD && z27 && !z24 && z25 && !zK5) {
                    z18 = true;
                }
                jv1.h hVarC5 = c5();
                vt1.o oVar = this.Y;
                if (list3 != null) {
                    z19 = z18;
                    p2Var = p2Var4;
                    boolean z28 = z17;
                    boolean z29 = (list3.isEmpty() ^ true) == z28 ? z28 : false;
                    aVar2 = (mv1.a) p2Var5.getValue();
                    if (aVar2 != null) {
                        p2Var2 = p2Var5;
                        boolean z34 = aVar2.f121165c;
                        iJ = tu1.a.j(hVarC5, oVar, z29, z34);
                        if (e5()) {
                            pVar = og.a.Z(iJ, size, z16);
                        } else {
                            pVar = new p(Boolean.FALSE, 5);
                        }
                        zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                        iIntValue = ((Number) pVar.f128595b).intValue();
                        iHashCode = str.hashCode();
                        p2Var3 = this.f141491c1;
                        switch (iHashCode) {
                            case -746357180:
                                if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                                    if (!zBooleanValue) {
                                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                            final int i14 = 5;
                                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ b f141487b;

                                                {
                                                    this.f141487b = this;
                                                }

                                                @Override // e23.l
                                                public final Object invoke(Object obj) {
                                                    int i15 = i14;
                                                    b bVar6 = this.f141487b;
                                                    switch (i15) {
                                                        case 0:
                                                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                                            int i16 = b.f141488i1;
                                                            if (zBooleanValue2) {
                                                                bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                            }
                                                            break;
                                                        case 1:
                                                            p2 p2Var6 = bVar6.N0;
                                                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                                            int i17 = b.f141488i1;
                                                            if (zBooleanValue3) {
                                                                mv1.a aVar14 = (mv1.a) p2Var6.getValue();
                                                                mv1.a aVarA = null;
                                                                fg0.k kVar4 = aVar14 != null ? aVar14.f121169g : null;
                                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                                mv1.a aVar15 = (mv1.a) p2Var6.getValue();
                                                                if (aVar15 != null) {
                                                                    new dv1.a();
                                                                    aVarA = mv1.a.a(aVar15, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                                }
                                                                p2Var6.setValue(aVarA);
                                                                bVar6.u5("FBTEditElevationProfileFragment");
                                                            } else {
                                                                bVar6.b5();
                                                            }
                                                            break;
                                                        case 2:
                                                            boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                                                            int i18 = b.f141488i1;
                                                            if (zBooleanValue4) {
                                                                bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                            }
                                                            break;
                                                        case 3:
                                                            boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                                                            int i19 = b.f141488i1;
                                                            if (zBooleanValue5) {
                                                                bVar6.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 4:
                                                            boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                                                            int i24 = b.f141488i1;
                                                            if (zBooleanValue6) {
                                                                bVar6.t5();
                                                                bVar6.b5();
                                                            }
                                                            break;
                                                        case 5:
                                                            boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                                                            int i25 = b.f141488i1;
                                                            if (zBooleanValue7) {
                                                                bVar6.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 6:
                                                            boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                                                            int i26 = b.f141488i1;
                                                            if (zBooleanValue8) {
                                                                bVar6.r5();
                                                            }
                                                            break;
                                                        default:
                                                            boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                                                            int i27 = b.f141488i1;
                                                            if (zBooleanValue9) {
                                                                bVar6.r5();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, 25, null));
                                        } else {
                                            u5("FBTEditTrainingDaysFragment");
                                        }
                                    } else if (z16 || !z19) {
                                        b5();
                                    } else {
                                        mv1.e.a aVar14 = mv1.e.f121184g;
                                        final int i15 = 1;
                                        e23.l lVar = new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj) {
                                                int i16 = i15;
                                                b bVar6 = this.f141487b;
                                                switch (i16) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                                        int i17 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                                        int i18 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar15 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar15 != null ? aVar15.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar16 = (mv1.a) p2Var6.getValue();
                                                            if (aVar16 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar16, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                                                        int i19 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                                                        int i110 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                                                        int i24 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        aVar14.getClass();
                                        p2Var3.k(null, mv1.e.a.a(aVar6, true, lVar));
                                    }
                                    break;
                                }
                                break;
                            case 525791086:
                                if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                                    if (list9 != null) {
                                        arrayList = new ArrayList();
                                        for (Object obj : list9) {
                                            String str4 = (String) obj;
                                            if (list2 != null || !list2.contains(str4)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                    } else {
                                        arrayList = p13.j0.f134944a;
                                    }
                                    if (!((Collection) arrayList).isEmpty()) {
                                        b5();
                                    } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                                    } else {
                                        if (list2 != null) {
                                            arrayList2 = new ArrayList(list2);
                                        } else {
                                            arrayList2 = null;
                                        }
                                        if (arrayList2 != null) {
                                            arrayList3 = new ArrayList();
                                            for (Object obj2 : (Iterable) arrayList) {
                                                if (!arrayList2.contains((String) obj2)) {
                                                    arrayList3.add(obj2);
                                                }
                                            }
                                            arrayList2.addAll(arrayList3);
                                        }
                                        if (p5()) {
                                            if (arrayList2 != null || (listB2 = h0.b1(arrayList2)) == null) {
                                                listB2 = p13.j0.f134944a;
                                            }
                                            z5(listB2);
                                        } else {
                                            if (arrayList2 != null || (listB1 = h0.b1(arrayList2)) == null) {
                                                listB1 = p13.j0.f134944a;
                                            }
                                            w5(listB1);
                                        }
                                        b5();
                                    }
                                    break;
                                }
                                break;
                            case 645158341:
                                if (!str.equals("FBTEditLongDaysFragment")) {
                                    if (!p5() && z15) {
                                        u5("FBTEditTriathlonSwimDaysFragment");
                                    } else if (z16 || !z19) {
                                        arrayList4 = new ArrayList();
                                        for (Object obj3 : list4) {
                                            String str5 = (String) obj3;
                                            if (list2 != null || !list2.contains(str5)) {
                                                arrayList4.add(obj3);
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            b5();
                                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                            String strA = aVar6.a(R.string.long_training_day_updated, string);
                                            String lowerCase = string.toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            p2Var3.k(null, new mv1.e(false, strA, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                                        } else {
                                            if (list2 != null) {
                                                arrayList5 = new ArrayList(list2);
                                            } else {
                                                arrayList5 = null;
                                            }
                                            if (arrayList5 != null) {
                                                arrayList6 = new ArrayList();
                                                for (Object obj4 : arrayList4) {
                                                    if (!arrayList5.contains((String) obj4)) {
                                                        arrayList6.add(obj4);
                                                    }
                                                }
                                                arrayList5.addAll(arrayList6);
                                            }
                                            wt1.q.a aVar15 = wt1.q.f187120f;
                                            if (arrayList5 != null || (listB3 = h0.b1(arrayList5)) == null) {
                                                listB3 = p13.j0.f134944a;
                                            }
                                            aVar15.getClass();
                                            listF = wt1.q.a.f(listB3);
                                            if (p5()) {
                                                z5(h0.b1(listF));
                                            } else {
                                                w5(h0.b1(listF));
                                            }
                                            b5();
                                        }
                                    } else {
                                        mv1.e.a aVar16 = mv1.e.f121184g;
                                        final int i16 = 1;
                                        e23.l lVar2 = new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                int i17 = i16;
                                                b bVar6 = this.f141487b;
                                                switch (i17) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                        int i18 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                                        int i19 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar17 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar17 != null ? aVar17.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                            if (aVar18 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar18, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                                                        int i110 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                                                        int i24 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj5).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj5).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        aVar16.getClass();
                                        p2Var3.k(null, mv1.e.a.a(aVar6, true, lVar2));
                                    }
                                    break;
                                }
                                break;
                            case 950460184:
                                if (str.equals("FBTEditTrainingLevelFragment")) {
                                    if (list3 != null) {
                                        boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (!z16 && p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                                        String string2 = aVar6.getString(R.string.preference_updates_required);
                                        String lowerCase2 = aVar6.getString(R.string.coach_difficulty_achiever).toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                        final int i17 = 2;
                                        p2Var3.k(null, new mv1.e(false, string2, aVar6.a(R.string.training_level_preferenes_update_type, lowerCase2), 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                int i18 = i17;
                                                b bVar6 = this.f141487b;
                                                switch (i18) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                        int i19 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                                        int i110 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar17 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar17 != null ? aVar17.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                            if (aVar18 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar18, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                                                        int i24 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj5).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj5).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else if (!z16 && zBooleanValue) {
                                        String string3 = aVar6.getString(R.string.preference_updates_required);
                                        String lowerCase3 = aVar6.getString(R.string.coach_difficulty_achiever).toLowerCase(Locale.ROOT);
                                        lowerCase3.getClass();
                                        String strA2 = aVar6.a(R.string.training_level_preferenes_update_type, lowerCase3);
                                        final int i18 = 3;
                                        p2Var3.k(null, new mv1.e(false, string3, strA2, 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                int i19 = i18;
                                                b bVar6 = this.f141487b;
                                                switch (i19) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                        int i110 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar17 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar17 != null ? aVar17.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                            if (aVar18 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar18, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                                                        int i24 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj5).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj5).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else if (!z16 && z19) {
                                        mv1.e.a aVar17 = mv1.e.f121184g;
                                        final int i19 = 1;
                                        e23.l lVar3 = new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                int i110 = i19;
                                                b bVar6 = this.f141487b;
                                                switch (i110) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar18 != null ? aVar18.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                            if (aVar19 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar19, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                                                        int i24 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj5).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj5).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        aVar17.getClass();
                                        p2Var3.k(null, mv1.e.a.a(aVar6, true, lVar3));
                                    } else if (z16 && l5() && k5()) {
                                        String string4 = aVar6.getString(R.string.coach_difficulty_challenger);
                                        String string5 = aVar6.getString(R.string.remove_course_profile);
                                        String strA3 = aVar6.a(R.string.change_training_level_remove_course_profile, string4);
                                        final int i24 = 4;
                                        p2Var3.k(null, new mv1.e(false, string5, strA3, 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                int i110 = i24;
                                                b bVar6 = this.f141487b;
                                                switch (i110) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar6.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar6.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar18 != null ? aVar18.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                            if (aVar19 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar19, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar6.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar6.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                                                        int i25 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar6.t5();
                                                            bVar6.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj5).booleanValue();
                                                        int i26 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar6.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj5).booleanValue();
                                                        int i27 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj5).booleanValue();
                                                        int i28 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar6.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        b5();
                                    }
                                }
                                break;
                            case 1659444830:
                                if (!str.equals("FBTEditElevationProfileFragment")) {
                                    aVar3 = (mv1.a) p2Var2.getValue();
                                    if (aVar3 != null || (list5 = aVar3.f121171i) == null) {
                                        list5 = p13.j0.f134944a;
                                    }
                                    aVar4 = (mv1.a) p2Var2.getValue();
                                    if (aVar4 != null || (kVar2 = aVar4.f121169g) == null || (courseProfileDTO2 = kVar2.getCourseProfileDTO()) == null) {
                                        oVarE = null;
                                    } else {
                                        oVarE = tu1.a.e(courseProfileDTO2, list5);
                                    }
                                    if (oVarE != null && !(oVarE instanceof jv1.o.b)) {
                                        if (oVarE instanceof jv1.o.a) {
                                            aVar5 = (mv1.a) p2Var2.getValue();
                                            if (aVar5 != null || (kVar = aVar5.f121169g) == null || (courseProfileDTO = kVar.getCourseProfileDTO()) == null) {
                                                elevationGainMeter = null;
                                            } else {
                                                elevationGainMeter = courseProfileDTO.getElevationGainMeter();
                                            }
                                            dF5 = f5();
                                            if (zf.b.D(elevationGainMeter)) {
                                                if (zf.b.D(dF5)) {
                                                    if (dF5.doubleValue() > 0.0d) {
                                                    }
                                                }
                                            }
                                        }
                                        u5("FBTEditHillTypeFragment");
                                    }
                                    j5(hv1.e.FLAT);
                                    break;
                                }
                                break;
                            case 1818589731:
                                if (!str.equals("FBTEditTrainingDaysFragment")) {
                                    if (z14 && z15) {
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj5 : list4) {
                                            String str6 = (String) obj5;
                                            if (list2 != null && list2.contains(str6)) {
                                                arrayList11.add(obj5);
                                            }
                                        }
                                        mv1.b bVar6 = (mv1.b) p2Var.getValue();
                                        if (bVar6 == null || (list7 = bVar6.f121174c) == null) {
                                            arrayList10 = p13.j0.f134944a;
                                        } else {
                                            arrayList10 = new ArrayList();
                                            for (Object obj6 : list7) {
                                                String str7 = (String) obj6;
                                                if (list2 != null && list2.contains(str7)) {
                                                    arrayList10.add(obj6);
                                                }
                                            }
                                        }
                                        C5(arrayList11);
                                        D5(arrayList10);
                                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                            final int i25 = 6;
                                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_long_workout_and_swim_days), aVar6.getString(R.string.removed_long_day_and_swim_select_new_ones), 0, 0, new e23.l(this) { // from class: pv1.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ b f141487b;

                                                {
                                                    this.f141487b = this;
                                                }

                                                @Override // e23.l
                                                public final Object invoke(Object obj7) {
                                                    int i110 = i25;
                                                    b bVar7 = this.f141487b;
                                                    switch (i110) {
                                                        case 0:
                                                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                                            int i111 = b.f141488i1;
                                                            if (zBooleanValue2) {
                                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                            }
                                                            break;
                                                        case 1:
                                                            p2 p2Var6 = bVar7.N0;
                                                            boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                            int i112 = b.f141488i1;
                                                            if (zBooleanValue3) {
                                                                mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                                mv1.a aVarA = null;
                                                                fg0.k kVar4 = aVar18 != null ? aVar18.f121169g : null;
                                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                                mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                                if (aVar19 != null) {
                                                                    new dv1.a();
                                                                    aVarA = mv1.a.a(aVar19, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                                }
                                                                p2Var6.setValue(aVarA);
                                                                bVar7.u5("FBTEditElevationProfileFragment");
                                                            } else {
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 2:
                                                            boolean zBooleanValue4 = ((Boolean) obj7).booleanValue();
                                                            int i113 = b.f141488i1;
                                                            if (zBooleanValue4) {
                                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                            }
                                                            break;
                                                        case 3:
                                                            boolean zBooleanValue5 = ((Boolean) obj7).booleanValue();
                                                            int i114 = b.f141488i1;
                                                            if (zBooleanValue5) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 4:
                                                            boolean zBooleanValue6 = ((Boolean) obj7).booleanValue();
                                                            int i26 = b.f141488i1;
                                                            if (zBooleanValue6) {
                                                                bVar7.t5();
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 5:
                                                            boolean zBooleanValue7 = ((Boolean) obj7).booleanValue();
                                                            int i27 = b.f141488i1;
                                                            if (zBooleanValue7) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 6:
                                                            boolean zBooleanValue8 = ((Boolean) obj7).booleanValue();
                                                            int i28 = b.f141488i1;
                                                            if (zBooleanValue8) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                        default:
                                                            boolean zBooleanValue9 = ((Boolean) obj7).booleanValue();
                                                            int i29 = b.f141488i1;
                                                            if (zBooleanValue9) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, 25, null));
                                        } else {
                                            r5();
                                        }
                                    } else if (!z14) {
                                        arrayList9 = new ArrayList();
                                        for (Object obj7 : list4) {
                                            String str8 = (String) obj7;
                                            if (list2 == null && list2.contains(str8)) {
                                                arrayList9.add(obj7);
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList9);
                                        } else {
                                            x5(arrayList9);
                                        }
                                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                            String string6 = aVar6.getString(R.string.select_new_long_day);
                                            String lowerCase4 = string.toLowerCase(Locale.ROOT);
                                            lowerCase4.getClass();
                                            String strA4 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase4);
                                            final int i26 = 7;
                                            p2Var3.k(null, new mv1.e(false, string6, strA4, 0, 0, new e23.l(this) { // from class: pv1.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ b f141487b;

                                                {
                                                    this.f141487b = this;
                                                }

                                                @Override // e23.l
                                                public final Object invoke(Object obj8) {
                                                    int i110 = i26;
                                                    b bVar7 = this.f141487b;
                                                    switch (i110) {
                                                        case 0:
                                                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                                            int i111 = b.f141488i1;
                                                            if (zBooleanValue2) {
                                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                            }
                                                            break;
                                                        case 1:
                                                            p2 p2Var6 = bVar7.N0;
                                                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                                                            int i112 = b.f141488i1;
                                                            if (zBooleanValue3) {
                                                                mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                                mv1.a aVarA = null;
                                                                fg0.k kVar4 = aVar18 != null ? aVar18.f121169g : null;
                                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                                mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                                if (aVar19 != null) {
                                                                    new dv1.a();
                                                                    aVarA = mv1.a.a(aVar19, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                                }
                                                                p2Var6.setValue(aVarA);
                                                                bVar7.u5("FBTEditElevationProfileFragment");
                                                            } else {
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 2:
                                                            boolean zBooleanValue4 = ((Boolean) obj8).booleanValue();
                                                            int i113 = b.f141488i1;
                                                            if (zBooleanValue4) {
                                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                            }
                                                            break;
                                                        case 3:
                                                            boolean zBooleanValue5 = ((Boolean) obj8).booleanValue();
                                                            int i114 = b.f141488i1;
                                                            if (zBooleanValue5) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 4:
                                                            boolean zBooleanValue6 = ((Boolean) obj8).booleanValue();
                                                            int i27 = b.f141488i1;
                                                            if (zBooleanValue6) {
                                                                bVar7.t5();
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 5:
                                                            boolean zBooleanValue7 = ((Boolean) obj8).booleanValue();
                                                            int i28 = b.f141488i1;
                                                            if (zBooleanValue7) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 6:
                                                            boolean zBooleanValue8 = ((Boolean) obj8).booleanValue();
                                                            int i29 = b.f141488i1;
                                                            if (zBooleanValue8) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                        default:
                                                            boolean zBooleanValue9 = ((Boolean) obj8).booleanValue();
                                                            int i210 = b.f141488i1;
                                                            if (zBooleanValue9) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, 25, null));
                                        } else {
                                            r5();
                                        }
                                    } else if (z15) {
                                        bVar = (mv1.b) p2Var.getValue();
                                        if (bVar != null || (list6 = bVar.f121174c) == null) {
                                            arrayList8 = 0;
                                        } else {
                                            arrayList8 = new ArrayList();
                                            for (Object obj8 : list6) {
                                                String str9 = (String) obj8;
                                                if (list2 != null && list2.contains(str9)) {
                                                    arrayList8.add(obj8);
                                                }
                                            }
                                        }
                                        if (arrayList8 == 0) {
                                            arrayList8 = p13.j0.f134944a;
                                        }
                                        D5(arrayList8);
                                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                            final int i27 = 0;
                                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ b f141487b;

                                                {
                                                    this.f141487b = this;
                                                }

                                                @Override // e23.l
                                                public final Object invoke(Object obj9) {
                                                    int i110 = i27;
                                                    b bVar7 = this.f141487b;
                                                    switch (i110) {
                                                        case 0:
                                                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                                                            int i111 = b.f141488i1;
                                                            if (zBooleanValue2) {
                                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                            }
                                                            break;
                                                        case 1:
                                                            p2 p2Var6 = bVar7.N0;
                                                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                                                            int i112 = b.f141488i1;
                                                            if (zBooleanValue3) {
                                                                mv1.a aVar18 = (mv1.a) p2Var6.getValue();
                                                                mv1.a aVarA = null;
                                                                fg0.k kVar4 = aVar18 != null ? aVar18.f121169g : null;
                                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                                mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                                if (aVar19 != null) {
                                                                    new dv1.a();
                                                                    aVarA = mv1.a.a(aVar19, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                                }
                                                                p2Var6.setValue(aVarA);
                                                                bVar7.u5("FBTEditElevationProfileFragment");
                                                            } else {
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 2:
                                                            boolean zBooleanValue4 = ((Boolean) obj9).booleanValue();
                                                            int i113 = b.f141488i1;
                                                            if (zBooleanValue4) {
                                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                            }
                                                            break;
                                                        case 3:
                                                            boolean zBooleanValue5 = ((Boolean) obj9).booleanValue();
                                                            int i114 = b.f141488i1;
                                                            if (zBooleanValue5) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 4:
                                                            boolean zBooleanValue6 = ((Boolean) obj9).booleanValue();
                                                            int i28 = b.f141488i1;
                                                            if (zBooleanValue6) {
                                                                bVar7.t5();
                                                                bVar7.b5();
                                                            }
                                                            break;
                                                        case 5:
                                                            boolean zBooleanValue7 = ((Boolean) obj9).booleanValue();
                                                            int i29 = b.f141488i1;
                                                            if (zBooleanValue7) {
                                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                                            }
                                                            break;
                                                        case 6:
                                                            boolean zBooleanValue8 = ((Boolean) obj9).booleanValue();
                                                            int i210 = b.f141488i1;
                                                            if (zBooleanValue8) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                        default:
                                                            boolean zBooleanValue9 = ((Boolean) obj9).booleanValue();
                                                            int i211 = b.f141488i1;
                                                            if (zBooleanValue9) {
                                                                bVar7.r5();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, 25, null));
                                        } else {
                                            u5("FBTEditTriathlonSwimDaysFragment");
                                        }
                                    } else if (z16 || !z19) {
                                        if (list4 != null || !list4.isEmpty()) {
                                            for (String str10 : list4) {
                                                if (list2 != null || !list2.contains(str10)) {
                                                    arrayList7 = new ArrayList();
                                                    for (Object obj9 : list4) {
                                                        String str11 = (String) obj9;
                                                        if (list2 == null && list2.contains(str11)) {
                                                            arrayList7.add(obj9);
                                                        }
                                                    }
                                                    if (p5()) {
                                                        C5(arrayList7);
                                                    } else {
                                                        x5(arrayList7);
                                                    }
                                                }
                                            }
                                        }
                                        if (p5() && list9 != null && !list9.isEmpty()) {
                                            for (String str12 : list9) {
                                                if (list2 != null || list2.contains(str12)) {
                                                    ArrayList arrayList12 = new ArrayList();
                                                    for (Object obj10 : list9) {
                                                        String str13 = (String) obj10;
                                                        if (list2 == null && list2.contains(str13)) {
                                                            arrayList12.add(obj10);
                                                        }
                                                    }
                                                    D5(arrayList12);
                                                }
                                            }
                                        }
                                        b5();
                                    } else {
                                        mv1.e.a aVar18 = mv1.e.f121184g;
                                        final int i28 = 1;
                                        e23.l lVar4 = new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i110 = i28;
                                                b bVar7 = this.f141487b;
                                                switch (i110) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i111 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar19 != null ? aVar19.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar110 = (mv1.a) p2Var6.getValue();
                                                            if (aVar110 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar110, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i29 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i210 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i211 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i212 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        aVar18.getClass();
                                        p2Var3.k(null, mv1.e.a.a(aVar6, true, lVar4));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    p2Var2 = p2Var5;
                    iJ = tu1.a.j(hVarC5, oVar, z29, z34);
                    if (e5()) {
                        pVar = og.a.Z(iJ, size, z16);
                    } else {
                        pVar = new p(Boolean.FALSE, 5);
                    }
                    zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                    iIntValue = ((Number) pVar.f128595b).intValue();
                    iHashCode = str.hashCode();
                    p2Var3 = this.f141491c1;
                    switch (iHashCode) {
                        case -746357180:
                            if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                                if (!zBooleanValue) {
                                    if (z16) {
                                    }
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i110 = 5;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i111 = i110;
                                            b bVar7 = this.f141487b;
                                            switch (i111) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i112 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i113 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar19 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar19 != null ? aVar19.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar110 = (mv1.a) p2Var6.getValue();
                                                        if (aVar110 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar110, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i114 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i115 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i29 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i210 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i211 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i212 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTrainingDaysFragment");
                                }
                                break;
                            }
                            break;
                        case 525791086:
                            if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                                if (list9 != null) {
                                    arrayList = new ArrayList();
                                    while (r4.hasNext()) {
                                        String str14 = (String) obj;
                                        if (list2 != null) {
                                        }
                                        arrayList.add(obj);
                                    }
                                } else {
                                    arrayList = p13.j0.f134944a;
                                }
                                if (!((Collection) arrayList).isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList(list2);
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            if (!arrayList2.contains((String) obj2)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2.addAll(arrayList3);
                                    }
                                    if (p5()) {
                                        if (arrayList2 != null) {
                                            listB2 = p13.j0.f134944a;
                                        } else {
                                            listB2 = p13.j0.f134944a;
                                        }
                                        z5(listB2);
                                    } else {
                                        if (arrayList2 != null) {
                                            listB1 = p13.j0.f134944a;
                                        } else {
                                            listB1 = p13.j0.f134944a;
                                        }
                                        w5(listB1);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 645158341:
                            if (!str.equals("FBTEditLongDaysFragment")) {
                                if (!p5()) {
                                }
                                if (z16) {
                                }
                                arrayList4 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str15 = (String) obj3;
                                    if (list2 != null) {
                                    }
                                    arrayList4.add(obj3);
                                }
                                if (!arrayList4.isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String strA5 = aVar6.a(R.string.long_training_day_updated, string);
                                    String lowerCase5 = string.toLowerCase(Locale.ROOT);
                                    lowerCase5.getClass();
                                    p2Var3.k(null, new mv1.e(false, strA5, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase5), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList5 = new ArrayList(list2);
                                    } else {
                                        arrayList5 = null;
                                    }
                                    if (arrayList5 != null) {
                                        arrayList6 = new ArrayList();
                                        while (r3.hasNext()) {
                                            if (!arrayList5.contains((String) obj4)) {
                                                arrayList6.add(obj4);
                                            }
                                        }
                                        arrayList5.addAll(arrayList6);
                                    }
                                    wt1.q.a aVar19 = wt1.q.f187120f;
                                    if (arrayList5 != null) {
                                        listB3 = p13.j0.f134944a;
                                    } else {
                                        listB3 = p13.j0.f134944a;
                                    }
                                    aVar19.getClass();
                                    listF = wt1.q.a.f(listB3);
                                    if (p5()) {
                                        z5(h0.b1(listF));
                                    } else {
                                        w5(h0.b1(listF));
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 950460184:
                            if (str.equals("FBTEditTrainingLevelFragment")) {
                                if (list3 != null) {
                                    boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                                } else {
                                    boolValueOf = null;
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                b5();
                            }
                            break;
                        case 1659444830:
                            if (!str.equals("FBTEditElevationProfileFragment")) {
                                aVar3 = (mv1.a) p2Var2.getValue();
                                if (aVar3 != null) {
                                    list5 = p13.j0.f134944a;
                                } else {
                                    list5 = p13.j0.f134944a;
                                }
                                aVar4 = (mv1.a) p2Var2.getValue();
                                if (aVar4 != null) {
                                    oVarE = null;
                                } else {
                                    oVarE = null;
                                }
                                if (oVarE != null) {
                                    if (oVarE instanceof jv1.o.a) {
                                        aVar5 = (mv1.a) p2Var2.getValue();
                                        if (aVar5 != null) {
                                            elevationGainMeter = null;
                                        } else {
                                            elevationGainMeter = null;
                                        }
                                        dF5 = f5();
                                        if (zf.b.D(elevationGainMeter)) {
                                            if (zf.b.D(dF5)) {
                                                if (dF5.doubleValue() > 0.0d) {
                                                }
                                            }
                                        }
                                    }
                                    u5("FBTEditHillTypeFragment");
                                }
                                j5(hv1.e.FLAT);
                                break;
                            }
                            break;
                        case 1818589731:
                            if (!str.equals("FBTEditTrainingDaysFragment")) {
                                if (z14) {
                                }
                                if (!z14) {
                                    arrayList9 = new ArrayList();
                                    while (r5.hasNext()) {
                                        String str16 = (String) obj7;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList9);
                                    } else {
                                        x5(arrayList9);
                                    }
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        String string7 = aVar6.getString(R.string.select_new_long_day);
                                        String lowerCase6 = string.toLowerCase(Locale.ROOT);
                                        lowerCase6.getClass();
                                        String strA6 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase6);
                                        final int i29 = 7;
                                        p2Var3.k(null, new mv1.e(false, string7, strA6, 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i111 = i29;
                                                b bVar7 = this.f141487b;
                                                switch (i111) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar110 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar110 != null ? aVar110.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                            if (aVar111 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar111, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i210 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i211 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i212 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i213 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        r5();
                                    }
                                } else if (z15) {
                                    bVar = (mv1.b) p2Var.getValue();
                                    if (bVar != null) {
                                        arrayList8 = 0;
                                    } else {
                                        arrayList8 = 0;
                                    }
                                    if (arrayList8 == 0) {
                                        arrayList8 = p13.j0.f134944a;
                                    }
                                    D5(arrayList8);
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        final int i210 = 0;
                                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i111 = i210;
                                                b bVar7 = this.f141487b;
                                                switch (i111) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i112 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar110 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar110 != null ? aVar110.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                            if (aVar111 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar111, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i211 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i212 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i213 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i214 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        u5("FBTEditTriathlonSwimDaysFragment");
                                    }
                                } else {
                                    if (z16) {
                                    }
                                    if (list4 != null) {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str17 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str18 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    }
                                    if (p5()) {
                                        do {
                                            if (list2 != null) {
                                            }
                                            ArrayList arrayList13 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str19 = (String) obj10;
                                                if (list2 == null) {
                                                }
                                            }
                                            D5(arrayList13);
                                        } while (list2.contains(str12));
                                        ArrayList arrayList14 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str110 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList14);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                    }
                }
                z19 = z18;
                p2Var = p2Var4;
                aVar2 = (mv1.a) p2Var5.getValue();
                if (aVar2 != null) {
                    p2Var2 = p2Var5;
                    if (aVar2.f121165c) {
                    }
                    iJ = tu1.a.j(hVarC5, oVar, z29, z34);
                    if (e5()) {
                        pVar = og.a.Z(iJ, size, z16);
                    } else {
                        pVar = new p(Boolean.FALSE, 5);
                    }
                    zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                    iIntValue = ((Number) pVar.f128595b).intValue();
                    iHashCode = str.hashCode();
                    p2Var3 = this.f141491c1;
                    switch (iHashCode) {
                        case -746357180:
                            if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                                if (!zBooleanValue) {
                                    if (z16) {
                                    }
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i111 = 5;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i112 = i111;
                                            b bVar7 = this.f141487b;
                                            switch (i112) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i113 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i114 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar110 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar110 != null ? aVar110.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                        if (aVar111 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar111, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i115 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i211 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i212 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i213 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i214 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTrainingDaysFragment");
                                }
                                break;
                            }
                            break;
                        case 525791086:
                            if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                                if (list9 != null) {
                                    arrayList = new ArrayList();
                                    while (r4.hasNext()) {
                                        String str111 = (String) obj;
                                        if (list2 != null) {
                                        }
                                        arrayList.add(obj);
                                    }
                                } else {
                                    arrayList = p13.j0.f134944a;
                                }
                                if (!((Collection) arrayList).isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList(list2);
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            if (!arrayList2.contains((String) obj2)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2.addAll(arrayList3);
                                    }
                                    if (p5()) {
                                        if (arrayList2 != null) {
                                            listB2 = p13.j0.f134944a;
                                        } else {
                                            listB2 = p13.j0.f134944a;
                                        }
                                        z5(listB2);
                                    } else {
                                        if (arrayList2 != null) {
                                            listB1 = p13.j0.f134944a;
                                        } else {
                                            listB1 = p13.j0.f134944a;
                                        }
                                        w5(listB1);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 645158341:
                            if (!str.equals("FBTEditLongDaysFragment")) {
                                if (!p5()) {
                                }
                                if (z16) {
                                }
                                arrayList4 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str112 = (String) obj3;
                                    if (list2 != null) {
                                    }
                                    arrayList4.add(obj3);
                                }
                                if (!arrayList4.isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String strA7 = aVar6.a(R.string.long_training_day_updated, string);
                                    String lowerCase7 = string.toLowerCase(Locale.ROOT);
                                    lowerCase7.getClass();
                                    p2Var3.k(null, new mv1.e(false, strA7, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase7), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList5 = new ArrayList(list2);
                                    } else {
                                        arrayList5 = null;
                                    }
                                    if (arrayList5 != null) {
                                        arrayList6 = new ArrayList();
                                        while (r3.hasNext()) {
                                            if (!arrayList5.contains((String) obj4)) {
                                                arrayList6.add(obj4);
                                            }
                                        }
                                        arrayList5.addAll(arrayList6);
                                    }
                                    wt1.q.a aVar110 = wt1.q.f187120f;
                                    if (arrayList5 != null) {
                                        listB3 = p13.j0.f134944a;
                                    } else {
                                        listB3 = p13.j0.f134944a;
                                    }
                                    aVar110.getClass();
                                    listF = wt1.q.a.f(listB3);
                                    if (p5()) {
                                        z5(h0.b1(listF));
                                    } else {
                                        w5(h0.b1(listF));
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 950460184:
                            if (str.equals("FBTEditTrainingLevelFragment")) {
                                if (list3 != null) {
                                    boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                                } else {
                                    boolValueOf = null;
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                b5();
                            }
                            break;
                        case 1659444830:
                            if (!str.equals("FBTEditElevationProfileFragment")) {
                                aVar3 = (mv1.a) p2Var2.getValue();
                                if (aVar3 != null) {
                                    list5 = p13.j0.f134944a;
                                } else {
                                    list5 = p13.j0.f134944a;
                                }
                                aVar4 = (mv1.a) p2Var2.getValue();
                                if (aVar4 != null) {
                                    oVarE = null;
                                } else {
                                    oVarE = null;
                                }
                                if (oVarE != null) {
                                    if (oVarE instanceof jv1.o.a) {
                                        aVar5 = (mv1.a) p2Var2.getValue();
                                        if (aVar5 != null) {
                                            elevationGainMeter = null;
                                        } else {
                                            elevationGainMeter = null;
                                        }
                                        dF5 = f5();
                                        if (zf.b.D(elevationGainMeter)) {
                                            if (zf.b.D(dF5)) {
                                                if (dF5.doubleValue() > 0.0d) {
                                                }
                                            }
                                        }
                                    }
                                    u5("FBTEditHillTypeFragment");
                                }
                                j5(hv1.e.FLAT);
                                break;
                            }
                            break;
                        case 1818589731:
                            if (!str.equals("FBTEditTrainingDaysFragment")) {
                                if (z14) {
                                }
                                if (!z14) {
                                    arrayList9 = new ArrayList();
                                    while (r5.hasNext()) {
                                        String str113 = (String) obj7;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList9);
                                    } else {
                                        x5(arrayList9);
                                    }
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        String string8 = aVar6.getString(R.string.select_new_long_day);
                                        String lowerCase8 = string.toLowerCase(Locale.ROOT);
                                        lowerCase8.getClass();
                                        String strA8 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase8);
                                        final int i211 = 7;
                                        p2Var3.k(null, new mv1.e(false, string8, strA8, 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i112 = i211;
                                                b bVar7 = this.f141487b;
                                                switch (i112) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar111 != null ? aVar111.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                            if (aVar112 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar112, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i116 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i212 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i213 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i214 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i215 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        r5();
                                    }
                                } else if (z15) {
                                    bVar = (mv1.b) p2Var.getValue();
                                    if (bVar != null) {
                                        arrayList8 = 0;
                                    } else {
                                        arrayList8 = 0;
                                    }
                                    if (arrayList8 == 0) {
                                        arrayList8 = p13.j0.f134944a;
                                    }
                                    D5(arrayList8);
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        final int i212 = 0;
                                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i112 = i212;
                                                b bVar7 = this.f141487b;
                                                switch (i112) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i113 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i114 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar111 != null ? aVar111.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                            if (aVar112 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar112, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i116 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i213 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i214 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i215 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i216 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        u5("FBTEditTriathlonSwimDaysFragment");
                                    }
                                } else {
                                    if (z16) {
                                    }
                                    if (list4 != null) {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str114 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str115 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    }
                                    if (p5()) {
                                        do {
                                            if (list2 != null) {
                                            }
                                            ArrayList arrayList15 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str116 = (String) obj10;
                                                if (list2 == null) {
                                                }
                                            }
                                            D5(arrayList15);
                                        } while (list2.contains(str12));
                                        ArrayList arrayList16 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str117 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList16);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                    }
                }
                p2Var2 = p2Var5;
                iJ = tu1.a.j(hVarC5, oVar, z29, z34);
                if (e5()) {
                    pVar = og.a.Z(iJ, size, z16);
                } else {
                    pVar = new p(Boolean.FALSE, 5);
                }
                zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                iIntValue = ((Number) pVar.f128595b).intValue();
                iHashCode = str.hashCode();
                p2Var3 = this.f141491c1;
                switch (iHashCode) {
                    case -746357180:
                        if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                            if (!zBooleanValue) {
                                if (z16) {
                                }
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i112 = 5;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i113 = i112;
                                        b bVar7 = this.f141487b;
                                        switch (i113) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i114 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i115 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar111 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar111 != null ? aVar111.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                    if (aVar112 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar112, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i116 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i117 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i213 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i214 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i215 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i216 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTrainingDaysFragment");
                            }
                            break;
                        }
                        break;
                    case 525791086:
                        if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                            if (list9 != null) {
                                arrayList = new ArrayList();
                                while (r4.hasNext()) {
                                    String str118 = (String) obj;
                                    if (list2 != null) {
                                    }
                                    arrayList.add(obj);
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            if (!((Collection) arrayList).isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                            } else {
                                if (list2 != null) {
                                    arrayList2 = new ArrayList(list2);
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        if (!arrayList2.contains((String) obj2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayList2.addAll(arrayList3);
                                }
                                if (p5()) {
                                    if (arrayList2 != null) {
                                        listB2 = p13.j0.f134944a;
                                    } else {
                                        listB2 = p13.j0.f134944a;
                                    }
                                    z5(listB2);
                                } else {
                                    if (arrayList2 != null) {
                                        listB1 = p13.j0.f134944a;
                                    } else {
                                        listB1 = p13.j0.f134944a;
                                    }
                                    w5(listB1);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 645158341:
                        if (!str.equals("FBTEditLongDaysFragment")) {
                            if (!p5()) {
                            }
                            if (z16) {
                            }
                            arrayList4 = new ArrayList();
                            while (r5.hasNext()) {
                                String str119 = (String) obj3;
                                if (list2 != null) {
                                }
                                arrayList4.add(obj3);
                            }
                            if (!arrayList4.isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String strA9 = aVar6.a(R.string.long_training_day_updated, string);
                                String lowerCase9 = string.toLowerCase(Locale.ROOT);
                                lowerCase9.getClass();
                                p2Var3.k(null, new mv1.e(false, strA9, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase9), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                            } else {
                                if (list2 != null) {
                                    arrayList5 = new ArrayList(list2);
                                } else {
                                    arrayList5 = null;
                                }
                                if (arrayList5 != null) {
                                    arrayList6 = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (!arrayList5.contains((String) obj4)) {
                                            arrayList6.add(obj4);
                                        }
                                    }
                                    arrayList5.addAll(arrayList6);
                                }
                                wt1.q.a aVar111 = wt1.q.f187120f;
                                if (arrayList5 != null) {
                                    listB3 = p13.j0.f134944a;
                                } else {
                                    listB3 = p13.j0.f134944a;
                                }
                                aVar111.getClass();
                                listF = wt1.q.a.f(listB3);
                                if (p5()) {
                                    z5(h0.b1(listF));
                                } else {
                                    w5(h0.b1(listF));
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 950460184:
                        if (str.equals("FBTEditTrainingLevelFragment")) {
                            if (list3 != null) {
                                boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                            } else {
                                boolValueOf = null;
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            b5();
                        }
                        break;
                    case 1659444830:
                        if (!str.equals("FBTEditElevationProfileFragment")) {
                            aVar3 = (mv1.a) p2Var2.getValue();
                            if (aVar3 != null) {
                                list5 = p13.j0.f134944a;
                            } else {
                                list5 = p13.j0.f134944a;
                            }
                            aVar4 = (mv1.a) p2Var2.getValue();
                            if (aVar4 != null) {
                                oVarE = null;
                            } else {
                                oVarE = null;
                            }
                            if (oVarE != null) {
                                if (oVarE instanceof jv1.o.a) {
                                    aVar5 = (mv1.a) p2Var2.getValue();
                                    if (aVar5 != null) {
                                        elevationGainMeter = null;
                                    } else {
                                        elevationGainMeter = null;
                                    }
                                    dF5 = f5();
                                    if (zf.b.D(elevationGainMeter)) {
                                        if (zf.b.D(dF5)) {
                                            if (dF5.doubleValue() > 0.0d) {
                                            }
                                        }
                                    }
                                }
                                u5("FBTEditHillTypeFragment");
                            }
                            j5(hv1.e.FLAT);
                            break;
                        }
                        break;
                    case 1818589731:
                        if (!str.equals("FBTEditTrainingDaysFragment")) {
                            if (z14) {
                            }
                            if (!z14) {
                                arrayList9 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str1110 = (String) obj7;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList9);
                                } else {
                                    x5(arrayList9);
                                }
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String string9 = aVar6.getString(R.string.select_new_long_day);
                                    String lowerCase10 = string.toLowerCase(Locale.ROOT);
                                    lowerCase10.getClass();
                                    String strA10 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase10);
                                    final int i213 = 7;
                                    p2Var3.k(null, new mv1.e(false, string9, strA10, 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i113 = i213;
                                            b bVar7 = this.f141487b;
                                            switch (i113) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i114 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i115 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar112 != null ? aVar112.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                        if (aVar113 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar113, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i214 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i215 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i216 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i217 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    r5();
                                }
                            } else if (z15) {
                                bVar = (mv1.b) p2Var.getValue();
                                if (bVar != null) {
                                    arrayList8 = 0;
                                } else {
                                    arrayList8 = 0;
                                }
                                if (arrayList8 == 0) {
                                    arrayList8 = p13.j0.f134944a;
                                }
                                D5(arrayList8);
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i214 = 0;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i113 = i214;
                                            b bVar7 = this.f141487b;
                                            switch (i113) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i114 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i115 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar112 != null ? aVar112.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                        if (aVar113 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar113, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i215 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i216 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i217 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i218 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTriathlonSwimDaysFragment");
                                }
                            } else {
                                if (z16) {
                                }
                                if (list4 != null) {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1111 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1112 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                }
                                if (p5()) {
                                    do {
                                        if (list2 != null) {
                                        }
                                        ArrayList arrayList17 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1113 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList17);
                                    } while (list2.contains(str12));
                                    ArrayList arrayList18 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str1114 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList18);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                }
            }
            list4 = list;
            boolean zK6 = k5();
            if (aVar13 != null) {
                courseId = null;
            } else {
                courseId = null;
            }
            if (courseId != null) {
                z24 = true;
            } else {
                z24 = false;
            }
            dF6 = f5();
            if (zf.b.D(dF6)) {
                z25 = false;
            } else {
                z25 = false;
            }
            if (!zD) {
            }
            jv1.h hVarC6 = c5();
            vt1.o oVar2 = this.Y;
            if (list3 != null) {
                z19 = z18;
                p2Var = p2Var4;
                boolean z210 = z17;
                if ((list3.isEmpty() ^ true) == z210) {
                }
                aVar2 = (mv1.a) p2Var5.getValue();
                if (aVar2 != null) {
                    p2Var2 = p2Var5;
                    if (aVar2.f121165c) {
                    }
                    iJ = tu1.a.j(hVarC6, oVar2, z29, z34);
                    if (e5()) {
                        pVar = og.a.Z(iJ, size, z16);
                    } else {
                        pVar = new p(Boolean.FALSE, 5);
                    }
                    zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                    iIntValue = ((Number) pVar.f128595b).intValue();
                    iHashCode = str.hashCode();
                    p2Var3 = this.f141491c1;
                    switch (iHashCode) {
                        case -746357180:
                            if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                                if (!zBooleanValue) {
                                    if (z16) {
                                    }
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i113 = 5;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i114 = i113;
                                            b bVar7 = this.f141487b;
                                            switch (i114) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i115 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar112 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar112 != null ? aVar112.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                        if (aVar113 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar113, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i118 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i215 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i216 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i217 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i218 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTrainingDaysFragment");
                                }
                                break;
                            }
                            break;
                        case 525791086:
                            if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                                if (list9 != null) {
                                    arrayList = new ArrayList();
                                    while (r4.hasNext()) {
                                        String str1115 = (String) obj;
                                        if (list2 != null) {
                                        }
                                        arrayList.add(obj);
                                    }
                                } else {
                                    arrayList = p13.j0.f134944a;
                                }
                                if (!((Collection) arrayList).isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList(list2);
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        arrayList3 = new ArrayList();
                                        while (r2.hasNext()) {
                                            if (!arrayList2.contains((String) obj2)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2.addAll(arrayList3);
                                    }
                                    if (p5()) {
                                        if (arrayList2 != null) {
                                            listB2 = p13.j0.f134944a;
                                        } else {
                                            listB2 = p13.j0.f134944a;
                                        }
                                        z5(listB2);
                                    } else {
                                        if (arrayList2 != null) {
                                            listB1 = p13.j0.f134944a;
                                        } else {
                                            listB1 = p13.j0.f134944a;
                                        }
                                        w5(listB1);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 645158341:
                            if (!str.equals("FBTEditLongDaysFragment")) {
                                if (!p5()) {
                                }
                                if (z16) {
                                }
                                arrayList4 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str1116 = (String) obj3;
                                    if (list2 != null) {
                                    }
                                    arrayList4.add(obj3);
                                }
                                if (!arrayList4.isEmpty()) {
                                    b5();
                                } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String strA11 = aVar6.a(R.string.long_training_day_updated, string);
                                    String lowerCase11 = string.toLowerCase(Locale.ROOT);
                                    lowerCase11.getClass();
                                    p2Var3.k(null, new mv1.e(false, strA11, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase11), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                                } else {
                                    if (list2 != null) {
                                        arrayList5 = new ArrayList(list2);
                                    } else {
                                        arrayList5 = null;
                                    }
                                    if (arrayList5 != null) {
                                        arrayList6 = new ArrayList();
                                        while (r3.hasNext()) {
                                            if (!arrayList5.contains((String) obj4)) {
                                                arrayList6.add(obj4);
                                            }
                                        }
                                        arrayList5.addAll(arrayList6);
                                    }
                                    wt1.q.a aVar112 = wt1.q.f187120f;
                                    if (arrayList5 != null) {
                                        listB3 = p13.j0.f134944a;
                                    } else {
                                        listB3 = p13.j0.f134944a;
                                    }
                                    aVar112.getClass();
                                    listF = wt1.q.a.f(listB3);
                                    if (p5()) {
                                        z5(h0.b1(listF));
                                    } else {
                                        w5(h0.b1(listF));
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                        case 950460184:
                            if (str.equals("FBTEditTrainingLevelFragment")) {
                                if (list3 != null) {
                                    boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                                } else {
                                    boolValueOf = null;
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                b5();
                            }
                            break;
                        case 1659444830:
                            if (!str.equals("FBTEditElevationProfileFragment")) {
                                aVar3 = (mv1.a) p2Var2.getValue();
                                if (aVar3 != null) {
                                    list5 = p13.j0.f134944a;
                                } else {
                                    list5 = p13.j0.f134944a;
                                }
                                aVar4 = (mv1.a) p2Var2.getValue();
                                if (aVar4 != null) {
                                    oVarE = null;
                                } else {
                                    oVarE = null;
                                }
                                if (oVarE != null) {
                                    if (oVarE instanceof jv1.o.a) {
                                        aVar5 = (mv1.a) p2Var2.getValue();
                                        if (aVar5 != null) {
                                            elevationGainMeter = null;
                                        } else {
                                            elevationGainMeter = null;
                                        }
                                        dF5 = f5();
                                        if (zf.b.D(elevationGainMeter)) {
                                            if (zf.b.D(dF5)) {
                                                if (dF5.doubleValue() > 0.0d) {
                                                }
                                            }
                                        }
                                    }
                                    u5("FBTEditHillTypeFragment");
                                }
                                j5(hv1.e.FLAT);
                                break;
                            }
                            break;
                        case 1818589731:
                            if (!str.equals("FBTEditTrainingDaysFragment")) {
                                if (z14) {
                                }
                                if (!z14) {
                                    arrayList9 = new ArrayList();
                                    while (r5.hasNext()) {
                                        String str1117 = (String) obj7;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList9);
                                    } else {
                                        x5(arrayList9);
                                    }
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        String string10 = aVar6.getString(R.string.select_new_long_day);
                                        String lowerCase12 = string.toLowerCase(Locale.ROOT);
                                        lowerCase12.getClass();
                                        String strA12 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase12);
                                        final int i215 = 7;
                                        p2Var3.k(null, new mv1.e(false, string10, strA12, 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i114 = i215;
                                                b bVar7 = this.f141487b;
                                                switch (i114) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i116 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar113 != null ? aVar113.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                            if (aVar114 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar114, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i117 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i118 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i216 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i217 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i218 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i219 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        r5();
                                    }
                                } else if (z15) {
                                    bVar = (mv1.b) p2Var.getValue();
                                    if (bVar != null) {
                                        arrayList8 = 0;
                                    } else {
                                        arrayList8 = 0;
                                    }
                                    if (arrayList8 == 0) {
                                        arrayList8 = p13.j0.f134944a;
                                    }
                                    D5(arrayList8);
                                    if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                        final int i216 = 0;
                                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ b f141487b;

                                            {
                                                this.f141487b = this;
                                            }

                                            @Override // e23.l
                                            public final Object invoke(Object obj11) {
                                                int i114 = i216;
                                                b bVar7 = this.f141487b;
                                                switch (i114) {
                                                    case 0:
                                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                        int i115 = b.f141488i1;
                                                        if (zBooleanValue2) {
                                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                        }
                                                        break;
                                                    case 1:
                                                        p2 p2Var6 = bVar7.N0;
                                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                        int i116 = b.f141488i1;
                                                        if (zBooleanValue3) {
                                                            mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                            mv1.a aVarA = null;
                                                            fg0.k kVar4 = aVar113 != null ? aVar113.f121169g : null;
                                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                            mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                            if (aVar114 != null) {
                                                                new dv1.a();
                                                                aVarA = mv1.a.a(aVar114, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                            }
                                                            p2Var6.setValue(aVarA);
                                                            bVar7.u5("FBTEditElevationProfileFragment");
                                                        } else {
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 2:
                                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                        int i117 = b.f141488i1;
                                                        if (zBooleanValue4) {
                                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                        }
                                                        break;
                                                    case 3:
                                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                        int i118 = b.f141488i1;
                                                        if (zBooleanValue5) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 4:
                                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                        int i217 = b.f141488i1;
                                                        if (zBooleanValue6) {
                                                            bVar7.t5();
                                                            bVar7.b5();
                                                        }
                                                        break;
                                                    case 5:
                                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                        int i218 = b.f141488i1;
                                                        if (zBooleanValue7) {
                                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                                        }
                                                        break;
                                                    case 6:
                                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                        int i219 = b.f141488i1;
                                                        if (zBooleanValue8) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                    default:
                                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                        int i2110 = b.f141488i1;
                                                        if (zBooleanValue9) {
                                                            bVar7.r5();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 25, null));
                                    } else {
                                        u5("FBTEditTriathlonSwimDaysFragment");
                                    }
                                } else {
                                    if (z16) {
                                    }
                                    if (list4 != null) {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str1118 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (list2 != null) {
                                            }
                                            arrayList7 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str1119 = (String) obj9;
                                                if (list2 == null) {
                                                }
                                            }
                                            if (p5()) {
                                                C5(arrayList7);
                                            } else {
                                                x5(arrayList7);
                                            }
                                        }
                                    }
                                    if (p5()) {
                                        do {
                                            if (list2 != null) {
                                            }
                                            ArrayList arrayList19 = new ArrayList();
                                            while (r2.hasNext()) {
                                                String str11110 = (String) obj10;
                                                if (list2 == null) {
                                                }
                                            }
                                            D5(arrayList19);
                                        } while (list2.contains(str12));
                                        ArrayList arrayList110 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str11111 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList110);
                                    }
                                    b5();
                                }
                                break;
                            }
                            break;
                    }
                }
                p2Var2 = p2Var5;
                iJ = tu1.a.j(hVarC6, oVar2, z29, z34);
                if (e5()) {
                    pVar = og.a.Z(iJ, size, z16);
                } else {
                    pVar = new p(Boolean.FALSE, 5);
                }
                zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                iIntValue = ((Number) pVar.f128595b).intValue();
                iHashCode = str.hashCode();
                p2Var3 = this.f141491c1;
                switch (iHashCode) {
                    case -746357180:
                        if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                            if (!zBooleanValue) {
                                if (z16) {
                                }
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i114 = 5;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i115 = i114;
                                        b bVar7 = this.f141487b;
                                        switch (i115) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i116 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i117 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar113 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar113 != null ? aVar113.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                    if (aVar114 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar114, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i118 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i119 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i217 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i218 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i219 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2110 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTrainingDaysFragment");
                            }
                            break;
                        }
                        break;
                    case 525791086:
                        if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                            if (list9 != null) {
                                arrayList = new ArrayList();
                                while (r4.hasNext()) {
                                    String str11112 = (String) obj;
                                    if (list2 != null) {
                                    }
                                    arrayList.add(obj);
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            if (!((Collection) arrayList).isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                            } else {
                                if (list2 != null) {
                                    arrayList2 = new ArrayList(list2);
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        if (!arrayList2.contains((String) obj2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayList2.addAll(arrayList3);
                                }
                                if (p5()) {
                                    if (arrayList2 != null) {
                                        listB2 = p13.j0.f134944a;
                                    } else {
                                        listB2 = p13.j0.f134944a;
                                    }
                                    z5(listB2);
                                } else {
                                    if (arrayList2 != null) {
                                        listB1 = p13.j0.f134944a;
                                    } else {
                                        listB1 = p13.j0.f134944a;
                                    }
                                    w5(listB1);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 645158341:
                        if (!str.equals("FBTEditLongDaysFragment")) {
                            if (!p5()) {
                            }
                            if (z16) {
                            }
                            arrayList4 = new ArrayList();
                            while (r5.hasNext()) {
                                String str11113 = (String) obj3;
                                if (list2 != null) {
                                }
                                arrayList4.add(obj3);
                            }
                            if (!arrayList4.isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String strA13 = aVar6.a(R.string.long_training_day_updated, string);
                                String lowerCase13 = string.toLowerCase(Locale.ROOT);
                                lowerCase13.getClass();
                                p2Var3.k(null, new mv1.e(false, strA13, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase13), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                            } else {
                                if (list2 != null) {
                                    arrayList5 = new ArrayList(list2);
                                } else {
                                    arrayList5 = null;
                                }
                                if (arrayList5 != null) {
                                    arrayList6 = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (!arrayList5.contains((String) obj4)) {
                                            arrayList6.add(obj4);
                                        }
                                    }
                                    arrayList5.addAll(arrayList6);
                                }
                                wt1.q.a aVar113 = wt1.q.f187120f;
                                if (arrayList5 != null) {
                                    listB3 = p13.j0.f134944a;
                                } else {
                                    listB3 = p13.j0.f134944a;
                                }
                                aVar113.getClass();
                                listF = wt1.q.a.f(listB3);
                                if (p5()) {
                                    z5(h0.b1(listF));
                                } else {
                                    w5(h0.b1(listF));
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 950460184:
                        if (str.equals("FBTEditTrainingLevelFragment")) {
                            if (list3 != null) {
                                boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                            } else {
                                boolValueOf = null;
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            b5();
                        }
                        break;
                    case 1659444830:
                        if (!str.equals("FBTEditElevationProfileFragment")) {
                            aVar3 = (mv1.a) p2Var2.getValue();
                            if (aVar3 != null) {
                                list5 = p13.j0.f134944a;
                            } else {
                                list5 = p13.j0.f134944a;
                            }
                            aVar4 = (mv1.a) p2Var2.getValue();
                            if (aVar4 != null) {
                                oVarE = null;
                            } else {
                                oVarE = null;
                            }
                            if (oVarE != null) {
                                if (oVarE instanceof jv1.o.a) {
                                    aVar5 = (mv1.a) p2Var2.getValue();
                                    if (aVar5 != null) {
                                        elevationGainMeter = null;
                                    } else {
                                        elevationGainMeter = null;
                                    }
                                    dF5 = f5();
                                    if (zf.b.D(elevationGainMeter)) {
                                        if (zf.b.D(dF5)) {
                                            if (dF5.doubleValue() > 0.0d) {
                                            }
                                        }
                                    }
                                }
                                u5("FBTEditHillTypeFragment");
                            }
                            j5(hv1.e.FLAT);
                            break;
                        }
                        break;
                    case 1818589731:
                        if (!str.equals("FBTEditTrainingDaysFragment")) {
                            if (z14) {
                            }
                            if (!z14) {
                                arrayList9 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str11114 = (String) obj7;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList9);
                                } else {
                                    x5(arrayList9);
                                }
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String string11 = aVar6.getString(R.string.select_new_long_day);
                                    String lowerCase14 = string.toLowerCase(Locale.ROOT);
                                    lowerCase14.getClass();
                                    String strA14 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase14);
                                    final int i217 = 7;
                                    p2Var3.k(null, new mv1.e(false, string11, strA14, 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i115 = i217;
                                            b bVar7 = this.f141487b;
                                            switch (i115) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar114 != null ? aVar114.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                        if (aVar115 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar115, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i118 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i218 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i219 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2110 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2111 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    r5();
                                }
                            } else if (z15) {
                                bVar = (mv1.b) p2Var.getValue();
                                if (bVar != null) {
                                    arrayList8 = 0;
                                } else {
                                    arrayList8 = 0;
                                }
                                if (arrayList8 == 0) {
                                    arrayList8 = p13.j0.f134944a;
                                }
                                D5(arrayList8);
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i218 = 0;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i115 = i218;
                                            b bVar7 = this.f141487b;
                                            switch (i115) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i116 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar114 != null ? aVar114.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                        if (aVar115 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar115, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i118 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i219 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i2110 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2111 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2112 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTriathlonSwimDaysFragment");
                                }
                            } else {
                                if (z16) {
                                }
                                if (list4 != null) {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str11115 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str11116 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                }
                                if (p5()) {
                                    do {
                                        if (list2 != null) {
                                        }
                                        ArrayList arrayList111 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str11117 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList111);
                                    } while (list2.contains(str12));
                                    ArrayList arrayList112 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str11118 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList112);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                }
            }
            z19 = z18;
            p2Var = p2Var4;
            aVar2 = (mv1.a) p2Var5.getValue();
            if (aVar2 != null) {
                p2Var2 = p2Var5;
                if (aVar2.f121165c) {
                }
                iJ = tu1.a.j(hVarC6, oVar2, z29, z34);
                if (e5()) {
                    pVar = og.a.Z(iJ, size, z16);
                } else {
                    pVar = new p(Boolean.FALSE, 5);
                }
                zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                iIntValue = ((Number) pVar.f128595b).intValue();
                iHashCode = str.hashCode();
                p2Var3 = this.f141491c1;
                switch (iHashCode) {
                    case -746357180:
                        if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                            if (!zBooleanValue) {
                                if (z16) {
                                }
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i115 = 5;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i116 = i115;
                                        b bVar7 = this.f141487b;
                                        switch (i116) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i117 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i118 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar114 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar114 != null ? aVar114.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                    if (aVar115 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar115, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i119 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i219 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2110 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2111 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2112 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTrainingDaysFragment");
                            }
                            break;
                        }
                        break;
                    case 525791086:
                        if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                            if (list9 != null) {
                                arrayList = new ArrayList();
                                while (r4.hasNext()) {
                                    String str11119 = (String) obj;
                                    if (list2 != null) {
                                    }
                                    arrayList.add(obj);
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            if (!((Collection) arrayList).isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                            } else {
                                if (list2 != null) {
                                    arrayList2 = new ArrayList(list2);
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        if (!arrayList2.contains((String) obj2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayList2.addAll(arrayList3);
                                }
                                if (p5()) {
                                    if (arrayList2 != null) {
                                        listB2 = p13.j0.f134944a;
                                    } else {
                                        listB2 = p13.j0.f134944a;
                                    }
                                    z5(listB2);
                                } else {
                                    if (arrayList2 != null) {
                                        listB1 = p13.j0.f134944a;
                                    } else {
                                        listB1 = p13.j0.f134944a;
                                    }
                                    w5(listB1);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 645158341:
                        if (!str.equals("FBTEditLongDaysFragment")) {
                            if (!p5()) {
                            }
                            if (z16) {
                            }
                            arrayList4 = new ArrayList();
                            while (r5.hasNext()) {
                                String str111110 = (String) obj3;
                                if (list2 != null) {
                                }
                                arrayList4.add(obj3);
                            }
                            if (!arrayList4.isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String strA15 = aVar6.a(R.string.long_training_day_updated, string);
                                String lowerCase15 = string.toLowerCase(Locale.ROOT);
                                lowerCase15.getClass();
                                p2Var3.k(null, new mv1.e(false, strA15, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase15), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                            } else {
                                if (list2 != null) {
                                    arrayList5 = new ArrayList(list2);
                                } else {
                                    arrayList5 = null;
                                }
                                if (arrayList5 != null) {
                                    arrayList6 = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (!arrayList5.contains((String) obj4)) {
                                            arrayList6.add(obj4);
                                        }
                                    }
                                    arrayList5.addAll(arrayList6);
                                }
                                wt1.q.a aVar114 = wt1.q.f187120f;
                                if (arrayList5 != null) {
                                    listB3 = p13.j0.f134944a;
                                } else {
                                    listB3 = p13.j0.f134944a;
                                }
                                aVar114.getClass();
                                listF = wt1.q.a.f(listB3);
                                if (p5()) {
                                    z5(h0.b1(listF));
                                } else {
                                    w5(h0.b1(listF));
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 950460184:
                        if (str.equals("FBTEditTrainingLevelFragment")) {
                            if (list3 != null) {
                                boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                            } else {
                                boolValueOf = null;
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            b5();
                        }
                        break;
                    case 1659444830:
                        if (!str.equals("FBTEditElevationProfileFragment")) {
                            aVar3 = (mv1.a) p2Var2.getValue();
                            if (aVar3 != null) {
                                list5 = p13.j0.f134944a;
                            } else {
                                list5 = p13.j0.f134944a;
                            }
                            aVar4 = (mv1.a) p2Var2.getValue();
                            if (aVar4 != null) {
                                oVarE = null;
                            } else {
                                oVarE = null;
                            }
                            if (oVarE != null) {
                                if (oVarE instanceof jv1.o.a) {
                                    aVar5 = (mv1.a) p2Var2.getValue();
                                    if (aVar5 != null) {
                                        elevationGainMeter = null;
                                    } else {
                                        elevationGainMeter = null;
                                    }
                                    dF5 = f5();
                                    if (zf.b.D(elevationGainMeter)) {
                                        if (zf.b.D(dF5)) {
                                            if (dF5.doubleValue() > 0.0d) {
                                            }
                                        }
                                    }
                                }
                                u5("FBTEditHillTypeFragment");
                            }
                            j5(hv1.e.FLAT);
                            break;
                        }
                        break;
                    case 1818589731:
                        if (!str.equals("FBTEditTrainingDaysFragment")) {
                            if (z14) {
                            }
                            if (!z14) {
                                arrayList9 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str111111 = (String) obj7;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList9);
                                } else {
                                    x5(arrayList9);
                                }
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String string12 = aVar6.getString(R.string.select_new_long_day);
                                    String lowerCase16 = string.toLowerCase(Locale.ROOT);
                                    lowerCase16.getClass();
                                    String strA16 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase16);
                                    final int i219 = 7;
                                    p2Var3.k(null, new mv1.e(false, string12, strA16, 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i116 = i219;
                                            b bVar7 = this.f141487b;
                                            switch (i116) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i118 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar115 != null ? aVar115.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                        if (aVar116 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar116, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i1110 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i2110 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i2111 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2112 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2113 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    r5();
                                }
                            } else if (z15) {
                                bVar = (mv1.b) p2Var.getValue();
                                if (bVar != null) {
                                    arrayList8 = 0;
                                } else {
                                    arrayList8 = 0;
                                }
                                if (arrayList8 == 0) {
                                    arrayList8 = p13.j0.f134944a;
                                }
                                D5(arrayList8);
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i2110 = 0;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i116 = i2110;
                                            b bVar7 = this.f141487b;
                                            switch (i116) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i117 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i118 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar115 != null ? aVar115.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                        if (aVar116 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar116, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i1110 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i2111 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i2112 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2113 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2114 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTriathlonSwimDaysFragment");
                                }
                            } else {
                                if (z16) {
                                }
                                if (list4 != null) {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str111112 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str111113 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                }
                                if (p5()) {
                                    do {
                                        if (list2 != null) {
                                        }
                                        ArrayList arrayList113 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str111114 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList113);
                                    } while (list2.contains(str12));
                                    ArrayList arrayList114 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str111115 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList114);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                }
            }
            p2Var2 = p2Var5;
            iJ = tu1.a.j(hVarC6, oVar2, z29, z34);
            if (e5()) {
                pVar = og.a.Z(iJ, size, z16);
            } else {
                pVar = new p(Boolean.FALSE, 5);
            }
            zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
            iIntValue = ((Number) pVar.f128595b).intValue();
            iHashCode = str.hashCode();
            p2Var3 = this.f141491c1;
            switch (iHashCode) {
                case -746357180:
                    if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                        if (!zBooleanValue) {
                            if (z16) {
                            }
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            final int i116 = 5;
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b f141487b;

                                {
                                    this.f141487b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    int i117 = i116;
                                    b bVar7 = this.f141487b;
                                    switch (i117) {
                                        case 0:
                                            boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                            int i118 = b.f141488i1;
                                            if (zBooleanValue2) {
                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                            }
                                            break;
                                        case 1:
                                            p2 p2Var6 = bVar7.N0;
                                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                            int i119 = b.f141488i1;
                                            if (zBooleanValue3) {
                                                mv1.a aVar115 = (mv1.a) p2Var6.getValue();
                                                mv1.a aVarA = null;
                                                fg0.k kVar4 = aVar115 != null ? aVar115.f121169g : null;
                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                if (aVar116 != null) {
                                                    new dv1.a();
                                                    aVarA = mv1.a.a(aVar116, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                }
                                                p2Var6.setValue(aVarA);
                                                bVar7.u5("FBTEditElevationProfileFragment");
                                            } else {
                                                bVar7.b5();
                                            }
                                            break;
                                        case 2:
                                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                            int i1110 = b.f141488i1;
                                            if (zBooleanValue4) {
                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                            }
                                            break;
                                        case 3:
                                            boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                            int i1111 = b.f141488i1;
                                            if (zBooleanValue5) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 4:
                                            boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                            int i2111 = b.f141488i1;
                                            if (zBooleanValue6) {
                                                bVar7.t5();
                                                bVar7.b5();
                                            }
                                            break;
                                        case 5:
                                            boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                            int i2112 = b.f141488i1;
                                            if (zBooleanValue7) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 6:
                                            boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                            int i2113 = b.f141488i1;
                                            if (zBooleanValue8) {
                                                bVar7.r5();
                                            }
                                            break;
                                        default:
                                            boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                            int i2114 = b.f141488i1;
                                            if (zBooleanValue9) {
                                                bVar7.r5();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 25, null));
                        } else {
                            u5("FBTEditTrainingDaysFragment");
                        }
                        break;
                    }
                    break;
                case 525791086:
                    if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                        if (list9 != null) {
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                String str111116 = (String) obj;
                                if (list2 != null) {
                                }
                                arrayList.add(obj);
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                        if (!((Collection) arrayList).isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                        } else {
                            if (list2 != null) {
                                arrayList2 = new ArrayList(list2);
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    if (!arrayList2.contains((String) obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList2.addAll(arrayList3);
                            }
                            if (p5()) {
                                if (arrayList2 != null) {
                                    listB2 = p13.j0.f134944a;
                                } else {
                                    listB2 = p13.j0.f134944a;
                                }
                                z5(listB2);
                            } else {
                                if (arrayList2 != null) {
                                    listB1 = p13.j0.f134944a;
                                } else {
                                    listB1 = p13.j0.f134944a;
                                }
                                w5(listB1);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 645158341:
                    if (!str.equals("FBTEditLongDaysFragment")) {
                        if (!p5()) {
                        }
                        if (z16) {
                        }
                        arrayList4 = new ArrayList();
                        while (r5.hasNext()) {
                            String str111117 = (String) obj3;
                            if (list2 != null) {
                            }
                            arrayList4.add(obj3);
                        }
                        if (!arrayList4.isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            String strA17 = aVar6.a(R.string.long_training_day_updated, string);
                            String lowerCase17 = string.toLowerCase(Locale.ROOT);
                            lowerCase17.getClass();
                            p2Var3.k(null, new mv1.e(false, strA17, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase17), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                        } else {
                            if (list2 != null) {
                                arrayList5 = new ArrayList(list2);
                            } else {
                                arrayList5 = null;
                            }
                            if (arrayList5 != null) {
                                arrayList6 = new ArrayList();
                                while (r3.hasNext()) {
                                    if (!arrayList5.contains((String) obj4)) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                arrayList5.addAll(arrayList6);
                            }
                            wt1.q.a aVar115 = wt1.q.f187120f;
                            if (arrayList5 != null) {
                                listB3 = p13.j0.f134944a;
                            } else {
                                listB3 = p13.j0.f134944a;
                            }
                            aVar115.getClass();
                            listF = wt1.q.a.f(listB3);
                            if (p5()) {
                                z5(h0.b1(listF));
                            } else {
                                w5(h0.b1(listF));
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 950460184:
                    if (str.equals("FBTEditTrainingLevelFragment")) {
                        if (list3 != null) {
                            boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                        } else {
                            boolValueOf = null;
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (z16) {
                        }
                        b5();
                    }
                    break;
                case 1659444830:
                    if (!str.equals("FBTEditElevationProfileFragment")) {
                        aVar3 = (mv1.a) p2Var2.getValue();
                        if (aVar3 != null) {
                            list5 = p13.j0.f134944a;
                        } else {
                            list5 = p13.j0.f134944a;
                        }
                        aVar4 = (mv1.a) p2Var2.getValue();
                        if (aVar4 != null) {
                            oVarE = null;
                        } else {
                            oVarE = null;
                        }
                        if (oVarE != null) {
                            if (oVarE instanceof jv1.o.a) {
                                aVar5 = (mv1.a) p2Var2.getValue();
                                if (aVar5 != null) {
                                    elevationGainMeter = null;
                                } else {
                                    elevationGainMeter = null;
                                }
                                dF5 = f5();
                                if (zf.b.D(elevationGainMeter)) {
                                    if (zf.b.D(dF5)) {
                                        if (dF5.doubleValue() > 0.0d) {
                                        }
                                    }
                                }
                            }
                            u5("FBTEditHillTypeFragment");
                        }
                        j5(hv1.e.FLAT);
                        break;
                    }
                    break;
                case 1818589731:
                    if (!str.equals("FBTEditTrainingDaysFragment")) {
                        if (z14) {
                        }
                        if (!z14) {
                            arrayList9 = new ArrayList();
                            while (r5.hasNext()) {
                                String str111118 = (String) obj7;
                                if (list2 == null) {
                                }
                            }
                            if (p5()) {
                                C5(arrayList9);
                            } else {
                                x5(arrayList9);
                            }
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String string13 = aVar6.getString(R.string.select_new_long_day);
                                String lowerCase18 = string.toLowerCase(Locale.ROOT);
                                lowerCase18.getClass();
                                String strA18 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase18);
                                final int i2111 = 7;
                                p2Var3.k(null, new mv1.e(false, string13, strA18, 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i117 = i2111;
                                        b bVar7 = this.f141487b;
                                        switch (i117) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i118 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i119 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar116 != null ? aVar116.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                    if (aVar117 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar117, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2112 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2113 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2114 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2115 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                r5();
                            }
                        } else if (z15) {
                            bVar = (mv1.b) p2Var.getValue();
                            if (bVar != null) {
                                arrayList8 = 0;
                            } else {
                                arrayList8 = 0;
                            }
                            if (arrayList8 == 0) {
                                arrayList8 = p13.j0.f134944a;
                            }
                            D5(arrayList8);
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i2112 = 0;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i117 = i2112;
                                        b bVar7 = this.f141487b;
                                        switch (i117) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i118 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i119 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar116 != null ? aVar116.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                    if (aVar117 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar117, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2113 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2114 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2115 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2116 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTriathlonSwimDaysFragment");
                            }
                        } else {
                            if (z16) {
                            }
                            if (list4 != null) {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str111119 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            } else {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str1111110 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            }
                            if (p5()) {
                                do {
                                    if (list2 != null) {
                                    }
                                    ArrayList arrayList115 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str1111111 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList115);
                                } while (list2.contains(str12));
                                ArrayList arrayList116 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str1111112 = (String) obj10;
                                    if (list2 == null) {
                                    }
                                }
                                D5(arrayList116);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
            }
        }
        list4 = list;
        z17 = true;
        z18 = false;
        jv1.h hVarC7 = c5();
        vt1.o oVar3 = this.Y;
        if (list3 != null) {
            z19 = z18;
            p2Var = p2Var4;
            boolean z211 = z17;
            if ((list3.isEmpty() ^ true) == z211) {
            }
            aVar2 = (mv1.a) p2Var5.getValue();
            if (aVar2 != null) {
                p2Var2 = p2Var5;
                if (aVar2.f121165c) {
                }
                iJ = tu1.a.j(hVarC7, oVar3, z29, z34);
                if (e5()) {
                    pVar = og.a.Z(iJ, size, z16);
                } else {
                    pVar = new p(Boolean.FALSE, 5);
                }
                zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                iIntValue = ((Number) pVar.f128595b).intValue();
                iHashCode = str.hashCode();
                p2Var3 = this.f141491c1;
                switch (iHashCode) {
                    case -746357180:
                        if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                            if (!zBooleanValue) {
                                if (z16) {
                                }
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i117 = 5;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i118 = i117;
                                        b bVar7 = this.f141487b;
                                        switch (i118) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i119 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar116 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar116 != null ? aVar116.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                    if (aVar117 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar117, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1112 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2113 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2114 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2115 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2116 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTrainingDaysFragment");
                            }
                            break;
                        }
                        break;
                    case 525791086:
                        if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                            if (list9 != null) {
                                arrayList = new ArrayList();
                                while (r4.hasNext()) {
                                    String str1111113 = (String) obj;
                                    if (list2 != null) {
                                    }
                                    arrayList.add(obj);
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            if (!((Collection) arrayList).isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                            } else {
                                if (list2 != null) {
                                    arrayList2 = new ArrayList(list2);
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        if (!arrayList2.contains((String) obj2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayList2.addAll(arrayList3);
                                }
                                if (p5()) {
                                    if (arrayList2 != null) {
                                        listB2 = p13.j0.f134944a;
                                    } else {
                                        listB2 = p13.j0.f134944a;
                                    }
                                    z5(listB2);
                                } else {
                                    if (arrayList2 != null) {
                                        listB1 = p13.j0.f134944a;
                                    } else {
                                        listB1 = p13.j0.f134944a;
                                    }
                                    w5(listB1);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 645158341:
                        if (!str.equals("FBTEditLongDaysFragment")) {
                            if (!p5()) {
                            }
                            if (z16) {
                            }
                            arrayList4 = new ArrayList();
                            while (r5.hasNext()) {
                                String str1111114 = (String) obj3;
                                if (list2 != null) {
                                }
                                arrayList4.add(obj3);
                            }
                            if (!arrayList4.isEmpty()) {
                                b5();
                            } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String strA19 = aVar6.a(R.string.long_training_day_updated, string);
                                String lowerCase19 = string.toLowerCase(Locale.ROOT);
                                lowerCase19.getClass();
                                p2Var3.k(null, new mv1.e(false, strA19, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase19), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                            } else {
                                if (list2 != null) {
                                    arrayList5 = new ArrayList(list2);
                                } else {
                                    arrayList5 = null;
                                }
                                if (arrayList5 != null) {
                                    arrayList6 = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (!arrayList5.contains((String) obj4)) {
                                            arrayList6.add(obj4);
                                        }
                                    }
                                    arrayList5.addAll(arrayList6);
                                }
                                wt1.q.a aVar116 = wt1.q.f187120f;
                                if (arrayList5 != null) {
                                    listB3 = p13.j0.f134944a;
                                } else {
                                    listB3 = p13.j0.f134944a;
                                }
                                aVar116.getClass();
                                listF = wt1.q.a.f(listB3);
                                if (p5()) {
                                    z5(h0.b1(listF));
                                } else {
                                    w5(h0.b1(listF));
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                    case 950460184:
                        if (str.equals("FBTEditTrainingLevelFragment")) {
                            if (list3 != null) {
                                boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                            } else {
                                boolValueOf = null;
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (!z16) {
                            }
                            if (z16) {
                            }
                            b5();
                        }
                        break;
                    case 1659444830:
                        if (!str.equals("FBTEditElevationProfileFragment")) {
                            aVar3 = (mv1.a) p2Var2.getValue();
                            if (aVar3 != null) {
                                list5 = p13.j0.f134944a;
                            } else {
                                list5 = p13.j0.f134944a;
                            }
                            aVar4 = (mv1.a) p2Var2.getValue();
                            if (aVar4 != null) {
                                oVarE = null;
                            } else {
                                oVarE = null;
                            }
                            if (oVarE != null) {
                                if (oVarE instanceof jv1.o.a) {
                                    aVar5 = (mv1.a) p2Var2.getValue();
                                    if (aVar5 != null) {
                                        elevationGainMeter = null;
                                    } else {
                                        elevationGainMeter = null;
                                    }
                                    dF5 = f5();
                                    if (zf.b.D(elevationGainMeter)) {
                                        if (zf.b.D(dF5)) {
                                            if (dF5.doubleValue() > 0.0d) {
                                            }
                                        }
                                    }
                                }
                                u5("FBTEditHillTypeFragment");
                            }
                            j5(hv1.e.FLAT);
                            break;
                        }
                        break;
                    case 1818589731:
                        if (!str.equals("FBTEditTrainingDaysFragment")) {
                            if (z14) {
                            }
                            if (!z14) {
                                arrayList9 = new ArrayList();
                                while (r5.hasNext()) {
                                    String str1111115 = (String) obj7;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList9);
                                } else {
                                    x5(arrayList9);
                                }
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    String string14 = aVar6.getString(R.string.select_new_long_day);
                                    String lowerCase110 = string.toLowerCase(Locale.ROOT);
                                    lowerCase110.getClass();
                                    String strA110 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase110);
                                    final int i2113 = 7;
                                    p2Var3.k(null, new mv1.e(false, string14, strA110, 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i118 = i2113;
                                            b bVar7 = this.f141487b;
                                            switch (i118) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i1110 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar117 != null ? aVar117.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                        if (aVar118 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar118, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i1111 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i1112 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i2114 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i2115 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2116 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2117 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    r5();
                                }
                            } else if (z15) {
                                bVar = (mv1.b) p2Var.getValue();
                                if (bVar != null) {
                                    arrayList8 = 0;
                                } else {
                                    arrayList8 = 0;
                                }
                                if (arrayList8 == 0) {
                                    arrayList8 = p13.j0.f134944a;
                                }
                                D5(arrayList8);
                                if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                    final int i2114 = 0;
                                    p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ b f141487b;

                                        {
                                            this.f141487b = this;
                                        }

                                        @Override // e23.l
                                        public final Object invoke(Object obj11) {
                                            int i118 = i2114;
                                            b bVar7 = this.f141487b;
                                            switch (i118) {
                                                case 0:
                                                    boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                    int i119 = b.f141488i1;
                                                    if (zBooleanValue2) {
                                                        bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                    }
                                                    break;
                                                case 1:
                                                    p2 p2Var6 = bVar7.N0;
                                                    boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                    int i1110 = b.f141488i1;
                                                    if (zBooleanValue3) {
                                                        mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                        mv1.a aVarA = null;
                                                        fg0.k kVar4 = aVar117 != null ? aVar117.f121169g : null;
                                                        fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                        Double dB = completionTarget != null ? completionTarget.b() : null;
                                                        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                        mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                        if (aVar118 != null) {
                                                            new dv1.a();
                                                            aVarA = mv1.a.a(aVar118, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                        }
                                                        p2Var6.setValue(aVarA);
                                                        bVar7.u5("FBTEditElevationProfileFragment");
                                                    } else {
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 2:
                                                    boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                    int i1111 = b.f141488i1;
                                                    if (zBooleanValue4) {
                                                        bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                    }
                                                    break;
                                                case 3:
                                                    boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                    int i1112 = b.f141488i1;
                                                    if (zBooleanValue5) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 4:
                                                    boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                    int i2115 = b.f141488i1;
                                                    if (zBooleanValue6) {
                                                        bVar7.t5();
                                                        bVar7.b5();
                                                    }
                                                    break;
                                                case 5:
                                                    boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                    int i2116 = b.f141488i1;
                                                    if (zBooleanValue7) {
                                                        bVar7.u5("FBTEditTrainingDaysFragment");
                                                    }
                                                    break;
                                                case 6:
                                                    boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                    int i2117 = b.f141488i1;
                                                    if (zBooleanValue8) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                                default:
                                                    boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                    int i2118 = b.f141488i1;
                                                    if (zBooleanValue9) {
                                                        bVar7.r5();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, 25, null));
                                } else {
                                    u5("FBTEditTriathlonSwimDaysFragment");
                                }
                            } else {
                                if (z16) {
                                }
                                if (list4 != null) {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1111116 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (list2 != null) {
                                        }
                                        arrayList7 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1111117 = (String) obj9;
                                            if (list2 == null) {
                                            }
                                        }
                                        if (p5()) {
                                            C5(arrayList7);
                                        } else {
                                            x5(arrayList7);
                                        }
                                    }
                                }
                                if (p5()) {
                                    do {
                                        if (list2 != null) {
                                        }
                                        ArrayList arrayList117 = new ArrayList();
                                        while (r2.hasNext()) {
                                            String str1111118 = (String) obj10;
                                            if (list2 == null) {
                                            }
                                        }
                                        D5(arrayList117);
                                    } while (list2.contains(str12));
                                    ArrayList arrayList118 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str1111119 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList118);
                                }
                                b5();
                            }
                            break;
                        }
                        break;
                }
            }
            p2Var2 = p2Var5;
            iJ = tu1.a.j(hVarC7, oVar3, z29, z34);
            if (e5()) {
                pVar = og.a.Z(iJ, size, z16);
            } else {
                pVar = new p(Boolean.FALSE, 5);
            }
            zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
            iIntValue = ((Number) pVar.f128595b).intValue();
            iHashCode = str.hashCode();
            p2Var3 = this.f141491c1;
            switch (iHashCode) {
                case -746357180:
                    if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                        if (!zBooleanValue) {
                            if (z16) {
                            }
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            final int i118 = 5;
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b f141487b;

                                {
                                    this.f141487b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    int i119 = i118;
                                    b bVar7 = this.f141487b;
                                    switch (i119) {
                                        case 0:
                                            boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                            int i1110 = b.f141488i1;
                                            if (zBooleanValue2) {
                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                            }
                                            break;
                                        case 1:
                                            p2 p2Var6 = bVar7.N0;
                                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                            int i1111 = b.f141488i1;
                                            if (zBooleanValue3) {
                                                mv1.a aVar117 = (mv1.a) p2Var6.getValue();
                                                mv1.a aVarA = null;
                                                fg0.k kVar4 = aVar117 != null ? aVar117.f121169g : null;
                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                if (aVar118 != null) {
                                                    new dv1.a();
                                                    aVarA = mv1.a.a(aVar118, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                }
                                                p2Var6.setValue(aVarA);
                                                bVar7.u5("FBTEditElevationProfileFragment");
                                            } else {
                                                bVar7.b5();
                                            }
                                            break;
                                        case 2:
                                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                            int i1112 = b.f141488i1;
                                            if (zBooleanValue4) {
                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                            }
                                            break;
                                        case 3:
                                            boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                            int i1113 = b.f141488i1;
                                            if (zBooleanValue5) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 4:
                                            boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                            int i2115 = b.f141488i1;
                                            if (zBooleanValue6) {
                                                bVar7.t5();
                                                bVar7.b5();
                                            }
                                            break;
                                        case 5:
                                            boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                            int i2116 = b.f141488i1;
                                            if (zBooleanValue7) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 6:
                                            boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                            int i2117 = b.f141488i1;
                                            if (zBooleanValue8) {
                                                bVar7.r5();
                                            }
                                            break;
                                        default:
                                            boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                            int i2118 = b.f141488i1;
                                            if (zBooleanValue9) {
                                                bVar7.r5();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 25, null));
                        } else {
                            u5("FBTEditTrainingDaysFragment");
                        }
                        break;
                    }
                    break;
                case 525791086:
                    if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                        if (list9 != null) {
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                String str11111110 = (String) obj;
                                if (list2 != null) {
                                }
                                arrayList.add(obj);
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                        if (!((Collection) arrayList).isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                        } else {
                            if (list2 != null) {
                                arrayList2 = new ArrayList(list2);
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    if (!arrayList2.contains((String) obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList2.addAll(arrayList3);
                            }
                            if (p5()) {
                                if (arrayList2 != null) {
                                    listB2 = p13.j0.f134944a;
                                } else {
                                    listB2 = p13.j0.f134944a;
                                }
                                z5(listB2);
                            } else {
                                if (arrayList2 != null) {
                                    listB1 = p13.j0.f134944a;
                                } else {
                                    listB1 = p13.j0.f134944a;
                                }
                                w5(listB1);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 645158341:
                    if (!str.equals("FBTEditLongDaysFragment")) {
                        if (!p5()) {
                        }
                        if (z16) {
                        }
                        arrayList4 = new ArrayList();
                        while (r5.hasNext()) {
                            String str11111111 = (String) obj3;
                            if (list2 != null) {
                            }
                            arrayList4.add(obj3);
                        }
                        if (!arrayList4.isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            String strA111 = aVar6.a(R.string.long_training_day_updated, string);
                            String lowerCase111 = string.toLowerCase(Locale.ROOT);
                            lowerCase111.getClass();
                            p2Var3.k(null, new mv1.e(false, strA111, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase111), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                        } else {
                            if (list2 != null) {
                                arrayList5 = new ArrayList(list2);
                            } else {
                                arrayList5 = null;
                            }
                            if (arrayList5 != null) {
                                arrayList6 = new ArrayList();
                                while (r3.hasNext()) {
                                    if (!arrayList5.contains((String) obj4)) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                arrayList5.addAll(arrayList6);
                            }
                            wt1.q.a aVar117 = wt1.q.f187120f;
                            if (arrayList5 != null) {
                                listB3 = p13.j0.f134944a;
                            } else {
                                listB3 = p13.j0.f134944a;
                            }
                            aVar117.getClass();
                            listF = wt1.q.a.f(listB3);
                            if (p5()) {
                                z5(h0.b1(listF));
                            } else {
                                w5(h0.b1(listF));
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 950460184:
                    if (str.equals("FBTEditTrainingLevelFragment")) {
                        if (list3 != null) {
                            boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                        } else {
                            boolValueOf = null;
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (z16) {
                        }
                        b5();
                    }
                    break;
                case 1659444830:
                    if (!str.equals("FBTEditElevationProfileFragment")) {
                        aVar3 = (mv1.a) p2Var2.getValue();
                        if (aVar3 != null) {
                            list5 = p13.j0.f134944a;
                        } else {
                            list5 = p13.j0.f134944a;
                        }
                        aVar4 = (mv1.a) p2Var2.getValue();
                        if (aVar4 != null) {
                            oVarE = null;
                        } else {
                            oVarE = null;
                        }
                        if (oVarE != null) {
                            if (oVarE instanceof jv1.o.a) {
                                aVar5 = (mv1.a) p2Var2.getValue();
                                if (aVar5 != null) {
                                    elevationGainMeter = null;
                                } else {
                                    elevationGainMeter = null;
                                }
                                dF5 = f5();
                                if (zf.b.D(elevationGainMeter)) {
                                    if (zf.b.D(dF5)) {
                                        if (dF5.doubleValue() > 0.0d) {
                                        }
                                    }
                                }
                            }
                            u5("FBTEditHillTypeFragment");
                        }
                        j5(hv1.e.FLAT);
                        break;
                    }
                    break;
                case 1818589731:
                    if (!str.equals("FBTEditTrainingDaysFragment")) {
                        if (z14) {
                        }
                        if (!z14) {
                            arrayList9 = new ArrayList();
                            while (r5.hasNext()) {
                                String str11111112 = (String) obj7;
                                if (list2 == null) {
                                }
                            }
                            if (p5()) {
                                C5(arrayList9);
                            } else {
                                x5(arrayList9);
                            }
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String string15 = aVar6.getString(R.string.select_new_long_day);
                                String lowerCase112 = string.toLowerCase(Locale.ROOT);
                                lowerCase112.getClass();
                                String strA112 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase112);
                                final int i2115 = 7;
                                p2Var3.k(null, new mv1.e(false, string15, strA112, 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i119 = i2115;
                                        b bVar7 = this.f141487b;
                                        switch (i119) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar118 != null ? aVar118.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                                    if (aVar119 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar119, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1112 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1113 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2116 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2117 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2118 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i2119 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                r5();
                            }
                        } else if (z15) {
                            bVar = (mv1.b) p2Var.getValue();
                            if (bVar != null) {
                                arrayList8 = 0;
                            } else {
                                arrayList8 = 0;
                            }
                            if (arrayList8 == 0) {
                                arrayList8 = p13.j0.f134944a;
                            }
                            D5(arrayList8);
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i2116 = 0;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i119 = i2116;
                                        b bVar7 = this.f141487b;
                                        switch (i119) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i1110 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar118 != null ? aVar118.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                                    if (aVar119 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar119, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1112 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1113 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2117 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2118 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i2119 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i21110 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTriathlonSwimDaysFragment");
                            }
                        } else {
                            if (z16) {
                            }
                            if (list4 != null) {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str11111113 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            } else {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str11111114 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            }
                            if (p5()) {
                                do {
                                    if (list2 != null) {
                                    }
                                    ArrayList arrayList119 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str11111115 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList119);
                                } while (list2.contains(str12));
                                ArrayList arrayList1110 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str11111116 = (String) obj10;
                                    if (list2 == null) {
                                    }
                                }
                                D5(arrayList1110);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
            }
        }
        z19 = z18;
        p2Var = p2Var4;
        aVar2 = (mv1.a) p2Var5.getValue();
        if (aVar2 != null) {
            p2Var2 = p2Var5;
            if (aVar2.f121165c) {
            }
            iJ = tu1.a.j(hVarC7, oVar3, z29, z34);
            if (e5()) {
                pVar = og.a.Z(iJ, size, z16);
            } else {
                pVar = new p(Boolean.FALSE, 5);
            }
            zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
            iIntValue = ((Number) pVar.f128595b).intValue();
            iHashCode = str.hashCode();
            p2Var3 = this.f141491c1;
            switch (iHashCode) {
                case -746357180:
                    if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                        if (!zBooleanValue) {
                            if (z16) {
                            }
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            final int i119 = 5;
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b f141487b;

                                {
                                    this.f141487b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    int i1110 = i119;
                                    b bVar7 = this.f141487b;
                                    switch (i1110) {
                                        case 0:
                                            boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                            int i1111 = b.f141488i1;
                                            if (zBooleanValue2) {
                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                            }
                                            break;
                                        case 1:
                                            p2 p2Var6 = bVar7.N0;
                                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                            int i1112 = b.f141488i1;
                                            if (zBooleanValue3) {
                                                mv1.a aVar118 = (mv1.a) p2Var6.getValue();
                                                mv1.a aVarA = null;
                                                fg0.k kVar4 = aVar118 != null ? aVar118.f121169g : null;
                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                                if (aVar119 != null) {
                                                    new dv1.a();
                                                    aVarA = mv1.a.a(aVar119, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                }
                                                p2Var6.setValue(aVarA);
                                                bVar7.u5("FBTEditElevationProfileFragment");
                                            } else {
                                                bVar7.b5();
                                            }
                                            break;
                                        case 2:
                                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                            int i1113 = b.f141488i1;
                                            if (zBooleanValue4) {
                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                            }
                                            break;
                                        case 3:
                                            boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                            int i1114 = b.f141488i1;
                                            if (zBooleanValue5) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 4:
                                            boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                            int i2117 = b.f141488i1;
                                            if (zBooleanValue6) {
                                                bVar7.t5();
                                                bVar7.b5();
                                            }
                                            break;
                                        case 5:
                                            boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                            int i2118 = b.f141488i1;
                                            if (zBooleanValue7) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 6:
                                            boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                            int i2119 = b.f141488i1;
                                            if (zBooleanValue8) {
                                                bVar7.r5();
                                            }
                                            break;
                                        default:
                                            boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                            int i21110 = b.f141488i1;
                                            if (zBooleanValue9) {
                                                bVar7.r5();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 25, null));
                        } else {
                            u5("FBTEditTrainingDaysFragment");
                        }
                        break;
                    }
                    break;
                case 525791086:
                    if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                        if (list9 != null) {
                            arrayList = new ArrayList();
                            while (r4.hasNext()) {
                                String str11111117 = (String) obj;
                                if (list2 != null) {
                                }
                                arrayList.add(obj);
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                        if (!((Collection) arrayList).isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                        } else {
                            if (list2 != null) {
                                arrayList2 = new ArrayList(list2);
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    if (!arrayList2.contains((String) obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList2.addAll(arrayList3);
                            }
                            if (p5()) {
                                if (arrayList2 != null) {
                                    listB2 = p13.j0.f134944a;
                                } else {
                                    listB2 = p13.j0.f134944a;
                                }
                                z5(listB2);
                            } else {
                                if (arrayList2 != null) {
                                    listB1 = p13.j0.f134944a;
                                } else {
                                    listB1 = p13.j0.f134944a;
                                }
                                w5(listB1);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 645158341:
                    if (!str.equals("FBTEditLongDaysFragment")) {
                        if (!p5()) {
                        }
                        if (z16) {
                        }
                        arrayList4 = new ArrayList();
                        while (r5.hasNext()) {
                            String str11111118 = (String) obj3;
                            if (list2 != null) {
                            }
                            arrayList4.add(obj3);
                        }
                        if (!arrayList4.isEmpty()) {
                            b5();
                        } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            String strA113 = aVar6.a(R.string.long_training_day_updated, string);
                            String lowerCase113 = string.toLowerCase(Locale.ROOT);
                            lowerCase113.getClass();
                            p2Var3.k(null, new mv1.e(false, strA113, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase113), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                        } else {
                            if (list2 != null) {
                                arrayList5 = new ArrayList(list2);
                            } else {
                                arrayList5 = null;
                            }
                            if (arrayList5 != null) {
                                arrayList6 = new ArrayList();
                                while (r3.hasNext()) {
                                    if (!arrayList5.contains((String) obj4)) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                arrayList5.addAll(arrayList6);
                            }
                            wt1.q.a aVar118 = wt1.q.f187120f;
                            if (arrayList5 != null) {
                                listB3 = p13.j0.f134944a;
                            } else {
                                listB3 = p13.j0.f134944a;
                            }
                            aVar118.getClass();
                            listF = wt1.q.a.f(listB3);
                            if (p5()) {
                                z5(h0.b1(listF));
                            } else {
                                w5(h0.b1(listF));
                            }
                            b5();
                        }
                        break;
                    }
                    break;
                case 950460184:
                    if (str.equals("FBTEditTrainingLevelFragment")) {
                        if (list3 != null) {
                            boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                        } else {
                            boolValueOf = null;
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        if (z16) {
                        }
                        b5();
                    }
                    break;
                case 1659444830:
                    if (!str.equals("FBTEditElevationProfileFragment")) {
                        aVar3 = (mv1.a) p2Var2.getValue();
                        if (aVar3 != null) {
                            list5 = p13.j0.f134944a;
                        } else {
                            list5 = p13.j0.f134944a;
                        }
                        aVar4 = (mv1.a) p2Var2.getValue();
                        if (aVar4 != null) {
                            oVarE = null;
                        } else {
                            oVarE = null;
                        }
                        if (oVarE != null) {
                            if (oVarE instanceof jv1.o.a) {
                                aVar5 = (mv1.a) p2Var2.getValue();
                                if (aVar5 != null) {
                                    elevationGainMeter = null;
                                } else {
                                    elevationGainMeter = null;
                                }
                                dF5 = f5();
                                if (zf.b.D(elevationGainMeter)) {
                                    if (zf.b.D(dF5)) {
                                        if (dF5.doubleValue() > 0.0d) {
                                        }
                                    }
                                }
                            }
                            u5("FBTEditHillTypeFragment");
                        }
                        j5(hv1.e.FLAT);
                        break;
                    }
                    break;
                case 1818589731:
                    if (!str.equals("FBTEditTrainingDaysFragment")) {
                        if (z14) {
                        }
                        if (!z14) {
                            arrayList9 = new ArrayList();
                            while (r5.hasNext()) {
                                String str11111119 = (String) obj7;
                                if (list2 == null) {
                                }
                            }
                            if (p5()) {
                                C5(arrayList9);
                            } else {
                                x5(arrayList9);
                            }
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                String string16 = aVar6.getString(R.string.select_new_long_day);
                                String lowerCase114 = string.toLowerCase(Locale.ROOT);
                                lowerCase114.getClass();
                                String strA114 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase114);
                                final int i2117 = 7;
                                p2Var3.k(null, new mv1.e(false, string16, strA114, 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i1110 = i2117;
                                        b bVar7 = this.f141487b;
                                        switch (i1110) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i1112 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar119 != null ? aVar119.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar1110 = (mv1.a) p2Var6.getValue();
                                                    if (aVar1110 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar1110, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1113 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1114 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2118 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i2119 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i21110 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i21111 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                r5();
                            }
                        } else if (z15) {
                            bVar = (mv1.b) p2Var.getValue();
                            if (bVar != null) {
                                arrayList8 = 0;
                            } else {
                                arrayList8 = 0;
                            }
                            if (arrayList8 == 0) {
                                arrayList8 = p13.j0.f134944a;
                            }
                            D5(arrayList8);
                            if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                                final int i2118 = 0;
                                p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b f141487b;

                                    {
                                        this.f141487b = this;
                                    }

                                    @Override // e23.l
                                    public final Object invoke(Object obj11) {
                                        int i1110 = i2118;
                                        b bVar7 = this.f141487b;
                                        switch (i1110) {
                                            case 0:
                                                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                                int i1111 = b.f141488i1;
                                                if (zBooleanValue2) {
                                                    bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                                }
                                                break;
                                            case 1:
                                                p2 p2Var6 = bVar7.N0;
                                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                                int i1112 = b.f141488i1;
                                                if (zBooleanValue3) {
                                                    mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                                    mv1.a aVarA = null;
                                                    fg0.k kVar4 = aVar119 != null ? aVar119.f121169g : null;
                                                    fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                    Double dB = completionTarget != null ? completionTarget.b() : null;
                                                    o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                    mv1.a aVar1110 = (mv1.a) p2Var6.getValue();
                                                    if (aVar1110 != null) {
                                                        new dv1.a();
                                                        aVarA = mv1.a.a(aVar1110, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                    }
                                                    p2Var6.setValue(aVarA);
                                                    bVar7.u5("FBTEditElevationProfileFragment");
                                                } else {
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 2:
                                                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                                int i1113 = b.f141488i1;
                                                if (zBooleanValue4) {
                                                    bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                                }
                                                break;
                                            case 3:
                                                boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                                int i1114 = b.f141488i1;
                                                if (zBooleanValue5) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 4:
                                                boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                                int i2119 = b.f141488i1;
                                                if (zBooleanValue6) {
                                                    bVar7.t5();
                                                    bVar7.b5();
                                                }
                                                break;
                                            case 5:
                                                boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                                int i21110 = b.f141488i1;
                                                if (zBooleanValue7) {
                                                    bVar7.u5("FBTEditTrainingDaysFragment");
                                                }
                                                break;
                                            case 6:
                                                boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                                int i21111 = b.f141488i1;
                                                if (zBooleanValue8) {
                                                    bVar7.r5();
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                                int i21112 = b.f141488i1;
                                                if (zBooleanValue9) {
                                                    bVar7.r5();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, 25, null));
                            } else {
                                u5("FBTEditTriathlonSwimDaysFragment");
                            }
                        } else {
                            if (z16) {
                            }
                            if (list4 != null) {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str111111110 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            } else {
                                while (true) {
                                    if (list2 != null) {
                                    }
                                    arrayList7 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str111111111 = (String) obj9;
                                        if (list2 == null) {
                                        }
                                    }
                                    if (p5()) {
                                        C5(arrayList7);
                                    } else {
                                        x5(arrayList7);
                                    }
                                }
                            }
                            if (p5()) {
                                do {
                                    if (list2 != null) {
                                    }
                                    ArrayList arrayList1111 = new ArrayList();
                                    while (r2.hasNext()) {
                                        String str111111112 = (String) obj10;
                                        if (list2 == null) {
                                        }
                                    }
                                    D5(arrayList1111);
                                } while (list2.contains(str12));
                                ArrayList arrayList1112 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str111111113 = (String) obj10;
                                    if (list2 == null) {
                                    }
                                }
                                D5(arrayList1112);
                            }
                            b5();
                        }
                        break;
                    }
                    break;
            }
        }
        p2Var2 = p2Var5;
        iJ = tu1.a.j(hVarC7, oVar3, z29, z34);
        if (e5()) {
            pVar = og.a.Z(iJ, size, z16);
        } else {
            pVar = new p(Boolean.FALSE, 5);
        }
        zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
        iIntValue = ((Number) pVar.f128595b).intValue();
        iHashCode = str.hashCode();
        p2Var3 = this.f141491c1;
        switch (iHashCode) {
            case -746357180:
                if (!str.equals("FBTEditStrengthWorkoutTypeFragment")) {
                    if (!zBooleanValue) {
                        if (z16) {
                        }
                        b5();
                    } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                        final int i1110 = 5;
                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.update_available_days), aVar6.a(R.string.add_strength_workouts_days_update, Integer.valueOf(iIntValue)), 0, 0, new e23.l(this) { // from class: pv1.a

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ b f141487b;

                            {
                                this.f141487b = this;
                            }

                            @Override // e23.l
                            public final Object invoke(Object obj11) {
                                int i1111 = i1110;
                                b bVar7 = this.f141487b;
                                switch (i1111) {
                                    case 0:
                                        boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                        int i1112 = b.f141488i1;
                                        if (zBooleanValue2) {
                                            bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                        }
                                        break;
                                    case 1:
                                        p2 p2Var6 = bVar7.N0;
                                        boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                        int i1113 = b.f141488i1;
                                        if (zBooleanValue3) {
                                            mv1.a aVar119 = (mv1.a) p2Var6.getValue();
                                            mv1.a aVarA = null;
                                            fg0.k kVar4 = aVar119 != null ? aVar119.f121169g : null;
                                            fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                            Double dB = completionTarget != null ? completionTarget.b() : null;
                                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                            mv1.a aVar1110 = (mv1.a) p2Var6.getValue();
                                            if (aVar1110 != null) {
                                                new dv1.a();
                                                aVarA = mv1.a.a(aVar1110, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                            }
                                            p2Var6.setValue(aVarA);
                                            bVar7.u5("FBTEditElevationProfileFragment");
                                        } else {
                                            bVar7.b5();
                                        }
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                        int i1114 = b.f141488i1;
                                        if (zBooleanValue4) {
                                            bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                        }
                                        break;
                                    case 3:
                                        boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                        int i1115 = b.f141488i1;
                                        if (zBooleanValue5) {
                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                        }
                                        break;
                                    case 4:
                                        boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                        int i2119 = b.f141488i1;
                                        if (zBooleanValue6) {
                                            bVar7.t5();
                                            bVar7.b5();
                                        }
                                        break;
                                    case 5:
                                        boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                        int i21110 = b.f141488i1;
                                        if (zBooleanValue7) {
                                            bVar7.u5("FBTEditTrainingDaysFragment");
                                        }
                                        break;
                                    case 6:
                                        boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                        int i21111 = b.f141488i1;
                                        if (zBooleanValue8) {
                                            bVar7.r5();
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                        int i21112 = b.f141488i1;
                                        if (zBooleanValue9) {
                                            bVar7.r5();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, 25, null));
                    } else {
                        u5("FBTEditTrainingDaysFragment");
                    }
                    break;
                }
                break;
            case 525791086:
                if (!str.equals("FBTEditTriathlonSwimDaysFragment")) {
                    if (list9 != null) {
                        arrayList = new ArrayList();
                        while (r4.hasNext()) {
                            String str111111114 = (String) obj;
                            if (list2 != null) {
                            }
                            arrayList.add(obj);
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    if (!((Collection) arrayList).isEmpty()) {
                        b5();
                    } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                        p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.swim_day_updated), aVar6.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new p90.h(list2, 9, arrayList, this), 25, null));
                    } else {
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2);
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            arrayList3 = new ArrayList();
                            while (r2.hasNext()) {
                                if (!arrayList2.contains((String) obj2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        if (p5()) {
                            if (arrayList2 != null) {
                                listB2 = p13.j0.f134944a;
                            } else {
                                listB2 = p13.j0.f134944a;
                            }
                            z5(listB2);
                        } else {
                            if (arrayList2 != null) {
                                listB1 = p13.j0.f134944a;
                            } else {
                                listB1 = p13.j0.f134944a;
                            }
                            w5(listB1);
                        }
                        b5();
                    }
                    break;
                }
                break;
            case 645158341:
                if (!str.equals("FBTEditLongDaysFragment")) {
                    if (!p5()) {
                    }
                    if (z16) {
                    }
                    arrayList4 = new ArrayList();
                    while (r5.hasNext()) {
                        String str111111115 = (String) obj3;
                        if (list2 != null) {
                        }
                        arrayList4.add(obj3);
                    }
                    if (!arrayList4.isEmpty()) {
                        b5();
                    } else if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                        String strA115 = aVar6.a(R.string.long_training_day_updated, string);
                        String lowerCase115 = string.toLowerCase(Locale.ROOT);
                        lowerCase115.getClass();
                        p2Var3.k(null, new mv1.e(false, strA115, aVar6.a(R.string.training_day_updated_to_long_day, lowerCase115), R.string.common_button_ok, 0, new p90.h(list2, 8, arrayList4, this), 16, null));
                    } else {
                        if (list2 != null) {
                            arrayList5 = new ArrayList(list2);
                        } else {
                            arrayList5 = null;
                        }
                        if (arrayList5 != null) {
                            arrayList6 = new ArrayList();
                            while (r3.hasNext()) {
                                if (!arrayList5.contains((String) obj4)) {
                                    arrayList6.add(obj4);
                                }
                            }
                            arrayList5.addAll(arrayList6);
                        }
                        wt1.q.a aVar119 = wt1.q.f187120f;
                        if (arrayList5 != null) {
                            listB3 = p13.j0.f134944a;
                        } else {
                            listB3 = p13.j0.f134944a;
                        }
                        aVar119.getClass();
                        listF = wt1.q.a.f(listB3);
                        if (p5()) {
                            z5(h0.b1(listF));
                        } else {
                            w5(h0.b1(listF));
                        }
                        b5();
                    }
                    break;
                }
                break;
            case 950460184:
                if (str.equals("FBTEditTrainingLevelFragment")) {
                    if (list3 != null) {
                        boolValueOf = Boolean.valueOf(list3.contains(tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY));
                    } else {
                        boolValueOf = null;
                    }
                    if (!z16) {
                    }
                    if (!z16) {
                    }
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    b5();
                }
                break;
            case 1659444830:
                if (!str.equals("FBTEditElevationProfileFragment")) {
                    aVar3 = (mv1.a) p2Var2.getValue();
                    if (aVar3 != null) {
                        list5 = p13.j0.f134944a;
                    } else {
                        list5 = p13.j0.f134944a;
                    }
                    aVar4 = (mv1.a) p2Var2.getValue();
                    if (aVar4 != null) {
                        oVarE = null;
                    } else {
                        oVarE = null;
                    }
                    if (oVarE != null) {
                        if (oVarE instanceof jv1.o.a) {
                            aVar5 = (mv1.a) p2Var2.getValue();
                            if (aVar5 != null) {
                                elevationGainMeter = null;
                            } else {
                                elevationGainMeter = null;
                            }
                            dF5 = f5();
                            if (zf.b.D(elevationGainMeter)) {
                                if (zf.b.D(dF5)) {
                                    if (dF5.doubleValue() > 0.0d) {
                                    }
                                }
                            }
                        }
                        u5("FBTEditHillTypeFragment");
                    }
                    j5(hv1.e.FLAT);
                    break;
                }
                break;
            case 1818589731:
                if (!str.equals("FBTEditTrainingDaysFragment")) {
                    if (z14) {
                    }
                    if (!z14) {
                        arrayList9 = new ArrayList();
                        while (r5.hasNext()) {
                            String str111111116 = (String) obj7;
                            if (list2 == null) {
                            }
                        }
                        if (p5()) {
                            C5(arrayList9);
                        } else {
                            x5(arrayList9);
                        }
                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            String string17 = aVar6.getString(R.string.select_new_long_day);
                            String lowerCase116 = string.toLowerCase(Locale.ROOT);
                            lowerCase116.getClass();
                            String strA116 = aVar6.a(R.string.removed_long_day_select_a_new_one, lowerCase116);
                            final int i2119 = 7;
                            p2Var3.k(null, new mv1.e(false, string17, strA116, 0, 0, new e23.l(this) { // from class: pv1.a

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b f141487b;

                                {
                                    this.f141487b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    int i1111 = i2119;
                                    b bVar7 = this.f141487b;
                                    switch (i1111) {
                                        case 0:
                                            boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                            int i1112 = b.f141488i1;
                                            if (zBooleanValue2) {
                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                            }
                                            break;
                                        case 1:
                                            p2 p2Var6 = bVar7.N0;
                                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                            int i1113 = b.f141488i1;
                                            if (zBooleanValue3) {
                                                mv1.a aVar1110 = (mv1.a) p2Var6.getValue();
                                                mv1.a aVarA = null;
                                                fg0.k kVar4 = aVar1110 != null ? aVar1110.f121169g : null;
                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                mv1.a aVar1111 = (mv1.a) p2Var6.getValue();
                                                if (aVar1111 != null) {
                                                    new dv1.a();
                                                    aVarA = mv1.a.a(aVar1111, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                }
                                                p2Var6.setValue(aVarA);
                                                bVar7.u5("FBTEditElevationProfileFragment");
                                            } else {
                                                bVar7.b5();
                                            }
                                            break;
                                        case 2:
                                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                            int i1114 = b.f141488i1;
                                            if (zBooleanValue4) {
                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                            }
                                            break;
                                        case 3:
                                            boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                            int i1115 = b.f141488i1;
                                            if (zBooleanValue5) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 4:
                                            boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                            int i21110 = b.f141488i1;
                                            if (zBooleanValue6) {
                                                bVar7.t5();
                                                bVar7.b5();
                                            }
                                            break;
                                        case 5:
                                            boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                            int i21111 = b.f141488i1;
                                            if (zBooleanValue7) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 6:
                                            boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                            int i21112 = b.f141488i1;
                                            if (zBooleanValue8) {
                                                bVar7.r5();
                                            }
                                            break;
                                        default:
                                            boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                            int i21113 = b.f141488i1;
                                            if (zBooleanValue9) {
                                                bVar7.r5();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 25, null));
                        } else {
                            r5();
                        }
                    } else if (z15) {
                        bVar = (mv1.b) p2Var.getValue();
                        if (bVar != null) {
                            arrayList8 = 0;
                        } else {
                            arrayList8 = 0;
                        }
                        if (arrayList8 == 0) {
                            arrayList8 = p13.j0.f134944a;
                        }
                        D5(arrayList8);
                        if (p005kotlin.jvm.internal.s.g(this.f141496h1, str)) {
                            final int i21110 = 0;
                            p2Var3.k(null, new mv1.e(false, aVar6.getString(R.string.select_new_swim_day), aVar6.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new e23.l(this) { // from class: pv1.a

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b f141487b;

                                {
                                    this.f141487b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj11) {
                                    int i1111 = i21110;
                                    b bVar7 = this.f141487b;
                                    switch (i1111) {
                                        case 0:
                                            boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                                            int i1112 = b.f141488i1;
                                            if (zBooleanValue2) {
                                                bVar7.u5("FBTEditTriathlonSwimDaysFragment");
                                            }
                                            break;
                                        case 1:
                                            p2 p2Var6 = bVar7.N0;
                                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                            int i1113 = b.f141488i1;
                                            if (zBooleanValue3) {
                                                mv1.a aVar1110 = (mv1.a) p2Var6.getValue();
                                                mv1.a aVarA = null;
                                                fg0.k kVar4 = aVar1110 != null ? aVar1110.f121169g : null;
                                                fg0.d completionTarget = kVar4 != null ? kVar4.getCompletionTarget() : null;
                                                Double dB = completionTarget != null ? completionTarget.b() : null;
                                                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                                                mv1.a aVar1111 = (mv1.a) p2Var6.getValue();
                                                if (aVar1111 != null) {
                                                    new dv1.a();
                                                    aVarA = mv1.a.a(aVar1111, null, null, null, null, null, null, dv1.a.a(dB, o0VarG), 255);
                                                }
                                                p2Var6.setValue(aVarA);
                                                bVar7.u5("FBTEditElevationProfileFragment");
                                            } else {
                                                bVar7.b5();
                                            }
                                            break;
                                        case 2:
                                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                                            int i1114 = b.f141488i1;
                                            if (zBooleanValue4) {
                                                bVar7.u5("FBTEditStrengthWorkoutTypeFragment");
                                            }
                                            break;
                                        case 3:
                                            boolean zBooleanValue5 = ((Boolean) obj11).booleanValue();
                                            int i1115 = b.f141488i1;
                                            if (zBooleanValue5) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 4:
                                            boolean zBooleanValue6 = ((Boolean) obj11).booleanValue();
                                            int i21111 = b.f141488i1;
                                            if (zBooleanValue6) {
                                                bVar7.t5();
                                                bVar7.b5();
                                            }
                                            break;
                                        case 5:
                                            boolean zBooleanValue7 = ((Boolean) obj11).booleanValue();
                                            int i21112 = b.f141488i1;
                                            if (zBooleanValue7) {
                                                bVar7.u5("FBTEditTrainingDaysFragment");
                                            }
                                            break;
                                        case 6:
                                            boolean zBooleanValue8 = ((Boolean) obj11).booleanValue();
                                            int i21113 = b.f141488i1;
                                            if (zBooleanValue8) {
                                                bVar7.r5();
                                            }
                                            break;
                                        default:
                                            boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
                                            int i21114 = b.f141488i1;
                                            if (zBooleanValue9) {
                                                bVar7.r5();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 25, null));
                        } else {
                            u5("FBTEditTriathlonSwimDaysFragment");
                        }
                    } else {
                        if (z16) {
                        }
                        if (list4 != null) {
                            while (true) {
                                if (list2 != null) {
                                }
                                arrayList7 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str111111117 = (String) obj9;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList7);
                                } else {
                                    x5(arrayList7);
                                }
                            }
                        } else {
                            while (true) {
                                if (list2 != null) {
                                }
                                arrayList7 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str111111118 = (String) obj9;
                                    if (list2 == null) {
                                    }
                                }
                                if (p5()) {
                                    C5(arrayList7);
                                } else {
                                    x5(arrayList7);
                                }
                            }
                        }
                        if (p5()) {
                            do {
                                if (list2 != null) {
                                }
                                ArrayList arrayList1113 = new ArrayList();
                                while (r2.hasNext()) {
                                    String str111111119 = (String) obj10;
                                    if (list2 == null) {
                                    }
                                }
                                D5(arrayList1113);
                            } while (list2.contains(str12));
                            ArrayList arrayList1114 = new ArrayList();
                            while (r2.hasNext()) {
                                String str1111111110 = (String) obj10;
                                if (list2 == null) {
                                }
                            }
                            D5(arrayList1114);
                        }
                        b5();
                    }
                    break;
                }
                break;
        }
    }

    public final void w5(List<String> list) {
        list.getClass();
        p2 p2Var = this.N0;
        mv1.a aVar = (mv1.a) p2Var.getValue();
        p2Var.setValue(aVar != null ? mv1.a.a(aVar, null, list, null, null, null, null, null, 503) : null);
    }

    public final void x5(ArrayList arrayList) {
        p2 p2Var = this.N0;
        mv1.a aVar = (mv1.a) p2Var.getValue();
        p2Var.setValue(aVar != null ? mv1.a.a(aVar, null, null, arrayList, null, null, null, null, 495) : null);
    }

    public final void y5() {
        if (p5()) {
            ge1.b.T(v1.a(this), null, null, new o(this, null), 3);
            return;
        }
        if (this.Y == vt1.o.f180179j) {
            ge1.b.T(v1.a(this), null, null, new j(this, null), 3);
        } else if (n5()) {
            ge1.b.T(v1.a(this), null, null, new i(this, null), 3);
        } else {
            ge1.b.T(v1.a(this), null, null, new k(this, null), 3);
        }
    }

    public final void z5(List<String> list) {
        list.getClass();
        p2 p2Var = this.R0;
        mv1.b bVar = (mv1.b) p2Var.getValue();
        p2Var.setValue(bVar != null ? mv1.b.a(bVar, list, null, null, null, null, null, null, 510) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpv1/b$a;", "", "<init>", "()V", "", "HILLY_LOWER_INCLINE", "D", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
