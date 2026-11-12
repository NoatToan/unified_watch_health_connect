package le0;

import androidx.room.a0;
import b71.i;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.o2;
import lc.u0;
import me0.n;
import me0.w;
import o13.m;
import o13.r;
import o13.t;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.y;
import q6.f;
import vb.h;
import wr.g;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lle0/e;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "", "dogProfileId", "", "activityTypeFilter", "<init>", "(JLjava/lang/String;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h3<Integer, ActivityListItemDTO> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f112051d;

    public e(long j8, String str) {
        this.f112049b = j8;
        this.f112050c = str;
        this.f112051d = m.b(new o2(12));
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, ActivityListItemDTO> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        h3.b.c<Integer, ActivityListItemDTO> cVarA = i3Var.a(num3.intValue());
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return g.m(10, num2);
        }
        if (cVarA == null || (num = cVarA.f196018c) == null) {
            return null;
        }
        return i.e(10, num);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        d dVar;
        int iIntValue;
        List list;
        int i14;
        Integer num;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f112048e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f112048e = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f112046c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f112048e;
        if (i16 == 0) {
            r.b(objJ);
            Integer num2 = (Integer) aVar.a();
            iIntValue = num2 != null ? num2.intValue() : 0;
            w wVar = (w) this.f112051d.getValue();
            dVar.f112045b = iIntValue;
            dVar.f112048e = 1;
            wVar.getClass();
            objJ = f0.J(wVar, new n(wVar, this.f112049b, this.f112050c, iIntValue, 10, null), dVar);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i16 == 1) {
            int i17 = dVar.f112045b;
            r.b(objJ);
            iIntValue = i17;
        } else {
            if (i16 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = dVar.f112045b;
            list = dVar.f112044a;
            r.b(objJ);
        }
        if (!list.isEmpty() || list.size() < 10) {
            num = null;
        } else {
            num = new Integer(i14 + 10);
        }
        return new h3.b.c(list, null, num);
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            Throwable iOException = aVar2.f47383a;
            Throwable th3 = iOException instanceof IOException ? null : iOException;
            if (th3 != null) {
                iOException = new IOException(a0.g(aVar2.f47384b, "API error: "), th3);
            }
            return new h3.b.a(iOException);
        }
        List list2 = (List) ((v2.b) v2Var).f47386a;
        dVar.f112044a = list2;
        dVar.f112045b = iIntValue;
        dVar.f112048e = 2;
        if (f(list2, dVar) != obj) {
            list = list2;
            i14 = iIntValue;
            if (list.isEmpty()) {
                num = null;
            } else {
                num = null;
            }
            return new h3.b.c(list, null, num);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f112043d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f112043d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE = cVar2.f112041b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f112043d;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(objE);
            for (Object obj : list) {
                if (((ActivityListItemDTO) obj).f29298w) {
                    arrayListX.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(y.r(arrayListX, 10));
            Iterator it = arrayListX.iterator();
            while (it.hasNext()) {
                f.s(((ActivityListItemDTO) it.next()).f29250b, arrayList);
            }
            if (arrayList.isEmpty()) {
                return Unit.INSTANCE;
            }
            w wVar = (w) this.f112051d.getValue();
            cVar2.f112040a = list;
            cVar2.f112043d = 1;
            wVar.getClass();
            objE = c0.e(new me0.e(arrayList, wVar, null), cVar2);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = cVar2.f112040a;
            r.b(objE);
        }
        Map map = (Map) objE;
        for (ActivityListItemDTO activityListItemDTO : list) {
            ps.m mVar = (ps.m) map.get(new Long(activityListItemDTO.f29250b));
            if (mVar != null) {
                activityListItemDTO.f29300x = mVar;
            }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(long j8, String str, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str);
    }
}
