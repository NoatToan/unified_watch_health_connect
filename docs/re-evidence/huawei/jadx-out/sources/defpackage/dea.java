package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class dea extends CourseEnvParams {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HeartRateConfigHelper f31697b;
    private AtomicInteger f = new AtomicInteger(0);

    public void b() {
        this.f.set(0);
        this.f8803c = iem.a(BaseApplication.b(), iem.b());
        this.f.incrementAndGet();
        this.f31697b = new HeartRateConfigHelper(10001, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: ded
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                this.f31700b.d();
            }
        });
        ThreadPoolManager.c().execute(new Runnable() { // from class: dec
            @Override // java.lang.Runnable
            public final void run() {
                this.f31699b.e();
            }
        });
    }

    /* synthetic */ void d() {
        this.f.incrementAndGet();
        h();
    }

    /* synthetic */ void e() {
        this.i = haf.c();
        this.f.incrementAndGet();
        h();
    }

    public boolean c() {
        return this.f.get() >= 3;
    }

    private void h() {
        if (!c() || this.d == null) {
            return;
        }
        this.d.onInitComplete();
    }

    @Override // com.huawei.health.sport.model.CourseEnvParams
    public HeartZoneConf a() {
        return this.f31697b.c();
    }
}
