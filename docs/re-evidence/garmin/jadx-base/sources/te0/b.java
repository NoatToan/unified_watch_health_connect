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
import p13.h0;
import p13.y;
import re0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lte0/b;", "", "Lre0/o;", "managedAccountsRepository", "<init>", "(Lre0/o;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f163915a;

    public b(o oVar) {
        oVar.getClass();
        this.f163915a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, l20.a aVar, v13.c cVar) {
        a aVar2;
        l20.a aVar3;
        m0 m0Var;
        m0 m0Var2;
        l20.a aVar4;
        ArrayList arrayList;
        ArrayList arrayList2;
        m0 m0Var3;
        l20.c cVar2;
        ArrayList arrayListD0;
        Object next;
        l20.c cVar3;
        Object next2;
        l20.c cVar4;
        Object next3;
        v2 v2Var;
        boolean z14;
        v2 v2Var2;
        boolean z15;
        long j14 = j8;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f163914f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f163914f = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        a aVar5 = aVar2;
        Object objH = aVar5.f163912d;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar5.f163914f;
        o oVar = this.f163915a;
        if (i15 == 0) {
            r.b(objH);
            aVar5.f163910b = aVar;
            aVar5.f163909a = j14;
            aVar5.f163914f = 1;
            Object objO = oVar.o(j14, aVar5);
            if (objO != aVar6) {
                aVar3 = aVar;
                objH = objO;
            }
            return aVar6;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                m0Var3 = aVar5.f163911c;
                r.b(objH);
                v2Var = (v2) objH;
                if (v2Var instanceof v2.b) {
                    z14 = true;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    z14 = false;
                }
                m0Var3.f105804a = z14;
                m0Var2 = m0Var3;
                return Boolean.valueOf(m0Var2.f105804a);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var3 = aVar5.f163911c;
            r.b(objH);
            v2Var2 = (v2) objH;
            if (v2Var2 instanceof v2.b) {
                z15 = true;
            } else {
                if (v2Var2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                z15 = false;
            }
            m0Var3.f105804a = z15;
            m0Var2 = m0Var3;
            return Boolean.valueOf(m0Var2.f105804a);
        }
        j14 = aVar5.f163909a;
        l20.a aVar7 = aVar5.f163910b;
        r.b(objH);
        aVar3 = aVar7;
        v2 v2Var3 = (v2) objH;
        m0 m0Var4 = new m0();
        if (v2Var3 instanceof v2.b) {
            List<l20.a> listF = ((l20.r) ((v2.b) v2Var3).f47386a).f();
            if (listF != null) {
                Iterator<T> it = listF.iterator();
                do {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                } while (!com.garmin.android.apps.connectmobile.contacts.b.i((l20.a) next3, aVar3));
                aVar4 = (l20.a) next3;
            } else {
                aVar4 = null;
            }
            if (aVar4 != null) {
                List<l20.c> listR = aVar4.r();
                if (listR != null) {
                    Iterator<T> it3 = listR.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        l20.c cVar5 = (l20.c) next;
                        List<l20.c> listR2 = aVar3.r();
                        if (listR2 != null) {
                            Iterator<T> it4 = listR2.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                cVar4 = (l20.c) next2;
                                if (s.g(cVar4.getContactInfoPk(), cVar5.getContactInfoPk())) {
                                    break;
                                }
                            } while (!s.g(cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()));
                            cVar3 = (l20.c) next2;
                        } else {
                            cVar3 = null;
                        }
                    } while (cVar3 == null);
                    cVar2 = (l20.c) next;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    List<l20.c> listR3 = aVar4.r();
                    if (listR3 != null) {
                        aVar3.getClass();
                        List<l20.c> listR4 = aVar3.r();
                        l20.c cVar6 = listR4 != null ? (l20.c) h0.d0(listR4) : null;
                        arrayListD0 = h0.D0(listR3, cVar6 != null ? l20.c.b(cVar6, null, null, new Integer(m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048566) : null);
                    } else {
                        arrayListD0 = null;
                    }
                } else {
                    List<l20.c> listR5 = aVar4.r();
                    if (listR5 != null) {
                        ArrayList arrayList3 = new ArrayList(y.r(listR5, 10));
                        for (l20.c cVarB : listR5) {
                            if (s.g(cVarB.getContactInfoPk(), cVar2.getContactInfoPk())) {
                                cVarB = l20.c.b(cVarB, null, null, new Integer(m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048567);
                            }
                            arrayList3.add(cVarB);
                        }
                        arrayListD0 = arrayList3;
                    } else {
                        arrayListD0 = null;
                    }
                }
                l20.a aVarG = l20.a.g(aVar4, null, null, null, null, Boolean.TRUE, null, arrayListD0 != null ? h0.Z(arrayListD0) : null, null, null, 8111);
                String contactId = aVar4.getContactId();
                if (contactId != null) {
                    aVar5.f163910b = null;
                    aVar5.f163911c = m0Var4;
                    aVar5.f163909a = j14;
                    aVar5.f163914f = 2;
                    objH = oVar.q(j14, contactId, aVarG, aVar5);
                    if (objH != aVar6) {
                        m0Var3 = m0Var4;
                        v2Var = (v2) objH;
                        if (v2Var instanceof v2.b) {
                            z14 = true;
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            z14 = false;
                        }
                        m0Var3.f105804a = z14;
                        m0Var2 = m0Var3;
                        return Boolean.valueOf(m0Var2.f105804a);
                    }
                } else {
                    m0Var = m0Var4;
                }
            } else {
                List<l20.c> listR6 = aVar3.r();
                if (listR6 != null) {
                    ArrayList arrayList4 = new ArrayList(y.r(listR6, 10));
                    Iterator<T> it5 = listR6.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(l20.c.b((l20.c) it5.next(), null, null, new Integer(m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048566));
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                List<l20.c> listZ = aVar3.z();
                if (listZ != null) {
                    ArrayList arrayList5 = new ArrayList(y.r(listZ, 10));
                    Iterator<T> it6 = listZ.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(l20.c.b((l20.c) it6.next(), null, null, null, null, null, null, null, null, null, null, 0, 1048574));
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                l20.a aVarG2 = l20.a.g(aVar3, null, null, null, null, Boolean.TRUE, null, arrayList, arrayList2, null, 7983);
                aVar5.f163910b = null;
                aVar5.f163911c = m0Var4;
                aVar5.f163909a = j14;
                aVar5.f163914f = 3;
                objH = oVar.h(j14, aVarG2, aVar5);
                if (objH != aVar6) {
                    m0Var3 = m0Var4;
                    v2Var2 = (v2) objH;
                    if (v2Var2 instanceof v2.b) {
                        z15 = true;
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        z15 = false;
                    }
                    m0Var3.f105804a = z15;
                    m0Var2 = m0Var3;
                    return Boolean.valueOf(m0Var2.f105804a);
                }
            }
            return aVar6;
        }
        m0Var = m0Var4;
        if (!(v2Var3 instanceof v2.a)) {
            u0.r();
            return null;
        }
        m0Var.f105804a = false;
        m0Var2 = m0Var;
        return Boolean.valueOf(m0Var2.f105804a);
    }
}
