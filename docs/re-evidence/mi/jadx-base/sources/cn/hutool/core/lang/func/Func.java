package cn.hutool.core.lang.func;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface Func<P, R> extends Serializable {
    R call(P... pArr) throws Exception;

    default R callWithRuntimeException(P... pArr) {
        try {
            return call(pArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
