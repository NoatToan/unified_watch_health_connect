package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "", Constants.ENABLED, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class FocusableKt {
    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, final boolean z, @Nullable final MutableInteractionSource mutableInteractionSource) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusable");
                inspectorInfo.getProperties().set(Constants.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            public static final boolean m144invoke$lambda2(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: invoke$lambda-3, reason: not valid java name */
            public static final void m145invoke$lambda3(MutableState<Boolean> mutableState, boolean z2) {
                mutableState.setValue(Boolean.valueOf(z2));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                Modifier modifierFocusTarget;
                composer.startReplaceableGroup(1407538239);
                composer.startReplaceableGroup(-723524056);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue2;
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue3;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        final MutableState<FocusInteraction.Focus> mutableState3 = mutableState;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                FocusInteraction.Focus focus = (FocusInteraction.Focus) mutableState3.getValue();
                                if (focus == null) {
                                    return;
                                }
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                if (mutableInteractionSource4 != null) {
                                    mutableInteractionSource4.tryEmit(unfocus);
                                }
                                mutableState3.setValue(null);
                            }
                        };
                    }
                }, composer, 0);
                Boolean boolValueOf = Boolean.valueOf(z);
                final boolean z2 = z;
                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                EffectsKt.DisposableEffect(boolValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.2

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            MutableState<FocusInteraction.Focus> mutableState;
                            MutableState<FocusInteraction.Focus> mutableState2;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value != null) {
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return Unit.INSTANCE;
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        if (!z2) {
                            e.f(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource3, null), 3, null);
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, composer, 0);
                if (z) {
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, AnonymousClass2.m144invoke$lambda2(mutableState2));
                        }
                    }, 1, null);
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                    modifierFocusTarget = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(modifierSemantics$default, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.4

                        /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", i = {1}, l = {93, 97}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$focusedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code duplicated, block: B:25:0x005b  */
                            /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
                            /* JADX WARN: Code duplicated, block: B:28:0x0066  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                MutableState<FocusInteraction.Focus> mutableState;
                                MutableState<FocusInteraction.Focus> mutableState2;
                                FocusInteraction.Focus focus;
                                MutableInteractionSource mutableInteractionSource;
                                FocusInteraction.Focus focus2;
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i != 0) {
                                    if (i == 1) {
                                        mutableState2 = (MutableState) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        focus2 = (FocusInteraction.Focus) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    focus = focus2;
                                    this.$focusedInteraction.setValue(focus);
                                    return Unit.INSTANCE;
                                }
                                ResultKt.throwOnFailure(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value == null) {
                                    focus = new FocusInteraction.Focus();
                                    mutableInteractionSource = this.$interactionSource;
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = focus;
                                        this.label = 2;
                                        if (mutableInteractionSource.emit(focus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        focus2 = focus;
                                        focus = focus2;
                                    }
                                } else {
                                    MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource2 != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource2.emit(unfocus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                    focus = new FocusInteraction.Focus();
                                    mutableInteractionSource = this.$interactionSource;
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = focus;
                                        this.label = 2;
                                        if (mutableInteractionSource.emit(focus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        focus2 = focus;
                                        focus = focus2;
                                    }
                                }
                                this.$focusedInteraction.setValue(focus);
                                return Unit.INSTANCE;
                                mutableState = mutableState2;
                                mutableState.setValue(null);
                                focus = new FocusInteraction.Focus();
                                mutableInteractionSource = this.$interactionSource;
                                if (mutableInteractionSource != null) {
                                    this.L$0 = focus;
                                    this.label = 2;
                                    if (mutableInteractionSource.emit(focus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    focus2 = focus;
                                    focus = focus2;
                                }
                                this.$focusedInteraction.setValue(focus);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$2, reason: invalid class name and collision with other inner class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", f = "Focusable.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
                        public static final class C00082 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00082(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super C00082> continuation) {
                                super(2, continuation);
                                this.$focusedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00082(this.$focusedInteraction, this.$interactionSource, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                MutableState<FocusInteraction.Focus> mutableState;
                                MutableState<FocusInteraction.Focus> mutableState2;
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                    if (value != null) {
                                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                        mutableState = this.$focusedInteraction;
                                        FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                        if (mutableInteractionSource != null) {
                                            this.L$0 = mutableState;
                                            this.label = 1;
                                            if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutableState2 = mutableState;
                                        }
                                        mutableState.setValue(null);
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState2 = (MutableState) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutableState = mutableState2;
                                mutableState.setValue(null);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull FocusState focusState) {
                            AnonymousClass2.m145invoke$lambda3(mutableState2, focusState.isFocused());
                            if (AnonymousClass2.m144invoke$lambda2(mutableState2)) {
                                e.f(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource4, null), 3, null);
                            } else {
                                e.f(coroutineScope, null, null, new C00082(mutableState, mutableInteractionSource4, null), 3, null);
                            }
                        }
                    }));
                } else {
                    modifierFocusTarget = Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                return modifierFocusTarget;
            }
        });
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }
}
