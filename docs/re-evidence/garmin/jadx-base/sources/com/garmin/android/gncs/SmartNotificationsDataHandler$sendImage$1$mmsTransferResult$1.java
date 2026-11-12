package com.garmin.android.gncs;

import e23.l;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo13/q;", "", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SmartNotificationsDataHandler$sendImage$1$mmsTransferResult$1 extends w implements l<q<? extends Unit>, Unit> {
    final /* synthetic */ SmartNotificationsDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler$sendImage$1$mmsTransferResult$1(SmartNotificationsDataHandler smartNotificationsDataHandler) {
        super(1);
        this.this$0 = smartNotificationsDataHandler;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m56invoke(Object obj) {
        String strN;
        int i14 = q.f128596b;
        if (obj instanceof q.b) {
            Throwable thB = q.b(obj);
            strN = fb1.c.n("Failure: ", thB != null ? thB.getMessage() : null);
        } else {
            strN = "Success";
        }
        ih2.b.b(this.this$0.mmsLogTag + " sendImage -> MMS transfer result: " + strN);
    }

    @Override // e23.l
    public /* synthetic */ Unit invoke(q<? extends Unit> qVar) {
        m56invoke(qVar.f128597a);
        return Unit.INSTANCE;
    }
}
