package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import com.xiaomi.market.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u001cR\u00020\u00000\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemContentFactory;", "", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "updateKeyIndexMappingForVisibleItems", "", "index", "key", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/Constraints;", "constraints", "updateItemScope-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)V", "updateItemScope", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "itemsProvider", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/lazy/LazyListItemContentFactory$CachedItemContent;", "lambdasCache", "Ljava/util/Map;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Landroidx/compose/runtime/State;)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyListItemContentFactory {

    @NotNull
    private State<? extends LazyListItemsProvider> itemsProvider;

    @NotNull
    private final SaveableStateHolder saveableStateHolder;

    @NotNull
    private final Map<Object, CachedItemContent> lambdasCache = new LinkedHashMap();

    @NotNull
    private LazyItemScopeImpl itemScope = LazyListItemContentFactoryKt.InitialLazyItemsScopeImpl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemContentFactory$CachedItemContent;", "", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "scope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableState;", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "initialIndex", "<init>", "(Landroidx/compose/foundation/lazy/LazyListItemContentFactory;ILandroidx/compose/foundation/lazy/LazyItemScopeImpl;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public final class CachedItemContent {

        @NotNull
        private final Function2<Composer, Integer, Unit> content;

        /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState index;

        @NotNull
        private final Object key;

        @NotNull
        private final LazyItemScopeImpl scope;

        public CachedItemContent(@NotNull int i, @NotNull LazyItemScopeImpl lazyItemScopeImpl, Object obj) {
            this.scope = lazyItemScopeImpl;
            this.key = obj;
            this.index = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
            this.content = ComposableLambdaKt.composableLambdaInstance(-985538056, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemContentFactory$CachedItemContent$content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer, int i2) {
                    if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    LazyListItemsProvider lazyListItemsProvider = (LazyListItemsProvider) lazyListItemContentFactory.itemsProvider.getValue();
                    if (this.getIndex() >= lazyListItemsProvider.getItemsCount()) {
                        composer.startReplaceableGroup(1025808928);
                        composer.endReplaceableGroup();
                        return;
                    }
                    composer.startReplaceableGroup(1025808653);
                    Object key = lazyListItemsProvider.getKey(this.getIndex());
                    if (Intrinsics.areEqual(key, this.getKey())) {
                        composer.startReplaceableGroup(1025808746);
                        lazyListItemContentFactory.saveableStateHolder.SaveableStateProvider(key, lazyListItemsProvider.getContent(this.getIndex(), this.scope), composer, 520);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(1025808914);
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                }
            });
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int getIndex() {
            return ((Number) this.index.getValue()).intValue();
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        public final void setIndex(int i) {
            this.index.setValue(Integer.valueOf(i));
        }
    }

    public LazyListItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull State<? extends LazyListItemsProvider> state) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemsProvider = state;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent(int index, @NotNull Object key) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null && cachedItemContent.getIndex() == index) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(index, this.itemScope, key);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    /* JADX INFO: renamed from: updateItemScope-0kLqBqw, reason: not valid java name */
    public final void m353updateItemScope0kLqBqw(@NotNull Density density, long constraints) {
        if (Intrinsics.areEqual(this.itemScope.getDensity(), density) && Constraints.m2928equalsimpl0(this.itemScope.m352getConstraintsmsEJaDk(), constraints)) {
            return;
        }
        this.itemScope = new LazyItemScopeImpl(density, constraints, null);
        this.lambdasCache.clear();
    }

    public final void updateKeyIndexMappingForVisibleItems(@NotNull LazyListState state) {
        LazyListItemsProvider value = this.itemsProvider.getValue();
        int itemsCount = value.getItemsCount();
        if (itemsCount <= 0) {
            return;
        }
        state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
        int iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release = state.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release();
        int iMin = Math.min(itemsCount, state.getVisibleItemsCount() + iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release);
        if (iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release >= iMin) {
            return;
        }
        while (true) {
            int i = iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release + 1;
            CachedItemContent cachedItemContent = this.lambdasCache.get(value.getKey(iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release));
            if (cachedItemContent != null) {
                cachedItemContent.setIndex(iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release);
            }
            if (i >= iMin) {
                return;
            } else {
                iM363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release = i;
            }
        }
    }
}
