package androidx.compose.runtime;

import com.huami.watch.notification.TransportUri;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\fH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H'R\u0016\u0010\u0017\u001a\u00020\f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "composeContent", "(Lkotlin/jvm/functions/Function2;)V", "", "", "values", "recordModificationsOf", "", "observesAnyOf", TransportUri.ACTION_BLOCK, "prepareCompose", "value", "recordReadOf", "recordWriteOf", "recompose", "applyChanges", "invalidateAll", "verifyConsistent", "isComposing", "()Z", "getHasPendingChanges", "hasPendingChanges", "runtime_release"}, k = 1, mv = {1, 5, 1})
public interface ControlledComposition extends Composition {
    void applyChanges();

    void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content);

    boolean getHasPendingChanges();

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@NotNull Set<? extends Object> values);

    void prepareCompose(@NotNull Function0<Unit> block);

    boolean recompose();

    void recordModificationsOf(@NotNull Set<? extends Object> values);

    void recordReadOf(@NotNull Object value);

    void recordWriteOf(@NotNull Object value);

    @InternalComposeApi
    void verifyConsistent();
}
