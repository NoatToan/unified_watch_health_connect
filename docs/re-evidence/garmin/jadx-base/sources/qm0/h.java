package qm0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.l<a, Unit> {
    public h(Object obj) {
        super(1, obj, d.class, "updateActivityFeedImage", "updateActivityFeedImage(Lcom/garmin/android/apps/connectmobile/group/details/feed/ActivityImageChangedEvent;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar3 = d.E;
        dVar.getClass();
        long j8 = aVar2.f145470a;
        dVar.d7().I4(String.valueOf(j8), aVar2.f145471b, x.b.ACTIVITY_FEED);
        return Unit.INSTANCE;
    }
}
