package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$createITP$1", f = "FBTPlanWizardViewModel.kt", l = {2220, 2229, 2236}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f13549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jv1.m f13550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tw1.m f13551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h hVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f13554f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f13554f, dVar);
        rVar.f13553e = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0200  */
    /* JADX WARN: Code duplicated, block: B:112:0x0205  */
    /* JADX WARN: Code duplicated, block: B:120:0x0266  */
    /* JADX WARN: Code duplicated, block: B:122:0x026a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0294  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021f, code lost:
    
        if (r0 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r1 == r6) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA5;
        jv1.s sVarI6;
        fg0.k kVar;
        jv1.s sVarI7;
        jv1.m mVar;
        jv1.s sVar;
        String string;
        jv1.s sVar2;
        String typeKey;
        jv1.s sVar3;
        String subTypeKey;
        jv1.s sVar4;
        String levelKey;
        jv1.s sVar5;
        vt1.j jVar;
        boolean z14;
        jv1.s sVar6;
        vt1.j jVar2;
        boolean z15;
        jv1.s sVarI8;
        ArrayList arrayList;
        jv1.s sVarI9;
        Integer num;
        jv1.s sVarI10;
        String str;
        Object objJ;
        fg0.k kVar2;
        jv1.m mVar2;
        List<wt1.q> listJ;
        List<wt1.q> listM;
        tw1.d dVar;
        tw1.c cVar;
        tw1.q trainingSubType;
        tw1.c cVar2;
        tw1.s trainingType;
        fg0.k kVar3;
        LocalDate date;
        v2 v2Var;
        tw1.m mVar3;
        fg0.d dVarC;
        Object objF5;
        o53.b0 b0Var = (o53.b0) this.f13553e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13552d;
        h hVar = this.f13554f;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objA5 = obj;
            } else {
                if (i14 == 2) {
                    mVar2 = this.f13550b;
                    kVar2 = this.f13549a;
                    o13.r.b(obj);
                    objJ = obj;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        mVar3 = (tw1.m) ((v2.b) v2Var).f47386a;
                        if (kVar2 != null) {
                            if (mVar2 != null) {
                                dVarC = mVar2.c();
                            } else {
                                dVarC = null;
                            }
                            this.f13553e = b0Var;
                            this.f13549a = null;
                            this.f13550b = null;
                            this.f13551c = mVar3;
                            this.f13552d = 3;
                            int i15 = h.S1;
                            objF5 = this.f13554f.f5(kVar2, mVar3, dVarC, null, this);
                        }
                        hVar.f13387t1.add(hv1.h.PLAN_CREATED);
                        y0<g3<tw1.m>> y0VarR6 = hVar.r6();
                        g3.f35298f.getClass();
                        y0VarR6.j(g3.a.d(mVar3));
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        int i16 = h.S1;
                        hVar.r6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "createITP error: ");
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tw1.m mVar4 = this.f13551c;
                o13.r.b(obj);
                mVar3 = mVar4;
                objF5 = obj;
            }
            v2 v2Var2 = (v2) objF5;
            if (v2Var2 instanceof v2.a) {
                v2.a aVar3 = (v2.a) v2Var2;
                String str2 = "Error occurred while updating FBT details to event " + aVar3.f47384b + " :: " + aVar3.f47383a;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", str2);
            }
            hVar.f13387t1.add(hv1.h.PLAN_CREATED);
            y0<g3<tw1.m>> y0VarR7 = hVar.r6();
            g3.f35298f.getClass();
            y0VarR7.j(g3.a.d(mVar3));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i17 = h.S1;
        hVar.r6().j(g3.a.c(g3.f35298f));
        if (hVar.f13387t1.contains(hv1.h.EVENT_CREATED)) {
            int i18 = h.S1;
            sVarI6 = hVar.i6();
            if (sVarI6 != null) {
                kVar = sVarI6.f101124c;
            } else {
                kVar = null;
            }
            sVarI7 = hVar.i6();
            if (sVarI7 != null) {
                mVar = sVarI7.f101129h;
            } else {
                mVar = null;
            }
            if (!hVar.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                uw1.b bVar = hVar.T;
                sVar = (jv1.s) hVar.j6().d();
                if (sVar != null || (kVar3 = sVar.f101124c) == null || (date = kVar3.getDate()) == null) {
                    string = null;
                } else {
                    string = date.toString("yyyy-MM-dd");
                }
                sVar2 = (jv1.s) hVar.j6().d();
                if (sVar2 != null || (cVar2 = sVar2.f101131j) == null || (trainingType = cVar2.getTrainingType()) == null) {
                    typeKey = null;
                } else {
                    typeKey = trainingType.getTypeKey();
                }
                sVar3 = (jv1.s) hVar.j6().d();
                if (sVar3 != null || (cVar = sVar3.f101131j) == null || (trainingSubType = cVar.getTrainingSubType()) == null) {
                    subTypeKey = null;
                } else {
                    subTypeKey = trainingSubType.getSubTypeKey();
                }
                sVar4 = (jv1.s) hVar.j6().d();
                if (sVar4 != null || (dVar = sVar4.A) == null) {
                    levelKey = null;
                } else {
                    levelKey = dVar.getLevelKey();
                }
                sVar5 = (jv1.s) hVar.j6().d();
                if (sVar5 != null) {
                    jVar = sVar5.f101147z;
                } else {
                    jVar = null;
                }
                z14 = false;
                if (jVar == vt1.j.POWER_BASED) {
                    z14 = true;
                }
                sVar6 = (jv1.s) hVar.j6().d();
                if (sVar6 != null) {
                    jVar2 = sVar6.f101147z;
                } else {
                    jVar2 = null;
                }
                if (jVar2 == vt1.j.HEART_RATE_BASED) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                sVarI8 = hVar.i6();
                if (sVarI8 != null || (listM = sVarI8.m()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listM, 10));
                    Iterator<T> it = listM.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(((wt1.q) it.next()).f187133d));
                    }
                    arrayList = arrayList2;
                }
                sVarI9 = hVar.i6();
                if (sVarI9 != null || (listJ = sVarI9.j()) == null) {
                    num = null;
                } else {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listJ, 10));
                    Iterator<T> it3 = listJ.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(((wt1.q) it3.next()).f187133d));
                    }
                    num = (Integer) p13.h0.d0(arrayList3);
                }
                String string2 = DateTime.now().toString("yyyy-MM-dd");
                sVarI10 = hVar.i6();
                if (sVarI10 != null) {
                    str = sVarI10.f101138q;
                } else {
                    str = null;
                }
                fy1.i.f73924a.getClass();
                tw1.e eVar = new tw1.e(string, typeKey, subTypeKey, levelKey, z14, z15, arrayList, num, string2, str, fy1.i.a.f());
                this.f13553e = b0Var;
                this.f13549a = kVar;
                this.f13550b = mVar;
                this.f13552d = 2;
                bVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new uw1.c(eVar, null), this);
                if (objJ != aVar) {
                    kVar2 = kVar;
                    mVar2 = mVar;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        mVar3 = (tw1.m) ((v2.b) v2Var).f47386a;
                        if (kVar2 != null) {
                            if (mVar2 != null) {
                                dVarC = mVar2.c();
                            } else {
                                dVarC = null;
                            }
                            this.f13553e = b0Var;
                            this.f13549a = null;
                            this.f13550b = null;
                            this.f13551c = mVar3;
                            this.f13552d = 3;
                            int i19 = h.S1;
                            objF5 = this.f13554f.f5(kVar2, mVar3, dVarC, null, this);
                        }
                        hVar.f13387t1.add(hv1.h.PLAN_CREATED);
                        y0<g3<tw1.m>> y0VarR8 = hVar.r6();
                        g3.f35298f.getClass();
                        y0VarR8.j(g3.a.d(mVar3));
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        int i110 = h.S1;
                        hVar.r6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "createITP error: ");
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var3, "FBTPlanWizardViewModel", strD2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        this.f13553e = b0Var;
        this.f13552d = 1;
        objA5 = h.a5(hVar, this);
        return aVar;
        if (!((Boolean) objA5).booleanValue()) {
            return Unit.INSTANCE;
        }
        hVar.f13387t1.add(hv1.h.EVENT_CREATED);
        int i111 = h.S1;
        sVarI6 = hVar.i6();
        if (sVarI6 != null) {
            kVar = sVarI6.f101124c;
        } else {
            kVar = null;
        }
        sVarI7 = hVar.i6();
        if (sVarI7 != null) {
            mVar = sVarI7.f101129h;
        } else {
            mVar = null;
        }
        if (!hVar.f13387t1.contains(hv1.h.PLAN_CREATED)) {
            uw1.b bVar2 = hVar.T;
            sVar = (jv1.s) hVar.j6().d();
            if (sVar != null) {
                string = null;
            } else {
                string = null;
            }
            sVar2 = (jv1.s) hVar.j6().d();
            if (sVar2 != null) {
                typeKey = null;
            } else {
                typeKey = null;
            }
            sVar3 = (jv1.s) hVar.j6().d();
            if (sVar3 != null) {
                subTypeKey = null;
            } else {
                subTypeKey = null;
            }
            sVar4 = (jv1.s) hVar.j6().d();
            if (sVar4 != null) {
                levelKey = null;
            } else {
                levelKey = null;
            }
            sVar5 = (jv1.s) hVar.j6().d();
            if (sVar5 != null) {
                jVar = sVar5.f101147z;
            } else {
                jVar = null;
            }
            z14 = false;
            if (jVar == vt1.j.POWER_BASED) {
                z14 = true;
            }
            sVar6 = (jv1.s) hVar.j6().d();
            if (sVar6 != null) {
                jVar2 = sVar6.f101147z;
            } else {
                jVar2 = null;
            }
            if (jVar2 == vt1.j.HEART_RATE_BASED) {
                z15 = true;
            } else {
                z15 = false;
            }
            sVarI8 = hVar.i6();
            if (sVarI8 != null) {
                arrayList = null;
            } else {
                arrayList = null;
            }
            sVarI9 = hVar.i6();
            if (sVarI9 != null) {
                num = null;
            } else {
                num = null;
            }
            String string3 = DateTime.now().toString("yyyy-MM-dd");
            sVarI10 = hVar.i6();
            if (sVarI10 != null) {
                str = sVarI10.f101138q;
            } else {
                str = null;
            }
            fy1.i.f73924a.getClass();
            tw1.e eVar2 = new tw1.e(string, typeKey, subTypeKey, levelKey, z14, z15, arrayList, num, string3, str, fy1.i.a.f());
            this.f13553e = b0Var;
            this.f13549a = kVar;
            this.f13550b = mVar;
            this.f13552d = 2;
            bVar2.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new uw1.c(eVar2, null), this);
            if (objJ != aVar) {
                kVar2 = kVar;
                mVar2 = mVar;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    mVar3 = (tw1.m) ((v2.b) v2Var).f47386a;
                    if (kVar2 != null) {
                        if (mVar2 != null) {
                            dVarC = mVar2.c();
                        } else {
                            dVarC = null;
                        }
                        this.f13553e = b0Var;
                        this.f13549a = null;
                        this.f13550b = null;
                        this.f13551c = mVar3;
                        this.f13552d = 3;
                        int i112 = h.S1;
                        objF5 = this.f13554f.f5(kVar2, mVar3, dVarC, null, this);
                    }
                    hVar.f13387t1.add(hv1.h.PLAN_CREATED);
                    y0<g3<tw1.m>> y0VarR9 = hVar.r6();
                    g3.f35298f.getClass();
                    y0VarR9.j(g3.a.d(mVar3));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    int i113 = h.S1;
                    hVar.r6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "createITP error: ");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD3);
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
