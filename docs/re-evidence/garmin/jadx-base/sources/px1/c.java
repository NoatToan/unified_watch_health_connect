package px1;

import androidx.lifecycle.v1;
import ey1.j;
import ey1.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c extends q implements e23.q<Boolean, Long, String, Unit> {
    public c(Object obj) {
        super(3, obj, j.class, "handleUnlinkEvent", "handleUnlinkEvent(ZLjava/lang/Long;Ljava/lang/String;)V", 0);
    }

    @Override // e23.q
    public final Unit invoke(Boolean bool, Long l14, String str) {
        j jVar = (j) this.receiver;
        jVar.getClass();
        ge1.b.T(v1.a(jVar), null, null, new s(jVar, bool.booleanValue(), l14, str, null), 3);
        return Unit.INSTANCE;
    }
}
