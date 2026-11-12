package le0;

import androidx.room.a0;
import b71.i;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.util.List;
import l72.o2;
import lc.u0;
import me0.h;
import me0.w;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import wr.g;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lle0/b;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h3<Integer, ActivityListItemDTO> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f112039b = m.b(new o2(11));

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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        a aVar2;
        int iIntValue;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f112038d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f112038d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        Object objJ = aVar2.f112036b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f112038d;
        if (i15 == 0) {
            r.b(objJ);
            Integer num = (Integer) aVar.a();
            iIntValue = num != null ? num.intValue() : 0;
            w wVar = (w) this.f112039b.getValue();
            aVar2.f112035a = iIntValue;
            aVar2.f112038d = 1;
            wVar.getClass();
            objJ = f0.J(wVar, new h(wVar, iIntValue, 10, null), aVar2);
            if (objJ == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iIntValue = aVar2.f112035a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            List list = (List) ((v2.b) v2Var).f47386a;
            return new h3.b.c(list, null, (list.isEmpty() || list.size() < 10) ? null : new Integer(iIntValue + 10));
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar4 = (v2.a) v2Var;
        Throwable iOException = aVar4.f47383a;
        Throwable th3 = iOException instanceof IOException ? null : iOException;
        if (th3 != null) {
            iOException = new IOException(a0.g(aVar4.f47384b, "API error: "), th3);
        }
        return new h3.b.a(iOException);
    }
}
