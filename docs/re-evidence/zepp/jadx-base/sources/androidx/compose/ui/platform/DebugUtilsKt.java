package androidx.compose.ui.platform;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "", TransportUri.ACTION_BLOCK, "ifDebug", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class DebugUtilsKt {
    public static final void ifDebug(@NotNull Function0<Unit> function0) {
        function0.invoke();
    }
}
