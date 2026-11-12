package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: zis, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class yield {
    public static final Object d(Continuation<? super yzc> continuation) {
        Object objA;
        CoroutineContext f54257c = continuation.getF54257c();
        zhs.e(f54257c);
        Continuation continuationC = zbg.c(continuation);
        zlh zlhVar = continuationC instanceof zlh ? (zlh) continuationC : null;
        if (zlhVar == null) {
            objA = yzc.e;
        } else {
            if (zlhVar.f54261a.isDispatchNeeded(f54257c)) {
                zlhVar.b(f54257c, yzc.e);
            } else {
                zin zinVar = new zin();
                zlhVar.b(f54257c.plus(zinVar), yzc.e);
                objA = (!zinVar.f54138a || REUSABLE_CLAIMED.a(zlhVar)) ? zbg.a() : yzc.e;
            }
            objA = zbg.a();
        }
        if (objA == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objA == zbg.a() ? objA : yzc.e;
    }
}
