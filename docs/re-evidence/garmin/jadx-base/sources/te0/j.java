package te0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.m;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import p13.y;
import re0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lte0/j;", "", "Lre0/o;", "managedAccountsRepository", "<init>", "(Lre0/o;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f163940a;

    public j(o oVar) {
        oVar.getClass();
        this.f163940a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0193  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, l20.a aVar, v13.c cVar) {
        i iVar;
        l20.a aVar2;
        Object objO;
        m0 m0Var;
        l20.a aVar3;
        ArrayList arrayList;
        l20.c cVar2;
        boolean z14;
        m0 m0Var2;
        l20.c cVar3;
        Object next;
        Object next2;
        l20.c cVar4;
        Object next3;
        Object next4;
        v2 v2Var;
        boolean z15;
        long j14 = j8;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f163939f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f163939f = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        i iVar2 = iVar;
        Object objQ = iVar2.f163937d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f163939f;
        o oVar = this.f163940a;
        if (i15 == 0) {
            r.b(objQ);
            aVar2 = aVar;
            iVar2.f163935b = aVar2;
            iVar2.f163934a = j14;
            iVar2.f163939f = 1;
            objO = oVar.o(j14, iVar2);
            if (objO != aVar4) {
            }
            return aVar4;
        }
        if (i15 == 1) {
            j14 = iVar2.f163934a;
            l20.a aVar5 = iVar2.f163935b;
            r.b(objQ);
            objO = objQ;
            aVar2 = aVar5;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var2 = iVar2.f163936c;
            r.b(objQ);
        }
        v2Var = (v2) objQ;
        if (v2Var instanceof v2.b) {
            z15 = true;
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            z15 = false;
        }
        m0Var2.f105804a = z15;
        m0Var = m0Var2;
        return Boolean.valueOf(m0Var.f105804a);
        v2 v2Var2 = (v2) objO;
        m0Var = new m0();
        if (v2Var2 instanceof v2.b) {
            List<l20.a> listF = ((l20.r) ((v2.b) v2Var2).f47386a).f();
            if (listF != null) {
                Iterator<T> it = listF.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (!com.garmin.android.apps.connectmobile.contacts.b.i((l20.a) next4, aVar2));
                aVar3 = (l20.a) next4;
            } else {
                aVar3 = null;
            }
            if (aVar3 != null) {
                List<l20.c> listR = aVar3.r();
                if (listR != null) {
                    ArrayList arrayList2 = new ArrayList(y.r(listR, 10));
                    for (l20.c cVarB : listR) {
                        String str = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        aVar2.getClass();
                        List<l20.c> listR2 = aVar2.r();
                        if (listR2 != null) {
                            Iterator<T> it3 = listR2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                                Integer flagId = ((l20.c) next3).getFlagId();
                                int i16 = m.AUTO_LIVE_TRACK.f109026a;
                                if (flagId != null && flagId.intValue() == i16) {
                                    break;
                                }
                            }
                            cVar4 = (l20.c) next3;
                        } else {
                            cVar4 = null;
                        }
                        if (s.g(str, cVar4 != null ? cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                            cVarB = l20.c.b(cVarB, null, null, new Integer(m.NONE.f109026a), null, null, null, null, null, null, null, 0, 1048567);
                        }
                        arrayList2.add(cVarB);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        Integer flagId2 = ((l20.c) next2).getFlagId();
                        int i17 = m.AUTO_LIVE_TRACK.f109026a;
                        if (flagId2 != null && flagId2.intValue() == i17) {
                            break;
                        }
                    }
                    cVar2 = (l20.c) next2;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    z14 = true;
                } else {
                    List<l20.c> listZ = aVar3.z();
                    if (listZ != null) {
                        Iterator<T> it5 = listZ.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it5.next();
                            Integer flagId3 = ((l20.c) next).getFlagId();
                            int i18 = m.AUTO_LIVE_TRACK.f109026a;
                            if (flagId3 != null && flagId3.intValue() == i18) {
                                break;
                            }
                        }
                        cVar3 = (l20.c) next;
                    } else {
                        cVar3 = null;
                    }
                    if (cVar3 != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                l20.a aVarG = l20.a.g(aVar3, null, null, null, null, Boolean.valueOf(z14), null, arrayList, null, null, 8111);
                String contactId = aVar3.getContactId();
                if (contactId != null) {
                    iVar2.f163935b = null;
                    iVar2.f163936c = m0Var;
                    iVar2.f163934a = j14;
                    iVar2.f163939f = 2;
                    objQ = oVar.q(j14, contactId, aVarG, iVar2);
                    if (objQ != aVar4) {
                        m0Var2 = m0Var;
                        v2Var = (v2) objQ;
                        if (v2Var instanceof v2.b) {
                            z15 = true;
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            z15 = false;
                        }
                        m0Var2.f105804a = z15;
                        m0Var = m0Var2;
                    }
                    return aVar4;
                }
            }
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            m0Var.f105804a = false;
        }
        return Boolean.valueOf(m0Var.f105804a);
    }
}
