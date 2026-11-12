package cn.hutool.core.lang.func;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface VoidFunc1<P> extends Serializable {
    void call(P p) throws Exception;

    default void callWithRuntimeException(P p) {
        try {
            call(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
