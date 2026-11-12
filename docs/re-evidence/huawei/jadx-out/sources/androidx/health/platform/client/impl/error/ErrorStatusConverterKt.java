package androidx.health.platform.client.impl.error;

import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00060\u0004j\u0002`\b*\u00020\tH\u0000\"(\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"errorCodeExceptionMap", "", "", "Lkotlin/reflect/KClass;", "Ljava/lang/Exception;", "getErrorCodeExceptionMap", "()Ljava/util/Map;", "toException", "Lkotlin/Exception;", "Landroidx/health/platform/client/error/ErrorStatus;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorStatusConverterKt {
    private static final Map<Integer, KClass<? extends Exception>> errorCodeExceptionMap = zae.e(yyz.c(1, zcv.b(UnsupportedOperationException.class)), yyz.c(2, zcv.b(UnsupportedOperationException.class)), yyz.c(3, zcv.b(UnsupportedOperationException.class)), yyz.c(4, zcv.b(SecurityException.class)), yyz.c(10000, zcv.b(SecurityException.class)), yyz.c(10001, zcv.b(SecurityException.class)), yyz.c(10002, zcv.b(IllegalArgumentException.class)), yyz.c(10003, zcv.b(SecurityException.class)), yyz.c(10004, zcv.b(SecurityException.class)), yyz.c(10005, zcv.b(RemoteException.class)), yyz.c(10006, zcv.b(IOException.class)), yyz.c(10007, zcv.b(RemoteException.class)), yyz.c(10008, zcv.b(RemoteException.class)), yyz.c(10010, zcv.b(RemoteException.class)));

    public static final Map<Integer, KClass<? extends Exception>> getErrorCodeExceptionMap() {
        return errorCodeExceptionMap;
    }

    public static final Exception toException(ErrorStatus errorStatus) {
        zcp.c(errorStatus, "");
        KClass<? extends Exception> kClass = errorCodeExceptionMap.get(Integer.valueOf(errorStatus.getErrorCode()));
        if (kClass != null) {
            if (zcp.b(kClass, zcv.b(SecurityException.class))) {
                return new SecurityException(errorStatus.getErrorMessage());
            }
            if (zcp.b(kClass, zcv.b(RemoteException.class))) {
                return new RemoteException(errorStatus.getErrorMessage());
            }
            if (zcp.b(kClass, zcv.b(IllegalArgumentException.class))) {
                return new IllegalArgumentException(errorStatus.getErrorMessage());
            }
            return zcp.b(kClass, zcv.b(IOException.class)) ? new IOException(errorStatus.getErrorMessage()) : new UnsupportedOperationException(errorStatus.getErrorMessage());
        }
        return new UnsupportedOperationException(errorStatus.getErrorMessage());
    }
}
