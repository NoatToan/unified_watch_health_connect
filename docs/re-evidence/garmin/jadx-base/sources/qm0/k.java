package qm0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class k extends p005kotlin.jvm.internal.q implements e23.l<e0, Unit> {
    public k(Object obj) {
        super(1, obj, d.class, "onUnlikeActivityFeedEvent", "onUnlikeActivityFeedEvent(Lcom/garmin/android/apps/connectmobile/group/details/feed/UnlikeActivityFeedEvent;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        e0Var2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar = d.E;
        dVar.getClass();
        wg0.a aVar2 = e0Var2.f145510a;
        wg0.m mVar = aVar2.f185060t;
        if (mVar != null) {
            mVar.f185114g = false;
        }
        if (e0Var2.f145511b) {
            dVar.d7().H4(aVar2);
        } else {
            wg0.a aVarD = wg0.a.d(aVar2);
            wg0.m mVar2 = aVarD.f185060t;
            if (mVar2 != null) {
                mVar2.f();
            }
            dVar.d7().H4(aVarD);
        }
        return Unit.INSTANCE;
    }
}
