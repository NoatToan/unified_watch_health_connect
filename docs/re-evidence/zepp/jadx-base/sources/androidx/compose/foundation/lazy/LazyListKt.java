package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a}\u0010\u0017\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "stateOfItemsProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "", "LazyList", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;III)V", "", "MaxItemsToRetainForReuse", LogUtil.I, "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyListKt {
    private static final int MaxItemsToRetainForReuse = 2;

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:131:0x017d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0180  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:138:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x0197  */
    /* JADX WARN: Code duplicated, block: B:141:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:154:0x0229  */
    /* JADX WARN: Code duplicated, block: B:155:0x022c  */
    /* JADX WARN: Code duplicated, block: B:160:0x028c  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x016b, please report this as an issue */
    @Composable
    public static final void LazyList(@NotNull final State<? extends LazyListItemsProvider> state, @NotNull final Modifier modifier, @NotNull final LazyListState lazyListState, @NotNull final PaddingValues paddingValues, final boolean z, final boolean z2, @NotNull final FlingBehavior flingBehavior, @Nullable Alignment.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Vertical vertical2, @Nullable Arrangement.Horizontal horizontal2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Arrangement.Horizontal horizontal3;
        int i14;
        int i15;
        Alignment.Horizontal horizontal4;
        Arrangement.Vertical vertical3;
        Alignment.Vertical vertical4;
        Arrangement.Horizontal horizontal5;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Orientation orientation;
        Composer composer2;
        final Alignment.Vertical vertical5;
        final Alignment.Horizontal horizontal6;
        final Arrangement.Vertical vertical6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-908839593);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            if ((458752 & i) == 0) {
                i5 = composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(flingBehavior)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                    horizontal3 = horizontal2;
                } else {
                    horizontal3 = horizontal2;
                    if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changed(horizontal3)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                }
                if (((i4 & 1533916891) ^ 306783378) != 0 && ((i14 & 11) ^ 2) == 0 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    horizontal6 = horizontal;
                    vertical6 = vertical;
                    vertical5 = vertical2;
                    horizontal5 = horizontal3;
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i7 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal;
                    }
                    if (i9 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i11 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    horizontal5 = i13 == 0 ? horizontal3 : null;
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && z3) {
                        z4 = z;
                    } else if (z) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new SubcomposeLayoutState(2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue;
                    int i16 = SubcomposeLayoutState.$stable;
                    LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory, subcomposeLayoutState, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i16 << 9));
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierLazyListSemantics = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope, z2);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    boolean z5 = z4;
                    composer2 = composerStartRestartGroup;
                    final Arrangement.Vertical vertical7 = vertical3;
                    final Arrangement.Horizontal horizontal7 = horizontal5;
                    final Alignment.Horizontal horizontal8 = horizontal4;
                    vertical5 = vertical4;
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z5, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                            float spacing;
                            ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                            LazyListItemsProvider value = state.getValue();
                            lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                            lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                            lazyListItemContentFactoryRememberItemContentFactory.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                            final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                            final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                            int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                            if (z2) {
                                Arrangement.Vertical vertical8 = vertical7;
                                if (vertical8 == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                spacing = vertical8.getSpacing();
                            } else {
                                Arrangement.Horizontal horizontal9 = horizontal7;
                                if (horizontal9 == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                spacing = horizontal9.getSpacing();
                            }
                            final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                            final int itemsCount = value.getItemsCount();
                            final boolean z6 = z2;
                            LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory;
                            final Alignment.Horizontal horizontal10 = horizontal8;
                            final Alignment.Vertical vertical9 = vertical5;
                            final boolean z7 = z;
                            LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z6, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                                @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                                @NotNull
                                /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                                public final LazyMeasuredItem mo355createItemHK0c1C0(int i17, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                                    return new LazyMeasuredItem(i17, placeableArr, z6, horizontal10, vertical9, subcomposeMeasureScope.getLayoutDirection(), z7, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i17 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                                }
                            }, null);
                            boolean z8 = z;
                            LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z8 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z8 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical7, horizontal7, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                            lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                            LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                            if (onPostMeasureListener != null) {
                                onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                            }
                            return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                        }
                    }, composer2, i16, 0);
                    horizontal6 = horizontal4;
                    vertical6 = vertical3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Arrangement.Horizontal horizontal9 = horizontal5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.2
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

                    public final void invoke(@Nullable Composer composer3, int i17) {
                        LazyListKt.LazyList(state, modifier, lazyListState, paddingValues, z, z2, flingBehavior, horizontal6, vertical6, vertical5, horizontal9, composer3, i | 1, i2, i3);
                    }
                });
            }
            i4 |= 12582912;
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
                horizontal3 = horizontal2;
            } else {
                horizontal3 = horizontal2;
                if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changed(horizontal3)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
            }
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if (i7 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal;
                }
                if (i9 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i11 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i13 == 0) {
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory2 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SubcomposeLayoutState(2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SubcomposeLayoutState subcomposeLayoutState2 = (SubcomposeLayoutState) objRememberedValue;
                int i17 = SubcomposeLayoutState.$stable;
                LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory2, subcomposeLayoutState2, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i17 << 9));
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                    objRememberedValue2 = compositionScopedCoroutineScopeCanceller2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLazyListSemantics2 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope2, z2);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                boolean z6 = z4;
                composer2 = composerStartRestartGroup;
                final Arrangement.Vertical vertical8 = vertical3;
                final Arrangement.Horizontal horizontal10 = horizontal5;
                final Alignment.Horizontal horizontal11 = horizontal4;
                vertical5 = vertical4;
                SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState2, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics2, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z6, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        float spacing;
                        ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                        LazyListItemsProvider value = state.getValue();
                        lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                        lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                        lazyListItemContentFactoryRememberItemContentFactory2.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                        final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                        if (z2) {
                            Arrangement.Vertical vertical9 = vertical8;
                            if (vertical9 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = vertical9.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal12 = horizontal10;
                            if (horizontal12 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = horizontal12.getSpacing();
                        }
                        final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                        final int itemsCount = value.getItemsCount();
                        final boolean z7 = z2;
                        LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory2;
                        final Alignment.Horizontal horizontal13 = horizontal11;
                        final Alignment.Vertical vertical10 = vertical5;
                        final boolean z8 = z;
                        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z7, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                            @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                            @NotNull
                            /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                            public final LazyMeasuredItem mo355createItemHK0c1C0(int i18, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                                return new LazyMeasuredItem(i18, placeableArr, z7, horizontal13, vertical10, subcomposeMeasureScope.getLayoutDirection(), z8, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i18 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                            }
                        }, null);
                        boolean z9 = z;
                        LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z9 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z9 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical8, horizontal10, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                        LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                        if (onPostMeasureListener != null) {
                            onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                        }
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                    }
                }, composer2, i17, 0);
                horizontal6 = horizontal4;
                vertical6 = vertical3;
            } else {
                if (i7 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal;
                }
                if (i9 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i11 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i13 == 0) {
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory3 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SubcomposeLayoutState(2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SubcomposeLayoutState subcomposeLayoutState3 = (SubcomposeLayoutState) objRememberedValue;
                int i18 = SubcomposeLayoutState.$stable;
                LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory3, subcomposeLayoutState3, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i18 << 9));
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                    objRememberedValue2 = compositionScopedCoroutineScopeCanceller3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLazyListSemantics3 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope3, z2);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                boolean z7 = z4;
                composer2 = composerStartRestartGroup;
                final Arrangement.Vertical vertical9 = vertical3;
                final Arrangement.Horizontal horizontal12 = horizontal5;
                final Alignment.Horizontal horizontal13 = horizontal4;
                vertical5 = vertical4;
                SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState3, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics3, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z7, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        float spacing;
                        ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                        LazyListItemsProvider value = state.getValue();
                        lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                        lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                        lazyListItemContentFactoryRememberItemContentFactory3.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                        final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                        if (z2) {
                            Arrangement.Vertical vertical10 = vertical9;
                            if (vertical10 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = vertical10.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal14 = horizontal12;
                            if (horizontal14 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = horizontal14.getSpacing();
                        }
                        final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                        final int itemsCount = value.getItemsCount();
                        final boolean z8 = z2;
                        LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory3;
                        final Alignment.Horizontal horizontal15 = horizontal13;
                        final Alignment.Vertical vertical11 = vertical5;
                        final boolean z9 = z;
                        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z8, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                            @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                            @NotNull
                            /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                            public final LazyMeasuredItem mo355createItemHK0c1C0(int i19, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                                return new LazyMeasuredItem(i19, placeableArr, z8, horizontal15, vertical11, subcomposeMeasureScope.getLayoutDirection(), z9, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i19 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                            }
                        }, null);
                        boolean z10 = z;
                        LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z10 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z10 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical9, horizontal12, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                        LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                        if (onPostMeasureListener != null) {
                            onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                        }
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                    }
                }, composer2, i18, 0);
                horizontal6 = horizontal4;
                vertical6 = vertical3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Arrangement.Horizontal horizontal14 = horizontal5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.2
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

                public final void invoke(@Nullable Composer composer3, int i19) {
                    LazyListKt.LazyList(state, modifier, lazyListState, paddingValues, z, z2, flingBehavior, horizontal6, vertical6, vertical5, horizontal14, composer3, i | 1, i2, i3);
                }
            });
        }
        i5 = 196608;
        i4 |= i5;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (composerStartRestartGroup.changed(flingBehavior)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        i7 = i3 & 128;
        if (i7 != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
                horizontal3 = horizontal2;
            } else {
                horizontal3 = horizontal2;
                if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changed(horizontal3)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
            }
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if (i7 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal;
                }
                if (i9 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i11 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i13 == 0) {
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory4 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SubcomposeLayoutState(2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SubcomposeLayoutState subcomposeLayoutState4 = (SubcomposeLayoutState) objRememberedValue;
                int i19 = SubcomposeLayoutState.$stable;
                LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory4, subcomposeLayoutState4, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i19 << 9));
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                    objRememberedValue2 = compositionScopedCoroutineScopeCanceller4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLazyListSemantics4 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope4, z2);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                boolean z8 = z4;
                composer2 = composerStartRestartGroup;
                final Arrangement.Vertical vertical10 = vertical3;
                final Arrangement.Horizontal horizontal15 = horizontal5;
                final Alignment.Horizontal horizontal16 = horizontal4;
                vertical5 = vertical4;
                SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState4, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics4, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z8, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        float spacing;
                        ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                        LazyListItemsProvider value = state.getValue();
                        lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                        lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                        lazyListItemContentFactoryRememberItemContentFactory4.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                        final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                        if (z2) {
                            Arrangement.Vertical vertical11 = vertical10;
                            if (vertical11 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = vertical11.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal17 = horizontal15;
                            if (horizontal17 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = horizontal17.getSpacing();
                        }
                        final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                        final int itemsCount = value.getItemsCount();
                        final boolean z9 = z2;
                        LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory4;
                        final Alignment.Horizontal horizontal18 = horizontal16;
                        final Alignment.Vertical vertical12 = vertical5;
                        final boolean z10 = z;
                        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z9, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                            @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                            @NotNull
                            /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                            public final LazyMeasuredItem mo355createItemHK0c1C0(int i110, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                                return new LazyMeasuredItem(i110, placeableArr, z9, horizontal18, vertical12, subcomposeMeasureScope.getLayoutDirection(), z10, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i110 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                            }
                        }, null);
                        boolean z11 = z;
                        LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z11 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z11 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical10, horizontal15, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                        LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                        if (onPostMeasureListener != null) {
                            onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                        }
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                    }
                }, composer2, i19, 0);
                horizontal6 = horizontal4;
                vertical6 = vertical3;
            } else {
                if (i7 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal;
                }
                if (i9 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i11 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i13 == 0) {
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory5 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SubcomposeLayoutState(2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SubcomposeLayoutState subcomposeLayoutState5 = (SubcomposeLayoutState) objRememberedValue;
                int i110 = SubcomposeLayoutState.$stable;
                LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory5, subcomposeLayoutState5, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i110 << 9));
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                    objRememberedValue2 = compositionScopedCoroutineScopeCanceller5;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLazyListSemantics5 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope5, z2);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                boolean z9 = z4;
                composer2 = composerStartRestartGroup;
                final Arrangement.Vertical vertical11 = vertical3;
                final Arrangement.Horizontal horizontal17 = horizontal5;
                final Alignment.Horizontal horizontal18 = horizontal4;
                vertical5 = vertical4;
                SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState5, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics5, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z9, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        float spacing;
                        ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                        LazyListItemsProvider value = state.getValue();
                        lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                        lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                        lazyListItemContentFactoryRememberItemContentFactory5.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                        final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                        int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                        if (z2) {
                            Arrangement.Vertical vertical12 = vertical11;
                            if (vertical12 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = vertical12.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal19 = horizontal17;
                            if (horizontal19 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            spacing = horizontal19.getSpacing();
                        }
                        final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                        final int itemsCount = value.getItemsCount();
                        final boolean z10 = z2;
                        LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory5;
                        final Alignment.Horizontal horizontal110 = horizontal18;
                        final Alignment.Vertical vertical13 = vertical5;
                        final boolean z11 = z;
                        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z10, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                            @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                            @NotNull
                            /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                            public final LazyMeasuredItem mo355createItemHK0c1C0(int i111, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                                return new LazyMeasuredItem(i111, placeableArr, z10, horizontal110, vertical13, subcomposeMeasureScope.getLayoutDirection(), z11, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i111 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                            }
                        }, null);
                        boolean z12 = z;
                        LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z12 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z12 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical11, horizontal17, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                        LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                        if (onPostMeasureListener != null) {
                            onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                        }
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                    }
                }, composer2, i110, 0);
                horizontal6 = horizontal4;
                vertical6 = vertical3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Arrangement.Horizontal horizontal19 = horizontal5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.2
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

                public final void invoke(@Nullable Composer composer3, int i111) {
                    LazyListKt.LazyList(state, modifier, lazyListState, paddingValues, z, z2, flingBehavior, horizontal6, vertical6, vertical5, horizontal19, composer3, i | 1, i2, i3);
                }
            });
        }
        i4 |= 12582912;
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(vertical)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i4 |= i10;
        }
        i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(vertical2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
            horizontal3 = horizontal2;
        } else {
            horizontal3 = horizontal2;
            if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changed(horizontal3)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
        }
        if (((i4 & 1533916891) ^ 306783378) != 0) {
            if (i7 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal;
            }
            if (i9 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i11 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i13 == 0) {
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (z) {
                z4 = true;
            } else {
                z4 = false;
            }
            final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory6 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState(2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState6 = (SubcomposeLayoutState) objRememberedValue;
            int i111 = SubcomposeLayoutState.$stable;
            LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory6, subcomposeLayoutState6, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i111 << 9));
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLazyListSemantics6 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope6, z2);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            boolean z10 = z4;
            composer2 = composerStartRestartGroup;
            final Arrangement.Vertical vertical12 = vertical3;
            final Arrangement.Horizontal horizontal110 = horizontal5;
            final Alignment.Horizontal horizontal111 = horizontal4;
            vertical5 = vertical4;
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState6, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics6, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z10, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                    return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                    float spacing;
                    ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                    LazyListItemsProvider value = state.getValue();
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                    lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                    lazyListItemContentFactoryRememberItemContentFactory6.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                    final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                    int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                    if (z2) {
                        Arrangement.Vertical vertical13 = vertical12;
                        if (vertical13 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical13.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal112 = horizontal110;
                        if (horizontal112 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal112.getSpacing();
                    }
                    final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                    final int itemsCount = value.getItemsCount();
                    final boolean z11 = z2;
                    LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory6;
                    final Alignment.Horizontal horizontal113 = horizontal111;
                    final Alignment.Vertical vertical14 = vertical5;
                    final boolean z12 = z;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z11, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo355createItemHK0c1C0(int i112, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                            return new LazyMeasuredItem(i112, placeableArr, z11, horizontal113, vertical14, subcomposeMeasureScope.getLayoutDirection(), z12, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i112 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                        }
                    }, null);
                    boolean z13 = z;
                    LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z13 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z13 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical12, horizontal110, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                    lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                    LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                    if (onPostMeasureListener != null) {
                        onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                    }
                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                }
            }, composer2, i111, 0);
            horizontal6 = horizontal4;
            vertical6 = vertical3;
        } else {
            if (i7 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal;
            }
            if (i9 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i11 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i13 == 0) {
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (z) {
                z4 = true;
            } else {
                z4 = false;
            }
            final LazyListItemContentFactory lazyListItemContentFactoryRememberItemContentFactory7 = LazyListItemContentFactoryKt.rememberItemContentFactory(state, lazyListState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState(2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState7 = (SubcomposeLayoutState) objRememberedValue;
            int i112 = SubcomposeLayoutState.$stable;
            LazyListPrefetcher_androidKt.LazyListPrefetcher(lazyListState, state, lazyListItemContentFactoryRememberItemContentFactory7, subcomposeLayoutState7, composerStartRestartGroup, ((i4 << 3) & 112) | ((i4 >> 6) & 14) | 512 | (i112 << 9));
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLazyListSemantics7 = LazySemanticsKt.lazyListSemantics(modifier, state, lazyListState, coroutineScope7, z2);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            boolean z11 = z4;
            composer2 = composerStartRestartGroup;
            final Arrangement.Vertical vertical13 = vertical3;
            final Arrangement.Horizontal horizontal112 = horizontal5;
            final Alignment.Horizontal horizontal113 = horizontal4;
            vertical5 = vertical4;
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState7, PaddingKt.padding(ScrollKt.clipScrollableContainer(ScrollableKt.scrollable(modifierLazyListSemantics7, lazyListState, orientation, (16 & 4) != 0, (16 & 8) != 0 ? false : z11, (16 & 16) != 0 ? null : flingBehavior, (16 & 32) != 0 ? null : lazyListState.getInternalInteractionSource()), z2), paddingValues).then(lazyListState.getRemeasurementModifier()), new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                    return m354invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final MeasureResult m354invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                    float spacing;
                    ScrollKt.m146assertNotNestingScrollableContainersK40F9xA(j, z2);
                    LazyListItemsProvider value = state.getValue();
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                    lazyListState.setDensity$foundation_release(DensityKt.Density(subcomposeMeasureScope.getDensity(), subcomposeMeasureScope.getFontScale()));
                    lazyListItemContentFactoryRememberItemContentFactory7.m353updateItemScope0kLqBqw(subcomposeMeasureScope, j);
                    final int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(z2 ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, subcomposeMeasureScope.getLayoutDirection()));
                    int iM2934getMaxHeightimpl = z2 ? Constraints.m2934getMaxHeightimpl(j) : Constraints.m2935getMaxWidthimpl(j);
                    if (z2) {
                        Arrangement.Vertical vertical14 = vertical13;
                        if (vertical14 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical14.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal114 = horizontal112;
                        if (horizontal114 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal114.getSpacing();
                    }
                    final int iMo188roundToPx0680j_6 = subcomposeMeasureScope.mo188roundToPx0680j_4(spacing);
                    final int itemsCount = value.getItemsCount();
                    final boolean z12 = z2;
                    LazyListItemContentFactory lazyListItemContentFactory = lazyListItemContentFactoryRememberItemContentFactory7;
                    final Alignment.Horizontal horizontal115 = horizontal113;
                    final Alignment.Vertical vertical15 = vertical5;
                    final boolean z13 = z;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(j, z12, subcomposeMeasureScope, value, lazyListItemContentFactory, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1$itemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo355createItemHK0c1C0(int i113, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                            return new LazyMeasuredItem(i113, placeableArr, z12, horizontal115, vertical15, subcomposeMeasureScope.getLayoutDirection(), z13, iMo188roundToPx0680j_4, iMo188roundToPx0680j_5, i113 == itemsCount + (-1) ? 0 : iMo188roundToPx0680j_6, obj);
                        }
                    }, null);
                    boolean z14 = z;
                    LazyListMeasureResult lazyListMeasureResultM356measureLazyList9CW8viI = LazyListMeasureKt.m356measureLazyList9CW8viI(itemsCount, lazyMeasuredItemProvider, iM2934getMaxHeightimpl, z14 ? iMo188roundToPx0680j_5 : iMo188roundToPx0680j_4, z14 ? iMo188roundToPx0680j_4 : iMo188roundToPx0680j_5, lazyListState.m363getFirstVisibleItemIndexNonObservablejQJCoq8$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed(), j, z2, value.getHeaderIndexes(), vertical13, horizontal112, z, subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                    lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM356measureLazyList9CW8viI);
                    LazyListOnPostMeasureListener onPostMeasureListener = lazyListState.getOnPostMeasureListener();
                    if (onPostMeasureListener != null) {
                        onPostMeasureListener.mo357onPostMeasureVKLhPVY(subcomposeMeasureScope, lazyMeasuredItemProvider.getChildConstraints(), lazyListMeasureResultM356measureLazyList9CW8viI);
                    }
                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutWidth(), lazyListMeasureResultM356measureLazyList9CW8viI.getLayoutHeight(), null, lazyListMeasureResultM356measureLazyList9CW8viI.getPlacementBlock(), 4, null);
                }
            }, composer2, i112, 0);
            horizontal6 = horizontal4;
            vertical6 = vertical3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Arrangement.Horizontal horizontal114 = horizontal5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.2
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

            public final void invoke(@Nullable Composer composer3, int i113) {
                LazyListKt.LazyList(state, modifier, lazyListState, paddingValues, z, z2, flingBehavior, horizontal6, vertical6, vertical5, horizontal114, composer3, i | 1, i2, i3);
            }
        });
    }
}
