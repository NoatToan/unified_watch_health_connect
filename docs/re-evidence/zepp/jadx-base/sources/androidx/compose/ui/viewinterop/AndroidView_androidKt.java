package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\"*\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "AndroidView", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/ExtensionFunctionType;", "NoOpUpdate", "Lkotlin/jvm/functions/Function1;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidView_androidKt {

    @NotNull
    private static final Function1<View, Unit> NoOpUpdate = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
        }
    };

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0171  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final <T extends View> void AndroidView(@NotNull final Function1<? super Context, ? extends T> function1, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super T, Unit> function3;
        int i5;
        Modifier modifier3;
        final Function1<? super T, Unit> function4;
        final SaveableStateRegistry saveableStateRegistry;
        final String strValueOf;
        Object objRememberedValue;
        final Ref ref;
        final Function0<LayoutNode> function0;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-88762710);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changed(function3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if (((i3 & 731) ^ 146) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = NoOpUpdate;
                    } else {
                        function4 = function3;
                    }
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    }));
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    final CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                    saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                    strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Ref();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ref = (Ref) objRememberedValue;
                    Modifier modifier5 = modifier3;
                    function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            View typedView$ui_release;
                            ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context, compositionContextRememberCompositionContext);
                            viewFactoryHolder.setFactory(function1);
                            SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                            Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                            SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                            if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                                typedView$ui_release.restoreHierarchyState(sparseArray);
                            }
                            ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                            return viewFactoryHolder.getLayoutNode();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103251527);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl, modifierMaterialize, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier6) {
                            invoke2(layoutNode, modifier6);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier6) {
                            ((ViewFactoryHolder) ref.getValue()).setModifier(modifier6);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl, density, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density2) {
                            invoke2(layoutNode, density2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density2) {
                            ((ViewFactoryHolder) ref.getValue()).setDensity(density2);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                            ref.getValue().setUpdateBlock(function5);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[LayoutDirection.values().length];
                                iArr[LayoutDirection.Ltr.ordinal()] = 1;
                                iArr[LayoutDirection.Rtl.ordinal()] = 2;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                            invoke2(layoutNode, layoutDirection2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection2) {
                            ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                            int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                            int i8 = 1;
                            if (i7 == 1) {
                                i8 = 0;
                            } else if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewFactoryHolder.setLayoutDirection(i8);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (saveableStateRegistry != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88760705);
                        EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                final Ref<ViewFactoryHolder<T>> ref2 = ref;
                                final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final SparseArray<Parcelable> invoke() {
                                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                        View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                        if (typedView$ui_release != null) {
                                            typedView$ui_release.saveHierarchyState(sparseArray);
                                        }
                                        return sparseArray;
                                    }
                                });
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        entryRegisterProvider.unregister();
                                    }
                                };
                            }
                        }, composerStartRestartGroup, 8);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88760250);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        AndroidView_androidKt.AndroidView(function1, modifier4, function4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            function3 = function2;
            if (((i3 & 731) ^ 146) == 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = NoOpUpdate;
                } else {
                    function4 = function3;
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierMaterialize2 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }));
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                final CompositionContext compositionContextRememberCompositionContext2 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ref = (Ref) objRememberedValue;
                Modifier modifier6 = modifier3;
                function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context2, compositionContextRememberCompositionContext2);
                        viewFactoryHolder.setFactory(function1);
                        SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                        Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103251527);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl2, modifierMaterialize2, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier7) {
                        invoke2(layoutNode, modifier7);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier7) {
                        ((ViewFactoryHolder) ref.getValue()).setModifier(modifier7);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl2, density2, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density3) {
                        invoke2(layoutNode, density3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density3) {
                        ((ViewFactoryHolder) ref.getValue()).setDensity(density3);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl2, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                        ref.getValue().setUpdateBlock(function5);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection3) {
                        invoke2(layoutNode, layoutDirection3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection3) {
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                        int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection3.ordinal()];
                        int i8 = 1;
                        if (i7 == 1) {
                            i8 = 0;
                        } else if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i8);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (saveableStateRegistry != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88760705);
                    EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                            final Ref<ViewFactoryHolder<T>> ref2 = ref;
                            final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            });
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    entryRegisterProvider.unregister();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88760250);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier4 = modifier6;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = NoOpUpdate;
                } else {
                    function4 = function3;
                }
                final Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierMaterialize3 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }));
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                final CompositionContext compositionContextRememberCompositionContext3 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ref = (Ref) objRememberedValue;
                Modifier modifier7 = modifier3;
                function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context3, compositionContextRememberCompositionContext3);
                        viewFactoryHolder.setFactory(function1);
                        SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                        Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103251527);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl3, modifierMaterialize3, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier8) {
                        invoke2(layoutNode, modifier8);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier8) {
                        ((ViewFactoryHolder) ref.getValue()).setModifier(modifier8);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl3, density3, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density4) {
                        invoke2(layoutNode, density4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density4) {
                        ((ViewFactoryHolder) ref.getValue()).setDensity(density4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl3, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                        ref.getValue().setUpdateBlock(function5);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection4) {
                        invoke2(layoutNode, layoutDirection4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection4) {
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                        int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection4.ordinal()];
                        int i8 = 1;
                        if (i7 == 1) {
                            i8 = 0;
                        } else if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i8);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (saveableStateRegistry != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88760705);
                    EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                            final Ref<ViewFactoryHolder<T>> ref2 = ref;
                            final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            });
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    entryRegisterProvider.unregister();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88760250);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    AndroidView_androidKt.AndroidView(function1, modifier4, function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changed(function3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if (((i3 & 731) ^ 146) == 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = NoOpUpdate;
                } else {
                    function4 = function3;
                }
                final Context context4 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierMaterialize4 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }));
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                final CompositionContext compositionContextRememberCompositionContext4 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ref = (Ref) objRememberedValue;
                Modifier modifier8 = modifier3;
                function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context4, compositionContextRememberCompositionContext4);
                        viewFactoryHolder.setFactory(function1);
                        SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                        Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103251527);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl4, modifierMaterialize4, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier9) {
                        invoke2(layoutNode, modifier9);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier9) {
                        ((ViewFactoryHolder) ref.getValue()).setModifier(modifier9);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl4, density4, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density5) {
                        invoke2(layoutNode, density5);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density5) {
                        ((ViewFactoryHolder) ref.getValue()).setDensity(density5);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl4, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                        ref.getValue().setUpdateBlock(function5);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection5) {
                        invoke2(layoutNode, layoutDirection5);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection5) {
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                        int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection5.ordinal()];
                        int i8 = 1;
                        if (i7 == 1) {
                            i8 = 0;
                        } else if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i8);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (saveableStateRegistry != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88760705);
                    EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                            final Ref<ViewFactoryHolder<T>> ref2 = ref;
                            final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            });
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    entryRegisterProvider.unregister();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88760250);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier4 = modifier8;
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = NoOpUpdate;
                } else {
                    function4 = function3;
                }
                final Context context5 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierMaterialize5 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }));
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                final CompositionContext compositionContextRememberCompositionContext5 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ref = (Ref) objRememberedValue;
                Modifier modifier9 = modifier3;
                function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context5, compositionContextRememberCompositionContext5);
                        viewFactoryHolder.setFactory(function1);
                        SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                        Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103251527);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl5, modifierMaterialize5, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier10) {
                        invoke2(layoutNode, modifier10);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier10) {
                        ((ViewFactoryHolder) ref.getValue()).setModifier(modifier10);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl5, density5, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density6) {
                        invoke2(layoutNode, density6);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density6) {
                        ((ViewFactoryHolder) ref.getValue()).setDensity(density6);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl5, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                        ref.getValue().setUpdateBlock(function5);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection6) {
                        invoke2(layoutNode, layoutDirection6);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection6) {
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                        int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection6.ordinal()];
                        int i8 = 1;
                        if (i7 == 1) {
                            i8 = 0;
                        } else if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i8);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (saveableStateRegistry != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88760705);
                    EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                            final Ref<ViewFactoryHolder<T>> ref2 = ref;
                            final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            });
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    entryRegisterProvider.unregister();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88760250);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    AndroidView_androidKt.AndroidView(function1, modifier4, function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        function3 = function2;
        if (((i3 & 731) ^ 146) == 0) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                function4 = NoOpUpdate;
            } else {
                function4 = function3;
            }
            final Context context6 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierMaterialize6 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            }));
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final CompositionContext compositionContextRememberCompositionContext6 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ref = (Ref) objRememberedValue;
            Modifier modifier10 = modifier3;
            function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LayoutNode invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context6, compositionContextRememberCompositionContext6);
                    viewFactoryHolder.setFactory(function1);
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                    SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-2103251527);
            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        return function0.invoke();
                    }
                });
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl6, modifierMaterialize6, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier11) {
                    invoke2(layoutNode, modifier11);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier11) {
                    ((ViewFactoryHolder) ref.getValue()).setModifier(modifier11);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl6, density6, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density7) {
                    invoke2(layoutNode, density7);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density7) {
                    ((ViewFactoryHolder) ref.getValue()).setDensity(density7);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl6, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                    invoke(layoutNode, (Function1) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                    ref.getValue().setUpdateBlock(function5);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection7) {
                    invoke2(layoutNode, layoutDirection7);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection7) {
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection7.ordinal()];
                    int i8 = 1;
                    if (i7 == 1) {
                        i8 = 0;
                    } else if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i8);
                }
            });
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (saveableStateRegistry != null) {
                composerStartRestartGroup.startReplaceableGroup(-88760705);
                EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        final Ref<ViewFactoryHolder<T>> ref2 = ref;
                        final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final SparseArray<Parcelable> invoke() {
                                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                if (typedView$ui_release != null) {
                                    typedView$ui_release.saveHierarchyState(sparseArray);
                                }
                                return sparseArray;
                            }
                        });
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                entryRegisterProvider.unregister();
                            }
                        };
                    }
                }, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88760250);
                composerStartRestartGroup.endReplaceableGroup();
            }
            modifier4 = modifier10;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                function4 = NoOpUpdate;
            } else {
                function4 = function3;
            }
            final Context context7 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierMaterialize7 = ComposedModifierKt.materialize(composerStartRestartGroup, SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            }));
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final CompositionContext compositionContextRememberCompositionContext7 = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            strValueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ref = (Ref) objRememberedValue;
            Modifier modifier11 = modifier3;
            function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LayoutNode invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context7, compositionContextRememberCompositionContext7);
                    viewFactoryHolder.setFactory(function1);
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    Object objConsumeRestored = saveableStateRegistry2 == null ? null : saveableStateRegistry2.consumeRestored(strValueOf);
                    SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    ref.setValue((ViewFactoryHolder<T>) viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-2103251527);
            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LayoutNode invoke() {
                        return function0.invoke();
                    }
                });
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl7, modifierMaterialize7, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier12) {
                    invoke2(layoutNode, modifier12);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Modifier modifier12) {
                    ((ViewFactoryHolder) ref.getValue()).setModifier(modifier12);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl7, density7, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density8) {
                    invoke2(layoutNode, density8);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Density density8) {
                    ((ViewFactoryHolder) ref.getValue()).setDensity(density8);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl7, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                    invoke(layoutNode, (Function1) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode layoutNode, @NotNull Function1<? super T, Unit> function5) {
                    ref.getValue().setUpdateBlock(function5);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection8) {
                    invoke2(layoutNode, layoutDirection8);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull LayoutDirection layoutDirection8) {
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) ref.getValue();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[layoutDirection8.ordinal()];
                    int i8 = 1;
                    if (i7 == 1) {
                        i8 = 0;
                    } else if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i8);
                }
            });
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (saveableStateRegistry != null) {
                composerStartRestartGroup.startReplaceableGroup(-88760705);
                EffectsKt.DisposableEffect(saveableStateRegistry, strValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        final Ref<ViewFactoryHolder<T>> ref2 = ref;
                        final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(strValueOf, new Function0<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final SparseArray<Parcelable> invoke() {
                                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                View typedView$ui_release = ((ViewFactoryHolder) ref2.getValue()).getTypedView$ui_release();
                                if (typedView$ui_release != null) {
                                    typedView$ui_release.saveHierarchyState(sparseArray);
                                }
                                return sparseArray;
                            }
                        });
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                entryRegisterProvider.unregister();
                            }
                        };
                    }
                }, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88760250);
                composerStartRestartGroup.endReplaceableGroup();
            }
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                AndroidView_androidKt.AndroidView(function1, modifier4, function4, composer2, i | 1, i2);
            }
        });
    }

    @NotNull
    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }
}
