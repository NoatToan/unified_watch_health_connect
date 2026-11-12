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
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$createFBTPlan$1", f = "FBTPlanWizardViewModel.kt", l = {2308, 2320, 2334, 2347, 2374, 2377, 2387}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tw1.m f13540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f13544e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f13544e, dVar);
        qVar.f13543d = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0210  */
    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x0215  */
    /* JADX WARN: Code duplicated, block: B:106:0x021c  */
    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:114:0x0233  */
    /* JADX WARN: Code duplicated, block: B:115:0x0236  */
    /* JADX WARN: Code duplicated, block: B:117:0x023c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x023e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0241  */
    /* JADX WARN: Code duplicated, block: B:120:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x024c  */
    /* JADX WARN: Code duplicated, block: B:124:0x024f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0252  */
    /* JADX WARN: Code duplicated, block: B:128:0x0265  */
    /* JADX WARN: Code duplicated, block: B:129:0x026a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x027a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0288  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:176:0x0304  */
    /* JADX WARN: Code duplicated, block: B:179:0x0322  */
    /* JADX WARN: Code duplicated, block: B:190:0x0368  */
    /* JADX WARN: Code duplicated, block: B:192:0x036b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0375  */
    /* JADX WARN: Code duplicated, block: B:198:0x038a  */
    /* JADX WARN: Code duplicated, block: B:199:0x038f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0395  */
    /* JADX WARN: Code duplicated, block: B:202:0x039a  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:214:0x0409 A[PHI: r3 r4 r9
      0x0409: PHI (r3v71 boolean) = (r3v53 boolean), (r3v75 boolean) binds: [B:212:0x0406, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r4v15 java.lang.Object) = (r4v8 java.lang.Object), (r4v19 java.lang.Object) binds: [B:212:0x0406, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r9v21 java.lang.Object) = (r9v10 java.lang.Object), (r9v22 java.lang.Object) binds: [B:212:0x0406, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x040f  */
    /* JADX WARN: Code duplicated, block: B:220:0x043f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0443  */
    /* JADX WARN: Code duplicated, block: B:226:0x045e  */
    /* JADX WARN: Code duplicated, block: B:230:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d A[PHI: r3
      0x017d: PHI (r3v40 java.lang.Object) = (r3v34 java.lang.Object), (r3v70 java.lang.Object) binds: [B:53:0x0179, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01be  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x0206  */
    /* JADX WARN: Code duplicated, block: B:99:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r3 == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0424, code lost:
    
        if (r7.h8(r1, r20) == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x044e, code lost:
    
        if (aw1.h.X4(r7, r20) == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r3 == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        if (r3 == r2) goto L224;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:176:0x0304, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:207:0x03ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00ed, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object objE;
        jv1.s sVarI6;
        v2 v2Var;
        Object objE2;
        Object objD5;
        List list;
        List<tw1.m> list2;
        jv1.s sVarI7;
        vt1.h hVar;
        List listC;
        List<String> listM5;
        String str;
        LocalDate localDateD;
        tw1.k kVar;
        jv1.s sVarI8;
        fg0.k kVar2;
        boolean z14;
        ww1.l lVar;
        String str2;
        Iterator<T> it;
        Object next;
        tw1.m mVar;
        Integer numValueOf;
        ww1.d0 trainingPlanSubType;
        tw1.t trainingVersion;
        String versionName;
        Integer num;
        ArrayList arrayList;
        String strName;
        jv1.j jVar;
        boolean zA;
        Object obj2;
        Object objJ2;
        hv1.i iVar;
        List<String> list3;
        Iterator<T> it3;
        Object next2;
        tw1.m mVar2;
        ww1.d0 trainingPlanSubType2;
        tw1.t trainingVersion2;
        String versionName2;
        vt1.h hVar2;
        vt1.h hVar3;
        vt1.h hVar4;
        jv1.s sVar;
        vt1.o oVar;
        v2 v2Var2;
        tw1.m mVar3;
        o53.b0 b0Var = (o53.b0) this.f13543d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13542c;
        String str3 = null;
        h hVar5 = this.f13544e;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                int i15 = h.S1;
                hVar5.r6().j(g3.a.c(g3.f35298f));
                if (!hVar5.Z6() || hVar5.f13387t1.contains(hv1.h.EVENT_IMPROVE_FITNESS_PRIORITY)) {
                    if (!hVar5.f13387t1.contains(hv1.h.EVENT_CREATED)) {
                        this.f13543d = b0Var;
                        this.f13542c = 4;
                        objD5 = h.d5(hVar5, this);
                        if (objD5 != aVar) {
                            list = (List) objD5;
                            if (list == null) {
                                int i16 = h.S1;
                                y0<g3<tw1.m>> y0VarR6 = hVar5.r6();
                                g3.a aVar2 = g3.f35298f;
                                sVar = (jv1.s) hVar5.j6().d();
                                if (sVar != null && (oVar = sVar.f101125d) != null) {
                                    str3 = oVar.f180184a;
                                }
                                y0VarR6.j(g3.a.a(aVar2, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                                return Unit.INSTANCE;
                            }
                            list2 = hVar5.f13388u1;
                            sVarI7 = hVar5.i6();
                            if (sVarI7 != null) {
                                hVar = sVarI7.F;
                                if (hVar == null) {
                                    hVar = vt1.h.NONE;
                                }
                            } else {
                                hVar = null;
                            }
                            if (hVar == null) {
                                listC = null;
                            } else {
                                hVar2 = sVarI7.F;
                                if (hVar2 == null) {
                                    hVar3 = vt1.h.NONE;
                                } else {
                                    hVar3 = hVar2;
                                }
                                hVar4 = vt1.h.NONE;
                                if (hVar3 != hVar4) {
                                    if (hVar2 == null) {
                                        hVar2 = hVar4;
                                    }
                                    listC = p13.w.c(hVar2.f180123d);
                                } else {
                                    listC = null;
                                }
                            }
                            if (hVar5.X6()) {
                                listM5 = p13.j0.f134944a;
                            } else {
                                listM5 = hVar5.M5();
                            }
                            List<String> list4 = listM5;
                            if (sVarI7 != null || (str = sVarI7.f101138q) == null) {
                                str = "";
                            }
                            if (sVarI7 != null) {
                                localDateD = sVarI7.d();
                            } else {
                                localDateD = null;
                            }
                            String strValueOf = String.valueOf(localDateD);
                            if (sVarI7 != null) {
                                kVar = sVarI7.O;
                            } else {
                                kVar = null;
                            }
                            sVarI8 = hVar5.i6();
                            if (sVarI8 != null) {
                                kVar2 = sVarI8.f101124c;
                            } else {
                                kVar2 = null;
                            }
                            if (kVar2 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (hVar5.X6()) {
                                lVar = ww1.l.FITNESS_OPEN_LOOP;
                            } else if (hVar5.W6()) {
                                lVar = ww1.l.FROG_OPEN_LOOP;
                            } else if (hVar5.e7()) {
                                if (z14) {
                                    lVar = ww1.l.TRIATHLON_EVENT_BASED;
                                } else {
                                    lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                                }
                            } else if (hVar5.O6()) {
                                if (z14) {
                                    lVar = ww1.l.CYCLING_EVENT_BASED;
                                } else {
                                    lVar = ww1.l.CYCLING_OPEN_LOOP;
                                }
                            } else if (!hVar5.b7()) {
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.f(a2Var, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                                lVar = null;
                            } else if (z14) {
                                lVar = ww1.l.RUNNING_EVENT_BASED;
                            } else {
                                lVar = ww1.l.RUNNING_OPEN_LOOP;
                            }
                            if (hVar5.X6()) {
                                str2 = fx1.d.HEART_RATE.f73839b;
                            } else {
                                str2 = fx1.d.GENERIC.f73839b;
                            }
                            if (kVar != null) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                        tw1.m mVar4 = (tw1.m) next2;
                                        trainingPlanSubType2 = mVar4.getTrainingPlanSubType();
                                        if (trainingPlanSubType2 == null && trainingPlanSubType2.b(lVar) && (trainingVersion2 = mVar4.getTrainingVersion()) != null && (versionName2 = trainingVersion2.getVersionName()) != null && versionName2.equalsIgnoreCase(str2)) {
                                            tw1.l trainingLevel = mVar4.getTrainingLevel();
                                            if ((trainingLevel != null ? trainingLevel.b() : null) == kVar) {
                                            }
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                mVar2 = (tw1.m) next2;
                                if (mVar2 != null) {
                                    numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                            } else {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        tw1.m mVar5 = (tw1.m) next;
                                        trainingPlanSubType = mVar5.getTrainingPlanSubType();
                                        if (trainingPlanSubType != null || !trainingPlanSubType.b(lVar) || (trainingVersion = mVar5.getTrainingVersion()) == null || (versionName = trainingVersion.getVersionName()) == null || !versionName.equalsIgnoreCase(str2)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                mVar = (tw1.m) next;
                                if (mVar != null) {
                                    numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                            }
                            if (num == null) {
                                i2.a aVar4 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar4.getClass();
                                i2.a.f(a2Var2, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                            }
                            List<String> listX5 = hVar5.x5();
                            if (sVarI7 != null || (list3 = sVarI7.f101136o) == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                Iterator<T> it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    wr.g.z(wt1.q.f187120f, (String) it4.next(), arrayList2);
                                }
                                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    arrayList3.add(((wt1.q) it5.next()).f187130a);
                                }
                                arrayList = arrayList3;
                            }
                            if (sVarI7 != null || (iVar = sVarI7.f101137p) == null) {
                                strName = null;
                            } else {
                                strName = iVar.name();
                            }
                            fy1.i.f73924a.getClass();
                            jVar = new jv1.j(str, strValueOf, num, listX5, list4, arrayList, strName, fy1.i.a.f(), listC, list);
                            if (hVar5.X6()) {
                                zA = jVar.c();
                            } else if (hVar5.e7()) {
                                zA = jVar.d();
                            } else if (hVar5.W6()) {
                                zA = jVar.b();
                            } else {
                                zA = jVar.a();
                            }
                            if (!zA) {
                                i2.a aVar5 = i2.f36769a;
                                a2 a2Var3 = a2.GENERAL;
                                aVar5.getClass();
                                i2.a.f(a2Var3, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                                hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                                return Unit.INSTANCE;
                            }
                            if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                                kv1.b bVar = hVar5.I;
                                this.f13543d = b0Var;
                                this.f13541b = zA;
                                this.f13542c = 5;
                                bVar.getClass();
                                obj2 = null;
                                objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.d(bVar, jVar, null), this);
                                if (objJ2 != aVar) {
                                    v2Var2 = (v2) objJ2;
                                    if (!(v2Var2 instanceof v2.b)) {
                                        mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                        this.f13543d = obj2;
                                        this.f13540a = mVar3;
                                        this.f13541b = zA;
                                        this.f13542c = 6;
                                        int i17 = h.S1;
                                    } else {
                                        if (v2Var2 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        this.f13543d = b0Var;
                                        this.f13541b = zA;
                                        this.f13542c = 7;
                                    }
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } else if (hVar5.N6()) {
                        this.f13543d = b0Var;
                        this.f13542c = 3;
                        objE = o53.c0.e(new j0(hVar5, null), this);
                    } else {
                        sVarI6 = hVar5.i6();
                        if (sVarI6 != null) {
                            fg0.k kVarL = sVarI6.l();
                            this.f13543d = b0Var;
                            this.f13542c = 2;
                            objE2 = o53.c0.e(new i0(hVar5, kVarL, null), this);
                        } else {
                            v2Var = null;
                            if (v2Var instanceof v2.a) {
                                v2.a aVar6 = (v2.a) v2Var;
                                String str4 = "Error occurred while creating background event " + aVar6.f47384b + " :: " + aVar6.f47383a;
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var4 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.f(a2Var4, "FBTPlanWizardViewModel", str4);
                                int i18 = h.S1;
                                hVar5.r6().j(g3.a.a(g3.f35298f, "Error adding the event to the calendar or making it the primary event.", aVar6.f47383a, null, null, 12));
                                return Unit.INSTANCE;
                            }
                            hVar5.f13387t1.add(hv1.h.EVENT_CREATED);
                            this.f13543d = b0Var;
                            this.f13542c = 4;
                            objD5 = h.d5(hVar5, this);
                            if (objD5 != aVar) {
                                list = (List) objD5;
                                if (list == null) {
                                    int i19 = h.S1;
                                    y0<g3<tw1.m>> y0VarR7 = hVar5.r6();
                                    g3.a aVar8 = g3.f35298f;
                                    sVar = (jv1.s) hVar5.j6().d();
                                    if (sVar != null) {
                                        str3 = oVar.f180184a;
                                    }
                                    y0VarR7.j(g3.a.a(aVar8, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                                    return Unit.INSTANCE;
                                }
                                list2 = hVar5.f13388u1;
                                sVarI7 = hVar5.i6();
                                if (sVarI7 != null) {
                                    hVar = sVarI7.F;
                                    if (hVar == null) {
                                        hVar = vt1.h.NONE;
                                    }
                                } else {
                                    hVar = null;
                                }
                                if (hVar == null) {
                                    listC = null;
                                } else {
                                    hVar2 = sVarI7.F;
                                    if (hVar2 == null) {
                                        hVar3 = vt1.h.NONE;
                                    } else {
                                        hVar3 = hVar2;
                                    }
                                    hVar4 = vt1.h.NONE;
                                    if (hVar3 != hVar4) {
                                        if (hVar2 == null) {
                                            hVar2 = hVar4;
                                        }
                                        listC = p13.w.c(hVar2.f180123d);
                                    } else {
                                        listC = null;
                                    }
                                }
                                if (hVar5.X6()) {
                                    listM5 = p13.j0.f134944a;
                                } else {
                                    listM5 = hVar5.M5();
                                }
                                List<String> list5 = listM5;
                                if (sVarI7 != null) {
                                    str = "";
                                } else {
                                    str = "";
                                }
                                if (sVarI7 != null) {
                                    localDateD = sVarI7.d();
                                } else {
                                    localDateD = null;
                                }
                                String strValueOf2 = String.valueOf(localDateD);
                                if (sVarI7 != null) {
                                    kVar = sVarI7.O;
                                } else {
                                    kVar = null;
                                }
                                sVarI8 = hVar5.i6();
                                if (sVarI8 != null) {
                                    kVar2 = sVarI8.f101124c;
                                } else {
                                    kVar2 = null;
                                }
                                if (kVar2 != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (hVar5.X6()) {
                                    lVar = ww1.l.FITNESS_OPEN_LOOP;
                                } else if (hVar5.W6()) {
                                    lVar = ww1.l.FROG_OPEN_LOOP;
                                } else if (hVar5.e7()) {
                                    if (z14) {
                                        lVar = ww1.l.TRIATHLON_EVENT_BASED;
                                    } else {
                                        lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                                    }
                                } else if (hVar5.O6()) {
                                    if (z14) {
                                        lVar = ww1.l.CYCLING_EVENT_BASED;
                                    } else {
                                        lVar = ww1.l.CYCLING_OPEN_LOOP;
                                    }
                                } else if (!hVar5.b7()) {
                                    i2.a aVar9 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar9.getClass();
                                    i2.a.f(a2Var5, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                                    lVar = null;
                                } else if (z14) {
                                    lVar = ww1.l.RUNNING_EVENT_BASED;
                                } else {
                                    lVar = ww1.l.RUNNING_OPEN_LOOP;
                                }
                                if (hVar5.X6()) {
                                    str2 = fx1.d.HEART_RATE.f73839b;
                                } else {
                                    str2 = fx1.d.GENERIC.f73839b;
                                }
                                if (kVar != null) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            tw1.m mVar6 = (tw1.m) next2;
                                            trainingPlanSubType2 = mVar6.getTrainingPlanSubType();
                                            if (trainingPlanSubType2 == null) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    mVar2 = (tw1.m) next2;
                                    if (mVar2 != null) {
                                        numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            tw1.m mVar7 = (tw1.m) next;
                                            trainingPlanSubType = mVar7.getTrainingPlanSubType();
                                            if (trainingPlanSubType != null) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    mVar = (tw1.m) next;
                                    if (mVar != null) {
                                        numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                }
                                if (num == null) {
                                    i2.a aVar10 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar10.getClass();
                                    i2.a.f(a2Var6, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                                }
                                List<String> listX6 = hVar5.x5();
                                if (sVarI7 != null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                if (sVarI7 != null) {
                                    strName = null;
                                } else {
                                    strName = null;
                                }
                                fy1.i.f73924a.getClass();
                                jVar = new jv1.j(str, strValueOf2, num, listX6, list5, arrayList, strName, fy1.i.a.f(), listC, list);
                                if (hVar5.X6()) {
                                    zA = jVar.c();
                                } else if (hVar5.e7()) {
                                    zA = jVar.d();
                                } else if (hVar5.W6()) {
                                    zA = jVar.b();
                                } else {
                                    zA = jVar.a();
                                }
                                if (!zA) {
                                    i2.a aVar11 = i2.f36769a;
                                    a2 a2Var7 = a2.GENERAL;
                                    aVar11.getClass();
                                    i2.a.f(a2Var7, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                                    hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                                    return Unit.INSTANCE;
                                }
                                if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                                    kv1.b bVar2 = hVar5.I;
                                    this.f13543d = b0Var;
                                    this.f13541b = zA;
                                    this.f13542c = 5;
                                    bVar2.getClass();
                                    obj2 = null;
                                    objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar2, new kv1.d(bVar2, jVar, null), this);
                                    if (objJ2 != aVar) {
                                        v2Var2 = (v2) objJ2;
                                        if (!(v2Var2 instanceof v2.b)) {
                                            mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                            this.f13543d = obj2;
                                            this.f13540a = mVar3;
                                            this.f13541b = zA;
                                            this.f13542c = 6;
                                            int i110 = h.S1;
                                        } else {
                                            if (v2Var2 instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            this.f13543d = b0Var;
                                            this.f13541b = zA;
                                            this.f13542c = 7;
                                        }
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    break;
                } else {
                    zf0.d dVar = hVar5.f204384a;
                    this.f13543d = b0Var;
                    this.f13542c = 1;
                    dVar.getClass();
                    objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.j(dVar, null), this);
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                objJ = obj;
                v2 v2Var3 = (v2) objJ;
                if (v2Var3 instanceof v2.b) {
                    hVar5.f13387t1.add(hv1.h.EVENT_IMPROVE_FITNESS_PRIORITY);
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var8 = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.b(a2Var8, "FBTPlanWizardViewModel", "successfully set all events to no priority");
                } else {
                    if (!(v2Var3 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error occurred for call to delete no priority ");
                    i2.a aVar13 = i2.f36769a;
                    a2 a2Var9 = a2.GENERAL;
                    aVar13.getClass();
                    i2.a.f(a2Var9, "FBTPlanWizardViewModel", strD);
                }
                if (!hVar5.f13387t1.contains(hv1.h.EVENT_CREATED)) {
                    if (hVar5.N6()) {
                        this.f13543d = b0Var;
                        this.f13542c = 3;
                        objE = o53.c0.e(new j0(hVar5, null), this);
                    } else {
                        sVarI6 = hVar5.i6();
                        if (sVarI6 != null) {
                            fg0.k kVarL2 = sVarI6.l();
                            this.f13543d = b0Var;
                            this.f13542c = 2;
                            objE2 = o53.c0.e(new i0(hVar5, kVarL2, null), this);
                        } else {
                            v2Var = null;
                            if (v2Var instanceof v2.a) {
                                v2.a aVar14 = (v2.a) v2Var;
                                String str5 = "Error occurred while creating background event " + aVar14.f47384b + " :: " + aVar14.f47383a;
                                i2.a aVar15 = i2.f36769a;
                                a2 a2Var10 = a2.GENERAL;
                                aVar15.getClass();
                                i2.a.f(a2Var10, "FBTPlanWizardViewModel", str5);
                                int i111 = h.S1;
                                hVar5.r6().j(g3.a.a(g3.f35298f, "Error adding the event to the calendar or making it the primary event.", aVar14.f47383a, null, null, 12));
                                return Unit.INSTANCE;
                            }
                            hVar5.f13387t1.add(hv1.h.EVENT_CREATED);
                            this.f13543d = b0Var;
                            this.f13542c = 4;
                            objD5 = h.d5(hVar5, this);
                            if (objD5 != aVar) {
                                list = (List) objD5;
                                if (list == null) {
                                    int i112 = h.S1;
                                    y0<g3<tw1.m>> y0VarR8 = hVar5.r6();
                                    g3.a aVar16 = g3.f35298f;
                                    sVar = (jv1.s) hVar5.j6().d();
                                    if (sVar != null) {
                                        str3 = oVar.f180184a;
                                    }
                                    y0VarR8.j(g3.a.a(aVar16, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                                    return Unit.INSTANCE;
                                }
                                list2 = hVar5.f13388u1;
                                sVarI7 = hVar5.i6();
                                if (sVarI7 != null) {
                                    hVar = sVarI7.F;
                                    if (hVar == null) {
                                        hVar = vt1.h.NONE;
                                    }
                                } else {
                                    hVar = null;
                                }
                                if (hVar == null) {
                                    listC = null;
                                } else {
                                    hVar2 = sVarI7.F;
                                    if (hVar2 == null) {
                                        hVar3 = vt1.h.NONE;
                                    } else {
                                        hVar3 = hVar2;
                                    }
                                    hVar4 = vt1.h.NONE;
                                    if (hVar3 != hVar4) {
                                        if (hVar2 == null) {
                                            hVar2 = hVar4;
                                        }
                                        listC = p13.w.c(hVar2.f180123d);
                                    } else {
                                        listC = null;
                                    }
                                }
                                if (hVar5.X6()) {
                                    listM5 = p13.j0.f134944a;
                                } else {
                                    listM5 = hVar5.M5();
                                }
                                List<String> list6 = listM5;
                                if (sVarI7 != null) {
                                    str = "";
                                } else {
                                    str = "";
                                }
                                if (sVarI7 != null) {
                                    localDateD = sVarI7.d();
                                } else {
                                    localDateD = null;
                                }
                                String strValueOf3 = String.valueOf(localDateD);
                                if (sVarI7 != null) {
                                    kVar = sVarI7.O;
                                } else {
                                    kVar = null;
                                }
                                sVarI8 = hVar5.i6();
                                if (sVarI8 != null) {
                                    kVar2 = sVarI8.f101124c;
                                } else {
                                    kVar2 = null;
                                }
                                if (kVar2 != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (hVar5.X6()) {
                                    lVar = ww1.l.FITNESS_OPEN_LOOP;
                                } else if (hVar5.W6()) {
                                    lVar = ww1.l.FROG_OPEN_LOOP;
                                } else if (hVar5.e7()) {
                                    if (z14) {
                                        lVar = ww1.l.TRIATHLON_EVENT_BASED;
                                    } else {
                                        lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                                    }
                                } else if (hVar5.O6()) {
                                    if (z14) {
                                        lVar = ww1.l.CYCLING_EVENT_BASED;
                                    } else {
                                        lVar = ww1.l.CYCLING_OPEN_LOOP;
                                    }
                                } else if (!hVar5.b7()) {
                                    i2.a aVar17 = i2.f36769a;
                                    a2 a2Var11 = a2.GENERAL;
                                    aVar17.getClass();
                                    i2.a.f(a2Var11, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                                    lVar = null;
                                } else if (z14) {
                                    lVar = ww1.l.RUNNING_EVENT_BASED;
                                } else {
                                    lVar = ww1.l.RUNNING_OPEN_LOOP;
                                }
                                if (hVar5.X6()) {
                                    str2 = fx1.d.HEART_RATE.f73839b;
                                } else {
                                    str2 = fx1.d.GENERIC.f73839b;
                                }
                                if (kVar != null) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            tw1.m mVar8 = (tw1.m) next2;
                                            trainingPlanSubType2 = mVar8.getTrainingPlanSubType();
                                            if (trainingPlanSubType2 == null) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    mVar2 = (tw1.m) next2;
                                    if (mVar2 != null) {
                                        numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            tw1.m mVar9 = (tw1.m) next;
                                            trainingPlanSubType = mVar9.getTrainingPlanSubType();
                                            if (trainingPlanSubType != null) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    mVar = (tw1.m) next;
                                    if (mVar != null) {
                                        numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                }
                                if (num == null) {
                                    i2.a aVar18 = i2.f36769a;
                                    a2 a2Var12 = a2.GENERAL;
                                    aVar18.getClass();
                                    i2.a.f(a2Var12, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                                }
                                List<String> listX7 = hVar5.x5();
                                if (sVarI7 != null) {
                                    arrayList = null;
                                } else {
                                    arrayList = null;
                                }
                                if (sVarI7 != null) {
                                    strName = null;
                                } else {
                                    strName = null;
                                }
                                fy1.i.f73924a.getClass();
                                jVar = new jv1.j(str, strValueOf3, num, listX7, list6, arrayList, strName, fy1.i.a.f(), listC, list);
                                if (hVar5.X6()) {
                                    zA = jVar.c();
                                } else if (hVar5.e7()) {
                                    zA = jVar.d();
                                } else if (hVar5.W6()) {
                                    zA = jVar.b();
                                } else {
                                    zA = jVar.a();
                                }
                                if (!zA) {
                                    i2.a aVar19 = i2.f36769a;
                                    a2 a2Var13 = a2.GENERAL;
                                    aVar19.getClass();
                                    i2.a.f(a2Var13, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                                    hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                                    return Unit.INSTANCE;
                                }
                                if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                                    kv1.b bVar3 = hVar5.I;
                                    this.f13543d = b0Var;
                                    this.f13541b = zA;
                                    this.f13542c = 5;
                                    bVar3.getClass();
                                    obj2 = null;
                                    objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar3, new kv1.d(bVar3, jVar, null), this);
                                    if (objJ2 != aVar) {
                                        v2Var2 = (v2) objJ2;
                                        if (!(v2Var2 instanceof v2.b)) {
                                            mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                            this.f13543d = obj2;
                                            this.f13540a = mVar3;
                                            this.f13541b = zA;
                                            this.f13542c = 6;
                                            int i113 = h.S1;
                                        } else {
                                            if (v2Var2 instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            this.f13543d = b0Var;
                                            this.f13541b = zA;
                                            this.f13542c = 7;
                                        }
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    break;
                } else {
                    this.f13543d = b0Var;
                    this.f13542c = 4;
                    objD5 = h.d5(hVar5, this);
                    if (objD5 != aVar) {
                        list = (List) objD5;
                        if (list == null) {
                            int i114 = h.S1;
                            y0<g3<tw1.m>> y0VarR9 = hVar5.r6();
                            g3.a aVar110 = g3.f35298f;
                            sVar = (jv1.s) hVar5.j6().d();
                            if (sVar != null) {
                                str3 = oVar.f180184a;
                            }
                            y0VarR9.j(g3.a.a(aVar110, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                            return Unit.INSTANCE;
                        }
                        list2 = hVar5.f13388u1;
                        sVarI7 = hVar5.i6();
                        if (sVarI7 != null) {
                            hVar = sVarI7.F;
                            if (hVar == null) {
                                hVar = vt1.h.NONE;
                            }
                        } else {
                            hVar = null;
                        }
                        if (hVar == null) {
                            listC = null;
                        } else {
                            hVar2 = sVarI7.F;
                            if (hVar2 == null) {
                                hVar3 = vt1.h.NONE;
                            } else {
                                hVar3 = hVar2;
                            }
                            hVar4 = vt1.h.NONE;
                            if (hVar3 != hVar4) {
                                if (hVar2 == null) {
                                    hVar2 = hVar4;
                                }
                                listC = p13.w.c(hVar2.f180123d);
                            } else {
                                listC = null;
                            }
                        }
                        if (hVar5.X6()) {
                            listM5 = p13.j0.f134944a;
                        } else {
                            listM5 = hVar5.M5();
                        }
                        List<String> list7 = listM5;
                        if (sVarI7 != null) {
                            str = "";
                        } else {
                            str = "";
                        }
                        if (sVarI7 != null) {
                            localDateD = sVarI7.d();
                        } else {
                            localDateD = null;
                        }
                        String strValueOf4 = String.valueOf(localDateD);
                        if (sVarI7 != null) {
                            kVar = sVarI7.O;
                        } else {
                            kVar = null;
                        }
                        sVarI8 = hVar5.i6();
                        if (sVarI8 != null) {
                            kVar2 = sVarI8.f101124c;
                        } else {
                            kVar2 = null;
                        }
                        if (kVar2 != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (hVar5.X6()) {
                            lVar = ww1.l.FITNESS_OPEN_LOOP;
                        } else if (hVar5.W6()) {
                            lVar = ww1.l.FROG_OPEN_LOOP;
                        } else if (hVar5.e7()) {
                            if (z14) {
                                lVar = ww1.l.TRIATHLON_EVENT_BASED;
                            } else {
                                lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                            }
                        } else if (hVar5.O6()) {
                            if (z14) {
                                lVar = ww1.l.CYCLING_EVENT_BASED;
                            } else {
                                lVar = ww1.l.CYCLING_OPEN_LOOP;
                            }
                        } else if (!hVar5.b7()) {
                            i2.a aVar111 = i2.f36769a;
                            a2 a2Var14 = a2.GENERAL;
                            aVar111.getClass();
                            i2.a.f(a2Var14, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                            lVar = null;
                        } else if (z14) {
                            lVar = ww1.l.RUNNING_EVENT_BASED;
                        } else {
                            lVar = ww1.l.RUNNING_OPEN_LOOP;
                        }
                        if (hVar5.X6()) {
                            str2 = fx1.d.HEART_RATE.f73839b;
                        } else {
                            str2 = fx1.d.GENERIC.f73839b;
                        }
                        if (kVar != null) {
                            it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    tw1.m mVar10 = (tw1.m) next2;
                                    trainingPlanSubType2 = mVar10.getTrainingPlanSubType();
                                    if (trainingPlanSubType2 == null) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            mVar2 = (tw1.m) next2;
                            if (mVar2 != null) {
                                numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                                num = numValueOf;
                            } else {
                                num = null;
                            }
                        } else {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    tw1.m mVar11 = (tw1.m) next;
                                    trainingPlanSubType = mVar11.getTrainingPlanSubType();
                                    if (trainingPlanSubType != null) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            mVar = (tw1.m) next;
                            if (mVar != null) {
                                numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                                num = numValueOf;
                            } else {
                                num = null;
                            }
                        }
                        if (num == null) {
                            i2.a aVar112 = i2.f36769a;
                            a2 a2Var15 = a2.GENERAL;
                            aVar112.getClass();
                            i2.a.f(a2Var15, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                        }
                        List<String> listX8 = hVar5.x5();
                        if (sVarI7 != null) {
                            arrayList = null;
                        } else {
                            arrayList = null;
                        }
                        if (sVarI7 != null) {
                            strName = null;
                        } else {
                            strName = null;
                        }
                        fy1.i.f73924a.getClass();
                        jVar = new jv1.j(str, strValueOf4, num, listX8, list7, arrayList, strName, fy1.i.a.f(), listC, list);
                        if (hVar5.X6()) {
                            zA = jVar.c();
                        } else if (hVar5.e7()) {
                            zA = jVar.d();
                        } else if (hVar5.W6()) {
                            zA = jVar.b();
                        } else {
                            zA = jVar.a();
                        }
                        if (!zA) {
                            i2.a aVar113 = i2.f36769a;
                            a2 a2Var16 = a2.GENERAL;
                            aVar113.getClass();
                            i2.a.f(a2Var16, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                            hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                            return Unit.INSTANCE;
                        }
                        if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                            kv1.b bVar4 = hVar5.I;
                            this.f13543d = b0Var;
                            this.f13541b = zA;
                            this.f13542c = 5;
                            bVar4.getClass();
                            obj2 = null;
                            objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar4, new kv1.d(bVar4, jVar, null), this);
                            if (objJ2 != aVar) {
                                v2Var2 = (v2) objJ2;
                                if (!(v2Var2 instanceof v2.b)) {
                                    mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                    this.f13543d = obj2;
                                    this.f13540a = mVar3;
                                    this.f13541b = zA;
                                    this.f13542c = 6;
                                    int i115 = h.S1;
                                } else {
                                    if (v2Var2 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    this.f13543d = b0Var;
                                    this.f13541b = zA;
                                    this.f13542c = 7;
                                }
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objE2 = obj;
                v2Var = (v2) objE2;
                if (v2Var instanceof v2.a) {
                    v2.a aVar114 = (v2.a) v2Var;
                    String str6 = "Error occurred while creating background event " + aVar114.f47384b + " :: " + aVar114.f47383a;
                    i2.a aVar115 = i2.f36769a;
                    a2 a2Var17 = a2.GENERAL;
                    aVar115.getClass();
                    i2.a.f(a2Var17, "FBTPlanWizardViewModel", str6);
                    int i116 = h.S1;
                    hVar5.r6().j(g3.a.a(g3.f35298f, "Error adding the event to the calendar or making it the primary event.", aVar114.f47383a, null, null, 12));
                    return Unit.INSTANCE;
                }
                hVar5.f13387t1.add(hv1.h.EVENT_CREATED);
                this.f13543d = b0Var;
                this.f13542c = 4;
                objD5 = h.d5(hVar5, this);
                if (objD5 != aVar) {
                    list = (List) objD5;
                    if (list == null) {
                        int i117 = h.S1;
                        y0<g3<tw1.m>> y0VarR10 = hVar5.r6();
                        g3.a aVar116 = g3.f35298f;
                        sVar = (jv1.s) hVar5.j6().d();
                        if (sVar != null) {
                            str3 = oVar.f180184a;
                        }
                        y0VarR10.j(g3.a.a(aVar116, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                        return Unit.INSTANCE;
                    }
                    list2 = hVar5.f13388u1;
                    sVarI7 = hVar5.i6();
                    if (sVarI7 != null) {
                        hVar = sVarI7.F;
                        if (hVar == null) {
                            hVar = vt1.h.NONE;
                        }
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        listC = null;
                    } else {
                        hVar2 = sVarI7.F;
                        if (hVar2 == null) {
                            hVar3 = vt1.h.NONE;
                        } else {
                            hVar3 = hVar2;
                        }
                        hVar4 = vt1.h.NONE;
                        if (hVar3 != hVar4) {
                            if (hVar2 == null) {
                                hVar2 = hVar4;
                            }
                            listC = p13.w.c(hVar2.f180123d);
                        } else {
                            listC = null;
                        }
                    }
                    if (hVar5.X6()) {
                        listM5 = p13.j0.f134944a;
                    } else {
                        listM5 = hVar5.M5();
                    }
                    List<String> list8 = listM5;
                    if (sVarI7 != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    if (sVarI7 != null) {
                        localDateD = sVarI7.d();
                    } else {
                        localDateD = null;
                    }
                    String strValueOf5 = String.valueOf(localDateD);
                    if (sVarI7 != null) {
                        kVar = sVarI7.O;
                    } else {
                        kVar = null;
                    }
                    sVarI8 = hVar5.i6();
                    if (sVarI8 != null) {
                        kVar2 = sVarI8.f101124c;
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (hVar5.X6()) {
                        lVar = ww1.l.FITNESS_OPEN_LOOP;
                    } else if (hVar5.W6()) {
                        lVar = ww1.l.FROG_OPEN_LOOP;
                    } else if (hVar5.e7()) {
                        if (z14) {
                            lVar = ww1.l.TRIATHLON_EVENT_BASED;
                        } else {
                            lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                        }
                    } else if (hVar5.O6()) {
                        if (z14) {
                            lVar = ww1.l.CYCLING_EVENT_BASED;
                        } else {
                            lVar = ww1.l.CYCLING_OPEN_LOOP;
                        }
                    } else if (!hVar5.b7()) {
                        i2.a aVar117 = i2.f36769a;
                        a2 a2Var18 = a2.GENERAL;
                        aVar117.getClass();
                        i2.a.f(a2Var18, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                        lVar = null;
                    } else if (z14) {
                        lVar = ww1.l.RUNNING_EVENT_BASED;
                    } else {
                        lVar = ww1.l.RUNNING_OPEN_LOOP;
                    }
                    if (hVar5.X6()) {
                        str2 = fx1.d.HEART_RATE.f73839b;
                    } else {
                        str2 = fx1.d.GENERIC.f73839b;
                    }
                    if (kVar != null) {
                        it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                tw1.m mVar12 = (tw1.m) next2;
                                trainingPlanSubType2 = mVar12.getTrainingPlanSubType();
                                if (trainingPlanSubType2 == null) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        mVar2 = (tw1.m) next2;
                        if (mVar2 != null) {
                            numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                            num = numValueOf;
                        } else {
                            num = null;
                        }
                    } else {
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                tw1.m mVar13 = (tw1.m) next;
                                trainingPlanSubType = mVar13.getTrainingPlanSubType();
                                if (trainingPlanSubType != null) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        mVar = (tw1.m) next;
                        if (mVar != null) {
                            numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                            num = numValueOf;
                        } else {
                            num = null;
                        }
                    }
                    if (num == null) {
                        i2.a aVar118 = i2.f36769a;
                        a2 a2Var19 = a2.GENERAL;
                        aVar118.getClass();
                        i2.a.f(a2Var19, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                    }
                    List<String> listX9 = hVar5.x5();
                    if (sVarI7 != null) {
                        arrayList = null;
                    } else {
                        arrayList = null;
                    }
                    if (sVarI7 != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    fy1.i.f73924a.getClass();
                    jVar = new jv1.j(str, strValueOf5, num, listX9, list8, arrayList, strName, fy1.i.a.f(), listC, list);
                    if (hVar5.X6()) {
                        zA = jVar.c();
                    } else if (hVar5.e7()) {
                        zA = jVar.d();
                    } else if (hVar5.W6()) {
                        zA = jVar.b();
                    } else {
                        zA = jVar.a();
                    }
                    if (!zA) {
                        i2.a aVar119 = i2.f36769a;
                        a2 a2Var110 = a2.GENERAL;
                        aVar119.getClass();
                        i2.a.f(a2Var110, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                        hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                        return Unit.INSTANCE;
                    }
                    if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                        kv1.b bVar5 = hVar5.I;
                        this.f13543d = b0Var;
                        this.f13541b = zA;
                        this.f13542c = 5;
                        bVar5.getClass();
                        obj2 = null;
                        objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar5, new kv1.d(bVar5, jVar, null), this);
                        if (objJ2 != aVar) {
                            v2Var2 = (v2) objJ2;
                            if (!(v2Var2 instanceof v2.b)) {
                                mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                this.f13543d = obj2;
                                this.f13540a = mVar3;
                                this.f13541b = zA;
                                this.f13542c = 6;
                                int i118 = h.S1;
                            } else {
                                if (v2Var2 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f13543d = b0Var;
                                this.f13541b = zA;
                                this.f13542c = 7;
                            }
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 3:
                o13.r.b(obj);
                objE = obj;
                v2 v2Var4 = (v2) objE;
                if (v2Var4 instanceof v2.a) {
                    int i24 = h.S1;
                    hVar5.r6().j(g3.a.a(g3.f35298f, "Error adding the event to the calendar or making it the primary event.", ((v2.a) v2Var4).f47383a, null, null, 12));
                    return Unit.INSTANCE;
                }
                hVar5.f13387t1.add(hv1.h.EVENT_CREATED);
                this.f13543d = b0Var;
                this.f13542c = 4;
                objD5 = h.d5(hVar5, this);
                if (objD5 != aVar) {
                    list = (List) objD5;
                    if (list == null) {
                        int i119 = h.S1;
                        y0<g3<tw1.m>> y0VarR11 = hVar5.r6();
                        g3.a aVar1110 = g3.f35298f;
                        sVar = (jv1.s) hVar5.j6().d();
                        if (sVar != null) {
                            str3 = oVar.f180184a;
                        }
                        y0VarR11.j(g3.a.a(aVar1110, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                        return Unit.INSTANCE;
                    }
                    list2 = hVar5.f13388u1;
                    sVarI7 = hVar5.i6();
                    if (sVarI7 != null) {
                        hVar = sVarI7.F;
                        if (hVar == null) {
                            hVar = vt1.h.NONE;
                        }
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        listC = null;
                    } else {
                        hVar2 = sVarI7.F;
                        if (hVar2 == null) {
                            hVar3 = vt1.h.NONE;
                        } else {
                            hVar3 = hVar2;
                        }
                        hVar4 = vt1.h.NONE;
                        if (hVar3 != hVar4) {
                            if (hVar2 == null) {
                                hVar2 = hVar4;
                            }
                            listC = p13.w.c(hVar2.f180123d);
                        } else {
                            listC = null;
                        }
                    }
                    if (hVar5.X6()) {
                        listM5 = p13.j0.f134944a;
                    } else {
                        listM5 = hVar5.M5();
                    }
                    List<String> list9 = listM5;
                    if (sVarI7 != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    if (sVarI7 != null) {
                        localDateD = sVarI7.d();
                    } else {
                        localDateD = null;
                    }
                    String strValueOf6 = String.valueOf(localDateD);
                    if (sVarI7 != null) {
                        kVar = sVarI7.O;
                    } else {
                        kVar = null;
                    }
                    sVarI8 = hVar5.i6();
                    if (sVarI8 != null) {
                        kVar2 = sVarI8.f101124c;
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (hVar5.X6()) {
                        lVar = ww1.l.FITNESS_OPEN_LOOP;
                    } else if (hVar5.W6()) {
                        lVar = ww1.l.FROG_OPEN_LOOP;
                    } else if (hVar5.e7()) {
                        if (z14) {
                            lVar = ww1.l.TRIATHLON_EVENT_BASED;
                        } else {
                            lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                        }
                    } else if (hVar5.O6()) {
                        if (z14) {
                            lVar = ww1.l.CYCLING_EVENT_BASED;
                        } else {
                            lVar = ww1.l.CYCLING_OPEN_LOOP;
                        }
                    } else if (!hVar5.b7()) {
                        i2.a aVar1111 = i2.f36769a;
                        a2 a2Var111 = a2.GENERAL;
                        aVar1111.getClass();
                        i2.a.f(a2Var111, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                        lVar = null;
                    } else if (z14) {
                        lVar = ww1.l.RUNNING_EVENT_BASED;
                    } else {
                        lVar = ww1.l.RUNNING_OPEN_LOOP;
                    }
                    if (hVar5.X6()) {
                        str2 = fx1.d.HEART_RATE.f73839b;
                    } else {
                        str2 = fx1.d.GENERIC.f73839b;
                    }
                    if (kVar != null) {
                        it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                tw1.m mVar14 = (tw1.m) next2;
                                trainingPlanSubType2 = mVar14.getTrainingPlanSubType();
                                if (trainingPlanSubType2 == null) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        mVar2 = (tw1.m) next2;
                        if (mVar2 != null) {
                            numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                            num = numValueOf;
                        } else {
                            num = null;
                        }
                    } else {
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                tw1.m mVar15 = (tw1.m) next;
                                trainingPlanSubType = mVar15.getTrainingPlanSubType();
                                if (trainingPlanSubType != null) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        mVar = (tw1.m) next;
                        if (mVar != null) {
                            numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                            num = numValueOf;
                        } else {
                            num = null;
                        }
                    }
                    if (num == null) {
                        i2.a aVar1112 = i2.f36769a;
                        a2 a2Var112 = a2.GENERAL;
                        aVar1112.getClass();
                        i2.a.f(a2Var112, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                    }
                    List<String> listX10 = hVar5.x5();
                    if (sVarI7 != null) {
                        arrayList = null;
                    } else {
                        arrayList = null;
                    }
                    if (sVarI7 != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    fy1.i.f73924a.getClass();
                    jVar = new jv1.j(str, strValueOf6, num, listX10, list9, arrayList, strName, fy1.i.a.f(), listC, list);
                    if (hVar5.X6()) {
                        zA = jVar.c();
                    } else if (hVar5.e7()) {
                        zA = jVar.d();
                    } else if (hVar5.W6()) {
                        zA = jVar.b();
                    } else {
                        zA = jVar.a();
                    }
                    if (!zA) {
                        i2.a aVar1113 = i2.f36769a;
                        a2 a2Var113 = a2.GENERAL;
                        aVar1113.getClass();
                        i2.a.f(a2Var113, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                        hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                        return Unit.INSTANCE;
                    }
                    if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                        kv1.b bVar6 = hVar5.I;
                        this.f13543d = b0Var;
                        this.f13541b = zA;
                        this.f13542c = 5;
                        bVar6.getClass();
                        obj2 = null;
                        objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar6, new kv1.d(bVar6, jVar, null), this);
                        if (objJ2 != aVar) {
                            v2Var2 = (v2) objJ2;
                            if (!(v2Var2 instanceof v2.b)) {
                                mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                                this.f13543d = obj2;
                                this.f13540a = mVar3;
                                this.f13541b = zA;
                                this.f13542c = 6;
                                int i1110 = h.S1;
                            } else {
                                if (v2Var2 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f13543d = b0Var;
                                this.f13541b = zA;
                                this.f13542c = 7;
                            }
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 4:
                o13.r.b(obj);
                objD5 = obj;
                list = (List) objD5;
                if (list == null) {
                    int i1111 = h.S1;
                    y0<g3<tw1.m>> y0VarR12 = hVar5.r6();
                    g3.a aVar1114 = g3.f35298f;
                    sVar = (jv1.s) hVar5.j6().d();
                    if (sVar != null) {
                        str3 = oVar.f180184a;
                    }
                    y0VarR12.j(g3.a.a(aVar1114, fb1.c.n("Error getting adaptive workout type for ", str3), null, null, null, 14));
                    return Unit.INSTANCE;
                }
                list2 = hVar5.f13388u1;
                sVarI7 = hVar5.i6();
                if (sVarI7 != null) {
                    hVar = sVarI7.F;
                    if (hVar == null) {
                        hVar = vt1.h.NONE;
                    }
                } else {
                    hVar = null;
                }
                if (hVar == null) {
                    listC = null;
                } else {
                    hVar2 = sVarI7.F;
                    if (hVar2 == null) {
                        hVar3 = vt1.h.NONE;
                    } else {
                        hVar3 = hVar2;
                    }
                    hVar4 = vt1.h.NONE;
                    if (hVar3 != hVar4) {
                        if (hVar2 == null) {
                            hVar2 = hVar4;
                        }
                        listC = p13.w.c(hVar2.f180123d);
                    } else {
                        listC = null;
                    }
                }
                if (hVar5.X6()) {
                    listM5 = p13.j0.f134944a;
                } else {
                    listM5 = hVar5.M5();
                }
                List<String> list10 = listM5;
                if (sVarI7 != null) {
                    str = "";
                } else {
                    str = "";
                }
                if (sVarI7 != null) {
                    localDateD = sVarI7.d();
                } else {
                    localDateD = null;
                }
                String strValueOf7 = String.valueOf(localDateD);
                if (sVarI7 != null) {
                    kVar = sVarI7.O;
                } else {
                    kVar = null;
                }
                sVarI8 = hVar5.i6();
                if (sVarI8 != null) {
                    kVar2 = sVarI8.f101124c;
                } else {
                    kVar2 = null;
                }
                if (kVar2 != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (hVar5.X6()) {
                    lVar = ww1.l.FITNESS_OPEN_LOOP;
                } else if (hVar5.W6()) {
                    lVar = ww1.l.FROG_OPEN_LOOP;
                } else if (hVar5.e7()) {
                    if (z14) {
                        lVar = ww1.l.TRIATHLON_EVENT_BASED;
                    } else {
                        lVar = ww1.l.TRIATHLON_OPEN_LOOP;
                    }
                } else if (hVar5.O6()) {
                    if (z14) {
                        lVar = ww1.l.CYCLING_EVENT_BASED;
                    } else {
                        lVar = ww1.l.CYCLING_OPEN_LOOP;
                    }
                } else if (!hVar5.b7()) {
                    i2.a aVar1115 = i2.f36769a;
                    a2 a2Var114 = a2.GENERAL;
                    aVar1115.getClass();
                    i2.a.f(a2Var114, "FBTPlanWizardViewModel", "neither fitness, running, cycling, triathlon or FROG was selected, unable to determine training subtype.");
                    lVar = null;
                } else if (z14) {
                    lVar = ww1.l.RUNNING_EVENT_BASED;
                } else {
                    lVar = ww1.l.RUNNING_OPEN_LOOP;
                }
                if (hVar5.X6()) {
                    str2 = fx1.d.HEART_RATE.f73839b;
                } else {
                    str2 = fx1.d.GENERIC.f73839b;
                }
                if (kVar != null) {
                    it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            tw1.m mVar16 = (tw1.m) next2;
                            trainingPlanSubType2 = mVar16.getTrainingPlanSubType();
                            if (trainingPlanSubType2 == null) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    mVar2 = (tw1.m) next2;
                    if (mVar2 != null) {
                        numValueOf = Integer.valueOf((int) mVar2.getTrainingPlanId());
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                } else {
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            tw1.m mVar17 = (tw1.m) next;
                            trainingPlanSubType = mVar17.getTrainingPlanSubType();
                            if (trainingPlanSubType != null) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    mVar = (tw1.m) next;
                    if (mVar != null) {
                        numValueOf = Integer.valueOf((int) mVar.getTrainingPlanId());
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                }
                if (num == null) {
                    i2.a aVar1116 = i2.f36769a;
                    a2 a2Var115 = a2.GENERAL;
                    aVar1116.getClass();
                    i2.a.f(a2Var115, "FBTPlanWizardViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
                }
                List<String> listX11 = hVar5.x5();
                if (sVarI7 != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                if (sVarI7 != null) {
                    strName = null;
                } else {
                    strName = null;
                }
                fy1.i.f73924a.getClass();
                jVar = new jv1.j(str, strValueOf7, num, listX11, list10, arrayList, strName, fy1.i.a.f(), listC, list);
                if (hVar5.X6()) {
                    zA = jVar.c();
                } else if (hVar5.e7()) {
                    zA = jVar.d();
                } else if (hVar5.W6()) {
                    zA = jVar.b();
                } else {
                    zA = jVar.a();
                }
                if (!zA) {
                    i2.a aVar1117 = i2.f36769a;
                    a2 a2Var116 = a2.GENERAL;
                    aVar1117.getClass();
                    i2.a.f(a2Var116, "FBTPlanWizardViewModel", "Error : required data validation failed for createFBTPlanRequest. Request=" + jVar);
                    hVar5.r6().j(g3.a.a(g3.f35298f, "The createFBTPlan request is missing required data. Request=" + jVar, null, null, null, 14));
                    return Unit.INSTANCE;
                }
                if (!hVar5.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                    kv1.b bVar7 = hVar5.I;
                    this.f13543d = b0Var;
                    this.f13541b = zA;
                    this.f13542c = 5;
                    bVar7.getClass();
                    obj2 = null;
                    objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar7, new kv1.d(bVar7, jVar, null), this);
                    if (objJ2 != aVar) {
                        v2Var2 = (v2) objJ2;
                        if (!(v2Var2 instanceof v2.b)) {
                            mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                            this.f13543d = obj2;
                            this.f13540a = mVar3;
                            this.f13541b = zA;
                            this.f13542c = 6;
                            int i1112 = h.S1;
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            this.f13543d = b0Var;
                            this.f13541b = zA;
                            this.f13542c = 7;
                        }
                        break;
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            case 5:
                zA = this.f13541b;
                o13.r.b(obj);
                objJ2 = obj;
                obj2 = null;
                v2Var2 = (v2) objJ2;
                if (!(v2Var2 instanceof v2.b)) {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f13543d = b0Var;
                    this.f13541b = zA;
                    this.f13542c = 7;
                    break;
                } else {
                    mVar3 = (tw1.m) ((v2.b) v2Var2).f47386a;
                    this.f13543d = obj2;
                    this.f13540a = mVar3;
                    this.f13541b = zA;
                    this.f13542c = 6;
                    int i1113 = h.S1;
                    break;
                }
                return aVar;
            case 6:
                mVar3 = this.f13540a;
                o13.r.b(obj);
                hVar5.f13387t1.add(hv1.h.PLAN_CREATED);
                y0<g3<tw1.m>> y0VarR13 = hVar5.r6();
                g3.f35298f.getClass();
                y0VarR13.j(g3.a.d(mVar3));
                return Unit.INSTANCE;
            case 7:
                o13.r.b(obj);
                i2.a aVar20 = i2.f36769a;
                a2 a2Var20 = a2.GENERAL;
                aVar20.getClass();
                i2.a.f(a2Var20, "FBTPlanWizardViewModel", "createFBTPlan: Got an error on the create FBT plan API call. Attempting to find active FBT plan");
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
