package i10;

import androidx.recyclerview.widget.RecyclerView;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d extends q implements l<Integer, Unit> {
    public d(Object obj) {
        super(1, obj, c.class, "scrollToPosition", "scrollToPosition(I)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        c cVar = (c) this.receiver;
        RecyclerView recyclerView = cVar.f87013r;
        if (recyclerView != null) {
            recyclerView.post(new androidx.media3.exoplayer.d(cVar, iIntValue, 7));
        }
        return Unit.INSTANCE;
    }
}
