package qm1;

import java.util.List;
import km1.v;
import n70.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqm1/b;", "Ln70/a0;", "", "Lkm1/b;", "Lj70/d;", "", "sleepData", "<init>", "(Lj70/d;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<List<? extends km1.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<String> f145608a;

    public b(j70.d<String> dVar) {
        dVar.getClass();
        this.f145608a = dVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetNapDataUseCase";
    }

    @Override // n70.a0
    public final List<? extends km1.b> invoke() {
        v dailySleep;
        km1.c cVar = (km1.c) a(this.f145608a.f97521b, new a());
        if (cVar == null || (dailySleep = cVar.getDailySleep()) == null) {
            return null;
        }
        return dailySleep.t();
    }
}
