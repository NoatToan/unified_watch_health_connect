package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\u00072\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\b¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000221\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\b¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R>\u0010\u0018\u001a*\u0012&\u0012$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u0011¢\u0006\u0002\b\f0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/LazyGridScope;", "", "index", "Landroidx/compose/foundation/lazy/LazyItemScope;", "scope", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "contentFor", "(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "content", "item", "(Lkotlin/jvm/functions/Function3;)V", "count", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "itemContent", "items", "(ILkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/IntervalList;", "intervals", "Landroidx/compose/foundation/lazy/IntervalList;", "getTotalSize", "()I", "totalSize", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyGridScopeImpl implements LazyGridScope {

    @NotNull
    private final IntervalList<Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>>> intervals = new IntervalList<>();

    @NotNull
    public final Function2<Composer, Integer, Unit> contentFor(int index, @NotNull LazyItemScope scope) {
        IntervalHolder<Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>>> intervalHolderIntervalForIndex = this.intervals.intervalForIndex(index);
        return intervalHolderIntervalForIndex.getContent().invoke(scope, Integer.valueOf(index - intervalHolderIntervalForIndex.getStartIndex()));
    }

    public final int getTotalSize() {
        return this.intervals.getTotalSize();
    }

    @Override // androidx.compose.foundation.lazy.LazyGridScope
    public void item(@NotNull final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        this.intervals.add(1, (Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>>) new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.LazyGridScopeImpl.item.1
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
                return ComposableLambdaKt.composableLambdaInstance(-985535238, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridScopeImpl.item.1.1
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
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.foundation.lazy.LazyGridScope
    public void items(int count, @NotNull final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        this.intervals.add(count, new Function2<LazyItemScope, Integer, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.lazy.LazyGridScopeImpl.items.1
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
                return ComposableLambdaKt.composableLambdaInstance(-985534678, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridScopeImpl.items.1.1
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
        });
    }
}
