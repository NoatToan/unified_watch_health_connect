package u53;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f168773a = 0;

    static {
        Object bVar;
        Object bVar2;
        new a.a();
        Exception exc = new Exception();
        String simpleName = a.b.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            int i14 = o13.q.f128596b;
            bVar = v13.a.class.getCanonicalName();
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (o13.q.b(bVar) != null) {
            bVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            bVar2 = w.class.getCanonicalName();
        } catch (Throwable th4) {
            int i16 = o13.q.f128596b;
            bVar2 = new o13.q.b(th4);
        }
        if (o13.q.b(bVar2) != null) {
            bVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
