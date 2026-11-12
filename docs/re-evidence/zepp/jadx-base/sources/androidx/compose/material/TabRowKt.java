package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.text.ttml.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u009d\u0001\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\u0019\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "Landroidx/compose/runtime/Composable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material_release"}, k = 2, mv = {1, 5, 1})
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m2965constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x0147  */
    /* JADX WARN: Code duplicated, block: B:120:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    @Composable
    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m844ScrollableTabRowsKfQg0A(final int i, @Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primarySurface;
        long jM656contentColorForek8zF_U;
        float fM841getScrollableTabRowPaddingD9Ej5fM;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i7;
        Modifier modifier3;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M670getLambda2$material_release;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function7;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final Modifier modifier4;
        final long j3;
        final long j4;
        final float f2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-249832734);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i10 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i10;
                } else {
                    primarySurface = j;
                }
                i4 |= i10;
            } else {
                primarySurface = j;
            }
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i3 & 8) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    int i11 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 2048 : 1024;
                    i4 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i4 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    fM841getScrollableTabRowPaddingD9Ej5fM = f;
                    int i12 = composerStartRestartGroup.changed(fM841getScrollableTabRowPaddingD9Ej5fM) ? 16384 : 8192;
                    i4 |= i12;
                } else {
                    fM841getScrollableTabRowPaddingD9Ej5fM = f;
                }
                i4 |= i12;
            } else {
                fM841getScrollableTabRowPaddingD9Ej5fM = f;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((458752 & i2) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changed(function5)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((3670016 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        function6 = function2;
                        int i13 = composerStartRestartGroup.changed(function6) ? 1048576 : 524288;
                        i4 |= i13;
                    } else {
                        function6 = function2;
                    }
                    i4 |= i13;
                } else {
                    function6 = function2;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (composerStartRestartGroup.changed(function4)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i4 |= i7;
                    }
                    if (((i4 & 23967451) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i9 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                                i4 &= -57345;
                            }
                            if (i5 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i14) {
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                    }
                                });
                            } else {
                                function3ComposableLambda = function5;
                            }
                            if ((i3 & 64) != 0) {
                                function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                                i4 &= -3670017;
                            } else {
                                function2M670getLambda2$material_release = function6;
                            }
                            composerStartRestartGroup.endDefaults();
                            Function2<? super Composer, ? super Integer, Unit> function10 = function2M670getLambda2$material_release;
                            i8 = i4;
                            function7 = function10;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            modifier3 = modifier;
                            function3ComposableLambda = function5;
                            i8 = i4;
                            function7 = function6;
                        }
                        final float f3 = fM841getScrollableTabRowPaddingD9Ej5fM;
                        final Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function12 = function3ComposableLambda;
                        final int i14 = i8;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                            public final void invoke(@Nullable Composer composer2, int i15) {
                                if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                composer2.startReplaceableGroup(-723524056);
                                composer2.startReplaceableGroup(-3687241);
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer2.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-3686552);
                                boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                final float f4 = f3;
                                final Function2<Composer, Integer, Unit> function13 = function4;
                                final Function2<Composer, Integer, Unit> function14 = function11;
                                final int i16 = i;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function15 = function12;
                                final int i17 = i14;
                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                        int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                        final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f4);
                                        int i18 = 0;
                                        long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function13);
                                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                        int size = listSubcompose.size() - 1;
                                        if (size >= 0) {
                                            int i19 = 0;
                                            while (true) {
                                                int i20 = i19 + 1;
                                                arrayList.add(listSubcompose.get(i19).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                                if (i20 > size) {
                                                    break;
                                                }
                                                i19 = i20;
                                            }
                                        }
                                        final Ref.IntRef intRef = new Ref.IntRef();
                                        intRef.element = iMo188roundToPx0680j_5 * 2;
                                        final Ref.IntRef intRef2 = new Ref.IntRef();
                                        int size2 = arrayList.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                int i21 = i18 + 1;
                                                Placeable placeable = (Placeable) arrayList.get(i18);
                                                intRef.element += placeable.getWidth();
                                                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                if (i21 > size2) {
                                                    break;
                                                }
                                                i18 = i21;
                                            }
                                        }
                                        int i22 = intRef.element;
                                        int i23 = intRef2.element;
                                        final Function2<Composer, Integer, Unit> function16 = function14;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i24 = i16;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function17 = function15;
                                        final int i25 = i17;
                                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                                final ArrayList arrayList2 = new ArrayList();
                                                int width = iMo188roundToPx0680j_5;
                                                List<Placeable> list = arrayList;
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                int size3 = list.size() - 1;
                                                if (size3 >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        int i27 = i26 + 1;
                                                        Placeable placeable2 = list.get(i26);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                        arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                        width += placeable2.getWidth();
                                                        if (i27 > size3) {
                                                            break;
                                                        } else {
                                                            i26 = i27;
                                                        }
                                                    }
                                                }
                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function16);
                                                long j6 = j5;
                                                Ref.IntRef intRef3 = intRef;
                                                Ref.IntRef intRef4 = intRef2;
                                                int size4 = listSubcompose2.size() - 1;
                                                if (size4 >= 0) {
                                                    int i28 = 0;
                                                    while (true) {
                                                        Measurable measurable = listSubcompose2.get(i28);
                                                        int i29 = intRef3.element;
                                                        List<Measurable> list2 = listSubcompose2;
                                                        int i30 = size4;
                                                        Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        i28++;
                                                        if (i28 > i30) {
                                                            break;
                                                        }
                                                        size4 = i30;
                                                        listSubcompose2 = list2;
                                                    }
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function18 = function17;
                                                final int i31 = i25;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer3, int i32) {
                                                        if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                        } else {
                                                            function18.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                        }
                                                    }
                                                }));
                                                Ref.IntRef intRef5 = intRef;
                                                Ref.IntRef intRef6 = intRef2;
                                                int size5 = listSubcompose3.size() - 1;
                                                if (size5 >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        int i33 = i32 + 1;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        if (i33 > size5) {
                                                            break;
                                                        } else {
                                                            i32 = i33;
                                                        }
                                                    }
                                                }
                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                            }
                                        }, 4, null);
                                    }
                                }, composer2, 0, 0);
                            }
                        }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                        float f4 = fM841getScrollableTabRowPaddingD9Ej5fM;
                        function8 = function7;
                        modifier4 = modifier3;
                        j3 = primarySurface;
                        j4 = jM656contentColorForek8zF_U;
                        f2 = f4;
                        function9 = function3ComposableLambda;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        j3 = primarySurface;
                        j4 = jM656contentColorForek8zF_U;
                        f2 = fM841getScrollableTabRowPaddingD9Ej5fM;
                        function9 = function5;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                            TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                        }
                    });
                }
                i4 |= 12582912;
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i15) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function13 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i15) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function14 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function14;
                    }
                    final float f5 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function3ComposableLambda;
                    final int i15 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i16) {
                            if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f6 = f5;
                            final Function2<? super Composer, ? super Integer, Unit> function17 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function18 = function15;
                            final int i17 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function16;
                            final int i18 = i15;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f6);
                                    int i19 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function17);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i110 = 0;
                                        while (true) {
                                            int i20 = i110 + 1;
                                            arrayList.add(listSubcompose.get(i110).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i110 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i19 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i19);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i19 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i17;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function19;
                                    final int i25 = i18;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function110);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function111;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function112.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f6 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f6;
                    function9 = function3ComposableLambda;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i16) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function17 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i16) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function18 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function18;
                    }
                    final float f7 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function3ComposableLambda;
                    final int i16 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i17) {
                            if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f8 = f7;
                            final Function2<? super Composer, ? super Integer, Unit> function111 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function112 = function19;
                            final int i18 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function110;
                            final int i19 = i16;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f8);
                                    int i110 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function111);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i111 = 0;
                                        while (true) {
                                            int i20 = i111 + 1;
                                            arrayList.add(listSubcompose.get(i111).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i111 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i110 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i110);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i110 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function114 = function112;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i18;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function113;
                                    final int i25 = i19;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function114);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function115;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function116.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f8 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f8;
                    function9 = function3ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                    public final void invoke(@Nullable Composer composer2, int i17) {
                        TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 196608;
            function5 = function3;
            if ((3670016 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changed(function6)) {
                    }
                    i4 |= i13;
                } else {
                    function6 = function2;
                }
                i4 |= i13;
            } else {
                function6 = function2;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i17) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function111 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i17) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function112 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function112;
                    }
                    final float f9 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function3ComposableLambda;
                    final int i17 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i18) {
                            if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f10 = f9;
                            final Function2<? super Composer, ? super Integer, Unit> function115 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function116 = function113;
                            final int i19 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function117 = function114;
                            final int i110 = i17;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f10);
                                    int i111 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function115);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i112 = 0;
                                        while (true) {
                                            int i20 = i112 + 1;
                                            arrayList.add(listSubcompose.get(i112).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i112 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i111 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i111);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i111 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function118 = function116;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i19;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function119 = function117;
                                    final int i25 = i110;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function118);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1110 = function119;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function1110.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f10 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f10;
                    function9 = function3ComposableLambda;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i18) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function115 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i18) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function116 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function116;
                    }
                    final float f11 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function117 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function118 = function3ComposableLambda;
                    final int i18 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i19) {
                            if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f12 = f11;
                            final Function2<? super Composer, ? super Integer, Unit> function119 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function1110 = function117;
                            final int i110 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111 = function118;
                            final int i111 = i18;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f12);
                                    int i112 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function119);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i113 = 0;
                                        while (true) {
                                            int i20 = i113 + 1;
                                            arrayList.add(listSubcompose.get(i113).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i113 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i112 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i112);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i112 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function1112 = function1110;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i110;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1113 = function1111;
                                    final int i25 = i111;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function1112);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1114 = function1113;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function1114.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f12 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f12;
                    function9 = function3ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 12582912;
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i19) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function119 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i19) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function1110 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function1110;
                }
                final float f13 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1112 = function3ComposableLambda;
                final int i19 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i110) {
                        if (((i110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f14 = f13;
                        final Function2<? super Composer, ? super Integer, Unit> function1113 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function1114 = function1111;
                        final int i111 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1115 = function1112;
                        final int i112 = i19;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f14);
                                int i113 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function1113);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i114 = 0;
                                    while (true) {
                                        int i20 = i114 + 1;
                                        arrayList.add(listSubcompose.get(i114).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i114 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i113 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i113);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i113 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1116 = function1114;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i111;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1117 = function1115;
                                final int i25 = i112;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function1116);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1118 = function1117;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function1118.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f14 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f14;
                function9 = function3ComposableLambda;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i110) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function1113 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function1113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i110) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function1114 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function1114;
                }
                final float f15 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1116 = function3ComposableLambda;
                final int i110 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i111) {
                        if (((i111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f16 = f15;
                        final Function2<? super Composer, ? super Integer, Unit> function1117 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function1118 = function1115;
                        final int i112 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1119 = function1116;
                        final int i113 = i110;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f16);
                                int i114 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function1117);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i115 = 0;
                                    while (true) {
                                        int i20 = i115 + 1;
                                        arrayList.add(listSubcompose.get(i115).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i115 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i114 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i114);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i114 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function11110 = function1118;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i112;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111 = function1119;
                                final int i25 = i113;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function11110);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11112 = function11111;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function11112.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f16 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f16;
                function9 = function3ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                public final void invoke(@Nullable Composer composer2, int i111) {
                    TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i4 |= i10;
            } else {
                primarySurface = j;
            }
            i4 |= i10;
        } else {
            primarySurface = j;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i3 & 8) == 0) {
                jM656contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                }
                i4 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i4 |= i11;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                fM841getScrollableTabRowPaddingD9Ej5fM = f;
                if (composerStartRestartGroup.changed(fM841getScrollableTabRowPaddingD9Ej5fM)) {
                }
                i4 |= i12;
            } else {
                fM841getScrollableTabRowPaddingD9Ej5fM = f;
            }
            i4 |= i12;
        } else {
            fM841getScrollableTabRowPaddingD9Ej5fM = f;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((458752 & i2) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changed(function5)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((3670016 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changed(function6)) {
                    }
                    i4 |= i13;
                } else {
                    function6 = function2;
                }
                i4 |= i13;
            } else {
                function6 = function2;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if (((i4 & 23967451) ^ 4793490) == 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i111) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function1117 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function1117;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i111) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function1118 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function1118;
                    }
                    final float f17 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11110 = function3ComposableLambda;
                    final int i111 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i112) {
                            if (((i112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f18 = f17;
                            final Function2<? super Composer, ? super Integer, Unit> function11111 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function11112 = function1119;
                            final int i113 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11113 = function11110;
                            final int i114 = i111;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f18);
                                    int i115 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function11111);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i116 = 0;
                                        while (true) {
                                            int i20 = i116 + 1;
                                            arrayList.add(listSubcompose.get(i116).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i116 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i115 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i115);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i115 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function11114 = function11112;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i113;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11115 = function11113;
                                    final int i25 = i114;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function11114);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11116 = function11115;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function11116.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f18 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f18;
                    function9 = function3ComposableLambda;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i112) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function11111 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function11111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                            i4 &= -57345;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i112) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        } else {
                            function3ComposableLambda = function5;
                        }
                        if ((i3 & 64) != 0) {
                            function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                            i4 &= -3670017;
                        } else {
                            function2M670getLambda2$material_release = function6;
                        }
                        composerStartRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function11112 = function2M670getLambda2$material_release;
                        i8 = i4;
                        function7 = function11112;
                    }
                    final float f19 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function11113 = function7;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11114 = function3ComposableLambda;
                    final int i112 = i8;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i113) {
                            if (((i113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(-723524056);
                            composer2.startReplaceableGroup(-3687241);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-3686552);
                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                            final float f110 = f19;
                            final Function2<? super Composer, ? super Integer, Unit> function11115 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function11116 = function11113;
                            final int i114 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11117 = function11114;
                            final int i115 = i112;
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                    int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f110);
                                    int i116 = 0;
                                    long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function11115);
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size = listSubcompose.size() - 1;
                                    if (size >= 0) {
                                        int i117 = 0;
                                        while (true) {
                                            int i20 = i117 + 1;
                                            arrayList.add(listSubcompose.get(i117).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                            if (i20 > size) {
                                                break;
                                            }
                                            i117 = i20;
                                        }
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = iMo188roundToPx0680j_5 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i21 = i116 + 1;
                                            Placeable placeable = (Placeable) arrayList.get(i116);
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                            if (i21 > size2) {
                                                break;
                                            }
                                            i116 = i21;
                                        }
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function11118 = function11116;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i114;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11119 = function11117;
                                    final int i25 = i115;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int width = iMo188roundToPx0680j_5;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            int size3 = list.size() - 1;
                                            if (size3 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    int i27 = i26 + 1;
                                                    Placeable placeable2 = list.get(i26);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                    width += placeable2.getWidth();
                                                    if (i27 > size3) {
                                                        break;
                                                    } else {
                                                        i26 = i27;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function11118);
                                            long j6 = j5;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i28 = 0;
                                                while (true) {
                                                    Measurable measurable = listSubcompose2.get(i28);
                                                    int i29 = intRef3.element;
                                                    List<Measurable> list2 = listSubcompose2;
                                                    int i30 = size4;
                                                    Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    i28++;
                                                    if (i28 > i30) {
                                                        break;
                                                    }
                                                    size4 = i30;
                                                    listSubcompose2 = list2;
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111110 = function11119;
                                            final int i31 = i25;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i32) {
                                                    if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function111110.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    int i33 = i32 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                    if (i33 > size5) {
                                                        break;
                                                    } else {
                                                        i32 = i33;
                                                    }
                                                }
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                        }
                    }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    float f110 = fM841getScrollableTabRowPaddingD9Ej5fM;
                    function8 = function7;
                    modifier4 = modifier3;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    f2 = f110;
                    function9 = function3ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 12582912;
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i113) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function11115 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function11115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i113) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function11116 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function11116;
                }
                final float f111 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function11117 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11118 = function3ComposableLambda;
                final int i113 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i114) {
                        if (((i114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f112 = f111;
                        final Function2<? super Composer, ? super Integer, Unit> function11119 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function111110 = function11117;
                        final int i115 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111111 = function11118;
                        final int i116 = i113;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f112);
                                int i117 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function11119);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i118 = 0;
                                    while (true) {
                                        int i20 = i118 + 1;
                                        arrayList.add(listSubcompose.get(i118).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i118 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i117 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i117);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i117 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function111112 = function111110;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i115;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111113 = function111111;
                                final int i25 = i116;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function111112);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111114 = function111113;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function111114.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f112 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f112;
                function9 = function3ComposableLambda;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i114) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function11119 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function11119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i114) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function111110 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function111110;
                }
                final float f113 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function111111 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111112 = function3ComposableLambda;
                final int i114 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i115) {
                        if (((i115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f114 = f113;
                        final Function2<? super Composer, ? super Integer, Unit> function111113 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function111114 = function111111;
                        final int i116 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111115 = function111112;
                        final int i117 = i114;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f114);
                                int i118 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function111113);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i119 = 0;
                                    while (true) {
                                        int i20 = i119 + 1;
                                        arrayList.add(listSubcompose.get(i119).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i119 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i118 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i118);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i118 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function111116 = function111114;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i116;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111117 = function111115;
                                final int i25 = i117;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function111116);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111118 = function111117;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function111118.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f114 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f114;
                function9 = function3ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                public final void invoke(@Nullable Composer composer2, int i115) {
                    TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 196608;
        function5 = function3;
        if ((3670016 & i2) == 0) {
            if ((i3 & 64) == 0) {
                function6 = function2;
                if (composerStartRestartGroup.changed(function6)) {
                }
                i4 |= i13;
            } else {
                function6 = function2;
            }
            i4 |= i13;
        } else {
            function6 = function2;
        }
        if ((i3 & 128) != 0) {
            if ((29360128 & i2) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if (((i4 & 23967451) ^ 4793490) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i115) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function111113 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function111113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i115) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function111114 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function111114;
                }
                final float f115 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function111115 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111116 = function3ComposableLambda;
                final int i115 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i116) {
                        if (((i116 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f116 = f115;
                        final Function2<? super Composer, ? super Integer, Unit> function111117 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function111118 = function111115;
                        final int i117 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111119 = function111116;
                        final int i118 = i115;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f116);
                                int i119 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function111117);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i1110 = 0;
                                    while (true) {
                                        int i20 = i1110 + 1;
                                        arrayList.add(listSubcompose.get(i1110).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i1110 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i119 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i119);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i119 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1111110 = function111118;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i117;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111111 = function111119;
                                final int i25 = i118;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function1111110);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111112 = function1111111;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function1111112.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f116 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f116;
                function9 = function3ComposableLambda;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i116) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function111117 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function111117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                        i4 &= -57345;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i116) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    } else {
                        function3ComposableLambda = function5;
                    }
                    if ((i3 & 64) != 0) {
                        function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                        i4 &= -3670017;
                    } else {
                        function2M670getLambda2$material_release = function6;
                    }
                    composerStartRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function111118 = function2M670getLambda2$material_release;
                    i8 = i4;
                    function7 = function111118;
                }
                final float f117 = fM841getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function111119 = function7;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111110 = function3ComposableLambda;
                final int i116 = i8;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i117) {
                        if (((i117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(-723524056);
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-3686552);
                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                        final float f118 = f117;
                        final Function2<? super Composer, ? super Integer, Unit> function1111111 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function1111112 = function111119;
                        final int i118 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111113 = function1111110;
                        final int i119 = i116;
                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f118);
                                int i1110 = 0;
                                long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function1111111);
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i1111 = 0;
                                    while (true) {
                                        int i20 = i1111 + 1;
                                        arrayList.add(listSubcompose.get(i1111).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                        if (i20 > size) {
                                            break;
                                        }
                                        i1111 = i20;
                                    }
                                }
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = iMo188roundToPx0680j_5 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                int size2 = arrayList.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i21 = i1110 + 1;
                                        Placeable placeable = (Placeable) arrayList.get(i1110);
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        if (i21 > size2) {
                                            break;
                                        }
                                        i1110 = i21;
                                    }
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function1111114 = function1111112;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i118;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111115 = function1111113;
                                final int i25 = i119;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int width = iMo188roundToPx0680j_5;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i26 + 1;
                                                Placeable placeable2 = list.get(i26);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                                width += placeable2.getWidth();
                                                if (i27 > size3) {
                                                    break;
                                                } else {
                                                    i26 = i27;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function1111114);
                                        long j6 = j5;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose2.get(i28);
                                                int i29 = intRef3.element;
                                                List<Measurable> list2 = listSubcompose2;
                                                int i30 = size4;
                                                Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                i28++;
                                                if (i28 > i30) {
                                                    break;
                                                }
                                                size4 = i30;
                                                listSubcompose2 = list2;
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111116 = function1111115;
                                        final int i31 = i25;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i32) {
                                                if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function1111116.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                int i33 = i32 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                if (i33 > size5) {
                                                    break;
                                                } else {
                                                    i32 = i33;
                                                }
                                            }
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                    }
                }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                float f118 = fM841getScrollableTabRowPaddingD9Ej5fM;
                function8 = function7;
                modifier4 = modifier3;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                f2 = f118;
                function9 = function3ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                public final void invoke(@Nullable Composer composer2, int i117) {
                    TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 12582912;
        if (((i4 & 23967451) ^ 4793490) == 0) {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                    i4 &= -57345;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i117) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                } else {
                    function3ComposableLambda = function5;
                }
                if ((i3 & 64) != 0) {
                    function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                    i4 &= -3670017;
                } else {
                    function2M670getLambda2$material_release = function6;
                }
                composerStartRestartGroup.endDefaults();
                Function2<? super Composer, ? super Integer, Unit> function1111111 = function2M670getLambda2$material_release;
                i8 = i4;
                function7 = function1111111;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                    i4 &= -57345;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i117) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                } else {
                    function3ComposableLambda = function5;
                }
                if ((i3 & 64) != 0) {
                    function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                    i4 &= -3670017;
                } else {
                    function2M670getLambda2$material_release = function6;
                }
                composerStartRestartGroup.endDefaults();
                Function2<? super Composer, ? super Integer, Unit> function1111112 = function2M670getLambda2$material_release;
                i8 = i4;
                function7 = function1111112;
            }
            final float f119 = fM841getScrollableTabRowPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function1111113 = function7;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111114 = function3ComposableLambda;
            final int i117 = i8;
            SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                public final void invoke(@Nullable Composer composer2, int i118) {
                    if (((i118 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(-723524056);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-3686552);
                    boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                    final float f1110 = f119;
                    final Function2<? super Composer, ? super Integer, Unit> function1111115 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function1111116 = function1111113;
                    final int i119 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111117 = function1111114;
                    final int i1110 = i117;
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                            int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                            final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f1110);
                            int i1111 = 0;
                            long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function1111115);
                            final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                            int size = listSubcompose.size() - 1;
                            if (size >= 0) {
                                int i1112 = 0;
                                while (true) {
                                    int i20 = i1112 + 1;
                                    arrayList.add(listSubcompose.get(i1112).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                    if (i20 > size) {
                                        break;
                                    }
                                    i1112 = i20;
                                }
                            }
                            final Ref.IntRef intRef = new Ref.IntRef();
                            intRef.element = iMo188roundToPx0680j_5 * 2;
                            final Ref.IntRef intRef2 = new Ref.IntRef();
                            int size2 = arrayList.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i21 = i1111 + 1;
                                    Placeable placeable = (Placeable) arrayList.get(i1111);
                                    intRef.element += placeable.getWidth();
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    if (i21 > size2) {
                                        break;
                                    }
                                    i1111 = i21;
                                }
                            }
                            int i22 = intRef.element;
                            int i23 = intRef2.element;
                            final Function2<? super Composer, ? super Integer, Unit> function1111118 = function1111116;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i24 = i119;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111119 = function1111117;
                            final int i25 = i1110;
                            return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int width = iMo188roundToPx0680j_5;
                                    List<Placeable> list = arrayList;
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                    int size3 = list.size() - 1;
                                    if (size3 >= 0) {
                                        int i26 = 0;
                                        while (true) {
                                            int i27 = i26 + 1;
                                            Placeable placeable2 = list.get(i26);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                            if (i27 > size3) {
                                                break;
                                            } else {
                                                i26 = i27;
                                            }
                                        }
                                    }
                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function1111118);
                                    long j6 = j5;
                                    Ref.IntRef intRef3 = intRef;
                                    Ref.IntRef intRef4 = intRef2;
                                    int size4 = listSubcompose2.size() - 1;
                                    if (size4 >= 0) {
                                        int i28 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose2.get(i28);
                                            int i29 = intRef3.element;
                                            List<Measurable> list2 = listSubcompose2;
                                            int i30 = size4;
                                            Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            i28++;
                                            if (i28 > i30) {
                                                break;
                                            }
                                            size4 = i30;
                                            listSubcompose2 = list2;
                                        }
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111110 = function1111119;
                                    final int i31 = i25;
                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i32) {
                                            if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                function11111110.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                            }
                                        }
                                    }));
                                    Ref.IntRef intRef5 = intRef;
                                    Ref.IntRef intRef6 = intRef2;
                                    int size5 = listSubcompose3.size() - 1;
                                    if (size5 >= 0) {
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = i32 + 1;
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            if (i33 > size5) {
                                                break;
                                            } else {
                                                i32 = i33;
                                            }
                                        }
                                    }
                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                }
            }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
            float f1110 = fM841getScrollableTabRowPaddingD9Ej5fM;
            function8 = function7;
            modifier4 = modifier3;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            f2 = f1110;
            function9 = function3ComposableLambda;
        } else {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                    i4 &= -57345;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i118) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                } else {
                    function3ComposableLambda = function5;
                }
                if ((i3 & 64) != 0) {
                    function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                    i4 &= -3670017;
                } else {
                    function2M670getLambda2$material_release = function6;
                }
                composerStartRestartGroup.endDefaults();
                Function2<? super Composer, ? super Integer, Unit> function1111115 = function2M670getLambda2$material_release;
                i8 = i4;
                function7 = function1111115;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    fM841getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m841getScrollableTabRowPaddingD9Ej5fM();
                    i4 &= -57345;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901703, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i118) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                } else {
                    function3ComposableLambda = function5;
                }
                if ((i3 & 64) != 0) {
                    function2M670getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m670getLambda2$material_release();
                    i4 &= -3670017;
                } else {
                    function2M670getLambda2$material_release = function6;
                }
                composerStartRestartGroup.endDefaults();
                Function2<? super Composer, ? super Integer, Unit> function1111116 = function2M670getLambda2$material_release;
                i8 = i4;
                function7 = function1111116;
            }
            final float f1111 = fM841getScrollableTabRowPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function1111117 = function7;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111118 = function3ComposableLambda;
            final int i118 = i8;
            SurfaceKt.m815SurfaceFjzlyU(modifier3, (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901580, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                public final void invoke(@Nullable Composer composer2, int i119) {
                    if (((i119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(-723524056);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-3686552);
                    boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                    final float f1112 = f1111;
                    final Function2<? super Composer, ? super Integer, Unit> function1111119 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function11111110 = function1111117;
                    final int i1110 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111111 = function1111118;
                    final int i1111 = i118;
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m846invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m846invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                            int iMo188roundToPx0680j_4 = subcomposeMeasureScope.mo188roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                            final int iMo188roundToPx0680j_5 = subcomposeMeasureScope.mo188roundToPx0680j_4(f1112);
                            int i1112 = 0;
                            long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j5, iMo188roundToPx0680j_4, 0, 0, 0, 14, null);
                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function1111119);
                            final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                            int size = listSubcompose.size() - 1;
                            if (size >= 0) {
                                int i1113 = 0;
                                while (true) {
                                    int i20 = i1113 + 1;
                                    arrayList.add(listSubcompose.get(i1113).mo2468measureBRTryo0(jM2926copyZbe2FdA$default));
                                    if (i20 > size) {
                                        break;
                                    }
                                    i1113 = i20;
                                }
                            }
                            final Ref.IntRef intRef = new Ref.IntRef();
                            intRef.element = iMo188roundToPx0680j_5 * 2;
                            final Ref.IntRef intRef2 = new Ref.IntRef();
                            int size2 = arrayList.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i21 = i1112 + 1;
                                    Placeable placeable = (Placeable) arrayList.get(i1112);
                                    intRef.element += placeable.getWidth();
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    if (i21 > size2) {
                                        break;
                                    }
                                    i1112 = i21;
                                }
                            }
                            int i22 = intRef.element;
                            int i23 = intRef2.element;
                            final Function2<? super Composer, ? super Integer, Unit> function11111112 = function11111110;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i24 = i1110;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111113 = function11111111;
                            final int i25 = i1111;
                            return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
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
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int width = iMo188roundToPx0680j_5;
                                    List<Placeable> list = arrayList;
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                    int size3 = list.size() - 1;
                                    if (size3 >= 0) {
                                        int i26 = 0;
                                        while (true) {
                                            int i27 = i26 + 1;
                                            Placeable placeable2 = list.get(i26);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo191toDpu2uoSUM(width), subcomposeMeasureScope2.mo191toDpu2uoSUM(placeable2.getWidth()), null));
                                            width += placeable2.getWidth();
                                            if (i27 > size3) {
                                                break;
                                            } else {
                                                i26 = i27;
                                            }
                                        }
                                    }
                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function11111112);
                                    long j6 = j5;
                                    Ref.IntRef intRef3 = intRef;
                                    Ref.IntRef intRef4 = intRef2;
                                    int size4 = listSubcompose2.size() - 1;
                                    if (size4 >= 0) {
                                        int i28 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose2.get(i28);
                                            int i29 = intRef3.element;
                                            List<Measurable> list2 = listSubcompose2;
                                            int i30 = size4;
                                            Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i29, i29, 0, 0, 12, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, intRef4.element - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            i28++;
                                            if (i28 > i30) {
                                                break;
                                            }
                                            size4 = i30;
                                            listSubcompose2 = list2;
                                        }
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11111114 = function11111113;
                                    final int i31 = i25;
                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985544770, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i32) {
                                            if (((i32 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                function11111114.invoke(arrayList2, composer3, Integer.valueOf(((i31 >> 12) & 112) | 8));
                                            }
                                        }
                                    }));
                                    Ref.IntRef intRef5 = intRef;
                                    Ref.IntRef intRef6 = intRef2;
                                    int size5 = listSubcompose3.size() - 1;
                                    if (size5 >= 0) {
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = i32 + 1;
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i32).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            if (i33 > size5) {
                                                break;
                                            } else {
                                                i32 = i33;
                                            }
                                        }
                                    }
                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo188roundToPx0680j_5, arrayList2, i24);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                }
            }), composerStartRestartGroup, 1572864 | ((i8 >> 3) & 14) | (i8 & 896) | (i8 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
            float f1112 = fM841getScrollableTabRowPaddingD9Ej5fM;
            function8 = function7;
            modifier4 = modifier3;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            f2 = f1112;
            function9 = function3ComposableLambda;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

            public final void invoke(@Nullable Composer composer2, int i119) {
                TabRowKt.m844ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f2, function9, function8, function4, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x011b  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x018d  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    @Composable
    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m845TabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primarySurface;
        long jM656contentColorForek8zF_U;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function2M669getLambda1$material_release;
        int i7;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final Modifier modifier3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2076459359);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i9 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primarySurface = j;
                }
                i4 |= i9;
            } else {
                primarySurface = j;
            }
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i3 & 8) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    int i10 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i4 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    function3ComposableLambda = function3;
                    if (composerStartRestartGroup.changed(function3ComposableLambda)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        function2M669getLambda1$material_release = function2;
                        int i11 = composerStartRestartGroup.changed(function2M669getLambda1$material_release) ? 131072 : 65536;
                        i4 |= i11;
                    } else {
                        function2M669getLambda1$material_release = function2;
                    }
                    i4 |= i11;
                } else {
                    function2M669getLambda1$material_release = function2;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((3670016 & i2) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i4 |= i7;
                }
                if (((2995931 & i4) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i12) {
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                                }
                            });
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                    }
                    final int i12 = i4;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function7 = function3ComposableLambda;
                    final Function2<? super Composer, ? super Integer, Unit> function8 = function2M669getLambda1$material_release;
                    SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i13) {
                            if (((i13 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<Composer, Integer, Unit> function9 = function4;
                            final Function2<Composer, Integer, Unit> function10 = function8;
                            final Function3<List<TabPosition>, Composer, Integer, Unit> function11 = function7;
                            final int i14 = i12;
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(function9) | composer2.changed(function10) | composer2.changed(function11);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                        int i15;
                                        Object obj;
                                        final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j5);
                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function9);
                                        int size = listSubcompose.size();
                                        final int i16 = iM2935getMaxWidthimpl / size;
                                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                        int size2 = listSubcompose.size() - 1;
                                        if (size2 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                Measurable measurable = listSubcompose.get(i17);
                                                List<Measurable> list = listSubcompose;
                                                i15 = 0;
                                                arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j5, i16, i16, 0, 0, 12, null)));
                                                i17++;
                                                if (i17 > size2) {
                                                    break;
                                                }
                                                listSubcompose = list;
                                            }
                                        } else {
                                            i15 = 0;
                                        }
                                        if (arrayList.isEmpty()) {
                                            obj = null;
                                        } else {
                                            obj = arrayList.get(i15);
                                            int height = ((Placeable) obj).getHeight();
                                            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                            int i18 = 1;
                                            if (1 <= lastIndex) {
                                                while (true) {
                                                    int i19 = i18 + 1;
                                                    Object obj2 = arrayList.get(i18);
                                                    int height2 = ((Placeable) obj2).getHeight();
                                                    if (height < height2) {
                                                        obj = obj2;
                                                        height = height2;
                                                    }
                                                    if (i18 == lastIndex) {
                                                        break;
                                                    }
                                                    i18 = i19;
                                                }
                                            }
                                        }
                                        Placeable placeable = (Placeable) obj;
                                        int height3 = placeable == null ? 0 : placeable.getHeight();
                                        final ArrayList arrayList2 = new ArrayList(size);
                                        while (i15 < size) {
                                            arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i16) * i15), subcomposeMeasureScope.mo191toDpu2uoSUM(i16), null));
                                            i15++;
                                        }
                                        final Function2<Composer, Integer, Unit> function12 = function10;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function13 = function11;
                                        final int i20 = i14;
                                        final int i21 = height3;
                                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                                List<Placeable> list2 = arrayList;
                                                int i22 = i16;
                                                int size3 = list2.size() - 1;
                                                int i23 = 0;
                                                if (size3 >= 0) {
                                                    int i24 = 0;
                                                    while (true) {
                                                        int i25 = i24 + 1;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                        if (i25 > size3) {
                                                            break;
                                                        } else {
                                                            i24 = i25;
                                                        }
                                                    }
                                                }
                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function12);
                                                long j6 = j5;
                                                int i26 = i21;
                                                int size4 = listSubcompose2.size() - 1;
                                                if (size4 >= 0) {
                                                    int i27 = 0;
                                                    while (true) {
                                                        int i28 = i27 + 1;
                                                        Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j6);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        if (i28 > size4) {
                                                            break;
                                                        } else {
                                                            i27 = i28;
                                                        }
                                                    }
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function14 = function13;
                                                final List<TabPosition> list3 = arrayList2;
                                                final int i29 = i20;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer3, int i30) {
                                                        if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                        } else {
                                                            function14.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                        }
                                                    }
                                                }));
                                                int i30 = iM2935getMaxWidthimpl;
                                                int i31 = i21;
                                                int size5 = listSubcompose3.size() - 1;
                                                if (size5 < 0) {
                                                    return;
                                                }
                                                while (true) {
                                                    int i32 = i23 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                                    if (i32 > size5) {
                                                        return;
                                                    } else {
                                                        i23 = i32;
                                                    }
                                                }
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                        }
                    }), composerStartRestartGroup, (i12 & 896) | 1572864 | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                    long j5 = jM656contentColorForek8zF_U;
                    function5 = function7;
                    function6 = function8;
                    modifier3 = modifier2;
                    j3 = primarySurface;
                    j4 = j5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    function5 = function3ComposableLambda;
                    function6 = function2M669getLambda1$material_release;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        TabRowKt.m845TabRowpAZo6Ak(i, modifier3, j3, j4, function5, function6, function4, composer2, i2 | 1, i3);
                    }
                });
            }
            i4 |= 24576;
            function3ComposableLambda = function3;
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    function2M669getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changed(function2M669getLambda1$material_release)) {
                    }
                    i4 |= i11;
                } else {
                    function2M669getLambda1$material_release = function2;
                }
                i4 |= i11;
            } else {
                function2M669getLambda1$material_release = function2;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            if (((2995931 & i4) ^ 599186) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i13) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i13) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i13 = i4;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function9 = function3ComposableLambda;
                final Function2<? super Composer, ? super Integer, Unit> function10 = function2M669getLambda1$material_release;
                SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if (((i14 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function11 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function12 = function10;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function9;
                        final int i15 = i13;
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(function11) | composer2.changed(function12) | composer2.changed(function13);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j6) {
                                    int i16;
                                    Object obj;
                                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j6);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function11);
                                    int size = listSubcompose.size();
                                    final int i17 = iM2935getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size2 = listSubcompose.size() - 1;
                                    if (size2 >= 0) {
                                        int i18 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose.get(i18);
                                            List<Measurable> list = listSubcompose;
                                            i16 = 0;
                                            arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, i17, i17, 0, 0, 12, null)));
                                            i18++;
                                            if (i18 > size2) {
                                                break;
                                            }
                                            listSubcompose = list;
                                        }
                                    } else {
                                        i16 = 0;
                                    }
                                    if (arrayList.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = arrayList.get(i16);
                                        int height = ((Placeable) obj).getHeight();
                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                        int i19 = 1;
                                        if (1 <= lastIndex) {
                                            while (true) {
                                                int i110 = i19 + 1;
                                                Object obj2 = arrayList.get(i19);
                                                int height2 = ((Placeable) obj2).getHeight();
                                                if (height < height2) {
                                                    obj = obj2;
                                                    height = height2;
                                                }
                                                if (i19 == lastIndex) {
                                                    break;
                                                }
                                                i19 = i110;
                                            }
                                        }
                                    }
                                    Placeable placeable = (Placeable) obj;
                                    int height3 = placeable == null ? 0 : placeable.getHeight();
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    while (i16 < size) {
                                        arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i17) * i16), subcomposeMeasureScope.mo191toDpu2uoSUM(i17), null));
                                        i16++;
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function13;
                                    final int i20 = i15;
                                    final int i21 = height3;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                            List<Placeable> list2 = arrayList;
                                            int i22 = i17;
                                            int size3 = list2.size() - 1;
                                            int i23 = 0;
                                            if (size3 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    int i25 = i24 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                    if (i25 > size3) {
                                                        break;
                                                    } else {
                                                        i24 = i25;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function14);
                                            long j7 = j6;
                                            int i26 = i21;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i27 = 0;
                                                while (true) {
                                                    int i28 = i27 + 1;
                                                    Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j7);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    if (i28 > size4) {
                                                        break;
                                                    } else {
                                                        i27 = i28;
                                                    }
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function15;
                                            final List<TabPosition> list3 = arrayList2;
                                            final int i29 = i20;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i30) {
                                                    if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function16.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            int i30 = iM2935getMaxWidthimpl;
                                            int i31 = i21;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 < 0) {
                                                return;
                                            }
                                            while (true) {
                                                int i32 = i23 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                                if (i32 > size5) {
                                                    return;
                                                } else {
                                                    i23 = i32;
                                                }
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    }
                }), composerStartRestartGroup, (i13 & 896) | 1572864 | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                long j6 = jM656contentColorForek8zF_U;
                function5 = function9;
                function6 = function10;
                modifier3 = modifier2;
                j3 = primarySurface;
                j4 = j6;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i14) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i14) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i14 = i4;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function3ComposableLambda;
                final Function2<? super Composer, ? super Integer, Unit> function12 = function2M669getLambda1$material_release;
                SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i15) {
                        if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function13 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function12;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function11;
                        final int i16 = i14;
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(function13) | composer2.changed(function14) | composer2.changed(function15);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                    int i17;
                                    Object obj;
                                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j7);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function13);
                                    int size = listSubcompose.size();
                                    final int i18 = iM2935getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size2 = listSubcompose.size() - 1;
                                    if (size2 >= 0) {
                                        int i19 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose.get(i19);
                                            List<Measurable> list = listSubcompose;
                                            i17 = 0;
                                            arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j7, i18, i18, 0, 0, 12, null)));
                                            i19++;
                                            if (i19 > size2) {
                                                break;
                                            }
                                            listSubcompose = list;
                                        }
                                    } else {
                                        i17 = 0;
                                    }
                                    if (arrayList.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = arrayList.get(i17);
                                        int height = ((Placeable) obj).getHeight();
                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                        int i110 = 1;
                                        if (1 <= lastIndex) {
                                            while (true) {
                                                int i111 = i110 + 1;
                                                Object obj2 = arrayList.get(i110);
                                                int height2 = ((Placeable) obj2).getHeight();
                                                if (height < height2) {
                                                    obj = obj2;
                                                    height = height2;
                                                }
                                                if (i110 == lastIndex) {
                                                    break;
                                                }
                                                i110 = i111;
                                            }
                                        }
                                    }
                                    Placeable placeable = (Placeable) obj;
                                    int height3 = placeable == null ? 0 : placeable.getHeight();
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    while (i17 < size) {
                                        arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i18) * i17), subcomposeMeasureScope.mo191toDpu2uoSUM(i18), null));
                                        i17++;
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function16 = function14;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function15;
                                    final int i20 = i16;
                                    final int i21 = height3;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                            List<Placeable> list2 = arrayList;
                                            int i22 = i18;
                                            int size3 = list2.size() - 1;
                                            int i23 = 0;
                                            if (size3 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    int i25 = i24 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                    if (i25 > size3) {
                                                        break;
                                                    } else {
                                                        i24 = i25;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function16);
                                            long j8 = j7;
                                            int i26 = i21;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i27 = 0;
                                                while (true) {
                                                    int i28 = i27 + 1;
                                                    Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j8);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    if (i28 > size4) {
                                                        break;
                                                    } else {
                                                        i27 = i28;
                                                    }
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function18 = function17;
                                            final List<TabPosition> list3 = arrayList2;
                                            final int i29 = i20;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i30) {
                                                    if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function18.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            int i30 = iM2935getMaxWidthimpl;
                                            int i31 = i21;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 < 0) {
                                                return;
                                            }
                                            while (true) {
                                                int i32 = i23 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                                if (i32 > size5) {
                                                    return;
                                                } else {
                                                    i23 = i32;
                                                }
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    }
                }), composerStartRestartGroup, (i14 & 896) | 1572864 | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                long j7 = jM656contentColorForek8zF_U;
                function5 = function11;
                function6 = function12;
                modifier3 = modifier2;
                j3 = primarySurface;
                j4 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                    TabRowKt.m845TabRowpAZo6Ak(i, modifier3, j3, j4, function5, function6, function4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i4 |= i9;
            } else {
                primarySurface = j;
            }
            i4 |= i9;
        } else {
            primarySurface = j;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i3 & 8) == 0) {
                jM656contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                }
                i4 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i4 |= i10;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                function3ComposableLambda = function3;
                if (composerStartRestartGroup.changed(function3ComposableLambda)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    function2M669getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changed(function2M669getLambda1$material_release)) {
                    }
                    i4 |= i11;
                } else {
                    function2M669getLambda1$material_release = function2;
                }
                i4 |= i11;
            } else {
                function2M669getLambda1$material_release = function2;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            if (((2995931 & i4) ^ 599186) == 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i15) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i15) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i15 = i4;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function3ComposableLambda;
                final Function2<? super Composer, ? super Integer, Unit> function14 = function2M669getLambda1$material_release;
                SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i16) {
                        if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function15 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function16 = function14;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function13;
                        final int i17 = i15;
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(function15) | composer2.changed(function16) | composer2.changed(function17);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j8) {
                                    int i18;
                                    Object obj;
                                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j8);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function15);
                                    int size = listSubcompose.size();
                                    final int i19 = iM2935getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size2 = listSubcompose.size() - 1;
                                    if (size2 >= 0) {
                                        int i110 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose.get(i110);
                                            List<Measurable> list = listSubcompose;
                                            i18 = 0;
                                            arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j8, i19, i19, 0, 0, 12, null)));
                                            i110++;
                                            if (i110 > size2) {
                                                break;
                                            }
                                            listSubcompose = list;
                                        }
                                    } else {
                                        i18 = 0;
                                    }
                                    if (arrayList.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = arrayList.get(i18);
                                        int height = ((Placeable) obj).getHeight();
                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                        int i111 = 1;
                                        if (1 <= lastIndex) {
                                            while (true) {
                                                int i112 = i111 + 1;
                                                Object obj2 = arrayList.get(i111);
                                                int height2 = ((Placeable) obj2).getHeight();
                                                if (height < height2) {
                                                    obj = obj2;
                                                    height = height2;
                                                }
                                                if (i111 == lastIndex) {
                                                    break;
                                                }
                                                i111 = i112;
                                            }
                                        }
                                    }
                                    Placeable placeable = (Placeable) obj;
                                    int height3 = placeable == null ? 0 : placeable.getHeight();
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    while (i18 < size) {
                                        arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i19) * i18), subcomposeMeasureScope.mo191toDpu2uoSUM(i19), null));
                                        i18++;
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function17;
                                    final int i20 = i17;
                                    final int i21 = height3;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                            List<Placeable> list2 = arrayList;
                                            int i22 = i19;
                                            int size3 = list2.size() - 1;
                                            int i23 = 0;
                                            if (size3 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    int i25 = i24 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                    if (i25 > size3) {
                                                        break;
                                                    } else {
                                                        i24 = i25;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function18);
                                            long j9 = j8;
                                            int i26 = i21;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i27 = 0;
                                                while (true) {
                                                    int i28 = i27 + 1;
                                                    Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j9);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    if (i28 > size4) {
                                                        break;
                                                    } else {
                                                        i27 = i28;
                                                    }
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function19;
                                            final List<TabPosition> list3 = arrayList2;
                                            final int i29 = i20;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i30) {
                                                    if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function110.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            int i30 = iM2935getMaxWidthimpl;
                                            int i31 = i21;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 < 0) {
                                                return;
                                            }
                                            while (true) {
                                                int i32 = i23 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                                if (i32 > size5) {
                                                    return;
                                                } else {
                                                    i23 = i32;
                                                }
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    }
                }), composerStartRestartGroup, (i15 & 896) | 1572864 | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                long j8 = jM656contentColorForek8zF_U;
                function5 = function13;
                function6 = function14;
                modifier3 = modifier2;
                j3 = primarySurface;
                j4 = j8;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i16) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                invoke((List<TabPosition>) list, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i16) {
                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                            }
                        });
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i16 = i4;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function3ComposableLambda;
                final Function2<? super Composer, ? super Integer, Unit> function16 = function2M669getLambda1$material_release;
                SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function17 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function16;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function15;
                        final int i18 = i16;
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(function17) | composer2.changed(function18) | composer2.changed(function19);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                    int i19;
                                    Object obj;
                                    final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j9);
                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function17);
                                    int size = listSubcompose.size();
                                    final int i110 = iM2935getMaxWidthimpl / size;
                                    final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                    int size2 = listSubcompose.size() - 1;
                                    if (size2 >= 0) {
                                        int i111 = 0;
                                        while (true) {
                                            Measurable measurable = listSubcompose.get(i111);
                                            List<Measurable> list = listSubcompose;
                                            i19 = 0;
                                            arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j9, i110, i110, 0, 0, 12, null)));
                                            i111++;
                                            if (i111 > size2) {
                                                break;
                                            }
                                            listSubcompose = list;
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    if (arrayList.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = arrayList.get(i19);
                                        int height = ((Placeable) obj).getHeight();
                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                        int i112 = 1;
                                        if (1 <= lastIndex) {
                                            while (true) {
                                                int i113 = i112 + 1;
                                                Object obj2 = arrayList.get(i112);
                                                int height2 = ((Placeable) obj2).getHeight();
                                                if (height < height2) {
                                                    obj = obj2;
                                                    height = height2;
                                                }
                                                if (i112 == lastIndex) {
                                                    break;
                                                }
                                                i112 = i113;
                                            }
                                        }
                                    }
                                    Placeable placeable = (Placeable) obj;
                                    int height3 = placeable == null ? 0 : placeable.getHeight();
                                    final List<TabPosition> arrayList2 = new ArrayList(size);
                                    while (i19 < size) {
                                        arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i110) * i19), subcomposeMeasureScope.mo191toDpu2uoSUM(i110), null));
                                        i19++;
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function19;
                                    final int i20 = i18;
                                    final int i21 = height3;
                                    return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                            List<Placeable> list2 = arrayList;
                                            int i22 = i110;
                                            int size3 = list2.size() - 1;
                                            int i23 = 0;
                                            if (size3 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    int i25 = i24 + 1;
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                    if (i25 > size3) {
                                                        break;
                                                    } else {
                                                        i24 = i25;
                                                    }
                                                }
                                            }
                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function110);
                                            long j10 = j9;
                                            int i26 = i21;
                                            int size4 = listSubcompose2.size() - 1;
                                            if (size4 >= 0) {
                                                int i27 = 0;
                                                while (true) {
                                                    int i28 = i27 + 1;
                                                    Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j10);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    if (i28 > size4) {
                                                        break;
                                                    } else {
                                                        i27 = i28;
                                                    }
                                                }
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function111;
                                            final List<TabPosition> list3 = arrayList2;
                                            final int i29 = i20;
                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i30) {
                                                    if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function112.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            int i30 = iM2935getMaxWidthimpl;
                                            int i31 = i21;
                                            int size5 = listSubcompose3.size() - 1;
                                            if (size5 < 0) {
                                                return;
                                            }
                                            while (true) {
                                                int i32 = i23 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                                if (i32 > size5) {
                                                    return;
                                                } else {
                                                    i23 = i32;
                                                }
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    }
                }), composerStartRestartGroup, (i16 & 896) | 1572864 | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                long j9 = jM656contentColorForek8zF_U;
                function5 = function15;
                function6 = function16;
                modifier3 = modifier2;
                j3 = primarySurface;
                j4 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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

                public final void invoke(@Nullable Composer composer2, int i17) {
                    TabRowKt.m845TabRowpAZo6Ak(i, modifier3, j3, j4, function5, function6, function4, composer2, i2 | 1, i3);
                }
            });
        }
        i4 |= 24576;
        function3ComposableLambda = function3;
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0) {
                function2M669getLambda1$material_release = function2;
                if (composerStartRestartGroup.changed(function2M669getLambda1$material_release)) {
                }
                i4 |= i11;
            } else {
                function2M669getLambda1$material_release = function2;
            }
            i4 |= i11;
        } else {
            function2M669getLambda1$material_release = function2;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (composerStartRestartGroup.changed(function4)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        }
        if (((2995931 & i4) ^ 599186) == 0) {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i17) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i17) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i17 = i4;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function3ComposableLambda;
            final Function2<? super Composer, ? super Integer, Unit> function18 = function2M669getLambda1$material_release;
            SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                public final void invoke(@Nullable Composer composer2, int i18) {
                    if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final Function2<? super Composer, ? super Integer, Unit> function19 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function110 = function18;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function17;
                    final int i19 = i17;
                    composer2.startReplaceableGroup(-3686095);
                    boolean zChanged = composer2.changed(function19) | composer2.changed(function110) | composer2.changed(function111);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j10) {
                                int i110;
                                Object obj;
                                final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j10);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function19);
                                int size = listSubcompose.size();
                                final int i111 = iM2935getMaxWidthimpl / size;
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size2 = listSubcompose.size() - 1;
                                if (size2 >= 0) {
                                    int i112 = 0;
                                    while (true) {
                                        Measurable measurable = listSubcompose.get(i112);
                                        List<Measurable> list = listSubcompose;
                                        i110 = 0;
                                        arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j10, i111, i111, 0, 0, 12, null)));
                                        i112++;
                                        if (i112 > size2) {
                                            break;
                                        }
                                        listSubcompose = list;
                                    }
                                } else {
                                    i110 = 0;
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(i110);
                                    int height = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                    int i113 = 1;
                                    if (1 <= lastIndex) {
                                        while (true) {
                                            int i114 = i113 + 1;
                                            Object obj2 = arrayList.get(i113);
                                            int height2 = ((Placeable) obj2).getHeight();
                                            if (height < height2) {
                                                obj = obj2;
                                                height = height2;
                                            }
                                            if (i113 == lastIndex) {
                                                break;
                                            }
                                            i113 = i114;
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height3 = placeable == null ? 0 : placeable.getHeight();
                                final List<TabPosition> arrayList2 = new ArrayList(size);
                                while (i110 < size) {
                                    arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i111) * i110), subcomposeMeasureScope.mo191toDpu2uoSUM(i111), null));
                                    i110++;
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function111;
                                final int i20 = i19;
                                final int i21 = height3;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                        List<Placeable> list2 = arrayList;
                                        int i22 = i111;
                                        int size3 = list2.size() - 1;
                                        int i23 = 0;
                                        if (size3 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                int i25 = i24 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                if (i25 > size3) {
                                                    break;
                                                } else {
                                                    i24 = i25;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function112);
                                        long j11 = j10;
                                        int i26 = i21;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                int i28 = i27 + 1;
                                                Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j11);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                if (i28 > size4) {
                                                    break;
                                                } else {
                                                    i27 = i28;
                                                }
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function113;
                                        final List<TabPosition> list3 = arrayList2;
                                        final int i29 = i20;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i30) {
                                                if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function114.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                }
                                            }
                                        }));
                                        int i30 = iM2935getMaxWidthimpl;
                                        int i31 = i21;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 < 0) {
                                            return;
                                        }
                                        while (true) {
                                            int i32 = i23 + 1;
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                            if (i32 > size5) {
                                                return;
                                            } else {
                                                i23 = i32;
                                            }
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                }
            }), composerStartRestartGroup, (i17 & 896) | 1572864 | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
            long j10 = jM656contentColorForek8zF_U;
            function5 = function17;
            function6 = function18;
            modifier3 = modifier2;
            j3 = primarySurface;
            j4 = j10;
        } else {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i18) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889141, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i18) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m838Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 0, 6);
                        }
                    });
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function2M669getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m669getLambda1$material_release();
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i18 = i4;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function3ComposableLambda;
            final Function2<? super Composer, ? super Integer, Unit> function110 = function2M669getLambda1$material_release;
            SurfaceKt.m815SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), (Shape) null, primarySurface, jM656contentColorForek8zF_U, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                public final void invoke(@Nullable Composer composer2, int i19) {
                    if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final Function2<? super Composer, ? super Integer, Unit> function111 = function4;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function110;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function19;
                    final int i110 = i18;
                    composer2.startReplaceableGroup(-3686095);
                    boolean zChanged = composer2.changed(function111) | composer2.changed(function112) | composer2.changed(function113);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m847invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m847invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j11) {
                                int i111;
                                Object obj;
                                final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j11);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function111);
                                int size = listSubcompose.size();
                                final int i112 = iM2935getMaxWidthimpl / size;
                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                int size2 = listSubcompose.size() - 1;
                                if (size2 >= 0) {
                                    int i113 = 0;
                                    while (true) {
                                        Measurable measurable = listSubcompose.get(i113);
                                        List<Measurable> list = listSubcompose;
                                        i111 = 0;
                                        arrayList.add(measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j11, i112, i112, 0, 0, 12, null)));
                                        i113++;
                                        if (i113 > size2) {
                                            break;
                                        }
                                        listSubcompose = list;
                                    }
                                } else {
                                    i111 = 0;
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(i111);
                                    int height = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                    int i114 = 1;
                                    if (1 <= lastIndex) {
                                        while (true) {
                                            int i115 = i114 + 1;
                                            Object obj2 = arrayList.get(i114);
                                            int height2 = ((Placeable) obj2).getHeight();
                                            if (height < height2) {
                                                obj = obj2;
                                                height = height2;
                                            }
                                            if (i114 == lastIndex) {
                                                break;
                                            }
                                            i114 = i115;
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height3 = placeable == null ? 0 : placeable.getHeight();
                                final List<TabPosition> arrayList2 = new ArrayList(size);
                                while (i111 < size) {
                                    arrayList2.add(new TabPosition(Dp.m2965constructorimpl(subcomposeMeasureScope.mo191toDpu2uoSUM(i112) * i111), subcomposeMeasureScope.mo191toDpu2uoSUM(i112), null));
                                    i111++;
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function114 = function112;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function113;
                                final int i20 = i110;
                                final int i21 = height3;
                                return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                        List<Placeable> list2 = arrayList;
                                        int i22 = i112;
                                        int size3 = list2.size() - 1;
                                        int i23 = 0;
                                        if (size3 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                int i25 = i24 + 1;
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i24), i24 * i22, 0, 0.0f, 4, null);
                                                if (i25 > size3) {
                                                    break;
                                                } else {
                                                    i24 = i25;
                                                }
                                            }
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function114);
                                        long j12 = j11;
                                        int i26 = i21;
                                        int size4 = listSubcompose2.size() - 1;
                                        if (size4 >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                int i28 = i27 + 1;
                                                Placeable placeableMo2468measureBRTryo0 = listSubcompose2.get(i27).mo2468measureBRTryo0(j12);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, 0, i26 - placeableMo2468measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                if (i28 > size4) {
                                                    break;
                                                } else {
                                                    i27 = i28;
                                                }
                                            }
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function115;
                                        final List<TabPosition> list3 = arrayList2;
                                        final int i29 = i20;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-985542192, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i30) {
                                                if (((i30 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function116.invoke(list3, composer3, Integer.valueOf(((i29 >> 9) & 112) | 8));
                                                }
                                            }
                                        }));
                                        int i30 = iM2935getMaxWidthimpl;
                                        int i31 = i21;
                                        int size5 = listSubcompose3.size() - 1;
                                        if (size5 < 0) {
                                            return;
                                        }
                                        while (true) {
                                            int i32 = i23 + 1;
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(i30, i31)), 0, 0, 0.0f, 4, null);
                                            if (i32 > size5) {
                                                return;
                                            } else {
                                                i23 = i32;
                                            }
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                }
            }), composerStartRestartGroup, (i18 & 896) | 1572864 | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
            long j11 = jM656contentColorForek8zF_U;
            function5 = function19;
            function6 = function110;
            modifier3 = modifier2;
            j3 = primarySurface;
            j4 = j11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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

            public final void invoke(@Nullable Composer composer2, int i19) {
                TabRowKt.m845TabRowpAZo6Ak(i, modifier3, j3, j4, function5, function6, function4, composer2, i2 | 1, i3);
            }
        });
    }
}
