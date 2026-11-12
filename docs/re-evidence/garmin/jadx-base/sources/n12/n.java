package n12;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class n extends p005kotlin.jvm.internal.q implements e23.l<com.garmin.android.apps.connectmobile.userprofile.model.e, Unit> {
    public n(Object obj) {
        super(1, obj, n0.class, "updateSelection", "updateSelection(Lcom/garmin/android/apps/connectmobile/userprofile/model/FrameDTO;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Unit invoke(com.garmin.android.apps.connectmobile.userprofile.model.e eVar) {
        Object next;
        n0.e eVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.e eVar3 = eVar;
        n0 n0Var = (n0) this.receiver;
        int i14 = -1;
        if (eVar3 != null) {
            int i15 = 0;
            for (n0.e eVar4 : n0Var.f122269b) {
                if ((eVar4 instanceof n0.e.b) && ((n0.e.b) eVar4).f122281a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == eVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) {
                    i14 = i15;
                    break;
                }
                i15++;
            }
            int i16 = n0Var.f122271d;
            n0Var.f122271d = i14;
            n0Var.notifyItemChanged(i14);
            n0Var.notifyItemChanged(i16);
        } else {
            ArrayList arrayList = n0Var.f122269b;
            arrayList.getClass();
            Iterator it = p13.h0.j1(arrayList).iterator();
            do {
                p13.o0 o0Var = (p13.o0) it;
                if (!o0Var.f134956a.hasNext()) {
                    next = null;
                    break;
                }
                next = o0Var.next();
                eVar2 = (n0.e) ((p13.m0) next).f134952b;
                eVar2.getClass();
            } while (!(eVar2 instanceof n0.e.a));
            p13.m0 m0Var = (p13.m0) next;
            i14 = m0Var != null ? m0Var.f134951a : -1;
            int i17 = n0Var.f122271d;
            n0Var.f122271d = i14;
            n0Var.notifyItemChanged(i14);
            n0Var.notifyItemChanged(i17);
        }
        return Unit.INSTANCE;
    }
}
