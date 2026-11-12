package com.huami.healthlabel.repository;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huami/healthlabel/repository/AppExecutors;", "", "Ljava/util/concurrent/Executor;", "diskIO", "networkIO", "mainThread", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface AppExecutors {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Executor mainThread(@NotNull AppExecutors appExecutors) {
            return new MainThreadExecutor();
        }
    }

    @NotNull
    Executor diskIO();

    @NotNull
    Executor mainThread();

    @NotNull
    Executor networkIO();
}
