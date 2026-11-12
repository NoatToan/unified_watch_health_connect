package n12;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class k extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public k(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.userprofile.editimage.c.class, "setPreviewOnlyView", "setPreviewOnlyView(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) this.receiver;
        cVar.getClass();
        x53.c cVar2 = o53.s0.f129406a;
        ge1.b.T(cVar, u53.o.f168762a, null, new a0(cVar, zBooleanValue, null), 2);
        v22.e.r(cVar.f46665h, zBooleanValue);
        return Unit.INSTANCE;
    }
}
