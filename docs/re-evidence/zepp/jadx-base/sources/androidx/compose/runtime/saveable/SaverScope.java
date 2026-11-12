package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "", "value", "", "canBeSaved", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1})
public interface SaverScope {
    boolean canBeSaved(@NotNull Object value);
}
