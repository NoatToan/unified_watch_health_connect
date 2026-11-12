package kotlinx.coroutines;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b*\n\u0010\u0005\"\u00020\u00032\u00020\u0003¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "", TransportUri.ACTION_BLOCK, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Runnable", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class RunnableKt {
    @NotNull
    public static final Runnable Runnable(@NotNull final Function0<Unit> function0) {
        return new Runnable() { // from class: kotlinx.coroutines.RunnableKt.Runnable.1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
    }
}
