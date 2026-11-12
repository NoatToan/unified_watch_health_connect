package com.xiaomi.fitness.component;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/component/ComponentException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComponentException extends Exception {
    public ComponentException(@Nullable String str) {
        super(str);
    }

    public ComponentException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public ComponentException(@Nullable Throwable th) {
        super(th);
    }
}
