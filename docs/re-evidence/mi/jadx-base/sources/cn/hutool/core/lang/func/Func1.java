package cn.hutool.core.lang.func;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface Func1<P, R> extends Serializable {
    R call(P p) throws Exception;

    default R callWithRuntimeException(P p) {
        try {
            return call(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
