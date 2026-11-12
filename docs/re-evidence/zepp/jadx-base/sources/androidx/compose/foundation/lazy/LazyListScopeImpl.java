package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J*\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJo\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032#\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f21\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u0019\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030&8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "", "index", "", "getKey", "Landroidx/compose/foundation/lazy/LazyItemScope;", "scope", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;", "count", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "content", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/IntervalList;", "Landroidx/compose/foundation/lazy/IntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/IntervalList;", "", "_headerIndexes", "Ljava/util/List;", "getItemsCount", "()I", "itemsCount", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class LazyListScopeImpl implements LazyListScope, LazyListItemsProvider {

    @Nullable
    private List<Integer> _headerIndexes;

    @NotNull
    private final IntervalList<IntervalContent> intervals = new IntervalList<>();

    @Override // androidx.compose.foundation.lazy.LazyListItemsProvider
    @NotNull
    public Function2<Composer, Integer, Unit> getContent(int index, @NotNull LazyItemScope scope) {
        IntervalHolder<IntervalContent> intervalHolderIntervalForIndex = this.intervals.intervalForIndex(index);
        return intervalHolderIntervalForIndex.getContent().getContent().invoke(scope, Integer.valueOf(index - intervalHolderIntervalForIndex.getStartIndex()));
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemsProvider
    @NotNull
    public List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemsProvider
    public int getItemsCount() {
        return this.intervals.getTotalSize();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemsProvider
    @NotNull
    public Object getKey(int index) {
        IntervalHolder<IntervalContent> intervalHolderIntervalForIndex = this.intervals.intervalForIndex(index);
        int startIndex = index - intervalHolderIntervalForIndex.getStartIndex();
        Function1<Integer, Object> key = intervalHolderIntervalForIndex.getContent().getKey();
        Object objInvoke = key == null ? null : key.invoke(Integer.valueOf(startIndex));
        return objInvoke == null ? Lazy_androidKt.getDefaultLazyKeyFor(index) : objInvoke;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable final Object key, @NotNull final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        this.intervals.add(1, new IntervalContent(key != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Object invoke(int i) {
                return key;
            }
        } : null, new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Function2<? super Composer, ? super Integer, ? extends Unit> invoke(LazyItemScope lazyItemScope, Integer num) {
                return invoke(lazyItemScope, num.intValue());
            }

            @NotNull
            public final Function2<Composer, Integer, Unit> invoke(@NotNull final LazyItemScope lazyItemScope, int i) {
                final Function3<LazyItemScope, Composer, Integer, Unit> function3 = content;
                return ComposableLambdaKt.composableLambdaInstance(-985541160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        } else {
                            function3.invoke(lazyItemScope, composer, 0);
                        }
                    }
                });
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        this.intervals.add(count, new IntervalContent(key, new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.items.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Function2<? super Composer, ? super Integer, ? extends Unit> invoke(LazyItemScope lazyItemScope, Integer num) {
                return invoke(lazyItemScope, num.intValue());
            }

            @NotNull
            public final Function2<Composer, Integer, Unit> invoke(@NotNull final LazyItemScope lazyItemScope, final int i) {
                final Function4<LazyItemScope, Integer, Composer, Integer, Unit> function4 = itemContent;
                return ComposableLambdaKt.composableLambdaInstance(-985542111, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.items.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        } else {
                            function4.invoke(lazyItemScope, Integer.valueOf(i), composer, 0);
                        }
                    }
                });
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object key, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(getItemsCount()));
        item(key, content);
    }
}
