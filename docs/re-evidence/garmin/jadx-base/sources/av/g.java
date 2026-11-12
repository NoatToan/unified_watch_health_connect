package av;

import c22.b3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lav/g;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lav/f;", "badgesApiService", "Lru/a;", "badgesDao", "Lru/e;", "badgesPreferences", "Lzy0/b;", "cachedDataSource", "<init>", "(Lav/f;Lru/a;Lru/e;Lzy0/b;)V", "a", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13083e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru.a f13085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru.e f13086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zy0.b f13087d;

    static {
        new a(null);
    }

    public g(f fVar, ru.a aVar, ru.e eVar, zy0.b bVar) {
        fVar.getClass();
        aVar.getClass();
        eVar.getClass();
        bVar.getClass();
        this.f13084a = fVar;
        this.f13085b = aVar;
        this.f13086c = eVar;
        this.f13087d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        m mVar;
        long jA;
        int i14;
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.u> arrayList;
        v2 v2Var;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        String str;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i15 = mVar.f13110f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                mVar.f13110f = i15 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objJ = mVar.f13108d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = mVar.f13110f;
        ru.a aVar2 = this.f13085b;
        if (i16 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.badges.service.model.u uVarB = aVar2.b();
            if (uVarB != null) {
                return uVarB;
            }
            ru.e eVar = this.f13086c;
            jA = eVar.a();
            if (jA != 0) {
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                if (Math.abs(Hours.hoursBetween(dateTimeNow, new DateTime(jA)).getHours()) >= 6) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            } else {
                i14 = 1;
            }
            if (i14 == 0) {
                return null;
            }
            eVar.b(System.currentTimeMillis());
            n nVar = new n(this, null);
            mVar.f13106b = jA;
            mVar.f13107c = i14;
            mVar.f13110f = 1;
            objJ = f0.J(this, nVar, mVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            i14 = mVar.f13107c;
            jA = mVar.f13106b;
            o13.r.b(objJ);
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = mVar.f13105a;
            o13.r.b(objJ);
        }
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            for (com.garmin.android.apps.connectmobile.badges.service.model.u uVar : arrayList) {
                gVarB = ((com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a).b(uVar.getBadgeKey());
                if (gVarB != null || (str = gVarB.f30568a) == null) {
                    i2.f36769a.getClass();
                    i2.a.f(a2.BADGES, "BadgesRepo", "fetchNewBadgeRewardsUnredeemedCode() -> No Valid translation for " + uVar);
                } else {
                    aVar2.d(com.garmin.android.apps.connectmobile.badges.service.model.u.a(uVar, str));
                }
            }
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.BADGES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BadgesRepo", "fetchNewBadgeRewardsUnredeemedCode() -> Badge translation fetch FAILED");
        }
        return aVar2.b();
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        List<com.garmin.android.apps.connectmobile.badges.service.model.u> listC = aVar2.c();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listC) {
            com.garmin.android.apps.connectmobile.badges.service.model.u uVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.u) obj;
            Iterable iterable = (Iterable) ((v2.b) v2Var2).f47386a;
            ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.garmin.android.apps.connectmobile.badges.service.model.u) it.next()).getBadgeChallengeUUID());
            }
            if (!arrayList3.contains(uVar2.getBadgeChallengeUUID())) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            aVar2.a(arrayList2);
        }
        List<com.garmin.android.apps.connectmobile.badges.service.model.u> listC2 = aVar2.c();
        ArrayList arrayList4 = new ArrayList(p13.y.r(listC2, 10));
        Iterator<T> it3 = listC2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((com.garmin.android.apps.connectmobile.badges.service.model.u) it3.next()).getBadgeChallengeUUID());
        }
        Iterable iterable2 = (Iterable) ((v2.b) v2Var2).f47386a;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : iterable2) {
            if (!arrayList4.contains(((com.garmin.android.apps.connectmobile.badges.service.model.u) obj2).getBadgeChallengeUUID())) {
                arrayList5.add(obj2);
            }
        }
        if (!arrayList5.isEmpty()) {
            String strA = b3.a();
            mVar.f13105a = arrayList5;
            mVar.f13106b = jA;
            mVar.f13107c = i14;
            mVar.f13110f = 2;
            objJ = ((xu.c) KoinJavaComponent.get$default(xu.c.class, null, null, 6, null)).a(strA, "", mVar);
            if (objJ != aVar) {
                arrayList = arrayList5;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    while (r2.hasNext()) {
                        gVarB = ((com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a).b(uVar.getBadgeKey());
                        if (gVarB != null) {
                        }
                        i2.f36769a.getClass();
                        i2.a.f(a2.BADGES, "BadgesRepo", "fetchNewBadgeRewardsUnredeemedCode() -> No Valid translation for " + uVar);
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var2 = a2.BADGES;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "BadgesRepo", "fetchNewBadgeRewardsUnredeemedCode() -> Badge translation fetch FAILED");
                }
            }
            return aVar;
        }
        return aVar2.b();
    }

    public final Object b(String str, int i14, int i15, uu.l lVar) {
        return zy0.b.b(this.f13087d, new t(this, str, i14, i15, null), new u(), false, String.format(zy0.a.GET_BADGES_LEADERBOARD_BY_SCOPE.f207440a, Arrays.copyOf(new Object[]{str, new Integer(i14), new Integer(i15)}, 3)), null, lVar, 52);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lav/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SHARE_ACTIVITY_BADGE_ID", "I", "HOURS_BETWEEN_BADGE_REWARDS_CALLS", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
