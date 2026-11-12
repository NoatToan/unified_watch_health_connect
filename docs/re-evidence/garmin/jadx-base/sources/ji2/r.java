package ji2;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/r;", "Lc83/f;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements c83.f<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f98882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<o13.p<String, String>> f98883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o13.p<String, String> f98884c;

    public r(CountDownLatch countDownLatch, List<o13.p<String, String>> list, o13.p<String, String> pVar) {
        this.f98882a = countDownLatch;
        this.f98883b = list;
        this.f98884c = pVar;
    }

    @Override // c83.f
    public final void a(c83.d<Unit> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        j.f98861f.b("saveIntensityMinutesCalcMethod: failed.");
        this.f98882a.countDown();
    }

    @Override // c83.f
    public final void c(c83.d<Unit> dVar, c83.a0<Unit> a0Var) {
        dVar.getClass();
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        CountDownLatch countDownLatch = this.f98882a;
        if (!zIsSuccessful) {
            j.f98861f.b("saveIntensityMinutesCalcMethod: failed.");
            countDownLatch.countDown();
        } else {
            j.f98861f.getClass();
            this.f98883b.remove(this.f98884c);
            countDownLatch.countDown();
        }
    }
}
