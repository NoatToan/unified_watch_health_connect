package org.acra.util;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.acra.ACRA;
import org.acra.ErrorReporter;
import org.acra.util.StubCreator;

/* JADX INFO: loaded from: classes23.dex */
public final class StubCreator {
    private StubCreator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Object obj, Method method, Object[] objArr) throws Throwable {
        ACRA.log.w(ACRA.LOG_TAG, String.format("ErrorReporter#%s called %s. THIS CALL WILL BE IGNORED!", method.getName(), ACRA.isACRASenderServiceProcess() ? "in SenderService process" : "before ACRA#init (if you did call #init, check if your configuration is valid)"));
        return null;
    }

    @NonNull
    public static ErrorReporter createErrorReporterStub() {
        return (ErrorReporter) createStub(ErrorReporter.class, new InvocationHandler() { // from class: kh7
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return StubCreator.b(obj, method, objArr);
            }
        });
    }

    @NonNull
    public static <T> T createStub(Class<T> cls, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(StubCreator.class.getClassLoader(), new Class[]{cls}, invocationHandler);
    }
}
