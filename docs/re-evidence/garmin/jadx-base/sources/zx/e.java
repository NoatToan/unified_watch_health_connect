package zx;

import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzx/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lyx/b;", "calendarApiService", "<init>", "(Lyx/b;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yx.b f207315a;

    public /* synthetic */ e(yx.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (yx.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yx.b.class, new c83.h.a[0], null, null, null, 120) : bVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(DateTime dateTime, boolean z14, v13.c cVar) {
        b bVar;
        Object objJ;
        List list;
        v2 v2Var;
        ArrayList arrayList;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f207308f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f207308f = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objV = bVar.f207306d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f207308f;
        if (i15 != 0) {
            if (i15 == 1) {
                z14 = bVar.f207305c;
                dateTime = bVar.f207303a;
                r.b(objV);
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        r.b(objV);
                        return objV;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = bVar.f207304b;
                r.b(objV);
            }
            v2Var = (v2) objV;
            if ((v2Var instanceof v2.b) && list != null && !list.isEmpty() && (arrayList = ((CalendarDTO) ((v2.b) v2Var).f47386a).f30966f) != null) {
                arrayList.addAll(list);
            }
            return v2Var;
        }
        r.b(objV);
        if (z14) {
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.W()) {
                vx.f fVar = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);
                bVar.f207303a = dateTime;
                bVar.f207305c = z14;
                bVar.f207308f = 1;
                objV = fVar.v(dateTime, bVar);
                if (objV != aVar) {
                }
            } else {
                c cVar2 = new c(this, dateTime, null);
                bVar.f207303a = null;
                bVar.f207305c = z14;
                bVar.f207308f = 3;
                objJ = f0.J(this, cVar2, bVar);
                if (objJ == aVar) {
                    return objJ;
                }
            }
        } else {
            c cVar3 = new c(this, dateTime, null);
            bVar.f207303a = null;
            bVar.f207305c = z14;
            bVar.f207308f = 3;
            objJ = f0.J(this, cVar3, bVar);
            if (objJ == aVar) {
                return objJ;
            }
        }
        return aVar;
        List list2 = (List) objV;
        d dVar = new d(this, dateTime, null);
        bVar.f207303a = null;
        bVar.f207304b = list2;
        bVar.f207305c = z14;
        bVar.f207308f = 2;
        Object objJ2 = f0.J(this, dVar, bVar);
        if (objJ2 != aVar) {
            objV = objJ2;
            list = list2;
            v2Var = (v2) objV;
            if (v2Var instanceof v2.b) {
                arrayList.addAll(list);
            }
            return v2Var;
        }
        return aVar;
    }

    public e(yx.b bVar) {
        bVar.getClass();
        this.f207315a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
