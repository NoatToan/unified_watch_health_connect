package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a@\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u001b\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00190\u0018j\u0002`\u001a0\u0017H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ao\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00180\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aa\u0010+\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020$0\u0018j\u0002`*0\u0017\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00190\u0018j\u0002`\u001a0\u00170)2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002\"S\u0010,\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020$0\u0018j\u0002`*0\u0017\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00190\u0018j\u0002`\u001a0\u00170)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-*:\b\u0002\u0010.\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00190\u00182\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00190\u0018*\u0018\b\u0002\u0010/\"\b\u0012\u0004\u0012\u00020$0\u00182\b\u0012\u0004\u0012\u00020$0\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "CoreText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CoreText", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextDelegate;", "current", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "updateTextDelegate-x_uQXYA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;ZIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/PlaceholderRange;", "resolveInlineContent", "EmptyInlineContent", "Lkotlin/Pair;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class CoreTextKt {

    @NotNull
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> EmptyInlineContent = new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());

    @Composable
    /* JADX INFO: renamed from: CoreText-4YKlhWE, reason: not valid java name */
    public static final void m416CoreText4YKlhWE(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, @NotNull final TextStyle textStyle, final boolean z, final int i, final int i2, @NotNull final Map<String, InlineTextContent> map, @NotNull final Function1<? super TextLayoutResult, Unit> function1, @Nullable Composer composer, final int i3, final int i4) {
        Modifier modifierPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(1241032154);
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        Font.ResourceLoader resourceLoader = (Font.ResourceLoader) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontLoader());
        long backgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
        Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> pairResolveInlineContent = resolveInlineContent(annotatedString, map);
        List<AnnotatedString.Range<Placeholder>> listComponent1 = pairResolveInlineContent.component1();
        final List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> listComponent2 = pairResolveInlineContent.component2();
        long jLongValue = ((Number) RememberSaveableKt.m912rememberSaveable(new Object[]{annotatedString, selectionRegistrar}, (Saver) null, (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.CoreTextKt$CoreText$selectableId$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                return Long.valueOf(selectionRegistrar2 == null ? 0L : selectionRegistrar2.nextSelectableId());
            }
        }, composerStartRestartGroup, 8, 6)).longValue();
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            TextState textState = new TextState(new TextDelegate(annotatedString, textStyle, i2, z, i, density, resourceLoader, listComponent1, null), jLongValue);
            composerStartRestartGroup.updateRememberedValue(textState);
            objRememberedValue = textState;
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextState textState2 = (TextState) objRememberedValue;
        textState2.setTextDelegate(m417updateTextDelegatex_uQXYA(textState2.getTextDelegate(), annotatedString, textStyle, density, resourceLoader, z, i, i2, listComponent1));
        textState2.setOnTextLayout(function1);
        textState2.m495setSelectionBackgroundColor8_81llA(backgroundColor);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new TextController(textState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextController textController = (TextController) objRememberedValue2;
        textController.update(selectionRegistrar);
        Function2<Composer, Integer, Unit> function2M413getLambda1$foundation_release = listComponent2.isEmpty() ? ComposableSingletons$CoreTextKt.INSTANCE.m413getLambda1$foundation_release() : ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890150, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt$CoreText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i5) {
                if (((i5 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    CoreTextKt.InlineChildren(annotatedString, listComponent2, composer2, (i3 & 14) | 64);
                }
            }
        });
        Modifier modifierThen = modifier2.then(textController.getModifiers());
        if (selectionRegistrar != null) {
            modifierPointerInput = TouchMode_androidKt.isInTouchMode() ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textController.getLongPressDragObserver(), new CoreTextKt$CoreText$3(textController, null)) : SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textController.getMouseSelectionObserver(), new CoreTextKt$CoreText$4(textController, null));
        } else {
            modifierPointerInput = Modifier.INSTANCE;
        }
        Modifier modifierThen2 = modifierThen.then(modifierPointerInput);
        MeasurePolicy measurePolicy = textController.getMeasurePolicy();
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density2, companion2.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        function2M413getLambda1$foundation_release.invoke(composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(selectionRegistrar, textController.getCommit(), composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt$CoreText$5
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

            public final void invoke(@Nullable Composer composer2, int i5) {
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, modifier3, textStyle, z, i, i2, map, function1, composer2, i3 | 1, i4);
            }
        });
    }

    @Composable
    public static final void InlineChildren(@NotNull final AnnotatedString annotatedString, @NotNull final List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(710802501);
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                AnnotatedString.Range<Function3<String, Composer, Integer, Unit>> range = list.get(i2);
                Function3<String, Composer, Integer, Unit> function3Component1 = range.component1();
                int start = range.getStart();
                int end = range.getEnd();
                CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list2, long j) {
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size() - 1;
                        if (size2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                arrayList.add(list2.get(i4).mo2468measureBRTryo0(j));
                                if (i5 > size2) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m2935getMaxWidthimpl(j), Constraints.m2934getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                List<Placeable> list3 = arrayList;
                                int size3 = list3.size() - 1;
                                if (size3 < 0) {
                                    return;
                                }
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6 + 1;
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i6), 0, 0, 0.0f, 4, null);
                                    if (i7 > size3) {
                                        return;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Modifier.Companion companion = Modifier.INSTANCE;
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl, coreTextKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1487993655);
                function3Component1.invoke(annotatedString.subSequence(start, end).getText(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt.InlineChildren.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                CoreTextKt.InlineChildren(annotatedString, list, composer2, i | 1);
            }
        });
    }

    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        if (map.isEmpty()) {
            return EmptyInlineContent;
        }
        int i = 0;
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                AnnotatedString.Range<String> range = stringAnnotations.get(i);
                InlineTextContent inlineTextContent = map.get(range.getItem());
                if (inlineTextContent != null) {
                    arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                    arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: updateTextDelegate-x_uQXYA, reason: not valid java name */
    public static final TextDelegate m417updateTextDelegatex_uQXYA(@NotNull TextDelegate textDelegate, @NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader, boolean z, int i, int i2, @NotNull List<AnnotatedString.Range<Placeholder>> list) {
        if (Intrinsics.areEqual(textDelegate.getText(), annotatedString) && Intrinsics.areEqual(textDelegate.getStyle(), textStyle) && textDelegate.getSoftWrap() == z) {
            if (TextOverflow.m2916equalsimpl0(textDelegate.getOverflow(), i)) {
                if (textDelegate.getMaxLines() == i2 && Intrinsics.areEqual(textDelegate.getDensity(), density)) {
                    if (Intrinsics.areEqual(textDelegate.getPlaceholders(), list)) {
                        return textDelegate;
                    }
                }
            }
        }
        return new TextDelegate(annotatedString, textStyle, i2, z, i, density, resourceLoader, list, null);
    }
}
