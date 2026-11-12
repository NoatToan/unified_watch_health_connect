package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import o53.z;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfq1/l;", "Lfq1/s;", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f73266b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f73267a;

    public /* synthetic */ l(f12.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null) : bVar);
    }

    @Override // fq1.s
    public final z a() {
        x53.c cVar = s0.f129406a;
        return u53.o.f168762a;
    }

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        kj0.c.a aVar = kj0.c.a.ON_CREATE_MAIN_APP;
        f73266b.getClass();
        a.a(this.f73267a, aVar);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(f12.b bVar, kj0.c.a aVar) {
            bVar.getClass();
            aVar.getClass();
            if (!bVar.c()) {
                String strG = tn.k.g(aVar.name(), ": initGarminPay -> dynamic feature installed, but no user signed in, initialization will not occur");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "GarminPayInitializer", strG);
                return;
            }
            String strG2 = tn.k.g(aVar.name(), ": initGarminPay -> dynamic feature is installed, user signed in");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "GarminPayInitializer", strG2);
            kj0.c cVar = kj0.c.f104941a;
            GarminConnectMobileApp.f28685g.getClass();
            Context contextA = GarminConnectMobileApp.a.a();
            cVar.getClass();
            kj0.c.c(contextA, false, aVar);
        }

        private a() {
        }
    }

    public l(f12.b bVar) {
        bVar.getClass();
        this.f73267a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
