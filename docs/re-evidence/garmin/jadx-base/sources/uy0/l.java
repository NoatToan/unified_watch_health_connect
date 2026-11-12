package uy0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luy0/l;", "", "Lzd0/j1;", "subscriptionProvider", "<init>", "(Lzd0/j1;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd0.j1 f173225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.b f173226b;

    static {
        new a(null);
    }

    public l(zd0.j1 j1Var) {
        j1Var.getClass();
        this.f173225a = j1Var;
        this.f173226b = ty0.b.F1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(v13.c cVar) {
        m mVar;
        List list;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f173234d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f173234d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f173232b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f173234d;
        if (i15 == 0) {
            o13.r.b(obj);
            List listK = p13.x.k(ty0.b.T2, ty0.b.f166880i3, ty0.b.f166883j3, ty0.b.f166888k3);
            mVar.f173231a = listK;
            mVar.f173234d = 1;
            Object objI = this.f173225a.i(mVar);
            if (objI == aVar) {
                return aVar;
            }
            list = listK;
            obj = objI;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = mVar.f173231a;
            o13.r.b(obj);
        }
        if (((c80.s) obj) instanceof c80.s.b) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GetConnectPlusItemsUseCase", "User is eligible for GC+, but don't show GC+ internal items.");
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173226b, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luy0/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
