package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "", "makeHandled", "()Z", "", "toString", "()Ljava/lang/String;", "", "cause", "Ljava/lang/Throwable;", "getHandled", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public class CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled");

    @NotNull
    private volatile /* synthetic */ int _handled;

    @JvmField
    @NotNull
    public final Throwable cause;

    public CompletedExceptionally(@NotNull Throwable th, boolean z) {
        this.cause = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean getHandled() {
        return this._handled;
    }

    public final boolean makeHandled() {
        return a.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + JsonLexerKt.BEGIN_LIST + this.cause + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
