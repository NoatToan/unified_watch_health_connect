package uu;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luu/n;", "Lyc/h3;", "Luu/h;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/q;", "Lav/g;", "badgesRepo", "La22/i;", "userProfileRepo", "Lcom/garmin/android/apps/connectmobile/badges/service/model/r;", Action.SCOPE_ATTRIBUTE, "", "startIndex", "pageSize", "<init>", "(Lav/g;La22/i;Lcom/garmin/android/apps/connectmobile/badges/service/model/r;II)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends h3<h, com.garmin.android.apps.connectmobile.badges.service.model.q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.g f172728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.i f172729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.badges.service.model.r f172730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f172731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f172732f;

    public n(av.g gVar, a22.i iVar, com.garmin.android.apps.connectmobile.badges.service.model.r rVar, int i14, int i15) {
        gVar.getClass();
        iVar.getClass();
        rVar.getClass();
        this.f172728b = gVar;
        this.f172729c = iVar;
        this.f172730d = rVar;
        this.f172731e = i15;
        this.f172732f = new h(i14, null, null);
    }

    @Override // yc.h3
    public final h c(i3<h, com.garmin.android.apps.connectmobile.badges.service.model.q> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009a A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:38:0x008f, B:40:0x009a, B:42:0x00bc, B:20:0x003e, B:30:0x0068, B:32:0x0070, B:34:0x0074, B:44:0x00c0, B:45:0x00c5, B:46:0x00c6, B:47:0x00ca, B:26:0x0051), top: B:50:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        l lVar;
        h hVar;
        int i14;
        h hVar2;
        List list;
        h hVar3;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i15 = lVar.f172721e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lVar.f172721e = i15 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objF = lVar.f172719c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = lVar.f172721e;
        int i17 = this.f172731e;
        try {
            if (i16 == 0) {
                o13.r.b(objF);
                h hVar4 = (h) aVar.a();
                if (hVar4 == null) {
                    hVar4 = this.f172732f;
                }
                int i18 = hVar4.f172708a;
                av.g gVar = this.f172728b;
                String str = this.f172730d.f30667a;
                lVar.f172717a = hVar4;
                lVar.f172718b = i18;
                lVar.f172721e = 1;
                Object objB = gVar.b(str, i18, i17, lVar);
                if (objB != aVar2) {
                    hVar = hVar4;
                    i14 = i18;
                    objF = objB;
                }
                return aVar2;
            }
            if (i16 == 1) {
                i14 = lVar.f172718b;
                hVar = lVar.f172717a;
                o13.r.b(objF);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = lVar.f172718b;
                hVar2 = lVar.f172717a;
                o13.r.b(objF);
            }
            list = (List) objF;
            if (list.size() >= i17) {
                Integer num = ((com.garmin.android.apps.connectmobile.badges.service.model.q) p13.h0.m0(list)).f30662h;
                Integer num2 = new Integer(((com.garmin.android.apps.connectmobile.badges.service.model.q) p13.h0.m0(list)).getUserPoint());
                hVar2.getClass();
                hVar3 = new h(i14 + i17, num, num2);
            } else {
                hVar3 = null;
            }
            return new h3.b.c(list, null, hVar3);
            Object obj = ((zy0.p) objF).f207459a;
            if (obj instanceof v2.a) {
                throw ((v2.a) obj).f47383a;
            }
            if (!(obj instanceof v2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T t7 = ((v2.b) obj).f47386a;
            t7.getClass();
            Integer num3 = hVar.f172709b;
            Integer num4 = hVar.f172710c;
            lVar.f172717a = hVar;
            lVar.f172718b = i14;
            lVar.f172721e = 2;
            objF = f(num3, num4, (List) t7, lVar);
            if (objF != aVar2) {
                hVar2 = hVar;
                list = (List) objF;
                if (list.size() >= i17) {
                    Integer num5 = ((com.garmin.android.apps.connectmobile.badges.service.model.q) p13.h0.m0(list)).f30662h;
                    Integer num6 = new Integer(((com.garmin.android.apps.connectmobile.badges.service.model.q) p13.h0.m0(list)).getUserPoint());
                    hVar2.getClass();
                    hVar3 = new h(i14 + i17, num5, num6);
                } else {
                    hVar3 = null;
                }
                return new h3.b.c(list, null, hVar3);
            }
            return aVar2;
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable f(Integer num, Integer num2, List list, v13.c cVar) {
        m mVar;
        Integer num3;
        Integer num4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        List list2 = list;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f172727f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f172727f = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objA = mVar.f172725d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f172727f;
        if (i15 == 0) {
            o13.r.b(objA);
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((com.garmin.android.apps.connectmobile.badges.service.model.q) it.next()).getUserProfileId()));
            }
            List<String> listB1 = p13.h0.b1(p13.h0.f1(arrayList));
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            mVar.f172722a = num;
            mVar.f172723b = num2;
            mVar.f172724c = list2;
            mVar.f172727f = 1;
            objA = this.f172729c.a(listB1, listC, mVar);
            if (objA == aVar) {
                return aVar;
            }
            num3 = num;
            num4 = num2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = mVar.f172724c;
            num4 = mVar.f172723b;
            num3 = mVar.f172722a;
            o13.r.b(objA);
        }
        Map map = (Map) objA;
        int iIntValue = num3 == null ? 1 : (num4 != null && num4.intValue() == ((com.garmin.android.apps.connectmobile.badges.service.model.q) p13.h0.b0(list2)).getUserPoint()) ? num3.intValue() : num3.intValue() + 1;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
        int i16 = iIntValue;
        int i17 = 0;
        for (Object obj : list2) {
            int i18 = i17 + 1;
            String str = null;
            if (i17 < 0) {
                p13.x.q();
                throw null;
            }
            com.garmin.android.apps.connectmobile.badges.service.model.q qVar = (com.garmin.android.apps.connectmobile.badges.service.model.q) obj;
            if (i17 < 1 || qVar.getUserPoint() != ((com.garmin.android.apps.connectmobile.badges.service.model.q) list2.get(i17 - 1)).getUserPoint()) {
                i16 = i17 + iIntValue;
            }
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(qVar.getUserProfileId());
            if (lVar != null && (profileImageUrls = lVar.getProfileImageUrls()) != null) {
                str = profileImageUrls.f46879h;
            }
            String str2 = str;
            Integer userLevel = qVar.getUserLevel();
            arrayList2.add(com.garmin.android.apps.connectmobile.badges.service.model.q.b(qVar, new b12.b(str2, null, f12.u.a(userLevel != null ? userLevel.intValue() : 0), null, null, 26, null), new Integer(i16), 63));
            i17 = i18;
        }
        return arrayList2;
    }
}
