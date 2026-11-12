package ps2;

import ch.qos.logback.classic.Logger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ms2.d f140467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f140468d;

    public /* synthetic */ b(n nVar, ms2.d dVar, CountDownLatch countDownLatch, int i14) {
        this.f140465a = i14;
        this.f140466b = nVar;
        this.f140467c = dVar;
        this.f140468d = countDownLatch;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f140465a) {
            case 0:
                this.f140466b.f140504g.debug("Finished " + this.f140467c.a() + " provider init");
                this.f140468d.countDown();
                break;
            case 1:
                boolean zBooleanValue = bool.booleanValue();
                Logger logger = this.f140466b.f140504g;
                ms2.d dVar = this.f140467c;
                if (zBooleanValue) {
                    logger.debug("Finished " + dVar.a() + " provider connecting successfully");
                } else {
                    logger.error("Finished " + dVar.a() + " provider connecting unsuccessfully");
                }
                this.f140468d.countDown();
                break;
            case 2:
                this.f140466b.f140504g.debug("Finished initializing newly supported provider " + this.f140467c.a());
                this.f140468d.countDown();
                break;
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                Logger logger2 = this.f140466b.f140504g;
                ms2.d dVar2 = this.f140467c;
                if (zBooleanValue2) {
                    logger2.debug("Finished " + dVar2.a() + " provider disconnection successfully");
                } else {
                    logger2.error("Finished " + dVar2.a() + " provider disconnection unsuccessfully");
                }
                this.f140468d.countDown();
                break;
        }
    }
}
