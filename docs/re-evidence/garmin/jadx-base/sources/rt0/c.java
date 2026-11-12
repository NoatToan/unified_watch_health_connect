package rt0;

import a22.i;
import am.z0;
import com.garmin.android.apps.connectmobile.leaderboard.model.d0;
import com.garmin.android.apps.connectmobile.leaderboard.model.f0;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import vb.h;
import yc.h3;
import yc.i3;
import yt0.t0;
import yt0.x0;
import yt0.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrt0/c;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/f0;", "Lyt0/t0;", "leaderboardRepo", "La22/i;", "userProfileRepo", "Lvt0/a;", "relationshipType", "Lvt0/b;", "leaderboardType", "Lorg/joda/time/DateTime;", "startDate", "endDate", "startIndex", "pageSize", "<init>", "(Lyt0/t0;La22/i;Lvt0/a;Lvt0/b;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;II)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h3<Integer, f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f154502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f154503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt0.a f154504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt0.b f154505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f154506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f154507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f154508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f154509i;

    public c(t0 t0Var, i iVar, vt0.a aVar, vt0.b bVar, DateTime dateTime, DateTime dateTime2, int i14, int i15) {
        t0Var.getClass();
        iVar.getClass();
        aVar.getClass();
        bVar.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f154502b = t0Var;
        this.f154503c = iVar;
        this.f154504d = aVar;
        this.f154505e = bVar;
        this.f154506f = dateTime;
        this.f154507g = dateTime2;
        this.f154508h = i14;
        this.f154509i = i15;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, f0> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r7 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        a aVar2;
        int iIntValue;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f154497d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f154497d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        Object objF = aVar2.f154495b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f154497d;
        try {
            if (i15 == 0) {
                r.b(objF);
                Integer num = (Integer) aVar.a();
                iIntValue = num != null ? num.intValue() : this.f154508h;
                aVar2.f154494a = iIntValue;
                aVar2.f154497d = 1;
                objF = f(iIntValue, aVar2);
                if (objF == aVar3) {
                }
                return aVar3;
            }
            if (i15 == 1) {
                iIntValue = aVar2.f154494a;
                r.b(objF);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = aVar2.f154494a;
                r.b(objF);
            }
            List list = (List) objF;
            int size = list.size();
            int i16 = this.f154509i;
            return new h3.b.c(list, null, size < i16 ? null : new Integer(iIntValue + i16));
            v2 v2Var = (v2) objF;
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var instanceof v2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T t7 = ((v2.b) v2Var).f47386a;
            t7.getClass();
            List<f0> listD = ((d0) t7).d();
            if (listD == null) {
                listD = j0.f134944a;
            }
            aVar2.f154494a = iIntValue;
            aVar2.f154497d = 2;
            objF = g(listD, aVar2);
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }

    public final Object f(int i14, a aVar) {
        String strB = c22.j0.b(this.f154506f, "yyyy-MM-dd", null);
        String str = strB == null ? "" : strB;
        String strB2 = c22.j0.b(this.f154507g, "yyyy-MM-dd", null);
        String str2 = strB2 == null ? "" : strB2;
        vt0.b bVar = vt0.b.STEPS;
        vt0.a aVar2 = this.f154504d;
        t0 t0Var = this.f154502b;
        vt0.b bVar2 = this.f154505e;
        if (bVar2 == bVar || bVar2 == vt0.b.PUSH) {
            String str3 = str;
            String str4 = aVar2.f180048a;
            int i15 = bVar2.f180060b;
            t0Var.getClass();
            return com.garmin.android.apps.connectmobile.f0.J(t0Var, new y0(t0Var, str4, i15, str3, str2, i14, this.f154509i, null), aVar);
        }
        String str5 = aVar2.f180048a;
        String str6 = str;
        int i16 = bVar2.f180060b;
        vt0.b.f180050d.getClass();
        int iN = z0.n(bVar2.f180061c);
        t0Var.getClass();
        return com.garmin.android.apps.connectmobile.f0.J(t0Var, new x0(t0Var, str5, null, i16, iN, str6, str2, i14, this.f154509i, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable g(List list, v13.c cVar) {
        b bVar;
        j profileImageUrls;
        List list2 = list;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f154501d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f154501d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f154499b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f154501d;
        if (i15 == 0) {
            r.b(objA);
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((f0) it.next()).getUserProfilePk()));
            }
            List<String> listB1 = h0.b1(h0.f1(arrayList));
            List<? extends k> listC = w.c(k.PREMIUM_FRIEND);
            bVar.f154498a = list2;
            bVar.f154501d = 1;
            objA = this.f154503c.a(listB1, listC, bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = bVar.f154498a;
            r.b(objA);
        }
        Map map = (Map) objA;
        ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            String displayName = null;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            f0 f0Var = (f0) obj;
            Long userProfilePk = f0Var.getUserProfilePk();
            l lVar = (l) map.get(userProfilePk != null ? new Integer((int) userProfilePk.longValue()) : null);
            b12.b bVar2 = new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46879h, null, null, null, null, 30, null);
            String fullName = lVar != null ? lVar.getFullName() : null;
            if (lVar != null) {
                displayName = lVar.getDisplayName();
            }
            arrayList2.add(f0.b(f0Var, bVar2, fullName, displayName));
            i16 = i17;
        }
        return arrayList2;
    }
}
