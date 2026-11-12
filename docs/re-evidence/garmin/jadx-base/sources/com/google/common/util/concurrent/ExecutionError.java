package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    @Deprecated
    public ExecutionError() {
    }

    @Deprecated
    public ExecutionError(String str) {
        super(str);
    }

    public ExecutionError(String str, Error error) {
        super(str, error);
    }

    public ExecutionError(Error error) {
        super(error);
    }
}
