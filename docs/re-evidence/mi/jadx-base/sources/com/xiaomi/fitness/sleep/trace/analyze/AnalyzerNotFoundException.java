package com.xiaomi.fitness.sleep.trace.analyze;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\nB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/AnalyzerNotFoundException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "analyzerName", "", "(Ljava/lang/String;)V", "message", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyzerNotFoundException extends RuntimeException {
    public AnalyzerNotFoundException() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnalyzerNotFoundException(@Nullable String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("Not found analyzer %s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        super(str2);
    }

    public AnalyzerNotFoundException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public AnalyzerNotFoundException(@Nullable Throwable th) {
        super(th);
    }
}
