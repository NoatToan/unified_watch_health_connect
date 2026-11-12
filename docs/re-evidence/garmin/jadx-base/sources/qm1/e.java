package qm1;

import java.util.List;
import km1.b0;
import km1.v;
import n70.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm1/e;", "Ln70/a0;", "Lqm1/m;", "Lj70/d;", "", "sleepCardData", "<init>", "(Lj70/d;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a0<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<String> f145609a;

    public e(j70.d<String> dVar) {
        dVar.getClass();
        this.f145609a = dVar;
    }

    @Override // n70.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m invoke() {
        Integer baseline;
        v dailySleep;
        List<km1.b> listT;
        v dailySleep2;
        j70.d<String> dVar = this.f145609a;
        yz1.d dVar2 = dVar.f97520a;
        km1.c cVar = (km1.c) a(dVar.f97521b, new d());
        km1.a0 nextSleepNeed = (!in1.a.b(cVar) || cVar == null || (dailySleep2 = cVar.getDailySleep()) == null) ? null : dailySleep2.getNextSleepNeed();
        return new m(dVar2, Integer.valueOf(((nextSleepNeed == null || (baseline = nextSleepNeed.getActual()) == null) && (nextSleepNeed == null || (baseline = nextSleepNeed.getBaseline()) == null)) ? -1 : baseline.intValue()), nextSleepNeed != null ? nextSleepNeed.getFeedback() : null, nextSleepNeed != null ? nextSleepNeed.getDisplayedForTheDay() : null, (cVar == null || (dailySleep = cVar.getDailySleep()) == null || (listT = dailySleep.t()) == null) ? null : Integer.valueOf(listT.size()), nextSleepNeed != null ? b0.b(nextSleepNeed) : null, nextSleepNeed != null ? b0.a(nextSleepNeed) : null);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetSleepCoachUseCase";
    }
}
