package i10;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import mt0.p3;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p13.y;
import tn.k;
import yc.h3;
import yc.i3;
import ym0.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000fB=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Li10/e;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;", "groupChallengeDTO", "Lkotlin/Function1;", "", "", "reachListTopCallback", "Lkotlin/Function2;", "userPositionCallback", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;Le23/l;Le23/p;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h3<Integer, GroupChallengePlayerDTO> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f87034l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f87035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GroupChallengeDTO f87036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Boolean, Unit> f87037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Integer, Boolean, Unit> f87038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ym0.a f87039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f87040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f87041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f87042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f87043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f87044k;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(GroupChallengeDTO groupChallengeDTO, l<? super Boolean, Unit> lVar, p<? super Integer, ? super Boolean, Unit> pVar) {
        groupChallengeDTO.getClass();
        lVar.getClass();
        pVar.getClass();
        this.f87035b = new p3((a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null));
        this.f87036c = groupChallengeDTO;
        this.f87037d = lVar;
        this.f87038e = pVar;
        ym0.a.f197886f.getClass();
        this.f87039f = ym0.a.C3709a.a();
        this.f87040g = groupChallengeDTO.f31518g;
        this.f87041h = Math.max(1, groupChallengeDTO.f31522k);
        this.f87044k = new ArrayList();
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, GroupChallengePlayerDTO> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0394  */
    /* JADX WARN: Code duplicated, block: B:30:0x0119  */
    /* JADX WARN: Code duplicated, block: B:32:0x0126  */
    /* JADX WARN: Code duplicated, block: B:34:0x012a  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0157  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x0162  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:47:0x0185  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:51:0x01af  */
    /* JADX WARN: Code duplicated, block: B:61:0x0206  */
    /* JADX WARN: Code duplicated, block: B:63:0x0213  */
    /* JADX WARN: Code duplicated, block: B:65:0x0217  */
    /* JADX WARN: Code duplicated, block: B:74:0x027b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:88:0x031e  */
    /* JADX WARN: Code duplicated, block: B:90:0x032b  */
    /* JADX WARN: Code duplicated, block: B:92:0x032f  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0228, code lost:
    
        if (r2 == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0344, code lost:
    
        if (r2 == r4) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        f fVar;
        int i14;
        int i15;
        int i16;
        Object obj;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        v2 v2Var;
        int i26;
        List list;
        Integer num;
        boolean z14;
        Integer num2;
        v2 v2Var2;
        v2 v2Var3;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i27 = fVar.f87051g;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                fVar.f87051g = i27 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f87049e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i28 = fVar.f87051g;
        l<Boolean, Unit> lVar = this.f87037d;
        ArrayList arrayList = this.f87044k;
        switch (i28) {
            case 0:
                r.b(objJ);
                boolean z15 = aVar instanceof h3.a.d;
                String str = this.f87040g;
                ym0.a aVar2 = this.f87039f;
                if (!z15) {
                    if (aVar instanceof h3.a.C3655a) {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var, "GroupChallengeLeaderboardListPagingSource", "LoadParams.Append");
                        h3.a.C3655a c3655a = (h3.a.C3655a) aVar;
                        int iIntValue = ((Number) c3655a.f196009d).intValue();
                        int i29 = c3655a.f196007a;
                        i2.a.b(a2Var, "GroupChallengeLeaderboardListPagingSource", k.e(iIntValue, i29, "start: ", ", limit: "));
                        str.getClass();
                        fVar.f87045a = iIntValue;
                        fVar.f87046b = i29;
                        fVar.f87051g = 3;
                        aVar2.getClass();
                        objJ = f0.J(aVar2, new w(aVar2, str, iIntValue, i29, null), fVar);
                        if (objJ != obj2) {
                            i18 = iIntValue;
                            i19 = i29;
                            v2Var2 = (v2) objJ;
                            if (v2Var2 instanceof v2.a) {
                                Exception exc = ((v2.a) v2Var2).f47383a;
                                f(i18, i19, exc);
                                return new h3.b.a(exc);
                            }
                            if (v2Var2 instanceof v2.b) {
                                u0.r();
                                return null;
                            }
                            List list2 = (List) ((v2.b) v2Var2).f47386a;
                            fVar.f87045a = i18;
                            fVar.f87046b = i19;
                            fVar.f87051g = 4;
                            objJ = g(list2, fVar);
                        }
                    } else {
                        if (!(aVar instanceof h3.a.c)) {
                            u0.r();
                            return null;
                        }
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.b(a2Var2, "GroupChallengeLeaderboardListPagingSource", "LoadParams.Prepend");
                        h3.a.c cVar2 = (h3.a.c) aVar;
                        int iIntValue2 = ((Number) cVar2.f196011d).intValue();
                        i2.a.b(a2Var2, "GroupChallengeLeaderboardListPagingSource", "last index: " + iIntValue2);
                        int i30 = cVar2.f196007a;
                        o13.p pVar = iIntValue2 < i30 ? new o13.p(new Integer(1), new Integer(iIntValue2)) : new o13.p(new Integer(iIntValue2 - i30), new Integer(i30));
                        int iIntValue3 = ((Number) pVar.f128594a).intValue();
                        int iIntValue4 = ((Number) pVar.f128595b).intValue();
                        i2.a.b(a2Var2, "GroupChallengeLeaderboardListPagingSource", k.e(iIntValue3, iIntValue4, "start: ", ", limit: "));
                        str.getClass();
                        fVar.f87045a = iIntValue2;
                        fVar.f87046b = i30;
                        fVar.f87047c = iIntValue3;
                        fVar.f87048d = iIntValue4;
                        fVar.f87051g = 5;
                        r2.getClass();
                        Object objJ2 = f0.J(aVar2, new w(r2, str, iIntValue3, iIntValue4, null), fVar);
                        if (objJ2 != obj2) {
                            i14 = i30;
                            i15 = iIntValue2;
                            i16 = iIntValue3;
                            obj = objJ2;
                            i17 = iIntValue4;
                            v2Var3 = (v2) obj;
                            if (v2Var3 instanceof v2.a) {
                                Exception exc2 = ((v2.a) v2Var3).f47383a;
                                f(i16, i17, exc2);
                                return new h3.b.a(exc2);
                            }
                            if (v2Var3 instanceof v2.b) {
                                u0.r();
                                return null;
                            }
                            List list3 = (List) ((v2.b) v2Var3).f47386a;
                            fVar.f87045a = i15;
                            fVar.f87046b = i14;
                            fVar.f87047c = i16;
                            fVar.f87048d = i17;
                            fVar.f87051g = 6;
                            objJ = g(list3, fVar);
                        }
                    }
                    break;
                } else {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var3, "GroupChallengeLeaderboardListPagingSource", "LoadParams.Refresh");
                    StringBuilder sb3 = new StringBuilder("userIndex: ");
                    int i34 = this.f87041h;
                    sb3.append(i34);
                    i2.a.b(a2Var3, "GroupChallengeLeaderboardListPagingSource", sb3.toString());
                    o13.p pVar2 = i34 <= 40 ? new o13.p(new Integer(1), new Integer(((h3.a.d) aVar).f196007a)) : new o13.p(new Integer(i34 - 40), new Integer(i34 + 9));
                    int iIntValue5 = ((Number) pVar2.f128594a).intValue();
                    int iIntValue6 = ((Number) pVar2.f128595b).intValue();
                    i2.a.b(a2Var3, "GroupChallengeLeaderboardListPagingSource", k.e(iIntValue5, iIntValue6, "start: ", ", limit: "));
                    str.getClass();
                    fVar.f87045a = iIntValue5;
                    fVar.f87046b = iIntValue6;
                    fVar.f87051g = 1;
                    aVar2.getClass();
                    objJ = f0.J(aVar2, new w(aVar2, str, iIntValue5, iIntValue6, null), fVar);
                    if (objJ != obj2) {
                        i24 = iIntValue5;
                        i25 = iIntValue6;
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.a) {
                            Exception exc3 = ((v2.a) v2Var).f47383a;
                            f(i24, i25, exc3);
                            return new h3.b.a(exc3);
                        }
                        if (v2Var instanceof v2.b) {
                            u0.r();
                            return null;
                        }
                        List list4 = (List) ((v2.b) v2Var).f47386a;
                        fVar.f87045a = i24;
                        fVar.f87046b = i25;
                        fVar.f87051g = 2;
                        objJ = g(list4, fVar);
                        if (objJ != obj2) {
                            i26 = i24;
                            list = (List) objJ;
                            String strH = am.j.h(list.size(), "fetched data size: ");
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar6.getClass();
                            i2.a.b(a2Var4, "GroupChallengeLeaderboardListPagingSource", strH);
                            if (i26 == 1) {
                                num = null;
                            } else {
                                num = new Integer(i26 - 1);
                            }
                            if (num == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            lVar.invoke(Boolean.valueOf(z14));
                            this.f87042i = num;
                            i2.a.b(a2Var4, "GroupChallengeLeaderboardListPagingSource", "prevKey: " + num);
                            if (list.size() < i25) {
                                num2 = null;
                            } else {
                                num2 = new Integer(i26 + i25);
                            }
                            this.f87043j = num2;
                            i2.a.b(a2Var4, "GroupChallengeLeaderboardListPagingSource", "nextKey: " + num2);
                            arrayList.addAll(list);
                            h(true);
                            return new h3.b.c(list, this.f87042i, this.f87043j);
                        }
                    }
                }
                return obj2;
            case 1:
                i25 = fVar.f87046b;
                i24 = fVar.f87045a;
                r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    Exception exc4 = ((v2.a) v2Var).f47383a;
                    f(i24, i25, exc4);
                    return new h3.b.a(exc4);
                }
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                List list5 = (List) ((v2.b) v2Var).f47386a;
                fVar.f87045a = i24;
                fVar.f87046b = i25;
                fVar.f87051g = 2;
                objJ = g(list5, fVar);
                if (objJ != obj2) {
                    i26 = i24;
                    list = (List) objJ;
                    String strH2 = am.j.h(list.size(), "fetched data size: ");
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var5, "GroupChallengeLeaderboardListPagingSource", strH2);
                    if (i26 == 1) {
                        num = null;
                    } else {
                        num = new Integer(i26 - 1);
                    }
                    if (num == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    lVar.invoke(Boolean.valueOf(z14));
                    this.f87042i = num;
                    i2.a.b(a2Var5, "GroupChallengeLeaderboardListPagingSource", "prevKey: " + num);
                    if (list.size() < i25) {
                        num2 = null;
                    } else {
                        num2 = new Integer(i26 + i25);
                    }
                    this.f87043j = num2;
                    i2.a.b(a2Var5, "GroupChallengeLeaderboardListPagingSource", "nextKey: " + num2);
                    arrayList.addAll(list);
                    h(true);
                    return new h3.b.c(list, this.f87042i, this.f87043j);
                }
                return obj2;
            case 2:
                i25 = fVar.f87046b;
                i26 = fVar.f87045a;
                r.b(objJ);
                list = (List) objJ;
                String strH3 = am.j.h(list.size(), "fetched data size: ");
                i2.a aVar8 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar8.getClass();
                i2.a.b(a2Var6, "GroupChallengeLeaderboardListPagingSource", strH3);
                if (i26 == 1) {
                    num = null;
                } else {
                    num = new Integer(i26 - 1);
                }
                if (num == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                lVar.invoke(Boolean.valueOf(z14));
                this.f87042i = num;
                i2.a.b(a2Var6, "GroupChallengeLeaderboardListPagingSource", "prevKey: " + num);
                if (list.size() < i25) {
                    num2 = null;
                } else {
                    num2 = new Integer(i26 + i25);
                }
                this.f87043j = num2;
                i2.a.b(a2Var6, "GroupChallengeLeaderboardListPagingSource", "nextKey: " + num2);
                arrayList.addAll(list);
                h(true);
                return new h3.b.c(list, this.f87042i, this.f87043j);
            case 3:
                i19 = fVar.f87046b;
                i18 = fVar.f87045a;
                r.b(objJ);
                v2Var2 = (v2) objJ;
                if (v2Var2 instanceof v2.a) {
                    Exception exc5 = ((v2.a) v2Var2).f47383a;
                    f(i18, i19, exc5);
                    return new h3.b.a(exc5);
                }
                if (v2Var2 instanceof v2.b) {
                    u0.r();
                    return null;
                }
                List list6 = (List) ((v2.b) v2Var2).f47386a;
                fVar.f87045a = i18;
                fVar.f87046b = i19;
                fVar.f87051g = 4;
                objJ = g(list6, fVar);
                break;
                break;
            case 4:
                i19 = fVar.f87046b;
                r.b(objJ);
                List list7 = (List) objJ;
                String strH4 = am.j.h(list7.size(), "fetched data size: ");
                i2.a aVar9 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var7, "GroupChallengeLeaderboardListPagingSource", strH4);
                Integer num3 = list7.size() < i19 ? null : new Integer(((GroupChallengePlayerDTO) h0.m0(list7)).f31545i + 1);
                this.f87043j = num3;
                i2.a.b(a2Var7, "GroupChallengeLeaderboardListPagingSource", "nextKey: " + num3);
                arrayList.addAll(list7);
                h(false);
                return new h3.b.c(list7, this.f87042i, this.f87043j);
            case 5:
                int i35 = fVar.f87048d;
                int i36 = fVar.f87047c;
                i14 = fVar.f87046b;
                i15 = fVar.f87045a;
                r.b(objJ);
                i17 = i35;
                i16 = i36;
                obj = objJ;
                v2Var3 = (v2) obj;
                if (v2Var3 instanceof v2.a) {
                    Exception exc6 = ((v2.a) v2Var3).f47383a;
                    f(i16, i17, exc6);
                    return new h3.b.a(exc6);
                }
                if (v2Var3 instanceof v2.b) {
                    u0.r();
                    return null;
                }
                List list8 = (List) ((v2.b) v2Var3).f47386a;
                fVar.f87045a = i15;
                fVar.f87046b = i14;
                fVar.f87047c = i16;
                fVar.f87048d = i17;
                fVar.f87051g = 6;
                objJ = g(list8, fVar);
                break;
                break;
            case 6:
                i16 = fVar.f87047c;
                r.b(objJ);
                List list9 = (List) objJ;
                String strH5 = am.j.h(list9.size(), "fetched data size: ");
                i2.a aVar10 = i2.f36769a;
                a2 a2Var8 = a2.GENERAL;
                aVar10.getClass();
                i2.a.b(a2Var8, "GroupChallengeLeaderboardListPagingSource", strH5);
                Integer num4 = i16 == 1 ? null : new Integer(i16 - 1);
                lVar.invoke(Boolean.valueOf(num4 == null));
                this.f87042i = num4;
                i2.a.b(a2Var8, "GroupChallengeLeaderboardListPagingSource", "prevKey: " + num4);
                arrayList.addAll(0, list9);
                h(false);
                return new h3.b.c(list9, this.f87042i, this.f87043j);
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final void f(int i14, int i15, Exception exc) {
        String strQ = am.j.q(androidx.core.view.j.k(i14, "getGroupChallengePlayers(", this.f87040g, ", ", ", "), i15, ") failed");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GroupChallengeLeaderboardListPagingSource", strQ);
        i2.a.f(a2Var, "GroupChallengeLeaderboardListPagingSource", exc.getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f87055d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f87055d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objX4 = gVar.f87053b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f87055d;
        if (i15 == 0) {
            r.b(objX4);
            if (list.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((GroupChallengePlayerDTO) it.next()).f31537a;
                str.getClass();
                arrayList.add(new Integer(Integer.parseInt(str)));
            }
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
            gVar.f87052a = list;
            gVar.f87055d = 1;
            objX4 = this.f87035b.x4(arrayList, listK, gVar);
            if (objX4 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = gVar.f87052a;
            r.b(objX4);
        }
        Map map = (Map) objX4;
        for (GroupChallengePlayerDTO groupChallengePlayerDTO : list) {
            String str2 = groupChallengePlayerDTO.f31537a;
            str2.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str2), map);
            if (lVar != null) {
                com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = lVar.getProfileImageUrls();
                groupChallengePlayerDTO.f31548l = new b12.b(profileImageUrls != null ? profileImageUrls.f46879h : null, null, null, null, null, 30, null);
            }
        }
        return list;
    }

    public final void h(boolean z14) {
        Object obj;
        ArrayList arrayList = this.f87044k;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((GroupChallengePlayerDTO) next).f31537a;
            GroupChallengePlayerDTO groupChallengePlayerDTO = this.f87036c.f31529r;
            if (s.g(str, groupChallengePlayerDTO != null ? groupChallengePlayerDTO.f31537a : null)) {
                obj = next;
                break;
            }
        }
        GroupChallengePlayerDTO groupChallengePlayerDTO2 = (GroupChallengePlayerDTO) obj;
        this.f87038e.invoke(Integer.valueOf(groupChallengePlayerDTO2 != null ? arrayList.indexOf(groupChallengePlayerDTO2) : 0), Boolean.valueOf(z14));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Li10/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PLAYERS_BEFORE_CURRENT_USER", "I", "PLAYERS_AFTER_CURRENT_USER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
