package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: zgz, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class classSimpleName {
    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String a(Continuation<?> continuation) {
        Object objE;
        if (continuation instanceof zlh) {
            return continuation.toString();
        }
        try {
            yyt.c cVar = yyt.f53903b;
            objE = yyt.e(continuation + '@' + d(continuation));
        } catch (Throwable th) {
            yyt.c cVar2 = yyt.f53903b;
            objE = yyt.e(createFailure.a(th));
        }
        if (yyt.a(objE) != null) {
            objE = continuation.getClass().getName() + '@' + d(continuation);
        }
        return (String) objE;
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
