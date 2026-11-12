package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class a {
        private static final ExecutionModule_ExecutorFactory a = new ExecutionModule_ExecutorFactory();

        private a() {
        }
    }

    public static ExecutionModule_ExecutorFactory create() {
        return a.a;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNull(e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Executor get() {
        return executor();
    }
}
