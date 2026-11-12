package xm0;

import c22.j0;
import com.garmin.android.apps.connectmobile.group.details.InvalidGroupLeaderboardTypeException;
import com.garmin.android.apps.connectmobile.leaderboard.model.d0;
import com.garmin.android.apps.connectmobile.leaderboard.model.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import mt0.p3;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import yc.h3;
import yc.i3;
import ym0.a0;
import ym0.b0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxm0/o;", "Lyc/h3;", "", "Lxm0/k;", "", "Lj10/d;", "leaderboardType", "", "leaderboardListCache", "", "groupId", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "Lxm0/v;", "relationshipType", "<init>", "(Lj10/d;Ljava/util/List;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lxm0/v;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends h3<Integer, k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f191440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j10.d f191441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k> f191442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f191443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f191444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f191445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f191446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ym0.a f191447i;

    public o(j10.d dVar, List<k> list, long j8, DateTime dateTime, DateTime dateTime2, v vVar) {
        dVar.getClass();
        list.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f191440b = new p3((a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null));
        this.f191441c = dVar;
        this.f191442d = list;
        this.f191443e = j8;
        this.f191444f = dateTime;
        this.f191445g = dateTime2;
        this.f191446h = vVar;
        ym0.a.f197886f.getClass();
        this.f191447i = ym0.a.C3709a.a();
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, k> i3Var) {
        return null;
    }

    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        Integer num = (Integer) aVar.a();
        int iIntValue = num != null ? num.intValue() : 1;
        int i14 = aVar.f196007a;
        Date date = this.f191444f.toDate();
        Date date2 = this.f191445g.toDate();
        date.getClass();
        date2.getClass();
        return f(date, date2, iIntValue, i14, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d  */
    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:110:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0234  */
    /* JADX WARN: Code duplicated, block: B:119:0x0249  */
    /* JADX WARN: Code duplicated, block: B:121:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d8  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r1 == r14) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r30v0, types: [xm0.o] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Date date, Date date2, int i14, int i15, v13.c cVar) {
        m mVar;
        j10.d dVar;
        boolean z14;
        int i16;
        int i17;
        j10.d dVar2;
        v2 aVar;
        v2 v2Var;
        d0 d0Var;
        int i18;
        int i19;
        k kVar;
        ?? r14;
        double d14;
        int userProfilePk;
        List<f0> listD;
        ?? arrayList;
        Integer num;
        ArrayList arrayList2;
        ?? r17;
        Long userProfilePk2;
        String str;
        boolean z15;
        DateTime dateTimeN;
        Double totalValue;
        double dDoubleValue;
        ?? r15;
        String str2;
        Double totalValue2;
        double dDoubleValue2;
        String str3;
        Long lValueOf;
        b12.b bVar;
        int i24;
        int i25 = i14;
        int i26 = i15;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i27 = mVar.f191435f;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                mVar.f191435f = i27 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object objJ = mVar2.f191433d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i28 = mVar2.f191435f;
        j10.d dVar3 = this.f191441c;
        if (i28 != 0) {
            if (i28 == 1) {
                i17 = mVar2.f191432c;
                i16 = mVar2.f191431b;
                o13.r.b(objJ);
                dVar = dVar3;
                z14 = true;
                aVar = (v2) objJ;
                i26 = i17;
                i25 = i16;
                v2Var = aVar;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new h3.b.a(((v2.a) v2Var).f47383a);
                    }
                    u0.r();
                    return null;
                }
                d0Var = (d0) ((v2.b) v2Var).f47386a;
                mVar2.f191430a = d0Var;
                mVar2.f191431b = i25;
                mVar2.f191432c = i26;
                mVar2.f191435f = 3;
                objJ = g(d0Var, mVar2);
                if (objJ != obj) {
                    i18 = i25;
                    i19 = i26;
                }
                return obj;
            }
            if (i28 == 2) {
                int i29 = mVar2.f191432c;
                int i30 = mVar2.f191431b;
                o13.r.b(objJ);
                i26 = i29;
                i25 = i30;
                dVar2 = dVar3;
                dVar = dVar2;
                v2Var = (v2) objJ;
                z14 = true;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new h3.b.a(((v2.a) v2Var).f47383a);
                    }
                    u0.r();
                    return null;
                }
                d0Var = (d0) ((v2.b) v2Var).f47386a;
                mVar2.f191430a = d0Var;
                mVar2.f191431b = i25;
                mVar2.f191432c = i26;
                mVar2.f191435f = 3;
                objJ = g(d0Var, mVar2);
                if (objJ != obj) {
                    i18 = i25;
                    i19 = i26;
                }
                return obj;
            }
            if (i28 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i19 = mVar2.f191432c;
            i18 = mVar2.f191431b;
            d0Var = mVar2.f191430a;
            o13.r.b(objJ);
            dVar = dVar3;
            z14 = true;
            d0 d0VarB = d0.b(d0Var, (List) objJ);
            List<k> list = this.f191442d;
            kVar = (k) h0.n0(list);
            if (kVar != null) {
                i24 = kVar.f191417a;
            } else {
                r14 = z14;
            }
            if (kVar != null) {
                r14 = i24;
                d14 = kVar.f191419c;
            } else {
                r14 = i24;
                d14 = 0.0d;
            }
            dVar.getClass();
            userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
            listD = d0VarB.d();
            if (listD != null) {
                arrayList = new ArrayList(p13.y.r(listD, 10));
                r17 = r14;
                for (f0 f0Var : listD) {
                    userProfilePk2 = f0Var.getUserProfilePk();
                    str = f0Var.f38156i;
                    long j8 = userProfilePk;
                    if (userProfilePk2 == null && userProfilePk2.longValue() == j8) {
                        z15 = z14;
                    } else {
                        z15 = false;
                    }
                    dateTimeN = j0.N(f0Var.getLastSyncTime(), z14);
                    totalValue = f0Var.getTotalValue();
                    if (totalValue != null) {
                        dDoubleValue = totalValue.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue == d14) {
                        r15 = r17;
                    } else {
                        r15 = r17 + 1;
                    }
                    str2 = f0Var.f38155h;
                    if (str2 == null) {
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                    }
                    totalValue2 = f0Var.getTotalValue();
                    if (totalValue2 != null) {
                        dDoubleValue2 = totalValue2.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    if (str == null) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (dateTimeN != null) {
                        lValueOf = Long.valueOf(dateTimeN.getMillis());
                    } else {
                        lValueOf = null;
                    }
                    boolean allPrivate = f0Var.getAllPrivate();
                    Long userProfilePk3 = f0Var.getUserProfilePk();
                    boolean allPrivate2 = f0Var.getAllPrivate();
                    bVar = f0Var.f38154g;
                    if (bVar == null) {
                        bVar = b12.b.f14386g;
                    }
                    arrayList.add(new k(r17, str2, dDoubleValue2, str3, dVar, lValueOf, allPrivate, userProfilePk3, z15, false, allPrivate2, bVar));
                    r17 = r15;
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            list.addAll((Collection) arrayList);
            if (arrayList.size() < i19) {
                num = null;
            } else {
                num = new Integer(i18 + i19);
            }
            arrayList2 = new ArrayList();
            for (Object obj2 : (Iterable) arrayList) {
                if (!((k) obj2).f191426j) {
                    arrayList2.add(obj2);
                }
            }
            return new h3.b.c(arrayList2, null, num);
        }
        o13.r.b(objJ);
        v vVar = this.f191446h;
        if (vVar == null) {
            vVar = v.ALL;
        }
        dVar3.getClass();
        j10.d dVar4 = j10.d.WALKING_DISTANCE;
        ym0.a aVar2 = this.f191447i;
        if (dVar3 == dVar4 || dVar3 == j10.d.RUNNING_DISTANCE || dVar3 == j10.d.CYCLING_DISTANCE || dVar3 == j10.d.SWIMMING_DISTANCE || dVar3 == j10.d.TOTAL_DISTANCE || dVar3 == j10.d.PUSHING_DISTANCE) {
            String str4 = vVar.f191470a;
            int i34 = dVar3.f96363b;
            int i35 = dVar3.f96362a;
            mVar2.f191431b = i25;
            mVar2.f191432c = i26;
            mVar2.f191435f = 1;
            aVar2.getClass();
            dVar = dVar3;
            z14 = true;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new a0(date, date2, aVar2, this.f191443e, str4, i34, i35, i25, i26, null), mVar2);
            if (objJ != obj) {
                i16 = i14;
                i17 = i15;
                aVar = (v2) objJ;
                i26 = i17;
                i25 = i16;
                v2Var = aVar;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new h3.b.a(((v2.a) v2Var).f47383a);
                    }
                    u0.r();
                    return null;
                }
                d0Var = (d0) ((v2.b) v2Var).f47386a;
                mVar2.f191430a = d0Var;
                mVar2.f191431b = i25;
                mVar2.f191432c = i26;
                mVar2.f191435f = 3;
                objJ = g(d0Var, mVar2);
                if (objJ != obj) {
                    i18 = i25;
                    i19 = i26;
                    d0 d0VarB2 = d0.b(d0Var, (List) objJ);
                    List<k> list2 = this.f191442d;
                    kVar = (k) h0.n0(list2);
                    if (kVar != null) {
                        i24 = kVar.f191417a;
                    } else {
                        r14 = z14;
                    }
                    if (kVar != null) {
                        r14 = i24;
                        d14 = kVar.f191419c;
                    } else {
                        r14 = i24;
                        d14 = 0.0d;
                    }
                    dVar.getClass();
                    userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                    listD = d0VarB2.d();
                    if (listD != null) {
                        arrayList = new ArrayList(p13.y.r(listD, 10));
                        r17 = r14;
                        while (r1.hasNext()) {
                            userProfilePk2 = f0Var.getUserProfilePk();
                            str = f0Var.f38156i;
                            long j14 = userProfilePk;
                            if (userProfilePk2 == null) {
                                z15 = false;
                            } else {
                                z15 = z14;
                            }
                            dateTimeN = j0.N(f0Var.getLastSyncTime(), z14);
                            totalValue = f0Var.getTotalValue();
                            if (totalValue != null) {
                                dDoubleValue = totalValue.doubleValue();
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            if (dDoubleValue == d14) {
                                r15 = r17;
                            } else {
                                r15 = r17 + 1;
                            }
                            str2 = f0Var.f38155h;
                            if (str2 == null) {
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                            }
                            totalValue2 = f0Var.getTotalValue();
                            if (totalValue2 != null) {
                                dDoubleValue2 = totalValue2.doubleValue();
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            if (str == null) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (dateTimeN != null) {
                                lValueOf = Long.valueOf(dateTimeN.getMillis());
                            } else {
                                lValueOf = null;
                            }
                            boolean allPrivate3 = f0Var.getAllPrivate();
                            Long userProfilePk4 = f0Var.getUserProfilePk();
                            boolean allPrivate4 = f0Var.getAllPrivate();
                            bVar = f0Var.f38154g;
                            if (bVar == null) {
                                bVar = b12.b.f14386g;
                            }
                            arrayList.add(new k(r17, str2, dDoubleValue2, str3, dVar, lValueOf, allPrivate3, userProfilePk4, z15, false, allPrivate4, bVar));
                            r17 = r15;
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    list2.addAll((Collection) arrayList);
                    if (arrayList.size() < i19) {
                        num = null;
                    } else {
                        num = new Integer(i18 + i19);
                    }
                    arrayList2 = new ArrayList();
                    while (r3.hasNext()) {
                        if (!((k) obj2).f191426j) {
                            arrayList2.add(obj2);
                        }
                    }
                    return new h3.b.c(arrayList2, null, num);
                }
            }
        } else if (dVar3 == j10.d.TOTAL_STEPS || dVar3 == j10.d.ACTIVE_CALORIES_BURNED || dVar3 == j10.d.TOTAL_PUSHES) {
            String str5 = vVar.f191470a;
            int i36 = dVar3.f96363b;
            mVar2.f191431b = i25;
            mVar2.f191432c = i26;
            mVar2.f191435f = 2;
            aVar2.getClass();
            dVar2 = dVar3;
            b0 b0Var = new b0(date, date2, aVar2, this.f191443e, str5, i36, i25, i15, null);
            i26 = i15;
            i25 = i25;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, b0Var, mVar2);
        } else {
            aVar = new v2.a(new InvalidGroupLeaderboardTypeException(), null, null, 6, null);
            dVar = dVar3;
            z14 = true;
            v2Var = aVar;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return new h3.b.a(((v2.a) v2Var).f47383a);
                }
                u0.r();
                return null;
            }
            d0Var = (d0) ((v2.b) v2Var).f47386a;
            mVar2.f191430a = d0Var;
            mVar2.f191431b = i25;
            mVar2.f191432c = i26;
            mVar2.f191435f = 3;
            objJ = g(d0Var, mVar2);
            if (objJ != obj) {
                i18 = i25;
                i19 = i26;
                d0 d0VarB3 = d0.b(d0Var, (List) objJ);
                List<k> list3 = this.f191442d;
                kVar = (k) h0.n0(list3);
                if (kVar != null) {
                    i24 = kVar.f191417a;
                } else {
                    r14 = z14;
                }
                if (kVar != null) {
                    r14 = i24;
                    d14 = kVar.f191419c;
                } else {
                    r14 = i24;
                    d14 = 0.0d;
                }
                dVar.getClass();
                userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                listD = d0VarB3.d();
                if (listD != null) {
                    arrayList = new ArrayList(p13.y.r(listD, 10));
                    r17 = r14;
                    while (r1.hasNext()) {
                        userProfilePk2 = f0Var.getUserProfilePk();
                        str = f0Var.f38156i;
                        long j15 = userProfilePk;
                        if (userProfilePk2 == null) {
                            z15 = false;
                        } else {
                            z15 = z14;
                        }
                        dateTimeN = j0.N(f0Var.getLastSyncTime(), z14);
                        totalValue = f0Var.getTotalValue();
                        if (totalValue != null) {
                            dDoubleValue = totalValue.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        if (dDoubleValue == d14) {
                            r15 = r17;
                        } else {
                            r15 = r17 + 1;
                        }
                        str2 = f0Var.f38155h;
                        if (str2 == null) {
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                        }
                        totalValue2 = f0Var.getTotalValue();
                        if (totalValue2 != null) {
                            dDoubleValue2 = totalValue2.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        if (str == null) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (dateTimeN != null) {
                            lValueOf = Long.valueOf(dateTimeN.getMillis());
                        } else {
                            lValueOf = null;
                        }
                        boolean allPrivate5 = f0Var.getAllPrivate();
                        Long userProfilePk5 = f0Var.getUserProfilePk();
                        boolean allPrivate6 = f0Var.getAllPrivate();
                        bVar = f0Var.f38154g;
                        if (bVar == null) {
                            bVar = b12.b.f14386g;
                        }
                        arrayList.add(new k(r17, str2, dDoubleValue2, str3, dVar, lValueOf, allPrivate5, userProfilePk5, z15, false, allPrivate6, bVar));
                        r17 = r15;
                    }
                } else {
                    arrayList = p13.j0.f134944a;
                }
                list3.addAll((Collection) arrayList);
                if (arrayList.size() < i19) {
                    num = null;
                } else {
                    num = new Integer(i18 + i19);
                }
                arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                    if (!((k) obj2).f191426j) {
                        arrayList2.add(obj2);
                    }
                }
                return new h3.b.c(arrayList2, null, num);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable g(d0 d0Var, v13.c cVar) {
        n nVar;
        List<f0> list;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f191439d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f191439d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f191437b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f191439d;
        if (i15 == 0) {
            o13.r.b(obj);
            List<f0> listD = d0Var.d();
            if (listD == null) {
                listD = p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                Long userProfilePk = ((f0) it.next()).getUserProfilePk();
                Integer num = userProfilePk != null ? new Integer((int) userProfilePk.longValue()) : null;
                if (num != null) {
                    arrayList.add(num);
                }
            }
            List<Integer> listB1 = h0.b1(h0.f1(arrayList));
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            nVar.f191436a = listD;
            nVar.f191439d = 1;
            Object objX4 = this.f191440b.x4(listB1, listC, nVar);
            if (objX4 == aVar) {
                return aVar;
            }
            list = listD;
            obj = objX4;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = nVar.f191436a;
            o13.r.b(obj);
        }
        Map map = (Map) obj;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        int i16 = 0;
        for (Object obj2 : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            f0 f0Var = (f0) obj2;
            Long userProfilePk2 = f0Var.getUserProfilePk();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(userProfilePk2 != null ? new Integer((int) userProfilePk2.longValue()) : null);
            arrayList2.add(f0.b(f0Var, new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46879h, null, null, null, null, 30, null), lVar != null ? lVar.getFullName() : null, lVar != null ? lVar.getDisplayName() : null));
            i16 = i17;
        }
        return arrayList2;
    }

    public /* synthetic */ o(j10.d dVar, List list, long j8, DateTime dateTime, DateTime dateTime2, v vVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? new ArrayList() : list, j8, dateTime, dateTime2, vVar);
    }
}
