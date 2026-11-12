package go1;

import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78242b;

    public /* synthetic */ h(k kVar, int i14) {
        this.f78241a = i14;
        this.f78242b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14;
        int i15 = this.f78241a;
        k kVar = this.f78242b;
        switch (i15) {
            case 0:
                if (kVar.f78262l) {
                    kVar.E6();
                }
                break;
            case 1:
                int i16 = k.C;
                kVar.E6();
                break;
            default:
                int i17 = k.C;
                String str = kVar.C6().f72658e;
                if (str == null || str.length() == 0) {
                    i14 = -1;
                } else {
                    Iterator it = kVar.y6().f78226h.iterator();
                    i14 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            ConversationCommentDTO conversationCommentDTO = ((w) it.next()).f78313c;
                            if (!d53.u.q(conversationCommentDTO != null ? conversationCommentDTO.f44546a : null, str, true)) {
                                i14++;
                            }
                        } else {
                            i14 = -1;
                        }
                    }
                }
                if (kVar.f78264n && i14 != -1) {
                    RecyclerView recyclerViewA6 = kVar.A6();
                    if (!recyclerViewA6.isLaidOut() || recyclerViewA6.isLayoutRequested()) {
                        recyclerViewA6.addOnLayoutChangeListener(new l(kVar, i14));
                    } else {
                        kVar.z6().scrollToPositionWithOffset(i14, recyclerViewA6.getHeight() / 2);
                    }
                } else if (kVar.f78262l) {
                    kVar.E6();
                }
                kVar.f78264n = false;
                break;
        }
    }
}
