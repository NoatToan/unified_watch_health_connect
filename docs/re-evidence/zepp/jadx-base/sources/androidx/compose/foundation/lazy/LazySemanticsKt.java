package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a2\u0010\n\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "stateOfItemsProvider", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "isVertical", "lazyListSemantics", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazySemanticsKt {
    @NotNull
    public static final Modifier lazyListSemantics(@NotNull Modifier modifier, @NotNull final State<? extends LazyListItemsProvider> state, @NotNull final LazyListState lazyListState, @NotNull final CoroutineScope coroutineScope, final boolean z) {
        return SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt.lazyListSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                final State<LazyListItemsProvider> state2 = state;
                SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, new Function1<Object, Integer>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt.lazyListSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Integer invoke(@NotNull Object obj) {
                        LazySemanticsKt$lazyListSemantics$1$1$key$1 lazySemanticsKt$lazyListSemantics$1$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$1$key$1(state2.getValue());
                        int itemsCount = state2.getValue().getItemsCount();
                        if (itemsCount > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (Intrinsics.areEqual(lazySemanticsKt$lazyListSemantics$1$1$key$1.invoke(Integer.valueOf(i)), obj)) {
                                    return Integer.valueOf(i);
                                }
                                if (i2 < itemsCount) {
                                    i = i2;
                                }
                            }
                        }
                        return -1;
                    }
                });
                final LazyListState lazyListState2 = lazyListState;
                ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(lazyListState2.getFirstVisibleItemIndex() + (lazyListState2.getFirstVisibleItemScrollOffset() / 100000.0f));
                    }
                }, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(Float.POSITIVE_INFINITY);
                    }
                }, false, 4, null);
                if (z) {
                    SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                } else {
                    SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                }
                final boolean z2 = z;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final LazyListState lazyListState3 = lazyListState;
                SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt.lazyListSemantics.1.2

                    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$2$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$2$1", f = "LazySemantics.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ float $delta;
                        public final /* synthetic */ LazyListState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00271(LazyListState lazyListState, float f, Continuation<? super C00271> continuation) {
                            super(2, continuation);
                            this.$state = lazyListState;
                            this.$delta = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C00271(this.$state, this.$delta, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C00271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                LazyListState lazyListState = this.$state;
                                float f = this.$delta;
                                this.label = 1;
                                if (ScrollExtensionsKt.scrollBy(lazyListState, f, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f, Float f2) {
                        return invoke(f.floatValue(), f2.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f, float f2) {
                        if (z2) {
                            f = f2;
                        }
                        e.f(coroutineScope2, null, null, new C00271(lazyListState3, f, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
                final State<LazyListItemsProvider> state3 = state;
                final CoroutineScope coroutineScope3 = coroutineScope;
                final LazyListState lazyListState4 = lazyListState;
                SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, new Function1<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt.lazyListSemantics.1.3

                    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$3$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$3$2", f = "LazySemantics.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ int $index;
                        public final /* synthetic */ LazyListState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(LazyListState lazyListState, int i, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$state = lazyListState;
                            this.$index = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass2(this.$state, this.$index, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                LazyListState lazyListState = this.$state;
                                int i2 = this.$index;
                                this.label = 1;
                                if (LazyListState.scrollToItem$default(lazyListState, i2, 0, this, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @NotNull
                    public final Boolean invoke(int i) {
                        boolean z3 = i >= 0 && i < state3.getValue().getItemsCount();
                        State<LazyListItemsProvider> state4 = state3;
                        if (z3) {
                            e.f(coroutineScope3, null, null, new AnonymousClass2(lazyListState4, i, null), 3, null);
                            return Boolean.TRUE;
                        }
                        throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + state4.getValue().getItemsCount() + ')').toString());
                    }
                }, 1, null);
                boolean z3 = z;
                SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, new CollectionInfo(z3 ? -1 : 1, z3 ? 1 : -1));
            }
        }, 1, null);
    }
}
