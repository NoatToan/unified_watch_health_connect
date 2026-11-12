package qm0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.l<b0, Unit> {
    public j(Object obj) {
        super(1, obj, d.class, "onLikeActivityFeedEvent", "onLikeActivityFeedEvent(Lcom/garmin/android/apps/connectmobile/group/details/feed/LikeActivityFeedEvent;)V", 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // e23.l
    public final Unit invoke(b0 b0Var) {
        b0 b0Var2 = b0Var;
        b0Var2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar = d.E;
        dVar.getClass();
        wg0.a aVar2 = b0Var2.f145483a;
        mo1.f fVar = b0Var2.f145484b;
        wg0.m mVar = aVar2.f185060t;
        if (mVar != null) {
            mVar.f185114g = false;
        }
        if (fVar != null) {
            if ((mVar != null ? mVar.f185111d : null) != null) {
                if ((mVar != null ? mVar.f185110c : null) == null) {
                    if (mVar != null) {
                        mVar.f185111d = fVar.getUuid();
                        mVar.f185110c = Long.valueOf(fVar.getConversationLikePk());
                    }
                }
            } else if (mVar != null) {
                mVar.f185111d = fVar.getUuid();
                mVar.f185110c = Long.valueOf(fVar.getConversationLikePk());
            }
            dVar.d7().H4(aVar2);
        } else {
            wg0.a aVarD = wg0.a.d(aVar2);
            wg0.m mVar2 = aVarD.f185060t;
            if (mVar2 != null) {
                mVar2.g();
            }
            dVar.d7().H4(aVarD);
        }
        return Unit.INSTANCE;
    }
}
