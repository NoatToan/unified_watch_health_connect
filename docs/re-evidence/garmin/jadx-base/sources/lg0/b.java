package lg0;

import fg0.l;
import o70.j;
import p005kotlin.Metadata;
import r70.s;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llg0/b;", "Lr70/s;", "Lyz1/d;", "status", "Lfg0/l;", "eventDataItem", "Llg0/c;", "trainingPlanDashboardEventData", "<init>", "(Lyz1/d;Lfg0/l;Llg0/c;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f112162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f112163c;

    public b(d dVar, l lVar, c cVar) {
        dVar.getClass();
        lVar.getClass();
        this.f112161a = dVar;
        this.f112162b = lVar;
        this.f112163c = cVar;
    }

    @Override // r70.s
    public final String a() {
        return fb1.c.n("EventType_", j.RACE.f130022a);
    }

    public /* synthetic */ b(d dVar, l lVar, c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, lVar, (i14 & 4) != 0 ? null : cVar);
    }
}
