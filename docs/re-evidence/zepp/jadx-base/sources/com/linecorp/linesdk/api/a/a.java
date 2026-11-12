package com.linecorp.linesdk.api.a;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.api.LineApiClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class a {

    /* JADX INFO: renamed from: com.linecorp.linesdk.api.a.a$a, reason: collision with other inner class name */
    public static class C0729a implements InvocationHandler {

        @NonNull
        private final LineApiClient a;

        @NonNull
        private final Map<Method, Boolean> b;

        public /* synthetic */ C0729a(LineApiClient lineApiClient, byte b) {
            this(lineApiClient);
        }

        private boolean a(@NonNull Method method) {
            Boolean bool = this.b.get(method);
            if (bool != null) {
                return bool.booleanValue();
            }
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> superclass = this.a.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    if (((c) superclass.getDeclaredMethod(name, parameterTypes).getAnnotation(c.class)) != null) {
                        this.b.put(method, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (NoSuchMethodException unused) {
                }
            }
            this.b.put(method, Boolean.FALSE);
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object objInvoke = method.invoke(this.a, objArr);
                if (a(method)) {
                    if ((objInvoke instanceof LineApiResponse) && ((LineApiResponse) objInvoke).getErrorData().getHttpResponseCode() == 403) {
                        LineApiResponse<LineAccessToken> lineApiResponseRefreshAccessToken = this.a.refreshAccessToken();
                        if (!lineApiResponseRefreshAccessToken.isSuccess()) {
                            return lineApiResponseRefreshAccessToken.isNetworkError() ? lineApiResponseRefreshAccessToken : objInvoke;
                        }
                        try {
                            return method.invoke(this.a, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                }
                return objInvoke;
            } catch (InvocationTargetException e2) {
                throw e2.getTargetException();
            }
        }

        private C0729a(@NonNull LineApiClient lineApiClient) {
            this.a = lineApiClient;
            this.b = new ConcurrentHashMap(0);
        }
    }
}
