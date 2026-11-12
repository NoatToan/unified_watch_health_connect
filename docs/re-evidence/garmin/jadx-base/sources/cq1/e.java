package cq1;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s0;
import jw.c0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcq1/e;", "Lcq1/o;", "Llw/b;", "bloodPressureRepository", "Lcom/garmin/android/apps/connectmobile/s0;", "databaseDelegate", "<init>", "(Llw/b;Lcom/garmin/android/apps/connectmobile/s0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.b f55188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f55189b;

    static {
        new a(null);
    }

    public e(lw.b bVar, s0 s0Var) {
        bVar.getClass();
        s0Var.getClass();
        this.f55188a = bVar;
        this.f55189b = s0Var;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object bVar;
        String str;
        c83.d<String> dVarA = this.f55188a.a();
        long millis = DateTime.now().plusDays(1).withTime(12, 0, 0, 0).getMillis() - DateTimeUtils.currentTimeMillis();
        String url = dVarA.request().url().getUrl();
        c0 c0VarA = this.f55189b.a(millis, 2592000000L);
        c0VarA.e(url);
        if (c0VarA.a() != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "BloodPressureConfigStartupTask", "BloodPressureConfigStartupTask cache hit");
            return Unit.INSTANCE;
        }
        try {
            int i14 = o13.q.f128596b;
            a0<String> a0VarExecute = dVarA.execute();
            bVar = null;
            if (!a0VarExecute.f25745a.isSuccessful()) {
                a0VarExecute = null;
            }
            if (a0VarExecute != null && (str = a0VarExecute.f25746b) != null) {
                c0VarA.d(url, str);
                bVar = Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            String strP = am.j.p("Failed to execute BloodPressureConfigStartupTask ", thB);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "BloodPressureConfigStartupTask", strP);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcq1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
