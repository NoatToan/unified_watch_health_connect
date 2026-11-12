package lq2;

import com.google.common.base.Optional;
import java.util.concurrent.Callable;
import rd2.j;
import wr2.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f114357b;

    public /* synthetic */ d(long j8, int i14) {
        this.f114356a = i14;
        this.f114357b = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f114356a;
        long j8 = this.f114357b;
        switch (i14) {
            case 0:
                int i15 = e.f114359e;
                rd2.f.a().f152045a.getClass();
                return Optional.fromNullable(j.i(j8, null));
            default:
                i iVar = i.f186861a;
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = j.i(j8, null);
                return fVarI == null ? new sd2.j() : fVarI;
        }
    }
}
