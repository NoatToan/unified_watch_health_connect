package bz0;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e extends q implements e23.l<String, Unit> {
    public e(Object obj) {
        super(1, obj, Logger.class, "debug", "debug(Ljava/lang/String;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        ((Logger) this.receiver).debug(str);
        return Unit.INSTANCE;
    }
}
