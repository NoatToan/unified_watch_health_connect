package cn.hutool.core.lang.func;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface VoidFunc<P> extends Serializable {
    void call(P... pArr) throws Exception;

    default void callWithRuntimeException(P... pArr) {
        try {
            call(pArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
