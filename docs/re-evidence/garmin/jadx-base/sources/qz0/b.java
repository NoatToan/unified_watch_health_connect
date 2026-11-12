package qz0;

import android.content.Context;
import androidx.room.a0;
import c22.t;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import ei0.q0;
import hz0.m;
import hz0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import li0.d0;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.h0;
import p13.j0;
import p13.y;
import tn.k;
import to.e;
import vb.h;
import wg0.j;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqz0/b;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "Lhz0/m;", "newsFeedRepo", "Lei0/d;", "followRepo", "Lqz0/a;", "cache", "Lkotlin/Function1;", "Lt13/d;", "", "", "preLoadInitial", "Lkotlin/Function0;", "Landroid/content/Context;", "requireContext", "<init>", "(Lhz0/m;Lei0/d;Lqz0/a;Le23/l;Le23/a;)V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h3<String, NewsFeedItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f148609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei0.d f148610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qz0.a f148611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<t13.d<? super Unit>, Object> f148612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Context> f148613f;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(m mVar, ei0.d dVar, qz0.a aVar, l<? super t13.d<? super Unit>, ? extends Object> lVar, e23.a<? extends Context> aVar2) {
        mVar.getClass();
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        this.f148609b = mVar;
        this.f148610c = dVar;
        this.f148611d = aVar;
        this.f148612e = lVar;
        this.f148613f = aVar2;
    }

    @Override // yc.h3
    public final String c(i3<String, NewsFeedItem> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x029b  */
    /* JADX WARN: Code duplicated, block: B:109:0x029f  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:57:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f4 A[LOOP:1: B:74:0x01ee->B:76:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x022e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0231  */
    /* JADX WARN: Code duplicated, block: B:86:0x0243  */
    /* JADX WARN: Code duplicated, block: B:89:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258  */
    /* JADX WARN: Code duplicated, block: B:93:0x025d  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r0 == r3) goto L60;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        d dVar;
        int i14;
        String str;
        NewsFeedItem.SuggestedFollowingList suggestedFollowingList;
        String str2;
        Object objJ;
        NewsFeedItem.SuggestedFollowingList suggestedFollowingList2;
        v2 v2Var;
        v2.b bVar;
        ActivityListDTO activityListDTO;
        a2 a2Var;
        ArrayList<ActivityListItemDTO> arrayList;
        ArrayList arrayList2;
        qz0.a aVar2;
        Object objC0;
        v2 v2Var2;
        NewsFeedItem.SuggestedFollowingList suggestedFollowingList3;
        ArrayList<ActivityListItemDTO> arrayList3;
        ArrayList arrayList4;
        ActivityListDTO activityListDTO2;
        List listB1;
        ArrayList arrayList5;
        int size;
        int size2;
        e eVar;
        String nextCursor;
        int i15;
        e eVar2;
        String nextCursor2;
        v2 v2Var3;
        ArrayList arrayList6;
        Iterator it;
        String displayName;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i16 = dVar.f148627j;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                dVar.f148627j = i16 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objF = dVar.f148625h;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = dVar.f148627j;
        if (i17 == 0) {
            r.b(objF);
            String str3 = (String) aVar.a();
            i14 = aVar.f196007a;
            qz0.a aVar4 = this.f148611d;
            if (aVar4.f148607j && (((str2 = aVar4.f148600c) != null && str2.length() > 0 && !s.g(aVar4.f148600c, str3)) || (aVar4.f148600c == null && str3 == null))) {
                List listB2 = h0.b1(this.f148611d.f148598a);
                String strH = k.h("load, cachedNewsFeedItems=[", "]", listB2);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var2, "NewsFeedPagingSource", strH);
                this.f148611d.f148607j = false;
                if (!listB2.isEmpty()) {
                    return new h3.b.c(h0.b1(this.f148611d.f148598a), null, this.f148611d.f148600c);
                }
            }
            if (str3 == null) {
                l<t13.d<? super Unit>, Object> lVar = this.f148612e;
                dVar.f148618a = str3;
                dVar.f148624g = i14;
                dVar.f148627j = 1;
                if (lVar.invoke(dVar) != aVar3) {
                    str = str3;
                }
            } else {
                str = str3;
                suggestedFollowingList = null;
                String strE = t.e(i14, "load: cursor=[", str, "], limit=[", "]");
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var3, "NewsFeedPagingSource", strE);
                m mVar = this.f148609b;
                dVar.f148618a = null;
                dVar.f148619b = suggestedFollowingList;
                dVar.f148624g = i14;
                dVar.f148627j = 3;
                mVar.getClass();
                objJ = f0.J(mVar, new p(mVar, i14, str, null), dVar);
                if (objJ != aVar3) {
                    suggestedFollowingList2 = suggestedFollowingList;
                    objF = objJ;
                    v2Var = (v2) objF;
                    if (!(v2Var instanceof v2.b)) {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        String strH2 = a0.h("load: Error: result=[", v2Var, "]");
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.b(a2Var4, "NewsFeedPagingSource", strH2);
                        return new h3.b.a(((v2.a) v2Var).f47383a);
                    }
                    bVar = (v2.b) v2Var;
                    activityListDTO = (ActivityListDTO) bVar.f47386a;
                    String strH3 = a0.h("load: Success: result=[", v2Var, "]");
                    i2.a aVar8 = i2.f36769a;
                    a2Var = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var, "NewsFeedPagingSource", strH3);
                    arrayList = activityListDTO.f29242a;
                    if (arrayList == null) {
                        i2.a.b(a2Var, "NewsFeedPagingSource", "load: Error: activityList=[null]");
                        return new h3.b.a(new Exception());
                    }
                    arrayList2 = new ArrayList();
                    aVar2 = this.f148611d;
                    if (!aVar2.f148608k) {
                        listB1 = h0.b1(aVar2.f148599b);
                    } else {
                        ei0.d dVar2 = this.f148610c;
                        j0 j0Var = j0.f134944a;
                        Integer num = new Integer(1);
                        Integer num2 = new Integer(1000);
                        dVar.f148618a = null;
                        dVar.f148619b = suggestedFollowingList2;
                        dVar.f148620c = bVar;
                        dVar.f148621d = activityListDTO;
                        dVar.f148622e = arrayList;
                        dVar.f148623f = arrayList2;
                        dVar.f148624g = i14;
                        dVar.f148627j = 4;
                        objC0 = dVar2.C0(j0Var, num, num2, dVar);
                        if (objC0 != aVar3) {
                            NewsFeedItem.SuggestedFollowingList suggestedFollowingList4 = suggestedFollowingList2;
                            v2Var2 = v2Var;
                            objF = objC0;
                            suggestedFollowingList3 = suggestedFollowingList4;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            activityListDTO2 = activityListDTO;
                            v2Var3 = (v2) objF;
                            if (v2Var3 instanceof v2.b) {
                                Iterable iterable = (Iterable) ((v2.b) v2Var3).f47386a;
                                arrayList6 = new ArrayList(y.r(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    displayName = ((hi0.a) it.next()).getDisplayName();
                                    if (displayName == null) {
                                        displayName = "";
                                    }
                                    arrayList6.add(displayName);
                                }
                                arrayList2 = arrayList4;
                                arrayList = arrayList3;
                                activityListDTO = activityListDTO2;
                                v2Var = v2Var2;
                                suggestedFollowingList2 = suggestedFollowingList3;
                                listB1 = arrayList6;
                            } else {
                                arrayList2 = arrayList4;
                                arrayList = arrayList3;
                                activityListDTO = activityListDTO2;
                                listB1 = new ArrayList();
                                v2Var = v2Var2;
                                suggestedFollowingList2 = suggestedFollowingList3;
                            }
                        }
                    }
                    arrayList5 = new ArrayList(y.r(arrayList, 10));
                    for (ActivityListItemDTO activityListItemDTO : arrayList) {
                        activityListItemDTO.getClass();
                        arrayList5.add(new NewsFeedItem.ActivityPost(j.b(activityListItemDTO, this.f148613f.invoke(), false, activityListDTO.f29246e, null, listB1, 10)));
                    }
                    List listB = y0.b(arrayList5);
                    arrayList2.addAll(listB);
                    size = listB.size();
                    if (suggestedFollowingList2 != null) {
                        size2 = suggestedFollowingList2.getSuggestedFollowingList().size();
                    } else {
                        size2 = 0;
                    }
                    if (suggestedFollowingList2 != null) {
                        if (1 <= size) {
                            arrayList2.add(2, suggestedFollowingList2);
                        } else {
                            arrayList2.add(2, suggestedFollowingList2);
                        }
                    }
                    v2.b bVar2 = (v2.b) v2Var;
                    eVar = ((ActivityListDTO) bVar2.f47386a).f29243b;
                    if (eVar != null) {
                        nextCursor = eVar.getNextCursor();
                    } else {
                        nextCursor = null;
                    }
                    i15 = ((ActivityListDTO) bVar2.f47386a).f29245d;
                    synchronized (this) {
                        this.f148611d.f148598a.addAll(arrayList2);
                        this.f148611d.f148599b.clear();
                        this.f148611d.f148599b.addAll(listB1);
                        qz0.a aVar9 = this.f148611d;
                        aVar9.f148608k = true;
                        aVar9.f148600c = nextCursor;
                        aVar9.f148603f = i15;
                        eVar2 = ((ActivityListDTO) bVar2.f47386a).f29243b;
                        if (eVar2 != null) {
                            nextCursor2 = eVar2.getNextCursor();
                        } else {
                            nextCursor2 = null;
                        }
                        return new h3.b.c(arrayList2, null, nextCursor2);
                    }
                }
            }
            return aVar3;
        }
        if (i17 == 1) {
            i14 = dVar.f148624g;
            str = dVar.f148618a;
            r.b(objF);
        } else {
            if (i17 == 2) {
                i14 = dVar.f148624g;
                str = dVar.f148618a;
                r.b(objF);
                suggestedFollowingList = (NewsFeedItem.SuggestedFollowingList) objF;
                String strE2 = t.e(i14, "load: cursor=[", str, "], limit=[", "]");
                i2.a aVar10 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar10.getClass();
                i2.a.b(a2Var5, "NewsFeedPagingSource", strE2);
                m mVar2 = this.f148609b;
                dVar.f148618a = null;
                dVar.f148619b = suggestedFollowingList;
                dVar.f148624g = i14;
                dVar.f148627j = 3;
                mVar2.getClass();
                objJ = f0.J(mVar2, new p(mVar2, i14, str, null), dVar);
                if (objJ != aVar3) {
                    suggestedFollowingList2 = suggestedFollowingList;
                    objF = objJ;
                    v2Var = (v2) objF;
                    if (!(v2Var instanceof v2.b)) {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        String strH4 = a0.h("load: Error: result=[", v2Var, "]");
                        i2.a aVar11 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar11.getClass();
                        i2.a.b(a2Var6, "NewsFeedPagingSource", strH4);
                        return new h3.b.a(((v2.a) v2Var).f47383a);
                    }
                    bVar = (v2.b) v2Var;
                    activityListDTO = (ActivityListDTO) bVar.f47386a;
                    String strH5 = a0.h("load: Success: result=[", v2Var, "]");
                    i2.a aVar12 = i2.f36769a;
                    a2Var = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.b(a2Var, "NewsFeedPagingSource", strH5);
                    arrayList = activityListDTO.f29242a;
                    if (arrayList == null) {
                        i2.a.b(a2Var, "NewsFeedPagingSource", "load: Error: activityList=[null]");
                        return new h3.b.a(new Exception());
                    }
                    arrayList2 = new ArrayList();
                    aVar2 = this.f148611d;
                    if (!aVar2.f148608k) {
                        listB1 = h0.b1(aVar2.f148599b);
                    } else {
                        ei0.d dVar3 = this.f148610c;
                        j0 j0Var2 = j0.f134944a;
                        Integer num3 = new Integer(1);
                        Integer num4 = new Integer(1000);
                        dVar.f148618a = null;
                        dVar.f148619b = suggestedFollowingList2;
                        dVar.f148620c = bVar;
                        dVar.f148621d = activityListDTO;
                        dVar.f148622e = arrayList;
                        dVar.f148623f = arrayList2;
                        dVar.f148624g = i14;
                        dVar.f148627j = 4;
                        objC0 = dVar3.C0(j0Var2, num3, num4, dVar);
                        if (objC0 != aVar3) {
                            NewsFeedItem.SuggestedFollowingList suggestedFollowingList5 = suggestedFollowingList2;
                            v2Var2 = v2Var;
                            objF = objC0;
                            suggestedFollowingList3 = suggestedFollowingList5;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            activityListDTO2 = activityListDTO;
                        }
                    }
                    arrayList5 = new ArrayList(y.r(arrayList, 10));
                    while (r14.hasNext()) {
                        activityListItemDTO.getClass();
                        arrayList5.add(new NewsFeedItem.ActivityPost(j.b(activityListItemDTO, this.f148613f.invoke(), false, activityListDTO.f29246e, null, listB1, 10)));
                    }
                    List listB3 = y0.b(arrayList5);
                    arrayList2.addAll(listB3);
                    size = listB3.size();
                    if (suggestedFollowingList2 != null) {
                        size2 = suggestedFollowingList2.getSuggestedFollowingList().size();
                    } else {
                        size2 = 0;
                    }
                    if (suggestedFollowingList2 != null) {
                        if (1 <= size) {
                            arrayList2.add(2, suggestedFollowingList2);
                        } else {
                            arrayList2.add(2, suggestedFollowingList2);
                        }
                    }
                    v2.b bVar3 = (v2.b) v2Var;
                    eVar = ((ActivityListDTO) bVar3.f47386a).f29243b;
                    if (eVar != null) {
                        nextCursor = eVar.getNextCursor();
                    } else {
                        nextCursor = null;
                    }
                    i15 = ((ActivityListDTO) bVar3.f47386a).f29245d;
                    synchronized (this) {
                        this.f148611d.f148598a.addAll(arrayList2);
                        this.f148611d.f148599b.clear();
                        this.f148611d.f148599b.addAll(listB1);
                        qz0.a aVar13 = this.f148611d;
                        aVar13.f148608k = true;
                        aVar13.f148600c = nextCursor;
                        aVar13.f148603f = i15;
                        eVar2 = ((ActivityListDTO) bVar3.f47386a).f29243b;
                        if (eVar2 != null) {
                            nextCursor2 = eVar2.getNextCursor();
                        } else {
                            nextCursor2 = null;
                        }
                        return new h3.b.c(arrayList2, null, nextCursor2);
                    }
                }
                return aVar3;
            }
            if (i17 == 3) {
                i14 = dVar.f148624g;
                suggestedFollowingList2 = dVar.f148619b;
                r.b(objF);
                v2Var = (v2) objF;
                if (!(v2Var instanceof v2.b)) {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    String strH6 = a0.h("load: Error: result=[", v2Var, "]");
                    i2.a aVar14 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar14.getClass();
                    i2.a.b(a2Var7, "NewsFeedPagingSource", strH6);
                    return new h3.b.a(((v2.a) v2Var).f47383a);
                }
                bVar = (v2.b) v2Var;
                activityListDTO = (ActivityListDTO) bVar.f47386a;
                String strH7 = a0.h("load: Success: result=[", v2Var, "]");
                i2.a aVar15 = i2.f36769a;
                a2Var = a2.GENERAL;
                aVar15.getClass();
                i2.a.b(a2Var, "NewsFeedPagingSource", strH7);
                arrayList = activityListDTO.f29242a;
                if (arrayList == null) {
                    i2.a.b(a2Var, "NewsFeedPagingSource", "load: Error: activityList=[null]");
                    return new h3.b.a(new Exception());
                }
                arrayList2 = new ArrayList();
                aVar2 = this.f148611d;
                if (!aVar2.f148608k) {
                    ei0.d dVar4 = this.f148610c;
                    j0 j0Var3 = j0.f134944a;
                    Integer num5 = new Integer(1);
                    Integer num6 = new Integer(1000);
                    dVar.f148618a = null;
                    dVar.f148619b = suggestedFollowingList2;
                    dVar.f148620c = bVar;
                    dVar.f148621d = activityListDTO;
                    dVar.f148622e = arrayList;
                    dVar.f148623f = arrayList2;
                    dVar.f148624g = i14;
                    dVar.f148627j = 4;
                    objC0 = dVar4.C0(j0Var3, num5, num6, dVar);
                    if (objC0 != aVar3) {
                        NewsFeedItem.SuggestedFollowingList suggestedFollowingList6 = suggestedFollowingList2;
                        v2Var2 = v2Var;
                        objF = objC0;
                        suggestedFollowingList3 = suggestedFollowingList6;
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        activityListDTO2 = activityListDTO;
                    }
                    return aVar3;
                }
                listB1 = h0.b1(aVar2.f148599b);
                arrayList5 = new ArrayList(y.r(arrayList, 10));
                while (r14.hasNext()) {
                    activityListItemDTO.getClass();
                    arrayList5.add(new NewsFeedItem.ActivityPost(j.b(activityListItemDTO, this.f148613f.invoke(), false, activityListDTO.f29246e, null, listB1, 10)));
                }
                List listB4 = y0.b(arrayList5);
                arrayList2.addAll(listB4);
                size = listB4.size();
                if (suggestedFollowingList2 != null) {
                    size2 = suggestedFollowingList2.getSuggestedFollowingList().size();
                } else {
                    size2 = 0;
                }
                if (suggestedFollowingList2 != null && ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).f(size, size2)) {
                    if (1 <= size || size >= 3) {
                        arrayList2.add(2, suggestedFollowingList2);
                    } else {
                        arrayList2.add(suggestedFollowingList2);
                    }
                }
                v2.b bVar4 = (v2.b) v2Var;
                eVar = ((ActivityListDTO) bVar4.f47386a).f29243b;
                if (eVar != null) {
                    nextCursor = eVar.getNextCursor();
                } else {
                    nextCursor = null;
                }
                i15 = ((ActivityListDTO) bVar4.f47386a).f29245d;
                synchronized (this) {
                    this.f148611d.f148598a.addAll(arrayList2);
                    this.f148611d.f148599b.clear();
                    this.f148611d.f148599b.addAll(listB1);
                    qz0.a aVar16 = this.f148611d;
                    aVar16.f148608k = true;
                    aVar16.f148600c = nextCursor;
                    aVar16.f148603f = i15;
                }
                eVar2 = ((ActivityListDTO) bVar4.f47386a).f29243b;
                if (eVar2 != null) {
                    nextCursor2 = eVar2.getNextCursor();
                } else {
                    nextCursor2 = null;
                }
                return new h3.b.c(arrayList2, null, nextCursor2);
            }
            if (i17 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList4 = dVar.f148623f;
            arrayList3 = dVar.f148622e;
            activityListDTO2 = dVar.f148621d;
            v2Var2 = dVar.f148620c;
            suggestedFollowingList3 = dVar.f148619b;
            r.b(objF);
        }
        v2Var3 = (v2) objF;
        if (v2Var3 instanceof v2.b) {
            Iterable iterable2 = (Iterable) ((v2.b) v2Var3).f47386a;
            arrayList6 = new ArrayList(y.r(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                displayName = ((hi0.a) it.next()).getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                arrayList6.add(displayName);
            }
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            activityListDTO = activityListDTO2;
            v2Var = v2Var2;
            suggestedFollowingList2 = suggestedFollowingList3;
            listB1 = arrayList6;
        } else {
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            activityListDTO = activityListDTO2;
            listB1 = new ArrayList();
            v2Var = v2Var2;
            suggestedFollowingList2 = suggestedFollowingList3;
        }
        arrayList5 = new ArrayList(y.r(arrayList, 10));
        while (r14.hasNext()) {
            activityListItemDTO.getClass();
            arrayList5.add(new NewsFeedItem.ActivityPost(j.b(activityListItemDTO, this.f148613f.invoke(), false, activityListDTO.f29246e, null, listB1, 10)));
        }
        List listB5 = y0.b(arrayList5);
        arrayList2.addAll(listB5);
        size = listB5.size();
        if (suggestedFollowingList2 != null) {
            size2 = suggestedFollowingList2.getSuggestedFollowingList().size();
        } else {
            size2 = 0;
        }
        if (suggestedFollowingList2 != null) {
            if (1 <= size) {
                arrayList2.add(2, suggestedFollowingList2);
            } else {
                arrayList2.add(2, suggestedFollowingList2);
            }
        }
        v2.b bVar5 = (v2.b) v2Var;
        eVar = ((ActivityListDTO) bVar5.f47386a).f29243b;
        if (eVar != null) {
            nextCursor = eVar.getNextCursor();
        } else {
            nextCursor = null;
        }
        i15 = ((ActivityListDTO) bVar5.f47386a).f29245d;
        synchronized (this) {
            this.f148611d.f148598a.addAll(arrayList2);
            this.f148611d.f148599b.clear();
            this.f148611d.f148599b.addAll(listB1);
            qz0.a aVar17 = this.f148611d;
            aVar17.f148608k = true;
            aVar17.f148600c = nextCursor;
            aVar17.f148603f = i15;
            eVar2 = ((ActivityListDTO) bVar5.f47386a).f29243b;
            if (eVar2 != null) {
                nextCursor2 = eVar2.getNextCursor();
            } else {
                nextCursor2 = null;
            }
            return new h3.b.c(arrayList2, null, nextCursor2);
        }
        dVar.f148618a = str;
        dVar.f148624g = i14;
        dVar.f148627j = 2;
        objF = f(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(v13.c cVar) {
        c cVar2;
        ArrayList arrayList;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f148617d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f148617d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f148615b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f148617d;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            cVar2.f148614a = arrayListX;
            cVar2.f148617d = 1;
            Object objL3 = this.f148610c.l3(com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, cVar2);
            if (objL3 == aVar) {
                return aVar;
            }
            arrayList = arrayListX;
            obj = objL3;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = cVar2.f148614a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.a)) {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            List<d0> listC = q0.c((hi0.h) ((v2.b) v2Var).f47386a);
            if (listC != null) {
                arrayList.addAll(listC);
            }
        }
        return new NewsFeedItem.SuggestedFollowingList(arrayList);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqz0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
