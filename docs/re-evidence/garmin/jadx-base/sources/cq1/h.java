package cq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0;
import com.garmin.android.apps.connectmobile.graphql.ApolloClearCacheWorker;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcq1/h;", "Lcq1/o;", "Landroid/content/Context;", "appContext", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;", "dashboardConfigDataSource", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f55192b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.background.task.DashboardConfigStartupTask", f = "DashboardConfigStartupTask.kt", l = {15}, m = "execute", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f55193a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55195c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f55193a = obj;
            this.f55195c |= Integer.MIN_VALUE;
            return h.this.a(this);
        }
    }

    static {
        new a(null);
    }

    public h(Context context, l0 l0Var) {
        context.getClass();
        l0Var.getClass();
        this.f55191a = context;
        this.f55192b = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f55195c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f55195c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f55193a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f55195c;
        if (i15 == 0) {
            r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "DashboardConfigStartupTask", "Fetching dashboard config");
            bVar.f55195c = 1;
            if (this.f55192b.y(bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "DashboardConfigStartupTask", "Enqueue ApolloClearCacheWorker");
        ApolloClearCacheWorker.f36130g.getClass();
        ApolloClearCacheWorker.a.a(this.f55191a);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcq1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
