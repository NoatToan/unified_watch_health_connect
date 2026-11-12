package com.facebook.bolts;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/bolts/UnobservedTaskException;", "Ljava/lang/RuntimeException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UnobservedTaskException extends RuntimeException {
    public UnobservedTaskException(@Nullable Throwable th) {
        super(th);
    }
}
