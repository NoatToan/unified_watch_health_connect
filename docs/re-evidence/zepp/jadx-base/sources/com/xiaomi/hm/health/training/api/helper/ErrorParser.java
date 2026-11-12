package com.xiaomi.hm.health.training.api.helper;

import com.xiaomi.hm.health.training.api.entity.ErrorCode;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.exception.AccountException;
import com.xiaomi.hm.health.training.api.exception.HttpException;
import com.xiaomi.hm.health.training.api.exception.JsonParseFailException;
import com.xiaomi.hm.health.training.api.exception.NetworkNotConnectedException;
import com.xiaomi.hm.health.training.api.exception.WrappedRuntimeException;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.ErrorParser;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class ErrorParser {
    private static final String a = "Train-ErrorParser";
    private static final int b = 404;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(String str) {
        return String.format(Locale.CHINA, "%s 时发生异常", str);
    }

    public static Throwable getCause(Throwable th) {
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof UndeclaredThrowableException) && !(cause instanceof InvocationTargetException) && !(cause instanceof WrappedRuntimeException)) {
                break;
            }
            cause = cause.getCause();
        }
        return cause == null ? th : cause;
    }

    public static String getCode(Throwable th) {
        if ((th instanceof NetworkNotConnectedException) || (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) {
            return ErrorCode.NETWORK_NOT_CONNECTED;
        }
        if (th instanceof JsonParseFailException) {
            return ErrorCode.JSON_PARSE_FAILED;
        }
        if (th instanceof AccountException) {
            return ErrorCode.BAD_ACCOUNT;
        }
        if (!(th instanceof HttpException)) {
            return ErrorCode.EXCEPTION;
        }
        int httpCode = ((HttpException) th).getHttpCode();
        if (httpCode == 404) {
            return ErrorCode.NOT_FOUND;
        }
        return "http" + httpCode;
    }

    public static <T> Resource<T> toErrorResource(Throwable th, String str) {
        return toErrorResource(th, null, str);
    }

    public static <T> Resource<T> toErrorResource(Throwable th, T t, final String str) {
        Throwable cause = getCause(th);
        String code = getCode(cause);
        Loggers.getLogger().w(a, cause, new Supplier() { // from class: yo1
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return ErrorParser.b(str);
            }
        });
        return Resource.error(code, cause.getMessage(), t);
    }
}
