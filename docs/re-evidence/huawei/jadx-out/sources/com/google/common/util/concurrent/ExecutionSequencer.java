package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }
}
