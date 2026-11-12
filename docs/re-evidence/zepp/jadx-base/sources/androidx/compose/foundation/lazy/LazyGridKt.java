package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u000f*\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u001023\b\u0004\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0019\u001au\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u000f*\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102H\b\u0004\u0010\u0018\u001aB\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a`\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u000f*\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f23\b\u0004\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010 \u001au\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u000f*\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2H\b\u0004\u0010\u0018\u001aB\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010!\u001a=\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/GridCells;", "cells", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", ExifInterface.GPS_DIRECTION_TRUE, "", "items", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/ParameterName;", "name", "item", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function3;", "", "index", "itemsIndexed", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function5;)V", "nColumns", "Landroidx/compose/foundation/lazy/LazyGridScopeImpl;", "scope", "FixedLazyGrid", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyGridScopeImpl;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyGridKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void FixedLazyGrid(final int i, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, final LazyGridScopeImpl lazyGridScopeImpl, Composer composer, final int i2, final int i3) {
        LazyListState lazyListStateRememberLazyListState;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-902002143);
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 4) != 0) {
            i4 = i2 & (-897);
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        } else {
            lazyListStateRememberLazyListState = lazyListState;
            i4 = i2;
        }
        PaddingValues paddingValuesM274PaddingValues0680j_4 = (i3 & 8) != 0 ? PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0)) : paddingValues;
        final int totalSize = ((lazyGridScopeImpl.getTotalSize() + i) - 1) / i;
        Function1<LazyListScope, Unit> function1 = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.FixedLazyGrid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LazyListScope lazyListScope) {
                int i5 = totalSize;
                final int i6 = i;
                final LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                LazyListScope.DefaultImpls.items$default(lazyListScope, i5, null, ComposableLambdaKt.composableLambdaInstance(-985536118, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.FixedLazyGrid.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i7, @Nullable Composer composer2, int i8) {
                        int i9;
                        if ((i8 & 14) == 0) {
                            i9 = i8 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i8 & 112) == 0) {
                            i9 |= composer2.changed(i7) ? 32 : 16;
                        }
                        if (((i9 & 731) ^ 146) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        int i10 = i6;
                        LazyGridScopeImpl lazyGridScopeImpl3 = lazyGridScopeImpl2;
                        composer2.startReplaceableGroup(-1989997546);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                        int i11 = 1376089335;
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1740946226);
                        if (i10 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                int i14 = (i7 * i10) + i12;
                                if (i14 < lazyGridScopeImpl3.getTotalSize()) {
                                    composer2.startReplaceableGroup(-1740946063);
                                    Modifier modifierWeight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true);
                                    composer2.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(i11);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1171140845);
                                    lazyGridScopeImpl3.contentFor(i14, lazyItemScope).invoke(composer2, 0);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1740945742);
                                    SpacerKt.Spacer(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), composer2, 0);
                                    composer2.endReplaceableGroup();
                                }
                                if (i13 >= i10) {
                                    break;
                                }
                                i12 = i13;
                                i11 = 1376089335;
                            }
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), 2, null);
            }
        };
        int i5 = i4 >> 3;
        LazyDslKt.LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM274PaddingValues0680j_4, false, null, null, null, function1, composerStartRestartGroup, (i5 & 14) | (i5 & 112) | (i5 & 896), 120);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
        final PaddingValues paddingValues2 = paddingValuesM274PaddingValues0680j_4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.FixedLazyGrid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                LazyGridKt.FixedLazyGrid(i, modifier3, lazyListState2, paddingValues2, lazyGridScopeImpl, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalFoundationApi
    public static final void LazyVerticalGrid(@NotNull final GridCells gridCells, @Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, @NotNull final Function1<? super LazyGridScope, Unit> function1, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final LazyListState lazyListState2;
        int i4;
        PaddingValues paddingValuesM274PaddingValues0680j_4;
        int i5;
        int i6;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        Modifier modifier4;
        LazyListState lazyListState3;
        final PaddingValues paddingValues2;
        final int i7;
        final LazyGridScopeImpl lazyGridScopeImpl;
        Composer composer2;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(409765337);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    lazyListState2 = lazyListState;
                    int i9 = composerStartRestartGroup.changed(lazyListState2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    lazyListState2 = lazyListState;
                }
                i3 |= i9;
            } else {
                lazyListState2 = lazyListState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    paddingValuesM274PaddingValues0680j_4 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValuesM274PaddingValues0680j_4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function1)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if (((46811 & i3) ^ 9362) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        lazyListState3 = lazyListStateRememberLazyListState;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier4 = modifier2;
                        lazyListState3 = lazyListState2;
                    }
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    i7 = i3;
                    lazyGridScopeImpl = new LazyGridScopeImpl();
                    function1.invoke(lazyGridScopeImpl);
                    if (gridCells instanceof GridCells.Fixed) {
                        composerStartRestartGroup.startReplaceableGroup(409765690);
                        FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else if (gridCells instanceof GridCells.Adaptive) {
                        composerStartRestartGroup.startReplaceableGroup(409765951);
                        final LazyListState lazyListState4 = lazyListState3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                invoke(boxWithConstraintsScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                                if ((i10 & 14) == 0) {
                                    i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                                }
                                if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                                LazyListState lazyListState5 = lazyListState4;
                                PaddingValues paddingValues4 = paddingValues2;
                                LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                                int i11 = i7;
                                LazyGridKt.FixedLazyGrid(iMax, null, lazyListState5, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                            }
                        }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(409766330);
                        composer2.endReplaceableGroup();
                    }
                    modifier2 = modifier4;
                    lazyListState2 = lazyListState3;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    paddingValues3 = paddingValuesM274PaddingValues0680j_4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        LazyGridKt.LazyVerticalGrid(gridCells, modifier2, lazyListState2, paddingValues3, function1, composer3, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValuesM274PaddingValues0680j_4 = paddingValues;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if (((46811 & i3) ^ 9362) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                i7 = i3;
                lazyGridScopeImpl = new LazyGridScopeImpl();
                function1.invoke(lazyGridScopeImpl);
                if (gridCells instanceof GridCells.Fixed) {
                    composerStartRestartGroup.startReplaceableGroup(409765690);
                    FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else if (gridCells instanceof GridCells.Adaptive) {
                    composerStartRestartGroup.startReplaceableGroup(409765951);
                    final LazyListState lazyListState5 = lazyListState3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                            if ((i10 & 14) == 0) {
                                i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                            }
                            if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                            LazyListState lazyListState6 = lazyListState5;
                            PaddingValues paddingValues4 = paddingValues2;
                            LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                            int i11 = i7;
                            LazyGridKt.FixedLazyGrid(iMax, null, lazyListState6, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                        }
                    }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(409766330);
                    composer2.endReplaceableGroup();
                }
                modifier2 = modifier4;
                lazyListState2 = lazyListState3;
                paddingValues3 = paddingValues2;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                i7 = i3;
                lazyGridScopeImpl = new LazyGridScopeImpl();
                function1.invoke(lazyGridScopeImpl);
                if (gridCells instanceof GridCells.Fixed) {
                    composerStartRestartGroup.startReplaceableGroup(409765690);
                    FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else if (gridCells instanceof GridCells.Adaptive) {
                    composerStartRestartGroup.startReplaceableGroup(409765951);
                    final LazyListState lazyListState6 = lazyListState3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                            if ((i10 & 14) == 0) {
                                i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                            }
                            if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                            LazyListState lazyListState7 = lazyListState6;
                            PaddingValues paddingValues4 = paddingValues2;
                            LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                            int i11 = i7;
                            LazyGridKt.FixedLazyGrid(iMax, null, lazyListState7, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                        }
                    }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(409766330);
                    composer2.endReplaceableGroup();
                }
                modifier2 = modifier4;
                lazyListState2 = lazyListState3;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    LazyGridKt.LazyVerticalGrid(gridCells, modifier2, lazyListState2, paddingValues3, function1, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                lazyListState2 = lazyListState;
                if (composerStartRestartGroup.changed(lazyListState2)) {
                }
                i3 |= i9;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i9;
        } else {
            lazyListState2 = lazyListState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                paddingValuesM274PaddingValues0680j_4 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValuesM274PaddingValues0680j_4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if (((46811 & i3) ^ 9362) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                i7 = i3;
                lazyGridScopeImpl = new LazyGridScopeImpl();
                function1.invoke(lazyGridScopeImpl);
                if (gridCells instanceof GridCells.Fixed) {
                    composerStartRestartGroup.startReplaceableGroup(409765690);
                    FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else if (gridCells instanceof GridCells.Adaptive) {
                    composerStartRestartGroup.startReplaceableGroup(409765951);
                    final LazyListState lazyListState7 = lazyListState3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                            if ((i10 & 14) == 0) {
                                i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                            }
                            if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                            LazyListState lazyListState8 = lazyListState7;
                            PaddingValues paddingValues4 = paddingValues2;
                            LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                            int i11 = i7;
                            LazyGridKt.FixedLazyGrid(iMax, null, lazyListState8, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                        }
                    }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(409766330);
                    composer2.endReplaceableGroup();
                }
                modifier2 = modifier4;
                lazyListState2 = lazyListState3;
                paddingValues3 = paddingValues2;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                i7 = i3;
                lazyGridScopeImpl = new LazyGridScopeImpl();
                function1.invoke(lazyGridScopeImpl);
                if (gridCells instanceof GridCells.Fixed) {
                    composerStartRestartGroup.startReplaceableGroup(409765690);
                    FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else if (gridCells instanceof GridCells.Adaptive) {
                    composerStartRestartGroup.startReplaceableGroup(409765951);
                    final LazyListState lazyListState8 = lazyListState3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                            if ((i10 & 14) == 0) {
                                i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                            }
                            if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                            LazyListState lazyListState9 = lazyListState8;
                            PaddingValues paddingValues4 = paddingValues2;
                            LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                            int i11 = i7;
                            LazyGridKt.FixedLazyGrid(iMax, null, lazyListState9, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                        }
                    }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(409766330);
                    composer2.endReplaceableGroup();
                }
                modifier2 = modifier4;
                lazyListState2 = lazyListState3;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    LazyGridKt.LazyVerticalGrid(gridCells, modifier2, lazyListState2, paddingValues3, function1, composer3, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        paddingValuesM274PaddingValues0680j_4 = paddingValues;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(function1)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if (((46811 & i3) ^ 9362) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i4 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i4 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            i7 = i3;
            lazyGridScopeImpl = new LazyGridScopeImpl();
            function1.invoke(lazyGridScopeImpl);
            if (gridCells instanceof GridCells.Fixed) {
                composerStartRestartGroup.startReplaceableGroup(409765690);
                FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else if (gridCells instanceof GridCells.Adaptive) {
                composerStartRestartGroup.startReplaceableGroup(409765951);
                final LazyListState lazyListState9 = lazyListState3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                        if ((i10 & 14) == 0) {
                            i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                        }
                        if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                        LazyListState lazyListState10 = lazyListState9;
                        PaddingValues paddingValues4 = paddingValues2;
                        LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                        int i11 = i7;
                        LazyGridKt.FixedLazyGrid(iMax, null, lazyListState10, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                    }
                }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(409766330);
                composer2.endReplaceableGroup();
            }
            modifier2 = modifier4;
            lazyListState2 = lazyListState3;
            paddingValues3 = paddingValues2;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i4 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i4 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            i7 = i3;
            lazyGridScopeImpl = new LazyGridScopeImpl();
            function1.invoke(lazyGridScopeImpl);
            if (gridCells instanceof GridCells.Fixed) {
                composerStartRestartGroup.startReplaceableGroup(409765690);
                FixedLazyGrid(((GridCells.Fixed) gridCells).getCount(), modifier4, lazyListState3, paddingValues2, lazyGridScopeImpl, composerStartRestartGroup, 32768 | (i7 & 112) | (i7 & 896) | (i7 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else if (gridCells instanceof GridCells.Adaptive) {
                composerStartRestartGroup.startReplaceableGroup(409765951);
                final LazyListState lazyListState10 = lazyListState3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892453, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i10) {
                        if ((i10 & 14) == 0) {
                            i10 |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                        }
                        if (((i10 & 91) ^ 18) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        int iMax = Math.max((int) (boxWithConstraintsScope.mo259getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) gridCells).getMinSize()), 1);
                        LazyListState lazyListState11 = lazyListState10;
                        PaddingValues paddingValues4 = paddingValues2;
                        LazyGridScopeImpl lazyGridScopeImpl2 = lazyGridScopeImpl;
                        int i11 = i7;
                        LazyGridKt.FixedLazyGrid(iMax, null, lazyListState11, paddingValues4, lazyGridScopeImpl2, composer3, 32768 | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 2);
                    }
                }), composerStartRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(409766330);
                composer2.endReplaceableGroup();
            }
            modifier2 = modifier4;
            lazyListState2 = lazyListState3;
            paddingValues3 = paddingValues2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i10) {
                LazyGridKt.LazyVerticalGrid(gridCells, modifier2, lazyListState2, paddingValues3, function1, composer3, i | 1, i2);
            }
        });
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull final List<? extends T> list, @NotNull final Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyGridScope.items(list.size(), ComposableLambdaKt.composableLambdaInstance(-985537774, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.items.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
                int i3;
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    function4.invoke(lazyItemScope, (T) list.get(i), composer, Integer.valueOf(i3 & 14));
                }
            }
        }));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull final List<? extends T> list, @NotNull final Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyGridScope.items(list.size(), ComposableLambdaKt.composableLambdaInstance(-985537877, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.itemsIndexed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
                int i3;
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    function5.invoke(lazyItemScope, Integer.valueOf(i), (T) list.get(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
                }
            }
        }));
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull final T[] tArr, @NotNull final Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyGridScope.items(tArr.length, ComposableLambdaKt.composableLambdaInstance(-985537534, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.items.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
                int i3;
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    function4.invoke(lazyItemScope, tArr[i], composer, Integer.valueOf(i3 & 14));
                }
            }
        }));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull final T[] tArr, @NotNull final Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyGridScope.items(tArr.length, ComposableLambdaKt.composableLambdaInstance(-985536609, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt.itemsIndexed.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
                int i3;
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    function5.invoke(lazyItemScope, Integer.valueOf(i), tArr[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
                }
            }
        }));
    }
}
