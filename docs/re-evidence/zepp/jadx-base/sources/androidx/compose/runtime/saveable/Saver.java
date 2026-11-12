package androidx.compose.runtime.saveable;

import com.huami.widget.share.ShareAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\u001d\u0010\u0006\u001a\u0004\u0018\u00018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "Landroidx/compose/runtime/saveable/SaverScope;", "value", ShareAnalytics.ParamValue.SAVE, "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;", "restore", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1})
public interface Saver<Original, Saveable> {
    @Nullable
    Original restore(@NotNull Saveable value);

    @Nullable
    Saveable save(@NotNull SaverScope saverScope, Original original);
}
