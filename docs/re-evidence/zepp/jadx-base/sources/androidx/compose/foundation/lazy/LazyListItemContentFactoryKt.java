package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "stateOfItemsProvider", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "rememberItemContentFactory", "(Landroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "InitialLazyItemsScopeImpl", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyListItemContentFactoryKt {

    @NotNull
    private static final LazyItemScopeImpl InitialLazyItemsScopeImpl = new LazyItemScopeImpl(DensityKt.Density(0.0f, 0.0f), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), null);

    @Composable
    @NotNull
    public static final LazyListItemContentFactory rememberItemContentFactory(@NotNull State<? extends LazyListItemsProvider> state, @NotNull LazyListState lazyListState, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(149230656);
        SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyListItemContentFactory(saveableStateHolderRememberSaveableStateHolder, state);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListItemContentFactory lazyListItemContentFactory = (LazyListItemContentFactory) objRememberedValue;
        lazyListItemContentFactory.updateKeyIndexMappingForVisibleItems(lazyListState);
        composer.endReplaceableGroup();
        return lazyListItemContentFactory;
    }
}
