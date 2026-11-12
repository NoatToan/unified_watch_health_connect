package androidx.compose.runtime;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t*\u001e\b\u0000\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"", DefaultSettingsSpiCall.n, "", "identityHashCode", "R", "lock", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "Lorg/jetbrains/annotations/TestOnly;", "TestOnly", "runtime_release"}, k = 2, mv = {1, 5, 1})
public final class ActualJvm_jvmKt {
    public static final int identityHashCode(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    @PublishedApi
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m886synchronized(@NotNull Object obj, @NotNull Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
            }
        }
        return rInvoke;
    }
}
