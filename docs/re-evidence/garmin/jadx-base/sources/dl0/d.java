package dl0;

import av.q;
import com.garmin.android.apps.connectmobile.badges.service.model.s;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldl0/d;", "Lyc/h3;", "", "Ldl0/a;", "Lav/g;", "badgesRepo", "", "userDisplayName", "badgeId", "", "includeAssocDataName", "<init>", "(Lav/g;Ljava/lang/String;IZ)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends h3<Integer, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.g f60277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f60280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTimeFormatter f60281f;

    public d(av.g gVar, String str, int i14, boolean z14) {
        gVar.getClass();
        str.getClass();
        this.f60277b = gVar;
        this.f60278c = str;
        this.f60279d = i14;
        this.f60280e = z14;
        this.f60281f = DateTimeFormat.forPattern("M/d/yyyy");
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, a> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        c cVar2;
        int i14;
        int i15;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f60276e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f60276e = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f60274c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f60276e;
        if (i17 == 0) {
            r.b(objJ);
            Integer num = (Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 1;
            int i18 = aVar.f196007a;
            cVar2.f60272a = iIntValue;
            cVar2.f60273b = i18;
            cVar2.f60276e = 1;
            av.g gVar = this.f60277b;
            gVar.getClass();
            objJ = f0.J(gVar, new q(gVar, this.f60278c, this.f60279d, this.f60280e, iIntValue, i18, null), cVar2);
            if (objJ == aVar2) {
                return aVar2;
            }
            i14 = iIntValue;
            i15 = i18;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = cVar2.f60273b;
            i14 = cVar2.f60272a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new h3.b.a(((v2.a) v2Var).f47383a);
            }
            u0.r();
            return null;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            a aVar3 = null;
            if (!it.hasNext()) {
                break;
            }
            s sVar = (s) it.next();
            String badgeAssocDataId = sVar.getBadgeAssocDataId();
            Long lJ = badgeAssocDataId != null ? t.j(badgeAssocDataId) : null;
            String badgeAssocDataName = sVar.getBadgeAssocDataName();
            DateTime badgeEarnedDate = sVar.getBadgeEarnedDate();
            if (lJ != null && badgeAssocDataName != null && badgeEarnedDate != null) {
                long jLongValue = lJ.longValue();
                String strPrint = this.f60281f.print(badgeEarnedDate);
                strPrint.getClass();
                aVar3 = new a(jLongValue, badgeAssocDataName, strPrint);
            }
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        return new h3.b.c(arrayList, null, list.size() < i15 ? null : new Integer(list.size() + i14));
    }
}
