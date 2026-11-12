package b70;

import androidx.room.w0;
import ax1.i;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import fg0.k;
import fg0.z;
import g22.n;
import j61.j;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import ww1.x;
import zf0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb70/g;", "", "Ly60/a;", "cyclingAbilityRepo", "Lzf0/d;", "eventRepo", "Lax1/i;", "trainingPlanRepo", "<init>", "(Ly60/a;Lzf0/d;Lax1/i;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16300d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y60.a f16301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf0.d f16302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f16303c;

    static {
        i.a aVar = i.f13633b;
        zf0.d.a aVar2 = zf0.d.f204343b;
    }

    public g(y60.a aVar, zf0.d dVar, i iVar) {
        aVar.getClass();
        dVar.getClass();
        iVar.getClass();
        this.f16301a = aVar;
        this.f16302b = dVar;
        this.f16303c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(DateTime dateTime, DateTime dateTime2, ArrayList arrayList, v13.c cVar) {
        a aVar;
        j61.h hVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f16281e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f16281e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objA = aVar.f16279c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f16281e;
        if (i15 == 0) {
            r.b(objA);
            if (dateTime != null && dateTime2 != null) {
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                fz0.c cVarC = fz0.d.c(localDate);
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                fz0.c cVarC2 = fz0.d.c(localDate2);
                hVar = Days.daysBetween(dateTime, dateTime2).getDays() < 30 ? j61.h.DAILY : j61.h.WEEKLY;
                aVar.f16277a = arrayList;
                aVar.f16278b = hVar;
                aVar.f16281e = 1;
                objA = this.f16301a.a(cVarC, cVarC2, hVar, aVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = aVar.f16278b;
        arrayList = aVar.f16277a;
        r.b(objA);
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (bVar.f47387b == 204) {
                return null;
            }
            return i61.a.a((j) bVar.f47386a, arrayList, hVar);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(long j8, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f16284c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f16284c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objD = bVar.f16282a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f16284c;
        if (i15 == 0) {
            r.b(objD);
            bVar.f16284c = 1;
            objD = this.f16302b.d(j8, bVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            return (k) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(long j8, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f16287c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f16287c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f16285a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f16287c;
        if (i15 == 0) {
            r.b(objJ);
            cVar2.f16287c = 1;
            i iVar = this.f16303c;
            objJ = f0.J(iVar, new ax1.k(iVar, j8, null), cVar2);
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
            return (ww1.i) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f16290c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f16290c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f16288a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f16290c;
        if (i15 == 0) {
            r.b(objJ);
            dVar.f16290c = 1;
            zf0.d dVar2 = this.f16302b;
            objJ = f0.J(dVar2, new q(dVar2, null), dVar);
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
            return (z) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(String str, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f16293c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f16293c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objF = eVar.f16291a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f16293c;
        if (i15 == 0) {
            r.b(objF);
            eVar.f16293c = 1;
            objF = this.f16302b.f(str, eVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            return (k) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4 A[PHI: r2 r5 r6
      0x00f4: PHI (r2v9 int) = (r2v6 int), (r2v11 int) binds: [B:52:0x00da, B:57:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r5v3 fg0.z) = (r5v2 fg0.z), (r5v6 fg0.z) binds: [B:52:0x00da, B:57:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r6v4 j61.i) = (r6v2 j61.i), (r6v6 j61.i) binds: [B:52:0x00da, B:57:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
    
        if (r15 == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        if (r15 == r1) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(v13.c cVar) {
        f fVar;
        v2 v2Var;
        v2.b bVar;
        j61.i iVar;
        Object objD;
        j61.i iVar2;
        z zVar;
        String strG;
        int i14;
        k61.b bVar2;
        gg0.f fVarD;
        Long lF;
        Long lF2;
        k kVar;
        j61.i iVar3;
        fg0.j eventCustomization;
        j61.d courseDemandsDTO;
        ww1.i iVar4;
        Long trainingPlanId;
        DateTime startDate;
        DateTime dateTimeD;
        j61.i iVar5;
        List<x> listB;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f16299f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f16299f = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objH = fVar.f16297d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        j61.d dVar = null;
        arrayList = null;
        ArrayList arrayList = null;
        dVar = null;
        switch (fVar.f16299f) {
            case 0:
                r.b(objH);
                fVar.f16299f = 1;
                objH = this.f16301a.h(fVar);
                if (objH != obj) {
                    v2Var = (v2) objH;
                    if (v2Var instanceof v2.b) {
                        if (v2Var instanceof v2.a) {
                            return v2Var;
                        }
                        u0.r();
                        return null;
                    }
                    bVar = (v2.b) v2Var;
                    if (bVar.f47387b == 204) {
                        return new v2.b(null, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, null, null, 12, null);
                    }
                    iVar = (j61.i) bVar.f47386a;
                    fVar.f16294a = iVar;
                    fVar.f16299f = 2;
                    objD = d(fVar);
                    if (objD != obj) {
                        iVar2 = iVar;
                        objH = objD;
                        zVar = (z) objH;
                        if (zVar != null) {
                            strG = zVar.getShareableEventUuid();
                        } else {
                            strG = null;
                        }
                        if (n.d(strG)) {
                            i14 = 1;
                        } else {
                            if (zVar != null) {
                                lF = zVar.getId();
                            } else {
                                lF = null;
                            }
                            if (lF != null) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                        }
                        if (i14 == 0 && zVar != null && (fVarD = zVar.getEventType()) != null && fVarD.e()) {
                            String strG2 = zVar.getShareableEventUuid();
                            if (strG2 != null) {
                                fVar.f16294a = iVar2;
                                fVar.f16295b = zVar;
                                fVar.f16296c = i14;
                                fVar.f16299f = 3;
                                objH = e(strG2, fVar);
                            } else {
                                lF2 = zVar.getId();
                                if (lF2 != null) {
                                    long jLongValue = lF2.longValue();
                                    fVar.f16294a = iVar2;
                                    fVar.f16295b = null;
                                    fVar.f16296c = i14;
                                    fVar.f16299f = 4;
                                    objH = b(jLongValue, fVar);
                                    if (objH != obj) {
                                        iVar3 = iVar2;
                                        kVar = (k) objH;
                                        if (kVar == null && (eventCustomization = kVar.getEventCustomization()) != null && eventCustomization.u()) {
                                            courseDemandsDTO = kVar.getCourseDemandsDTO();
                                            fg0.j eventCustomization2 = kVar.getEventCustomization();
                                            if (eventCustomization2 == null || (trainingPlanId = eventCustomization2.getTrainingPlanId()) == null) {
                                                iVar4 = null;
                                                if (iVar4 != null) {
                                                    startDate = iVar4.getStartDate();
                                                } else {
                                                    startDate = null;
                                                }
                                                if (iVar4 != null) {
                                                    dateTimeD = iVar4.d();
                                                } else {
                                                    dateTimeD = null;
                                                }
                                                if (iVar4 != null && (listB = iVar4.b()) != null) {
                                                    arrayList = new ArrayList(listB);
                                                    arrayList.removeIf(new a73.n(new w0(28), 1));
                                                }
                                                fVar.f16294a = iVar3;
                                                fVar.f16295b = courseDemandsDTO;
                                                fVar.f16296c = i14;
                                                fVar.f16299f = 6;
                                                objH = a(startDate, dateTimeD, arrayList, fVar);
                                                if (objH != obj) {
                                                    dVar = courseDemandsDTO;
                                                    iVar5 = iVar3;
                                                    bVar2 = (k61.b) objH;
                                                    iVar2 = iVar5;
                                                }
                                            } else {
                                                long jLongValue2 = trainingPlanId.longValue();
                                                fVar.f16294a = iVar3;
                                                fVar.f16295b = courseDemandsDTO;
                                                fVar.f16296c = i14;
                                                fVar.f16299f = 5;
                                                objH = c(jLongValue2, fVar);
                                            }
                                        } else {
                                            bVar2 = null;
                                            iVar2 = iVar3;
                                        }
                                    }
                                } else {
                                    kVar = null;
                                    iVar3 = iVar2;
                                    if (kVar == null) {
                                    }
                                    bVar2 = null;
                                    iVar2 = iVar3;
                                }
                            }
                            break;
                        } else {
                            bVar2 = null;
                        }
                        return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
                    }
                }
                return obj;
            case 1:
                r.b(objH);
                v2Var = (v2) objH;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return v2Var;
                    }
                    u0.r();
                    return null;
                }
                bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    return new v2.b(null, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, null, null, 12, null);
                }
                iVar = (j61.i) bVar.f47386a;
                fVar.f16294a = iVar;
                fVar.f16299f = 2;
                objD = d(fVar);
                if (objD != obj) {
                    iVar2 = iVar;
                    objH = objD;
                    zVar = (z) objH;
                    if (zVar != null) {
                        strG = zVar.getShareableEventUuid();
                    } else {
                        strG = null;
                    }
                    if (n.d(strG)) {
                        i14 = 1;
                    } else {
                        if (zVar != null) {
                            lF = zVar.getId();
                        } else {
                            lF = null;
                        }
                        if (lF != null) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                    }
                    if (i14 == 0) {
                    }
                    bVar2 = null;
                    return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
                }
                return obj;
            case 2:
                j61.i iVar6 = fVar.f16294a;
                r.b(objH);
                iVar2 = iVar6;
                zVar = (z) objH;
                if (zVar != null) {
                    strG = zVar.getShareableEventUuid();
                } else {
                    strG = null;
                }
                if (n.d(strG)) {
                    i14 = 1;
                } else {
                    if (zVar != null) {
                        lF = zVar.getId();
                    } else {
                        lF = null;
                    }
                    if (lF != null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                }
                if (i14 == 0) {
                }
                bVar2 = null;
                return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
            case 3:
                i14 = fVar.f16296c;
                zVar = (z) fVar.f16295b;
                iVar2 = fVar.f16294a;
                r.b(objH);
                kVar = (k) objH;
                if (kVar == null) {
                    lF2 = zVar.getId();
                    if (lF2 != null) {
                        long jLongValue3 = lF2.longValue();
                        fVar.f16294a = iVar2;
                        fVar.f16295b = null;
                        fVar.f16296c = i14;
                        fVar.f16299f = 4;
                        objH = b(jLongValue3, fVar);
                        if (objH != obj) {
                            iVar3 = iVar2;
                            kVar = (k) objH;
                            if (kVar == null) {
                                break;
                            }
                            bVar2 = null;
                            iVar2 = iVar3;
                            return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
                        }
                    } else {
                        kVar = null;
                    }
                    return obj;
                }
                iVar3 = iVar2;
                if (kVar == null) {
                    break;
                }
                bVar2 = null;
                iVar2 = iVar3;
                return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
            case 4:
                i14 = fVar.f16296c;
                iVar3 = fVar.f16294a;
                r.b(objH);
                kVar = (k) objH;
                if (kVar == null) {
                    break;
                }
                bVar2 = null;
                iVar2 = iVar3;
                return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
            case 5:
                i14 = fVar.f16296c;
                courseDemandsDTO = (j61.d) fVar.f16295b;
                iVar3 = fVar.f16294a;
                r.b(objH);
                iVar4 = (ww1.i) objH;
                if (iVar4 != null) {
                    startDate = iVar4.getStartDate();
                } else {
                    startDate = null;
                }
                if (iVar4 != null) {
                    dateTimeD = iVar4.d();
                } else {
                    dateTimeD = null;
                }
                if (iVar4 != null) {
                    arrayList = new ArrayList(listB);
                    arrayList.removeIf(new a73.n(new w0(28), 1));
                }
                fVar.f16294a = iVar3;
                fVar.f16295b = courseDemandsDTO;
                fVar.f16296c = i14;
                fVar.f16299f = 6;
                objH = a(startDate, dateTimeD, arrayList, fVar);
                if (objH != obj) {
                    dVar = courseDemandsDTO;
                    iVar5 = iVar3;
                    bVar2 = (k61.b) objH;
                    iVar2 = iVar5;
                    return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
                }
                return obj;
            case 6:
                j61.d dVar2 = (j61.d) fVar.f16295b;
                iVar5 = fVar.f16294a;
                r.b(objH);
                dVar = dVar2;
                bVar2 = (k61.b) objH;
                iVar2 = iVar5;
                return new v2.b(new h(iVar2, dVar, bVar2), 200, null, null, 12, null);
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
