package hu1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wt1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhu1/i;", "Lhu1/c$a;", "Lxw1/d;", "athletePlan", "Lhu1/a;", "view", "<init>", "(Lxw1/d;Lhu1/a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw1.d f85731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hu1.a f85732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f85734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f85735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85736f;

    static {
        new a(null);
    }

    public i(xw1.d dVar, hu1.a aVar) {
        dVar.getClass();
        this.f85731a = dVar;
        this.f85732b = aVar;
        this.f85733c = new ArrayList();
        this.f85734d = new HashMap();
        this.f85735e = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
    }

    @Override // hu1.c.a
    public final void a(long j8, boolean z14, boolean z15) {
        hu1.a aVar = this.f85732b;
        if (aVar != null) {
            aVar.l2(j8, z14, z15);
        }
    }

    @Override // hu1.c.a
    public final void b(long j8, String str) {
        hu1.a aVar = this.f85732b;
        if (aVar != null) {
            aVar.I1(j8, str);
        }
    }

    public final void c(DateTime dateTime, DateTime dateTime2, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<fu1.u>> interfaceC0995b) {
        dateTime.getClass();
        dateTime2.getClass();
        interfaceC0995b.getClass();
        List<fu1.u> list = (List) this.f85734d.get(new b(dateTime, dateTime2));
        if (list != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "WorkoutSchedulePresenter", "return workout schedule from memory cache");
            interfaceC0995b.onResults(-1L, com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED, list);
            interfaceC0995b.onComplete(-1L, com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "WorkoutSchedulePresenter", "get workout schedule from service");
        this.f85733c.add(Long.valueOf(this.f85735e.q(this.f85731a.getAthletePlanId(), dateTime, dateTime2, interfaceC0995b)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
