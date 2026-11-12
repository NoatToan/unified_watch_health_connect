package wz0;

import a22.i;
import android.content.Context;
import c22.t;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p13.g0;
import p13.h0;
import p13.j0;
import p13.u0;
import p13.y;
import re0.h;
import sz0.a0;
import sz0.b0;
import sz0.e0;
import sz0.o;
import ue0.n;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lwz0/b;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "Lsz0/a0;", "notificationsRepo", "Lre0/h;", "accountSharingService", "La22/i;", "userProfileRepo", "Lkotlin/Function0;", "Landroid/content/Context;", "requireContext", "Lwz0/a;", "cache", "<init>", "(Lsz0/a0;Lre0/h;La22/i;Le23/a;Lwz0/a;)V", "a", "b", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h3<String, NotificationItem> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f188136g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f188137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f188138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f188139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Context> f188140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wz0.a f188141f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwz0/b$a;", "", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem$Request;", "pendingRequests", "", "totalInvites", "<init>", "(Ljava/util/List;I)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<NotificationItem.Request> f188142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f188143b;

        public a(List<NotificationItem.Request> list, int i14) {
            list.getClass();
            this.f188142a = list;
            this.f188143b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f188142a.equals(aVar.f188142a) && this.f188143b == aVar.f188143b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f188143b) + (this.f188142a.hashCode() * 31);
        }

        public final String toString() {
            return "AccountSharingInvites(pendingRequests=" + this.f188142a + ", totalInvites=" + this.f188143b + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f188145b;

        static {
            int[] iArr = new int[vz0.b.values().length];
            try {
                iArr[vz0.b.GROUP_JOIN_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vz0.b.GROUP_INVITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vz0.b.FOLLOW_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vz0.b.DEVICE_INVITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f188144a = iArr;
            int[] iArr2 = new int[ue0.c.values().length];
            try {
                iArr2[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f188145b = iArr2;
        }
    }

    static {
        new C3502b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a0 a0Var, h hVar, i iVar, e23.a<? extends Context> aVar, wz0.a aVar2) {
        a0Var.getClass();
        hVar.getClass();
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f188137b = a0Var;
        this.f188138c = hVar;
        this.f188139d = iVar;
        this.f188140e = aVar;
        this.f188141f = aVar2;
    }

    public static Map g(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            l lVar = (l) entry.getValue();
            arrayList.add(lVar != null ? new p(Integer.valueOf(iIntValue), lVar) : null);
        }
        return u0.l(h0.Z(arrayList));
    }

    @Override // yc.h3
    public final String c(i3<String, NotificationItem> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0171 A[LOOP:2: B:51:0x016b->B:53:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x020b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x022b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0238  */
    /* JADX WARN: Code duplicated, block: B:84:0x0247  */
    /* JADX WARN: Code duplicated, block: B:86:0x0255  */
    /* JADX WARN: Code duplicated, block: B:87:0x0260  */
    /* JADX WARN: Code duplicated, block: B:91:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0288  */
    /* JADX WARN: Code duplicated, block: B:97:0x028d  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (f(r2) == r3) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList] */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        g gVar;
        Context contextInvoke;
        int i14;
        String str;
        List list;
        List list2;
        String str2;
        v2 v2Var;
        v2.b bVar;
        List<uz0.g> listB;
        List<String> listB1;
        Object objA;
        b bVar2;
        v2 v2Var2;
        Context context;
        ArrayList arrayList;
        Iterator it;
        List<uz0.g> listB2;
        ?? arrayList2;
        Long fromUserId;
        Integer num;
        NotificationItem.Activity activityC;
        uz0.i pagination;
        String nextCursor;
        List<uz0.g> listB3;
        ?? arrayList3;
        Collection collection;
        Long fromUserId2;
        Integer numValueOf;
        NotificationItem.Activity activityC2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i15 = gVar.f188180i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f188180i = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f188178g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f188180i;
        e23.a<Context> aVar3 = this.f188140e;
        wz0.a aVar4 = this.f188141f;
        if (i16 == 0) {
            r.b(obj);
            if (aVar4.f188134f) {
                ArrayList arrayListC0 = h0.C0(aVar4.f188129a, aVar4.f188130b);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var, "NotificationPagingSource", "useCache, cachedItems=[" + arrayListC0 + "]");
                aVar4.f188134f = false;
                if (!arrayListC0.isEmpty()) {
                    return new h3.b.c(arrayListC0, null, aVar4.f188133e);
                }
            }
            if (aVar4.f188135g) {
                gVar.f188180i = 1;
            } else {
                contextInvoke = aVar3.invoke();
                String str3 = (String) aVar.a();
                i14 = aVar.f196007a;
                if (str3 == null) {
                    gVar.f188172a = contextInvoke;
                    gVar.f188173b = str3;
                    gVar.f188177f = i14;
                    gVar.f188180i = 2;
                    Object objF = f(gVar);
                    if (objF != aVar2) {
                        str = str3;
                        obj = objF;
                        list = (List) obj;
                    }
                } else {
                    str = str3;
                    list = j0.f134944a;
                }
            }
            return aVar2;
        }
        if (i16 == 1) {
            r.b(obj);
            ArrayList arrayListC1 = h0.C0(aVar4.f188129a, aVar4.f188130b);
            i2.a aVar6 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var2, "NotificationPagingSource", "refreshRequestsOnly, cachedItems=[" + arrayListC1 + "]");
            aVar4.f188135g = false;
            return new h3.b.c(arrayListC1, null, aVar4.f188133e);
        }
        if (i16 == 2) {
            i14 = gVar.f188177f;
            str = gVar.f188173b;
            contextInvoke = gVar.f188172a;
            r.b(obj);
            list = (List) obj;
        } else {
            if (i16 == 3) {
                i14 = gVar.f188177f;
                List list3 = gVar.f188174c;
                str = gVar.f188173b;
                contextInvoke = gVar.f188172a;
                r.b(obj);
                list2 = list3;
                str2 = str;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new h3.b.C3657b();
                    }
                    String strH = androidx.room.a0.h("loadInitial: Error: result=[", v2Var, "]");
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var3, "NotificationPagingSource", strH);
                    return new h3.b.a(((v2.a) v2Var).f47383a);
                }
                String strH2 = androidx.room.a0.h("loadInitial: Success: result=[", v2Var, "]");
                i2.a aVar8 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar8.getClass();
                i2.a.b(a2Var4, "NotificationPagingSource", strH2);
                bVar = (v2.b) v2Var;
                listB = ((uz0.h) bVar.f47386a).b();
                if (listB != null) {
                    arrayList = new ArrayList(y.r(listB, 10));
                    it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((uz0.g) it.next()).getFromUserId()));
                    }
                    listB1 = h0.b1(h0.f1(arrayList));
                } else {
                    listB1 = null;
                }
                if (listB1 != null) {
                    gVar.f188172a = contextInvoke;
                    gVar.f188173b = str2;
                    gVar.f188174c = list2;
                    gVar.f188175d = bVar;
                    gVar.f188176e = this;
                    gVar.f188177f = i14;
                    gVar.f188180i = 4;
                    i.a aVar9 = i.f537b;
                    objA = this.f188139d.a(listB1, k.f46891k, gVar);
                    if (objA != aVar2) {
                        bVar2 = this;
                        v2Var2 = v2Var;
                        obj = objA;
                        context = contextInvoke;
                    }
                    return aVar2;
                }
                if (str2 == null) {
                    listB3 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
                    arrayList2 = new ArrayList();
                    if (listB3 != null) {
                        arrayList3 = new ArrayList();
                        for (uz0.g gVar2 : listB3) {
                            Map<Integer, l> map = aVar4.f188131c;
                            fromUserId2 = gVar2.getFromUserId();
                            if (fromUserId2 != null) {
                                numValueOf = Integer.valueOf((int) fromUserId2.longValue());
                            } else {
                                numValueOf = null;
                            }
                            activityC2 = o.c(gVar2, contextInvoke, null, map.get(numValueOf));
                            if (activityC2 != null) {
                                arrayList3.add(activityC2);
                            }
                        }
                    } else {
                        arrayList3 = j0.f134944a;
                    }
                    collection = (Collection) arrayList3;
                    if (!collection.isEmpty()) {
                        String string = contextInvoke.getString(R.string.concept_notifications_abbr);
                        string.getClass();
                        arrayList2.add(new NotificationItem.Header(string));
                        arrayList2.addAll(collection);
                    }
                } else {
                    listB2 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
                    if (listB2 != null) {
                        arrayList2 = new ArrayList();
                        for (uz0.g gVar3 : listB2) {
                            Map<Integer, l> map2 = aVar4.f188131c;
                            fromUserId = gVar3.getFromUserId();
                            if (fromUserId != null) {
                                num = new Integer((int) fromUserId.longValue());
                            } else {
                                num = null;
                            }
                            activityC = o.c(gVar3, aVar3.invoke(), null, map2.get(num));
                            if (activityC != null) {
                                arrayList2.add(activityC);
                            }
                        }
                    } else {
                        arrayList2 = 0;
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = j0.f134944a;
                }
                pagination = ((uz0.h) ((v2.b) v2Var).f47386a).getPagination();
                if (pagination != null) {
                    nextCursor = pagination.getNextCursor();
                } else {
                    nextCursor = null;
                }
                aVar4.f188130b.addAll((Collection) arrayList2);
                aVar4.f188133e = nextCursor;
                return new h3.b.c(h0.C0(list2, (Iterable) arrayList2), null, nextCursor);
            }
            if (i16 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = gVar.f188176e;
            v2Var2 = gVar.f188175d;
            list2 = gVar.f188174c;
            str2 = gVar.f188173b;
            context = gVar.f188172a;
            r.b(obj);
        }
        bVar2.getClass();
        aVar4.f188131c.putAll(g((Map) obj));
        contextInvoke = context;
        v2Var = v2Var2;
        if (str2 == null) {
            listB3 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
            arrayList2 = new ArrayList();
            if (listB3 != null) {
                arrayList3 = new ArrayList();
                while (r2.hasNext()) {
                    Map<Integer, l> map3 = aVar4.f188131c;
                    fromUserId2 = gVar2.getFromUserId();
                    if (fromUserId2 != null) {
                        numValueOf = Integer.valueOf((int) fromUserId2.longValue());
                    } else {
                        numValueOf = null;
                    }
                    activityC2 = o.c(gVar2, contextInvoke, null, map3.get(numValueOf));
                    if (activityC2 != null) {
                        arrayList3.add(activityC2);
                    }
                }
            } else {
                arrayList3 = j0.f134944a;
            }
            collection = (Collection) arrayList3;
            if (!collection.isEmpty()) {
                String string2 = contextInvoke.getString(R.string.concept_notifications_abbr);
                string2.getClass();
                arrayList2.add(new NotificationItem.Header(string2));
                arrayList2.addAll(collection);
            }
        } else {
            listB2 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
            if (listB2 != null) {
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    Map<Integer, l> map4 = aVar4.f188131c;
                    fromUserId = gVar3.getFromUserId();
                    if (fromUserId != null) {
                        num = new Integer((int) fromUserId.longValue());
                    } else {
                        num = null;
                    }
                    activityC = o.c(gVar3, aVar3.invoke(), null, map4.get(num));
                    if (activityC != null) {
                        arrayList2.add(activityC);
                    }
                }
            } else {
                arrayList2 = 0;
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = j0.f134944a;
        }
        pagination = ((uz0.h) ((v2.b) v2Var).f47386a).getPagination();
        if (pagination != null) {
            nextCursor = pagination.getNextCursor();
        } else {
            nextCursor = null;
        }
        aVar4.f188130b.addAll((Collection) arrayList2);
        aVar4.f188133e = nextCursor;
        return new h3.b.c(h0.C0(list2, (Iterable) arrayList2), null, nextCursor);
        String strE = t.e(i14, "loadInitial: cursor=[", str, "], limit=[", "]");
        i2.a aVar10 = i2.f36769a;
        a2 a2Var5 = a2.GENERAL;
        aVar10.getClass();
        i2.a.b(a2Var5, "NotificationPagingSource", strE);
        gVar.f188172a = contextInvoke;
        gVar.f188173b = str;
        gVar.f188174c = list;
        gVar.f188177f = i14;
        gVar.f188180i = 3;
        Object objA2 = this.f188137b.a(i14, str, gVar);
        if (objA2 != aVar2) {
            list2 = list;
            obj = objA2;
            str2 = str;
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return new h3.b.C3657b();
                }
                String strH3 = androidx.room.a0.h("loadInitial: Error: result=[", v2Var, "]");
                i2.a aVar11 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var6, "NotificationPagingSource", strH3);
                return new h3.b.a(((v2.a) v2Var).f47383a);
            }
            String strH4 = androidx.room.a0.h("loadInitial: Success: result=[", v2Var, "]");
            i2.a aVar12 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar12.getClass();
            i2.a.b(a2Var7, "NotificationPagingSource", strH4);
            bVar = (v2.b) v2Var;
            listB = ((uz0.h) bVar.f47386a).b();
            if (listB != null) {
                arrayList = new ArrayList(y.r(listB, 10));
                it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((uz0.g) it.next()).getFromUserId()));
                }
                listB1 = h0.b1(h0.f1(arrayList));
            } else {
                listB1 = null;
            }
            if (listB1 != null) {
                gVar.f188172a = contextInvoke;
                gVar.f188173b = str2;
                gVar.f188174c = list2;
                gVar.f188175d = bVar;
                gVar.f188176e = this;
                gVar.f188177f = i14;
                gVar.f188180i = 4;
                i.a aVar13 = i.f537b;
                objA = this.f188139d.a(listB1, k.f46891k, gVar);
                if (objA != aVar2) {
                    bVar2 = this;
                    v2Var2 = v2Var;
                    obj = objA;
                    context = contextInvoke;
                    bVar2.getClass();
                    aVar4.f188131c.putAll(g((Map) obj));
                    contextInvoke = context;
                    v2Var = v2Var2;
                }
            }
            if (str2 == null) {
                listB3 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
                arrayList2 = new ArrayList();
                if (listB3 != null) {
                    arrayList3 = new ArrayList();
                    while (r2.hasNext()) {
                        Map<Integer, l> map5 = aVar4.f188131c;
                        fromUserId2 = gVar2.getFromUserId();
                        if (fromUserId2 != null) {
                            numValueOf = Integer.valueOf((int) fromUserId2.longValue());
                        } else {
                            numValueOf = null;
                        }
                        activityC2 = o.c(gVar2, contextInvoke, null, map5.get(numValueOf));
                        if (activityC2 != null) {
                            arrayList3.add(activityC2);
                        }
                    }
                } else {
                    arrayList3 = j0.f134944a;
                }
                collection = (Collection) arrayList3;
                if (!collection.isEmpty()) {
                    String string3 = contextInvoke.getString(R.string.concept_notifications_abbr);
                    string3.getClass();
                    arrayList2.add(new NotificationItem.Header(string3));
                    arrayList2.addAll(collection);
                }
            } else {
                listB2 = ((uz0.h) ((v2.b) v2Var).f47386a).b();
                if (listB2 != null) {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        Map<Integer, l> map6 = aVar4.f188131c;
                        fromUserId = gVar3.getFromUserId();
                        if (fromUserId != null) {
                            num = new Integer((int) fromUserId.longValue());
                        } else {
                            num = null;
                        }
                        activityC = o.c(gVar3, aVar3.invoke(), null, map6.get(num));
                        if (activityC != null) {
                            arrayList2.add(activityC);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = j0.f134944a;
            }
            pagination = ((uz0.h) ((v2.b) v2Var).f47386a).getPagination();
            if (pagination != null) {
                nextCursor = pagination.getNextCursor();
            } else {
                nextCursor = null;
            }
            aVar4.f188130b.addAll((Collection) arrayList2);
            aVar4.f188133e = nextCursor;
            return new h3.b.c(h0.C0(list2, (Iterable) arrayList2), null, nextCursor);
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) {
        wz0.c cVar2;
        Context contextInvoke;
        a aVar;
        if (cVar instanceof wz0.c) {
            cVar2 = (wz0.c) cVar;
            int i14 = cVar2.f188150e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f188150e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new wz0.c(this, cVar);
            }
        } else {
            cVar2 = new wz0.c(this, cVar);
        }
        Object objH = cVar2.f188148c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f188150e;
        if (i15 == 0) {
            r.b(objH);
            contextInvoke = this.f188140e.invoke();
            cVar2.f188146a = contextInvoke;
            cVar2.f188150e = 1;
            objH = h(contextInvoke, cVar2);
            if (objH != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            contextInvoke = cVar2.f188146a;
            r.b(objH);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = cVar2.f188147b;
            r.b(objH);
        }
        List list = (List) objH;
        wz0.a aVar2 = this.f188141f;
        aVar2.f188129a.addAll(list);
        aVar2.f188132d = aVar.f188143b;
        return list;
        a aVar3 = (a) objH;
        List list2 = aVar3.f188142a;
        cVar2.f188146a = null;
        cVar2.f188147b = aVar3;
        cVar2.f188150e = 2;
        Object objI = i(contextInvoke, list2, cVar2);
        if (objI != obj) {
            aVar = aVar3;
            objH = objI;
            List list3 = (List) objH;
            wz0.a aVar4 = this.f188141f;
            aVar4.f188129a.addAll(list3);
            aVar4.f188132d = aVar.f188143b;
            return list3;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(Context context, v13.c cVar) {
        d dVar;
        List listD;
        List list;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f188155e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f188155e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objA = dVar.f188153c;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f188155e;
        if (i15 == 0) {
            r.b(objA);
            dVar.f188151a = context;
            dVar.f188155e = 1;
            objA = this.f188138c.a(dVar);
            if (objA != serializable) {
            }
            return serializable;
        }
        if (i15 == 1) {
            context = dVar.f188151a;
            r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = dVar.f188152b;
            r.b(objA);
        }
        return new a((List) objA, list.size());
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new a(j0.f134944a, 0);
            }
            lc.u0.r();
            return null;
        }
        ue0.b bVar = (ue0.b) ((v2.b) v2Var).f47386a;
        if (bVar == null || (listD = bVar.d()) == null) {
            listD = j0.f134944a;
        }
        dVar.f188151a = null;
        dVar.f188152b = listD;
        dVar.f188155e = 2;
        Serializable serializableJ = j(context, listD, dVar);
        if (serializableJ != serializable) {
            List list2 = listD;
            objA = serializableJ;
            list = list2;
            return new a((List) objA, list.size());
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:61:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i(Context context, List list, v13.c cVar) {
        e eVar;
        int size;
        Context context2;
        List list2;
        List list3;
        int iIntValue;
        List<uz0.d> listF;
        ArrayList arrayList;
        Context context3;
        m0 m0Var;
        int i14;
        ArrayList arrayList2;
        Context context4;
        List list4;
        m0 m0Var2;
        List list5;
        v2 v2Var;
        j profileImageUrls;
        Long userId;
        int i15;
        List listS;
        c53.j jVarQ;
        v2 v2Var2;
        Map<Integer, l> mapD;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i16 = eVar.f188166k;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f188166k = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f188164i;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = eVar.f188166k;
        a0 a0Var = this.f188137b;
        wz0.a aVar2 = this.f188141f;
        if (i17 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            size = list.size();
            context2 = context;
            eVar.f188156a = context2;
            list2 = list;
            eVar.f188157b = list2;
            eVar.f188158c = arrayListX;
            eVar.f188162g = size;
            eVar.f188166k = 1;
            a0Var.getClass();
            Object objJ = f0.J(a0Var, new e0(a0Var, null), eVar);
            if (objJ != aVar) {
                list3 = arrayListX;
                obj = objJ;
            }
            return aVar;
        }
        if (i17 == 1) {
            size = eVar.f188162g;
            list3 = eVar.f188158c;
            List list6 = eVar.f188157b;
            Context context5 = eVar.f188156a;
            r.b(obj);
            list2 = list6;
            context2 = context5;
        } else {
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = eVar.f188163h;
            m0Var2 = eVar.f188161f;
            arrayList2 = eVar.f188160e;
            v2Var = eVar.f188159d;
            list5 = eVar.f188158c;
            list4 = eVar.f188157b;
            context4 = eVar.f188156a;
            r.b(obj);
        }
        v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            uz0.e eVar2 = (uz0.e) ((v2.b) v2Var2).f47386a;
            mapD = eVar2.d();
            if (mapD != null) {
                aVar2.f188131c.putAll(g(mapD));
            }
            listF = eVar2.f();
        } else {
            if (v2Var2 instanceof v2.a) {
                lc.u0.r();
                return null;
            }
            listF = ((uz0.c) ((v2.b) v2Var).f47386a).f();
        }
        list3 = list5;
        list2 = list4;
        iIntValue = i14;
        m0Var = m0Var2;
        context3 = context4;
        arrayList = arrayList2;
        if (listF != null) {
            i15 = 2;
            jVarQ = c0.q(c0.o(new g0(listF), new wv0.h(this, arrayList, m0Var, context3, 2)), 2);
            if (jVarQ != null || (listS = c0.s(jVarQ)) == null) {
            }
            if (iIntValue > i15) {
                list3.add(new NotificationItem.RequestsEntry(arrayList, m0Var.f105804a, iIntValue));
                return list3;
            }
            list3.addAll(list2);
            list3.addAll(listS);
            return list3;
        }
        i15 = 2;
        listS = j0.f134944a;
        if (iIntValue > i15) {
            list3.add(new NotificationItem.RequestsEntry(arrayList, m0Var.f105804a, iIntValue));
            return list3;
        }
        list3.addAll(list2);
        list3.addAll(listS);
        return list3;
        v2 v2Var3 = (v2) obj;
        if (!(v2Var3 instanceof v2.b)) {
            if (!(v2Var3 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strN = fb1.c.n("getInboxRequestCount result error , ", ((v2.a) v2Var3).f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "NotificationPagingSource", strN);
            if (size > 0) {
                String string = context2.getString(R.string.lbl_connections_requests);
                string.getClass();
                list3.add(new NotificationItem.Header(string));
                list3.addAll(list2);
            }
            return list3;
        }
        v2.b bVar = (v2.b) v2Var3;
        uz0.c cVar2 = (uz0.c) bVar.f47386a;
        String str = "getInboxRequestCount result success , data = " + cVar2.f();
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var2, "NotificationPagingSource", str);
        Integer requestCount = cVar2.getRequestCount();
        iIntValue = (requestCount != null ? requestCount.intValue() : 0) + size;
        if (iIntValue > 0) {
            String string2 = context2.getString(R.string.lbl_connections_requests);
            string2.getClass();
            list3.add(new NotificationItem.Header(string2));
        }
        Map<Integer, l> mapB = cVar2.b();
        if (mapB != null) {
            aVar2.f188131c.putAll(mapB);
        }
        ArrayList arrayList3 = new ArrayList();
        m0 m0Var3 = new m0();
        if (size > 0) {
            for (Iterator it = h0.S0(list2, 2).iterator(); it.hasNext(); it = it) {
                NotificationItem.Request request = (NotificationItem.Request) it.next();
                Map<Integer, l> map = aVar2.f188131c;
                n accountSharingInviteDTO = request.getAccountSharingInviteDTO();
                l lVar = map.get((accountSharingInviteDTO == null || (userId = accountSharingInviteDTO.getUserId()) == null) ? null : new Integer((int) userId.longValue()));
                arrayList3.add(new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46877f, null, null, null, null, 30, null));
                cVar2 = cVar2;
            }
        }
        uz0.c cVar3 = cVar2;
        if (iIntValue <= 2) {
            eVar.f188156a = context2;
            eVar.f188157b = list2;
            eVar.f188158c = list3;
            eVar.f188159d = bVar;
            eVar.f188160e = arrayList3;
            eVar.f188161f = m0Var3;
            eVar.f188162g = size;
            eVar.f188163h = iIntValue;
            eVar.f188166k = 2;
            a0Var.getClass();
            Object objJ2 = f0.J(a0Var, new b0(a0Var, 2, null, null), eVar);
            if (objJ2 != aVar) {
                i14 = iIntValue;
                arrayList2 = arrayList3;
                context4 = context2;
                list4 = list2;
                m0Var2 = m0Var3;
                list5 = list3;
                v2Var = v2Var3;
                obj = objJ2;
                v2Var2 = (v2) obj;
                if (v2Var2 instanceof v2.b) {
                    uz0.e eVar3 = (uz0.e) ((v2.b) v2Var2).f47386a;
                    mapD = eVar3.d();
                    if (mapD != null) {
                        aVar2.f188131c.putAll(g(mapD));
                    }
                    listF = eVar3.f();
                } else {
                    if (v2Var2 instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    listF = ((uz0.c) ((v2.b) v2Var).f47386a).f();
                }
                list3 = list5;
                list2 = list4;
                iIntValue = i14;
                m0Var = m0Var2;
                context3 = context4;
                arrayList = arrayList2;
            }
            return aVar;
        }
        listF = cVar3.f();
        arrayList = arrayList3;
        context3 = context2;
        m0Var = m0Var3;
        if (listF != null) {
            i15 = 2;
            jVarQ = c0.q(c0.o(new g0(listF), new wv0.h(this, arrayList, m0Var, context3, 2)), 2);
            if (jVarQ != null) {
            }
            if (iIntValue > i15) {
                list3.add(new NotificationItem.RequestsEntry(arrayList, m0Var.f105804a, iIntValue));
                return list3;
            }
            list3.addAll(list2);
            list3.addAll(listS);
            return list3;
        }
        i15 = 2;
        listS = j0.f134944a;
        if (iIntValue > i15) {
            list3.add(new NotificationItem.RequestsEntry(arrayList, m0Var.f105804a, iIntValue));
            return list3;
        }
        list3.addAll(list2);
        list3.addAll(listS);
        return list3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable j(Context context, List list, v13.c cVar) {
        f fVar;
        NotificationItem.Request requestE;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f188171e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f188171e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA = fVar.f188169c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f188171e;
        if (i15 == 0) {
            r.b(objA);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((n) it.next()).getUserId()));
            }
            List<String> listB1 = h0.b1(h0.f1(arrayList));
            fVar.f188167a = context;
            fVar.f188168b = list;
            fVar.f188171e = 1;
            i.a aVar2 = i.f537b;
            objA = this.f188139d.a(listB1, k.f46891k, fVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = fVar.f188168b;
            context = fVar.f188167a;
            r.b(objA);
        }
        wz0.a aVar3 = this.f188141f;
        aVar3.f188131c.putAll(g((Map) objA));
        ArrayList arrayList2 = new ArrayList();
        for (n nVar : list) {
            ue0.c status = nVar.getStatus();
            int i16 = status == null ? -1 : c.f188145b[status.ordinal()];
            if (i16 == -1) {
                requestE = null;
            } else if (i16 != 1) {
                if (i16 != 2) {
                    lc.u0.r();
                    return null;
                }
                requestE = null;
            } else {
                Map<Integer, l> map = aVar3.f188131c;
                Long userId = nVar.getUserId();
                requestE = o.e(nVar, context, map.get(userId != null ? new Integer((int) userId.longValue()) : null));
            }
            if (requestE != null) {
                arrayList2.add(requestE);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: wz0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwz0/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INBOX_PAGE_REQUEST_DISPLAY_LIMIT", "I", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3502b {
        public /* synthetic */ C3502b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3502b() {
        }
    }
}
