package cq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcq1/l;", "Lcq1/o;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/b;", "pregnancyRepo", "Lf12/l;", "userSettings", "<init>", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/b;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.pregnancytracking.network.b f55199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f55200b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.background.task.PregnancyStartupTask", f = "PregnancyStartupTask.kt", l = {16}, m = "execute", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f55201a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55203c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f55201a = obj;
            this.f55203c |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    static {
        new a(null);
    }

    public l(com.garmin.android.apps.connectmobile.pregnancytracking.network.b bVar, f12.l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f55199a = bVar;
        this.f55200b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f55203c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f55203c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objJ = bVar.f55201a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f55203c;
        if (i15 == 0) {
            r.b(objJ);
            bVar.f55203c = 1;
            com.garmin.android.apps.connectmobile.pregnancytracking.network.b bVar2 = this.f55199a;
            objJ = f0.J(bVar2, new com.garmin.android.apps.connectmobile.pregnancytracking.network.c(bVar2, null), bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            List<db1.m> list = (List) ((v2.b) v2Var).f47386a;
            i52.a aVar2 = i52.a.f91796a;
            boolean z14 = !list.isEmpty();
            aVar2.getClass();
            i52.a.s(z14);
            boolean z15 = false;
            for (db1.m mVar : list) {
                if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null) {
                    z15 = true;
                }
            }
            i52.a.f91796a.getClass();
            f12.l.f68084a.getClass();
            f12.l.a.a().e4(z15);
            this.f55200b.H0(true);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "PregnancyStartupTask", "Failed to get pregnancy records list");
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcq1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
