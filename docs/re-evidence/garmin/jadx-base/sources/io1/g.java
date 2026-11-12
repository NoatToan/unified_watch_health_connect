package io1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.actions.SearchIntents;
import f12.u;
import fo1.s;
import fo1.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p13.w;
import p13.y;
import vb.h;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio1/g;", "Lyc/h3;", "", "Lds1/a;", "Lfo1/f;", "conversationRepo", "", SearchIntents.EXTRA_QUERY, "startIndex", "pageSize", "<init>", "(Lfo1/f;Ljava/lang/String;II)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends h3<Integer, ds1.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo1.f f94607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94610e;

    public g(fo1.f fVar, String str, int i14, int i15) {
        fVar.getClass();
        this.f94607b = fVar;
        this.f94608c = str;
        this.f94609d = i14;
        this.f94610e = i15;
    }

    public static ArrayList f(List list) {
        String str;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jo1.g gVar = (jo1.g) it.next();
            j profileImageUrls = gVar.getProfileImageUrls();
            if (profileImageUrls == null || (str = profileImageUrls.f46879h) == null) {
                j profileImageUrls2 = gVar.getProfileImageUrls();
                str = profileImageUrls2 != null ? profileImageUrls2.f46873b : null;
            }
            arrayList.add(new ds1.a(gVar.getUserProfileId(), gVar.getDisplayName(), gVar.getFullName(), gVar.getLocation(), new b12.b(str, null, u.a(gVar.getUserLevel()), null, null, 26, null)));
        }
        return arrayList;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, ds1.a> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        f fVar;
        Object objJ;
        int i14;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f94606d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f94606d = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f94604b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f94606d;
        try {
            if (i16 == 0) {
                r.b(obj);
                Integer num = (Integer) aVar.a();
                int iIntValue = num != null ? num.intValue() : this.f94609d;
                String str = this.f94608c;
                int i17 = this.f94610e;
                fVar.f94603a = iIntValue;
                fVar.f94606d = 1;
                fo1.f fVar2 = this.f94607b;
                if (str == null || str.length() == 0) {
                    List listC = w.c(k.PREMIUM_FRIEND);
                    fVar2.getClass();
                    objJ = f0.J(fVar2, new t(fVar2, listC, null), fVar);
                } else {
                    List listC2 = w.c(k.PREMIUM_FRIEND);
                    fVar2.getClass();
                    objJ = f0.J(fVar2, new s(fVar2, str, iIntValue, i17, listC2, null), fVar);
                }
                obj = objJ;
                if (obj == aVar2) {
                    return aVar2;
                }
                i14 = iIntValue;
            } else {
                if (i16 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = fVar.f94603a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            if (!(v2Var instanceof v2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((v2.b) v2Var).f47386a;
            list.getClass();
            ArrayList arrayListF = f(list);
            int size = list.size();
            int i18 = this.f94610e;
            return new h3.b.c(arrayListF, null, size < i18 ? null : new Integer(i14 + i18));
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }
}
