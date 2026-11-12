package n12;

import android.view.View;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public j(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.userprofile.editimage.c.class, "setTipBubbleVisible", "setTipBubbleVisible(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) this.receiver;
        v22.e.r(cVar.f46663f, zBooleanValue);
        View view2 = cVar.f46664g;
        v22.e.r(view2, zBooleanValue);
        if (zBooleanValue) {
            view2.setOnClickListener(new mt0.h0(cVar, 8));
        }
        return Unit.INSTANCE;
    }
}
