package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0092\u0001\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a:\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "secondaryText", "", "singleLineSecondaryText", "overlineText", "trailing", "text", "ListItem", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "Landroidx/compose/ui/unit/Dp;", "offsets", "content", "BaselinesOffsetColumn", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "contentAlpha", "applyTextStyle", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 5, 1})
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1429219649);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i3) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i3) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list2, long j) {
                int height;
                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Measurable) it2.next()).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                }
                Iterator it3 = arrayList.iterator();
                int iMax = 0;
                while (it3.hasNext()) {
                    iMax = Math.max(iMax, ((Placeable) it3.next()).getWidth());
                }
                int size = arrayList.size();
                final Integer[] numArr = new Integer[size];
                for (int i3 = 0; i3 < size; i3++) {
                    numArr[i3] = 0;
                }
                List<Dp> list3 = list;
                int size2 = arrayList.size() - 1;
                int i4 = 0;
                if (size2 >= 0) {
                    int height2 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        Placeable placeable = (Placeable) arrayList.get(i4);
                        if (i4 > 0) {
                            int i6 = i4 - 1;
                            height = ((Placeable) arrayList.get(i6)).getHeight() - ((Placeable) arrayList.get(i6)).get(AlignmentLineKt.getLastBaseline());
                        } else {
                            height = 0;
                        }
                        int iMax2 = Math.max(0, (measureScope.mo188roundToPx0680j_4(list3.get(i4).m2979unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - height);
                        numArr[i4] = Integer.valueOf(iMax2 + height2);
                        height2 += iMax2 + placeable.getHeight();
                        if (i5 > size2) {
                            break;
                        }
                        i4 = i5;
                    }
                    i4 = height2;
                }
                return MeasureScope.DefaultImpls.layout$default(measureScope, iMax, i4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$measure$2
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
                        List<Placeable> list4 = arrayList;
                        Integer[] numArr2 = numArr;
                        int size3 = list4.size() - 1;
                        if (size3 < 0) {
                            return;
                        }
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            Placeable.PlacementScope.placeRelative$default(placementScope, list4.get(i7), 0, numArr2[i7].intValue(), 0.0f, 4, null);
                            if (i8 > size3) {
                                return;
                            } else {
                                i7 = i8;
                            }
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i3) {
                return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i3) {
                return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
        int i3 = ((((i >> 6) & 14) | (i & 112)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
        Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 112));
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.2
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

            public final void invoke(@Nullable Composer composer2, int i4) {
                ListItemKt.BaselinesOffsetColumn(list, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:107:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    @Composable
    @ExperimentalMaterialApi
    public static final void ListItem(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @NotNull final Function2<? super Composer, ? super Integer, Unit> function6, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        int i9;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function10;
        int i11;
        int i12;
        final Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function11;
        boolean z3;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle2;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle3;
        Function2<Composer, Integer, Unit> function2ApplyTextStyle4;
        Modifier modifierSemantics;
        Function2<? super Composer, ? super Integer, Unit> function12;
        final Function2<? super Composer, ? super Integer, Unit> function13;
        final Function2<? super Composer, ? super Integer, Unit> function14;
        final Function2<? super Composer, ? super Integer, Unit> function15;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-210281469);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                function7 = function2;
                i3 |= composerStartRestartGroup.changed(function7) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function8 = function3;
                    if (composerStartRestartGroup.changed(function8)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            function9 = function4;
                            if (composerStartRestartGroup.changed(function9)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((458752 & i) == 0) {
                                function10 = function5;
                                if (composerStartRestartGroup.changed(function10)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((i2 & 64) != 0) {
                                if ((i & 3670016) == 0) {
                                    if (composerStartRestartGroup.changed(function6)) {
                                        i12 = 1048576;
                                    } else {
                                        i12 = 524288;
                                    }
                                }
                                if (((i3 & 2995931) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                                    if (i13 != 0) {
                                        modifier3 = Modifier.INSTANCE;
                                    } else {
                                        modifier3 = modifier2;
                                    }
                                    if (i14 != 0) {
                                        function7 = null;
                                    }
                                    if (i4 != 0) {
                                        function11 = null;
                                    } else {
                                        function11 = function8;
                                    }
                                    if (i6 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (i8 != 0) {
                                        function9 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function17 = i10 == 0 ? function10 : null;
                                    Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                    TextStyle subtitle1 = typography.getSubtitle1();
                                    ContentAlpha contentAlpha = ContentAlpha.INSTANCE;
                                    function2ApplyTextStyle = applyTextStyle(subtitle1, contentAlpha.getHigh(composerStartRestartGroup, 0), function6);
                                    function2ApplyTextStyle2 = applyTextStyle(typography.getBody2(), contentAlpha.getMedium(composerStartRestartGroup, 0), function11);
                                    function2ApplyTextStyle3 = applyTextStyle(typography.getOverline(), contentAlpha.getHigh(composerStartRestartGroup, 0), function9);
                                    function2ApplyTextStyle4 = applyTextStyle(typography.getCaption(), contentAlpha.getHigh(composerStartRestartGroup, 0), function17);
                                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        }
                                    });
                                    if (function2ApplyTextStyle2 == null || function2ApplyTextStyle3 != null) {
                                        function12 = function9;
                                        if ((function2ApplyTextStyle3 == null || !z3) && function2ApplyTextStyle2 != null) {
                                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                            composerStartRestartGroup.endReplaceableGroup();
                                        } else {
                                            composerStartRestartGroup.startReplaceableGroup(-210280382);
                                            TwoLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                            composerStartRestartGroup.endReplaceableGroup();
                                        }
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280579);
                                        function12 = function9;
                                        OneLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                    function13 = function17;
                                    function14 = function11;
                                    function15 = function7;
                                    z4 = z3;
                                    function16 = function12;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                    function15 = function7;
                                    function14 = function8;
                                    z4 = z2;
                                    function16 = function9;
                                    function13 = function10;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                    public final void invoke(@Nullable Composer composer2, int i15) {
                                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                    }
                                });
                            }
                            i12 = 1572864;
                            i3 |= i12;
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle2 = typography2.getSubtitle1();
                                ContentAlpha contentAlpha2 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle2, contentAlpha2.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography2.getBody2(), contentAlpha2.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography2.getOverline(), contentAlpha2.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography2.getCaption(), contentAlpha2.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle3 = typography3.getSubtitle1();
                                ContentAlpha contentAlpha3 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle3, contentAlpha3.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography3.getBody2(), contentAlpha3.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography3.getOverline(), contentAlpha3.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography3.getCaption(), contentAlpha3.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i3 |= 196608;
                        function10 = function5;
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(function6)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle4 = typography4.getSubtitle1();
                                ContentAlpha contentAlpha4 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle4, contentAlpha4.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography4.getBody2(), contentAlpha4.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography4.getOverline(), contentAlpha4.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography4.getCaption(), contentAlpha4.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle5 = typography5.getSubtitle1();
                                ContentAlpha contentAlpha5 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle5, contentAlpha5.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography5.getBody2(), contentAlpha5.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography5.getOverline(), contentAlpha5.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography5.getCaption(), contentAlpha5.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i12 = 1572864;
                        i3 |= i12;
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle6 = typography6.getSubtitle1();
                            ContentAlpha contentAlpha6 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle6, contentAlpha6.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography6.getBody2(), contentAlpha6.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography6.getOverline(), contentAlpha6.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography6.getCaption(), contentAlpha6.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle7 = typography7.getSubtitle1();
                            ContentAlpha contentAlpha7 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle7, contentAlpha7.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography7.getBody2(), contentAlpha7.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography7.getOverline(), contentAlpha7.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography7.getCaption(), contentAlpha7.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    function9 = function4;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((458752 & i) == 0) {
                            function10 = function5;
                            if (composerStartRestartGroup.changed(function10)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(function6)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle8 = typography8.getSubtitle1();
                                ContentAlpha contentAlpha8 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle8, contentAlpha8.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography8.getBody2(), contentAlpha8.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography8.getOverline(), contentAlpha8.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography8.getCaption(), contentAlpha8.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle9 = typography9.getSubtitle1();
                                ContentAlpha contentAlpha9 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle9, contentAlpha9.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography9.getBody2(), contentAlpha9.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography9.getOverline(), contentAlpha9.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography9.getCaption(), contentAlpha9.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i12 = 1572864;
                        i3 |= i12;
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle10 = typography10.getSubtitle1();
                            ContentAlpha contentAlpha10 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle10, contentAlpha10.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography10.getBody2(), contentAlpha10.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography10.getOverline(), contentAlpha10.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography10.getCaption(), contentAlpha10.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11 = typography11.getSubtitle1();
                            ContentAlpha contentAlpha11 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11, contentAlpha11.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11.getBody2(), contentAlpha11.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11.getOverline(), contentAlpha11.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11.getCaption(), contentAlpha11.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    function10 = function5;
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle12 = typography12.getSubtitle1();
                            ContentAlpha contentAlpha12 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle12, contentAlpha12.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography12.getBody2(), contentAlpha12.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography12.getOverline(), contentAlpha12.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography12.getCaption(), contentAlpha12.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle13 = typography13.getSubtitle1();
                            ContentAlpha contentAlpha13 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle13, contentAlpha13.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography13.getBody2(), contentAlpha13.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography13.getOverline(), contentAlpha13.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography13.getCaption(), contentAlpha13.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle14 = typography14.getSubtitle1();
                        ContentAlpha contentAlpha14 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle14, contentAlpha14.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography14.getBody2(), contentAlpha14.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography14.getOverline(), contentAlpha14.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography14.getCaption(), contentAlpha14.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle15 = typography15.getSubtitle1();
                        ContentAlpha contentAlpha15 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle15, contentAlpha15.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography15.getBody2(), contentAlpha15.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography15.getOverline(), contentAlpha15.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography15.getCaption(), contentAlpha15.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                z2 = z;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function9 = function4;
                        if (composerStartRestartGroup.changed(function9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((458752 & i) == 0) {
                            function10 = function5;
                            if (composerStartRestartGroup.changed(function10)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(function6)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography16 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle16 = typography16.getSubtitle1();
                                ContentAlpha contentAlpha16 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle16, contentAlpha16.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography16.getBody2(), contentAlpha16.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography16.getOverline(), contentAlpha16.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography16.getCaption(), contentAlpha16.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography17 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle17 = typography17.getSubtitle1();
                                ContentAlpha contentAlpha17 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle17, contentAlpha17.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography17.getBody2(), contentAlpha17.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography17.getOverline(), contentAlpha17.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography17.getCaption(), contentAlpha17.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i12 = 1572864;
                        i3 |= i12;
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography18 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle18 = typography18.getSubtitle1();
                            ContentAlpha contentAlpha18 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle18, contentAlpha18.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography18.getBody2(), contentAlpha18.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography18.getOverline(), contentAlpha18.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography18.getCaption(), contentAlpha18.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography19 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle19 = typography19.getSubtitle1();
                            ContentAlpha contentAlpha19 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle19, contentAlpha19.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography19.getBody2(), contentAlpha19.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography19.getOverline(), contentAlpha19.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography19.getCaption(), contentAlpha19.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    function10 = function5;
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle110 = typography110.getSubtitle1();
                            ContentAlpha contentAlpha110 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle110, contentAlpha110.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography110.getBody2(), contentAlpha110.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography110.getOverline(), contentAlpha110.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography110.getCaption(), contentAlpha110.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle111 = typography111.getSubtitle1();
                            ContentAlpha contentAlpha111 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle111, contentAlpha111.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography111.getBody2(), contentAlpha111.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography111.getOverline(), contentAlpha111.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography111.getCaption(), contentAlpha111.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle112 = typography112.getSubtitle1();
                        ContentAlpha contentAlpha112 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle112, contentAlpha112.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography112.getBody2(), contentAlpha112.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography112.getOverline(), contentAlpha112.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography112.getCaption(), contentAlpha112.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle113 = typography113.getSubtitle1();
                        ContentAlpha contentAlpha113 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle113, contentAlpha113.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography113.getBody2(), contentAlpha113.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography113.getOverline(), contentAlpha113.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography113.getCaption(), contentAlpha113.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                function9 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle114 = typography114.getSubtitle1();
                            ContentAlpha contentAlpha114 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle114, contentAlpha114.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography114.getBody2(), contentAlpha114.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography114.getOverline(), contentAlpha114.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography114.getCaption(), contentAlpha114.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle115 = typography115.getSubtitle1();
                            ContentAlpha contentAlpha115 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle115, contentAlpha115.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography115.getBody2(), contentAlpha115.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography115.getOverline(), contentAlpha115.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography115.getCaption(), contentAlpha115.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle116 = typography116.getSubtitle1();
                        ContentAlpha contentAlpha116 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle116, contentAlpha116.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography116.getBody2(), contentAlpha116.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography116.getOverline(), contentAlpha116.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography116.getCaption(), contentAlpha116.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle117 = typography117.getSubtitle1();
                        ContentAlpha contentAlpha117 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle117, contentAlpha117.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography117.getBody2(), contentAlpha117.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography117.getOverline(), contentAlpha117.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography117.getCaption(), contentAlpha117.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle118 = typography118.getSubtitle1();
                        ContentAlpha contentAlpha118 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle118, contentAlpha118.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography118.getBody2(), contentAlpha118.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography118.getOverline(), contentAlpha118.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography118.getCaption(), contentAlpha118.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle119 = typography119.getSubtitle1();
                        ContentAlpha contentAlpha119 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle119, contentAlpha119.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography119.getBody2(), contentAlpha119.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography119.getOverline(), contentAlpha119.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography119.getCaption(), contentAlpha119.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1110 = typography1110.getSubtitle1();
                    ContentAlpha contentAlpha1110 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1110, contentAlpha1110.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1110.getBody2(), contentAlpha1110.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1110.getOverline(), contentAlpha1110.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1110.getCaption(), contentAlpha1110.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111 = typography1111.getSubtitle1();
                    ContentAlpha contentAlpha1111 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111, contentAlpha1111.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111.getBody2(), contentAlpha1111.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111.getOverline(), contentAlpha1111.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111.getCaption(), contentAlpha1111.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            function8 = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function9 = function4;
                        if (composerStartRestartGroup.changed(function9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((458752 & i) == 0) {
                            function10 = function5;
                            if (composerStartRestartGroup.changed(function10)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(function6)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography1112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle1112 = typography1112.getSubtitle1();
                                ContentAlpha contentAlpha1112 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle1112, contentAlpha1112.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography1112.getBody2(), contentAlpha1112.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography1112.getOverline(), contentAlpha1112.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography1112.getCaption(), contentAlpha1112.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography1113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle1113 = typography1113.getSubtitle1();
                                ContentAlpha contentAlpha1113 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle1113, contentAlpha1113.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography1113.getBody2(), contentAlpha1113.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography1113.getOverline(), contentAlpha1113.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography1113.getCaption(), contentAlpha1113.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i12 = 1572864;
                        i3 |= i12;
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1114 = typography1114.getSubtitle1();
                            ContentAlpha contentAlpha1114 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1114, contentAlpha1114.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1114.getBody2(), contentAlpha1114.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1114.getOverline(), contentAlpha1114.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1114.getCaption(), contentAlpha1114.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1115 = typography1115.getSubtitle1();
                            ContentAlpha contentAlpha1115 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1115, contentAlpha1115.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1115.getBody2(), contentAlpha1115.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1115.getOverline(), contentAlpha1115.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1115.getCaption(), contentAlpha1115.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    function10 = function5;
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1116 = typography1116.getSubtitle1();
                            ContentAlpha contentAlpha1116 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1116, contentAlpha1116.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1116.getBody2(), contentAlpha1116.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1116.getOverline(), contentAlpha1116.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1116.getCaption(), contentAlpha1116.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1117 = typography1117.getSubtitle1();
                            ContentAlpha contentAlpha1117 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1117, contentAlpha1117.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1117.getBody2(), contentAlpha1117.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1117.getOverline(), contentAlpha1117.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1117.getCaption(), contentAlpha1117.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography1118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle1118 = typography1118.getSubtitle1();
                        ContentAlpha contentAlpha1118 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle1118, contentAlpha1118.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography1118.getBody2(), contentAlpha1118.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography1118.getOverline(), contentAlpha1118.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography1118.getCaption(), contentAlpha1118.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography1119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle1119 = typography1119.getSubtitle1();
                        ContentAlpha contentAlpha1119 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle1119, contentAlpha1119.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography1119.getBody2(), contentAlpha1119.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography1119.getOverline(), contentAlpha1119.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography1119.getCaption(), contentAlpha1119.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                function9 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11110 = typography11110.getSubtitle1();
                            ContentAlpha contentAlpha11110 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11110, contentAlpha11110.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11110.getBody2(), contentAlpha11110.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11110.getOverline(), contentAlpha11110.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11110.getCaption(), contentAlpha11110.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11111 = typography11111.getSubtitle1();
                            ContentAlpha contentAlpha11111 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11111, contentAlpha11111.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11111.getBody2(), contentAlpha11111.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11111.getOverline(), contentAlpha11111.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11111.getCaption(), contentAlpha11111.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11112 = typography11112.getSubtitle1();
                        ContentAlpha contentAlpha11112 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11112, contentAlpha11112.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11112.getBody2(), contentAlpha11112.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11112.getOverline(), contentAlpha11112.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11112.getCaption(), contentAlpha11112.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11113 = typography11113.getSubtitle1();
                        ContentAlpha contentAlpha11113 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11113, contentAlpha11113.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11113.getBody2(), contentAlpha11113.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11113.getOverline(), contentAlpha11113.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11113.getCaption(), contentAlpha11113.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11114 = typography11114.getSubtitle1();
                        ContentAlpha contentAlpha11114 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11114, contentAlpha11114.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11114.getBody2(), contentAlpha11114.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11114.getOverline(), contentAlpha11114.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11114.getCaption(), contentAlpha11114.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11115 = typography11115.getSubtitle1();
                        ContentAlpha contentAlpha11115 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11115, contentAlpha11115.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11115.getBody2(), contentAlpha11115.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11115.getOverline(), contentAlpha11115.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11115.getCaption(), contentAlpha11115.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11116 = typography11116.getSubtitle1();
                    ContentAlpha contentAlpha11116 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11116, contentAlpha11116.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11116.getBody2(), contentAlpha11116.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11116.getOverline(), contentAlpha11116.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11116.getCaption(), contentAlpha11116.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11117 = typography11117.getSubtitle1();
                    ContentAlpha contentAlpha11117 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11117, contentAlpha11117.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11117.getBody2(), contentAlpha11117.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11117.getOverline(), contentAlpha11117.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11117.getCaption(), contentAlpha11117.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function9 = function4;
                    if (composerStartRestartGroup.changed(function9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11118 = typography11118.getSubtitle1();
                            ContentAlpha contentAlpha11118 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11118, contentAlpha11118.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11118.getBody2(), contentAlpha11118.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11118.getOverline(), contentAlpha11118.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11118.getCaption(), contentAlpha11118.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11119 = typography11119.getSubtitle1();
                            ContentAlpha contentAlpha11119 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11119, contentAlpha11119.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11119.getBody2(), contentAlpha11119.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11119.getOverline(), contentAlpha11119.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11119.getCaption(), contentAlpha11119.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111110 = typography111110.getSubtitle1();
                        ContentAlpha contentAlpha111110 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111110, contentAlpha111110.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111110.getBody2(), contentAlpha111110.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111110.getOverline(), contentAlpha111110.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111110.getCaption(), contentAlpha111110.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111 = typography111111.getSubtitle1();
                        ContentAlpha contentAlpha111111 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111, contentAlpha111111.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111.getBody2(), contentAlpha111111.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111.getOverline(), contentAlpha111111.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111.getCaption(), contentAlpha111111.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111112 = typography111112.getSubtitle1();
                        ContentAlpha contentAlpha111112 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111112, contentAlpha111112.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111112.getBody2(), contentAlpha111112.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111112.getOverline(), contentAlpha111112.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111112.getCaption(), contentAlpha111112.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111113 = typography111113.getSubtitle1();
                        ContentAlpha contentAlpha111113 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111113, contentAlpha111113.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111113.getBody2(), contentAlpha111113.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111113.getOverline(), contentAlpha111113.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111113.getCaption(), contentAlpha111113.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111114 = typography111114.getSubtitle1();
                    ContentAlpha contentAlpha111114 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111114, contentAlpha111114.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111114.getBody2(), contentAlpha111114.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111114.getOverline(), contentAlpha111114.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111114.getCaption(), contentAlpha111114.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111115 = typography111115.getSubtitle1();
                    ContentAlpha contentAlpha111115 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111115, contentAlpha111115.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111115.getBody2(), contentAlpha111115.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111115.getOverline(), contentAlpha111115.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111115.getCaption(), contentAlpha111115.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            function9 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((458752 & i) == 0) {
                    function10 = function5;
                    if (composerStartRestartGroup.changed(function10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111116 = typography111116.getSubtitle1();
                        ContentAlpha contentAlpha111116 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111116, contentAlpha111116.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111116.getBody2(), contentAlpha111116.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111116.getOverline(), contentAlpha111116.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111116.getCaption(), contentAlpha111116.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111117 = typography111117.getSubtitle1();
                        ContentAlpha contentAlpha111117 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111117, contentAlpha111117.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111117.getBody2(), contentAlpha111117.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111117.getOverline(), contentAlpha111117.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111117.getCaption(), contentAlpha111117.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111118 = typography111118.getSubtitle1();
                    ContentAlpha contentAlpha111118 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111118, contentAlpha111118.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111118.getBody2(), contentAlpha111118.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111118.getOverline(), contentAlpha111118.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111118.getCaption(), contentAlpha111118.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111119 = typography111119.getSubtitle1();
                    ContentAlpha contentAlpha111119 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111119, contentAlpha111119.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111119.getBody2(), contentAlpha111119.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111119.getOverline(), contentAlpha111119.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111119.getCaption(), contentAlpha111119.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function10 = function5;
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111110 = typography1111110.getSubtitle1();
                    ContentAlpha contentAlpha1111110 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111110, contentAlpha1111110.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111110.getBody2(), contentAlpha1111110.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111110.getOverline(), contentAlpha1111110.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111110.getCaption(), contentAlpha1111110.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111 = typography1111111.getSubtitle1();
                    ContentAlpha contentAlpha1111111 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111, contentAlpha1111111.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111.getBody2(), contentAlpha1111111.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111.getOverline(), contentAlpha1111111.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111.getCaption(), contentAlpha1111111.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111112 = typography1111112.getSubtitle1();
                ContentAlpha contentAlpha1111112 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111112, contentAlpha1111112.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111112.getBody2(), contentAlpha1111112.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111112.getOverline(), contentAlpha1111112.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111112.getCaption(), contentAlpha1111112.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111113 = typography1111113.getSubtitle1();
                ContentAlpha contentAlpha1111113 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111113, contentAlpha1111113.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111113.getBody2(), contentAlpha1111113.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111113.getOverline(), contentAlpha1111113.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111113.getCaption(), contentAlpha1111113.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        function7 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function8 = function3;
                if (composerStartRestartGroup.changed(function8)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function9 = function4;
                        if (composerStartRestartGroup.changed(function9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((458752 & i) == 0) {
                            function10 = function5;
                            if (composerStartRestartGroup.changed(function10)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(function6)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                            }
                            if (((i3 & 2995931) ^ 599186) == 0) {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography1111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle1111114 = typography1111114.getSubtitle1();
                                ContentAlpha contentAlpha1111114 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle1111114, contentAlpha1111114.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography1111114.getBody2(), contentAlpha1111114.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography1111114.getOverline(), contentAlpha1111114.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography1111114.getCaption(), contentAlpha1111114.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            } else {
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i14 != 0) {
                                    function7 = null;
                                }
                                if (i4 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function8;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    function9 = null;
                                }
                                if (i10 == 0) {
                                }
                                Typography typography1111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                                TextStyle subtitle1111115 = typography1111115.getSubtitle1();
                                ContentAlpha contentAlpha1111115 = ContentAlpha.INSTANCE;
                                function2ApplyTextStyle = applyTextStyle(subtitle1111115, contentAlpha1111115.getHigh(composerStartRestartGroup, 0), function6);
                                function2ApplyTextStyle2 = applyTextStyle(typography1111115.getBody2(), contentAlpha1111115.getMedium(composerStartRestartGroup, 0), function11);
                                function2ApplyTextStyle3 = applyTextStyle(typography1111115.getOverline(), contentAlpha1111115.getHigh(composerStartRestartGroup, 0), function9);
                                function2ApplyTextStyle4 = applyTextStyle(typography1111115.getCaption(), contentAlpha1111115.getHigh(composerStartRestartGroup, 0), function17);
                                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }
                                });
                                if (function2ApplyTextStyle2 == null) {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    function12 = function9;
                                    if (function2ApplyTextStyle3 == null) {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                }
                                function13 = function17;
                                function14 = function11;
                                function15 = function7;
                                z4 = z3;
                                function16 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                                }
                            });
                        }
                        i12 = 1572864;
                        i3 |= i12;
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111116 = typography1111116.getSubtitle1();
                            ContentAlpha contentAlpha1111116 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111116, contentAlpha1111116.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111116.getBody2(), contentAlpha1111116.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111116.getOverline(), contentAlpha1111116.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111116.getCaption(), contentAlpha1111116.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111117 = typography1111117.getSubtitle1();
                            ContentAlpha contentAlpha1111117 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111117, contentAlpha1111117.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111117.getBody2(), contentAlpha1111117.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111117.getOverline(), contentAlpha1111117.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111117.getCaption(), contentAlpha1111117.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    function10 = function5;
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111118 = typography1111118.getSubtitle1();
                            ContentAlpha contentAlpha1111118 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111118, contentAlpha1111118.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111118.getBody2(), contentAlpha1111118.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111118.getOverline(), contentAlpha1111118.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111118.getCaption(), contentAlpha1111118.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111119 = typography1111119.getSubtitle1();
                            ContentAlpha contentAlpha1111119 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111119, contentAlpha1111119.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111119.getBody2(), contentAlpha1111119.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111119.getOverline(), contentAlpha1111119.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111119.getCaption(), contentAlpha1111119.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111110 = typography11111110.getSubtitle1();
                        ContentAlpha contentAlpha11111110 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111110, contentAlpha11111110.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111110.getBody2(), contentAlpha11111110.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111110.getOverline(), contentAlpha11111110.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111110.getCaption(), contentAlpha11111110.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111111 = typography11111111.getSubtitle1();
                        ContentAlpha contentAlpha11111111 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111111, contentAlpha11111111.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111111.getBody2(), contentAlpha11111111.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111111.getOverline(), contentAlpha11111111.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111111.getCaption(), contentAlpha11111111.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                function9 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11111112 = typography11111112.getSubtitle1();
                            ContentAlpha contentAlpha11111112 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11111112, contentAlpha11111112.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11111112.getBody2(), contentAlpha11111112.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11111112.getOverline(), contentAlpha11111112.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11111112.getCaption(), contentAlpha11111112.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography11111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle11111113 = typography11111113.getSubtitle1();
                            ContentAlpha contentAlpha11111113 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle11111113, contentAlpha11111113.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography11111113.getBody2(), contentAlpha11111113.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography11111113.getOverline(), contentAlpha11111113.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography11111113.getCaption(), contentAlpha11111113.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111114 = typography11111114.getSubtitle1();
                        ContentAlpha contentAlpha11111114 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111114, contentAlpha11111114.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111114.getBody2(), contentAlpha11111114.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111114.getOverline(), contentAlpha11111114.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111114.getCaption(), contentAlpha11111114.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111115 = typography11111115.getSubtitle1();
                        ContentAlpha contentAlpha11111115 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111115, contentAlpha11111115.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111115.getBody2(), contentAlpha11111115.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111115.getOverline(), contentAlpha11111115.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111115.getCaption(), contentAlpha11111115.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111116 = typography11111116.getSubtitle1();
                        ContentAlpha contentAlpha11111116 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111116, contentAlpha11111116.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111116.getBody2(), contentAlpha11111116.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111116.getOverline(), contentAlpha11111116.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111116.getCaption(), contentAlpha11111116.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111117 = typography11111117.getSubtitle1();
                        ContentAlpha contentAlpha11111117 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111117, contentAlpha11111117.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111117.getBody2(), contentAlpha11111117.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111117.getOverline(), contentAlpha11111117.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111117.getCaption(), contentAlpha11111117.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111118 = typography11111118.getSubtitle1();
                    ContentAlpha contentAlpha11111118 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111118, contentAlpha11111118.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111118.getBody2(), contentAlpha11111118.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111118.getOverline(), contentAlpha11111118.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111118.getCaption(), contentAlpha11111118.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111119 = typography11111119.getSubtitle1();
                    ContentAlpha contentAlpha11111119 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111119, contentAlpha11111119.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111119.getBody2(), contentAlpha11111119.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111119.getOverline(), contentAlpha11111119.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111119.getCaption(), contentAlpha11111119.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function9 = function4;
                    if (composerStartRestartGroup.changed(function9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography111111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle111111110 = typography111111110.getSubtitle1();
                            ContentAlpha contentAlpha111111110 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle111111110, contentAlpha111111110.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography111111110.getBody2(), contentAlpha111111110.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography111111110.getOverline(), contentAlpha111111110.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography111111110.getCaption(), contentAlpha111111110.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography111111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle111111111 = typography111111111.getSubtitle1();
                            ContentAlpha contentAlpha111111111 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle111111111, contentAlpha111111111.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography111111111.getBody2(), contentAlpha111111111.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography111111111.getOverline(), contentAlpha111111111.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography111111111.getCaption(), contentAlpha111111111.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111112 = typography111111112.getSubtitle1();
                        ContentAlpha contentAlpha111111112 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111112, contentAlpha111111112.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111112.getBody2(), contentAlpha111111112.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111112.getOverline(), contentAlpha111111112.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111112.getCaption(), contentAlpha111111112.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111113 = typography111111113.getSubtitle1();
                        ContentAlpha contentAlpha111111113 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111113, contentAlpha111111113.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111113.getBody2(), contentAlpha111111113.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111113.getOverline(), contentAlpha111111113.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111113.getCaption(), contentAlpha111111113.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111114 = typography111111114.getSubtitle1();
                        ContentAlpha contentAlpha111111114 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111114, contentAlpha111111114.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111114.getBody2(), contentAlpha111111114.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111114.getOverline(), contentAlpha111111114.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111114.getCaption(), contentAlpha111111114.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111115 = typography111111115.getSubtitle1();
                        ContentAlpha contentAlpha111111115 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111115, contentAlpha111111115.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111115.getBody2(), contentAlpha111111115.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111115.getOverline(), contentAlpha111111115.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111115.getCaption(), contentAlpha111111115.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111116 = typography111111116.getSubtitle1();
                    ContentAlpha contentAlpha111111116 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111116, contentAlpha111111116.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111116.getBody2(), contentAlpha111111116.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111116.getOverline(), contentAlpha111111116.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111116.getCaption(), contentAlpha111111116.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111117 = typography111111117.getSubtitle1();
                    ContentAlpha contentAlpha111111117 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111117, contentAlpha111111117.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111117.getBody2(), contentAlpha111111117.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111117.getOverline(), contentAlpha111111117.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111117.getCaption(), contentAlpha111111117.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            function9 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((458752 & i) == 0) {
                    function10 = function5;
                    if (composerStartRestartGroup.changed(function10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111118 = typography111111118.getSubtitle1();
                        ContentAlpha contentAlpha111111118 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111118, contentAlpha111111118.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111118.getBody2(), contentAlpha111111118.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111118.getOverline(), contentAlpha111111118.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111118.getCaption(), contentAlpha111111118.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111119 = typography111111119.getSubtitle1();
                        ContentAlpha contentAlpha111111119 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111119, contentAlpha111111119.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111119.getBody2(), contentAlpha111111119.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111119.getOverline(), contentAlpha111111119.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111119.getCaption(), contentAlpha111111119.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111110 = typography1111111110.getSubtitle1();
                    ContentAlpha contentAlpha1111111110 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111110, contentAlpha1111111110.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111110.getBody2(), contentAlpha1111111110.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111110.getOverline(), contentAlpha1111111110.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111110.getCaption(), contentAlpha1111111110.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111111 = typography1111111111.getSubtitle1();
                    ContentAlpha contentAlpha1111111111 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111111, contentAlpha1111111111.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111111.getBody2(), contentAlpha1111111111.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111111.getOverline(), contentAlpha1111111111.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111111.getCaption(), contentAlpha1111111111.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function10 = function5;
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111112 = typography1111111112.getSubtitle1();
                    ContentAlpha contentAlpha1111111112 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111112, contentAlpha1111111112.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111112.getBody2(), contentAlpha1111111112.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111112.getOverline(), contentAlpha1111111112.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111112.getCaption(), contentAlpha1111111112.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111113 = typography1111111113.getSubtitle1();
                    ContentAlpha contentAlpha1111111113 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111113, contentAlpha1111111113.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111113.getBody2(), contentAlpha1111111113.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111113.getOverline(), contentAlpha1111111113.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111113.getCaption(), contentAlpha1111111113.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111114 = typography1111111114.getSubtitle1();
                ContentAlpha contentAlpha1111111114 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111114, contentAlpha1111111114.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111114.getBody2(), contentAlpha1111111114.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111114.getOverline(), contentAlpha1111111114.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111114.getCaption(), contentAlpha1111111114.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111115 = typography1111111115.getSubtitle1();
                ContentAlpha contentAlpha1111111115 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111115, contentAlpha1111111115.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111115.getBody2(), contentAlpha1111111115.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111115.getOverline(), contentAlpha1111111115.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111115.getCaption(), contentAlpha1111111115.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        function8 = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function9 = function4;
                    if (composerStartRestartGroup.changed(function9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((458752 & i) == 0) {
                        function10 = function5;
                        if (composerStartRestartGroup.changed(function10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(function6)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if (((i3 & 2995931) ^ 599186) == 0) {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111111116 = typography1111111116.getSubtitle1();
                            ContentAlpha contentAlpha1111111116 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111111116, contentAlpha1111111116.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111111116.getBody2(), contentAlpha1111111116.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111111116.getOverline(), contentAlpha1111111116.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111111116.getCaption(), contentAlpha1111111116.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        } else {
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i14 != 0) {
                                function7 = null;
                            }
                            if (i4 != 0) {
                                function11 = null;
                            } else {
                                function11 = function8;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                function9 = null;
                            }
                            if (i10 == 0) {
                            }
                            Typography typography1111111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                            TextStyle subtitle1111111117 = typography1111111117.getSubtitle1();
                            ContentAlpha contentAlpha1111111117 = ContentAlpha.INSTANCE;
                            function2ApplyTextStyle = applyTextStyle(subtitle1111111117, contentAlpha1111111117.getHigh(composerStartRestartGroup, 0), function6);
                            function2ApplyTextStyle2 = applyTextStyle(typography1111111117.getBody2(), contentAlpha1111111117.getMedium(composerStartRestartGroup, 0), function11);
                            function2ApplyTextStyle3 = applyTextStyle(typography1111111117.getOverline(), contentAlpha1111111117.getHigh(composerStartRestartGroup, 0), function9);
                            function2ApplyTextStyle4 = applyTextStyle(typography1111111117.getCaption(), contentAlpha1111111117.getHigh(composerStartRestartGroup, 0), function17);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }
                            });
                            if (function2ApplyTextStyle2 == null) {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                function12 = function9;
                                if (function2ApplyTextStyle3 == null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            function13 = function17;
                            function14 = function11;
                            function15 = function7;
                            z4 = z3;
                            function16 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                            public final void invoke(@Nullable Composer composer2, int i15) {
                                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography1111111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle1111111118 = typography1111111118.getSubtitle1();
                        ContentAlpha contentAlpha1111111118 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle1111111118, contentAlpha1111111118.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography1111111118.getBody2(), contentAlpha1111111118.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography1111111118.getOverline(), contentAlpha1111111118.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography1111111118.getCaption(), contentAlpha1111111118.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography1111111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle1111111119 = typography1111111119.getSubtitle1();
                        ContentAlpha contentAlpha1111111119 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle1111111119, contentAlpha1111111119.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography1111111119.getBody2(), contentAlpha1111111119.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography1111111119.getOverline(), contentAlpha1111111119.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography1111111119.getCaption(), contentAlpha1111111119.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function10 = function5;
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111111110 = typography11111111110.getSubtitle1();
                        ContentAlpha contentAlpha11111111110 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111111110, contentAlpha11111111110.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111111110.getBody2(), contentAlpha11111111110.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111111110.getOverline(), contentAlpha11111111110.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111111110.getCaption(), contentAlpha11111111110.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111111111 = typography11111111111.getSubtitle1();
                        ContentAlpha contentAlpha11111111111 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111111111, contentAlpha11111111111.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111111111.getBody2(), contentAlpha11111111111.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111111111.getOverline(), contentAlpha11111111111.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111111111.getCaption(), contentAlpha11111111111.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111112 = typography11111111112.getSubtitle1();
                    ContentAlpha contentAlpha11111111112 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111112, contentAlpha11111111112.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111112.getBody2(), contentAlpha11111111112.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111112.getOverline(), contentAlpha11111111112.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111112.getCaption(), contentAlpha11111111112.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111113 = typography11111111113.getSubtitle1();
                    ContentAlpha contentAlpha11111111113 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111113, contentAlpha11111111113.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111113.getBody2(), contentAlpha11111111113.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111113.getOverline(), contentAlpha11111111113.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111113.getCaption(), contentAlpha11111111113.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            function9 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((458752 & i) == 0) {
                    function10 = function5;
                    if (composerStartRestartGroup.changed(function10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111111114 = typography11111111114.getSubtitle1();
                        ContentAlpha contentAlpha11111111114 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111111114, contentAlpha11111111114.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111111114.getBody2(), contentAlpha11111111114.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111111114.getOverline(), contentAlpha11111111114.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111111114.getCaption(), contentAlpha11111111114.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography11111111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle11111111115 = typography11111111115.getSubtitle1();
                        ContentAlpha contentAlpha11111111115 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle11111111115, contentAlpha11111111115.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography11111111115.getBody2(), contentAlpha11111111115.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography11111111115.getOverline(), contentAlpha11111111115.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography11111111115.getCaption(), contentAlpha11111111115.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111116 = typography11111111116.getSubtitle1();
                    ContentAlpha contentAlpha11111111116 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111116, contentAlpha11111111116.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111116.getBody2(), contentAlpha11111111116.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111116.getOverline(), contentAlpha11111111116.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111116.getCaption(), contentAlpha11111111116.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111117 = typography11111111117.getSubtitle1();
                    ContentAlpha contentAlpha11111111117 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111117, contentAlpha11111111117.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111117.getBody2(), contentAlpha11111111117.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111117.getOverline(), contentAlpha11111111117.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111117.getCaption(), contentAlpha11111111117.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function10 = function5;
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111118 = typography11111111118.getSubtitle1();
                    ContentAlpha contentAlpha11111111118 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111118, contentAlpha11111111118.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111118.getBody2(), contentAlpha11111111118.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111118.getOverline(), contentAlpha11111111118.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111118.getCaption(), contentAlpha11111111118.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography11111111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle11111111119 = typography11111111119.getSubtitle1();
                    ContentAlpha contentAlpha11111111119 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle11111111119, contentAlpha11111111119.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography11111111119.getBody2(), contentAlpha11111111119.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography11111111119.getOverline(), contentAlpha11111111119.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography11111111119.getCaption(), contentAlpha11111111119.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography111111111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle111111111110 = typography111111111110.getSubtitle1();
                ContentAlpha contentAlpha111111111110 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle111111111110, contentAlpha111111111110.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography111111111110.getBody2(), contentAlpha111111111110.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography111111111110.getOverline(), contentAlpha111111111110.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography111111111110.getCaption(), contentAlpha111111111110.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography111111111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle111111111111 = typography111111111111.getSubtitle1();
                ContentAlpha contentAlpha111111111111 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle111111111111, contentAlpha111111111111.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography111111111111.getBody2(), contentAlpha111111111111.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography111111111111.getOverline(), contentAlpha111111111111.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography111111111111.getCaption(), contentAlpha111111111111.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                function9 = function4;
                if (composerStartRestartGroup.changed(function9)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((458752 & i) == 0) {
                    function10 = function5;
                    if (composerStartRestartGroup.changed(function10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(function6)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if (((i3 & 2995931) ^ 599186) == 0) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111111112 = typography111111111112.getSubtitle1();
                        ContentAlpha contentAlpha111111111112 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111111112, contentAlpha111111111112.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111111112.getBody2(), contentAlpha111111111112.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111111112.getOverline(), contentAlpha111111111112.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111111112.getCaption(), contentAlpha111111111112.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    } else {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i14 != 0) {
                            function7 = null;
                        }
                        if (i4 != 0) {
                            function11 = null;
                        } else {
                            function11 = function8;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            function9 = null;
                        }
                        if (i10 == 0) {
                        }
                        Typography typography111111111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                        TextStyle subtitle111111111113 = typography111111111113.getSubtitle1();
                        ContentAlpha contentAlpha111111111113 = ContentAlpha.INSTANCE;
                        function2ApplyTextStyle = applyTextStyle(subtitle111111111113, contentAlpha111111111113.getHigh(composerStartRestartGroup, 0), function6);
                        function2ApplyTextStyle2 = applyTextStyle(typography111111111113.getBody2(), contentAlpha111111111113.getMedium(composerStartRestartGroup, 0), function11);
                        function2ApplyTextStyle3 = applyTextStyle(typography111111111113.getOverline(), contentAlpha111111111113.getHigh(composerStartRestartGroup, 0), function9);
                        function2ApplyTextStyle4 = applyTextStyle(typography111111111113.getCaption(), contentAlpha111111111113.getHigh(composerStartRestartGroup, 0), function17);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }
                        });
                        if (function2ApplyTextStyle2 == null) {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function12 = function9;
                            if (function2ApplyTextStyle3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        function13 = function17;
                        function14 = function11;
                        function15 = function7;
                        z4 = z3;
                        function16 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111111114 = typography111111111114.getSubtitle1();
                    ContentAlpha contentAlpha111111111114 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111111114, contentAlpha111111111114.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111111114.getBody2(), contentAlpha111111111114.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111111114.getOverline(), contentAlpha111111111114.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111111114.getCaption(), contentAlpha111111111114.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111111115 = typography111111111115.getSubtitle1();
                    ContentAlpha contentAlpha111111111115 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111111115, contentAlpha111111111115.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111111115.getBody2(), contentAlpha111111111115.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111111115.getOverline(), contentAlpha111111111115.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111111115.getCaption(), contentAlpha111111111115.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function10 = function5;
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111111116 = typography111111111116.getSubtitle1();
                    ContentAlpha contentAlpha111111111116 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111111116, contentAlpha111111111116.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111111116.getBody2(), contentAlpha111111111116.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111111116.getOverline(), contentAlpha111111111116.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111111116.getCaption(), contentAlpha111111111116.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography111111111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle111111111117 = typography111111111117.getSubtitle1();
                    ContentAlpha contentAlpha111111111117 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle111111111117, contentAlpha111111111117.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography111111111117.getBody2(), contentAlpha111111111117.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography111111111117.getOverline(), contentAlpha111111111117.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography111111111117.getCaption(), contentAlpha111111111117.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography111111111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle111111111118 = typography111111111118.getSubtitle1();
                ContentAlpha contentAlpha111111111118 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle111111111118, contentAlpha111111111118.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography111111111118.getBody2(), contentAlpha111111111118.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography111111111118.getOverline(), contentAlpha111111111118.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography111111111118.getCaption(), contentAlpha111111111118.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography111111111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle111111111119 = typography111111111119.getSubtitle1();
                ContentAlpha contentAlpha111111111119 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle111111111119, contentAlpha111111111119.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography111111111119.getBody2(), contentAlpha111111111119.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography111111111119.getOverline(), contentAlpha111111111119.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography111111111119.getCaption(), contentAlpha111111111119.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        function9 = function4;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((458752 & i) == 0) {
                function10 = function5;
                if (composerStartRestartGroup.changed(function10)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function6)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if (((i3 & 2995931) ^ 599186) == 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111111110 = typography1111111111110.getSubtitle1();
                    ContentAlpha contentAlpha1111111111110 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111111110, contentAlpha1111111111110.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111111110.getBody2(), contentAlpha1111111111110.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111111110.getOverline(), contentAlpha1111111111110.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111111110.getCaption(), contentAlpha1111111111110.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i14 != 0) {
                        function7 = null;
                    }
                    if (i4 != 0) {
                        function11 = null;
                    } else {
                        function11 = function8;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        function9 = null;
                    }
                    if (i10 == 0) {
                    }
                    Typography typography1111111111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    TextStyle subtitle1111111111111 = typography1111111111111.getSubtitle1();
                    ContentAlpha contentAlpha1111111111111 = ContentAlpha.INSTANCE;
                    function2ApplyTextStyle = applyTextStyle(subtitle1111111111111, contentAlpha1111111111111.getHigh(composerStartRestartGroup, 0), function6);
                    function2ApplyTextStyle2 = applyTextStyle(typography1111111111111.getBody2(), contentAlpha1111111111111.getMedium(composerStartRestartGroup, 0), function11);
                    function2ApplyTextStyle3 = applyTextStyle(typography1111111111111.getOverline(), contentAlpha1111111111111.getHigh(composerStartRestartGroup, 0), function9);
                    function2ApplyTextStyle4 = applyTextStyle(typography1111111111111.getCaption(), contentAlpha1111111111111.getHigh(composerStartRestartGroup, 0), function17);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    });
                    if (function2ApplyTextStyle2 == null) {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function12 = function9;
                        if (function2ApplyTextStyle3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    function13 = function17;
                    function14 = function11;
                    function15 = function7;
                    z4 = z3;
                    function16 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111111112 = typography1111111111112.getSubtitle1();
                ContentAlpha contentAlpha1111111111112 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111111112, contentAlpha1111111111112.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111111112.getBody2(), contentAlpha1111111111112.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111111112.getOverline(), contentAlpha1111111111112.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111111112.getCaption(), contentAlpha1111111111112.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111111113 = typography1111111111113.getSubtitle1();
                ContentAlpha contentAlpha1111111111113 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111111113, contentAlpha1111111111113.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111111113.getBody2(), contentAlpha1111111111113.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111111113.getOverline(), contentAlpha1111111111113.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111111113.getCaption(), contentAlpha1111111111113.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        function10 = function5;
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function6)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111111114 = typography1111111111114.getSubtitle1();
                ContentAlpha contentAlpha1111111111114 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111111114, contentAlpha1111111111114.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111111114.getBody2(), contentAlpha1111111111114.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111111114.getOverline(), contentAlpha1111111111114.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111111114.getCaption(), contentAlpha1111111111114.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i14 != 0) {
                    function7 = null;
                }
                if (i4 != 0) {
                    function11 = null;
                } else {
                    function11 = function8;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    function9 = null;
                }
                if (i10 == 0) {
                }
                Typography typography1111111111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                TextStyle subtitle1111111111115 = typography1111111111115.getSubtitle1();
                ContentAlpha contentAlpha1111111111115 = ContentAlpha.INSTANCE;
                function2ApplyTextStyle = applyTextStyle(subtitle1111111111115, contentAlpha1111111111115.getHigh(composerStartRestartGroup, 0), function6);
                function2ApplyTextStyle2 = applyTextStyle(typography1111111111115.getBody2(), contentAlpha1111111111115.getMedium(composerStartRestartGroup, 0), function11);
                function2ApplyTextStyle3 = applyTextStyle(typography1111111111115.getOverline(), contentAlpha1111111111115.getHigh(composerStartRestartGroup, 0), function9);
                function2ApplyTextStyle4 = applyTextStyle(typography1111111111115.getCaption(), contentAlpha1111111111115.getHigh(composerStartRestartGroup, 0), function17);
                modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                });
                if (function2ApplyTextStyle2 == null) {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function12 = function9;
                    if (function2ApplyTextStyle3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                function13 = function17;
                function14 = function11;
                function15 = function7;
                z4 = z3;
                function16 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
                }
            });
        }
        i12 = 1572864;
        i3 |= i12;
        if (((i3 & 2995931) ^ 599186) == 0) {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i14 != 0) {
                function7 = null;
            }
            if (i4 != 0) {
                function11 = null;
            } else {
                function11 = function8;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                function9 = null;
            }
            if (i10 == 0) {
            }
            Typography typography1111111111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
            TextStyle subtitle1111111111116 = typography1111111111116.getSubtitle1();
            ContentAlpha contentAlpha1111111111116 = ContentAlpha.INSTANCE;
            function2ApplyTextStyle = applyTextStyle(subtitle1111111111116, contentAlpha1111111111116.getHigh(composerStartRestartGroup, 0), function6);
            function2ApplyTextStyle2 = applyTextStyle(typography1111111111116.getBody2(), contentAlpha1111111111116.getMedium(composerStartRestartGroup, 0), function11);
            function2ApplyTextStyle3 = applyTextStyle(typography1111111111116.getOverline(), contentAlpha1111111111116.getHigh(composerStartRestartGroup, 0), function9);
            function2ApplyTextStyle4 = applyTextStyle(typography1111111111116.getCaption(), contentAlpha1111111111116.getHigh(composerStartRestartGroup, 0), function17);
            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            });
            if (function2ApplyTextStyle2 == null) {
                function12 = function9;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function12 = function9;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            function13 = function17;
            function14 = function11;
            function15 = function7;
            z4 = z3;
            function16 = function12;
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i14 != 0) {
                function7 = null;
            }
            if (i4 != 0) {
                function11 = null;
            } else {
                function11 = function8;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                function9 = null;
            }
            if (i10 == 0) {
            }
            Typography typography1111111111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
            TextStyle subtitle1111111111117 = typography1111111111117.getSubtitle1();
            ContentAlpha contentAlpha1111111111117 = ContentAlpha.INSTANCE;
            function2ApplyTextStyle = applyTextStyle(subtitle1111111111117, contentAlpha1111111111117.getHigh(composerStartRestartGroup, 0), function6);
            function2ApplyTextStyle2 = applyTextStyle(typography1111111111117.getBody2(), contentAlpha1111111111117.getMedium(composerStartRestartGroup, 0), function11);
            function2ApplyTextStyle3 = applyTextStyle(typography1111111111117.getOverline(), contentAlpha1111111111117.getHigh(composerStartRestartGroup, 0), function9);
            function2ApplyTextStyle4 = applyTextStyle(typography1111111111117.getCaption(), contentAlpha1111111111117.getHigh(composerStartRestartGroup, 0), function17);
            modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            });
            if (function2ApplyTextStyle2 == null) {
                function12 = function9;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function12 = function9;
                if (function2ApplyTextStyle3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    ThreeLine.INSTANCE.ListItem(modifierSemantics, function7, function2ApplyTextStyle, function2ApplyTextStyle2, function2ApplyTextStyle3, function2ApplyTextStyle4, composerStartRestartGroup, i3 & 112, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            function13 = function17;
            function14 = function11;
            function15 = function7;
            z4 = z3;
            function16 = function12;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.ListItem.1
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                ListItemKt.ListItem(modifier3, function15, function14, z4, function16, function13, function6, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m720OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(602085724);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                    int iMax;
                    final int iM3044getYimpl;
                    final Placeable placeableMo2468measureBRTryo0 = list.get(0).mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int i5 = placeableMo2468measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i5 != Integer.MIN_VALUE) {
                        iM3044getYimpl = measureScope.mo188roundToPx0680j_4(f) - i5;
                        iMax = Math.max(Constraints.m2936getMinHeightimpl(j), placeableMo2468measureBRTryo0.getHeight() + iM3044getYimpl);
                    } else {
                        iMax = Math.max(Constraints.m2936getMinHeightimpl(j), placeableMo2468measureBRTryo0.getHeight());
                        iM3044getYimpl = IntOffset.m3044getYimpl(Alignment.INSTANCE.getCenter().mo915alignKFBX0sM(IntSize.INSTANCE.m3090getZeroYbymL2g(), IntSizeKt.IntSize(0, iMax - placeableMo2468measureBRTryo0.getHeight()), measureScope.getLayoutDirection()));
                    }
                    return MeasureScope.DefaultImpls.layout$default(measureScope, placeableMo2468measureBRTryo0.getWidth(), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, iM3044getYimpl, 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i5 = (((i3 & 112) | ((i3 >> 6) & 14)) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
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

            public final void invoke(@Nullable Composer composer2, int i6) {
                ListItemKt.m720OffsetToBaselineOrCenterKz89ssw(f, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-985543472, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1
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
            public final void invoke(@Nullable Composer composer, int i) {
                if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f))};
                final TextStyle textStyle2 = textStyle;
                final Function2<Composer, Integer, Unit> function3 = function2;
                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer, -819897519, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1.1
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

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i2) {
                        if (((i2 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            TextKt.ProvideTextStyle(textStyle2, function3, composer2, 0);
                        }
                    }
                }), composer, 56);
            }
        });
    }
}
