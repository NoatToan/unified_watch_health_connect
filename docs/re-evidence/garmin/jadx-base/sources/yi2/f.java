package yi2;

import o13.q;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo13/q;", "", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class f extends w implements e23.l<q<? extends Unit>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f197371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f197371a = bVar;
    }

    @Override // e23.l
    public final Unit invoke(q<? extends Unit> qVar) {
        String string;
        Object obj = qVar.f128597a;
        int i14 = q.f128596b;
        if (obj instanceof q.b) {
            StringBuilder sb3 = new StringBuilder("Failure: ");
            Throwable thB = q.b(obj);
            sb3.append(thB != null ? thB.getMessage() : null);
            string = sb3.toString();
        } else {
            string = "Success";
        }
        Logger logger = this.f197371a.f197361e;
        if (logger != null) {
            logger.debug("sendFile -> CalendarFile transfer result: ".concat(string));
            return Unit.INSTANCE;
        }
        s.m("logger");
        throw null;
    }
}
