package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.perf.FirebasePerformance;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfq1/h;", "Lfq1/s;", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f73247b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f73248a;

    public h(f12.b bVar) {
        bVar.getClass();
        this.f73248a = bVar;
    }

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "FirebaseInitializer", "Executing Firebase initialization");
        f12.b bVar = this.f73248a;
        if (!bVar.p()) {
            f73247b.getClass();
            a.a(context, bVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, f12.b bVar) {
            context.getClass();
            FirebaseApp.initializeApp(context);
            FirebasePerformance.getInstance().setPerformanceCollectionEnabled(!bVar.f());
            f60.a.f69195a.getClass();
            FirebaseCrashlytics.getInstance().setCustomKey("flavor", "vanilla");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "FirebaseInitializer", "Firebase initialized");
        }

        private a() {
        }
    }
}
