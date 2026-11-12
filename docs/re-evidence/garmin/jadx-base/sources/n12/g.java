package n12;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public g(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.userprofile.editimage.c.class, "updateIsSubscriber", "updateIsSubscriber(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) this.receiver;
        cVar.getClass();
        ge1.b.T(cVar, null, null, new h0(cVar, zBooleanValue, null), 3);
        return Unit.INSTANCE;
    }
}
