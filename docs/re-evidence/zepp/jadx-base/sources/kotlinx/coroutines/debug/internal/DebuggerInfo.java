package kotlinx.coroutines.debug.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010%\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "coroutineId", "", "b", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "dispatcher", "c", "getName", "name", GoogleApiAvailabilityLight.a, "getState", "state", "e", "getLastObservedThreadState", "lastObservedThreadState", "f", "getLastObservedThreadName", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "g", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "lastObservedStackTrace", "h", "J", "getSequenceNumber", "()J", "sequenceNumber", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class DebuggerInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Long coroutineId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String lastObservedThreadState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String lastObservedThreadName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<StackTraceElement> lastObservedStackTrace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long sequenceNumber;

    public DebuggerInfo(@NotNull DebugCoroutineInfo debugCoroutineInfo, @NotNull CoroutineContext coroutineContext) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.INSTANCE);
        this.coroutineId = coroutineId == null ? null : Long.valueOf(coroutineId.getId());
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        this.dispatcher = continuationInterceptor == null ? null : continuationInterceptor.toString();
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.INSTANCE);
        this.name = coroutineName == null ? null : coroutineName.getName();
        this.state = debugCoroutineInfo.get_state();
        Thread thread = debugCoroutineInfo.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfo.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfo.lastObservedStackTrace();
        this.sequenceNumber = debugCoroutineInfo.sequenceNumber;
    }

    @Nullable
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @Nullable
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    @Nullable
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @Nullable
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }
}
