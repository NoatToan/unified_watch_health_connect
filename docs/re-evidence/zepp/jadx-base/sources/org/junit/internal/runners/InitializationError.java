package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> a;

    public InitializationError(List<Throwable> list) {
        this.a = list;
    }

    public List<Throwable> getCauses() {
        return this.a;
    }

    public InitializationError(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
