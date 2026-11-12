package com.huami.dev;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\r"}, d2 = {"Lcom/huami/dev/LogcatTree;", "Ltimber/log/Timber$DebugTree;", "", "priority", "", "tag", "message", "", "t", "", "log", "<init>", "()V", "logcat_release"}, k = 1, mv = {1, 5, 1})
public final class LogcatTree extends Timber.DebugTree {
    @Override // timber.log.Timber.DebugTree, timber.log.Timber.Tree
    public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
        super.log(priority, tag, Intrinsics.stringPlus(message, LogcatKt.a(Thread.currentThread().getStackTrace()[9])), t);
    }
}
