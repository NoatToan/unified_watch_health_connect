package yi2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "progress", "", "total", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class e extends w implements e23.p<Integer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f197370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar) {
        super(2);
        this.f197370a = bVar;
    }

    @Override // e23.p
    public final Unit invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Logger logger = this.f197370a.f197361e;
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.debug("sendFile -> progress: " + iIntValue + " of " + iIntValue2);
        return Unit.INSTANCE;
    }
}
