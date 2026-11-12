package r92;

import ch.qos.logback.classic.Logger;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class e extends q implements l<String, Unit> {
    public e(Object obj) {
        super(1, obj, Logger.class, "debug", "debug(Ljava/lang/String;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        ((Logger) this.receiver).debug(str);
        return Unit.INSTANCE;
    }
}
